package sg.bigo.ads.m0;

import android.content.Context;
import android.widget.Button;
import android.widget.RelativeLayout;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Map;
import sg.bigo.ads.K0.I;
import sg.bigo.ads.P.n;
import sg.bigo.ads.Y0.D;
import sg.bigo.ads.controller.form.AdFormActivity;
import sg.bigo.ads.l0.C5294e;
import sg.bigo.ads.l0.InterfaceC5293d;

/* renamed from: sg.bigo.ads.m0.f, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C5353f implements InterfaceC5293d {

    /* renamed from: a, reason: collision with root package name */
    public final Context f13113a;
    public final n b;
    public final sg.bigo.ads.n0.e c;
    public Button d;
    public RelativeLayout e;
    public final WeakReference g;
    public long h;
    public final int i;
    public final int j;
    public boolean f = false;
    public final boolean[] k = new boolean[13];
    public final RunnableC5349b l = new RunnableC5349b(this);

    public C5353f(Context context, n nVar, Map map, int i, int i2, InterfaceC5352e interfaceC5352e) {
        this.f13113a = context;
        this.b = nVar;
        AbstractC5348a.f13109a = nVar.i == 1;
        this.c = new sg.bigo.ads.n0.e(nVar, map, context, this);
        this.g = new WeakReference(interfaceC5352e);
        this.i = i;
        this.j = i2;
    }

    public final void a(String str) {
        if (this.g.get() != null) {
            AdFormActivity adFormActivity = (AdFormActivity) ((InterfaceC5352e) this.g.get());
            adFormActivity.getClass();
            if (I.a((CharSequence) str)) {
                return;
            }
            D.a(adFormActivity, adFormActivity, str, adFormActivity.f12717a, null, 0, false, false);
        }
    }

    @Override // sg.bigo.ads.l0.InterfaceC5293d
    public final void a(Map map) {
        int i = this.j;
        if (map != null) {
            C5294e.c.getClass();
            C5294e.d.put(Integer.valueOf(i), map);
        }
    }

    @Override // sg.bigo.ads.l0.InterfaceC5293d
    public final void a(int i) {
        int i2;
        long currentTimeMillis;
        int i3;
        if (i != 1) {
            if (i == 2) {
                i2 = this.i;
                currentTimeMillis = System.currentTimeMillis() - this.h;
                i3 = 8;
            }
            int i4 = this.j;
            C5294e.c.getClass();
            C5294e.d.remove(Integer.valueOf(i4));
        }
        i2 = this.i;
        currentTimeMillis = System.currentTimeMillis() - this.h;
        i3 = 7;
        a(i3, i2, currentTimeMillis);
        int i42 = this.j;
        C5294e.c.getClass();
        C5294e.d.remove(Integer.valueOf(i42));
    }

    public final void a(int i, int i2, long j) {
        boolean[] zArr = this.k;
        if (i >= zArr.length || zArr[i]) {
            return;
        }
        HashMap hashMap = new HashMap();
        hashMap.put("action", String.valueOf(i));
        hashMap.put("times", String.valueOf(i2));
        hashMap.put("cost", String.valueOf(j));
        sg.bigo.ads.s1.b.a("06002064", hashMap);
        this.k[i] = true;
    }
}
