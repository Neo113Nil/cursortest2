package com.discover.mpos.sdk.core.debug.logger;

@kotlin.Metadata(bv = {1, 0, 3}, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0011\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0002\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J/\u0010\t\u001a\u00020\u00012\u0006\u0010\u0005\u001a\u00020\u00042\u0016\u0010\b\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010\u00070\u0006\"\u0004\u0018\u00010\u0007H\u0016¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/discover/mpos/sdk/core/debug/logger/StubLogBuilder;", "Lcom/discover/mpos/sdk/core/debug/logger/LogBuilder;", "<init>", "()V", "", "message", "", "", "params", "append", "(Ljava/lang/String;[Ljava/lang/Object;)Lcom/discover/mpos/sdk/core/debug/logger/LogBuilder;", "tag", "", "log", "(Ljava/lang/String;)V"}, k = 1, mv = {1, 4, 1})
/* loaded from: classes8.dex */
public final class StubLogBuilder implements com.discover.mpos.sdk.core.debug.logger.LogBuilder {
    @Override // com.discover.mpos.sdk.core.debug.logger.LogBuilder
    public final com.discover.mpos.sdk.core.debug.logger.LogBuilder append(java.lang.String message, java.lang.Object... params) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(message, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(params, "");
        return this;
    }

    @Override // com.discover.mpos.sdk.core.debug.logger.LogBuilder
    public final void log(java.lang.String tag) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(tag, "");
    }
}
