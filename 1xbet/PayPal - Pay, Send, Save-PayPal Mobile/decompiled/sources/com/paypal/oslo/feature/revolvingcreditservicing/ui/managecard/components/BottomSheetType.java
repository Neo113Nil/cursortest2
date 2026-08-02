package com.paypal.oslo.feature.revolvingcreditservicing.ui.managecard.components;

@kotlin.Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\b0\u0018\u00002\u00020\u0001:\t\u0004\u0005\u0006\u0007\b\t\n\u000b\fB\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\t\r\u000e\u000f\u0010\u0011\u0012\u0013\u0014\u0015"}, d2 = {"Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/managecard/components/BottomSheetType;", "", "<init>", "()V", com.adobe.marketing.mobile.internal.CoreConstants.Wrapper.Name.NONE, "UserInfoBottomSheet", "StartStatementDelivery", "StopStatementDelivery", "StatementDeliveryDetails", "ReportLostOrStolen", "LockCardError", "ViewCardDetails", "CardDetailsError", "Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/managecard/components/BottomSheetType$CardDetailsError;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/managecard/components/BottomSheetType$LockCardError;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/managecard/components/BottomSheetType$None;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/managecard/components/BottomSheetType$ReportLostOrStolen;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/managecard/components/BottomSheetType$StartStatementDelivery;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/managecard/components/BottomSheetType$StatementDeliveryDetails;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/managecard/components/BottomSheetType$StopStatementDelivery;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/managecard/components/BottomSheetType$UserInfoBottomSheet;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/managecard/components/BottomSheetType$ViewCardDetails;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes14.dex */
public abstract class BottomSheetType {
    public static final int $stable = 0;

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/managecard/components/BottomSheetType$None;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/managecard/components/BottomSheetType;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class None extends com.paypal.oslo.feature.revolvingcreditservicing.ui.managecard.components.BottomSheetType {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.revolvingcreditservicing.ui.managecard.components.BottomSheetType.None INSTANCE = new com.paypal.oslo.feature.revolvingcreditservicing.ui.managecard.components.BottomSheetType.None();

        public final int hashCode() {
            return -1846761663;
        }

        private None() {
            super(null);
        }

        public final java.lang.String toString() {
            return com.adobe.marketing.mobile.internal.CoreConstants.Wrapper.Name.NONE;
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.revolvingcreditservicing.ui.managecard.components.BottomSheetType.None)) {
                return false;
            }
            return true;
        }
    }

    private BottomSheetType() {
    }

    @kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0007R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0013\u001a\u0004\b\u0014\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/managecard/components/BottomSheetType$UserInfoBottomSheet;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/managecard/components/BottomSheetType;", "", "phoneNumber", "<init>", "(Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "copy", "(Ljava/lang/String;)Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/managecard/components/BottomSheetType$UserInfoBottomSheet;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getPhoneNumber"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class UserInfoBottomSheet extends com.paypal.oslo.feature.revolvingcreditservicing.ui.managecard.components.BottomSheetType {
        public static final int $stable = 0;
        private final java.lang.String phoneNumber;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public UserInfoBottomSheet(java.lang.String str) {
            super(null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            this.phoneNumber = str;
        }

        public final java.lang.String getPhoneNumber() {
            return this.phoneNumber;
        }

        public final java.lang.String toString() {
            java.lang.String str = this.phoneNumber;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("UserInfoBottomSheet(phoneNumber=");
            sb.append(str);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return this.phoneNumber.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof com.paypal.oslo.feature.revolvingcreditservicing.ui.managecard.components.BottomSheetType.UserInfoBottomSheet) && kotlin.jvm.internal.Intrinsics.areEqual(this.phoneNumber, ((com.paypal.oslo.feature.revolvingcreditservicing.ui.managecard.components.BottomSheetType.UserInfoBottomSheet) other).phoneNumber);
        }

        public final com.paypal.oslo.feature.revolvingcreditservicing.ui.managecard.components.BottomSheetType.UserInfoBottomSheet copy(java.lang.String phoneNumber) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(phoneNumber, "");
            return new com.paypal.oslo.feature.revolvingcreditservicing.ui.managecard.components.BottomSheetType.UserInfoBottomSheet(phoneNumber);
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.String getPhoneNumber() {
            return this.phoneNumber;
        }

        public static /* synthetic */ com.paypal.oslo.feature.revolvingcreditservicing.ui.managecard.components.BottomSheetType.UserInfoBottomSheet copy$default(com.paypal.oslo.feature.revolvingcreditservicing.ui.managecard.components.BottomSheetType.UserInfoBottomSheet userInfoBottomSheet, java.lang.String str, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = userInfoBottomSheet.phoneNumber;
            }
            return userInfoBottomSheet.copy(str);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/managecard/components/BottomSheetType$StartStatementDelivery;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/managecard/components/BottomSheetType;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class StartStatementDelivery extends com.paypal.oslo.feature.revolvingcreditservicing.ui.managecard.components.BottomSheetType {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.revolvingcreditservicing.ui.managecard.components.BottomSheetType.StartStatementDelivery INSTANCE = new com.paypal.oslo.feature.revolvingcreditservicing.ui.managecard.components.BottomSheetType.StartStatementDelivery();

        public final int hashCode() {
            return -1460355574;
        }

        private StartStatementDelivery() {
            super(null);
        }

        public final java.lang.String toString() {
            return "StartStatementDelivery";
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.revolvingcreditservicing.ui.managecard.components.BottomSheetType.StartStatementDelivery)) {
                return false;
            }
            return true;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/managecard/components/BottomSheetType$StopStatementDelivery;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/managecard/components/BottomSheetType;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class StopStatementDelivery extends com.paypal.oslo.feature.revolvingcreditservicing.ui.managecard.components.BottomSheetType {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.revolvingcreditservicing.ui.managecard.components.BottomSheetType.StopStatementDelivery INSTANCE = new com.paypal.oslo.feature.revolvingcreditservicing.ui.managecard.components.BottomSheetType.StopStatementDelivery();

        public final int hashCode() {
            return 1477689784;
        }

        private StopStatementDelivery() {
            super(null);
        }

        public final java.lang.String toString() {
            return "StopStatementDelivery";
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.revolvingcreditservicing.ui.managecard.components.BottomSheetType.StopStatementDelivery)) {
                return false;
            }
            return true;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/managecard/components/BottomSheetType$StatementDeliveryDetails;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/managecard/components/BottomSheetType;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class StatementDeliveryDetails extends com.paypal.oslo.feature.revolvingcreditservicing.ui.managecard.components.BottomSheetType {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.revolvingcreditservicing.ui.managecard.components.BottomSheetType.StatementDeliveryDetails INSTANCE = new com.paypal.oslo.feature.revolvingcreditservicing.ui.managecard.components.BottomSheetType.StatementDeliveryDetails();

        public final int hashCode() {
            return -1419243576;
        }

        private StatementDeliveryDetails() {
            super(null);
        }

        public final java.lang.String toString() {
            return "StatementDeliveryDetails";
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.revolvingcreditservicing.ui.managecard.components.BottomSheetType.StatementDeliveryDetails)) {
                return false;
            }
            return true;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0007R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0013\u001a\u0004\b\u0014\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/managecard/components/BottomSheetType$ReportLostOrStolen;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/managecard/components/BottomSheetType;", "", "phoneNumber", "<init>", "(Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "copy", "(Ljava/lang/String;)Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/managecard/components/BottomSheetType$ReportLostOrStolen;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getPhoneNumber"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class ReportLostOrStolen extends com.paypal.oslo.feature.revolvingcreditservicing.ui.managecard.components.BottomSheetType {
        public static final int $stable = 0;
        private final java.lang.String phoneNumber;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ReportLostOrStolen(java.lang.String str) {
            super(null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            this.phoneNumber = str;
        }

        public final java.lang.String getPhoneNumber() {
            return this.phoneNumber;
        }

        public final java.lang.String toString() {
            java.lang.String str = this.phoneNumber;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("ReportLostOrStolen(phoneNumber=");
            sb.append(str);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return this.phoneNumber.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof com.paypal.oslo.feature.revolvingcreditservicing.ui.managecard.components.BottomSheetType.ReportLostOrStolen) && kotlin.jvm.internal.Intrinsics.areEqual(this.phoneNumber, ((com.paypal.oslo.feature.revolvingcreditservicing.ui.managecard.components.BottomSheetType.ReportLostOrStolen) other).phoneNumber);
        }

        public final com.paypal.oslo.feature.revolvingcreditservicing.ui.managecard.components.BottomSheetType.ReportLostOrStolen copy(java.lang.String phoneNumber) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(phoneNumber, "");
            return new com.paypal.oslo.feature.revolvingcreditservicing.ui.managecard.components.BottomSheetType.ReportLostOrStolen(phoneNumber);
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.String getPhoneNumber() {
            return this.phoneNumber;
        }

        public static /* synthetic */ com.paypal.oslo.feature.revolvingcreditservicing.ui.managecard.components.BottomSheetType.ReportLostOrStolen copy$default(com.paypal.oslo.feature.revolvingcreditservicing.ui.managecard.components.BottomSheetType.ReportLostOrStolen reportLostOrStolen, java.lang.String str, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = reportLostOrStolen.phoneNumber;
            }
            return reportLostOrStolen.copy(str);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ$\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u00022\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0015\u0010\u000bR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0016\u001a\u0004\b\u0003\u0010\tR\u001a\u0010\u0005\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0017\u001a\u0004\b\u0018\u0010\u000b"}, d2 = {"Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/managecard/components/BottomSheetType$LockCardError;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/managecard/components/BottomSheetType;", "", "isLocking", "", "phoneNumber", "<init>", "(ZLjava/lang/String;)V", "component1", "()Z", "component2", "()Ljava/lang/String;", "copy", "(ZLjava/lang/String;)Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/managecard/components/BottomSheetType$LockCardError;", "", "other", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Z", "Ljava/lang/String;", "getPhoneNumber"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class LockCardError extends com.paypal.oslo.feature.revolvingcreditservicing.ui.managecard.components.BottomSheetType {
        public static final int $stable = 0;
        private final boolean isLocking;
        private final java.lang.String phoneNumber;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public LockCardError(boolean z, java.lang.String str) {
            super(null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            this.isLocking = z;
            this.phoneNumber = str;
        }

        public final boolean isLocking() {
            return this.isLocking;
        }

        public final java.lang.String getPhoneNumber() {
            return this.phoneNumber;
        }

        public final java.lang.String toString() {
            boolean z = this.isLocking;
            java.lang.String str = this.phoneNumber;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("LockCardError(isLocking=");
            sb.append(z);
            sb.append(", phoneNumber=");
            sb.append(str);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return (java.lang.Boolean.hashCode(this.isLocking) * 31) + this.phoneNumber.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.revolvingcreditservicing.ui.managecard.components.BottomSheetType.LockCardError)) {
                return false;
            }
            com.paypal.oslo.feature.revolvingcreditservicing.ui.managecard.components.BottomSheetType.LockCardError lockCardError = (com.paypal.oslo.feature.revolvingcreditservicing.ui.managecard.components.BottomSheetType.LockCardError) other;
            return this.isLocking == lockCardError.isLocking && kotlin.jvm.internal.Intrinsics.areEqual(this.phoneNumber, lockCardError.phoneNumber);
        }

        public final com.paypal.oslo.feature.revolvingcreditservicing.ui.managecard.components.BottomSheetType.LockCardError copy(boolean isLocking, java.lang.String phoneNumber) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(phoneNumber, "");
            return new com.paypal.oslo.feature.revolvingcreditservicing.ui.managecard.components.BottomSheetType.LockCardError(isLocking, phoneNumber);
        }

        /* renamed from: component2, reason: from getter */
        public final java.lang.String getPhoneNumber() {
            return this.phoneNumber;
        }

        /* renamed from: component1, reason: from getter */
        public final boolean getIsLocking() {
            return this.isLocking;
        }

        public static /* synthetic */ com.paypal.oslo.feature.revolvingcreditservicing.ui.managecard.components.BottomSheetType.LockCardError copy$default(com.paypal.oslo.feature.revolvingcreditservicing.ui.managecard.components.BottomSheetType.LockCardError lockCardError, boolean z, java.lang.String str, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                z = lockCardError.isLocking;
            }
            if ((i & 2) != 0) {
                str = lockCardError.phoneNumber;
            }
            return lockCardError.copy(z, str);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0015\u001a\u0004\b\u0016\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/managecard/components/BottomSheetType$ViewCardDetails;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/managecard/components/BottomSheetType;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/managecard/uimodel/CardDetailsUiModel;", "cardDetails", "<init>", "(Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/managecard/uimodel/CardDetailsUiModel;)V", "component1", "()Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/managecard/uimodel/CardDetailsUiModel;", "copy", "(Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/managecard/uimodel/CardDetailsUiModel;)Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/managecard/components/BottomSheetType$ViewCardDetails;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/managecard/uimodel/CardDetailsUiModel;", "getCardDetails"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class ViewCardDetails extends com.paypal.oslo.feature.revolvingcreditservicing.ui.managecard.components.BottomSheetType {
        public static final int $stable = 0;
        private final com.paypal.oslo.feature.revolvingcreditservicing.ui.managecard.uimodel.CardDetailsUiModel cardDetails;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ViewCardDetails(com.paypal.oslo.feature.revolvingcreditservicing.ui.managecard.uimodel.CardDetailsUiModel cardDetailsUiModel) {
            super(null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(cardDetailsUiModel, "");
            this.cardDetails = cardDetailsUiModel;
        }

        public final com.paypal.oslo.feature.revolvingcreditservicing.ui.managecard.uimodel.CardDetailsUiModel getCardDetails() {
            return this.cardDetails;
        }

        public final java.lang.String toString() {
            com.paypal.oslo.feature.revolvingcreditservicing.ui.managecard.uimodel.CardDetailsUiModel cardDetailsUiModel = this.cardDetails;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("ViewCardDetails(cardDetails=");
            sb.append(cardDetailsUiModel);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return this.cardDetails.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof com.paypal.oslo.feature.revolvingcreditservicing.ui.managecard.components.BottomSheetType.ViewCardDetails) && kotlin.jvm.internal.Intrinsics.areEqual(this.cardDetails, ((com.paypal.oslo.feature.revolvingcreditservicing.ui.managecard.components.BottomSheetType.ViewCardDetails) other).cardDetails);
        }

        public final com.paypal.oslo.feature.revolvingcreditservicing.ui.managecard.components.BottomSheetType.ViewCardDetails copy(com.paypal.oslo.feature.revolvingcreditservicing.ui.managecard.uimodel.CardDetailsUiModel cardDetails) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(cardDetails, "");
            return new com.paypal.oslo.feature.revolvingcreditservicing.ui.managecard.components.BottomSheetType.ViewCardDetails(cardDetails);
        }

        /* renamed from: component1, reason: from getter */
        public final com.paypal.oslo.feature.revolvingcreditservicing.ui.managecard.uimodel.CardDetailsUiModel getCardDetails() {
            return this.cardDetails;
        }

        public static /* synthetic */ com.paypal.oslo.feature.revolvingcreditservicing.ui.managecard.components.BottomSheetType.ViewCardDetails copy$default(com.paypal.oslo.feature.revolvingcreditservicing.ui.managecard.components.BottomSheetType.ViewCardDetails viewCardDetails, com.paypal.oslo.feature.revolvingcreditservicing.ui.managecard.uimodel.CardDetailsUiModel cardDetailsUiModel, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                cardDetailsUiModel = viewCardDetails.cardDetails;
            }
            return viewCardDetails.copy(cardDetailsUiModel);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/managecard/components/BottomSheetType$CardDetailsError;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/managecard/components/BottomSheetType;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class CardDetailsError extends com.paypal.oslo.feature.revolvingcreditservicing.ui.managecard.components.BottomSheetType {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.revolvingcreditservicing.ui.managecard.components.BottomSheetType.CardDetailsError INSTANCE = new com.paypal.oslo.feature.revolvingcreditservicing.ui.managecard.components.BottomSheetType.CardDetailsError();

        public final int hashCode() {
            return 1937371807;
        }

        private CardDetailsError() {
            super(null);
        }

        public final java.lang.String toString() {
            return "CardDetailsError";
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.revolvingcreditservicing.ui.managecard.components.BottomSheetType.CardDetailsError)) {
                return false;
            }
            return true;
        }
    }

    public /* synthetic */ BottomSheetType(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }
}
