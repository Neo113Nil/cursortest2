package com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.ui.taptopay;

@kotlin.Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\b0\u0018\u00002\u00020\u0001:\u0003\u0012\u0013\u0014B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0007\u001a\u00020\u00048'X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006R\u0014\u0010\t\u001a\u00020\u00048'X¦\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\u0006R\u0014\u0010\r\u001a\u00020\n8'X¦\u0004¢\u0006\u0006\u001a\u0004\b\u000b\u0010\fR\u0014\u0010\u0011\u001a\u00020\u000e8'X¦\u0004¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0010\u0082\u0001\u0003\u0015\u0016\u0017"}, d2 = {"Lcom/paypal/oslo/feature/businesspayandgetpaid/payandgetpaid/ui/taptopay/TtpRationaleUIState;", "", "<init>", "()V", "", "getRationaleText", "()I", "rationaleText", "getCaptionText", "captionText", "Lcom/paypal/pds/core/Icon;", "getIcon", "()Lcom/paypal/pds/core/Icon;", "icon", "Lcom/paypal/oslo/feature/businesspayandgetpaid/payandgetpaid/ui/taptopay/TtpRationaleAction;", "getAction", "()Lcom/paypal/oslo/feature/businesspayandgetpaid/payandgetpaid/ui/taptopay/TtpRationaleAction;", "action", "FineLocationPermissionNotEnabledRationale", "LocationNotEnabledRationale", "NfcNotEnabledRationale", "Lcom/paypal/oslo/feature/businesspayandgetpaid/payandgetpaid/ui/taptopay/TtpRationaleUIState$FineLocationPermissionNotEnabledRationale;", "Lcom/paypal/oslo/feature/businesspayandgetpaid/payandgetpaid/ui/taptopay/TtpRationaleUIState$LocationNotEnabledRationale;", "Lcom/paypal/oslo/feature/businesspayandgetpaid/payandgetpaid/ui/taptopay/TtpRationaleUIState$NfcNotEnabledRationale;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes11.dex */
public abstract class TtpRationaleUIState {
    public static final int $stable = 0;

    public abstract com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.ui.taptopay.TtpRationaleAction getAction();

    public abstract int getCaptionText();

    public abstract com.paypal.pds.core.Icon getIcon();

    public abstract int getRationaleText();

    private TtpRationaleUIState() {
    }

    @kotlin.Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\t\b\u0086\b\u0018\u00002\u00020\u0001B+\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\r\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\r\u0010\fJ\u0010\u0010\u000e\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0010\u001a\u00020\u0007HÆ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J8\u0010\u0012\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\u0007HÆ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u001a\u0010\u0017\u001a\u00020\u00162\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014HÖ\u0003¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u0019\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0019\u0010\fJ\u0010\u0010\u001b\u001a\u00020\u001aHÖ\u0001¢\u0006\u0004\b\u001b\u0010\u001cR\u001a\u0010\u0003\u001a\u00020\u00028\u0017X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u001d\u001a\u0004\b\u001e\u0010\fR\u001a\u0010\u0004\u001a\u00020\u00028\u0017X\u0097\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u001d\u001a\u0004\b\u001f\u0010\fR\u001a\u0010\u0006\u001a\u00020\u00058\u0017X\u0097\u0004¢\u0006\f\n\u0004\b\u0006\u0010 \u001a\u0004\b!\u0010\u000fR\u001a\u0010\b\u001a\u00020\u00078\u0017X\u0097\u0004¢\u0006\f\n\u0004\b\b\u0010\"\u001a\u0004\b#\u0010\u0011"}, d2 = {"Lcom/paypal/oslo/feature/businesspayandgetpaid/payandgetpaid/ui/taptopay/TtpRationaleUIState$FineLocationPermissionNotEnabledRationale;", "Lcom/paypal/oslo/feature/businesspayandgetpaid/payandgetpaid/ui/taptopay/TtpRationaleUIState;", "", "rationaleText", "captionText", "Lcom/paypal/pds/core/Icon;", "icon", "Lcom/paypal/oslo/feature/businesspayandgetpaid/payandgetpaid/ui/taptopay/TtpRationaleAction;", "action", "<init>", "(IILcom/paypal/pds/core/Icon;Lcom/paypal/oslo/feature/businesspayandgetpaid/payandgetpaid/ui/taptopay/TtpRationaleAction;)V", "component1", "()I", "component2", "component3", "()Lcom/paypal/pds/core/Icon;", "component4", "()Lcom/paypal/oslo/feature/businesspayandgetpaid/payandgetpaid/ui/taptopay/TtpRationaleAction;", "copy", "(IILcom/paypal/pds/core/Icon;Lcom/paypal/oslo/feature/businesspayandgetpaid/payandgetpaid/ui/taptopay/TtpRationaleAction;)Lcom/paypal/oslo/feature/businesspayandgetpaid/payandgetpaid/ui/taptopay/TtpRationaleUIState$FineLocationPermissionNotEnabledRationale;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "", "toString", "()Ljava/lang/String;", com.visa.cbp.getEncExpo.warmup, "getRationaleText", "getCaptionText", "Lcom/paypal/pds/core/Icon;", "getIcon", "Lcom/paypal/oslo/feature/businesspayandgetpaid/payandgetpaid/ui/taptopay/TtpRationaleAction;", "getAction"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class FineLocationPermissionNotEnabledRationale extends com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.ui.taptopay.TtpRationaleUIState {
        public static final int $stable = 0;
        private final com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.ui.taptopay.TtpRationaleAction action;
        private final int captionText;
        private final com.paypal.pds.core.Icon icon;
        private final int rationaleText;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public FineLocationPermissionNotEnabledRationale(int i, int i2, com.paypal.pds.core.Icon icon, com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.ui.taptopay.TtpRationaleAction ttpRationaleAction) {
            super(null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(icon, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(ttpRationaleAction, "");
            this.rationaleText = i;
            this.captionText = i2;
            this.icon = icon;
            this.action = ttpRationaleAction;
        }

        @Override // com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.ui.taptopay.TtpRationaleUIState
        public final int getRationaleText() {
            return this.rationaleText;
        }

        @Override // com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.ui.taptopay.TtpRationaleUIState
        public final int getCaptionText() {
            return this.captionText;
        }

        public /* synthetic */ FineLocationPermissionNotEnabledRationale(int i, int i2, com.paypal.pds.core.Icon.MapPin mapPin, com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.ui.taptopay.TtpRationaleAction.OpenAppDetailsSettings openAppDetailsSettings, int i3, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this(i, i2, (i3 & 4) != 0 ? com.paypal.pds.core.Icon.MapPin.INSTANCE : mapPin, (i3 & 8) != 0 ? com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.ui.taptopay.TtpRationaleAction.OpenAppDetailsSettings.INSTANCE : openAppDetailsSettings);
        }

        @Override // com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.ui.taptopay.TtpRationaleUIState
        public final com.paypal.pds.core.Icon getIcon() {
            return this.icon;
        }

        @Override // com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.ui.taptopay.TtpRationaleUIState
        public final com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.ui.taptopay.TtpRationaleAction getAction() {
            return this.action;
        }

        public final java.lang.String toString() {
            int i = this.rationaleText;
            int i2 = this.captionText;
            com.paypal.pds.core.Icon icon = this.icon;
            com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.ui.taptopay.TtpRationaleAction ttpRationaleAction = this.action;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("FineLocationPermissionNotEnabledRationale(rationaleText=");
            sb.append(i);
            sb.append(", captionText=");
            sb.append(i2);
            sb.append(", icon=");
            sb.append(icon);
            sb.append(", action=");
            sb.append(ttpRationaleAction);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return (((((java.lang.Integer.hashCode(this.rationaleText) * 31) + java.lang.Integer.hashCode(this.captionText)) * 31) + this.icon.hashCode()) * 31) + this.action.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.ui.taptopay.TtpRationaleUIState.FineLocationPermissionNotEnabledRationale)) {
                return false;
            }
            com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.ui.taptopay.TtpRationaleUIState.FineLocationPermissionNotEnabledRationale fineLocationPermissionNotEnabledRationale = (com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.ui.taptopay.TtpRationaleUIState.FineLocationPermissionNotEnabledRationale) other;
            return this.rationaleText == fineLocationPermissionNotEnabledRationale.rationaleText && this.captionText == fineLocationPermissionNotEnabledRationale.captionText && kotlin.jvm.internal.Intrinsics.areEqual(this.icon, fineLocationPermissionNotEnabledRationale.icon) && kotlin.jvm.internal.Intrinsics.areEqual(this.action, fineLocationPermissionNotEnabledRationale.action);
        }

        public final com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.ui.taptopay.TtpRationaleUIState.FineLocationPermissionNotEnabledRationale copy(int rationaleText, int captionText, com.paypal.pds.core.Icon icon, com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.ui.taptopay.TtpRationaleAction action) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(icon, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(action, "");
            return new com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.ui.taptopay.TtpRationaleUIState.FineLocationPermissionNotEnabledRationale(rationaleText, captionText, icon, action);
        }

        /* renamed from: component4, reason: from getter */
        public final com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.ui.taptopay.TtpRationaleAction getAction() {
            return this.action;
        }

        /* renamed from: component3, reason: from getter */
        public final com.paypal.pds.core.Icon getIcon() {
            return this.icon;
        }

        /* renamed from: component2, reason: from getter */
        public final int getCaptionText() {
            return this.captionText;
        }

        /* renamed from: component1, reason: from getter */
        public final int getRationaleText() {
            return this.rationaleText;
        }

        public static /* synthetic */ com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.ui.taptopay.TtpRationaleUIState.FineLocationPermissionNotEnabledRationale copy$default(com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.ui.taptopay.TtpRationaleUIState.FineLocationPermissionNotEnabledRationale fineLocationPermissionNotEnabledRationale, int i, int i2, com.paypal.pds.core.Icon icon, com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.ui.taptopay.TtpRationaleAction ttpRationaleAction, int i3, java.lang.Object obj) {
            if ((i3 & 1) != 0) {
                i = fineLocationPermissionNotEnabledRationale.rationaleText;
            }
            if ((i3 & 2) != 0) {
                i2 = fineLocationPermissionNotEnabledRationale.captionText;
            }
            if ((i3 & 4) != 0) {
                icon = fineLocationPermissionNotEnabledRationale.icon;
            }
            if ((i3 & 8) != 0) {
                ttpRationaleAction = fineLocationPermissionNotEnabledRationale.action;
            }
            return fineLocationPermissionNotEnabledRationale.copy(i, i2, icon, ttpRationaleAction);
        }
    }

    @kotlin.Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\t\b\u0086\b\u0018\u00002\u00020\u0001B+\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\r\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\r\u0010\fJ\u0010\u0010\u000e\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0010\u001a\u00020\u0007HÆ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J8\u0010\u0012\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\u0007HÆ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u001a\u0010\u0017\u001a\u00020\u00162\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014HÖ\u0003¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u0019\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0019\u0010\fJ\u0010\u0010\u001b\u001a\u00020\u001aHÖ\u0001¢\u0006\u0004\b\u001b\u0010\u001cR\u001a\u0010\u0003\u001a\u00020\u00028\u0017X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u001d\u001a\u0004\b\u001e\u0010\fR\u001a\u0010\u0004\u001a\u00020\u00028\u0017X\u0097\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u001d\u001a\u0004\b\u001f\u0010\fR\u001a\u0010\u0006\u001a\u00020\u00058\u0017X\u0097\u0004¢\u0006\f\n\u0004\b\u0006\u0010 \u001a\u0004\b!\u0010\u000fR\u001a\u0010\b\u001a\u00020\u00078\u0017X\u0097\u0004¢\u0006\f\n\u0004\b\b\u0010\"\u001a\u0004\b#\u0010\u0011"}, d2 = {"Lcom/paypal/oslo/feature/businesspayandgetpaid/payandgetpaid/ui/taptopay/TtpRationaleUIState$LocationNotEnabledRationale;", "Lcom/paypal/oslo/feature/businesspayandgetpaid/payandgetpaid/ui/taptopay/TtpRationaleUIState;", "", "rationaleText", "captionText", "Lcom/paypal/pds/core/Icon;", "icon", "Lcom/paypal/oslo/feature/businesspayandgetpaid/payandgetpaid/ui/taptopay/TtpRationaleAction;", "action", "<init>", "(IILcom/paypal/pds/core/Icon;Lcom/paypal/oslo/feature/businesspayandgetpaid/payandgetpaid/ui/taptopay/TtpRationaleAction;)V", "component1", "()I", "component2", "component3", "()Lcom/paypal/pds/core/Icon;", "component4", "()Lcom/paypal/oslo/feature/businesspayandgetpaid/payandgetpaid/ui/taptopay/TtpRationaleAction;", "copy", "(IILcom/paypal/pds/core/Icon;Lcom/paypal/oslo/feature/businesspayandgetpaid/payandgetpaid/ui/taptopay/TtpRationaleAction;)Lcom/paypal/oslo/feature/businesspayandgetpaid/payandgetpaid/ui/taptopay/TtpRationaleUIState$LocationNotEnabledRationale;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "", "toString", "()Ljava/lang/String;", com.visa.cbp.getEncExpo.warmup, "getRationaleText", "getCaptionText", "Lcom/paypal/pds/core/Icon;", "getIcon", "Lcom/paypal/oslo/feature/businesspayandgetpaid/payandgetpaid/ui/taptopay/TtpRationaleAction;", "getAction"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class LocationNotEnabledRationale extends com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.ui.taptopay.TtpRationaleUIState {
        public static final int $stable = 0;
        private final com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.ui.taptopay.TtpRationaleAction action;
        private final int captionText;
        private final com.paypal.pds.core.Icon icon;
        private final int rationaleText;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public LocationNotEnabledRationale(int i, int i2, com.paypal.pds.core.Icon icon, com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.ui.taptopay.TtpRationaleAction ttpRationaleAction) {
            super(null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(icon, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(ttpRationaleAction, "");
            this.rationaleText = i;
            this.captionText = i2;
            this.icon = icon;
            this.action = ttpRationaleAction;
        }

        @Override // com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.ui.taptopay.TtpRationaleUIState
        public final int getRationaleText() {
            return this.rationaleText;
        }

        @Override // com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.ui.taptopay.TtpRationaleUIState
        public final int getCaptionText() {
            return this.captionText;
        }

        public /* synthetic */ LocationNotEnabledRationale(int i, int i2, com.paypal.pds.core.Icon.MapPin mapPin, com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.ui.taptopay.TtpRationaleAction.OpenLocationSettings openLocationSettings, int i3, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this(i, i2, (i3 & 4) != 0 ? com.paypal.pds.core.Icon.MapPin.INSTANCE : mapPin, (i3 & 8) != 0 ? com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.ui.taptopay.TtpRationaleAction.OpenLocationSettings.INSTANCE : openLocationSettings);
        }

        @Override // com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.ui.taptopay.TtpRationaleUIState
        public final com.paypal.pds.core.Icon getIcon() {
            return this.icon;
        }

        @Override // com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.ui.taptopay.TtpRationaleUIState
        public final com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.ui.taptopay.TtpRationaleAction getAction() {
            return this.action;
        }

        public final java.lang.String toString() {
            int i = this.rationaleText;
            int i2 = this.captionText;
            com.paypal.pds.core.Icon icon = this.icon;
            com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.ui.taptopay.TtpRationaleAction ttpRationaleAction = this.action;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("LocationNotEnabledRationale(rationaleText=");
            sb.append(i);
            sb.append(", captionText=");
            sb.append(i2);
            sb.append(", icon=");
            sb.append(icon);
            sb.append(", action=");
            sb.append(ttpRationaleAction);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return (((((java.lang.Integer.hashCode(this.rationaleText) * 31) + java.lang.Integer.hashCode(this.captionText)) * 31) + this.icon.hashCode()) * 31) + this.action.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.ui.taptopay.TtpRationaleUIState.LocationNotEnabledRationale)) {
                return false;
            }
            com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.ui.taptopay.TtpRationaleUIState.LocationNotEnabledRationale locationNotEnabledRationale = (com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.ui.taptopay.TtpRationaleUIState.LocationNotEnabledRationale) other;
            return this.rationaleText == locationNotEnabledRationale.rationaleText && this.captionText == locationNotEnabledRationale.captionText && kotlin.jvm.internal.Intrinsics.areEqual(this.icon, locationNotEnabledRationale.icon) && kotlin.jvm.internal.Intrinsics.areEqual(this.action, locationNotEnabledRationale.action);
        }

        public final com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.ui.taptopay.TtpRationaleUIState.LocationNotEnabledRationale copy(int rationaleText, int captionText, com.paypal.pds.core.Icon icon, com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.ui.taptopay.TtpRationaleAction action) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(icon, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(action, "");
            return new com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.ui.taptopay.TtpRationaleUIState.LocationNotEnabledRationale(rationaleText, captionText, icon, action);
        }

        /* renamed from: component4, reason: from getter */
        public final com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.ui.taptopay.TtpRationaleAction getAction() {
            return this.action;
        }

        /* renamed from: component3, reason: from getter */
        public final com.paypal.pds.core.Icon getIcon() {
            return this.icon;
        }

        /* renamed from: component2, reason: from getter */
        public final int getCaptionText() {
            return this.captionText;
        }

        /* renamed from: component1, reason: from getter */
        public final int getRationaleText() {
            return this.rationaleText;
        }

        public static /* synthetic */ com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.ui.taptopay.TtpRationaleUIState.LocationNotEnabledRationale copy$default(com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.ui.taptopay.TtpRationaleUIState.LocationNotEnabledRationale locationNotEnabledRationale, int i, int i2, com.paypal.pds.core.Icon icon, com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.ui.taptopay.TtpRationaleAction ttpRationaleAction, int i3, java.lang.Object obj) {
            if ((i3 & 1) != 0) {
                i = locationNotEnabledRationale.rationaleText;
            }
            if ((i3 & 2) != 0) {
                i2 = locationNotEnabledRationale.captionText;
            }
            if ((i3 & 4) != 0) {
                icon = locationNotEnabledRationale.icon;
            }
            if ((i3 & 8) != 0) {
                ttpRationaleAction = locationNotEnabledRationale.action;
            }
            return locationNotEnabledRationale.copy(i, i2, icon, ttpRationaleAction);
        }
    }

    @kotlin.Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\t\b\u0086\b\u0018\u00002\u00020\u0001B+\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\r\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\r\u0010\fJ\u0010\u0010\u000e\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0010\u001a\u00020\u0007HÆ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J8\u0010\u0012\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\u0007HÆ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u001a\u0010\u0017\u001a\u00020\u00162\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014HÖ\u0003¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u0019\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0019\u0010\fJ\u0010\u0010\u001b\u001a\u00020\u001aHÖ\u0001¢\u0006\u0004\b\u001b\u0010\u001cR\u001a\u0010\u0003\u001a\u00020\u00028\u0017X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u001d\u001a\u0004\b\u001e\u0010\fR\u001a\u0010\u0004\u001a\u00020\u00028\u0017X\u0097\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u001d\u001a\u0004\b\u001f\u0010\fR\u001a\u0010\u0006\u001a\u00020\u00058\u0017X\u0097\u0004¢\u0006\f\n\u0004\b\u0006\u0010 \u001a\u0004\b!\u0010\u000fR\u001a\u0010\b\u001a\u00020\u00078\u0017X\u0097\u0004¢\u0006\f\n\u0004\b\b\u0010\"\u001a\u0004\b#\u0010\u0011"}, d2 = {"Lcom/paypal/oslo/feature/businesspayandgetpaid/payandgetpaid/ui/taptopay/TtpRationaleUIState$NfcNotEnabledRationale;", "Lcom/paypal/oslo/feature/businesspayandgetpaid/payandgetpaid/ui/taptopay/TtpRationaleUIState;", "", "rationaleText", "captionText", "Lcom/paypal/pds/core/Icon;", "icon", "Lcom/paypal/oslo/feature/businesspayandgetpaid/payandgetpaid/ui/taptopay/TtpRationaleAction;", "action", "<init>", "(IILcom/paypal/pds/core/Icon;Lcom/paypal/oslo/feature/businesspayandgetpaid/payandgetpaid/ui/taptopay/TtpRationaleAction;)V", "component1", "()I", "component2", "component3", "()Lcom/paypal/pds/core/Icon;", "component4", "()Lcom/paypal/oslo/feature/businesspayandgetpaid/payandgetpaid/ui/taptopay/TtpRationaleAction;", "copy", "(IILcom/paypal/pds/core/Icon;Lcom/paypal/oslo/feature/businesspayandgetpaid/payandgetpaid/ui/taptopay/TtpRationaleAction;)Lcom/paypal/oslo/feature/businesspayandgetpaid/payandgetpaid/ui/taptopay/TtpRationaleUIState$NfcNotEnabledRationale;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "", "toString", "()Ljava/lang/String;", com.visa.cbp.getEncExpo.warmup, "getRationaleText", "getCaptionText", "Lcom/paypal/pds/core/Icon;", "getIcon", "Lcom/paypal/oslo/feature/businesspayandgetpaid/payandgetpaid/ui/taptopay/TtpRationaleAction;", "getAction"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class NfcNotEnabledRationale extends com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.ui.taptopay.TtpRationaleUIState {
        public static final int $stable = 0;
        private final com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.ui.taptopay.TtpRationaleAction action;
        private final int captionText;
        private final com.paypal.pds.core.Icon icon;
        private final int rationaleText;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public NfcNotEnabledRationale(int i, int i2, com.paypal.pds.core.Icon icon, com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.ui.taptopay.TtpRationaleAction ttpRationaleAction) {
            super(null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(icon, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(ttpRationaleAction, "");
            this.rationaleText = i;
            this.captionText = i2;
            this.icon = icon;
            this.action = ttpRationaleAction;
        }

        @Override // com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.ui.taptopay.TtpRationaleUIState
        public final int getRationaleText() {
            return this.rationaleText;
        }

        @Override // com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.ui.taptopay.TtpRationaleUIState
        public final int getCaptionText() {
            return this.captionText;
        }

        public /* synthetic */ NfcNotEnabledRationale(int i, int i2, com.paypal.pds.core.Icon.Contactless contactless, com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.ui.taptopay.TtpRationaleAction.OpenNfcSettings openNfcSettings, int i3, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this(i, i2, (i3 & 4) != 0 ? com.paypal.pds.core.Icon.Contactless.INSTANCE : contactless, (i3 & 8) != 0 ? com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.ui.taptopay.TtpRationaleAction.OpenNfcSettings.INSTANCE : openNfcSettings);
        }

        @Override // com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.ui.taptopay.TtpRationaleUIState
        public final com.paypal.pds.core.Icon getIcon() {
            return this.icon;
        }

        @Override // com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.ui.taptopay.TtpRationaleUIState
        public final com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.ui.taptopay.TtpRationaleAction getAction() {
            return this.action;
        }

        public final java.lang.String toString() {
            int i = this.rationaleText;
            int i2 = this.captionText;
            com.paypal.pds.core.Icon icon = this.icon;
            com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.ui.taptopay.TtpRationaleAction ttpRationaleAction = this.action;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("NfcNotEnabledRationale(rationaleText=");
            sb.append(i);
            sb.append(", captionText=");
            sb.append(i2);
            sb.append(", icon=");
            sb.append(icon);
            sb.append(", action=");
            sb.append(ttpRationaleAction);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return (((((java.lang.Integer.hashCode(this.rationaleText) * 31) + java.lang.Integer.hashCode(this.captionText)) * 31) + this.icon.hashCode()) * 31) + this.action.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.ui.taptopay.TtpRationaleUIState.NfcNotEnabledRationale)) {
                return false;
            }
            com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.ui.taptopay.TtpRationaleUIState.NfcNotEnabledRationale nfcNotEnabledRationale = (com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.ui.taptopay.TtpRationaleUIState.NfcNotEnabledRationale) other;
            return this.rationaleText == nfcNotEnabledRationale.rationaleText && this.captionText == nfcNotEnabledRationale.captionText && kotlin.jvm.internal.Intrinsics.areEqual(this.icon, nfcNotEnabledRationale.icon) && kotlin.jvm.internal.Intrinsics.areEqual(this.action, nfcNotEnabledRationale.action);
        }

        public final com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.ui.taptopay.TtpRationaleUIState.NfcNotEnabledRationale copy(int rationaleText, int captionText, com.paypal.pds.core.Icon icon, com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.ui.taptopay.TtpRationaleAction action) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(icon, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(action, "");
            return new com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.ui.taptopay.TtpRationaleUIState.NfcNotEnabledRationale(rationaleText, captionText, icon, action);
        }

        /* renamed from: component4, reason: from getter */
        public final com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.ui.taptopay.TtpRationaleAction getAction() {
            return this.action;
        }

        /* renamed from: component3, reason: from getter */
        public final com.paypal.pds.core.Icon getIcon() {
            return this.icon;
        }

        /* renamed from: component2, reason: from getter */
        public final int getCaptionText() {
            return this.captionText;
        }

        /* renamed from: component1, reason: from getter */
        public final int getRationaleText() {
            return this.rationaleText;
        }

        public static /* synthetic */ com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.ui.taptopay.TtpRationaleUIState.NfcNotEnabledRationale copy$default(com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.ui.taptopay.TtpRationaleUIState.NfcNotEnabledRationale nfcNotEnabledRationale, int i, int i2, com.paypal.pds.core.Icon icon, com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.ui.taptopay.TtpRationaleAction ttpRationaleAction, int i3, java.lang.Object obj) {
            if ((i3 & 1) != 0) {
                i = nfcNotEnabledRationale.rationaleText;
            }
            if ((i3 & 2) != 0) {
                i2 = nfcNotEnabledRationale.captionText;
            }
            if ((i3 & 4) != 0) {
                icon = nfcNotEnabledRationale.icon;
            }
            if ((i3 & 8) != 0) {
                ttpRationaleAction = nfcNotEnabledRationale.action;
            }
            return nfcNotEnabledRationale.copy(i, i2, icon, ttpRationaleAction);
        }
    }

    public /* synthetic */ TtpRationaleUIState(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }
}
