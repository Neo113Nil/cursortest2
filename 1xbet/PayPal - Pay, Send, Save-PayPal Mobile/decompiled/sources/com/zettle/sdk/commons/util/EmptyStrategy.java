package com.zettle.sdk.commons.util;

@kotlin.Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J1\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u00062\b\u0010\n\u001a\u0004\u0018\u00010\tH\u0016¢\u0006\u0004\b\f\u0010\r"}, d2 = {"Lcom/zettle/sdk/commons/util/EmptyStrategy;", "Lcom/zettle/sdk/commons/util/Log$Strategy;", "<init>", "()V", "Lcom/zettle/sdk/commons/util/Log$Priority;", "priority", "", "tag", "message", "", com.datadog.android.rum.internal.RumFeature.EVENT_THROWABLE_PROPERTY, "", "log", "(Lcom/zettle/sdk/commons/util/Log$Priority;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class EmptyStrategy implements com.zettle.sdk.commons.util.Log.Strategy {
    @Override // com.zettle.sdk.commons.util.Log.Strategy
    public final void log(com.zettle.sdk.commons.util.Log.Priority priority, java.lang.String tag, java.lang.String message, java.lang.Throwable throwable) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(priority, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(tag, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(message, "");
    }
}
