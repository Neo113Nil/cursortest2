package com.google.android.gms.auth;

/* compiled from: com.google.android.gms:play-services-auth-base@@18.0.10 */
/* loaded from: classes3.dex */
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
        if (intent != null) {
            return new android.content.Intent(intent);
        }
        int ordinal = this.zzc.ordinal();
        if (ordinal == 0) {
            android.util.Log.w("Auth", "Make sure that an intent was provided to class instantiation.");
            return null;
        }
        if (ordinal == 1) {
            android.util.Log.e("Auth", "This shouldn't happen. Gms API throwing this exception should support the recovery Intent.");
            return null;
        }
        if (ordinal != 2) {
            return null;
        }
        android.util.Log.e("Auth", "this instantiation of UserRecoverableAuthException doesn't support an Intent.");
        return null;
    }

    private UserRecoverableAuthException(java.lang.String str, android.content.Intent intent, android.app.PendingIntent pendingIntent, com.google.android.gms.auth.zzn zznVar) {
        super(str);
        this.zzb = pendingIntent;
        this.zza = intent;
        this.zzc = (com.google.android.gms.auth.zzn) com.google.android.gms.common.internal.Preconditions.checkNotNull(zznVar);
    }
}
