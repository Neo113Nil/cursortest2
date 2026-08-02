package J4;

import java.util.concurrent.RejectedExecutionException;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import xe.C10727i;
import xe.C10737n;
import xe.M;

/* loaded from: classes.dex */
public final class u {

    /* JADX INFO: Add missing generic type declarations: [R] */
    @kotlin.coroutines.jvm.internal.e(c = "androidx.room.RoomDatabaseKt$withTransaction$transactionBlock$1", f = "RoomDatabaseExt.kt", l = {62}, m = "invokeSuspend")
    static final class a<R> extends kotlin.coroutines.jvm.internal.j implements Function2<M, kotlin.coroutines.d<? super R>, Object> {

        /* renamed from: d, reason: collision with root package name */
        int f13943d;

        /* renamed from: e, reason: collision with root package name */
        private /* synthetic */ Object f13944e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ s f13945f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ Function1<kotlin.coroutines.d<? super R>, Object> f13946g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        a(s sVar, Function1<? super kotlin.coroutines.d<? super R>, ? extends Object> function1, kotlin.coroutines.d<? super a> dVar) {
            super(2, dVar);
            this.f13945f = sVar;
            this.f13946g = function1;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @NotNull
        public final kotlin.coroutines.d<Unit> create(Object obj, @NotNull kotlin.coroutines.d<?> dVar) {
            a aVar = new a(this.f13945f, this.f13946g, dVar);
            aVar.f13944e = obj;
            return aVar;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(M m11, Object obj) {
            return ((a) create(m11, (kotlin.coroutines.d) obj)).invokeSuspend(Unit.f71690a);
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r0v0, types: [Wc.a, java.lang.Object] */
        /* JADX WARN: Type inference failed for: r0v3 */
        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(@NotNull Object obj) {
            Throwable th2;
            B b11;
            B b12 = Wc.a.COROUTINE_SUSPENDED;
            int i11 = this.f13943d;
            s sVar = this.f13945f;
            try {
                if (i11 == 0) {
                    Sc.s.b(obj);
                    CoroutineContext.Element element = ((M) this.f13944e).getCoroutineContext().get(B.f13842c);
                    Intrinsics.f(element);
                    B b13 = (B) element;
                    b13.a();
                    try {
                        sVar.beginTransaction();
                        try {
                            Function1<kotlin.coroutines.d<? super R>, Object> function1 = this.f13946g;
                            this.f13944e = b13;
                            this.f13943d = 1;
                            Object invoke = function1.invoke(this);
                            if (invoke == b12) {
                                return b12;
                            }
                            b11 = b13;
                            obj = invoke;
                        } catch (Throwable th3) {
                            th2 = th3;
                            sVar.endTransaction();
                            throw th2;
                        }
                    } catch (Throwable th4) {
                        b12 = b13;
                        th = th4;
                        b12.c();
                        throw th;
                    }
                } else {
                    if (i11 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    b11 = (B) this.f13944e;
                    try {
                        Sc.s.b(obj);
                    } catch (Throwable th5) {
                        th2 = th5;
                        sVar.endTransaction();
                        throw th2;
                    }
                }
                sVar.setTransactionSuccessful();
                sVar.endTransaction();
                b11.c();
                return obj;
            } catch (Throwable th6) {
                th = th6;
            }
        }
    }

    public static final <R> Object a(@NotNull s sVar, @NotNull Function1<? super kotlin.coroutines.d<? super R>, ? extends Object> function1, @NotNull kotlin.coroutines.d<? super R> frame) {
        a aVar = new a(sVar, function1, null);
        B b11 = (B) frame.getContext().get(B.f13842c);
        kotlin.coroutines.e b12 = b11 != null ? b11.b() : null;
        if (b12 != null) {
            return C10727i.f(b12, aVar, frame);
        }
        CoroutineContext context = frame.getContext();
        C10737n c10737n = new C10737n(1, Wc.b.b(frame));
        c10737n.o();
        try {
            sVar.getTransactionExecutor().execute(new t(context, c10737n, sVar, aVar));
        } catch (RejectedExecutionException e11) {
            c10737n.A(new IllegalStateException("Unable to acquire a thread to perform the database transaction.", e11));
        }
        Object n11 = c10737n.n();
        if (n11 == Wc.a.COROUTINE_SUSPENDED) {
            Intrinsics.checkNotNullParameter(frame, "frame");
        }
        return n11;
    }
}
