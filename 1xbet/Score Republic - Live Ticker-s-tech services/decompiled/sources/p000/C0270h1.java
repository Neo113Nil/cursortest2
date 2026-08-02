package p000;

import android.util.Log;
import android.window.OnBackInvokedDispatcher;
import com.google.firebase.abt.component.AbtRegistrar;
import com.google.firebase.concurrent.ExecutorsRegistrar;
import java.io.IOException;
import java.util.Set;
import java.util.concurrent.ScheduledExecutorService;

/* JADX INFO: renamed from: h1 */
/* JADX INFO: compiled from: r8-map-id-738170b7fb69b873ed7524d5270c8e05c6f5fb40ea1ade7a72c8ed7a70699269 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C0270h1 implements InterfaceC0436lk, InterfaceC0375jx, InterfaceC0254gm, InterfaceC0003a2 {

    /* JADX INFO: renamed from: j */
    public final /* synthetic */ int f2994j;

    public /* synthetic */ C0270h1(int i) {
        this.f2994j = i;
    }

    /* JADX INFO: renamed from: a */
    public static /* bridge */ /* synthetic */ OnBackInvokedDispatcher m2185a(Object obj) {
        return (OnBackInvokedDispatcher) obj;
    }

    /* JADX INFO: renamed from: b */
    public static /* synthetic */ void m2186b(Object obj) {
        throw new IllegalArgumentException(obj.toString());
    }

    /* JADX INFO: renamed from: c */
    public static /* synthetic */ void m2187c(String str) throws IOException {
        throw new IOException(str);
    }

    /* JADX INFO: renamed from: d */
    public static /* synthetic */ void m2188d(String str, long j) {
        throw new IllegalArgumentException((str + j).toString());
    }

    /* JADX INFO: renamed from: e */
    public static /* synthetic */ void m2189e(String str, Throwable th) {
        throw new RuntimeException(str, th);
    }

    /* JADX INFO: renamed from: f */
    public static /* synthetic */ void m2190f(String str) {
        throw new IllegalArgumentException(str);
    }

    /* JADX INFO: renamed from: g */
    public static /* synthetic */ void m2191g(String str) {
        throw new IllegalStateException(str);
    }

    /* JADX INFO: renamed from: h */
    public static /* synthetic */ void m2192h(String str) {
        throw new NullPointerException(str);
    }

    /* JADX INFO: renamed from: i */
    public static /* synthetic */ void m2193i(String str) {
        throw new IndexOutOfBoundsException(str);
    }

    @Override // p000.InterfaceC0254gm
    public void accept(Object obj) {
        switch (this.f2994j) {
            case 21:
                Log.e("FIAM.Headless", "Impression store write failure");
                break;
            default:
                Log.e("FIAM.Headless", "Rate limiter client write failure");
                break;
        }
    }

    @Override // p000.InterfaceC0003a2
    public void run() {
        switch (this.f2994j) {
            case 22:
                n80.m3496e("Impression store write success");
                break;
            default:
                n80.m3496e("Rate limiter client write success");
                break;
        }
    }

    @Override // p000.InterfaceC0436lk
    /* JADX INFO: renamed from: x */
    public Object mo532x(C0902y5 c0902y5) {
        switch (this.f2994j) {
            case 0:
                return AbtRegistrar.lambda$getComponents$0(c0902y5);
            case 18:
                Set setMo2284d = c0902y5.mo2284d(cz0.m1050a(C0131da.class));
                b90 b90Var = b90.f785l;
                if (b90Var == null) {
                    synchronized (b90.class) {
                        try {
                            b90Var = b90.f785l;
                            if (b90Var == null) {
                                b90Var = new b90(0);
                                b90.f785l = b90Var;
                            }
                        } catch (Throwable th) {
                            throw th;
                        }
                        break;
                    }
                }
                return new C0517nr(setMo2284d, b90Var);
            case 26:
                return (ScheduledExecutorService) ExecutorsRegistrar.f1355a.get();
            case 27:
                return (ScheduledExecutorService) ExecutorsRegistrar.f1357c.get();
            case 28:
                return (ScheduledExecutorService) ExecutorsRegistrar.f1356b.get();
            default:
                dh0 dh0Var = ExecutorsRegistrar.f1355a;
                return cf1.f1245j;
        }
    }
}
