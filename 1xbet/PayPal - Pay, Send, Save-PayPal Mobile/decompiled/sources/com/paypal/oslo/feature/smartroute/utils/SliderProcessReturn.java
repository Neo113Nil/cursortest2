package com.paypal.oslo.feature.smartroute.utils;

@kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\b6\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0002\u0006\u0007"}, d2 = {"Lcom/paypal/oslo/feature/smartroute/utils/SliderProcessReturn;", "", "<init>", "()V", "Error", "Success", "Lcom/paypal/oslo/feature/smartroute/utils/SliderProcessReturn$Error;", "Lcom/paypal/oslo/feature/smartroute/utils/SliderProcessReturn$Success;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes15.dex */
public abstract class SliderProcessReturn {
    public static final int $stable = 0;

    private SliderProcessReturn() {
    }

    @kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/paypal/oslo/feature/smartroute/utils/SliderProcessReturn$Error;", "Lcom/paypal/oslo/feature/smartroute/utils/SliderProcessReturn;", "<init>", "()V"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Error extends com.paypal.oslo.feature.smartroute.utils.SliderProcessReturn {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.smartroute.utils.SliderProcessReturn.Error INSTANCE = new com.paypal.oslo.feature.smartroute.utils.SliderProcessReturn.Error();

        private Error() {
            super(null);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0015\u001a\u0004\b\u0016\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/smartroute/utils/SliderProcessReturn$Success;", "Lcom/paypal/oslo/feature/smartroute/utils/SliderProcessReturn;", "Lcom/paypal/oslo/feature/smartroute/utils/SourceState;", "sourceState", "<init>", "(Lcom/paypal/oslo/feature/smartroute/utils/SourceState;)V", "component1", "()Lcom/paypal/oslo/feature/smartroute/utils/SourceState;", "copy", "(Lcom/paypal/oslo/feature/smartroute/utils/SourceState;)Lcom/paypal/oslo/feature/smartroute/utils/SliderProcessReturn$Success;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lcom/paypal/oslo/feature/smartroute/utils/SourceState;", "getSourceState"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class Success extends com.paypal.oslo.feature.smartroute.utils.SliderProcessReturn {
        public static final int $stable = 0;
        private final com.paypal.oslo.feature.smartroute.utils.SourceState sourceState;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Success(com.paypal.oslo.feature.smartroute.utils.SourceState sourceState) {
            super(null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(sourceState, "");
            this.sourceState = sourceState;
        }

        public final com.paypal.oslo.feature.smartroute.utils.SourceState getSourceState() {
            return this.sourceState;
        }

        public final java.lang.String toString() {
            com.paypal.oslo.feature.smartroute.utils.SourceState sourceState = this.sourceState;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Success(sourceState=");
            sb.append(sourceState);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return this.sourceState.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof com.paypal.oslo.feature.smartroute.utils.SliderProcessReturn.Success) && kotlin.jvm.internal.Intrinsics.areEqual(this.sourceState, ((com.paypal.oslo.feature.smartroute.utils.SliderProcessReturn.Success) other).sourceState);
        }

        public final com.paypal.oslo.feature.smartroute.utils.SliderProcessReturn.Success copy(com.paypal.oslo.feature.smartroute.utils.SourceState sourceState) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(sourceState, "");
            return new com.paypal.oslo.feature.smartroute.utils.SliderProcessReturn.Success(sourceState);
        }

        /* renamed from: component1, reason: from getter */
        public final com.paypal.oslo.feature.smartroute.utils.SourceState getSourceState() {
            return this.sourceState;
        }

        public static /* synthetic */ com.paypal.oslo.feature.smartroute.utils.SliderProcessReturn.Success copy$default(com.paypal.oslo.feature.smartroute.utils.SliderProcessReturn.Success success, com.paypal.oslo.feature.smartroute.utils.SourceState sourceState, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                sourceState = success.sourceState;
            }
            return success.copy(sourceState);
        }
    }

    public /* synthetic */ SliderProcessReturn(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }
}
