package com.paypal.oslo.feature.revolvingcreditacquisition.ui.fileupload.viewmodel;

@kotlin.Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\b0\u0018\u00002\u00020\u00012\u00020\u0002:\n\u000b\f\r\u000e\u000f\u0010\u0011\u0012\u0013\u0014B\u0011\b\u0004\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006R\u001a\u0010\u0007\u001a\u00020\u00038\u0017X\u0096\u0004¢\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\t\u0010\n\u0082\u0001\t\u0015\u0016\u0017\u0018\u0019\u001a\u001b\u001c\u001d"}, d2 = {"Lcom/paypal/oslo/feature/revolvingcreditacquisition/ui/fileupload/viewmodel/FileUploadOptionsEvent;", "Lcom/paypal/oslo/core/mvi/Event;", "Lcom/paypal/oslo/feature/revolvingcreditacquisition/ui/common/logger/Loggable;", "", "p0", "<init>", "(Ljava/lang/String;)V", "name", "Ljava/lang/String;", "getName", "()Ljava/lang/String;", "UriResultEvent", "OnViewCreated", "OnTakePhotoClicked", "OnChoosePhotoClicked", "OnCameraPermissionResult", "OnCameraResult", "OnPhotoPickerResult", "OnCameraUriCreated", "OnChooseDocumentClicked", "OnDocumentPickerResult", "Lcom/paypal/oslo/feature/revolvingcreditacquisition/ui/fileupload/viewmodel/FileUploadOptionsEvent$OnCameraPermissionResult;", "Lcom/paypal/oslo/feature/revolvingcreditacquisition/ui/fileupload/viewmodel/FileUploadOptionsEvent$OnCameraResult;", "Lcom/paypal/oslo/feature/revolvingcreditacquisition/ui/fileupload/viewmodel/FileUploadOptionsEvent$OnCameraUriCreated;", "Lcom/paypal/oslo/feature/revolvingcreditacquisition/ui/fileupload/viewmodel/FileUploadOptionsEvent$OnChooseDocumentClicked;", "Lcom/paypal/oslo/feature/revolvingcreditacquisition/ui/fileupload/viewmodel/FileUploadOptionsEvent$OnChoosePhotoClicked;", "Lcom/paypal/oslo/feature/revolvingcreditacquisition/ui/fileupload/viewmodel/FileUploadOptionsEvent$OnDocumentPickerResult;", "Lcom/paypal/oslo/feature/revolvingcreditacquisition/ui/fileupload/viewmodel/FileUploadOptionsEvent$OnPhotoPickerResult;", "Lcom/paypal/oslo/feature/revolvingcreditacquisition/ui/fileupload/viewmodel/FileUploadOptionsEvent$OnTakePhotoClicked;", "Lcom/paypal/oslo/feature/revolvingcreditacquisition/ui/fileupload/viewmodel/FileUploadOptionsEvent$OnViewCreated;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes14.dex */
public abstract class FileUploadOptionsEvent implements com.paypal.oslo.core.mvi.Event, com.paypal.oslo.feature.revolvingcreditacquisition.ui.common.logger.Loggable {
    public static final int $stable = 0;
    private final java.lang.String name;

    @kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\bv\u0018\u00002\u00020\u0001R\u0016\u0010\u0005\u001a\u0004\u0018\u00010\u00028'X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\u0082\u0001\u0002\u0006\u0007À\u0006\u0003"}, d2 = {"Lcom/paypal/oslo/feature/revolvingcreditacquisition/ui/fileupload/viewmodel/FileUploadOptionsEvent$UriResultEvent;", "", "Landroid/net/Uri;", "getUri", "()Landroid/net/Uri;", "uri", "Lcom/paypal/oslo/feature/revolvingcreditacquisition/ui/fileupload/viewmodel/FileUploadOptionsEvent$OnDocumentPickerResult;", "Lcom/paypal/oslo/feature/revolvingcreditacquisition/ui/fileupload/viewmodel/FileUploadOptionsEvent$OnPhotoPickerResult;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public interface UriResultEvent {
        android.net.Uri getUri();
    }

    private FileUploadOptionsEvent(java.lang.String str) {
        this.name = str;
    }

    @Override // com.paypal.oslo.feature.revolvingcreditacquisition.ui.common.logger.Loggable
    public /* bridge */ java.util.Map<java.lang.String, java.lang.String> getLogParams() {
        return super.getLogParams();
    }

    @Override // com.paypal.oslo.core.mvi.Event
    public java.lang.String getName() {
        return this.name;
    }

    @Override // com.paypal.oslo.feature.revolvingcreditacquisition.ui.common.logger.Loggable
    public /* bridge */ java.util.Map<java.lang.String, java.lang.String> getPiiParams() {
        return super.getPiiParams();
    }

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/revolvingcreditacquisition/ui/fileupload/viewmodel/FileUploadOptionsEvent$OnViewCreated;", "Lcom/paypal/oslo/feature/revolvingcreditacquisition/ui/fileupload/viewmodel/FileUploadOptionsEvent;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class OnViewCreated extends com.paypal.oslo.feature.revolvingcreditacquisition.ui.fileupload.viewmodel.FileUploadOptionsEvent {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.revolvingcreditacquisition.ui.fileupload.viewmodel.FileUploadOptionsEvent.OnViewCreated INSTANCE = new com.paypal.oslo.feature.revolvingcreditacquisition.ui.fileupload.viewmodel.FileUploadOptionsEvent.OnViewCreated();

        public final int hashCode() {
            return -1411189147;
        }

        private OnViewCreated() {
            super("OnViewCreated", null);
        }

        public final java.lang.String toString() {
            return "OnViewCreated";
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.revolvingcreditacquisition.ui.fileupload.viewmodel.FileUploadOptionsEvent.OnViewCreated)) {
                return false;
            }
            return true;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/revolvingcreditacquisition/ui/fileupload/viewmodel/FileUploadOptionsEvent$OnTakePhotoClicked;", "Lcom/paypal/oslo/feature/revolvingcreditacquisition/ui/fileupload/viewmodel/FileUploadOptionsEvent;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class OnTakePhotoClicked extends com.paypal.oslo.feature.revolvingcreditacquisition.ui.fileupload.viewmodel.FileUploadOptionsEvent {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.revolvingcreditacquisition.ui.fileupload.viewmodel.FileUploadOptionsEvent.OnTakePhotoClicked INSTANCE = new com.paypal.oslo.feature.revolvingcreditacquisition.ui.fileupload.viewmodel.FileUploadOptionsEvent.OnTakePhotoClicked();

        public final int hashCode() {
            return -24521958;
        }

        private OnTakePhotoClicked() {
            super("OnTakePhotoClicked", null);
        }

        public final java.lang.String toString() {
            return "OnTakePhotoClicked";
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.revolvingcreditacquisition.ui.fileupload.viewmodel.FileUploadOptionsEvent.OnTakePhotoClicked)) {
                return false;
            }
            return true;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/revolvingcreditacquisition/ui/fileupload/viewmodel/FileUploadOptionsEvent$OnChoosePhotoClicked;", "Lcom/paypal/oslo/feature/revolvingcreditacquisition/ui/fileupload/viewmodel/FileUploadOptionsEvent;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class OnChoosePhotoClicked extends com.paypal.oslo.feature.revolvingcreditacquisition.ui.fileupload.viewmodel.FileUploadOptionsEvent {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.revolvingcreditacquisition.ui.fileupload.viewmodel.FileUploadOptionsEvent.OnChoosePhotoClicked INSTANCE = new com.paypal.oslo.feature.revolvingcreditacquisition.ui.fileupload.viewmodel.FileUploadOptionsEvent.OnChoosePhotoClicked();

        public final int hashCode() {
            return -1383277270;
        }

        private OnChoosePhotoClicked() {
            super("OnChoosePhotoClicked", null);
        }

        public final java.lang.String toString() {
            return "OnChoosePhotoClicked";
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.revolvingcreditacquisition.ui.fileupload.viewmodel.FileUploadOptionsEvent.OnChoosePhotoClicked)) {
                return false;
            }
            return true;
        }
    }

    @kotlin.Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\b\b\u0086\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0016\b\u0002\u0010\u0006\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\t\u0010\nJ\u001e\u0010\u000b\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u000b\u0010\fJ2\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\u0016\b\u0002\u0010\u0006\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004HÆ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u000fHÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0015\u001a\u00020\u0014HÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0017\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0018R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0019\u001a\u0004\b\u001a\u0010\nR(\u0010\u0006\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00048\u0017X\u0097\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u001b\u001a\u0004\b\u001c\u0010\f"}, d2 = {"Lcom/paypal/oslo/feature/revolvingcreditacquisition/ui/fileupload/viewmodel/FileUploadOptionsEvent$OnCameraPermissionResult;", "Lcom/paypal/oslo/feature/revolvingcreditacquisition/ui/fileupload/viewmodel/FileUploadOptionsEvent;", "Lcom/paypal/oslo/core/permission/domain/model/PermissionStatus;", "status", "", "", "logParams", "<init>", "(Lcom/paypal/oslo/core/permission/domain/model/PermissionStatus;Ljava/util/Map;)V", "component1", "()Lcom/paypal/oslo/core/permission/domain/model/PermissionStatus;", "component2", "()Ljava/util/Map;", "copy", "(Lcom/paypal/oslo/core/permission/domain/model/PermissionStatus;Ljava/util/Map;)Lcom/paypal/oslo/feature/revolvingcreditacquisition/ui/fileupload/viewmodel/FileUploadOptionsEvent$OnCameraPermissionResult;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "()Ljava/lang/String;", "Lcom/paypal/oslo/core/permission/domain/model/PermissionStatus;", "getStatus", "Ljava/util/Map;", "getLogParams"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class OnCameraPermissionResult extends com.paypal.oslo.feature.revolvingcreditacquisition.ui.fileupload.viewmodel.FileUploadOptionsEvent {
        public static final int $stable = 8;
        private final java.util.Map<java.lang.String, java.lang.String> logParams;
        private final com.paypal.oslo.core.permission.domain.model.PermissionStatus status;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OnCameraPermissionResult(com.paypal.oslo.core.permission.domain.model.PermissionStatus permissionStatus, java.util.Map<java.lang.String, java.lang.String> map) {
            super("OnCameraPermissionResult", null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(permissionStatus, "");
            this.status = permissionStatus;
            this.logParams = map;
        }

        public final com.paypal.oslo.core.permission.domain.model.PermissionStatus getStatus() {
            return this.status;
        }

        public /* synthetic */ OnCameraPermissionResult(com.paypal.oslo.core.permission.domain.model.PermissionStatus permissionStatus, java.util.Map map, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this(permissionStatus, (i & 2) != 0 ? kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("permission_status", permissionStatus.toString())) : map);
        }

        @Override // com.paypal.oslo.feature.revolvingcreditacquisition.ui.fileupload.viewmodel.FileUploadOptionsEvent, com.paypal.oslo.feature.revolvingcreditacquisition.ui.common.logger.Loggable
        public final java.util.Map<java.lang.String, java.lang.String> getLogParams() {
            return this.logParams;
        }

        public final java.lang.String toString() {
            com.paypal.oslo.core.permission.domain.model.PermissionStatus permissionStatus = this.status;
            java.util.Map<java.lang.String, java.lang.String> map = this.logParams;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("OnCameraPermissionResult(status=");
            sb.append(permissionStatus);
            sb.append(", logParams=");
            sb.append(map);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            int hashCode = this.status.hashCode();
            java.util.Map<java.lang.String, java.lang.String> map = this.logParams;
            return (hashCode * 31) + (map == null ? 0 : map.hashCode());
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.revolvingcreditacquisition.ui.fileupload.viewmodel.FileUploadOptionsEvent.OnCameraPermissionResult)) {
                return false;
            }
            com.paypal.oslo.feature.revolvingcreditacquisition.ui.fileupload.viewmodel.FileUploadOptionsEvent.OnCameraPermissionResult onCameraPermissionResult = (com.paypal.oslo.feature.revolvingcreditacquisition.ui.fileupload.viewmodel.FileUploadOptionsEvent.OnCameraPermissionResult) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.status, onCameraPermissionResult.status) && kotlin.jvm.internal.Intrinsics.areEqual(this.logParams, onCameraPermissionResult.logParams);
        }

        public final com.paypal.oslo.feature.revolvingcreditacquisition.ui.fileupload.viewmodel.FileUploadOptionsEvent.OnCameraPermissionResult copy(com.paypal.oslo.core.permission.domain.model.PermissionStatus status, java.util.Map<java.lang.String, java.lang.String> logParams) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(status, "");
            return new com.paypal.oslo.feature.revolvingcreditacquisition.ui.fileupload.viewmodel.FileUploadOptionsEvent.OnCameraPermissionResult(status, logParams);
        }

        public final java.util.Map<java.lang.String, java.lang.String> component2() {
            return this.logParams;
        }

        /* renamed from: component1, reason: from getter */
        public final com.paypal.oslo.core.permission.domain.model.PermissionStatus getStatus() {
            return this.status;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ com.paypal.oslo.feature.revolvingcreditacquisition.ui.fileupload.viewmodel.FileUploadOptionsEvent.OnCameraPermissionResult copy$default(com.paypal.oslo.feature.revolvingcreditacquisition.ui.fileupload.viewmodel.FileUploadOptionsEvent.OnCameraPermissionResult onCameraPermissionResult, com.paypal.oslo.core.permission.domain.model.PermissionStatus permissionStatus, java.util.Map map, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                permissionStatus = onCameraPermissionResult.status;
            }
            if ((i & 2) != 0) {
                map = onCameraPermissionResult.logParams;
            }
            return onCameraPermissionResult.copy(permissionStatus, map);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\b\b\u0086\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0016\b\u0002\u0010\u0006\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\t\u0010\nJ\u001e\u0010\u000b\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u000b\u0010\fJ2\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\u0016\b\u0002\u0010\u0006\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004HÆ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0011\u001a\u00020\u00022\b\u0010\u0010\u001a\u0004\u0018\u00010\u000fHÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0016\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0018\u001a\u0004\b\u0019\u0010\nR(\u0010\u0006\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00048\u0017X\u0097\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u001a\u001a\u0004\b\u001b\u0010\f"}, d2 = {"Lcom/paypal/oslo/feature/revolvingcreditacquisition/ui/fileupload/viewmodel/FileUploadOptionsEvent$OnCameraResult;", "Lcom/paypal/oslo/feature/revolvingcreditacquisition/ui/fileupload/viewmodel/FileUploadOptionsEvent;", "", "success", "", "", "logParams", "<init>", "(ZLjava/util/Map;)V", "component1", "()Z", "component2", "()Ljava/util/Map;", "copy", "(ZLjava/util/Map;)Lcom/paypal/oslo/feature/revolvingcreditacquisition/ui/fileupload/viewmodel/FileUploadOptionsEvent$OnCameraResult;", "", "other", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "()Ljava/lang/String;", "Z", "getSuccess", "Ljava/util/Map;", "getLogParams"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class OnCameraResult extends com.paypal.oslo.feature.revolvingcreditacquisition.ui.fileupload.viewmodel.FileUploadOptionsEvent {
        public static final int $stable = 8;
        private final java.util.Map<java.lang.String, java.lang.String> logParams;
        private final boolean success;

        public OnCameraResult(boolean z, java.util.Map<java.lang.String, java.lang.String> map) {
            super("OnCameraResult", null);
            this.success = z;
            this.logParams = map;
        }

        public final boolean getSuccess() {
            return this.success;
        }

        public /* synthetic */ OnCameraResult(boolean z, java.util.Map map, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this(z, (i & 2) != 0 ? kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("camera_result", java.lang.String.valueOf(z))) : map);
        }

        @Override // com.paypal.oslo.feature.revolvingcreditacquisition.ui.fileupload.viewmodel.FileUploadOptionsEvent, com.paypal.oslo.feature.revolvingcreditacquisition.ui.common.logger.Loggable
        public final java.util.Map<java.lang.String, java.lang.String> getLogParams() {
            return this.logParams;
        }

        public final java.lang.String toString() {
            boolean z = this.success;
            java.util.Map<java.lang.String, java.lang.String> map = this.logParams;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("OnCameraResult(success=");
            sb.append(z);
            sb.append(", logParams=");
            sb.append(map);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            int hashCode = java.lang.Boolean.hashCode(this.success);
            java.util.Map<java.lang.String, java.lang.String> map = this.logParams;
            return (hashCode * 31) + (map == null ? 0 : map.hashCode());
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.revolvingcreditacquisition.ui.fileupload.viewmodel.FileUploadOptionsEvent.OnCameraResult)) {
                return false;
            }
            com.paypal.oslo.feature.revolvingcreditacquisition.ui.fileupload.viewmodel.FileUploadOptionsEvent.OnCameraResult onCameraResult = (com.paypal.oslo.feature.revolvingcreditacquisition.ui.fileupload.viewmodel.FileUploadOptionsEvent.OnCameraResult) other;
            return this.success == onCameraResult.success && kotlin.jvm.internal.Intrinsics.areEqual(this.logParams, onCameraResult.logParams);
        }

        public final com.paypal.oslo.feature.revolvingcreditacquisition.ui.fileupload.viewmodel.FileUploadOptionsEvent.OnCameraResult copy(boolean success, java.util.Map<java.lang.String, java.lang.String> logParams) {
            return new com.paypal.oslo.feature.revolvingcreditacquisition.ui.fileupload.viewmodel.FileUploadOptionsEvent.OnCameraResult(success, logParams);
        }

        public final java.util.Map<java.lang.String, java.lang.String> component2() {
            return this.logParams;
        }

        /* renamed from: component1, reason: from getter */
        public final boolean getSuccess() {
            return this.success;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ com.paypal.oslo.feature.revolvingcreditacquisition.ui.fileupload.viewmodel.FileUploadOptionsEvent.OnCameraResult copy$default(com.paypal.oslo.feature.revolvingcreditacquisition.ui.fileupload.viewmodel.FileUploadOptionsEvent.OnCameraResult onCameraResult, boolean z, java.util.Map map, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                z = onCameraResult.success;
            }
            if ((i & 2) != 0) {
                map = onCameraResult.logParams;
            }
            return onCameraResult.copy(z, map);
        }
    }

    @kotlin.Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u00012\u00020\u0002B\u0011\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u0012\u0010\u0007\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u001c\u0010\t\u001a\u00020\u00002\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003HÆ\u0001¢\u0006\u0004\b\t\u0010\nJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u000bHÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0011\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015R\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0017X\u0096\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0016\u001a\u0004\b\u0017\u0010\b"}, d2 = {"Lcom/paypal/oslo/feature/revolvingcreditacquisition/ui/fileupload/viewmodel/FileUploadOptionsEvent$OnPhotoPickerResult;", "Lcom/paypal/oslo/feature/revolvingcreditacquisition/ui/fileupload/viewmodel/FileUploadOptionsEvent;", "Lcom/paypal/oslo/feature/revolvingcreditacquisition/ui/fileupload/viewmodel/FileUploadOptionsEvent$UriResultEvent;", "Landroid/net/Uri;", "uri", "<init>", "(Landroid/net/Uri;)V", "component1", "()Landroid/net/Uri;", "copy", "(Landroid/net/Uri;)Lcom/paypal/oslo/feature/revolvingcreditacquisition/ui/fileupload/viewmodel/FileUploadOptionsEvent$OnPhotoPickerResult;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Landroid/net/Uri;", "getUri"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class OnPhotoPickerResult extends com.paypal.oslo.feature.revolvingcreditacquisition.ui.fileupload.viewmodel.FileUploadOptionsEvent implements com.paypal.oslo.feature.revolvingcreditacquisition.ui.fileupload.viewmodel.FileUploadOptionsEvent.UriResultEvent {
        public static final int $stable = 8;
        private final android.net.Uri uri;

        public OnPhotoPickerResult(android.net.Uri uri) {
            super("OnPhotoPickerResult", null);
            this.uri = uri;
        }

        @Override // com.paypal.oslo.feature.revolvingcreditacquisition.ui.fileupload.viewmodel.FileUploadOptionsEvent.UriResultEvent
        public final android.net.Uri getUri() {
            return this.uri;
        }

        public final java.lang.String toString() {
            android.net.Uri uri = this.uri;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("OnPhotoPickerResult(uri=");
            sb.append(uri);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            android.net.Uri uri = this.uri;
            if (uri == null) {
                return 0;
            }
            return uri.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof com.paypal.oslo.feature.revolvingcreditacquisition.ui.fileupload.viewmodel.FileUploadOptionsEvent.OnPhotoPickerResult) && kotlin.jvm.internal.Intrinsics.areEqual(this.uri, ((com.paypal.oslo.feature.revolvingcreditacquisition.ui.fileupload.viewmodel.FileUploadOptionsEvent.OnPhotoPickerResult) other).uri);
        }

        public final com.paypal.oslo.feature.revolvingcreditacquisition.ui.fileupload.viewmodel.FileUploadOptionsEvent.OnPhotoPickerResult copy(android.net.Uri uri) {
            return new com.paypal.oslo.feature.revolvingcreditacquisition.ui.fileupload.viewmodel.FileUploadOptionsEvent.OnPhotoPickerResult(uri);
        }

        /* renamed from: component1, reason: from getter */
        public final android.net.Uri getUri() {
            return this.uri;
        }

        public static /* synthetic */ com.paypal.oslo.feature.revolvingcreditacquisition.ui.fileupload.viewmodel.FileUploadOptionsEvent.OnPhotoPickerResult copy$default(com.paypal.oslo.feature.revolvingcreditacquisition.ui.fileupload.viewmodel.FileUploadOptionsEvent.OnPhotoPickerResult onPhotoPickerResult, android.net.Uri uri, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                uri = onPhotoPickerResult.uri;
            }
            return onPhotoPickerResult.copy(uri);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0015\u001a\u0004\b\u0016\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/revolvingcreditacquisition/ui/fileupload/viewmodel/FileUploadOptionsEvent$OnCameraUriCreated;", "Lcom/paypal/oslo/feature/revolvingcreditacquisition/ui/fileupload/viewmodel/FileUploadOptionsEvent;", "Landroid/net/Uri;", "uri", "<init>", "(Landroid/net/Uri;)V", "component1", "()Landroid/net/Uri;", "copy", "(Landroid/net/Uri;)Lcom/paypal/oslo/feature/revolvingcreditacquisition/ui/fileupload/viewmodel/FileUploadOptionsEvent$OnCameraUriCreated;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Landroid/net/Uri;", "getUri"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class OnCameraUriCreated extends com.paypal.oslo.feature.revolvingcreditacquisition.ui.fileupload.viewmodel.FileUploadOptionsEvent {
        public static final int $stable = 8;
        private final android.net.Uri uri;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OnCameraUriCreated(android.net.Uri uri) {
            super("OnCameraUriCreated", null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(uri, "");
            this.uri = uri;
        }

        public final android.net.Uri getUri() {
            return this.uri;
        }

        public final java.lang.String toString() {
            android.net.Uri uri = this.uri;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("OnCameraUriCreated(uri=");
            sb.append(uri);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return this.uri.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof com.paypal.oslo.feature.revolvingcreditacquisition.ui.fileupload.viewmodel.FileUploadOptionsEvent.OnCameraUriCreated) && kotlin.jvm.internal.Intrinsics.areEqual(this.uri, ((com.paypal.oslo.feature.revolvingcreditacquisition.ui.fileupload.viewmodel.FileUploadOptionsEvent.OnCameraUriCreated) other).uri);
        }

        public final com.paypal.oslo.feature.revolvingcreditacquisition.ui.fileupload.viewmodel.FileUploadOptionsEvent.OnCameraUriCreated copy(android.net.Uri uri) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(uri, "");
            return new com.paypal.oslo.feature.revolvingcreditacquisition.ui.fileupload.viewmodel.FileUploadOptionsEvent.OnCameraUriCreated(uri);
        }

        /* renamed from: component1, reason: from getter */
        public final android.net.Uri getUri() {
            return this.uri;
        }

        public static /* synthetic */ com.paypal.oslo.feature.revolvingcreditacquisition.ui.fileupload.viewmodel.FileUploadOptionsEvent.OnCameraUriCreated copy$default(com.paypal.oslo.feature.revolvingcreditacquisition.ui.fileupload.viewmodel.FileUploadOptionsEvent.OnCameraUriCreated onCameraUriCreated, android.net.Uri uri, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                uri = onCameraUriCreated.uri;
            }
            return onCameraUriCreated.copy(uri);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/revolvingcreditacquisition/ui/fileupload/viewmodel/FileUploadOptionsEvent$OnChooseDocumentClicked;", "Lcom/paypal/oslo/feature/revolvingcreditacquisition/ui/fileupload/viewmodel/FileUploadOptionsEvent;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class OnChooseDocumentClicked extends com.paypal.oslo.feature.revolvingcreditacquisition.ui.fileupload.viewmodel.FileUploadOptionsEvent {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.revolvingcreditacquisition.ui.fileupload.viewmodel.FileUploadOptionsEvent.OnChooseDocumentClicked INSTANCE = new com.paypal.oslo.feature.revolvingcreditacquisition.ui.fileupload.viewmodel.FileUploadOptionsEvent.OnChooseDocumentClicked();

        public final int hashCode() {
            return 1478909655;
        }

        private OnChooseDocumentClicked() {
            super("OnChooseDocumentClicked", null);
        }

        public final java.lang.String toString() {
            return "OnChooseDocumentClicked";
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.revolvingcreditacquisition.ui.fileupload.viewmodel.FileUploadOptionsEvent.OnChooseDocumentClicked)) {
                return false;
            }
            return true;
        }
    }

    @kotlin.Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u00012\u00020\u0002B\u0011\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u0012\u0010\u0007\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u001c\u0010\t\u001a\u00020\u00002\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003HÆ\u0001¢\u0006\u0004\b\t\u0010\nJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u000bHÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0011\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015R\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0017X\u0096\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0016\u001a\u0004\b\u0017\u0010\b"}, d2 = {"Lcom/paypal/oslo/feature/revolvingcreditacquisition/ui/fileupload/viewmodel/FileUploadOptionsEvent$OnDocumentPickerResult;", "Lcom/paypal/oslo/feature/revolvingcreditacquisition/ui/fileupload/viewmodel/FileUploadOptionsEvent;", "Lcom/paypal/oslo/feature/revolvingcreditacquisition/ui/fileupload/viewmodel/FileUploadOptionsEvent$UriResultEvent;", "Landroid/net/Uri;", "uri", "<init>", "(Landroid/net/Uri;)V", "component1", "()Landroid/net/Uri;", "copy", "(Landroid/net/Uri;)Lcom/paypal/oslo/feature/revolvingcreditacquisition/ui/fileupload/viewmodel/FileUploadOptionsEvent$OnDocumentPickerResult;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Landroid/net/Uri;", "getUri"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class OnDocumentPickerResult extends com.paypal.oslo.feature.revolvingcreditacquisition.ui.fileupload.viewmodel.FileUploadOptionsEvent implements com.paypal.oslo.feature.revolvingcreditacquisition.ui.fileupload.viewmodel.FileUploadOptionsEvent.UriResultEvent {
        public static final int $stable = 8;
        private final android.net.Uri uri;

        public OnDocumentPickerResult(android.net.Uri uri) {
            super("OnDocumentPickerResult", null);
            this.uri = uri;
        }

        @Override // com.paypal.oslo.feature.revolvingcreditacquisition.ui.fileupload.viewmodel.FileUploadOptionsEvent.UriResultEvent
        public final android.net.Uri getUri() {
            return this.uri;
        }

        public final java.lang.String toString() {
            android.net.Uri uri = this.uri;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("OnDocumentPickerResult(uri=");
            sb.append(uri);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            android.net.Uri uri = this.uri;
            if (uri == null) {
                return 0;
            }
            return uri.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof com.paypal.oslo.feature.revolvingcreditacquisition.ui.fileupload.viewmodel.FileUploadOptionsEvent.OnDocumentPickerResult) && kotlin.jvm.internal.Intrinsics.areEqual(this.uri, ((com.paypal.oslo.feature.revolvingcreditacquisition.ui.fileupload.viewmodel.FileUploadOptionsEvent.OnDocumentPickerResult) other).uri);
        }

        public final com.paypal.oslo.feature.revolvingcreditacquisition.ui.fileupload.viewmodel.FileUploadOptionsEvent.OnDocumentPickerResult copy(android.net.Uri uri) {
            return new com.paypal.oslo.feature.revolvingcreditacquisition.ui.fileupload.viewmodel.FileUploadOptionsEvent.OnDocumentPickerResult(uri);
        }

        /* renamed from: component1, reason: from getter */
        public final android.net.Uri getUri() {
            return this.uri;
        }

        public static /* synthetic */ com.paypal.oslo.feature.revolvingcreditacquisition.ui.fileupload.viewmodel.FileUploadOptionsEvent.OnDocumentPickerResult copy$default(com.paypal.oslo.feature.revolvingcreditacquisition.ui.fileupload.viewmodel.FileUploadOptionsEvent.OnDocumentPickerResult onDocumentPickerResult, android.net.Uri uri, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                uri = onDocumentPickerResult.uri;
            }
            return onDocumentPickerResult.copy(uri);
        }
    }

    public /* synthetic */ FileUploadOptionsEvent(java.lang.String str, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(str);
    }
}
