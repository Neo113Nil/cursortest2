package com.paypal.oslo.feature.debitcard.servicing.ui.taptopay.deactivate.mvi;

@kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\b0\u0018\u00002\u00020\u0001:\u0002\n\u000bB\u0011\b\u0004\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u001a\u0010\u0006\u001a\u00020\u00028\u0017X\u0096\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\t\u0082\u0001\u0002\f\r"}, d2 = {"Lcom/paypal/oslo/feature/debitcard/servicing/ui/taptopay/deactivate/mvi/DeactivateContactlessSheetEffect;", "Lcom/paypal/oslo/core/mvi/UiEffect;", "", "p0", "<init>", "(Ljava/lang/String;)V", "name", "Ljava/lang/String;", "getName", "()Ljava/lang/String;", "DismissSheet", "ShowDeactivationSuccessToast", "Lcom/paypal/oslo/feature/debitcard/servicing/ui/taptopay/deactivate/mvi/DeactivateContactlessSheetEffect$DismissSheet;", "Lcom/paypal/oslo/feature/debitcard/servicing/ui/taptopay/deactivate/mvi/DeactivateContactlessSheetEffect$ShowDeactivationSuccessToast;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes12.dex */
public abstract class DeactivateContactlessSheetEffect implements com.paypal.oslo.core.mvi.UiEffect {
    public static final int $stable = 0;
    private final java.lang.String name;

    private DeactivateContactlessSheetEffect(java.lang.String str) {
        this.name = str;
    }

    @Override // com.paypal.oslo.core.mvi.UiEffect
    public java.lang.String getName() {
        return this.name;
    }

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/debitcard/servicing/ui/taptopay/deactivate/mvi/DeactivateContactlessSheetEffect$DismissSheet;", "Lcom/paypal/oslo/feature/debitcard/servicing/ui/taptopay/deactivate/mvi/DeactivateContactlessSheetEffect;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class DismissSheet extends com.paypal.oslo.feature.debitcard.servicing.ui.taptopay.deactivate.mvi.DeactivateContactlessSheetEffect {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.debitcard.servicing.ui.taptopay.deactivate.mvi.DeactivateContactlessSheetEffect.DismissSheet INSTANCE = new com.paypal.oslo.feature.debitcard.servicing.ui.taptopay.deactivate.mvi.DeactivateContactlessSheetEffect.DismissSheet();

        public final int hashCode() {
            return -160140103;
        }

        private DismissSheet() {
            super("DismissSheet", null);
        }

        public final java.lang.String toString() {
            return "DismissSheet";
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.debitcard.servicing.ui.taptopay.deactivate.mvi.DeactivateContactlessSheetEffect.DismissSheet)) {
                return false;
            }
            return true;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/debitcard/servicing/ui/taptopay/deactivate/mvi/DeactivateContactlessSheetEffect$ShowDeactivationSuccessToast;", "Lcom/paypal/oslo/feature/debitcard/servicing/ui/taptopay/deactivate/mvi/DeactivateContactlessSheetEffect;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class ShowDeactivationSuccessToast extends com.paypal.oslo.feature.debitcard.servicing.ui.taptopay.deactivate.mvi.DeactivateContactlessSheetEffect {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.debitcard.servicing.ui.taptopay.deactivate.mvi.DeactivateContactlessSheetEffect.ShowDeactivationSuccessToast INSTANCE = new com.paypal.oslo.feature.debitcard.servicing.ui.taptopay.deactivate.mvi.DeactivateContactlessSheetEffect.ShowDeactivationSuccessToast();

        public final int hashCode() {
            return 849665468;
        }

        private ShowDeactivationSuccessToast() {
            super("ShowDeactivationSuccessToast", null);
        }

        public final java.lang.String toString() {
            return "ShowDeactivationSuccessToast";
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.debitcard.servicing.ui.taptopay.deactivate.mvi.DeactivateContactlessSheetEffect.ShowDeactivationSuccessToast)) {
                return false;
            }
            return true;
        }
    }

    public /* synthetic */ DeactivateContactlessSheetEffect(java.lang.String str, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(str);
    }
}
