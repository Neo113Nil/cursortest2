package Vg0;

import Sc.r;
import Sc.s;
import Wg0.f;
import android.app.Dialog;
import android.content.Intent;
import android.os.Bundle;
import androidx.fragment.app.ComponentCallbacksC5392m;
import androidx.fragment.app.DialogInterfaceOnCancelListenerC5390k;
import androidx.fragment.app.Z;
import androidx.fragment.app.b0;
import androidx.lifecycle.A0;
import androidx.lifecycle.K;
import androidx.lifecycle.x0;
import androidx.lifecycle.y0;
import androidx.lifecycle.z0;
import f3.C6411c;
import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.j;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.N;
import org.jetbrains.annotations.NotNull;
import xe.C10727i;
import xe.M;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"LVg0/a;", "Landroidx/fragment/app/k;", "LMg0/b;", "<init>", "()V", "push-sdk_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class a extends DialogInterfaceOnCancelListenerC5390k implements Mg0.b {

    /* renamed from: a, reason: collision with root package name */
    private boolean f32783a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final y0 f32784b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private final Object f32785c;

    /* renamed from: Vg0.a$a, reason: collision with other inner class name */
    static final class C0583a extends AbstractC7737t implements Function0<Mg0.b> {
        C0583a() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final Mg0.b invoke() {
            return a.this;
        }
    }

    @kotlin.coroutines.jvm.internal.e(c = "ru.ozon.push.dialog.internal.ui.ProtectedAppDialogFragment$openSettings$1", f = "ProtectedAppDialogFragment.kt", l = {}, m = "invokeSuspend")
    static final class b extends j implements Function2<M, kotlin.coroutines.d<? super Unit>, Object> {
        b(kotlin.coroutines.d<? super b> dVar) {
            super(2, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            return a.this.new b(dVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(M m11, kotlin.coroutines.d<? super Unit> dVar) {
            return ((b) create(m11, dVar)).invokeSuspend(Unit.f71690a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object a11;
            a aVar = a.this;
            Wc.a aVar2 = Wc.a.COROUTINE_SUSPENDED;
            s.b(obj);
            try {
                r.Companion companion = r.INSTANCE;
                aVar.requireActivity().startActivity(a.t(aVar).g0());
                a11 = Unit.f71690a;
            } catch (CancellationException e11) {
                throw e11;
            } catch (Throwable th2) {
                r.Companion companion2 = r.INSTANCE;
                a11 = s.a(th2);
            }
            if (r.b(a11) != null) {
                a.u(aVar);
            }
            return Unit.f71690a;
        }
    }

    public static final class c extends AbstractC7737t implements Function0<ComponentCallbacksC5392m> {
        public c() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final ComponentCallbacksC5392m invoke() {
            return a.this;
        }
    }

    public static final class d extends AbstractC7737t implements Function0<A0> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ c f32789b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(c cVar) {
            super(0);
            this.f32789b = cVar;
        }

        @Override // kotlin.jvm.functions.Function0
        public final A0 invoke() {
            A0 viewModelStore = a.this.getViewModelStore();
            Intrinsics.e(viewModelStore, "ownerProducer().viewModelStore");
            return viewModelStore;
        }
    }

    static final class e extends AbstractC7737t implements Function0<z0.b> {

        /* renamed from: b, reason: collision with root package name */
        public static final e f32790b = new e(0);

        @Override // kotlin.jvm.functions.Function0
        public final z0.b invoke() {
            C6411c c6411c = new C6411c();
            c6411c.a(N.b(Vg0.c.class), Vg0.d.a());
            return c6411c.b();
        }
    }

    public a() {
        y0 b11;
        b11 = b0.b(this, N.b(Vg0.c.class), new d(new c()), new Z(this), e.f32790b);
        this.f32784b = b11;
        this.f32785c = f.a(this, new C0583a());
    }

    public static final Vg0.c t(a aVar) {
        return (Vg0.c) aVar.f32784b.getValue();
    }

    public static final void u(a aVar) {
        for (Intent intent : ((Vg0.c) aVar.f32784b.getValue()).f0()) {
            try {
                r.Companion companion = r.INSTANCE;
                aVar.requireActivity().startActivity(intent);
                return;
            } catch (CancellationException e11) {
                throw e11;
            } catch (Throwable th2) {
                r.Companion companion2 = r.INSTANCE;
                s.a(th2);
            }
        }
    }

    @Override // Mg0.b
    public final void n() {
        Vg0.c cVar = (Vg0.c) this.f32784b.getValue();
        cVar.getClass();
        C10727i.c(x0.a(cVar), null, null, new Vg0.b(cVar, null), 3);
    }

    @Override // androidx.fragment.app.DialogInterfaceOnCancelListenerC5390k, androidx.fragment.app.ComponentCallbacksC5392m
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (bundle != null && Pg0.b.f22527m == null) {
            this.f32783a = true;
            setShowsDialog(false);
        } else if (bundle == null) {
            ((Vg0.c) this.f32784b.getValue()).h0();
        }
    }

    /* JADX WARN: Type inference failed for: r2v2, types: [Sc.j, java.lang.Object] */
    @Override // androidx.fragment.app.DialogInterfaceOnCancelListenerC5390k
    @NotNull
    public final Dialog onCreateDialog(Bundle bundle) {
        if (!this.f32783a) {
            return ((Wg0.e) this.f32785c.getValue()).create();
        }
        Dialog onCreateDialog = super.onCreateDialog(bundle);
        Intrinsics.f(onCreateDialog);
        return onCreateDialog;
    }

    @Override // androidx.fragment.app.DialogInterfaceOnCancelListenerC5390k, androidx.fragment.app.ComponentCallbacksC5392m
    public final void onStart() {
        super.onStart();
        if (this.f32783a) {
            dismissAllowingStateLoss();
            this.f32783a = false;
        }
    }

    @Override // Mg0.b
    public final void r() {
        Vg0.c cVar = (Vg0.c) this.f32784b.getValue();
        cVar.getClass();
        C10727i.c(x0.a(cVar), null, null, new Vg0.b(cVar, null), 3);
        C10727i.c(K.a(this), null, null, new b(null), 3);
    }
}
