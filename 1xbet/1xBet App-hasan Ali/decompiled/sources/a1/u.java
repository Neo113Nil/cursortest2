package a1;

import A0.RunnableC0049o;
import A0.r1;
import G1.C0145p;
import android.app.Dialog;
import android.os.Build;
import android.os.Bundle;
import android.view.ContextThemeWrapper;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import android.window.OnBackInvokedDispatcher;
import androidx.lifecycle.C0479h;
import androidx.lifecycle.C0493w;
import androidx.lifecycle.EnumC0486o;
import androidx.lifecycle.EnumC0487p;
import androidx.lifecycle.InterfaceC0491u;
import androidx.lifecycle.L;
import c.C0514A;
import c.C0515B;
import c.C0519F;
import c.InterfaceC0520G;
import game.betting133.sports1xbet.R;
import i4.InterfaceC2015a;
import java.util.UUID;
import k4.AbstractC2036a;

/* loaded from: classes.dex */
public final class u extends Dialog implements InterfaceC0491u, InterfaceC0520G, I1.c, U1.e {

    /* renamed from: k, reason: collision with root package name */
    public C0493w f6434k;

    /* renamed from: l, reason: collision with root package name */
    public final G.v f6435l;

    /* renamed from: m, reason: collision with root package name */
    public final W3.m f6436m;

    /* renamed from: n, reason: collision with root package name */
    public final W3.m f6437n;

    /* renamed from: o, reason: collision with root package name */
    public InterfaceC2015a f6438o;

    /* renamed from: p, reason: collision with root package name */
    public t f6439p;

    /* renamed from: q, reason: collision with root package name */
    public final View f6440q;

    /* renamed from: r, reason: collision with root package name */
    public final s f6441r;

    /* renamed from: s, reason: collision with root package name */
    public boolean f6442s;

    public u(InterfaceC2015a interfaceC2015a, t tVar, View view, W0.m mVar, W0.c cVar, UUID uuid) {
        super(new ContextThemeWrapper(view.getContext(), tVar.f6433e ? R.style.DialogWindowTheme : R.style.FloatingDialogWindowTheme), 0);
        this.f6435l = new G.v(new W1.a(this, new O3.l(5, this)));
        final int i = 0;
        this.f6436m = G4.d.E(new InterfaceC2015a(this) { // from class: c.k

            /* renamed from: l, reason: collision with root package name */
            public final /* synthetic */ a1.u f7356l;

            {
                this.f7356l = this;
            }

            @Override // i4.InterfaceC2015a
            public final Object invoke() {
                switch (i) {
                    case 0:
                        I1.a aVar = new I1.a();
                        this.f7356l.c().e(aVar);
                        return aVar;
                    default:
                        return new C0519F(new RunnableC0049o(11, this.f7356l));
                }
            }
        });
        final int i5 = 1;
        this.f6437n = G4.d.E(new InterfaceC2015a(this) { // from class: c.k

            /* renamed from: l, reason: collision with root package name */
            public final /* synthetic */ a1.u f7356l;

            {
                this.f7356l = this;
            }

            @Override // i4.InterfaceC2015a
            public final Object invoke() {
                switch (i5) {
                    case 0:
                        I1.a aVar = new I1.a();
                        this.f7356l.c().e(aVar);
                        return aVar;
                    default:
                        return new C0519F(new RunnableC0049o(11, this.f7356l));
                }
            }
        });
        this.f6438o = interfaceC2015a;
        this.f6439p = tVar;
        this.f6440q = view;
        float f = 8;
        Window window = getWindow();
        if (window == null) {
            throw new IllegalStateException("Dialog has no window");
        }
        window.requestFeature(1);
        window.setBackgroundDrawableResource(android.R.color.transparent);
        G4.d.K(window, this.f6439p.f6433e);
        window.setGravity(17);
        if (!this.f6439p.f6433e) {
            window.addFlags(65792);
            WindowManager.LayoutParams attributes = window.getAttributes();
            int i6 = Build.VERSION.SDK_INT;
            if (i6 >= 28) {
                m.f6416a.a(attributes);
            }
            if (i6 >= 30) {
                n nVar = n.f6417a;
                nVar.a(attributes, 0);
                nVar.b(attributes, 0);
            }
            window.setAttributes(attributes);
        }
        s sVar = new s(getContext(), window);
        setTitle(this.f6439p.f);
        sVar.setTag(R.id.compose_view_saveable_id_tag, "Dialog:" + uuid);
        sVar.setClipChildren(false);
        sVar.setElevation(cVar.y(f));
        sVar.setOutlineProvider(new r1(1));
        this.f6441r = sVar;
        View decorView = window.getDecorView();
        ViewGroup viewGroup = decorView instanceof ViewGroup ? (ViewGroup) decorView : null;
        if (viewGroup != null) {
            e(viewGroup);
        }
        setContentView(sVar);
        L.l(sVar, L.f(view));
        sVar.setTag(R.id.view_tree_view_model_store_owner, L.g(view));
        sVar.setTag(R.id.view_tree_saved_state_registry_owner, N4.b.x(view));
        h(this.f6438o, this.f6439p, mVar);
        C0519F a5 = a();
        C0455b c0455b = new C0455b(this, 1);
        kotlin.jvm.internal.l.f("<this>", a5);
        C0145p c0145p = new C0145p(c0455b);
        final L g5 = g();
        if (g5.h() == EnumC0487p.f7058k) {
            return;
        }
        C0514A c0514a = new C0514A(c0145p, new C0515B(c0145p, this));
        c0145p.f1925a.add(c0514a);
        c0514a.g(false);
        m2.g.d(a5.a().f7304c, c0514a);
        final C0479h c0479h = new C0479h(c0514a, a5, g5);
        g5.a(c0479h);
        c0145p.f1927c.add(new AutoCloseable() { // from class: c.C
            @Override // java.lang.AutoCloseable
            public final void close() {
                L.this.k(c0479h);
            }
        });
    }

    public static void d(u uVar) {
        super.onBackPressed();
    }

    public static final void e(ViewGroup viewGroup) {
        viewGroup.setClipChildren(false);
        if (viewGroup instanceof s) {
            return;
        }
        int childCount = viewGroup.getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = viewGroup.getChildAt(i);
            ViewGroup viewGroup2 = childAt instanceof ViewGroup ? (ViewGroup) childAt : null;
            if (viewGroup2 != null) {
                e(viewGroup2);
            }
        }
    }

    @Override // c.InterfaceC0520G
    public final C0519F a() {
        return (C0519F) this.f6437n.getValue();
    }

    @Override // android.app.Dialog
    public final void addContentView(View view, ViewGroup.LayoutParams layoutParams) {
        kotlin.jvm.internal.l.f("view", view);
        f();
        super.addContentView(view, layoutParams);
    }

    @Override // U1.e
    public final v3.g b() {
        return (v3.g) this.f6435l.f1750m;
    }

    @Override // I1.c
    public final m2.g c() {
        return a().a().f7304c;
    }

    public final void f() {
        Window window = getWindow();
        kotlin.jvm.internal.l.c(window);
        View decorView = window.getDecorView();
        kotlin.jvm.internal.l.e("getDecorView(...)", decorView);
        L.l(decorView, this);
        Window window2 = getWindow();
        kotlin.jvm.internal.l.c(window2);
        View decorView2 = window2.getDecorView();
        kotlin.jvm.internal.l.e("getDecorView(...)", decorView2);
        decorView2.setTag(R.id.view_tree_on_back_pressed_dispatcher_owner, this);
        Window window3 = getWindow();
        kotlin.jvm.internal.l.c(window3);
        View decorView3 = window3.getDecorView();
        kotlin.jvm.internal.l.e("getDecorView(...)", decorView3);
        decorView3.setTag(R.id.view_tree_saved_state_registry_owner, this);
        Window window4 = getWindow();
        kotlin.jvm.internal.l.c(window4);
        View decorView4 = window4.getDecorView();
        kotlin.jvm.internal.l.e("getDecorView(...)", decorView4);
        decorView4.setTag(R.id.view_tree_navigation_event_dispatcher_owner, this);
    }

    @Override // androidx.lifecycle.InterfaceC0491u
    public final L g() {
        C0493w c0493w = this.f6434k;
        if (c0493w != null) {
            return c0493w;
        }
        C0493w c0493w2 = new C0493w(this, true);
        this.f6434k = c0493w2;
        return c0493w2;
    }

    public final void h(InterfaceC2015a interfaceC2015a, t tVar, W0.m mVar) {
        int i;
        this.f6438o = interfaceC2015a;
        this.f6439p = tVar;
        B b3 = tVar.f6431c;
        boolean b5 = l.b(this.f6440q);
        int ordinal = b3.ordinal();
        if (ordinal != 0) {
            if (ordinal == 1) {
                b5 = true;
            } else {
                if (ordinal != 2) {
                    throw new D2.e();
                }
                b5 = false;
            }
        }
        Window window = getWindow();
        kotlin.jvm.internal.l.c(window);
        window.setFlags(b5 ? 8192 : -8193, 8192);
        int ordinal2 = mVar.ordinal();
        if (ordinal2 == 0) {
            i = 0;
        } else {
            if (ordinal2 != 1) {
                throw new D2.e();
            }
            i = 1;
        }
        s sVar = this.f6441r;
        sVar.setLayoutDirection(i);
        boolean z3 = sVar.f6427w;
        boolean z5 = tVar.f6433e;
        boolean z6 = tVar.f6432d;
        boolean z7 = (z3 && z6 == sVar.f6425u && z5 == sVar.f6426v) ? false : true;
        sVar.f6425u = z6;
        sVar.f6426v = z5;
        if (z7) {
            Window window2 = sVar.f6423s;
            WindowManager.LayoutParams attributes = window2.getAttributes();
            int i5 = z6 ? -2 : -1;
            if (i5 != attributes.width || !sVar.f6427w) {
                window2.setLayout(i5, -2);
                sVar.f6427w = true;
            }
        }
        setCanceledOnTouchOutside(tVar.f6430b);
        Window window3 = getWindow();
        if (window3 != null) {
            window3.setSoftInputMode(z5 ? 0 : Build.VERSION.SDK_INT < 31 ? 16 : 48);
        }
    }

    @Override // android.app.Dialog
    public final void onBackPressed() {
        ((I1.a) this.f6436m.getValue()).a();
    }

    @Override // android.app.Dialog
    public final void onCreate(Bundle bundle) {
        OnBackInvokedDispatcher onBackInvokedDispatcher;
        super.onCreate(bundle);
        if (Build.VERSION.SDK_INT >= 33) {
            C0519F a5 = a();
            onBackInvokedDispatcher = getOnBackInvokedDispatcher();
            kotlin.jvm.internal.l.e("getOnBackInvokedDispatcher(...)", onBackInvokedDispatcher);
            a5.b(onBackInvokedDispatcher);
        }
        this.f6435l.o(bundle);
        C0493w c0493w = this.f6434k;
        if (c0493w == null) {
            c0493w = new C0493w(this, true);
            this.f6434k = c0493w;
        }
        c0493w.p(EnumC0486o.ON_CREATE);
    }

    @Override // android.app.Dialog, android.view.KeyEvent.Callback
    public final boolean onKeyUp(int i, KeyEvent keyEvent) {
        if (!this.f6439p.f6429a || !keyEvent.isTracking() || keyEvent.isCanceled() || i != 111) {
            return super.onKeyUp(i, keyEvent);
        }
        this.f6438o.invoke();
        return true;
    }

    @Override // android.app.Dialog
    public final Bundle onSaveInstanceState() {
        Bundle onSaveInstanceState = super.onSaveInstanceState();
        kotlin.jvm.internal.l.e("onSaveInstanceState(...)", onSaveInstanceState);
        this.f6435l.p(onSaveInstanceState);
        return onSaveInstanceState;
    }

    @Override // android.app.Dialog
    public final void onStart() {
        super.onStart();
        C0493w c0493w = this.f6434k;
        if (c0493w == null) {
            c0493w = new C0493w(this, true);
            this.f6434k = c0493w;
        }
        c0493w.p(EnumC0486o.ON_RESUME);
    }

    @Override // android.app.Dialog
    public final void onStop() {
        C0493w c0493w = this.f6434k;
        if (c0493w == null) {
            c0493w = new C0493w(this, true);
            this.f6434k = c0493w;
        }
        c0493w.p(EnumC0486o.ON_DESTROY);
        this.f6434k = null;
        super.onStop();
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x006b, code lost:
    
        if (r5 <= r1) goto L35;
     */
    @Override // android.app.Dialog
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        View childAt;
        boolean onTouchEvent = super.onTouchEvent(motionEvent);
        if (this.f6439p.f6430b) {
            s sVar = this.f6441r;
            sVar.getClass();
            float x5 = motionEvent.getX();
            if (!Float.isInfinite(x5) && !Float.isNaN(x5)) {
                float y5 = motionEvent.getY();
                if (!Float.isInfinite(y5) && !Float.isNaN(y5) && (childAt = sVar.getChildAt(0)) != null) {
                    int left = childAt.getLeft() + sVar.getLeft();
                    int width = childAt.getWidth() + left;
                    int top = childAt.getTop() + sVar.getTop();
                    int height = childAt.getHeight() + top;
                    int U4 = AbstractC2036a.U(motionEvent.getX());
                    if (left <= U4) {
                        if (U4 <= width) {
                            int U5 = AbstractC2036a.U(motionEvent.getY());
                            if (top <= U5) {
                            }
                        }
                    }
                }
            }
            int actionMasked = motionEvent.getActionMasked();
            if (actionMasked == 0) {
                this.f6442s = true;
                return true;
            }
            if (actionMasked != 1) {
                if (actionMasked == 3) {
                    this.f6442s = false;
                    return onTouchEvent;
                }
            } else if (this.f6442s) {
                this.f6438o.invoke();
                this.f6442s = false;
                return true;
            }
            return onTouchEvent;
        }
        int actionMasked2 = motionEvent.getActionMasked();
        if (actionMasked2 == 0 || actionMasked2 == 1 || actionMasked2 == 3) {
            this.f6442s = false;
            return onTouchEvent;
        }
        return onTouchEvent;
    }

    @Override // android.app.Dialog
    public final void setContentView(int i) {
        f();
        super.setContentView(i);
    }

    @Override // android.app.Dialog
    public final void setContentView(View view) {
        kotlin.jvm.internal.l.f("view", view);
        f();
        super.setContentView(view);
    }

    @Override // android.app.Dialog
    public final void setContentView(View view, ViewGroup.LayoutParams layoutParams) {
        kotlin.jvm.internal.l.f("view", view);
        f();
        super.setContentView(view, layoutParams);
    }

    @Override // android.app.Dialog, android.content.DialogInterface
    public final void cancel() {
    }
}
