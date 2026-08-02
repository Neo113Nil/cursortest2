package androidx.appcompat.widget;

import P.AbstractC0347c;
import android.R;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.PopupWindow;
import h.AbstractC1174a;
import n3.AbstractC1464a;

/* loaded from: classes.dex */
public class ActivityChooserView extends ViewGroup {

    /* renamed from: A, reason: collision with root package name */
    public PopupWindow.OnDismissListener f8247A;

    /* renamed from: B, reason: collision with root package name */
    public boolean f8248B;

    /* renamed from: a, reason: collision with root package name */
    public final r f8249a;

    /* renamed from: b, reason: collision with root package name */
    public final ViewOnClickListenerC0661s f8250b;

    /* renamed from: c, reason: collision with root package name */
    public final View f8251c;

    /* renamed from: d, reason: collision with root package name */
    public final FrameLayout f8252d;

    /* renamed from: e, reason: collision with root package name */
    public final ImageView f8253e;

    /* renamed from: f, reason: collision with root package name */
    public final FrameLayout f8254f;

    /* renamed from: x, reason: collision with root package name */
    public AbstractC0347c f8255x;

    /* renamed from: y, reason: collision with root package name */
    public final ViewTreeObserverOnGlobalLayoutListenerC0656p f8256y;

    /* renamed from: z, reason: collision with root package name */
    public ListPopupWindow f8257z;

    public static class InnerLayout extends LinearLayout {

        /* renamed from: a, reason: collision with root package name */
        public static final int[] f8258a = {R.attr.background};

        public InnerLayout(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            int resourceId;
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, f8258a);
            setBackgroundDrawable((!obtainStyledAttributes.hasValue(0) || (resourceId = obtainStyledAttributes.getResourceId(0, 0)) == 0) ? obtainStyledAttributes.getDrawable(0) : AbstractC1464a.w(context, resourceId));
            obtainStyledAttributes.recycle();
        }
    }

    public ActivityChooserView(Context context, AttributeSet attributeSet, int i7) {
        super(context, attributeSet, i7);
        int i8 = 0;
        new C0654o(this, i8);
        this.f8256y = new ViewTreeObserverOnGlobalLayoutListenerC0656p(this, i8);
        int[] iArr = AbstractC1174a.f13327e;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, iArr, i7, 0);
        P.U.g(this, context, iArr, attributeSet, obtainStyledAttributes, i7);
        obtainStyledAttributes.getInt(1, 4);
        Drawable drawable = obtainStyledAttributes.getDrawable(0);
        obtainStyledAttributes.recycle();
        LayoutInflater.from(getContext()).inflate(com.salamadev.khotabaljomo3a.kichkabdelhamid.R.layout.abc_activity_chooser_view, (ViewGroup) this, true);
        ViewOnClickListenerC0661s viewOnClickListenerC0661s = new ViewOnClickListenerC0661s(this);
        this.f8250b = viewOnClickListenerC0661s;
        View findViewById = findViewById(com.salamadev.khotabaljomo3a.kichkabdelhamid.R.id.activity_chooser_view_content);
        this.f8251c = findViewById;
        findViewById.getBackground();
        FrameLayout frameLayout = (FrameLayout) findViewById(com.salamadev.khotabaljomo3a.kichkabdelhamid.R.id.default_activity_button);
        this.f8254f = frameLayout;
        frameLayout.setOnClickListener(viewOnClickListenerC0661s);
        frameLayout.setOnLongClickListener(viewOnClickListenerC0661s);
        FrameLayout frameLayout2 = (FrameLayout) findViewById(com.salamadev.khotabaljomo3a.kichkabdelhamid.R.id.expand_activities_button);
        frameLayout2.setOnClickListener(viewOnClickListenerC0661s);
        frameLayout2.setAccessibilityDelegate(new C0658q());
        frameLayout2.setOnTouchListener(new C0640h(this, frameLayout2, 1));
        this.f8252d = frameLayout2;
        ImageView imageView = (ImageView) frameLayout2.findViewById(com.salamadev.khotabaljomo3a.kichkabdelhamid.R.id.image);
        this.f8253e = imageView;
        imageView.setImageDrawable(drawable);
        r rVar = new r(this);
        this.f8249a = rVar;
        rVar.registerDataSetObserver(new C0654o(this, 1));
        Resources resources = context.getResources();
        Math.max(resources.getDisplayMetrics().widthPixels / 2, resources.getDimensionPixelSize(com.salamadev.khotabaljomo3a.kichkabdelhamid.R.dimen.abc_config_prefDialogWidth));
    }

    public final void a() {
        if (b()) {
            getListPopupWindow().dismiss();
            ViewTreeObserver viewTreeObserver = getViewTreeObserver();
            if (viewTreeObserver.isAlive()) {
                viewTreeObserver.removeGlobalOnLayoutListener(this.f8256y);
            }
        }
    }

    public final boolean b() {
        return getListPopupWindow().f8397P.isShowing();
    }

    public AbstractC0652n getDataModel() {
        this.f8249a.getClass();
        return null;
    }

    public ListPopupWindow getListPopupWindow() {
        if (this.f8257z == null) {
            ListPopupWindow listPopupWindow = new ListPopupWindow(getContext(), null, com.salamadev.khotabaljomo3a.kichkabdelhamid.R.attr.listPopupWindowStyle);
            this.f8257z = listPopupWindow;
            listPopupWindow.p(this.f8249a);
            ListPopupWindow listPopupWindow2 = this.f8257z;
            listPopupWindow2.f8387F = this;
            listPopupWindow2.f8396O = true;
            listPopupWindow2.f8397P.setFocusable(true);
            ListPopupWindow listPopupWindow3 = this.f8257z;
            ViewOnClickListenerC0661s viewOnClickListenerC0661s = this.f8250b;
            listPopupWindow3.f8388G = viewOnClickListenerC0661s;
            listPopupWindow3.f8397P.setOnDismissListener(viewOnClickListenerC0661s);
        }
        return this.f8257z;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f8249a.getClass();
        this.f8248B = true;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f8249a.getClass();
        ViewTreeObserver viewTreeObserver = getViewTreeObserver();
        if (viewTreeObserver.isAlive()) {
            viewTreeObserver.removeGlobalOnLayoutListener(this.f8256y);
        }
        if (b()) {
            a();
        }
        this.f8248B = false;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z4, int i7, int i8, int i9, int i10) {
        this.f8251c.layout(0, 0, i9 - i7, i10 - i8);
        if (b()) {
            return;
        }
        a();
    }

    @Override // android.view.View
    public final void onMeasure(int i7, int i8) {
        if (this.f8254f.getVisibility() != 0) {
            i8 = View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i8), 1073741824);
        }
        View view = this.f8251c;
        measureChild(view, i7, i8);
        setMeasuredDimension(view.getMeasuredWidth(), view.getMeasuredHeight());
    }

    public void setActivityChooserModel(AbstractC0652n abstractC0652n) {
        r rVar = this.f8249a;
        rVar.f8736a.f8249a.getClass();
        rVar.notifyDataSetChanged();
        if (b()) {
            a();
            if (b() || !this.f8248B) {
                return;
            }
            rVar.getClass();
            throw new IllegalStateException("No data model. Did you call #setDataModel?");
        }
    }

    public void setDefaultActionButtonContentDescription(int i7) {
    }

    public void setExpandActivityOverflowButtonContentDescription(int i7) {
        this.f8253e.setContentDescription(getContext().getString(i7));
    }

    public void setExpandActivityOverflowButtonDrawable(Drawable drawable) {
        this.f8253e.setImageDrawable(drawable);
    }

    public void setInitialActivityCount(int i7) {
    }

    public void setOnDismissListener(PopupWindow.OnDismissListener onDismissListener) {
        this.f8247A = onDismissListener;
    }

    public void setProvider(AbstractC0347c abstractC0347c) {
        this.f8255x = abstractC0347c;
    }
}
