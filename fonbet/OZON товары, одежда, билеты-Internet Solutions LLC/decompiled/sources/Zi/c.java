package Zi;

import C.C2697q;
import C.InterfaceC2694n;
import C.Y;
import C.r;
import Si.InterfaceC4010a;
import V.g;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import androidx.camera.core.impl.C5092f0;
import androidx.camera.view.PreviewView;
import androidx.lifecycle.AbstractC5434v;
import androidx.lifecycle.J;
import androidx.lifecycle.P;
import androidx.lifecycle.W;
import androidx.recyclerview.widget.RecyclerView;
import com.google.common.util.concurrent.m;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes10.dex */
public final class c extends RecyclerView.C {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final Ii.d f35980a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final J f35981b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private final Function2<InterfaceC4010a, Integer, Unit> f35982c;

    /* renamed from: d, reason: collision with root package name */
    @NotNull
    private final Function2<InterfaceC4010a, Integer, Boolean> f35983d;

    /* renamed from: e, reason: collision with root package name */
    private final Context f35984e;

    /* renamed from: f, reason: collision with root package name */
    @NotNull
    private final Y f35985f;

    /* renamed from: g, reason: collision with root package name */
    @NotNull
    private final C2697q f35986g;

    /* renamed from: h, reason: collision with root package name */
    private InterfaceC4010a.C0522a f35987h;

    /* renamed from: i, reason: collision with root package name */
    @NotNull
    private final Zi.a f35988i;

    /* renamed from: j, reason: collision with root package name */
    private boolean f35989j;

    /* renamed from: k, reason: collision with root package name */
    private V.b f35990k;

    static final class a extends AbstractC7737t implements Function1<View, Unit> {
        a() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(View view) {
            View it = view;
            Intrinsics.checkNotNullParameter(it, "it");
            c cVar = c.this;
            InterfaceC4010a.C0522a c0522a = cVar.f35987h;
            if (c0522a != null) {
                cVar.f35982c.invoke(c0522a, Integer.valueOf(cVar.getAdapterPosition()));
            }
            return Unit.f71690a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v7, types: [Zi.a] */
    public c(@NotNull Ii.d binding, @NotNull J lifecycleOwner, @NotNull Function2<? super InterfaceC4010a, ? super Integer, Unit> onClick, @NotNull Function2<? super InterfaceC4010a, ? super Integer, Boolean> onLongClick) {
        super(binding.a());
        Intrinsics.checkNotNullParameter(binding, "binding");
        Intrinsics.checkNotNullParameter(lifecycleOwner, "lifecycleOwner");
        Intrinsics.checkNotNullParameter(onClick, "onClick");
        Intrinsics.checkNotNullParameter(onLongClick, "onLongClick");
        this.f35980a = binding;
        this.f35981b = lifecycleOwner;
        this.f35982c = onClick;
        this.f35983d = onLongClick;
        this.f35984e = binding.a().getContext();
        Y c11 = new Y.a().c();
        Intrinsics.checkNotNullExpressionValue(c11, "build(...)");
        this.f35985f = c11;
        C2697q b11 = new C2697q.a().b();
        Intrinsics.checkNotNullExpressionValue(b11, "build(...)");
        this.f35986g = b11;
        this.f35988i = new W() { // from class: Zi.a
            @Override // androidx.lifecycle.W
            public final void onChanged(Object obj) {
                c.f(c.this, (r) obj);
            }
        };
        FrameLayout a11 = binding.a();
        Intrinsics.checkNotNullExpressionValue(a11, "getRoot(...)");
        Ni.b.a(a11, new a());
        binding.a().setOnLongClickListener(new View.OnLongClickListener() { // from class: Zi.b
            @Override // android.view.View.OnLongClickListener
            public final boolean onLongClick(View view) {
                return c.g(c.this);
            }
        });
        PreviewView.c cVar = PreviewView.c.COMPATIBLE;
        PreviewView previewView = binding.f12564e;
        previewView.e(cVar);
        previewView.f(PreviewView.d.FILL_CENTER);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static void e(m mVar, c cVar) {
        InterfaceC2694n b11;
        P<r> c11;
        InterfaceC2694n b12;
        P<r> c12;
        V.g gVar = (V.g) mVar.get();
        gVar.i(cVar.f35985f);
        boolean z11 = cVar.f35989j;
        Zi.a aVar = cVar.f35988i;
        Y y11 = cVar.f35985f;
        if (z11) {
            J j11 = cVar.f35981b;
            if (j11.getLifecycle().b() != AbstractC5434v.b.DESTROYED) {
                cVar.f35990k = gVar.f(j11, cVar.f35986g, y11);
                y11.X(cVar.f35980a.f12564e.c());
                V.b bVar = cVar.f35990k;
                if (bVar == null || (b12 = bVar.b()) == null || (c12 = ((C5092f0) b12).c()) == null) {
                    return;
                }
                c12.observe(j11, aVar);
                return;
            }
        }
        y11.X(null);
        V.b bVar2 = cVar.f35990k;
        if (bVar2 == null || (b11 = bVar2.b()) == null || (c11 = ((C5092f0) b11).c()) == null) {
            return;
        }
        c11.removeObserver(aVar);
    }

    public static void f(c cVar, r cameraState) {
        Intrinsics.checkNotNullParameter(cameraState, "cameraState");
        boolean z11 = cameraState.d() != r.b.OPEN;
        ImageView loadingPlaceholderIv = cVar.f35980a.f12563d;
        Intrinsics.checkNotNullExpressionValue(loadingPlaceholderIv, "loadingPlaceholderIv");
        loadingPlaceholderIv.setVisibility(z11 ? 0 : 8);
    }

    public static boolean g(c cVar) {
        InterfaceC4010a.C0522a c0522a = cVar.f35987h;
        if (c0522a == null) {
            return false;
        }
        return cVar.f35983d.invoke(c0522a, Integer.valueOf(cVar.getAdapterPosition())).booleanValue();
    }

    public final void j(@NotNull InterfaceC4010a.C0522a item) {
        Intrinsics.checkNotNullParameter(item, "item");
        this.f35987h = item;
        if (this.f35989j != item.e()) {
            this.f35989j = item.e();
            int i11 = V.g.f27884i;
            Context context = this.f35984e;
            Intrinsics.checkNotNullExpressionValue(context, "context");
            m a11 = g.a.a(context);
            ((I.d) a11).a(new JL.a(4, a11, this), androidx.core.content.a.getMainExecutor(context));
        }
        int i12 = item.f() ? 17 : 8388661;
        ImageView cameraIcon = this.f35980a.f12561b;
        Intrinsics.checkNotNullExpressionValue(cameraIcon, "cameraIcon");
        ViewGroup.LayoutParams layoutParams = cameraIcon.getLayoutParams();
        if (layoutParams == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.FrameLayout.LayoutParams");
        }
        FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) layoutParams;
        layoutParams2.gravity = i12;
        cameraIcon.setLayoutParams(layoutParams2);
    }

    @NotNull
    public final Ii.d k() {
        return this.f35980a;
    }
}
