package androidx.camera.viewfinder.core;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@kotlin.Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0016\b\u0086\u0001\u0018\u0000 \u00162\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0016B!\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tR\u0017\u0010\n\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\rR\u001a\u0010\u000e\u001a\u00020\u00048\u0001X\u0081\u0004¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011R\u001a\u0010\u0012\u001a\u00020\u00068\u0001X\u0081\u0004¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015j\u0002\b\u0017j\u0002\b\u0018j\u0002\b\u0019j\u0002\b\u001aj\u0002\b\u001bj\u0002\b\u001c"}, d2 = {"Landroidx/camera/viewfinder/core/ScaleType;", "", "", "p0", "Landroidx/camera/viewfinder/core/impl/ContentScale;", "p1", "Landroidx/camera/viewfinder/core/impl/Alignment;", "p2", "<init>", "(Ljava/lang/String;IILandroidx/camera/viewfinder/core/impl/ContentScale;Landroidx/camera/viewfinder/core/impl/Alignment;)V", "id", com.visa.cbp.getEncExpo.warmup, "getId", "()I", "contentScale", "Landroidx/camera/viewfinder/core/impl/ContentScale;", "getContentScale$viewfinder_core", "()Landroidx/camera/viewfinder/core/impl/ContentScale;", "alignment", "Landroidx/camera/viewfinder/core/impl/Alignment;", "getAlignment$viewfinder_core", "()Landroidx/camera/viewfinder/core/impl/Alignment;", "Companion", "FILL_START", "FILL_CENTER", "FILL_END", "FIT_START", "FIT_CENTER", "FIT_END"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class ScaleType {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final androidx.camera.viewfinder.core.ScaleType.Companion INSTANCE;
    public static final androidx.camera.viewfinder.core.ScaleType FILL_CENTER;
    public static final androidx.camera.viewfinder.core.ScaleType FILL_END;
    public static final androidx.camera.viewfinder.core.ScaleType FILL_START;
    public static final androidx.camera.viewfinder.core.ScaleType FIT_CENTER;
    public static final androidx.camera.viewfinder.core.ScaleType FIT_END;
    public static final androidx.camera.viewfinder.core.ScaleType FIT_START;
    private static final /* synthetic */ kotlin.enums.EnumEntries getHighSpeedVideoFpsRanges;
    private static final /* synthetic */ androidx.camera.viewfinder.core.ScaleType[] getHighSpeedVideoFpsRangesFor;
    private final androidx.camera.viewfinder.core.impl.Alignment alignment;
    private final androidx.camera.viewfinder.core.impl.ContentScale contentScale;
    private final int id;

    private ScaleType(java.lang.String str, int i, int i2, androidx.camera.viewfinder.core.impl.ContentScale contentScale, androidx.camera.viewfinder.core.impl.Alignment alignment) {
        this.id = i2;
        this.contentScale = contentScale;
        this.alignment = alignment;
    }

    public final int getId() {
        return this.id;
    }

    /* renamed from: getContentScale$viewfinder_core, reason: from getter */
    public final androidx.camera.viewfinder.core.impl.ContentScale getContentScale() {
        return this.contentScale;
    }

    /* renamed from: getAlignment$viewfinder_core, reason: from getter */
    public final androidx.camera.viewfinder.core.impl.Alignment getAlignment() {
        return this.alignment;
    }

    static {
        androidx.camera.viewfinder.core.ScaleTypeKt$Fill$1 scaleTypeKt$Fill$1;
        androidx.camera.viewfinder.core.impl.Alignment alignment;
        androidx.camera.viewfinder.core.ScaleTypeKt$Fill$1 scaleTypeKt$Fill$12;
        androidx.camera.viewfinder.core.impl.Alignment alignment2;
        androidx.camera.viewfinder.core.ScaleTypeKt$Fill$1 scaleTypeKt$Fill$13;
        androidx.camera.viewfinder.core.impl.Alignment alignment3;
        androidx.camera.viewfinder.core.ScaleTypeKt$Fit$1 scaleTypeKt$Fit$1;
        androidx.camera.viewfinder.core.impl.Alignment alignment4;
        androidx.camera.viewfinder.core.ScaleTypeKt$Fit$1 scaleTypeKt$Fit$12;
        androidx.camera.viewfinder.core.impl.Alignment alignment5;
        androidx.camera.viewfinder.core.ScaleTypeKt$Fit$1 scaleTypeKt$Fit$13;
        androidx.camera.viewfinder.core.impl.Alignment alignment6;
        scaleTypeKt$Fill$1 = androidx.camera.viewfinder.core.ScaleTypeKt.getHighSpeedVideoSizes;
        alignment = androidx.camera.viewfinder.core.ScaleTypeKt.getHighSpeedVideoFpsRangesFor;
        androidx.camera.viewfinder.core.ScaleType scaleType = new androidx.camera.viewfinder.core.ScaleType("FILL_START", 0, 0, scaleTypeKt$Fill$1, alignment);
        FILL_START = scaleType;
        scaleTypeKt$Fill$12 = androidx.camera.viewfinder.core.ScaleTypeKt.getHighSpeedVideoSizes;
        alignment2 = androidx.camera.viewfinder.core.ScaleTypeKt.getHighSpeedVideoFpsRanges;
        androidx.camera.viewfinder.core.ScaleType scaleType2 = new androidx.camera.viewfinder.core.ScaleType("FILL_CENTER", 1, 1, scaleTypeKt$Fill$12, alignment2);
        FILL_CENTER = scaleType2;
        scaleTypeKt$Fill$13 = androidx.camera.viewfinder.core.ScaleTypeKt.getHighSpeedVideoSizes;
        alignment3 = androidx.camera.viewfinder.core.ScaleTypeKt.getHighResolutionOutputSizeshNQ4ISI;
        androidx.camera.viewfinder.core.ScaleType scaleType3 = new androidx.camera.viewfinder.core.ScaleType("FILL_END", 2, 2, scaleTypeKt$Fill$13, alignment3);
        FILL_END = scaleType3;
        scaleTypeKt$Fit$1 = androidx.camera.viewfinder.core.ScaleTypeKt.Camera2StreamConfigurationMap;
        alignment4 = androidx.camera.viewfinder.core.ScaleTypeKt.getHighSpeedVideoFpsRangesFor;
        androidx.camera.viewfinder.core.ScaleType scaleType4 = new androidx.camera.viewfinder.core.ScaleType("FIT_START", 3, 3, scaleTypeKt$Fit$1, alignment4);
        FIT_START = scaleType4;
        scaleTypeKt$Fit$12 = androidx.camera.viewfinder.core.ScaleTypeKt.Camera2StreamConfigurationMap;
        alignment5 = androidx.camera.viewfinder.core.ScaleTypeKt.getHighSpeedVideoFpsRanges;
        androidx.camera.viewfinder.core.ScaleType scaleType5 = new androidx.camera.viewfinder.core.ScaleType("FIT_CENTER", 4, 4, scaleTypeKt$Fit$12, alignment5);
        FIT_CENTER = scaleType5;
        scaleTypeKt$Fit$13 = androidx.camera.viewfinder.core.ScaleTypeKt.Camera2StreamConfigurationMap;
        alignment6 = androidx.camera.viewfinder.core.ScaleTypeKt.getHighResolutionOutputSizeshNQ4ISI;
        androidx.camera.viewfinder.core.ScaleType scaleType6 = new androidx.camera.viewfinder.core.ScaleType("FIT_END", 5, 5, scaleTypeKt$Fit$13, alignment6);
        FIT_END = scaleType6;
        androidx.camera.viewfinder.core.ScaleType[] scaleTypeArr = {scaleType, scaleType2, scaleType3, scaleType4, scaleType5, scaleType6};
        getHighSpeedVideoFpsRangesFor = scaleTypeArr;
        getHighSpeedVideoFpsRanges = kotlin.enums.EnumEntriesKt.enumEntries(scaleTypeArr);
        INSTANCE = new androidx.camera.viewfinder.core.ScaleType.Companion(null);
    }

    @kotlin.Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Landroidx/camera/viewfinder/core/ScaleType$Companion;", "", "<init>", "()V", "", "id", "Landroidx/camera/viewfinder/core/ScaleType;", "fromId", "(I)Landroidx/camera/viewfinder/core/ScaleType;"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        @kotlin.jvm.JvmStatic
        public final androidx.camera.viewfinder.core.ScaleType fromId(int id) {
            for (androidx.camera.viewfinder.core.ScaleType scaleType : androidx.camera.viewfinder.core.ScaleType.values()) {
                if (scaleType.getId() == id) {
                    return scaleType;
                }
            }
            throw new java.lang.IllegalArgumentException("Unknown scale type id ".concat(java.lang.String.valueOf(id)));
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public static androidx.camera.viewfinder.core.ScaleType[] values() {
        return (androidx.camera.viewfinder.core.ScaleType[]) getHighSpeedVideoFpsRangesFor.clone();
    }

    public static androidx.camera.viewfinder.core.ScaleType valueOf(java.lang.String str) {
        return (androidx.camera.viewfinder.core.ScaleType) java.lang.Enum.valueOf(androidx.camera.viewfinder.core.ScaleType.class, str);
    }

    public static kotlin.enums.EnumEntries<androidx.camera.viewfinder.core.ScaleType> getEntries() {
        return getHighSpeedVideoFpsRanges;
    }

    @kotlin.jvm.JvmStatic
    public static final androidx.camera.viewfinder.core.ScaleType fromId(int i) {
        return INSTANCE.fromId(i);
    }
}
