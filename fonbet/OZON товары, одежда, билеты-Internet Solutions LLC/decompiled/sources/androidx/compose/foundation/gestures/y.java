package androidx.compose.foundation.gestures;

import k1.C7459e;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC7737t;
import org.jetbrains.annotations.NotNull;
import r0.C9115P;
import x1.C10639n;
import x1.InterfaceC10628c;

@kotlin.coroutines.jvm.internal.e(c = "androidx.compose.foundation.gestures.DragGestureDetectorKt$detectHorizontalDragGestures$5", f = "DragGestureDetector.kt", l = {627, 629, 640}, m = "invokeSuspend")
/* loaded from: classes8.dex */
final class y extends kotlin.coroutines.jvm.internal.i implements Function2<InterfaceC10628c, kotlin.coroutines.d<? super Unit>, Object> {

    /* renamed from: d, reason: collision with root package name */
    kotlin.jvm.internal.J f39269d;

    /* renamed from: e, reason: collision with root package name */
    int f39270e;

    /* renamed from: f, reason: collision with root package name */
    private /* synthetic */ Object f39271f;

    /* renamed from: g, reason: collision with root package name */
    final /* synthetic */ Function1<C7459e, Unit> f39272g;

    /* renamed from: h, reason: collision with root package name */
    final /* synthetic */ AbstractC7737t f39273h;

    /* renamed from: i, reason: collision with root package name */
    final /* synthetic */ AbstractC7737t f39274i;

    /* renamed from: j, reason: collision with root package name */
    final /* synthetic */ Function0<Unit> f39275j;

    static final class a extends AbstractC7737t implements Function1<x1.x, Unit> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ AbstractC7737t f39276b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        a(Function2<? super x1.x, ? super Float, Unit> function2) {
            super(1);
            this.f39276b = (AbstractC7737t) function2;
        }

        /* JADX WARN: Type inference failed for: r1v0, types: [kotlin.jvm.functions.Function2, kotlin.jvm.internal.t] */
        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(x1.x xVar) {
            x1.x xVar2 = xVar;
            this.f39276b.invoke(xVar2, Float.valueOf(C7459e.g(C10639n.f(xVar2))));
            xVar2.a();
            return Unit.f71690a;
        }
    }

    static final class b extends AbstractC7737t implements Function2<x1.x, Float, Unit> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ kotlin.jvm.internal.J f39277b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(kotlin.jvm.internal.J j11) {
            super(2);
            this.f39277b = j11;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(x1.x xVar, Float f7) {
            float floatValue = f7.floatValue();
            xVar.a();
            this.f39277b.f71784a = floatValue;
            return Unit.f71690a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    y(Function0 function0, Function0 function02, Function2 function2, Function1 function1, kotlin.coroutines.d dVar) {
        super(2, dVar);
        this.f39272g = function1;
        this.f39273h = (AbstractC7737t) function2;
        this.f39274i = (AbstractC7737t) function0;
        this.f39275j = function02;
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [kotlin.jvm.functions.Function0, kotlin.jvm.internal.t] */
    /* JADX WARN: Type inference failed for: r3v0, types: [kotlin.jvm.functions.Function2, kotlin.jvm.internal.t] */
    @Override // kotlin.coroutines.jvm.internal.a
    @NotNull
    public final kotlin.coroutines.d<Unit> create(Object obj, @NotNull kotlin.coroutines.d<?> dVar) {
        y yVar = new y(this.f39274i, this.f39275j, this.f39273h, this.f39272g, dVar);
        yVar.f39271f = obj;
        return yVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC10628c interfaceC10628c, kotlin.coroutines.d<? super Unit> dVar) {
        return ((y) create(interfaceC10628c, dVar)).invokeSuspend(Unit.f71690a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x0099, code lost:
    
        if (r12 == r0) goto L24;
     */
    /* JADX WARN: Removed duplicated region for block: B:19:0x006d  */
    /* JADX WARN: Type inference failed for: r12v15, types: [kotlin.jvm.functions.Function0, kotlin.jvm.internal.t] */
    /* JADX WARN: Type inference failed for: r1v7, types: [kotlin.jvm.functions.Function2, kotlin.jvm.internal.t] */
    @Override // kotlin.coroutines.jvm.internal.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(@NotNull Object obj) {
        InterfaceC10628c interfaceC10628c;
        kotlin.jvm.internal.J j11;
        y yVar;
        InterfaceC10628c interfaceC10628c2;
        x1.x xVar;
        Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
        int i11 = this.f39270e;
        if (i11 == 0) {
            Sc.s.b(obj);
            interfaceC10628c = (InterfaceC10628c) this.f39271f;
            this.f39271f = interfaceC10628c;
            this.f39270e = 1;
            obj = C9115P.d(interfaceC10628c, null, this, 2);
            if (obj == aVar) {
                return aVar;
            }
        } else {
            if (i11 != 1) {
                if (i11 != 2) {
                    if (i11 != 3) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    Sc.s.b(obj);
                    yVar = this;
                    if (((Boolean) obj).booleanValue()) {
                        yVar.f39274i.invoke();
                    } else {
                        yVar.f39275j.invoke();
                    }
                    return Unit.f71690a;
                }
                j11 = this.f39269d;
                interfaceC10628c2 = (InterfaceC10628c) this.f39271f;
                Sc.s.b(obj);
                yVar = this;
                xVar = (x1.x) obj;
                if (xVar != null) {
                    yVar.f39272g.invoke(C7459e.a(xVar.f()));
                    Float f7 = new Float(j11.f71784a);
                    ?? r12 = yVar.f39273h;
                    r12.invoke(xVar, f7);
                    long d11 = xVar.d();
                    a aVar2 = new a(r12);
                    yVar.f39271f = null;
                    yVar.f39269d = null;
                    yVar.f39270e = 3;
                    obj = C5177u.j(interfaceC10628c2, d11, aVar2, this);
                }
                return Unit.f71690a;
            }
            interfaceC10628c = (InterfaceC10628c) this.f39271f;
            Sc.s.b(obj);
        }
        InterfaceC10628c interfaceC10628c3 = interfaceC10628c;
        x1.x xVar2 = (x1.x) obj;
        j11 = new kotlin.jvm.internal.J();
        long d12 = xVar2.d();
        int l11 = xVar2.l();
        b bVar = new b(j11);
        this.f39271f = interfaceC10628c3;
        this.f39269d = j11;
        this.f39270e = 2;
        yVar = this;
        obj = C5177u.c(interfaceC10628c3, d12, l11, bVar, yVar);
        if (obj != aVar) {
            interfaceC10628c2 = interfaceC10628c3;
            xVar = (x1.x) obj;
            if (xVar != null) {
            }
            return Unit.f71690a;
        }
        return aVar;
    }
}
