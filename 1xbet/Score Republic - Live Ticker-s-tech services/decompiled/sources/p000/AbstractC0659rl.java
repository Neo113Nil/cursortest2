package p000;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import java.util.Arrays;
import java.util.HashMap;

/* JADX INFO: renamed from: rl */
/* JADX INFO: compiled from: r8-map-id-738170b7fb69b873ed7524d5270c8e05c6f5fb40ea1ade7a72c8ed7a70699269 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0659rl extends View {

    /* JADX INFO: renamed from: j */
    public int[] f6878j;

    /* JADX INFO: renamed from: k */
    public int f6879k;

    /* JADX INFO: renamed from: l */
    public Context f6880l;

    /* JADX INFO: renamed from: m */
    public C0205fb f6881m;

    /* JADX INFO: renamed from: n */
    public String f6882n;

    /* JADX INFO: renamed from: o */
    public String f6883o;

    /* JADX INFO: renamed from: p */
    public HashMap f6884p;

    /* JADX WARN: Code duplicated, block: B:24:0x004a  */
    /* JADX INFO: renamed from: a */
    public final void m4373a(String str) {
        int identifier;
        HashMap map;
        Context context = this.f6880l;
        if (str.length() == 0 || context == null) {
            return;
        }
        String strTrim = str.trim();
        ConstraintLayout constraintLayout = getParent() instanceof ConstraintLayout ? (ConstraintLayout) getParent() : null;
        if (!isInEditMode() || constraintLayout == null) {
            identifier = 0;
        } else {
            Object obj = (strTrim == null || (map = constraintLayout.f478v) == null || !map.containsKey(strTrim)) ? null : constraintLayout.f478v.get(strTrim);
            if (obj instanceof Integer) {
                identifier = ((Integer) obj).intValue();
            } else {
                identifier = 0;
            }
        }
        if (identifier == 0 && constraintLayout != null) {
            identifier = m4376d(constraintLayout, strTrim);
        }
        if (identifier == 0) {
            try {
                identifier = gz0.class.getField(strTrim).getInt(null);
            } catch (Exception unused) {
            }
        }
        if (identifier == 0) {
            identifier = context.getResources().getIdentifier(strTrim, "id", context.getPackageName());
        }
        if (identifier != 0) {
            this.f6884p.put(Integer.valueOf(identifier), strTrim);
            m4374b(identifier);
        } else {
            Log.w("ConstraintHelper", "Could not find id of \"" + strTrim + "\"");
        }
    }

    /* JADX INFO: renamed from: b */
    public final void m4374b(int i) {
        if (i == getId()) {
            return;
        }
        int i2 = this.f6879k + 1;
        int[] iArr = this.f6878j;
        if (i2 > iArr.length) {
            this.f6878j = Arrays.copyOf(iArr, iArr.length * 2);
        }
        int[] iArr2 = this.f6878j;
        int i3 = this.f6879k;
        iArr2[i3] = i;
        this.f6879k = i3 + 1;
    }

    /* JADX INFO: renamed from: c */
    public final void m4375c(String str) {
        if (str.length() == 0 || this.f6880l == null) {
            return;
        }
        String strTrim = str.trim();
        ConstraintLayout constraintLayout = getParent() instanceof ConstraintLayout ? (ConstraintLayout) getParent() : null;
        if (constraintLayout == null) {
            Log.w("ConstraintHelper", "Parent not a ConstraintLayout");
            return;
        }
        int childCount = constraintLayout.getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = constraintLayout.getChildAt(i);
            ViewGroup.LayoutParams layoutParams = childAt.getLayoutParams();
            if ((layoutParams instanceof C0733tl) && strTrim.equals(((C0733tl) layoutParams).f7485Y)) {
                if (childAt.getId() == -1) {
                    Log.w("ConstraintHelper", "to use ConstraintTag view " + childAt.getClass().getSimpleName() + " must have an ID");
                } else {
                    m4374b(childAt.getId());
                }
            }
        }
    }

    /* JADX INFO: renamed from: d */
    public final int m4376d(ConstraintLayout constraintLayout, String str) {
        Resources resources;
        String resourceEntryName;
        if (str != null && (resources = this.f6880l.getResources()) != null) {
            int childCount = constraintLayout.getChildCount();
            for (int i = 0; i < childCount; i++) {
                View childAt = constraintLayout.getChildAt(i);
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
        }
        return 0;
    }

    /* JADX INFO: renamed from: e */
    public final void m4377e() {
        if (this.f6881m == null) {
            return;
        }
        ViewGroup.LayoutParams layoutParams = getLayoutParams();
        if (layoutParams instanceof C0733tl) {
            ((C0733tl) layoutParams).f7518p0 = this.f6881m;
        }
    }

    public int[] getReferencedIds() {
        return Arrays.copyOf(this.f6878j, this.f6879k);
    }

    @Override // android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        String str = this.f6882n;
        if (str != null) {
            setIds(str);
        }
        String str2 = this.f6883o;
        if (str2 != null) {
            setReferenceTags(str2);
        }
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        setMeasuredDimension(0, 0);
    }

    public void setIds(String str) {
        this.f6882n = str;
        if (str == null) {
            return;
        }
        int i = 0;
        this.f6879k = 0;
        while (true) {
            int iIndexOf = str.indexOf(44, i);
            if (iIndexOf == -1) {
                m4373a(str.substring(i));
                return;
            } else {
                m4373a(str.substring(i, iIndexOf));
                i = iIndexOf + 1;
            }
        }
    }

    public void setReferenceTags(String str) {
        this.f6883o = str;
        if (str == null) {
            return;
        }
        int i = 0;
        this.f6879k = 0;
        while (true) {
            int iIndexOf = str.indexOf(44, i);
            if (iIndexOf == -1) {
                m4375c(str.substring(i));
                return;
            } else {
                m4375c(str.substring(i, iIndexOf));
                i = iIndexOf + 1;
            }
        }
    }

    public void setReferencedIds(int[] iArr) {
        this.f6882n = null;
        this.f6879k = 0;
        for (int i : iArr) {
            m4374b(i);
        }
    }

    @Override // android.view.View
    public final void setTag(int i, Object obj) {
        super.setTag(i, obj);
        if (obj == null && this.f6882n == null) {
            m4374b(i);
        }
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
    }
}
