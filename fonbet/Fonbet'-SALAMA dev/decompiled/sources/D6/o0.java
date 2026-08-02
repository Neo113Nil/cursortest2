package D6;

import a.AbstractC0603a;
import f6.C1116i;
import i6.InterfaceC1287d;
import k6.AbstractC1361h;
import kotlin.jvm.functions.Function2;

/* loaded from: classes2.dex */
public final class o0 extends AbstractC1361h implements Function2 {

    /* renamed from: b, reason: collision with root package name */
    public u0 f1865b;

    /* renamed from: c, reason: collision with root package name */
    public I6.k f1866c;

    /* renamed from: d, reason: collision with root package name */
    public int f1867d;

    /* renamed from: e, reason: collision with root package name */
    public /* synthetic */ Object f1868e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ s0 f1869f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o0(s0 s0Var, InterfaceC1287d interfaceC1287d) {
        super(interfaceC1287d);
        this.f1869f = s0Var;
    }

    @Override // k6.AbstractC1354a
    public final InterfaceC1287d create(Object obj, InterfaceC1287d interfaceC1287d) {
        o0 o0Var = new o0(this.f1869f, interfaceC1287d);
        o0Var.f1868e = obj;
        return o0Var;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((o0) create((B6.c) obj, (InterfaceC1287d) obj2)).invokeSuspend(C1116i.f13008a);
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x0060  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0062 -> B:6:0x0077). Please report as a decompilation issue!!! */
    @Override // k6.AbstractC1354a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        u0 c3;
        B6.c cVar;
        u0 u0Var;
        I6.k kVar;
        j6.a aVar = j6.a.f14642a;
        int i7 = this.f1867d;
        if (i7 == 0) {
            AbstractC0603a.p0(obj);
            B6.c cVar2 = (B6.c) this.f1868e;
            Object x4 = this.f1869f.x();
            if (x4 instanceof C0134q) {
                r rVar = ((C0134q) x4).f1871e;
                this.f1867d = 1;
                cVar2.c(rVar, this);
                return aVar;
            }
            if ((x4 instanceof InterfaceC0112b0) && (c3 = ((InterfaceC0112b0) x4).c()) != null) {
                Object f7 = c3.f();
                t6.h.c(f7, "null cannot be cast to non-null type kotlinx.coroutines.internal.LockFreeLinkedListNode{ kotlinx.coroutines.internal.LockFreeLinkedListKt.Node }");
                I6.k kVar2 = (I6.k) f7;
                cVar = cVar2;
                u0Var = c3;
                kVar = kVar2;
                if (!kVar.equals(u0Var)) {
                }
            }
        } else if (i7 == 1) {
            AbstractC0603a.p0(obj);
        } else {
            if (i7 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kVar = this.f1866c;
            u0Var = this.f1865b;
            cVar = (B6.c) this.f1868e;
            AbstractC0603a.p0(obj);
            kVar = kVar.g();
            if (!kVar.equals(u0Var)) {
                if (kVar instanceof C0134q) {
                    this.f1868e = cVar;
                    this.f1865b = u0Var;
                    this.f1866c = kVar;
                    this.f1867d = 2;
                    cVar.c(((C0134q) kVar).f1871e, this);
                    j6.a aVar2 = j6.a.f14642a;
                    return aVar;
                }
                kVar = kVar.g();
                if (!kVar.equals(u0Var)) {
                }
            }
        }
        return C1116i.f13008a;
    }
}
