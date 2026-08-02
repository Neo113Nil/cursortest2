package androidx.constraintlayout.widget;

import B.c;
import B.d;
import B.m;
import B.o;
import B.q;
import B.s;
import D0.a;
import P.C0350f;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.util.SparseIntArray;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.gms.common.api.f;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import v.AbstractC1660k;
import v.AbstractC1662m;
import v.C1650a;
import v.C1654e;
import v.C1655f;
import v.C1658i;
import v.C1659j;
import v.EnumC1653d;
import w.C1670c;
import w.h;
import w.j;
import w.l;
import w.n;
import w1.C1726n0;

/* loaded from: classes.dex */
public class ConstraintLayout extends ViewGroup {

    /* renamed from: I, reason: collision with root package name */
    public static s f8998I;

    /* renamed from: A, reason: collision with root package name */
    public m f8999A;

    /* renamed from: B, reason: collision with root package name */
    public C0350f f9000B;

    /* renamed from: C, reason: collision with root package name */
    public int f9001C;

    /* renamed from: D, reason: collision with root package name */
    public HashMap f9002D;

    /* renamed from: E, reason: collision with root package name */
    public final SparseArray f9003E;

    /* renamed from: F, reason: collision with root package name */
    public final d f9004F;

    /* renamed from: G, reason: collision with root package name */
    public int f9005G;

    /* renamed from: H, reason: collision with root package name */
    public int f9006H;

    /* renamed from: a, reason: collision with root package name */
    public final SparseArray f9007a;

    /* renamed from: b, reason: collision with root package name */
    public final ArrayList f9008b;

    /* renamed from: c, reason: collision with root package name */
    public final C1655f f9009c;

    /* renamed from: d, reason: collision with root package name */
    public int f9010d;

    /* renamed from: e, reason: collision with root package name */
    public int f9011e;

    /* renamed from: f, reason: collision with root package name */
    public int f9012f;

    /* renamed from: x, reason: collision with root package name */
    public int f9013x;

    /* renamed from: y, reason: collision with root package name */
    public boolean f9014y;

    /* renamed from: z, reason: collision with root package name */
    public int f9015z;

    public ConstraintLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f9007a = new SparseArray();
        this.f9008b = new ArrayList(4);
        this.f9009c = new C1655f();
        this.f9010d = 0;
        this.f9011e = 0;
        this.f9012f = f.API_PRIORITY_OTHER;
        this.f9013x = f.API_PRIORITY_OTHER;
        this.f9014y = true;
        this.f9015z = 257;
        this.f8999A = null;
        this.f9000B = null;
        this.f9001C = -1;
        this.f9002D = new HashMap();
        this.f9003E = new SparseArray();
        this.f9004F = new d(this, this);
        this.f9005G = 0;
        this.f9006H = 0;
        d(attributeSet, 0);
    }

    private int getPaddingWidth() {
        int max = Math.max(0, getPaddingRight()) + Math.max(0, getPaddingLeft());
        int max2 = Math.max(0, getPaddingEnd()) + Math.max(0, getPaddingStart());
        return max2 > 0 ? max2 : max;
    }

    public static s getSharedValues() {
        if (f8998I == null) {
            s sVar = new s();
            new SparseIntArray();
            sVar.f955a = new HashMap();
            f8998I = sVar;
        }
        return f8998I;
    }

    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:108:0x02d0 -> B:79:0x02bf). Please report as a decompilation issue!!! */
    public final void a(boolean z4, View view, C1654e c1654e, c cVar, SparseArray sparseArray) {
        int i7;
        int i8;
        C1654e c1654e2;
        C1654e c1654e3;
        C1654e c1654e4;
        C1654e c1654e5;
        int i9;
        int i10;
        float f7;
        int i11;
        int i12;
        int i13;
        cVar.a();
        c1654e.f16959i0 = view.getVisibility();
        if (cVar.f737f0) {
            c1654e.f16922F = true;
            c1654e.f16959i0 = 8;
        }
        c1654e.f16957h0 = view;
        if (view instanceof ConstraintHelper) {
            ((ConstraintHelper) view).m(c1654e, this.f9009c.f17008z0);
        }
        int i14 = -1;
        if (cVar.f733d0) {
            C1658i c1658i = (C1658i) c1654e;
            int i15 = cVar.f752n0;
            int i16 = cVar.f754o0;
            float f8 = cVar.f756p0;
            if (f8 != -1.0f) {
                if (f8 > -1.0f) {
                    c1658i.f17049u0 = f8;
                    c1658i.f17050v0 = -1;
                    c1658i.f17051w0 = -1;
                    return;
                }
                return;
            }
            if (i15 != -1) {
                if (i15 > -1) {
                    c1658i.f17049u0 = -1.0f;
                    c1658i.f17050v0 = i15;
                    c1658i.f17051w0 = -1;
                    return;
                }
                return;
            }
            if (i16 == -1 || i16 <= -1) {
                return;
            }
            c1658i.f17049u0 = -1.0f;
            c1658i.f17050v0 = -1;
            c1658i.f17051w0 = i16;
            return;
        }
        int i17 = cVar.f739g0;
        int i18 = cVar.f741h0;
        int i19 = cVar.f743i0;
        int i20 = cVar.f744j0;
        int i21 = cVar.f746k0;
        int i22 = cVar.f748l0;
        float f9 = cVar.f750m0;
        int i23 = cVar.f755p;
        if (i23 != -1) {
            C1654e c1654e6 = (C1654e) sparseArray.get(i23);
            if (c1654e6 != null) {
                float f10 = cVar.f759r;
                i12 = 2;
                i13 = 4;
                c1654e.w(7, c1654e6, 7, cVar.f757q, 0);
                c1654e.f16920D = f10;
            } else {
                i12 = 2;
                i13 = 4;
            }
            i8 = i13;
            i7 = i12;
        } else {
            if (i17 != -1) {
                C1654e c1654e7 = (C1654e) sparseArray.get(i17);
                if (c1654e7 != null) {
                    i7 = 2;
                    i8 = 4;
                    c1654e.w(2, c1654e7, 2, ((ViewGroup.MarginLayoutParams) cVar).leftMargin, i21);
                } else {
                    i7 = 2;
                    i8 = 4;
                }
            } else {
                i7 = 2;
                i8 = 4;
                if (i18 != -1 && (c1654e2 = (C1654e) sparseArray.get(i18)) != null) {
                    c1654e.w(2, c1654e2, 4, ((ViewGroup.MarginLayoutParams) cVar).leftMargin, i21);
                }
            }
            if (i19 != -1) {
                C1654e c1654e8 = (C1654e) sparseArray.get(i19);
                if (c1654e8 != null) {
                    c1654e.w(i8, c1654e8, i7, ((ViewGroup.MarginLayoutParams) cVar).rightMargin, i22);
                }
            } else if (i20 != -1 && (c1654e3 = (C1654e) sparseArray.get(i20)) != null) {
                c1654e.w(i8, c1654e3, i8, ((ViewGroup.MarginLayoutParams) cVar).rightMargin, i22);
            }
            int i24 = cVar.f742i;
            if (i24 != -1) {
                C1654e c1654e9 = (C1654e) sparseArray.get(i24);
                if (c1654e9 != null) {
                    c1654e.w(3, c1654e9, 3, ((ViewGroup.MarginLayoutParams) cVar).topMargin, cVar.f765x);
                }
            } else {
                int i25 = cVar.j;
                if (i25 != -1 && (c1654e4 = (C1654e) sparseArray.get(i25)) != null) {
                    c1654e.w(3, c1654e4, 5, ((ViewGroup.MarginLayoutParams) cVar).topMargin, cVar.f765x);
                }
            }
            int i26 = cVar.f745k;
            if (i26 != -1) {
                C1654e c1654e10 = (C1654e) sparseArray.get(i26);
                if (c1654e10 != null) {
                    c1654e.w(5, c1654e10, 3, ((ViewGroup.MarginLayoutParams) cVar).bottomMargin, cVar.f767z);
                }
            } else {
                int i27 = cVar.f747l;
                if (i27 != -1 && (c1654e5 = (C1654e) sparseArray.get(i27)) != null) {
                    c1654e.w(5, c1654e5, 5, ((ViewGroup.MarginLayoutParams) cVar).bottomMargin, cVar.f767z);
                }
            }
            int i28 = cVar.f749m;
            if (i28 != -1) {
                i(c1654e, cVar, sparseArray, i28, 6);
            } else {
                int i29 = cVar.f751n;
                if (i29 != -1) {
                    i(c1654e, cVar, sparseArray, i29, 3);
                } else {
                    int i30 = cVar.f753o;
                    if (i30 != -1) {
                        i(c1654e, cVar, sparseArray, i30, 5);
                    }
                }
            }
            if (f9 >= 0.0f) {
                c1654e.f16953f0 = f9;
            }
            float f11 = cVar.f706F;
            if (f11 >= 0.0f) {
                c1654e.f16955g0 = f11;
            }
        }
        if (z4 && ((i11 = cVar.f720T) != -1 || cVar.f721U != -1)) {
            int i31 = cVar.f721U;
            c1654e.f16944a0 = i11;
            c1654e.f16946b0 = i31;
        }
        boolean z7 = cVar.f728a0;
        EnumC1653d enumC1653d = EnumC1653d.f16913b;
        EnumC1653d enumC1653d2 = EnumC1653d.f16912a;
        EnumC1653d enumC1653d3 = EnumC1653d.f16915d;
        EnumC1653d enumC1653d4 = EnumC1653d.f16914c;
        if (z7) {
            c1654e.N(enumC1653d2);
            c1654e.P(((ViewGroup.MarginLayoutParams) cVar).width);
            if (((ViewGroup.MarginLayoutParams) cVar).width == -2) {
                c1654e.N(enumC1653d);
            }
        } else if (((ViewGroup.MarginLayoutParams) cVar).width == -1) {
            if (cVar.f723W) {
                c1654e.N(enumC1653d4);
            } else {
                c1654e.N(enumC1653d3);
            }
            c1654e.j(i7).f16909g = ((ViewGroup.MarginLayoutParams) cVar).leftMargin;
            c1654e.j(i8).f16909g = ((ViewGroup.MarginLayoutParams) cVar).rightMargin;
        } else {
            c1654e.N(enumC1653d4);
            c1654e.P(0);
        }
        if (cVar.f730b0) {
            c1654e.O(enumC1653d2);
            c1654e.M(((ViewGroup.MarginLayoutParams) cVar).height);
            if (((ViewGroup.MarginLayoutParams) cVar).height == -2) {
                c1654e.O(enumC1653d);
            }
        } else if (((ViewGroup.MarginLayoutParams) cVar).height == -1) {
            if (cVar.f724X) {
                c1654e.O(enumC1653d4);
            } else {
                c1654e.O(enumC1653d3);
            }
            c1654e.j(3).f16909g = ((ViewGroup.MarginLayoutParams) cVar).topMargin;
            c1654e.j(5).f16909g = ((ViewGroup.MarginLayoutParams) cVar).bottomMargin;
        } else {
            c1654e.O(enumC1653d4);
            c1654e.M(0);
        }
        String str = cVar.f707G;
        if (str == null || str.length() == 0) {
            c1654e.f16941Y = 0.0f;
        } else {
            int length = str.length();
            int indexOf = str.indexOf(44);
            if (indexOf <= 0 || indexOf >= length - 1) {
                i9 = 1;
                i10 = 0;
            } else {
                String substring = str.substring(0, indexOf);
                if (substring.equalsIgnoreCase("W")) {
                    i14 = 0;
                } else if (substring.equalsIgnoreCase("H")) {
                    i9 = 1;
                    i14 = 1;
                    i10 = indexOf + i9;
                }
                i9 = 1;
                i10 = indexOf + i9;
            }
            int indexOf2 = str.indexOf(58);
            if (indexOf2 < 0 || indexOf2 >= length - i9) {
                String substring2 = str.substring(i10);
                if (substring2.length() > 0) {
                    f7 = Float.parseFloat(substring2);
                }
                f7 = 0.0f;
            } else {
                String substring3 = str.substring(i10, indexOf2);
                String substring4 = str.substring(indexOf2 + i9);
                if (substring3.length() > 0 && substring4.length() > 0) {
                    float parseFloat = Float.parseFloat(substring3);
                    float parseFloat2 = Float.parseFloat(substring4);
                    if (parseFloat > 0.0f && parseFloat2 > 0.0f) {
                        f7 = i14 == 1 ? Math.abs(parseFloat2 / parseFloat) : Math.abs(parseFloat / parseFloat2);
                    }
                }
                f7 = 0.0f;
            }
            if (f7 > 0.0f) {
                c1654e.f16941Y = f7;
                c1654e.f16942Z = i14;
            }
        }
        float f12 = cVar.f708H;
        float[] fArr = c1654e.f16968n0;
        fArr[0] = f12;
        fArr[1] = cVar.f709I;
        c1654e.f16964l0 = cVar.f710J;
        c1654e.f16966m0 = cVar.f711K;
        int i32 = cVar.f726Z;
        if (i32 >= 0 && i32 <= 3) {
            c1654e.f16973q = i32;
        }
        int i33 = cVar.f712L;
        int i34 = cVar.f714N;
        int i35 = cVar.f716P;
        float f13 = cVar.f718R;
        c1654e.f16975r = i33;
        c1654e.f16981u = i34;
        if (i35 == Integer.MAX_VALUE) {
            i35 = 0;
        }
        c1654e.f16982v = i35;
        c1654e.f16983w = f13;
        if (f13 > 0.0f && f13 < 1.0f && i33 == 0) {
            c1654e.f16975r = 2;
        }
        int i36 = cVar.f713M;
        int i37 = cVar.f715O;
        int i38 = cVar.f717Q;
        float f14 = cVar.f719S;
        c1654e.f16977s = i36;
        c1654e.f16984x = i37;
        c1654e.f16985y = i38 != Integer.MAX_VALUE ? i38 : 0;
        c1654e.f16986z = f14;
        if (f14 <= 0.0f || f14 >= 1.0f || i36 != 0) {
            return;
        }
        c1654e.f16977s = 2;
    }

    public final View b(int i7) {
        return (View) this.f9007a.get(i7);
    }

    public final C1654e c(View view) {
        if (view == this) {
            return this.f9009c;
        }
        if (view == null) {
            return null;
        }
        if (view.getLayoutParams() instanceof c) {
            return ((c) view.getLayoutParams()).f758q0;
        }
        view.setLayoutParams(new c(view.getLayoutParams()));
        if (view.getLayoutParams() instanceof c) {
            return ((c) view.getLayoutParams()).f758q0;
        }
        return null;
    }

    @Override // android.view.ViewGroup
    public final boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof c;
    }

    public final void d(AttributeSet attributeSet, int i7) {
        C1655f c1655f = this.f9009c;
        c1655f.f16957h0 = this;
        d dVar = this.f9004F;
        c1655f.f17007y0 = dVar;
        c1655f.f17005w0.f1622f = dVar;
        this.f9007a.put(getId(), this);
        this.f8999A = null;
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, q.f932c, i7, 0);
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i8 = 0; i8 < indexCount; i8++) {
                int index = obtainStyledAttributes.getIndex(i8);
                if (index == 16) {
                    this.f9010d = obtainStyledAttributes.getDimensionPixelOffset(index, this.f9010d);
                } else if (index == 17) {
                    this.f9011e = obtainStyledAttributes.getDimensionPixelOffset(index, this.f9011e);
                } else if (index == 14) {
                    this.f9012f = obtainStyledAttributes.getDimensionPixelOffset(index, this.f9012f);
                } else if (index == 15) {
                    this.f9013x = obtainStyledAttributes.getDimensionPixelOffset(index, this.f9013x);
                } else if (index == 113) {
                    this.f9015z = obtainStyledAttributes.getInt(index, this.f9015z);
                } else if (index == 56) {
                    int resourceId = obtainStyledAttributes.getResourceId(index, 0);
                    if (resourceId != 0) {
                        try {
                            f(resourceId);
                        } catch (Resources.NotFoundException unused) {
                            this.f9000B = null;
                        }
                    }
                } else if (index == 34) {
                    int resourceId2 = obtainStyledAttributes.getResourceId(index, 0);
                    try {
                        m mVar = new m();
                        this.f8999A = mVar;
                        mVar.j(resourceId2, getContext());
                    } catch (Resources.NotFoundException unused2) {
                        this.f8999A = null;
                    }
                    this.f9001C = resourceId2;
                }
            }
            obtainStyledAttributes.recycle();
        }
        c1655f.f16994H0 = this.f9015z;
        t.c.f16228p = c1655f.X(512);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void dispatchDraw(Canvas canvas) {
        Object tag;
        int size;
        ArrayList arrayList = this.f9008b;
        if (arrayList != null && (size = arrayList.size()) > 0) {
            for (int i7 = 0; i7 < size; i7++) {
                ((ConstraintHelper) arrayList.get(i7)).o(this);
            }
        }
        super.dispatchDraw(canvas);
        if (isInEditMode()) {
            float width = getWidth();
            float height = getHeight();
            int childCount = getChildCount();
            for (int i8 = 0; i8 < childCount; i8++) {
                View childAt = getChildAt(i8);
                if (childAt.getVisibility() != 8 && (tag = childAt.getTag()) != null && (tag instanceof String)) {
                    String[] split = ((String) tag).split(",");
                    if (split.length == 4) {
                        int parseInt = Integer.parseInt(split[0]);
                        int parseInt2 = Integer.parseInt(split[1]);
                        int parseInt3 = Integer.parseInt(split[2]);
                        int i9 = (int) ((parseInt / 1080.0f) * width);
                        int i10 = (int) ((parseInt2 / 1920.0f) * height);
                        Paint paint = new Paint();
                        paint.setColor(-65536);
                        float f7 = i9;
                        float f8 = i10;
                        float f9 = i9 + ((int) ((parseInt3 / 1080.0f) * width));
                        canvas.drawLine(f7, f8, f9, f8, paint);
                        float parseInt4 = i10 + ((int) ((Integer.parseInt(split[3]) / 1920.0f) * height));
                        canvas.drawLine(f9, f8, f9, parseInt4, paint);
                        canvas.drawLine(f9, parseInt4, f7, parseInt4, paint);
                        canvas.drawLine(f7, parseInt4, f7, f8, paint);
                        paint.setColor(-16711936);
                        canvas.drawLine(f7, f8, f9, parseInt4, paint);
                        canvas.drawLine(f7, parseInt4, f9, f8, paint);
                    }
                }
            }
        }
    }

    public final boolean e() {
        return (getContext().getApplicationInfo().flags & 4194304) != 0 && 1 == getLayoutDirection();
    }

    public void f(int i7) {
        this.f9000B = new C0350f(getContext(), this, i7);
    }

    @Override // android.view.View
    public final void forceLayout() {
        this.f9014y = true;
        super.forceLayout();
    }

    public final void g(int i7, int i8, int i9, boolean z4, boolean z7, int i10) {
        d dVar = this.f9004F;
        int i11 = dVar.f772e;
        int resolveSizeAndState = View.resolveSizeAndState(i9 + dVar.f771d, i7, 0);
        int resolveSizeAndState2 = View.resolveSizeAndState(i10 + i11, i8, 0) & 16777215;
        int min = Math.min(this.f9012f, resolveSizeAndState & 16777215);
        int min2 = Math.min(this.f9013x, resolveSizeAndState2);
        if (z4) {
            min |= 16777216;
        }
        if (z7) {
            min2 |= 16777216;
        }
        setMeasuredDimension(min, min2);
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new c();
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new c(getContext(), attributeSet);
    }

    public int getMaxHeight() {
        return this.f9013x;
    }

    public int getMaxWidth() {
        return this.f9012f;
    }

    public int getMinHeight() {
        return this.f9011e;
    }

    public int getMinWidth() {
        return this.f9010d;
    }

    public int getOptimizationLevel() {
        return this.f9009c.f16994H0;
    }

    public String getSceneString() {
        int id;
        StringBuilder sb = new StringBuilder();
        C1655f c1655f = this.f9009c;
        if (c1655f.j == null) {
            int id2 = getId();
            if (id2 != -1) {
                c1655f.j = getContext().getResources().getResourceEntryName(id2);
            } else {
                c1655f.j = "parent";
            }
        }
        if (c1655f.f16962k0 == null) {
            c1655f.f16962k0 = c1655f.j;
            Log.v("ConstraintLayout", " setDebugName " + c1655f.f16962k0);
        }
        Iterator it = c1655f.f17003u0.iterator();
        while (it.hasNext()) {
            C1654e c1654e = (C1654e) it.next();
            View view = c1654e.f16957h0;
            if (view != null) {
                if (c1654e.j == null && (id = view.getId()) != -1) {
                    c1654e.j = getContext().getResources().getResourceEntryName(id);
                }
                if (c1654e.f16962k0 == null) {
                    c1654e.f16962k0 = c1654e.j;
                    Log.v("ConstraintLayout", " setDebugName " + c1654e.f16962k0);
                }
            }
        }
        c1655f.o(sb);
        return sb.toString();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:11:0x00af  */
    /* JADX WARN: Removed duplicated region for block: B:144:0x0469  */
    /* JADX WARN: Removed duplicated region for block: B:150:0x0472  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x00f5  */
    /* JADX WARN: Removed duplicated region for block: B:203:0x050d  */
    /* JADX WARN: Removed duplicated region for block: B:205:0x0510  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x012a  */
    /* JADX WARN: Removed duplicated region for block: B:236:0x0599  */
    /* JADX WARN: Removed duplicated region for block: B:238:0x05a9  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0134  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x015c  */
    /* JADX WARN: Removed duplicated region for block: B:334:0x05a2  */
    /* JADX WARN: Removed duplicated region for block: B:335:0x058a  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x016a  */
    /* JADX WARN: Removed duplicated region for block: B:398:0x0455  */
    /* JADX WARN: Removed duplicated region for block: B:402:0x0137  */
    /* JADX WARN: Removed duplicated region for block: B:403:0x012d  */
    /* JADX WARN: Removed duplicated region for block: B:410:0x00dc  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x01c6 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:76:0x01d0  */
    /* JADX WARN: Type inference failed for: r3v2, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r5v1 */
    /* JADX WARN: Type inference failed for: r5v14 */
    /* JADX WARN: Type inference failed for: r5v2 */
    /* JADX WARN: Type inference failed for: r9v16, types: [int] */
    /* JADX WARN: Type inference failed for: r9v29 */
    /* JADX WARN: Type inference failed for: r9v30 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void h(C1655f c1655f, int i7, int i8, int i9) {
        int max;
        EnumC1653d enumC1653d;
        int max2;
        EnumC1653d enumC1653d2;
        EnumC1653d enumC1653d3;
        int r7;
        a aVar;
        int i10;
        int i11;
        int size;
        boolean z4;
        boolean z7;
        boolean z8;
        C1726n0 c1726n0;
        d dVar;
        int i12;
        EnumC1653d enumC1653d4;
        int i13;
        EnumC1653d enumC1653d5;
        EnumC1653d enumC1653d6;
        int i14;
        boolean z9;
        C1726n0 c1726n02;
        int size2;
        int i15;
        int i16;
        ?? r52;
        ArrayList arrayList;
        int i17;
        d dVar2;
        int i18;
        d dVar3;
        EnumC1653d enumC1653d7;
        C1726n0 c1726n03;
        j jVar;
        l lVar;
        int i19;
        int i20;
        int i21;
        int i22;
        boolean z10;
        boolean z11;
        C1655f c1655f2 = c1655f;
        int mode = View.MeasureSpec.getMode(i8);
        int size3 = View.MeasureSpec.getSize(i8);
        int mode2 = View.MeasureSpec.getMode(i9);
        int size4 = View.MeasureSpec.getSize(i9);
        int max3 = Math.max(0, getPaddingTop());
        int max4 = Math.max(0, getPaddingBottom());
        int i23 = max3 + max4;
        int paddingWidth = getPaddingWidth();
        d dVar4 = this.f9004F;
        dVar4.f769b = max3;
        dVar4.f770c = max4;
        dVar4.f771d = paddingWidth;
        dVar4.f772e = i23;
        dVar4.f773f = i8;
        dVar4.f774g = i9;
        int max5 = Math.max(0, getPaddingStart());
        int max6 = Math.max(0, getPaddingEnd());
        if (max5 <= 0 && max6 <= 0) {
            max5 = Math.max(0, getPaddingLeft());
        } else if (e()) {
            max5 = max6;
        }
        int i24 = size3 - paddingWidth;
        int i25 = size4 - i23;
        int i26 = dVar4.f772e;
        int i27 = dVar4.f771d;
        EnumC1653d enumC1653d8 = EnumC1653d.f16912a;
        int childCount = getChildCount();
        EnumC1653d enumC1653d9 = EnumC1653d.f16913b;
        int i28 = Integer.MIN_VALUE;
        if (mode == Integer.MIN_VALUE) {
            max = childCount == 0 ? Math.max(0, this.f9010d) : i24;
        } else {
            if (mode != 0) {
                if (mode != 1073741824) {
                    enumC1653d = enumC1653d8;
                    max = 0;
                } else {
                    max = Math.min(this.f9012f - i27, i24);
                    enumC1653d = enumC1653d8;
                }
                if (mode2 != i28) {
                    if (mode2 != 0) {
                        if (mode2 != 1073741824) {
                            enumC1653d2 = enumC1653d;
                            enumC1653d3 = enumC1653d9;
                            max2 = 0;
                        } else {
                            max2 = Math.min(this.f9013x - i26, i25);
                            enumC1653d3 = enumC1653d9;
                            enumC1653d2 = enumC1653d;
                        }
                    } else if (childCount == 0) {
                        enumC1653d2 = enumC1653d9;
                        enumC1653d3 = enumC1653d2;
                        max2 = Math.max(0, this.f9011e);
                    } else {
                        max2 = 0;
                    }
                    r7 = c1655f.r();
                    aVar = c1655f2.f17005w0;
                    if (max == r7 || max2 != c1655f.l()) {
                        aVar.f1618b = true;
                    }
                    c1655f2.f16944a0 = 0;
                    c1655f2.f16946b0 = 0;
                    int i29 = this.f9012f - i27;
                    int[] iArr = c1655f2.f16919C;
                    iArr[0] = i29;
                    iArr[1] = this.f9013x - i26;
                    c1655f2.f16949d0 = 0;
                    c1655f2.f16951e0 = 0;
                    c1655f2.N(enumC1653d8);
                    c1655f2.P(max);
                    c1655f2.O(enumC1653d2);
                    c1655f2.M(max2);
                    i10 = this.f9010d - i27;
                    if (i10 >= 0) {
                        c1655f2.f16949d0 = 0;
                    } else {
                        c1655f2.f16949d0 = i10;
                    }
                    i11 = this.f9011e - i26;
                    if (i11 >= 0) {
                        c1655f2.f16951e0 = 0;
                    } else {
                        c1655f2.f16951e0 = i11;
                    }
                    c1655f2.f16988B0 = max5;
                    c1655f2.f16989C0 = max3;
                    C1726n0 c1726n04 = c1655f2.f17004v0;
                    c1726n04.getClass();
                    d dVar5 = c1655f2.f17007y0;
                    size = c1655f2.f17003u0.size();
                    int r8 = c1655f.r();
                    int l7 = c1655f.l();
                    boolean c3 = AbstractC1660k.c(i7, 128);
                    z4 = !c3 || AbstractC1660k.c(i7, 64);
                    EnumC1653d enumC1653d10 = EnumC1653d.f16914c;
                    if (z4) {
                        for (int i30 = 0; i30 < size; i30++) {
                            C1654e c1654e = (C1654e) c1655f2.f17003u0.get(i30);
                            EnumC1653d[] enumC1653dArr = c1654e.f16937U;
                            boolean z12 = (enumC1653dArr[0] == enumC1653d10) && (enumC1653dArr[1] == enumC1653d10) && c1654e.f16941Y > 0.0f;
                            if ((c1654e.y() && z12) || ((c1654e.z() && z12) || (c1654e instanceof AbstractC1662m) || c1654e.y() || c1654e.z())) {
                                z4 = false;
                                break;
                            }
                        }
                    }
                    z7 = z4 & ((mode != 1073741824 && mode2 == 1073741824) || c3);
                    if (z7) {
                        z8 = z7;
                        c1726n0 = c1726n04;
                        dVar = dVar5;
                        i12 = r8;
                        enumC1653d4 = enumC1653d3;
                        i13 = l7;
                        enumC1653d5 = enumC1653d;
                        enumC1653d6 = enumC1653d10;
                        i14 = 0;
                        z9 = false;
                    } else {
                        int min = Math.min(c1655f2.f16919C[0], i24);
                        int min2 = Math.min(c1655f2.f16919C[1], i25);
                        if (mode == 1073741824) {
                            if (c1655f.r() != min) {
                                c1655f2.P(min);
                                c1655f2.f17005w0.f1617a = true;
                            }
                            i19 = 1073741824;
                        } else {
                            i19 = 1073741824;
                        }
                        if (mode2 == i19 && c1655f.l() != min2) {
                            c1655f2.M(min2);
                            c1655f2.f17005w0.f1617a = true;
                        }
                        if (mode == i19 && mode2 == i19) {
                            boolean z13 = aVar.f1617a;
                            C1655f c1655f3 = (C1655f) aVar.f1619c;
                            if (z13 || aVar.f1618b) {
                                Iterator it = c1655f3.f17003u0.iterator();
                                while (it.hasNext()) {
                                    C1654e c1654e2 = (C1654e) it.next();
                                    c1654e2.i();
                                    c1654e2.f16943a = false;
                                    c1654e2.f16948d.n();
                                    c1654e2.f16950e.m();
                                }
                                c1655f3.i();
                                i22 = 0;
                                c1655f3.f16943a = false;
                                c1655f3.f16948d.n();
                                c1655f3.f16950e.m();
                                aVar.f1618b = false;
                            } else {
                                i22 = 0;
                            }
                            aVar.b((C1655f) aVar.f1620d);
                            c1655f3.f16944a0 = i22;
                            c1655f3.f16946b0 = i22;
                            EnumC1653d k7 = c1655f3.k(i22);
                            EnumC1653d k8 = c1655f3.k(1);
                            if (aVar.f1617a) {
                                aVar.c();
                            }
                            int s7 = c1655f3.s();
                            z8 = z7;
                            int t7 = c1655f3.t();
                            dVar = dVar5;
                            c1655f3.f16948d.f17256h.d(s7);
                            c1655f3.f16950e.f17256h.d(t7);
                            aVar.g();
                            ArrayList arrayList2 = (ArrayList) aVar.f1621e;
                            i12 = r8;
                            enumC1653d4 = enumC1653d3;
                            if (k7 == enumC1653d4 || k8 == enumC1653d4) {
                                if (c3) {
                                    Iterator it2 = arrayList2.iterator();
                                    while (true) {
                                        if (it2.hasNext()) {
                                            if (!((n) it2.next()).k()) {
                                                c3 = false;
                                                break;
                                            }
                                        } else {
                                            break;
                                        }
                                    }
                                }
                                if (c3 && k7 == enumC1653d4) {
                                    i13 = l7;
                                    enumC1653d5 = enumC1653d;
                                    c1655f3.N(enumC1653d5);
                                    c1726n0 = c1726n04;
                                    enumC1653d6 = enumC1653d10;
                                    c1655f3.P(aVar.d(c1655f3, 0));
                                    c1655f3.f16948d.f17253e.d(c1655f3.r());
                                } else {
                                    c1726n0 = c1726n04;
                                    i13 = l7;
                                    enumC1653d5 = enumC1653d;
                                    enumC1653d6 = enumC1653d10;
                                }
                                if (c3 && k8 == enumC1653d4) {
                                    c1655f3.O(enumC1653d5);
                                    c1655f3.M(aVar.d(c1655f3, 1));
                                    c1655f3.f16950e.f17253e.d(c1655f3.l());
                                }
                            } else {
                                c1726n0 = c1726n04;
                                i13 = l7;
                                enumC1653d5 = enumC1653d;
                                enumC1653d6 = enumC1653d10;
                            }
                            EnumC1653d enumC1653d11 = c1655f3.f16937U[0];
                            EnumC1653d enumC1653d12 = EnumC1653d.f16915d;
                            if (enumC1653d11 == enumC1653d5 || enumC1653d11 == enumC1653d12) {
                                int r9 = c1655f3.r() + s7;
                                c1655f3.f16948d.f17257i.d(r9);
                                c1655f3.f16948d.f17253e.d(r9 - s7);
                                aVar.g();
                                EnumC1653d enumC1653d13 = c1655f3.f16937U[1];
                                if (enumC1653d13 == enumC1653d5 || enumC1653d13 == enumC1653d12) {
                                    int l8 = c1655f3.l() + t7;
                                    c1655f3.f16950e.f17257i.d(l8);
                                    c1655f3.f16950e.f17253e.d(l8 - t7);
                                }
                                aVar.g();
                                z10 = true;
                            } else {
                                z10 = false;
                            }
                            Iterator it3 = arrayList2.iterator();
                            while (it3.hasNext()) {
                                n nVar = (n) it3.next();
                                if (nVar.f17250b != c1655f3 || nVar.f17255g) {
                                    nVar.e();
                                }
                            }
                            Iterator it4 = arrayList2.iterator();
                            while (it4.hasNext()) {
                                n nVar2 = (n) it4.next();
                                if (z10 || nVar2.f17250b != c1655f3) {
                                    if (!nVar2.f17256h.j || ((!nVar2.f17257i.j && !(nVar2 instanceof h)) || (!nVar2.f17253e.j && !(nVar2 instanceof C1670c) && !(nVar2 instanceof h)))) {
                                        z11 = false;
                                        break;
                                    }
                                }
                            }
                            z11 = true;
                            c1655f3.N(k7);
                            c1655f3.O(k8);
                            z9 = z11;
                            i21 = 1073741824;
                            i14 = 2;
                        } else {
                            z8 = z7;
                            c1726n0 = c1726n04;
                            i12 = r8;
                            enumC1653d4 = enumC1653d3;
                            dVar = dVar5;
                            i13 = l7;
                            enumC1653d5 = enumC1653d;
                            enumC1653d6 = enumC1653d10;
                            boolean z14 = aVar.f1617a;
                            C1655f c1655f4 = (C1655f) aVar.f1619c;
                            if (z14) {
                                Iterator it5 = c1655f4.f17003u0.iterator();
                                while (it5.hasNext()) {
                                    C1654e c1654e3 = (C1654e) it5.next();
                                    c1654e3.i();
                                    c1654e3.f16943a = false;
                                    j jVar2 = c1654e3.f16948d;
                                    jVar2.f17253e.j = false;
                                    jVar2.f17255g = false;
                                    jVar2.n();
                                    l lVar2 = c1654e3.f16950e;
                                    lVar2.f17253e.j = false;
                                    lVar2.f17255g = false;
                                    lVar2.m();
                                }
                                i20 = 0;
                                c1655f4.i();
                                c1655f4.f16943a = false;
                                j jVar3 = c1655f4.f16948d;
                                jVar3.f17253e.j = false;
                                jVar3.f17255g = false;
                                jVar3.n();
                                l lVar3 = c1655f4.f16950e;
                                lVar3.f17253e.j = false;
                                lVar3.f17255g = false;
                                lVar3.m();
                                aVar.c();
                            } else {
                                i20 = 0;
                            }
                            aVar.b((C1655f) aVar.f1620d);
                            c1655f4.f16944a0 = i20;
                            c1655f4.f16946b0 = i20;
                            c1655f4.f16948d.f17256h.d(i20);
                            c1655f4.f16950e.f17256h.d(i20);
                            i21 = 1073741824;
                            if (mode == 1073741824) {
                                z9 = c1655f2.U(i20, c3);
                                i14 = 1;
                            } else {
                                i14 = 0;
                                z9 = true;
                            }
                            if (mode2 == 1073741824) {
                                z9 &= c1655f2.U(1, c3);
                                i14++;
                            }
                        }
                        if (z9) {
                            c1655f2.Q(mode == i21, mode2 == i21);
                        }
                    }
                    if (z9 || i14 != 2) {
                        int i31 = c1655f2.f16994H0;
                        if (size <= 0) {
                            int size5 = c1655f2.f17003u0.size();
                            boolean X6 = c1655f2.X(64);
                            d dVar6 = c1655f2.f17007y0;
                            int i32 = 0;
                            while (i32 < size5) {
                                C1654e c1654e4 = (C1654e) c1655f2.f17003u0.get(i32);
                                if ((c1654e4 instanceof C1658i) || (c1654e4 instanceof C1650a) || c1654e4.f16923G || (X6 && (jVar = c1654e4.f16948d) != null && (lVar = c1654e4.f16950e) != null && jVar.f17253e.j && lVar.f17253e.j)) {
                                    enumC1653d7 = enumC1653d6;
                                    c1726n03 = c1726n0;
                                } else {
                                    EnumC1653d k9 = c1654e4.k(0);
                                    EnumC1653d k10 = c1654e4.k(1);
                                    enumC1653d7 = enumC1653d6;
                                    boolean z15 = k9 == enumC1653d7 && c1654e4.f16975r != 1 && k10 == enumC1653d7 && c1654e4.f16977s != 1;
                                    if (!z15 && c1655f2.X(1) && !(c1654e4 instanceof AbstractC1662m)) {
                                        if (k9 == enumC1653d7 && c1654e4.f16975r == 0 && k10 != enumC1653d7 && !c1654e4.y()) {
                                            z15 = true;
                                        }
                                        if (k10 == enumC1653d7 && c1654e4.f16977s == 0 && k9 != enumC1653d7 && !c1654e4.y()) {
                                            z15 = true;
                                        }
                                        if (k9 == enumC1653d7 || k10 == enumC1653d7) {
                                            if (c1654e4.f16941Y > 0.0f) {
                                                z15 = true;
                                            }
                                            if (z15) {
                                                c1726n03 = c1726n0;
                                                c1726n03.D(0, dVar6, c1654e4);
                                            } else {
                                                c1726n03 = c1726n0;
                                            }
                                        }
                                    }
                                    if (z15) {
                                    }
                                }
                                i32++;
                                c1726n0 = c1726n03;
                                enumC1653d6 = enumC1653d7;
                            }
                            c1726n02 = c1726n0;
                            ConstraintLayout constraintLayout = dVar6.f768a;
                            int childCount2 = constraintLayout.getChildCount();
                            for (int i33 = 0; i33 < childCount2; i33++) {
                                View childAt = constraintLayout.getChildAt(i33);
                                if (childAt instanceof Placeholder) {
                                    Placeholder placeholder = (Placeholder) childAt;
                                    if (placeholder.f9019b != null) {
                                        c cVar = (c) placeholder.getLayoutParams();
                                        c cVar2 = (c) placeholder.f9019b.getLayoutParams();
                                        C1654e c1654e5 = cVar2.f758q0;
                                        c1654e5.f16959i0 = 0;
                                        C1654e c1654e6 = cVar.f758q0;
                                        if (c1654e6.f16937U[0] != enumC1653d5) {
                                            c1654e6.P(c1654e5.r());
                                        }
                                        C1654e c1654e7 = cVar.f758q0;
                                        if (c1654e7.f16937U[1] != enumC1653d5) {
                                            c1654e7.M(cVar2.f758q0.l());
                                        }
                                        cVar2.f758q0.f16959i0 = 8;
                                    }
                                }
                            }
                            ArrayList arrayList3 = constraintLayout.f9008b;
                            int size6 = arrayList3.size();
                            if (size6 > 0) {
                                for (int i34 = 0; i34 < size6; i34++) {
                                    ((ConstraintHelper) arrayList3.get(i34)).getClass();
                                }
                            }
                        } else {
                            c1726n02 = c1726n0;
                        }
                        c1726n02.L(c1655f2);
                        ?? r32 = (ArrayList) c1726n02.f17805b;
                        size2 = r32.size();
                        if (size <= 0) {
                            i15 = i13;
                            i16 = i12;
                            r52 = 0;
                            c1726n02.I(c1655f2, 0, i16, i15);
                        } else {
                            i15 = i13;
                            i16 = i12;
                            r52 = 0;
                        }
                        if (size2 > 0) {
                            EnumC1653d[] enumC1653dArr2 = c1655f2.f16937U;
                            char c4 = enumC1653dArr2[r52] == enumC1653d4 ? (char) 1 : r52;
                            char c7 = enumC1653dArr2[1] == enumC1653d4 ? (char) 1 : r52;
                            int r10 = c1655f.r();
                            C1655f c1655f5 = (C1655f) c1726n02.f17807d;
                            int max7 = Math.max(r10, c1655f5.f16949d0);
                            int max8 = Math.max(c1655f.l(), c1655f5.f16951e0);
                            boolean z16 = r52;
                            boolean z17 = z16;
                            for (?? r92 = z16; r92 < size2; r92++) {
                                C1654e c1654e8 = (C1654e) r32.get(r92);
                                if (c1654e8 instanceof AbstractC1662m) {
                                    int r11 = c1654e8.r();
                                    int l9 = c1654e8.l();
                                    i18 = i31;
                                    dVar3 = dVar;
                                    boolean D7 = z17 | c1726n02.D(1, dVar3, c1654e8);
                                    int r12 = c1654e8.r();
                                    boolean z18 = D7;
                                    int l10 = c1654e8.l();
                                    if (r12 != r11) {
                                        c1654e8.P(r12);
                                        if (c4 != 0 && c1654e8.s() + c1654e8.f16939W > max7) {
                                            max7 = Math.max(max7, c1654e8.j(4).e() + c1654e8.s() + c1654e8.f16939W);
                                        }
                                        z18 = true;
                                    }
                                    if (l10 != l9) {
                                        c1654e8.M(l10);
                                        if (c7 != 0 && c1654e8.t() + c1654e8.f16940X > max8) {
                                            max8 = Math.max(max8, c1654e8.j(5).e() + c1654e8.t() + c1654e8.f16940X);
                                        }
                                        z18 = true;
                                    }
                                    z17 = z18 | ((AbstractC1662m) c1654e8).f17060C0;
                                } else {
                                    i18 = i31;
                                    dVar3 = dVar;
                                }
                                dVar = dVar3;
                                i31 = i18;
                            }
                            int i35 = i31;
                            d dVar7 = dVar;
                            int i36 = 0;
                            int i37 = 2;
                            ArrayList arrayList4 = r32;
                            while (i36 < i37) {
                                int i38 = 0;
                                ArrayList arrayList5 = arrayList4;
                                while (i38 < size2) {
                                    C1654e c1654e9 = (C1654e) arrayList5.get(i38);
                                    if ((!(c1654e9 instanceof C1659j) || (c1654e9 instanceof AbstractC1662m)) && !(c1654e9 instanceof C1658i)) {
                                        if (c1654e9.f16959i0 != 8 && ((!z8 || !c1654e9.f16948d.f17253e.j || !c1654e9.f16950e.f17253e.j) && !(c1654e9 instanceof AbstractC1662m))) {
                                            int r13 = c1654e9.r();
                                            int l11 = c1654e9.l();
                                            arrayList = arrayList5;
                                            int i39 = c1654e9.c0;
                                            i17 = size2;
                                            boolean D8 = c1726n02.D(i36 == 1 ? 2 : 1, dVar7, c1654e9) | z17;
                                            int r14 = c1654e9.r();
                                            dVar2 = dVar7;
                                            int l12 = c1654e9.l();
                                            if (r14 != r13) {
                                                c1654e9.P(r14);
                                                if (c4 != 0 && c1654e9.s() + c1654e9.f16939W > max7) {
                                                    max7 = Math.max(max7, c1654e9.j(4).e() + c1654e9.s() + c1654e9.f16939W);
                                                }
                                                D8 = true;
                                            }
                                            if (l12 != l11) {
                                                c1654e9.M(l12);
                                                if (c7 != 0 && c1654e9.t() + c1654e9.f16940X > max8) {
                                                    max8 = Math.max(max8, c1654e9.j(5).e() + c1654e9.t() + c1654e9.f16940X);
                                                }
                                                D8 = true;
                                            }
                                            z17 = (!c1654e9.f16921E || i39 == c1654e9.c0) ? D8 : true;
                                            i38++;
                                            arrayList5 = arrayList;
                                            size2 = i17;
                                            dVar7 = dVar2;
                                        }
                                    }
                                    dVar2 = dVar7;
                                    arrayList = arrayList5;
                                    i17 = size2;
                                    i38++;
                                    arrayList5 = arrayList;
                                    size2 = i17;
                                    dVar7 = dVar2;
                                }
                                d dVar8 = dVar7;
                                ArrayList arrayList6 = arrayList5;
                                int i40 = size2;
                                if (!z17) {
                                    break;
                                }
                                i36++;
                                c1726n02.I(c1655f, i36, i16, i15);
                                dVar7 = dVar8;
                                arrayList4 = arrayList6;
                                size2 = i40;
                                i37 = 2;
                                z17 = false;
                            }
                            c1655f2 = c1655f;
                            i31 = i35;
                        }
                        c1655f2.f16994H0 = i31;
                        t.c.f16228p = c1655f2.X(512);
                    }
                    return;
                }
                max2 = childCount == 0 ? Math.max(0, this.f9011e) : i25;
                enumC1653d2 = enumC1653d9;
                enumC1653d3 = enumC1653d2;
                r7 = c1655f.r();
                aVar = c1655f2.f17005w0;
                if (max == r7) {
                }
                aVar.f1618b = true;
                c1655f2.f16944a0 = 0;
                c1655f2.f16946b0 = 0;
                int i292 = this.f9012f - i27;
                int[] iArr2 = c1655f2.f16919C;
                iArr2[0] = i292;
                iArr2[1] = this.f9013x - i26;
                c1655f2.f16949d0 = 0;
                c1655f2.f16951e0 = 0;
                c1655f2.N(enumC1653d8);
                c1655f2.P(max);
                c1655f2.O(enumC1653d2);
                c1655f2.M(max2);
                i10 = this.f9010d - i27;
                if (i10 >= 0) {
                }
                i11 = this.f9011e - i26;
                if (i11 >= 0) {
                }
                c1655f2.f16988B0 = max5;
                c1655f2.f16989C0 = max3;
                C1726n0 c1726n042 = c1655f2.f17004v0;
                c1726n042.getClass();
                d dVar52 = c1655f2.f17007y0;
                size = c1655f2.f17003u0.size();
                int r82 = c1655f.r();
                int l72 = c1655f.l();
                boolean c32 = AbstractC1660k.c(i7, 128);
                if (c32) {
                }
                EnumC1653d enumC1653d102 = EnumC1653d.f16914c;
                if (z4) {
                }
                z7 = z4 & ((mode != 1073741824 && mode2 == 1073741824) || c32);
                if (z7) {
                }
                if (z9) {
                }
                int i312 = c1655f2.f16994H0;
                if (size <= 0) {
                }
                c1726n02.L(c1655f2);
                ?? r322 = (ArrayList) c1726n02.f17805b;
                size2 = r322.size();
                if (size <= 0) {
                }
                if (size2 > 0) {
                }
                c1655f2.f16994H0 = i312;
                t.c.f16228p = c1655f2.X(512);
            }
            if (childCount == 0) {
                enumC1653d = enumC1653d8;
                enumC1653d8 = enumC1653d9;
                max = Math.max(0, this.f9010d);
                i28 = Integer.MIN_VALUE;
                if (mode2 != i28) {
                }
                enumC1653d2 = enumC1653d9;
                enumC1653d3 = enumC1653d2;
                r7 = c1655f.r();
                aVar = c1655f2.f17005w0;
                if (max == r7) {
                }
                aVar.f1618b = true;
                c1655f2.f16944a0 = 0;
                c1655f2.f16946b0 = 0;
                int i2922 = this.f9012f - i27;
                int[] iArr22 = c1655f2.f16919C;
                iArr22[0] = i2922;
                iArr22[1] = this.f9013x - i26;
                c1655f2.f16949d0 = 0;
                c1655f2.f16951e0 = 0;
                c1655f2.N(enumC1653d8);
                c1655f2.P(max);
                c1655f2.O(enumC1653d2);
                c1655f2.M(max2);
                i10 = this.f9010d - i27;
                if (i10 >= 0) {
                }
                i11 = this.f9011e - i26;
                if (i11 >= 0) {
                }
                c1655f2.f16988B0 = max5;
                c1655f2.f16989C0 = max3;
                C1726n0 c1726n0422 = c1655f2.f17004v0;
                c1726n0422.getClass();
                d dVar522 = c1655f2.f17007y0;
                size = c1655f2.f17003u0.size();
                int r822 = c1655f.r();
                int l722 = c1655f.l();
                boolean c322 = AbstractC1660k.c(i7, 128);
                if (c322) {
                }
                EnumC1653d enumC1653d1022 = EnumC1653d.f16914c;
                if (z4) {
                }
                z7 = z4 & ((mode != 1073741824 && mode2 == 1073741824) || c322);
                if (z7) {
                }
                if (z9) {
                }
                int i3122 = c1655f2.f16994H0;
                if (size <= 0) {
                }
                c1726n02.L(c1655f2);
                ?? r3222 = (ArrayList) c1726n02.f17805b;
                size2 = r3222.size();
                if (size <= 0) {
                }
                if (size2 > 0) {
                }
                c1655f2.f16994H0 = i3122;
                t.c.f16228p = c1655f2.X(512);
            }
            max = 0;
        }
        enumC1653d = enumC1653d8;
        enumC1653d8 = enumC1653d9;
        i28 = Integer.MIN_VALUE;
        if (mode2 != i28) {
        }
        enumC1653d2 = enumC1653d9;
        enumC1653d3 = enumC1653d2;
        r7 = c1655f.r();
        aVar = c1655f2.f17005w0;
        if (max == r7) {
        }
        aVar.f1618b = true;
        c1655f2.f16944a0 = 0;
        c1655f2.f16946b0 = 0;
        int i29222 = this.f9012f - i27;
        int[] iArr222 = c1655f2.f16919C;
        iArr222[0] = i29222;
        iArr222[1] = this.f9013x - i26;
        c1655f2.f16949d0 = 0;
        c1655f2.f16951e0 = 0;
        c1655f2.N(enumC1653d8);
        c1655f2.P(max);
        c1655f2.O(enumC1653d2);
        c1655f2.M(max2);
        i10 = this.f9010d - i27;
        if (i10 >= 0) {
        }
        i11 = this.f9011e - i26;
        if (i11 >= 0) {
        }
        c1655f2.f16988B0 = max5;
        c1655f2.f16989C0 = max3;
        C1726n0 c1726n04222 = c1655f2.f17004v0;
        c1726n04222.getClass();
        d dVar5222 = c1655f2.f17007y0;
        size = c1655f2.f17003u0.size();
        int r8222 = c1655f.r();
        int l7222 = c1655f.l();
        boolean c3222 = AbstractC1660k.c(i7, 128);
        if (c3222) {
        }
        EnumC1653d enumC1653d10222 = EnumC1653d.f16914c;
        if (z4) {
        }
        z7 = z4 & ((mode != 1073741824 && mode2 == 1073741824) || c3222);
        if (z7) {
        }
        if (z9) {
        }
        int i31222 = c1655f2.f16994H0;
        if (size <= 0) {
        }
        c1726n02.L(c1655f2);
        ?? r32222 = (ArrayList) c1726n02.f17805b;
        size2 = r32222.size();
        if (size <= 0) {
        }
        if (size2 > 0) {
        }
        c1655f2.f16994H0 = i31222;
        t.c.f16228p = c1655f2.X(512);
    }

    public final void i(C1654e c1654e, c cVar, SparseArray sparseArray, int i7, int i8) {
        View view = (View) this.f9007a.get(i7);
        C1654e c1654e2 = (C1654e) sparseArray.get(i7);
        if (c1654e2 == null || view == null || !(view.getLayoutParams() instanceof c)) {
            return;
        }
        cVar.c0 = true;
        if (i8 == 6) {
            c cVar2 = (c) view.getLayoutParams();
            cVar2.c0 = true;
            cVar2.f758q0.f16921E = true;
        }
        c1654e.j(6).b(c1654e2.j(i8), cVar.f704D, cVar.f703C, true);
        c1654e.f16921E = true;
        c1654e.j(3).j();
        c1654e.j(5).j();
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onLayout(boolean z4, int i7, int i8, int i9, int i10) {
        View content;
        int childCount = getChildCount();
        boolean isInEditMode = isInEditMode();
        for (int i11 = 0; i11 < childCount; i11++) {
            View childAt = getChildAt(i11);
            c cVar = (c) childAt.getLayoutParams();
            C1654e c1654e = cVar.f758q0;
            if ((childAt.getVisibility() != 8 || cVar.f733d0 || cVar.f735e0 || isInEditMode) && !cVar.f737f0) {
                int s7 = c1654e.s();
                int t7 = c1654e.t();
                int r7 = c1654e.r() + s7;
                int l7 = c1654e.l() + t7;
                childAt.layout(s7, t7, r7, l7);
                if ((childAt instanceof Placeholder) && (content = ((Placeholder) childAt).getContent()) != null) {
                    content.setVisibility(0);
                    content.layout(s7, t7, r7, l7);
                }
            }
        }
        ArrayList arrayList = this.f9008b;
        int size = arrayList.size();
        if (size > 0) {
            for (int i12 = 0; i12 < size; i12++) {
                ((ConstraintHelper) arrayList.get(i12)).n();
            }
        }
    }

    @Override // android.view.View
    public void onMeasure(int i7, int i8) {
        boolean z4;
        String resourceName;
        int id;
        C1654e c1654e;
        if (this.f9005G == i7) {
            int i9 = this.f9006H;
        }
        int i10 = 0;
        if (!this.f9014y) {
            int childCount = getChildCount();
            int i11 = 0;
            while (true) {
                if (i11 >= childCount) {
                    break;
                }
                if (getChildAt(i11).isLayoutRequested()) {
                    this.f9014y = true;
                    break;
                }
                i11++;
            }
        }
        this.f9005G = i7;
        this.f9006H = i8;
        boolean e7 = e();
        C1655f c1655f = this.f9009c;
        c1655f.f17008z0 = e7;
        if (this.f9014y) {
            this.f9014y = false;
            int childCount2 = getChildCount();
            int i12 = 0;
            while (true) {
                if (i12 >= childCount2) {
                    z4 = false;
                    break;
                } else {
                    if (getChildAt(i12).isLayoutRequested()) {
                        z4 = true;
                        break;
                    }
                    i12++;
                }
            }
            if (z4) {
                boolean isInEditMode = isInEditMode();
                int childCount3 = getChildCount();
                for (int i13 = 0; i13 < childCount3; i13++) {
                    C1654e c3 = c(getChildAt(i13));
                    if (c3 != null) {
                        c3.D();
                    }
                }
                Object obj = null;
                if (isInEditMode) {
                    for (int i14 = 0; i14 < childCount3; i14++) {
                        View childAt = getChildAt(i14);
                        try {
                            resourceName = getResources().getResourceName(childAt.getId());
                            Integer valueOf = Integer.valueOf(childAt.getId());
                            if (resourceName != null) {
                                if (this.f9002D == null) {
                                    this.f9002D = new HashMap();
                                }
                                int indexOf = resourceName.indexOf("/");
                                this.f9002D.put(indexOf != -1 ? resourceName.substring(indexOf + 1) : resourceName, valueOf);
                            }
                            int indexOf2 = resourceName.indexOf(47);
                            if (indexOf2 != -1) {
                                resourceName = resourceName.substring(indexOf2 + 1);
                            }
                            id = childAt.getId();
                        } catch (Resources.NotFoundException unused) {
                        }
                        if (id != 0) {
                            View view = (View) this.f9007a.get(id);
                            if (view == null && (view = findViewById(id)) != null && view != this && view.getParent() == this) {
                                onViewAdded(view);
                            }
                            if (view != this) {
                                c1654e = view == null ? null : ((c) view.getLayoutParams()).f758q0;
                                c1654e.f16962k0 = resourceName;
                            }
                        }
                        c1654e = c1655f;
                        c1654e.f16962k0 = resourceName;
                    }
                }
                if (this.f9001C != -1) {
                    for (int i15 = 0; i15 < childCount3; i15++) {
                        View childAt2 = getChildAt(i15);
                        if (childAt2.getId() == this.f9001C && (childAt2 instanceof Constraints)) {
                            this.f8999A = ((Constraints) childAt2).getConstraintSet();
                        }
                    }
                }
                m mVar = this.f8999A;
                if (mVar != null) {
                    mVar.c(this);
                }
                c1655f.f17003u0.clear();
                ArrayList arrayList = this.f9008b;
                int size = arrayList.size();
                if (size > 0) {
                    int i16 = 0;
                    while (i16 < size) {
                        ConstraintHelper constraintHelper = (ConstraintHelper) arrayList.get(i16);
                        if (constraintHelper.isInEditMode()) {
                            constraintHelper.setIds(constraintHelper.f8994e);
                        }
                        C1659j c1659j = constraintHelper.f8993d;
                        if (c1659j != null) {
                            c1659j.f17056v0 = i10;
                            Arrays.fill(c1659j.f17055u0, obj);
                            for (int i17 = i10; i17 < constraintHelper.f8991b; i17++) {
                                int i18 = constraintHelper.f8990a[i17];
                                View b7 = b(i18);
                                if (b7 == null) {
                                    Integer valueOf2 = Integer.valueOf(i18);
                                    HashMap hashMap = constraintHelper.f8997y;
                                    String str = (String) hashMap.get(valueOf2);
                                    int h6 = constraintHelper.h(this, str);
                                    if (h6 != 0) {
                                        constraintHelper.f8990a[i17] = h6;
                                        hashMap.put(Integer.valueOf(h6), str);
                                        b7 = b(h6);
                                    }
                                }
                                View view2 = b7;
                                if (view2 != null) {
                                    constraintHelper.f8993d.S(c(view2));
                                }
                            }
                            constraintHelper.f8993d.U();
                        }
                        i16++;
                        obj = null;
                        i10 = 0;
                    }
                }
                for (int i19 = 0; i19 < childCount3; i19++) {
                    View childAt3 = getChildAt(i19);
                    if (childAt3 instanceof Placeholder) {
                        Placeholder placeholder = (Placeholder) childAt3;
                        if (placeholder.f9018a == -1 && !placeholder.isInEditMode()) {
                            placeholder.setVisibility(placeholder.f9020c);
                        }
                        View findViewById = findViewById(placeholder.f9018a);
                        placeholder.f9019b = findViewById;
                        if (findViewById != null) {
                            ((c) findViewById.getLayoutParams()).f737f0 = true;
                            placeholder.f9019b.setVisibility(0);
                            placeholder.setVisibility(0);
                        }
                    }
                }
                SparseArray sparseArray = this.f9003E;
                sparseArray.clear();
                sparseArray.put(0, c1655f);
                sparseArray.put(getId(), c1655f);
                for (int i20 = 0; i20 < childCount3; i20++) {
                    View childAt4 = getChildAt(i20);
                    sparseArray.put(childAt4.getId(), c(childAt4));
                }
                for (int i21 = 0; i21 < childCount3; i21++) {
                    View childAt5 = getChildAt(i21);
                    C1654e c4 = c(childAt5);
                    if (c4 != null) {
                        c cVar = (c) childAt5.getLayoutParams();
                        c1655f.f17003u0.add(c4);
                        C1654e c1654e2 = c4.f16938V;
                        if (c1654e2 != null) {
                            ((C1655f) c1654e2).f17003u0.remove(c4);
                            c4.D();
                        }
                        c4.f16938V = c1655f;
                        a(isInEditMode, childAt5, c4, cVar, sparseArray);
                    }
                }
            }
            if (z4) {
                c1655f.f17004v0.L(c1655f);
            }
        }
        h(c1655f, this.f9015z, i7, i8);
        g(i7, i8, c1655f.r(), c1655f.f16995I0, c1655f.f16996J0, c1655f.l());
    }

    @Override // android.view.ViewGroup
    public void onViewAdded(View view) {
        super.onViewAdded(view);
        C1654e c3 = c(view);
        if ((view instanceof Guideline) && !(c3 instanceof C1658i)) {
            c cVar = (c) view.getLayoutParams();
            C1658i c1658i = new C1658i();
            cVar.f758q0 = c1658i;
            cVar.f733d0 = true;
            c1658i.T(cVar.f722V);
        }
        if (view instanceof ConstraintHelper) {
            ConstraintHelper constraintHelper = (ConstraintHelper) view;
            constraintHelper.q();
            ((c) view.getLayoutParams()).f735e0 = true;
            ArrayList arrayList = this.f9008b;
            if (!arrayList.contains(constraintHelper)) {
                arrayList.add(constraintHelper);
            }
        }
        this.f9007a.put(view.getId(), view);
        this.f9014y = true;
    }

    @Override // android.view.ViewGroup
    public void onViewRemoved(View view) {
        super.onViewRemoved(view);
        this.f9007a.remove(view.getId());
        C1654e c3 = c(view);
        this.f9009c.f17003u0.remove(c3);
        c3.D();
        this.f9008b.remove(view);
        this.f9014y = true;
    }

    @Override // android.view.View, android.view.ViewParent
    public void requestLayout() {
        this.f9014y = true;
        super.requestLayout();
    }

    public void setConstraintSet(m mVar) {
        this.f8999A = mVar;
    }

    @Override // android.view.View
    public void setId(int i7) {
        int id = getId();
        SparseArray sparseArray = this.f9007a;
        sparseArray.remove(id);
        super.setId(i7);
        sparseArray.put(getId(), this);
    }

    public void setMaxHeight(int i7) {
        if (i7 == this.f9013x) {
            return;
        }
        this.f9013x = i7;
        requestLayout();
    }

    public void setMaxWidth(int i7) {
        if (i7 == this.f9012f) {
            return;
        }
        this.f9012f = i7;
        requestLayout();
    }

    public void setMinHeight(int i7) {
        if (i7 == this.f9011e) {
            return;
        }
        this.f9011e = i7;
        requestLayout();
    }

    public void setMinWidth(int i7) {
        if (i7 == this.f9010d) {
            return;
        }
        this.f9010d = i7;
        requestLayout();
    }

    public void setOnConstraintsChanged(o oVar) {
        C0350f c0350f = this.f9000B;
        if (c0350f != null) {
            c0350f.getClass();
        }
    }

    public void setOptimizationLevel(int i7) {
        this.f9015z = i7;
        C1655f c1655f = this.f9009c;
        c1655f.f16994H0 = i7;
        t.c.f16228p = c1655f.X(512);
    }

    @Override // android.view.ViewGroup
    public final boolean shouldDelayChildPressedState() {
        return false;
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return new c(layoutParams);
    }

    public ConstraintLayout(Context context, AttributeSet attributeSet, int i7) {
        super(context, attributeSet, i7);
        this.f9007a = new SparseArray();
        this.f9008b = new ArrayList(4);
        this.f9009c = new C1655f();
        this.f9010d = 0;
        this.f9011e = 0;
        this.f9012f = f.API_PRIORITY_OTHER;
        this.f9013x = f.API_PRIORITY_OTHER;
        this.f9014y = true;
        this.f9015z = 257;
        this.f8999A = null;
        this.f9000B = null;
        this.f9001C = -1;
        this.f9002D = new HashMap();
        this.f9003E = new SparseArray();
        this.f9004F = new d(this, this);
        this.f9005G = 0;
        this.f9006H = 0;
        d(attributeSet, i7);
    }
}
