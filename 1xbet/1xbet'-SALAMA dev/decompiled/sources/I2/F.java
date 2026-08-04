package I2;

import F2.C0254t;
import android.content.Context;
import android.content.SharedPreferences;
import android.preference.PreferenceManager;
import com.google.android.gms.internal.ads.zzbbp;
import com.google.android.gms.internal.ads.zzbby;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public final class F {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final HashMap f3532a = new HashMap();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ArrayList f3533b = new ArrayList();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Context f3534c;

    public F(Context context) {
        this.f3534c = context;
    }

    public final void a() {
        zzbbp zzbbpVar = zzbby.zzkt;
        C0254t c0254t = C0254t.f2723d;
        if (((Boolean) c0254t.f2726c.zzb(zzbbpVar)).booleanValue()) {
            P p5 = E2.o.f1952C.f1957c;
            HashMap mapI = P.I((String) c0254t.f2726c.zzb(zzbby.zzky));
            for (String str : mapI.keySet()) {
                synchronized (this) {
                    try {
                        if (!this.f3532a.containsKey(str)) {
                            SharedPreferences defaultSharedPreferences = Objects.equals(str, "__default__") ? PreferenceManager.getDefaultSharedPreferences(this.f3534c) : this.f3534c.getSharedPreferences(str, 0);
                            E e7 = new E(this, str);
                            this.f3532a.put(str, e7);
                            defaultSharedPreferences.registerOnSharedPreferenceChangeListener(e7);
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            }
            D d7 = new D(mapI);
            synchronized (this) {
                this.f3533b.add(d7);
            }
        }
    }
}
