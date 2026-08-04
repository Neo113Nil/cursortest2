package p058i;

import H2.e;
import P.InterfaceC0355k;
import P.J;
import P.U;
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
import androidx.activity.p;
import androidx.appcompat.app.AlertController$RecycleListView;
import androidx.appcompat.widget.C0636p0;
import androidx.core.widget.NestedScrollView;
import com.salamadev.nabilalawadi.kisaskoran.R;
import java.util.WeakHashMap;
import p003a.a;
import p078l.b;

/* JADX INFO: renamed from: i.g, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class DialogInterfaceC0910g extends p implements DialogInterface, j {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public v f13708d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final w f13709e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final C0909f f13710f;

    /* JADX WARN: Type inference failed for: r2v2, types: [i.w] */
    public DialogInterfaceC0910g(ContextThemeWrapper contextThemeWrapper, int i7) {
        int i8;
        int iF = f(i7, contextThemeWrapper);
        if (iF == 0) {
            TypedValue typedValue = new TypedValue();
            contextThemeWrapper.getTheme().resolveAttribute(R.attr.dialogTheme, typedValue, true);
            i8 = typedValue.resourceId;
        } else {
            i8 = iF;
        }
        super(contextThemeWrapper, i8);
        this.f13709e = new InterfaceC0355k() { // from class: i.w
            @Override // P.InterfaceC0355k
            public final boolean superDispatchKeyEvent(KeyEvent keyEvent) {
                return this.f13803a.h(keyEvent);
            }
        };
        m mVarD = d();
        if (iF == 0) {
            TypedValue typedValue2 = new TypedValue();
            contextThemeWrapper.getTheme().resolveAttribute(R.attr.dialogTheme, typedValue2, true);
            iF = typedValue2.resourceId;
        }
        ((v) mVarD).f13789k0 = iF;
        mVarD.f();
        this.f13710f = new C0909f(getContext(), this, getWindow());
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
        ((ViewGroup) vVar.f13771R.findViewById(android.R.id.content)).addView(view, layoutParams);
        vVar.f13757D.a(vVar.f13756C.getCallback());
    }

    public final m d() {
        if (this.f13708d == null) {
            B b7 = m.f13712a;
            this.f13708d = new v(getContext(), getWindow(), this, this);
        }
        return this.f13708d;
    }

    @Override // android.app.Dialog, android.content.DialogInterface
    public final void dismiss() {
        super.dismiss();
        d().g();
    }

    @Override // android.app.Dialog, android.view.Window.Callback
    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        return a.S(this.f13709e, getWindow().getDecorView(), this, keyEvent);
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
        return vVar.f13756C.findViewById(i7);
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

    @Override // androidx.activity.p, android.app.Dialog
    public final void onCreate(Bundle bundle) {
        int i7;
        int i8;
        ListAdapter listAdapter;
        View viewFindViewById;
        e(bundle);
        C0909f c0909f = this.f13710f;
        c0909f.f13684b.setContentView(c0909f.f13707z);
        Window window = c0909f.f13685c;
        View viewFindViewById2 = window.findViewById(R.id.parentPanel);
        View viewFindViewById3 = viewFindViewById2.findViewById(R.id.topPanel);
        View viewFindViewById4 = viewFindViewById2.findViewById(R.id.contentPanel);
        View viewFindViewById5 = viewFindViewById2.findViewById(R.id.buttonPanel);
        ViewGroup viewGroup = (ViewGroup) viewFindViewById2.findViewById(R.id.customPanel);
        FrameLayout frameLayout = c0909f.f13689g;
        if (frameLayout == null) {
            frameLayout = null;
        }
        boolean z4 = frameLayout != null;
        if (!z4 || !C0909f.a(frameLayout)) {
            window.setFlags(131072, 131072);
        }
        if (z4) {
            FrameLayout frameLayout2 = (FrameLayout) window.findViewById(R.id.custom);
            frameLayout2.addView(frameLayout, new ViewGroup.LayoutParams(-1, -1));
            if (c0909f.f13690h) {
                frameLayout2.setPadding(0, 0, 0, 0);
            }
            if (c0909f.f13688f != null) {
                ((LinearLayout.LayoutParams) ((C0636p0) viewGroup.getLayoutParams())).weight = 0.0f;
            }
        } else {
            viewGroup.setVisibility(8);
        }
        View viewFindViewById6 = viewGroup.findViewById(R.id.topPanel);
        View viewFindViewById7 = viewGroup.findViewById(R.id.contentPanel);
        View viewFindViewById8 = viewGroup.findViewById(R.id.buttonPanel);
        ViewGroup viewGroupB = C0909f.b(viewFindViewById6, viewFindViewById3);
        ViewGroup viewGroupB2 = C0909f.b(viewFindViewById7, viewFindViewById4);
        ViewGroup viewGroupB3 = C0909f.b(viewFindViewById8, viewFindViewById5);
        NestedScrollView nestedScrollView = (NestedScrollView) window.findViewById(R.id.scrollView);
        c0909f.f13699r = nestedScrollView;
        nestedScrollView.setFocusable(false);
        c0909f.f13699r.setNestedScrollingEnabled(false);
        TextView textView = (TextView) viewGroupB2.findViewById(android.R.id.message);
        c0909f.f13703v = textView;
        if (textView != null) {
            String str = c0909f.f13687e;
            if (str != null) {
                textView.setText(str);
            } else {
                textView.setVisibility(8);
                c0909f.f13699r.removeView(c0909f.f13703v);
                if (c0909f.f13688f != null) {
                    ViewGroup viewGroup2 = (ViewGroup) c0909f.f13699r.getParent();
                    int iIndexOfChild = viewGroup2.indexOfChild(c0909f.f13699r);
                    viewGroup2.removeViewAt(iIndexOfChild);
                    viewGroup2.addView(c0909f.f13688f, iIndexOfChild, new ViewGroup.LayoutParams(-1, -1));
                } else {
                    viewGroupB2.setVisibility(8);
                }
            }
        }
        Button button = (Button) viewGroupB3.findViewById(android.R.id.button1);
        c0909f.f13691i = button;
        e eVar = c0909f.f13682F;
        button.setOnClickListener(eVar);
        if (TextUtils.isEmpty(c0909f.j)) {
            c0909f.f13691i.setVisibility(8);
            i7 = 0;
        } else {
            c0909f.f13691i.setText(c0909f.j);
            c0909f.f13691i.setVisibility(0);
            i7 = 1;
        }
        Button button2 = (Button) viewGroupB3.findViewById(android.R.id.button2);
        c0909f.f13693l = button2;
        button2.setOnClickListener(eVar);
        if (TextUtils.isEmpty(c0909f.f13694m)) {
            c0909f.f13693l.setVisibility(8);
        } else {
            c0909f.f13693l.setText(c0909f.f13694m);
            c0909f.f13693l.setVisibility(0);
            i7 |= 2;
        }
        Button button3 = (Button) viewGroupB3.findViewById(android.R.id.button3);
        c0909f.f13696o = button3;
        button3.setOnClickListener(eVar);
        if (TextUtils.isEmpty(c0909f.f13697p)) {
            c0909f.f13696o.setVisibility(8);
        } else {
            c0909f.f13696o.setText(c0909f.f13697p);
            c0909f.f13696o.setVisibility(0);
            i7 |= 4;
        }
        TypedValue typedValue = new TypedValue();
        c0909f.f13683a.getTheme().resolveAttribute(R.attr.alertDialogCenterButtons, typedValue, true);
        if (typedValue.data == 0) {
            i8 = 2;
        } else if (i7 == 1) {
            Button button4 = c0909f.f13691i;
            LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) button4.getLayoutParams();
            layoutParams.gravity = 1;
            layoutParams.weight = 0.5f;
            button4.setLayoutParams(layoutParams);
            i8 = 2;
        } else {
            i8 = 2;
            if (i7 == 2) {
                Button button5 = c0909f.f13693l;
                LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) button5.getLayoutParams();
                layoutParams2.gravity = 1;
                layoutParams2.weight = 0.5f;
                button5.setLayoutParams(layoutParams2);
            } else if (i7 == 4) {
                Button button6 = c0909f.f13696o;
                LinearLayout.LayoutParams layoutParams3 = (LinearLayout.LayoutParams) button6.getLayoutParams();
                layoutParams3.gravity = 1;
                layoutParams3.weight = 0.5f;
                button6.setLayoutParams(layoutParams3);
            }
        }
        if (i7 == 0) {
            viewGroupB3.setVisibility(8);
        }
        if (c0909f.f13704w != null) {
            viewGroupB.addView(c0909f.f13704w, 0, new ViewGroup.LayoutParams(-1, -2));
            window.findViewById(R.id.title_template).setVisibility(8);
        } else {
            c0909f.f13701t = (ImageView) window.findViewById(android.R.id.icon);
            if (TextUtils.isEmpty(c0909f.f13686d) || !c0909f.f13680D) {
                window.findViewById(R.id.title_template).setVisibility(8);
                c0909f.f13701t.setVisibility(8);
                viewGroupB.setVisibility(8);
            } else {
                TextView textView2 = (TextView) window.findViewById(R.id.alertTitle);
                c0909f.f13702u = textView2;
                textView2.setText(c0909f.f13686d);
                Drawable drawable = c0909f.f13700s;
                if (drawable != null) {
                    c0909f.f13701t.setImageDrawable(drawable);
                } else {
                    c0909f.f13702u.setPadding(c0909f.f13701t.getPaddingLeft(), c0909f.f13701t.getPaddingTop(), c0909f.f13701t.getPaddingRight(), c0909f.f13701t.getPaddingBottom());
                    c0909f.f13701t.setVisibility(8);
                }
            }
        }
        boolean z7 = viewGroup.getVisibility() != 8;
        int i9 = (viewGroupB == null || viewGroupB.getVisibility() == 8) ? 0 : 1;
        boolean z8 = viewGroupB3.getVisibility() != 8;
        if (!z8 && (viewFindViewById = viewGroupB2.findViewById(R.id.textSpacerNoButtons)) != null) {
            viewFindViewById.setVisibility(0);
        }
        if (i9 != 0) {
            NestedScrollView nestedScrollView2 = c0909f.f13699r;
            if (nestedScrollView2 != null) {
                nestedScrollView2.setClipToPadding(true);
            }
            View viewFindViewById9 = (c0909f.f13687e == null && c0909f.f13688f == null) ? null : viewGroupB.findViewById(R.id.titleDividerNoCustom);
            if (viewFindViewById9 != null) {
                viewFindViewById9.setVisibility(0);
            }
        } else {
            View viewFindViewById10 = viewGroupB2.findViewById(R.id.textSpacerNoTitle);
            if (viewFindViewById10 != null) {
                viewFindViewById10.setVisibility(0);
            }
        }
        AlertController$RecycleListView alertController$RecycleListView = c0909f.f13688f;
        if (alertController$RecycleListView != null) {
            alertController$RecycleListView.getClass();
            if (!z8 || i9 == 0) {
                alertController$RecycleListView.setPadding(alertController$RecycleListView.getPaddingLeft(), i9 != 0 ? alertController$RecycleListView.getPaddingTop() : alertController$RecycleListView.f8142a, alertController$RecycleListView.getPaddingRight(), z8 ? alertController$RecycleListView.getPaddingBottom() : alertController$RecycleListView.f8143b);
            }
        }
        if (!z7) {
            View view = c0909f.f13688f;
            if (view == null) {
                view = c0909f.f13699r;
            }
            if (view != null) {
                int i10 = z8 ? i8 : 0;
                View viewFindViewById11 = window.findViewById(R.id.scrollIndicatorUp);
                View viewFindViewById12 = window.findViewById(R.id.scrollIndicatorDown);
                WeakHashMap weakHashMap = U.f5037a;
                J.d(view, i9 | i10, 3);
                if (viewFindViewById11 != null) {
                    viewGroupB2.removeView(viewFindViewById11);
                }
                if (viewFindViewById12 != null) {
                    viewGroupB2.removeView(viewFindViewById12);
                }
            }
        }
        AlertController$RecycleListView alertController$RecycleListView2 = c0909f.f13688f;
        if (alertController$RecycleListView2 == null || (listAdapter = c0909f.f13705x) == null) {
            return;
        }
        alertController$RecycleListView2.setAdapter(listAdapter);
        int i11 = c0909f.f13706y;
        if (i11 > -1) {
            alertController$RecycleListView2.setItemChecked(i11, true);
            alertController$RecycleListView2.setSelection(i11);
        }
    }

    @Override // android.app.Dialog, android.view.KeyEvent.Callback
    public final boolean onKeyDown(int i7, KeyEvent keyEvent) {
        NestedScrollView nestedScrollView = this.f13710f.f13699r;
        if (nestedScrollView == null || !nestedScrollView.d(keyEvent)) {
            return super.onKeyDown(i7, keyEvent);
        }
        return true;
    }

    @Override // android.app.Dialog, android.view.KeyEvent.Callback
    public final boolean onKeyUp(int i7, KeyEvent keyEvent) {
        NestedScrollView nestedScrollView = this.f13710f.f13699r;
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
        AbstractC0904a abstractC0904a = vVar.f13759F;
        if (abstractC0904a != null) {
            abstractC0904a.q(false);
        }
    }

    @Override // p058i.j
    public final b onWindowStartingSupportActionMode(p078l.a aVar) {
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
        C0909f c0909f = this.f13710f;
        c0909f.f13686d = charSequence;
        TextView textView = c0909f.f13702u;
        if (textView != null) {
            textView.setText(charSequence);
        }
    }

    @Override // p058i.j
    public final void onSupportActionModeFinished(b bVar) {
    }

    @Override // p058i.j
    public final void onSupportActionModeStarted(b bVar) {
    }
}
