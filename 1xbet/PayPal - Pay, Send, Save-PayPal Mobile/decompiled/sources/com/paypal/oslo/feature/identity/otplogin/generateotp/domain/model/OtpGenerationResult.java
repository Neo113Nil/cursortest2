package com.paypal.oslo.feature.identity.otplogin.generateotp.domain.model;

@kotlin.Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\b0\u0018\u00002\u00020\u0001:\u0001\u0004B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0001\u0005"}, d2 = {"Lcom/paypal/oslo/feature/identity/otplogin/generateotp/domain/model/OtpGenerationResult;", "", "<init>", "()V", "Success", "Lcom/paypal/oslo/feature/identity/otplogin/generateotp/domain/model/OtpGenerationResult$Success;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes12.dex */
public abstract class OtpGenerationResult {
    public static final int $stable = 0;

    private OtpGenerationResult() {
    }

    @kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\u0007\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\t\u0010\bJ$\u0010\n\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0014\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0014\u0010\bR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0015\u001a\u0004\b\u0016\u0010\bR\u001a\u0010\u0004\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0015\u001a\u0004\b\u0017\u0010\b"}, d2 = {"Lcom/paypal/oslo/feature/identity/otplogin/generateotp/domain/model/OtpGenerationResult$Success;", "Lcom/paypal/oslo/feature/identity/otplogin/generateotp/domain/model/OtpGenerationResult;", "", "status", "nonce", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "component2", "copy", "(Ljava/lang/String;Ljava/lang/String;)Lcom/paypal/oslo/feature/identity/otplogin/generateotp/domain/model/OtpGenerationResult$Success;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getStatus", "getNonce"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class Success extends com.paypal.oslo.feature.identity.otplogin.generateotp.domain.model.OtpGenerationResult {
        public static final int $stable = 0;
        private final java.lang.String nonce;
        private final java.lang.String status;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Success(java.lang.String str, java.lang.String str2) {
            super(null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str2, "");
            this.status = str;
            this.nonce = str2;
        }

        public final java.lang.String getStatus() {
            return this.status;
        }

        public final java.lang.String getNonce() {
            return this.nonce;
        }

        public final java.lang.String toString() {
            java.lang.String str = this.status;
            java.lang.String str2 = this.nonce;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Success(status=");
            sb.append(str);
            sb.append(", nonce=");
            sb.append(str2);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return (this.status.hashCode() * 31) + this.nonce.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.identity.otplogin.generateotp.domain.model.OtpGenerationResult.Success)) {
                return false;
            }
            com.paypal.oslo.feature.identity.otplogin.generateotp.domain.model.OtpGenerationResult.Success success = (com.paypal.oslo.feature.identity.otplogin.generateotp.domain.model.OtpGenerationResult.Success) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.status, success.status) && kotlin.jvm.internal.Intrinsics.areEqual(this.nonce, success.nonce);
        }

        public final com.paypal.oslo.feature.identity.otplogin.generateotp.domain.model.OtpGenerationResult.Success copy(java.lang.String status, java.lang.String nonce) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(status, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(nonce, "");
            return new com.paypal.oslo.feature.identity.otplogin.generateotp.domain.model.OtpGenerationResult.Success(status, nonce);
        }

        /* renamed from: component2, reason: from getter */
        public final java.lang.String getNonce() {
            return this.nonce;
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.String getStatus() {
            return this.status;
        }

        public static /* synthetic */ com.paypal.oslo.feature.identity.otplogin.generateotp.domain.model.OtpGenerationResult.Success copy$default(com.paypal.oslo.feature.identity.otplogin.generateotp.domain.model.OtpGenerationResult.Success success, java.lang.String str, java.lang.String str2, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = success.status;
            }
            if ((i & 2) != 0) {
                str2 = success.nonce;
            }
            return success.copy(str, str2);
        }
    }

    public /* synthetic */ OtpGenerationResult(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }
}
