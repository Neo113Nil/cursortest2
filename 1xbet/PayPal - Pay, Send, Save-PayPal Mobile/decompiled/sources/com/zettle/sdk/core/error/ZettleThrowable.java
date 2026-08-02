package com.zettle.sdk.core.error;

@kotlin.Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0002\u0010\u000e\n\u0002\b\u0007\u0018\u00002\u00020\u0001B\u001f\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0005\u0010\u0006R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0007\u001a\u0004\b\b\u0010\t"}, d2 = {"Lcom/zettle/sdk/core/error/ZettleThrowable;", "", "", "featureId", "message", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "Ljava/lang/String;", "getFeatureId", "()Ljava/lang/String;"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes17.dex */
public final class ZettleThrowable extends java.lang.Throwable {
    private final java.lang.String featureId;

    public /* synthetic */ ZettleThrowable(java.lang.String str, java.lang.String str2, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2);
    }

    public final java.lang.String getFeatureId() {
        return this.featureId;
    }

    public ZettleThrowable(java.lang.String str, java.lang.String str2) {
        super(str2);
        this.featureId = str;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public ZettleThrowable() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }
}
