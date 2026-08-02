package androidx.core.flagging;

@kotlin.Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0002\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001f\u0010\t\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\t\u0010\nR\u0014\u0010\r\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\f"}, d2 = {"Landroidx/core/flagging/AconfigPackageCompatApi36Impl;", "Landroidx/core/flagging/AconfigPackageCompat;", "Landroid/os/flagging/AconfigPackage;", "p0", "<init>", "(Landroid/os/flagging/AconfigPackage;)V", "", "", "p1", "getBooleanFlagValue", "(Ljava/lang/String;Z)Z", "getHighSpeedVideoFpsRanges", "Landroid/os/flagging/AconfigPackage;", "getHighSpeedVideoFpsRangesFor"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes7.dex */
final class AconfigPackageCompatApi36Impl implements androidx.core.flagging.AconfigPackageCompat {

    /* renamed from: getHighSpeedVideoFpsRanges, reason: from kotlin metadata */
    private final android.os.flagging.AconfigPackage getHighSpeedVideoFpsRangesFor;

    public AconfigPackageCompatApi36Impl(android.os.flagging.AconfigPackage aconfigPackage) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(aconfigPackage, "");
        this.getHighSpeedVideoFpsRangesFor = aconfigPackage;
    }

    @Override // androidx.core.flagging.AconfigPackageCompat
    public final boolean getBooleanFlagValue(java.lang.String p0, boolean p1) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p0, "");
        return this.getHighSpeedVideoFpsRangesFor.getBooleanFlagValue(p0, p1);
    }
}
