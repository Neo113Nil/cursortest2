package androidx.compose.ui.window;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006"}, d2 = {"Landroidx/compose/ui/window/SecureFlagPolicy;", "", "<init>", "(Ljava/lang/String;I)V", "Inherit", "SecureOn", "SecureOff"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
public final class SecureFlagPolicy {
    private static final /* synthetic */ androidx.compose.ui.window.SecureFlagPolicy[] getHighSpeedVideoFpsRangesFor;
    private static final /* synthetic */ kotlin.enums.EnumEntries getHighSpeedVideoSizes;
    public static final androidx.compose.ui.window.SecureFlagPolicy Inherit = new androidx.compose.ui.window.SecureFlagPolicy("Inherit", 0);
    public static final androidx.compose.ui.window.SecureFlagPolicy SecureOn = new androidx.compose.ui.window.SecureFlagPolicy("SecureOn", 1);
    public static final androidx.compose.ui.window.SecureFlagPolicy SecureOff = new androidx.compose.ui.window.SecureFlagPolicy("SecureOff", 2);

    private SecureFlagPolicy(java.lang.String str, int i) {
    }

    static {
        androidx.compose.ui.window.SecureFlagPolicy[] highSpeedVideoFpsRanges = getHighSpeedVideoFpsRanges();
        getHighSpeedVideoFpsRangesFor = highSpeedVideoFpsRanges;
        getHighSpeedVideoSizes = kotlin.enums.EnumEntriesKt.enumEntries(highSpeedVideoFpsRanges);
    }

    public static androidx.compose.ui.window.SecureFlagPolicy[] values() {
        return (androidx.compose.ui.window.SecureFlagPolicy[]) getHighSpeedVideoFpsRangesFor.clone();
    }

    public static androidx.compose.ui.window.SecureFlagPolicy valueOf(java.lang.String str) {
        return (androidx.compose.ui.window.SecureFlagPolicy) java.lang.Enum.valueOf(androidx.compose.ui.window.SecureFlagPolicy.class, str);
    }

    public static kotlin.enums.EnumEntries<androidx.compose.ui.window.SecureFlagPolicy> getEntries() {
        return getHighSpeedVideoSizes;
    }

    private static final /* synthetic */ androidx.compose.ui.window.SecureFlagPolicy[] getHighSpeedVideoFpsRanges() {
        return new androidx.compose.ui.window.SecureFlagPolicy[]{Inherit, SecureOn, SecureOff};
    }
}
