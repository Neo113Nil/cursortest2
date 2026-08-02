package Ae;

import fd.InterfaceC6511n;
import kotlin.Unit;

@kotlin.coroutines.jvm.internal.e(c = "kotlinx.coroutines.flow.FlowKt__ZipKt$combine$1$1", f = "Zip.kt", l = {29, 29}, m = "invokeSuspend")
/* renamed from: Ae.t0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class C2419t0 extends kotlin.coroutines.jvm.internal.j implements InterfaceC6511n<InterfaceC2397i<Object>, Object[], kotlin.coroutines.d<? super Unit>, Object> {

    /* renamed from: d, reason: collision with root package name */
    int f1150d;

    /* renamed from: e, reason: collision with root package name */
    private /* synthetic */ InterfaceC2397i f1151e;

    /* renamed from: f, reason: collision with root package name */
    /* synthetic */ Object[] f1152f;

    /* renamed from: g, reason: collision with root package name */
    final /* synthetic */ Object f1153g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    C2419t0(InterfaceC6511n<Object, Object, ? super kotlin.coroutines.d<Object>, ? extends Object> interfaceC6511n, kotlin.coroutines.d<? super C2419t0> dVar) {
        super(3, dVar);
        this.f1153g = interfaceC6511n;
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [fd.n, java.lang.Object] */
    @Override // fd.InterfaceC6511n
    public final Object invoke(InterfaceC2397i<Object> interfaceC2397i, Object[] objArr, kotlin.coroutines.d<? super Unit> dVar) {
        C2419t0 c2419t0 = new C2419t0(this.f1153g, dVar);
        c2419t0.f1151e = interfaceC2397i;
        c2419t0.f1152f = objArr;
        return c2419t0.invokeSuspend(Unit.f71690a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0040, code lost:
    
        if (r1.emit(r6, r5) == r0) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0042, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0034, code lost:
    
        if (r6 == r0) goto L15;
     */
    /* JADX WARN: Type inference failed for: r3v1, types: [fd.n, java.lang.Object] */
    @Override // kotlin.coroutines.jvm.internal.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        InterfaceC2397i interfaceC2397i;
        Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
        int i11 = this.f1150d;
        if (i11 == 0) {
            Sc.s.b(obj);
            interfaceC2397i = this.f1151e;
            Object[] objArr = this.f1152f;
            Object obj2 = objArr[0];
            Object obj3 = objArr[1];
            this.f1151e = interfaceC2397i;
            this.f1150d = 1;
            obj = this.f1153g.invoke(obj2, obj3, this);
        } else {
            if (i11 != 1) {
                if (i11 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                Sc.s.b(obj);
                return Unit.f71690a;
            }
            interfaceC2397i = this.f1151e;
            Sc.s.b(obj);
        }
        this.f1151e = null;
        this.f1150d = 2;
    }
}
