package com.paypal.oslo.core.i18n.domain.model;

@kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\b6\u0018\u00002\u00020\u0001:\u0002\n\u000bB\u0011\b\u0004\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0017\u0010\u0006\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\t\u0082\u0001\u0002\f\r"}, d2 = {"Lcom/paypal/oslo/core/i18n/domain/model/AddressFormattingError;", "", "", "p0", "<init>", "(Ljava/lang/String;)V", com.paypal.oslo.feature.inappcheckout.domain.util.LoggerParameterKeys.DESCRIPTION, "Ljava/lang/String;", "getDescription", "()Ljava/lang/String;", "ParseError", "NoLayoutFound", "Lcom/paypal/oslo/core/i18n/domain/model/AddressFormattingError$NoLayoutFound;", "Lcom/paypal/oslo/core/i18n/domain/model/AddressFormattingError$ParseError;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes2.dex */
public abstract class AddressFormattingError {
    private final java.lang.String description;

    private AddressFormattingError(java.lang.String str) {
        this.description = str;
    }

    public final java.lang.String getDescription() {
        return this.description;
    }

    @kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0007R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0013\u001a\u0004\b\u0014\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/core/i18n/domain/model/AddressFormattingError$ParseError;", "Lcom/paypal/oslo/core/i18n/domain/model/AddressFormattingError;", "", "reason", "<init>", "(Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "copy", "(Ljava/lang/String;)Lcom/paypal/oslo/core/i18n/domain/model/AddressFormattingError$ParseError;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getReason"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes10.dex */
    public static final /* data */ class ParseError extends com.paypal.oslo.core.i18n.domain.model.AddressFormattingError {
        private final java.lang.String reason;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ParseError(java.lang.String str) {
            super(str, null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            this.reason = str;
        }

        public final java.lang.String getReason() {
            return this.reason;
        }

        public final java.lang.String toString() {
            java.lang.String str = this.reason;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("ParseError(reason=");
            sb.append(str);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return this.reason.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof com.paypal.oslo.core.i18n.domain.model.AddressFormattingError.ParseError) && kotlin.jvm.internal.Intrinsics.areEqual(this.reason, ((com.paypal.oslo.core.i18n.domain.model.AddressFormattingError.ParseError) other).reason);
        }

        public final com.paypal.oslo.core.i18n.domain.model.AddressFormattingError.ParseError copy(java.lang.String reason) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(reason, "");
            return new com.paypal.oslo.core.i18n.domain.model.AddressFormattingError.ParseError(reason);
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.String getReason() {
            return this.reason;
        }

        public static /* synthetic */ com.paypal.oslo.core.i18n.domain.model.AddressFormattingError.ParseError copy$default(com.paypal.oslo.core.i18n.domain.model.AddressFormattingError.ParseError parseError, java.lang.String str, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = parseError.reason;
            }
            return parseError.copy(str);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0007R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0013\u001a\u0004\b\u0014\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/core/i18n/domain/model/AddressFormattingError$NoLayoutFound;", "Lcom/paypal/oslo/core/i18n/domain/model/AddressFormattingError;", "", "reason", "<init>", "(Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "copy", "(Ljava/lang/String;)Lcom/paypal/oslo/core/i18n/domain/model/AddressFormattingError$NoLayoutFound;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getReason"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes10.dex */
    public static final /* data */ class NoLayoutFound extends com.paypal.oslo.core.i18n.domain.model.AddressFormattingError {
        private final java.lang.String reason;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public NoLayoutFound(java.lang.String str) {
            super(str, null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            this.reason = str;
        }

        public final java.lang.String getReason() {
            return this.reason;
        }

        public final java.lang.String toString() {
            java.lang.String str = this.reason;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("NoLayoutFound(reason=");
            sb.append(str);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return this.reason.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof com.paypal.oslo.core.i18n.domain.model.AddressFormattingError.NoLayoutFound) && kotlin.jvm.internal.Intrinsics.areEqual(this.reason, ((com.paypal.oslo.core.i18n.domain.model.AddressFormattingError.NoLayoutFound) other).reason);
        }

        public final com.paypal.oslo.core.i18n.domain.model.AddressFormattingError.NoLayoutFound copy(java.lang.String reason) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(reason, "");
            return new com.paypal.oslo.core.i18n.domain.model.AddressFormattingError.NoLayoutFound(reason);
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.String getReason() {
            return this.reason;
        }

        public static /* synthetic */ com.paypal.oslo.core.i18n.domain.model.AddressFormattingError.NoLayoutFound copy$default(com.paypal.oslo.core.i18n.domain.model.AddressFormattingError.NoLayoutFound noLayoutFound, java.lang.String str, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = noLayoutFound.reason;
            }
            return noLayoutFound.copy(str);
        }
    }

    public /* synthetic */ AddressFormattingError(java.lang.String str, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(str);
    }
}
