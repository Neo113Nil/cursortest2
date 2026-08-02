package T2;

import android.content.SharedPreferences;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Set;

/* loaded from: classes.dex */
public final class B implements SharedPreferences.OnSharedPreferenceChangeListener {

    /* renamed from: a, reason: collision with root package name */
    public final String f5628a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C f5629b;

    public B(C c5, String str) {
        this.f5629b = c5;
        this.f5628a = str;
    }

    @Override // android.content.SharedPreferences.OnSharedPreferenceChangeListener
    public final void onSharedPreferenceChanged(SharedPreferences sharedPreferences, String str) {
        synchronized (this.f5629b) {
            try {
                ArrayList arrayList = this.f5629b.f5631b;
                int size = arrayList.size();
                int i = 0;
                while (i < size) {
                    Object obj = arrayList.get(i);
                    i++;
                    String str2 = this.f5628a;
                    HashMap hashMap = ((A) obj).f5627a;
                    if (hashMap.containsKey(str2) && ((Set) hashMap.get(str2)).contains(str)) {
                        P2.o.f4767B.f4774g.d().e(false);
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
