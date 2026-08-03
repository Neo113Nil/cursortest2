package com.facebook.appevents.internal;

/* compiled from: SessionLogger.kt */
@kotlin.Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0016\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\bÁ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0012\u0010\t\u001a\u0004\u0018\u00010\u00062\u0006\u0010\n\u001a\u00020\u000bH\u0002J\u0010\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000fH\u0007J,\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u00062\b\u0010\u0013\u001a\u0004\u0018\u00010\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u00062\u0006\u0010\n\u001a\u00020\u000bH\u0007J\b\u0010\u0016\u001a\u00020\u0011H\u0002J$\u0010\u0017\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u00062\b\u0010\u0018\u001a\u0004\u0018\u00010\u00192\b\u0010\u0015\u001a\u0004\u0018\u00010\u0006H\u0007R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082T¢\u0006\u0002\n\u0000R\u0016\u0010\u0007\u001a\n \b*\u0004\u0018\u00010\u00060\u0006X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u001a"}, d2 = {"Lcom/facebook/appevents/internal/SessionLogger;", "", "()V", "INACTIVE_SECONDS_QUANTA", "", "PACKAGE_CHECKSUM", "", "TAG", "kotlin.jvm.PlatformType", "computePackageChecksum", "context", "Landroid/content/Context;", "getQuantaIndex", "", "timeBetweenSessions", "", "logActivateApp", "", "activityName", "sourceApplicationInfo", "Lcom/facebook/appevents/internal/SourceApplicationInfo;", com.google.firebase.remoteconfig.RemoteConfigConstants.RequestFieldKey.APP_ID, "logClockSkewEvent", "logDeactivateApp", "sessionInfo", "Lcom/facebook/appevents/internal/SessionInfo;", "facebook-core_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
/* loaded from: classes2.dex */
public final class SessionLogger {
    private static final java.lang.String PACKAGE_CHECKSUM = "PCKGCHKSUM";
    public static final com.facebook.appevents.internal.SessionLogger INSTANCE = new com.facebook.appevents.internal.SessionLogger();
    private static final java.lang.String TAG = com.facebook.appevents.internal.SessionLogger.class.getCanonicalName();
    private static final long[] INACTIVE_SECONDS_QUANTA = {300000, androidx.work.PeriodicWorkRequest.MIN_PERIODIC_INTERVAL_MILLIS, 1800000, 3600000, 21600000, 43200000, 86400000, 172800000, 259200000, com.helpshift.util.Utils.TIME_7DAYS_MILLIS, 1209600000, 1814400000, 2419200000L, 5184000000L, 7776000000L, 10368000000L, 12960000000L, 15552000000L, 31536000000L};

    private SessionLogger() {
    }

    @kotlin.jvm.JvmStatic
    public static final void logActivateApp(java.lang.String activityName, com.facebook.appevents.internal.SourceApplicationInfo sourceApplicationInfo, java.lang.String appId, android.content.Context context) {
        java.lang.String sourceApplicationInfo2;
        if (com.facebook.internal.instrument.crashshield.CrashShieldHandler.isObjectCrashing(com.facebook.appevents.internal.SessionLogger.class)) {
            return;
        }
        try {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(activityName, "activityName");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "context");
            java.lang.String str = "Unclassified";
            if (sourceApplicationInfo != null && (sourceApplicationInfo2 = sourceApplicationInfo.toString()) != null) {
                str = sourceApplicationInfo2;
            }
            android.os.Bundle bundle = new android.os.Bundle();
            bundle.putString(com.facebook.appevents.AppEventsConstants.EVENT_PARAM_SOURCE_APPLICATION, str);
            bundle.putString(com.facebook.appevents.AppEventsConstants.EVENT_PARAM_PACKAGE_FP, INSTANCE.computePackageChecksum(context));
            com.facebook.internal.security.CertificateUtil certificateUtil = com.facebook.internal.security.CertificateUtil.INSTANCE;
            bundle.putString(com.facebook.appevents.AppEventsConstants.EVENT_PARAM_APP_CERT_HASH, com.facebook.internal.security.CertificateUtil.getCertificateHash(context));
            com.facebook.appevents.InternalAppEventsLogger createInstance = com.facebook.appevents.InternalAppEventsLogger.INSTANCE.createInstance(activityName, appId, null);
            createInstance.logEvent(com.facebook.appevents.AppEventsConstants.EVENT_NAME_ACTIVATED_APP, bundle);
            if (com.facebook.appevents.InternalAppEventsLogger.INSTANCE.getFlushBehavior() != com.facebook.appevents.AppEventsLogger.FlushBehavior.EXPLICIT_ONLY) {
                createInstance.flush();
            }
        } catch (java.lang.Throwable th) {
            com.facebook.internal.instrument.crashshield.CrashShieldHandler.handleThrowable(th, com.facebook.appevents.internal.SessionLogger.class);
        }
    }

    @kotlin.jvm.JvmStatic
    public static final void logDeactivateApp(java.lang.String activityName, com.facebook.appevents.internal.SessionInfo sessionInfo, java.lang.String appId) {
        long longValue;
        java.lang.String sourceApplicationInfo;
        if (com.facebook.internal.instrument.crashshield.CrashShieldHandler.isObjectCrashing(com.facebook.appevents.internal.SessionLogger.class)) {
            return;
        }
        try {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(activityName, "activityName");
            if (sessionInfo == null) {
                return;
            }
            java.lang.Long diskRestoreTime = sessionInfo.getDiskRestoreTime();
            long j = 0;
            if (diskRestoreTime == null) {
                java.lang.Long sessionLastEventTime = sessionInfo.getSessionLastEventTime();
                longValue = 0 - (sessionLastEventTime == null ? 0L : sessionLastEventTime.longValue());
            } else {
                longValue = diskRestoreTime.longValue();
            }
            if (longValue < 0) {
                INSTANCE.logClockSkewEvent();
                longValue = 0;
            }
            long sessionLength = sessionInfo.getSessionLength();
            if (sessionLength < 0) {
                INSTANCE.logClockSkewEvent();
                sessionLength = 0;
            }
            android.os.Bundle bundle = new android.os.Bundle();
            bundle.putInt(com.facebook.appevents.AppEventsConstants.EVENT_NAME_SESSION_INTERRUPTIONS, sessionInfo.getInterruptionCount());
            kotlin.jvm.internal.StringCompanionObject stringCompanionObject = kotlin.jvm.internal.StringCompanionObject.INSTANCE;
            java.lang.String format = java.lang.String.format(java.util.Locale.ROOT, "session_quanta_%d", java.util.Arrays.copyOf(new java.lang.Object[]{java.lang.Integer.valueOf(getQuantaIndex(longValue))}, 1));
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(format, "java.lang.String.format(locale, format, *args)");
            bundle.putString(com.facebook.appevents.AppEventsConstants.EVENT_NAME_TIME_BETWEEN_SESSIONS, format);
            com.facebook.appevents.internal.SourceApplicationInfo sourceApplicationInfo2 = sessionInfo.getSourceApplicationInfo();
            java.lang.String str = "Unclassified";
            if (sourceApplicationInfo2 != null && (sourceApplicationInfo = sourceApplicationInfo2.toString()) != null) {
                str = sourceApplicationInfo;
            }
            bundle.putString(com.facebook.appevents.AppEventsConstants.EVENT_PARAM_SOURCE_APPLICATION, str);
            java.lang.Long sessionLastEventTime2 = sessionInfo.getSessionLastEventTime();
            if (sessionLastEventTime2 != null) {
                j = sessionLastEventTime2.longValue();
            }
            bundle.putLong(com.facebook.appevents.internal.Constants.LOG_TIME_APP_EVENT_KEY, j / 1000);
            com.facebook.appevents.InternalAppEventsLogger.INSTANCE.createInstance(activityName, appId, null).logEvent(com.facebook.appevents.AppEventsConstants.EVENT_NAME_DEACTIVATED_APP, sessionLength / 1000, bundle);
        } catch (java.lang.Throwable th) {
            com.facebook.internal.instrument.crashshield.CrashShieldHandler.handleThrowable(th, com.facebook.appevents.internal.SessionLogger.class);
        }
    }

    private final void logClockSkewEvent() {
        if (com.facebook.internal.instrument.crashshield.CrashShieldHandler.isObjectCrashing(this)) {
            return;
        }
        try {
            com.facebook.internal.Logger.Companion companion = com.facebook.internal.Logger.INSTANCE;
            com.facebook.LoggingBehavior loggingBehavior = com.facebook.LoggingBehavior.APP_EVENTS;
            java.lang.String str = TAG;
            kotlin.jvm.internal.Intrinsics.checkNotNull(str);
            companion.log(loggingBehavior, str, "Clock skew detected");
        } catch (java.lang.Throwable th) {
            com.facebook.internal.instrument.crashshield.CrashShieldHandler.handleThrowable(th, this);
        }
    }

    @kotlin.jvm.JvmStatic
    public static final int getQuantaIndex(long timeBetweenSessions) {
        if (com.facebook.internal.instrument.crashshield.CrashShieldHandler.isObjectCrashing(com.facebook.appevents.internal.SessionLogger.class)) {
            return 0;
        }
        int i = 0;
        while (true) {
            try {
                long[] jArr = INACTIVE_SECONDS_QUANTA;
                if (i >= jArr.length || jArr[i] >= timeBetweenSessions) {
                    break;
                }
                i++;
            } catch (java.lang.Throwable th) {
                com.facebook.internal.instrument.crashshield.CrashShieldHandler.handleThrowable(th, com.facebook.appevents.internal.SessionLogger.class);
                return 0;
            }
        }
        return i;
    }

    private final java.lang.String computePackageChecksum(android.content.Context context) {
        if (com.facebook.internal.instrument.crashshield.CrashShieldHandler.isObjectCrashing(this)) {
            return null;
        }
        try {
            try {
                android.content.pm.PackageManager packageManager = context.getPackageManager();
                java.lang.String stringPlus = kotlin.jvm.internal.Intrinsics.stringPlus("PCKGCHKSUM;", packageManager.getPackageInfo(context.getPackageName(), 0).versionName);
                android.content.SharedPreferences sharedPreferences = context.getSharedPreferences(com.facebook.FacebookSdk.APP_EVENT_PREFERENCES, 0);
                java.lang.String string = sharedPreferences.getString(stringPlus, null);
                if (string != null && string.length() == 32) {
                    return string;
                }
                com.facebook.appevents.internal.HashUtils hashUtils = com.facebook.appevents.internal.HashUtils.INSTANCE;
                java.lang.String computeChecksumWithPackageManager = com.facebook.appevents.internal.HashUtils.computeChecksumWithPackageManager(context, null);
                if (computeChecksumWithPackageManager == null) {
                    android.content.pm.ApplicationInfo applicationInfo = packageManager.getApplicationInfo(context.getPackageName(), 0);
                    kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(applicationInfo, "pm.getApplicationInfo(context.packageName, 0)");
                    com.facebook.appevents.internal.HashUtils hashUtils2 = com.facebook.appevents.internal.HashUtils.INSTANCE;
                    computeChecksumWithPackageManager = com.facebook.appevents.internal.HashUtils.computeChecksum(applicationInfo.sourceDir);
                }
                sharedPreferences.edit().putString(stringPlus, computeChecksumWithPackageManager).apply();
                return computeChecksumWithPackageManager;
            } catch (java.lang.Exception unused) {
                return null;
            }
        } catch (java.lang.Throwable th) {
            com.facebook.internal.instrument.crashshield.CrashShieldHandler.handleThrowable(th, this);
            return null;
        }
    }
}
