package G4;

import R5.C0410f;
import R5.e0;
import Y4.A0;
import Y4.v0;
import android.util.SparseArray;
import android.webkit.WebView;
import com.google.firebase.Timestamp;
import com.google.protobuf.AbstractC0867k;
import java.util.HashMap;
import p155w1.F0;
import p155w1.P2;

/* JADX INFO: renamed from: G4.k, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class RunnableC0278k implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f2984a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f2985b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f2986c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f2987d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f2988e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Object f2989f;

    public /* synthetic */ RunnableC0278k(C0279l c0279l, D4.i iVar, Z z4, int i7, p075k4.e eVar) {
        this.f2986c = c0279l;
        this.f2987d = iVar;
        this.f2988e = z4;
        this.f2985b = i7;
        this.f2989f = eVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f2984a) {
            case 0:
                C0279l c0279l = (C0279l) this.f2986c;
                D4.i iVar = (D4.i) this.f2987d;
                H4.n nVar = iVar.f1768c;
                Z z4 = (Z) this.f2988e;
                if (nVar.compareTo(z4.f2957e) > 0) {
                    Z zA = z4.a(AbstractC0867k.f12212b, nVar);
                    SparseArray sparseArray = c0279l.f3000k;
                    int i7 = this.f2985b;
                    sparseArray.append(i7, zA);
                    Y y4 = c0279l.f2999i;
                    y4.c(zA);
                    y4.i(i7);
                    y4.a((p075k4.e) this.f2989f, i7);
                }
                P2 p5 = c0279l.j;
                switch (p5.f17513a) {
                    case 9:
                        ((HashMap) p5.f17515c).put(iVar.f1766a, iVar);
                        break;
                    default:
                        D4.h hVar = iVar.f1767b;
                        A0 a0W = ((P2) ((R4.c) p5.f17515c).f6064b).w(hVar.f1764a);
                        X4.a aVarB = X4.c.B();
                        X4.b bVar = p136t.e.b(hVar.f1765b, 1) ? X4.b.FIRST : X4.b.LAST;
                        aVarB.d();
                        X4.c.x((X4.c) aVarB.f12096b, bVar);
                        String strY = a0W.y();
                        aVarB.d();
                        X4.c.v((X4.c) aVarB.f12096b, strY);
                        v0 v0VarZ = a0W.z();
                        aVarB.d();
                        X4.c.w((X4.c) aVarB.f12096b, v0VarZ);
                        X4.c cVar = (X4.c) aVarB.b();
                        Timestamp timestamp = iVar.f1768c.f3333a;
                        ((S) p5.f17514b).b0("INSERT OR REPLACE INTO named_queries (name, read_time_seconds, read_time_nanos, bundled_query_proto) VALUES (?, ?, ?, ?)", iVar.f1766a, Long.valueOf(timestamp.f11828a), Integer.valueOf(timestamp.f11829b), cVar.d());
                        break;
                }
                break;
            default:
                long j = this.f2985b;
                C0410f c0410f = new C0410f(3);
                e0 e0Var = (e0) this.f2986c;
                R5.T t7 = e0Var.f6159a;
                WebView webView = (WebView) this.f2987d;
                String str = (String) this.f2988e;
                String str2 = (String) this.f2989f;
                t7.getClass();
                t6.h.e(e0Var, "pigeon_instanceArg");
                t6.h.e(webView, "webViewArg");
                t6.h.e(str, "descriptionArg");
                t6.h.e(str2, "failingUrlArg");
                I4.j jVar = t7.f6101a;
                jVar.getClass();
                new F0((A5.f) jVar.f3678b, "dev.flutter.pigeon.webview_flutter_android.WebViewClient.onReceivedError", jVar.a(), (Object) null, 1).L(p050g6.i.M0(e0Var, webView, Long.valueOf(j), str, str2), new R5.O(10, c0410f));
                break;
        }
    }

    public /* synthetic */ RunnableC0278k(e0 e0Var, WebView webView, int i7, String str, String str2) {
        this.f2986c = e0Var;
        this.f2987d = webView;
        this.f2985b = i7;
        this.f2988e = str;
        this.f2989f = str2;
    }
}
