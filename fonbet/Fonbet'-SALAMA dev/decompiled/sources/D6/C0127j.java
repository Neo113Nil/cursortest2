package D6;

import f6.C1116i;
import java.util.concurrent.ScheduledFuture;
import kotlin.jvm.functions.Function1;

/* renamed from: D6.j, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C0127j extends AbstractC0128k {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1843a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f1844b;

    public /* synthetic */ C0127j(Object obj, int i7) {
        this.f1843a = i7;
        this.f1844b = obj;
    }

    @Override // D6.AbstractC0128k
    public final void b(Throwable th) {
        switch (this.f1843a) {
            case 0:
                if (th != null) {
                    ((ScheduledFuture) this.f1844b).cancel(false);
                    break;
                }
                break;
            case 1:
                ((O) this.f1844b).dispose();
                break;
            default:
                ((Function1) this.f1844b).invoke(th);
                break;
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        switch (this.f1843a) {
            case 0:
                b((Throwable) obj);
                break;
            case 1:
                b((Throwable) obj);
                break;
            default:
                b((Throwable) obj);
                break;
        }
        return C1116i.f13008a;
    }

    public final String toString() {
        switch (this.f1843a) {
            case 0:
                return "CancelFutureOnCancel[" + ((ScheduledFuture) this.f1844b) + ']';
            case 1:
                return "DisposeOnCancel[" + ((O) this.f1844b) + ']';
            default:
                return "InvokeOnCancel[" + ((Function1) this.f1844b).getClass().getSimpleName() + '@' + E.i(this) + ']';
        }
    }
}
