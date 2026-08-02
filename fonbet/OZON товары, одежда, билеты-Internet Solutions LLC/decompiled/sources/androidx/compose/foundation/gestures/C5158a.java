package androidx.compose.foundation.gestures;

import androidx.compose.ui.e;
import androidx.recyclerview.widget.LinearLayoutManager;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC7737t;
import m0.B0;
import n0.EnumC8372M;
import org.jetbrains.annotations.NotNull;
import r0.C9134n;
import r0.EnumC9142v;
import r0.InterfaceC9122b;
import r0.InterfaceC9133m;
import ru.ozon.uni.ozi.components.notificationBar.presets.OziNotificationBarVisibility;

/* renamed from: androidx.compose.foundation.gestures.a, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C5158a {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private static final Function1<x1.x, Boolean> f39110a = C0724a.f39112b;

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int f39111b = 0;

    /* renamed from: androidx.compose.foundation.gestures.a$a, reason: collision with other inner class name */
    static final class C0724a extends AbstractC7737t implements Function1<x1.x, Boolean> {

        /* renamed from: b, reason: collision with root package name */
        public static final C0724a f39112b = new C0724a(1);

        @Override // kotlin.jvm.functions.Function1
        public final /* bridge */ /* synthetic */ Boolean invoke(x1.x xVar) {
            return Boolean.TRUE;
        }
    }

    @NotNull
    public static final <T> InterfaceC9133m<T> a(@NotNull Function1<? super C9134n<T>, Unit> function1) {
        C9134n c9134n = new C9134n();
        function1.invoke(c9134n);
        return new I(c9134n.b());
    }

    public static final Object b(C5167j c5167j, float f7, InterfaceC9122b interfaceC9122b, InterfaceC9133m interfaceC9133m, Object obj, kotlin.coroutines.jvm.internal.j jVar) {
        Object b11;
        float e11 = interfaceC9133m.e(obj);
        kotlin.jvm.internal.J j11 = new kotlin.jvm.internal.J();
        j11.f71784a = Float.isNaN(c5167j.o()) ? 0.0f : c5167j.o();
        if (!Float.isNaN(e11)) {
            float f11 = j11.f71784a;
            if (f11 != e11 && (b11 = B0.b(f11, e11, f7, c5167j.q(), new C5159b(interfaceC9122b, j11), jVar)) == Wc.a.COROUTINE_SUSPENDED) {
                return b11;
            }
        }
        return Unit.f71690a;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(10:0|1|(2:3|(7:5|6|7|(1:(1:10)(2:16|17))(3:18|19|(1:21))|11|12|13))|23|6|7|(0)(0)|11|12|13) */
    /* JADX WARN: Removed duplicated region for block: B:18:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object d(Function0 function0, Function2 function2, kotlin.coroutines.jvm.internal.c cVar) {
        C5163f c5163f;
        int i11;
        if (cVar instanceof C5163f) {
            c5163f = (C5163f) cVar;
            int i12 = c5163f.f39136e;
            if ((i12 & LinearLayoutManager.INVALID_OFFSET) != 0) {
                c5163f.f39136e = i12 - LinearLayoutManager.INVALID_OFFSET;
                Object obj = c5163f.f39135d;
                Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
                i11 = c5163f.f39136e;
                if (i11 != 0) {
                    Sc.s.b(obj);
                    C5164g c5164g = new C5164g(function0, function2, null);
                    c5163f.f39136e = 1;
                    if (xe.N.d(c5164g, c5163f) == aVar) {
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
        c5163f = new C5163f(cVar);
        Object obj2 = c5163f.f39135d;
        Wc.a aVar2 = Wc.a.COROUTINE_SUSPENDED;
        i11 = c5163f.f39136e;
        if (i11 != 0) {
        }
        return Unit.f71690a;
    }

    public static androidx.compose.ui.e e(e.a aVar, C5167j c5167j, boolean z11, EnumC9142v enumC9142v, boolean z12) {
        return new AnchoredDraggableElement(c5167j, enumC9142v, z12, Boolean.valueOf(z11), c5167j.s());
    }

    public static final Object f(@NotNull C5167j c5167j, OziNotificationBarVisibility oziNotificationBarVisibility, @NotNull kotlin.coroutines.d dVar) {
        Object h11 = c5167j.h(oziNotificationBarVisibility, EnumC8372M.Default, new C5160c(c5167j, null), dVar);
        return h11 == Wc.a.COROUTINE_SUSPENDED ? h11 : Unit.f71690a;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object g(@NotNull C5167j c5167j, Object obj, float f7, @NotNull kotlin.coroutines.jvm.internal.c cVar) {
        C5161d c5161d;
        int i11;
        kotlin.jvm.internal.J j11;
        if (cVar instanceof C5161d) {
            c5161d = (C5161d) cVar;
            int i12 = c5161d.f39123g;
            if ((i12 & LinearLayoutManager.INVALID_OFFSET) != 0) {
                c5161d.f39123g = i12 - LinearLayoutManager.INVALID_OFFSET;
                Object obj2 = c5161d.f39122f;
                Object obj3 = Wc.a.COROUTINE_SUSPENDED;
                i11 = c5161d.f39123g;
                if (i11 != 0) {
                    Sc.s.b(obj2);
                    kotlin.jvm.internal.J j12 = new kotlin.jvm.internal.J();
                    j12.f71784a = f7;
                    C5162e c5162e = new C5162e(c5167j, f7, j12, null);
                    c5161d.f39121e = j12;
                    c5161d.f39120d = f7;
                    c5161d.f39123g = 1;
                    if (c5167j.h(obj, EnumC8372M.Default, c5162e, c5161d) == obj3) {
                        return obj3;
                    }
                    j11 = j12;
                } else {
                    if (i11 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    f7 = c5161d.f39120d;
                    j11 = c5161d.f39121e;
                    Sc.s.b(obj2);
                }
                return new Float(f7 - j11.f71784a);
            }
        }
        c5161d = new C5161d(cVar);
        Object obj22 = c5161d.f39122f;
        Object obj32 = Wc.a.COROUTINE_SUSPENDED;
        i11 = c5161d.f39123g;
        if (i11 != 0) {
        }
        return new Float(f7 - j11.f71784a);
    }
}
