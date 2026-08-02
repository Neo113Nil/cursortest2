package com.google.crypto.tink.integration.android;

/* loaded from: classes4.dex */
public final class SharedPrefKeysetWriter implements com.google.crypto.tink.KeysetWriter {
    private final android.content.SharedPreferences.Editor editor;
    private final java.lang.String keysetName;

    public SharedPrefKeysetWriter(android.content.Context context, java.lang.String str, java.lang.String str2) {
        if (str == null) {
            throw new java.lang.IllegalArgumentException("keysetName cannot be null");
        }
        this.keysetName = str;
        android.content.Context applicationContext = context.getApplicationContext();
        if (str2 == null) {
            this.editor = android.preference.PreferenceManager.getDefaultSharedPreferences(applicationContext).edit();
        } else {
            this.editor = applicationContext.getSharedPreferences(str2, 0).edit();
        }
    }

    @Override // com.google.crypto.tink.KeysetWriter
    public final void write(com.google.crypto.tink.proto.Keyset keyset) throws java.io.IOException {
        if (!this.editor.putString(this.keysetName, com.google.crypto.tink.subtle.Hex.encode(keyset.toByteArray())).commit()) {
            throw new java.io.IOException("Failed to write to SharedPreferences");
        }
    }

    @Override // com.google.crypto.tink.KeysetWriter
    public final void write(com.google.crypto.tink.proto.EncryptedKeyset encryptedKeyset) throws java.io.IOException {
        if (!this.editor.putString(this.keysetName, com.google.crypto.tink.subtle.Hex.encode(encryptedKeyset.toByteArray())).commit()) {
            throw new java.io.IOException("Failed to write to SharedPreferences");
        }
    }
}
