package p174z5;

import A5.o;
import A5.p;
import A5.q;
import A5.r;
import D3.j;
import java.util.HashMap;
import p155w1.C1052y0;

/* JADX INFO: loaded from: classes2.dex */
public final class c implements q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f18465a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f18466b;

    public /* synthetic */ c(Object obj, int i7) {
        this.f18465a = i7;
        this.f18466b = obj;
    }

    @Override // A5.q
    public final void onMethodCall(o oVar, r rVar) {
        Object obj = this.f18466b;
        switch (this.f18465a) {
            case 0:
                C1052y0 c1052y0 = (C1052y0) obj;
                if (((R4.c) c1052y0.f17938b) != null) {
                    String str = oVar.f676a;
                    try {
                        if (str.hashCode() == -1307105544 && str.equals("activateSystemCursor")) {
                            try {
                                ((R4.c) c1052y0.f17938b).x((String) ((HashMap) oVar.f677b).get("kind"));
                                ((p) rVar).success(Boolean.TRUE);
                            } catch (Exception e7) {
                                ((p) rVar).error("error", "Error when setting cursors: " + e7.getMessage(), null);
                            }
                        }
                    } catch (Exception e8) {
                        ((p) rVar).error("error", "Unhandled error: " + e8.getMessage(), null);
                        return;
                    }
                    break;
                }
                break;
            default:
                String str2 = oVar.f676a;
                str2.getClass();
                j jVar = (j) obj;
                if (str2.equals("get")) {
                    jVar.f1724c = true;
                    ((p) rVar).success(j.j((byte[]) jVar.f1723b));
                } else if (!str2.equals("put")) {
                    ((p) rVar).notImplemented();
                } else {
                    jVar.f1723b = (byte[]) oVar.f677b;
                    ((p) rVar).success(null);
                }
                break;
        }
    }
}
