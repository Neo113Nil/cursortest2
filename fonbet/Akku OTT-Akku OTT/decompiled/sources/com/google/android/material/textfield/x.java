package com.google.android.material.textfield;

import android.R;
import android.accessibilityservice.AccessibilityServiceInfo;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.os.Build;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityManager;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Filterable;
import android.widget.ListAdapter;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.AppCompatAutoCompleteTextView;
import androidx.appcompat.widget.ListPopupWindow;
import androidx.core.graphics.ColorUtils;
import androidx.core.graphics.drawable.DrawableCompat;
import androidx.core.view.ViewCompat;
import java.util.List;
import java.util.Locale;

/* loaded from: classes4.dex */
public final class x extends AppCompatAutoCompleteTextView {

    @NonNull
    public final ListPopupWindow a;

    @Nullable
    public final AccessibilityManager b;

    @NonNull
    public final Rect c;
    public final float d;

    @Nullable
    public final ColorStateList e;
    public final int f;

    @Nullable
    public final ColorStateList i;

    public class a implements AdapterView.OnItemClickListener {
        public a() {
        }

        @Override // android.widget.AdapterView.OnItemClickListener
        public final void onItemClick(AdapterView<?> adapterView, View view, int i, long j) {
            x xVar = x.this;
            ListPopupWindow listPopupWindow = xVar.a;
            x.a(xVar, i < 0 ? listPopupWindow.getSelectedItem() : xVar.getAdapter().getItem(i));
            AdapterView.OnItemClickListener onItemClickListener = xVar.getOnItemClickListener();
            if (onItemClickListener != null) {
                if (view == null || i < 0) {
                    view = listPopupWindow.getSelectedView();
                    i = listPopupWindow.getSelectedItemPosition();
                    j = listPopupWindow.getSelectedItemId();
                }
                onItemClickListener.onItemClick(listPopupWindow.getListView(), view, i, j);
            }
            listPopupWindow.dismiss();
        }
    }

    public class b<T> extends ArrayAdapter<String> {

        @Nullable
        public final ColorStateList a;

        @Nullable
        public final ColorStateList b;

        public b(@NonNull Context context, int i, @NonNull String[] strArr) {
            super(context, i, strArr);
            ColorStateList colorStateList;
            ColorStateList colorStateList2;
            ColorStateList colorStateList3 = x.this.i;
            ColorStateList colorStateList4 = null;
            if (colorStateList3 != null) {
                int[] iArr = {R.attr.state_pressed};
                colorStateList = new ColorStateList(new int[][]{iArr, new int[0]}, new int[]{colorStateList3.getColorForState(iArr, 0), 0});
            } else {
                colorStateList = null;
            }
            this.b = colorStateList;
            int i2 = x.this.f;
            if (i2 != 0 && (colorStateList2 = x.this.i) != null) {
                int[] iArr2 = {R.attr.state_hovered, -16842919};
                int[] iArr3 = {R.attr.state_selected, -16842919};
                colorStateList4 = new ColorStateList(new int[][]{iArr3, iArr2, new int[0]}, new int[]{ColorUtils.compositeColors(colorStateList2.getColorForState(iArr3, 0), i2), ColorUtils.compositeColors(x.this.i.getColorForState(iArr2, 0), i2), i2});
            }
            this.a = colorStateList4;
        }

        @Override // android.widget.ArrayAdapter, android.widget.Adapter
        public final View getView(int i, @Nullable View view, ViewGroup viewGroup) {
            View view2 = super.getView(i, view, viewGroup);
            if (view2 instanceof TextView) {
                TextView textView = (TextView) view2;
                x xVar = x.this;
                Drawable drawable = null;
                if (xVar.getText().toString().contentEquals(textView.getText()) && xVar.f != 0) {
                    ColorDrawable colorDrawable = new ColorDrawable(xVar.f);
                    if (this.b != null) {
                        DrawableCompat.setTintList(colorDrawable, this.a);
                        drawable = new RippleDrawable(this.b, colorDrawable, null);
                    } else {
                        drawable = colorDrawable;
                    }
                }
                ViewCompat.setBackground(textView, drawable);
            }
            return view2;
        }
    }

    public x(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(com.google.android.material.theme.overlay.a.a(context, attributeSet, com.haryanvi.netstream.R.attr.autoCompleteTextViewStyle, 0), attributeSet, com.haryanvi.netstream.R.attr.autoCompleteTextViewStyle);
        this.c = new Rect();
        Context context2 = getContext();
        TypedArray d = com.google.android.material.internal.i.d(context2, attributeSet, com.google.android.material.a.j, com.haryanvi.netstream.R.attr.autoCompleteTextViewStyle, com.haryanvi.netstream.R.style.Widget_AppCompat_AutoCompleteTextView, new int[0]);
        if (d.hasValue(0) && d.getInt(0, 0) == 0) {
            setKeyListener(null);
        }
        int resourceId = d.getResourceId(3, com.haryanvi.netstream.R.layout.mtrl_auto_complete_simple_item);
        this.d = d.getDimensionPixelOffset(1, com.haryanvi.netstream.R.dimen.mtrl_exposed_dropdown_menu_popup_elevation);
        if (d.hasValue(2)) {
            this.e = ColorStateList.valueOf(d.getColor(2, 0));
        }
        this.f = d.getColor(4, 0);
        this.i = com.google.android.material.resources.c.a(context2, d, 5);
        this.b = (AccessibilityManager) context2.getSystemService("accessibility");
        ListPopupWindow listPopupWindow = new ListPopupWindow(context2);
        this.a = listPopupWindow;
        listPopupWindow.setModal(true);
        listPopupWindow.setAnchorView(this);
        listPopupWindow.setInputMethodMode(2);
        listPopupWindow.setAdapter(getAdapter());
        listPopupWindow.setOnItemClickListener(new a());
        if (d.hasValue(6)) {
            setAdapter(new b(getContext(), resourceId, getResources().getStringArray(d.getResourceId(6, 0))));
        }
        d.recycle();
    }

    public static void a(x xVar, Object obj) {
        xVar.setText(xVar.convertSelectionToString(obj), false);
    }

    @Nullable
    public final TextInputLayout b() {
        for (ViewParent parent = getParent(); parent != null; parent = parent.getParent()) {
            if (parent instanceof TextInputLayout) {
                return (TextInputLayout) parent;
            }
        }
        return null;
    }

    public final boolean c() {
        List<AccessibilityServiceInfo> enabledAccessibilityServiceList;
        AccessibilityManager accessibilityManager = this.b;
        if (accessibilityManager != null && accessibilityManager.isTouchExplorationEnabled()) {
            return true;
        }
        if (accessibilityManager == null || !accessibilityManager.isEnabled() || (enabledAccessibilityServiceList = accessibilityManager.getEnabledAccessibilityServiceList(16)) == null) {
            return false;
        }
        for (AccessibilityServiceInfo accessibilityServiceInfo : enabledAccessibilityServiceList) {
            if (accessibilityServiceInfo.getSettingsActivityName() != null && accessibilityServiceInfo.getSettingsActivityName().contains("SwitchAccess")) {
                return true;
            }
        }
        return false;
    }

    @Override // android.widget.AutoCompleteTextView
    public final void dismissDropDown() {
        if (c()) {
            this.a.dismiss();
        } else {
            super.dismissDropDown();
        }
    }

    @Override // android.widget.TextView
    @Nullable
    public final CharSequence getHint() {
        TextInputLayout b2 = b();
        if (b2 == null || !b2.G) {
            return super.getHint();
        }
        if (b2.E) {
            return b2.F;
        }
        return null;
    }

    @Override // android.widget.AutoCompleteTextView, android.widget.TextView, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        TextInputLayout b2 = b();
        if (b2 != null && b2.G && super.getHint() == null) {
            String str = Build.MANUFACTURER;
            if ((str != null ? str.toLowerCase(Locale.ENGLISH) : "").equals("meizu")) {
                setHint("");
            }
        }
    }

    @Override // android.widget.AutoCompleteTextView, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.a.dismiss();
    }

    @Override // android.widget.TextView, android.view.View
    public final void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        if (View.MeasureSpec.getMode(i) == Integer.MIN_VALUE) {
            int measuredWidth = getMeasuredWidth();
            ListAdapter adapter = getAdapter();
            TextInputLayout b2 = b();
            int i3 = 0;
            if (adapter != null && b2 != null) {
                int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(getMeasuredWidth(), 0);
                int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(getMeasuredHeight(), 0);
                ListPopupWindow listPopupWindow = this.a;
                int min = Math.min(adapter.getCount(), Math.max(0, listPopupWindow.getSelectedItemPosition()) + 15);
                View view = null;
                int i4 = 0;
                for (int max = Math.max(0, min - 15); max < min; max++) {
                    int itemViewType = adapter.getItemViewType(max);
                    if (itemViewType != i3) {
                        view = null;
                        i3 = itemViewType;
                    }
                    view = adapter.getView(max, view, b2);
                    if (view.getLayoutParams() == null) {
                        view.setLayoutParams(new ViewGroup.LayoutParams(-2, -2));
                    }
                    view.measure(makeMeasureSpec, makeMeasureSpec2);
                    i4 = Math.max(i4, view.getMeasuredWidth());
                }
                Drawable background = listPopupWindow.getBackground();
                if (background != null) {
                    Rect rect = this.c;
                    background.getPadding(rect);
                    i4 += rect.left + rect.right;
                }
                i3 = b2.c.f.getMeasuredWidth() + i4;
            }
            setMeasuredDimension(Math.min(Math.max(measuredWidth, i3), View.MeasureSpec.getSize(i)), getMeasuredHeight());
        }
    }

    @Override // android.widget.AutoCompleteTextView, android.widget.TextView, android.view.View
    public final void onWindowFocusChanged(boolean z) {
        if (c()) {
            return;
        }
        super.onWindowFocusChanged(z);
    }

    @Override // android.widget.AutoCompleteTextView
    public final <T extends ListAdapter & Filterable> void setAdapter(@Nullable T t) {
        super.setAdapter(t);
        this.a.setAdapter(getAdapter());
    }

    @Override // android.widget.AutoCompleteTextView
    public final void setDropDownBackgroundDrawable(Drawable drawable) {
        super.setDropDownBackgroundDrawable(drawable);
        ListPopupWindow listPopupWindow = this.a;
        if (listPopupWindow != null) {
            listPopupWindow.setBackgroundDrawable(drawable);
        }
    }

    @Override // android.widget.AutoCompleteTextView
    public final void setOnItemSelectedListener(@Nullable AdapterView.OnItemSelectedListener onItemSelectedListener) {
        super.setOnItemSelectedListener(onItemSelectedListener);
        this.a.setOnItemSelectedListener(getOnItemSelectedListener());
    }

    @Override // android.widget.TextView
    public final void setRawInputType(int i) {
        super.setRawInputType(i);
        TextInputLayout b2 = b();
        if (b2 != null) {
            b2.w();
        }
    }

    @Override // android.widget.AutoCompleteTextView
    public final void showDropDown() {
        if (c()) {
            this.a.show();
        } else {
            super.showDropDown();
        }
    }
}
