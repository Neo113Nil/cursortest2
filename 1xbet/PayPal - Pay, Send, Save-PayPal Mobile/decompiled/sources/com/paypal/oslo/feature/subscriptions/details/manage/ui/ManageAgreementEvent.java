package com.paypal.oslo.feature.subscriptions.details.manage.ui;

@kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\bv\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005À\u0006\u0003"}, d2 = {"Lcom/paypal/oslo/feature/subscriptions/details/manage/ui/ManageAgreementEvent;", "", "Manage", "Disable", "Lcom/paypal/oslo/feature/subscriptions/details/manage/ui/ManageAgreementEvent$Disable;", "Lcom/paypal/oslo/feature/subscriptions/details/manage/ui/ManageAgreementEvent$Manage;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes15.dex */
public interface ManageAgreementEvent {

    @kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\bv\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005À\u0006\u0003"}, d2 = {"Lcom/paypal/oslo/feature/subscriptions/details/manage/ui/ManageAgreementEvent$Manage;", "Lcom/paypal/oslo/feature/subscriptions/details/manage/ui/ManageAgreementEvent;", "OnUnlinkClicked", "OnCloseClicked", "Lcom/paypal/oslo/feature/subscriptions/details/manage/ui/ManageAgreementEvent$Manage$OnCloseClicked;", "Lcom/paypal/oslo/feature/subscriptions/details/manage/ui/ManageAgreementEvent$Manage$OnUnlinkClicked;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public interface Manage extends com.paypal.oslo.feature.subscriptions.details.manage.ui.ManageAgreementEvent {

        @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/subscriptions/details/manage/ui/ManageAgreementEvent$Manage$OnUnlinkClicked;", "Lcom/paypal/oslo/feature/subscriptions/details/manage/ui/ManageAgreementEvent$Manage;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final /* data */ class OnUnlinkClicked implements com.paypal.oslo.feature.subscriptions.details.manage.ui.ManageAgreementEvent.Manage {
            public static final int $stable = 0;
            public static final com.paypal.oslo.feature.subscriptions.details.manage.ui.ManageAgreementEvent.Manage.OnUnlinkClicked INSTANCE = new com.paypal.oslo.feature.subscriptions.details.manage.ui.ManageAgreementEvent.Manage.OnUnlinkClicked();

            public final int hashCode() {
                return 2075019199;
            }

            private OnUnlinkClicked() {
            }

            public final java.lang.String toString() {
                return "OnUnlinkClicked";
            }

            public final boolean equals(java.lang.Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof com.paypal.oslo.feature.subscriptions.details.manage.ui.ManageAgreementEvent.Manage.OnUnlinkClicked)) {
                    return false;
                }
                return true;
            }
        }

        @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/subscriptions/details/manage/ui/ManageAgreementEvent$Manage$OnCloseClicked;", "Lcom/paypal/oslo/feature/subscriptions/details/manage/ui/ManageAgreementEvent$Manage;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final /* data */ class OnCloseClicked implements com.paypal.oslo.feature.subscriptions.details.manage.ui.ManageAgreementEvent.Manage {
            public static final int $stable = 0;
            public static final com.paypal.oslo.feature.subscriptions.details.manage.ui.ManageAgreementEvent.Manage.OnCloseClicked INSTANCE = new com.paypal.oslo.feature.subscriptions.details.manage.ui.ManageAgreementEvent.Manage.OnCloseClicked();

            public final int hashCode() {
                return -1808434044;
            }

            private OnCloseClicked() {
            }

            public final java.lang.String toString() {
                return "OnCloseClicked";
            }

            public final boolean equals(java.lang.Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof com.paypal.oslo.feature.subscriptions.details.manage.ui.ManageAgreementEvent.Manage.OnCloseClicked)) {
                    return false;
                }
                return true;
            }
        }
    }

    @kotlin.Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\bv\u0018\u00002\u00020\u0001:\u0005\u0002\u0003\u0004\u0005\u0006\u0082\u0001\u0005\u0007\b\t\n\u000bÀ\u0006\u0003"}, d2 = {"Lcom/paypal/oslo/feature/subscriptions/details/manage/ui/ManageAgreementEvent$Disable;", "Lcom/paypal/oslo/feature/subscriptions/details/manage/ui/ManageAgreementEvent;", "OnDisableAgreementConfirmed", "OnDisableAgreementCanceled", "OnBackButtonPressed", "OnTryAgainClicked", "OnCloseClicked", "Lcom/paypal/oslo/feature/subscriptions/details/manage/ui/ManageAgreementEvent$Disable$OnBackButtonPressed;", "Lcom/paypal/oslo/feature/subscriptions/details/manage/ui/ManageAgreementEvent$Disable$OnCloseClicked;", "Lcom/paypal/oslo/feature/subscriptions/details/manage/ui/ManageAgreementEvent$Disable$OnDisableAgreementCanceled;", "Lcom/paypal/oslo/feature/subscriptions/details/manage/ui/ManageAgreementEvent$Disable$OnDisableAgreementConfirmed;", "Lcom/paypal/oslo/feature/subscriptions/details/manage/ui/ManageAgreementEvent$Disable$OnTryAgainClicked;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public interface Disable extends com.paypal.oslo.feature.subscriptions.details.manage.ui.ManageAgreementEvent {

        @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/subscriptions/details/manage/ui/ManageAgreementEvent$Disable$OnDisableAgreementConfirmed;", "Lcom/paypal/oslo/feature/subscriptions/details/manage/ui/ManageAgreementEvent$Disable;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final /* data */ class OnDisableAgreementConfirmed implements com.paypal.oslo.feature.subscriptions.details.manage.ui.ManageAgreementEvent.Disable {
            public static final int $stable = 0;
            public static final com.paypal.oslo.feature.subscriptions.details.manage.ui.ManageAgreementEvent.Disable.OnDisableAgreementConfirmed INSTANCE = new com.paypal.oslo.feature.subscriptions.details.manage.ui.ManageAgreementEvent.Disable.OnDisableAgreementConfirmed();

            public final int hashCode() {
                return 2107066789;
            }

            private OnDisableAgreementConfirmed() {
            }

            public final java.lang.String toString() {
                return "OnDisableAgreementConfirmed";
            }

            public final boolean equals(java.lang.Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof com.paypal.oslo.feature.subscriptions.details.manage.ui.ManageAgreementEvent.Disable.OnDisableAgreementConfirmed)) {
                    return false;
                }
                return true;
            }
        }

        @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/subscriptions/details/manage/ui/ManageAgreementEvent$Disable$OnDisableAgreementCanceled;", "Lcom/paypal/oslo/feature/subscriptions/details/manage/ui/ManageAgreementEvent$Disable;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final /* data */ class OnDisableAgreementCanceled implements com.paypal.oslo.feature.subscriptions.details.manage.ui.ManageAgreementEvent.Disable {
            public static final int $stable = 0;
            public static final com.paypal.oslo.feature.subscriptions.details.manage.ui.ManageAgreementEvent.Disable.OnDisableAgreementCanceled INSTANCE = new com.paypal.oslo.feature.subscriptions.details.manage.ui.ManageAgreementEvent.Disable.OnDisableAgreementCanceled();

            public final int hashCode() {
                return -1830380141;
            }

            private OnDisableAgreementCanceled() {
            }

            public final java.lang.String toString() {
                return "OnDisableAgreementCanceled";
            }

            public final boolean equals(java.lang.Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof com.paypal.oslo.feature.subscriptions.details.manage.ui.ManageAgreementEvent.Disable.OnDisableAgreementCanceled)) {
                    return false;
                }
                return true;
            }
        }

        @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/subscriptions/details/manage/ui/ManageAgreementEvent$Disable$OnBackButtonPressed;", "Lcom/paypal/oslo/feature/subscriptions/details/manage/ui/ManageAgreementEvent$Disable;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final /* data */ class OnBackButtonPressed implements com.paypal.oslo.feature.subscriptions.details.manage.ui.ManageAgreementEvent.Disable {
            public static final int $stable = 0;
            public static final com.paypal.oslo.feature.subscriptions.details.manage.ui.ManageAgreementEvent.Disable.OnBackButtonPressed INSTANCE = new com.paypal.oslo.feature.subscriptions.details.manage.ui.ManageAgreementEvent.Disable.OnBackButtonPressed();

            public final int hashCode() {
                return 598858513;
            }

            private OnBackButtonPressed() {
            }

            public final java.lang.String toString() {
                return "OnBackButtonPressed";
            }

            public final boolean equals(java.lang.Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof com.paypal.oslo.feature.subscriptions.details.manage.ui.ManageAgreementEvent.Disable.OnBackButtonPressed)) {
                    return false;
                }
                return true;
            }
        }

        @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/subscriptions/details/manage/ui/ManageAgreementEvent$Disable$OnTryAgainClicked;", "Lcom/paypal/oslo/feature/subscriptions/details/manage/ui/ManageAgreementEvent$Disable;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final /* data */ class OnTryAgainClicked implements com.paypal.oslo.feature.subscriptions.details.manage.ui.ManageAgreementEvent.Disable {
            public static final int $stable = 0;
            public static final com.paypal.oslo.feature.subscriptions.details.manage.ui.ManageAgreementEvent.Disable.OnTryAgainClicked INSTANCE = new com.paypal.oslo.feature.subscriptions.details.manage.ui.ManageAgreementEvent.Disable.OnTryAgainClicked();

            public final int hashCode() {
                return 1930618922;
            }

            private OnTryAgainClicked() {
            }

            public final java.lang.String toString() {
                return "OnTryAgainClicked";
            }

            public final boolean equals(java.lang.Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof com.paypal.oslo.feature.subscriptions.details.manage.ui.ManageAgreementEvent.Disable.OnTryAgainClicked)) {
                    return false;
                }
                return true;
            }
        }

        @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/subscriptions/details/manage/ui/ManageAgreementEvent$Disable$OnCloseClicked;", "Lcom/paypal/oslo/feature/subscriptions/details/manage/ui/ManageAgreementEvent$Disable;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final /* data */ class OnCloseClicked implements com.paypal.oslo.feature.subscriptions.details.manage.ui.ManageAgreementEvent.Disable {
            public static final int $stable = 0;
            public static final com.paypal.oslo.feature.subscriptions.details.manage.ui.ManageAgreementEvent.Disable.OnCloseClicked INSTANCE = new com.paypal.oslo.feature.subscriptions.details.manage.ui.ManageAgreementEvent.Disable.OnCloseClicked();

            public final int hashCode() {
                return -1062835737;
            }

            private OnCloseClicked() {
            }

            public final java.lang.String toString() {
                return "OnCloseClicked";
            }

            public final boolean equals(java.lang.Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof com.paypal.oslo.feature.subscriptions.details.manage.ui.ManageAgreementEvent.Disable.OnCloseClicked)) {
                    return false;
                }
                return true;
            }
        }
    }
}
