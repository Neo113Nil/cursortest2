package A;

import B2.v;
import android.os.Handler;
import android.webkit.WebView;
import m0.C1121i;
import m0.InterfaceC1127o;
import m0.J;
import s1.C1202i;

/* loaded from: classes.dex */
public final class m implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f30a;

    /* renamed from: b, reason: collision with root package name */
    public Object f31b;

    /* renamed from: c, reason: collision with root package name */
    public Object f32c;

    /* renamed from: d, reason: collision with root package name */
    public Object f33d;

    @Override // java.lang.Runnable
    public final void run() {
        Object obj;
        switch (this.f30a) {
            case 0:
                try {
                    obj = ((f) this.f31b).call();
                } catch (Exception unused) {
                    obj = null;
                }
                ((Handler) this.f33d).post(new a((g) this.f32c, 1, obj));
                break;
            case 1:
                ((J) this.f31b).N((b0.j) this.f32c, (InterfaceC1127o) this.f33d);
                break;
            case 2:
                C1121i c1121i = (C1121i) this.f32c;
                ((J) this.f31b).M((F1.b) this.f33d, c1121i);
                break;
            case 3:
                ((J) this.f31b).L((v) this.f32c, (F1.b) this.f33d);
                break;
            default:
                ((C1202i) this.f33d).getClass();
                C1202i.b((WebView) this.f31b, (String) this.f32c);
                break;
        }
    }

    public /* synthetic */ m(J j3, Object obj, Object obj2, int i3) {
        this.f30a = i3;
        this.f31b = j3;
        this.f32c = obj;
        this.f33d = obj2;
    }

    public m(C1202i c1202i, WebView webView, String str) {
        this.f30a = 4;
        this.f33d = c1202i;
        this.f31b = webView;
        this.f32c = str;
    }
}
