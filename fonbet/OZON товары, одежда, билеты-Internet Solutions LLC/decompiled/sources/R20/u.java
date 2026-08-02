package R20;

import Ae.C2399j;
import Ae.InterfaceC2395h;
import Ae.InterfaceC2397i;
import Ae.M0;
import Ae.O0;
import Ae.x0;
import I20.a;
import S20.a;
import androidx.lifecycle.w0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.C7714v;
import kotlin.collections.K;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import w20.C10420b;
import xe.C10727i;
import xe.M;

/* loaded from: classes3.dex */
public final class u extends w0 {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final C10420b f24537a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final F20.b f24538b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private final F20.c f24539c;

    /* renamed from: d, reason: collision with root package name */
    @NotNull
    private final I20.b f24540d;

    /* renamed from: e, reason: collision with root package name */
    @NotNull
    private final x0<List<S20.a>> f24541e;

    /* renamed from: f, reason: collision with root package name */
    @NotNull
    private final M0<List<S20.a>> f24542f;

    @kotlin.coroutines.jvm.internal.e(c = "ru.ozon.debugMenu.internal.presentation.main.DebugMenuMainViewModel$1", f = "DebugMenuMainViewModel.kt", l = {28}, m = "invokeSuspend")
    static final class a extends kotlin.coroutines.jvm.internal.j implements Function2<M, kotlin.coroutines.d<? super Unit>, Object> {

        /* renamed from: d, reason: collision with root package name */
        int f24543d;

        /* renamed from: R20.u$a$a, reason: collision with other inner class name */
        static final class C0486a<T> implements InterfaceC2397i {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ u f24545a;

            C0486a(u uVar) {
                this.f24545a = uVar;
            }

            @Override // Ae.InterfaceC2397i
            public final Object emit(Object obj, kotlin.coroutines.d dVar) {
                I20.a aVar = (I20.a) obj;
                boolean d11 = Intrinsics.d(aVar, a.C0230a.f11807a);
                u uVar = this.f24545a;
                if (d11) {
                    u.e0(uVar);
                } else {
                    if (!(aVar instanceof a.b)) {
                        throw new Sc.o();
                    }
                    u.f0(uVar, ((a.b) aVar).a());
                }
                return Unit.f71690a;
            }
        }

        a(kotlin.coroutines.d<? super a> dVar) {
            super(2, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            return u.this.new a(dVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(M m11, kotlin.coroutines.d<? super Unit> dVar) {
            return ((a) create(m11, dVar)).invokeSuspend(Unit.f71690a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
            int i11 = this.f24543d;
            if (i11 == 0) {
                Sc.s.b(obj);
                u uVar = u.this;
                u.e0(uVar);
                InterfaceC2395h<I20.a> a11 = uVar.f24540d.a();
                C0486a c0486a = new C0486a(uVar);
                this.f24543d = 1;
                if (a11.collect(c0486a, this) == aVar) {
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

    public u(@NotNull C10420b debugMenuRouter, @NotNull F20.b getUiListItemsUseCase, @NotNull F20.c reloadGroupUseCase, @NotNull I20.b reloadActionsReceiver) {
        Intrinsics.checkNotNullParameter(debugMenuRouter, "debugMenuRouter");
        Intrinsics.checkNotNullParameter(getUiListItemsUseCase, "getUiListItemsUseCase");
        Intrinsics.checkNotNullParameter(reloadGroupUseCase, "reloadGroupUseCase");
        Intrinsics.checkNotNullParameter(reloadActionsReceiver, "reloadActionsReceiver");
        this.f24537a = debugMenuRouter;
        this.f24538b = getUiListItemsUseCase;
        this.f24539c = reloadGroupUseCase;
        this.f24540d = reloadActionsReceiver;
        x0<List<S20.a>> a11 = O0.a(K.f71697a);
        this.f24541e = a11;
        this.f24542f = C2399j.b(a11);
        C10727i.c(androidx.lifecycle.x0.a(this), null, null, new a(null), 3);
    }

    public static final void e0(u uVar) {
        uVar.f24541e.setValue(uVar.f24538b.a());
    }

    public static final void f0(u uVar, String str) {
        ArrayList a11 = uVar.f24539c.a(str);
        ArrayList arrayList = new ArrayList();
        boolean z11 = false;
        for (S20.a aVar : uVar.f24542f.getValue()) {
            if (!Intrinsics.d(aVar.getGroupId(), str)) {
                arrayList.add(aVar);
            } else if (!z11) {
                arrayList.addAll(a11);
                z11 = true;
            }
        }
        uVar.f24541e.setValue(arrayList);
    }

    public final void close() {
        this.f24537a.a();
    }

    @NotNull
    public final M0<List<S20.a>> g0() {
        return this.f24542f;
    }

    public final void h0(@NotNull String id2, @NotNull String value) {
        Intrinsics.checkNotNullParameter(id2, "id");
        Intrinsics.checkNotNullParameter(value, "value");
        ArrayList W02 = C7714v.W0(this.f24542f.getValue());
        Iterator it = W02.iterator();
        int i11 = 0;
        while (true) {
            if (!it.hasNext()) {
                i11 = -1;
                break;
            } else if (Intrinsics.d(((S20.a) it.next()).getId(), id2)) {
                break;
            } else {
                i11++;
            }
        }
        if (i11 != -1) {
            Object obj = W02.get(i11);
            if (!(obj instanceof a.h)) {
                obj = null;
            }
            a.h hVar = (a.h) obj;
            if (hVar == null) {
                return;
            }
            W02.set(i11, a.h.a(hVar, value));
            this.f24541e.setValue(W02);
        }
    }

    public final void i0(int i11, @NotNull String id2) {
        Intrinsics.checkNotNullParameter(id2, "id");
        ArrayList W02 = C7714v.W0(this.f24542f.getValue());
        Iterator it = W02.iterator();
        int i12 = 0;
        while (true) {
            if (!it.hasNext()) {
                i12 = -1;
                break;
            } else if (Intrinsics.d(((S20.a) it.next()).getId(), id2)) {
                break;
            } else {
                i12++;
            }
        }
        if (i12 != -1) {
            Object obj = W02.get(i12);
            if (!(obj instanceof a.i)) {
                obj = null;
            }
            a.i iVar = (a.i) obj;
            if (iVar == null) {
                return;
            }
            W02.set(i12, a.i.a(iVar, i11));
            this.f24541e.setValue(W02);
        }
    }

    public final void j0(@NotNull String id2, boolean z11) {
        Intrinsics.checkNotNullParameter(id2, "id");
        ArrayList W02 = C7714v.W0(this.f24542f.getValue());
        Iterator it = W02.iterator();
        int i11 = 0;
        while (true) {
            if (!it.hasNext()) {
                i11 = -1;
                break;
            } else if (Intrinsics.d(((S20.a) it.next()).getId(), id2)) {
                break;
            } else {
                i11++;
            }
        }
        if (i11 != -1) {
            Object obj = W02.get(i11);
            if (!(obj instanceof a.j)) {
                obj = null;
            }
            a.j jVar = (a.j) obj;
            if (jVar == null) {
                return;
            }
            W02.set(i11, a.j.a(jVar, z11));
            this.f24541e.setValue(W02);
        }
    }
}
