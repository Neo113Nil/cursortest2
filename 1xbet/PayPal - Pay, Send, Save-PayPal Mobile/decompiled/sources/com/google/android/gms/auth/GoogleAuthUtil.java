package com.google.android.gms.auth;

/* loaded from: classes8.dex */
public final class GoogleAuthUtil extends com.google.android.gms.auth.zzl {
    public static final int CHANGE_TYPE_ACCOUNT_ADDED = 1;
    public static final int CHANGE_TYPE_ACCOUNT_REMOVED = 2;
    public static final int CHANGE_TYPE_ACCOUNT_RENAMED_FROM = 3;
    public static final int CHANGE_TYPE_ACCOUNT_RENAMED_TO = 4;
    public static final java.lang.String GOOGLE_ACCOUNT_TYPE = "com.google";
    public static final java.lang.String KEY_SUPPRESS_PROGRESS_SCREEN = "suppressProgressScreen";
    public static final java.lang.String WORK_ACCOUNT_TYPE = "com.google.work";

    public static void clearToken(android.content.Context context, java.lang.String str) throws com.google.android.gms.auth.GooglePlayServicesAvailabilityException, com.google.android.gms.auth.GoogleAuthException, java.io.IOException {
        com.google.android.gms.auth.zzl.clearToken(context, str);
    }

    public static java.util.List<com.google.android.gms.auth.AccountChangeEvent> getAccountChangeEvents(android.content.Context context, int i, java.lang.String str) throws com.google.android.gms.auth.GoogleAuthException, java.io.IOException {
        return com.google.android.gms.auth.zzl.getAccountChangeEvents(context, i, str);
    }

    public static java.lang.String getAccountId(android.content.Context context, java.lang.String str) throws com.google.android.gms.auth.GoogleAuthException, java.io.IOException {
        return com.google.android.gms.auth.zzl.getAccountId(context, str);
    }

    public static java.lang.String getToken(android.content.Context context, android.accounts.Account account, java.lang.String str) throws java.io.IOException, com.google.android.gms.auth.UserRecoverableAuthException, com.google.android.gms.auth.GoogleAuthException {
        return com.google.android.gms.auth.zzl.getToken(context, account, str);
    }

    public static java.lang.String getTokenWithNotification(android.content.Context context, android.accounts.Account account, java.lang.String str, android.os.Bundle bundle) throws java.io.IOException, com.google.android.gms.auth.UserRecoverableNotifiedException, com.google.android.gms.auth.GoogleAuthException {
        if (bundle == null) {
            bundle = new android.os.Bundle();
        }
        android.os.Bundle bundle2 = bundle;
        bundle2.putBoolean("handle_notification", true);
        return zzg(context, account, str, bundle2, 0L).zza();
    }

    @java.lang.Deprecated
    public static void invalidateToken(android.content.Context context, java.lang.String str) {
        com.google.android.gms.auth.zzl.invalidateToken(context, str);
    }

    public static android.os.Bundle removeAccount(android.content.Context context, android.accounts.Account account) throws com.google.android.gms.auth.GoogleAuthException, java.io.IOException {
        return com.google.android.gms.auth.zzl.removeAccount(context, account);
    }

    public static java.lang.Boolean requestGoogleAccountsAccess(android.content.Context context) throws com.google.android.gms.auth.GoogleAuthException, java.io.IOException {
        return com.google.android.gms.auth.zzl.requestGoogleAccountsAccess(context);
    }

    private static com.google.android.gms.auth.TokenData zzg(android.content.Context context, android.accounts.Account account, java.lang.String str, android.os.Bundle bundle, long j) throws java.io.IOException, com.google.android.gms.auth.GoogleAuthException {
        try {
            com.google.android.gms.auth.TokenData zza = com.google.android.gms.auth.zzl.zza(context, account, str, bundle, 0L, null);
            com.google.android.gms.common.GooglePlayServicesUtil.cancelAvailabilityErrorNotifications(context);
            return zza;
        } catch (com.google.android.gms.auth.GooglePlayServicesAvailabilityException e) {
            com.google.android.gms.common.GooglePlayServicesUtil.showErrorNotification(e.getConnectionStatusCode(), context);
            throw new com.google.android.gms.auth.UserRecoverableNotifiedException("User intervention required. Notification has been pushed.", e);
        } catch (com.google.android.gms.auth.UserRecoverableAuthException e2) {
            com.google.android.gms.common.GooglePlayServicesUtil.cancelAvailabilityErrorNotifications(context);
            throw new com.google.android.gms.auth.UserRecoverableNotifiedException("User intervention required. Notification has been pushed.", e2);
        }
    }

    public static java.lang.String getToken(android.content.Context context, android.accounts.Account account, java.lang.String str, android.os.Bundle bundle) throws java.io.IOException, com.google.android.gms.auth.UserRecoverableAuthException, com.google.android.gms.auth.GoogleAuthException {
        return com.google.android.gms.auth.zzl.getToken(context, account, str, bundle);
    }

    @java.lang.Deprecated
    public static java.lang.String getToken(android.content.Context context, java.lang.String str, java.lang.String str2) throws java.io.IOException, com.google.android.gms.auth.UserRecoverableAuthException, com.google.android.gms.auth.GoogleAuthException {
        return com.google.android.gms.auth.zzl.getToken(context, str, str2);
    }

    @java.lang.Deprecated
    public static java.lang.String getToken(android.content.Context context, java.lang.String str, java.lang.String str2, android.os.Bundle bundle) throws java.io.IOException, com.google.android.gms.auth.UserRecoverableAuthException, com.google.android.gms.auth.GoogleAuthException {
        return com.google.android.gms.auth.zzl.getToken(context, str, str2, bundle);
    }

    public static java.lang.String getTokenWithNotification(android.content.Context context, android.accounts.Account account, java.lang.String str, android.os.Bundle bundle, android.content.Intent intent) throws java.io.IOException, com.google.android.gms.auth.UserRecoverableNotifiedException, com.google.android.gms.auth.GoogleAuthException {
        zzf(intent);
        if (bundle == null) {
            bundle = new android.os.Bundle();
        }
        android.os.Bundle bundle2 = bundle;
        bundle2.putParcelable("callback_intent", intent);
        bundle2.putBoolean("handle_notification", true);
        return zzg(context, account, str, bundle2, 0L).zza();
    }

    public static java.lang.String getTokenWithNotification(android.content.Context context, android.accounts.Account account, java.lang.String str, android.os.Bundle bundle, java.lang.String str2, android.os.Bundle bundle2) throws java.io.IOException, com.google.android.gms.auth.UserRecoverableNotifiedException, com.google.android.gms.auth.GoogleAuthException {
        com.google.android.gms.common.internal.Preconditions.checkNotEmpty(str2, "Authority cannot be empty or null.");
        if (bundle == null) {
            bundle = new android.os.Bundle();
        }
        android.os.Bundle bundle3 = bundle;
        if (bundle2 == null) {
            bundle2 = new android.os.Bundle();
        }
        android.content.ContentResolver.validateSyncExtrasBundle(bundle2);
        bundle3.putString("authority", str2);
        bundle3.putBundle("sync_extras", bundle2);
        bundle3.putBoolean("handle_notification", true);
        return zzg(context, account, str, bundle3, 0L).zza();
    }

    @java.lang.Deprecated
    public static java.lang.String getTokenWithNotification(android.content.Context context, java.lang.String str, java.lang.String str2, android.os.Bundle bundle) throws java.io.IOException, com.google.android.gms.auth.UserRecoverableNotifiedException, com.google.android.gms.auth.GoogleAuthException {
        return getTokenWithNotification(context, new android.accounts.Account(str, "com.google"), str2, bundle);
    }

    @java.lang.Deprecated
    public static java.lang.String getTokenWithNotification(android.content.Context context, java.lang.String str, java.lang.String str2, android.os.Bundle bundle, android.content.Intent intent) throws java.io.IOException, com.google.android.gms.auth.UserRecoverableNotifiedException, com.google.android.gms.auth.GoogleAuthException {
        return getTokenWithNotification(context, new android.accounts.Account(str, "com.google"), str2, bundle, intent);
    }

    @java.lang.Deprecated
    public static java.lang.String getTokenWithNotification(android.content.Context context, java.lang.String str, java.lang.String str2, android.os.Bundle bundle, java.lang.String str3, android.os.Bundle bundle2) throws java.io.IOException, com.google.android.gms.auth.UserRecoverableNotifiedException, com.google.android.gms.auth.GoogleAuthException {
        return getTokenWithNotification(context, new android.accounts.Account(str, "com.google"), str2, bundle, str3, bundle2);
    }

    private GoogleAuthUtil() {
    }
}
