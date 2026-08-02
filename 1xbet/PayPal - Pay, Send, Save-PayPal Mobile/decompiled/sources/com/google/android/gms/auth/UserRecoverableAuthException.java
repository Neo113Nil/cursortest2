package com.google.android.gms.auth;

/* loaded from: classes8.dex */
public class UserRecoverableAuthException extends com.google.android.gms.auth.GoogleAuthException {
    private final android.content.Intent zza;
    private final android.app.PendingIntent zzb;
    private final com.google.android.gms.auth.zzn zzc;

    public UserRecoverableAuthException(java.lang.String str, android.content.Intent intent) {
        this(str, intent, null, com.google.android.gms.auth.zzn.LEGACY);
    }

    public static com.google.android.gms.auth.UserRecoverableAuthException zza(java.lang.String str, android.content.Intent intent, android.app.PendingIntent pendingIntent) {
        com.google.android.gms.common.internal.Preconditions.checkNotNull(intent);
        com.google.android.gms.common.internal.Preconditions.checkNotNull(pendingIntent);
        return new com.google.android.gms.auth.UserRecoverableAuthException(str, intent, pendingIntent, com.google.android.gms.auth.zzn.AUTH_INSTANTIATION);
    }

    public android.content.Intent getIntent() {
        android.content.Intent intent = this.zza;
        if (intent == null) {
            return null;
        }
        return new android.content.Intent(intent);
    }

    private UserRecoverableAuthException(java.lang.String str, android.content.Intent intent, android.app.PendingIntent pendingIntent, com.google.android.gms.auth.zzn zznVar) {
        super(str);
        this.zzb = pendingIntent;
        this.zza = intent;
        this.zzc = (com.google.android.gms.auth.zzn) com.google.android.gms.common.internal.Preconditions.checkNotNull(zznVar);
    }
}
