package W5;

import androidx.work.impl.foreground.SystemForegroundService;
import e6.AbstractC1053b;
import e6.C1052a;
import g0.AbstractC1126h;
import java.util.ArrayList;
import java.util.List;
import n3.AbstractC1464a;

/* renamed from: W5.d, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class RunnableC0493d implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f7160a;

    /* renamed from: b, reason: collision with root package name */
    public final int f7161b;

    /* renamed from: c, reason: collision with root package name */
    public final Object f7162c;

    public /* synthetic */ RunnableC0493d(Object obj, int i7, int i8) {
        this.f7160a = i8;
        this.f7162c = obj;
        this.f7161b = i7;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f7160a) {
            case 0:
                X5.i iVar = (X5.i) this.f7162c;
                try {
                    AbstractC1053b.c();
                    try {
                        C1052a c1052a = AbstractC1053b.f12736a;
                        c1052a.getClass();
                        C0489b1 c0489b1 = iVar.f7105a;
                        int i7 = this.f7161b;
                        c0489b1.getClass();
                        p3.f.d("numMessages must be > 0", i7 > 0);
                        if (!c0489b1.b()) {
                            c0489b1.f7133D += i7;
                            c0489b1.a();
                        }
                        c1052a.getClass();
                        return;
                    } catch (Throwable th) {
                        try {
                            AbstractC1053b.f12736a.getClass();
                        } catch (Throwable th2) {
                            th.addSuppressed(th2);
                        }
                        throw th;
                    }
                } catch (Throwable th3) {
                    iVar.m(th3);
                    return;
                }
            case 1:
                ((M0) this.f7162c).f6869f.c(this.f7161b);
                return;
            case 2:
                ((com.google.android.gms.common.api.internal.D) this.f7162c).f(this.f7161b);
                return;
            case 3:
                ArrayList arrayList = (ArrayList) this.f7162c;
                int size = arrayList.size();
                int i8 = 0;
                if (this.f7161b != 1) {
                    while (i8 < size) {
                        ((AbstractC1126h) arrayList.get(i8)).a();
                        i8++;
                    }
                    return;
                } else {
                    while (i8 < size) {
                        ((AbstractC1126h) arrayList.get(i8)).b();
                        i8++;
                    }
                    return;
                }
            default:
                ((SystemForegroundService) this.f7162c).f9891e.cancel(this.f7161b);
                return;
        }
    }

    public RunnableC0493d(List list, int i7, Throwable th) {
        this.f7160a = 3;
        AbstractC1464a.i(list, "initCallbacks cannot be null");
        this.f7162c = new ArrayList(list);
        this.f7161b = i7;
    }
}
