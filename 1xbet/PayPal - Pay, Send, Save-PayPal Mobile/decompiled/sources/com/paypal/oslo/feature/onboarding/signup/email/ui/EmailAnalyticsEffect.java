package com.paypal.oslo.feature.onboarding.signup.email.ui;

@kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\bp\u0018\u00002\u00020\u0001:\u0002\u0006\u0007R\u0016\u0010\u0005\u001a\u0004\u0018\u00010\u00028'X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\u0082\u0001\u0002\b\tÀ\u0006\u0003"}, d2 = {"Lcom/paypal/oslo/feature/onboarding/signup/email/ui/EmailAnalyticsEffect;", "", "Lcom/paypal/oslo/core/commonui/utils/RefText;", "getDescription", "()Lcom/paypal/oslo/core/commonui/utils/RefText;", com.paypal.oslo.feature.inappcheckout.domain.util.LoggerParameterKeys.DESCRIPTION, "FieldError", "PageError", "Lcom/paypal/oslo/feature/onboarding/signup/email/ui/EmailAnalyticsEffect$FieldError;", "Lcom/paypal/oslo/feature/onboarding/signup/email/ui/EmailAnalyticsEffect$PageError;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes13.dex */
public interface EmailAnalyticsEffect {
    com.paypal.oslo.core.commonui.utils.RefText getDescription();

    @kotlin.Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\b\u0086\b\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0012\u0010\n\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ&\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0016\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0016\u0010\tR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0017\u001a\u0004\b\u0018\u0010\tR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0017X\u0097\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0019\u001a\u0004\b\u001a\u0010\u000b"}, d2 = {"Lcom/paypal/oslo/feature/onboarding/signup/email/ui/EmailAnalyticsEffect$FieldError;", "Lcom/paypal/oslo/feature/onboarding/signup/email/ui/EmailAnalyticsEffect;", "", "errorCode", "Lcom/paypal/oslo/core/commonui/utils/RefText;", com.paypal.oslo.feature.inappcheckout.domain.util.LoggerParameterKeys.DESCRIPTION, "<init>", "(Ljava/lang/String;Lcom/paypal/oslo/core/commonui/utils/RefText;)V", "component1", "()Ljava/lang/String;", "component2", "()Lcom/paypal/oslo/core/commonui/utils/RefText;", "copy", "(Ljava/lang/String;Lcom/paypal/oslo/core/commonui/utils/RefText;)Lcom/paypal/oslo/feature/onboarding/signup/email/ui/EmailAnalyticsEffect$FieldError;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getErrorCode", "Lcom/paypal/oslo/core/commonui/utils/RefText;", "getDescription"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class FieldError implements com.paypal.oslo.feature.onboarding.signup.email.ui.EmailAnalyticsEffect {
        public static final int $stable = com.paypal.oslo.core.commonui.utils.RefText.$stable;
        private final com.paypal.oslo.core.commonui.utils.RefText description;
        private final java.lang.String errorCode;

        public FieldError(java.lang.String str, com.paypal.oslo.core.commonui.utils.RefText refText) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            this.errorCode = str;
            this.description = refText;
        }

        @Override // com.paypal.oslo.feature.onboarding.signup.email.ui.EmailAnalyticsEffect
        public final com.paypal.oslo.core.commonui.utils.RefText getDescription() {
            return this.description;
        }

        public final java.lang.String getErrorCode() {
            return this.errorCode;
        }

        public final java.lang.String toString() {
            java.lang.String str = this.errorCode;
            com.paypal.oslo.core.commonui.utils.RefText refText = this.description;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("FieldError(errorCode=");
            sb.append(str);
            sb.append(", description=");
            sb.append(refText);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            int hashCode = this.errorCode.hashCode();
            com.paypal.oslo.core.commonui.utils.RefText refText = this.description;
            return (hashCode * 31) + (refText == null ? 0 : refText.hashCode());
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.onboarding.signup.email.ui.EmailAnalyticsEffect.FieldError)) {
                return false;
            }
            com.paypal.oslo.feature.onboarding.signup.email.ui.EmailAnalyticsEffect.FieldError fieldError = (com.paypal.oslo.feature.onboarding.signup.email.ui.EmailAnalyticsEffect.FieldError) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.errorCode, fieldError.errorCode) && kotlin.jvm.internal.Intrinsics.areEqual(this.description, fieldError.description);
        }

        public final com.paypal.oslo.feature.onboarding.signup.email.ui.EmailAnalyticsEffect.FieldError copy(java.lang.String errorCode, com.paypal.oslo.core.commonui.utils.RefText description) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(errorCode, "");
            return new com.paypal.oslo.feature.onboarding.signup.email.ui.EmailAnalyticsEffect.FieldError(errorCode, description);
        }

        /* renamed from: component2, reason: from getter */
        public final com.paypal.oslo.core.commonui.utils.RefText getDescription() {
            return this.description;
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.String getErrorCode() {
            return this.errorCode;
        }

        public static /* synthetic */ com.paypal.oslo.feature.onboarding.signup.email.ui.EmailAnalyticsEffect.FieldError copy$default(com.paypal.oslo.feature.onboarding.signup.email.ui.EmailAnalyticsEffect.FieldError fieldError, java.lang.String str, com.paypal.oslo.core.commonui.utils.RefText refText, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = fieldError.errorCode;
            }
            if ((i & 2) != 0) {
                refText = fieldError.description;
            }
            return fieldError.copy(str, refText);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\b\u0086\b\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0012\u0010\n\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ&\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0016\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0016\u0010\tR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0017\u001a\u0004\b\u0018\u0010\tR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0017X\u0097\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0019\u001a\u0004\b\u001a\u0010\u000b"}, d2 = {"Lcom/paypal/oslo/feature/onboarding/signup/email/ui/EmailAnalyticsEffect$PageError;", "Lcom/paypal/oslo/feature/onboarding/signup/email/ui/EmailAnalyticsEffect;", "", "errorCode", "Lcom/paypal/oslo/core/commonui/utils/RefText;", com.paypal.oslo.feature.inappcheckout.domain.util.LoggerParameterKeys.DESCRIPTION, "<init>", "(Ljava/lang/String;Lcom/paypal/oslo/core/commonui/utils/RefText;)V", "component1", "()Ljava/lang/String;", "component2", "()Lcom/paypal/oslo/core/commonui/utils/RefText;", "copy", "(Ljava/lang/String;Lcom/paypal/oslo/core/commonui/utils/RefText;)Lcom/paypal/oslo/feature/onboarding/signup/email/ui/EmailAnalyticsEffect$PageError;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getErrorCode", "Lcom/paypal/oslo/core/commonui/utils/RefText;", "getDescription"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class PageError implements com.paypal.oslo.feature.onboarding.signup.email.ui.EmailAnalyticsEffect {
        public static final int $stable = com.paypal.oslo.core.commonui.utils.RefText.$stable;
        private final com.paypal.oslo.core.commonui.utils.RefText description;
        private final java.lang.String errorCode;

        public PageError(java.lang.String str, com.paypal.oslo.core.commonui.utils.RefText refText) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            this.errorCode = str;
            this.description = refText;
        }

        @Override // com.paypal.oslo.feature.onboarding.signup.email.ui.EmailAnalyticsEffect
        public final com.paypal.oslo.core.commonui.utils.RefText getDescription() {
            return this.description;
        }

        public final java.lang.String getErrorCode() {
            return this.errorCode;
        }

        public final java.lang.String toString() {
            java.lang.String str = this.errorCode;
            com.paypal.oslo.core.commonui.utils.RefText refText = this.description;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("PageError(errorCode=");
            sb.append(str);
            sb.append(", description=");
            sb.append(refText);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            int hashCode = this.errorCode.hashCode();
            com.paypal.oslo.core.commonui.utils.RefText refText = this.description;
            return (hashCode * 31) + (refText == null ? 0 : refText.hashCode());
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.onboarding.signup.email.ui.EmailAnalyticsEffect.PageError)) {
                return false;
            }
            com.paypal.oslo.feature.onboarding.signup.email.ui.EmailAnalyticsEffect.PageError pageError = (com.paypal.oslo.feature.onboarding.signup.email.ui.EmailAnalyticsEffect.PageError) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.errorCode, pageError.errorCode) && kotlin.jvm.internal.Intrinsics.areEqual(this.description, pageError.description);
        }

        public final com.paypal.oslo.feature.onboarding.signup.email.ui.EmailAnalyticsEffect.PageError copy(java.lang.String errorCode, com.paypal.oslo.core.commonui.utils.RefText description) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(errorCode, "");
            return new com.paypal.oslo.feature.onboarding.signup.email.ui.EmailAnalyticsEffect.PageError(errorCode, description);
        }

        /* renamed from: component2, reason: from getter */
        public final com.paypal.oslo.core.commonui.utils.RefText getDescription() {
            return this.description;
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.String getErrorCode() {
            return this.errorCode;
        }

        public static /* synthetic */ com.paypal.oslo.feature.onboarding.signup.email.ui.EmailAnalyticsEffect.PageError copy$default(com.paypal.oslo.feature.onboarding.signup.email.ui.EmailAnalyticsEffect.PageError pageError, java.lang.String str, com.paypal.oslo.core.commonui.utils.RefText refText, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = pageError.errorCode;
            }
            if ((i & 2) != 0) {
                refText = pageError.description;
            }
            return pageError.copy(str, refText);
        }
    }
}
