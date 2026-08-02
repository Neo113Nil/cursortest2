package com.zettle.sdk.commons.thread;

@kotlin.Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\b\b\u0002\u0018\u00002\u00020\u0001B#\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\n\u001a\u00020\u0006H\u0014¢\u0006\u0004\b\n\u0010\u000bR \u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\r"}, d2 = {"Lcom/zettle/sdk/commons/thread/HandlerThreadWithCallback;", "Landroid/os/HandlerThread;", "", "p0", "Lkotlin/Function1;", "Landroid/os/Looper;", "", "p1", "<init>", "(Ljava/lang/String;Lkotlin/jvm/functions/Function1;)V", "onLooperPrepared", "()V", "getHighSpeedVideoFpsRanges", "Lkotlin/jvm/functions/Function1;", "getHighSpeedVideoSizes"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes16.dex */
final class HandlerThreadWithCallback extends android.os.HandlerThread {

    /* renamed from: getHighSpeedVideoFpsRanges, reason: from kotlin metadata */
    private final kotlin.jvm.functions.Function1<android.os.Looper, kotlin.Unit> getHighSpeedVideoSizes;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public HandlerThreadWithCallback(java.lang.String str, kotlin.jvm.functions.Function1<? super android.os.Looper, kotlin.Unit> function1) {
        super(str);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function1, "");
        this.getHighSpeedVideoSizes = function1;
    }

    @Override // android.os.HandlerThread
    protected final void onLooperPrepared() {
        kotlin.jvm.functions.Function1<android.os.Looper, kotlin.Unit> function1 = this.getHighSpeedVideoSizes;
        android.os.Looper looper = getLooper();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(looper, "");
        function1.invoke(looper);
    }
}
