package com.google.android.gms.common;

/* compiled from: com.google.android.gms:play-services-basement@@18.9.0 */
/* loaded from: classes3.dex */
public class UserRecoverableException extends java.lang.Exception {
    private final android.content.Intent zza;

    public UserRecoverableException(java.lang.String str, android.content.Intent intent) {
        super(str);
        this.zza = intent;
    }

    public android.content.Intent getIntent() {
        return new android.content.Intent(this.zza);
    }
}
