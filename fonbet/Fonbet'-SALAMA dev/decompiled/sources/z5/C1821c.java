package z5;

import java.util.HashMap;
import w1.C1761y0;

/* renamed from: z5.c, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C1821c implements A5.q {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f18459a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f18460b;

    public /* synthetic */ C1821c(Object obj, int i7) {
        this.f18459a = i7;
        this.f18460b = obj;
    }

    @Override // A5.q
    public final void onMethodCall(A5.o oVar, A5.r rVar) {
        Object obj = this.f18460b;
        switch (this.f18459a) {
            case 0:
                C1761y0 c1761y0 = (C1761y0) obj;
                if (((R4.c) c1761y0.f17932b) != null) {
                    String str = oVar.f676a;
                    try {
                        if (str.hashCode() == -1307105544 && str.equals("activateSystemCursor")) {
                            try {
                                ((R4.c) c1761y0.f17932b).x((String) ((HashMap) oVar.f677b).get("kind"));
                                ((A5.p) rVar).success(Boolean.TRUE);
                            } catch (Exception e7) {
                                ((A5.p) rVar).error("error", "Error when setting cursors: " + e7.getMessage(), null);
                            }
                        }
                    } catch (Exception e8) {
                        ((A5.p) rVar).error("error", "Unhandled error: " + e8.getMessage(), null);
                        return;
                    }
                }
                break;
            default:
                String str2 = oVar.f676a;
                str2.getClass();
                D3.j jVar = (D3.j) obj;
                if (!str2.equals("get")) {
                    if (!str2.equals("put")) {
                        ((A5.p) rVar).notImplemented();
                        break;
                    } else {
                        jVar.f1723b = (byte[]) oVar.f677b;
                        ((A5.p) rVar).success(null);
                        break;
                    }
                } else {
                    jVar.f1724c = true;
                    ((A5.p) rVar).success(D3.j.j((byte[]) jVar.f1723b));
                    break;
                }
        }
    }
}
