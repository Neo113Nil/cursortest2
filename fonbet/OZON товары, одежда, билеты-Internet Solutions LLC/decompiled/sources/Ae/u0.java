package Ae;

import fd.InterfaceC6511n;
import fd.InterfaceC6512o;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

@kotlin.coroutines.jvm.internal.e(c = "kotlinx.coroutines.flow.FlowKt__ZipKt$combineTransform$$inlined$combineTransformUnsafe$FlowKt__ZipKt$2", f = "Zip.kt", l = {269}, m = "invokeSuspend")
/* loaded from: classes10.dex */
public final class u0 extends kotlin.coroutines.jvm.internal.j implements Function2<InterfaceC2397i<Object>, kotlin.coroutines.d<? super Unit>, Object> {

    /* renamed from: d, reason: collision with root package name */
    int f1154d;

    /* renamed from: e, reason: collision with root package name */
    private /* synthetic */ Object f1155e;

    /* renamed from: f, reason: collision with root package name */
    final /* synthetic */ InterfaceC2395h[] f1156f;

    /* renamed from: g, reason: collision with root package name */
    final /* synthetic */ InterfaceC6512o f1157g;

    @kotlin.coroutines.jvm.internal.e(c = "kotlinx.coroutines.flow.FlowKt__ZipKt$combineTransform$$inlined$combineTransformUnsafe$FlowKt__ZipKt$2$1", f = "Zip.kt", l = {270}, m = "invokeSuspend")
    public static final class a extends kotlin.coroutines.jvm.internal.j implements InterfaceC6511n<InterfaceC2397i<Object>, Object[], kotlin.coroutines.d<? super Unit>, Object> {

        /* renamed from: d, reason: collision with root package name */
        int f1158d;

        /* renamed from: e, reason: collision with root package name */
        private /* synthetic */ InterfaceC2397i f1159e;

        /* renamed from: f, reason: collision with root package name */
        /* synthetic */ Object[] f1160f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ InterfaceC6512o f1161g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(InterfaceC6512o interfaceC6512o, kotlin.coroutines.d dVar) {
            super(3, dVar);
            this.f1161g = interfaceC6512o;
        }

        @Override // fd.InterfaceC6511n
        public final Object invoke(InterfaceC2397i<Object> interfaceC2397i, Object[] objArr, kotlin.coroutines.d<? super Unit> dVar) {
            a aVar = new a(this.f1161g, dVar);
            aVar.f1159e = interfaceC2397i;
            aVar.f1160f = objArr;
            return aVar.invokeSuspend(Unit.f71690a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
            int i11 = this.f1158d;
            if (i11 == 0) {
                Sc.s.b(obj);
                InterfaceC2397i interfaceC2397i = this.f1159e;
                Object[] objArr = this.f1160f;
                Object obj2 = objArr[0];
                Object obj3 = objArr[1];
                this.f1158d = 1;
                if (this.f1161g.invoke(interfaceC2397i, obj2, obj3, this) == aVar) {
                    return aVar;
                }
            } else {
                if (i11 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                Sc.s.b(obj);
            }
            return Unit.f71690a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u0(InterfaceC2395h[] interfaceC2395hArr, kotlin.coroutines.d dVar, InterfaceC6512o interfaceC6512o) {
        super(2, dVar);
        this.f1156f = interfaceC2395hArr;
        this.f1157g = interfaceC6512o;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
        u0 u0Var = new u0(this.f1156f, dVar, this.f1157g);
        u0Var.f1155e = obj;
        return u0Var;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC2397i<Object> interfaceC2397i, kotlin.coroutines.d<? super Unit> dVar) {
        return ((u0) create(interfaceC2397i, dVar)).invokeSuspend(Unit.f71690a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
        int i11 = this.f1154d;
        if (i11 == 0) {
            Sc.s.b(obj);
            InterfaceC2397i interfaceC2397i = (InterfaceC2397i) this.f1155e;
            v0 v0Var = v0.f1162a;
            a aVar2 = new a(this.f1157g, null);
            this.f1154d = 1;
            if (Be.p.a(interfaceC2397i, aVar2, this, v0Var, this.f1156f) == aVar) {
                return aVar;
            }
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            Sc.s.b(obj);
        }
        return Unit.f71690a;
    }
}
