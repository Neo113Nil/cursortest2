package p000;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.ArrayAdapter;
import android.widget.ListAdapter;
import android.widget.Spinner;
import android.widget.SpinnerAdapter;
import android.widget.ThemedSpinnerAdapter;

/* JADX INFO: renamed from: y6 */
/* JADX INFO: compiled from: r8-map-id-738170b7fb69b873ed7524d5270c8e05c6f5fb40ea1ade7a72c8ed7a70699269 */
/* JADX INFO: loaded from: classes.dex */
public final class C0903y6 extends Spinner {

    /* JADX INFO: renamed from: r */
    public static final int[] f9179r = {R.attr.spinnerMode};

    /* JADX INFO: renamed from: j */
    public final C0864x4 f9180j;

    /* JADX INFO: renamed from: k */
    public final Context f9181k;

    /* JADX INFO: renamed from: l */
    public final C0533o6 f9182l;

    /* JADX INFO: renamed from: m */
    public SpinnerAdapter f9183m;

    /* JADX INFO: renamed from: n */
    public final boolean f9184n;

    /* JADX INFO: renamed from: o */
    public final InterfaceC0866x6 f9185o;

    /* JADX INFO: renamed from: p */
    public int f9186p;

    /* JADX INFO: renamed from: q */
    public final Rect f9187q;

    /* JADX WARN: Code duplicated, block: B:26:0x0067 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:28:0x006a  */
    /* JADX WARN: Code duplicated, block: B:29:0x009d  */
    /* JADX WARN: Code duplicated, block: B:32:0x00b0  */
    /* JADX WARN: Code duplicated, block: B:35:0x00ca  */
    /* JADX WARN: Code duplicated, block: B:39:0x00d7  */
    public C0903y6(Context context, AttributeSet attributeSet) throws Throwable {
        TypedArray typedArrayObtainStyledAttributes;
        CharSequence[] textArray;
        SpinnerAdapter spinnerAdapter;
        super(context, attributeSet, live.football.scorerepublic.R.attr.spinnerStyle);
        this.f9187q = new Rect();
        zc1.m5876a(this, getContext());
        int[] iArr = mz0.f5207u;
        oq0 oq0VarM3731n = oq0.m3731n(context, attributeSet, iArr, live.football.scorerepublic.R.attr.spinnerStyle);
        TypedArray typedArray = (TypedArray) oq0VarM3731n.f5841l;
        this.f9180j = new C0864x4(this);
        int resourceId = typedArray.getResourceId(4, 0);
        if (resourceId != 0) {
            this.f9181k = new C0771um(context, resourceId);
        } else {
            this.f9181k = context;
        }
        int i = -1;
        TypedArray typedArray2 = null;
        try {
            typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, f9179r, live.football.scorerepublic.R.attr.spinnerStyle, 0);
            try {
                try {
                    if (typedArrayObtainStyledAttributes.hasValue(0)) {
                        i = typedArrayObtainStyledAttributes.getInt(0, 0);
                    }
                } catch (Exception e) {
                    e = e;
                    Log.i("AppCompatSpinner", "Could not read android:spinnerMode", e);
                    if (typedArrayObtainStyledAttributes != null) {
                    }
                    if (i != 0) {
                        DialogInterfaceOnClickListenerC0644r6 dialogInterfaceOnClickListenerC0644r6 = new DialogInterfaceOnClickListenerC0644r6(this);
                        this.f9185o = dialogInterfaceOnClickListenerC0644r6;
                        dialogInterfaceOnClickListenerC0644r6.f6719l = typedArray.getString(2);
                    } else if (i == 1) {
                        C0792v6 c0792v6 = new C0792v6(this, this.f9181k, attributeSet);
                        oq0 oq0VarM3731n2 = oq0.m3731n(this.f9181k, attributeSet, iArr, live.football.scorerepublic.R.attr.spinnerStyle);
                        this.f9186p = ((TypedArray) oq0VarM3731n2.f5841l).getLayoutDimension(3, -2);
                        c0792v6.m5913f(oq0VarM3731n2.m3735e(1));
                        c0792v6.f8101I = typedArray.getString(2);
                        oq0VarM3731n2.m3742o();
                        this.f9185o = c0792v6;
                        this.f9182l = new C0533o6(this, this, c0792v6);
                    }
                    textArray = typedArray.getTextArray(0);
                    if (textArray != null) {
                        ArrayAdapter arrayAdapter = new ArrayAdapter(context, R.layout.simple_spinner_item, textArray);
                        arrayAdapter.setDropDownViewResource(live.football.scorerepublic.R.layout.support_simple_spinner_dropdown_item);
                        setAdapter((SpinnerAdapter) arrayAdapter);
                    }
                    oq0VarM3731n.m3742o();
                    this.f9184n = true;
                    spinnerAdapter = this.f9183m;
                    if (spinnerAdapter != null) {
                        setAdapter(spinnerAdapter);
                        this.f9183m = null;
                    }
                    this.f9180j.m5518d(attributeSet, live.football.scorerepublic.R.attr.spinnerStyle);
                }
            } catch (Throwable th) {
                th = th;
                typedArray2 = typedArrayObtainStyledAttributes;
                if (typedArray2 != null) {
                    typedArray2.recycle();
                }
                throw th;
            }
        } catch (Exception e2) {
            e = e2;
            typedArrayObtainStyledAttributes = null;
        } catch (Throwable th2) {
            th = th2;
            if (typedArray2 != null) {
                typedArray2.recycle();
            }
            throw th;
        }
        typedArrayObtainStyledAttributes.recycle();
        if (i != 0) {
            DialogInterfaceOnClickListenerC0644r6 dialogInterfaceOnClickListenerC0644r7 = new DialogInterfaceOnClickListenerC0644r6(this);
            this.f9185o = dialogInterfaceOnClickListenerC0644r7;
            dialogInterfaceOnClickListenerC0644r7.f6719l = typedArray.getString(2);
        } else if (i == 1) {
            C0792v6 c0792v7 = new C0792v6(this, this.f9181k, attributeSet);
            oq0 oq0VarM3731n3 = oq0.m3731n(this.f9181k, attributeSet, iArr, live.football.scorerepublic.R.attr.spinnerStyle);
            this.f9186p = ((TypedArray) oq0VarM3731n3.f5841l).getLayoutDimension(3, -2);
            c0792v7.m5913f(oq0VarM3731n3.m3735e(1));
            c0792v7.f8101I = typedArray.getString(2);
            oq0VarM3731n3.m3742o();
            this.f9185o = c0792v7;
            this.f9182l = new C0533o6(this, this, c0792v7);
        }
        textArray = typedArray.getTextArray(0);
        if (textArray != null) {
            ArrayAdapter arrayAdapter2 = new ArrayAdapter(context, R.layout.simple_spinner_item, textArray);
            arrayAdapter2.setDropDownViewResource(live.football.scorerepublic.R.layout.support_simple_spinner_dropdown_item);
            setAdapter((SpinnerAdapter) arrayAdapter2);
        }
        oq0VarM3731n.m3742o();
        this.f9184n = true;
        spinnerAdapter = this.f9183m;
        if (spinnerAdapter != null) {
            setAdapter(spinnerAdapter);
            this.f9183m = null;
        }
        this.f9180j.m5518d(attributeSet, live.football.scorerepublic.R.attr.spinnerStyle);
    }

    /* JADX INFO: renamed from: a */
    public final int m5741a(SpinnerAdapter spinnerAdapter, Drawable drawable) {
        int i = 0;
        if (spinnerAdapter == null) {
            return 0;
        }
        int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(getMeasuredWidth(), 0);
        int iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(getMeasuredHeight(), 0);
        int iMax = Math.max(0, getSelectedItemPosition());
        int iMin = Math.min(spinnerAdapter.getCount(), iMax + 15);
        View view = null;
        int iMax2 = 0;
        for (int iMax3 = Math.max(0, iMax - (15 - (iMin - iMax))); iMax3 < iMin; iMax3++) {
            int itemViewType = spinnerAdapter.getItemViewType(iMax3);
            if (itemViewType != i) {
                view = null;
                i = itemViewType;
            }
            view = spinnerAdapter.getView(iMax3, view, this);
            if (view.getLayoutParams() == null) {
                view.setLayoutParams(new ViewGroup.LayoutParams(-2, -2));
            }
            view.measure(iMakeMeasureSpec, iMakeMeasureSpec2);
            iMax2 = Math.max(iMax2, view.getMeasuredWidth());
        }
        if (drawable == null) {
            return iMax2;
        }
        Rect rect = this.f9187q;
        drawable.getPadding(rect);
        return rect.left + rect.right + iMax2;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        C0864x4 c0864x4 = this.f9180j;
        if (c0864x4 != null) {
            c0864x4.m5515a();
        }
    }

    @Override // android.widget.Spinner
    public int getDropDownHorizontalOffset() {
        InterfaceC0866x6 interfaceC0866x6 = this.f9185o;
        return interfaceC0866x6 != null ? interfaceC0866x6.mo4258b() : super.getDropDownHorizontalOffset();
    }

    @Override // android.widget.Spinner
    public int getDropDownVerticalOffset() {
        InterfaceC0866x6 interfaceC0866x6 = this.f9185o;
        return interfaceC0866x6 != null ? interfaceC0866x6.mo4266n() : super.getDropDownVerticalOffset();
    }

    @Override // android.widget.Spinner
    public int getDropDownWidth() {
        return this.f9185o != null ? this.f9186p : super.getDropDownWidth();
    }

    public final InterfaceC0866x6 getInternalPopup() {
        return this.f9185o;
    }

    @Override // android.widget.Spinner
    public Drawable getPopupBackground() {
        InterfaceC0866x6 interfaceC0866x6 = this.f9185o;
        return interfaceC0866x6 != null ? interfaceC0866x6.mo4259d() : super.getPopupBackground();
    }

    @Override // android.widget.Spinner
    public Context getPopupContext() {
        return this.f9181k;
    }

    @Override // android.widget.Spinner
    public CharSequence getPrompt() {
        InterfaceC0866x6 interfaceC0866x6 = this.f9185o;
        return interfaceC0866x6 != null ? interfaceC0866x6.mo4267o() : super.getPrompt();
    }

    public ColorStateList getSupportBackgroundTintList() {
        C0864x4 c0864x4 = this.f9180j;
        if (c0864x4 != null) {
            return c0864x4.m5516b();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        C0864x4 c0864x4 = this.f9180j;
        if (c0864x4 != null) {
            return c0864x4.m5517c();
        }
        return null;
    }

    @Override // android.widget.Spinner, android.widget.AdapterView, android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        InterfaceC0866x6 interfaceC0866x6 = this.f9185o;
        if (interfaceC0866x6 == null || !interfaceC0866x6.mo4257a()) {
            return;
        }
        interfaceC0866x6.dismiss();
    }

    @Override // android.widget.Spinner, android.widget.AbsSpinner, android.view.View
    public final void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        if (this.f9185o == null || View.MeasureSpec.getMode(i) != Integer.MIN_VALUE) {
            return;
        }
        setMeasuredDimension(Math.min(Math.max(getMeasuredWidth(), m5741a(getAdapter(), getBackground())), View.MeasureSpec.getSize(i)), getMeasuredHeight());
    }

    @Override // android.widget.Spinner, android.widget.AbsSpinner, android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        ViewTreeObserver viewTreeObserver;
        C0829w6 c0829w6 = (C0829w6) parcelable;
        super.onRestoreInstanceState(c0829w6.getSuperState());
        if (!c0829w6.f8438j || (viewTreeObserver = getViewTreeObserver()) == null) {
            return;
        }
        viewTreeObserver.addOnGlobalLayoutListener(new ViewTreeObserverOnGlobalLayoutListenerC0570p6(0, this));
    }

    @Override // android.widget.Spinner, android.widget.AbsSpinner, android.view.View
    public final Parcelable onSaveInstanceState() {
        C0829w6 c0829w6 = new C0829w6(super.onSaveInstanceState());
        InterfaceC0866x6 interfaceC0866x6 = this.f9185o;
        c0829w6.f8438j = interfaceC0866x6 != null && interfaceC0866x6.mo4257a();
        return c0829w6;
    }

    @Override // android.widget.Spinner, android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        C0533o6 c0533o6 = this.f9182l;
        if (c0533o6 == null || !c0533o6.onTouch(this, motionEvent)) {
            return super.onTouchEvent(motionEvent);
        }
        return true;
    }

    @Override // android.widget.Spinner, android.view.View
    public final boolean performClick() {
        InterfaceC0866x6 interfaceC0866x6 = this.f9185o;
        if (interfaceC0866x6 == null) {
            return super.performClick();
        }
        if (interfaceC0866x6.mo4257a()) {
            return true;
        }
        interfaceC0866x6.mo4265m(getTextDirection(), getTextAlignment());
        return true;
    }

    @Override // android.widget.AdapterView
    public void setAdapter(SpinnerAdapter spinnerAdapter) {
        if (!this.f9184n) {
            this.f9183m = spinnerAdapter;
            return;
        }
        super.setAdapter(spinnerAdapter);
        InterfaceC0866x6 interfaceC0866x6 = this.f9185o;
        if (interfaceC0866x6 != null) {
            Context context = this.f9181k;
            if (context == null) {
                context = getContext();
            }
            Resources.Theme theme = context.getTheme();
            C0681s6 c0681s6 = new C0681s6();
            c0681s6.f7037a = spinnerAdapter;
            if (spinnerAdapter instanceof ListAdapter) {
                c0681s6.f7038b = (ListAdapter) spinnerAdapter;
            }
            if (theme != null && (spinnerAdapter instanceof ThemedSpinnerAdapter)) {
                AbstractC0607q6.m4039a((ThemedSpinnerAdapter) spinnerAdapter, theme);
            }
            interfaceC0866x6.mo4268p(c0681s6);
        }
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        C0864x4 c0864x4 = this.f9180j;
        if (c0864x4 != null) {
            c0864x4.m5519e();
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i) {
        super.setBackgroundResource(i);
        C0864x4 c0864x4 = this.f9180j;
        if (c0864x4 != null) {
            c0864x4.m5520f(i);
        }
    }

    @Override // android.widget.Spinner
    public void setDropDownHorizontalOffset(int i) {
        InterfaceC0866x6 interfaceC0866x6 = this.f9185o;
        if (interfaceC0866x6 == null) {
            super.setDropDownHorizontalOffset(i);
        } else {
            interfaceC0866x6.mo4263k(i);
            interfaceC0866x6.mo4264l(i);
        }
    }

    @Override // android.widget.Spinner
    public void setDropDownVerticalOffset(int i) {
        InterfaceC0866x6 interfaceC0866x6 = this.f9185o;
        if (interfaceC0866x6 != null) {
            interfaceC0866x6.mo4262g(i);
        } else {
            super.setDropDownVerticalOffset(i);
        }
    }

    @Override // android.widget.Spinner
    public void setDropDownWidth(int i) {
        if (this.f9185o != null) {
            this.f9186p = i;
        } else {
            super.setDropDownWidth(i);
        }
    }

    @Override // android.widget.Spinner
    public void setPopupBackgroundDrawable(Drawable drawable) {
        InterfaceC0866x6 interfaceC0866x6 = this.f9185o;
        if (interfaceC0866x6 != null) {
            interfaceC0866x6.mo4261f(drawable);
        } else {
            super.setPopupBackgroundDrawable(drawable);
        }
    }

    @Override // android.widget.Spinner
    public void setPopupBackgroundResource(int i) {
        setPopupBackgroundDrawable(j22.m2807p(getPopupContext(), i));
    }

    @Override // android.widget.Spinner
    public void setPrompt(CharSequence charSequence) {
        InterfaceC0866x6 interfaceC0866x6 = this.f9185o;
        if (interfaceC0866x6 != null) {
            interfaceC0866x6.mo4260e(charSequence);
        } else {
            super.setPrompt(charSequence);
        }
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        C0864x4 c0864x4 = this.f9180j;
        if (c0864x4 != null) {
            c0864x4.m5522h(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        C0864x4 c0864x4 = this.f9180j;
        if (c0864x4 != null) {
            c0864x4.m5523i(mode);
        }
    }
}
