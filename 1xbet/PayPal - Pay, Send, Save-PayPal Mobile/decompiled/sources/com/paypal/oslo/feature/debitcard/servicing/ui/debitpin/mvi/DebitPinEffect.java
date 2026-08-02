package com.paypal.oslo.feature.debitcard.servicing.ui.debitpin.mvi;

@kotlin.Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\b0\u0018\u00002\u00020\u0001:\u0004\n\u000b\f\rB\u0011\b\u0004\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u001a\u0010\u0006\u001a\u00020\u00028\u0017X\u0097\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\t\u0082\u0001\u0004\u000e\u000f\u0010\u0011"}, d2 = {"Lcom/paypal/oslo/feature/debitcard/servicing/ui/debitpin/mvi/DebitPinEffect;", "Lcom/paypal/oslo/core/mvi/UiEffect;", "", "p0", "<init>", "(Ljava/lang/String;)V", "name", "Ljava/lang/String;", "getName", "()Ljava/lang/String;", "NavigateBack", "NavigateBackWithSuccess", "ShowError", "FocusConfirmPinField", "Lcom/paypal/oslo/feature/debitcard/servicing/ui/debitpin/mvi/DebitPinEffect$FocusConfirmPinField;", "Lcom/paypal/oslo/feature/debitcard/servicing/ui/debitpin/mvi/DebitPinEffect$NavigateBack;", "Lcom/paypal/oslo/feature/debitcard/servicing/ui/debitpin/mvi/DebitPinEffect$NavigateBackWithSuccess;", "Lcom/paypal/oslo/feature/debitcard/servicing/ui/debitpin/mvi/DebitPinEffect$ShowError;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes12.dex */
public abstract class DebitPinEffect implements com.paypal.oslo.core.mvi.UiEffect {
    public static final int $stable = 0;
    private final java.lang.String name;

    private DebitPinEffect(java.lang.String str) {
        this.name = str;
    }

    @Override // com.paypal.oslo.core.mvi.UiEffect
    public java.lang.String getName() {
        return this.name;
    }

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/debitcard/servicing/ui/debitpin/mvi/DebitPinEffect$NavigateBack;", "Lcom/paypal/oslo/feature/debitcard/servicing/ui/debitpin/mvi/DebitPinEffect;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class NavigateBack extends com.paypal.oslo.feature.debitcard.servicing.ui.debitpin.mvi.DebitPinEffect {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.debitcard.servicing.ui.debitpin.mvi.DebitPinEffect.NavigateBack INSTANCE = new com.paypal.oslo.feature.debitcard.servicing.ui.debitpin.mvi.DebitPinEffect.NavigateBack();

        public final int hashCode() {
            return -1380539596;
        }

        private NavigateBack() {
            super("NavigateBack", null);
        }

        public final java.lang.String toString() {
            return "NavigateBack";
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.debitcard.servicing.ui.debitpin.mvi.DebitPinEffect.NavigateBack)) {
                return false;
            }
            return true;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/debitcard/servicing/ui/debitpin/mvi/DebitPinEffect$NavigateBackWithSuccess;", "Lcom/paypal/oslo/feature/debitcard/servicing/ui/debitpin/mvi/DebitPinEffect;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class NavigateBackWithSuccess extends com.paypal.oslo.feature.debitcard.servicing.ui.debitpin.mvi.DebitPinEffect {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.debitcard.servicing.ui.debitpin.mvi.DebitPinEffect.NavigateBackWithSuccess INSTANCE = new com.paypal.oslo.feature.debitcard.servicing.ui.debitpin.mvi.DebitPinEffect.NavigateBackWithSuccess();

        public final int hashCode() {
            return -1825728375;
        }

        private NavigateBackWithSuccess() {
            super("NavigateBackWithSuccess", null);
        }

        public final java.lang.String toString() {
            return "NavigateBackWithSuccess";
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.debitcard.servicing.ui.debitpin.mvi.DebitPinEffect.NavigateBackWithSuccess)) {
                return false;
            }
            return true;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\u0007\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\t\u0010\bJ$\u0010\n\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0014\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0014\u0010\bR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0015\u001a\u0004\b\u0016\u0010\bR\u001a\u0010\u0004\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0015\u001a\u0004\b\u0017\u0010\b"}, d2 = {"Lcom/paypal/oslo/feature/debitcard/servicing/ui/debitpin/mvi/DebitPinEffect$ShowError;", "Lcom/paypal/oslo/feature/debitcard/servicing/ui/debitpin/mvi/DebitPinEffect;", "", "title", "message", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "component2", "copy", "(Ljava/lang/String;Ljava/lang/String;)Lcom/paypal/oslo/feature/debitcard/servicing/ui/debitpin/mvi/DebitPinEffect$ShowError;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getTitle", "getMessage"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class ShowError extends com.paypal.oslo.feature.debitcard.servicing.ui.debitpin.mvi.DebitPinEffect {
        public static final int $stable = 0;
        private final java.lang.String message;
        private final java.lang.String title;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ShowError(java.lang.String str, java.lang.String str2) {
            super("ShowError", null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str2, "");
            this.title = str;
            this.message = str2;
        }

        public final java.lang.String getTitle() {
            return this.title;
        }

        public final java.lang.String getMessage() {
            return this.message;
        }

        public final java.lang.String toString() {
            java.lang.String str = this.title;
            java.lang.String str2 = this.message;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("ShowError(title=");
            sb.append(str);
            sb.append(", message=");
            sb.append(str2);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return (this.title.hashCode() * 31) + this.message.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.debitcard.servicing.ui.debitpin.mvi.DebitPinEffect.ShowError)) {
                return false;
            }
            com.paypal.oslo.feature.debitcard.servicing.ui.debitpin.mvi.DebitPinEffect.ShowError showError = (com.paypal.oslo.feature.debitcard.servicing.ui.debitpin.mvi.DebitPinEffect.ShowError) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.title, showError.title) && kotlin.jvm.internal.Intrinsics.areEqual(this.message, showError.message);
        }

        public final com.paypal.oslo.feature.debitcard.servicing.ui.debitpin.mvi.DebitPinEffect.ShowError copy(java.lang.String title, java.lang.String message) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(title, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(message, "");
            return new com.paypal.oslo.feature.debitcard.servicing.ui.debitpin.mvi.DebitPinEffect.ShowError(title, message);
        }

        /* renamed from: component2, reason: from getter */
        public final java.lang.String getMessage() {
            return this.message;
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.String getTitle() {
            return this.title;
        }

        public static /* synthetic */ com.paypal.oslo.feature.debitcard.servicing.ui.debitpin.mvi.DebitPinEffect.ShowError copy$default(com.paypal.oslo.feature.debitcard.servicing.ui.debitpin.mvi.DebitPinEffect.ShowError showError, java.lang.String str, java.lang.String str2, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = showError.title;
            }
            if ((i & 2) != 0) {
                str2 = showError.message;
            }
            return showError.copy(str, str2);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/debitcard/servicing/ui/debitpin/mvi/DebitPinEffect$FocusConfirmPinField;", "Lcom/paypal/oslo/feature/debitcard/servicing/ui/debitpin/mvi/DebitPinEffect;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class FocusConfirmPinField extends com.paypal.oslo.feature.debitcard.servicing.ui.debitpin.mvi.DebitPinEffect {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.debitcard.servicing.ui.debitpin.mvi.DebitPinEffect.FocusConfirmPinField INSTANCE = new com.paypal.oslo.feature.debitcard.servicing.ui.debitpin.mvi.DebitPinEffect.FocusConfirmPinField();

        public final int hashCode() {
            return -1650843511;
        }

        private FocusConfirmPinField() {
            super("FocusConfirmPinField", null);
        }

        public final java.lang.String toString() {
            return "FocusConfirmPinField";
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.debitcard.servicing.ui.debitpin.mvi.DebitPinEffect.FocusConfirmPinField)) {
                return false;
            }
            return true;
        }
    }

    public /* synthetic */ DebitPinEffect(java.lang.String str, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(str);
    }
}
