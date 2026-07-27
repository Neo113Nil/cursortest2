package A0;

import androidx.work.impl.foreground.SystemForegroundService;
import e.C0405f;
import e.InterfaceC0401b;
import n1.C1300D;

/* loaded from: classes.dex */
public final class e implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f24a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f25b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f26c;

    public /* synthetic */ e(int i2, int i3, Object obj) {
        this.f24a = i3;
        this.f26c = obj;
        this.f25b = i2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        InterfaceC0401b interfaceC0401b;
        switch (this.f24a) {
            case 0:
                ((SystemForegroundService) this.f26c).f4750e.cancel(this.f25b);
                break;
            case 1:
                androidx.activity.e eVar = (androidx.activity.e) this.f26c;
                String str = (String) eVar.f5507a.get(Integer.valueOf(this.f25b));
                if (str != null) {
                    C0405f c0405f = (C0405f) eVar.f5511e.get(str);
                    if (c0405f != null && (interfaceC0401b = c0405f.f5503a) != null) {
                        if (eVar.f5510d.remove(str)) {
                            interfaceC0401b.b(null);
                            break;
                        }
                    } else {
                        eVar.f5513g.remove(str);
                        eVar.f5512f.put(str, null);
                        break;
                    }
                }
                break;
            default:
                ((C1300D) this.f26c).f(this.f25b);
                break;
        }
    }

    public e(androidx.activity.e eVar, int i2, K1.b bVar) {
        this.f24a = 1;
        this.f26c = eVar;
        this.f25b = i2;
    }
}
