package C4;

import B1.f;
import L4.l;
import L4.o;
import b4.C0784d;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import d4.InterfaceC0965b;
import g4.C1142o;

/* loaded from: classes2.dex */
public final class b extends P6.b {

    /* renamed from: c, reason: collision with root package name */
    public o f1569c;

    /* renamed from: d, reason: collision with root package name */
    public InterfaceC0965b f1570d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f1571e;

    /* renamed from: f, reason: collision with root package name */
    public final a f1572f = new a(this);

    public b(C1142o c1142o) {
        c1142o.a(new a(this));
    }

    public final synchronized Task Y() {
        InterfaceC0965b interfaceC0965b = this.f1570d;
        if (interfaceC0965b == null) {
            return Tasks.forException(new Y3.c("AppCheck is not available"));
        }
        Task b7 = ((C0784d) interfaceC0965b).b(this.f1571e);
        this.f1571e = false;
        return b7.continueWithTask(l.f4377b, new f(9));
    }

    public final synchronized void Z() {
        this.f1571e = true;
    }
}
