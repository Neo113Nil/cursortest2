package l4;

import java.util.HashMap;
import java.util.Map;

/* renamed from: l4.i, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C1398i implements InterfaceC1401l {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ String f14943a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ long f14944b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ C1406q f14945c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ u f14946d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ s f14947e;

    public C1398i(s sVar, String str, long j, C1406q c1406q, u uVar) {
        this.f14947e = sVar;
        this.f14943a = str;
        this.f14944b = j;
        this.f14945c = c1406q;
        this.f14946d = uVar;
    }

    @Override // l4.InterfaceC1401l
    public final void a(Map map) {
        s sVar = this.f14947e;
        boolean r02 = sVar.f15007y.r0();
        android.support.v4.media.session.t tVar = sVar.f15007y;
        if (r02) {
            tVar.W(null, this.f14943a + " response: " + map, new Object[0]);
        }
        HashMap hashMap = sVar.f14996n;
        long j = this.f14944b;
        if (((C1406q) hashMap.get(Long.valueOf(j))) == this.f14945c) {
            sVar.f14996n.remove(Long.valueOf(j));
            u uVar = this.f14946d;
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
