package I2;

import android.content.SharedPreferences;
import java.util.HashMap;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public final class E implements SharedPreferences.OnSharedPreferenceChangeListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f3530a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ F f3531b;

    public E(F f7, String str) {
        this.f3531b = f7;
        this.f3530a = str;
    }

    @Override // android.content.SharedPreferences.OnSharedPreferenceChangeListener
    public final void onSharedPreferenceChanged(SharedPreferences sharedPreferences, String str) {
        synchronized (this.f3531b) {
            try {
                for (D d7 : this.f3531b.f3533b) {
                    String str2 = this.f3530a;
                    HashMap map = d7.f3529a;
                    if (map.containsKey(str2) && ((Set) map.get(str2)).contains(str)) {
                        ((M) E2.o.f1952C.f1961g.zzi()).d(false);
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
