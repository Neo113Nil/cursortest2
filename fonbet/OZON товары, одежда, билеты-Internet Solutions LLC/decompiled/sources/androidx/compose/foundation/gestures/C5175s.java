package androidx.compose.foundation.gestures;

import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import org.jetbrains.annotations.NotNull;
import x1.C10638m;
import x1.C10639n;
import x1.EnumC10640o;
import x1.InterfaceC10628c;

@kotlin.coroutines.jvm.internal.e(c = "androidx.compose.foundation.gestures.DragGestureDetectorKt$awaitLongPressOrCancellation$2", f = "DragGestureDetector.kt", l = {901, 918}, m = "invokeSuspend")
/* renamed from: androidx.compose.foundation.gestures.s, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class C5175s extends kotlin.coroutines.jvm.internal.i implements Function2<InterfaceC10628c, kotlin.coroutines.d<? super Unit>, Object> {

    /* renamed from: d, reason: collision with root package name */
    C10638m f39231d;

    /* renamed from: e, reason: collision with root package name */
    int f39232e;

    /* renamed from: f, reason: collision with root package name */
    int f39233f;

    /* renamed from: g, reason: collision with root package name */
    private /* synthetic */ Object f39234g;

    /* renamed from: h, reason: collision with root package name */
    final /* synthetic */ kotlin.jvm.internal.M<x1.x> f39235h;

    /* renamed from: i, reason: collision with root package name */
    final /* synthetic */ kotlin.jvm.internal.M<x1.x> f39236i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    C5175s(kotlin.jvm.internal.M<x1.x> m11, kotlin.jvm.internal.M<x1.x> m12, kotlin.coroutines.d<? super C5175s> dVar) {
        super(2, dVar);
        this.f39235h = m11;
        this.f39236i = m12;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    @NotNull
    public final kotlin.coroutines.d<Unit> create(Object obj, @NotNull kotlin.coroutines.d<?> dVar) {
        C5175s c5175s = new C5175s(this.f39235h, this.f39236i, dVar);
        c5175s.f39234g = obj;
        return c5175s;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC10628c interfaceC10628c, kotlin.coroutines.d<? super Unit> dVar) {
        return ((C5175s) create(interfaceC10628c, dVar)).invokeSuspend(Unit.f71690a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:28:0x004b, code lost:
    
        if (r8 == r1) goto L33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x0096, code lost:
    
        r2 = r3;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:15:0x00db  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x003d  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0137  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0106  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00c9 A[EDGE_INSN: B:67:0x00c9->B:13:0x00c9 BREAK  A[LOOP:0: B:7:0x00b6->B:10:0x00c6], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:8:0x00b8  */
    /* JADX WARN: Type inference failed for: r11v11, types: [T, x1.x] */
    /* JADX WARN: Type inference failed for: r11v6 */
    /* JADX WARN: Type inference failed for: r11v8, types: [java.lang.Object] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:42:0x00a8 -> B:6:0x00ab). Please report as a decompilation issue!!! */
    @Override // kotlin.coroutines.jvm.internal.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(@NotNull Object obj) {
        InterfaceC10628c interfaceC10628c;
        int i11;
        Object obj2;
        Object i02;
        InterfaceC10628c interfaceC10628c2;
        C10638m c10638m;
        int size;
        int i12;
        boolean k11;
        T t2;
        x1.x xVar;
        Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
        int i13 = this.f39233f;
        int i14 = 1;
        int i15 = 2;
        C10638m c10638m2 = null;
        if (i13 == 0) {
            Sc.s.b(obj);
            interfaceC10628c = (InterfaceC10628c) this.f39234g;
            i11 = 0;
            if (i11 == 0) {
            }
        } else {
            if (i13 == 1) {
                i11 = this.f39232e;
                interfaceC10628c = (InterfaceC10628c) this.f39234g;
                Sc.s.b(obj);
                obj2 = obj;
                C10638m c10638m3 = (C10638m) obj2;
                List<x1.x> b11 = c10638m3.b();
                int size2 = b11.size();
                int i16 = 0;
                while (true) {
                    if (i16 >= size2) {
                        i11 = i14;
                        break;
                    }
                    if (!C10639n.c(b11.get(i16))) {
                        break;
                    }
                    i16++;
                }
                List<x1.x> b12 = c10638m3.b();
                int size3 = b12.size();
                for (int i17 = 0; i17 < size3; i17++) {
                    x1.x xVar2 = b12.get(i17);
                    if (xVar2.n() || C10639n.e(xVar2, interfaceC10628c.a(), interfaceC10628c.W0())) {
                        break;
                    }
                }
                EnumC10640o enumC10640o = EnumC10640o.Final;
                this.f39234g = interfaceC10628c;
                this.f39231d = c10638m3;
                this.f39232e = i11;
                this.f39233f = i15;
                i02 = interfaceC10628c.i0(enumC10640o, this);
                if (i02 != aVar) {
                    interfaceC10628c2 = interfaceC10628c;
                    c10638m = c10638m3;
                    List<x1.x> b13 = ((C10638m) i02).b();
                    size = b13.size();
                    i12 = 0;
                    while (true) {
                        if (i12 >= size) {
                        }
                        i12++;
                    }
                    kotlin.jvm.internal.M<x1.x> m11 = this.f39235h;
                    k11 = C5177u.k(c10638m, m11.f71787a.d());
                    kotlin.jvm.internal.M<x1.x> m12 = this.f39236i;
                    if (k11) {
                    }
                    interfaceC10628c = interfaceC10628c2;
                    i14 = 1;
                    i15 = 2;
                    c10638m2 = null;
                    if (i11 == 0) {
                    }
                }
                return aVar;
            }
            if (i13 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            i11 = this.f39232e;
            c10638m = this.f39231d;
            interfaceC10628c2 = (InterfaceC10628c) this.f39234g;
            Sc.s.b(obj);
            i02 = obj;
            List<x1.x> b132 = ((C10638m) i02).b();
            size = b132.size();
            i12 = 0;
            while (true) {
                if (i12 >= size) {
                    break;
                }
                if (b132.get(i12).n()) {
                    i11 = i14;
                    break;
                }
                i12++;
            }
            kotlin.jvm.internal.M<x1.x> m112 = this.f39235h;
            k11 = C5177u.k(c10638m, m112.f71787a.d());
            kotlin.jvm.internal.M<x1.x> m122 = this.f39236i;
            if (k11) {
                List<x1.x> b14 = c10638m.b();
                int size4 = b14.size();
                int i18 = 0;
                while (true) {
                    if (i18 >= size4) {
                        t2 = 0;
                        break;
                    }
                    t2 = b14.get(i18);
                    if (x1.w.c(((x1.x) t2).d(), m112.f71787a.d())) {
                        break;
                    }
                    i18++;
                }
                m122.f71787a = t2;
            } else {
                List<x1.x> b15 = c10638m.b();
                int size5 = b15.size();
                int i19 = 0;
                while (true) {
                    if (i19 >= size5) {
                        xVar = null;
                        break;
                    }
                    xVar = b15.get(i19);
                    if (xVar.g()) {
                        break;
                    }
                    i19++;
                }
                x1.x xVar3 = xVar;
                if (xVar3 != 0) {
                    m112.f71787a = xVar3;
                    m122.f71787a = xVar3;
                } else {
                    i11 = i14;
                    interfaceC10628c = interfaceC10628c2;
                    c10638m2 = null;
                    if (i11 == 0) {
                        return Unit.f71690a;
                    }
                    EnumC10640o enumC10640o2 = EnumC10640o.Main;
                    this.f39234g = interfaceC10628c;
                    this.f39231d = c10638m2;
                    this.f39232e = i11;
                    this.f39233f = i14;
                    obj2 = interfaceC10628c.i0(enumC10640o2, this);
                }
            }
            interfaceC10628c = interfaceC10628c2;
            i14 = 1;
            i15 = 2;
            c10638m2 = null;
            if (i11 == 0) {
            }
        }
    }
}
