package androidx.appcompat.widget;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Parcel;
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
import p155w1.C1017n0;

/* JADX INFO: loaded from: classes.dex */
public class AppCompatSpinner extends Spinner {

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public static final int[] f8296z = {R.attr.spinnerMode};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final E4.L f8297a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Context f8298b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final A f8299c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public SpinnerAdapter f8300d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final boolean f8301e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final K f8302f;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public int f8303x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final Rect f8304y;

    public static class SavedState extends View.BaseSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new J();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public boolean f8305a;

        @Override // android.view.View.BaseSavedState, android.view.AbsSavedState, android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i7) {
            super.writeToParcel(parcel, i7);
            parcel.writeByte(this.f8305a ? (byte) 1 : (byte) 0);
        }
    }

    /* JADX WARN: Code duplicated, block: B:26:0x0064 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:28:0x0067  */
    /* JADX WARN: Code duplicated, block: B:29:0x009a  */
    /* JADX WARN: Code duplicated, block: B:32:0x00ad  */
    /* JADX WARN: Code duplicated, block: B:35:0x00c7  */
    /* JADX WARN: Code duplicated, block: B:39:0x00d4  */
    public AppCompatSpinner(Context context, AttributeSet attributeSet, int i7) throws Throwable {
        TypedArray typedArrayObtainStyledAttributes;
        CharSequence[] textArray;
        SpinnerAdapter spinnerAdapter;
        super(context, attributeSet, i7);
        this.f8304y = new Rect();
        X0.a(getContext(), this);
        int[] iArr = p051h.a.f13350w;
        C1017n0 c1017n0F = C1017n0.F(context, attributeSet, iArr, i7);
        this.f8297a = new E4.L(this);
        TypedArray typedArray = (TypedArray) c1017n0F.f17812c;
        int resourceId = typedArray.getResourceId(4, 0);
        if (resourceId != 0) {
            this.f8298b = new p078l.e(context, resourceId);
        } else {
            this.f8298b = context;
        }
        int i8 = -1;
        TypedArray typedArray2 = null;
        try {
            typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, f8296z, i7, 0);
            try {
                try {
                    if (typedArrayObtainStyledAttributes.hasValue(0)) {
                        i8 = typedArrayObtainStyledAttributes.getInt(0, 0);
                    }
                } catch (Exception e7) {
                    e = e7;
                    Log.i("AppCompatSpinner", "Could not read android:spinnerMode", e);
                    if (typedArrayObtainStyledAttributes != null) {
                    }
                    if (i8 != 0) {
                        E e8 = new E(this);
                        this.f8302f = e8;
                        e8.f8337c = typedArray.getString(2);
                    } else if (i8 == 1) {
                        I i9 = new I(this, this.f8298b, attributeSet, i7);
                        C1017n0 c1017n0F2 = C1017n0.F(this.f8298b, attributeSet, iArr, i7);
                        this.f8303x = ((TypedArray) c1017n0F2.f17812c).getLayoutDimension(3, -2);
                        i9.j(c1017n0F2.u(1));
                        i9.f8356S = typedArray.getString(2);
                        c1017n0F2.H();
                        this.f8302f = i9;
                        this.f8299c = new A(this, this, i9);
                    }
                    textArray = typedArray.getTextArray(0);
                    if (textArray != null) {
                        ArrayAdapter arrayAdapter = new ArrayAdapter(context, R.layout.simple_spinner_item, textArray);
                        arrayAdapter.setDropDownViewResource(com.salamadev.nabilalawadi.kisaskoran.R.layout.support_simple_spinner_dropdown_item);
                        setAdapter((SpinnerAdapter) arrayAdapter);
                    }
                    c1017n0F.H();
                    this.f8301e = true;
                    spinnerAdapter = this.f8300d;
                    if (spinnerAdapter != null) {
                        setAdapter(spinnerAdapter);
                        this.f8300d = null;
                    }
                    this.f8297a.q(attributeSet, i7);
                }
            } catch (Throwable th) {
                th = th;
                typedArray2 = typedArrayObtainStyledAttributes;
                if (typedArray2 != null) {
                    typedArray2.recycle();
                }
                throw th;
            }
        } catch (Exception e9) {
            e = e9;
            typedArrayObtainStyledAttributes = null;
        } catch (Throwable th2) {
            th = th2;
            if (typedArray2 != null) {
                typedArray2.recycle();
            }
            throw th;
        }
        typedArrayObtainStyledAttributes.recycle();
        if (i8 != 0) {
            E e10 = new E(this);
            this.f8302f = e10;
            e10.f8337c = typedArray.getString(2);
        } else if (i8 == 1) {
            I i10 = new I(this, this.f8298b, attributeSet, i7);
            C1017n0 c1017n0F3 = C1017n0.F(this.f8298b, attributeSet, iArr, i7);
            this.f8303x = ((TypedArray) c1017n0F3.f17812c).getLayoutDimension(3, -2);
            i10.j(c1017n0F3.u(1));
            i10.f8356S = typedArray.getString(2);
            c1017n0F3.H();
            this.f8302f = i10;
            this.f8299c = new A(this, this, i10);
        }
        textArray = typedArray.getTextArray(0);
        if (textArray != null) {
            ArrayAdapter arrayAdapter2 = new ArrayAdapter(context, R.layout.simple_spinner_item, textArray);
            arrayAdapter2.setDropDownViewResource(com.salamadev.nabilalawadi.kisaskoran.R.layout.support_simple_spinner_dropdown_item);
            setAdapter((SpinnerAdapter) arrayAdapter2);
        }
        c1017n0F.H();
        this.f8301e = true;
        spinnerAdapter = this.f8300d;
        if (spinnerAdapter != null) {
            setAdapter(spinnerAdapter);
            this.f8300d = null;
        }
        this.f8297a.q(attributeSet, i7);
    }

    public final int a(SpinnerAdapter spinnerAdapter, Drawable drawable) {
        int i7 = 0;
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
            if (itemViewType != i7) {
                view = null;
                i7 = itemViewType;
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
        Rect rect = this.f8304y;
        drawable.getPadding(rect);
        return iMax2 + rect.left + rect.right;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        E4.L l7 = this.f8297a;
        if (l7 != null) {
            l7.l();
        }
    }

    @Override // android.widget.Spinner
    public int getDropDownHorizontalOffset() {
        K k7 = this.f8302f;
        return k7 != null ? k7.c() : super.getDropDownHorizontalOffset();
    }

    @Override // android.widget.Spinner
    public int getDropDownVerticalOffset() {
        K k7 = this.f8302f;
        return k7 != null ? k7.n() : super.getDropDownVerticalOffset();
    }

    @Override // android.widget.Spinner
    public int getDropDownWidth() {
        return this.f8302f != null ? this.f8303x : super.getDropDownWidth();
    }

    public final K getInternalPopup() {
        return this.f8302f;
    }

    @Override // android.widget.Spinner
    public Drawable getPopupBackground() {
        K k7 = this.f8302f;
        return k7 != null ? k7.g() : super.getPopupBackground();
    }

    @Override // android.widget.Spinner
    public Context getPopupContext() {
        return this.f8298b;
    }

    @Override // android.widget.Spinner
    public CharSequence getPrompt() {
        K k7 = this.f8302f;
        return k7 != null ? k7.f() : super.getPrompt();
    }

    public ColorStateList getSupportBackgroundTintList() {
        E4.L l7 = this.f8297a;
        if (l7 != null) {
            return l7.n();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        E4.L l7 = this.f8297a;
        if (l7 != null) {
            return l7.o();
        }
        return null;
    }

    @Override // android.widget.Spinner, android.widget.AdapterView, android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        K k7 = this.f8302f;
        if (k7 == null || !k7.b()) {
            return;
        }
        k7.dismiss();
    }

    @Override // android.widget.Spinner, android.widget.AbsSpinner, android.view.View
    public final void onMeasure(int i7, int i8) {
        super.onMeasure(i7, i8);
        if (this.f8302f == null || View.MeasureSpec.getMode(i7) != Integer.MIN_VALUE) {
            return;
        }
        setMeasuredDimension(Math.min(Math.max(getMeasuredWidth(), a(getAdapter(), getBackground())), View.MeasureSpec.getSize(i7)), getMeasuredHeight());
    }

    @Override // android.widget.Spinner, android.widget.AbsSpinner, android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        ViewTreeObserver viewTreeObserver;
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(savedState.getSuperState());
        if (!savedState.f8305a || (viewTreeObserver = getViewTreeObserver()) == null) {
            return;
        }
        viewTreeObserver.addOnGlobalLayoutListener(new ViewTreeObserverOnGlobalLayoutListenerC0635p(this, 1));
    }

    @Override // android.widget.Spinner, android.widget.AbsSpinner, android.view.View
    public final Parcelable onSaveInstanceState() {
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        K k7 = this.f8302f;
        savedState.f8305a = k7 != null && k7.b();
        return savedState;
    }

    @Override // android.widget.Spinner, android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        A a2 = this.f8299c;
        if (a2 == null || !a2.onTouch(this, motionEvent)) {
            return super.onTouchEvent(motionEvent);
        }
        return true;
    }

    @Override // android.widget.Spinner, android.view.View
    public final boolean performClick() {
        K k7 = this.f8302f;
        if (k7 == null) {
            return super.performClick();
        }
        if (k7.b()) {
            return true;
        }
        this.f8302f.m(C.b(this), C.a(this));
        return true;
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        E4.L l7 = this.f8297a;
        if (l7 != null) {
            l7.r();
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i7) {
        super.setBackgroundResource(i7);
        E4.L l7 = this.f8297a;
        if (l7 != null) {
            l7.s(i7);
        }
    }

    @Override // android.widget.Spinner
    public void setDropDownHorizontalOffset(int i7) {
        K k7 = this.f8302f;
        if (k7 == null) {
            super.setDropDownHorizontalOffset(i7);
        } else {
            k7.l(i7);
            k7.e(i7);
        }
    }

    @Override // android.widget.Spinner
    public void setDropDownVerticalOffset(int i7) {
        K k7 = this.f8302f;
        if (k7 != null) {
            k7.k(i7);
        } else {
            super.setDropDownVerticalOffset(i7);
        }
    }

    @Override // android.widget.Spinner
    public void setDropDownWidth(int i7) {
        if (this.f8302f != null) {
            this.f8303x = i7;
        } else {
            super.setDropDownWidth(i7);
        }
    }

    @Override // android.widget.Spinner
    public void setPopupBackgroundDrawable(Drawable drawable) {
        K k7 = this.f8302f;
        if (k7 != null) {
            k7.j(drawable);
        } else {
            super.setPopupBackgroundDrawable(drawable);
        }
    }

    @Override // android.widget.Spinner
    public void setPopupBackgroundResource(int i7) {
        setPopupBackgroundDrawable(p097n3.a.w(getPopupContext(), i7));
    }

    @Override // android.widget.Spinner
    public void setPrompt(CharSequence charSequence) {
        K k7 = this.f8302f;
        if (k7 != null) {
            k7.i(charSequence);
        } else {
            super.setPrompt(charSequence);
        }
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        E4.L l7 = this.f8297a;
        if (l7 != null) {
            l7.v(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        E4.L l7 = this.f8297a;
        if (l7 != null) {
            l7.w(mode);
        }
    }

    @Override // android.widget.AdapterView
    public void setAdapter(SpinnerAdapter spinnerAdapter) {
        if (!this.f8301e) {
            this.f8300d = spinnerAdapter;
            return;
        }
        super.setAdapter(spinnerAdapter);
        K k7 = this.f8302f;
        if (k7 != null) {
            Context context = this.f8298b;
            if (context == null) {
                context = getContext();
            }
            Resources.Theme theme = context.getTheme();
            F f7 = new F();
            f7.f8347a = spinnerAdapter;
            if (spinnerAdapter instanceof ListAdapter) {
                f7.f8348b = (ListAdapter) spinnerAdapter;
            }
            if (theme != null && (spinnerAdapter instanceof ThemedSpinnerAdapter)) {
                D.a((ThemedSpinnerAdapter) spinnerAdapter, theme);
            }
            k7.p(f7);
        }
    }
}
