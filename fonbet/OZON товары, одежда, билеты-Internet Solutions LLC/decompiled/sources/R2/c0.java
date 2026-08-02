package R2;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import org.jetbrains.annotations.NotNull;
import ze.C11115c;

@kotlin.coroutines.jvm.internal.e(c = "androidx.datastore.core.SimpleActor$offer$2", f = "SimpleActor.kt", l = {121, 121}, m = "invokeSuspend")
/* loaded from: classes.dex */
final class c0 extends kotlin.coroutines.jvm.internal.j implements Function2<xe.M, kotlin.coroutines.d<? super Unit>, Object> {

    /* renamed from: d, reason: collision with root package name */
    Function2 f24344d;

    /* renamed from: e, reason: collision with root package name */
    int f24345e;

    /* renamed from: f, reason: collision with root package name */
    final /* synthetic */ b0<Object> f24346f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    c0(b0<Object> b0Var, kotlin.coroutines.d<? super c0> dVar) {
        super(2, dVar);
        this.f24346f = b0Var;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    @NotNull
    public final kotlin.coroutines.d<Unit> create(Object obj, @NotNull kotlin.coroutines.d<?> dVar) {
        return new c0(this.f24346f, dVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(xe.M m11, kotlin.coroutines.d<? super Unit> dVar) {
        return ((c0) create(m11, dVar)).invokeSuspend(Unit.f71690a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0050, code lost:
    
        if (r1.invoke(r7, r6) == r0) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0052, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0044, code lost:
    
        if (r7 != r0) goto L15;
     */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:11:0x0050 -> B:6:0x0053). Please report as a decompilation issue!!! */
    @Override // kotlin.coroutines.jvm.internal.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(@NotNull Object obj) {
        C3907a c3907a;
        Function2 function2;
        xe.M m11;
        C3907a c3907a2;
        Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
        int i11 = this.f24345e;
        b0<Object> b0Var = this.f24346f;
        if (i11 == 0) {
            Sc.s.b(obj);
            c3907a = ((b0) b0Var).f24340d;
            if (c3907a.b() <= 0) {
                throw new IllegalStateException("Check failed.");
            }
            m11 = ((b0) b0Var).f24337a;
            xe.N.e(m11);
            function2 = ((b0) b0Var).f24338b;
            C11115c c11115c = ((b0) b0Var).f24339c;
            this.f24344d = function2;
            this.f24345e = 1;
            obj = c11115c.i(this);
        } else if (i11 == 1) {
            function2 = this.f24344d;
            Sc.s.b(obj);
            this.f24344d = null;
            this.f24345e = 2;
        } else {
            if (i11 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            Sc.s.b(obj);
            c3907a2 = ((b0) b0Var).f24340d;
            if (c3907a2.a() == 0) {
                return Unit.f71690a;
            }
            m11 = ((b0) b0Var).f24337a;
            xe.N.e(m11);
            function2 = ((b0) b0Var).f24338b;
            C11115c c11115c2 = ((b0) b0Var).f24339c;
            this.f24344d = function2;
            this.f24345e = 1;
            obj = c11115c2.i(this);
        }
    }
}
