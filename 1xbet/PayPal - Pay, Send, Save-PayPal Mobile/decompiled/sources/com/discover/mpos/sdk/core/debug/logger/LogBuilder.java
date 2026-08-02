package com.discover.mpos.sdk.core.debug.logger;

@kotlin.Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0011\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J/\u0010\u0006\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0016\u0010\u0005\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010\u00010\u0004\"\u0004\u0018\u00010\u0001H&¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u0002H&¢\u0006\u0004\b\n\u0010\u000b"}, d2 = {"Lcom/discover/mpos/sdk/core/debug/logger/LogBuilder;", "", "", "message", "", "params", "append", "(Ljava/lang/String;[Ljava/lang/Object;)Lcom/discover/mpos/sdk/core/debug/logger/LogBuilder;", "tag", "", "log", "(Ljava/lang/String;)V"}, k = 1, mv = {1, 4, 1})
/* loaded from: classes8.dex */
public interface LogBuilder {
    com.discover.mpos.sdk.core.debug.logger.LogBuilder append(java.lang.String message, java.lang.Object... params);

    void log(java.lang.String tag);
}
