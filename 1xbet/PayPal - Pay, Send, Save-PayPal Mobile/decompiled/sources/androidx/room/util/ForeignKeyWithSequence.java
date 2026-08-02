package androidx.room.util;

@kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u000f\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\r\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0005¢\u0006\u0004\b\b\u0010\tR\u0017\u0010\u000e\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\rR\u0014\u0010\u000f\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000bR\u001a\u0010\f\u001a\u00020\u00058\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u000f\u0010\u0011R\u001a\u0010\u0012\u001a\u00020\u00058\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0012\u0010\u0010\u001a\u0004\b\u0012\u0010\u0011"}, d2 = {"Landroidx/room/util/ForeignKeyWithSequence;", "", "", "p0", "p1", "", "p2", "p3", "<init>", "(IILjava/lang/String;Ljava/lang/String;)V", "getHighSpeedVideoFpsRanges", com.visa.cbp.getEncExpo.warmup, "Camera2StreamConfigurationMap", "()I", "getHighSpeedVideoSizes", "getHighResolutionOutputSizeshNQ4ISI", "Ljava/lang/String;", "()Ljava/lang/String;", "getHighSpeedVideoFpsRangesFor"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes7.dex */
final class ForeignKeyWithSequence implements java.lang.Comparable<androidx.room.util.ForeignKeyWithSequence> {

    /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: from kotlin metadata */
    private final java.lang.String Camera2StreamConfigurationMap;

    /* renamed from: getHighSpeedVideoFpsRanges, reason: from kotlin metadata */
    private final int getHighSpeedVideoSizes;
    private final java.lang.String getHighSpeedVideoFpsRangesFor;

    /* renamed from: getHighSpeedVideoSizes, reason: from kotlin metadata */
    private final int getHighResolutionOutputSizeshNQ4ISI;

    public ForeignKeyWithSequence(int i, int i2, java.lang.String str, java.lang.String str2) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str2, "");
        this.getHighSpeedVideoSizes = i;
        this.getHighResolutionOutputSizeshNQ4ISI = i2;
        this.Camera2StreamConfigurationMap = str;
        this.getHighSpeedVideoFpsRangesFor = str2;
    }

    @Override // java.lang.Comparable
    public final /* synthetic */ int compareTo(androidx.room.util.ForeignKeyWithSequence foreignKeyWithSequence) {
        androidx.room.util.ForeignKeyWithSequence foreignKeyWithSequence2 = foreignKeyWithSequence;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(foreignKeyWithSequence2, "");
        int i = this.getHighSpeedVideoSizes - foreignKeyWithSequence2.getHighSpeedVideoSizes;
        return i == 0 ? this.getHighResolutionOutputSizeshNQ4ISI - foreignKeyWithSequence2.getHighResolutionOutputSizeshNQ4ISI : i;
    }

    /* renamed from: Camera2StreamConfigurationMap, reason: from getter */
    public final int getGetHighSpeedVideoSizes() {
        return this.getHighSpeedVideoSizes;
    }

    /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: from getter */
    public final java.lang.String getCamera2StreamConfigurationMap() {
        return this.Camera2StreamConfigurationMap;
    }

    /* renamed from: getHighSpeedVideoFpsRangesFor, reason: from getter */
    public final java.lang.String getGetHighSpeedVideoFpsRangesFor() {
        return this.getHighSpeedVideoFpsRangesFor;
    }
}
