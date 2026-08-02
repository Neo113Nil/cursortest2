package Ae;

import androidx.recyclerview.widget.LinearLayoutManager;
import fd.InterfaceC6512o;
import java.io.Serializable;
import kotlin.Unit;

/* loaded from: classes.dex */
public final class G implements InterfaceC2395h<Object> {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ InterfaceC2395h f804a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ kotlin.coroutines.jvm.internal.j f805b;

    @kotlin.coroutines.jvm.internal.e(c = "kotlinx.coroutines.flow.FlowKt__ErrorsKt$retryWhen$$inlined$unsafeFlow$1", f = "Errors.kt", l = {113, 115}, m = "collect")
    public static final class a extends kotlin.coroutines.jvm.internal.c {

        /* renamed from: d, reason: collision with root package name */
        /* synthetic */ Object f806d;

        /* renamed from: e, reason: collision with root package name */
        int f807e;

        /* renamed from: g, reason: collision with root package name */
        G f809g;

        /* renamed from: h, reason: collision with root package name */
        InterfaceC2397i f810h;

        /* renamed from: i, reason: collision with root package name */
        Throwable f811i;

        /* renamed from: j, reason: collision with root package name */
        long f812j;

        public a(kotlin.coroutines.d dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f806d = obj;
            this.f807e |= LinearLayoutManager.INVALID_OFFSET;
            return G.this.collect(null, this);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public G(InterfaceC2395h interfaceC2395h, InterfaceC6512o interfaceC6512o) {
        this.f804a = interfaceC2395h;
        this.f805b = (kotlin.coroutines.jvm.internal.j) interfaceC6512o;
    }

    /* JADX WARN: Code restructure failed: missing block: B:27:0x007d, code lost:
    
        if (r11 == r1) goto L26;
     */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0093  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0096  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x008f  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0046  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /* JADX WARN: Type inference failed for: r11v4, types: [fd.o, kotlin.coroutines.jvm.internal.j] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:27:0x007d -> B:11:0x0080). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:28:0x008f -> B:14:0x008c). Please report as a decompilation issue!!! */
    @Override // Ae.InterfaceC2395h
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object collect(InterfaceC2397i<? super Object> interfaceC2397i, kotlin.coroutines.d<? super Unit> dVar) {
        a aVar;
        int i11;
        long j11;
        G g10;
        G g11;
        InterfaceC2397i<? super Object> interfaceC2397i2;
        Throwable th2;
        Serializable a11;
        if (dVar instanceof a) {
            aVar = (a) dVar;
            int i12 = aVar.f807e;
            if ((i12 & LinearLayoutManager.INVALID_OFFSET) != 0) {
                aVar.f807e = i12 - LinearLayoutManager.INVALID_OFFSET;
                Object obj = aVar.f806d;
                Wc.a aVar2 = Wc.a.COROUTINE_SUSPENDED;
                i11 = aVar.f807e;
                if (i11 != 0) {
                    Sc.s.b(obj);
                    j11 = 0;
                    g10 = this;
                    InterfaceC2395h interfaceC2395h = g10.f804a;
                    aVar.f809g = g10;
                    aVar.f810h = interfaceC2397i;
                    aVar.f811i = null;
                    aVar.f812j = j11;
                    aVar.f807e = 1;
                    a11 = H.a(interfaceC2395h, interfaceC2397i, aVar);
                    if (a11 != aVar2) {
                    }
                    return aVar2;
                }
                if (i11 != 1) {
                    if (i11 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    j11 = aVar.f812j;
                    th2 = aVar.f811i;
                    interfaceC2397i2 = aVar.f810h;
                    g11 = aVar.f809g;
                    Sc.s.b(obj);
                    if (!((Boolean) obj).booleanValue()) {
                        throw th2;
                    }
                    j11++;
                    boolean z11 = true;
                    g10 = g11;
                    if (z11) {
                        return Unit.f71690a;
                    }
                    interfaceC2397i = interfaceC2397i2;
                    InterfaceC2395h interfaceC2395h2 = g10.f804a;
                    aVar.f809g = g10;
                    aVar.f810h = interfaceC2397i;
                    aVar.f811i = null;
                    aVar.f812j = j11;
                    aVar.f807e = 1;
                    a11 = H.a(interfaceC2395h2, interfaceC2397i, aVar);
                    if (a11 != aVar2) {
                        g11 = g10;
                        obj = a11;
                        interfaceC2397i2 = interfaceC2397i;
                        th2 = (Throwable) obj;
                        if (th2 == null) {
                            ?? r11 = g11.f805b;
                            Long l11 = new Long(j11);
                            aVar.f809g = g11;
                            aVar.f810h = interfaceC2397i2;
                            aVar.f811i = th2;
                            aVar.f812j = j11;
                            aVar.f807e = 2;
                            obj = r11.invoke(interfaceC2397i2, th2, l11, aVar);
                        } else {
                            z11 = false;
                            g10 = g11;
                            if (z11) {
                            }
                        }
                    }
                    return aVar2;
                }
                j11 = aVar.f812j;
                interfaceC2397i = aVar.f810h;
                G g12 = aVar.f809g;
                Sc.s.b(obj);
                g11 = g12;
                interfaceC2397i2 = interfaceC2397i;
                th2 = (Throwable) obj;
                if (th2 == null) {
                }
            }
        }
        aVar = new a(dVar);
        Object obj2 = aVar.f806d;
        Wc.a aVar22 = Wc.a.COROUTINE_SUSPENDED;
        i11 = aVar.f807e;
        if (i11 != 0) {
        }
    }
}
