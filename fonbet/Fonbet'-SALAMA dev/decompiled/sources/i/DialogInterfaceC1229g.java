package i;

import P.InterfaceC0355k;
import P.J;
import P.U;
import a.AbstractC0603a;
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
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ListAdapter;
import android.widget.TextView;
import androidx.appcompat.app.AlertController$RecycleListView;
import androidx.appcompat.widget.C0657p0;
import androidx.core.widget.NestedScrollView;
import com.salamadev.khotabaljomo3a.kichkabdelhamid.R;
import java.util.WeakHashMap;
import l.AbstractC1364b;
import l.InterfaceC1363a;

/* renamed from: i.g, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class DialogInterfaceC1229g extends androidx.activity.p implements DialogInterface, InterfaceC1232j {

    /* renamed from: d, reason: collision with root package name */
    public v f13702d;

    /* renamed from: e, reason: collision with root package name */
    public final w f13703e;

    /* renamed from: f, reason: collision with root package name */
    public final C1228f f13704f;

    /* JADX WARN: Illegal instructions before constructor call */
    /* JADX WARN: Type inference failed for: r2v2, types: [i.w] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public DialogInterfaceC1229g(ContextThemeWrapper contextThemeWrapper, int i7) {
        super(contextThemeWrapper, r2);
        int i8;
        int f7 = f(i7, contextThemeWrapper);
        if (f7 == 0) {
            TypedValue typedValue = new TypedValue();
            contextThemeWrapper.getTheme().resolveAttribute(R.attr.dialogTheme, typedValue, true);
            i8 = typedValue.resourceId;
        } else {
            i8 = f7;
        }
        this.f13703e = new InterfaceC0355k() { // from class: i.w
            @Override // P.InterfaceC0355k
            public final boolean superDispatchKeyEvent(KeyEvent keyEvent) {
                return DialogInterfaceC1229g.this.h(keyEvent);
            }
        };
        m d7 = d();
        if (f7 == 0) {
            TypedValue typedValue2 = new TypedValue();
            contextThemeWrapper.getTheme().resolveAttribute(R.attr.dialogTheme, typedValue2, true);
            f7 = typedValue2.resourceId;
        }
        ((v) d7).f13783k0 = f7;
        d7.f();
        this.f13704f = new C1228f(getContext(), this, getWindow());
    }

    public static int f(int i7, Context context) {
        if (((i7 >>> 24) & 255) >= 1) {
            return i7;
        }
        TypedValue typedValue = new TypedValue();
        context.getTheme().resolveAttribute(R.attr.alertDialogTheme, typedValue, true);
        return typedValue.resourceId;
    }

    @Override // androidx.activity.p, android.app.Dialog
    public final void addContentView(View view, ViewGroup.LayoutParams layoutParams) {
        v vVar = (v) d();
        vVar.x();
        ((ViewGroup) vVar.f13765R.findViewById(android.R.id.content)).addView(view, layoutParams);
        vVar.f13751D.a(vVar.f13750C.getCallback());
    }

    public final m d() {
        if (this.f13702d == null) {
            ExecutorC1215B executorC1215B = m.f13706a;
            this.f13702d = new v(getContext(), getWindow(), this, this);
        }
        return this.f13702d;
    }

    @Override // android.app.Dialog, android.content.DialogInterface
    public final void dismiss() {
        super.dismiss();
        d().g();
    }

    @Override // android.app.Dialog, android.view.Window.Callback
    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        return AbstractC0603a.S(this.f13703e, getWindow().getDecorView(), this, keyEvent);
    }

    public final void e(Bundle bundle) {
        d().a();
        super.onCreate(bundle);
        d().f();
    }

    @Override // android.app.Dialog
    public final View findViewById(int i7) {
        v vVar = (v) d();
        vVar.x();
        return vVar.f13750C.findViewById(i7);
    }

    public final void g(CharSequence charSequence) {
        super.setTitle(charSequence);
        d().m(charSequence);
    }

    public final boolean h(KeyEvent keyEvent) {
        return super.dispatchKeyEvent(keyEvent);
    }

    @Override // android.app.Dialog
    public final void invalidateOptionsMenu() {
        d().c();
    }

    /* JADX WARN: Removed duplicated region for block: B:113:0x028c  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x025b  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x0247  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x01dc  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x01bf  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x01c9  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0245  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0259  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x026c  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x029c  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x02c2  */
    @Override // androidx.activity.p, android.app.Dialog
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void onCreate(Bundle bundle) {
        int i7;
        int i8;
        boolean z4;
        int i9;
        boolean z7;
        AlertController$RecycleListView alertController$RecycleListView;
        AlertController$RecycleListView alertController$RecycleListView2;
        ListAdapter listAdapter;
        View findViewById;
        e(bundle);
        C1228f c1228f = this.f13704f;
        c1228f.f13678b.setContentView(c1228f.f13701z);
        Window window = c1228f.f13679c;
        View findViewById2 = window.findViewById(R.id.parentPanel);
        View findViewById3 = findViewById2.findViewById(R.id.topPanel);
        View findViewById4 = findViewById2.findViewById(R.id.contentPanel);
        View findViewById5 = findViewById2.findViewById(R.id.buttonPanel);
        ViewGroup viewGroup = (ViewGroup) findViewById2.findViewById(R.id.customPanel);
        FrameLayout frameLayout = c1228f.f13683g;
        if (frameLayout == null) {
            frameLayout = null;
        }
        boolean z8 = frameLayout != null;
        if (!z8 || !C1228f.a(frameLayout)) {
            window.setFlags(131072, 131072);
        }
        if (z8) {
            FrameLayout frameLayout2 = (FrameLayout) window.findViewById(R.id.custom);
            frameLayout2.addView(frameLayout, new ViewGroup.LayoutParams(-1, -1));
            if (c1228f.f13684h) {
                frameLayout2.setPadding(0, 0, 0, 0);
            }
            if (c1228f.f13682f != null) {
                ((LinearLayout.LayoutParams) ((C0657p0) viewGroup.getLayoutParams())).weight = 0.0f;
            }
        } else {
            viewGroup.setVisibility(8);
        }
        View findViewById6 = viewGroup.findViewById(R.id.topPanel);
        View findViewById7 = viewGroup.findViewById(R.id.contentPanel);
        View findViewById8 = viewGroup.findViewById(R.id.buttonPanel);
        ViewGroup b7 = C1228f.b(findViewById6, findViewById3);
        ViewGroup b8 = C1228f.b(findViewById7, findViewById4);
        ViewGroup b9 = C1228f.b(findViewById8, findViewById5);
        NestedScrollView nestedScrollView = (NestedScrollView) window.findViewById(R.id.scrollView);
        c1228f.f13693r = nestedScrollView;
        nestedScrollView.setFocusable(false);
        c1228f.f13693r.setNestedScrollingEnabled(false);
        TextView textView = (TextView) b8.findViewById(android.R.id.message);
        c1228f.f13697v = textView;
        if (textView != null) {
            String str = c1228f.f13681e;
            if (str != null) {
                textView.setText(str);
            } else {
                textView.setVisibility(8);
                c1228f.f13693r.removeView(c1228f.f13697v);
                if (c1228f.f13682f != null) {
                    ViewGroup viewGroup2 = (ViewGroup) c1228f.f13693r.getParent();
                    int indexOfChild = viewGroup2.indexOfChild(c1228f.f13693r);
                    viewGroup2.removeViewAt(indexOfChild);
                    viewGroup2.addView(c1228f.f13682f, indexOfChild, new ViewGroup.LayoutParams(-1, -1));
                } else {
                    b8.setVisibility(8);
                }
            }
        }
        Button button = (Button) b9.findViewById(android.R.id.button1);
        c1228f.f13685i = button;
        H2.e eVar = c1228f.f13676F;
        button.setOnClickListener(eVar);
        if (TextUtils.isEmpty(c1228f.j)) {
            c1228f.f13685i.setVisibility(8);
            i7 = 0;
        } else {
            c1228f.f13685i.setText(c1228f.j);
            c1228f.f13685i.setVisibility(0);
            i7 = 1;
        }
        Button button2 = (Button) b9.findViewById(android.R.id.button2);
        c1228f.f13687l = button2;
        button2.setOnClickListener(eVar);
        if (TextUtils.isEmpty(c1228f.f13688m)) {
            c1228f.f13687l.setVisibility(8);
        } else {
            c1228f.f13687l.setText(c1228f.f13688m);
            c1228f.f13687l.setVisibility(0);
            i7 |= 2;
        }
        Button button3 = (Button) b9.findViewById(android.R.id.button3);
        c1228f.f13690o = button3;
        button3.setOnClickListener(eVar);
        if (TextUtils.isEmpty(c1228f.f13691p)) {
            c1228f.f13690o.setVisibility(8);
        } else {
            c1228f.f13690o.setText(c1228f.f13691p);
            c1228f.f13690o.setVisibility(0);
            i7 |= 4;
        }
        TypedValue typedValue = new TypedValue();
        c1228f.f13677a.getTheme().resolveAttribute(R.attr.alertDialogCenterButtons, typedValue, true);
        if (typedValue.data != 0) {
            if (i7 != 1) {
                i8 = 2;
                if (i7 == 2) {
                    Button button4 = c1228f.f13687l;
                    LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) button4.getLayoutParams();
                    layoutParams.gravity = 1;
                    layoutParams.weight = 0.5f;
                    button4.setLayoutParams(layoutParams);
                } else if (i7 == 4) {
                    Button button5 = c1228f.f13690o;
                    LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) button5.getLayoutParams();
                    layoutParams2.gravity = 1;
                    layoutParams2.weight = 0.5f;
                    button5.setLayoutParams(layoutParams2);
                }
                if (i7 == 0) {
                    b9.setVisibility(8);
                }
                if (c1228f.f13698w == null) {
                    b7.addView(c1228f.f13698w, 0, new ViewGroup.LayoutParams(-1, -2));
                    window.findViewById(R.id.title_template).setVisibility(8);
                } else {
                    c1228f.f13695t = (ImageView) window.findViewById(android.R.id.icon);
                    if (TextUtils.isEmpty(c1228f.f13680d) || !c1228f.f13674D) {
                        window.findViewById(R.id.title_template).setVisibility(8);
                        c1228f.f13695t.setVisibility(8);
                        b7.setVisibility(8);
                    } else {
                        TextView textView2 = (TextView) window.findViewById(R.id.alertTitle);
                        c1228f.f13696u = textView2;
                        textView2.setText(c1228f.f13680d);
                        Drawable drawable = c1228f.f13694s;
                        if (drawable != null) {
                            c1228f.f13695t.setImageDrawable(drawable);
                        } else {
                            c1228f.f13696u.setPadding(c1228f.f13695t.getPaddingLeft(), c1228f.f13695t.getPaddingTop(), c1228f.f13695t.getPaddingRight(), c1228f.f13695t.getPaddingBottom());
                            c1228f.f13695t.setVisibility(8);
                        }
                    }
                }
                z4 = viewGroup.getVisibility() == 8;
                i9 = (b7 != null || b7.getVisibility() == 8) ? 0 : 1;
                z7 = b9.getVisibility() == 8;
                if (!z7 && (findViewById = b8.findViewById(R.id.textSpacerNoButtons)) != null) {
                    findViewById.setVisibility(0);
                }
                if (i9 == 0) {
                    NestedScrollView nestedScrollView2 = c1228f.f13693r;
                    if (nestedScrollView2 != null) {
                        nestedScrollView2.setClipToPadding(true);
                    }
                    View findViewById9 = (c1228f.f13681e == null && c1228f.f13682f == null) ? null : b7.findViewById(R.id.titleDividerNoCustom);
                    if (findViewById9 != null) {
                        findViewById9.setVisibility(0);
                    }
                } else {
                    View findViewById10 = b8.findViewById(R.id.textSpacerNoTitle);
                    if (findViewById10 != null) {
                        findViewById10.setVisibility(0);
                    }
                }
                alertController$RecycleListView = c1228f.f13682f;
                if (alertController$RecycleListView != null) {
                    alertController$RecycleListView.getClass();
                    if (!z7 || i9 == 0) {
                        alertController$RecycleListView.setPadding(alertController$RecycleListView.getPaddingLeft(), i9 != 0 ? alertController$RecycleListView.getPaddingTop() : alertController$RecycleListView.f8142a, alertController$RecycleListView.getPaddingRight(), z7 ? alertController$RecycleListView.getPaddingBottom() : alertController$RecycleListView.f8143b);
                    }
                }
                if (!z4) {
                    View view = c1228f.f13682f;
                    if (view == null) {
                        view = c1228f.f13693r;
                    }
                    if (view != null) {
                        int i10 = z7 ? i8 : 0;
                        View findViewById11 = window.findViewById(R.id.scrollIndicatorUp);
                        View findViewById12 = window.findViewById(R.id.scrollIndicatorDown);
                        WeakHashMap weakHashMap = U.f5037a;
                        J.d(view, i9 | i10, 3);
                        if (findViewById11 != null) {
                            b8.removeView(findViewById11);
                        }
                        if (findViewById12 != null) {
                            b8.removeView(findViewById12);
                        }
                    }
                }
                alertController$RecycleListView2 = c1228f.f13682f;
                if (alertController$RecycleListView2 != null || (listAdapter = c1228f.f13699x) == null) {
                }
                alertController$RecycleListView2.setAdapter(listAdapter);
                int i11 = c1228f.f13700y;
                if (i11 > -1) {
                    alertController$RecycleListView2.setItemChecked(i11, true);
                    alertController$RecycleListView2.setSelection(i11);
                    return;
                }
                return;
            }
            Button button6 = c1228f.f13685i;
            LinearLayout.LayoutParams layoutParams3 = (LinearLayout.LayoutParams) button6.getLayoutParams();
            layoutParams3.gravity = 1;
            layoutParams3.weight = 0.5f;
            button6.setLayoutParams(layoutParams3);
        }
        i8 = 2;
        if (i7 == 0) {
        }
        if (c1228f.f13698w == null) {
        }
        if (viewGroup.getVisibility() == 8) {
        }
        if (b7 != null) {
        }
        if (b9.getVisibility() == 8) {
        }
        if (!z7) {
            findViewById.setVisibility(0);
        }
        if (i9 == 0) {
        }
        alertController$RecycleListView = c1228f.f13682f;
        if (alertController$RecycleListView != null) {
        }
        if (!z4) {
        }
        alertController$RecycleListView2 = c1228f.f13682f;
        if (alertController$RecycleListView2 != null) {
        }
    }

    @Override // android.app.Dialog, android.view.KeyEvent.Callback
    public final boolean onKeyDown(int i7, KeyEvent keyEvent) {
        NestedScrollView nestedScrollView = this.f13704f.f13693r;
        if (nestedScrollView == null || !nestedScrollView.d(keyEvent)) {
            return super.onKeyDown(i7, keyEvent);
        }
        return true;
    }

    @Override // android.app.Dialog, android.view.KeyEvent.Callback
    public final boolean onKeyUp(int i7, KeyEvent keyEvent) {
        NestedScrollView nestedScrollView = this.f13704f.f13693r;
        if (nestedScrollView == null || !nestedScrollView.d(keyEvent)) {
            return super.onKeyUp(i7, keyEvent);
        }
        return true;
    }

    @Override // androidx.activity.p, android.app.Dialog
    public final void onStop() {
        super.onStop();
        v vVar = (v) d();
        vVar.B();
        AbstractC1223a abstractC1223a = vVar.f13753F;
        if (abstractC1223a != null) {
            abstractC1223a.q(false);
        }
    }

    @Override // i.InterfaceC1232j
    public final AbstractC1364b onWindowStartingSupportActionMode(InterfaceC1363a interfaceC1363a) {
        return null;
    }

    @Override // androidx.activity.p, android.app.Dialog
    public final void setContentView(int i7) {
        d().j(i7);
    }

    @Override // android.app.Dialog
    public final void setTitle(int i7) {
        super.setTitle(i7);
        d().m(getContext().getString(i7));
    }

    @Override // androidx.activity.p, android.app.Dialog
    public final void setContentView(View view) {
        d().k(view);
    }

    @Override // androidx.activity.p, android.app.Dialog
    public final void setContentView(View view, ViewGroup.LayoutParams layoutParams) {
        d().l(view, layoutParams);
    }

    @Override // android.app.Dialog
    public final void setTitle(CharSequence charSequence) {
        g(charSequence);
        C1228f c1228f = this.f13704f;
        c1228f.f13680d = charSequence;
        TextView textView = c1228f.f13696u;
        if (textView != null) {
            textView.setText(charSequence);
        }
    }

    @Override // i.InterfaceC1232j
    public final void onSupportActionModeFinished(AbstractC1364b abstractC1364b) {
    }

    @Override // i.InterfaceC1232j
    public final void onSupportActionModeStarted(AbstractC1364b abstractC1364b) {
    }
}
