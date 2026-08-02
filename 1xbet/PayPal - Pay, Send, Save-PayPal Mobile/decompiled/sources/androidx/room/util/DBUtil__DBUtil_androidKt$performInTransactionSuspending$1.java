package androidx.room.util;

@kotlin.Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "androidx.room.util.DBUtil__DBUtil_androidKt", f = "DBUtil.android.kt", i = {2, 2}, l = {97, com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_WAIT_SOME_TIME_VALUE, com.plaid.internal.EnumC0527g.SDK_ASSET_ICON_PLAID_LOGO_VALUE, com.plaid.internal.EnumC0527g.SDK_ASSET_ICON_PLAID_LOGO_VALUE}, m = "performInTransactionSuspending", n = {com.datadog.trace.api.DDSpanTypes.COUCHBASE, "block"}, s = {"L$0", "L$1"})
/* loaded from: classes.dex */
final class DBUtil__DBUtil_androidKt$performInTransactionSuspending$1<R> extends kotlin.coroutines.jvm.internal.ContinuationImpl {
    java.lang.Object Camera2StreamConfigurationMap;
    /* synthetic */ java.lang.Object getHighResolutionOutputSizeshNQ4ISI;
    java.lang.Object getHighSpeedVideoFpsRangesFor;
    int getHighSpeedVideoSizes;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.getHighResolutionOutputSizeshNQ4ISI = obj;
        this.getHighSpeedVideoSizes |= Integer.MIN_VALUE;
        return androidx.room.util.DBUtil.performInTransactionSuspending(null, null, this);
    }

    DBUtil__DBUtil_androidKt$performInTransactionSuspending$1(kotlin.coroutines.Continuation<? super androidx.room.util.DBUtil__DBUtil_androidKt$performInTransactionSuspending$1> continuation) {
        super(continuation);
    }
}
