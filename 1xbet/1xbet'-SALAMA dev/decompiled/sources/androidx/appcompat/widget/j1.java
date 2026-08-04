package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import com.salamadev.nabilalawadi.kisaskoran.R;
import p155w1.C1017n0;

/* JADX INFO: loaded from: classes.dex */
public final class j1 implements InterfaceC0610c0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Toolbar f8662a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f8663b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final View f8664c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Drawable f8665d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public Drawable f8666e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final Drawable f8667f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f8668g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public CharSequence f8669h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final CharSequence f8670i;
    public final CharSequence j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public Window.Callback f8671k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public boolean f8672l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public C0623j f8673m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final int f8674n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final Drawable f8675o;

    public j1(Toolbar toolbar, boolean z4) {
        Drawable drawable;
        this.f8674n = 0;
        this.f8662a = toolbar;
        this.f8669h = toolbar.getTitle();
        this.f8670i = toolbar.getSubtitle();
        this.f8668g = this.f8669h != null;
        this.f8667f = toolbar.getNavigationIcon();
        C1017n0 c1017n0F = C1017n0.F(toolbar.getContext(), null, p051h.a.f13329a, R.attr.actionBarStyle);
        int i7 = 15;
        this.f8675o = c1017n0F.u(15);
        if (z4) {
            TypedArray typedArray = (TypedArray) c1017n0F.f17812c;
            CharSequence text = typedArray.getText(27);
            if (!TextUtils.isEmpty(text)) {
                this.f8668g = true;
                this.f8669h = text;
                if ((this.f8663b & 8) != 0) {
                    Toolbar toolbar2 = this.f8662a;
                    toolbar2.setTitle(text);
                    if (this.f8668g) {
                        P.U.i(toolbar2.getRootView(), text);
                    }
                }
            }
            CharSequence text2 = typedArray.getText(25);
            if (!TextUtils.isEmpty(text2)) {
                this.f8670i = text2;
                if ((this.f8663b & 8) != 0) {
                    toolbar.setSubtitle(text2);
                }
            }
            Drawable drawableU = c1017n0F.u(20);
            if (drawableU != null) {
                this.f8666e = drawableU;
                c();
            }
            Drawable drawableU2 = c1017n0F.u(17);
            if (drawableU2 != null) {
                this.f8665d = drawableU2;
                c();
            }
            if (this.f8667f == null && (drawable = this.f8675o) != null) {
                this.f8667f = drawable;
                int i8 = this.f8663b & 4;
                Toolbar toolbar3 = this.f8662a;
                if (i8 != 0) {
                    toolbar3.setNavigationIcon(drawable);
                } else {
                    toolbar3.setNavigationIcon((Drawable) null);
                }
            }
            a(typedArray.getInt(10, 0));
            int resourceId = typedArray.getResourceId(9, 0);
            if (resourceId != 0) {
                View viewInflate = LayoutInflater.from(toolbar.getContext()).inflate(resourceId, (ViewGroup) toolbar, false);
                View view = this.f8664c;
                if (view != null && (this.f8663b & 16) != 0) {
                    toolbar.removeView(view);
                }
                this.f8664c = viewInflate;
                if (viewInflate != null && (this.f8663b & 16) != 0) {
                    toolbar.addView(viewInflate);
                }
                a(this.f8663b | 16);
            }
            int layoutDimension = typedArray.getLayoutDimension(13, 0);
            if (layoutDimension > 0) {
                ViewGroup.LayoutParams layoutParams = toolbar.getLayoutParams();
                layoutParams.height = layoutDimension;
                toolbar.setLayoutParams(layoutParams);
            }
            int dimensionPixelOffset = typedArray.getDimensionPixelOffset(7, -1);
            int dimensionPixelOffset2 = typedArray.getDimensionPixelOffset(3, -1);
            if (dimensionPixelOffset >= 0 || dimensionPixelOffset2 >= 0) {
                int iMax = Math.max(dimensionPixelOffset, 0);
                int iMax2 = Math.max(dimensionPixelOffset2, 0);
                toolbar.d();
                toolbar.f8519K.a(iMax, iMax2);
            }
            int resourceId2 = typedArray.getResourceId(28, 0);
            if (resourceId2 != 0) {
                Context context = toolbar.getContext();
                toolbar.f8511C = resourceId2;
                AppCompatTextView appCompatTextView = toolbar.f8534b;
                if (appCompatTextView != null) {
                    appCompatTextView.setTextAppearance(context, resourceId2);
                }
            }
            int resourceId3 = typedArray.getResourceId(26, 0);
            if (resourceId3 != 0) {
                Context context2 = toolbar.getContext();
                toolbar.f8512D = resourceId3;
                AppCompatTextView appCompatTextView2 = toolbar.f8536c;
                if (appCompatTextView2 != null) {
                    appCompatTextView2.setTextAppearance(context2, resourceId3);
                }
            }
            int resourceId4 = typedArray.getResourceId(22, 0);
            if (resourceId4 != 0) {
                toolbar.setPopupTheme(resourceId4);
            }
        } else {
            if (toolbar.getNavigationIcon() != null) {
                this.f8675o = toolbar.getNavigationIcon();
            } else {
                i7 = 11;
            }
            this.f8663b = i7;
        }
        c1017n0F.H();
        if (R.string.abc_action_bar_up_description != this.f8674n) {
            this.f8674n = R.string.abc_action_bar_up_description;
            if (TextUtils.isEmpty(toolbar.getNavigationContentDescription())) {
                int i9 = this.f8674n;
                this.j = i9 != 0 ? toolbar.getContext().getString(i9) : null;
                b();
            }
        }
        this.j = toolbar.getNavigationContentDescription();
        toolbar.setNavigationOnClickListener(new h1(this));
    }

    public final void a(int i7) {
        View view;
        int i8 = this.f8663b ^ i7;
        this.f8663b = i7;
        if (i8 != 0) {
            if ((i8 & 4) != 0) {
                if ((i7 & 4) != 0) {
                    b();
                }
                int i9 = this.f8663b & 4;
                Toolbar toolbar = this.f8662a;
                if (i9 != 0) {
                    Drawable drawable = this.f8667f;
                    if (drawable == null) {
                        drawable = this.f8675o;
                    }
                    toolbar.setNavigationIcon(drawable);
                } else {
                    toolbar.setNavigationIcon((Drawable) null);
                }
            }
            if ((i8 & 3) != 0) {
                c();
            }
            int i10 = i8 & 8;
            Toolbar toolbar2 = this.f8662a;
            if (i10 != 0) {
                if ((i7 & 8) != 0) {
                    toolbar2.setTitle(this.f8669h);
                    toolbar2.setSubtitle(this.f8670i);
                } else {
                    toolbar2.setTitle((CharSequence) null);
                    toolbar2.setSubtitle((CharSequence) null);
                }
            }
            if ((i8 & 16) == 0 || (view = this.f8664c) == null) {
                return;
            }
            if ((i7 & 16) != 0) {
                toolbar2.addView(view);
            } else {
                toolbar2.removeView(view);
            }
        }
    }

    public final void b() {
        if ((this.f8663b & 4) != 0) {
            boolean zIsEmpty = TextUtils.isEmpty(this.j);
            Toolbar toolbar = this.f8662a;
            if (zIsEmpty) {
                toolbar.setNavigationContentDescription(this.f8674n);
            } else {
                toolbar.setNavigationContentDescription(this.j);
            }
        }
    }

    public final void c() {
        Drawable drawable;
        int i7 = this.f8663b;
        if ((i7 & 2) == 0) {
            drawable = null;
        } else if ((i7 & 1) == 0 || (drawable = this.f8666e) == null) {
            drawable = this.f8665d;
        }
        this.f8662a.setLogo(drawable);
    }
}
