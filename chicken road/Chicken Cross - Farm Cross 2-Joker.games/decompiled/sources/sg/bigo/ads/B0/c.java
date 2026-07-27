package sg.bigo.ads.B0;

import android.content.Context;
import android.text.TextUtils;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;
import java.util.concurrent.Executor;
import sg.bigo.ads.I0.g;
import sg.bigo.ads.x0.C5506f;
import sg.bigo.ads.x0.InterfaceC5501a;

/* loaded from: classes3.dex */
public abstract class c {

    /* renamed from: a, reason: collision with root package name */
    public final int f12212a;
    public final InterfaceC5501a b;
    public Executor c;
    public long d = 15000;
    public final HashMap e = new HashMap();
    public final boolean f;
    public String g;

    public c(int i, InterfaceC5501a interfaceC5501a, boolean z, Context context) {
        this.f12212a = i;
        this.b = interfaceC5501a;
        this.f = z;
        a("BIGO-Ad-Request-Id", String.valueOf(i));
        a("User-Agent", g.b(context));
    }

    public final void a(String str, String str2) {
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) {
            return;
        }
        a(str).add(str2);
    }

    public byte[] a() {
        return null;
    }

    public void b() {
    }

    public int c() {
        return -1;
    }

    public C5506f d() {
        return null;
    }

    public abstract String e();

    public boolean f() {
        return false;
    }

    public void g() {
    }

    public final Set a(String str) {
        Set set = (Set) this.e.get(str);
        if (set != null) {
            return set;
        }
        HashSet hashSet = new HashSet();
        this.e.put(str, hashSet);
        return hashSet;
    }
}
