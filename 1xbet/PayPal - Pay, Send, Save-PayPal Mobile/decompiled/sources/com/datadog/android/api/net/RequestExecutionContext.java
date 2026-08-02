package com.datadog.android.api.net;

@kotlin.Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B\u001d\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\u0007\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0012\u0010\t\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\t\u0010\nJ&\u0010\u000b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0011\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0011\u0010\bJ\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0015\u001a\u0004\b\u0016\u0010\bR\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0017\u001a\u0004\b\u0018\u0010\n"}, d2 = {"Lcom/datadog/android/api/net/RequestExecutionContext;", "", "", "attemptNumber", "previousResponseCode", "<init>", "(ILjava/lang/Integer;)V", "component1", "()I", "component2", "()Ljava/lang/Integer;", "copy", "(ILjava/lang/Integer;)Lcom/datadog/android/api/net/RequestExecutionContext;", "other", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "", "toString", "()Ljava/lang/String;", com.visa.cbp.getEncExpo.warmup, "getAttemptNumber", "Ljava/lang/Integer;", "getPreviousResponseCode"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes7.dex */
public final /* data */ class RequestExecutionContext {
    private final int attemptNumber;
    private final java.lang.Integer previousResponseCode;

    public RequestExecutionContext(int i, java.lang.Integer num) {
        this.attemptNumber = i;
        this.previousResponseCode = num;
    }

    public /* synthetic */ RequestExecutionContext(int i, java.lang.Integer num, int i2, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? 0 : i, (i2 & 2) != 0 ? null : num);
    }

    public final int getAttemptNumber() {
        return this.attemptNumber;
    }

    public final java.lang.Integer getPreviousResponseCode() {
        return this.previousResponseCode;
    }

    public final java.lang.String toString() {
        int i = this.attemptNumber;
        java.lang.Integer num = this.previousResponseCode;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("RequestExecutionContext(attemptNumber=");
        sb.append(i);
        sb.append(", previousResponseCode=");
        sb.append(num);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        int hashCode = java.lang.Integer.hashCode(this.attemptNumber);
        java.lang.Integer num = this.previousResponseCode;
        return (hashCode * 31) + (num == null ? 0 : num.hashCode());
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.datadog.android.api.net.RequestExecutionContext)) {
            return false;
        }
        com.datadog.android.api.net.RequestExecutionContext requestExecutionContext = (com.datadog.android.api.net.RequestExecutionContext) other;
        return this.attemptNumber == requestExecutionContext.attemptNumber && kotlin.jvm.internal.Intrinsics.areEqual(this.previousResponseCode, requestExecutionContext.previousResponseCode);
    }

    public final com.datadog.android.api.net.RequestExecutionContext copy(int attemptNumber, java.lang.Integer previousResponseCode) {
        return new com.datadog.android.api.net.RequestExecutionContext(attemptNumber, previousResponseCode);
    }

    /* renamed from: component2, reason: from getter */
    public final java.lang.Integer getPreviousResponseCode() {
        return this.previousResponseCode;
    }

    /* renamed from: component1, reason: from getter */
    public final int getAttemptNumber() {
        return this.attemptNumber;
    }

    public static /* synthetic */ com.datadog.android.api.net.RequestExecutionContext copy$default(com.datadog.android.api.net.RequestExecutionContext requestExecutionContext, int i, java.lang.Integer num, int i2, java.lang.Object obj) {
        if ((i2 & 1) != 0) {
            i = requestExecutionContext.attemptNumber;
        }
        if ((i2 & 2) != 0) {
            num = requestExecutionContext.previousResponseCode;
        }
        return requestExecutionContext.copy(i, num);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public RequestExecutionContext() {
        this(0, null, 3, 0 == true ? 1 : 0);
    }
}
