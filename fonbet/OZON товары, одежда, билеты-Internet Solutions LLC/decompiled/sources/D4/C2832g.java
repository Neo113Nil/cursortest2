package D4;

import B4.C2581j;
import Bl0.C2652m;
import D4.C2840o;
import S0.C3969l;
import S0.InterfaceC3967k;
import S0.InterfaceC3978p0;
import S0.J0;
import S0.n1;
import androidx.compose.ui.platform.C5239d1;
import androidx.lifecycle.AbstractC5434v;
import b1.C5511n;
import b1.InterfaceC5505h;
import d2.C6053k;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Set;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* renamed from: D4.g, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C2832g {

    /* renamed from: D4.g$a */
    static final class a extends AbstractC7737t implements Function0<Unit> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ C2840o f5891b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ C2581j f5892c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(C2840o c2840o, C2581j c2581j) {
            super(0);
            this.f5891b = c2840o;
            this.f5892c = c2581j;
        }

        @Override // kotlin.jvm.functions.Function0
        public final Unit invoke() {
            this.f5891b.j(this.f5892c, false);
            return Unit.f71690a;
        }
    }

    /* renamed from: D4.g$b */
    static final class b extends AbstractC7737t implements Function2<InterfaceC3967k, Integer, Unit> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ C2581j f5893b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ C2840o f5894c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ InterfaceC5505h f5895d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ c1.u<C2581j> f5896e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ C2840o.a f5897f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(C2581j c2581j, C2840o c2840o, InterfaceC5505h interfaceC5505h, c1.u<C2581j> uVar, C2840o.a aVar) {
            super(2);
            this.f5893b = c2581j;
            this.f5894c = c2840o;
            this.f5895d = interfaceC5505h;
            this.f5896e = uVar;
            this.f5897f = aVar;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(InterfaceC3967k interfaceC3967k, Integer num) {
            InterfaceC3967k interfaceC3967k2 = interfaceC3967k;
            if ((num.intValue() & 3) == 2 && interfaceC3967k2.b()) {
                interfaceC3967k2.j();
            } else {
                C2581j c2581j = this.f5893b;
                boolean F11 = interfaceC3967k2.F(c2581j);
                C2840o c2840o = this.f5894c;
                boolean n11 = F11 | interfaceC3967k2.n(c2840o);
                Object C11 = interfaceC3967k2.C();
                if (n11 || C11 == InterfaceC3967k.a.a()) {
                    C11 = new C2834i(c2581j, c2840o, this.f5896e);
                    interfaceC3967k2.x(C11);
                }
                S0.Q.c(c2581j, (Function1) C11, interfaceC3967k2);
                C2843s.a(c2581j, this.f5895d, a1.c.c(-497631156, new C2835j(this.f5897f, c2581j), interfaceC3967k2), interfaceC3967k2, 384);
            }
            return Unit.f71690a;
        }
    }

    @kotlin.coroutines.jvm.internal.e(c = "androidx.navigation.compose.DialogHostKt$DialogHost$2$1", f = "DialogHost.kt", l = {}, m = "invokeSuspend")
    /* renamed from: D4.g$c */
    static final class c extends kotlin.coroutines.jvm.internal.j implements Function2<xe.M, kotlin.coroutines.d<? super Unit>, Object> {

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ InterfaceC3978p0 f5898d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ C2840o f5899e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ c1.u<C2581j> f5900f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(InterfaceC3978p0 interfaceC3978p0, C2840o c2840o, c1.u uVar, kotlin.coroutines.d dVar) {
            super(2, dVar);
            this.f5898d = interfaceC3978p0;
            this.f5899e = c2840o;
            this.f5900f = uVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            return new c(this.f5898d, this.f5899e, this.f5900f, dVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(xe.M m11, kotlin.coroutines.d<? super Unit> dVar) {
            return ((c) create(m11, dVar)).invokeSuspend(Unit.f71690a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
            Sc.s.b(obj);
            for (C2581j c2581j : (Set) this.f5898d.getValue()) {
                C2840o c2840o = this.f5899e;
                if (!c2840o.l().getValue().contains(c2581j) && !this.f5900f.contains(c2581j)) {
                    c2840o.n(c2581j);
                }
            }
            return Unit.f71690a;
        }
    }

    /* renamed from: D4.g$d */
    static final class d extends AbstractC7737t implements Function2<InterfaceC3967k, Integer, Unit> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ C2840o f5901b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(C2840o c2840o, int i11) {
            super(2);
            this.f5901b = c2840o;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(InterfaceC3967k interfaceC3967k, Integer num) {
            num.intValue();
            int e11 = C2652m.e(1);
            C2832g.a(this.f5901b, interfaceC3967k, e11);
            return Unit.f71690a;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x005b, code lost:
    
        if (r7 == S0.InterfaceC3967k.a.a()) goto L16;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void a(@NotNull C2840o c2840o, InterfaceC3967k interfaceC3967k, int i11) {
        Object obj;
        C3969l u11 = interfaceC3967k.u(294589392);
        int i12 = i11 | (u11.n(c2840o) ? 4 : 2);
        if ((i12 & 3) == 2 && u11.b()) {
            u11.j();
        } else {
            InterfaceC5505h a11 = C5511n.a(u11);
            InterfaceC3978p0 b11 = n1.b(c2840o.l(), u11);
            Object obj2 = (Collection) ((List) b11.getValue());
            boolean booleanValue = ((Boolean) u11.m(C5239d1.a())).booleanValue();
            boolean n11 = u11.n(obj2);
            Object C11 = u11.C();
            if (!n11) {
                obj = C11;
            }
            c1.u uVar = new c1.u();
            ArrayList arrayList = new ArrayList();
            for (Object obj3 : (Iterable) obj2) {
                if (booleanValue ? true : ((C2581j) obj3).getLifecycle().b().a(AbstractC5434v.b.STARTED)) {
                    arrayList.add(obj3);
                }
            }
            uVar.addAll(arrayList);
            u11.x(uVar);
            obj = uVar;
            c1.u uVar2 = (c1.u) obj;
            boolean z11 = false;
            b(uVar2, (List) b11.getValue(), u11, 0);
            InterfaceC3978p0 b12 = n1.b(c2840o.m(), u11);
            Object C12 = u11.C();
            if (C12 == InterfaceC3967k.a.a()) {
                C12 = new c1.u();
                u11.x(C12);
            }
            c1.u uVar3 = (c1.u) C12;
            u11.o(1361037007);
            ListIterator listIterator = uVar2.listIterator();
            while (listIterator.hasNext()) {
                C2581j c2581j = (C2581j) listIterator.next();
                B4.H d11 = c2581j.d();
                Intrinsics.g(d11, "null cannot be cast to non-null type androidx.navigation.compose.DialogNavigator.Destination");
                C2840o.a aVar = (C2840o.a) d11;
                boolean F11 = ((i12 & 14) == 4 ? true : z11) | u11.F(c2581j);
                Object C13 = u11.C();
                if (F11 || C13 == InterfaceC3967k.a.a()) {
                    C13 = new a(c2840o, c2581j);
                    u11.x(C13);
                }
                C6053k.a((Function0) C13, aVar.B(), a1.c.c(1129586364, new b(c2581j, c2840o, a11, uVar3, aVar), u11), u11, 384, 0);
                b12 = b12;
                z11 = z11;
            }
            boolean z12 = z11;
            InterfaceC3978p0 interfaceC3978p0 = b12;
            u11.k();
            Set set = (Set) interfaceC3978p0.getValue();
            boolean n12 = u11.n(interfaceC3978p0) | ((i12 & 14) != 4 ? z12 : true);
            Object C14 = u11.C();
            if (n12 || C14 == InterfaceC3967k.a.a()) {
                C14 = new c(interfaceC3978p0, c2840o, uVar3, null);
                u11.x(C14);
            }
            S0.Q.g(set, uVar3, (Function2) C14, u11);
        }
        J0 m02 = u11.m0();
        if (m02 != null) {
            m02.G(new d(c2840o, i11));
        }
    }

    public static final void b(@NotNull c1.u uVar, @NotNull Collection collection, InterfaceC3967k interfaceC3967k, int i11) {
        C3969l u11 = interfaceC3967k.u(1537894851);
        if ((((u11.F(uVar) ? 4 : 2) | i11 | (u11.F(collection) ? 32 : 16)) & 19) == 18 && u11.b()) {
            u11.j();
        } else {
            boolean booleanValue = ((Boolean) u11.m(C5239d1.a())).booleanValue();
            Iterator it = collection.iterator();
            while (it.hasNext()) {
                C2581j c2581j = (C2581j) it.next();
                AbstractC5434v lifecycle = c2581j.getLifecycle();
                boolean p11 = u11.p(booleanValue) | u11.F(uVar) | u11.F(c2581j);
                Object C11 = u11.C();
                if (p11 || C11 == InterfaceC3967k.a.a()) {
                    C11 = new C2838m(c2581j, uVar, booleanValue);
                    u11.x(C11);
                }
                S0.Q.c(lifecycle, (Function1) C11, u11);
            }
        }
        J0 m02 = u11.m0();
        if (m02 != null) {
            m02.G(new C2839n(uVar, collection, i11));
        }
    }
}
