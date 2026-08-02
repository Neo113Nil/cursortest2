package Ae;

import androidx.recyclerview.widget.LinearLayoutManager;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes.dex */
public final class R0<T> implements InterfaceC2397i<T> {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final InterfaceC2397i<T> f898a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final Function2<InterfaceC2397i<? super T>, kotlin.coroutines.d<? super Unit>, Object> f899b;

    /* JADX WARN: Multi-variable type inference failed */
    public R0(@NotNull InterfaceC2397i<? super T> interfaceC2397i, @NotNull Function2<? super InterfaceC2397i<? super T>, ? super kotlin.coroutines.d<? super Unit>, ? extends Object> function2) {
        this.f898a = interfaceC2397i;
        this.f899b = function2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x0070, code lost:
    
        if (((Ae.R0) r7).a(r0) == r1) goto L29;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0076  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x003c  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0022  */
    /* JADX WARN: Type inference failed for: r2v0, types: [int] */
    /* JADX WARN: Type inference failed for: r2v1, types: [Be.B] */
    /* JADX WARN: Type inference failed for: r2v4, types: [boolean] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(@NotNull kotlin.coroutines.jvm.internal.c cVar) {
        Q0 q02;
        ?? r22;
        Be.B b11;
        R0<T> r02;
        try {
            if (cVar instanceof Q0) {
                q02 = (Q0) cVar;
                int i11 = q02.f897h;
                if ((i11 & LinearLayoutManager.INVALID_OFFSET) != 0) {
                    q02.f897h = i11 - LinearLayoutManager.INVALID_OFFSET;
                    Object obj = q02.f895f;
                    Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
                    r22 = q02.f897h;
                    if (r22 != 0) {
                        Sc.s.b(obj);
                        b11 = new Be.B(this.f898a, q02.getContext());
                        Function2<InterfaceC2397i<? super T>, kotlin.coroutines.d<? super Unit>, Object> function2 = this.f899b;
                        q02.f893d = this;
                        q02.f894e = b11;
                        q02.f897h = 1;
                        if (function2.invoke(b11, q02) != aVar) {
                            r02 = this;
                        }
                        return aVar;
                    }
                    if (r22 != 1) {
                        if (r22 != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        Sc.s.b(obj);
                        return Unit.f71690a;
                    }
                    b11 = q02.f894e;
                    r02 = q02.f893d;
                    Sc.s.b(obj);
                    b11.releaseIntercepted();
                    InterfaceC2397i<T> interfaceC2397i = r02.f898a;
                    r22 = interfaceC2397i instanceof R0;
                    if (r22 != 0) {
                        return Unit.f71690a;
                    }
                    q02.f893d = null;
                    q02.f894e = null;
                    q02.f897h = 2;
                }
            }
            if (r22 != 0) {
            }
            b11.releaseIntercepted();
            InterfaceC2397i<T> interfaceC2397i2 = r02.f898a;
            r22 = interfaceC2397i2 instanceof R0;
            if (r22 != 0) {
            }
        } catch (Throwable th2) {
            r22.releaseIntercepted();
            throw th2;
        }
        q02 = new Q0(this, cVar);
        Object obj2 = q02.f895f;
        Wc.a aVar2 = Wc.a.COROUTINE_SUSPENDED;
        r22 = q02.f897h;
    }

    @Override // Ae.InterfaceC2397i
    public final Object emit(T t2, @NotNull kotlin.coroutines.d<? super Unit> dVar) {
        return this.f898a.emit(t2, dVar);
    }
}
