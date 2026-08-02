package Ae;

import fd.InterfaceC6511n;
import kotlin.Unit;

/* renamed from: Ae.r0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2415r0 implements InterfaceC2395h<Object> {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ InterfaceC2395h[] f1111a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ kotlin.coroutines.jvm.internal.j f1112b;

    @kotlin.coroutines.jvm.internal.e(c = "kotlinx.coroutines.flow.FlowKt__ZipKt$combine$$inlined$combineUnsafe$FlowKt__ZipKt$2$2", f = "Zip.kt", l = {259, 258}, m = "invokeSuspend")
    /* renamed from: Ae.r0$a */
    public static final class a extends kotlin.coroutines.jvm.internal.j implements InterfaceC6511n<InterfaceC2397i<Object>, Object[], kotlin.coroutines.d<? super Unit>, Object> {

        /* renamed from: d, reason: collision with root package name */
        int f1113d;

        /* renamed from: e, reason: collision with root package name */
        private /* synthetic */ InterfaceC2397i f1114e;

        /* renamed from: f, reason: collision with root package name */
        /* synthetic */ Object[] f1115f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ kotlin.coroutines.jvm.internal.j f1116g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public a(kotlin.coroutines.d dVar, fd.p pVar) {
            super(3, dVar);
            this.f1116g = (kotlin.coroutines.jvm.internal.j) pVar;
        }

        /* JADX WARN: Type inference failed for: r1v0, types: [fd.p, kotlin.coroutines.jvm.internal.j] */
        @Override // fd.InterfaceC6511n
        public final Object invoke(InterfaceC2397i<Object> interfaceC2397i, Object[] objArr, kotlin.coroutines.d<? super Unit> dVar) {
            a aVar = new a(dVar, this.f1116g);
            aVar.f1114e = interfaceC2397i;
            aVar.f1115f = objArr;
            return aVar.invokeSuspend(Unit.f71690a);
        }

        /* JADX WARN: Code restructure failed: missing block: B:13:0x0048, code lost:
        
            if (r1.emit(r12, r11) == r0) goto L15;
         */
        /* JADX WARN: Code restructure failed: missing block: B:14:0x004a, code lost:
        
            return r0;
         */
        /* JADX WARN: Code restructure failed: missing block: B:16:0x003c, code lost:
        
            if (r12 == r0) goto L15;
         */
        /* JADX WARN: Type inference failed for: r5v0, types: [fd.p, kotlin.coroutines.jvm.internal.j] */
        @Override // kotlin.coroutines.jvm.internal.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            InterfaceC2397i interfaceC2397i;
            a aVar;
            Wc.a aVar2 = Wc.a.COROUTINE_SUSPENDED;
            int i11 = this.f1113d;
            if (i11 == 0) {
                Sc.s.b(obj);
                interfaceC2397i = this.f1114e;
                Object[] objArr = this.f1115f;
                Object obj2 = objArr[0];
                Object obj3 = objArr[1];
                Object obj4 = objArr[2];
                Object obj5 = objArr[3];
                this.f1114e = interfaceC2397i;
                this.f1113d = 1;
                aVar = this;
                obj = this.f1116g.invoke(obj2, obj3, obj4, obj5, aVar);
            } else {
                if (i11 != 1) {
                    if (i11 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    Sc.s.b(obj);
                    return Unit.f71690a;
                }
                interfaceC2397i = this.f1114e;
                Sc.s.b(obj);
                aVar = this;
            }
            aVar.f1114e = null;
            aVar.f1113d = 2;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C2415r0(InterfaceC2395h[] interfaceC2395hArr, fd.p pVar) {
        this.f1111a = interfaceC2395hArr;
        this.f1112b = (kotlin.coroutines.jvm.internal.j) pVar;
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [fd.p, kotlin.coroutines.jvm.internal.j] */
    @Override // Ae.InterfaceC2395h
    public final Object collect(InterfaceC2397i<? super Object> interfaceC2397i, kotlin.coroutines.d dVar) {
        Object a11 = Be.p.a(interfaceC2397i, new a(null, this.f1112b), dVar, v0.f1162a, this.f1111a);
        return a11 == Wc.a.COROUTINE_SUSPENDED ? a11 : Unit.f71690a;
    }
}
