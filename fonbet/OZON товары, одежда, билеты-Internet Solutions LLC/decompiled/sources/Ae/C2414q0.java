package Ae;

import fd.InterfaceC6511n;
import fd.InterfaceC6512o;
import kotlin.Unit;

/* renamed from: Ae.q0, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C2414q0 implements InterfaceC2395h<Object> {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ InterfaceC2395h[] f1102a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ kotlin.coroutines.jvm.internal.j f1103b;

    @kotlin.coroutines.jvm.internal.e(c = "kotlinx.coroutines.flow.FlowKt__ZipKt$combine$$inlined$combineUnsafe$FlowKt__ZipKt$1$2", f = "Zip.kt", l = {259, 258}, m = "invokeSuspend")
    /* renamed from: Ae.q0$a */
    public static final class a extends kotlin.coroutines.jvm.internal.j implements InterfaceC6511n<InterfaceC2397i<Object>, Object[], kotlin.coroutines.d<? super Unit>, Object> {

        /* renamed from: d, reason: collision with root package name */
        int f1104d;

        /* renamed from: e, reason: collision with root package name */
        private /* synthetic */ InterfaceC2397i f1105e;

        /* renamed from: f, reason: collision with root package name */
        /* synthetic */ Object[] f1106f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ kotlin.coroutines.jvm.internal.j f1107g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public a(InterfaceC6512o interfaceC6512o, kotlin.coroutines.d dVar) {
            super(3, dVar);
            this.f1107g = (kotlin.coroutines.jvm.internal.j) interfaceC6512o;
        }

        /* JADX WARN: Type inference failed for: r1v0, types: [fd.o, kotlin.coroutines.jvm.internal.j] */
        @Override // fd.InterfaceC6511n
        public final Object invoke(InterfaceC2397i<Object> interfaceC2397i, Object[] objArr, kotlin.coroutines.d<? super Unit> dVar) {
            a aVar = new a(this.f1107g, dVar);
            aVar.f1105e = interfaceC2397i;
            aVar.f1106f = objArr;
            return aVar.invokeSuspend(Unit.f71690a);
        }

        /* JADX WARN: Code restructure failed: missing block: B:13:0x0042, code lost:
        
            if (r1.emit(r7, r6) == r0) goto L15;
         */
        /* JADX WARN: Code restructure failed: missing block: B:14:0x0044, code lost:
        
            return r0;
         */
        /* JADX WARN: Code restructure failed: missing block: B:16:0x0036, code lost:
        
            if (r7 == r0) goto L15;
         */
        /* JADX WARN: Type inference failed for: r3v1, types: [fd.o, kotlin.coroutines.jvm.internal.j] */
        @Override // kotlin.coroutines.jvm.internal.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            InterfaceC2397i interfaceC2397i;
            Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
            int i11 = this.f1104d;
            if (i11 == 0) {
                Sc.s.b(obj);
                interfaceC2397i = this.f1105e;
                Object[] objArr = this.f1106f;
                Object obj2 = objArr[0];
                Object obj3 = objArr[1];
                Object obj4 = objArr[2];
                this.f1105e = interfaceC2397i;
                this.f1104d = 1;
                obj = this.f1107g.invoke(obj2, obj3, obj4, this);
            } else {
                if (i11 != 1) {
                    if (i11 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    Sc.s.b(obj);
                    return Unit.f71690a;
                }
                interfaceC2397i = this.f1105e;
                Sc.s.b(obj);
            }
            this.f1105e = null;
            this.f1104d = 2;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C2414q0(InterfaceC2395h[] interfaceC2395hArr, InterfaceC6512o interfaceC6512o) {
        this.f1102a = interfaceC2395hArr;
        this.f1103b = (kotlin.coroutines.jvm.internal.j) interfaceC6512o;
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [fd.o, kotlin.coroutines.jvm.internal.j] */
    @Override // Ae.InterfaceC2395h
    public final Object collect(InterfaceC2397i<? super Object> interfaceC2397i, kotlin.coroutines.d dVar) {
        Object a11 = Be.p.a(interfaceC2397i, new a(this.f1103b, null), dVar, v0.f1162a, this.f1102a);
        return a11 == Wc.a.COROUTINE_SUSPENDED ? a11 : Unit.f71690a;
    }
}
