package sg.bigo.ads.F0;

import android.content.SharedPreferences;

/* loaded from: classes3.dex */
public final class c {
    public static void a(SharedPreferences.Editor editor) {
        try {
            editor.apply();
        } catch (AbstractMethodError unused) {
            editor.commit();
        }
    }
}
