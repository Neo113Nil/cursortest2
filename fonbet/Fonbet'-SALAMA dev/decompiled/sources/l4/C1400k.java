package l4;

import Y4.D;
import java.util.List;
import java.util.Map;

/* renamed from: l4.k, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C1400k implements InterfaceC1401l {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ C1405p f14951a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ s f14952b;

    public C1400k(s sVar, C1405p c1405p) {
        this.f14952b = sVar;
        this.f14951a = c1405p;
    }

    @Override // l4.InterfaceC1401l
    public final void a(Map map) {
        String str = (String) map.get("s");
        boolean equals = str.equals("ok");
        s sVar = this.f14952b;
        C1405p c1405p = this.f14951a;
        if (equals) {
            Map map2 = (Map) map.get("d");
            if (map2.containsKey("w")) {
                List list = (List) map2.get("w");
                C1407r c1407r = c1405p.f14967b;
                sVar.getClass();
                if (list.contains("no_index")) {
                    StringBuilder k7 = e1.k.k("Using an unspecified index. Your data will be downloaded and filtered on the client. Consider adding '", "\".indexOn\": \"" + c1407r.f14975b.get("i") + '\"', "' at ");
                    k7.append(D.M(c1407r.f14974a));
                    k7.append(" to your security and Firebase Database rules for better performance");
                    sVar.f15007y.C0(k7.toString());
                }
            }
        }
        if (((C1405p) sVar.f14998p.get(c1405p.f14967b)) == c1405p) {
            boolean equals2 = str.equals("ok");
            com.google.android.gms.common.internal.w wVar = c1405p.f14966a;
            if (equals2) {
                wVar.b(null, null);
            } else {
                sVar.g(c1405p.f14967b);
                wVar.b(str, (String) map.get("d"));
            }
        }
    }
}
