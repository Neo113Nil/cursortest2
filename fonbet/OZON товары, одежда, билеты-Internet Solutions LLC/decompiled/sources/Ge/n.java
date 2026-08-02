package Ge;

import Ae.C2399j;
import Ae.InterfaceC2395h;
import Sc.s;
import io.reactivex.w;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import nc.InterfaceC8487b;
import org.jetbrains.annotations.NotNull;
import ze.u;

/* loaded from: classes.dex */
public final class n {

    /* JADX INFO: Add missing generic type declarations: [T] */
    @kotlin.coroutines.jvm.internal.e(c = "kotlinx.coroutines.rx2.RxConvertKt$asFlow$1", f = "RxConvert.kt", l = {91}, m = "invokeSuspend")
    static final class a<T> extends kotlin.coroutines.jvm.internal.j implements Function2<u<? super T>, kotlin.coroutines.d<? super Unit>, Object> {

        /* renamed from: d, reason: collision with root package name */
        int f10097d;

        /* renamed from: e, reason: collision with root package name */
        private /* synthetic */ Object f10098e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ io.reactivex.u<T> f10099f;

        /* renamed from: Ge.n$a$a, reason: collision with other inner class name */
        public static final class C0206a implements w<T> {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ u<T> f10100a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ AtomicReference<InterfaceC8487b> f10101b;

            /* JADX WARN: Multi-variable type inference failed */
            C0206a(u<? super T> uVar, AtomicReference<InterfaceC8487b> atomicReference) {
                this.f10100a = uVar;
                this.f10101b = atomicReference;
            }

            @Override // io.reactivex.w
            public final void onComplete() {
                this.f10100a.l(null);
            }

            @Override // io.reactivex.w
            public final void onError(Throwable th2) {
                this.f10100a.l(th2);
            }

            @Override // io.reactivex.w
            public final void onNext(T t2) {
                try {
                    ze.n.b(this.f10100a, t2);
                } catch (InterruptedException unused) {
                }
            }

            @Override // io.reactivex.w, io.reactivex.m, io.reactivex.A
            public final void onSubscribe(InterfaceC8487b interfaceC8487b) {
                AtomicReference<InterfaceC8487b> atomicReference;
                do {
                    atomicReference = this.f10101b;
                    if (atomicReference.compareAndSet(null, interfaceC8487b)) {
                        return;
                    }
                } while (atomicReference.get() == null);
                interfaceC8487b.dispose();
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(io.reactivex.u<T> uVar, kotlin.coroutines.d<? super a> dVar) {
            super(2, dVar);
            this.f10099f = uVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            a aVar = new a(this.f10099f, dVar);
            aVar.f10098e = obj;
            return aVar;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(Object obj, kotlin.coroutines.d<? super Unit> dVar) {
            return ((a) create((u) obj, dVar)).invokeSuspend(Unit.f71690a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
            int i11 = this.f10097d;
            if (i11 == 0) {
                s.b(obj);
                u uVar = (u) this.f10098e;
                final AtomicReference atomicReference = new AtomicReference();
                this.f10099f.subscribe(new C0206a(uVar, atomicReference));
                Function0 function0 = new Function0() { // from class: Ge.m
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        InterfaceC8487b interfaceC8487b = (InterfaceC8487b) atomicReference.getAndSet(rc.e.INSTANCE);
                        if (interfaceC8487b != null) {
                            interfaceC8487b.dispose();
                        }
                        return Unit.f71690a;
                    }
                };
                this.f10097d = 1;
                if (ze.s.a(uVar, function0, this) == aVar) {
                    return aVar;
                }
            } else {
                if (i11 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                s.b(obj);
            }
            return Unit.f71690a;
        }
    }

    @NotNull
    public static final <T> InterfaceC2395h<T> a(@NotNull io.reactivex.u<T> uVar) {
        return C2399j.e(new a(uVar, null));
    }

    public static io.reactivex.p b(InterfaceC2395h interfaceC2395h) {
        return io.reactivex.p.create(new l(interfaceC2395h, kotlin.coroutines.g.f71771a));
    }
}
