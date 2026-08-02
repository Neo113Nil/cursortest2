package T2;

import android.content.Context;
import android.content.SharedPreferences;
import android.preference.PreferenceManager;
import com.google.android.gms.internal.ads.A7;
import com.google.android.gms.internal.ads.F7;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Objects;

/* loaded from: classes.dex */
public final class C {

    /* renamed from: a, reason: collision with root package name */
    public final HashMap f5630a = new HashMap();

    /* renamed from: b, reason: collision with root package name */
    public final ArrayList f5631b = new ArrayList();

    /* renamed from: c, reason: collision with root package name */
    public final Context f5632c;

    public C(Context context) {
        this.f5632c = context;
    }

    public final void a() {
        A7 a7 = F7.X9;
        Q2.r rVar = Q2.r.f5053d;
        if (((Boolean) rVar.f5056c.a(a7)).booleanValue()) {
            L l5 = P2.o.f4767B.f4771c;
            HashMap I5 = L.I((String) rVar.f5056c.a(F7.ca));
            for (String str : I5.keySet()) {
                synchronized (this) {
                    try {
                        if (!this.f5630a.containsKey(str)) {
                            SharedPreferences defaultSharedPreferences = Objects.equals(str, "__default__") ? PreferenceManager.getDefaultSharedPreferences(this.f5632c) : this.f5632c.getSharedPreferences(str, 0);
                            B b3 = new B(this, str);
                            this.f5630a.put(str, b3);
                            defaultSharedPreferences.registerOnSharedPreferenceChangeListener(b3);
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            }
            b(new A(I5));
        }
    }

    public final synchronized void b(A a5) {
        this.f5631b.add(a5);
    }
}
