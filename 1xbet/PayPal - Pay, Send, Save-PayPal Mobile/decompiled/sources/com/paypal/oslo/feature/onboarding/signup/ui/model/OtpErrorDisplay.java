package com.paypal.oslo.feature.onboarding.signup.ui.model;

@kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\bv\u0018\u00002\u00020\u0001:\u0002\u0006\u0007R\u0014\u0010\u0005\u001a\u00020\u00028'X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\u0082\u0001\u0002\b\tÀ\u0006\u0003"}, d2 = {"Lcom/paypal/oslo/feature/onboarding/signup/ui/model/OtpErrorDisplay;", "", "", "getErrorCode", "()Ljava/lang/String;", "errorCode", "FieldLevel", "PageLevel", "Lcom/paypal/oslo/feature/onboarding/signup/ui/model/OtpErrorDisplay$FieldLevel;", "Lcom/paypal/oslo/feature/onboarding/signup/ui/model/OtpErrorDisplay$PageLevel;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes13.dex */
public interface OtpErrorDisplay {
    java.lang.String getErrorCode();

    @kotlin.Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ$\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0016\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u000bR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0017\u001a\u0004\b\u0018\u0010\tR\u001a\u0010\u0005\u001a\u00020\u00048\u0017X\u0097\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0019\u001a\u0004\b\u001a\u0010\u000b"}, d2 = {"Lcom/paypal/oslo/feature/onboarding/signup/ui/model/OtpErrorDisplay$FieldLevel;", "Lcom/paypal/oslo/feature/onboarding/signup/ui/model/OtpErrorDisplay;", "Lcom/paypal/oslo/core/commonui/utils/RefText;", "message", "", "errorCode", "<init>", "(Lcom/paypal/oslo/core/commonui/utils/RefText;Ljava/lang/String;)V", "component1", "()Lcom/paypal/oslo/core/commonui/utils/RefText;", "component2", "()Ljava/lang/String;", "copy", "(Lcom/paypal/oslo/core/commonui/utils/RefText;Ljava/lang/String;)Lcom/paypal/oslo/feature/onboarding/signup/ui/model/OtpErrorDisplay$FieldLevel;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Lcom/paypal/oslo/core/commonui/utils/RefText;", "getMessage", "Ljava/lang/String;", "getErrorCode"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class FieldLevel implements com.paypal.oslo.feature.onboarding.signup.ui.model.OtpErrorDisplay {
        public static final int $stable = com.paypal.oslo.core.commonui.utils.RefText.$stable;
        private final java.lang.String errorCode;
        private final com.paypal.oslo.core.commonui.utils.RefText message;

        public FieldLevel(com.paypal.oslo.core.commonui.utils.RefText refText, java.lang.String str) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(refText, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            this.message = refText;
            this.errorCode = str;
        }

        public final com.paypal.oslo.core.commonui.utils.RefText getMessage() {
            return this.message;
        }

        @Override // com.paypal.oslo.feature.onboarding.signup.ui.model.OtpErrorDisplay
        public final java.lang.String getErrorCode() {
            return this.errorCode;
        }

        public final java.lang.String toString() {
            com.paypal.oslo.core.commonui.utils.RefText refText = this.message;
            java.lang.String str = this.errorCode;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("FieldLevel(message=");
            sb.append(refText);
            sb.append(", errorCode=");
            sb.append(str);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return (this.message.hashCode() * 31) + this.errorCode.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.onboarding.signup.ui.model.OtpErrorDisplay.FieldLevel)) {
                return false;
            }
            com.paypal.oslo.feature.onboarding.signup.ui.model.OtpErrorDisplay.FieldLevel fieldLevel = (com.paypal.oslo.feature.onboarding.signup.ui.model.OtpErrorDisplay.FieldLevel) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.message, fieldLevel.message) && kotlin.jvm.internal.Intrinsics.areEqual(this.errorCode, fieldLevel.errorCode);
        }

        public final com.paypal.oslo.feature.onboarding.signup.ui.model.OtpErrorDisplay.FieldLevel copy(com.paypal.oslo.core.commonui.utils.RefText message, java.lang.String errorCode) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(message, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(errorCode, "");
            return new com.paypal.oslo.feature.onboarding.signup.ui.model.OtpErrorDisplay.FieldLevel(message, errorCode);
        }

        /* renamed from: component2, reason: from getter */
        public final java.lang.String getErrorCode() {
            return this.errorCode;
        }

        /* renamed from: component1, reason: from getter */
        public final com.paypal.oslo.core.commonui.utils.RefText getMessage() {
            return this.message;
        }

        public static /* synthetic */ com.paypal.oslo.feature.onboarding.signup.ui.model.OtpErrorDisplay.FieldLevel copy$default(com.paypal.oslo.feature.onboarding.signup.ui.model.OtpErrorDisplay.FieldLevel fieldLevel, com.paypal.oslo.core.commonui.utils.RefText refText, java.lang.String str, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                refText = fieldLevel.message;
            }
            if ((i & 2) != 0) {
                str = fieldLevel.errorCode;
            }
            return fieldLevel.copy(refText, str);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\b\b\u0086\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000b\u0010\nJ\u0010\u0010\f\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b\f\u0010\rJ.\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u0005HÆ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0016\u001a\u00020\u0015HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0018\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\u0018\u0010\rR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0019\u001a\u0004\b\u001a\u0010\nR\u001a\u0010\u0004\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0019\u001a\u0004\b\u001b\u0010\nR\u001a\u0010\u0006\u001a\u00020\u00058\u0017X\u0097\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u001c\u001a\u0004\b\u001d\u0010\r"}, d2 = {"Lcom/paypal/oslo/feature/onboarding/signup/ui/model/OtpErrorDisplay$PageLevel;", "Lcom/paypal/oslo/feature/onboarding/signup/ui/model/OtpErrorDisplay;", "Lcom/paypal/oslo/core/commonui/utils/RefText;", "title", com.paypal.oslo.feature.inappcheckout.domain.util.LoggerParameterKeys.DESCRIPTION, "", "errorCode", "<init>", "(Lcom/paypal/oslo/core/commonui/utils/RefText;Lcom/paypal/oslo/core/commonui/utils/RefText;Ljava/lang/String;)V", "component1", "()Lcom/paypal/oslo/core/commonui/utils/RefText;", "component2", "component3", "()Ljava/lang/String;", "copy", "(Lcom/paypal/oslo/core/commonui/utils/RefText;Lcom/paypal/oslo/core/commonui/utils/RefText;Ljava/lang/String;)Lcom/paypal/oslo/feature/onboarding/signup/ui/model/OtpErrorDisplay$PageLevel;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Lcom/paypal/oslo/core/commonui/utils/RefText;", "getTitle", "getDescription", "Ljava/lang/String;", "getErrorCode"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class PageLevel implements com.paypal.oslo.feature.onboarding.signup.ui.model.OtpErrorDisplay {
        public static final int $stable;
        private final com.paypal.oslo.core.commonui.utils.RefText description;
        private final java.lang.String errorCode;
        private final com.paypal.oslo.core.commonui.utils.RefText title;

        public PageLevel(com.paypal.oslo.core.commonui.utils.RefText refText, com.paypal.oslo.core.commonui.utils.RefText refText2, java.lang.String str) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(refText, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(refText2, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            this.title = refText;
            this.description = refText2;
            this.errorCode = str;
        }

        public final com.paypal.oslo.core.commonui.utils.RefText getTitle() {
            return this.title;
        }

        public final com.paypal.oslo.core.commonui.utils.RefText getDescription() {
            return this.description;
        }

        @Override // com.paypal.oslo.feature.onboarding.signup.ui.model.OtpErrorDisplay
        public final java.lang.String getErrorCode() {
            return this.errorCode;
        }

        public final java.lang.String toString() {
            com.paypal.oslo.core.commonui.utils.RefText refText = this.title;
            com.paypal.oslo.core.commonui.utils.RefText refText2 = this.description;
            java.lang.String str = this.errorCode;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("PageLevel(title=");
            sb.append(refText);
            sb.append(", description=");
            sb.append(refText2);
            sb.append(", errorCode=");
            sb.append(str);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return (((this.title.hashCode() * 31) + this.description.hashCode()) * 31) + this.errorCode.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.onboarding.signup.ui.model.OtpErrorDisplay.PageLevel)) {
                return false;
            }
            com.paypal.oslo.feature.onboarding.signup.ui.model.OtpErrorDisplay.PageLevel pageLevel = (com.paypal.oslo.feature.onboarding.signup.ui.model.OtpErrorDisplay.PageLevel) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.title, pageLevel.title) && kotlin.jvm.internal.Intrinsics.areEqual(this.description, pageLevel.description) && kotlin.jvm.internal.Intrinsics.areEqual(this.errorCode, pageLevel.errorCode);
        }

        public final com.paypal.oslo.feature.onboarding.signup.ui.model.OtpErrorDisplay.PageLevel copy(com.paypal.oslo.core.commonui.utils.RefText title, com.paypal.oslo.core.commonui.utils.RefText description, java.lang.String errorCode) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(title, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(description, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(errorCode, "");
            return new com.paypal.oslo.feature.onboarding.signup.ui.model.OtpErrorDisplay.PageLevel(title, description, errorCode);
        }

        /* renamed from: component3, reason: from getter */
        public final java.lang.String getErrorCode() {
            return this.errorCode;
        }

        /* renamed from: component2, reason: from getter */
        public final com.paypal.oslo.core.commonui.utils.RefText getDescription() {
            return this.description;
        }

        /* renamed from: component1, reason: from getter */
        public final com.paypal.oslo.core.commonui.utils.RefText getTitle() {
            return this.title;
        }

        public static /* synthetic */ com.paypal.oslo.feature.onboarding.signup.ui.model.OtpErrorDisplay.PageLevel copy$default(com.paypal.oslo.feature.onboarding.signup.ui.model.OtpErrorDisplay.PageLevel pageLevel, com.paypal.oslo.core.commonui.utils.RefText refText, com.paypal.oslo.core.commonui.utils.RefText refText2, java.lang.String str, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                refText = pageLevel.title;
            }
            if ((i & 2) != 0) {
                refText2 = pageLevel.description;
            }
            if ((i & 4) != 0) {
                str = pageLevel.errorCode;
            }
            return pageLevel.copy(refText, refText2, str);
        }

        static {
            int i = com.paypal.oslo.core.commonui.utils.RefText.$stable;
            $stable = i | i;
        }
    }
}
