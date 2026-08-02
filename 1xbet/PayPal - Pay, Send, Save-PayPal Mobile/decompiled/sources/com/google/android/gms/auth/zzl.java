package com.google.android.gms.auth;

/* loaded from: classes8.dex */
public class zzl {
    public static final int CHANGE_TYPE_ACCOUNT_ADDED = 1;
    public static final int CHANGE_TYPE_ACCOUNT_REMOVED = 2;
    public static final int CHANGE_TYPE_ACCOUNT_RENAMED_FROM = 3;
    public static final int CHANGE_TYPE_ACCOUNT_RENAMED_TO = 4;
    public static final java.lang.String GOOGLE_ACCOUNT_TYPE = "com.google";
    public static final java.lang.String KEY_SUPPRESS_PROGRESS_SCREEN = "suppressProgressScreen";
    public static final java.lang.String WORK_ACCOUNT_TYPE = "com.google.work";
    public static final java.lang.String[] zza = {"com.google", "com.google.work", "cn.google"};
    public static final java.lang.String zzb = "androidPackageName";
    private static final android.content.ComponentName zzc = new android.content.ComponentName("com.google.android.gms", "com.google.android.gms.auth.GetToken");
    private static final com.google.android.gms.common.logging.Logger zzd = com.google.android.gms.auth.zzd.zza("GoogleAuthUtil");

    public static void clearToken(android.content.Context context, java.lang.String str) throws com.google.android.gms.auth.GoogleAuthException, java.io.IOException {
        zze(context, str, 0L);
    }

    public static java.util.List<com.google.android.gms.auth.AccountChangeEvent> getAccountChangeEvents(android.content.Context context, int i, java.lang.String str) throws com.google.android.gms.auth.GoogleAuthException, java.io.IOException {
        com.google.android.gms.common.internal.Preconditions.checkNotEmpty(str, "accountName must be provided");
        com.google.android.gms.common.internal.Preconditions.checkNotMainThread("Calling this from your main thread can lead to deadlock");
        zzk(context, 8400000);
        com.google.android.gms.auth.AccountChangeEventsRequest accountChangeEventsRequest = new com.google.android.gms.auth.AccountChangeEventsRequest();
        accountChangeEventsRequest.setAccountName(str);
        accountChangeEventsRequest.setEventIndex(i);
        com.google.android.gms.internal.auth.zzdc.zzd(context);
        if (com.google.android.gms.internal.auth.zzhw.zzd() && zzp(context)) {
            try {
                com.google.android.gms.auth.AccountChangeEventsResponse accountChangeEventsResponse = (com.google.android.gms.auth.AccountChangeEventsResponse) zzi(com.google.android.gms.internal.auth.zzh.zza(context).zzb(accountChangeEventsRequest), "account change events retrieval");
                zzj(accountChangeEventsResponse);
                return accountChangeEventsResponse.getEvents();
            } catch (com.google.android.gms.common.api.ApiException e) {
                zzl(e, "account change events retrieval");
            }
        }
        return (java.util.List) zzh(context, zzc, new com.google.android.gms.auth.zzi(accountChangeEventsRequest), 0L, null);
    }

    public static java.lang.String getAccountId(android.content.Context context, java.lang.String str) throws com.google.android.gms.auth.GoogleAuthException, java.io.IOException {
        com.google.android.gms.common.internal.Preconditions.checkNotEmpty(str, "accountName must be provided");
        com.google.android.gms.common.internal.Preconditions.checkNotMainThread("Calling this from your main thread can lead to deadlock");
        zzk(context, 8400000);
        return getToken(context, str, "^^_account_id_^^", new android.os.Bundle());
    }

    public static java.lang.String getToken(android.content.Context context, android.accounts.Account account, java.lang.String str) throws java.io.IOException, com.google.android.gms.auth.UserRecoverableAuthException, com.google.android.gms.auth.GoogleAuthException {
        return getToken(context, account, str, new android.os.Bundle());
    }

    @java.lang.Deprecated
    public static void invalidateToken(android.content.Context context, java.lang.String str) {
        android.accounts.AccountManager.get(context).invalidateAuthToken("com.google", str);
    }

    public static android.os.Bundle removeAccount(android.content.Context context, final android.accounts.Account account) throws com.google.android.gms.auth.GoogleAuthException, java.io.IOException {
        com.google.android.gms.common.internal.Preconditions.checkNotNull(context);
        zzo(account);
        zzk(context, 8400000);
        com.google.android.gms.internal.auth.zzdc.zzd(context);
        if (com.google.android.gms.internal.auth.zzhw.zze() && zzp(context)) {
            try {
                android.os.Bundle bundle = (android.os.Bundle) zzi(com.google.android.gms.internal.auth.zzh.zza(context).zzd(account), "account removal");
                zzj(bundle);
                return bundle;
            } catch (com.google.android.gms.common.api.ApiException e) {
                zzl(e, "account removal");
            }
        }
        return (android.os.Bundle) zzh(context, zzc, new com.google.android.gms.auth.zzk() { // from class: com.google.android.gms.auth.zzf
            @Override // com.google.android.gms.auth.zzk
            public final java.lang.Object zza(android.os.IBinder iBinder) {
                android.os.Bundle zzf = com.google.android.gms.internal.auth.zze.zzb(iBinder).zzf(account);
                if (zzf != null) {
                    return zzf;
                }
                throw new java.io.IOException("Service call returned null.");
            }
        }, 0L, null);
    }

    public static java.lang.Boolean requestGoogleAccountsAccess(android.content.Context context) throws com.google.android.gms.auth.GoogleAuthException, java.io.IOException {
        com.google.android.gms.common.internal.Preconditions.checkNotNull(context);
        zzk(context, 11400000);
        java.lang.String str = context.getApplicationInfo().packageName;
        com.google.android.gms.internal.auth.zzdc.zzd(context);
        if (com.google.android.gms.internal.auth.zzhw.zze() && zzp(context)) {
            try {
                android.os.Bundle bundle = (android.os.Bundle) zzi(com.google.android.gms.internal.auth.zzh.zza(context).zze(str), "google accounts access request");
                java.lang.String string = bundle.getString("Error");
                android.content.Intent intent = (android.content.Intent) bundle.getParcelable("userRecoveryIntent");
                android.app.PendingIntent pendingIntent = (android.app.PendingIntent) bundle.getParcelable("userRecoveryPendingIntent");
                if (com.google.android.gms.internal.auth.zzby.SUCCESS.equals(com.google.android.gms.internal.auth.zzby.zza(string))) {
                    return true;
                }
                zzn(context, "requestGoogleAccountsAccess", string, intent, pendingIntent);
                throw new com.google.android.gms.auth.GoogleAuthException("Invalid state. Shouldn't happen");
            } catch (com.google.android.gms.common.api.ApiException e) {
                zzl(e, "google accounts access request");
            }
        }
        return (java.lang.Boolean) zzh(context, zzc, new com.google.android.gms.auth.zzj(str, context), 0L, null);
    }

    public static com.google.android.gms.auth.TokenData zza(final android.content.Context context, final android.accounts.Account account, final java.lang.String str, android.os.Bundle bundle, long j, java.util.concurrent.Executor executor) throws java.io.IOException, com.google.android.gms.auth.GoogleAuthException {
        com.google.android.gms.common.internal.Preconditions.checkNotMainThread("Calling this from your main thread can lead to deadlock");
        com.google.android.gms.common.internal.Preconditions.checkNotEmpty(str, "Scope cannot be empty or null.");
        zzo(account);
        zzk(context, 8400000);
        final android.os.Bundle bundle2 = bundle == null ? new android.os.Bundle() : new android.os.Bundle(bundle);
        zzm(context, bundle2);
        com.google.android.gms.internal.auth.zzdc.zzd(context);
        if (com.google.android.gms.internal.auth.zzhw.zze() && zzp(context)) {
            try {
                android.os.Bundle bundle3 = (android.os.Bundle) zzi(com.google.android.gms.internal.auth.zzh.zza(context).zzc(account, str, bundle2), "token retrieval");
                zzj(bundle3);
                return zzg(context, "getTokenWithDetails", bundle3);
            } catch (com.google.android.gms.common.api.ApiException e) {
                zzl(e, "token retrieval");
            }
        }
        return (com.google.android.gms.auth.TokenData) zzh(context, zzc, new com.google.android.gms.auth.zzk() { // from class: com.google.android.gms.auth.zzg
            @Override // com.google.android.gms.auth.zzk
            public final java.lang.Object zza(android.os.IBinder iBinder) {
                return com.google.android.gms.auth.zzl.zzb(account, str, bundle2, context, iBinder);
            }
        }, 0L, null);
    }

    static /* synthetic */ com.google.android.gms.auth.TokenData zzb(android.accounts.Account account, java.lang.String str, android.os.Bundle bundle, android.content.Context context, android.os.IBinder iBinder) throws android.os.RemoteException, java.io.IOException, com.google.android.gms.auth.GoogleAuthException {
        android.os.Bundle zze = com.google.android.gms.internal.auth.zze.zzb(iBinder).zze(account, str, bundle);
        if (zze != null) {
            return zzg(context, "getTokenWithDetails", zze);
        }
        throw new java.io.IOException("Service call returned null");
    }

    public static void zze(android.content.Context context, java.lang.String str, long j) throws com.google.android.gms.auth.GoogleAuthException, java.io.IOException {
        com.google.android.gms.common.internal.Preconditions.checkNotMainThread("Calling this from your main thread can lead to deadlock");
        zzk(context, 8400000);
        android.os.Bundle bundle = new android.os.Bundle();
        zzm(context, bundle);
        com.google.android.gms.internal.auth.zzdc.zzd(context);
        if (com.google.android.gms.internal.auth.zzhw.zze() && zzp(context)) {
            com.google.android.gms.internal.auth.zzg zza2 = com.google.android.gms.internal.auth.zzh.zza(context);
            com.google.android.gms.internal.auth.zzbw zzbwVar = new com.google.android.gms.internal.auth.zzbw();
            zzbwVar.zza(str);
            try {
                zzi(zza2.zza(zzbwVar), "clear token");
                return;
            } catch (com.google.android.gms.common.api.ApiException e) {
                zzl(e, "clear token");
            }
        }
        zzh(context, zzc, new com.google.android.gms.auth.zzh(str, bundle), 0L, null);
    }

    private static com.google.android.gms.auth.TokenData zzg(android.content.Context context, java.lang.String str, android.os.Bundle bundle) throws com.google.android.gms.auth.GoogleAuthException, java.io.IOException {
        com.google.android.gms.auth.TokenData tokenData;
        android.os.Parcelable.Creator<com.google.android.gms.auth.TokenData> creator = com.google.android.gms.auth.TokenData.CREATOR;
        java.lang.ClassLoader classLoader = com.google.android.gms.auth.TokenData.class.getClassLoader();
        if (classLoader != null) {
            bundle.setClassLoader(classLoader);
        }
        android.os.Bundle bundle2 = bundle.getBundle("tokenDetails");
        if (bundle2 == null) {
            tokenData = null;
        } else {
            if (classLoader != null) {
                bundle2.setClassLoader(classLoader);
            }
            tokenData = (com.google.android.gms.auth.TokenData) bundle2.getParcelable("TokenData");
        }
        if (tokenData != null) {
            return tokenData;
        }
        zzn(context, "getTokenWithDetails", bundle.getString("Error"), (android.content.Intent) bundle.getParcelable("userRecoveryIntent"), (android.app.PendingIntent) bundle.getParcelable("userRecoveryPendingIntent"));
        throw new com.google.android.gms.auth.GoogleAuthException("Invalid state. Shouldn't happen");
    }

    private static java.lang.Object zzh(android.content.Context context, android.content.ComponentName componentName, com.google.android.gms.auth.zzk zzkVar, long j, java.util.concurrent.Executor executor) throws java.io.IOException, com.google.android.gms.auth.GoogleAuthException {
        com.google.android.gms.common.BlockingServiceConnection blockingServiceConnection = new com.google.android.gms.common.BlockingServiceConnection();
        com.google.android.gms.common.internal.GmsClientSupervisor gmsClientSupervisor = com.google.android.gms.common.internal.GmsClientSupervisor.getInstance(context);
        try {
            try {
                if (!gmsClientSupervisor.bindService(componentName, blockingServiceConnection, "GoogleAuthUtil", null)) {
                    throw new java.io.IOException("Could not bind to service.");
                }
                try {
                    return zzkVar.zza(blockingServiceConnection.getService());
                } catch (android.os.RemoteException | java.lang.InterruptedException | java.util.concurrent.TimeoutException e) {
                    android.util.Log.i("GoogleAuthUtil", "Error on service connection.", e);
                    throw new java.io.IOException("Error on service connection.", e);
                }
            } finally {
                gmsClientSupervisor.unbindService(componentName, blockingServiceConnection, "GoogleAuthUtil");
            }
        } catch (java.lang.SecurityException e2) {
            android.util.Log.w("GoogleAuthUtil", java.lang.String.format("SecurityException while bind to auth service: %s", e2.getMessage()));
            throw new java.io.IOException("SecurityException while binding to Auth service.", e2);
        }
    }

    private static java.lang.Object zzi(com.google.android.gms.tasks.Task task, java.lang.String str) throws java.io.IOException, com.google.android.gms.common.api.ApiException {
        try {
            return com.google.android.gms.tasks.Tasks.await(task);
        } catch (java.lang.InterruptedException e) {
            java.lang.String format = java.lang.String.format("Interrupted while waiting for the task of %s to finish.", str);
            zzd.w(format, new java.lang.Object[0]);
            throw new java.io.IOException(format, e);
        } catch (java.util.concurrent.CancellationException e2) {
            java.lang.String format2 = java.lang.String.format("Canceled while waiting for the task of %s to finish.", str);
            zzd.w(format2, new java.lang.Object[0]);
            throw new java.io.IOException(format2, e2);
        } catch (java.util.concurrent.ExecutionException e3) {
            java.lang.Throwable cause = e3.getCause();
            if (cause instanceof com.google.android.gms.common.api.ApiException) {
                throw ((com.google.android.gms.common.api.ApiException) cause);
            }
            java.lang.String format3 = java.lang.String.format("Unable to get a result for %s due to ExecutionException.", str);
            zzd.w(format3, new java.lang.Object[0]);
            throw new java.io.IOException(format3, e3);
        }
    }

    private static java.lang.Object zzj(java.lang.Object obj) throws java.io.IOException {
        if (obj != null) {
            return obj;
        }
        zzd.w("Service call returned null.", new java.lang.Object[0]);
        throw new java.io.IOException("Service unavailable.");
    }

    private static void zzk(android.content.Context context, int i) throws com.google.android.gms.auth.GoogleAuthException {
        try {
            com.google.android.gms.common.GooglePlayServicesUtilLight.ensurePlayServicesAvailable(context.getApplicationContext(), i);
        } catch (com.google.android.gms.common.GooglePlayServicesIncorrectManifestValueException e) {
            e = e;
            throw new com.google.android.gms.auth.GoogleAuthException(e.getMessage(), e);
        } catch (com.google.android.gms.common.GooglePlayServicesNotAvailableException e2) {
            e = e2;
            throw new com.google.android.gms.auth.GoogleAuthException(e.getMessage(), e);
        } catch (com.google.android.gms.common.GooglePlayServicesRepairableException e3) {
            throw new com.google.android.gms.auth.GooglePlayServicesAvailabilityException(e3.getConnectionStatusCode(), e3.getMessage(), e3.getIntent());
        }
    }

    private static void zzl(com.google.android.gms.common.api.ApiException apiException, java.lang.String str) {
        zzd.w("%s failed via GoogleAuthServiceClient, falling back to previous approach:\n%s", str, android.util.Log.getStackTraceString(apiException));
    }

    private static void zzm(android.content.Context context, android.os.Bundle bundle) {
        java.lang.String str = context.getApplicationInfo().packageName;
        bundle.putString("clientPackageName", str);
        java.lang.String str2 = zzb;
        if (android.text.TextUtils.isEmpty(bundle.getString(str2))) {
            bundle.putString(str2, str);
        }
        bundle.putLong("service_connection_start_time_millis", android.os.SystemClock.elapsedRealtime());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void zzn(android.content.Context context, java.lang.String str, java.lang.String str2, android.content.Intent intent, android.app.PendingIntent pendingIntent) throws com.google.android.gms.auth.GoogleAuthException, java.io.IOException {
        com.google.android.gms.internal.auth.zzby zza2 = com.google.android.gms.internal.auth.zzby.zza(str2);
        com.google.android.gms.common.logging.Logger logger = zzd;
        logger.w(java.lang.String.format("[GoogleAuthUtil] error status:%s with method:%s", zza2, str), new java.lang.Object[0]);
        if (!com.google.android.gms.internal.auth.zzby.BAD_AUTHENTICATION.equals(zza2) && !com.google.android.gms.internal.auth.zzby.CAPTCHA.equals(zza2) && !com.google.android.gms.internal.auth.zzby.NEED_PERMISSION.equals(zza2) && !com.google.android.gms.internal.auth.zzby.NEED_REMOTE_CONSENT.equals(zza2) && !com.google.android.gms.internal.auth.zzby.NEEDS_BROWSER.equals(zza2) && !com.google.android.gms.internal.auth.zzby.USER_CANCEL.equals(zza2) && !com.google.android.gms.internal.auth.zzby.DEVICE_MANAGEMENT_REQUIRED.equals(zza2) && !com.google.android.gms.internal.auth.zzby.DM_INTERNAL_ERROR.equals(zza2) && !com.google.android.gms.internal.auth.zzby.DM_SYNC_DISABLED.equals(zza2) && !com.google.android.gms.internal.auth.zzby.DM_ADMIN_BLOCKED.equals(zza2) && !com.google.android.gms.internal.auth.zzby.DM_ADMIN_PENDING_APPROVAL.equals(zza2) && !com.google.android.gms.internal.auth.zzby.DM_STALE_SYNC_REQUIRED.equals(zza2) && !com.google.android.gms.internal.auth.zzby.DM_DEACTIVATED.equals(zza2) && !com.google.android.gms.internal.auth.zzby.DM_REQUIRED.equals(zza2) && !com.google.android.gms.internal.auth.zzby.THIRD_PARTY_DEVICE_MANAGEMENT_REQUIRED.equals(zza2) && !com.google.android.gms.internal.auth.zzby.DM_SCREENLOCK_REQUIRED.equals(zza2)) {
            if (!com.google.android.gms.internal.auth.zzby.NETWORK_ERROR.equals(zza2) && !com.google.android.gms.internal.auth.zzby.SERVICE_UNAVAILABLE.equals(zza2) && !com.google.android.gms.internal.auth.zzby.INTNERNAL_ERROR.equals(zza2) && !com.google.android.gms.internal.auth.zzby.AUTH_SECURITY_ERROR.equals(zza2) && !com.google.android.gms.internal.auth.zzby.ACCOUNT_NOT_PRESENT.equals(zza2)) {
                throw new com.google.android.gms.auth.GoogleAuthException(str2);
            }
            throw new java.io.IOException(str2);
        }
        com.google.android.gms.internal.auth.zzdc.zzd(context);
        if (!com.google.android.gms.internal.auth.zzht.zzc()) {
            throw new com.google.android.gms.auth.UserRecoverableAuthException(str2, intent);
        }
        if (pendingIntent != null && intent != null) {
            throw com.google.android.gms.auth.UserRecoverableAuthException.zza(str2, intent, pendingIntent);
        }
        if (com.google.android.gms.common.GoogleApiAvailability.getInstance().getApkVersion(context) >= Integer.MAX_VALUE && pendingIntent == null) {
            logger.e(java.lang.String.format("Recovery PendingIntent is missing on current Gms version: %s for method: %s. It should always be present on or above Gms version %s. This indicates a bug in Gms implementation.", Integer.MAX_VALUE, str, Integer.MAX_VALUE), new java.lang.Object[0]);
        }
        if (intent == null) {
            logger.e(java.lang.String.format("no recovery Intent found with status=%s for method=%s. This shouldn't happen", str2, str), new java.lang.Object[0]);
        }
        throw new com.google.android.gms.auth.UserRecoverableAuthException(str2, intent);
    }

    private static boolean zzp(android.content.Context context) {
        if (com.google.android.gms.common.GoogleApiAvailability.getInstance().isGooglePlayServicesAvailable(context, 17895000) != 0) {
            return false;
        }
        java.util.List zzq = com.google.android.gms.internal.auth.zzhw.zzb().zzq();
        java.lang.String str = context.getApplicationInfo().packageName;
        java.util.Iterator it = zzq.iterator();
        while (it.hasNext()) {
            if (((java.lang.String) it.next()).equals(str)) {
                return false;
            }
        }
        return true;
    }

    public static java.lang.String getToken(android.content.Context context, android.accounts.Account account, java.lang.String str, android.os.Bundle bundle) throws java.io.IOException, com.google.android.gms.auth.UserRecoverableAuthException, com.google.android.gms.auth.GoogleAuthException {
        zzo(account);
        return zza(context, account, str, bundle, 0L, null).zza();
    }

    static void zzf(android.content.Intent intent) {
        if (intent == null) {
            throw new java.lang.IllegalArgumentException("Callback cannot be null.");
        }
        try {
            android.content.Intent.parseUri(intent.toUri(1), 1);
        } catch (java.net.URISyntaxException unused) {
            throw new java.lang.IllegalArgumentException("Parameter callback contains invalid data. It must be serializable using toUri() and parseUri().");
        }
    }

    private static void zzo(android.accounts.Account account) {
        if (account == null) {
            throw new java.lang.IllegalArgumentException("Account cannot be null");
        }
        if (android.text.TextUtils.isEmpty(account.name)) {
            throw new java.lang.IllegalArgumentException("Account name cannot be empty!");
        }
        java.lang.String[] strArr = zza;
        for (int i = 0; i < 3; i++) {
            if (strArr[i].equals(account.type)) {
                return;
            }
        }
        throw new java.lang.IllegalArgumentException("Account type not supported");
    }

    @java.lang.Deprecated
    public static java.lang.String getToken(android.content.Context context, java.lang.String str, java.lang.String str2) throws java.io.IOException, com.google.android.gms.auth.UserRecoverableAuthException, com.google.android.gms.auth.GoogleAuthException {
        return getToken(context, new android.accounts.Account(str, "com.google"), str2);
    }

    @java.lang.Deprecated
    public static java.lang.String getToken(android.content.Context context, java.lang.String str, java.lang.String str2, android.os.Bundle bundle) throws java.io.IOException, com.google.android.gms.auth.UserRecoverableAuthException, com.google.android.gms.auth.GoogleAuthException {
        return getToken(context, new android.accounts.Account(str, "com.google"), str2, bundle);
    }

    static /* synthetic */ java.lang.Object zzc(java.lang.Object obj) {
        zzj(obj);
        return obj;
    }

    zzl() {
    }
}
