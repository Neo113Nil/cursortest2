package androidx.constraintlayout.widget;

import B.c;
import B.h;
import B.i;
import B.n;
import B.p;
import B.q;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import java.util.Arrays;
import java.util.HashMap;
import v.C1654e;
import v.C1659j;

/* loaded from: classes.dex */
public abstract class ConstraintHelper extends View {

    /* renamed from: a, reason: collision with root package name */
    public int[] f8990a;

    /* renamed from: b, reason: collision with root package name */
    public int f8991b;

    /* renamed from: c, reason: collision with root package name */
    public Context f8992c;

    /* renamed from: d, reason: collision with root package name */
    public C1659j f8993d;

    /* renamed from: e, reason: collision with root package name */
    public String f8994e;

    /* renamed from: f, reason: collision with root package name */
    public String f8995f;

    /* renamed from: x, reason: collision with root package name */
    public View[] f8996x;

    /* renamed from: y, reason: collision with root package name */
    public HashMap f8997y;

    public ConstraintHelper(Context context, AttributeSet attributeSet, int i7) {
        super(context, attributeSet, i7);
        this.f8990a = new int[32];
        this.f8996x = null;
        this.f8997y = new HashMap();
        this.f8992c = context;
        k(attributeSet);
    }

    public final void b(String str) {
        if (str == null || str.length() == 0 || this.f8992c == null) {
            return;
        }
        String trim = str.trim();
        if (getParent() instanceof ConstraintLayout) {
        }
        int i7 = i(trim);
        if (i7 != 0) {
            this.f8997y.put(Integer.valueOf(i7), trim);
            c(i7);
        } else {
            Log.w("ConstraintHelper", "Could not find id of \"" + trim + "\"");
        }
    }

    public final void c(int i7) {
        if (i7 == getId()) {
            return;
        }
        int i8 = this.f8991b + 1;
        int[] iArr = this.f8990a;
        if (i8 > iArr.length) {
            this.f8990a = Arrays.copyOf(iArr, iArr.length * 2);
        }
        int[] iArr2 = this.f8990a;
        int i9 = this.f8991b;
        iArr2[i9] = i7;
        this.f8991b = i9 + 1;
    }

    public final void d(String str) {
        if (str == null || str.length() == 0 || this.f8992c == null) {
            return;
        }
        String trim = str.trim();
        ConstraintLayout constraintLayout = getParent() instanceof ConstraintLayout ? (ConstraintLayout) getParent() : null;
        if (constraintLayout == null) {
            Log.w("ConstraintHelper", "Parent not a ConstraintLayout");
            return;
        }
        int childCount = constraintLayout.getChildCount();
        for (int i7 = 0; i7 < childCount; i7++) {
            View childAt = constraintLayout.getChildAt(i7);
            ViewGroup.LayoutParams layoutParams = childAt.getLayoutParams();
            if ((layoutParams instanceof c) && trim.equals(((c) layoutParams).f725Y)) {
                if (childAt.getId() == -1) {
                    Log.w("ConstraintHelper", "to use ConstraintTag view " + childAt.getClass().getSimpleName() + " must have an ID");
                } else {
                    c(childAt.getId());
                }
            }
        }
    }

    public final void e() {
        ViewParent parent = getParent();
        if (parent == null || !(parent instanceof ConstraintLayout)) {
            return;
        }
        f((ConstraintLayout) parent);
    }

    public final void f(ConstraintLayout constraintLayout) {
        int visibility = getVisibility();
        float elevation = getElevation();
        for (int i7 = 0; i7 < this.f8991b; i7++) {
            View b7 = constraintLayout.b(this.f8990a[i7]);
            if (b7 != null) {
                b7.setVisibility(visibility);
                if (elevation > 0.0f) {
                    b7.setTranslationZ(b7.getTranslationZ() + elevation);
                }
            }
        }
    }

    public void g(ConstraintLayout constraintLayout) {
    }

    public int[] getReferencedIds() {
        return Arrays.copyOf(this.f8990a, this.f8991b);
    }

    public final int h(ConstraintLayout constraintLayout, String str) {
        Resources resources;
        String str2;
        if (str == null || constraintLayout == null || (resources = this.f8992c.getResources()) == null) {
            return 0;
        }
        int childCount = constraintLayout.getChildCount();
        for (int i7 = 0; i7 < childCount; i7++) {
            View childAt = constraintLayout.getChildAt(i7);
            if (childAt.getId() != -1) {
                try {
                    str2 = resources.getResourceEntryName(childAt.getId());
                } catch (Resources.NotFoundException unused) {
                    str2 = null;
                }
                if (str.equals(str2)) {
                    return childAt.getId();
                }
            }
        }
        return 0;
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x004f  */
    /* JADX WARN: Removed duplicated region for block: B:24:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0043 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int i(String str) {
        int i7;
        HashMap hashMap;
        ConstraintLayout constraintLayout = getParent() instanceof ConstraintLayout ? (ConstraintLayout) getParent() : null;
        if (isInEditMode() && constraintLayout != null) {
            Object obj = (str == null || (hashMap = constraintLayout.f9002D) == null || !hashMap.containsKey(str)) ? null : constraintLayout.f9002D.get(str);
            if (obj instanceof Integer) {
                i7 = ((Integer) obj).intValue();
                if (i7 == 0 && constraintLayout != null) {
                    i7 = h(constraintLayout, str);
                }
                if (i7 == 0) {
                    try {
                        i7 = p.class.getField(str).getInt(null);
                    } catch (Exception unused) {
                    }
                }
                if (i7 == 0) {
                    return i7;
                }
                Context context = this.f8992c;
                return context.getResources().getIdentifier(str, "id", context.getPackageName());
            }
        }
        i7 = 0;
        if (i7 == 0) {
            i7 = h(constraintLayout, str);
        }
        if (i7 == 0) {
        }
        if (i7 == 0) {
        }
    }

    public final View[] j(ConstraintLayout constraintLayout) {
        View[] viewArr = this.f8996x;
        if (viewArr == null || viewArr.length != this.f8991b) {
            this.f8996x = new View[this.f8991b];
        }
        for (int i7 = 0; i7 < this.f8991b; i7++) {
            this.f8996x[i7] = constraintLayout.b(this.f8990a[i7]);
        }
        return this.f8996x;
    }

    public void k(AttributeSet attributeSet) {
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, q.f932c);
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i7 = 0; i7 < indexCount; i7++) {
                int index = obtainStyledAttributes.getIndex(i7);
                if (index == 35) {
                    String string = obtainStyledAttributes.getString(index);
                    this.f8994e = string;
                    setIds(string);
                } else if (index == 36) {
                    String string2 = obtainStyledAttributes.getString(index);
                    this.f8995f = string2;
                    setReferenceTags(string2);
                }
            }
            obtainStyledAttributes.recycle();
        }
    }

    public void l(h hVar, C1659j c1659j, n nVar, SparseArray sparseArray) {
        i iVar = hVar.f801e;
        int[] iArr = iVar.f849j0;
        int i7 = 0;
        if (iArr != null) {
            setReferencedIds(iArr);
        } else {
            String str = iVar.f851k0;
            if (str != null) {
                if (str.length() > 0) {
                    String[] split = iVar.f851k0.split(",");
                    getContext();
                    int[] iArr2 = new int[split.length];
                    int i8 = 0;
                    for (String str2 : split) {
                        int i9 = i(str2.trim());
                        if (i9 != 0) {
                            iArr2[i8] = i9;
                            i8++;
                        }
                    }
                    if (i8 != split.length) {
                        iArr2 = Arrays.copyOf(iArr2, i8);
                    }
                    iVar.f849j0 = iArr2;
                } else {
                    iVar.f849j0 = null;
                }
            }
        }
        c1659j.f17056v0 = 0;
        Arrays.fill(c1659j.f17055u0, (Object) null);
        if (iVar.f849j0 == null) {
            return;
        }
        while (true) {
            int[] iArr3 = iVar.f849j0;
            if (i7 >= iArr3.length) {
                return;
            }
            C1654e c1654e = (C1654e) sparseArray.get(iArr3[i7]);
            if (c1654e != null) {
                c1659j.S(c1654e);
            }
            i7++;
        }
    }

    public void o(ConstraintLayout constraintLayout) {
    }

    @Override // android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        String str = this.f8994e;
        if (str != null) {
            setIds(str);
        }
        String str2 = this.f8995f;
        if (str2 != null) {
            setReferenceTags(str2);
        }
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
    }

    @Override // android.view.View
    public void onMeasure(int i7, int i8) {
        setMeasuredDimension(0, 0);
    }

    public void p(C1659j c1659j, SparseArray sparseArray) {
        c1659j.f17056v0 = 0;
        Arrays.fill(c1659j.f17055u0, (Object) null);
        for (int i7 = 0; i7 < this.f8991b; i7++) {
            c1659j.S((C1654e) sparseArray.get(this.f8990a[i7]));
        }
    }

    public final void q() {
        if (this.f8993d == null) {
            return;
        }
        ViewGroup.LayoutParams layoutParams = getLayoutParams();
        if (layoutParams instanceof c) {
            ((c) layoutParams).f758q0 = this.f8993d;
        }
    }

    public void setIds(String str) {
        this.f8994e = str;
        if (str == null) {
            return;
        }
        int i7 = 0;
        this.f8991b = 0;
        while (true) {
            int indexOf = str.indexOf(44, i7);
            if (indexOf == -1) {
                b(str.substring(i7));
                return;
            } else {
                b(str.substring(i7, indexOf));
                i7 = indexOf + 1;
            }
        }
    }

    public void setReferenceTags(String str) {
        this.f8995f = str;
        if (str == null) {
            return;
        }
        int i7 = 0;
        this.f8991b = 0;
        while (true) {
            int indexOf = str.indexOf(44, i7);
            if (indexOf == -1) {
                d(str.substring(i7));
                return;
            } else {
                d(str.substring(i7, indexOf));
                i7 = indexOf + 1;
            }
        }
    }

    public void setReferencedIds(int[] iArr) {
        this.f8994e = null;
        this.f8991b = 0;
        for (int i7 : iArr) {
            c(i7);
        }
    }

    @Override // android.view.View
    public final void setTag(int i7, Object obj) {
        super.setTag(i7, obj);
        if (obj == null && this.f8994e == null) {
            c(i7);
        }
    }

    public void n() {
    }

    public void m(C1654e c1654e, boolean z4) {
    }
}
