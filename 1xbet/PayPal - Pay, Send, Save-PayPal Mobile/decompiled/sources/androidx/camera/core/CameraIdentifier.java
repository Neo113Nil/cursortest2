package androidx.camera.core;

@kotlin.Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u000f\u0018\u00002\u00020\u0001:\u0001#B!\b\u0002\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0015\u0010\f\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\f\u0010\rJ\u0015\u0010\f\u001a\u00020\u000b2\u0006\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\f\u0010\u0010J\u001a\u0010\u0012\u001a\u00020\u000b2\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001H\u0096\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0015\u001a\u00020\u0014H\u0016¢\u0006\u0004\b\u0015\u0010\u0016J\u000f\u0010\u0017\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u0017\u0010\u0018R\u001d\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0007¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u001c\u0010\u001d\u001a\u0004\u0018\u00010\u00058\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010 R\u0011\u0010\"\u001a\u00020\u00038G¢\u0006\u0006\u001a\u0004\b!\u0010\u0018"}, d2 = {"Landroidx/camera/core/CameraIdentifier;", "", "", "", "p0", "Landroidx/camera/core/impl/Identifier;", "p1", "<init>", "(Ljava/util/List;Landroidx/camera/core/impl/Identifier;)V", "Landroidx/camera/core/Camera;", com.paypal.oslo.feature.qrc.domain.utils.Constants.SOURCE_CAMERA, "", "isOf", "(Landroidx/camera/core/Camera;)Z", "Landroidx/camera/core/CameraInfo;", "cameraInfo", "(Landroidx/camera/core/CameraInfo;)Z", "other", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "()Ljava/lang/String;", "cameraIds", "Ljava/util/List;", "getCameraIds", "()Ljava/util/List;", "compatibilityId", "Landroidx/camera/core/impl/Identifier;", "getCompatibilityId", "()Landroidx/camera/core/impl/Identifier;", "getInternalId", "internalId", "Factory"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class CameraIdentifier {
    private final java.util.List<java.lang.String> cameraIds;
    private final androidx.camera.core.impl.Identifier compatibilityId;

    private CameraIdentifier(java.util.List<java.lang.String> list, androidx.camera.core.impl.Identifier identifier) {
        this.cameraIds = list;
        this.compatibilityId = identifier;
        androidx.core.util.Preconditions.checkArgument(!list.isEmpty(), "Camera ID set cannot be empty.");
    }

    public final java.util.List<java.lang.String> getCameraIds() {
        return this.cameraIds;
    }

    public final androidx.camera.core.impl.Identifier getCompatibilityId() {
        return this.compatibilityId;
    }

    public final java.lang.String getInternalId() {
        androidx.core.util.Preconditions.checkState(this.cameraIds.size() == 1, "getInternalId() is only available for single-camera identifiers.");
        return (java.lang.String) kotlin.collections.CollectionsKt.first((java.util.List) this.cameraIds);
    }

    public final boolean isOf(androidx.camera.core.Camera camera) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(camera, "");
        androidx.core.util.Preconditions.checkNotNull(camera);
        return kotlin.jvm.internal.Intrinsics.areEqual(this, camera.getCameraInfo().getCameraIdentifier());
    }

    public final boolean isOf(androidx.camera.core.CameraInfo cameraInfo) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(cameraInfo, "");
        androidx.core.util.Preconditions.checkNotNull(cameraInfo);
        return kotlin.jvm.internal.Intrinsics.areEqual(this, cameraInfo.getCameraIdentifier());
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof androidx.camera.core.CameraIdentifier)) {
            return false;
        }
        androidx.camera.core.CameraIdentifier cameraIdentifier = (androidx.camera.core.CameraIdentifier) other;
        return kotlin.jvm.internal.Intrinsics.areEqual(this.cameraIds, cameraIdentifier.cameraIds) && kotlin.jvm.internal.Intrinsics.areEqual(this.compatibilityId, cameraIdentifier.compatibilityId);
    }

    public final int hashCode() {
        int hashCode = this.cameraIds.hashCode();
        androidx.camera.core.impl.Identifier identifier = this.compatibilityId;
        return (hashCode * 31) + (identifier != null ? identifier.hashCode() : 0);
    }

    public final java.lang.String toString() {
        java.lang.String str;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("CameraIdentifier{cameraIds=");
        sb.append(kotlin.collections.CollectionsKt.joinToString$default(this.cameraIds, ",", null, null, 0, null, null, 62, null));
        androidx.camera.core.impl.Identifier identifier = this.compatibilityId;
        if (identifier == null || (str = ", compatId=".concat(java.lang.String.valueOf(identifier))) == null) {
            str = "";
        }
        sb.append(str);
        sb.append(kotlinx.serialization.json.internal.AbstractJsonLexerKt.END_OBJ);
        return sb.toString();
    }

    @kotlin.Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J)\u0010\n\u001a\u00020\t2\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007H\u0007¢\u0006\u0004\b\n\u0010\u000bJ/\u0010\n\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u00052\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007H\u0007¢\u0006\u0004\b\n\u0010\u000eJ!\u0010\u0012\u001a\u00020\t2\u0006\u0010\u0010\u001a\u00020\u000f2\b\u0010\u0011\u001a\u0004\u0018\u00010\u000fH\u0007¢\u0006\u0004\b\u0012\u0010\u0013"}, d2 = {"Landroidx/camera/core/CameraIdentifier$Factory;", "", "<init>", "()V", "", "", "cameraIds", "Landroidx/camera/core/impl/Identifier;", "compatibilityId", "Landroidx/camera/core/CameraIdentifier;", "create", "(Ljava/util/List;Landroidx/camera/core/impl/Identifier;)Landroidx/camera/core/CameraIdentifier;", "primaryCameraId", "secondaryCameraId", "(Ljava/lang/String;Ljava/lang/String;Landroidx/camera/core/impl/Identifier;)Landroidx/camera/core/CameraIdentifier;", "Landroidx/camera/core/impl/AdapterCameraInfo;", "primaryInfo", "secondaryInfo", "fromAdapterInfos", "(Landroidx/camera/core/impl/AdapterCameraInfo;Landroidx/camera/core/impl/AdapterCameraInfo;)Landroidx/camera/core/CameraIdentifier;"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Factory {
        public static final androidx.camera.core.CameraIdentifier.Factory INSTANCE = new androidx.camera.core.CameraIdentifier.Factory();

        private Factory() {
        }

        public static /* synthetic */ androidx.camera.core.CameraIdentifier create$default(java.util.List list, androidx.camera.core.impl.Identifier identifier, int i, java.lang.Object obj) {
            if ((i & 2) != 0) {
                identifier = null;
            }
            return create((java.util.List<java.lang.String>) list, identifier);
        }

        @kotlin.jvm.JvmStatic
        public static final androidx.camera.core.CameraIdentifier create(java.util.List<java.lang.String> cameraIds, androidx.camera.core.impl.Identifier compatibilityId) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(cameraIds, "");
            return new androidx.camera.core.CameraIdentifier(cameraIds, compatibilityId, null);
        }

        public static /* synthetic */ androidx.camera.core.CameraIdentifier create$default(java.lang.String str, java.lang.String str2, androidx.camera.core.impl.Identifier identifier, int i, java.lang.Object obj) {
            if ((i & 2) != 0) {
                str2 = null;
            }
            if ((i & 4) != 0) {
                identifier = null;
            }
            return create(str, str2, identifier);
        }

        @kotlin.jvm.JvmStatic
        public static final androidx.camera.core.CameraIdentifier create(java.lang.String primaryCameraId, java.lang.String secondaryCameraId, androidx.camera.core.impl.Identifier compatibilityId) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(primaryCameraId, "");
            java.util.List mutableListOf = kotlin.collections.CollectionsKt.mutableListOf(primaryCameraId);
            if (secondaryCameraId != null) {
                mutableListOf.add(secondaryCameraId);
            }
            return create((java.util.List<java.lang.String>) mutableListOf, compatibilityId);
        }

        @kotlin.jvm.JvmStatic
        public static final androidx.camera.core.CameraIdentifier fromAdapterInfos(androidx.camera.core.impl.AdapterCameraInfo primaryInfo, androidx.camera.core.impl.AdapterCameraInfo secondaryInfo) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(primaryInfo, "");
            java.lang.String cameraId = secondaryInfo != null ? secondaryInfo.getCameraId() : null;
            androidx.camera.core.impl.Identifier compatibilityId = primaryInfo.getCameraConfig().getCompatibilityId();
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(compatibilityId, "");
            java.lang.String cameraId2 = primaryInfo.getCameraId();
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(cameraId2, "");
            return create(cameraId2, cameraId, compatibilityId);
        }

        @kotlin.jvm.JvmStatic
        public static final androidx.camera.core.CameraIdentifier create(java.util.List<java.lang.String> list) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list, "");
            return create$default(list, null, 2, null);
        }

        @kotlin.jvm.JvmStatic
        public static final androidx.camera.core.CameraIdentifier create(java.lang.String str, java.lang.String str2) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            return create$default(str, str2, null, 4, null);
        }

        @kotlin.jvm.JvmStatic
        public static final androidx.camera.core.CameraIdentifier create(java.lang.String str) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            return create$default(str, null, null, 6, null);
        }
    }

    public /* synthetic */ CameraIdentifier(java.util.List list, androidx.camera.core.impl.Identifier identifier, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(list, identifier);
    }
}
