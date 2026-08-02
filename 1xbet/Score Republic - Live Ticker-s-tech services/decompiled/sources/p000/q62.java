package p000;

import android.net.Uri;
import android.os.StrictMode;
import android.util.Log;
import java.io.IOException;
import java.util.Collections;

/* JADX INFO: compiled from: r8-map-id-738170b7fb69b873ed7524d5270c8e05c6f5fb40ea1ade7a72c8ed7a70699269 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class q62 implements e70 {

    /* JADX INFO: renamed from: j */
    public final /* synthetic */ int f6392j;

    /* JADX INFO: renamed from: k */
    public final /* synthetic */ Object f6393k;

    public /* synthetic */ q62(int i, Object obj) {
        this.f6392j = i;
        this.f6393k = obj;
    }

    @Override // p000.e70
    public final Object apply(Object obj) {
        switch (this.f6392j) {
            case 0:
                Log.w("FlagStore", "Failed to commit to updated flags for ".concat(String.valueOf(((y62) this.f6393k).f9193c)), (Throwable) obj);
                return null;
            case 1:
                i52 i52Var = (i52) obj;
                h92 h92Var = i72.f3457a;
                String str = (String) this.f6393k;
                c52 c52Var = (c52) i52Var.m2531t(str, d52.m1095u()).m5969k();
                if (!Collections.unmodifiableList(((d52) c52Var.f9011k).m1096t()).contains("")) {
                    c52Var.m5681b();
                    ((d52) c52Var.f9011k).m1097v("");
                }
                g52 g52Var = (g52) i52Var.m5969k();
                c52Var.m5681b();
                ((d52) c52Var.f9011k).m1098w("");
                d52 d52Var = (d52) c52Var.m5683d();
                g52Var.m5681b();
                ((i52) g52Var.f9011k).m2532v().put(str, d52Var);
                return (i52) g52Var.m5683d();
            default:
                b82 b82Var = (b82) this.f6393k;
                a52 a52Var = (a52) obj;
                a81 a81Var = new a81(23);
                StrictMode.ThreadPolicy threadPolicy = StrictMode.getThreadPolicy();
                StrictMode.setThreadPolicy(new StrictMode.ThreadPolicy.Builder(threadPolicy).permitDiskWrites().build());
                try {
                    try {
                        synchronized (b82.f766j) {
                            g82 g82Var = (g82) b82Var.f771d.get();
                            Uri uri = b82Var.f774g;
                            a81 a81Var2 = new a81(a52Var.m28t());
                            a81Var2.f64l = new a81[]{a81Var};
                            g82Var.m1999a(uri, a81Var2);
                            b82Var.f775h = a52Var.m28t();
                            break;
                        }
                        synchronized (b82.f767k) {
                            g82 g82Var2 = (g82) b82Var.f771d.get();
                            Uri uri2 = b82Var.f776i;
                            a81 a81Var3 = new a81(a52Var.m29u());
                            a81Var3.f64l = new a81[]{a81Var};
                            g82Var2.m1999a(uri2, a81Var3);
                            a52Var.m29u();
                            break;
                        }
                        StrictMode.setThreadPolicy(threadPolicy);
                        return null;
                    } catch (IOException e) {
                        throw new RuntimeException(e);
                    }
                } catch (Throwable th) {
                    StrictMode.setThreadPolicy(threadPolicy);
                    throw th;
                }
        }
    }
}
