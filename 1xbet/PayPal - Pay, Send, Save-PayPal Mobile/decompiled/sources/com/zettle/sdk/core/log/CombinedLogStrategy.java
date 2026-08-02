package com.zettle.sdk.core.log;

@kotlin.Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B\u0015\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005J1\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\b2\b\u0010\f\u001a\u0004\u0018\u00010\u000bH\u0016¢\u0006\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00010\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011"}, d2 = {"Lcom/zettle/sdk/core/log/CombinedLogStrategy;", "Lcom/zettle/sdk/commons/util/Log$Strategy;", "", "strategies", "<init>", "(Ljava/util/List;)V", "Lcom/zettle/sdk/commons/util/Log$Priority;", "priority", "", "tag", "message", "", com.datadog.android.rum.internal.RumFeature.EVENT_THROWABLE_PROPERTY, "", "log", "(Lcom/zettle/sdk/commons/util/Log$Priority;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V", "getHighSpeedVideoSizes", "Ljava/util/List;"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes17.dex */
public final class CombinedLogStrategy implements com.zettle.sdk.commons.util.Log.Strategy {
    private final java.util.List<com.zettle.sdk.commons.util.Log.Strategy> getHighSpeedVideoSizes;

    /* JADX WARN: Multi-variable type inference failed */
    public CombinedLogStrategy(java.util.List<? extends com.zettle.sdk.commons.util.Log.Strategy> list) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list, "");
        this.getHighSpeedVideoSizes = list;
    }

    @Override // com.zettle.sdk.commons.util.Log.Strategy
    public final void log(com.zettle.sdk.commons.util.Log.Priority priority, java.lang.String tag, java.lang.String message, java.lang.Throwable throwable) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(priority, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(tag, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(message, "");
        java.util.Iterator<T> it = this.getHighSpeedVideoSizes.iterator();
        while (it.hasNext()) {
            ((com.zettle.sdk.commons.util.Log.Strategy) it.next()).log(priority, tag, message, throwable);
        }
    }
}
