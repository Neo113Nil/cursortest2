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
import h.AbstractC1174a;
import l.C1367e;
import n3.AbstractC1464a;
import w1.C1726n0;

/* loaded from: classes.dex */
public class AppCompatSpinner extends Spinner {

    /* renamed from: z, reason: collision with root package name */
    public static final int[] f8296z = {R.attr.spinnerMode};

    /* renamed from: a, reason: collision with root package name */
    public final E4.L f8297a;

    /* renamed from: b, reason: collision with root package name */
    public final Context f8298b;

    /* renamed from: c, reason: collision with root package name */
    public final A f8299c;

    /* renamed from: d, reason: collision with root package name */
    public SpinnerAdapter f8300d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f8301e;

    /* renamed from: f, reason: collision with root package name */
    public final K f8302f;

    /* renamed from: x, reason: collision with root package name */
    public int f8303x;

    /* renamed from: y, reason: collision with root package name */
    public final Rect f8304y;

    public static class SavedState extends View.BaseSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new J();

        /* renamed from: a, reason: collision with root package name */
        public boolean f8305a;

        @Override // android.view.View.BaseSavedState, android.view.AbsSavedState, android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i7) {
            super.writeToParcel(parcel, i7);
            parcel.writeByte(this.f8305a ? (byte) 1 : (byte) 0);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:29:0x005d, code lost:
    
        if (r6 == null) goto L24;
     */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00d4  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public AppCompatSpinner(Context context, AttributeSet attributeSet, int i7) {
        super(context, attributeSet, i7);
        TypedArray typedArray;
        this.f8304y = new Rect();
        X0.a(getContext(), this);
        int[] iArr = AbstractC1174a.f13344w;
        C1726n0 F7 = C1726n0.F(context, attributeSet, iArr, i7);
        this.f8297a = new E4.L(this);
        TypedArray typedArray2 = (TypedArray) F7.f17806c;
        int resourceId = typedArray2.getResourceId(4, 0);
        if (resourceId != 0) {
            this.f8298b = new C1367e(context, resourceId);
        } else {
            this.f8298b = context;
        }
        int i8 = -1;
        TypedArray typedArray3 = null;
        try {
            typedArray = context.obtainStyledAttributes(attributeSet, f8296z, i7, 0);
            try {
                try {
                    if (typedArray.hasValue(0)) {
                        i8 = typedArray.getInt(0, 0);
                    }
                } catch (Exception e7) {
                    e = e7;
                    Log.i("AppCompatSpinner", "Could not read android:spinnerMode", e);
                }
            } catch (Throwable th) {
                th = th;
                typedArray3 = typedArray;
                if (typedArray3 != null) {
                    typedArray3.recycle();
                }
                throw th;
            }
        } catch (Exception e8) {
            e = e8;
            typedArray = null;
        } catch (Throwable th2) {
            th = th2;
            if (typedArray3 != null) {
            }
            throw th;
        }
        typedArray.recycle();
        if (i8 == 0) {
            E e9 = new E(this);
            this.f8302f = e9;
            e9.f8337c = typedArray2.getString(2);
        } else if (i8 == 1) {
            I i9 = new I(this, this.f8298b, attributeSet, i7);
            C1726n0 F8 = C1726n0.F(this.f8298b, attributeSet, iArr, i7);
            this.f8303x = ((TypedArray) F8.f17806c).getLayoutDimension(3, -2);
            i9.j(F8.u(1));
            i9.f8356S = typedArray2.getString(2);
            F8.H();
            this.f8302f = i9;
            this.f8299c = new A(this, this, i9);
        }
        CharSequence[] textArray = typedArray2.getTextArray(0);
        if (textArray != null) {
            ArrayAdapter arrayAdapter = new ArrayAdapter(context, R.layout.simple_spinner_item, textArray);
            arrayAdapter.setDropDownViewResource(com.salamadev.khotabaljomo3a.kichkabdelhamid.R.layout.support_simple_spinner_dropdown_item);
            setAdapter((SpinnerAdapter) arrayAdapter);
        }
        F7.H();
        this.f8301e = true;
        SpinnerAdapter spinnerAdapter = this.f8300d;
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
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(getMeasuredWidth(), 0);
        int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(getMeasuredHeight(), 0);
        int max = Math.max(0, getSelectedItemPosition());
        int min = Math.min(spinnerAdapter.getCount(), max + 15);
        View view = null;
        int i8 = 0;
        for (int max2 = Math.max(0, max - (15 - (min - max))); max2 < min; max2++) {
            int itemViewType = spinnerAdapter.getItemViewType(max2);
            if (itemViewType != i7) {
                view = null;
                i7 = itemViewType;
            }
            view = spinnerAdapter.getView(max2, view, this);
            if (view.getLayoutParams() == null) {
                view.setLayoutParams(new ViewGroup.LayoutParams(-2, -2));
            }
            view.measure(makeMeasureSpec, makeMeasureSpec2);
            i8 = Math.max(i8, view.getMeasuredWidth());
        }
        if (drawable == null) {
            return i8;
        }
        Rect rect = this.f8304y;
        drawable.getPadding(rect);
        return i8 + rect.left + rect.right;
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
        viewTreeObserver.addOnGlobalLayoutListener(new ViewTreeObserverOnGlobalLayoutListenerC0656p(this, 1));
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
        setPopupBackgroundDrawable(AbstractC1464a.w(getPopupContext(), i7));
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
