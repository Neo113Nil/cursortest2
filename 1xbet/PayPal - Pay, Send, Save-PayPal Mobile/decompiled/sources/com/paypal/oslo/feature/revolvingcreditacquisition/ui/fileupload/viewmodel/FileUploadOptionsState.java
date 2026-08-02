package com.paypal.oslo.feature.revolvingcreditacquisition.ui.fileupload.viewmodel;

@kotlin.Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\b0\u0018\u00002\u00020\u00012\u00020\u0002:\u0002\u000b\fB\u0011\b\u0004\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006R\u001a\u0010\u0007\u001a\u00020\u00038\u0017X\u0096\u0004¢\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\t\u0010\n\u0082\u0001\u0002\r\u000e"}, d2 = {"Lcom/paypal/oslo/feature/revolvingcreditacquisition/ui/fileupload/viewmodel/FileUploadOptionsState;", "Lcom/paypal/oslo/core/mvi/UiState;", "Lcom/paypal/oslo/feature/revolvingcreditacquisition/ui/common/logger/Loggable;", "", "p0", "<init>", "(Ljava/lang/String;)V", "name", "Ljava/lang/String;", "getName", "()Ljava/lang/String;", "Initial", com.paypal.oslo.feature.consumerprivacy.ui.util.UiConstants.STATE_READY, "Lcom/paypal/oslo/feature/revolvingcreditacquisition/ui/fileupload/viewmodel/FileUploadOptionsState$Initial;", "Lcom/paypal/oslo/feature/revolvingcreditacquisition/ui/fileupload/viewmodel/FileUploadOptionsState$Ready;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes14.dex */
public abstract class FileUploadOptionsState implements com.paypal.oslo.core.mvi.UiState, com.paypal.oslo.feature.revolvingcreditacquisition.ui.common.logger.Loggable {
    public static final int $stable = 0;
    private final java.lang.String name;

    private FileUploadOptionsState(java.lang.String str) {
        this.name = str;
    }

    @Override // com.paypal.oslo.feature.revolvingcreditacquisition.ui.common.logger.Loggable
    public /* bridge */ java.util.Map<java.lang.String, java.lang.String> getLogParams() {
        return super.getLogParams();
    }

    @Override // com.paypal.oslo.core.mvi.UiState
    public java.lang.String getName() {
        return this.name;
    }

    @Override // com.paypal.oslo.feature.revolvingcreditacquisition.ui.common.logger.Loggable
    public /* bridge */ java.util.Map<java.lang.String, java.lang.String> getPiiParams() {
        return super.getPiiParams();
    }

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/revolvingcreditacquisition/ui/fileupload/viewmodel/FileUploadOptionsState$Initial;", "Lcom/paypal/oslo/feature/revolvingcreditacquisition/ui/fileupload/viewmodel/FileUploadOptionsState;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class Initial extends com.paypal.oslo.feature.revolvingcreditacquisition.ui.fileupload.viewmodel.FileUploadOptionsState {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.revolvingcreditacquisition.ui.fileupload.viewmodel.FileUploadOptionsState.Initial INSTANCE = new com.paypal.oslo.feature.revolvingcreditacquisition.ui.fileupload.viewmodel.FileUploadOptionsState.Initial();

        public final int hashCode() {
            return 751103036;
        }

        private Initial() {
            super("Initial", null);
        }

        public final java.lang.String toString() {
            return "Initial";
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.revolvingcreditacquisition.ui.fileupload.viewmodel.FileUploadOptionsState.Initial)) {
                return false;
            }
            return true;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u0013\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0012\u0010\u0006\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001c\u0010\b\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0015\u001a\u0004\b\u0016\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/revolvingcreditacquisition/ui/fileupload/viewmodel/FileUploadOptionsState$Ready;", "Lcom/paypal/oslo/feature/revolvingcreditacquisition/ui/fileupload/viewmodel/FileUploadOptionsState;", "Landroid/net/Uri;", "pendingCameraUri", "<init>", "(Landroid/net/Uri;)V", "component1", "()Landroid/net/Uri;", "copy", "(Landroid/net/Uri;)Lcom/paypal/oslo/feature/revolvingcreditacquisition/ui/fileupload/viewmodel/FileUploadOptionsState$Ready;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Landroid/net/Uri;", "getPendingCameraUri"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class Ready extends com.paypal.oslo.feature.revolvingcreditacquisition.ui.fileupload.viewmodel.FileUploadOptionsState {
        public static final int $stable = 8;
        private final android.net.Uri pendingCameraUri;

        public Ready(android.net.Uri uri) {
            super(com.paypal.oslo.feature.consumerprivacy.ui.util.UiConstants.STATE_READY, null);
            this.pendingCameraUri = uri;
        }

        public /* synthetic */ Ready(android.net.Uri uri, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? null : uri);
        }

        public final android.net.Uri getPendingCameraUri() {
            return this.pendingCameraUri;
        }

        public final java.lang.String toString() {
            android.net.Uri uri = this.pendingCameraUri;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Ready(pendingCameraUri=");
            sb.append(uri);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            android.net.Uri uri = this.pendingCameraUri;
            if (uri == null) {
                return 0;
            }
            return uri.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof com.paypal.oslo.feature.revolvingcreditacquisition.ui.fileupload.viewmodel.FileUploadOptionsState.Ready) && kotlin.jvm.internal.Intrinsics.areEqual(this.pendingCameraUri, ((com.paypal.oslo.feature.revolvingcreditacquisition.ui.fileupload.viewmodel.FileUploadOptionsState.Ready) other).pendingCameraUri);
        }

        public final com.paypal.oslo.feature.revolvingcreditacquisition.ui.fileupload.viewmodel.FileUploadOptionsState.Ready copy(android.net.Uri pendingCameraUri) {
            return new com.paypal.oslo.feature.revolvingcreditacquisition.ui.fileupload.viewmodel.FileUploadOptionsState.Ready(pendingCameraUri);
        }

        /* renamed from: component1, reason: from getter */
        public final android.net.Uri getPendingCameraUri() {
            return this.pendingCameraUri;
        }

        public static /* synthetic */ com.paypal.oslo.feature.revolvingcreditacquisition.ui.fileupload.viewmodel.FileUploadOptionsState.Ready copy$default(com.paypal.oslo.feature.revolvingcreditacquisition.ui.fileupload.viewmodel.FileUploadOptionsState.Ready ready, android.net.Uri uri, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                uri = ready.pendingCameraUri;
            }
            return ready.copy(uri);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public Ready() {
            this(null, 1, 0 == true ? 1 : 0);
        }
    }

    public /* synthetic */ FileUploadOptionsState(java.lang.String str, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(str);
    }
}
