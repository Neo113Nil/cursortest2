package sg.bigo.ads.u;

import android.content.Context;
import android.text.TextUtils;
import java.util.HashMap;
import sg.bigo.ads.K0.A;
import sg.bigo.ads.K0.AbstractC4964v;
import sg.bigo.ads.U0.m;
import sg.bigo.ads.s0.AbstractC5459A;
import sg.bigo.ads.s0.C5460B;
import sg.bigo.ads.s0.t;
import sg.bigo.ads.s0.x;

/* renamed from: sg.bigo.ads.u.c, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class RunnableC5482c implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f13327a;
    public final /* synthetic */ int b;
    public final /* synthetic */ C5485f c;

    public RunnableC5482c(C5485f c5485f, int i, int i2) {
        this.c = c5485f;
        this.f13327a = i;
        this.b = i2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i;
        int i2;
        int i3;
        String[] strArr;
        if (A.a(this.c.e)) {
            i = 0;
            i2 = 0;
            i3 = 0;
        } else {
            i = 0;
            i2 = 0;
            i3 = 0;
            for (C5484e c5484e : this.c.e) {
                String str = c5484e.f13329a;
                Context context = this.c.g.k.e;
                C5460B c5460b = AbstractC5459A.f13283a;
                c5460b.getClass();
                String valueOf = !TextUtils.isEmpty(null) ? null : String.valueOf(str.hashCode());
                if (t.a(context).a(valueOf) == null && !AbstractC4964v.a(c5460b.b(valueOf, context))) {
                    if (!x.a(str)) {
                        int i4 = c5484e.b;
                        if (i4 != 1) {
                            if (i4 == 2) {
                                i++;
                            }
                        }
                    }
                    i3++;
                }
                i2++;
            }
        }
        sg.bigo.ads.P.c e = this.c.g.e();
        int i5 = this.f13327a;
        int i6 = this.b;
        sg.bigo.ads.P.b popPage = this.c.g.getPopPage();
        int length = (popPage == null || (strArr = ((m) popPage).e) == null) ? 0 : strArr.length;
        HashMap hashMap = e == null ? new HashMap() : sg.bigo.ads.s1.b.a(e, (sg.bigo.ads.Q.b) null, false);
        hashMap.put("multi_scene", String.valueOf(i5));
        hashMap.put("action", String.valueOf(i6));
        hashMap.put("multi_num", String.valueOf(length));
        hashMap.put("multi_status_loading_num", String.valueOf(i3));
        hashMap.put("multi_status_success_num", String.valueOf(i2));
        hashMap.put("multi_status_failed_num", String.valueOf(i));
        sg.bigo.ads.s1.b.a("06002058", hashMap);
    }
}
