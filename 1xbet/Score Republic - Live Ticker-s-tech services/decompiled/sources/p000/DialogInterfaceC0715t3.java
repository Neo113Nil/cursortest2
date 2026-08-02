package p000;

import android.content.Context;
import android.content.DialogInterface;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.ContextThemeWrapper;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ListAdapter;
import android.widget.TextView;
import androidx.appcompat.app.AlertController$RecycleListView;
import androidx.core.widget.NestedScrollView;
import java.util.WeakHashMap;
import live.football.scorerepublic.R;

/* JADX INFO: renamed from: t3 */
/* JADX INFO: compiled from: r8-map-id-738170b7fb69b873ed7524d5270c8e05c6f5fb40ea1ade7a72c8ed7a70699269 */
/* JADX INFO: loaded from: classes.dex */
public final class DialogInterfaceC0715t3 extends DialogC0362jk implements DialogInterface, InterfaceC0938z4 {

    /* JADX INFO: renamed from: n */
    public LayoutInflaterFactory2C0828w5 f7265n;

    /* JADX INFO: renamed from: o */
    public final C0865x5 f7266o;

    /* JADX INFO: renamed from: p */
    public final C0641r3 f7267p;

    public DialogInterfaceC0715t3(ContextThemeWrapper contextThemeWrapper, int i) {
        int i2;
        int iM4666h = m4666h(contextThemeWrapper, i);
        if (iM4666h == 0) {
            TypedValue typedValue = new TypedValue();
            contextThemeWrapper.getTheme().resolveAttribute(R.attr.dialogTheme, typedValue, true);
            i2 = typedValue.resourceId;
        } else {
            i2 = iM4666h;
        }
        super(contextThemeWrapper, i2);
        this.f7266o = new C0865x5(this);
        AbstractC0274h5 abstractC0274h5M4667f = m4667f();
        if (iM4666h == 0) {
            TypedValue typedValue2 = new TypedValue();
            contextThemeWrapper.getTheme().resolveAttribute(R.attr.dialogTheme, typedValue2, true);
            iM4666h = typedValue2.resourceId;
        }
        ((LayoutInflaterFactory2C0828w5) abstractC0274h5M4667f).f8412b0 = iM4666h;
        abstractC0274h5M4667f.mo2212c();
        this.f7267p = new C0641r3(getContext(), this, getWindow());
    }

    /* JADX INFO: renamed from: h */
    public static int m4666h(Context context, int i) {
        if (((i >>> 24) & 255) >= 1) {
            return i;
        }
        TypedValue typedValue = new TypedValue();
        context.getTheme().resolveAttribute(R.attr.alertDialogTheme, typedValue, true);
        return typedValue.resourceId;
    }

    @Override // p000.DialogC0362jk, android.app.Dialog
    public final void addContentView(View view, ViewGroup.LayoutParams layoutParams) {
        m2919e();
        LayoutInflaterFactory2C0828w5 layoutInflaterFactory2C0828w5 = (LayoutInflaterFactory2C0828w5) m4667f();
        layoutInflaterFactory2C0828w5.m5252v();
        ((ViewGroup) layoutInflaterFactory2C0828w5.f8393I.findViewById(android.R.id.content)).addView(view, layoutParams);
        layoutInflaterFactory2C0828w5.f8429v.m4033a(layoutInflaterFactory2C0828w5.f8428u.getCallback());
    }

    @Override // android.app.Dialog, android.content.DialogInterface
    public final void dismiss() {
        super.dismiss();
        m4667f().mo2213d();
    }

    @Override // android.app.Dialog, android.view.Window.Callback
    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        getWindow().getDecorView();
        C0865x5 c0865x5 = this.f7266o;
        if (c0865x5 == null) {
            return false;
        }
        return super.dispatchKeyEvent(keyEvent);
    }

    /* JADX INFO: renamed from: f */
    public final AbstractC0274h5 m4667f() {
        if (this.f7265n == null) {
            ExecutorC0237g5 executorC0237g5 = AbstractC0274h5.f3053j;
            this.f7265n = new LayoutInflaterFactory2C0828w5(getContext(), getWindow(), this, this);
        }
        return this.f7265n;
    }

    @Override // android.app.Dialog
    public final View findViewById(int i) {
        LayoutInflaterFactory2C0828w5 layoutInflaterFactory2C0828w5 = (LayoutInflaterFactory2C0828w5) m4667f();
        layoutInflaterFactory2C0828w5.m5252v();
        return layoutInflaterFactory2C0828w5.f8428u.findViewById(i);
    }

    /* JADX INFO: renamed from: g */
    public final void m4668g(Bundle bundle) {
        m4667f().mo2211a();
        super.onCreate(bundle);
        m4667f().mo2212c();
    }

    /* JADX INFO: renamed from: i */
    public final void m4669i(CharSequence charSequence) {
        super.setTitle(charSequence);
        m4667f().mo2218l(charSequence);
    }

    @Override // android.app.Dialog
    public final void invalidateOptionsMenu() {
        LayoutInflaterFactory2C0828w5 layoutInflaterFactory2C0828w5 = (LayoutInflaterFactory2C0828w5) m4667f();
        if (layoutInflaterFactory2C0828w5.f8430w != null) {
            layoutInflaterFactory2C0828w5.m5256z();
            layoutInflaterFactory2C0828w5.f8430w.getClass();
            layoutInflaterFactory2C0828w5.m5237A(0);
        }
    }

    @Override // p000.DialogC0362jk, android.app.Dialog
    public final void onCreate(Bundle bundle) {
        int i;
        ListAdapter listAdapter;
        View viewFindViewById;
        m4668g(bundle);
        C0641r3 c0641r3 = this.f7267p;
        c0641r3.f6674b.setContentView(c0641r3.f6696x);
        Context context = c0641r3.f6673a;
        Window window = c0641r3.f6675c;
        View viewFindViewById2 = window.findViewById(R.id.parentPanel);
        View viewFindViewById3 = viewFindViewById2.findViewById(R.id.topPanel);
        View viewFindViewById4 = viewFindViewById2.findViewById(R.id.contentPanel);
        View viewFindViewById5 = viewFindViewById2.findViewById(R.id.buttonPanel);
        ViewGroup viewGroup = (ViewGroup) viewFindViewById2.findViewById(R.id.customPanel);
        window.setFlags(131072, 131072);
        viewGroup.setVisibility(8);
        View viewFindViewById6 = viewGroup.findViewById(R.id.topPanel);
        View viewFindViewById7 = viewGroup.findViewById(R.id.contentPanel);
        View viewFindViewById8 = viewGroup.findViewById(R.id.buttonPanel);
        ViewGroup viewGroupM4236a = C0641r3.m4236a(viewFindViewById6, viewFindViewById3);
        ViewGroup viewGroupM4236a2 = C0641r3.m4236a(viewFindViewById7, viewFindViewById4);
        ViewGroup viewGroupM4236a3 = C0641r3.m4236a(viewFindViewById8, viewFindViewById5);
        NestedScrollView nestedScrollView = (NestedScrollView) window.findViewById(R.id.scrollView);
        c0641r3.f6688p = nestedScrollView;
        nestedScrollView.setFocusable(false);
        c0641r3.f6688p.setNestedScrollingEnabled(false);
        TextView textView = (TextView) viewGroupM4236a2.findViewById(android.R.id.message);
        c0641r3.f6692t = textView;
        if (textView != null) {
            String str = c0641r3.f6677e;
            if (str != null) {
                textView.setText(str);
            } else {
                textView.setVisibility(8);
                c0641r3.f6688p.removeView(c0641r3.f6692t);
                if (c0641r3.f6678f != null) {
                    ViewGroup viewGroup2 = (ViewGroup) c0641r3.f6688p.getParent();
                    int iIndexOfChild = viewGroup2.indexOfChild(c0641r3.f6688p);
                    viewGroup2.removeViewAt(iIndexOfChild);
                    viewGroup2.addView(c0641r3.f6678f, iIndexOfChild, new ViewGroup.LayoutParams(-1, -1));
                } else {
                    viewGroupM4236a2.setVisibility(8);
                }
            }
        }
        Button button = (Button) viewGroupM4236a3.findViewById(android.R.id.button1);
        c0641r3.f6679g = button;
        ViewOnClickListenerC0123d2 viewOnClickListenerC0123d2 = c0641r3.f6672D;
        button.setOnClickListener(viewOnClickListenerC0123d2);
        boolean zIsEmpty = TextUtils.isEmpty(c0641r3.f6680h);
        Button button2 = c0641r3.f6679g;
        if (zIsEmpty) {
            button2.setVisibility(8);
            i = 0;
        } else {
            button2.setText(c0641r3.f6680h);
            c0641r3.f6679g.setVisibility(0);
            i = 1;
        }
        Button button3 = (Button) viewGroupM4236a3.findViewById(android.R.id.button2);
        c0641r3.f6682j = button3;
        button3.setOnClickListener(viewOnClickListenerC0123d2);
        boolean zIsEmpty2 = TextUtils.isEmpty(c0641r3.f6683k);
        Button button4 = c0641r3.f6682j;
        if (zIsEmpty2) {
            button4.setVisibility(8);
        } else {
            button4.setText(c0641r3.f6683k);
            c0641r3.f6682j.setVisibility(0);
            i |= 2;
        }
        Button button5 = (Button) viewGroupM4236a3.findViewById(android.R.id.button3);
        c0641r3.f6685m = button5;
        button5.setOnClickListener(viewOnClickListenerC0123d2);
        boolean zIsEmpty3 = TextUtils.isEmpty(c0641r3.f6686n);
        Button button6 = c0641r3.f6685m;
        if (zIsEmpty3) {
            button6.setVisibility(8);
        } else {
            button6.setText(c0641r3.f6686n);
            c0641r3.f6685m.setVisibility(0);
            i |= 4;
        }
        TypedValue typedValue = new TypedValue();
        context.getTheme().resolveAttribute(R.attr.alertDialogCenterButtons, typedValue, true);
        if (typedValue.data != 0) {
            if (i == 1) {
                Button button7 = c0641r3.f6679g;
                LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) button7.getLayoutParams();
                layoutParams.gravity = 1;
                layoutParams.weight = 0.5f;
                button7.setLayoutParams(layoutParams);
            } else if (i == 2) {
                Button button8 = c0641r3.f6682j;
                LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) button8.getLayoutParams();
                layoutParams2.gravity = 1;
                layoutParams2.weight = 0.5f;
                button8.setLayoutParams(layoutParams2);
            } else if (i == 4) {
                Button button9 = c0641r3.f6685m;
                LinearLayout.LayoutParams layoutParams3 = (LinearLayout.LayoutParams) button9.getLayoutParams();
                layoutParams3.gravity = 1;
                layoutParams3.weight = 0.5f;
                button9.setLayoutParams(layoutParams3);
            }
        }
        if (i == 0) {
            viewGroupM4236a3.setVisibility(8);
        }
        if (c0641r3.f6693u != null) {
            viewGroupM4236a.addView(c0641r3.f6693u, 0, new ViewGroup.LayoutParams(-1, -2));
            window.findViewById(R.id.title_template).setVisibility(8);
        } else {
            c0641r3.f6690r = (ImageView) window.findViewById(android.R.id.icon);
            if (TextUtils.isEmpty(c0641r3.f6676d) || !c0641r3.f6670B) {
                window.findViewById(R.id.title_template).setVisibility(8);
                c0641r3.f6690r.setVisibility(8);
                viewGroupM4236a.setVisibility(8);
            } else {
                TextView textView2 = (TextView) window.findViewById(R.id.alertTitle);
                c0641r3.f6691s = textView2;
                textView2.setText(c0641r3.f6676d);
                Drawable drawable = c0641r3.f6689q;
                if (drawable != null) {
                    c0641r3.f6690r.setImageDrawable(drawable);
                } else {
                    c0641r3.f6691s.setPadding(c0641r3.f6690r.getPaddingLeft(), c0641r3.f6690r.getPaddingTop(), c0641r3.f6690r.getPaddingRight(), c0641r3.f6690r.getPaddingBottom());
                    c0641r3.f6690r.setVisibility(8);
                }
            }
        }
        boolean z = viewGroup.getVisibility() != 8;
        int i2 = (viewGroupM4236a == null || viewGroupM4236a.getVisibility() == 8) ? 0 : 1;
        boolean z2 = viewGroupM4236a3.getVisibility() != 8;
        if (!z2 && (viewFindViewById = viewGroupM4236a2.findViewById(R.id.textSpacerNoButtons)) != null) {
            viewFindViewById.setVisibility(0);
        }
        if (i2 != 0) {
            NestedScrollView nestedScrollView2 = c0641r3.f6688p;
            if (nestedScrollView2 != null) {
                nestedScrollView2.setClipToPadding(true);
            }
            View viewFindViewById9 = (c0641r3.f6677e == null && c0641r3.f6678f == null) ? null : viewGroupM4236a.findViewById(R.id.titleDividerNoCustom);
            if (viewFindViewById9 != null) {
                viewFindViewById9.setVisibility(0);
            }
        } else {
            View viewFindViewById10 = viewGroupM4236a2.findViewById(R.id.textSpacerNoTitle);
            if (viewFindViewById10 != null) {
                viewFindViewById10.setVisibility(0);
            }
        }
        AlertController$RecycleListView alertController$RecycleListView = c0641r3.f6678f;
        if (alertController$RecycleListView != null && (!z2 || i2 == 0)) {
            alertController$RecycleListView.setPadding(alertController$RecycleListView.getPaddingLeft(), i2 != 0 ? alertController$RecycleListView.getPaddingTop() : alertController$RecycleListView.f298j, alertController$RecycleListView.getPaddingRight(), z2 ? alertController$RecycleListView.getPaddingBottom() : alertController$RecycleListView.f299k);
        }
        if (!z) {
            View view = c0641r3.f6678f;
            if (view == null) {
                view = c0641r3.f6688p;
            }
            if (view != null) {
                int i3 = z2 ? 2 : 0;
                View viewFindViewById11 = window.findViewById(R.id.scrollIndicatorUp);
                View viewFindViewById12 = window.findViewById(R.id.scrollIndicatorDown);
                WeakHashMap weakHashMap = ai1.f194a;
                view.setScrollIndicators(i2 | i3, 3);
                if (viewFindViewById11 != null) {
                    viewGroupM4236a2.removeView(viewFindViewById11);
                }
                if (viewFindViewById12 != null) {
                    viewGroupM4236a2.removeView(viewFindViewById12);
                }
            }
        }
        AlertController$RecycleListView alertController$RecycleListView2 = c0641r3.f6678f;
        if (alertController$RecycleListView2 == null || (listAdapter = c0641r3.f6694v) == null) {
            return;
        }
        alertController$RecycleListView2.setAdapter(listAdapter);
        int i4 = c0641r3.f6695w;
        if (i4 > -1) {
            alertController$RecycleListView2.setItemChecked(i4, true);
            alertController$RecycleListView2.setSelection(i4);
        }
    }

    @Override // android.app.Dialog, android.view.KeyEvent.Callback
    public final boolean onKeyDown(int i, KeyEvent keyEvent) {
        NestedScrollView nestedScrollView = this.f7267p.f6688p;
        if (nestedScrollView == null || !nestedScrollView.m398j(keyEvent)) {
            return super.onKeyDown(i, keyEvent);
        }
        return true;
    }

    @Override // android.app.Dialog, android.view.KeyEvent.Callback
    public final boolean onKeyUp(int i, KeyEvent keyEvent) {
        NestedScrollView nestedScrollView = this.f7267p.f6688p;
        if (nestedScrollView == null || !nestedScrollView.m398j(keyEvent)) {
            return super.onKeyUp(i, keyEvent);
        }
        return true;
    }

    @Override // p000.DialogC0362jk, android.app.Dialog
    public final void onStop() {
        super.onStop();
        LayoutInflaterFactory2C0828w5 layoutInflaterFactory2C0828w5 = (LayoutInflaterFactory2C0828w5) m4667f();
        layoutInflaterFactory2C0828w5.m5256z();
        hj1 hj1Var = layoutInflaterFactory2C0828w5.f8430w;
        if (hj1Var != null) {
            hj1Var.f3246t = false;
            ki1 ki1Var = hj1Var.f3245s;
            if (ki1Var != null) {
                ki1Var.m3045a();
            }
        }
    }

    @Override // p000.DialogC0362jk, android.app.Dialog
    public final void setContentView(int i) {
        m2919e();
        m4667f().mo2215h(i);
    }

    @Override // android.app.Dialog
    public final void setTitle(int i) {
        super.setTitle(i);
        m4667f().mo2218l(getContext().getString(i));
    }

    @Override // p000.DialogC0362jk, android.app.Dialog
    public final void setContentView(View view) {
        m2919e();
        m4667f().mo2216j(view);
    }

    @Override // p000.DialogC0362jk, android.app.Dialog
    public final void setContentView(View view, ViewGroup.LayoutParams layoutParams) {
        m2919e();
        m4667f().mo2217k(view, layoutParams);
    }

    @Override // android.app.Dialog
    public final void setTitle(CharSequence charSequence) {
        m4669i(charSequence);
        C0641r3 c0641r3 = this.f7267p;
        c0641r3.f6676d = charSequence;
        TextView textView = c0641r3.f6691s;
        if (textView != null) {
            textView.setText(charSequence);
        }
    }
}
