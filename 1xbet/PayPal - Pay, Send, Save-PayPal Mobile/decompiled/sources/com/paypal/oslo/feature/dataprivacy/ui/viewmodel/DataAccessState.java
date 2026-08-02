package com.paypal.oslo.feature.dataprivacy.ui.viewmodel;

@kotlin.Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\b6\u0018\u00002\u00020\u0001:\u0005\u0004\u0005\u0006\u0007\bB\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0005\t\n\u000b\f\r"}, d2 = {"Lcom/paypal/oslo/feature/dataprivacy/ui/viewmodel/DataAccessState;", "", "<init>", "()V", "Initial", "Loading", "Success", "Error", "PartialSuccess", "Lcom/paypal/oslo/feature/dataprivacy/ui/viewmodel/DataAccessState$Error;", "Lcom/paypal/oslo/feature/dataprivacy/ui/viewmodel/DataAccessState$Initial;", "Lcom/paypal/oslo/feature/dataprivacy/ui/viewmodel/DataAccessState$Loading;", "Lcom/paypal/oslo/feature/dataprivacy/ui/viewmodel/DataAccessState$PartialSuccess;", "Lcom/paypal/oslo/feature/dataprivacy/ui/viewmodel/DataAccessState$Success;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes12.dex */
public abstract class DataAccessState {
    public static final int $stable = 0;

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/dataprivacy/ui/viewmodel/DataAccessState$Initial;", "Lcom/paypal/oslo/feature/dataprivacy/ui/viewmodel/DataAccessState;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class Initial extends com.paypal.oslo.feature.dataprivacy.ui.viewmodel.DataAccessState {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.dataprivacy.ui.viewmodel.DataAccessState.Initial INSTANCE = new com.paypal.oslo.feature.dataprivacy.ui.viewmodel.DataAccessState.Initial();

        public final int hashCode() {
            return -2067490314;
        }

        private Initial() {
            super(null);
        }

        public final java.lang.String toString() {
            return "Initial";
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.dataprivacy.ui.viewmodel.DataAccessState.Initial)) {
                return false;
            }
            return true;
        }
    }

    private DataAccessState() {
    }

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/dataprivacy/ui/viewmodel/DataAccessState$Loading;", "Lcom/paypal/oslo/feature/dataprivacy/ui/viewmodel/DataAccessState;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class Loading extends com.paypal.oslo.feature.dataprivacy.ui.viewmodel.DataAccessState {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.dataprivacy.ui.viewmodel.DataAccessState.Loading INSTANCE = new com.paypal.oslo.feature.dataprivacy.ui.viewmodel.DataAccessState.Loading();

        public final int hashCode() {
            return 615785454;
        }

        private Loading() {
            super(null);
        }

        public final java.lang.String toString() {
            return "Loading";
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.dataprivacy.ui.viewmodel.DataAccessState.Loading)) {
                return false;
            }
            return true;
        }
    }

    @kotlin.Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u0015\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0016\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0003¢\u0006\u0004\b\u0007\u0010\bJ \u0010\t\u001a\u00020\u00002\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0001¢\u0006\u0004\b\t\u0010\nJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u000bHÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0011\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015R\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0007¢\u0006\f\n\u0004\b\u0004\u0010\u0016\u001a\u0004\b\u0017\u0010\b"}, d2 = {"Lcom/paypal/oslo/feature/dataprivacy/ui/viewmodel/DataAccessState$Success;", "Lcom/paypal/oslo/feature/dataprivacy/ui/viewmodel/DataAccessState;", "", "Lcom/paypal/oslo/feature/dataprivacy/domain/model/DARRequest;", "requests", "<init>", "(Ljava/util/List;)V", "component1", "()Ljava/util/List;", "copy", "(Ljava/util/List;)Lcom/paypal/oslo/feature/dataprivacy/ui/viewmodel/DataAccessState$Success;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Ljava/util/List;", "getRequests"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class Success extends com.paypal.oslo.feature.dataprivacy.ui.viewmodel.DataAccessState {
        public static final int $stable = 8;
        private final java.util.List<com.paypal.oslo.feature.dataprivacy.domain.model.DARRequest> requests;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Success(java.util.List<com.paypal.oslo.feature.dataprivacy.domain.model.DARRequest> list) {
            super(null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list, "");
            this.requests = list;
        }

        public final java.util.List<com.paypal.oslo.feature.dataprivacy.domain.model.DARRequest> getRequests() {
            return this.requests;
        }

        public final java.lang.String toString() {
            java.util.List<com.paypal.oslo.feature.dataprivacy.domain.model.DARRequest> list = this.requests;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Success(requests=");
            sb.append(list);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return this.requests.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof com.paypal.oslo.feature.dataprivacy.ui.viewmodel.DataAccessState.Success) && kotlin.jvm.internal.Intrinsics.areEqual(this.requests, ((com.paypal.oslo.feature.dataprivacy.ui.viewmodel.DataAccessState.Success) other).requests);
        }

        public final com.paypal.oslo.feature.dataprivacy.ui.viewmodel.DataAccessState.Success copy(java.util.List<com.paypal.oslo.feature.dataprivacy.domain.model.DARRequest> requests) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(requests, "");
            return new com.paypal.oslo.feature.dataprivacy.ui.viewmodel.DataAccessState.Success(requests);
        }

        public final java.util.List<com.paypal.oslo.feature.dataprivacy.domain.model.DARRequest> component1() {
            return this.requests;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ com.paypal.oslo.feature.dataprivacy.ui.viewmodel.DataAccessState.Success copy$default(com.paypal.oslo.feature.dataprivacy.ui.viewmodel.DataAccessState.Success success, java.util.List list, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                list = success.requests;
            }
            return success.copy(list);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0015\u001a\u0004\b\u0016\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/dataprivacy/ui/viewmodel/DataAccessState$Error;", "Lcom/paypal/oslo/feature/dataprivacy/ui/viewmodel/DataAccessState;", "Lcom/paypal/oslo/feature/dataprivacy/domain/error/DataPrivacyError;", "error", "<init>", "(Lcom/paypal/oslo/feature/dataprivacy/domain/error/DataPrivacyError;)V", "component1", "()Lcom/paypal/oslo/feature/dataprivacy/domain/error/DataPrivacyError;", "copy", "(Lcom/paypal/oslo/feature/dataprivacy/domain/error/DataPrivacyError;)Lcom/paypal/oslo/feature/dataprivacy/ui/viewmodel/DataAccessState$Error;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lcom/paypal/oslo/feature/dataprivacy/domain/error/DataPrivacyError;", "getError"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class Error extends com.paypal.oslo.feature.dataprivacy.ui.viewmodel.DataAccessState {
        public static final int $stable = 0;
        private final com.paypal.oslo.feature.dataprivacy.domain.error.DataPrivacyError error;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Error(com.paypal.oslo.feature.dataprivacy.domain.error.DataPrivacyError dataPrivacyError) {
            super(null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(dataPrivacyError, "");
            this.error = dataPrivacyError;
        }

        public final com.paypal.oslo.feature.dataprivacy.domain.error.DataPrivacyError getError() {
            return this.error;
        }

        public final java.lang.String toString() {
            com.paypal.oslo.feature.dataprivacy.domain.error.DataPrivacyError dataPrivacyError = this.error;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Error(error=");
            sb.append(dataPrivacyError);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return this.error.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof com.paypal.oslo.feature.dataprivacy.ui.viewmodel.DataAccessState.Error) && kotlin.jvm.internal.Intrinsics.areEqual(this.error, ((com.paypal.oslo.feature.dataprivacy.ui.viewmodel.DataAccessState.Error) other).error);
        }

        public final com.paypal.oslo.feature.dataprivacy.ui.viewmodel.DataAccessState.Error copy(com.paypal.oslo.feature.dataprivacy.domain.error.DataPrivacyError error) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(error, "");
            return new com.paypal.oslo.feature.dataprivacy.ui.viewmodel.DataAccessState.Error(error);
        }

        /* renamed from: component1, reason: from getter */
        public final com.paypal.oslo.feature.dataprivacy.domain.error.DataPrivacyError getError() {
            return this.error;
        }

        public static /* synthetic */ com.paypal.oslo.feature.dataprivacy.ui.viewmodel.DataAccessState.Error copy$default(com.paypal.oslo.feature.dataprivacy.ui.viewmodel.DataAccessState.Error error, com.paypal.oslo.feature.dataprivacy.domain.error.DataPrivacyError dataPrivacyError, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                dataPrivacyError = error.error;
            }
            return error.copy(dataPrivacyError);
        }
    }

    @kotlin.Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B\u001d\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0016\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0003¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b\u000b\u0010\fJ*\u0010\r\u001a\u00020\u00002\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u0005HÆ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u000fHÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0015\u001a\u00020\u0014HÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0018\u001a\u00020\u0017HÖ\u0001¢\u0006\u0004\b\u0018\u0010\u0019R\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0007¢\u0006\f\n\u0004\b\u0004\u0010\u001a\u001a\u0004\b\u001b\u0010\nR\u001a\u0010\u0006\u001a\u00020\u00058\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u001c\u001a\u0004\b\u001d\u0010\f"}, d2 = {"Lcom/paypal/oslo/feature/dataprivacy/ui/viewmodel/DataAccessState$PartialSuccess;", "Lcom/paypal/oslo/feature/dataprivacy/ui/viewmodel/DataAccessState;", "", "Lcom/paypal/oslo/feature/dataprivacy/domain/model/DARRequest;", com.google.firebase.messaging.Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "Lcom/paypal/oslo/feature/dataprivacy/domain/error/DataPrivacyError;", "error", "<init>", "(Ljava/util/List;Lcom/paypal/oslo/feature/dataprivacy/domain/error/DataPrivacyError;)V", "component1", "()Ljava/util/List;", "component2", "()Lcom/paypal/oslo/feature/dataprivacy/domain/error/DataPrivacyError;", "copy", "(Ljava/util/List;Lcom/paypal/oslo/feature/dataprivacy/domain/error/DataPrivacyError;)Lcom/paypal/oslo/feature/dataprivacy/ui/viewmodel/DataAccessState$PartialSuccess;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Ljava/util/List;", "getData", "Lcom/paypal/oslo/feature/dataprivacy/domain/error/DataPrivacyError;", "getError"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class PartialSuccess extends com.paypal.oslo.feature.dataprivacy.ui.viewmodel.DataAccessState {
        public static final int $stable = 8;
        private final java.util.List<com.paypal.oslo.feature.dataprivacy.domain.model.DARRequest> data;
        private final com.paypal.oslo.feature.dataprivacy.domain.error.DataPrivacyError error;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public PartialSuccess(java.util.List<com.paypal.oslo.feature.dataprivacy.domain.model.DARRequest> list, com.paypal.oslo.feature.dataprivacy.domain.error.DataPrivacyError dataPrivacyError) {
            super(null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(dataPrivacyError, "");
            this.data = list;
            this.error = dataPrivacyError;
        }

        public final java.util.List<com.paypal.oslo.feature.dataprivacy.domain.model.DARRequest> getData() {
            return this.data;
        }

        public final com.paypal.oslo.feature.dataprivacy.domain.error.DataPrivacyError getError() {
            return this.error;
        }

        public final java.lang.String toString() {
            java.util.List<com.paypal.oslo.feature.dataprivacy.domain.model.DARRequest> list = this.data;
            com.paypal.oslo.feature.dataprivacy.domain.error.DataPrivacyError dataPrivacyError = this.error;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("PartialSuccess(data=");
            sb.append(list);
            sb.append(", error=");
            sb.append(dataPrivacyError);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return (this.data.hashCode() * 31) + this.error.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.dataprivacy.ui.viewmodel.DataAccessState.PartialSuccess)) {
                return false;
            }
            com.paypal.oslo.feature.dataprivacy.ui.viewmodel.DataAccessState.PartialSuccess partialSuccess = (com.paypal.oslo.feature.dataprivacy.ui.viewmodel.DataAccessState.PartialSuccess) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.data, partialSuccess.data) && kotlin.jvm.internal.Intrinsics.areEqual(this.error, partialSuccess.error);
        }

        public final com.paypal.oslo.feature.dataprivacy.ui.viewmodel.DataAccessState.PartialSuccess copy(java.util.List<com.paypal.oslo.feature.dataprivacy.domain.model.DARRequest> data, com.paypal.oslo.feature.dataprivacy.domain.error.DataPrivacyError error) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(data, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(error, "");
            return new com.paypal.oslo.feature.dataprivacy.ui.viewmodel.DataAccessState.PartialSuccess(data, error);
        }

        /* renamed from: component2, reason: from getter */
        public final com.paypal.oslo.feature.dataprivacy.domain.error.DataPrivacyError getError() {
            return this.error;
        }

        public final java.util.List<com.paypal.oslo.feature.dataprivacy.domain.model.DARRequest> component1() {
            return this.data;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ com.paypal.oslo.feature.dataprivacy.ui.viewmodel.DataAccessState.PartialSuccess copy$default(com.paypal.oslo.feature.dataprivacy.ui.viewmodel.DataAccessState.PartialSuccess partialSuccess, java.util.List list, com.paypal.oslo.feature.dataprivacy.domain.error.DataPrivacyError dataPrivacyError, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                list = partialSuccess.data;
            }
            if ((i & 2) != 0) {
                dataPrivacyError = partialSuccess.error;
            }
            return partialSuccess.copy(list, dataPrivacyError);
        }
    }

    public /* synthetic */ DataAccessState(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }
}
