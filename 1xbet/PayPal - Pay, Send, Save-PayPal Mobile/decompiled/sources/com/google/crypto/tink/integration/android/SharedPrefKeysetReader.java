package com.google.crypto.tink.integration.android;

/* loaded from: classes9.dex */
public final class SharedPrefKeysetReader implements com.google.crypto.tink.KeysetReader {
    private final java.lang.String keysetName;
    private final android.content.SharedPreferences sharedPreferences;

    public SharedPrefKeysetReader(android.content.Context context, java.lang.String str, java.lang.String str2) throws java.io.IOException {
        if (str == null) {
            throw new java.lang.IllegalArgumentException("keysetName cannot be null");
        }
        this.keysetName = str;
        android.content.Context applicationContext = context.getApplicationContext();
        if (str2 == null) {
            this.sharedPreferences = android.preference.PreferenceManager.getDefaultSharedPreferences(applicationContext);
        } else {
            this.sharedPreferences = applicationContext.getSharedPreferences(str2, 0);
        }
    }

    private byte[] readPref() throws java.io.IOException {
        try {
            java.lang.String string = this.sharedPreferences.getString(this.keysetName, null);
            if (string == null) {
                throw new java.io.FileNotFoundException(java.lang.String.format("can't read keyset; the pref value %s does not exist", this.keysetName));
            }
            return com.google.crypto.tink.subtle.Hex.decode(string);
        } catch (java.lang.ClassCastException | java.lang.IllegalArgumentException unused) {
            throw new java.io.CharConversionException(java.lang.String.format("can't read keyset; the pref value %s is not a valid hex string", this.keysetName));
        }
    }

    @Override // com.google.crypto.tink.KeysetReader
    public final com.google.crypto.tink.proto.Keyset read() throws java.io.IOException {
        return com.google.crypto.tink.proto.Keyset.parseFrom(readPref(), com.google.crypto.tink.shaded.protobuf.ExtensionRegistryLite.getEmptyRegistry());
    }

    @Override // com.google.crypto.tink.KeysetReader
    public final com.google.crypto.tink.proto.EncryptedKeyset readEncrypted() throws java.io.IOException {
        return com.google.crypto.tink.proto.EncryptedKeyset.parseFrom(readPref(), com.google.crypto.tink.shaded.protobuf.ExtensionRegistryLite.getEmptyRegistry());
    }
}
