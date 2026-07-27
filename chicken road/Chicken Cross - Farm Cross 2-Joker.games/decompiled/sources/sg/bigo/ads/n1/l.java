package sg.bigo.ads.n1;

import android.app.ActivityManager;
import java.util.HashMap;
import sg.bigo.ads.K0.AbstractC4964v;
import sg.bigo.ads.K0.H;
import sg.bigo.ads.X0.u;
import sg.bigo.ads.b0.AbstractC5025b;
import sg.bigo.ads.w0.AbstractC5496a;

/* loaded from: classes3.dex */
public final class l implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ boolean f13213a;
    public final /* synthetic */ int b;
    public final /* synthetic */ int c;
    public final /* synthetic */ int d;
    public final /* synthetic */ long e;
    public final /* synthetic */ n f;

    public l(n nVar, boolean z, int i, int i2, int i3, long j) {
        this.f = nVar;
        this.f13213a = z;
        this.b = i;
        this.c = i2;
        this.d = i3;
        this.e = j;
    }

    @Override // java.lang.Runnable
    public final void run() {
        ActivityManager.MemoryInfo memoryInfo;
        String str = this.f13213a ? "2" : "1";
        String valueOf = String.valueOf(this.b);
        String valueOf2 = String.valueOf(this.c);
        String valueOf3 = String.valueOf(this.f.f13214a);
        String valueOf4 = String.valueOf(this.f.l.size());
        String valueOf5 = String.valueOf(this.d);
        String valueOf6 = String.valueOf(((u) this.f.m).r);
        try {
            ActivityManager activityManager = (ActivityManager) ((u) this.f.m).b.getSystemService("activity");
            memoryInfo = new ActivityManager.MemoryInfo();
            activityManager.getMemoryInfo(memoryInfo);
        } catch (Exception unused) {
            memoryInfo = null;
        }
        String valueOf7 = String.valueOf(memoryInfo == null ? 0L : AbstractC4964v.a(3, memoryInfo.availMem));
        String valueOf8 = String.valueOf(H.c());
        ((u) this.f.m).getClass();
        if (System.currentTimeMillis() - H.d > 60000) {
            try {
                H.c = H.b();
            } catch (Throwable th) {
                AbstractC5496a.a("StorageUtils", th.toString());
            }
            H.d = System.currentTimeMillis();
        }
        String valueOf9 = String.valueOf(H.c);
        String valueOf10 = String.valueOf(((int) (this.e - ((Long) sg.bigo.ads.F0.b.a("sp_ads", "last_delete_res_ts", (Object) 0L, 1)).longValue())) / 1000);
        HashMap hashMap = new HashMap();
        hashMap.put("rm_file_type", str);
        hashMap.put("expired_rm_num", valueOf);
        hashMap.put("over_rm_num", valueOf2);
        hashMap.put("rm_trigger", valueOf3);
        hashMap.put("weak_ref_num", valueOf4);
        hashMap.put("res_total_num", valueOf5);
        hashMap.put("total_memory", valueOf6);
        hashMap.put("free_memory", valueOf7);
        hashMap.put("total_rom_memory", valueOf8);
        hashMap.put("rom_free_in", valueOf9);
        hashMap.put("last_delete_gap", valueOf10);
        sg.bigo.ads.s1.b.a("06002071", hashMap);
        sg.bigo.ads.F0.b.b("sp_ads", "last_delete_res_ts", Long.valueOf(this.e), 1);
        if (this.f.f13214a == 1) {
            AbstractC5025b.a("tb_resource", "res_delete_millis < ?", new String[]{String.valueOf(System.currentTimeMillis() - 604800000)});
        }
    }
}
