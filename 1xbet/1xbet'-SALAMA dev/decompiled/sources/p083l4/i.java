package p083l4;

import android.support.v4.media.session.t;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public final class i implements l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ String f14949a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ long f14950b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ q f14951c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ u f14952d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ s f14953e;

    public i(s sVar, String str, long j, q qVar, u uVar) {
        this.f14953e = sVar;
        this.f14949a = str;
        this.f14950b = j;
        this.f14951c = qVar;
        this.f14952d = uVar;
    }

    @Override // p083l4.l
    public final void a(Map map) {
        s sVar = this.f14953e;
        boolean zR0 = sVar.f15013y.r0();
        t tVar = sVar.f15013y;
        if (zR0) {
            tVar.W(null, this.f14949a + " response: " + map, new Object[0]);
        }
        HashMap map2 = sVar.f15002n;
        long j = this.f14950b;
        if (((q) map2.get(Long.valueOf(j))) == this.f14951c) {
            sVar.f15002n.remove(Long.valueOf(j));
            u uVar = this.f14952d;
            String str = (String) map.get("s");
            if (str.equals("ok")) {
                uVar.b(null, null);
            } else {
                uVar.b(str, (String) map.get("d"));
            }
        } else if (tVar.r0()) {
            tVar.W(null, "Ignoring on complete for put " + j + " because it was removed already.", new Object[0]);
        }
        sVar.c();
    }
}
