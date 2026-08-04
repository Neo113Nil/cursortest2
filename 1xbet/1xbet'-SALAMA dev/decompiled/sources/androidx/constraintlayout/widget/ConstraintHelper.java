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
import p149v.e;
import p149v.j;

/* JADX INFO: loaded from: classes.dex */
public abstract class ConstraintHelper extends View {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int[] f8990a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f8991b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Context f8992c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public j f8993d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public String f8994e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public String f8995f;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public View[] f8996x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
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
        String strTrim = str.trim();
        if (getParent() instanceof ConstraintLayout) {
        }
        int i7 = i(strTrim);
        if (i7 != 0) {
            this.f8997y.put(Integer.valueOf(i7), strTrim);
            c(i7);
        } else {
            Log.w("ConstraintHelper", "Could not find id of \"" + strTrim + "\"");
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
        String strTrim = str.trim();
        ConstraintLayout constraintLayout = getParent() instanceof ConstraintLayout ? (ConstraintLayout) getParent() : null;
        if (constraintLayout == null) {
            Log.w("ConstraintHelper", "Parent not a ConstraintLayout");
            return;
        }
        int childCount = constraintLayout.getChildCount();
        for (int i7 = 0; i7 < childCount; i7++) {
            View childAt = constraintLayout.getChildAt(i7);
            ViewGroup.LayoutParams layoutParams = childAt.getLayoutParams();
            if ((layoutParams instanceof c) && strTrim.equals(((c) layoutParams).f725Y)) {
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
            View viewB = constraintLayout.b(this.f8990a[i7]);
            if (viewB != null) {
                viewB.setVisibility(visibility);
                if (elevation > 0.0f) {
                    viewB.setTranslationZ(viewB.getTranslationZ() + elevation);
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
        String resourceEntryName;
        if (str == null || constraintLayout == null || (resources = this.f8992c.getResources()) == null) {
            return 0;
        }
        int childCount = constraintLayout.getChildCount();
        for (int i7 = 0; i7 < childCount; i7++) {
            View childAt = constraintLayout.getChildAt(i7);
            if (childAt.getId() != -1) {
                try {
                    resourceEntryName = resources.getResourceEntryName(childAt.getId());
                } catch (Resources.NotFoundException unused) {
                    resourceEntryName = null;
                }
                if (str.equals(resourceEntryName)) {
                    return childAt.getId();
                }
            }
        }
        return 0;
    }

    /* JADX WARN: Code duplicated, block: B:19:0x0038  */
    public final int i(String str) {
        int iH;
        HashMap map;
        ConstraintLayout constraintLayout = getParent() instanceof ConstraintLayout ? (ConstraintLayout) getParent() : null;
        if (!isInEditMode() || constraintLayout == null) {
            iH = 0;
        } else {
            Object obj = (str == null || (map = constraintLayout.f9002D) == null || !map.containsKey(str)) ? null : constraintLayout.f9002D.get(str);
            if (obj instanceof Integer) {
                iH = ((Integer) obj).intValue();
            } else {
                iH = 0;
            }
        }
        if (iH == 0 && constraintLayout != null) {
            iH = h(constraintLayout, str);
        }
        if (iH == 0) {
            try {
                iH = p.class.getField(str).getInt(null);
            } catch (Exception unused) {
            }
        }
        if (iH != 0) {
            return iH;
        }
        Context context = this.f8992c;
        return context.getResources().getIdentifier(str, "id", context.getPackageName());
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
            TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, q.f932c);
            int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
            for (int i7 = 0; i7 < indexCount; i7++) {
                int index = typedArrayObtainStyledAttributes.getIndex(i7);
                if (index == 35) {
                    String string = typedArrayObtainStyledAttributes.getString(index);
                    this.f8994e = string;
                    setIds(string);
                } else if (index == 36) {
                    String string2 = typedArrayObtainStyledAttributes.getString(index);
                    this.f8995f = string2;
                    setReferenceTags(string2);
                }
            }
            typedArrayObtainStyledAttributes.recycle();
        }
    }

    public void l(h hVar, j jVar, n nVar, SparseArray sparseArray) {
        i iVar = hVar.f801e;
        int[] iArr = iVar.f849j0;
        int i7 = 0;
        if (iArr != null) {
            setReferencedIds(iArr);
        } else {
            String str = iVar.f851k0;
            if (str != null) {
                if (str.length() > 0) {
                    String[] strArrSplit = iVar.f851k0.split(",");
                    getContext();
                    int[] iArrCopyOf = new int[strArrSplit.length];
                    int i8 = 0;
                    for (String str2 : strArrSplit) {
                        int i9 = i(str2.trim());
                        if (i9 != 0) {
                            iArrCopyOf[i8] = i9;
                            i8++;
                        }
                    }
                    if (i8 != strArrSplit.length) {
                        iArrCopyOf = Arrays.copyOf(iArrCopyOf, i8);
                    }
                    iVar.f849j0 = iArrCopyOf;
                } else {
                    iVar.f849j0 = null;
                }
            }
        }
        jVar.f17062v0 = 0;
        Arrays.fill(jVar.f17061u0, (Object) null);
        if (iVar.f849j0 == null) {
            return;
        }
        while (true) {
            int[] iArr2 = iVar.f849j0;
            if (i7 >= iArr2.length) {
                return;
            }
            e eVar = (e) sparseArray.get(iArr2[i7]);
            if (eVar != null) {
                jVar.S(eVar);
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

    public void p(j jVar, SparseArray sparseArray) {
        jVar.f17062v0 = 0;
        Arrays.fill(jVar.f17061u0, (Object) null);
        for (int i7 = 0; i7 < this.f8991b; i7++) {
            jVar.S((e) sparseArray.get(this.f8990a[i7]));
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
            int iIndexOf = str.indexOf(44, i7);
            if (iIndexOf == -1) {
                b(str.substring(i7));
                return;
            } else {
                b(str.substring(i7, iIndexOf));
                i7 = iIndexOf + 1;
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
            int iIndexOf = str.indexOf(44, i7);
            if (iIndexOf == -1) {
                d(str.substring(i7));
                return;
            } else {
                d(str.substring(i7, iIndexOf));
                i7 = iIndexOf + 1;
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

    public void m(e eVar, boolean z4) {
    }
}
