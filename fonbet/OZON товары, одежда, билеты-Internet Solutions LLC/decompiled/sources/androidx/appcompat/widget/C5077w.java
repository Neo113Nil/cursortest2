package androidx.appcompat.widget;

import android.R;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.DialogInterface;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.database.DataSetObserver;
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
import android.widget.PopupWindow;
import android.widget.Spinner;
import android.widget.SpinnerAdapter;
import android.widget.ThemedSpinnerAdapter;
import androidx.annotation.NonNull;
import androidx.appcompat.app.AlertController;
import androidx.appcompat.app.f;
import i.C6977a;
import j.C7232a;
import java.util.Objects;

/* renamed from: androidx.appcompat.widget.w, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C5077w extends Spinner {

    /* renamed from: i, reason: collision with root package name */
    @SuppressLint({"ResourceType"})
    private static final int[] f37979i = {R.attr.spinnerMode};

    /* renamed from: a, reason: collision with root package name */
    private final C5060e f37980a;

    /* renamed from: b, reason: collision with root package name */
    private final Context f37981b;

    /* renamed from: c, reason: collision with root package name */
    private K f37982c;

    /* renamed from: d, reason: collision with root package name */
    private SpinnerAdapter f37983d;

    /* renamed from: e, reason: collision with root package name */
    private final boolean f37984e;

    /* renamed from: f, reason: collision with root package name */
    private g f37985f;

    /* renamed from: g, reason: collision with root package name */
    int f37986g;

    /* renamed from: h, reason: collision with root package name */
    final Rect f37987h;

    /* renamed from: androidx.appcompat.widget.w$a */
    /* loaded from: classes8.dex */
    final class a implements ViewTreeObserver.OnGlobalLayoutListener {
        a() {
        }

        @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
        public final void onGlobalLayout() {
            C5077w c5077w = C5077w.this;
            if (!c5077w.b().a()) {
                c5077w.c();
            }
            ViewTreeObserver viewTreeObserver = c5077w.getViewTreeObserver();
            if (viewTreeObserver != null) {
                viewTreeObserver.removeOnGlobalLayoutListener(this);
            }
        }
    }

    /* renamed from: androidx.appcompat.widget.w$b */
    /* loaded from: classes8.dex */
    private static final class b {
        static void a(@NonNull ThemedSpinnerAdapter themedSpinnerAdapter, Resources.Theme theme) {
            if (Objects.equals(themedSpinnerAdapter.getDropDownViewTheme(), theme)) {
                return;
            }
            themedSpinnerAdapter.setDropDownViewTheme(theme);
        }
    }

    /* renamed from: androidx.appcompat.widget.w$c */
    /* loaded from: classes8.dex */
    class c implements g, DialogInterface.OnClickListener {

        /* renamed from: a, reason: collision with root package name */
        androidx.appcompat.app.f f37989a;

        /* renamed from: b, reason: collision with root package name */
        private ListAdapter f37990b;

        /* renamed from: c, reason: collision with root package name */
        private CharSequence f37991c;

        c() {
        }

        @Override // androidx.appcompat.widget.C5077w.g
        public final boolean a() {
            androidx.appcompat.app.f fVar = this.f37989a;
            if (fVar != null) {
                return fVar.isShowing();
            }
            return false;
        }

        @Override // androidx.appcompat.widget.C5077w.g
        public final Drawable b() {
            return null;
        }

        @Override // androidx.appcompat.widget.C5077w.g
        public final void c(int i11) {
            Log.e("AppCompatSpinner", "Cannot set vertical offset for MODE_DIALOG, ignoring");
        }

        @Override // androidx.appcompat.widget.C5077w.g
        public final void d(int i11) {
            Log.e("AppCompatSpinner", "Cannot set horizontal (original) offset for MODE_DIALOG, ignoring");
        }

        @Override // androidx.appcompat.widget.C5077w.g
        public final void dismiss() {
            androidx.appcompat.app.f fVar = this.f37989a;
            if (fVar != null) {
                fVar.dismiss();
                this.f37989a = null;
            }
        }

        @Override // androidx.appcompat.widget.C5077w.g
        public final void e(int i11, int i12) {
            if (this.f37990b == null) {
                return;
            }
            C5077w c5077w = C5077w.this;
            f.a aVar = new f.a(c5077w.getPopupContext());
            CharSequence charSequence = this.f37991c;
            if (charSequence != null) {
                aVar.setTitle(charSequence);
            }
            aVar.n(this.f37990b, c5077w.getSelectedItemPosition(), this);
            androidx.appcompat.app.f create = aVar.create();
            this.f37989a = create;
            AlertController.RecycleListView b11 = create.b();
            b11.setTextDirection(i11);
            b11.setTextAlignment(i12);
            this.f37989a.show();
        }

        @Override // androidx.appcompat.widget.C5077w.g
        public final int f() {
            return 0;
        }

        @Override // androidx.appcompat.widget.C5077w.g
        public final int g() {
            return 0;
        }

        @Override // androidx.appcompat.widget.C5077w.g
        public final void j(int i11) {
            Log.e("AppCompatSpinner", "Cannot set horizontal offset for MODE_DIALOG, ignoring");
        }

        @Override // androidx.appcompat.widget.C5077w.g
        public final CharSequence k() {
            return this.f37991c;
        }

        @Override // androidx.appcompat.widget.C5077w.g
        public final void l(CharSequence charSequence) {
            this.f37991c = charSequence;
        }

        @Override // androidx.appcompat.widget.C5077w.g
        public final void n(ListAdapter listAdapter) {
            this.f37990b = listAdapter;
        }

        @Override // androidx.appcompat.widget.C5077w.g
        public final void o(Drawable drawable) {
            Log.e("AppCompatSpinner", "Cannot set popup background for MODE_DIALOG, ignoring");
        }

        @Override // android.content.DialogInterface.OnClickListener
        public final void onClick(DialogInterface dialogInterface, int i11) {
            C5077w c5077w = C5077w.this;
            c5077w.setSelection(i11);
            if (c5077w.getOnItemClickListener() != null) {
                c5077w.performItemClick(null, i11, this.f37990b.getItemId(i11));
            }
            dismiss();
        }
    }

    /* renamed from: androidx.appcompat.widget.w$d */
    /* loaded from: classes8.dex */
    private static class d implements ListAdapter, SpinnerAdapter {

        /* renamed from: a, reason: collision with root package name */
        private SpinnerAdapter f37993a;

        /* renamed from: b, reason: collision with root package name */
        private ListAdapter f37994b;

        public d(SpinnerAdapter spinnerAdapter, Resources.Theme theme) {
            this.f37993a = spinnerAdapter;
            if (spinnerAdapter instanceof ListAdapter) {
                this.f37994b = (ListAdapter) spinnerAdapter;
            }
            if (theme != null) {
                if (spinnerAdapter instanceof ThemedSpinnerAdapter) {
                    b.a((ThemedSpinnerAdapter) spinnerAdapter, theme);
                } else if (spinnerAdapter instanceof X) {
                    X x11 = (X) spinnerAdapter;
                    if (x11.getDropDownViewTheme() == null) {
                        x11.a();
                    }
                }
            }
        }

        @Override // android.widget.ListAdapter
        public final boolean areAllItemsEnabled() {
            ListAdapter listAdapter = this.f37994b;
            if (listAdapter != null) {
                return listAdapter.areAllItemsEnabled();
            }
            return true;
        }

        @Override // android.widget.Adapter
        public final int getCount() {
            SpinnerAdapter spinnerAdapter = this.f37993a;
            if (spinnerAdapter == null) {
                return 0;
            }
            return spinnerAdapter.getCount();
        }

        @Override // android.widget.SpinnerAdapter
        public final View getDropDownView(int i11, View view, ViewGroup viewGroup) {
            SpinnerAdapter spinnerAdapter = this.f37993a;
            if (spinnerAdapter == null) {
                return null;
            }
            return spinnerAdapter.getDropDownView(i11, view, viewGroup);
        }

        @Override // android.widget.Adapter
        public final Object getItem(int i11) {
            SpinnerAdapter spinnerAdapter = this.f37993a;
            if (spinnerAdapter == null) {
                return null;
            }
            return spinnerAdapter.getItem(i11);
        }

        @Override // android.widget.Adapter
        public final long getItemId(int i11) {
            SpinnerAdapter spinnerAdapter = this.f37993a;
            if (spinnerAdapter == null) {
                return -1L;
            }
            return spinnerAdapter.getItemId(i11);
        }

        @Override // android.widget.Adapter
        public final int getItemViewType(int i11) {
            return 0;
        }

        @Override // android.widget.Adapter
        public final View getView(int i11, View view, ViewGroup viewGroup) {
            return getDropDownView(i11, view, viewGroup);
        }

        @Override // android.widget.Adapter
        public final int getViewTypeCount() {
            return 1;
        }

        @Override // android.widget.Adapter
        public final boolean hasStableIds() {
            SpinnerAdapter spinnerAdapter = this.f37993a;
            return spinnerAdapter != null && spinnerAdapter.hasStableIds();
        }

        @Override // android.widget.Adapter
        public final boolean isEmpty() {
            return getCount() == 0;
        }

        @Override // android.widget.ListAdapter
        public final boolean isEnabled(int i11) {
            ListAdapter listAdapter = this.f37994b;
            if (listAdapter != null) {
                return listAdapter.isEnabled(i11);
            }
            return true;
        }

        @Override // android.widget.Adapter
        public final void registerDataSetObserver(DataSetObserver dataSetObserver) {
            SpinnerAdapter spinnerAdapter = this.f37993a;
            if (spinnerAdapter != null) {
                spinnerAdapter.registerDataSetObserver(dataSetObserver);
            }
        }

        @Override // android.widget.Adapter
        public final void unregisterDataSetObserver(DataSetObserver dataSetObserver) {
            SpinnerAdapter spinnerAdapter = this.f37993a;
            if (spinnerAdapter != null) {
                spinnerAdapter.unregisterDataSetObserver(dataSetObserver);
            }
        }
    }

    /* renamed from: androidx.appcompat.widget.w$e */
    /* loaded from: classes8.dex */
    class e extends M implements g {

        /* renamed from: B, reason: collision with root package name */
        private CharSequence f37995B;

        /* renamed from: C, reason: collision with root package name */
        ListAdapter f37996C;

        /* renamed from: D, reason: collision with root package name */
        private final Rect f37997D;

        /* renamed from: E, reason: collision with root package name */
        private int f37998E;

        /* renamed from: androidx.appcompat.widget.w$e$a */
        final class a implements ViewTreeObserver.OnGlobalLayoutListener {
            a() {
            }

            @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
            public final void onGlobalLayout() {
                e eVar = e.this;
                if (!eVar.H(C5077w.this)) {
                    eVar.dismiss();
                } else {
                    eVar.G();
                    eVar.show();
                }
            }
        }

        /* renamed from: androidx.appcompat.widget.w$e$b */
        final class b implements PopupWindow.OnDismissListener {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ ViewTreeObserver.OnGlobalLayoutListener f38001a;

            b(ViewTreeObserver.OnGlobalLayoutListener onGlobalLayoutListener) {
                this.f38001a = onGlobalLayoutListener;
            }

            @Override // android.widget.PopupWindow.OnDismissListener
            public final void onDismiss() {
                ViewTreeObserver viewTreeObserver = C5077w.this.getViewTreeObserver();
                if (viewTreeObserver != null) {
                    viewTreeObserver.removeGlobalOnLayoutListener(this.f38001a);
                }
            }
        }

        public e(Context context, AttributeSet attributeSet) {
            super(context, attributeSet, ru.ozon.app.android.R.attr.spinnerStyle);
            this.f37997D = new Rect();
            w(C5077w.this);
            C();
            E(new C5078x(this));
        }

        final void G() {
            int i11;
            PopupWindow popupWindow = this.f37693y;
            Drawable background = popupWindow.getBackground();
            C5077w c5077w = C5077w.this;
            if (background != null) {
                background.getPadding(c5077w.f37987h);
                int i12 = i0.f37951d;
                int layoutDirection = c5077w.getLayoutDirection();
                Rect rect = c5077w.f37987h;
                i11 = layoutDirection == 1 ? rect.right : -rect.left;
            } else {
                Rect rect2 = c5077w.f37987h;
                rect2.right = 0;
                rect2.left = 0;
                i11 = 0;
            }
            int paddingLeft = c5077w.getPaddingLeft();
            int paddingRight = c5077w.getPaddingRight();
            int width = c5077w.getWidth();
            int i13 = c5077w.f37986g;
            if (i13 == -2) {
                int a11 = c5077w.a((SpinnerAdapter) this.f37996C, popupWindow.getBackground());
                int i14 = c5077w.getContext().getResources().getDisplayMetrics().widthPixels;
                Rect rect3 = c5077w.f37987h;
                int i15 = (i14 - rect3.left) - rect3.right;
                if (a11 > i15) {
                    a11 = i15;
                }
                y(Math.max(a11, (width - paddingLeft) - paddingRight));
            } else if (i13 == -1) {
                y((width - paddingLeft) - paddingRight);
            } else {
                y(i13);
            }
            int i16 = i0.f37951d;
            j(c5077w.getLayoutDirection() == 1 ? (((width - paddingRight) - u()) - this.f37998E) + i11 : paddingLeft + this.f37998E + i11);
        }

        final boolean H(View view) {
            return view.isAttachedToWindow() && view.getGlobalVisibleRect(this.f37997D);
        }

        @Override // androidx.appcompat.widget.C5077w.g
        public final void d(int i11) {
            this.f37998E = i11;
        }

        @Override // androidx.appcompat.widget.C5077w.g
        public final void e(int i11, int i12) {
            ViewTreeObserver viewTreeObserver;
            PopupWindow popupWindow = this.f37693y;
            boolean isShowing = popupWindow.isShowing();
            G();
            B();
            show();
            I i13 = this.f37671c;
            i13.setChoiceMode(1);
            i13.setTextDirection(i11);
            i13.setTextAlignment(i12);
            C5077w c5077w = C5077w.this;
            int selectedItemPosition = c5077w.getSelectedItemPosition();
            I i14 = this.f37671c;
            if (popupWindow.isShowing() && i14 != null) {
                i14.c(false);
                i14.setSelection(selectedItemPosition);
                if (i14.getChoiceMode() != 0) {
                    i14.setItemChecked(selectedItemPosition, true);
                }
            }
            if (isShowing || (viewTreeObserver = c5077w.getViewTreeObserver()) == null) {
                return;
            }
            a aVar = new a();
            viewTreeObserver.addOnGlobalLayoutListener(aVar);
            D(new b(aVar));
        }

        @Override // androidx.appcompat.widget.C5077w.g
        public final CharSequence k() {
            return this.f37995B;
        }

        @Override // androidx.appcompat.widget.C5077w.g
        public final void l(CharSequence charSequence) {
            this.f37995B = charSequence;
        }

        @Override // androidx.appcompat.widget.M, androidx.appcompat.widget.C5077w.g
        public final void n(ListAdapter listAdapter) {
            super.n(listAdapter);
            this.f37996C = listAdapter;
        }
    }

    /* renamed from: androidx.appcompat.widget.w$f */
    /* loaded from: classes8.dex */
    static class f extends View.BaseSavedState {
        public static final Parcelable.Creator<f> CREATOR = new a();

        /* renamed from: a, reason: collision with root package name */
        boolean f38003a;

        /* renamed from: androidx.appcompat.widget.w$f$a */
        final class a implements Parcelable.Creator<f> {
            @Override // android.os.Parcelable.Creator
            public final f createFromParcel(Parcel parcel) {
                f fVar = new f(parcel);
                fVar.f38003a = parcel.readByte() != 0;
                return fVar;
            }

            @Override // android.os.Parcelable.Creator
            public final f[] newArray(int i11) {
                return new f[i11];
            }
        }

        f(Parcelable parcelable) {
            super(parcelable);
        }

        @Override // android.view.View.BaseSavedState, android.view.AbsSavedState, android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i11) {
            super.writeToParcel(parcel, i11);
            parcel.writeByte(this.f38003a ? (byte) 1 : (byte) 0);
        }
    }

    /* renamed from: androidx.appcompat.widget.w$g */
    /* loaded from: classes8.dex */
    interface g {
        boolean a();

        Drawable b();

        void c(int i11);

        void d(int i11);

        void dismiss();

        void e(int i11, int i12);

        int f();

        int g();

        void j(int i11);

        CharSequence k();

        void l(CharSequence charSequence);

        void n(ListAdapter listAdapter);

        void o(Drawable drawable);
    }

    /* JADX WARN: Code restructure failed: missing block: B:29:0x005c, code lost:
    
        if (r6 == null) goto L24;
     */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00d1  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public C5077w(@NonNull Context context, AttributeSet attributeSet) {
        super(context, attributeSet, ru.ozon.app.android.R.attr.spinnerStyle);
        TypedArray typedArray;
        this.f37987h = new Rect();
        W.a(this, getContext());
        int[] iArr = C6977a.f65668v;
        b0 v11 = b0.v(context, attributeSet, iArr, ru.ozon.app.android.R.attr.spinnerStyle, 0);
        this.f37980a = new C5060e(this);
        int n11 = v11.n(4, 0);
        if (n11 != 0) {
            this.f37981b = new androidx.appcompat.view.d(context, n11);
        } else {
            this.f37981b = context;
        }
        int i11 = -1;
        TypedArray typedArray2 = null;
        try {
            typedArray = context.obtainStyledAttributes(attributeSet, f37979i, ru.ozon.app.android.R.attr.spinnerStyle, 0);
            try {
                try {
                    if (typedArray.hasValue(0)) {
                        i11 = typedArray.getInt(0, 0);
                    }
                } catch (Exception e11) {
                    e = e11;
                    Log.i("AppCompatSpinner", "Could not read android:spinnerMode", e);
                }
            } catch (Throwable th2) {
                th = th2;
                typedArray2 = typedArray;
                if (typedArray2 != null) {
                    typedArray2.recycle();
                }
                throw th;
            }
        } catch (Exception e12) {
            e = e12;
            typedArray = null;
        } catch (Throwable th3) {
            th = th3;
            if (typedArray2 != null) {
            }
            throw th;
        }
        typedArray.recycle();
        if (i11 == 0) {
            c cVar = new c();
            this.f37985f = cVar;
            cVar.l(v11.o(2));
        } else if (i11 == 1) {
            e eVar = new e(this.f37981b, attributeSet);
            b0 v12 = b0.v(this.f37981b, attributeSet, iArr, ru.ozon.app.android.R.attr.spinnerStyle, 0);
            this.f37986g = v12.m(3, -2);
            eVar.o(v12.g(1));
            eVar.l(v11.o(2));
            v12.x();
            this.f37985f = eVar;
            this.f37982c = new C5076v(this, this, eVar);
        }
        CharSequence[] q11 = v11.q();
        if (q11 != null) {
            ArrayAdapter arrayAdapter = new ArrayAdapter(context, R.layout.simple_spinner_item, q11);
            arrayAdapter.setDropDownViewResource(ru.ozon.app.android.R.layout.support_simple_spinner_dropdown_item);
            setAdapter((SpinnerAdapter) arrayAdapter);
        }
        v11.x();
        this.f37984e = true;
        SpinnerAdapter spinnerAdapter = this.f37983d;
        if (spinnerAdapter != null) {
            setAdapter(spinnerAdapter);
            this.f37983d = null;
        }
        this.f37980a.d(attributeSet, ru.ozon.app.android.R.attr.spinnerStyle);
    }

    final int a(SpinnerAdapter spinnerAdapter, Drawable drawable) {
        int i11 = 0;
        if (spinnerAdapter == null) {
            return 0;
        }
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(getMeasuredWidth(), 0);
        int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(getMeasuredHeight(), 0);
        int max = Math.max(0, getSelectedItemPosition());
        int min = Math.min(spinnerAdapter.getCount(), max + 15);
        View view = null;
        int i12 = 0;
        for (int max2 = Math.max(0, max - (15 - (min - max))); max2 < min; max2++) {
            int itemViewType = spinnerAdapter.getItemViewType(max2);
            if (itemViewType != i11) {
                view = null;
                i11 = itemViewType;
            }
            view = spinnerAdapter.getView(max2, view, this);
            if (view.getLayoutParams() == null) {
                view.setLayoutParams(new ViewGroup.LayoutParams(-2, -2));
            }
            view.measure(makeMeasureSpec, makeMeasureSpec2);
            i12 = Math.max(i12, view.getMeasuredWidth());
        }
        if (drawable == null) {
            return i12;
        }
        Rect rect = this.f37987h;
        drawable.getPadding(rect);
        return rect.left + rect.right + i12;
    }

    final g b() {
        return this.f37985f;
    }

    final void c() {
        this.f37985f.e(getTextDirection(), getTextAlignment());
    }

    @Override // android.view.ViewGroup, android.view.View
    protected final void drawableStateChanged() {
        super.drawableStateChanged();
        C5060e c5060e = this.f37980a;
        if (c5060e != null) {
            c5060e.a();
        }
    }

    @Override // android.widget.Spinner
    public final int getDropDownHorizontalOffset() {
        g gVar = this.f37985f;
        return gVar != null ? gVar.g() : super.getDropDownHorizontalOffset();
    }

    @Override // android.widget.Spinner
    public final int getDropDownVerticalOffset() {
        g gVar = this.f37985f;
        return gVar != null ? gVar.f() : super.getDropDownVerticalOffset();
    }

    @Override // android.widget.Spinner
    public final int getDropDownWidth() {
        return this.f37985f != null ? this.f37986g : super.getDropDownWidth();
    }

    @Override // android.widget.Spinner
    public final Drawable getPopupBackground() {
        g gVar = this.f37985f;
        return gVar != null ? gVar.b() : super.getPopupBackground();
    }

    @Override // android.widget.Spinner
    public final Context getPopupContext() {
        return this.f37981b;
    }

    @Override // android.widget.Spinner
    public final CharSequence getPrompt() {
        g gVar = this.f37985f;
        return gVar != null ? gVar.k() : super.getPrompt();
    }

    @Override // android.widget.Spinner, android.widget.AdapterView, android.view.ViewGroup, android.view.View
    protected final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        g gVar = this.f37985f;
        if (gVar == null || !gVar.a()) {
            return;
        }
        gVar.dismiss();
    }

    @Override // android.widget.Spinner, android.widget.AbsSpinner, android.view.View
    protected final void onMeasure(int i11, int i12) {
        super.onMeasure(i11, i12);
        if (this.f37985f == null || View.MeasureSpec.getMode(i11) != Integer.MIN_VALUE) {
            return;
        }
        setMeasuredDimension(Math.min(Math.max(getMeasuredWidth(), a(getAdapter(), getBackground())), View.MeasureSpec.getSize(i11)), getMeasuredHeight());
    }

    @Override // android.widget.Spinner, android.widget.AbsSpinner, android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        ViewTreeObserver viewTreeObserver;
        f fVar = (f) parcelable;
        super.onRestoreInstanceState(fVar.getSuperState());
        if (!fVar.f38003a || (viewTreeObserver = getViewTreeObserver()) == null) {
            return;
        }
        viewTreeObserver.addOnGlobalLayoutListener(new a());
    }

    @Override // android.widget.Spinner, android.widget.AbsSpinner, android.view.View
    public final Parcelable onSaveInstanceState() {
        f fVar = new f(super.onSaveInstanceState());
        g gVar = this.f37985f;
        fVar.f38003a = gVar != null && gVar.a();
        return fVar;
    }

    @Override // android.widget.Spinner, android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        K k11 = this.f37982c;
        if (k11 == null || !k11.onTouch(this, motionEvent)) {
            return super.onTouchEvent(motionEvent);
        }
        return true;
    }

    @Override // android.widget.Spinner, android.view.View
    public final boolean performClick() {
        g gVar = this.f37985f;
        if (gVar == null) {
            return super.performClick();
        }
        if (gVar.a()) {
            return true;
        }
        c();
        return true;
    }

    @Override // android.view.View
    public final void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        C5060e c5060e = this.f37980a;
        if (c5060e != null) {
            c5060e.e();
        }
    }

    @Override // android.view.View
    public final void setBackgroundResource(int i11) {
        super.setBackgroundResource(i11);
        C5060e c5060e = this.f37980a;
        if (c5060e != null) {
            c5060e.f(i11);
        }
    }

    @Override // android.widget.Spinner
    public final void setDropDownHorizontalOffset(int i11) {
        g gVar = this.f37985f;
        if (gVar == null) {
            super.setDropDownHorizontalOffset(i11);
        } else {
            gVar.d(i11);
            gVar.j(i11);
        }
    }

    @Override // android.widget.Spinner
    public final void setDropDownVerticalOffset(int i11) {
        g gVar = this.f37985f;
        if (gVar != null) {
            gVar.c(i11);
        } else {
            super.setDropDownVerticalOffset(i11);
        }
    }

    @Override // android.widget.Spinner
    public final void setDropDownWidth(int i11) {
        if (this.f37985f != null) {
            this.f37986g = i11;
        } else {
            super.setDropDownWidth(i11);
        }
    }

    @Override // android.widget.Spinner
    public final void setPopupBackgroundDrawable(Drawable drawable) {
        g gVar = this.f37985f;
        if (gVar != null) {
            gVar.o(drawable);
        } else {
            super.setPopupBackgroundDrawable(drawable);
        }
    }

    @Override // android.widget.Spinner
    public final void setPopupBackgroundResource(int i11) {
        setPopupBackgroundDrawable(C7232a.a(this.f37981b, i11));
    }

    @Override // android.widget.Spinner
    public final void setPrompt(CharSequence charSequence) {
        g gVar = this.f37985f;
        if (gVar != null) {
            gVar.l(charSequence);
        } else {
            super.setPrompt(charSequence);
        }
    }

    @Override // android.widget.AdapterView
    public final void setAdapter(SpinnerAdapter spinnerAdapter) {
        if (!this.f37984e) {
            this.f37983d = spinnerAdapter;
            return;
        }
        super.setAdapter(spinnerAdapter);
        g gVar = this.f37985f;
        if (gVar != null) {
            Context context = this.f37981b;
            if (context == null) {
                context = getContext();
            }
            gVar.n(new d(spinnerAdapter, context.getTheme()));
        }
    }
}
