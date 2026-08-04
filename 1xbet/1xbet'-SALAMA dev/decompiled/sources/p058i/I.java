package p058i;

import P.G;
import P.U;
import P.b0;
import R4.c;
import android.R;
import android.animation.ValueAnimator;
import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.ColorDrawable;
import android.util.TypedValue;
import android.view.ContextThemeWrapper;
import android.view.KeyCharacterMap;
import android.view.KeyEvent;
import android.view.View;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.DecelerateInterpolator;
import androidx.appcompat.widget.ActionBarContainer;
import androidx.appcompat.widget.ActionBarContextView;
import androidx.appcompat.widget.ActionBarOverlayLayout;
import androidx.appcompat.widget.InterfaceC0609c;
import androidx.appcompat.widget.InterfaceC0610c0;
import androidx.appcompat.widget.Toolbar;
import androidx.appcompat.widget.d1;
import androidx.appcompat.widget.i1;
import androidx.appcompat.widget.j1;
import com.google.android.gms.common.internal.w;
import java.util.ArrayList;
import java.util.WeakHashMap;
import p078l.a;
import p078l.b;
import p078l.k;
import p086m.m;

/* JADX INFO: loaded from: classes.dex */
public final class I extends AbstractC0904a implements InterfaceC0609c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Context f13636a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Context f13637b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public ActionBarOverlayLayout f13638c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public ActionBarContainer f13639d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public InterfaceC0610c0 f13640e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public ActionBarContextView f13641f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final View f13642g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public boolean f13643h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public H f13644i;
    public H j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public w f13645k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public boolean f13646l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final ArrayList f13647m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public int f13648n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public boolean f13649o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public boolean f13650p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public boolean f13651q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public boolean f13652r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public boolean f13653s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public k f13654t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public boolean f13655u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public boolean f13656v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final G f13657w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final G f13658x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final c f13659y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public static final AccelerateInterpolator f13635z = new AccelerateInterpolator();

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public static final DecelerateInterpolator f13634A = new DecelerateInterpolator();

    public I(Activity activity, boolean z4) {
        new ArrayList();
        this.f13647m = new ArrayList();
        this.f13648n = 0;
        this.f13649o = true;
        this.f13653s = true;
        this.f13657w = new G(this, 0);
        this.f13658x = new G(this, 1);
        this.f13659y = new c(this, 18);
        View decorView = activity.getWindow().getDecorView();
        w(decorView);
        if (z4) {
            return;
        }
        this.f13642g = decorView.findViewById(R.id.content);
    }

    @Override // p058i.AbstractC0904a
    public final boolean b() {
        d1 d1Var;
        InterfaceC0610c0 interfaceC0610c0 = this.f13640e;
        if (interfaceC0610c0 == null || (d1Var = ((j1) interfaceC0610c0).f8662a.f8543g0) == null || d1Var.f8613b == null) {
            return false;
        }
        d1 d1Var2 = ((j1) interfaceC0610c0).f8662a.f8543g0;
        m mVar = d1Var2 == null ? null : d1Var2.f8613b;
        if (mVar == null) {
            return true;
        }
        mVar.collapseActionView();
        return true;
    }

    @Override // p058i.AbstractC0904a
    public final void c(boolean z4) {
        if (z4 == this.f13646l) {
            return;
        }
        this.f13646l = z4;
        ArrayList arrayList = this.f13647m;
        if (arrayList.size() > 0) {
            throw p031e1.k.c(arrayList, 0);
        }
    }

    @Override // p058i.AbstractC0904a
    public final int d() {
        return ((j1) this.f13640e).f8663b;
    }

    @Override // p058i.AbstractC0904a
    public final Context e() {
        if (this.f13637b == null) {
            TypedValue typedValue = new TypedValue();
            this.f13636a.getTheme().resolveAttribute(com.salamadev.nabilalawadi.kisaskoran.R.attr.actionBarWidgetTheme, typedValue, true);
            int i7 = typedValue.resourceId;
            if (i7 != 0) {
                this.f13637b = new ContextThemeWrapper(this.f13636a, i7);
            } else {
                this.f13637b = this.f13636a;
            }
        }
        return this.f13637b;
    }

    @Override // p058i.AbstractC0904a
    public final void f() {
        if (this.f13650p) {
            return;
        }
        this.f13650p = true;
        y(false);
    }

    @Override // p058i.AbstractC0904a
    public final boolean h() {
        int height = this.f13639d.getHeight();
        return this.f13653s && (height == 0 || this.f13638c.getActionBarHideOffset() < height);
    }

    @Override // p058i.AbstractC0904a
    public final void i() {
        x(this.f13636a.getResources().getBoolean(com.salamadev.nabilalawadi.kisaskoran.R.bool.abc_action_bar_embed_tabs));
    }

    @Override // p058i.AbstractC0904a
    public final boolean k(int i7, KeyEvent keyEvent) {
        p086m.k kVar;
        H h6 = this.f13644i;
        if (h6 == null || (kVar = h6.f13630d) == null) {
            return false;
        }
        kVar.setQwertyMode(KeyCharacterMap.load(keyEvent != null ? keyEvent.getDeviceId() : -1).getKeyboardType() != 1);
        return kVar.performShortcut(i7, keyEvent, 0);
    }

    @Override // p058i.AbstractC0904a
    public final void n(ColorDrawable colorDrawable) {
        this.f13639d.setPrimaryBackground(colorDrawable);
    }

    @Override // p058i.AbstractC0904a
    public final void o(boolean z4) {
        if (this.f13643h) {
            return;
        }
        int i7 = z4 ? 4 : 0;
        j1 j1Var = (j1) this.f13640e;
        int i8 = j1Var.f8663b;
        this.f13643h = true;
        j1Var.a((i7 & 4) | (i8 & (-5)));
    }

    @Override // p058i.AbstractC0904a
    public final void p(boolean z4) {
        int i7 = z4 ? 8 : 0;
        j1 j1Var = (j1) this.f13640e;
        j1Var.a((i7 & 8) | (j1Var.f8663b & (-9)));
    }

    @Override // p058i.AbstractC0904a
    public final void q(boolean z4) {
        k kVar;
        this.f13655u = z4;
        if (z4 || (kVar = this.f13654t) == null) {
            return;
        }
        kVar.a();
    }

    @Override // p058i.AbstractC0904a
    public final void r(CharSequence charSequence) {
        j1 j1Var = (j1) this.f13640e;
        j1Var.f8668g = true;
        j1Var.f8669h = charSequence;
        if ((j1Var.f8663b & 8) != 0) {
            Toolbar toolbar = j1Var.f8662a;
            toolbar.setTitle(charSequence);
            if (j1Var.f8668g) {
                U.i(toolbar.getRootView(), charSequence);
            }
        }
    }

    @Override // p058i.AbstractC0904a
    public final void s(CharSequence charSequence) {
        j1 j1Var = (j1) this.f13640e;
        if (j1Var.f8668g) {
            return;
        }
        j1Var.f8669h = charSequence;
        if ((j1Var.f8663b & 8) != 0) {
            Toolbar toolbar = j1Var.f8662a;
            toolbar.setTitle(charSequence);
            if (j1Var.f8668g) {
                U.i(toolbar.getRootView(), charSequence);
            }
        }
    }

    @Override // p058i.AbstractC0904a
    public final void t() {
        if (this.f13650p) {
            this.f13650p = false;
            y(false);
        }
    }

    @Override // p058i.AbstractC0904a
    public final b u(w wVar) {
        H h6 = this.f13644i;
        if (h6 != null) {
            h6.a();
        }
        this.f13638c.setHideOnContentScrollEnabled(false);
        this.f13641f.e();
        H h7 = new H(this, this.f13641f.getContext(), wVar);
        p086m.k kVar = h7.f13630d;
        kVar.w();
        try {
            boolean zE = ((a) h7.f13631e.f11335b).e(h7, kVar);
            kVar.v();
            if (!zE) {
                return null;
            }
            this.f13644i = h7;
            h7.i();
            this.f13641f.c(h7);
            v(true);
            return h7;
        } catch (Throwable th) {
            kVar.v();
            throw th;
        }
    }

    public final void v(boolean z4) {
        b0 b0VarI;
        b0 b0VarI2;
        if (z4) {
            if (!this.f13652r) {
                this.f13652r = true;
                ActionBarOverlayLayout actionBarOverlayLayout = this.f13638c;
                if (actionBarOverlayLayout != null) {
                    actionBarOverlayLayout.setShowingForActionMode(true);
                }
                y(false);
            }
        } else if (this.f13652r) {
            this.f13652r = false;
            ActionBarOverlayLayout actionBarOverlayLayout2 = this.f13638c;
            if (actionBarOverlayLayout2 != null) {
                actionBarOverlayLayout2.setShowingForActionMode(false);
            }
            y(false);
        }
        ActionBarContainer actionBarContainer = this.f13639d;
        WeakHashMap weakHashMap = U.f5037a;
        if (!actionBarContainer.isLaidOut()) {
            if (z4) {
                ((j1) this.f13640e).f8662a.setVisibility(4);
                this.f13641f.setVisibility(0);
                return;
            } else {
                ((j1) this.f13640e).f8662a.setVisibility(0);
                this.f13641f.setVisibility(8);
                return;
            }
        }
        if (z4) {
            j1 j1Var = (j1) this.f13640e;
            b0VarI = U.a(j1Var.f8662a);
            b0VarI.a(0.0f);
            b0VarI.c(100L);
            b0VarI.d(new i1(j1Var, 4));
            b0VarI2 = this.f13641f.i(0, 200L);
        } else {
            j1 j1Var2 = (j1) this.f13640e;
            b0 b0VarA = U.a(j1Var2.f8662a);
            b0VarA.a(1.0f);
            b0VarA.c(200L);
            b0VarA.d(new i1(j1Var2, 0));
            b0VarI = this.f13641f.i(8, 100L);
            b0VarI2 = b0VarA;
        }
        k kVar = new k();
        ArrayList arrayList = (ArrayList) kVar.f14859c;
        arrayList.add(b0VarI);
        View view = (View) b0VarI.f5049a.get();
        long duration = view != null ? view.animate().getDuration() : 0L;
        View view2 = (View) b0VarI2.f5049a.get();
        if (view2 != null) {
            view2.animate().setStartDelay(duration);
        }
        arrayList.add(b0VarI2);
        kVar.d();
    }

    public final void w(View view) {
        InterfaceC0610c0 wrapper;
        ActionBarOverlayLayout actionBarOverlayLayout = (ActionBarOverlayLayout) view.findViewById(com.salamadev.nabilalawadi.kisaskoran.R.id.decor_content_parent);
        this.f13638c = actionBarOverlayLayout;
        if (actionBarOverlayLayout != null) {
            actionBarOverlayLayout.setActionBarVisibilityCallback(this);
        }
        KeyEvent.Callback callbackFindViewById = view.findViewById(com.salamadev.nabilalawadi.kisaskoran.R.id.action_bar);
        if (callbackFindViewById instanceof InterfaceC0610c0) {
            wrapper = (InterfaceC0610c0) callbackFindViewById;
        } else {
            if (!(callbackFindViewById instanceof Toolbar)) {
                throw new IllegalStateException("Can't make a decor toolbar out of ".concat(callbackFindViewById != null ? callbackFindViewById.getClass().getSimpleName() : "null"));
            }
            wrapper = ((Toolbar) callbackFindViewById).getWrapper();
        }
        this.f13640e = wrapper;
        this.f13641f = (ActionBarContextView) view.findViewById(com.salamadev.nabilalawadi.kisaskoran.R.id.action_context_bar);
        ActionBarContainer actionBarContainer = (ActionBarContainer) view.findViewById(com.salamadev.nabilalawadi.kisaskoran.R.id.action_bar_container);
        this.f13639d = actionBarContainer;
        InterfaceC0610c0 interfaceC0610c0 = this.f13640e;
        if (interfaceC0610c0 == null || this.f13641f == null || actionBarContainer == null) {
            throw new IllegalStateException(I.class.getSimpleName().concat(" can only be used with a compatible window decor layout"));
        }
        Context context = ((j1) interfaceC0610c0).f8662a.getContext();
        this.f13636a = context;
        if ((((j1) this.f13640e).f8663b & 4) != 0) {
            this.f13643h = true;
        }
        int i7 = context.getApplicationInfo().targetSdkVersion;
        this.f13640e.getClass();
        x(context.getResources().getBoolean(com.salamadev.nabilalawadi.kisaskoran.R.bool.abc_action_bar_embed_tabs));
        TypedArray typedArrayObtainStyledAttributes = this.f13636a.obtainStyledAttributes(null, p051h.a.f13329a, com.salamadev.nabilalawadi.kisaskoran.R.attr.actionBarStyle, 0);
        if (typedArrayObtainStyledAttributes.getBoolean(14, false)) {
            ActionBarOverlayLayout actionBarOverlayLayout2 = this.f13638c;
            if (!actionBarOverlayLayout2.f8233y) {
                throw new IllegalStateException("Action bar must be in overlay mode (Window.FEATURE_OVERLAY_ACTION_BAR) to enable hide on content scroll");
            }
            this.f13656v = true;
            actionBarOverlayLayout2.setHideOnContentScrollEnabled(true);
        }
        int dimensionPixelSize = typedArrayObtainStyledAttributes.getDimensionPixelSize(12, 0);
        if (dimensionPixelSize != 0) {
            ActionBarContainer actionBarContainer2 = this.f13639d;
            WeakHashMap weakHashMap = U.f5037a;
            P.I.s(actionBarContainer2, dimensionPixelSize);
        }
        typedArrayObtainStyledAttributes.recycle();
    }

    public final void x(boolean z4) {
        if (z4) {
            this.f13639d.setTabContainer(null);
            ((j1) this.f13640e).getClass();
        } else {
            ((j1) this.f13640e).getClass();
            this.f13639d.setTabContainer(null);
        }
        this.f13640e.getClass();
        ((j1) this.f13640e).f8662a.setCollapsible(false);
        this.f13638c.setHasNonEmbeddedTabs(false);
    }

    public final void y(boolean z4) {
        boolean z7 = this.f13652r || !(this.f13650p || this.f13651q);
        View view = this.f13642g;
        final c cVar = this.f13659y;
        if (!z7) {
            if (this.f13653s) {
                this.f13653s = false;
                k kVar = this.f13654t;
                if (kVar != null) {
                    kVar.a();
                }
                int i7 = this.f13648n;
                G g3 = this.f13657w;
                if (i7 != 0 || (!this.f13655u && !z4)) {
                    g3.c();
                    return;
                }
                this.f13639d.setAlpha(1.0f);
                this.f13639d.setTransitioning(true);
                k kVar2 = new k();
                float f7 = -this.f13639d.getHeight();
                if (z4) {
                    int[] iArr = {0, 0};
                    this.f13639d.getLocationInWindow(iArr);
                    f7 -= iArr[1];
                }
                b0 b0VarA = U.a(this.f13639d);
                b0VarA.e(f7);
                final View view2 = (View) b0VarA.f5049a.get();
                if (view2 != null) {
                    view2.animate().setUpdateListener(cVar != null ? new ValueAnimator.AnimatorUpdateListener() { // from class: P.a0
                        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                        public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                            ((View) ((p058i.I) cVar.f6064b).f13639d.getParent()).invalidate();
                        }
                    } : null);
                }
                boolean z8 = kVar2.f14858b;
                ArrayList arrayList = (ArrayList) kVar2.f14859c;
                if (!z8) {
                    arrayList.add(b0VarA);
                }
                if (this.f13649o && view != null) {
                    b0 b0VarA2 = U.a(view);
                    b0VarA2.e(f7);
                    if (!kVar2.f14858b) {
                        arrayList.add(b0VarA2);
                    }
                }
                AccelerateInterpolator accelerateInterpolator = f13635z;
                boolean z9 = kVar2.f14858b;
                if (!z9) {
                    kVar2.f14860d = accelerateInterpolator;
                }
                if (!z9) {
                    kVar2.f14857a = 250L;
                }
                if (!z9) {
                    kVar2.f14861e = g3;
                }
                this.f13654t = kVar2;
                kVar2.d();
                return;
            }
            return;
        }
        if (this.f13653s) {
            return;
        }
        this.f13653s = true;
        k kVar3 = this.f13654t;
        if (kVar3 != null) {
            kVar3.a();
        }
        this.f13639d.setVisibility(0);
        int i8 = this.f13648n;
        G g7 = this.f13658x;
        if (i8 == 0 && (this.f13655u || z4)) {
            this.f13639d.setTranslationY(0.0f);
            float f8 = -this.f13639d.getHeight();
            if (z4) {
                int[] iArr2 = {0, 0};
                this.f13639d.getLocationInWindow(iArr2);
                f8 -= iArr2[1];
            }
            this.f13639d.setTranslationY(f8);
            k kVar4 = new k();
            b0 b0VarA3 = U.a(this.f13639d);
            b0VarA3.e(0.0f);
            final View view3 = (View) b0VarA3.f5049a.get();
            if (view3 != null) {
                view3.animate().setUpdateListener(cVar != null ? new ValueAnimator.AnimatorUpdateListener() { // from class: P.a0
                    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                        ((View) ((p058i.I) cVar.f6064b).f13639d.getParent()).invalidate();
                    }
                } : null);
            }
            boolean z10 = kVar4.f14858b;
            ArrayList arrayList2 = (ArrayList) kVar4.f14859c;
            if (!z10) {
                arrayList2.add(b0VarA3);
            }
            if (this.f13649o && view != null) {
                view.setTranslationY(f8);
                b0 b0VarA4 = U.a(view);
                b0VarA4.e(0.0f);
                if (!kVar4.f14858b) {
                    arrayList2.add(b0VarA4);
                }
            }
            DecelerateInterpolator decelerateInterpolator = f13634A;
            boolean z11 = kVar4.f14858b;
            if (!z11) {
                kVar4.f14860d = decelerateInterpolator;
            }
            if (!z11) {
                kVar4.f14857a = 250L;
            }
            if (!z11) {
                kVar4.f14861e = g7;
            }
            this.f13654t = kVar4;
            kVar4.d();
        } else {
            this.f13639d.setAlpha(1.0f);
            this.f13639d.setTranslationY(0.0f);
            if (this.f13649o && view != null) {
                view.setTranslationY(0.0f);
            }
            g7.c();
        }
        ActionBarOverlayLayout actionBarOverlayLayout = this.f13638c;
        if (actionBarOverlayLayout != null) {
            WeakHashMap weakHashMap = U.f5037a;
            G.c(actionBarOverlayLayout);
        }
    }

    public I(Dialog dialog) {
        new ArrayList();
        this.f13647m = new ArrayList();
        this.f13648n = 0;
        this.f13649o = true;
        this.f13653s = true;
        this.f13657w = new G(this, 0);
        this.f13658x = new G(this, 1);
        this.f13659y = new c(this, 18);
        w(dialog.getWindow().getDecorView());
    }
}
