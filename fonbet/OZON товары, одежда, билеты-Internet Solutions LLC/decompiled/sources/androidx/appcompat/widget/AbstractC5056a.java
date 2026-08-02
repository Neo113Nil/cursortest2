package androidx.appcompat.widget;

import Gl.C3124a;
import android.content.Context;
import android.content.res.Configuration;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.ContextThemeWrapper;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.core.view.C5326k0;
import androidx.core.view.InterfaceC5328l0;
import androidx.recyclerview.widget.LinearLayoutManager;
import i.C6977a;
import ru.ozon.app.android.R;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: androidx.appcompat.widget.a, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public abstract class AbstractC5056a extends ViewGroup {

    /* renamed from: a, reason: collision with root package name */
    protected final C0715a f37853a;

    /* renamed from: b, reason: collision with root package name */
    protected final Context f37854b;

    /* renamed from: c, reason: collision with root package name */
    protected ActionMenuView f37855c;

    /* renamed from: d, reason: collision with root package name */
    protected C5058c f37856d;

    /* renamed from: e, reason: collision with root package name */
    protected int f37857e;

    /* renamed from: f, reason: collision with root package name */
    protected C5326k0 f37858f;

    /* renamed from: g, reason: collision with root package name */
    private boolean f37859g;

    /* renamed from: h, reason: collision with root package name */
    private boolean f37860h;

    /* renamed from: androidx.appcompat.widget.a$a, reason: collision with other inner class name */
    protected class C0715a implements InterfaceC5328l0 {

        /* renamed from: a, reason: collision with root package name */
        private boolean f37861a = false;

        /* renamed from: b, reason: collision with root package name */
        int f37862b;

        protected C0715a() {
        }

        @Override // androidx.core.view.InterfaceC5328l0
        public final void a() {
            AbstractC5056a.super.setVisibility(0);
            this.f37861a = false;
        }

        @Override // androidx.core.view.InterfaceC5328l0
        public final void onAnimationCancel() {
            this.f37861a = true;
        }

        @Override // androidx.core.view.InterfaceC5328l0
        public final void onAnimationEnd() {
            if (this.f37861a) {
                return;
            }
            AbstractC5056a abstractC5056a = AbstractC5056a.this;
            abstractC5056a.f37858f = null;
            AbstractC5056a.super.setVisibility(this.f37862b);
        }
    }

    AbstractC5056a(@NonNull Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    protected static int c(View view, int i11, int i12) {
        view.measure(View.MeasureSpec.makeMeasureSpec(i11, LinearLayoutManager.INVALID_OFFSET), i12);
        return Math.max(0, i11 - view.getMeasuredWidth());
    }

    protected static int d(View view, boolean z11, int i11, int i12, int i13) {
        int measuredWidth = view.getMeasuredWidth();
        int measuredHeight = view.getMeasuredHeight();
        int a11 = C3124a.a(i13, measuredHeight, 2, i12);
        if (z11) {
            view.layout(i11 - measuredWidth, a11, i11, measuredHeight + a11);
        } else {
            view.layout(i11, a11, i11 + measuredWidth, measuredHeight + a11);
        }
        return z11 ? -measuredWidth : measuredWidth;
    }

    public void e(int i11) {
        this.f37857e = i11;
        requestLayout();
    }

    @Override // android.view.View
    protected final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(null, C6977a.f65647a, R.attr.actionBarStyle, 0);
        e(obtainStyledAttributes.getLayoutDimension(13, 0));
        obtainStyledAttributes.recycle();
        C5058c c5058c = this.f37856d;
        if (c5058c != null) {
            c5058c.B();
        }
    }

    @Override // android.view.View
    public boolean onHoverEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 9) {
            this.f37860h = false;
        }
        if (!this.f37860h) {
            boolean onHoverEvent = super.onHoverEvent(motionEvent);
            if (actionMasked == 9 && !onHoverEvent) {
                this.f37860h = true;
            }
        }
        if (actionMasked != 10 && actionMasked != 3) {
            return true;
        }
        this.f37860h = false;
        return true;
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            this.f37859g = false;
        }
        if (!this.f37859g) {
            boolean onTouchEvent = super.onTouchEvent(motionEvent);
            if (actionMasked == 0 && !onTouchEvent) {
                this.f37859g = true;
            }
        }
        if (actionMasked != 1 && actionMasked != 3) {
            return true;
        }
        this.f37859g = false;
        return true;
    }

    @Override // android.view.View
    public void setVisibility(int i11) {
        if (i11 != getVisibility()) {
            C5326k0 c5326k0 = this.f37858f;
            if (c5326k0 != null) {
                c5326k0.b();
            }
            super.setVisibility(i11);
        }
    }

    AbstractC5056a(@NonNull Context context, AttributeSet attributeSet, int i11) {
        super(context, attributeSet, i11);
        this.f37853a = new C0715a();
        TypedValue typedValue = new TypedValue();
        if (!context.getTheme().resolveAttribute(R.attr.actionBarPopupTheme, typedValue, true) || typedValue.resourceId == 0) {
            this.f37854b = context;
        } else {
            this.f37854b = new ContextThemeWrapper(context, typedValue.resourceId);
        }
    }
}
