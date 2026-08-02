package p000;

import android.R;
import android.animation.ValueAnimator;
import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.TypedValue;
import android.view.ContextThemeWrapper;
import android.view.KeyEvent;
import android.view.View;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.DecelerateInterpolator;
import androidx.appcompat.widget.ActionBarContainer;
import androidx.appcompat.widget.ActionBarContextView;
import androidx.appcompat.widget.ActionBarOverlayLayout;
import androidx.appcompat.widget.Toolbar;
import java.util.ArrayList;
import java.util.WeakHashMap;

/* JADX INFO: compiled from: r8-map-id-738170b7fb69b873ed7524d5270c8e05c6f5fb40ea1ade7a72c8ed7a70699269 */
/* JADX INFO: loaded from: classes.dex */
public final class hj1 implements InterfaceC0234g2 {

    /* JADX INFO: renamed from: y */
    public static final AccelerateInterpolator f3225y = new AccelerateInterpolator();

    /* JADX INFO: renamed from: z */
    public static final DecelerateInterpolator f3226z = new DecelerateInterpolator();

    /* JADX INFO: renamed from: a */
    public Context f3227a;

    /* JADX INFO: renamed from: b */
    public Context f3228b;

    /* JADX INFO: renamed from: c */
    public ActionBarOverlayLayout f3229c;

    /* JADX INFO: renamed from: d */
    public ActionBarContainer f3230d;

    /* JADX INFO: renamed from: e */
    public InterfaceC0295hq f3231e;

    /* JADX INFO: renamed from: f */
    public ActionBarContextView f3232f;

    /* JADX INFO: renamed from: g */
    public final View f3233g;

    /* JADX INFO: renamed from: h */
    public boolean f3234h;

    /* JADX INFO: renamed from: i */
    public gj1 f3235i;

    /* JADX INFO: renamed from: j */
    public gj1 f3236j;

    /* JADX INFO: renamed from: k */
    public C0312i6 f3237k;

    /* JADX INFO: renamed from: l */
    public boolean f3238l;

    /* JADX INFO: renamed from: m */
    public final ArrayList f3239m;

    /* JADX INFO: renamed from: n */
    public int f3240n;

    /* JADX INFO: renamed from: o */
    public boolean f3241o;

    /* JADX INFO: renamed from: p */
    public boolean f3242p;

    /* JADX INFO: renamed from: q */
    public boolean f3243q;

    /* JADX INFO: renamed from: r */
    public boolean f3244r;

    /* JADX INFO: renamed from: s */
    public ki1 f3245s;

    /* JADX INFO: renamed from: t */
    public boolean f3246t;

    /* JADX INFO: renamed from: u */
    public boolean f3247u;

    /* JADX INFO: renamed from: v */
    public final fj1 f3248v;

    /* JADX INFO: renamed from: w */
    public final fj1 f3249w;

    /* JADX INFO: renamed from: x */
    public final jg0 f3250x;

    public hj1(Activity activity, boolean z) {
        new ArrayList();
        this.f3239m = new ArrayList();
        this.f3240n = 0;
        this.f3241o = true;
        this.f3244r = true;
        this.f3248v = new fj1(this, 0);
        this.f3249w = new fj1(this, 1);
        this.f3250x = new jg0(18, this);
        View decorView = activity.getWindow().getDecorView();
        m2277c(decorView);
        if (z) {
            return;
        }
        this.f3233g = decorView.findViewById(R.id.content);
    }

    /* JADX INFO: renamed from: a */
    public final void m2275a(boolean z) {
        ji1 ji1VarM344i;
        ji1 ji1VarM344i2;
        boolean z2 = this.f3243q;
        if (z) {
            if (!z2) {
                this.f3243q = true;
                ActionBarOverlayLayout actionBarOverlayLayout = this.f3229c;
                if (actionBarOverlayLayout != null) {
                    actionBarOverlayLayout.setShowingForActionMode(true);
                }
                m2280f(false);
            }
        } else if (z2) {
            this.f3243q = false;
            ActionBarOverlayLayout actionBarOverlayLayout2 = this.f3229c;
            if (actionBarOverlayLayout2 != null) {
                actionBarOverlayLayout2.setShowingForActionMode(false);
            }
            m2280f(false);
        }
        boolean zIsLaidOut = this.f3230d.isLaidOut();
        InterfaceC0295hq interfaceC0295hq = this.f3231e;
        if (!zIsLaidOut) {
            if (z) {
                ((xd1) interfaceC0295hq).f8896a.setVisibility(4);
                this.f3232f.setVisibility(0);
                return;
            } else {
                ((xd1) interfaceC0295hq).f8896a.setVisibility(0);
                this.f3232f.setVisibility(8);
                return;
            }
        }
        if (z) {
            xd1 xd1Var = (xd1) interfaceC0295hq;
            ji1VarM344i = ai1.m248a(xd1Var.f8896a);
            ji1VarM344i.m2912a(0.0f);
            ji1VarM344i.m2914c(100L);
            ji1VarM344i.m2915d(new wd1(xd1Var, 4));
            ji1VarM344i2 = this.f3232f.m344i(0, 200L);
        } else {
            xd1 xd1Var2 = (xd1) interfaceC0295hq;
            ji1 ji1VarM248a = ai1.m248a(xd1Var2.f8896a);
            ji1VarM248a.m2912a(1.0f);
            ji1VarM248a.m2914c(200L);
            ji1VarM248a.m2915d(new wd1(xd1Var2, 0));
            ji1VarM344i = this.f3232f.m344i(8, 100L);
            ji1VarM344i2 = ji1VarM248a;
        }
        ki1 ki1Var = new ki1();
        ArrayList arrayList = ki1Var.f4390a;
        arrayList.add(ji1VarM344i);
        View view = (View) ji1VarM344i.f3944a.get();
        long duration = view != null ? view.animate().getDuration() : 0L;
        View view2 = (View) ji1VarM344i2.f3944a.get();
        if (view2 != null) {
            view2.animate().setStartDelay(duration);
        }
        arrayList.add(ji1VarM344i2);
        ki1Var.m3046b();
    }

    /* JADX INFO: renamed from: b */
    public final Context m2276b() {
        if (this.f3228b == null) {
            TypedValue typedValue = new TypedValue();
            this.f3227a.getTheme().resolveAttribute(live.football.scorerepublic.R.attr.actionBarWidgetTheme, typedValue, true);
            int i = typedValue.resourceId;
            if (i != 0) {
                this.f3228b = new ContextThemeWrapper(this.f3227a, i);
            } else {
                this.f3228b = this.f3227a;
            }
        }
        return this.f3228b;
    }

    /* JADX INFO: renamed from: c */
    public final void m2277c(View view) {
        InterfaceC0295hq wrapper;
        ActionBarOverlayLayout actionBarOverlayLayout = (ActionBarOverlayLayout) view.findViewById(live.football.scorerepublic.R.id.decor_content_parent);
        this.f3229c = actionBarOverlayLayout;
        if (actionBarOverlayLayout != null) {
            actionBarOverlayLayout.setActionBarVisibilityCallback(this);
        }
        KeyEvent.Callback callbackFindViewById = view.findViewById(live.football.scorerepublic.R.id.action_bar);
        if (callbackFindViewById instanceof InterfaceC0295hq) {
            wrapper = (InterfaceC0295hq) callbackFindViewById;
        } else {
            if (!(callbackFindViewById instanceof Toolbar)) {
                throw new IllegalStateException("Can't make a decor toolbar out of ".concat(callbackFindViewById != null ? callbackFindViewById.getClass().getSimpleName() : "null"));
            }
            wrapper = ((Toolbar) callbackFindViewById).getWrapper();
        }
        this.f3231e = wrapper;
        this.f3232f = (ActionBarContextView) view.findViewById(live.football.scorerepublic.R.id.action_context_bar);
        ActionBarContainer actionBarContainer = (ActionBarContainer) view.findViewById(live.football.scorerepublic.R.id.action_bar_container);
        this.f3230d = actionBarContainer;
        InterfaceC0295hq interfaceC0295hq = this.f3231e;
        if (interfaceC0295hq == null || this.f3232f == null || actionBarContainer == null) {
            C0270h1.m2191g(hj1.class.getSimpleName().concat(" can only be used with a compatible window decor layout"));
            return;
        }
        Context context = ((xd1) interfaceC0295hq).f8896a.getContext();
        this.f3227a = context;
        if ((((xd1) this.f3231e).f8897b & 4) != 0) {
            this.f3234h = true;
        }
        int i = context.getApplicationInfo().targetSdkVersion;
        this.f3231e.getClass();
        m2279e(context.getResources().getBoolean(live.football.scorerepublic.R.bool.abc_action_bar_embed_tabs));
        TypedArray typedArrayObtainStyledAttributes = this.f3227a.obtainStyledAttributes(null, mz0.f5187a, live.football.scorerepublic.R.attr.actionBarStyle, 0);
        if (typedArrayObtainStyledAttributes.getBoolean(14, false)) {
            ActionBarOverlayLayout actionBarOverlayLayout2 = this.f3229c;
            if (!actionBarOverlayLayout2.f379p) {
                C0270h1.m2191g("Action bar must be in overlay mode (Window.FEATURE_OVERLAY_ACTION_BAR) to enable hide on content scroll");
                return;
            } else {
                this.f3247u = true;
                actionBarOverlayLayout2.setHideOnContentScrollEnabled(true);
            }
        }
        int dimensionPixelSize = typedArrayObtainStyledAttributes.getDimensionPixelSize(12, 0);
        if (dimensionPixelSize != 0) {
            ActionBarContainer actionBarContainer2 = this.f3230d;
            WeakHashMap weakHashMap = ai1.f194a;
            actionBarContainer2.setElevation(dimensionPixelSize);
        }
        typedArrayObtainStyledAttributes.recycle();
    }

    /* JADX INFO: renamed from: d */
    public final void m2278d(boolean z) {
        if (this.f3234h) {
            return;
        }
        int i = z ? 4 : 0;
        xd1 xd1Var = (xd1) this.f3231e;
        int i2 = xd1Var.f8897b;
        this.f3234h = true;
        xd1Var.m5621a((i & 4) | (i2 & (-5)));
    }

    /* JADX INFO: renamed from: e */
    public final void m2279e(boolean z) {
        if (z) {
            this.f3230d.setTabContainer(null);
            ((xd1) this.f3231e).getClass();
        } else {
            ((xd1) this.f3231e).getClass();
            this.f3230d.setTabContainer(null);
        }
        this.f3231e.getClass();
        ((xd1) this.f3231e).f8896a.setCollapsible(false);
        this.f3229c.setHasNonEmbeddedTabs(false);
    }

    /* JADX INFO: renamed from: f */
    public final void m2280f(boolean z) {
        boolean z2 = this.f3243q || !this.f3242p;
        boolean z3 = this.f3244r;
        final jg0 jg0Var = this.f3250x;
        View view = this.f3233g;
        if (!z2) {
            if (z3) {
                this.f3244r = false;
                ki1 ki1Var = this.f3245s;
                if (ki1Var != null) {
                    ki1Var.m3045a();
                }
                int i = this.f3240n;
                fj1 fj1Var = this.f3248v;
                if (i != 0 || (!this.f3246t && !z)) {
                    fj1Var.mo1067a();
                    return;
                }
                this.f3230d.setAlpha(1.0f);
                this.f3230d.setTransitioning(true);
                ki1 ki1Var2 = new ki1();
                float f = -this.f3230d.getHeight();
                if (z) {
                    int[] iArr = {0, 0};
                    this.f3230d.getLocationInWindow(iArr);
                    f -= iArr[1];
                }
                ji1 ji1VarM248a = ai1.m248a(this.f3230d);
                ji1VarM248a.m2916e(f);
                final View view2 = (View) ji1VarM248a.f3944a.get();
                if (view2 != null) {
                    view2.animate().setUpdateListener(jg0Var != null ? new ValueAnimator.AnimatorUpdateListener(view2) { // from class: ii1
                        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                        public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                            ((View) ((hj1) this.f3584a.f3922k).f3230d.getParent()).invalidate();
                        }
                    } : null);
                }
                boolean z4 = ki1Var2.f4394e;
                ArrayList arrayList = ki1Var2.f4390a;
                if (!z4) {
                    arrayList.add(ji1VarM248a);
                }
                if (this.f3241o && view != null) {
                    ji1 ji1VarM248a2 = ai1.m248a(view);
                    ji1VarM248a2.m2916e(f);
                    if (!ki1Var2.f4394e) {
                        arrayList.add(ji1VarM248a2);
                    }
                }
                boolean z5 = ki1Var2.f4394e;
                if (!z5) {
                    ki1Var2.f4392c = f3225y;
                }
                if (!z5) {
                    ki1Var2.f4391b = 250L;
                }
                if (!z5) {
                    ki1Var2.f4393d = fj1Var;
                }
                this.f3245s = ki1Var2;
                ki1Var2.m3046b();
                return;
            }
            return;
        }
        if (z3) {
            return;
        }
        this.f3244r = true;
        ki1 ki1Var3 = this.f3245s;
        if (ki1Var3 != null) {
            ki1Var3.m3045a();
        }
        this.f3230d.setVisibility(0);
        int i2 = this.f3240n;
        fj1 fj1Var2 = this.f3249w;
        if (i2 == 0 && (this.f3246t || z)) {
            this.f3230d.setTranslationY(0.0f);
            float f2 = -this.f3230d.getHeight();
            if (z) {
                int[] iArr2 = {0, 0};
                this.f3230d.getLocationInWindow(iArr2);
                f2 -= iArr2[1];
            }
            this.f3230d.setTranslationY(f2);
            ki1 ki1Var4 = new ki1();
            ji1 ji1VarM248a3 = ai1.m248a(this.f3230d);
            ji1VarM248a3.m2916e(0.0f);
            final View view3 = (View) ji1VarM248a3.f3944a.get();
            if (view3 != null) {
                view3.animate().setUpdateListener(jg0Var != null ? new ValueAnimator.AnimatorUpdateListener(view3) { // from class: ii1
                    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                        ((View) ((hj1) this.f3584a.f3922k).f3230d.getParent()).invalidate();
                    }
                } : null);
            }
            boolean z6 = ki1Var4.f4394e;
            ArrayList arrayList2 = ki1Var4.f4390a;
            if (!z6) {
                arrayList2.add(ji1VarM248a3);
            }
            if (this.f3241o && view != null) {
                view.setTranslationY(f2);
                ji1 ji1VarM248a4 = ai1.m248a(view);
                ji1VarM248a4.m2916e(0.0f);
                if (!ki1Var4.f4394e) {
                    arrayList2.add(ji1VarM248a4);
                }
            }
            boolean z7 = ki1Var4.f4394e;
            if (!z7) {
                ki1Var4.f4392c = f3226z;
            }
            if (!z7) {
                ki1Var4.f4391b = 250L;
            }
            if (!z7) {
                ki1Var4.f4393d = fj1Var2;
            }
            this.f3245s = ki1Var4;
            ki1Var4.m3046b();
        } else {
            this.f3230d.setAlpha(1.0f);
            this.f3230d.setTranslationY(0.0f);
            if (this.f3241o && view != null) {
                view.setTranslationY(0.0f);
            }
            fj1Var2.mo1067a();
        }
        ActionBarOverlayLayout actionBarOverlayLayout = this.f3229c;
        if (actionBarOverlayLayout != null) {
            WeakHashMap weakHashMap = ai1.f194a;
            actionBarOverlayLayout.requestApplyInsets();
        }
    }

    public hj1(Dialog dialog) {
        new ArrayList();
        this.f3239m = new ArrayList();
        this.f3240n = 0;
        this.f3241o = true;
        this.f3244r = true;
        this.f3248v = new fj1(this, 0);
        this.f3249w = new fj1(this, 1);
        this.f3250x = new jg0(18, this);
        m2277c(dialog.getWindow().getDecorView());
    }
}
