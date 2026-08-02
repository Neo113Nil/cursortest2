package a00;

import B0.A0;
import Sc.InterfaceC4008j;
import Sc.k;
import androidx.fragment.app.ComponentCallbacksC5392m;
import androidx.lifecycle.AbstractC5434v;
import androidx.lifecycle.DefaultLifecycleObserver;
import androidx.lifecycle.J;
import androidx.lifecycle.L;
import androidx.lifecycle.W;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* renamed from: a00.c, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C4908c implements J {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final InterfaceC4008j f36120a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private L f36121b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private final C4907b f36122c;

    /* renamed from: a00.c$a */
    public static final class a implements DefaultLifecycleObserver {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ AbstractC5434v f36123a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ J f36124b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ C4908c f36125c;

        public a(AbstractC5434v abstractC5434v, J j11, C4908c c4908c) {
            this.f36123a = abstractC5434v;
            this.f36124b = j11;
            this.f36125c = c4908c;
        }

        @Override // androidx.lifecycle.DefaultLifecycleObserver
        public final void onDestroy(J owner) {
            Intrinsics.checkNotNullParameter(owner, "owner");
            ((ComponentCallbacksC5392m) this.f36124b).getViewLifecycleOwnerLiveData().removeObserver(this.f36125c.f36122c);
            this.f36123a.e(this);
        }
    }

    /* renamed from: a00.c$b */
    static final class b extends AbstractC7737t implements Function0<String> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ J f36126b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(J j11) {
            super(0);
            this.f36126b = j11;
        }

        @Override // kotlin.jvm.functions.Function0
        public final String invoke() {
            J j11 = this.f36126b;
            return j11 instanceof ComponentCallbacksC5392m ? ((ComponentCallbacksC5392m) j11).getTag() : j11.getClass().getSimpleName();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v4, types: [a00.b, androidx.lifecycle.W] */
    public C4908c(@NotNull J lifecycleOwner) {
        Intrinsics.checkNotNullParameter(lifecycleOwner, "lifecycleOwner");
        this.f36120a = k.b(new b(lifecycleOwner));
        this.f36121b = new L(this);
        ?? r02 = new W() { // from class: a00.b
            @Override // androidx.lifecycle.W
            public final void onChanged(Object obj) {
                C4908c.a(C4908c.this, (J) obj);
            }
        };
        this.f36122c = r02;
        if (!(lifecycleOwner instanceof ComponentCallbacksC5392m)) {
            lifecycleOwner.getLifecycle().a(new C4909d(this));
            return;
        }
        ComponentCallbacksC5392m componentCallbacksC5392m = (ComponentCallbacksC5392m) lifecycleOwner;
        componentCallbacksC5392m.getViewLifecycleOwnerLiveData().observeForever(r02);
        AbstractC5434v lifecycle = lifecycleOwner.getLifecycle();
        if (lifecycle.b() == AbstractC5434v.b.DESTROYED) {
            componentCallbacksC5392m.getViewLifecycleOwnerLiveData().removeObserver(r02);
        } else {
            lifecycle.a(new a(lifecycle, lifecycleOwner, this));
        }
    }

    public static void a(C4908c c4908c, J j11) {
        AbstractC5434v lifecycle;
        ru.ozon.android.ozonLogger.core.c cVar = ru.ozon.android.ozonLogger.core.c.DEBUG;
        if (H00.b.c()) {
            H00.b.b().e(cVar, Pk0.g.c(Thread.currentThread(), ": ", "onViewLifecycleOwner: [page=" + ((String) c4908c.f36120a.getValue()) + ", currentState=" + c4908c.f36121b.b() + ", viewOwnerState=" + ((j11 == null || (lifecycle = j11.getLifecycle()) == null) ? null : lifecycle.b()) + "]"), "ComposerViewOwner", null, Boolean.TRUE);
        }
        if (j11 != null) {
            if (c4908c.f36121b.b() == AbstractC5434v.b.DESTROYED) {
                if (H00.b.c()) {
                    H00.b.b().e(cVar, Pk0.g.c(Thread.currentThread(), ": ", A0.b("onReCreateViewOwner: [page=", (String) c4908c.f36120a.getValue(), ", currentState=DESTROYED]")), "ComposerViewOwner", null, Boolean.TRUE);
                }
                c4908c.f36121b = new L(c4908c);
            }
            j11.getLifecycle().a(new C4909d(c4908c));
        }
    }

    public static final String d(C4908c c4908c) {
        return (String) c4908c.f36120a.getValue();
    }

    public final void e() {
        if (this.f36121b.b() == AbstractC5434v.b.DESTROYED) {
            ru.ozon.android.ozonLogger.core.c cVar = ru.ozon.android.ozonLogger.core.c.DEBUG;
            if (H00.b.c()) {
                H00.b.b().e(cVar, Pk0.g.c(Thread.currentThread(), ": ", A0.b("resetLifecycle: [page=", (String) this.f36120a.getValue(), ", currentState=DESTROYED]")), "ComposerViewOwner", null, Boolean.TRUE);
            }
            this.f36121b = new L(this);
        }
    }

    @Override // androidx.lifecycle.J
    @NotNull
    public final AbstractC5434v getLifecycle() {
        return this.f36121b;
    }
}
