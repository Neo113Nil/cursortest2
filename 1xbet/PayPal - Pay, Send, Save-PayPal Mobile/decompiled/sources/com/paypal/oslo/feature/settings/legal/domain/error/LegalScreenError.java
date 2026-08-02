package com.paypal.oslo.feature.settings.legal.domain.error;

@kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\b6\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0002\u0006\u0007"}, d2 = {"Lcom/paypal/oslo/feature/settings/legal/domain/error/LegalScreenError;", "", "<init>", "()V", "GenericError", "LegalLinkStringNotFound", "Lcom/paypal/oslo/feature/settings/legal/domain/error/LegalScreenError$GenericError;", "Lcom/paypal/oslo/feature/settings/legal/domain/error/LegalScreenError$LegalLinkStringNotFound;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes14.dex */
public abstract class LegalScreenError {
    public static final int $stable = 0;

    @kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/paypal/oslo/feature/settings/legal/domain/error/LegalScreenError$GenericError;", "Lcom/paypal/oslo/feature/settings/legal/domain/error/LegalScreenError;", "<init>", "()V"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class GenericError extends com.paypal.oslo.feature.settings.legal.domain.error.LegalScreenError {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.settings.legal.domain.error.LegalScreenError.GenericError INSTANCE = new com.paypal.oslo.feature.settings.legal.domain.error.LegalScreenError.GenericError();

        private GenericError() {
            super(null);
        }
    }

    private LegalScreenError() {
    }

    @kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0007R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0013\u001a\u0004\b\u0014\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/settings/legal/domain/error/LegalScreenError$LegalLinkStringNotFound;", "Lcom/paypal/oslo/feature/settings/legal/domain/error/LegalScreenError;", "", "message", "<init>", "(Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "copy", "(Ljava/lang/String;)Lcom/paypal/oslo/feature/settings/legal/domain/error/LegalScreenError$LegalLinkStringNotFound;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getMessage"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class LegalLinkStringNotFound extends com.paypal.oslo.feature.settings.legal.domain.error.LegalScreenError {
        public static final int $stable = 0;
        private final java.lang.String message;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public LegalLinkStringNotFound(java.lang.String str) {
            super(null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            this.message = str;
        }

        public final java.lang.String getMessage() {
            return this.message;
        }

        public final java.lang.String toString() {
            java.lang.String str = this.message;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("LegalLinkStringNotFound(message=");
            sb.append(str);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return this.message.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof com.paypal.oslo.feature.settings.legal.domain.error.LegalScreenError.LegalLinkStringNotFound) && kotlin.jvm.internal.Intrinsics.areEqual(this.message, ((com.paypal.oslo.feature.settings.legal.domain.error.LegalScreenError.LegalLinkStringNotFound) other).message);
        }

        public final com.paypal.oslo.feature.settings.legal.domain.error.LegalScreenError.LegalLinkStringNotFound copy(java.lang.String message) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(message, "");
            return new com.paypal.oslo.feature.settings.legal.domain.error.LegalScreenError.LegalLinkStringNotFound(message);
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.String getMessage() {
            return this.message;
        }

        public static /* synthetic */ com.paypal.oslo.feature.settings.legal.domain.error.LegalScreenError.LegalLinkStringNotFound copy$default(com.paypal.oslo.feature.settings.legal.domain.error.LegalScreenError.LegalLinkStringNotFound legalLinkStringNotFound, java.lang.String str, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = legalLinkStringNotFound.message;
            }
            return legalLinkStringNotFound.copy(str);
        }
    }

    public /* synthetic */ LegalScreenError(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }
}
