package Ae;

import androidx.recyclerview.widget.LinearLayoutManager;
import kotlin.Unit;
import org.jetbrains.annotations.NotNull;

/* renamed from: Ae.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC2381a<T> implements InterfaceC2395h<T>, InterfaceC2385c<T> {

    @kotlin.coroutines.jvm.internal.e(c = "kotlinx.coroutines.flow.AbstractFlow", f = "Flow.kt", l = {226}, m = "collect")
    /* renamed from: Ae.a$a, reason: collision with other inner class name */
    static final class C0030a extends kotlin.coroutines.jvm.internal.c {

        /* renamed from: d, reason: collision with root package name */
        Be.B f943d;

        /* renamed from: e, reason: collision with root package name */
        /* synthetic */ Object f944e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ AbstractC2381a<T> f945f;

        /* renamed from: g, reason: collision with root package name */
        int f946g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C0030a(AbstractC2381a<T> abstractC2381a, kotlin.coroutines.d<? super C0030a> dVar) {
            super(dVar);
            this.f945f = abstractC2381a;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f944e = obj;
            this.f946g |= LinearLayoutManager.INVALID_OFFSET;
            return this.f945f.collect(null, this);
        }
    }

    public abstract Object c(@NotNull Be.B b11, @NotNull kotlin.coroutines.d dVar);

    /* JADX WARN: Removed duplicated region for block: B:21:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    @Override // Ae.InterfaceC2395h
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object collect(@NotNull InterfaceC2397i<? super T> interfaceC2397i, @NotNull kotlin.coroutines.d<? super Unit> dVar) {
        C0030a c0030a;
        int i11;
        Throwable th2;
        Be.B b11;
        if (dVar instanceof C0030a) {
            c0030a = (C0030a) dVar;
            int i12 = c0030a.f946g;
            if ((i12 & LinearLayoutManager.INVALID_OFFSET) != 0) {
                c0030a.f946g = i12 - LinearLayoutManager.INVALID_OFFSET;
                Object obj = c0030a.f944e;
                Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
                i11 = c0030a.f946g;
                if (i11 != 0) {
                    Sc.s.b(obj);
                    Be.B b12 = new Be.B(interfaceC2397i, c0030a.getContext());
                    try {
                        c0030a.f943d = b12;
                        c0030a.f946g = 1;
                        if (c(b12, c0030a) == aVar) {
                            return aVar;
                        }
                        b11 = b12;
                    } catch (Throwable th3) {
                        th2 = th3;
                        b11 = b12;
                        b11.releaseIntercepted();
                        throw th2;
                    }
                } else {
                    if (i11 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    b11 = c0030a.f943d;
                    try {
                        Sc.s.b(obj);
                    } catch (Throwable th4) {
                        th2 = th4;
                        b11.releaseIntercepted();
                        throw th2;
                    }
                }
                b11.releaseIntercepted();
                return Unit.f71690a;
            }
        }
        c0030a = new C0030a(this, dVar);
        Object obj2 = c0030a.f944e;
        Wc.a aVar2 = Wc.a.COROUTINE_SUSPENDED;
        i11 = c0030a.f946g;
        if (i11 != 0) {
        }
        b11.releaseIntercepted();
        return Unit.f71690a;
    }
}
