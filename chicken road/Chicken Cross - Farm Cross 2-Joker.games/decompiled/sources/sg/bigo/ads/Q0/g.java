package sg.bigo.ads.Q0;

import android.os.SystemClock;
import android.text.TextUtils;
import java.util.HashMap;
import sg.bigo.ads.K0.B;

/* loaded from: classes3.dex */
public final class g implements sg.bigo.ads.b1.p {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ sg.bigo.ads.R0.i f12504a;
    public final /* synthetic */ long b;
    public final /* synthetic */ sg.bigo.ads.b1.p c;
    public final /* synthetic */ n d;

    public g(n nVar, sg.bigo.ads.R0.i iVar, long j, d dVar) {
        this.d = nVar;
        this.f12504a = iVar;
        this.b = j;
        this.c = dVar;
    }

    @Override // sg.bigo.ads.b1.p
    public final void a(String str, int i, int i2, int i3, String str2, HashMap hashMap) {
        this.d.d.set(false);
        if (TextUtils.isEmpty(B.a("host_cfg", hashMap))) {
            sg.bigo.ads.s1.b.a(this.b > 0 ? SystemClock.elapsedRealtime() - this.b : 0L, false, str, 4001, "code=" + i2 + ",subCode=" + i3 + ",message=" + str2);
        }
        sg.bigo.ads.b1.p pVar = this.c;
        if (pVar != null) {
            pVar.a(str, i, i2, i3, str2, hashMap);
        }
        sg.bigo.ads.P0.b bVar = this.d.j;
        if (bVar != null) {
            bVar.a(i, i2, i3, str2, hashMap);
        }
    }

    @Override // sg.bigo.ads.b1.p
    public final void a(String str, int i, String str2, HashMap hashMap) {
        this.d.d.set(false);
        sg.bigo.ads.R0.i iVar = this.f12504a;
        iVar.getClass();
        iVar.m = System.currentTimeMillis();
        this.d.f12510a.a(0L);
        if (TextUtils.isEmpty(B.a("host_cfg", hashMap))) {
            sg.bigo.ads.s1.b.a(this.b > 0 ? SystemClock.elapsedRealtime() - this.b : 0L, false, str, 4002, "host_cfg is empty.");
        }
        sg.bigo.ads.b1.p pVar = this.c;
        if (pVar != null) {
            pVar.a(str, i, str2, hashMap);
        }
        sg.bigo.ads.P0.b bVar = this.d.j;
        if (bVar != null) {
            bVar.a(i, str2);
        }
    }
}
