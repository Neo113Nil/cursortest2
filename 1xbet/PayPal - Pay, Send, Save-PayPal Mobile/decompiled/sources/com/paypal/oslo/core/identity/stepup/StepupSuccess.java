package com.paypal.oslo.core.identity.stepup;

@kotlin.Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\b\u0086\b\u0018\u00002\u00020\u0001B\u0013\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0012\u0010\u0006\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001c\u0010\b\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\f\u001a\u00020\u000b2\b\u0010\n\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0011\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0007R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0012\u001a\u0004\b\u0013\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/core/identity/stepup/StepupSuccess;", "", "", com.google.firebase.messaging.Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "<init>", "(Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "copy", "(Ljava/lang/String;)Lcom/paypal/oslo/core/identity/stepup/StepupSuccess;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getData"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class StepupSuccess {
    private final java.lang.String data;

    public StepupSuccess(java.lang.String str) {
        this.data = str;
    }

    public /* synthetic */ StepupSuccess(java.lang.String str, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str);
    }

    public final java.lang.String getData() {
        return this.data;
    }

    public final java.lang.String toString() {
        java.lang.String str = this.data;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("StepupSuccess(data=");
        sb.append(str);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        java.lang.String str = this.data;
        if (str == null) {
            return 0;
        }
        return str.hashCode();
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof com.paypal.oslo.core.identity.stepup.StepupSuccess) && kotlin.jvm.internal.Intrinsics.areEqual(this.data, ((com.paypal.oslo.core.identity.stepup.StepupSuccess) other).data);
    }

    public final com.paypal.oslo.core.identity.stepup.StepupSuccess copy(java.lang.String data) {
        return new com.paypal.oslo.core.identity.stepup.StepupSuccess(data);
    }

    /* renamed from: component1, reason: from getter */
    public final java.lang.String getData() {
        return this.data;
    }

    public static /* synthetic */ com.paypal.oslo.core.identity.stepup.StepupSuccess copy$default(com.paypal.oslo.core.identity.stepup.StepupSuccess stepupSuccess, java.lang.String str, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            str = stepupSuccess.data;
        }
        return stepupSuccess.copy(str);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public StepupSuccess() {
        this(null, 1, 0 == true ? 1 : 0);
    }
}
