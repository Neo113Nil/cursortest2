package com.paypal.oslo.feature.dataprivacy.ui.viewmodel;

@kotlin.Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\b6\u0018\u00002\u00020\u0001:\u0005\u0004\u0005\u0006\u0007\bB\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0005\t\n\u000b\f\r"}, d2 = {"Lcom/paypal/oslo/feature/dataprivacy/ui/viewmodel/DownloadState;", "", "<init>", "()V", "Idle", "Downloading", "ReadyToSave", "Saved", "Error", "Lcom/paypal/oslo/feature/dataprivacy/ui/viewmodel/DownloadState$Downloading;", "Lcom/paypal/oslo/feature/dataprivacy/ui/viewmodel/DownloadState$Error;", "Lcom/paypal/oslo/feature/dataprivacy/ui/viewmodel/DownloadState$Idle;", "Lcom/paypal/oslo/feature/dataprivacy/ui/viewmodel/DownloadState$ReadyToSave;", "Lcom/paypal/oslo/feature/dataprivacy/ui/viewmodel/DownloadState$Saved;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes12.dex */
public abstract class DownloadState {
    public static final int $stable = 0;

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/dataprivacy/ui/viewmodel/DownloadState$Idle;", "Lcom/paypal/oslo/feature/dataprivacy/ui/viewmodel/DownloadState;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class Idle extends com.paypal.oslo.feature.dataprivacy.ui.viewmodel.DownloadState {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.dataprivacy.ui.viewmodel.DownloadState.Idle INSTANCE = new com.paypal.oslo.feature.dataprivacy.ui.viewmodel.DownloadState.Idle();

        public final int hashCode() {
            return 140213628;
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
            if (!(other instanceof com.paypal.oslo.feature.dataprivacy.ui.viewmodel.DownloadState.Idle)) {
                return false;
            }
            return true;
        }
    }

    private DownloadState() {
    }

    @kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0007R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0013\u001a\u0004\b\u0014\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/dataprivacy/ui/viewmodel/DownloadState$Downloading;", "Lcom/paypal/oslo/feature/dataprivacy/ui/viewmodel/DownloadState;", "", "fileId", "<init>", "(Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "copy", "(Ljava/lang/String;)Lcom/paypal/oslo/feature/dataprivacy/ui/viewmodel/DownloadState$Downloading;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getFileId"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class Downloading extends com.paypal.oslo.feature.dataprivacy.ui.viewmodel.DownloadState {
        public static final int $stable = 0;
        private final java.lang.String fileId;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Downloading(java.lang.String str) {
            super(null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            this.fileId = str;
        }

        public final java.lang.String getFileId() {
            return this.fileId;
        }

        public final java.lang.String toString() {
            java.lang.String str = this.fileId;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Downloading(fileId=");
            sb.append(str);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return this.fileId.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof com.paypal.oslo.feature.dataprivacy.ui.viewmodel.DownloadState.Downloading) && kotlin.jvm.internal.Intrinsics.areEqual(this.fileId, ((com.paypal.oslo.feature.dataprivacy.ui.viewmodel.DownloadState.Downloading) other).fileId);
        }

        public final com.paypal.oslo.feature.dataprivacy.ui.viewmodel.DownloadState.Downloading copy(java.lang.String fileId) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(fileId, "");
            return new com.paypal.oslo.feature.dataprivacy.ui.viewmodel.DownloadState.Downloading(fileId);
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.String getFileId() {
            return this.fileId;
        }

        public static /* synthetic */ com.paypal.oslo.feature.dataprivacy.ui.viewmodel.DownloadState.Downloading copy$default(com.paypal.oslo.feature.dataprivacy.ui.viewmodel.DownloadState.Downloading downloading, java.lang.String str, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = downloading.fileId;
            }
            return downloading.copy(str);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0012\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000b\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\b\b\u0086\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\r\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\r\u0010\fJ.\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0016\u001a\u00020\u0015HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0018\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0018\u0010\fR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0019\u001a\u0004\b\u001a\u0010\nR\u001a\u0010\u0005\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u001b\u001a\u0004\b\u001c\u0010\fR\u001a\u0010\u0006\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u001b\u001a\u0004\b\u001d\u0010\f"}, d2 = {"Lcom/paypal/oslo/feature/dataprivacy/ui/viewmodel/DownloadState$ReadyToSave;", "Lcom/paypal/oslo/feature/dataprivacy/ui/viewmodel/DownloadState;", "", com.paypal.oslo.downloads.impl.engine.ResumeHandler.ACCEPT_RANGES_BYTES, "", "fileName", com.datadog.android.sessionreplay.internal.processor.EnrichedResource.MIME_TYPE, "<init>", "([BLjava/lang/String;Ljava/lang/String;)V", "component1", "()[B", "component2", "()Ljava/lang/String;", "component3", "copy", "([BLjava/lang/String;Ljava/lang/String;)Lcom/paypal/oslo/feature/dataprivacy/ui/viewmodel/DownloadState$ReadyToSave;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "[B", "getBytes", "Ljava/lang/String;", "getFileName", "getMimeType"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class ReadyToSave extends com.paypal.oslo.feature.dataprivacy.ui.viewmodel.DownloadState {
        public static final int $stable = 8;
        private final byte[] bytes;
        private final java.lang.String fileName;
        private final java.lang.String mimeType;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ReadyToSave(byte[] bArr, java.lang.String str, java.lang.String str2) {
            super(null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(bArr, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str2, "");
            this.bytes = bArr;
            this.fileName = str;
            this.mimeType = str2;
        }

        public final byte[] getBytes() {
            return this.bytes;
        }

        public final java.lang.String getFileName() {
            return this.fileName;
        }

        public final java.lang.String getMimeType() {
            return this.mimeType;
        }

        public final java.lang.String toString() {
            java.lang.String arrays = java.util.Arrays.toString(this.bytes);
            java.lang.String str = this.fileName;
            java.lang.String str2 = this.mimeType;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("ReadyToSave(bytes=");
            sb.append(arrays);
            sb.append(", fileName=");
            sb.append(str);
            sb.append(", mimeType=");
            sb.append(str2);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return (((java.util.Arrays.hashCode(this.bytes) * 31) + this.fileName.hashCode()) * 31) + this.mimeType.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.dataprivacy.ui.viewmodel.DownloadState.ReadyToSave)) {
                return false;
            }
            com.paypal.oslo.feature.dataprivacy.ui.viewmodel.DownloadState.ReadyToSave readyToSave = (com.paypal.oslo.feature.dataprivacy.ui.viewmodel.DownloadState.ReadyToSave) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.bytes, readyToSave.bytes) && kotlin.jvm.internal.Intrinsics.areEqual(this.fileName, readyToSave.fileName) && kotlin.jvm.internal.Intrinsics.areEqual(this.mimeType, readyToSave.mimeType);
        }

        public final com.paypal.oslo.feature.dataprivacy.ui.viewmodel.DownloadState.ReadyToSave copy(byte[] bytes, java.lang.String fileName, java.lang.String mimeType) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(bytes, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(fileName, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(mimeType, "");
            return new com.paypal.oslo.feature.dataprivacy.ui.viewmodel.DownloadState.ReadyToSave(bytes, fileName, mimeType);
        }

        /* renamed from: component3, reason: from getter */
        public final java.lang.String getMimeType() {
            return this.mimeType;
        }

        /* renamed from: component2, reason: from getter */
        public final java.lang.String getFileName() {
            return this.fileName;
        }

        /* renamed from: component1, reason: from getter */
        public final byte[] getBytes() {
            return this.bytes;
        }

        public static /* synthetic */ com.paypal.oslo.feature.dataprivacy.ui.viewmodel.DownloadState.ReadyToSave copy$default(com.paypal.oslo.feature.dataprivacy.ui.viewmodel.DownloadState.ReadyToSave readyToSave, byte[] bArr, java.lang.String str, java.lang.String str2, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                bArr = readyToSave.bytes;
            }
            if ((i & 2) != 0) {
                str = readyToSave.fileName;
            }
            if ((i & 4) != 0) {
                str2 = readyToSave.mimeType;
            }
            return readyToSave.copy(bArr, str, str2);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/dataprivacy/ui/viewmodel/DownloadState$Saved;", "Lcom/paypal/oslo/feature/dataprivacy/ui/viewmodel/DownloadState;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class Saved extends com.paypal.oslo.feature.dataprivacy.ui.viewmodel.DownloadState {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.dataprivacy.ui.viewmodel.DownloadState.Saved INSTANCE = new com.paypal.oslo.feature.dataprivacy.ui.viewmodel.DownloadState.Saved();

        public final int hashCode() {
            return 60810719;
        }

        private Saved() {
            super(null);
        }

        public final java.lang.String toString() {
            return "Saved";
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.dataprivacy.ui.viewmodel.DownloadState.Saved)) {
                return false;
            }
            return true;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0015\u001a\u0004\b\u0016\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/dataprivacy/ui/viewmodel/DownloadState$Error;", "Lcom/paypal/oslo/feature/dataprivacy/ui/viewmodel/DownloadState;", "Lcom/paypal/oslo/feature/dataprivacy/domain/error/DataPrivacyError;", "error", "<init>", "(Lcom/paypal/oslo/feature/dataprivacy/domain/error/DataPrivacyError;)V", "component1", "()Lcom/paypal/oslo/feature/dataprivacy/domain/error/DataPrivacyError;", "copy", "(Lcom/paypal/oslo/feature/dataprivacy/domain/error/DataPrivacyError;)Lcom/paypal/oslo/feature/dataprivacy/ui/viewmodel/DownloadState$Error;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lcom/paypal/oslo/feature/dataprivacy/domain/error/DataPrivacyError;", "getError"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class Error extends com.paypal.oslo.feature.dataprivacy.ui.viewmodel.DownloadState {
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
            return (other instanceof com.paypal.oslo.feature.dataprivacy.ui.viewmodel.DownloadState.Error) && kotlin.jvm.internal.Intrinsics.areEqual(this.error, ((com.paypal.oslo.feature.dataprivacy.ui.viewmodel.DownloadState.Error) other).error);
        }

        public final com.paypal.oslo.feature.dataprivacy.ui.viewmodel.DownloadState.Error copy(com.paypal.oslo.feature.dataprivacy.domain.error.DataPrivacyError error) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(error, "");
            return new com.paypal.oslo.feature.dataprivacy.ui.viewmodel.DownloadState.Error(error);
        }

        /* renamed from: component1, reason: from getter */
        public final com.paypal.oslo.feature.dataprivacy.domain.error.DataPrivacyError getError() {
            return this.error;
        }

        public static /* synthetic */ com.paypal.oslo.feature.dataprivacy.ui.viewmodel.DownloadState.Error copy$default(com.paypal.oslo.feature.dataprivacy.ui.viewmodel.DownloadState.Error error, com.paypal.oslo.feature.dataprivacy.domain.error.DataPrivacyError dataPrivacyError, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                dataPrivacyError = error.error;
            }
            return error.copy(dataPrivacyError);
        }
    }

    public /* synthetic */ DownloadState(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }
}
