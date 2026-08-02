package Fe;

import Sc.s;
import androidx.recyclerview.widget.LinearLayoutManager;
import hg.InterfaceC6949b;
import hg.InterfaceC6950c;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ze.C11115c;
import ze.EnumC11113a;
import ze.k;
import ze.l;

/* loaded from: classes.dex */
final class f<T> implements InterfaceC6949b<T> {

    /* renamed from: a, reason: collision with root package name */
    private final long f9432a;

    /* renamed from: b, reason: collision with root package name */
    private InterfaceC6950c f9433b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private final C11115c f9434c;

    public f(int i11, @NotNull EnumC11113a enumC11113a, long j11) {
        this.f9432a = j11;
        this.f9434c = k.a(i11 == 0 ? 1 : i11, 4, enumC11113a);
    }

    public final void a() {
        InterfaceC6950c interfaceC6950c = this.f9433b;
        if (interfaceC6950c != null) {
            interfaceC6950c.cancel();
        } else {
            Intrinsics.n("subscription");
            throw null;
        }
    }

    public final void b() {
        InterfaceC6950c interfaceC6950c = this.f9433b;
        if (interfaceC6950c != null) {
            interfaceC6950c.n(this.f9432a);
        } else {
            Intrinsics.n("subscription");
            throw null;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0049  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0052  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object c(@NotNull kotlin.coroutines.jvm.internal.c cVar) {
        e eVar;
        int i11;
        Object f7;
        Throwable c11;
        if (cVar instanceof e) {
            eVar = (e) cVar;
            int i12 = eVar.f9431f;
            if ((i12 & LinearLayoutManager.INVALID_OFFSET) != 0) {
                eVar.f9431f = i12 - LinearLayoutManager.INVALID_OFFSET;
                Object obj = eVar.f9429d;
                Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
                i11 = eVar.f9431f;
                if (i11 != 0) {
                    s.b(obj);
                    C11115c c11115c = this.f9434c;
                    eVar.f9431f = 1;
                    f7 = c11115c.f(eVar);
                    if (f7 == aVar) {
                        return aVar;
                    }
                } else {
                    if (i11 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    s.b(obj);
                    f7 = ((l) obj).e();
                }
                c11 = l.c(f7);
                if (c11 == null) {
                    throw c11;
                }
                if (!(f7 instanceof l.b)) {
                    return f7;
                }
                l.c(f7);
                return null;
            }
        }
        eVar = new e(this, cVar);
        Object obj2 = eVar.f9429d;
        Wc.a aVar2 = Wc.a.COROUTINE_SUSPENDED;
        i11 = eVar.f9431f;
        if (i11 != 0) {
        }
        c11 = l.c(f7);
        if (c11 == null) {
        }
    }

    @Override // hg.InterfaceC6949b
    public final void d(@NotNull InterfaceC6950c interfaceC6950c) {
        this.f9433b = interfaceC6950c;
        b();
    }

    @Override // hg.InterfaceC6949b
    public final void onComplete() {
        this.f9434c.l(null);
    }

    @Override // hg.InterfaceC6949b
    public final void onError(Throwable th2) {
        this.f9434c.l(th2);
    }

    @Override // hg.InterfaceC6949b
    public final void onNext(@NotNull T t2) {
        C11115c c11115c = this.f9434c;
        if (c11115c.b(t2) instanceof l.b) {
            throw new IllegalArgumentException(("Element " + t2 + " was not added to channel because it was full, " + c11115c).toString());
        }
    }
}
