package com.paypal.oslo.feature.consumerprivacy.ui.state;

@kotlin.Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\bp\u0018\u00002\u00020\u0001:\u0005\u0002\u0003\u0004\u0005\u0006\u0082\u0001\u0005\u0007\b\t\n\u000bÀ\u0006\u0003"}, d2 = {"Lcom/paypal/oslo/feature/consumerprivacy/ui/state/ConnectedAppsOperationResult;", "", "GenericError", "UnlinkAndDeleteSuccess", "UnlinkSuccess", "UnlinkDeleteFailed", "UnlinkFailed", "Lcom/paypal/oslo/feature/consumerprivacy/ui/state/ConnectedAppsOperationResult$GenericError;", "Lcom/paypal/oslo/feature/consumerprivacy/ui/state/ConnectedAppsOperationResult$UnlinkAndDeleteSuccess;", "Lcom/paypal/oslo/feature/consumerprivacy/ui/state/ConnectedAppsOperationResult$UnlinkDeleteFailed;", "Lcom/paypal/oslo/feature/consumerprivacy/ui/state/ConnectedAppsOperationResult$UnlinkFailed;", "Lcom/paypal/oslo/feature/consumerprivacy/ui/state/ConnectedAppsOperationResult$UnlinkSuccess;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes12.dex */
public interface ConnectedAppsOperationResult {

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/consumerprivacy/ui/state/ConnectedAppsOperationResult$GenericError;", "Lcom/paypal/oslo/feature/consumerprivacy/ui/state/ConnectedAppsOperationResult;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class GenericError implements com.paypal.oslo.feature.consumerprivacy.ui.state.ConnectedAppsOperationResult {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.consumerprivacy.ui.state.ConnectedAppsOperationResult.GenericError INSTANCE = new com.paypal.oslo.feature.consumerprivacy.ui.state.ConnectedAppsOperationResult.GenericError();

        public final int hashCode() {
            return -1423064948;
        }

        private GenericError() {
        }

        public final java.lang.String toString() {
            return "GenericError";
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.consumerprivacy.ui.state.ConnectedAppsOperationResult.GenericError)) {
                return false;
            }
            return true;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/consumerprivacy/ui/state/ConnectedAppsOperationResult$UnlinkAndDeleteSuccess;", "Lcom/paypal/oslo/feature/consumerprivacy/ui/state/ConnectedAppsOperationResult;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class UnlinkAndDeleteSuccess implements com.paypal.oslo.feature.consumerprivacy.ui.state.ConnectedAppsOperationResult {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.consumerprivacy.ui.state.ConnectedAppsOperationResult.UnlinkAndDeleteSuccess INSTANCE = new com.paypal.oslo.feature.consumerprivacy.ui.state.ConnectedAppsOperationResult.UnlinkAndDeleteSuccess();

        public final int hashCode() {
            return -71396401;
        }

        private UnlinkAndDeleteSuccess() {
        }

        public final java.lang.String toString() {
            return "UnlinkAndDeleteSuccess";
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.consumerprivacy.ui.state.ConnectedAppsOperationResult.UnlinkAndDeleteSuccess)) {
                return false;
            }
            return true;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/consumerprivacy/ui/state/ConnectedAppsOperationResult$UnlinkSuccess;", "Lcom/paypal/oslo/feature/consumerprivacy/ui/state/ConnectedAppsOperationResult;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class UnlinkSuccess implements com.paypal.oslo.feature.consumerprivacy.ui.state.ConnectedAppsOperationResult {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.consumerprivacy.ui.state.ConnectedAppsOperationResult.UnlinkSuccess INSTANCE = new com.paypal.oslo.feature.consumerprivacy.ui.state.ConnectedAppsOperationResult.UnlinkSuccess();

        public final int hashCode() {
            return 866847669;
        }

        private UnlinkSuccess() {
        }

        public final java.lang.String toString() {
            return "UnlinkSuccess";
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.consumerprivacy.ui.state.ConnectedAppsOperationResult.UnlinkSuccess)) {
                return false;
            }
            return true;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/consumerprivacy/ui/state/ConnectedAppsOperationResult$UnlinkDeleteFailed;", "Lcom/paypal/oslo/feature/consumerprivacy/ui/state/ConnectedAppsOperationResult;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class UnlinkDeleteFailed implements com.paypal.oslo.feature.consumerprivacy.ui.state.ConnectedAppsOperationResult {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.consumerprivacy.ui.state.ConnectedAppsOperationResult.UnlinkDeleteFailed INSTANCE = new com.paypal.oslo.feature.consumerprivacy.ui.state.ConnectedAppsOperationResult.UnlinkDeleteFailed();

        public final int hashCode() {
            return 1092848982;
        }

        private UnlinkDeleteFailed() {
        }

        public final java.lang.String toString() {
            return "UnlinkDeleteFailed";
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.consumerprivacy.ui.state.ConnectedAppsOperationResult.UnlinkDeleteFailed)) {
                return false;
            }
            return true;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/consumerprivacy/ui/state/ConnectedAppsOperationResult$UnlinkFailed;", "Lcom/paypal/oslo/feature/consumerprivacy/ui/state/ConnectedAppsOperationResult;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class UnlinkFailed implements com.paypal.oslo.feature.consumerprivacy.ui.state.ConnectedAppsOperationResult {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.consumerprivacy.ui.state.ConnectedAppsOperationResult.UnlinkFailed INSTANCE = new com.paypal.oslo.feature.consumerprivacy.ui.state.ConnectedAppsOperationResult.UnlinkFailed();

        public final int hashCode() {
            return 1438616139;
        }

        private UnlinkFailed() {
        }

        public final java.lang.String toString() {
            return "UnlinkFailed";
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.consumerprivacy.ui.state.ConnectedAppsOperationResult.UnlinkFailed)) {
                return false;
            }
            return true;
        }
    }
}
