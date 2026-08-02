package com.paypal.oslo.core.i18n.domain.error;

@kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\b6\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0002\u0006\u0007"}, d2 = {"Lcom/paypal/oslo/core/i18n/domain/error/NumberFormatError;", "", "<init>", "()V", "LocaleResolutionError", "FormatError", "Lcom/paypal/oslo/core/i18n/domain/error/NumberFormatError$FormatError;", "Lcom/paypal/oslo/core/i18n/domain/error/NumberFormatError$LocaleResolutionError;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes10.dex */
public abstract class NumberFormatError {
    private NumberFormatError() {
    }

    @kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0007R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0013\u001a\u0004\b\u0014\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/core/i18n/domain/error/NumberFormatError$LocaleResolutionError;", "Lcom/paypal/oslo/core/i18n/domain/error/NumberFormatError;", "", com.paypal.oslo.feature.inappcheckout.domain.util.LoggerParameterKeys.DESCRIPTION, "<init>", "(Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "copy", "(Ljava/lang/String;)Lcom/paypal/oslo/core/i18n/domain/error/NumberFormatError$LocaleResolutionError;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getDescription"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class LocaleResolutionError extends com.paypal.oslo.core.i18n.domain.error.NumberFormatError {
        private final java.lang.String description;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public LocaleResolutionError(java.lang.String str) {
            super(null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            this.description = str;
        }

        public final java.lang.String getDescription() {
            return this.description;
        }

        public final java.lang.String toString() {
            java.lang.String str = this.description;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("LocaleResolutionError(description=");
            sb.append(str);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return this.description.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof com.paypal.oslo.core.i18n.domain.error.NumberFormatError.LocaleResolutionError) && kotlin.jvm.internal.Intrinsics.areEqual(this.description, ((com.paypal.oslo.core.i18n.domain.error.NumberFormatError.LocaleResolutionError) other).description);
        }

        public final com.paypal.oslo.core.i18n.domain.error.NumberFormatError.LocaleResolutionError copy(java.lang.String description) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(description, "");
            return new com.paypal.oslo.core.i18n.domain.error.NumberFormatError.LocaleResolutionError(description);
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.String getDescription() {
            return this.description;
        }

        public static /* synthetic */ com.paypal.oslo.core.i18n.domain.error.NumberFormatError.LocaleResolutionError copy$default(com.paypal.oslo.core.i18n.domain.error.NumberFormatError.LocaleResolutionError localeResolutionError, java.lang.String str, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = localeResolutionError.description;
            }
            return localeResolutionError.copy(str);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0007R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0013\u001a\u0004\b\u0014\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/core/i18n/domain/error/NumberFormatError$FormatError;", "Lcom/paypal/oslo/core/i18n/domain/error/NumberFormatError;", "", com.paypal.oslo.feature.inappcheckout.domain.util.LoggerParameterKeys.DESCRIPTION, "<init>", "(Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "copy", "(Ljava/lang/String;)Lcom/paypal/oslo/core/i18n/domain/error/NumberFormatError$FormatError;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getDescription"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class FormatError extends com.paypal.oslo.core.i18n.domain.error.NumberFormatError {
        private final java.lang.String description;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public FormatError(java.lang.String str) {
            super(null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            this.description = str;
        }

        public final java.lang.String getDescription() {
            return this.description;
        }

        public final java.lang.String toString() {
            java.lang.String str = this.description;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("FormatError(description=");
            sb.append(str);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return this.description.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof com.paypal.oslo.core.i18n.domain.error.NumberFormatError.FormatError) && kotlin.jvm.internal.Intrinsics.areEqual(this.description, ((com.paypal.oslo.core.i18n.domain.error.NumberFormatError.FormatError) other).description);
        }

        public final com.paypal.oslo.core.i18n.domain.error.NumberFormatError.FormatError copy(java.lang.String description) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(description, "");
            return new com.paypal.oslo.core.i18n.domain.error.NumberFormatError.FormatError(description);
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.String getDescription() {
            return this.description;
        }

        public static /* synthetic */ com.paypal.oslo.core.i18n.domain.error.NumberFormatError.FormatError copy$default(com.paypal.oslo.core.i18n.domain.error.NumberFormatError.FormatError formatError, java.lang.String str, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = formatError.description;
            }
            return formatError.copy(str);
        }
    }

    public /* synthetic */ NumberFormatError(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }
}
