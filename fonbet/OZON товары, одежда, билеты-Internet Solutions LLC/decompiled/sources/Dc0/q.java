package Dc0;

import Ae.C0;
import Ae.InterfaceC2395h;
import Ae.InterfaceC2397i;
import Ae.w0;
import C.C2697q;
import C.I;
import C.InterfaceC2689i;
import C.InterfaceC2694n;
import C.Y;
import Fc0.c;
import Sc.C4005g;
import Sc.InterfaceC4008j;
import W.C4845p;
import W.C4851w;
import W.K;
import W.W;
import W.f0;
import W.r;
import W.t0;
import android.annotation.SuppressLint;
import android.app.Dialog;
import android.content.Context;
import android.graphics.Color;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.util.Size;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowInsetsController;
import android.widget.FrameLayout;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.window.OnBackInvokedCallback;
import android.window.OnBackInvokedDispatcher;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.camera.core.impl.L0;
import androidx.camera.core.impl.M0;
import androidx.camera.view.PreviewView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.view.C5334o0;
import androidx.fragment.app.DialogInterfaceOnCancelListenerC5390k;
import androidx.fragment.app.b0;
import androidx.lifecycle.J;
import androidx.lifecycle.y0;
import androidx.lifecycle.z0;
import g.AbstractC6592d;
import g.InterfaceC6590b;
import h.C6763i;
import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.N;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.R;
import ru.ozon.id.nativeauth.fintech.presentation.camera.views.DocFrameView;
import ru.ozon.id.nativeauth.fintech.presentation.camera.views.SelfieDocFrameView;
import ru.ozon.uni.android.controls.buttonV3.ButtonV3View;
import ru.ozon.uni.android.uikit.extensions.view.ViewExtKt;
import ru.ozon.uni.android.uikitsdk.ext.TextViewExtKt;
import ru.ozon.uni.android.uikitsdk.ext.UiExtKt;
import ru.ozon.uni.atoms.v3.holders.controls.buttonV3.ButtonV3HolderKt;
import ru.ozon.uni.core.UniTextStyles;
import x2.InterfaceC10646a;
import xe.C10727i;
import xe.M;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LDc0/q;", "Landroidx/fragment/app/k;", "<init>", "()V", "ozon-id-sdk_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class q extends DialogInterfaceOnCancelListenerC5390k {

    /* renamed from: a, reason: collision with root package name */
    private Jb0.g f6496a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final y0 f6497b;

    /* renamed from: c, reason: collision with root package name */
    private final int f6498c;

    /* renamed from: d, reason: collision with root package name */
    private Integer f6499d;

    /* renamed from: e, reason: collision with root package name */
    private boolean f6500e;

    /* renamed from: f, reason: collision with root package name */
    private V.b f6501f;

    /* renamed from: g, reason: collision with root package name */
    private I f6502g;

    /* renamed from: h, reason: collision with root package name */
    private f0<K> f6503h;

    /* renamed from: i, reason: collision with root package name */
    private W f6504i;

    /* renamed from: j, reason: collision with root package name */
    private boolean f6505j;

    /* renamed from: k, reason: collision with root package name */
    private boolean f6506k;

    /* renamed from: l, reason: collision with root package name */
    @NotNull
    private final Object f6507l;

    /* renamed from: m, reason: collision with root package name */
    private o f6508m;

    /* renamed from: n, reason: collision with root package name */
    private C2852a f6509n;

    /* renamed from: o, reason: collision with root package name */
    @NotNull
    private final AbstractC6592d<String> f6510o;

    static final class a extends AbstractC7737t implements Function0<Unit> {
        a() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final Unit invoke() {
            q.this.M().createCombinedLastChunks();
            return Unit.f71690a;
        }
    }

    public static final class b extends Dialog {
        b(Context context, int i11) {
            super(context, i11);
        }

        @Override // android.app.Dialog, android.view.KeyEvent.Callback
        public final boolean onKeyDown(int i11, KeyEvent event) {
            Intrinsics.checkNotNullParameter(event, "event");
            q qVar = q.this;
            if (i11 == 4) {
                qVar.M().onBackPressed();
                return true;
            }
            if (i11 != 24 && i11 != 25) {
                return false;
            }
            qVar.O();
            return true;
        }
    }

    @kotlin.coroutines.jvm.internal.e(c = "ru.ozon.id.nativeauth.fintech.presentation.camera.FintechRecoveryCameraFragment$onViewCreated$4", f = "FintechRecoveryCameraFragment.kt", l = {231}, m = "invokeSuspend")
    static final class c extends kotlin.coroutines.jvm.internal.j implements Function2<M, kotlin.coroutines.d<? super Unit>, Object> {

        /* renamed from: d, reason: collision with root package name */
        int f6513d;

        static final class a<T> implements InterfaceC2397i {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ q f6515a;

            a(q qVar) {
                this.f6515a = qVar;
            }

            @Override // Ae.InterfaceC2397i
            public final Object emit(Object obj, kotlin.coroutines.d<? super Unit> dVar) {
                if (obj != null) {
                    this.f6515a.f6510o.a("android.permission.CAMERA");
                }
                return Unit.f71690a;
            }
        }

        c(kotlin.coroutines.d<? super c> dVar) {
            super(2, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            return q.this.new c(dVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(M m11, kotlin.coroutines.d<? super Unit> dVar) {
            return ((c) create(m11, dVar)).invokeSuspend(Unit.f71690a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
            int i11 = this.f6513d;
            if (i11 == 0) {
                Sc.s.b(obj);
                q qVar = q.this;
                InterfaceC2395h<Object> x02 = qVar.M().x0();
                a aVar2 = new a(qVar);
                this.f6513d = 1;
                if (x02.collect(aVar2, this) == aVar) {
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

    @kotlin.coroutines.jvm.internal.e(c = "ru.ozon.id.nativeauth.fintech.presentation.camera.FintechRecoveryCameraFragment$onViewCreated$5", f = "FintechRecoveryCameraFragment.kt", l = {237}, m = "invokeSuspend")
    static final class d extends kotlin.coroutines.jvm.internal.j implements Function2<M, kotlin.coroutines.d<? super Unit>, Object> {

        /* renamed from: d, reason: collision with root package name */
        int f6516d;

        static final class a<T> implements InterfaceC2397i {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ q f6518a;

            a(q qVar) {
                this.f6518a = qVar;
            }

            @Override // Ae.InterfaceC2397i
            public final Object emit(Object obj, kotlin.coroutines.d dVar) {
                ((Boolean) obj).getClass();
                this.f6518a.createVideoChunk();
                return Unit.f71690a;
            }
        }

        d(kotlin.coroutines.d<? super d> dVar) {
            super(2, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            return q.this.new d(dVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(M m11, kotlin.coroutines.d<? super Unit> dVar) {
            return ((d) create(m11, dVar)).invokeSuspend(Unit.f71690a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
            int i11 = this.f6516d;
            if (i11 == 0) {
                Sc.s.b(obj);
                q qVar = q.this;
                w0<Boolean> startVideoFlow = qVar.M().getStartVideoFlow();
                a aVar2 = new a(qVar);
                this.f6516d = 1;
                if (((C0) startVideoFlow).collect(aVar2, this) == aVar) {
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

    static final class e extends AbstractC7737t implements Function0<W.A> {
        e() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final W.A invoke() {
            q qVar = q.this;
            return W.A.a(qVar.M().u0().d(), C4845p.a(qVar.M().u0().d()));
        }
    }

    public static final class f extends AbstractC7737t implements Function0<z0.b> {
        public f() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final z0.b invoke() {
            return new B(q.this);
        }
    }

    public static final class g implements I.f {
        g() {
        }

        @Override // C.I.f
        public final void onError(C.K exception) {
            Intrinsics.checkNotNullParameter(exception, "exception");
        }

        @Override // C.I.f
        public final void onImageSaved(I.h outputFileResults) {
            Intrinsics.checkNotNullParameter(outputFileResults, "outputFileResults");
            q qVar = q.this;
            q.L(qVar);
            qVar.M().G0(outputFileResults.a());
        }
    }

    public q() {
        super(R.layout.fragment_fintech_recovery_camera);
        f fVar = new f();
        InterfaceC4008j a11 = Sc.k.a(Sc.n.NONE, new Bc0.l(new Bc0.k(this)));
        this.f6497b = b0.b(this, N.b(C.class), new Bc0.m(a11), new Bc0.n(a11), fVar);
        this.f6498c = Color.parseColor("#01FFFFFF");
        this.f6500e = true;
        this.f6507l = Sc.k.a(Sc.n.PUBLICATION, new e());
        AbstractC6592d<String> registerForActivityResult = registerForActivityResult(new C6763i(), new InterfaceC6590b() { // from class: Dc0.k
            @Override // g.InterfaceC6590b
            public final void onActivityResult(Object obj) {
                q.x(q.this, (Boolean) obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(registerForActivityResult, "registerForActivityResult(...)");
        this.f6510o = registerForActivityResult;
    }

    public static void A(q qVar) {
        qVar.M().I0();
    }

    public static void B(q qVar) {
        qVar.M().onBackPressed();
    }

    public static void C(q qVar) {
        InterfaceC2694n b11;
        InterfaceC2689i a11;
        V.b bVar = qVar.f6501f;
        if (bVar == null || (b11 = bVar.b()) == null || !((M0) b11).k()) {
            return;
        }
        boolean z11 = !qVar.M().B0();
        V.b bVar2 = qVar.f6501f;
        if (bVar2 != null && (a11 = bVar2.a()) != null) {
            ((L0) a11).e(z11);
        }
        qVar.M().H0(z11);
    }

    public static void D(AppCompatTextView appCompatTextView, q qVar, Jb0.g gVar) {
        float height;
        ViewGroup.LayoutParams layoutParams;
        C2852a c2852a = qVar.f6509n;
        if ((c2852a != null ? c2852a.k() : null) == Fc0.e.LANDSCAPE) {
            androidx.fragment.app.r requireActivity = qVar.requireActivity();
            Intrinsics.checkNotNullExpressionValue(requireActivity, "requireActivity(...)");
            if (N(requireActivity)) {
                try {
                    layoutParams = appCompatTextView.getLayoutParams();
                } catch (Exception unused) {
                }
                if (layoutParams == null) {
                    throw new NullPointerException("null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
                }
                ConstraintLayout.b bVar = (ConstraintLayout.b) layoutParams;
                bVar.setMarginStart(UiExtKt.toPx(64));
                bVar.setMarginEnd(UiExtKt.toPx(64));
                appCompatTextView.setLayoutParams(bVar);
                height = gVar.f14423h.getTop();
                appCompatTextView.setTranslationY(height);
                appCompatTextView.setAlpha(1.0f);
            }
        }
        height = ((gVar.f14419d.getF97261n().top / 2) - (appCompatTextView.getHeight() / 2)) + gVar.f14421f.getPaddingTop();
        appCompatTextView.setTranslationY(height);
        appCompatTextView.setAlpha(1.0f);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v6, types: [Sc.j, java.lang.Object] */
    public static void E(com.google.common.util.concurrent.m mVar, Fc0.b bVar, q qVar) {
        V.g gVar = (V.g) mVar.get();
        if (!bVar.b()) {
            if (gVar != null) {
                gVar.j();
                return;
            }
            return;
        }
        ArrayList arrayList = new ArrayList();
        Y.a aVar = new Y.a();
        aVar.i(0);
        Y c11 = aVar.c();
        Jb0.g gVar2 = qVar.f6496a;
        V.b bVar2 = null;
        c11.X(gVar2 != null ? gVar2.f14427l.c() : null);
        arrayList.add(c11);
        I.b bVar3 = new I.b();
        bVar3.f();
        bVar3.i(new Size(1440, 2560));
        bVar3.m();
        I c12 = bVar3.c();
        arrayList.add(c12);
        qVar.f6502g = c12;
        if (qVar.M().u0().c()) {
            if (qVar.f6503h == null) {
                K.h hVar = new K.h();
                hVar.b(androidx.core.content.a.getMainExecutor(qVar.requireContext()));
                hVar.c((W.A) qVar.f6507l.getValue());
                K a11 = hVar.a();
                Intrinsics.checkNotNullExpressionValue(a11, "build(...)");
                qVar.f6503h = f0.o0(a11);
            }
            f0<K> f0Var = qVar.f6503h;
            if (f0Var != null) {
                arrayList.add(f0Var);
            }
        }
        C2697q c2697q = bVar.a() ? C2697q.f4215c : C2697q.f4214b;
        Intrinsics.f(c2697q);
        if (gVar != null) {
            try {
                gVar.j();
            } catch (Exception unused) {
                return;
            }
        }
        if (gVar != null) {
            androidx.camera.core.w[] wVarArr = (androidx.camera.core.w[]) arrayList.toArray(new androidx.camera.core.w[0]);
            bVar2 = gVar.f(qVar, c2697q, (androidx.camera.core.w[]) Arrays.copyOf(wVarArr, wVarArr.length));
        }
        qVar.f6501f = bVar2;
        if (qVar.f6504i == null && qVar.M().u0().c()) {
            qVar.createVideoChunk();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:55:0x0152  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x015e  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x01a8  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x01b7  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x01c6  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x01da  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0200  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x01b9  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x01aa  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x0154  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void F(final q qVar, final Jb0.g gVar, final Fc0.c cVar) {
        int i11;
        c.d e11;
        c.a g10;
        c.a c11;
        Context context;
        if (cVar == null) {
            return;
        }
        FrameLayout progress = gVar.f14428m;
        Intrinsics.checkNotNullExpressionValue(progress, "progress");
        progress.setVisibility(cVar.k() ? 0 : 8);
        ImageView photo = gVar.f14426k;
        Intrinsics.checkNotNullExpressionValue(photo, "photo");
        photo.setVisibility(cVar.d() != null ? 0 : 8);
        photo.setImageURI(cVar.d());
        ImageButton ivShutter = gVar.f14425j;
        Intrinsics.checkNotNullExpressionValue(ivShutter, "ivShutter");
        ivShutter.setVisibility(cVar.f() ? 0 : 8);
        ImageView ivChangeCamera = gVar.f14422g;
        Intrinsics.checkNotNullExpressionValue(ivChangeCamera, "ivChangeCamera");
        ivChangeCamera.setVisibility(cVar.h() ? 0 : 8);
        ImageView ivFlash = gVar.f14424i;
        Intrinsics.checkNotNullExpressionValue(ivFlash, "ivFlash");
        ivFlash.setVisibility(cVar.i() ? 0 : 8);
        ivFlash.setImageResource(cVar.j() ? R.drawable.ic_m_lantern_off_filled : R.drawable.ic_m_lantern_on_filled);
        ButtonV3View submitButton = gVar.f14432q;
        Intrinsics.checkNotNullExpressionValue(submitButton, "submitButton");
        submitButton.setVisibility(cVar.g() != null ? 0 : 8);
        ButtonV3View retakeButton = gVar.f14429n;
        Intrinsics.checkNotNullExpressionValue(retakeButton, "retakeButton");
        retakeButton.setVisibility(cVar.c() != null ? 0 : 8);
        DocFrameView docFrame = gVar.f14419d;
        Intrinsics.checkNotNullExpressionValue(docFrame, "docFrame");
        c.EnumC0196c b11 = cVar.b();
        c.EnumC0196c enumC0196c = c.EnumC0196c.PASS_CHECK;
        docFrame.setVisibility((b11 == enumC0196c || cVar.b() == c.EnumC0196c.PASS) ? 0 : 8);
        docFrame.q(cVar.b() == enumC0196c);
        docFrame.invalidate();
        SelfieDocFrameView selfieDocFrame = gVar.f14431p;
        Intrinsics.checkNotNullExpressionValue(selfieDocFrame, "selfieDocFrame");
        Intrinsics.checkNotNullExpressionValue(docFrame, "docFrame");
        selfieDocFrame.setVisibility(!ViewExtKt.isVisible(docFrame) ? 0 : 8);
        final AppCompatTextView appCompatTextView = gVar.f14418c;
        if (cVar.a() != null) {
            Intrinsics.checkNotNullExpressionValue(docFrame, "docFrame");
            if (ViewExtKt.isVisible(docFrame)) {
                i11 = 0;
                appCompatTextView.setVisibility(i11);
                appCompatTextView.setText((cVar.a() != null || (context = appCompatTextView.getContext()) == null) ? null : context.getString(cVar.a().intValue()));
                appCompatTextView.setPadding(UiExtKt.toPx(24.0f), UiExtKt.toPx(8.0f), UiExtKt.toPx(24.0f), UiExtKt.toPx(8.0f));
                appCompatTextView.setAlpha(0.0f);
                appCompatTextView.post(new Runnable() { // from class: Dc0.g
                    @Override // java.lang.Runnable
                    public final void run() {
                        q.D(AppCompatTextView.this, qVar, gVar);
                    }
                });
                final AppCompatTextView appCompatTextView2 = gVar.f14430o;
                Intrinsics.checkNotNullExpressionValue(selfieDocFrame, "selfieDocFrame");
                appCompatTextView2.setVisibility(!ViewExtKt.isVisible(selfieDocFrame) ? 0 : 8);
                e11 = cVar.e();
                if (e11 != null) {
                    final int a11 = e11.a();
                    if (qVar.f6500e) {
                        appCompatTextView2.animate().alpha(0.0f).setDuration(300L).withEndAction(new Runnable() { // from class: Dc0.h
                            @Override // java.lang.Runnable
                            public final void run() {
                                q.w(AppCompatTextView.this, a11, cVar, qVar);
                            }
                        }).start();
                    }
                }
                appCompatTextView2.setPadding(UiExtKt.toPx(12), UiExtKt.toPx(4), UiExtKt.toPx(12), UiExtKt.toPx(4));
                appCompatTextView2.post(new i(0, appCompatTextView2, gVar));
                Intrinsics.checkNotNullExpressionValue(submitButton, "submitButton");
                submitButton.setVisibility(cVar.g() == null ? 0 : 8);
                Intrinsics.checkNotNullExpressionValue(retakeButton, "retakeButton");
                retakeButton.setVisibility(cVar.c() == null ? 0 : 8);
                g10 = cVar.g();
                if (g10 != null) {
                    Context requireContext = qVar.requireContext();
                    Intrinsics.checkNotNullExpressionValue(requireContext, "requireContext(...)");
                    ButtonV3HolderKt.bind$default(submitButton, g10.b(requireContext), null, 2, null);
                }
                c11 = cVar.c();
                if (c11 != null) {
                    Context requireContext2 = qVar.requireContext();
                    Intrinsics.checkNotNullExpressionValue(requireContext2, "requireContext(...)");
                    ButtonV3HolderKt.bind$default(retakeButton, c11.b(requireContext2), null, 2, null);
                }
                retakeButton.setOnClickListener(new AI.b(qVar, 1));
                submitButton.setOnClickListener(new j(qVar, 0));
                if (cVar.d() != null) {
                    Intrinsics.checkNotNullExpressionValue(selfieDocFrame, "selfieDocFrame");
                    if (ViewExtKt.isVisible(selfieDocFrame)) {
                        selfieDocFrame.setScaleX(-1.0f);
                        return;
                    }
                }
                selfieDocFrame.setScaleX(1.0f);
            }
        }
        i11 = 8;
        appCompatTextView.setVisibility(i11);
        appCompatTextView.setText((cVar.a() != null || (context = appCompatTextView.getContext()) == null) ? null : context.getString(cVar.a().intValue()));
        appCompatTextView.setPadding(UiExtKt.toPx(24.0f), UiExtKt.toPx(8.0f), UiExtKt.toPx(24.0f), UiExtKt.toPx(8.0f));
        appCompatTextView.setAlpha(0.0f);
        appCompatTextView.post(new Runnable() { // from class: Dc0.g
            @Override // java.lang.Runnable
            public final void run() {
                q.D(AppCompatTextView.this, qVar, gVar);
            }
        });
        final AppCompatTextView appCompatTextView22 = gVar.f14430o;
        Intrinsics.checkNotNullExpressionValue(selfieDocFrame, "selfieDocFrame");
        appCompatTextView22.setVisibility(!ViewExtKt.isVisible(selfieDocFrame) ? 0 : 8);
        e11 = cVar.e();
        if (e11 != null) {
        }
        appCompatTextView22.setPadding(UiExtKt.toPx(12), UiExtKt.toPx(4), UiExtKt.toPx(12), UiExtKt.toPx(4));
        appCompatTextView22.post(new i(0, appCompatTextView22, gVar));
        Intrinsics.checkNotNullExpressionValue(submitButton, "submitButton");
        submitButton.setVisibility(cVar.g() == null ? 0 : 8);
        Intrinsics.checkNotNullExpressionValue(retakeButton, "retakeButton");
        retakeButton.setVisibility(cVar.c() == null ? 0 : 8);
        g10 = cVar.g();
        if (g10 != null) {
        }
        c11 = cVar.c();
        if (c11 != null) {
        }
        retakeButton.setOnClickListener(new AI.b(qVar, 1));
        submitButton.setOnClickListener(new j(qVar, 0));
        if (cVar.d() != null) {
        }
        selfieDocFrame.setScaleX(1.0f);
    }

    public static final void J(q qVar, Fc0.e eVar) {
        Jb0.g gVar = qVar.f6496a;
        if (gVar != null) {
            gVar.f14419d.m(eVar);
        }
        Jb0.g gVar2 = qVar.f6496a;
        if (gVar2 != null) {
            gVar2.f14431p.m(eVar);
        }
    }

    public static final void L(q qVar) {
        qVar.f6505j = false;
        qVar.f6506k = true;
        W w11 = qVar.f6504i;
        if (w11 != null) {
            w11.close();
        }
        W w12 = qVar.f6504i;
        if (w12 != null) {
            w12.close();
        }
        qVar.f6504i = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final C M() {
        return (C) this.f6497b.getValue();
    }

    private static boolean N(Context context) {
        return context.getResources().getConfiguration().smallestScreenWidthDp >= 600;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void O() {
        I i11 = this.f6502g;
        if (i11 == null) {
            return;
        }
        I.d dVar = new I.d();
        I.g.a aVar = new I.g.a(new File(requireContext().getFilesDir(), "recovery_photo.jpg"));
        aVar.b(dVar);
        I.g a11 = aVar.a();
        Intrinsics.checkNotNullExpressionValue(a11, "build(...)");
        i11.e0(a11, androidx.core.content.a.getMainExecutor(requireContext()), new g());
    }

    /* JADX INFO: Access modifiers changed from: private */
    @SuppressLint({"MissingPermission"})
    public final void createVideoChunk() {
        W w11;
        W.r a11 = new r.a(M().createChunkFile()).a();
        Intrinsics.checkNotNullExpressionValue(a11, "build(...)");
        f0<K> f0Var = this.f6503h;
        if (f0Var != null) {
            C4851w C11 = f0Var.i0().C(requireContext(), a11);
            C11.a();
            w11 = C11.i(androidx.core.content.a.getMainExecutor(requireContext()), new InterfaceC10646a() { // from class: Dc0.l
                @Override // x2.InterfaceC10646a
                public final void accept(Object obj) {
                    q.y(q.this, (t0) obj);
                }
            });
        } else {
            w11 = null;
        }
        this.f6504i = w11;
    }

    public static void t(q qVar) {
        qVar.M().onBackPressed();
    }

    public static void u(q qVar) {
        qVar.O();
    }

    public static void v(q qVar) {
        qVar.M().E0();
    }

    public static void w(AppCompatTextView appCompatTextView, int i11, Fc0.c cVar, q qVar) {
        appCompatTextView.setText(appCompatTextView.getContext().getString(i11));
        appCompatTextView.animate().alpha(1.0f).setDuration(300L).start();
        c.d e11 = cVar.e();
        e11.getClass();
        if (c.d.a.f9353a[e11.ordinal()] == 3) {
            qVar.f6500e = false;
        }
    }

    public static void x(q qVar, Boolean bool) {
        qVar.M().F0(bool.booleanValue() ? new Fc0.a(true, false, false) : androidx.core.app.b.h(qVar.requireActivity(), "android.permission.CAMERA") ? new Fc0.a(false, true, false) : new Fc0.a(false, false, true));
    }

    public static void y(q qVar, t0 t0Var) {
        if (t0Var instanceof t0.a) {
            if (qVar.f6505j) {
                qVar.createVideoChunk();
            }
            if (qVar.f6506k) {
                a closure = qVar.new a();
                Intrinsics.checkNotNullParameter(closure, "closure");
                new Handler(Looper.getMainLooper()).post(new Ec0.b(closure, 0));
                return;
            }
            return;
        }
        if ((t0Var instanceof t0.d) || (t0Var instanceof t0.c)) {
            return;
        }
        if (!(t0Var instanceof t0.e)) {
            boolean z11 = t0Var instanceof t0.b;
            return;
        }
        long c11 = ((t0.e) t0Var).b().c() / 1000000;
        qVar.M().getClass();
        if (c11 > qVar.M().u0().b()) {
            qVar.f6505j = true;
            qVar.f6506k = false;
            W w11 = qVar.f6504i;
            if (w11 != null) {
                w11.close();
            }
            W w12 = qVar.f6504i;
            if (w12 != null) {
                w12.close();
            }
            qVar.f6504i = null;
        }
    }

    public static void z(q qVar) {
        qVar.M().setBackCamera(!qVar.M().r0());
        if (qVar.M().r0()) {
            return;
        }
        qVar.M().H0(false);
    }

    @Override // androidx.fragment.app.DialogInterfaceOnCancelListenerC5390k, androidx.fragment.app.ComponentCallbacksC5392m
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setStyle(2, R.style.OzonIdTheme_FullScreenDialog);
        Bundle arguments = getArguments();
        M().C0(arguments != null ? arguments.getString("link") : null);
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [Dc0.o] */
    @Override // androidx.fragment.app.DialogInterfaceOnCancelListenerC5390k
    @NotNull
    public final Dialog onCreateDialog(Bundle bundle) {
        OnBackInvokedDispatcher onBackInvokedDispatcher;
        b bVar = new b(requireContext(), getTheme());
        int i11 = Build.VERSION.SDK_INT;
        if (i11 > 35) {
            ?? r02 = new OnBackInvokedCallback() { // from class: Dc0.o
                public final void onBackInvoked() {
                    q.t(q.this);
                }
            };
            onBackInvokedDispatcher = bVar.getOnBackInvokedDispatcher();
            onBackInvokedDispatcher.registerOnBackInvokedCallback(0, r02);
            this.f6508m = r02;
        }
        Window window = bVar.getWindow();
        if (window != null) {
            window.setDimAmount(0.6f);
            if (i11 >= 31) {
                C5334o0.a(window, false);
                int i12 = this.f6498c;
                window.setStatusBarColor(i12);
                window.setNavigationBarColor(i12);
            }
        }
        return bVar;
    }

    @Override // androidx.fragment.app.ComponentCallbacksC5392m
    public final View onCreateView(@NotNull LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) {
        Intrinsics.checkNotNullParameter(inflater, "inflater");
        Jb0.g b11 = Jb0.g.b(inflater, viewGroup);
        b11.f14427l.e(PreviewView.c.COMPATIBLE);
        b11.f14425j.setOnClickListener(new m(this, 0));
        b11.f14423h.setOnClickListener(new n(this, 0));
        b11.f14424i.setOnClickListener(new CG.a(this, 1));
        b11.f14422g.setOnClickListener(new CG.b(this, 2));
        J viewLifecycleOwner = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner, "getViewLifecycleOwner(...)");
        C10727i.c(androidx.lifecycle.K.a(viewLifecycleOwner), null, null, new r(viewLifecycleOwner, null, this, b11), 3);
        this.f6496a = b11;
        return b11.a();
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x003a, code lost:
    
        r1 = r1.getOnBackInvokedDispatcher();
     */
    @Override // androidx.fragment.app.DialogInterfaceOnCancelListenerC5390k, androidx.fragment.app.ComponentCallbacksC5392m
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void onDestroyView() {
        OnBackInvokedDispatcher onBackInvokedDispatcher;
        super.onDestroyView();
        C2852a c2852a = this.f6509n;
        if (c2852a != null) {
            c2852a.l();
        }
        Context requireContext = requireContext();
        Intrinsics.checkNotNullExpressionValue(requireContext, "requireContext(...)");
        if (!N(requireContext)) {
            androidx.fragment.app.r requireActivity = requireActivity();
            Integer num = this.f6499d;
            requireActivity.setRequestedOrientation(num != null ? num.intValue() : -1);
        }
        if (Build.VERSION.SDK_INT > 35) {
            o oVar = this.f6508m;
            if (oVar != null && (r1 = getDialog()) != null && onBackInvokedDispatcher != null) {
                onBackInvokedDispatcher.unregisterOnBackInvokedCallback(oVar);
            }
            this.f6508m = null;
        }
        this.f6510o.b();
    }

    @Override // androidx.fragment.app.ComponentCallbacksC5392m
    public final void onPause() {
        super.onPause();
        C2852a c2852a = this.f6509n;
        if (c2852a != null) {
            c2852a.m();
        }
        M().onPause();
    }

    @Override // androidx.fragment.app.ComponentCallbacksC5392m
    public final void onResume() {
        super.onResume();
        M().onResume();
        C2852a c2852a = this.f6509n;
        if (c2852a != null) {
            c2852a.n();
        }
    }

    @Override // androidx.fragment.app.DialogInterfaceOnCancelListenerC5390k, androidx.fragment.app.ComponentCallbacksC5392m
    public final void onStart() {
        androidx.fragment.app.r activity;
        super.onStart();
        Context context = getContext();
        if (context == null || (activity = getActivity()) == null) {
            return;
        }
        if (androidx.core.content.a.checkSelfPermission(context, "android.permission.CAMERA") == 0) {
            M().F0(new Fc0.a(true, false, false));
        } else if (androidx.core.app.b.h(activity, "android.permission.CAMERA")) {
            M().F0(new Fc0.a(false, true, false));
        } else {
            this.f6510o.a("android.permission.CAMERA");
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x006f, code lost:
    
        r8 = r8.getInsetsController();
     */
    @Override // androidx.fragment.app.ComponentCallbacksC5392m
    @SuppressLint({"SourceLockedOrientationActivity"})
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void onViewCreated(@NotNull View view, Bundle bundle) {
        Jb0.g gVar;
        Dialog dialog;
        WindowInsetsController insetsController;
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, bundle);
        androidx.fragment.app.r requireActivity = requireActivity();
        Intrinsics.checkNotNullExpressionValue(requireActivity, "requireActivity(...)");
        if (!N(requireActivity)) {
            this.f6499d = Integer.valueOf(requireActivity.getResources().getConfiguration().orientation);
            requireActivity.setRequestedOrientation(1);
        }
        Context requireContext = requireContext();
        Intrinsics.checkNotNullExpressionValue(requireContext, "requireContext(...)");
        C2852a c2852a = new C2852a(N(requireContext), new z(this), new A(this), new y(1, M(), C.class, "onOrientationChanged", "onOrientationChanged(Lru/ozon/id/nativeauth/fintech/presentation/camera/models/DocFrameOrientation;)V", 0));
        this.f6509n = c2852a;
        c2852a.o();
        if (Build.VERSION.SDK_INT >= 31 && (dialog = getDialog()) != null && (r8 = dialog.getWindow()) != null && insetsController != null) {
            insetsController.setSystemBarsAppearance(0, 8);
            insetsController.setSystemBarsAppearance(0, 16);
        }
        Jb0.g gVar2 = this.f6496a;
        if (gVar2 != null) {
            androidx.core.widget.k.b(gVar2.f14418c, 14, 20, 2);
        }
        Context context = getContext();
        if (context != null && (gVar = this.f6496a) != null) {
            TextViewExtKt.applyStyle(gVar.f14417b, context, UniTextStyles.BODY_500_LARGE.getResId());
        }
        C10727i.c(androidx.lifecycle.K.a(this), null, null, new c(null), 3);
        C10727i.c(androidx.lifecycle.K.a(this), null, null, new d(null), 3);
    }
}
