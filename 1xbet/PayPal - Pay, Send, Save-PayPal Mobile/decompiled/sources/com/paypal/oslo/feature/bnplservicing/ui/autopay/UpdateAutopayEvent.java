package com.paypal.oslo.feature.bnplservicing.ui.autopay;

@kotlin.Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\b6\u0018\u00002\u00020\u0001:\u0007\n\u000b\f\r\u000e\u000f\u0010B\u0011\b\u0004\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u001a\u0010\u0006\u001a\u00020\u00028\u0017X\u0096\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\t\u0082\u0001\u0007\u0011\u0012\u0013\u0014\u0015\u0016\u0017"}, d2 = {"Lcom/paypal/oslo/feature/bnplservicing/ui/autopay/UpdateAutopayEvent;", "Lcom/paypal/oslo/core/mvi/Event;", "", "p0", "<init>", "(Ljava/lang/String;)V", "name", "Ljava/lang/String;", "getName", "()Ljava/lang/String;", "OnLoadDefaultData", "OnClose", "OnConfirmClicked", "OnSuccessMessageDismissed", "AutopayStatusUpdated", "OnError", "OnReset", "Lcom/paypal/oslo/feature/bnplservicing/ui/autopay/UpdateAutopayEvent$AutopayStatusUpdated;", "Lcom/paypal/oslo/feature/bnplservicing/ui/autopay/UpdateAutopayEvent$OnClose;", "Lcom/paypal/oslo/feature/bnplservicing/ui/autopay/UpdateAutopayEvent$OnConfirmClicked;", "Lcom/paypal/oslo/feature/bnplservicing/ui/autopay/UpdateAutopayEvent$OnError;", "Lcom/paypal/oslo/feature/bnplservicing/ui/autopay/UpdateAutopayEvent$OnLoadDefaultData;", "Lcom/paypal/oslo/feature/bnplservicing/ui/autopay/UpdateAutopayEvent$OnReset;", "Lcom/paypal/oslo/feature/bnplservicing/ui/autopay/UpdateAutopayEvent$OnSuccessMessageDismissed;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes11.dex */
public abstract class UpdateAutopayEvent implements com.paypal.oslo.core.mvi.Event {
    public static final int $stable = 0;
    private final java.lang.String name;

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/bnplservicing/ui/autopay/UpdateAutopayEvent$OnLoadDefaultData;", "Lcom/paypal/oslo/feature/bnplservicing/ui/autopay/UpdateAutopayEvent;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class OnLoadDefaultData extends com.paypal.oslo.feature.bnplservicing.ui.autopay.UpdateAutopayEvent {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.bnplservicing.ui.autopay.UpdateAutopayEvent.OnLoadDefaultData INSTANCE = new com.paypal.oslo.feature.bnplservicing.ui.autopay.UpdateAutopayEvent.OnLoadDefaultData();

        public final int hashCode() {
            return -17480804;
        }

        private OnLoadDefaultData() {
            super("OnLoadDefaultData", null);
        }

        public final java.lang.String toString() {
            return "OnLoadDefaultData";
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.bnplservicing.ui.autopay.UpdateAutopayEvent.OnLoadDefaultData)) {
                return false;
            }
            return true;
        }
    }

    private UpdateAutopayEvent(java.lang.String str) {
        this.name = str;
    }

    @Override // com.paypal.oslo.core.mvi.Event
    public java.lang.String getName() {
        return this.name;
    }

    @kotlin.Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\f\u001a\u00020\u00022\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0014\u001a\u0004\b\u0015\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/bnplservicing/ui/autopay/UpdateAutopayEvent$OnClose;", "Lcom/paypal/oslo/feature/bnplservicing/ui/autopay/UpdateAutopayEvent;", "", "autopayStatusUpdated", "<init>", "(Z)V", "component1", "()Z", "copy", "(Z)Lcom/paypal/oslo/feature/bnplservicing/ui/autopay/UpdateAutopayEvent$OnClose;", "", "other", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Z", "getAutopayStatusUpdated"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class OnClose extends com.paypal.oslo.feature.bnplservicing.ui.autopay.UpdateAutopayEvent {
        public static final int $stable = 0;
        private final boolean autopayStatusUpdated;

        public OnClose(boolean z) {
            super("OnClose", null);
            this.autopayStatusUpdated = z;
        }

        public final boolean getAutopayStatusUpdated() {
            return this.autopayStatusUpdated;
        }

        public final java.lang.String toString() {
            boolean z = this.autopayStatusUpdated;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("OnClose(autopayStatusUpdated=");
            sb.append(z);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return java.lang.Boolean.hashCode(this.autopayStatusUpdated);
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof com.paypal.oslo.feature.bnplservicing.ui.autopay.UpdateAutopayEvent.OnClose) && this.autopayStatusUpdated == ((com.paypal.oslo.feature.bnplservicing.ui.autopay.UpdateAutopayEvent.OnClose) other).autopayStatusUpdated;
        }

        public final com.paypal.oslo.feature.bnplservicing.ui.autopay.UpdateAutopayEvent.OnClose copy(boolean autopayStatusUpdated) {
            return new com.paypal.oslo.feature.bnplservicing.ui.autopay.UpdateAutopayEvent.OnClose(autopayStatusUpdated);
        }

        /* renamed from: component1, reason: from getter */
        public final boolean getAutopayStatusUpdated() {
            return this.autopayStatusUpdated;
        }

        public static /* synthetic */ com.paypal.oslo.feature.bnplservicing.ui.autopay.UpdateAutopayEvent.OnClose copy$default(com.paypal.oslo.feature.bnplservicing.ui.autopay.UpdateAutopayEvent.OnClose onClose, boolean z, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                z = onClose.autopayStatusUpdated;
            }
            return onClose.copy(z);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/bnplservicing/ui/autopay/UpdateAutopayEvent$OnConfirmClicked;", "Lcom/paypal/oslo/feature/bnplservicing/ui/autopay/UpdateAutopayEvent;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class OnConfirmClicked extends com.paypal.oslo.feature.bnplservicing.ui.autopay.UpdateAutopayEvent {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.bnplservicing.ui.autopay.UpdateAutopayEvent.OnConfirmClicked INSTANCE = new com.paypal.oslo.feature.bnplservicing.ui.autopay.UpdateAutopayEvent.OnConfirmClicked();

        public final int hashCode() {
            return 1237440400;
        }

        private OnConfirmClicked() {
            super("OnConfirmClick", null);
        }

        public final java.lang.String toString() {
            return "OnConfirmClicked";
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.bnplservicing.ui.autopay.UpdateAutopayEvent.OnConfirmClicked)) {
                return false;
            }
            return true;
        }
    }

    @kotlin.Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B\u001f\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0012\u0010\b\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0012\u0010\n\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ(\u0010\f\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0017\u001a\u00020\u0016HÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0018R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0019\u001a\u0004\b\u001a\u0010\tR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u001b\u001a\u0004\b\u001c\u0010\u000b"}, d2 = {"Lcom/paypal/oslo/feature/bnplservicing/ui/autopay/UpdateAutopayEvent$OnSuccessMessageDismissed;", "Lcom/paypal/oslo/feature/bnplservicing/ui/autopay/UpdateAutopayEvent;", "Lcom/paypal/oslo/feature/bnplservicing/ui/autopay/AutopayOnModel;", "autopayOnModel", "Lcom/paypal/oslo/feature/bnplservicing/ui/autopay/AutopayOffModel;", "autopayOffModel", "<init>", "(Lcom/paypal/oslo/feature/bnplservicing/ui/autopay/AutopayOnModel;Lcom/paypal/oslo/feature/bnplservicing/ui/autopay/AutopayOffModel;)V", "component1", "()Lcom/paypal/oslo/feature/bnplservicing/ui/autopay/AutopayOnModel;", "component2", "()Lcom/paypal/oslo/feature/bnplservicing/ui/autopay/AutopayOffModel;", "copy", "(Lcom/paypal/oslo/feature/bnplservicing/ui/autopay/AutopayOnModel;Lcom/paypal/oslo/feature/bnplservicing/ui/autopay/AutopayOffModel;)Lcom/paypal/oslo/feature/bnplservicing/ui/autopay/UpdateAutopayEvent$OnSuccessMessageDismissed;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lcom/paypal/oslo/feature/bnplservicing/ui/autopay/AutopayOnModel;", "getAutopayOnModel", "Lcom/paypal/oslo/feature/bnplservicing/ui/autopay/AutopayOffModel;", "getAutopayOffModel"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class OnSuccessMessageDismissed extends com.paypal.oslo.feature.bnplservicing.ui.autopay.UpdateAutopayEvent {
        public static final int $stable = 8;
        private final com.paypal.oslo.feature.bnplservicing.ui.autopay.AutopayOffModel autopayOffModel;
        private final com.paypal.oslo.feature.bnplservicing.ui.autopay.AutopayOnModel autopayOnModel;

        public OnSuccessMessageDismissed(com.paypal.oslo.feature.bnplservicing.ui.autopay.AutopayOnModel autopayOnModel, com.paypal.oslo.feature.bnplservicing.ui.autopay.AutopayOffModel autopayOffModel) {
            super("OnSuccessMessageDismissed", null);
            this.autopayOnModel = autopayOnModel;
            this.autopayOffModel = autopayOffModel;
        }

        public /* synthetic */ OnSuccessMessageDismissed(com.paypal.oslo.feature.bnplservicing.ui.autopay.AutopayOnModel autopayOnModel, com.paypal.oslo.feature.bnplservicing.ui.autopay.AutopayOffModel autopayOffModel, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? null : autopayOnModel, (i & 2) != 0 ? null : autopayOffModel);
        }

        public final com.paypal.oslo.feature.bnplservicing.ui.autopay.AutopayOnModel getAutopayOnModel() {
            return this.autopayOnModel;
        }

        public final com.paypal.oslo.feature.bnplservicing.ui.autopay.AutopayOffModel getAutopayOffModel() {
            return this.autopayOffModel;
        }

        public final java.lang.String toString() {
            com.paypal.oslo.feature.bnplservicing.ui.autopay.AutopayOnModel autopayOnModel = this.autopayOnModel;
            com.paypal.oslo.feature.bnplservicing.ui.autopay.AutopayOffModel autopayOffModel = this.autopayOffModel;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("OnSuccessMessageDismissed(autopayOnModel=");
            sb.append(autopayOnModel);
            sb.append(", autopayOffModel=");
            sb.append(autopayOffModel);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            com.paypal.oslo.feature.bnplservicing.ui.autopay.AutopayOnModel autopayOnModel = this.autopayOnModel;
            int hashCode = autopayOnModel == null ? 0 : autopayOnModel.hashCode();
            com.paypal.oslo.feature.bnplservicing.ui.autopay.AutopayOffModel autopayOffModel = this.autopayOffModel;
            return (hashCode * 31) + (autopayOffModel != null ? autopayOffModel.hashCode() : 0);
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.bnplservicing.ui.autopay.UpdateAutopayEvent.OnSuccessMessageDismissed)) {
                return false;
            }
            com.paypal.oslo.feature.bnplservicing.ui.autopay.UpdateAutopayEvent.OnSuccessMessageDismissed onSuccessMessageDismissed = (com.paypal.oslo.feature.bnplservicing.ui.autopay.UpdateAutopayEvent.OnSuccessMessageDismissed) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.autopayOnModel, onSuccessMessageDismissed.autopayOnModel) && kotlin.jvm.internal.Intrinsics.areEqual(this.autopayOffModel, onSuccessMessageDismissed.autopayOffModel);
        }

        public final com.paypal.oslo.feature.bnplservicing.ui.autopay.UpdateAutopayEvent.OnSuccessMessageDismissed copy(com.paypal.oslo.feature.bnplservicing.ui.autopay.AutopayOnModel autopayOnModel, com.paypal.oslo.feature.bnplservicing.ui.autopay.AutopayOffModel autopayOffModel) {
            return new com.paypal.oslo.feature.bnplservicing.ui.autopay.UpdateAutopayEvent.OnSuccessMessageDismissed(autopayOnModel, autopayOffModel);
        }

        /* renamed from: component2, reason: from getter */
        public final com.paypal.oslo.feature.bnplservicing.ui.autopay.AutopayOffModel getAutopayOffModel() {
            return this.autopayOffModel;
        }

        /* renamed from: component1, reason: from getter */
        public final com.paypal.oslo.feature.bnplservicing.ui.autopay.AutopayOnModel getAutopayOnModel() {
            return this.autopayOnModel;
        }

        public static /* synthetic */ com.paypal.oslo.feature.bnplservicing.ui.autopay.UpdateAutopayEvent.OnSuccessMessageDismissed copy$default(com.paypal.oslo.feature.bnplservicing.ui.autopay.UpdateAutopayEvent.OnSuccessMessageDismissed onSuccessMessageDismissed, com.paypal.oslo.feature.bnplservicing.ui.autopay.AutopayOnModel autopayOnModel, com.paypal.oslo.feature.bnplservicing.ui.autopay.AutopayOffModel autopayOffModel, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                autopayOnModel = onSuccessMessageDismissed.autopayOnModel;
            }
            if ((i & 2) != 0) {
                autopayOffModel = onSuccessMessageDismissed.autopayOffModel;
            }
            return onSuccessMessageDismissed.copy(autopayOnModel, autopayOffModel);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public OnSuccessMessageDismissed() {
            this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
        }
    }

    @kotlin.Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B\u001f\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0012\u0010\b\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0012\u0010\n\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ(\u0010\f\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0017\u001a\u00020\u0016HÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0018R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0019\u001a\u0004\b\u001a\u0010\tR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u001b\u001a\u0004\b\u001c\u0010\u000b"}, d2 = {"Lcom/paypal/oslo/feature/bnplservicing/ui/autopay/UpdateAutopayEvent$AutopayStatusUpdated;", "Lcom/paypal/oslo/feature/bnplservicing/ui/autopay/UpdateAutopayEvent;", "Lcom/paypal/oslo/feature/bnplservicing/ui/autopay/AutopayOnModel;", "autopayOnModel", "Lcom/paypal/oslo/feature/bnplservicing/ui/autopay/AutopayOffModel;", "autopayOffModel", "<init>", "(Lcom/paypal/oslo/feature/bnplservicing/ui/autopay/AutopayOnModel;Lcom/paypal/oslo/feature/bnplservicing/ui/autopay/AutopayOffModel;)V", "component1", "()Lcom/paypal/oslo/feature/bnplservicing/ui/autopay/AutopayOnModel;", "component2", "()Lcom/paypal/oslo/feature/bnplservicing/ui/autopay/AutopayOffModel;", "copy", "(Lcom/paypal/oslo/feature/bnplservicing/ui/autopay/AutopayOnModel;Lcom/paypal/oslo/feature/bnplservicing/ui/autopay/AutopayOffModel;)Lcom/paypal/oslo/feature/bnplservicing/ui/autopay/UpdateAutopayEvent$AutopayStatusUpdated;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lcom/paypal/oslo/feature/bnplservicing/ui/autopay/AutopayOnModel;", "getAutopayOnModel", "Lcom/paypal/oslo/feature/bnplservicing/ui/autopay/AutopayOffModel;", "getAutopayOffModel"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class AutopayStatusUpdated extends com.paypal.oslo.feature.bnplservicing.ui.autopay.UpdateAutopayEvent {
        public static final int $stable = 8;
        private final com.paypal.oslo.feature.bnplservicing.ui.autopay.AutopayOffModel autopayOffModel;
        private final com.paypal.oslo.feature.bnplservicing.ui.autopay.AutopayOnModel autopayOnModel;

        public AutopayStatusUpdated(com.paypal.oslo.feature.bnplservicing.ui.autopay.AutopayOnModel autopayOnModel, com.paypal.oslo.feature.bnplservicing.ui.autopay.AutopayOffModel autopayOffModel) {
            super("AutopayStatusUpdated", null);
            this.autopayOnModel = autopayOnModel;
            this.autopayOffModel = autopayOffModel;
        }

        public /* synthetic */ AutopayStatusUpdated(com.paypal.oslo.feature.bnplservicing.ui.autopay.AutopayOnModel autopayOnModel, com.paypal.oslo.feature.bnplservicing.ui.autopay.AutopayOffModel autopayOffModel, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? null : autopayOnModel, (i & 2) != 0 ? null : autopayOffModel);
        }

        public final com.paypal.oslo.feature.bnplservicing.ui.autopay.AutopayOnModel getAutopayOnModel() {
            return this.autopayOnModel;
        }

        public final com.paypal.oslo.feature.bnplservicing.ui.autopay.AutopayOffModel getAutopayOffModel() {
            return this.autopayOffModel;
        }

        public final java.lang.String toString() {
            com.paypal.oslo.feature.bnplservicing.ui.autopay.AutopayOnModel autopayOnModel = this.autopayOnModel;
            com.paypal.oslo.feature.bnplservicing.ui.autopay.AutopayOffModel autopayOffModel = this.autopayOffModel;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("AutopayStatusUpdated(autopayOnModel=");
            sb.append(autopayOnModel);
            sb.append(", autopayOffModel=");
            sb.append(autopayOffModel);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            com.paypal.oslo.feature.bnplservicing.ui.autopay.AutopayOnModel autopayOnModel = this.autopayOnModel;
            int hashCode = autopayOnModel == null ? 0 : autopayOnModel.hashCode();
            com.paypal.oslo.feature.bnplservicing.ui.autopay.AutopayOffModel autopayOffModel = this.autopayOffModel;
            return (hashCode * 31) + (autopayOffModel != null ? autopayOffModel.hashCode() : 0);
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.bnplservicing.ui.autopay.UpdateAutopayEvent.AutopayStatusUpdated)) {
                return false;
            }
            com.paypal.oslo.feature.bnplservicing.ui.autopay.UpdateAutopayEvent.AutopayStatusUpdated autopayStatusUpdated = (com.paypal.oslo.feature.bnplservicing.ui.autopay.UpdateAutopayEvent.AutopayStatusUpdated) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.autopayOnModel, autopayStatusUpdated.autopayOnModel) && kotlin.jvm.internal.Intrinsics.areEqual(this.autopayOffModel, autopayStatusUpdated.autopayOffModel);
        }

        public final com.paypal.oslo.feature.bnplservicing.ui.autopay.UpdateAutopayEvent.AutopayStatusUpdated copy(com.paypal.oslo.feature.bnplservicing.ui.autopay.AutopayOnModel autopayOnModel, com.paypal.oslo.feature.bnplservicing.ui.autopay.AutopayOffModel autopayOffModel) {
            return new com.paypal.oslo.feature.bnplservicing.ui.autopay.UpdateAutopayEvent.AutopayStatusUpdated(autopayOnModel, autopayOffModel);
        }

        /* renamed from: component2, reason: from getter */
        public final com.paypal.oslo.feature.bnplservicing.ui.autopay.AutopayOffModel getAutopayOffModel() {
            return this.autopayOffModel;
        }

        /* renamed from: component1, reason: from getter */
        public final com.paypal.oslo.feature.bnplservicing.ui.autopay.AutopayOnModel getAutopayOnModel() {
            return this.autopayOnModel;
        }

        public static /* synthetic */ com.paypal.oslo.feature.bnplservicing.ui.autopay.UpdateAutopayEvent.AutopayStatusUpdated copy$default(com.paypal.oslo.feature.bnplservicing.ui.autopay.UpdateAutopayEvent.AutopayStatusUpdated autopayStatusUpdated, com.paypal.oslo.feature.bnplservicing.ui.autopay.AutopayOnModel autopayOnModel, com.paypal.oslo.feature.bnplservicing.ui.autopay.AutopayOffModel autopayOffModel, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                autopayOnModel = autopayStatusUpdated.autopayOnModel;
            }
            if ((i & 2) != 0) {
                autopayOffModel = autopayStatusUpdated.autopayOffModel;
            }
            return autopayStatusUpdated.copy(autopayOnModel, autopayOffModel);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public AutopayStatusUpdated() {
            this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0007R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0013\u001a\u0004\b\u0014\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/bnplservicing/ui/autopay/UpdateAutopayEvent$OnError;", "Lcom/paypal/oslo/feature/bnplservicing/ui/autopay/UpdateAutopayEvent;", "", "correlationId", "<init>", "(Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "copy", "(Ljava/lang/String;)Lcom/paypal/oslo/feature/bnplservicing/ui/autopay/UpdateAutopayEvent$OnError;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getCorrelationId"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class OnError extends com.paypal.oslo.feature.bnplservicing.ui.autopay.UpdateAutopayEvent {
        public static final int $stable = 0;
        private final java.lang.String correlationId;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OnError(java.lang.String str) {
            super("OnError", null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            this.correlationId = str;
        }

        public final java.lang.String getCorrelationId() {
            return this.correlationId;
        }

        public final java.lang.String toString() {
            java.lang.String str = this.correlationId;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("OnError(correlationId=");
            sb.append(str);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return this.correlationId.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof com.paypal.oslo.feature.bnplservicing.ui.autopay.UpdateAutopayEvent.OnError) && kotlin.jvm.internal.Intrinsics.areEqual(this.correlationId, ((com.paypal.oslo.feature.bnplservicing.ui.autopay.UpdateAutopayEvent.OnError) other).correlationId);
        }

        public final com.paypal.oslo.feature.bnplservicing.ui.autopay.UpdateAutopayEvent.OnError copy(java.lang.String correlationId) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(correlationId, "");
            return new com.paypal.oslo.feature.bnplservicing.ui.autopay.UpdateAutopayEvent.OnError(correlationId);
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.String getCorrelationId() {
            return this.correlationId;
        }

        public static /* synthetic */ com.paypal.oslo.feature.bnplservicing.ui.autopay.UpdateAutopayEvent.OnError copy$default(com.paypal.oslo.feature.bnplservicing.ui.autopay.UpdateAutopayEvent.OnError onError, java.lang.String str, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = onError.correlationId;
            }
            return onError.copy(str);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/bnplservicing/ui/autopay/UpdateAutopayEvent$OnReset;", "Lcom/paypal/oslo/feature/bnplservicing/ui/autopay/UpdateAutopayEvent;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class OnReset extends com.paypal.oslo.feature.bnplservicing.ui.autopay.UpdateAutopayEvent {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.bnplservicing.ui.autopay.UpdateAutopayEvent.OnReset INSTANCE = new com.paypal.oslo.feature.bnplservicing.ui.autopay.UpdateAutopayEvent.OnReset();

        public final int hashCode() {
            return -1846310682;
        }

        private OnReset() {
            super("OnReset", null);
        }

        public final java.lang.String toString() {
            return "OnReset";
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.bnplservicing.ui.autopay.UpdateAutopayEvent.OnReset)) {
                return false;
            }
            return true;
        }
    }

    public /* synthetic */ UpdateAutopayEvent(java.lang.String str, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(str);
    }
}
