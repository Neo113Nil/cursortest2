package Ae;

import fd.InterfaceC6511n;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

@kotlin.coroutines.jvm.internal.e(c = "kotlinx.coroutines.flow.FlowKt__MergeKt$mapLatest$1", f = "Merge.kt", l = {213, 213}, m = "invokeSuspend")
/* loaded from: classes.dex */
final class Y extends kotlin.coroutines.jvm.internal.j implements InterfaceC6511n<InterfaceC2397i<Object>, Object, kotlin.coroutines.d<? super Unit>, Object> {

    /* renamed from: d, reason: collision with root package name */
    int f937d;

    /* renamed from: e, reason: collision with root package name */
    private /* synthetic */ InterfaceC2397i f938e;

    /* renamed from: f, reason: collision with root package name */
    /* synthetic */ Object f939f;

    /* renamed from: g, reason: collision with root package name */
    final /* synthetic */ Function2<Object, kotlin.coroutines.d<Object>, Object> f940g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    Y(Function2<Object, ? super kotlin.coroutines.d<Object>, ? extends Object> function2, kotlin.coroutines.d<? super Y> dVar) {
        super(3, dVar);
        this.f940g = function2;
    }

    @Override // fd.InterfaceC6511n
    public final Object invoke(InterfaceC2397i<Object> interfaceC2397i, Object obj, kotlin.coroutines.d<? super Unit> dVar) {
        Y y11 = new Y(this.f940g, dVar);
        y11.f938e = interfaceC2397i;
        y11.f939f = obj;
        return y11.invokeSuspend(Unit.f71690a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x003b, code lost:
    
        if (r1.emit(r5, r4) == r0) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x003d, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x002f, code lost:
    
        if (r5 == r0) goto L15;
     */
    @Override // kotlin.coroutines.jvm.internal.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        InterfaceC2397i interfaceC2397i;
        Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
        int i11 = this.f937d;
        if (i11 == 0) {
            Sc.s.b(obj);
            interfaceC2397i = this.f938e;
            Object obj2 = this.f939f;
            this.f938e = interfaceC2397i;
            this.f937d = 1;
            obj = this.f940g.invoke(obj2, this);
        } else {
            if (i11 != 1) {
                if (i11 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                Sc.s.b(obj);
                return Unit.f71690a;
            }
            interfaceC2397i = this.f938e;
            Sc.s.b(obj);
        }
        this.f938e = null;
        this.f937d = 2;
    }
}
