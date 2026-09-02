package i0;

import com.yandex.varioqub.config.impl.B;
import java.io.Serializable;
import r.C0825a;
import r.d;

/* renamed from: i0.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class RunnableC0069b implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1265a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f1266b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f1267c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f1268d;

    public /* synthetic */ RunnableC0069b(Object obj, int i2, Object obj2, int i3) {
        this.f1265a = i3;
        this.f1267c = obj;
        this.f1266b = i2;
        this.f1268d = obj2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f1265a) {
            case 0:
                B.a((B) this.f1267c, this.f1266b, (U0.a) this.f1268d);
                break;
            default:
                ((d) ((C0825a) this.f1267c).f6447c).c(this.f1266b, (Serializable) this.f1268d);
                break;
        }
    }
}
