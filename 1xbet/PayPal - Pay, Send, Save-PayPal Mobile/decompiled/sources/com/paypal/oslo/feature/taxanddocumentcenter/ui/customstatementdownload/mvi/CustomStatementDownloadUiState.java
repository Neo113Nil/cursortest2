package com.paypal.oslo.feature.taxanddocumentcenter.ui.customstatementdownload.mvi;

@kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0018\u0002\b0\u0018\u00002\u00020\u0001:\u0001\nB\u0011\b\u0004\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u001a\u0010\u0006\u001a\u00020\u00028\u0017X\u0096\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\t\u0082\u0001\u0001\u000b"}, d2 = {"Lcom/paypal/oslo/feature/taxanddocumentcenter/ui/customstatementdownload/mvi/CustomStatementDownloadUiState;", "Lcom/paypal/oslo/core/mvi/UiState;", "", "p0", "<init>", "(Ljava/lang/String;)V", "name", "Ljava/lang/String;", "getName", "()Ljava/lang/String;", "Content", "Lcom/paypal/oslo/feature/taxanddocumentcenter/ui/customstatementdownload/mvi/CustomStatementDownloadUiState$Content;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes15.dex */
public abstract class CustomStatementDownloadUiState implements com.paypal.oslo.core.mvi.UiState {
    public static final int $stable = 0;
    private final java.lang.String name;

    private CustomStatementDownloadUiState(java.lang.String str) {
        this.name = str;
    }

    @Override // com.paypal.oslo.core.mvi.UiState
    public java.lang.String getName() {
        return this.name;
    }

    @kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u000e\b\u0086\b\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000b\u0010\nJ\u0010\u0010\f\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b\f\u0010\rJ.\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u0005HÆ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0016\u001a\u00020\u0015HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0018\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0018\u0010\nR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0019\u001a\u0004\b\u001a\u0010\nR\u001a\u0010\u0004\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0019\u001a\u0004\b\u001b\u0010\nR\u001a\u0010\u0006\u001a\u00020\u00058\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u001c\u001a\u0004\b\u001d\u0010\rR\u0011\u0010\u001e\u001a\u00020\u00128G¢\u0006\u0006\u001a\u0004\b\u001e\u0010\u001fR\u0011\u0010!\u001a\u00020\u00128G¢\u0006\u0006\u001a\u0004\b \u0010\u001fR\u0013\u0010#\u001a\u0004\u0018\u00010\u00028G¢\u0006\u0006\u001a\u0004\b\"\u0010\n"}, d2 = {"Lcom/paypal/oslo/feature/taxanddocumentcenter/ui/customstatementdownload/mvi/CustomStatementDownloadUiState$Content;", "Lcom/paypal/oslo/feature/taxanddocumentcenter/ui/customstatementdownload/mvi/CustomStatementDownloadUiState;", "", "fileName", "source", "Lcom/paypal/oslo/feature/taxanddocumentcenter/ui/download/model/DownloadUiState;", "downloadState", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lcom/paypal/oslo/feature/taxanddocumentcenter/ui/download/model/DownloadUiState;)V", "component1", "()Ljava/lang/String;", "component2", "component3", "()Lcom/paypal/oslo/feature/taxanddocumentcenter/ui/download/model/DownloadUiState;", "copy", "(Ljava/lang/String;Ljava/lang/String;Lcom/paypal/oslo/feature/taxanddocumentcenter/ui/download/model/DownloadUiState;)Lcom/paypal/oslo/feature/taxanddocumentcenter/ui/customstatementdownload/mvi/CustomStatementDownloadUiState$Content;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getFileName", "getSource", "Lcom/paypal/oslo/feature/taxanddocumentcenter/ui/download/model/DownloadUiState;", "getDownloadState", "isDownloading", "()Z", "getHasError", "hasError", "getErrorMessage", "errorMessage"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class Content extends com.paypal.oslo.feature.taxanddocumentcenter.ui.customstatementdownload.mvi.CustomStatementDownloadUiState {
        public static final int $stable = 0;
        private final com.paypal.oslo.feature.taxanddocumentcenter.ui.download.model.DownloadUiState downloadState;
        private final java.lang.String fileName;
        private final java.lang.String source;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Content(java.lang.String str, java.lang.String str2, com.paypal.oslo.feature.taxanddocumentcenter.ui.download.model.DownloadUiState downloadUiState) {
            super("Content", null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str2, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(downloadUiState, "");
            this.fileName = str;
            this.source = str2;
            this.downloadState = downloadUiState;
        }

        public final java.lang.String getFileName() {
            return this.fileName;
        }

        public final java.lang.String getSource() {
            return this.source;
        }

        public /* synthetic */ Content(java.lang.String str, java.lang.String str2, com.paypal.oslo.feature.taxanddocumentcenter.ui.download.model.DownloadUiState.Idle idle, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this(str, str2, (i & 4) != 0 ? com.paypal.oslo.feature.taxanddocumentcenter.ui.download.model.DownloadUiState.Idle.INSTANCE : idle);
        }

        public final com.paypal.oslo.feature.taxanddocumentcenter.ui.download.model.DownloadUiState getDownloadState() {
            return this.downloadState;
        }

        public final boolean isDownloading() {
            return this.downloadState instanceof com.paypal.oslo.feature.taxanddocumentcenter.ui.download.model.DownloadUiState.Downloading;
        }

        public final boolean getHasError() {
            return this.downloadState instanceof com.paypal.oslo.feature.taxanddocumentcenter.ui.download.model.DownloadUiState.Error;
        }

        public final java.lang.String getErrorMessage() {
            com.paypal.oslo.feature.taxanddocumentcenter.ui.download.model.DownloadUiState downloadUiState = this.downloadState;
            com.paypal.oslo.feature.taxanddocumentcenter.ui.download.model.DownloadUiState.Error error = downloadUiState instanceof com.paypal.oslo.feature.taxanddocumentcenter.ui.download.model.DownloadUiState.Error ? (com.paypal.oslo.feature.taxanddocumentcenter.ui.download.model.DownloadUiState.Error) downloadUiState : null;
            if (error != null) {
                return error.getErrorMessage();
            }
            return null;
        }

        public final java.lang.String toString() {
            java.lang.String str = this.fileName;
            java.lang.String str2 = this.source;
            com.paypal.oslo.feature.taxanddocumentcenter.ui.download.model.DownloadUiState downloadUiState = this.downloadState;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Content(fileName=");
            sb.append(str);
            sb.append(", source=");
            sb.append(str2);
            sb.append(", downloadState=");
            sb.append(downloadUiState);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return (((this.fileName.hashCode() * 31) + this.source.hashCode()) * 31) + this.downloadState.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.taxanddocumentcenter.ui.customstatementdownload.mvi.CustomStatementDownloadUiState.Content)) {
                return false;
            }
            com.paypal.oslo.feature.taxanddocumentcenter.ui.customstatementdownload.mvi.CustomStatementDownloadUiState.Content content = (com.paypal.oslo.feature.taxanddocumentcenter.ui.customstatementdownload.mvi.CustomStatementDownloadUiState.Content) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.fileName, content.fileName) && kotlin.jvm.internal.Intrinsics.areEqual(this.source, content.source) && kotlin.jvm.internal.Intrinsics.areEqual(this.downloadState, content.downloadState);
        }

        public final com.paypal.oslo.feature.taxanddocumentcenter.ui.customstatementdownload.mvi.CustomStatementDownloadUiState.Content copy(java.lang.String fileName, java.lang.String source, com.paypal.oslo.feature.taxanddocumentcenter.ui.download.model.DownloadUiState downloadState) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(fileName, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(source, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(downloadState, "");
            return new com.paypal.oslo.feature.taxanddocumentcenter.ui.customstatementdownload.mvi.CustomStatementDownloadUiState.Content(fileName, source, downloadState);
        }

        /* renamed from: component3, reason: from getter */
        public final com.paypal.oslo.feature.taxanddocumentcenter.ui.download.model.DownloadUiState getDownloadState() {
            return this.downloadState;
        }

        /* renamed from: component2, reason: from getter */
        public final java.lang.String getSource() {
            return this.source;
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.String getFileName() {
            return this.fileName;
        }

        public static /* synthetic */ com.paypal.oslo.feature.taxanddocumentcenter.ui.customstatementdownload.mvi.CustomStatementDownloadUiState.Content copy$default(com.paypal.oslo.feature.taxanddocumentcenter.ui.customstatementdownload.mvi.CustomStatementDownloadUiState.Content content, java.lang.String str, java.lang.String str2, com.paypal.oslo.feature.taxanddocumentcenter.ui.download.model.DownloadUiState downloadUiState, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = content.fileName;
            }
            if ((i & 2) != 0) {
                str2 = content.source;
            }
            if ((i & 4) != 0) {
                downloadUiState = content.downloadState;
            }
            return content.copy(str, str2, downloadUiState);
        }
    }

    public /* synthetic */ CustomStatementDownloadUiState(java.lang.String str, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(str);
    }
}
