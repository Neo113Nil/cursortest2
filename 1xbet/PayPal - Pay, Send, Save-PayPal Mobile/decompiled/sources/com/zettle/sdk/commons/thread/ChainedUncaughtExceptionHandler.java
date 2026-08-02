package com.zettle.sdk.commons.thread;

@kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0006\n\u0002\u0010!\n\u0002\b\u0002\b\u0000\u0018\u00002\u00020\u0001B\u0015\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0015\u0010\b\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u0001¢\u0006\u0004\b\b\u0010\tJ\u001f\u0010\u000e\u001a\u00020\u00072\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00010\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011R\u001a\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00010\u00138\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015"}, d2 = {"Lcom/zettle/sdk/commons/thread/ChainedUncaughtExceptionHandler;", "Ljava/lang/Thread$UncaughtExceptionHandler;", "Lkotlin/Function0;", "defaultHandler", "<init>", "(Lkotlin/jvm/functions/Function0;)V", "handler", "", "chain", "(Ljava/lang/Thread$UncaughtExceptionHandler;)V", "Ljava/lang/Thread;", "t", "", "e", "uncaughtException", "(Ljava/lang/Thread;Ljava/lang/Throwable;)V", "getHighSpeedVideoFpsRangesFor", "Lkotlin/jvm/functions/Function0;", "getHighResolutionOutputSizeshNQ4ISI", "", "getHighSpeedVideoSizes", "Ljava/util/List;"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class ChainedUncaughtExceptionHandler implements java.lang.Thread.UncaughtExceptionHandler {

    /* renamed from: getHighSpeedVideoFpsRangesFor, reason: from kotlin metadata */
    private final kotlin.jvm.functions.Function0<java.lang.Thread.UncaughtExceptionHandler> getHighResolutionOutputSizeshNQ4ISI;
    private final java.util.List<java.lang.Thread.UncaughtExceptionHandler> getHighSpeedVideoSizes;

    /* JADX WARN: Multi-variable type inference failed */
    public ChainedUncaughtExceptionHandler(kotlin.jvm.functions.Function0<? extends java.lang.Thread.UncaughtExceptionHandler> function0) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function0, "");
        this.getHighResolutionOutputSizeshNQ4ISI = function0;
        this.getHighSpeedVideoSizes = new java.util.ArrayList();
    }

    @Override // java.lang.Thread.UncaughtExceptionHandler
    public final void uncaughtException(java.lang.Thread t, java.lang.Throwable e) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(t, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(e, "");
        java.util.List zReversed = com.zettle.sdk.extensions.ZettleCollectionsExtKt.zReversed(this.getHighSpeedVideoSizes);
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (java.lang.Object obj : zReversed) {
            if (((java.lang.Thread.UncaughtExceptionHandler) obj) != this) {
                arrayList.add(obj);
            }
        }
        java.util.Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            ((java.lang.Thread.UncaughtExceptionHandler) it.next()).uncaughtException(t, e);
        }
        this.getHighResolutionOutputSizeshNQ4ISI.invoke().uncaughtException(t, e);
    }

    public final void chain(java.lang.Thread.UncaughtExceptionHandler handler) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(handler, "");
        synchronized (this) {
            if (!this.getHighSpeedVideoSizes.contains(handler)) {
                this.getHighSpeedVideoSizes.add(handler);
            }
            kotlin.Unit unit = kotlin.Unit.INSTANCE;
        }
    }
}
