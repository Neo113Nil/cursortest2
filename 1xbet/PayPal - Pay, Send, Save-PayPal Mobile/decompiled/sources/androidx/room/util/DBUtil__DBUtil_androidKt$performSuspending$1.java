package androidx.room.util;

@kotlin.Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "androidx.room.util.DBUtil__DBUtil_androidKt", f = "DBUtil.android.kt", i = {1, 1, 1, 1}, l = {com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_WAIT_SOME_TIME_VALUE, com.plaid.internal.EnumC0527g.SDK_ASSET_ICON_PLAID_LOGO_VALUE, com.plaid.internal.EnumC0527g.SDK_ASSET_ICON_PLAID_LOGO_VALUE}, m = "performSuspending", n = {com.datadog.trace.api.DDSpanTypes.COUCHBASE, "block", "isReadOnly", "inTransaction"}, s = {"L$0", "L$1", "Z$0", "Z$1"})
/* loaded from: classes.dex */
final class DBUtil__DBUtil_androidKt$performSuspending$1<R> extends kotlin.coroutines.jvm.internal.ContinuationImpl {
    java.lang.Object Camera2StreamConfigurationMap;
    boolean getHighResolutionOutputSizeshNQ4ISI;
    int getHighSpeedVideoFpsRanges;
    boolean getHighSpeedVideoFpsRangesFor;
    java.lang.Object getHighSpeedVideoSizes;
    /* synthetic */ java.lang.Object getOutputMinFrameDuration;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.getOutputMinFrameDuration = obj;
        this.getHighSpeedVideoFpsRanges |= Integer.MIN_VALUE;
        return androidx.room.util.DBUtil.performSuspending(null, false, false, null, this);
    }

    DBUtil__DBUtil_androidKt$performSuspending$1(kotlin.coroutines.Continuation<? super androidx.room.util.DBUtil__DBUtil_androidKt$performSuspending$1> continuation) {
        super(continuation);
    }
}
