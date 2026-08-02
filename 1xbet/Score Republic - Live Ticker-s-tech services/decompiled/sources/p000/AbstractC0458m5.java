package p000;

import android.os.PowerManager;
import java.util.Locale;

/* JADX INFO: renamed from: m5 */
/* JADX INFO: compiled from: r8-map-id-738170b7fb69b873ed7524d5270c8e05c6f5fb40ea1ade7a72c8ed7a70699269 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0458m5 {
    /* JADX INFO: renamed from: a */
    public static boolean m3325a(PowerManager powerManager) {
        return powerManager.isPowerSaveMode();
    }

    /* JADX INFO: renamed from: b */
    public static String m3326b(Locale locale) {
        return locale.toLanguageTag();
    }
}
