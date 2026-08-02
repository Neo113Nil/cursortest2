package androidx.appcompat.view.menu;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Button;
import androidx.appcompat.view.menu.g;
import androidx.appcompat.view.menu.n;
import androidx.appcompat.widget.ActionMenuView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.appcompat.widget.K;
import androidx.appcompat.widget.g0;
import i.C6977a;
import m.InterfaceC7975b;

/* loaded from: classes8.dex */
public class ActionMenuItemView extends AppCompatTextView implements n.a, View.OnClickListener, ActionMenuView.a {

    /* renamed from: a, reason: collision with root package name */
    i f37319a;

    /* renamed from: b, reason: collision with root package name */
    private CharSequence f37320b;

    /* renamed from: c, reason: collision with root package name */
    private Drawable f37321c;

    /* renamed from: d, reason: collision with root package name */
    g.b f37322d;

    /* renamed from: e, reason: collision with root package name */
    private K f37323e;

    /* renamed from: f, reason: collision with root package name */
    b f37324f;

    /* renamed from: g, reason: collision with root package name */
    private boolean f37325g;

    /* renamed from: i, reason: collision with root package name */
    private int f37326i;

    /* renamed from: j, reason: collision with root package name */
    private int f37327j;

    /* renamed from: k, reason: collision with root package name */
    private int f37328k;

    private class a extends K {
        public a() {
            super(ActionMenuItemView.this);
        }

        @Override // androidx.appcompat.widget.K
        public final InterfaceC7975b b() {
            b bVar = ActionMenuItemView.this.f37324f;
            if (bVar != null) {
                return bVar.a();
            }
            return null;
        }

        @Override // androidx.appcompat.widget.K
        protected final boolean c() {
            InterfaceC7975b b11;
            ActionMenuItemView actionMenuItemView = ActionMenuItemView.this;
            g.b bVar = actionMenuItemView.f37322d;
            return bVar != null && bVar.f(actionMenuItemView.f37319a) && (b11 = b()) != null && b11.a();
        }
    }

    public static abstract class b {
        public abstract InterfaceC7975b a();
    }

    public ActionMenuItemView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        Resources resources = context.getResources();
        this.f37325g = h();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C6977a.f65649c, 0, 0);
        this.f37326i = obtainStyledAttributes.getDimensionPixelSize(0, 0);
        obtainStyledAttributes.recycle();
        this.f37328k = (int) ((resources.getDisplayMetrics().density * 32.0f) + 0.5f);
        setOnClickListener(this);
        this.f37327j = -1;
        setSaveEnabled(false);
    }

    private boolean h() {
        Configuration configuration = getContext().getResources().getConfiguration();
        int i11 = configuration.screenWidthDp;
        int i12 = configuration.screenHeightDp;
        if (i11 < 480) {
            return (i11 >= 640 && i12 >= 480) || configuration.orientation == 2;
        }
        return true;
    }

    private void i() {
        boolean z11 = true;
        boolean z12 = !TextUtils.isEmpty(this.f37320b);
        if (this.f37321c != null && (!this.f37319a.u() || !this.f37325g)) {
            z11 = false;
        }
        boolean z13 = z12 & z11;
        setText(z13 ? this.f37320b : null);
        CharSequence contentDescription = this.f37319a.getContentDescription();
        if (TextUtils.isEmpty(contentDescription)) {
            setContentDescription(z13 ? null : this.f37319a.getTitle());
        } else {
            setContentDescription(contentDescription);
        }
        CharSequence tooltipText = this.f37319a.getTooltipText();
        if (TextUtils.isEmpty(tooltipText)) {
            g0.a(this, z13 ? null : this.f37319a.getTitle());
        } else {
            g0.a(this, tooltipText);
        }
    }

    @Override // androidx.appcompat.widget.ActionMenuView.a
    public final boolean a() {
        return !TextUtils.isEmpty(getText());
    }

    @Override // androidx.appcompat.widget.ActionMenuView.a
    public final boolean b() {
        return !TextUtils.isEmpty(getText()) && this.f37319a.getIcon() == null;
    }

    @Override // androidx.appcompat.view.menu.n.a
    public final boolean c() {
        return true;
    }

    public final void d(g.b bVar) {
        this.f37322d = bVar;
    }

    @Override // androidx.appcompat.view.menu.n.a
    public final void e(i iVar) {
        this.f37319a = iVar;
        Drawable icon = iVar.getIcon();
        this.f37321c = icon;
        if (icon != null) {
            int intrinsicWidth = icon.getIntrinsicWidth();
            int intrinsicHeight = icon.getIntrinsicHeight();
            int i11 = this.f37328k;
            if (intrinsicWidth > i11) {
                intrinsicHeight = (int) (intrinsicHeight * (i11 / intrinsicWidth));
                intrinsicWidth = i11;
            }
            if (intrinsicHeight > i11) {
                intrinsicWidth = (int) (intrinsicWidth * (i11 / intrinsicHeight));
            } else {
                i11 = intrinsicHeight;
            }
            icon.setBounds(0, 0, intrinsicWidth, i11);
        }
        setCompoundDrawables(icon, null, null, null);
        i();
        this.f37320b = iVar.h(this);
        i();
        setId(iVar.getItemId());
        setVisibility(iVar.isVisible() ? 0 : 8);
        setEnabled(iVar.isEnabled());
        if (iVar.hasSubMenu() && this.f37323e == null) {
            this.f37323e = new a();
        }
    }

    public final void f(b bVar) {
        this.f37324f = bVar;
    }

    @Override // androidx.appcompat.view.menu.n.a
    public final i g() {
        return this.f37319a;
    }

    @Override // android.widget.TextView, android.view.View
    public final CharSequence getAccessibilityClassName() {
        return Button.class.getName();
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        g.b bVar = this.f37322d;
        if (bVar != null) {
            bVar.f(this.f37319a);
        }
    }

    @Override // android.widget.TextView, android.view.View
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        this.f37325g = h();
        i();
    }

    @Override // androidx.appcompat.widget.AppCompatTextView, android.widget.TextView, android.view.View
    protected final void onMeasure(int i11, int i12) {
        int i13;
        boolean isEmpty = TextUtils.isEmpty(getText());
        if (!isEmpty && (i13 = this.f37327j) >= 0) {
            super.setPadding(i13, getPaddingTop(), getPaddingRight(), getPaddingBottom());
        }
        super.onMeasure(i11, i12);
        int mode = View.MeasureSpec.getMode(i11);
        int size = View.MeasureSpec.getSize(i11);
        int measuredWidth = getMeasuredWidth();
        int i14 = this.f37326i;
        int min = mode == Integer.MIN_VALUE ? Math.min(size, i14) : i14;
        if (mode != 1073741824 && i14 > 0 && measuredWidth < min) {
            super.onMeasure(View.MeasureSpec.makeMeasureSpec(min, 1073741824), i12);
        }
        if (!isEmpty || this.f37321c == null) {
            return;
        }
        super.setPadding((getMeasuredWidth() - this.f37321c.getBounds().width()) / 2, getPaddingTop(), getPaddingRight(), getPaddingBottom());
    }

    @Override // android.widget.TextView, android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        super.onRestoreInstanceState(null);
    }

    @Override // android.widget.TextView, android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        K k11;
        if (this.f37319a.hasSubMenu() && (k11 = this.f37323e) != null && k11.onTouch(this, motionEvent)) {
            return true;
        }
        return super.onTouchEvent(motionEvent);
    }

    @Override // android.widget.TextView, android.view.View
    public final void setPadding(int i11, int i12, int i13, int i14) {
        this.f37327j = i11;
        super.setPadding(i11, i12, i13, i14);
    }
}
