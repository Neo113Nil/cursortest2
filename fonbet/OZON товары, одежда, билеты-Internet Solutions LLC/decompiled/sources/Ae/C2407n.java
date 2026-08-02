package Ae;

import androidx.recyclerview.widget.LinearLayoutManager;
import kotlin.Unit;
import org.jetbrains.annotations.NotNull;

/* renamed from: Ae.n, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final /* synthetic */ class C2407n {

    @kotlin.coroutines.jvm.internal.e(c = "kotlinx.coroutines.flow.FlowKt__ChannelsKt", f = "Channels.kt", l = {32, 33}, m = "emitAllImpl$FlowKt__ChannelsKt")
    /* renamed from: Ae.n$a */
    static final class a<T> extends kotlin.coroutines.jvm.internal.c {

        /* renamed from: d, reason: collision with root package name */
        InterfaceC2397i f1045d;

        /* renamed from: e, reason: collision with root package name */
        ze.w f1046e;

        /* renamed from: f, reason: collision with root package name */
        ze.j f1047f;

        /* renamed from: g, reason: collision with root package name */
        boolean f1048g;

        /* renamed from: h, reason: collision with root package name */
        /* synthetic */ Object f1049h;

        /* renamed from: i, reason: collision with root package name */
        int f1050i;

        a() {
            throw null;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f1049h = obj;
            this.f1050i |= LinearLayoutManager.INVALID_OFFSET;
            return C2407n.c(null, null, false, this);
        }
    }

    public static final Object b(@NotNull InterfaceC2397i interfaceC2397i, @NotNull ze.w wVar, @NotNull kotlin.coroutines.jvm.internal.j jVar) {
        Object c11 = c(interfaceC2397i, wVar, true, jVar);
        return c11 == Wc.a.COROUTINE_SUSPENDED ? c11 : Unit.f71690a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0084, code lost:
    
        if (r9 == r1) goto L33;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0072 A[Catch: all -> 0x0034, TRY_LEAVE, TryCatch #1 {all -> 0x0034, blocks: (B:12:0x002e, B:14:0x0055, B:20:0x006a, B:22:0x0072, B:32:0x0046, B:35:0x0051), top: B:7:0x0020 }] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0087  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0022  */
    /* JADX WARN: Type inference failed for: r2v1, types: [Ae.i] */
    /* JADX WARN: Type inference failed for: r2v3 */
    /* JADX WARN: Type inference failed for: r2v9 */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:23:0x0084 -> B:13:0x0031). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final <T> Object c(InterfaceC2397i<? super T> interfaceC2397i, ze.w<? extends T> wVar, boolean z11, kotlin.coroutines.d<? super Unit> dVar) {
        a aVar;
        int i11;
        ze.j<? extends T> it;
        ze.j<? extends T> jVar;
        ?? r22;
        Object b11;
        try {
            if (dVar instanceof a) {
                aVar = (a) dVar;
                int i12 = aVar.f1050i;
                if ((i12 & LinearLayoutManager.INVALID_OFFSET) != 0) {
                    aVar.f1050i = i12 - LinearLayoutManager.INVALID_OFFSET;
                    Object obj = aVar.f1049h;
                    Wc.a aVar2 = Wc.a.COROUTINE_SUSPENDED;
                    i11 = aVar.f1050i;
                    if (i11 != 0) {
                        Sc.s.b(obj);
                        if (interfaceC2397i instanceof T0) {
                            throw ((T0) interfaceC2397i).f915a;
                        }
                        it = wVar.iterator();
                        aVar.f1045d = interfaceC2397i;
                        aVar.f1046e = wVar;
                        aVar.f1047f = it;
                        aVar.f1048g = z11;
                        aVar.f1050i = 1;
                        b11 = it.b(aVar);
                        if (b11 != aVar2) {
                        }
                    } else if (i11 == 1) {
                        z11 = aVar.f1048g;
                        jVar = aVar.f1047f;
                        wVar = aVar.f1046e;
                        InterfaceC2397i interfaceC2397i2 = aVar.f1045d;
                        Sc.s.b(obj);
                        r22 = interfaceC2397i2;
                        if (((Boolean) obj).booleanValue()) {
                        }
                    } else {
                        if (i11 != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        z11 = aVar.f1048g;
                        jVar = aVar.f1047f;
                        wVar = aVar.f1046e;
                        InterfaceC2397i<? super T> interfaceC2397i3 = aVar.f1045d;
                        Sc.s.b(obj);
                        InterfaceC2397i<? super T> interfaceC2397i4 = interfaceC2397i3;
                        it = jVar;
                        interfaceC2397i = interfaceC2397i4;
                        aVar.f1045d = interfaceC2397i;
                        aVar.f1046e = wVar;
                        aVar.f1047f = it;
                        aVar.f1048g = z11;
                        aVar.f1050i = 1;
                        b11 = it.b(aVar);
                        if (b11 != aVar2) {
                            return aVar2;
                        }
                        r22 = interfaceC2397i;
                        jVar = it;
                        obj = b11;
                        if (((Boolean) obj).booleanValue()) {
                            if (z11) {
                                wVar.j(null);
                            }
                            return Unit.f71690a;
                        }
                        T next = jVar.next();
                        aVar.f1045d = r22;
                        aVar.f1046e = wVar;
                        aVar.f1047f = jVar;
                        aVar.f1048g = z11;
                        aVar.f1050i = 2;
                        Object emit = r22.emit(next, aVar);
                        interfaceC2397i4 = r22;
                    }
                }
            }
            if (i11 != 0) {
            }
        } finally {
        }
        aVar = new a(dVar);
        Object obj2 = aVar.f1049h;
        Wc.a aVar22 = Wc.a.COROUTINE_SUSPENDED;
        i11 = aVar.f1050i;
    }
}
