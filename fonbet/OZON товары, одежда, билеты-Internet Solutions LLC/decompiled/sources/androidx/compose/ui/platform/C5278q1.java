package androidx.compose.ui.platform;

import D1.C2809k;
import Sc.C4005g;
import androidx.recyclerview.widget.LinearLayoutManager;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC7737t;
import org.jetbrains.annotations.NotNull;

/* renamed from: androidx.compose.ui.platform.q1, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C5278q1 {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private static final S0.B1 f41002a = new S0.B1(a.f41003b);

    /* renamed from: androidx.compose.ui.platform.q1$a */
    static final class a extends AbstractC7737t implements Function0<F0> {

        /* renamed from: b, reason: collision with root package name */
        public static final a f41003b = new a(0);

        @Override // kotlin.jvm.functions.Function0
        public final /* bridge */ /* synthetic */ F0 invoke() {
            return null;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Wc.a b(@NotNull InterfaceC5275p1 interfaceC5275p1, @NotNull Function2 function2, @NotNull kotlin.coroutines.jvm.internal.c cVar) {
        C5280r1 c5280r1;
        int i11;
        if (cVar instanceof C5280r1) {
            c5280r1 = (C5280r1) cVar;
            int i12 = c5280r1.f41008e;
            if ((i12 & LinearLayoutManager.INVALID_OFFSET) != 0) {
                c5280r1.f41008e = i12 - LinearLayoutManager.INVALID_OFFSET;
                Object obj = c5280r1.f41007d;
                Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
                i11 = c5280r1.f41008e;
                if (i11 != 0) {
                    Sc.s.b(obj);
                    if (!interfaceC5275p1.getNode().isAttached()) {
                        throw new IllegalArgumentException("establishTextInputSession called from an unattached node");
                    }
                    D1.x0 g10 = C2809k.g(interfaceC5275p1);
                    F0 f02 = (F0) C2809k.f(interfaceC5275p1).C().b(f41002a);
                    c5280r1.f41008e = 1;
                    if (c(g10, f02, function2, c5280r1) == aVar) {
                        return aVar;
                    }
                } else {
                    if (i11 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    Sc.s.b(obj);
                }
                throw new C4005g();
            }
        }
        c5280r1 = new C5280r1(cVar);
        Object obj2 = c5280r1.f41007d;
        Wc.a aVar2 = Wc.a.COROUTINE_SUSPENDED;
        i11 = c5280r1.f41008e;
        if (i11 != 0) {
        }
        throw new C4005g();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0041, code lost:
    
        if (r5.w(r7, r0) == r1) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0050, code lost:
    
        if (r6.a(r5, r7, r0) == r1) goto L25;
     */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Wc.a c(D1.x0 x0Var, F0 f02, Function2 function2, kotlin.coroutines.jvm.internal.c cVar) {
        C5283s1 c5283s1;
        int i11;
        if (cVar instanceof C5283s1) {
            c5283s1 = (C5283s1) cVar;
            int i12 = c5283s1.f41016e;
            if ((i12 & LinearLayoutManager.INVALID_OFFSET) != 0) {
                c5283s1.f41016e = i12 - LinearLayoutManager.INVALID_OFFSET;
                Object obj = c5283s1.f41015d;
                Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
                i11 = c5283s1.f41016e;
                if (i11 != 0) {
                    Sc.s.b(obj);
                    if (f02 == null) {
                        c5283s1.f41016e = 1;
                    } else {
                        c5283s1.f41016e = 2;
                    }
                    return aVar;
                }
                if (i11 == 1) {
                    Sc.s.b(obj);
                    throw new C4005g();
                }
                if (i11 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                Sc.s.b(obj);
                throw new C4005g();
            }
        }
        c5283s1 = new C5283s1(cVar);
        Object obj2 = c5283s1.f41015d;
        Wc.a aVar2 = Wc.a.COROUTINE_SUSPENDED;
        i11 = c5283s1.f41016e;
        if (i11 != 0) {
        }
    }
}
