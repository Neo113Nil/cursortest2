package androidx.camera.viewfinder.core;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@kotlin.Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\b\n\u0002\b\u000b\b\u0086\u0001\u0018\u0000 \u000b2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u000bB\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\r\u0010\u0006\u001a\u00020\u0002¢\u0006\u0004\b\u0006\u0010\u0007R\u0014\u0010\n\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\tj\u0002\b\fj\u0002\b\r"}, d2 = {"Landroidx/camera/viewfinder/core/ImplementationMode;", "", "", "p0", "<init>", "(Ljava/lang/String;II)V", "getId", "()I", "getHighSpeedVideoFpsRanges", com.visa.cbp.getEncExpo.warmup, "getHighSpeedVideoFpsRangesFor", "Companion", "EXTERNAL", "EMBEDDED"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class ImplementationMode {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final androidx.camera.viewfinder.core.ImplementationMode.Companion INSTANCE;
    public static final androidx.camera.viewfinder.core.ImplementationMode EMBEDDED;
    public static final androidx.camera.viewfinder.core.ImplementationMode EXTERNAL;
    private static final /* synthetic */ androidx.camera.viewfinder.core.ImplementationMode[] getHighSpeedVideoFpsRangesFor;
    private static final /* synthetic */ kotlin.enums.EnumEntries getHighSpeedVideoSizes;

    /* renamed from: getHighSpeedVideoFpsRanges, reason: from kotlin metadata */
    private final int getHighSpeedVideoFpsRangesFor;

    private ImplementationMode(java.lang.String str, int i, int i2) {
        this.getHighSpeedVideoFpsRangesFor = i2;
    }

    static {
        androidx.camera.viewfinder.core.ImplementationMode implementationMode = new androidx.camera.viewfinder.core.ImplementationMode("EXTERNAL", 0, 0);
        EXTERNAL = implementationMode;
        androidx.camera.viewfinder.core.ImplementationMode implementationMode2 = new androidx.camera.viewfinder.core.ImplementationMode("EMBEDDED", 1, 1);
        EMBEDDED = implementationMode2;
        androidx.camera.viewfinder.core.ImplementationMode[] implementationModeArr = {implementationMode, implementationMode2};
        getHighSpeedVideoFpsRangesFor = implementationModeArr;
        getHighSpeedVideoSizes = kotlin.enums.EnumEntriesKt.enumEntries(implementationModeArr);
        INSTANCE = new androidx.camera.viewfinder.core.ImplementationMode.Companion(null);
    }

    /* renamed from: getId, reason: from getter */
    public final int getGetHighSpeedVideoFpsRangesFor() {
        return this.getHighSpeedVideoFpsRangesFor;
    }

    @kotlin.Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Landroidx/camera/viewfinder/core/ImplementationMode$Companion;", "", "<init>", "()V", "", "id", "Landroidx/camera/viewfinder/core/ImplementationMode;", "fromId", "(I)Landroidx/camera/viewfinder/core/ImplementationMode;"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        @kotlin.jvm.JvmStatic
        public final androidx.camera.viewfinder.core.ImplementationMode fromId(int id) {
            for (androidx.camera.viewfinder.core.ImplementationMode implementationMode : androidx.camera.viewfinder.core.ImplementationMode.values()) {
                if (implementationMode.getHighSpeedVideoFpsRangesFor == id) {
                    return implementationMode;
                }
            }
            throw new java.lang.IllegalArgumentException("Unknown implementation mode id ".concat(java.lang.String.valueOf(id)));
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public static androidx.camera.viewfinder.core.ImplementationMode[] values() {
        return (androidx.camera.viewfinder.core.ImplementationMode[]) getHighSpeedVideoFpsRangesFor.clone();
    }

    public static androidx.camera.viewfinder.core.ImplementationMode valueOf(java.lang.String str) {
        return (androidx.camera.viewfinder.core.ImplementationMode) java.lang.Enum.valueOf(androidx.camera.viewfinder.core.ImplementationMode.class, str);
    }

    public static kotlin.enums.EnumEntries<androidx.camera.viewfinder.core.ImplementationMode> getEntries() {
        return getHighSpeedVideoSizes;
    }

    @kotlin.jvm.JvmStatic
    public static final androidx.camera.viewfinder.core.ImplementationMode fromId(int i) {
        return INSTANCE.fromId(i);
    }
}
