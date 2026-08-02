package androidx.camera.camera2.pipe.compat;

@kotlin.Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0010\u000e\n\u0002\b\n\b\u0080\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ)\u0010\u0010\u001a\u0004\u0018\u00018\u0000\"\b\b\u0000\u0010\r*\u00020\f2\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00028\u00000\u000eH\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0014\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0018\u001a\u00020\u0006HÆ\u0003¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0019\u001a\u00020\bHÆ\u0003¢\u0006\u0004\b\u0019\u0010\u001aJ8\u0010\u001d\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\t\u001a\u00020\bHÆ\u0001¢\u0006\u0004\b\u001b\u0010\u001cJ\u001a\u0010\u001f\u001a\u00020\u00042\b\u0010\u001e\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u001f\u0010 J\u0010\u0010!\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b!\u0010\u001aJ\u0010\u0010#\u001a\u00020\"HÖ\u0001¢\u0006\u0004\b#\u0010$R\u001a\u0010\u0003\u001a\u00020\u00028\u0017X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010%\u001a\u0004\b&\u0010\u0013R\u001a\u0010\u0005\u001a\u00020\u00048\u0017X\u0097\u0004¢\u0006\f\n\u0004\b\u0005\u0010'\u001a\u0004\b(\u0010\u0015R\u001a\u0010\u0007\u001a\u00020\u00068\u0017X\u0097\u0004¢\u0006\f\n\u0004\b\u0007\u0010)\u001a\u0004\b*\u0010\u0017R\u001a\u0010\t\u001a\u00020\b8\u0017X\u0097\u0004¢\u0006\f\n\u0004\b\t\u0010+\u001a\u0004\b,\u0010\u001a"}, d2 = {"Landroidx/camera/camera2/pipe/compat/ExtensionRequestFailure;", "Landroidx/camera/camera2/pipe/RequestFailure;", "Landroidx/camera/camera2/pipe/RequestMetadata;", "requestMetadata", "", "wasImageCaptured", "Landroidx/camera/camera2/pipe/FrameNumber;", "frameNumber", "", "reason", "<init>", "(Landroidx/camera/camera2/pipe/RequestMetadata;ZJILkotlin/jvm/internal/DefaultConstructorMarker;)V", "", "T", "Lkotlin/reflect/KClass;", "type", "unwrapAs", "(Lkotlin/reflect/KClass;)Ljava/lang/Object;", "component1", "()Landroidx/camera/camera2/pipe/RequestMetadata;", "component2", "()Z", "component3-Ugla2oM", "()J", "component3", "component4", "()I", "copy-FsN21Hw", "(Landroidx/camera/camera2/pipe/RequestMetadata;ZJI)Landroidx/camera/camera2/pipe/compat/ExtensionRequestFailure;", "copy", "other", "equals", "(Ljava/lang/Object;)Z", "hashCode", "", "toString", "()Ljava/lang/String;", "Landroidx/camera/camera2/pipe/RequestMetadata;", "getRequestMetadata", "Z", "getWasImageCaptured", "J", "getFrameNumber-Ugla2oM", com.visa.cbp.getEncExpo.warmup, "getReason"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes6.dex */
public final /* data */ class ExtensionRequestFailure implements androidx.camera.camera2.pipe.RequestFailure {
    private final long frameNumber;
    private final int reason;
    private final androidx.camera.camera2.pipe.RequestMetadata requestMetadata;
    private final boolean wasImageCaptured;

    private ExtensionRequestFailure(androidx.camera.camera2.pipe.RequestMetadata requestMetadata, boolean z, long j, int i) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(requestMetadata, "");
        this.requestMetadata = requestMetadata;
        this.wasImageCaptured = z;
        this.frameNumber = j;
        this.reason = i;
    }

    @Override // androidx.camera.camera2.pipe.RequestFailure
    public final androidx.camera.camera2.pipe.RequestMetadata getRequestMetadata() {
        return this.requestMetadata;
    }

    @Override // androidx.camera.camera2.pipe.RequestFailure
    public final boolean getWasImageCaptured() {
        return this.wasImageCaptured;
    }

    @Override // androidx.camera.camera2.pipe.RequestFailure
    /* renamed from: getFrameNumber-Ugla2oM */
    public final long mo671getFrameNumberUgla2oM() {
        return this.frameNumber;
    }

    @Override // androidx.camera.camera2.pipe.RequestFailure
    public final int getReason() {
        return this.reason;
    }

    @Override // androidx.camera.camera2.pipe.UnsafeWrapper
    public final <T> T unwrapAs(kotlin.reflect.KClass<T> type) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(type, "");
        return null;
    }

    public final java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("ExtensionRequestFailure(requestMetadata=");
        sb.append(this.requestMetadata);
        sb.append(", wasImageCaptured=");
        sb.append(this.wasImageCaptured);
        sb.append(", frameNumber=");
        sb.append((java.lang.Object) androidx.camera.camera2.pipe.FrameNumber.m502toStringimpl(this.frameNumber));
        sb.append(", reason=");
        sb.append(this.reason);
        sb.append(')');
        return sb.toString();
    }

    public final int hashCode() {
        return (((((this.requestMetadata.hashCode() * 31) + java.lang.Boolean.hashCode(this.wasImageCaptured)) * 31) + androidx.camera.camera2.pipe.FrameNumber.m501hashCodeimpl(this.frameNumber)) * 31) + java.lang.Integer.hashCode(this.reason);
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof androidx.camera.camera2.pipe.compat.ExtensionRequestFailure)) {
            return false;
        }
        androidx.camera.camera2.pipe.compat.ExtensionRequestFailure extensionRequestFailure = (androidx.camera.camera2.pipe.compat.ExtensionRequestFailure) other;
        return kotlin.jvm.internal.Intrinsics.areEqual(this.requestMetadata, extensionRequestFailure.requestMetadata) && this.wasImageCaptured == extensionRequestFailure.wasImageCaptured && androidx.camera.camera2.pipe.FrameNumber.m500equalsimpl0(this.frameNumber, extensionRequestFailure.frameNumber) && this.reason == extensionRequestFailure.reason;
    }

    /* renamed from: copy-FsN21Hw, reason: not valid java name */
    public final androidx.camera.camera2.pipe.compat.ExtensionRequestFailure m825copyFsN21Hw(androidx.camera.camera2.pipe.RequestMetadata requestMetadata, boolean wasImageCaptured, long frameNumber, int reason) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(requestMetadata, "");
        return new androidx.camera.camera2.pipe.compat.ExtensionRequestFailure(requestMetadata, wasImageCaptured, frameNumber, reason, null);
    }

    /* renamed from: component4, reason: from getter */
    public final int getReason() {
        return this.reason;
    }

    /* renamed from: component3-Ugla2oM, reason: not valid java name and from getter */
    public final long getFrameNumber() {
        return this.frameNumber;
    }

    /* renamed from: component2, reason: from getter */
    public final boolean getWasImageCaptured() {
        return this.wasImageCaptured;
    }

    /* renamed from: component1, reason: from getter */
    public final androidx.camera.camera2.pipe.RequestMetadata getRequestMetadata() {
        return this.requestMetadata;
    }

    /* renamed from: copy-FsN21Hw$default, reason: not valid java name */
    public static /* synthetic */ androidx.camera.camera2.pipe.compat.ExtensionRequestFailure m823copyFsN21Hw$default(androidx.camera.camera2.pipe.compat.ExtensionRequestFailure extensionRequestFailure, androidx.camera.camera2.pipe.RequestMetadata requestMetadata, boolean z, long j, int i, int i2, java.lang.Object obj) {
        if ((i2 & 1) != 0) {
            requestMetadata = extensionRequestFailure.requestMetadata;
        }
        if ((i2 & 2) != 0) {
            z = extensionRequestFailure.wasImageCaptured;
        }
        boolean z2 = z;
        if ((i2 & 4) != 0) {
            j = extensionRequestFailure.frameNumber;
        }
        long j2 = j;
        if ((i2 & 8) != 0) {
            i = extensionRequestFailure.reason;
        }
        return extensionRequestFailure.m825copyFsN21Hw(requestMetadata, z2, j2, i);
    }

    public /* synthetic */ ExtensionRequestFailure(androidx.camera.camera2.pipe.RequestMetadata requestMetadata, boolean z, long j, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(requestMetadata, z, j, i);
    }
}
