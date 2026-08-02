package Ae;

import androidx.recyclerview.widget.LinearLayoutManager;
import fd.InterfaceC6511n;
import kotlin.Unit;
import ru.ozon.fintech.antifraud.internal.models.DeviceStatus;

/* renamed from: Ae.o0, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C2410o0 implements InterfaceC2395h<Object> {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ DeviceStatus f1062a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ C2414q0 f1063b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ InterfaceC6511n f1064c;

    @kotlin.coroutines.jvm.internal.e(c = "kotlinx.coroutines.flow.FlowKt__TransformKt$runningFold$$inlined$unsafeFlow$1", f = "Transform.kt", l = {110, 111}, m = "collect")
    /* renamed from: Ae.o0$a */
    public static final class a extends kotlin.coroutines.jvm.internal.c {

        /* renamed from: d, reason: collision with root package name */
        /* synthetic */ Object f1065d;

        /* renamed from: e, reason: collision with root package name */
        int f1066e;

        /* renamed from: g, reason: collision with root package name */
        C2410o0 f1068g;

        /* renamed from: h, reason: collision with root package name */
        InterfaceC2397i f1069h;

        /* renamed from: i, reason: collision with root package name */
        kotlin.jvm.internal.M f1070i;

        public a(kotlin.coroutines.d dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f1065d = obj;
            this.f1066e |= LinearLayoutManager.INVALID_OFFSET;
            return C2410o0.this.collect(null, this);
        }
    }

    public C2410o0(DeviceStatus deviceStatus, C2414q0 c2414q0, InterfaceC6511n interfaceC6511n) {
        this.f1062a = deviceStatus;
        this.f1063b = c2414q0;
        this.f1064c = interfaceC6511n;
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x0070, code lost:
    
        if (r8.collect(r5, r0) != r1) goto L23;
     */
    /* JADX WARN: Removed duplicated region for block: B:20:0x003c  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /* JADX WARN: Type inference failed for: r2v1, types: [T, java.lang.Object, ru.ozon.fintech.antifraud.internal.models.DeviceStatus] */
    @Override // Ae.InterfaceC2395h
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object collect(InterfaceC2397i<? super Object> interfaceC2397i, kotlin.coroutines.d<? super Unit> dVar) {
        a aVar;
        int i11;
        C2410o0 c2410o0;
        InterfaceC2397i<? super Object> interfaceC2397i2;
        kotlin.jvm.internal.M m11;
        if (dVar instanceof a) {
            aVar = (a) dVar;
            int i12 = aVar.f1066e;
            if ((i12 & LinearLayoutManager.INVALID_OFFSET) != 0) {
                aVar.f1066e = i12 - LinearLayoutManager.INVALID_OFFSET;
                Object obj = aVar.f1065d;
                Wc.a aVar2 = Wc.a.COROUTINE_SUSPENDED;
                i11 = aVar.f1066e;
                if (i11 != 0) {
                    Sc.s.b(obj);
                    kotlin.jvm.internal.M m12 = new kotlin.jvm.internal.M();
                    ?? r22 = this.f1062a;
                    m12.f71787a = r22;
                    aVar.f1068g = this;
                    aVar.f1069h = interfaceC2397i;
                    aVar.f1070i = m12;
                    aVar.f1066e = 1;
                    if (interfaceC2397i.emit(r22, aVar) != aVar2) {
                        c2410o0 = this;
                        interfaceC2397i2 = interfaceC2397i;
                        m11 = m12;
                    }
                    return aVar2;
                }
                if (i11 != 1) {
                    if (i11 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    Sc.s.b(obj);
                    return Unit.f71690a;
                }
                m11 = aVar.f1070i;
                interfaceC2397i2 = aVar.f1069h;
                c2410o0 = aVar.f1068g;
                Sc.s.b(obj);
                C2414q0 c2414q0 = c2410o0.f1063b;
                C2412p0 c2412p0 = new C2412p0(m11, c2410o0.f1064c, interfaceC2397i2);
                aVar.f1068g = null;
                aVar.f1069h = null;
                aVar.f1070i = null;
                aVar.f1066e = 2;
            }
        }
        aVar = new a(dVar);
        Object obj2 = aVar.f1065d;
        Wc.a aVar22 = Wc.a.COROUTINE_SUSPENDED;
        i11 = aVar.f1066e;
        if (i11 != 0) {
        }
        C2414q0 c2414q02 = c2410o0.f1063b;
        C2412p0 c2412p02 = new C2412p0(m11, c2410o0.f1064c, interfaceC2397i2);
        aVar.f1068g = null;
        aVar.f1069h = null;
        aVar.f1070i = null;
        aVar.f1066e = 2;
    }
}
