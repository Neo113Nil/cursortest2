package I2;

import android.content.SharedPreferences;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

/* loaded from: classes.dex */
public final class E implements SharedPreferences.OnSharedPreferenceChangeListener {

    /* renamed from: a, reason: collision with root package name */
    public final String f3530a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ F f3531b;

    public E(F f7, String str) {
        this.f3531b = f7;
        this.f3530a = str;
    }

    @Override // android.content.SharedPreferences.OnSharedPreferenceChangeListener
    public final void onSharedPreferenceChanged(SharedPreferences sharedPreferences, String str) {
        synchronized (this.f3531b) {
            try {
                Iterator it = this.f3531b.f3533b.iterator();
                while (it.hasNext()) {
                    D d7 = (D) it.next();
                    String str2 = this.f3530a;
                    HashMap hashMap = d7.f3529a;
                    if (hashMap.containsKey(str2) && ((Set) hashMap.get(str2)).contains(str)) {
                        ((M) E2.o.f1952C.f1961g.zzi()).d(false);
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
