package androidx.camera.camera2.pipe.graph;

@kotlin.Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u001f\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0012\b\u0080\b\u0018\u00002\u00020\u0001B\u0091\u0001\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b\u0012\u0010\b\u0002\u0010\f\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\n\u0012\u0010\b\u0002\u0010\r\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\n\u0012\u0010\b\u0002\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\n\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000f\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u000f\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u000f¢\u0006\u0004\b\u0013\u0010\u0014J\u0012\u0010\u0017\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0015\u0010\u0016J\u0012\u0010\u001a\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u0018\u0010\u0019J\u0012\u0010\u001d\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b\u001b\u0010\u001cJ\u0012\u0010 \u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0004\b\u001e\u0010\u001fJ\u0018\u0010!\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\nHÆ\u0003¢\u0006\u0004\b!\u0010\"J\u0018\u0010#\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\nHÆ\u0003¢\u0006\u0004\b#\u0010\"J\u0018\u0010$\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\nHÆ\u0003¢\u0006\u0004\b$\u0010\"J\u0012\u0010%\u001a\u0004\u0018\u00010\u000fHÆ\u0003¢\u0006\u0004\b%\u0010&J\u0012\u0010'\u001a\u0004\u0018\u00010\u000fHÆ\u0003¢\u0006\u0004\b'\u0010&J\u0012\u0010(\u001a\u0004\u0018\u00010\u000fHÆ\u0003¢\u0006\u0004\b(\u0010&J\u009a\u0001\u0010+\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b2\u0010\b\u0002\u0010\f\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\n2\u0010\b\u0002\u0010\r\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\n2\u0010\b\u0002\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\n2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000f2\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u000f2\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u000fHÆ\u0001¢\u0006\u0004\b)\u0010*J\u001a\u0010-\u001a\u00020\u000f2\b\u0010,\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b-\u0010.J\u0010\u00100\u001a\u00020/HÖ\u0001¢\u0006\u0004\b0\u00101J\u0010\u00103\u001a\u000202HÖ\u0001¢\u0006\u0004\b3\u00104R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u00105\u001a\u0004\b6\u0010\u0016R\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u00107\u001a\u0004\b8\u0010\u0019R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u00109\u001a\u0004\b:\u0010\u001cR\u001c\u0010\t\u001a\u0004\u0018\u00010\b8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010;\u001a\u0004\b<\u0010\u001fR\"\u0010\f\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\n8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010=\u001a\u0004\b>\u0010\"R\"\u0010\r\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\n8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\r\u0010=\u001a\u0004\b?\u0010\"R\"\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\n8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u000e\u0010=\u001a\u0004\b@\u0010\"R\u001c\u0010\u0010\u001a\u0004\u0018\u00010\u000f8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0010\u0010A\u001a\u0004\bB\u0010&R\u001c\u0010\u0011\u001a\u0004\u0018\u00010\u000f8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0011\u0010A\u001a\u0004\bC\u0010&R\u001c\u0010\u0012\u001a\u0004\u0018\u00010\u000f8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0012\u0010A\u001a\u0004\bD\u0010&"}, d2 = {"Landroidx/camera/camera2/pipe/graph/State3A;", "", "Landroidx/camera/camera2/pipe/AeMode;", "aeMode", "Landroidx/camera/camera2/pipe/AfMode;", "afMode", "Landroidx/camera/camera2/pipe/AwbMode;", "awbMode", "Landroidx/camera/camera2/pipe/FlashMode;", "flashMode", "", "Landroid/hardware/camera2/params/MeteringRectangle;", "aeRegions", "afRegions", "awbRegions", "", "aeLock", "afLock", "awbLock", "<init>", "(Landroidx/camera/camera2/pipe/AeMode;Landroidx/camera/camera2/pipe/AfMode;Landroidx/camera/camera2/pipe/AwbMode;Landroidx/camera/camera2/pipe/FlashMode;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Lkotlin/jvm/internal/DefaultConstructorMarker;)V", "component1-O_cDUUs", "()Landroidx/camera/camera2/pipe/AeMode;", "component1", "component2-32_E3BI", "()Landroidx/camera/camera2/pipe/AfMode;", "component2", "component3-aLFtWSU", "()Landroidx/camera/camera2/pipe/AwbMode;", "component3", "component4-cL-19HE", "()Landroidx/camera/camera2/pipe/FlashMode;", "component4", "component5", "()Ljava/util/List;", "component6", "component7", "component8", "()Ljava/lang/Boolean;", "component9", "component10", "copy-7jOEVJU", "(Landroidx/camera/camera2/pipe/AeMode;Landroidx/camera/camera2/pipe/AfMode;Landroidx/camera/camera2/pipe/AwbMode;Landroidx/camera/camera2/pipe/FlashMode;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;)Landroidx/camera/camera2/pipe/graph/State3A;", "copy", "other", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Landroidx/camera/camera2/pipe/AeMode;", "getAeMode-O_cDUUs", "Landroidx/camera/camera2/pipe/AfMode;", "getAfMode-32_E3BI", "Landroidx/camera/camera2/pipe/AwbMode;", "getAwbMode-aLFtWSU", "Landroidx/camera/camera2/pipe/FlashMode;", "getFlashMode-cL-19HE", "Ljava/util/List;", "getAeRegions", "getAfRegions", "getAwbRegions", "Ljava/lang/Boolean;", "getAeLock", "getAfLock", "getAwbLock"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes6.dex */
public final /* data */ class State3A {
    private final java.lang.Boolean aeLock;
    private final androidx.camera.camera2.pipe.AeMode aeMode;
    private final java.util.List<android.hardware.camera2.params.MeteringRectangle> aeRegions;
    private final java.lang.Boolean afLock;
    private final androidx.camera.camera2.pipe.AfMode afMode;
    private final java.util.List<android.hardware.camera2.params.MeteringRectangle> afRegions;
    private final java.lang.Boolean awbLock;
    private final androidx.camera.camera2.pipe.AwbMode awbMode;
    private final java.util.List<android.hardware.camera2.params.MeteringRectangle> awbRegions;
    private final androidx.camera.camera2.pipe.FlashMode flashMode;

    private State3A(androidx.camera.camera2.pipe.AeMode aeMode, androidx.camera.camera2.pipe.AfMode afMode, androidx.camera.camera2.pipe.AwbMode awbMode, androidx.camera.camera2.pipe.FlashMode flashMode, java.util.List<android.hardware.camera2.params.MeteringRectangle> list, java.util.List<android.hardware.camera2.params.MeteringRectangle> list2, java.util.List<android.hardware.camera2.params.MeteringRectangle> list3, java.lang.Boolean bool, java.lang.Boolean bool2, java.lang.Boolean bool3) {
        this.aeMode = aeMode;
        this.afMode = afMode;
        this.awbMode = awbMode;
        this.flashMode = flashMode;
        this.aeRegions = list;
        this.afRegions = list2;
        this.awbRegions = list3;
        this.aeLock = bool;
        this.afLock = bool2;
        this.awbLock = bool3;
    }

    public /* synthetic */ State3A(androidx.camera.camera2.pipe.AeMode aeMode, androidx.camera.camera2.pipe.AfMode afMode, androidx.camera.camera2.pipe.AwbMode awbMode, androidx.camera.camera2.pipe.FlashMode flashMode, java.util.List list, java.util.List list2, java.util.List list3, java.lang.Boolean bool, java.lang.Boolean bool2, java.lang.Boolean bool3, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : aeMode, (i & 2) != 0 ? null : afMode, (i & 4) != 0 ? null : awbMode, (i & 8) != 0 ? null : flashMode, (i & 16) != 0 ? null : list, (i & 32) != 0 ? null : list2, (i & 64) != 0 ? null : list3, (i & 128) != 0 ? null : bool, (i & 256) != 0 ? null : bool2, (i & 512) == 0 ? bool3 : null, null);
    }

    /* renamed from: getAeMode-O_cDUUs, reason: not valid java name */
    public final androidx.camera.camera2.pipe.AeMode m935getAeModeO_cDUUs() {
        return this.aeMode;
    }

    /* renamed from: getAfMode-32_E3BI, reason: not valid java name */
    public final androidx.camera.camera2.pipe.AfMode m936getAfMode32_E3BI() {
        return this.afMode;
    }

    /* renamed from: getAwbMode-aLFtWSU, reason: not valid java name */
    public final androidx.camera.camera2.pipe.AwbMode m937getAwbModeaLFtWSU() {
        return this.awbMode;
    }

    /* renamed from: getFlashMode-cL-19HE, reason: not valid java name */
    public final androidx.camera.camera2.pipe.FlashMode m938getFlashModecL19HE() {
        return this.flashMode;
    }

    public final java.util.List<android.hardware.camera2.params.MeteringRectangle> getAeRegions() {
        return this.aeRegions;
    }

    public final java.util.List<android.hardware.camera2.params.MeteringRectangle> getAfRegions() {
        return this.afRegions;
    }

    public final java.util.List<android.hardware.camera2.params.MeteringRectangle> getAwbRegions() {
        return this.awbRegions;
    }

    public final java.lang.Boolean getAeLock() {
        return this.aeLock;
    }

    public final java.lang.Boolean getAfLock() {
        return this.afLock;
    }

    public final java.lang.Boolean getAwbLock() {
        return this.awbLock;
    }

    public final java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("State3A(aeMode=");
        sb.append(this.aeMode);
        sb.append(", afMode=");
        sb.append(this.afMode);
        sb.append(", awbMode=");
        sb.append(this.awbMode);
        sb.append(", flashMode=");
        sb.append(this.flashMode);
        sb.append(", aeRegions=");
        sb.append(this.aeRegions);
        sb.append(", afRegions=");
        sb.append(this.afRegions);
        sb.append(", awbRegions=");
        sb.append(this.awbRegions);
        sb.append(", aeLock=");
        sb.append(this.aeLock);
        sb.append(", afLock=");
        sb.append(this.afLock);
        sb.append(", awbLock=");
        sb.append(this.awbLock);
        sb.append(')');
        return sb.toString();
    }

    public final int hashCode() {
        androidx.camera.camera2.pipe.AeMode aeMode = this.aeMode;
        int m154hashCodeimpl = aeMode == null ? 0 : androidx.camera.camera2.pipe.AeMode.m154hashCodeimpl(aeMode.m157unboximpl());
        androidx.camera.camera2.pipe.AfMode afMode = this.afMode;
        int m172hashCodeimpl = afMode == null ? 0 : androidx.camera.camera2.pipe.AfMode.m172hashCodeimpl(afMode.m176unboximpl());
        androidx.camera.camera2.pipe.AwbMode awbMode = this.awbMode;
        int m199hashCodeimpl = awbMode == null ? 0 : androidx.camera.camera2.pipe.AwbMode.m199hashCodeimpl(awbMode.m202unboximpl());
        androidx.camera.camera2.pipe.FlashMode flashMode = this.flashMode;
        int m450hashCodeimpl = flashMode == null ? 0 : androidx.camera.camera2.pipe.FlashMode.m450hashCodeimpl(flashMode.m452unboximpl());
        java.util.List<android.hardware.camera2.params.MeteringRectangle> list = this.aeRegions;
        int hashCode = list == null ? 0 : list.hashCode();
        java.util.List<android.hardware.camera2.params.MeteringRectangle> list2 = this.afRegions;
        int hashCode2 = list2 == null ? 0 : list2.hashCode();
        java.util.List<android.hardware.camera2.params.MeteringRectangle> list3 = this.awbRegions;
        int hashCode3 = list3 == null ? 0 : list3.hashCode();
        java.lang.Boolean bool = this.aeLock;
        int hashCode4 = bool == null ? 0 : bool.hashCode();
        java.lang.Boolean bool2 = this.afLock;
        int hashCode5 = bool2 == null ? 0 : bool2.hashCode();
        java.lang.Boolean bool3 = this.awbLock;
        return (((((((((((((((((m154hashCodeimpl * 31) + m172hashCodeimpl) * 31) + m199hashCodeimpl) * 31) + m450hashCodeimpl) * 31) + hashCode) * 31) + hashCode2) * 31) + hashCode3) * 31) + hashCode4) * 31) + hashCode5) * 31) + (bool3 != null ? bool3.hashCode() : 0);
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof androidx.camera.camera2.pipe.graph.State3A)) {
            return false;
        }
        androidx.camera.camera2.pipe.graph.State3A state3A = (androidx.camera.camera2.pipe.graph.State3A) other;
        return kotlin.jvm.internal.Intrinsics.areEqual(this.aeMode, state3A.aeMode) && kotlin.jvm.internal.Intrinsics.areEqual(this.afMode, state3A.afMode) && kotlin.jvm.internal.Intrinsics.areEqual(this.awbMode, state3A.awbMode) && kotlin.jvm.internal.Intrinsics.areEqual(this.flashMode, state3A.flashMode) && kotlin.jvm.internal.Intrinsics.areEqual(this.aeRegions, state3A.aeRegions) && kotlin.jvm.internal.Intrinsics.areEqual(this.afRegions, state3A.afRegions) && kotlin.jvm.internal.Intrinsics.areEqual(this.awbRegions, state3A.awbRegions) && kotlin.jvm.internal.Intrinsics.areEqual(this.aeLock, state3A.aeLock) && kotlin.jvm.internal.Intrinsics.areEqual(this.afLock, state3A.afLock) && kotlin.jvm.internal.Intrinsics.areEqual(this.awbLock, state3A.awbLock);
    }

    /* renamed from: copy-7jOEVJU, reason: not valid java name */
    public final androidx.camera.camera2.pipe.graph.State3A m934copy7jOEVJU(androidx.camera.camera2.pipe.AeMode aeMode, androidx.camera.camera2.pipe.AfMode afMode, androidx.camera.camera2.pipe.AwbMode awbMode, androidx.camera.camera2.pipe.FlashMode flashMode, java.util.List<android.hardware.camera2.params.MeteringRectangle> aeRegions, java.util.List<android.hardware.camera2.params.MeteringRectangle> afRegions, java.util.List<android.hardware.camera2.params.MeteringRectangle> awbRegions, java.lang.Boolean aeLock, java.lang.Boolean afLock, java.lang.Boolean awbLock) {
        return new androidx.camera.camera2.pipe.graph.State3A(aeMode, afMode, awbMode, flashMode, aeRegions, afRegions, awbRegions, aeLock, afLock, awbLock, null);
    }

    /* renamed from: component9, reason: from getter */
    public final java.lang.Boolean getAfLock() {
        return this.afLock;
    }

    /* renamed from: component8, reason: from getter */
    public final java.lang.Boolean getAeLock() {
        return this.aeLock;
    }

    public final java.util.List<android.hardware.camera2.params.MeteringRectangle> component7() {
        return this.awbRegions;
    }

    public final java.util.List<android.hardware.camera2.params.MeteringRectangle> component6() {
        return this.afRegions;
    }

    public final java.util.List<android.hardware.camera2.params.MeteringRectangle> component5() {
        return this.aeRegions;
    }

    /* renamed from: component4-cL-19HE, reason: not valid java name and from getter */
    public final androidx.camera.camera2.pipe.FlashMode getFlashMode() {
        return this.flashMode;
    }

    /* renamed from: component3-aLFtWSU, reason: not valid java name and from getter */
    public final androidx.camera.camera2.pipe.AwbMode getAwbMode() {
        return this.awbMode;
    }

    /* renamed from: component2-32_E3BI, reason: not valid java name and from getter */
    public final androidx.camera.camera2.pipe.AfMode getAfMode() {
        return this.afMode;
    }

    /* renamed from: component10, reason: from getter */
    public final java.lang.Boolean getAwbLock() {
        return this.awbLock;
    }

    /* renamed from: component1-O_cDUUs, reason: not valid java name and from getter */
    public final androidx.camera.camera2.pipe.AeMode getAeMode() {
        return this.aeMode;
    }

    public /* synthetic */ State3A(androidx.camera.camera2.pipe.AeMode aeMode, androidx.camera.camera2.pipe.AfMode afMode, androidx.camera.camera2.pipe.AwbMode awbMode, androidx.camera.camera2.pipe.FlashMode flashMode, java.util.List list, java.util.List list2, java.util.List list3, java.lang.Boolean bool, java.lang.Boolean bool2, java.lang.Boolean bool3, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(aeMode, afMode, awbMode, flashMode, list, list2, list3, bool, bool2, bool3);
    }
}
