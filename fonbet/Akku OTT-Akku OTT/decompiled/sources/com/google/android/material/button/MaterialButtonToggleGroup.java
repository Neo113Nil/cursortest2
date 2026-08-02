package com.google.android.material.button;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.ToggleButton;
import androidx.annotation.IdRes;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import androidx.core.view.AccessibilityDelegateCompat;
import androidx.core.view.MarginLayoutParamsCompat;
import androidx.core.view.ViewCompat;
import androidx.core.view.accessibility.AccessibilityNodeInfoCompat;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.internal.i;
import com.google.android.material.internal.m;
import com.google.android.material.shape.g;
import com.google.android.material.shape.k;
import com.haryanvi.netstream.R;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeMap;

/* loaded from: classes4.dex */
public class MaterialButtonToggleGroup extends LinearLayout {
    public static final /* synthetic */ int m = 0;
    public final ArrayList a;
    public final e b;
    public final LinkedHashSet<d> c;
    public final a d;
    public Integer[] e;
    public boolean f;
    public final boolean i;
    public final boolean j;

    @IdRes
    public final int k;
    public HashSet l;

    public class a implements Comparator<MaterialButton> {
        public a() {
        }

        @Override // java.util.Comparator
        public final int compare(MaterialButton materialButton, MaterialButton materialButton2) {
            MaterialButton materialButton3 = materialButton;
            MaterialButton materialButton4 = materialButton2;
            int compareTo = Boolean.valueOf(materialButton3.n).compareTo(Boolean.valueOf(materialButton4.n));
            if (compareTo != 0) {
                return compareTo;
            }
            int compareTo2 = Boolean.valueOf(materialButton3.isPressed()).compareTo(Boolean.valueOf(materialButton4.isPressed()));
            if (compareTo2 != 0) {
                return compareTo2;
            }
            MaterialButtonToggleGroup materialButtonToggleGroup = MaterialButtonToggleGroup.this;
            return Integer.valueOf(materialButtonToggleGroup.indexOfChild(materialButton3)).compareTo(Integer.valueOf(materialButtonToggleGroup.indexOfChild(materialButton4)));
        }
    }

    public class b extends AccessibilityDelegateCompat {
        public b() {
        }

        @Override // androidx.core.view.AccessibilityDelegateCompat
        public final void onInitializeAccessibilityNodeInfo(View view, @NonNull AccessibilityNodeInfoCompat accessibilityNodeInfoCompat) {
            int i;
            super.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfoCompat);
            int i2 = MaterialButtonToggleGroup.m;
            if (view instanceof MaterialButton) {
                int i3 = 0;
                int i4 = 0;
                while (true) {
                    MaterialButtonToggleGroup materialButtonToggleGroup = MaterialButtonToggleGroup.this;
                    if (i3 >= materialButtonToggleGroup.getChildCount()) {
                        break;
                    }
                    if (materialButtonToggleGroup.getChildAt(i3) == view) {
                        i = i4;
                        break;
                    }
                    if ((materialButtonToggleGroup.getChildAt(i3) instanceof MaterialButton) && materialButtonToggleGroup.c(i3)) {
                        i4++;
                    }
                    i3++;
                }
                accessibilityNodeInfoCompat.setCollectionItemInfo(AccessibilityNodeInfoCompat.CollectionItemInfoCompat.obtain(0, 1, i, 1, false, ((MaterialButton) view).n));
            }
            i = -1;
            accessibilityNodeInfoCompat.setCollectionItemInfo(AccessibilityNodeInfoCompat.CollectionItemInfoCompat.obtain(0, 1, i, 1, false, ((MaterialButton) view).n));
        }
    }

    public static class c {
        public static final com.google.android.material.shape.a e = new com.google.android.material.shape.a(0.0f);
        public final com.google.android.material.shape.c a;
        public final com.google.android.material.shape.c b;
        public final com.google.android.material.shape.c c;
        public final com.google.android.material.shape.c d;

        public c(com.google.android.material.shape.c cVar, com.google.android.material.shape.c cVar2, com.google.android.material.shape.c cVar3, com.google.android.material.shape.c cVar4) {
            this.a = cVar;
            this.b = cVar3;
            this.c = cVar4;
            this.d = cVar2;
        }
    }

    public interface d {
        void a();
    }

    public class e implements MaterialButton.b {
        public e() {
        }
    }

    public MaterialButtonToggleGroup(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(com.google.android.material.theme.overlay.a.a(context, attributeSet, R.attr.materialButtonToggleGroupStyle, R.style.Widget_MaterialComponents_MaterialButtonToggleGroup), attributeSet, R.attr.materialButtonToggleGroupStyle);
        this.a = new ArrayList();
        this.b = new e();
        this.c = new LinkedHashSet<>();
        this.d = new a();
        this.f = false;
        this.l = new HashSet();
        TypedArray d2 = i.d(getContext(), attributeSet, com.google.android.material.a.l, R.attr.materialButtonToggleGroupStyle, R.style.Widget_MaterialComponents_MaterialButtonToggleGroup, new int[0]);
        boolean z = d2.getBoolean(3, false);
        if (this.i != z) {
            this.i = z;
            d(new HashSet());
        }
        for (int i = 0; i < getChildCount(); i++) {
            ((MaterialButton) getChildAt(i)).i = (this.i ? RadioButton.class : ToggleButton.class).getName();
        }
        this.k = d2.getResourceId(1, -1);
        this.j = d2.getBoolean(2, false);
        setChildrenDrawingOrderEnabled(true);
        setEnabled(d2.getBoolean(0, true));
        d2.recycle();
        ViewCompat.setImportantForAccessibility(this, 1);
    }

    public final void a() {
        int childCount = getChildCount();
        int i = 0;
        while (true) {
            if (i >= childCount) {
                i = -1;
                break;
            } else if (c(i)) {
                break;
            } else {
                i++;
            }
        }
        if (i == -1) {
            return;
        }
        for (int i2 = i + 1; i2 < getChildCount(); i2++) {
            MaterialButton materialButton = (MaterialButton) getChildAt(i2);
            MaterialButton materialButton2 = (MaterialButton) getChildAt(i2 - 1);
            int min = Math.min(materialButton.a() ? materialButton.a.g : 0, materialButton2.a() ? materialButton2.a.g : 0);
            ViewGroup.LayoutParams layoutParams = materialButton.getLayoutParams();
            LinearLayout.LayoutParams layoutParams2 = layoutParams instanceof LinearLayout.LayoutParams ? (LinearLayout.LayoutParams) layoutParams : new LinearLayout.LayoutParams(layoutParams.width, layoutParams.height);
            if (getOrientation() == 0) {
                MarginLayoutParamsCompat.setMarginEnd(layoutParams2, 0);
                MarginLayoutParamsCompat.setMarginStart(layoutParams2, -min);
                layoutParams2.topMargin = 0;
            } else {
                layoutParams2.bottomMargin = 0;
                layoutParams2.topMargin = -min;
                MarginLayoutParamsCompat.setMarginStart(layoutParams2, 0);
            }
            materialButton.setLayoutParams(layoutParams2);
        }
        if (getChildCount() == 0 || i == -1) {
            return;
        }
        LinearLayout.LayoutParams layoutParams3 = (LinearLayout.LayoutParams) ((MaterialButton) getChildAt(i)).getLayoutParams();
        if (getOrientation() == 1) {
            layoutParams3.topMargin = 0;
            layoutParams3.bottomMargin = 0;
        } else {
            MarginLayoutParamsCompat.setMarginEnd(layoutParams3, 0);
            MarginLayoutParamsCompat.setMarginStart(layoutParams3, 0);
            layoutParams3.leftMargin = 0;
            layoutParams3.rightMargin = 0;
        }
    }

    @Override // android.view.ViewGroup
    public final void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        if (view instanceof MaterialButton) {
            super.addView(view, i, layoutParams);
            MaterialButton materialButton = (MaterialButton) view;
            int id2 = materialButton.getId();
            com.google.android.material.button.a aVar = materialButton.a;
            if (id2 == -1) {
                materialButton.setId(ViewCompat.generateViewId());
            }
            materialButton.setMaxLines(1);
            materialButton.setEllipsize(TextUtils.TruncateAt.END);
            if (materialButton.a()) {
                aVar.o = true;
            }
            materialButton.c = this.b;
            if (materialButton.a()) {
                aVar.m = true;
                g b2 = aVar.b(false);
                g b3 = aVar.b(true);
                if (b2 != null) {
                    float f = aVar.g;
                    ColorStateList colorStateList = aVar.j;
                    b2.a.j = f;
                    b2.invalidateSelf();
                    g.b bVar = b2.a;
                    if (bVar.d != colorStateList) {
                        bVar.d = colorStateList;
                        b2.onStateChange(b2.getState());
                    }
                    if (b3 != null) {
                        float f2 = aVar.g;
                        int b4 = aVar.m ? com.google.android.material.color.a.b(aVar.a, R.attr.colorSurface) : 0;
                        b3.a.j = f2;
                        b3.invalidateSelf();
                        ColorStateList valueOf = ColorStateList.valueOf(b4);
                        g.b bVar2 = b3.a;
                        if (bVar2.d != valueOf) {
                            bVar2.d = valueOf;
                            b3.onStateChange(b3.getState());
                        }
                    }
                }
            }
            b(materialButton.getId(), materialButton.n);
            if (!materialButton.a()) {
                throw new IllegalStateException("Attempted to get ShapeAppearanceModel from a MaterialButton which has an overwritten background.");
            }
            k kVar = aVar.b;
            this.a.add(new c(kVar.e, kVar.h, kVar.f, kVar.g));
            materialButton.setEnabled(isEnabled());
            ViewCompat.setAccessibilityDelegate(materialButton, new b());
        }
    }

    public final void b(@IdRes int i, boolean z) {
        if (i == -1) {
            return;
        }
        HashSet hashSet = new HashSet(this.l);
        if (z && !hashSet.contains(Integer.valueOf(i))) {
            if (this.i && !hashSet.isEmpty()) {
                hashSet.clear();
            }
            hashSet.add(Integer.valueOf(i));
        } else {
            if (z || !hashSet.contains(Integer.valueOf(i))) {
                return;
            }
            if (!this.j || hashSet.size() > 1) {
                hashSet.remove(Integer.valueOf(i));
            }
        }
        d(hashSet);
    }

    public final boolean c(int i) {
        return getChildAt(i).getVisibility() != 8;
    }

    public final void d(Set<Integer> set) {
        HashSet hashSet = this.l;
        this.l = new HashSet(set);
        for (int i = 0; i < getChildCount(); i++) {
            int id2 = ((MaterialButton) getChildAt(i)).getId();
            boolean contains = set.contains(Integer.valueOf(id2));
            View findViewById = findViewById(id2);
            if (findViewById instanceof MaterialButton) {
                this.f = true;
                ((MaterialButton) findViewById).setChecked(contains);
                this.f = false;
            }
            if (hashSet.contains(Integer.valueOf(id2)) != set.contains(Integer.valueOf(id2))) {
                set.contains(Integer.valueOf(id2));
                Iterator<d> it = this.c.iterator();
                while (it.hasNext()) {
                    it.next().a();
                }
            }
        }
        invalidate();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(@NonNull Canvas canvas) {
        TreeMap treeMap = new TreeMap(this.d);
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            treeMap.put((MaterialButton) getChildAt(i), Integer.valueOf(i));
        }
        this.e = (Integer[]) treeMap.values().toArray(new Integer[0]);
        super.dispatchDraw(canvas);
    }

    @VisibleForTesting
    public final void e() {
        int i;
        c cVar;
        int childCount = getChildCount();
        int childCount2 = getChildCount();
        int i2 = 0;
        while (true) {
            i = -1;
            if (i2 >= childCount2) {
                i2 = -1;
                break;
            } else if (c(i2)) {
                break;
            } else {
                i2++;
            }
        }
        int childCount3 = getChildCount() - 1;
        while (true) {
            if (childCount3 < 0) {
                break;
            }
            if (c(childCount3)) {
                i = childCount3;
                break;
            }
            childCount3--;
        }
        for (int i3 = 0; i3 < childCount; i3++) {
            MaterialButton materialButton = (MaterialButton) getChildAt(i3);
            if (materialButton.getVisibility() != 8) {
                if (!materialButton.a()) {
                    throw new IllegalStateException("Attempted to get ShapeAppearanceModel from a MaterialButton which has an overwritten background.");
                }
                k.a e2 = materialButton.a.b.e();
                c cVar2 = (c) this.a.get(i3);
                if (i2 != i) {
                    boolean z = getOrientation() == 0;
                    com.google.android.material.shape.a aVar = c.e;
                    if (i3 == i2) {
                        cVar = z ? m.a(this) ? new c(aVar, aVar, cVar2.b, cVar2.c) : new c(cVar2.a, cVar2.d, aVar, aVar) : new c(cVar2.a, aVar, cVar2.b, aVar);
                    } else if (i3 == i) {
                        cVar = z ? m.a(this) ? new c(cVar2.a, cVar2.d, aVar, aVar) : new c(aVar, aVar, cVar2.b, cVar2.c) : new c(aVar, cVar2.d, aVar, cVar2.c);
                    } else {
                        cVar2 = null;
                    }
                    cVar2 = cVar;
                }
                if (cVar2 == null) {
                    e2.e = new com.google.android.material.shape.a(0.0f);
                    e2.f = new com.google.android.material.shape.a(0.0f);
                    e2.g = new com.google.android.material.shape.a(0.0f);
                    e2.h = new com.google.android.material.shape.a(0.0f);
                } else {
                    e2.e = cVar2.a;
                    e2.h = cVar2.d;
                    e2.f = cVar2.b;
                    e2.g = cVar2.c;
                }
                materialButton.b(e2.a());
            }
        }
    }

    @Override // android.view.ViewGroup
    public final int getChildDrawingOrder(int i, int i2) {
        Integer[] numArr = this.e;
        return (numArr == null || i2 >= numArr.length) ? i2 : numArr[i2].intValue();
    }

    @Override // android.view.View
    public final void onFinishInflate() {
        super.onFinishInflate();
        int i = this.k;
        if (i != -1) {
            d(Collections.singleton(Integer.valueOf(i)));
        }
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(@NonNull AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        AccessibilityNodeInfoCompat wrap = AccessibilityNodeInfoCompat.wrap(accessibilityNodeInfo);
        int i = 0;
        for (int i2 = 0; i2 < getChildCount(); i2++) {
            if ((getChildAt(i2) instanceof MaterialButton) && c(i2)) {
                i++;
            }
        }
        wrap.setCollectionInfo(AccessibilityNodeInfoCompat.CollectionInfoCompat.obtain(1, i, false, this.i ? 1 : 2));
    }

    @Override // android.widget.LinearLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        e();
        a();
        super.onMeasure(i, i2);
    }

    @Override // android.view.ViewGroup
    public final void onViewRemoved(View view) {
        super.onViewRemoved(view);
        if (view instanceof MaterialButton) {
            ((MaterialButton) view).c = null;
        }
        int indexOfChild = indexOfChild(view);
        if (indexOfChild >= 0) {
            this.a.remove(indexOfChild);
        }
        e();
        a();
    }

    @Override // android.view.View
    public final void setEnabled(boolean z) {
        super.setEnabled(z);
        for (int i = 0; i < getChildCount(); i++) {
            ((MaterialButton) getChildAt(i)).setEnabled(z);
        }
    }
}
