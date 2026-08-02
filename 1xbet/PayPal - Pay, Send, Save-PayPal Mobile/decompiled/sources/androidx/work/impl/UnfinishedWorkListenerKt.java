package androidx.work.impl;

@kotlin.Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0002\u001a+\u0010\b\u001a\u00020\u0007*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005H\u0000¢\u0006\u0004\b\b\u0010\t\"\u0019\u0010\u000e\u001a\u00070\n¢\u0006\u0002\b\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\r\"\u0014\u0010\f\u001a\u00020\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "Landroid/content/Context;", "appContext", "Landroidx/work/Configuration;", com.miteksystems.misnap.core.serverconnection.MobileVerifyV2Request.CONFIG_KEY, "Landroidx/work/impl/WorkDatabase;", com.datadog.trace.api.DDSpanTypes.COUCHBASE, "", "maybeLaunchUnfinishedWorkListener", "(Lkotlinx/coroutines/CoroutineScope;Landroid/content/Context;Landroidx/work/Configuration;Landroidx/work/impl/WorkDatabase;)V", "", "Lorg/jspecify/annotations/NonNull;", "getHighSpeedVideoFpsRangesFor", "Ljava/lang/String;", "getHighResolutionOutputSizeshNQ4ISI", "", "getHighSpeedVideoFpsRanges", "J"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class UnfinishedWorkListenerKt {
    private static final long getHighSpeedVideoFpsRanges;
    private static final java.lang.String getHighSpeedVideoFpsRangesFor;

    static {
        java.lang.String tagWithPrefix = androidx.work.Logger.tagWithPrefix("UnfinishedWorkListener");
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(tagWithPrefix, "");
        getHighSpeedVideoFpsRangesFor = tagWithPrefix;
        getHighSpeedVideoFpsRanges = java.util.concurrent.TimeUnit.HOURS.toMillis(1L);
    }

    public static final void maybeLaunchUnfinishedWorkListener(kotlinx.coroutines.CoroutineScope coroutineScope, android.content.Context context, androidx.work.Configuration configuration, androidx.work.impl.WorkDatabase workDatabase) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(coroutineScope, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(configuration, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(workDatabase, "");
        if (androidx.work.impl.utils.ProcessUtils.isDefaultProcess(context, configuration)) {
            kotlinx.coroutines.flow.FlowKt.launchIn(kotlinx.coroutines.flow.FlowKt.onEach(kotlinx.coroutines.flow.FlowKt.distinctUntilChanged(kotlinx.coroutines.flow.FlowKt.conflate(kotlinx.coroutines.flow.FlowKt.retryWhen(workDatabase.workSpecDao().hasUnfinishedWorkFlow(), new androidx.work.impl.UnfinishedWorkListenerKt$maybeLaunchUnfinishedWorkListener$1(null)))), new androidx.work.impl.UnfinishedWorkListenerKt$maybeLaunchUnfinishedWorkListener$2(context, null)), coroutineScope);
        }
    }
}
