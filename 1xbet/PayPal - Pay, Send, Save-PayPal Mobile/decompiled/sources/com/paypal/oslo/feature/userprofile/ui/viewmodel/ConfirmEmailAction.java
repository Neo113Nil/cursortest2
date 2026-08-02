package com.paypal.oslo.feature.userprofile.ui.viewmodel;

@kotlin.Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\bp\u0018\u00002\u00020\u0001:\u0006\u0002\u0003\u0004\u0005\u0006\u0007\u0082\u0001\u0006\b\t\n\u000b\f\rÀ\u0006\u0003"}, d2 = {"Lcom/paypal/oslo/feature/userprofile/ui/viewmodel/ConfirmEmailAction;", "", "OtpCodeChanged", "ConfirmEmail", "ResendCode", "ClearToastMessage", "BannerDismissed", "RetryInit", "Lcom/paypal/oslo/feature/userprofile/ui/viewmodel/ConfirmEmailAction$BannerDismissed;", "Lcom/paypal/oslo/feature/userprofile/ui/viewmodel/ConfirmEmailAction$ClearToastMessage;", "Lcom/paypal/oslo/feature/userprofile/ui/viewmodel/ConfirmEmailAction$ConfirmEmail;", "Lcom/paypal/oslo/feature/userprofile/ui/viewmodel/ConfirmEmailAction$OtpCodeChanged;", "Lcom/paypal/oslo/feature/userprofile/ui/viewmodel/ConfirmEmailAction$ResendCode;", "Lcom/paypal/oslo/feature/userprofile/ui/viewmodel/ConfirmEmailAction$RetryInit;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes15.dex */
public interface ConfirmEmailAction {

    @kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0007R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0013\u001a\u0004\b\u0014\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/userprofile/ui/viewmodel/ConfirmEmailAction$OtpCodeChanged;", "Lcom/paypal/oslo/feature/userprofile/ui/viewmodel/ConfirmEmailAction;", "", "code", "<init>", "(Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "copy", "(Ljava/lang/String;)Lcom/paypal/oslo/feature/userprofile/ui/viewmodel/ConfirmEmailAction$OtpCodeChanged;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getCode"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class OtpCodeChanged implements com.paypal.oslo.feature.userprofile.ui.viewmodel.ConfirmEmailAction {
        public static final int $stable = 0;
        private final java.lang.String code;

        public OtpCodeChanged(java.lang.String str) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            this.code = str;
        }

        public final java.lang.String getCode() {
            return this.code;
        }

        public final java.lang.String toString() {
            java.lang.String str = this.code;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("OtpCodeChanged(code=");
            sb.append(str);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return this.code.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof com.paypal.oslo.feature.userprofile.ui.viewmodel.ConfirmEmailAction.OtpCodeChanged) && kotlin.jvm.internal.Intrinsics.areEqual(this.code, ((com.paypal.oslo.feature.userprofile.ui.viewmodel.ConfirmEmailAction.OtpCodeChanged) other).code);
        }

        public final com.paypal.oslo.feature.userprofile.ui.viewmodel.ConfirmEmailAction.OtpCodeChanged copy(java.lang.String code) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(code, "");
            return new com.paypal.oslo.feature.userprofile.ui.viewmodel.ConfirmEmailAction.OtpCodeChanged(code);
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.String getCode() {
            return this.code;
        }

        public static /* synthetic */ com.paypal.oslo.feature.userprofile.ui.viewmodel.ConfirmEmailAction.OtpCodeChanged copy$default(com.paypal.oslo.feature.userprofile.ui.viewmodel.ConfirmEmailAction.OtpCodeChanged otpCodeChanged, java.lang.String str, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = otpCodeChanged.code;
            }
            return otpCodeChanged.copy(str);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/userprofile/ui/viewmodel/ConfirmEmailAction$ConfirmEmail;", "Lcom/paypal/oslo/feature/userprofile/ui/viewmodel/ConfirmEmailAction;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class ConfirmEmail implements com.paypal.oslo.feature.userprofile.ui.viewmodel.ConfirmEmailAction {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.userprofile.ui.viewmodel.ConfirmEmailAction.ConfirmEmail INSTANCE = new com.paypal.oslo.feature.userprofile.ui.viewmodel.ConfirmEmailAction.ConfirmEmail();

        public final int hashCode() {
            return 386445717;
        }

        private ConfirmEmail() {
        }

        public final java.lang.String toString() {
            return "ConfirmEmail";
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.userprofile.ui.viewmodel.ConfirmEmailAction.ConfirmEmail)) {
                return false;
            }
            return true;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/userprofile/ui/viewmodel/ConfirmEmailAction$ResendCode;", "Lcom/paypal/oslo/feature/userprofile/ui/viewmodel/ConfirmEmailAction;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class ResendCode implements com.paypal.oslo.feature.userprofile.ui.viewmodel.ConfirmEmailAction {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.userprofile.ui.viewmodel.ConfirmEmailAction.ResendCode INSTANCE = new com.paypal.oslo.feature.userprofile.ui.viewmodel.ConfirmEmailAction.ResendCode();

        public final int hashCode() {
            return 624721889;
        }

        private ResendCode() {
        }

        public final java.lang.String toString() {
            return "ResendCode";
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.userprofile.ui.viewmodel.ConfirmEmailAction.ResendCode)) {
                return false;
            }
            return true;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/userprofile/ui/viewmodel/ConfirmEmailAction$ClearToastMessage;", "Lcom/paypal/oslo/feature/userprofile/ui/viewmodel/ConfirmEmailAction;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class ClearToastMessage implements com.paypal.oslo.feature.userprofile.ui.viewmodel.ConfirmEmailAction {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.userprofile.ui.viewmodel.ConfirmEmailAction.ClearToastMessage INSTANCE = new com.paypal.oslo.feature.userprofile.ui.viewmodel.ConfirmEmailAction.ClearToastMessage();

        public final int hashCode() {
            return -1651166828;
        }

        private ClearToastMessage() {
        }

        public final java.lang.String toString() {
            return "ClearToastMessage";
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.userprofile.ui.viewmodel.ConfirmEmailAction.ClearToastMessage)) {
                return false;
            }
            return true;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/userprofile/ui/viewmodel/ConfirmEmailAction$BannerDismissed;", "Lcom/paypal/oslo/feature/userprofile/ui/viewmodel/ConfirmEmailAction;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class BannerDismissed implements com.paypal.oslo.feature.userprofile.ui.viewmodel.ConfirmEmailAction {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.userprofile.ui.viewmodel.ConfirmEmailAction.BannerDismissed INSTANCE = new com.paypal.oslo.feature.userprofile.ui.viewmodel.ConfirmEmailAction.BannerDismissed();

        public final int hashCode() {
            return -515352732;
        }

        private BannerDismissed() {
        }

        public final java.lang.String toString() {
            return "BannerDismissed";
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.userprofile.ui.viewmodel.ConfirmEmailAction.BannerDismissed)) {
                return false;
            }
            return true;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/userprofile/ui/viewmodel/ConfirmEmailAction$RetryInit;", "Lcom/paypal/oslo/feature/userprofile/ui/viewmodel/ConfirmEmailAction;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class RetryInit implements com.paypal.oslo.feature.userprofile.ui.viewmodel.ConfirmEmailAction {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.userprofile.ui.viewmodel.ConfirmEmailAction.RetryInit INSTANCE = new com.paypal.oslo.feature.userprofile.ui.viewmodel.ConfirmEmailAction.RetryInit();

        public final int hashCode() {
            return 1566325151;
        }

        private RetryInit() {
        }

        public final java.lang.String toString() {
            return "RetryInit";
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.userprofile.ui.viewmodel.ConfirmEmailAction.RetryInit)) {
                return false;
            }
            return true;
        }
    }
}
