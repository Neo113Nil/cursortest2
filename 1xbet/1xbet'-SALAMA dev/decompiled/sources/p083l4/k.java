package p083l4;

import Y4.D;
import com.google.android.gms.common.internal.w;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public final class k implements l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ p f14957a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ s f14958b;

    public k(s sVar, p pVar) {
        this.f14958b = sVar;
        this.f14957a = pVar;
    }

    @Override // p083l4.l
    public final void a(Map map) {
        String str = (String) map.get("s");
        boolean zEquals = str.equals("ok");
        s sVar = this.f14958b;
        p pVar = this.f14957a;
        if (zEquals) {
            Map map2 = (Map) map.get("d");
            if (map2.containsKey("w")) {
                List list = (List) map2.get("w");
                r rVar = pVar.f14973b;
                sVar.getClass();
                if (list.contains("no_index")) {
                    StringBuilder sbK = p031e1.k.k("Using an unspecified index. Your data will be downloaded and filtered on the client. Consider adding '", "\".indexOn\": \"" + rVar.f14981b.get("i") + '\"', "' at ");
                    sbK.append(D.M(rVar.f14980a));
                    sbK.append(" to your security and Firebase Database rules for better performance");
                    sVar.f15013y.C0(sbK.toString());
                }
            }
        }
        if (((p) sVar.f15004p.get(pVar.f14973b)) == pVar) {
            boolean zEquals2 = str.equals("ok");
            w wVar = pVar.f14972a;
            if (zEquals2) {
                wVar.b(null, null);
            } else {
                sVar.g(pVar.f14973b);
                wVar.b(str, (String) map.get("d"));
            }
        }
    }
}
