package androidx.window.core;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0080\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006"}, d2 = {"Landroidx/window/core/VerificationMode;", "", "<init>", "(Ljava/lang/String;I)V", org.apache.commons.imaging.ImagingConstants.PARAM_KEY_STRICT, "LOG", "QUIET"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class VerificationMode {
    private static final /* synthetic */ androidx.window.core.VerificationMode[] Camera2StreamConfigurationMap;
    public static final androidx.window.core.VerificationMode LOG;
    public static final androidx.window.core.VerificationMode QUIET;
    public static final androidx.window.core.VerificationMode STRICT;
    private static final /* synthetic */ kotlin.enums.EnumEntries getHighSpeedVideoFpsRangesFor;

    private VerificationMode(java.lang.String str, int i) {
    }

    static {
        androidx.window.core.VerificationMode verificationMode = new androidx.window.core.VerificationMode(org.apache.commons.imaging.ImagingConstants.PARAM_KEY_STRICT, 0);
        STRICT = verificationMode;
        androidx.window.core.VerificationMode verificationMode2 = new androidx.window.core.VerificationMode("LOG", 1);
        LOG = verificationMode2;
        androidx.window.core.VerificationMode verificationMode3 = new androidx.window.core.VerificationMode("QUIET", 2);
        QUIET = verificationMode3;
        androidx.window.core.VerificationMode[] verificationModeArr = {verificationMode, verificationMode2, verificationMode3};
        Camera2StreamConfigurationMap = verificationModeArr;
        getHighSpeedVideoFpsRangesFor = kotlin.enums.EnumEntriesKt.enumEntries(verificationModeArr);
    }

    public static androidx.window.core.VerificationMode[] values() {
        return (androidx.window.core.VerificationMode[]) Camera2StreamConfigurationMap.clone();
    }

    public static androidx.window.core.VerificationMode valueOf(java.lang.String str) {
        return (androidx.window.core.VerificationMode) java.lang.Enum.valueOf(androidx.window.core.VerificationMode.class, str);
    }

    public static kotlin.enums.EnumEntries<androidx.window.core.VerificationMode> getEntries() {
        return getHighSpeedVideoFpsRangesFor;
    }
}
