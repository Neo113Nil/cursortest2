package W5;

import androidx.work.impl.foreground.SystemForegroundService;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: W5.d, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class RunnableC0493d implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f7160a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f7161b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
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
                    p036e6.b.c();
                    try {
                        p036e6.a aVar = p036e6.b.f12742a;
                        aVar.getClass();
                        C0489b1 c0489b1 = iVar.f7105a;
                        int i7 = this.f7161b;
                        c0489b1.getClass();
                        p113p3.f.d("numMessages must be > 0", i7 > 0);
                        if (!c0489b1.b()) {
                            c0489b1.f7133D += (long) i7;
                            c0489b1.a();
                            break;
                        }
                        aVar.getClass();
                        return;
                    } catch (Throwable th) {
                        try {
                            p036e6.b.f12742a.getClass();
                            break;
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
                        ((p046g0.h) arrayList.get(i8)).a();
                        i8++;
                    }
                    return;
                } else {
                    while (i8 < size) {
                        ((p046g0.h) arrayList.get(i8)).b();
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
        p097n3.a.i(list, "initCallbacks cannot be null");
        this.f7162c = new ArrayList(list);
        this.f7161b = i7;
    }
}
