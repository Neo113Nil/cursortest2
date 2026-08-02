package com.datadog.android.profiling;

@kotlin.Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0011\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u0000 '2\u00020\u0001:\u0001'B\u0011\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J3\u0010\r\u001a\u00020\f2\u0006\u0010\u0007\u001a\u00020\u00062\b\u0010\t\u001a\u0004\u0018\u00010\b2\u0010\u0010\u000b\u001a\f\u0012\u0006\b\u0001\u0012\u00020\b\u0018\u00010\nH\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u0019\u0010\u000f\u001a\u0004\u0018\u00010\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u000f\u0010\u0010J#\u0010\u0013\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0007\u001a\u00020\u00062\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010\u0016\u001a\u00020\u0015H\u0016¢\u0006\u0004\b\u0016\u0010\u0017J\u0017\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u0019\u001a\u00020\u0018H\u0000¢\u0006\u0004\b\u001b\u0010\u001cJQ\u0010 \u001a\u0004\u0018\u00010\u001f2\u0006\u0010\u0007\u001a\u00020\u00062\u0010\u0010\u001d\u001a\f\u0012\u0006\b\u0001\u0012\u00020\b\u0018\u00010\n2\b\u0010\t\u001a\u0004\u0018\u00010\b2\u0010\u0010\u000b\u001a\f\u0012\u0006\b\u0001\u0012\u00020\b\u0018\u00010\n2\b\u0010\u001e\u001a\u0004\u0018\u00010\bH\u0016¢\u0006\u0004\b \u0010!J=\u0010\"\u001a\u00020\f2\u0006\u0010\u0007\u001a\u00020\u00062\b\u0010\u0012\u001a\u0004\u0018\u00010\u00112\b\u0010\t\u001a\u0004\u0018\u00010\b2\u0010\u0010\u000b\u001a\f\u0012\u0006\b\u0001\u0012\u00020\b\u0018\u00010\nH\u0016¢\u0006\u0004\b\"\u0010#R\u0014\u0010&\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b$\u0010%"}, d2 = {"Lcom/datadog/android/profiling/DdProfilingContentProvider;", "Landroid/content/ContentProvider;", "Lcom/datadog/android/internal/system/BuildSdkVersionProvider;", "buildSdkVersionProvider", "<init>", "(Lcom/datadog/android/internal/system/BuildSdkVersionProvider;)V", "Landroid/net/Uri;", "uri", "", "selection", "", "selectionArgs", "", com.paypal.oslo.feature.userprofile.api.analytics.UserProfileAnalytics.Actions.DELETE, "(Landroid/net/Uri;Ljava/lang/String;[Ljava/lang/String;)I", "getType", "(Landroid/net/Uri;)Ljava/lang/String;", "Landroid/content/ContentValues;", "values", "insert", "(Landroid/net/Uri;Landroid/content/ContentValues;)Landroid/net/Uri;", "", "onCreate", "()Z", "Landroid/content/Context;", "context", "", "onStart$dd_sdk_android_profiling_release", "(Landroid/content/Context;)V", "projection", "sortOrder", "Landroid/database/Cursor;", "query", "(Landroid/net/Uri;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;", "update", "(Landroid/net/Uri;Landroid/content/ContentValues;Ljava/lang/String;[Ljava/lang/String;)I", "getHighSpeedVideoFpsRanges", "Lcom/datadog/android/internal/system/BuildSdkVersionProvider;", "getHighSpeedVideoFpsRangesFor", "Companion"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class DdProfilingContentProvider extends android.content.ContentProvider {
    public static final java.lang.String TELEMETRY_APP_START_INFO_ACTIVITY = "start_activity";
    public static final java.lang.String TELEMETRY_APP_START_INFO_LAUNCHER = "launcher";
    public static final java.lang.String TELEMETRY_APP_START_INFO_RECENTS = "recents";

    /* renamed from: getHighSpeedVideoFpsRanges, reason: from kotlin metadata */
    private final com.datadog.android.internal.system.BuildSdkVersionProvider getHighSpeedVideoFpsRangesFor;

    public /* synthetic */ DdProfilingContentProvider(com.datadog.android.internal.system.BuildSdkVersionProvider buildSdkVersionProvider, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? com.datadog.android.internal.system.BuildSdkVersionProvider.INSTANCE.getDEFAULT() : buildSdkVersionProvider);
    }

    public DdProfilingContentProvider(com.datadog.android.internal.system.BuildSdkVersionProvider buildSdkVersionProvider) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(buildSdkVersionProvider, "");
        this.getHighSpeedVideoFpsRangesFor = buildSdkVersionProvider;
    }

    @Override // android.content.ContentProvider
    public final boolean onCreate() {
        android.content.Context context = getContext();
        if (context == null) {
            return true;
        }
        onStart$dd_sdk_android_profiling_release(context);
        return true;
    }

    public final void onStart$dd_sdk_android_profiling_release(android.content.Context context) {
        java.util.List historicalProcessStartReasons;
        android.app.ApplicationStartInfo applicationStartInfo;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "");
        if (this.getHighSpeedVideoFpsRangesFor.getIsAtLeastVanillaIceCream()) {
            java.util.Set<java.lang.String> profilingEnabledInstanceNames$dd_sdk_android_profiling_release = com.datadog.android.profiling.internal.ProfilingStorage.getProfilingEnabledInstanceNames$dd_sdk_android_profiling_release(context);
            if (profilingEnabledInstanceNames$dd_sdk_android_profiling_release.isEmpty()) {
                return;
            }
            java.lang.Object systemService = context.getSystemService("activity");
            java.lang.String str = null;
            android.app.ActivityManager activityManager = systemService instanceof android.app.ActivityManager ? (android.app.ActivityManager) systemService : null;
            java.lang.Integer valueOf = (activityManager == null || (historicalProcessStartReasons = activityManager.getHistoricalProcessStartReasons(1)) == null || (applicationStartInfo = (android.app.ApplicationStartInfo) kotlin.collections.CollectionsKt.firstOrNull(historicalProcessStartReasons)) == null) ? null : java.lang.Integer.valueOf(applicationStartInfo.getReason());
            if (valueOf != null && valueOf.intValue() == 6) {
                str = TELEMETRY_APP_START_INFO_LAUNCHER;
            } else if (valueOf != null && valueOf.intValue() == 11) {
                str = TELEMETRY_APP_START_INFO_ACTIVITY;
            } else if (valueOf != null && valueOf.intValue() == 7) {
                str = TELEMETRY_APP_START_INFO_RECENTS;
            }
            if (str != null) {
                if (new com.datadog.android.core.sampling.RateBasedSampler(com.datadog.android.profiling.internal.ProfilingStorage.INSTANCE.getSampleRate$dd_sdk_android_profiling_release(context)).sample(kotlin.Unit.INSTANCE)) {
                    com.datadog.android.profiling.Profiling.INSTANCE.start$dd_sdk_android_profiling_release(context, com.datadog.android.profiling.internal.ProfilingStartReason.APPLICATION_LAUNCH, kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to(com.datadog.android.profiling.internal.perfetto.PerfettoProfiler.TELEMETRY_KEY_APP_START_INFO, str)), profilingEnabledInstanceNames$dd_sdk_android_profiling_release);
                }
                com.datadog.android.profiling.internal.ProfilingStorage.INSTANCE.removeSampleRate$dd_sdk_android_profiling_release(context);
            }
        }
    }

    @Override // android.content.ContentProvider
    public final int update(android.net.Uri uri, android.content.ContentValues values, java.lang.String selection, java.lang.String[] selectionArgs) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(uri, "");
        return 0;
    }

    @Override // android.content.ContentProvider
    public final android.database.Cursor query(android.net.Uri uri, java.lang.String[] projection, java.lang.String selection, java.lang.String[] selectionArgs, java.lang.String sortOrder) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(uri, "");
        return null;
    }

    @Override // android.content.ContentProvider
    public final android.net.Uri insert(android.net.Uri uri, android.content.ContentValues values) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(uri, "");
        return null;
    }

    @Override // android.content.ContentProvider
    public final java.lang.String getType(android.net.Uri uri) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(uri, "");
        return null;
    }

    @Override // android.content.ContentProvider
    public final int delete(android.net.Uri uri, java.lang.String selection, java.lang.String[] selectionArgs) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(uri, "");
        return 0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public DdProfilingContentProvider() {
        this(null, 1, 0 == true ? 1 : 0);
    }
}
