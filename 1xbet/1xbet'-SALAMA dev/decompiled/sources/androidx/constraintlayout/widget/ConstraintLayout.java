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
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import p149v.e;
import p149v.f;
import p149v.i;
import p149v.k;
import p154w.h;
import p154w.j;
import p154w.l;
import p154w.n;
import p155w1.C1017n0;

/* JADX INFO: loaded from: classes.dex */
public class ConstraintLayout extends ViewGroup {

    /* JADX INFO: renamed from: I, reason: collision with root package name */
    public static s f8998I;

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public m f8999A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public C0350f f9000B;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public int f9001C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    public HashMap f9002D;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    public final SparseArray f9003E;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    public final d f9004F;

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    public int f9005G;

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    public int f9006H;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final SparseArray f9007a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ArrayList f9008b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final f f9009c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f9010d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f9011e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f9012f;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public int f9013x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public boolean f9014y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public int f9015z;

    public ConstraintLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f9007a = new SparseArray();
        this.f9008b = new ArrayList(4);
        this.f9009c = new f();
        this.f9010d = 0;
        this.f9011e = 0;
        this.f9012f = com.google.android.gms.common.api.f.API_PRIORITY_OTHER;
        this.f9013x = com.google.android.gms.common.api.f.API_PRIORITY_OTHER;
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
        int iMax = Math.max(0, getPaddingRight()) + Math.max(0, getPaddingLeft());
        int iMax2 = Math.max(0, getPaddingEnd()) + Math.max(0, getPaddingStart());
        return iMax2 > 0 ? iMax2 : iMax;
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

    /* JADX WARN: Code duplicated, block: B:154:0x02d0  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:154:0x02d0 -> B:149:0x02bf). Please report as a decompilation issue!!! */
    public final void a(boolean z4, View view, e eVar, c cVar, SparseArray sparseArray) {
        int i7;
        int i8;
        e eVar2;
        e eVar3;
        e eVar4;
        e eVar5;
        int i9;
        int i10;
        float fAbs;
        int i11;
        cVar.a();
        eVar.f16965i0 = view.getVisibility();
        if (cVar.f737f0) {
            eVar.f16928F = true;
            eVar.f16965i0 = 8;
        }
        eVar.f16963h0 = view;
        if (view instanceof ConstraintHelper) {
            ((ConstraintHelper) view).m(eVar, this.f9009c.f17014z0);
        }
        int i12 = -1;
        if (cVar.f733d0) {
            i iVar = (i) eVar;
            int i13 = cVar.f752n0;
            int i14 = cVar.f754o0;
            float f7 = cVar.f756p0;
            if (f7 != -1.0f) {
                if (f7 > -1.0f) {
                    iVar.f17055u0 = f7;
                    iVar.f17056v0 = -1;
                    iVar.f17057w0 = -1;
                    return;
                }
                return;
            }
            if (i13 != -1) {
                if (i13 > -1) {
                    iVar.f17055u0 = -1.0f;
                    iVar.f17056v0 = i13;
                    iVar.f17057w0 = -1;
                    return;
                }
                return;
            }
            if (i14 == -1 || i14 <= -1) {
                return;
            }
            iVar.f17055u0 = -1.0f;
            iVar.f17056v0 = -1;
            iVar.f17057w0 = i14;
            return;
        }
        int i15 = cVar.f739g0;
        int i16 = cVar.f741h0;
        int i17 = cVar.f743i0;
        int i18 = cVar.f744j0;
        int i19 = cVar.f746k0;
        int i20 = cVar.f748l0;
        float f8 = cVar.f750m0;
        int i21 = cVar.f755p;
        if (i21 != -1) {
            e eVar6 = (e) sparseArray.get(i21);
            if (eVar6 != null) {
                float f9 = cVar.f759r;
                eVar.w(7, eVar6, 7, cVar.f757q, 0);
                eVar.f16926D = f9;
            }
            i8 = 4;
            i7 = 2;
        } else {
            if (i15 != -1) {
                e eVar7 = (e) sparseArray.get(i15);
                if (eVar7 != null) {
                    i7 = 2;
                    i8 = 4;
                    eVar.w(2, eVar7, 2, ((ViewGroup.MarginLayoutParams) cVar).leftMargin, i19);
                } else {
                    i7 = 2;
                    i8 = 4;
                }
            } else {
                i7 = 2;
                i8 = 4;
                if (i16 != -1 && (eVar2 = (e) sparseArray.get(i16)) != null) {
                    eVar.w(2, eVar2, 4, ((ViewGroup.MarginLayoutParams) cVar).leftMargin, i19);
                }
            }
            if (i17 != -1) {
                e eVar8 = (e) sparseArray.get(i17);
                if (eVar8 != null) {
                    eVar.w(i8, eVar8, i7, ((ViewGroup.MarginLayoutParams) cVar).rightMargin, i20);
                }
            } else if (i18 != -1 && (eVar3 = (e) sparseArray.get(i18)) != null) {
                eVar.w(i8, eVar3, i8, ((ViewGroup.MarginLayoutParams) cVar).rightMargin, i20);
            }
            int i22 = cVar.f742i;
            if (i22 != -1) {
                e eVar9 = (e) sparseArray.get(i22);
                if (eVar9 != null) {
                    eVar.w(3, eVar9, 3, ((ViewGroup.MarginLayoutParams) cVar).topMargin, cVar.f765x);
                }
            } else {
                int i23 = cVar.j;
                if (i23 != -1 && (eVar4 = (e) sparseArray.get(i23)) != null) {
                    eVar.w(3, eVar4, 5, ((ViewGroup.MarginLayoutParams) cVar).topMargin, cVar.f765x);
                }
            }
            int i24 = cVar.f745k;
            if (i24 != -1) {
                e eVar10 = (e) sparseArray.get(i24);
                if (eVar10 != null) {
                    eVar.w(5, eVar10, 3, ((ViewGroup.MarginLayoutParams) cVar).bottomMargin, cVar.f767z);
                }
            } else {
                int i25 = cVar.f747l;
                if (i25 != -1 && (eVar5 = (e) sparseArray.get(i25)) != null) {
                    eVar.w(5, eVar5, 5, ((ViewGroup.MarginLayoutParams) cVar).bottomMargin, cVar.f767z);
                }
            }
            int i26 = cVar.f749m;
            if (i26 != -1) {
                i(eVar, cVar, sparseArray, i26, 6);
            } else {
                int i27 = cVar.f751n;
                if (i27 != -1) {
                    i(eVar, cVar, sparseArray, i27, 3);
                } else {
                    int i28 = cVar.f753o;
                    if (i28 != -1) {
                        i(eVar, cVar, sparseArray, i28, 5);
                    }
                }
            }
            if (f8 >= 0.0f) {
                eVar.f16959f0 = f8;
            }
            float f10 = cVar.f706F;
            if (f10 >= 0.0f) {
                eVar.f16961g0 = f10;
            }
        }
        if (z4 && ((i11 = cVar.f720T) != -1 || cVar.f721U != -1)) {
            int i29 = cVar.f721U;
            eVar.f16950a0 = i11;
            eVar.f16952b0 = i29;
        }
        boolean z7 = cVar.f728a0;
        p149v.d dVar = p149v.d.f16919b;
        p149v.d dVar2 = p149v.d.f16918a;
        p149v.d dVar3 = p149v.d.f16921d;
        p149v.d dVar4 = p149v.d.f16920c;
        if (z7) {
            eVar.N(dVar2);
            eVar.P(((ViewGroup.MarginLayoutParams) cVar).width);
            if (((ViewGroup.MarginLayoutParams) cVar).width == -2) {
                eVar.N(dVar);
            }
        } else if (((ViewGroup.MarginLayoutParams) cVar).width == -1) {
            if (cVar.f723W) {
                eVar.N(dVar4);
            } else {
                eVar.N(dVar3);
            }
            eVar.j(i7).f16915g = ((ViewGroup.MarginLayoutParams) cVar).leftMargin;
            eVar.j(i8).f16915g = ((ViewGroup.MarginLayoutParams) cVar).rightMargin;
        } else {
            eVar.N(dVar4);
            eVar.P(0);
        }
        if (cVar.f730b0) {
            eVar.O(dVar2);
            eVar.M(((ViewGroup.MarginLayoutParams) cVar).height);
            if (((ViewGroup.MarginLayoutParams) cVar).height == -2) {
                eVar.O(dVar);
            }
        } else if (((ViewGroup.MarginLayoutParams) cVar).height == -1) {
            if (cVar.f724X) {
                eVar.O(dVar4);
            } else {
                eVar.O(dVar3);
            }
            eVar.j(3).f16915g = ((ViewGroup.MarginLayoutParams) cVar).topMargin;
            eVar.j(5).f16915g = ((ViewGroup.MarginLayoutParams) cVar).bottomMargin;
        } else {
            eVar.O(dVar4);
            eVar.M(0);
        }
        String str = cVar.f707G;
        if (str == null || str.length() == 0) {
            eVar.f16947Y = 0.0f;
        } else {
            int length = str.length();
            int iIndexOf = str.indexOf(44);
            if (iIndexOf <= 0 || iIndexOf >= length - 1) {
                i9 = 1;
                i10 = 0;
            } else {
                String strSubstring = str.substring(0, iIndexOf);
                if (strSubstring.equalsIgnoreCase("W")) {
                    i12 = 0;
                } else {
                    if (strSubstring.equalsIgnoreCase("H")) {
                        i9 = 1;
                        i12 = 1;
                    }
                    i10 = iIndexOf + i9;
                }
                i9 = 1;
                i10 = iIndexOf + i9;
            }
            int iIndexOf2 = str.indexOf(58);
            try {
                if (iIndexOf2 < 0 || iIndexOf2 >= length - i9) {
                    String strSubstring2 = str.substring(i10);
                    if (strSubstring2.length() > 0) {
                        fAbs = Float.parseFloat(strSubstring2);
                    } else {
                        fAbs = 0.0f;
                    }
                } else {
                    String strSubstring3 = str.substring(i10, iIndexOf2);
                    String strSubstring4 = str.substring(iIndexOf2 + i9);
                    if (strSubstring3.length() <= 0 || strSubstring4.length() <= 0) {
                        fAbs = 0.0f;
                    } else {
                        float f11 = Float.parseFloat(strSubstring3);
                        float f12 = Float.parseFloat(strSubstring4);
                        if (f11 <= 0.0f || f12 <= 0.0f) {
                            fAbs = 0.0f;
                        } else {
                            fAbs = i12 == 1 ? Math.abs(f12 / f11) : Math.abs(f11 / f12);
                        }
                    }
                }
            } catch (NumberFormatException unused) {
            }
            if (fAbs > 0.0f) {
                eVar.f16947Y = fAbs;
                eVar.f16948Z = i12;
            }
        }
        float f13 = cVar.f708H;
        float[] fArr = eVar.f16974n0;
        fArr[0] = f13;
        fArr[1] = cVar.f709I;
        eVar.f16970l0 = cVar.f710J;
        eVar.f16972m0 = cVar.f711K;
        int i30 = cVar.f726Z;
        if (i30 >= 0 && i30 <= 3) {
            eVar.f16979q = i30;
        }
        int i31 = cVar.f712L;
        int i32 = cVar.f714N;
        int i33 = cVar.f716P;
        float f14 = cVar.f718R;
        eVar.f16981r = i31;
        eVar.f16987u = i32;
        if (i33 == Integer.MAX_VALUE) {
            i33 = 0;
        }
        eVar.f16988v = i33;
        eVar.f16989w = f14;
        if (f14 > 0.0f && f14 < 1.0f && i31 == 0) {
            eVar.f16981r = 2;
        }
        int i34 = cVar.f713M;
        int i35 = cVar.f715O;
        int i36 = cVar.f717Q;
        float f15 = cVar.f719S;
        eVar.f16983s = i34;
        eVar.f16990x = i35;
        eVar.f16991y = i36 != Integer.MAX_VALUE ? i36 : 0;
        eVar.f16992z = f15;
        if (f15 <= 0.0f || f15 >= 1.0f || i34 != 0) {
            return;
        }
        eVar.f16983s = 2;
    }

    public final View b(int i7) {
        return (View) this.f9007a.get(i7);
    }

    public final e c(View view) {
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
        f fVar = this.f9009c;
        fVar.f16963h0 = this;
        d dVar = this.f9004F;
        fVar.f17013y0 = dVar;
        fVar.f17011w0.f1622f = dVar;
        this.f9007a.put(getId(), this);
        this.f8999A = null;
        if (attributeSet != null) {
            TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, q.f932c, i7, 0);
            int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
            for (int i8 = 0; i8 < indexCount; i8++) {
                int index = typedArrayObtainStyledAttributes.getIndex(i8);
                if (index == 16) {
                    this.f9010d = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, this.f9010d);
                } else if (index == 17) {
                    this.f9011e = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, this.f9011e);
                } else if (index == 14) {
                    this.f9012f = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, this.f9012f);
                } else if (index == 15) {
                    this.f9013x = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, this.f9013x);
                } else if (index == 113) {
                    this.f9015z = typedArrayObtainStyledAttributes.getInt(index, this.f9015z);
                } else if (index == 56) {
                    int resourceId = typedArrayObtainStyledAttributes.getResourceId(index, 0);
                    if (resourceId != 0) {
                        try {
                            f(resourceId);
                        } catch (Resources.NotFoundException unused) {
                            this.f9000B = null;
                        }
                    }
                } else if (index == 34) {
                    int resourceId2 = typedArrayObtainStyledAttributes.getResourceId(index, 0);
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
            typedArrayObtainStyledAttributes.recycle();
        }
        fVar.f17000H0 = this.f9015z;
        p136t.c.f16234p = fVar.X(512);
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
                    String[] strArrSplit = ((String) tag).split(",");
                    if (strArrSplit.length == 4) {
                        int i9 = Integer.parseInt(strArrSplit[0]);
                        int i10 = Integer.parseInt(strArrSplit[1]);
                        int i11 = Integer.parseInt(strArrSplit[2]);
                        int i12 = (int) ((i9 / 1080.0f) * width);
                        int i13 = (int) ((i10 / 1920.0f) * height);
                        int i14 = (int) ((Integer.parseInt(strArrSplit[3]) / 1920.0f) * height);
                        Paint paint = new Paint();
                        paint.setColor(-65536);
                        float f7 = i12;
                        float f8 = i13;
                        float f9 = i12 + ((int) ((i11 / 1080.0f) * width));
                        canvas.drawLine(f7, f8, f9, f8, paint);
                        float f10 = i13 + i14;
                        canvas.drawLine(f9, f8, f9, f10, paint);
                        canvas.drawLine(f9, f10, f7, f10, paint);
                        canvas.drawLine(f7, f10, f7, f8, paint);
                        paint.setColor(-16711936);
                        canvas.drawLine(f7, f8, f9, f10, paint);
                        canvas.drawLine(f7, f10, f9, f8, paint);
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
        int iResolveSizeAndState = View.resolveSizeAndState(i9 + dVar.f771d, i7, 0);
        int iResolveSizeAndState2 = View.resolveSizeAndState(i10 + i11, i8, 0) & 16777215;
        int iMin = Math.min(this.f9012f, iResolveSizeAndState & 16777215);
        int iMin2 = Math.min(this.f9013x, iResolveSizeAndState2);
        if (z4) {
            iMin |= 16777216;
        }
        if (z7) {
            iMin2 |= 16777216;
        }
        setMeasuredDimension(iMin, iMin2);
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
        return this.f9009c.f17000H0;
    }

    public String getSceneString() {
        int id;
        StringBuilder sb = new StringBuilder();
        f fVar = this.f9009c;
        if (fVar.j == null) {
            int id2 = getId();
            if (id2 != -1) {
                fVar.j = getContext().getResources().getResourceEntryName(id2);
            } else {
                fVar.j = "parent";
            }
        }
        if (fVar.f16968k0 == null) {
            fVar.f16968k0 = fVar.j;
            Log.v("ConstraintLayout", " setDebugName " + fVar.f16968k0);
        }
        for (e eVar : fVar.f17009u0) {
            View view = eVar.f16963h0;
            if (view != null) {
                if (eVar.j == null && (id = view.getId()) != -1) {
                    eVar.j = getContext().getResources().getResourceEntryName(id);
                }
                if (eVar.f16968k0 == null) {
                    eVar.f16968k0 = eVar.j;
                    Log.v("ConstraintLayout", " setDebugName " + eVar.f16968k0);
                }
            }
        }
        fVar.o(sb);
        return sb.toString();
    }

    /* JADX WARN: Code duplicated, block: B:100:0x01c8 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:105:0x01d0  */
    /* JADX WARN: Code duplicated, block: B:107:0x01ea  */
    /* JADX WARN: Code duplicated, block: B:109:0x01f0  */
    /* JADX WARN: Code duplicated, block: B:111:0x01fa  */
    /* JADX WARN: Code duplicated, block: B:113:0x01fd  */
    /* JADX WARN: Code duplicated, block: B:117:0x020c A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:195:0x03ab  */
    /* JADX WARN: Code duplicated, block: B:197:0x03c5  */
    /* JADX WARN: Code duplicated, block: B:200:0x03d1 A[LOOP:11: B:198:0x03cb->B:200:0x03d1, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:202:0x0414  */
    /* JADX WARN: Code duplicated, block: B:205:0x0432  */
    /* JADX WARN: Code duplicated, block: B:206:0x0439  */
    /* JADX WARN: Code duplicated, block: B:208:0x043d  */
    /* JADX WARN: Code duplicated, block: B:210:0x0447 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:211:0x0449  */
    /* JADX WARN: Code duplicated, block: B:212:0x044b  */
    /* JADX WARN: Code duplicated, block: B:214:0x044e  */
    /* JADX WARN: Code duplicated, block: B:215:0x0450  */
    /* JADX WARN: Code duplicated, block: B:217:0x0455  */
    /* JADX WARN: Code duplicated, block: B:219:0x0469  */
    /* JADX WARN: Code duplicated, block: B:223:0x0472  */
    /* JADX WARN: Code duplicated, block: B:225:0x0483  */
    /* JADX WARN: Code duplicated, block: B:227:0x048f  */
    /* JADX WARN: Code duplicated, block: B:228:0x0496  */
    /* JADX WARN: Code duplicated, block: B:246:0x04c5  */
    /* JADX WARN: Code duplicated, block: B:252:0x04d1  */
    /* JADX WARN: Code duplicated, block: B:254:0x04d4  */
    /* JADX WARN: Code duplicated, block: B:26:0x00af A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:275:0x0501 A[PHI: r15
      0x0501: PHI (r15v36 boolean) = (r15v35 boolean), (r15v35 boolean), (r15v35 boolean), (r15v39 boolean) binds: [B:253:0x04d2, B:255:0x04d8, B:257:0x04dc, B:273:0x04fe] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:27:0x00b1  */
    /* JADX WARN: Code duplicated, block: B:280:0x050d  */
    /* JADX WARN: Code duplicated, block: B:281:0x0510  */
    /* JADX WARN: Code duplicated, block: B:285:0x0529  */
    /* JADX WARN: Code duplicated, block: B:287:0x0531  */
    /* JADX WARN: Code duplicated, block: B:290:0x0538  */
    /* JADX WARN: Code duplicated, block: B:292:0x0553  */
    /* JADX WARN: Code duplicated, block: B:295:0x0563  */
    /* JADX WARN: Code duplicated, block: B:29:0x00b5  */
    /* JADX WARN: Code duplicated, block: B:300:0x057b  */
    /* JADX WARN: Code duplicated, block: B:302:0x057e A[LOOP:5: B:301:0x057c->B:302:0x057e, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:303:0x058a  */
    /* JADX WARN: Code duplicated, block: B:306:0x0599  */
    /* JADX WARN: Code duplicated, block: B:307:0x05a2  */
    /* JADX WARN: Code duplicated, block: B:309:0x05a9  */
    /* JADX WARN: Code duplicated, block: B:30:0x00bb  */
    /* JADX WARN: Code duplicated, block: B:311:0x05af  */
    /* JADX WARN: Code duplicated, block: B:313:0x05b2  */
    /* JADX WARN: Code duplicated, block: B:316:0x05b8  */
    /* JADX WARN: Code duplicated, block: B:317:0x05ba  */
    /* JADX WARN: Code duplicated, block: B:31:0x00c8 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:320:0x05d9  */
    /* JADX WARN: Code duplicated, block: B:322:0x05e5  */
    /* JADX WARN: Code duplicated, block: B:323:0x05eb  */
    /* JADX WARN: Code duplicated, block: B:325:0x060a  */
    /* JADX WARN: Code duplicated, block: B:327:0x060f  */
    /* JADX WARN: Code duplicated, block: B:32:0x00ca  */
    /* JADX WARN: Code duplicated, block: B:332:0x0631  */
    /* JADX WARN: Code duplicated, block: B:334:0x0636  */
    /* JADX WARN: Code duplicated, block: B:33:0x00d7  */
    /* JADX WARN: Code duplicated, block: B:342:0x0672  */
    /* JADX WARN: Code duplicated, block: B:344:0x0675  */
    /* JADX WARN: Code duplicated, block: B:346:0x067f  */
    /* JADX WARN: Code duplicated, block: B:350:0x0687  */
    /* JADX WARN: Code duplicated, block: B:356:0x0693 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:35:0x00dc  */
    /* JADX WARN: Code duplicated, block: B:364:0x06aa  */
    /* JADX WARN: Code duplicated, block: B:367:0x06c5  */
    /* JADX WARN: Code duplicated, block: B:370:0x06d7  */
    /* JADX WARN: Code duplicated, block: B:372:0x06dc  */
    /* JADX WARN: Code duplicated, block: B:375:0x06fb  */
    /* JADX WARN: Code duplicated, block: B:377:0x06fe  */
    /* JADX WARN: Code duplicated, block: B:379:0x0701  */
    /* JADX WARN: Code duplicated, block: B:37:0x00df  */
    /* JADX WARN: Code duplicated, block: B:381:0x0706  */
    /* JADX WARN: Code duplicated, block: B:384:0x0725  */
    /* JADX WARN: Code duplicated, block: B:386:0x0728  */
    /* JADX WARN: Code duplicated, block: B:389:0x072d  */
    /* JADX WARN: Code duplicated, block: B:38:0x00e6  */
    /* JADX WARN: Code duplicated, block: B:392:0x0733  */
    /* JADX WARN: Code duplicated, block: B:396:0x0749 A[LOOP:7: B:341:0x0670->B:396:0x0749, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:41:0x00f5  */
    /* JADX WARN: Code duplicated, block: B:431:0x0570 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:432:0x0570 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:437:0x075b A[EDGE_INSN: B:437:0x075b->B:397:0x075b BREAK  A[LOOP:7: B:341:0x0670->B:396:0x0749], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:45:0x00fe  */
    /* JADX WARN: Code duplicated, block: B:48:0x012a  */
    /* JADX WARN: Code duplicated, block: B:49:0x012d  */
    /* JADX WARN: Code duplicated, block: B:52:0x0134  */
    /* JADX WARN: Code duplicated, block: B:53:0x0137  */
    /* JADX WARN: Code duplicated, block: B:56:0x015c  */
    /* JADX WARN: Code duplicated, block: B:60:0x0165  */
    /* JADX WARN: Code duplicated, block: B:63:0x016a  */
    /* JADX WARN: Code duplicated, block: B:65:0x016d  */
    /* JADX WARN: Code duplicated, block: B:67:0x017d  */
    /* JADX WARN: Code duplicated, block: B:69:0x0181  */
    /* JADX WARN: Code duplicated, block: B:72:0x0187  */
    /* JADX WARN: Code duplicated, block: B:73:0x0189  */
    /* JADX WARN: Code duplicated, block: B:75:0x018c A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:79:0x0197  */
    /* JADX WARN: Code duplicated, block: B:82:0x019e A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:85:0x01a4  */
    /* JADX WARN: Code duplicated, block: B:99:0x01c6 A[ADDED_TO_REGION] */
    public final void h(f fVar, int i7, int i8, int i9) {
        int iMax;
        int iMax2;
        p149v.d dVar;
        p149v.d dVar2;
        int iR;
        a aVar;
        int i10;
        int i11;
        C1017n0 c1017n0;
        d dVar3;
        int size;
        int iR2;
        int iL;
        boolean zC;
        boolean z4;
        p149v.d dVar4;
        boolean z7;
        boolean z8;
        d dVar5;
        int i12;
        p149v.d dVar6;
        p149v.d dVar7;
        int i13;
        boolean zU;
        int i14;
        C1017n0 c1017n1;
        ArrayList arrayList;
        int size2;
        int i15;
        int i16;
        int i17;
        p149v.d[] dVarArr;
        int i18;
        int i19;
        int iMax3;
        int iMax4;
        int i20;
        int i21;
        d dVar8;
        int i22;
        int i23;
        int i24;
        d dVar9;
        ArrayList arrayList2;
        int i25;
        e eVar;
        int iR3;
        int iL2;
        ArrayList arrayList3;
        int i26;
        int i27;
        int iR4;
        d dVar10;
        int iL3;
        e eVar2;
        int iR5;
        int iL4;
        d dVar11;
        int iR6;
        int i28;
        int iL5;
        int size3;
        d dVar12;
        int i29;
        ConstraintLayout constraintLayout;
        int childCount;
        int i30;
        ArrayList arrayList4;
        int size4;
        int i31;
        View childAt;
        Placeholder placeholder;
        c cVar;
        e eVar3;
        e eVar4;
        e eVar5;
        e eVar6;
        p149v.d dVarK;
        p149v.d dVar13;
        boolean z9;
        C1017n0 c1017n2;
        j jVar;
        l lVar;
        int iMin;
        int iMin2;
        int i32;
        boolean z10;
        f fVar2;
        int i33;
        int i34;
        boolean z11;
        boolean z12;
        int i35;
        boolean z13;
        boolean z14;
        int i36;
        e eVar7;
        p149v.d[] dVarArr2;
        boolean z15;
        boolean z16;
        boolean z17;
        f fVar3 = fVar;
        int mode = View.MeasureSpec.getMode(i8);
        int size5 = View.MeasureSpec.getSize(i8);
        int mode2 = View.MeasureSpec.getMode(i9);
        int size6 = View.MeasureSpec.getSize(i9);
        int iMax5 = Math.max(0, getPaddingTop());
        int iMax6 = Math.max(0, getPaddingBottom());
        int i37 = iMax5 + iMax6;
        int paddingWidth = getPaddingWidth();
        d dVar14 = this.f9004F;
        dVar14.f769b = iMax5;
        dVar14.f770c = iMax6;
        dVar14.f771d = paddingWidth;
        dVar14.f772e = i37;
        dVar14.f773f = i8;
        dVar14.f774g = i9;
        int iMax7 = Math.max(0, getPaddingStart());
        int iMax8 = Math.max(0, getPaddingEnd());
        if (iMax7 <= 0 && iMax8 <= 0) {
            iMax7 = Math.max(0, getPaddingLeft());
        } else if (e()) {
            iMax7 = iMax8;
        }
        int i38 = size5 - paddingWidth;
        int i39 = size6 - i37;
        int i40 = dVar14.f772e;
        int i41 = dVar14.f771d;
        p149v.d dVar15 = p149v.d.f16918a;
        int childCount2 = getChildCount();
        dVar15 = p149v.d.f16919b;
        int i42 = Integer.MIN_VALUE;
        if (mode != Integer.MIN_VALUE) {
            if (mode == 0) {
                if (childCount2 == 0) {
                    iMax = Math.max(0, this.f9010d);
                } else {
                    iMax = 0;
                }
                i42 = Integer.MIN_VALUE;
            } else if (mode != 1073741824) {
                dVar15 = dVar15;
                iMax = 0;
            } else {
                iMax = Math.min(this.f9012f - i41, i38);
                dVar15 = dVar15;
            }
            if (mode2 != i42) {
                if (mode2 != 0) {
                    if (mode2 != 1073741824) {
                        dVar = dVar15;
                        dVar2 = dVar15;
                        iMax2 = 0;
                    } else {
                        iMax2 = Math.min(this.f9013x - i40, i39);
                        dVar2 = dVar15;
                        dVar = dVar15;
                    }
                } else if (childCount2 == 0) {
                    dVar = dVar15;
                    dVar2 = dVar;
                    iMax2 = Math.max(0, this.f9011e);
                } else {
                    iMax2 = 0;
                }
                iR = fVar.r();
                aVar = fVar3.f17011w0;
                if (iMax == iR || iMax2 != fVar.l()) {
                    aVar.f1618b = true;
                }
                fVar3.f16950a0 = 0;
                fVar3.f16952b0 = 0;
                int i43 = this.f9012f - i41;
                int[] iArr = fVar3.f16925C;
                iArr[0] = i43;
                iArr[1] = this.f9013x - i40;
                fVar3.f16955d0 = 0;
                fVar3.f16957e0 = 0;
                fVar3.N(dVar15);
                fVar3.P(iMax);
                fVar3.O(dVar);
                fVar3.M(iMax2);
                i10 = this.f9010d - i41;
                if (i10 < 0) {
                    fVar3.f16955d0 = 0;
                } else {
                    fVar3.f16955d0 = i10;
                }
                i11 = this.f9011e - i40;
                if (i11 < 0) {
                    fVar3.f16957e0 = 0;
                } else {
                    fVar3.f16957e0 = i11;
                }
                fVar3.f16994B0 = iMax7;
                fVar3.f16995C0 = iMax5;
                c1017n0 = fVar3.f17010v0;
                c1017n0.getClass();
                dVar3 = fVar3.f17013y0;
                size = fVar3.f17009u0.size();
                iR2 = fVar.r();
                iL = fVar.l();
                zC = k.c(i7, 128);
                if (!zC || k.c(i7, 64)) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                dVar4 = p149v.d.f16920c;
                if (z4) {
                    i36 = 0;
                    while (i36 < size) {
                        eVar7 = (e) fVar3.f17009u0.get(i36);
                        dVarArr2 = eVar7.f16943U;
                        if (dVarArr2[0] == dVar4) {
                            z15 = true;
                        } else {
                            z15 = false;
                        }
                        if (dVarArr2[1] == dVar4) {
                            z16 = true;
                        } else {
                            z16 = false;
                        }
                        if (z15 || !z16 || eVar7.f16947Y <= 0.0f) {
                            z17 = false;
                        } else {
                            z17 = true;
                        }
                        if ((!eVar7.y() && z17) || ((eVar7.z() && z17) || (eVar7 instanceof p149v.m) || eVar7.y() || eVar7.z())) {
                            z4 = false;
                            break;
                        }
                    }
                }
                z7 = z4 & ((mode != 1073741824 && mode2 == 1073741824) || zC);
                if (z7) {
                    iMin = Math.min(fVar3.f16925C[0], i38);
                    iMin2 = Math.min(fVar3.f16925C[1], i39);
                    if (mode == 1073741824) {
                        if (fVar.r() != iMin) {
                            fVar3.P(iMin);
                            fVar3.f17011w0.f1617a = true;
                        }
                        i32 = 1073741824;
                    } else {
                        i32 = 1073741824;
                    }
                    if (mode2 == i32 && fVar.l() != iMin2) {
                        fVar3.M(iMin2);
                        fVar3.f17011w0.f1617a = true;
                    }
                    if (mode == i32 || mode2 != i32) {
                        z8 = z7;
                        c1017n0 = c1017n0;
                        i12 = iR2;
                        dVar6 = dVar2;
                        dVar5 = dVar3;
                        iL = iL;
                        dVar7 = dVar15;
                        dVar4 = dVar4;
                        z10 = aVar.f1617a;
                        fVar2 = (f) aVar.f1619c;
                        if (z10) {
                            for (e eVar8 : fVar2.f17009u0) {
                                eVar8.i();
                                eVar8.f16949a = false;
                                j jVar2 = eVar8.f16954d;
                                jVar2.f17259e.j = false;
                                jVar2.f17261g = false;
                                jVar2.n();
                                l lVar2 = eVar8.f16956e;
                                lVar2.f17259e.j = false;
                                lVar2.f17261g = false;
                                lVar2.m();
                            }
                            i33 = 0;
                            fVar2.i();
                            fVar2.f16949a = false;
                            j jVar3 = fVar2.f16954d;
                            jVar3.f17259e.j = false;
                            jVar3.f17261g = false;
                            jVar3.n();
                            l lVar3 = fVar2.f16956e;
                            lVar3.f17259e.j = false;
                            lVar3.f17261g = false;
                            lVar3.m();
                            aVar.c();
                        } else {
                            i33 = 0;
                        }
                        aVar.b((f) aVar.f1620d);
                        fVar2.f16950a0 = i33;
                        fVar2.f16952b0 = i33;
                        fVar2.f16954d.f17262h.d(i33);
                        fVar2.f16956e.f17262h.d(i33);
                        i34 = 1073741824;
                        if (mode == 1073741824) {
                            zU = fVar3.U(i33, zC);
                            i13 = 1;
                        } else {
                            i13 = 0;
                            zU = true;
                        }
                        if (mode2 == 1073741824) {
                            zU &= fVar3.U(1, zC);
                            i13++;
                        }
                    } else {
                        boolean z18 = aVar.f1617a;
                        f fVar4 = (f) aVar.f1619c;
                        if (z18 || aVar.f1618b) {
                            for (e eVar9 : fVar4.f17009u0) {
                                eVar9.i();
                                eVar9.f16949a = false;
                                eVar9.f16954d.n();
                                eVar9.f16956e.m();
                            }
                            fVar4.i();
                            i35 = 0;
                            fVar4.f16949a = false;
                            fVar4.f16954d.n();
                            fVar4.f16956e.m();
                            aVar.f1618b = false;
                        } else {
                            i35 = 0;
                        }
                        aVar.b((f) aVar.f1620d);
                        fVar4.f16950a0 = i35;
                        fVar4.f16952b0 = i35;
                        p149v.d dVarK2 = fVar4.k(i35);
                        p149v.d dVarK3 = fVar4.k(1);
                        if (aVar.f1617a) {
                            aVar.c();
                        }
                        int iS = fVar4.s();
                        z8 = z7;
                        int iT = fVar4.t();
                        dVar5 = dVar3;
                        fVar4.f16954d.f17262h.d(iS);
                        fVar4.f16956e.f17262h.d(iT);
                        aVar.g();
                        ArrayList<n> arrayList5 = (ArrayList) aVar.f1621e;
                        i12 = iR2;
                        dVar6 = dVar2;
                        if (dVarK2 == dVar6 || dVarK3 == dVar6) {
                            if (zC) {
                                Iterator it = arrayList5.iterator();
                                while (it.hasNext()) {
                                    if (!((n) it.next()).k()) {
                                        zC = false;
                                        break;
                                    }
                                }
                            }
                            if (zC && dVarK2 == dVar6) {
                                dVar7 = dVar15;
                                fVar4.N(dVar7);
                                fVar4.P(aVar.d(fVar4, 0));
                                fVar4.f16954d.f17259e.d(fVar4.r());
                            } else {
                                dVar7 = dVar15;
                            }
                            if (zC && dVarK3 == dVar6) {
                                fVar4.O(dVar7);
                                fVar4.M(aVar.d(fVar4, 1));
                                fVar4.f16956e.f17259e.d(fVar4.l());
                            }
                        } else {
                            c1017n0 = c1017n0;
                            iL = iL;
                            dVar7 = dVar15;
                            dVar4 = dVar4;
                        }
                        p149v.d dVar16 = fVar4.f16943U[0];
                        p149v.d dVar17 = p149v.d.f16921d;
                        if (dVar16 == dVar7 || dVar16 == dVar17) {
                            int iR7 = fVar4.r() + iS;
                            fVar4.f16954d.f17263i.d(iR7);
                            fVar4.f16954d.f17259e.d(iR7 - iS);
                            aVar.g();
                            p149v.d dVar18 = fVar4.f16943U[1];
                            if (dVar18 == dVar7 || dVar18 == dVar17) {
                                int iL6 = fVar4.l() + iT;
                                fVar4.f16956e.f17263i.d(iL6);
                                fVar4.f16956e.f17259e.d(iL6 - iT);
                            }
                            aVar.g();
                            z13 = true;
                        } else {
                            z13 = false;
                        }
                        for (n nVar : arrayList5) {
                            if (nVar.f17256b != fVar4 || nVar.f17261g) {
                                nVar.e();
                            }
                        }
                        Iterator it2 = arrayList5.iterator();
                        while (true) {
                            if (!it2.hasNext()) {
                                z14 = true;
                                break;
                            }
                            n nVar2 = (n) it2.next();
                            if (z13 || nVar2.f17256b != fVar4) {
                                if (!nVar2.f17262h.j || ((!nVar2.f17263i.j && !(nVar2 instanceof h)) || (!nVar2.f17259e.j && !(nVar2 instanceof p154w.c) && !(nVar2 instanceof h)))) {
                                    z14 = false;
                                    break;
                                }
                            }
                        }
                        fVar4.N(dVarK2);
                        fVar4.O(dVarK3);
                        zU = z14;
                        i34 = 1073741824;
                        i13 = 2;
                    }
                    if (zU) {
                        if (mode == i34) {
                            z11 = true;
                        } else {
                            z11 = false;
                        }
                        if (mode2 == i34) {
                            z12 = true;
                        } else {
                            z12 = false;
                        }
                        fVar3.Q(z11, z12);
                    }
                } else {
                    z8 = z7;
                    c1017n0 = c1017n0;
                    dVar5 = dVar3;
                    i12 = iR2;
                    dVar6 = dVar2;
                    iL = iL;
                    dVar7 = dVar15;
                    dVar4 = dVar4;
                    i13 = 0;
                    zU = false;
                }
                if (zU || i13 != 2) {
                    i14 = fVar3.f17000H0;
                    if (size > 0) {
                        size3 = fVar3.f17009u0.size();
                        boolean zX = fVar3.X(64);
                        dVar12 = fVar3.f17013y0;
                        i29 = 0;
                        while (i29 < size3) {
                            eVar6 = (e) fVar3.f17009u0.get(i29);
                            if (!(eVar6 instanceof i) || (eVar6 instanceof p149v.a) || eVar6.f16929G || (zX && (jVar = eVar6.f16954d) != null && (lVar = eVar6.f16956e) != null && jVar.f17259e.j && lVar.f17259e.j)) {
                                dVar13 = dVar4;
                                c1017n2 = c1017n0;
                            } else {
                                dVarK = eVar6.k(0);
                                p149v.d dVarK4 = eVar6.k(1);
                                dVar13 = dVar4;
                                if (dVarK == dVar13 || eVar6.f16981r == 1 || dVarK4 != dVar13 || eVar6.f16983s == 1) {
                                    z9 = false;
                                } else {
                                    z9 = true;
                                }
                                if (z9 && fVar3.X(1) && !(eVar6 instanceof p149v.m)) {
                                    if (dVarK == dVar13 && eVar6.f16981r == 0 && dVarK4 != dVar13 && !eVar6.y()) {
                                        z9 = true;
                                    }
                                    if (dVarK4 == dVar13 && eVar6.f16983s == 0 && dVarK != dVar13 && !eVar6.y()) {
                                        z9 = true;
                                    }
                                    if (dVarK == dVar13 || dVarK4 == dVar13) {
                                        if (eVar6.f16947Y > 0.0f) {
                                            z9 = true;
                                        }
                                    }
                                }
                                if (z9) {
                                    c1017n2 = c1017n0;
                                } else {
                                    c1017n2 = c1017n0;
                                    c1017n2.D(0, dVar12, eVar6);
                                }
                            }
                            i29++;
                            c1017n0 = c1017n2;
                            dVar4 = dVar13;
                        }
                        c1017n1 = c1017n0;
                        constraintLayout = dVar12.f768a;
                        childCount = constraintLayout.getChildCount();
                        for (i30 = 0; i30 < childCount; i30++) {
                            childAt = constraintLayout.getChildAt(i30);
                            if (childAt instanceof Placeholder) {
                                placeholder = (Placeholder) childAt;
                                if (placeholder.f9019b == null) {
                                    c cVar2 = (c) placeholder.getLayoutParams();
                                    cVar = (c) placeholder.f9019b.getLayoutParams();
                                    eVar3 = cVar.f758q0;
                                    eVar3.f16965i0 = 0;
                                    eVar4 = cVar2.f758q0;
                                    if (eVar4.f16943U[0] != dVar7) {
                                        eVar4.P(eVar3.r());
                                    }
                                    eVar5 = cVar2.f758q0;
                                    if (eVar5.f16943U[1] != dVar7) {
                                        eVar5.M(cVar.f758q0.l());
                                    }
                                    cVar.f758q0.f16965i0 = 8;
                                }
                            }
                        }
                        arrayList4 = constraintLayout.f9008b;
                        size4 = arrayList4.size();
                        if (size4 > 0) {
                            for (i31 = 0; i31 < size4; i31++) {
                                ((ConstraintHelper) arrayList4.get(i31)).getClass();
                            }
                        }
                    } else {
                        c1017n1 = c1017n0;
                    }
                    c1017n1.L(fVar3);
                    arrayList = (ArrayList) c1017n1.f17811b;
                    size2 = arrayList.size();
                    if (size > 0) {
                        i15 = iL;
                        i16 = i12;
                        i17 = 0;
                        c1017n1.I(fVar3, 0, i16, i15);
                    } else {
                        i15 = iL;
                        i16 = i12;
                        i17 = 0;
                    }
                    if (size2 > 0) {
                        dVarArr = fVar3.f16943U;
                        if (dVarArr[i17] == dVar6) {
                            i18 = 1;
                        } else {
                            i18 = i17;
                        }
                        if (dVarArr[1] == dVar6) {
                            i19 = 1;
                        } else {
                            i19 = i17;
                        }
                        int iR8 = fVar.r();
                        f fVar5 = (f) c1017n1.f17813d;
                        iMax3 = Math.max(iR8, fVar5.f16955d0);
                        iMax4 = Math.max(fVar.l(), fVar5.f16957e0);
                        i20 = i17;
                        i21 = i20;
                        while (i20 < size2) {
                            eVar2 = (e) arrayList.get(i20);
                            if (eVar2 instanceof p149v.m) {
                                iR5 = eVar2.r();
                                iL4 = eVar2.l();
                                dVar11 = dVar5;
                                int i44 = i21 | (c1017n1.D(1, dVar11, eVar2) ? 1 : 0);
                                iR6 = eVar2.r();
                                i28 = i44;
                                iL5 = eVar2.l();
                                if (iR6 != iR5) {
                                    eVar2.P(iR6);
                                    if (i18 != 0 && eVar2.s() + eVar2.f16945W > iMax3) {
                                        iMax3 = Math.max(iMax3, eVar2.j(4).e() + eVar2.s() + eVar2.f16945W);
                                    }
                                    i28 = 1;
                                }
                                if (iL5 != iL4) {
                                    eVar2.M(iL5);
                                    if (i19 != 0 && eVar2.t() + eVar2.f16946X > iMax4) {
                                        iMax4 = Math.max(iMax4, eVar2.j(5).e() + eVar2.t() + eVar2.f16946X);
                                    }
                                    i28 = 1;
                                }
                                i21 = i28 | (((p149v.m) eVar2).f17066C0 ? 1 : 0);
                            } else {
                                dVar11 = dVar5;
                            }
                            i20++;
                            dVar5 = dVar11;
                            i14 = i14;
                        }
                        int i45 = i14;
                        dVar8 = dVar5;
                        i22 = 0;
                        i23 = 2;
                        while (i22 < i23) {
                            i24 = 0;
                            while (i24 < size2) {
                                eVar = (e) arrayList.get(i24);
                                if (((eVar instanceof p149v.j) || (eVar instanceof p149v.m)) && !(eVar instanceof i)) {
                                    if (eVar.f16965i0 == 8 && ((!z8 || !eVar.f16954d.f17259e.j || !eVar.f16956e.f17259e.j) && !(eVar instanceof p149v.m))) {
                                        iR3 = eVar.r();
                                        iL2 = eVar.l();
                                        arrayList3 = arrayList;
                                        int i46 = eVar.c0;
                                        i26 = size2;
                                        i27 = (c1017n1.D(i22 == 1 ? 2 : 1, dVar8, eVar) ? 1 : 0) | i21;
                                        iR4 = eVar.r();
                                        dVar10 = dVar8;
                                        iL3 = eVar.l();
                                        if (iR4 != iR3) {
                                            eVar.P(iR4);
                                            if (i18 == 0 && eVar.s() + eVar.f16945W > iMax3) {
                                                iMax3 = Math.max(iMax3, eVar.j(4).e() + eVar.s() + eVar.f16945W);
                                            }
                                            i27 = 1;
                                        }
                                        if (iL3 != iL2) {
                                            eVar.M(iL3);
                                            if (i19 == 0 && eVar.t() + eVar.f16946X > iMax4) {
                                                iMax4 = Math.max(iMax4, eVar.j(5).e() + eVar.t() + eVar.f16946X);
                                            }
                                            i27 = 1;
                                        }
                                        if (eVar.f16927E || i46 == eVar.c0) {
                                            i21 = i27;
                                        } else {
                                            i21 = 1;
                                        }
                                    }
                                    i24++;
                                    arrayList = arrayList3;
                                    size2 = i26;
                                    dVar8 = dVar10;
                                }
                                dVar10 = dVar8;
                                arrayList3 = arrayList;
                                i26 = size2;
                                i24++;
                                arrayList = arrayList3;
                                size2 = i26;
                                dVar8 = dVar10;
                            }
                            dVar9 = dVar8;
                            arrayList2 = arrayList;
                            i25 = size2;
                            if (i21 != 0) {
                                break;
                            }
                            i22++;
                            c1017n1.I(fVar, i22, i16, i15);
                            dVar8 = dVar9;
                            arrayList = arrayList2;
                            size2 = i25;
                            i23 = 2;
                            i21 = 0;
                        }
                        fVar3 = fVar;
                        i14 = i45;
                    }
                    fVar3.f17000H0 = i14;
                    p136t.c.f16234p = fVar3.X(512);
                }
                return;
            }
            if (childCount2 == 0) {
                iMax2 = Math.max(0, this.f9011e);
            } else {
                iMax2 = i39;
            }
            dVar = dVar15;
            dVar2 = dVar;
            iR = fVar.r();
            aVar = fVar3.f17011w0;
            if (iMax == iR) {
                aVar.f1618b = true;
            } else {
                aVar.f1618b = true;
            }
            fVar3.f16950a0 = 0;
            fVar3.f16952b0 = 0;
            int i47 = this.f9012f - i41;
            int[] iArr2 = fVar3.f16925C;
            iArr2[0] = i47;
            iArr2[1] = this.f9013x - i40;
            fVar3.f16955d0 = 0;
            fVar3.f16957e0 = 0;
            fVar3.N(dVar15);
            fVar3.P(iMax);
            fVar3.O(dVar);
            fVar3.M(iMax2);
            i10 = this.f9010d - i41;
            if (i10 < 0) {
                fVar3.f16955d0 = 0;
            } else {
                fVar3.f16955d0 = i10;
            }
            i11 = this.f9011e - i40;
            if (i11 < 0) {
                fVar3.f16957e0 = 0;
            } else {
                fVar3.f16957e0 = i11;
            }
            fVar3.f16994B0 = iMax7;
            fVar3.f16995C0 = iMax5;
            c1017n0 = fVar3.f17010v0;
            c1017n0.getClass();
            dVar3 = fVar3.f17013y0;
            size = fVar3.f17009u0.size();
            iR2 = fVar.r();
            iL = fVar.l();
            zC = k.c(i7, 128);
            if (zC) {
                z4 = true;
            } else {
                z4 = true;
            }
            dVar4 = p149v.d.f16920c;
            if (z4) {
                i36 = 0;
                while (i36 < size) {
                    eVar7 = (e) fVar3.f17009u0.get(i36);
                    dVarArr2 = eVar7.f16943U;
                    if (dVarArr2[0] == dVar4) {
                        z15 = true;
                    } else {
                        z15 = false;
                    }
                    if (dVarArr2[1] == dVar4) {
                        z16 = true;
                    } else {
                        z16 = false;
                    }
                    if (z15) {
                        z17 = false;
                    } else {
                        z17 = false;
                    }
                    i36 = !eVar7.y() ? i36 + 1 : i36 + 1;
                    z4 = false;
                    break;
                }
            }
            z7 = z4 & ((mode != 1073741824 && mode2 == 1073741824) || zC);
            if (z7) {
                iMin = Math.min(fVar3.f16925C[0], i38);
                iMin2 = Math.min(fVar3.f16925C[1], i39);
                if (mode == 1073741824) {
                    if (fVar.r() != iMin) {
                        fVar3.P(iMin);
                        fVar3.f17011w0.f1617a = true;
                    }
                    i32 = 1073741824;
                } else {
                    i32 = 1073741824;
                }
                if (mode2 == i32) {
                    fVar3.M(iMin2);
                    fVar3.f17011w0.f1617a = true;
                }
                if (mode == i32) {
                    z8 = z7;
                    c1017n0 = c1017n0;
                    i12 = iR2;
                    dVar6 = dVar2;
                    dVar5 = dVar3;
                    iL = iL;
                    dVar7 = dVar15;
                    dVar4 = dVar4;
                    z10 = aVar.f1617a;
                    fVar2 = (f) aVar.f1619c;
                    if (z10) {
                        while (r0.hasNext()) {
                            eVar8.i();
                            eVar8.f16949a = false;
                            j jVar4 = eVar8.f16954d;
                            jVar4.f17259e.j = false;
                            jVar4.f17261g = false;
                            jVar4.n();
                            l lVar4 = eVar8.f16956e;
                            lVar4.f17259e.j = false;
                            lVar4.f17261g = false;
                            lVar4.m();
                        }
                        i33 = 0;
                        fVar2.i();
                        fVar2.f16949a = false;
                        j jVar5 = fVar2.f16954d;
                        jVar5.f17259e.j = false;
                        jVar5.f17261g = false;
                        jVar5.n();
                        l lVar5 = fVar2.f16956e;
                        lVar5.f17259e.j = false;
                        lVar5.f17261g = false;
                        lVar5.m();
                        aVar.c();
                    } else {
                        i33 = 0;
                    }
                    aVar.b((f) aVar.f1620d);
                    fVar2.f16950a0 = i33;
                    fVar2.f16952b0 = i33;
                    fVar2.f16954d.f17262h.d(i33);
                    fVar2.f16956e.f17262h.d(i33);
                    i34 = 1073741824;
                    if (mode == 1073741824) {
                        zU = fVar3.U(i33, zC);
                        i13 = 1;
                    } else {
                        i13 = 0;
                        zU = true;
                    }
                    if (mode2 == 1073741824) {
                        zU &= fVar3.U(1, zC);
                        i13++;
                    }
                } else {
                    z8 = z7;
                    c1017n0 = c1017n0;
                    i12 = iR2;
                    dVar6 = dVar2;
                    dVar5 = dVar3;
                    iL = iL;
                    dVar7 = dVar15;
                    dVar4 = dVar4;
                    z10 = aVar.f1617a;
                    fVar2 = (f) aVar.f1619c;
                    if (z10) {
                        while (r0.hasNext()) {
                            eVar8.i();
                            eVar8.f16949a = false;
                            j jVar6 = eVar8.f16954d;
                            jVar6.f17259e.j = false;
                            jVar6.f17261g = false;
                            jVar6.n();
                            l lVar6 = eVar8.f16956e;
                            lVar6.f17259e.j = false;
                            lVar6.f17261g = false;
                            lVar6.m();
                        }
                        i33 = 0;
                        fVar2.i();
                        fVar2.f16949a = false;
                        j jVar7 = fVar2.f16954d;
                        jVar7.f17259e.j = false;
                        jVar7.f17261g = false;
                        jVar7.n();
                        l lVar7 = fVar2.f16956e;
                        lVar7.f17259e.j = false;
                        lVar7.f17261g = false;
                        lVar7.m();
                        aVar.c();
                    } else {
                        i33 = 0;
                    }
                    aVar.b((f) aVar.f1620d);
                    fVar2.f16950a0 = i33;
                    fVar2.f16952b0 = i33;
                    fVar2.f16954d.f17262h.d(i33);
                    fVar2.f16956e.f17262h.d(i33);
                    i34 = 1073741824;
                    if (mode == 1073741824) {
                        zU = fVar3.U(i33, zC);
                        i13 = 1;
                    } else {
                        i13 = 0;
                        zU = true;
                    }
                    if (mode2 == 1073741824) {
                        zU &= fVar3.U(1, zC);
                        i13++;
                    }
                }
                if (zU) {
                    if (mode == i34) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    if (mode2 == i34) {
                        z12 = true;
                    } else {
                        z12 = false;
                    }
                    fVar3.Q(z11, z12);
                }
            } else {
                z8 = z7;
                c1017n0 = c1017n0;
                dVar5 = dVar3;
                i12 = iR2;
                dVar6 = dVar2;
                iL = iL;
                dVar7 = dVar15;
                dVar4 = dVar4;
                i13 = 0;
                zU = false;
            }
            if (zU) {
            }
            i14 = fVar3.f17000H0;
            if (size > 0) {
                size3 = fVar3.f17009u0.size();
                boolean zX2 = fVar3.X(64);
                dVar12 = fVar3.f17013y0;
                i29 = 0;
                while (i29 < size3) {
                    eVar6 = (e) fVar3.f17009u0.get(i29);
                    if (!(eVar6 instanceof i)) {
                        dVar13 = dVar4;
                        c1017n2 = c1017n0;
                    } else {
                        dVarK = eVar6.k(0);
                        p149v.d dVarK5 = eVar6.k(1);
                        dVar13 = dVar4;
                        if (dVarK == dVar13) {
                            z9 = false;
                        } else {
                            z9 = false;
                        }
                        if (z9) {
                        }
                        if (z9) {
                            c1017n2 = c1017n0;
                        } else {
                            c1017n2 = c1017n0;
                            c1017n2.D(0, dVar12, eVar6);
                        }
                    }
                    i29++;
                    c1017n0 = c1017n2;
                    dVar4 = dVar13;
                }
                c1017n1 = c1017n0;
                constraintLayout = dVar12.f768a;
                childCount = constraintLayout.getChildCount();
                while (i30 < childCount) {
                    childAt = constraintLayout.getChildAt(i30);
                    if (childAt instanceof Placeholder) {
                        placeholder = (Placeholder) childAt;
                        if (placeholder.f9019b == null) {
                            c cVar3 = (c) placeholder.getLayoutParams();
                            cVar = (c) placeholder.f9019b.getLayoutParams();
                            eVar3 = cVar.f758q0;
                            eVar3.f16965i0 = 0;
                            eVar4 = cVar3.f758q0;
                            if (eVar4.f16943U[0] != dVar7) {
                                eVar4.P(eVar3.r());
                            }
                            eVar5 = cVar3.f758q0;
                            if (eVar5.f16943U[1] != dVar7) {
                                eVar5.M(cVar.f758q0.l());
                            }
                            cVar.f758q0.f16965i0 = 8;
                        }
                    }
                }
                arrayList4 = constraintLayout.f9008b;
                size4 = arrayList4.size();
                if (size4 > 0) {
                    while (i31 < size4) {
                        ((ConstraintHelper) arrayList4.get(i31)).getClass();
                    }
                }
            } else {
                c1017n1 = c1017n0;
            }
            c1017n1.L(fVar3);
            arrayList = (ArrayList) c1017n1.f17811b;
            size2 = arrayList.size();
            if (size > 0) {
                i15 = iL;
                i16 = i12;
                i17 = 0;
                c1017n1.I(fVar3, 0, i16, i15);
            } else {
                i15 = iL;
                i16 = i12;
                i17 = 0;
            }
            if (size2 > 0) {
                dVarArr = fVar3.f16943U;
                if (dVarArr[i17] == dVar6) {
                    i18 = 1;
                } else {
                    i18 = i17;
                }
                if (dVarArr[1] == dVar6) {
                    i19 = 1;
                } else {
                    i19 = i17;
                }
                int iR9 = fVar.r();
                f fVar6 = (f) c1017n1.f17813d;
                iMax3 = Math.max(iR9, fVar6.f16955d0);
                iMax4 = Math.max(fVar.l(), fVar6.f16957e0);
                i20 = i17;
                i21 = i20;
                while (i20 < size2) {
                    eVar2 = (e) arrayList.get(i20);
                    if (eVar2 instanceof p149v.m) {
                        dVar11 = dVar5;
                    } else {
                        iR5 = eVar2.r();
                        iL4 = eVar2.l();
                        dVar11 = dVar5;
                        int i48 = i21 | (c1017n1.D(1, dVar11, eVar2) ? 1 : 0);
                        iR6 = eVar2.r();
                        i28 = i48;
                        iL5 = eVar2.l();
                        if (iR6 != iR5) {
                            eVar2.P(iR6);
                            if (i18 != 0) {
                                iMax3 = Math.max(iMax3, eVar2.j(4).e() + eVar2.s() + eVar2.f16945W);
                            }
                            i28 = 1;
                        }
                        if (iL5 != iL4) {
                            eVar2.M(iL5);
                            if (i19 != 0) {
                                iMax4 = Math.max(iMax4, eVar2.j(5).e() + eVar2.t() + eVar2.f16946X);
                            }
                            i28 = 1;
                        }
                        i21 = i28 | (((p149v.m) eVar2).f17066C0 ? 1 : 0);
                    }
                    i20++;
                    dVar5 = dVar11;
                    i14 = i14;
                }
                int i49 = i14;
                dVar8 = dVar5;
                i22 = 0;
                i23 = 2;
                while (i22 < i23) {
                    i24 = 0;
                    while (i24 < size2) {
                        eVar = (e) arrayList.get(i24);
                        if (eVar instanceof p149v.j) {
                            if (eVar.f16965i0 == 8) {
                                dVar10 = dVar8;
                                arrayList3 = arrayList;
                                i26 = size2;
                            } else {
                                iR3 = eVar.r();
                                iL2 = eVar.l();
                                arrayList3 = arrayList;
                                int i410 = eVar.c0;
                                i26 = size2;
                                i27 = (c1017n1.D(i22 == 1 ? 2 : 1, dVar8, eVar) ? 1 : 0) | i21;
                                iR4 = eVar.r();
                                dVar10 = dVar8;
                                iL3 = eVar.l();
                                if (iR4 != iR3) {
                                    eVar.P(iR4);
                                    if (i18 == 0) {
                                    }
                                    i27 = 1;
                                }
                                if (iL3 != iL2) {
                                    eVar.M(iL3);
                                    if (i19 == 0) {
                                    }
                                    i27 = 1;
                                }
                                if (eVar.f16927E) {
                                    i21 = i27;
                                } else {
                                    i21 = i27;
                                }
                            }
                        } else if (eVar.f16965i0 == 8) {
                            dVar10 = dVar8;
                            arrayList3 = arrayList;
                            i26 = size2;
                        } else {
                            iR3 = eVar.r();
                            iL2 = eVar.l();
                            arrayList3 = arrayList;
                            int i411 = eVar.c0;
                            i26 = size2;
                            i27 = (c1017n1.D(i22 == 1 ? 2 : 1, dVar8, eVar) ? 1 : 0) | i21;
                            iR4 = eVar.r();
                            dVar10 = dVar8;
                            iL3 = eVar.l();
                            if (iR4 != iR3) {
                                eVar.P(iR4);
                                if (i18 == 0) {
                                }
                                i27 = 1;
                            }
                            if (iL3 != iL2) {
                                eVar.M(iL3);
                                if (i19 == 0) {
                                }
                                i27 = 1;
                            }
                            if (eVar.f16927E) {
                                i21 = i27;
                            } else {
                                i21 = i27;
                            }
                        }
                        i24++;
                        arrayList = arrayList3;
                        size2 = i26;
                        dVar8 = dVar10;
                    }
                    dVar9 = dVar8;
                    arrayList2 = arrayList;
                    i25 = size2;
                    if (i21 != 0) {
                        break;
                        break;
                    }
                    i22++;
                    c1017n1.I(fVar, i22, i16, i15);
                    dVar8 = dVar9;
                    arrayList = arrayList2;
                    size2 = i25;
                    i23 = 2;
                    i21 = 0;
                }
                fVar3 = fVar;
                i14 = i49;
            }
            fVar3.f17000H0 = i14;
            p136t.c.f16234p = fVar3.X(512);
        }
        iMax = childCount2 == 0 ? Math.max(0, this.f9010d) : i38;
        i42 = Integer.MIN_VALUE;
        if (mode2 != i42) {
            if (mode2 != 0) {
                if (mode2 != 1073741824) {
                    dVar = dVar15;
                    dVar2 = dVar15;
                    iMax2 = 0;
                } else {
                    iMax2 = Math.min(this.f9013x - i40, i39);
                    dVar2 = dVar15;
                    dVar = dVar15;
                }
            } else if (childCount2 == 0) {
                dVar = dVar15;
                dVar2 = dVar;
                iMax2 = Math.max(0, this.f9011e);
            } else {
                iMax2 = 0;
            }
            iR = fVar.r();
            aVar = fVar3.f17011w0;
            if (iMax == iR) {
                aVar.f1618b = true;
            } else {
                aVar.f1618b = true;
            }
            fVar3.f16950a0 = 0;
            fVar3.f16952b0 = 0;
            int i412 = this.f9012f - i41;
            int[] iArr3 = fVar3.f16925C;
            iArr3[0] = i412;
            iArr3[1] = this.f9013x - i40;
            fVar3.f16955d0 = 0;
            fVar3.f16957e0 = 0;
            fVar3.N(dVar15);
            fVar3.P(iMax);
            fVar3.O(dVar);
            fVar3.M(iMax2);
            i10 = this.f9010d - i41;
            if (i10 < 0) {
                fVar3.f16955d0 = 0;
            } else {
                fVar3.f16955d0 = i10;
            }
            i11 = this.f9011e - i40;
            if (i11 < 0) {
                fVar3.f16957e0 = 0;
            } else {
                fVar3.f16957e0 = i11;
            }
            fVar3.f16994B0 = iMax7;
            fVar3.f16995C0 = iMax5;
            c1017n0 = fVar3.f17010v0;
            c1017n0.getClass();
            dVar3 = fVar3.f17013y0;
            size = fVar3.f17009u0.size();
            iR2 = fVar.r();
            iL = fVar.l();
            zC = k.c(i7, 128);
            if (zC) {
                z4 = true;
            } else {
                z4 = true;
            }
            dVar4 = p149v.d.f16920c;
            if (z4) {
                i36 = 0;
                while (i36 < size) {
                    eVar7 = (e) fVar3.f17009u0.get(i36);
                    dVarArr2 = eVar7.f16943U;
                    if (dVarArr2[0] == dVar4) {
                        z15 = true;
                    } else {
                        z15 = false;
                    }
                    if (dVarArr2[1] == dVar4) {
                        z16 = true;
                    } else {
                        z16 = false;
                    }
                    if (z15) {
                        z17 = false;
                    } else {
                        z17 = false;
                    }
                    if (!eVar7.y()) {
                    }
                    z4 = false;
                    break;
                }
            }
            z7 = z4 & ((mode != 1073741824 && mode2 == 1073741824) || zC);
            if (z7) {
                iMin = Math.min(fVar3.f16925C[0], i38);
                iMin2 = Math.min(fVar3.f16925C[1], i39);
                if (mode == 1073741824) {
                    if (fVar.r() != iMin) {
                        fVar3.P(iMin);
                        fVar3.f17011w0.f1617a = true;
                    }
                    i32 = 1073741824;
                } else {
                    i32 = 1073741824;
                }
                if (mode2 == i32) {
                    fVar3.M(iMin2);
                    fVar3.f17011w0.f1617a = true;
                }
                if (mode == i32) {
                    z8 = z7;
                    c1017n0 = c1017n0;
                    i12 = iR2;
                    dVar6 = dVar2;
                    dVar5 = dVar3;
                    iL = iL;
                    dVar7 = dVar15;
                    dVar4 = dVar4;
                    z10 = aVar.f1617a;
                    fVar2 = (f) aVar.f1619c;
                    if (z10) {
                        while (r0.hasNext()) {
                            eVar8.i();
                            eVar8.f16949a = false;
                            j jVar8 = eVar8.f16954d;
                            jVar8.f17259e.j = false;
                            jVar8.f17261g = false;
                            jVar8.n();
                            l lVar8 = eVar8.f16956e;
                            lVar8.f17259e.j = false;
                            lVar8.f17261g = false;
                            lVar8.m();
                        }
                        i33 = 0;
                        fVar2.i();
                        fVar2.f16949a = false;
                        j jVar9 = fVar2.f16954d;
                        jVar9.f17259e.j = false;
                        jVar9.f17261g = false;
                        jVar9.n();
                        l lVar9 = fVar2.f16956e;
                        lVar9.f17259e.j = false;
                        lVar9.f17261g = false;
                        lVar9.m();
                        aVar.c();
                    } else {
                        i33 = 0;
                    }
                    aVar.b((f) aVar.f1620d);
                    fVar2.f16950a0 = i33;
                    fVar2.f16952b0 = i33;
                    fVar2.f16954d.f17262h.d(i33);
                    fVar2.f16956e.f17262h.d(i33);
                    i34 = 1073741824;
                    if (mode == 1073741824) {
                        zU = fVar3.U(i33, zC);
                        i13 = 1;
                    } else {
                        i13 = 0;
                        zU = true;
                    }
                    if (mode2 == 1073741824) {
                        zU &= fVar3.U(1, zC);
                        i13++;
                    }
                } else {
                    z8 = z7;
                    c1017n0 = c1017n0;
                    i12 = iR2;
                    dVar6 = dVar2;
                    dVar5 = dVar3;
                    iL = iL;
                    dVar7 = dVar15;
                    dVar4 = dVar4;
                    z10 = aVar.f1617a;
                    fVar2 = (f) aVar.f1619c;
                    if (z10) {
                        while (r0.hasNext()) {
                            eVar8.i();
                            eVar8.f16949a = false;
                            j jVar10 = eVar8.f16954d;
                            jVar10.f17259e.j = false;
                            jVar10.f17261g = false;
                            jVar10.n();
                            l lVar10 = eVar8.f16956e;
                            lVar10.f17259e.j = false;
                            lVar10.f17261g = false;
                            lVar10.m();
                        }
                        i33 = 0;
                        fVar2.i();
                        fVar2.f16949a = false;
                        j jVar11 = fVar2.f16954d;
                        jVar11.f17259e.j = false;
                        jVar11.f17261g = false;
                        jVar11.n();
                        l lVar11 = fVar2.f16956e;
                        lVar11.f17259e.j = false;
                        lVar11.f17261g = false;
                        lVar11.m();
                        aVar.c();
                    } else {
                        i33 = 0;
                    }
                    aVar.b((f) aVar.f1620d);
                    fVar2.f16950a0 = i33;
                    fVar2.f16952b0 = i33;
                    fVar2.f16954d.f17262h.d(i33);
                    fVar2.f16956e.f17262h.d(i33);
                    i34 = 1073741824;
                    if (mode == 1073741824) {
                        zU = fVar3.U(i33, zC);
                        i13 = 1;
                    } else {
                        i13 = 0;
                        zU = true;
                    }
                    if (mode2 == 1073741824) {
                        zU &= fVar3.U(1, zC);
                        i13++;
                    }
                }
                if (zU) {
                    if (mode == i34) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    if (mode2 == i34) {
                        z12 = true;
                    } else {
                        z12 = false;
                    }
                    fVar3.Q(z11, z12);
                }
            } else {
                z8 = z7;
                c1017n0 = c1017n0;
                dVar5 = dVar3;
                i12 = iR2;
                dVar6 = dVar2;
                iL = iL;
                dVar7 = dVar15;
                dVar4 = dVar4;
                i13 = 0;
                zU = false;
            }
            if (zU) {
            }
            i14 = fVar3.f17000H0;
            if (size > 0) {
                size3 = fVar3.f17009u0.size();
                boolean zX3 = fVar3.X(64);
                dVar12 = fVar3.f17013y0;
                i29 = 0;
                while (i29 < size3) {
                    eVar6 = (e) fVar3.f17009u0.get(i29);
                    if (!(eVar6 instanceof i)) {
                        dVar13 = dVar4;
                        c1017n2 = c1017n0;
                    } else {
                        dVarK = eVar6.k(0);
                        p149v.d dVarK6 = eVar6.k(1);
                        dVar13 = dVar4;
                        if (dVarK == dVar13) {
                            z9 = false;
                        } else {
                            z9 = false;
                        }
                        if (z9) {
                        }
                        if (z9) {
                            c1017n2 = c1017n0;
                        } else {
                            c1017n2 = c1017n0;
                            c1017n2.D(0, dVar12, eVar6);
                        }
                    }
                    i29++;
                    c1017n0 = c1017n2;
                    dVar4 = dVar13;
                }
                c1017n1 = c1017n0;
                constraintLayout = dVar12.f768a;
                childCount = constraintLayout.getChildCount();
                while (i30 < childCount) {
                    childAt = constraintLayout.getChildAt(i30);
                    if (childAt instanceof Placeholder) {
                        placeholder = (Placeholder) childAt;
                        if (placeholder.f9019b == null) {
                            c cVar4 = (c) placeholder.getLayoutParams();
                            cVar = (c) placeholder.f9019b.getLayoutParams();
                            eVar3 = cVar.f758q0;
                            eVar3.f16965i0 = 0;
                            eVar4 = cVar4.f758q0;
                            if (eVar4.f16943U[0] != dVar7) {
                                eVar4.P(eVar3.r());
                            }
                            eVar5 = cVar4.f758q0;
                            if (eVar5.f16943U[1] != dVar7) {
                                eVar5.M(cVar.f758q0.l());
                            }
                            cVar.f758q0.f16965i0 = 8;
                        }
                    }
                }
                arrayList4 = constraintLayout.f9008b;
                size4 = arrayList4.size();
                if (size4 > 0) {
                    while (i31 < size4) {
                        ((ConstraintHelper) arrayList4.get(i31)).getClass();
                    }
                }
            } else {
                c1017n1 = c1017n0;
            }
            c1017n1.L(fVar3);
            arrayList = (ArrayList) c1017n1.f17811b;
            size2 = arrayList.size();
            if (size > 0) {
                i15 = iL;
                i16 = i12;
                i17 = 0;
                c1017n1.I(fVar3, 0, i16, i15);
            } else {
                i15 = iL;
                i16 = i12;
                i17 = 0;
            }
            if (size2 > 0) {
                dVarArr = fVar3.f16943U;
                if (dVarArr[i17] == dVar6) {
                    i18 = 1;
                } else {
                    i18 = i17;
                }
                if (dVarArr[1] == dVar6) {
                    i19 = 1;
                } else {
                    i19 = i17;
                }
                int iR10 = fVar.r();
                f fVar7 = (f) c1017n1.f17813d;
                iMax3 = Math.max(iR10, fVar7.f16955d0);
                iMax4 = Math.max(fVar.l(), fVar7.f16957e0);
                i20 = i17;
                i21 = i20;
                while (i20 < size2) {
                    eVar2 = (e) arrayList.get(i20);
                    if (eVar2 instanceof p149v.m) {
                        dVar11 = dVar5;
                    } else {
                        iR5 = eVar2.r();
                        iL4 = eVar2.l();
                        dVar11 = dVar5;
                        int i413 = i21 | (c1017n1.D(1, dVar11, eVar2) ? 1 : 0);
                        iR6 = eVar2.r();
                        i28 = i413;
                        iL5 = eVar2.l();
                        if (iR6 != iR5) {
                            eVar2.P(iR6);
                            if (i18 != 0) {
                                iMax3 = Math.max(iMax3, eVar2.j(4).e() + eVar2.s() + eVar2.f16945W);
                            }
                            i28 = 1;
                        }
                        if (iL5 != iL4) {
                            eVar2.M(iL5);
                            if (i19 != 0) {
                                iMax4 = Math.max(iMax4, eVar2.j(5).e() + eVar2.t() + eVar2.f16946X);
                            }
                            i28 = 1;
                        }
                        i21 = i28 | (((p149v.m) eVar2).f17066C0 ? 1 : 0);
                    }
                    i20++;
                    dVar5 = dVar11;
                    i14 = i14;
                }
                int i414 = i14;
                dVar8 = dVar5;
                i22 = 0;
                i23 = 2;
                while (i22 < i23) {
                    i24 = 0;
                    while (i24 < size2) {
                        eVar = (e) arrayList.get(i24);
                        if (eVar instanceof p149v.j) {
                            if (eVar.f16965i0 == 8) {
                                dVar10 = dVar8;
                                arrayList3 = arrayList;
                                i26 = size2;
                            } else {
                                iR3 = eVar.r();
                                iL2 = eVar.l();
                                arrayList3 = arrayList;
                                int i415 = eVar.c0;
                                i26 = size2;
                                i27 = (c1017n1.D(i22 == 1 ? 2 : 1, dVar8, eVar) ? 1 : 0) | i21;
                                iR4 = eVar.r();
                                dVar10 = dVar8;
                                iL3 = eVar.l();
                                if (iR4 != iR3) {
                                    eVar.P(iR4);
                                    if (i18 == 0) {
                                    }
                                    i27 = 1;
                                }
                                if (iL3 != iL2) {
                                    eVar.M(iL3);
                                    if (i19 == 0) {
                                    }
                                    i27 = 1;
                                }
                                if (eVar.f16927E) {
                                    i21 = i27;
                                } else {
                                    i21 = i27;
                                }
                            }
                        } else if (eVar.f16965i0 == 8) {
                            dVar10 = dVar8;
                            arrayList3 = arrayList;
                            i26 = size2;
                        } else {
                            iR3 = eVar.r();
                            iL2 = eVar.l();
                            arrayList3 = arrayList;
                            int i416 = eVar.c0;
                            i26 = size2;
                            i27 = (c1017n1.D(i22 == 1 ? 2 : 1, dVar8, eVar) ? 1 : 0) | i21;
                            iR4 = eVar.r();
                            dVar10 = dVar8;
                            iL3 = eVar.l();
                            if (iR4 != iR3) {
                                eVar.P(iR4);
                                if (i18 == 0) {
                                }
                                i27 = 1;
                            }
                            if (iL3 != iL2) {
                                eVar.M(iL3);
                                if (i19 == 0) {
                                }
                                i27 = 1;
                            }
                            if (eVar.f16927E) {
                                i21 = i27;
                            } else {
                                i21 = i27;
                            }
                        }
                        i24++;
                        arrayList = arrayList3;
                        size2 = i26;
                        dVar8 = dVar10;
                    }
                    dVar9 = dVar8;
                    arrayList2 = arrayList;
                    i25 = size2;
                    if (i21 != 0) {
                        break;
                        break;
                    }
                    i22++;
                    c1017n1.I(fVar, i22, i16, i15);
                    dVar8 = dVar9;
                    arrayList = arrayList2;
                    size2 = i25;
                    i23 = 2;
                    i21 = 0;
                }
                fVar3 = fVar;
                i14 = i414;
            }
            fVar3.f17000H0 = i14;
            p136t.c.f16234p = fVar3.X(512);
        }
        if (childCount2 == 0) {
            iMax2 = Math.max(0, this.f9011e);
        } else {
            iMax2 = i39;
        }
        dVar = dVar15;
        dVar2 = dVar;
        iR = fVar.r();
        aVar = fVar3.f17011w0;
        if (iMax == iR) {
            aVar.f1618b = true;
        } else {
            aVar.f1618b = true;
        }
        fVar3.f16950a0 = 0;
        fVar3.f16952b0 = 0;
        int i417 = this.f9012f - i41;
        int[] iArr4 = fVar3.f16925C;
        iArr4[0] = i417;
        iArr4[1] = this.f9013x - i40;
        fVar3.f16955d0 = 0;
        fVar3.f16957e0 = 0;
        fVar3.N(dVar15);
        fVar3.P(iMax);
        fVar3.O(dVar);
        fVar3.M(iMax2);
        i10 = this.f9010d - i41;
        if (i10 < 0) {
            fVar3.f16955d0 = 0;
        } else {
            fVar3.f16955d0 = i10;
        }
        i11 = this.f9011e - i40;
        if (i11 < 0) {
            fVar3.f16957e0 = 0;
        } else {
            fVar3.f16957e0 = i11;
        }
        fVar3.f16994B0 = iMax7;
        fVar3.f16995C0 = iMax5;
        c1017n0 = fVar3.f17010v0;
        c1017n0.getClass();
        dVar3 = fVar3.f17013y0;
        size = fVar3.f17009u0.size();
        iR2 = fVar.r();
        iL = fVar.l();
        zC = k.c(i7, 128);
        if (zC) {
            z4 = true;
        } else {
            z4 = true;
        }
        dVar4 = p149v.d.f16920c;
        if (z4) {
            i36 = 0;
            while (i36 < size) {
                eVar7 = (e) fVar3.f17009u0.get(i36);
                dVarArr2 = eVar7.f16943U;
                if (dVarArr2[0] == dVar4) {
                    z15 = true;
                } else {
                    z15 = false;
                }
                if (dVarArr2[1] == dVar4) {
                    z16 = true;
                } else {
                    z16 = false;
                }
                if (z15) {
                    z17 = false;
                } else {
                    z17 = false;
                }
                if (!eVar7.y()) {
                }
                z4 = false;
                break;
            }
        }
        z7 = z4 & ((mode != 1073741824 && mode2 == 1073741824) || zC);
        if (z7) {
            iMin = Math.min(fVar3.f16925C[0], i38);
            iMin2 = Math.min(fVar3.f16925C[1], i39);
            if (mode == 1073741824) {
                if (fVar.r() != iMin) {
                    fVar3.P(iMin);
                    fVar3.f17011w0.f1617a = true;
                }
                i32 = 1073741824;
            } else {
                i32 = 1073741824;
            }
            if (mode2 == i32) {
                fVar3.M(iMin2);
                fVar3.f17011w0.f1617a = true;
            }
            if (mode == i32) {
                z8 = z7;
                c1017n0 = c1017n0;
                i12 = iR2;
                dVar6 = dVar2;
                dVar5 = dVar3;
                iL = iL;
                dVar7 = dVar15;
                dVar4 = dVar4;
                z10 = aVar.f1617a;
                fVar2 = (f) aVar.f1619c;
                if (z10) {
                    while (r0.hasNext()) {
                        eVar8.i();
                        eVar8.f16949a = false;
                        j jVar12 = eVar8.f16954d;
                        jVar12.f17259e.j = false;
                        jVar12.f17261g = false;
                        jVar12.n();
                        l lVar12 = eVar8.f16956e;
                        lVar12.f17259e.j = false;
                        lVar12.f17261g = false;
                        lVar12.m();
                    }
                    i33 = 0;
                    fVar2.i();
                    fVar2.f16949a = false;
                    j jVar13 = fVar2.f16954d;
                    jVar13.f17259e.j = false;
                    jVar13.f17261g = false;
                    jVar13.n();
                    l lVar13 = fVar2.f16956e;
                    lVar13.f17259e.j = false;
                    lVar13.f17261g = false;
                    lVar13.m();
                    aVar.c();
                } else {
                    i33 = 0;
                }
                aVar.b((f) aVar.f1620d);
                fVar2.f16950a0 = i33;
                fVar2.f16952b0 = i33;
                fVar2.f16954d.f17262h.d(i33);
                fVar2.f16956e.f17262h.d(i33);
                i34 = 1073741824;
                if (mode == 1073741824) {
                    zU = fVar3.U(i33, zC);
                    i13 = 1;
                } else {
                    i13 = 0;
                    zU = true;
                }
                if (mode2 == 1073741824) {
                    zU &= fVar3.U(1, zC);
                    i13++;
                }
            } else {
                z8 = z7;
                c1017n0 = c1017n0;
                i12 = iR2;
                dVar6 = dVar2;
                dVar5 = dVar3;
                iL = iL;
                dVar7 = dVar15;
                dVar4 = dVar4;
                z10 = aVar.f1617a;
                fVar2 = (f) aVar.f1619c;
                if (z10) {
                    while (r0.hasNext()) {
                        eVar8.i();
                        eVar8.f16949a = false;
                        j jVar14 = eVar8.f16954d;
                        jVar14.f17259e.j = false;
                        jVar14.f17261g = false;
                        jVar14.n();
                        l lVar14 = eVar8.f16956e;
                        lVar14.f17259e.j = false;
                        lVar14.f17261g = false;
                        lVar14.m();
                    }
                    i33 = 0;
                    fVar2.i();
                    fVar2.f16949a = false;
                    j jVar15 = fVar2.f16954d;
                    jVar15.f17259e.j = false;
                    jVar15.f17261g = false;
                    jVar15.n();
                    l lVar15 = fVar2.f16956e;
                    lVar15.f17259e.j = false;
                    lVar15.f17261g = false;
                    lVar15.m();
                    aVar.c();
                } else {
                    i33 = 0;
                }
                aVar.b((f) aVar.f1620d);
                fVar2.f16950a0 = i33;
                fVar2.f16952b0 = i33;
                fVar2.f16954d.f17262h.d(i33);
                fVar2.f16956e.f17262h.d(i33);
                i34 = 1073741824;
                if (mode == 1073741824) {
                    zU = fVar3.U(i33, zC);
                    i13 = 1;
                } else {
                    i13 = 0;
                    zU = true;
                }
                if (mode2 == 1073741824) {
                    zU &= fVar3.U(1, zC);
                    i13++;
                }
            }
            if (zU) {
                if (mode == i34) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                if (mode2 == i34) {
                    z12 = true;
                } else {
                    z12 = false;
                }
                fVar3.Q(z11, z12);
            }
        } else {
            z8 = z7;
            c1017n0 = c1017n0;
            dVar5 = dVar3;
            i12 = iR2;
            dVar6 = dVar2;
            iL = iL;
            dVar7 = dVar15;
            dVar4 = dVar4;
            i13 = 0;
            zU = false;
        }
        if (zU) {
        }
        i14 = fVar3.f17000H0;
        if (size > 0) {
            size3 = fVar3.f17009u0.size();
            boolean zX4 = fVar3.X(64);
            dVar12 = fVar3.f17013y0;
            i29 = 0;
            while (i29 < size3) {
                eVar6 = (e) fVar3.f17009u0.get(i29);
                if (!(eVar6 instanceof i)) {
                    dVar13 = dVar4;
                    c1017n2 = c1017n0;
                } else {
                    dVarK = eVar6.k(0);
                    p149v.d dVarK7 = eVar6.k(1);
                    dVar13 = dVar4;
                    if (dVarK == dVar13) {
                        z9 = false;
                    } else {
                        z9 = false;
                    }
                    if (z9) {
                    }
                    if (z9) {
                        c1017n2 = c1017n0;
                    } else {
                        c1017n2 = c1017n0;
                        c1017n2.D(0, dVar12, eVar6);
                    }
                }
                i29++;
                c1017n0 = c1017n2;
                dVar4 = dVar13;
            }
            c1017n1 = c1017n0;
            constraintLayout = dVar12.f768a;
            childCount = constraintLayout.getChildCount();
            while (i30 < childCount) {
                childAt = constraintLayout.getChildAt(i30);
                if (childAt instanceof Placeholder) {
                    placeholder = (Placeholder) childAt;
                    if (placeholder.f9019b == null) {
                        c cVar5 = (c) placeholder.getLayoutParams();
                        cVar = (c) placeholder.f9019b.getLayoutParams();
                        eVar3 = cVar.f758q0;
                        eVar3.f16965i0 = 0;
                        eVar4 = cVar5.f758q0;
                        if (eVar4.f16943U[0] != dVar7) {
                            eVar4.P(eVar3.r());
                        }
                        eVar5 = cVar5.f758q0;
                        if (eVar5.f16943U[1] != dVar7) {
                            eVar5.M(cVar.f758q0.l());
                        }
                        cVar.f758q0.f16965i0 = 8;
                    }
                }
            }
            arrayList4 = constraintLayout.f9008b;
            size4 = arrayList4.size();
            if (size4 > 0) {
                while (i31 < size4) {
                    ((ConstraintHelper) arrayList4.get(i31)).getClass();
                }
            }
        } else {
            c1017n1 = c1017n0;
        }
        c1017n1.L(fVar3);
        arrayList = (ArrayList) c1017n1.f17811b;
        size2 = arrayList.size();
        if (size > 0) {
            i15 = iL;
            i16 = i12;
            i17 = 0;
            c1017n1.I(fVar3, 0, i16, i15);
        } else {
            i15 = iL;
            i16 = i12;
            i17 = 0;
        }
        if (size2 > 0) {
            dVarArr = fVar3.f16943U;
            if (dVarArr[i17] == dVar6) {
                i18 = 1;
            } else {
                i18 = i17;
            }
            if (dVarArr[1] == dVar6) {
                i19 = 1;
            } else {
                i19 = i17;
            }
            int iR11 = fVar.r();
            f fVar8 = (f) c1017n1.f17813d;
            iMax3 = Math.max(iR11, fVar8.f16955d0);
            iMax4 = Math.max(fVar.l(), fVar8.f16957e0);
            i20 = i17;
            i21 = i20;
            while (i20 < size2) {
                eVar2 = (e) arrayList.get(i20);
                if (eVar2 instanceof p149v.m) {
                    dVar11 = dVar5;
                } else {
                    iR5 = eVar2.r();
                    iL4 = eVar2.l();
                    dVar11 = dVar5;
                    int i418 = i21 | (c1017n1.D(1, dVar11, eVar2) ? 1 : 0);
                    iR6 = eVar2.r();
                    i28 = i418;
                    iL5 = eVar2.l();
                    if (iR6 != iR5) {
                        eVar2.P(iR6);
                        if (i18 != 0) {
                            iMax3 = Math.max(iMax3, eVar2.j(4).e() + eVar2.s() + eVar2.f16945W);
                        }
                        i28 = 1;
                    }
                    if (iL5 != iL4) {
                        eVar2.M(iL5);
                        if (i19 != 0) {
                            iMax4 = Math.max(iMax4, eVar2.j(5).e() + eVar2.t() + eVar2.f16946X);
                        }
                        i28 = 1;
                    }
                    i21 = i28 | (((p149v.m) eVar2).f17066C0 ? 1 : 0);
                }
                i20++;
                dVar5 = dVar11;
                i14 = i14;
            }
            int i419 = i14;
            dVar8 = dVar5;
            i22 = 0;
            i23 = 2;
            while (i22 < i23) {
                i24 = 0;
                while (i24 < size2) {
                    eVar = (e) arrayList.get(i24);
                    if (eVar instanceof p149v.j) {
                        if (eVar.f16965i0 == 8) {
                            dVar10 = dVar8;
                            arrayList3 = arrayList;
                            i26 = size2;
                        } else {
                            iR3 = eVar.r();
                            iL2 = eVar.l();
                            arrayList3 = arrayList;
                            int i4110 = eVar.c0;
                            i26 = size2;
                            i27 = (c1017n1.D(i22 == 1 ? 2 : 1, dVar8, eVar) ? 1 : 0) | i21;
                            iR4 = eVar.r();
                            dVar10 = dVar8;
                            iL3 = eVar.l();
                            if (iR4 != iR3) {
                                eVar.P(iR4);
                                if (i18 == 0) {
                                }
                                i27 = 1;
                            }
                            if (iL3 != iL2) {
                                eVar.M(iL3);
                                if (i19 == 0) {
                                }
                                i27 = 1;
                            }
                            if (eVar.f16927E) {
                                i21 = i27;
                            } else {
                                i21 = i27;
                            }
                        }
                    } else if (eVar.f16965i0 == 8) {
                        dVar10 = dVar8;
                        arrayList3 = arrayList;
                        i26 = size2;
                    } else {
                        iR3 = eVar.r();
                        iL2 = eVar.l();
                        arrayList3 = arrayList;
                        int i4111 = eVar.c0;
                        i26 = size2;
                        i27 = (c1017n1.D(i22 == 1 ? 2 : 1, dVar8, eVar) ? 1 : 0) | i21;
                        iR4 = eVar.r();
                        dVar10 = dVar8;
                        iL3 = eVar.l();
                        if (iR4 != iR3) {
                            eVar.P(iR4);
                            if (i18 == 0) {
                            }
                            i27 = 1;
                        }
                        if (iL3 != iL2) {
                            eVar.M(iL3);
                            if (i19 == 0) {
                            }
                            i27 = 1;
                        }
                        if (eVar.f16927E) {
                            i21 = i27;
                        } else {
                            i21 = i27;
                        }
                    }
                    i24++;
                    arrayList = arrayList3;
                    size2 = i26;
                    dVar8 = dVar10;
                }
                dVar9 = dVar8;
                arrayList2 = arrayList;
                i25 = size2;
                if (i21 != 0) {
                    break;
                    break;
                }
                i22++;
                c1017n1.I(fVar, i22, i16, i15);
                dVar8 = dVar9;
                arrayList = arrayList2;
                size2 = i25;
                i23 = 2;
                i21 = 0;
            }
            fVar3 = fVar;
            i14 = i419;
        }
        fVar3.f17000H0 = i14;
        p136t.c.f16234p = fVar3.X(512);
    }

    public final void i(e eVar, c cVar, SparseArray sparseArray, int i7, int i8) {
        View view = (View) this.f9007a.get(i7);
        e eVar2 = (e) sparseArray.get(i7);
        if (eVar2 == null || view == null || !(view.getLayoutParams() instanceof c)) {
            return;
        }
        cVar.c0 = true;
        if (i8 == 6) {
            c cVar2 = (c) view.getLayoutParams();
            cVar2.c0 = true;
            cVar2.f758q0.f16927E = true;
        }
        eVar.j(6).b(eVar2.j(i8), cVar.f704D, cVar.f703C, true);
        eVar.f16927E = true;
        eVar.j(3).j();
        eVar.j(5).j();
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onLayout(boolean z4, int i7, int i8, int i9, int i10) {
        View content;
        int childCount = getChildCount();
        boolean zIsInEditMode = isInEditMode();
        for (int i11 = 0; i11 < childCount; i11++) {
            View childAt = getChildAt(i11);
            c cVar = (c) childAt.getLayoutParams();
            e eVar = cVar.f758q0;
            if ((childAt.getVisibility() != 8 || cVar.f733d0 || cVar.f735e0 || zIsInEditMode) && !cVar.f737f0) {
                int iS = eVar.s();
                int iT = eVar.t();
                int iR = eVar.r() + iS;
                int iL = eVar.l() + iT;
                childAt.layout(iS, iT, iR, iL);
                if ((childAt instanceof Placeholder) && (content = ((Placeholder) childAt).getContent()) != null) {
                    content.setVisibility(0);
                    content.layout(iS, iT, iR, iL);
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
        e eVar;
        if (this.f9005G == i7) {
            int i9 = this.f9006H;
        }
        int i10 = 0;
        if (!this.f9014y) {
            int childCount = getChildCount();
            for (int i11 = 0; i11 < childCount; i11++) {
                if (getChildAt(i11).isLayoutRequested()) {
                    this.f9014y = true;
                    break;
                }
            }
        }
        this.f9005G = i7;
        this.f9006H = i8;
        boolean zE = e();
        f fVar = this.f9009c;
        fVar.f17014z0 = zE;
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
                boolean zIsInEditMode = isInEditMode();
                int childCount3 = getChildCount();
                for (int i13 = 0; i13 < childCount3; i13++) {
                    e eVarC = c(getChildAt(i13));
                    if (eVarC != null) {
                        eVarC.D();
                    }
                }
                Object obj = null;
                if (zIsInEditMode) {
                    for (int i14 = 0; i14 < childCount3; i14++) {
                        View childAt = getChildAt(i14);
                        try {
                            String resourceName = getResources().getResourceName(childAt.getId());
                            Integer numValueOf = Integer.valueOf(childAt.getId());
                            if (resourceName != null) {
                                if (this.f9002D == null) {
                                    this.f9002D = new HashMap();
                                }
                                int iIndexOf = resourceName.indexOf("/");
                                this.f9002D.put(iIndexOf != -1 ? resourceName.substring(iIndexOf + 1) : resourceName, numValueOf);
                            }
                            int iIndexOf2 = resourceName.indexOf(47);
                            if (iIndexOf2 != -1) {
                                resourceName = resourceName.substring(iIndexOf2 + 1);
                            }
                            int id = childAt.getId();
                            if (id != 0) {
                                View viewFindViewById = (View) this.f9007a.get(id);
                                if (viewFindViewById == null && (viewFindViewById = findViewById(id)) != null && viewFindViewById != this && viewFindViewById.getParent() == this) {
                                    onViewAdded(viewFindViewById);
                                }
                                eVar = viewFindViewById == this ? fVar : viewFindViewById == null ? null : ((c) viewFindViewById.getLayoutParams()).f758q0;
                            }
                            eVar.f16968k0 = resourceName;
                        } catch (Resources.NotFoundException unused) {
                        }
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
                fVar.f17009u0.clear();
                ArrayList arrayList = this.f9008b;
                int size = arrayList.size();
                if (size > 0) {
                    int i16 = 0;
                    while (i16 < size) {
                        ConstraintHelper constraintHelper = (ConstraintHelper) arrayList.get(i16);
                        if (constraintHelper.isInEditMode()) {
                            constraintHelper.setIds(constraintHelper.f8994e);
                        }
                        p149v.j jVar = constraintHelper.f8993d;
                        if (jVar != null) {
                            jVar.f17062v0 = i10;
                            Arrays.fill(jVar.f17061u0, obj);
                            for (int i17 = i10; i17 < constraintHelper.f8991b; i17++) {
                                int i18 = constraintHelper.f8990a[i17];
                                View viewB = b(i18);
                                if (viewB == null) {
                                    Integer numValueOf2 = Integer.valueOf(i18);
                                    HashMap map = constraintHelper.f8997y;
                                    String str = (String) map.get(numValueOf2);
                                    int iH = constraintHelper.h(this, str);
                                    if (iH != 0) {
                                        constraintHelper.f8990a[i17] = iH;
                                        map.put(Integer.valueOf(iH), str);
                                        viewB = b(iH);
                                    }
                                }
                                View view = viewB;
                                if (view != null) {
                                    constraintHelper.f8993d.S(c(view));
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
                        View viewFindViewById2 = findViewById(placeholder.f9018a);
                        placeholder.f9019b = viewFindViewById2;
                        if (viewFindViewById2 != null) {
                            ((c) viewFindViewById2.getLayoutParams()).f737f0 = true;
                            placeholder.f9019b.setVisibility(0);
                            placeholder.setVisibility(0);
                        }
                    }
                }
                SparseArray sparseArray = this.f9003E;
                sparseArray.clear();
                sparseArray.put(0, fVar);
                sparseArray.put(getId(), fVar);
                for (int i20 = 0; i20 < childCount3; i20++) {
                    View childAt4 = getChildAt(i20);
                    sparseArray.put(childAt4.getId(), c(childAt4));
                }
                for (int i21 = 0; i21 < childCount3; i21++) {
                    View childAt5 = getChildAt(i21);
                    e eVarC2 = c(childAt5);
                    if (eVarC2 != null) {
                        c cVar = (c) childAt5.getLayoutParams();
                        fVar.f17009u0.add(eVarC2);
                        e eVar2 = eVarC2.f16944V;
                        if (eVar2 != null) {
                            ((f) eVar2).f17009u0.remove(eVarC2);
                            eVarC2.D();
                        }
                        eVarC2.f16944V = fVar;
                        a(zIsInEditMode, childAt5, eVarC2, cVar, sparseArray);
                    }
                }
            }
            if (z4) {
                fVar.f17010v0.L(fVar);
            }
        }
        h(fVar, this.f9015z, i7, i8);
        g(i7, i8, fVar.r(), fVar.f17001I0, fVar.f17002J0, fVar.l());
    }

    @Override // android.view.ViewGroup
    public void onViewAdded(View view) {
        super.onViewAdded(view);
        e eVarC = c(view);
        if ((view instanceof Guideline) && !(eVarC instanceof i)) {
            c cVar = (c) view.getLayoutParams();
            i iVar = new i();
            cVar.f758q0 = iVar;
            cVar.f733d0 = true;
            iVar.T(cVar.f722V);
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
        e eVarC = c(view);
        this.f9009c.f17009u0.remove(eVarC);
        eVarC.D();
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
        f fVar = this.f9009c;
        fVar.f17000H0 = i7;
        p136t.c.f16234p = fVar.X(512);
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
        this.f9009c = new f();
        this.f9010d = 0;
        this.f9011e = 0;
        this.f9012f = com.google.android.gms.common.api.f.API_PRIORITY_OTHER;
        this.f9013x = com.google.android.gms.common.api.f.API_PRIORITY_OTHER;
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
