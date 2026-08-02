package com.paypal.oslo.feature.taxanddocumentcenter.ui.download.model;

@kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\b0\u0018\u00002\u00020\u0001:\u0003\u0004\u0005\u0006B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0003\u0007\b\t"}, d2 = {"Lcom/paypal/oslo/feature/taxanddocumentcenter/ui/download/model/DownloadUiState;", "", "<init>", "()V", "Idle", "Downloading", "Error", "Lcom/paypal/oslo/feature/taxanddocumentcenter/ui/download/model/DownloadUiState$Downloading;", "Lcom/paypal/oslo/feature/taxanddocumentcenter/ui/download/model/DownloadUiState$Error;", "Lcom/paypal/oslo/feature/taxanddocumentcenter/ui/download/model/DownloadUiState$Idle;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes15.dex */
public abstract class DownloadUiState {
    public static final int $stable = 0;

    private DownloadUiState() {
    }

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/taxanddocumentcenter/ui/download/model/DownloadUiState$Idle;", "Lcom/paypal/oslo/feature/taxanddocumentcenter/ui/download/model/DownloadUiState;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class Idle extends com.paypal.oslo.feature.taxanddocumentcenter.ui.download.model.DownloadUiState {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.taxanddocumentcenter.ui.download.model.DownloadUiState.Idle INSTANCE = new com.paypal.oslo.feature.taxanddocumentcenter.ui.download.model.DownloadUiState.Idle();

        public final int hashCode() {
            return -1177974529;
        }

        private Idle() {
            super(null);
        }

        public final java.lang.String toString() {
            return "Idle";
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.taxanddocumentcenter.ui.download.model.DownloadUiState.Idle)) {
                return false;
            }
            return true;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0007R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0013\u001a\u0004\b\u0014\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/taxanddocumentcenter/ui/download/model/DownloadUiState$Downloading;", "Lcom/paypal/oslo/feature/taxanddocumentcenter/ui/download/model/DownloadUiState;", "", "downloadUrl", "<init>", "(Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "copy", "(Ljava/lang/String;)Lcom/paypal/oslo/feature/taxanddocumentcenter/ui/download/model/DownloadUiState$Downloading;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getDownloadUrl"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class Downloading extends com.paypal.oslo.feature.taxanddocumentcenter.ui.download.model.DownloadUiState {
        public static final int $stable = 0;
        private final java.lang.String downloadUrl;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Downloading(java.lang.String str) {
            super(null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            this.downloadUrl = str;
        }

        public final java.lang.String getDownloadUrl() {
            return this.downloadUrl;
        }

        public final java.lang.String toString() {
            java.lang.String str = this.downloadUrl;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Downloading(downloadUrl=");
            sb.append(str);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return this.downloadUrl.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof com.paypal.oslo.feature.taxanddocumentcenter.ui.download.model.DownloadUiState.Downloading) && kotlin.jvm.internal.Intrinsics.areEqual(this.downloadUrl, ((com.paypal.oslo.feature.taxanddocumentcenter.ui.download.model.DownloadUiState.Downloading) other).downloadUrl);
        }

        public final com.paypal.oslo.feature.taxanddocumentcenter.ui.download.model.DownloadUiState.Downloading copy(java.lang.String downloadUrl) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(downloadUrl, "");
            return new com.paypal.oslo.feature.taxanddocumentcenter.ui.download.model.DownloadUiState.Downloading(downloadUrl);
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.String getDownloadUrl() {
            return this.downloadUrl;
        }

        public static /* synthetic */ com.paypal.oslo.feature.taxanddocumentcenter.ui.download.model.DownloadUiState.Downloading copy$default(com.paypal.oslo.feature.taxanddocumentcenter.ui.download.model.DownloadUiState.Downloading downloading, java.lang.String str, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = downloading.downloadUrl;
            }
            return downloading.copy(str);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\u0007\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\t\u0010\bJ$\u0010\n\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0014\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0014\u0010\bR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0015\u001a\u0004\b\u0016\u0010\bR\u001a\u0010\u0004\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0015\u001a\u0004\b\u0017\u0010\b"}, d2 = {"Lcom/paypal/oslo/feature/taxanddocumentcenter/ui/download/model/DownloadUiState$Error;", "Lcom/paypal/oslo/feature/taxanddocumentcenter/ui/download/model/DownloadUiState;", "", "downloadUrl", "errorMessage", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "component2", "copy", "(Ljava/lang/String;Ljava/lang/String;)Lcom/paypal/oslo/feature/taxanddocumentcenter/ui/download/model/DownloadUiState$Error;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getDownloadUrl", "getErrorMessage"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class Error extends com.paypal.oslo.feature.taxanddocumentcenter.ui.download.model.DownloadUiState {
        public static final int $stable = 0;
        private final java.lang.String downloadUrl;
        private final java.lang.String errorMessage;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Error(java.lang.String str, java.lang.String str2) {
            super(null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str2, "");
            this.downloadUrl = str;
            this.errorMessage = str2;
        }

        public final java.lang.String getDownloadUrl() {
            return this.downloadUrl;
        }

        public final java.lang.String getErrorMessage() {
            return this.errorMessage;
        }

        public final java.lang.String toString() {
            java.lang.String str = this.downloadUrl;
            java.lang.String str2 = this.errorMessage;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Error(downloadUrl=");
            sb.append(str);
            sb.append(", errorMessage=");
            sb.append(str2);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return (this.downloadUrl.hashCode() * 31) + this.errorMessage.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.taxanddocumentcenter.ui.download.model.DownloadUiState.Error)) {
                return false;
            }
            com.paypal.oslo.feature.taxanddocumentcenter.ui.download.model.DownloadUiState.Error error = (com.paypal.oslo.feature.taxanddocumentcenter.ui.download.model.DownloadUiState.Error) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.downloadUrl, error.downloadUrl) && kotlin.jvm.internal.Intrinsics.areEqual(this.errorMessage, error.errorMessage);
        }

        public final com.paypal.oslo.feature.taxanddocumentcenter.ui.download.model.DownloadUiState.Error copy(java.lang.String downloadUrl, java.lang.String errorMessage) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(downloadUrl, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(errorMessage, "");
            return new com.paypal.oslo.feature.taxanddocumentcenter.ui.download.model.DownloadUiState.Error(downloadUrl, errorMessage);
        }

        /* renamed from: component2, reason: from getter */
        public final java.lang.String getErrorMessage() {
            return this.errorMessage;
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.String getDownloadUrl() {
            return this.downloadUrl;
        }

        public static /* synthetic */ com.paypal.oslo.feature.taxanddocumentcenter.ui.download.model.DownloadUiState.Error copy$default(com.paypal.oslo.feature.taxanddocumentcenter.ui.download.model.DownloadUiState.Error error, java.lang.String str, java.lang.String str2, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = error.downloadUrl;
            }
            if ((i & 2) != 0) {
                str2 = error.errorMessage;
            }
            return error.copy(str, str2);
        }
    }

    public /* synthetic */ DownloadUiState(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }
}
