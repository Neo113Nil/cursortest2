package androidx.constraintlayout.widget;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.util.SparseIntArray;
import android.view.View;
import android.view.ViewGroup;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import org.xmlpull.v1.XmlPullParserException;
import p000.AbstractC0024an;
import p000.AbstractC0216fm;
import p000.AbstractC0659rl;
import p000.AbstractC0696sl;
import p000.C0023am;
import p000.C0067bm;
import p000.C0103cm;
import p000.C0143dm;
import p000.C0168eb;
import p000.C0179em;
import p000.C0205fb;
import p000.C0312i6;
import p000.C0392kd;
import p000.C0561oy;
import p000.C0579pf;
import p000.C0592ps;
import p000.C0616qf;
import p000.C0622ql;
import p000.C0733tl;
import p000.C0770ul;
import p000.C0807vl;
import p000.C0834wb;
import p000.C0881xl;
import p000.C0918yl;
import p000.a90;
import p000.bj1;
import p000.da0;
import p000.ea0;
import p000.fa0;
import p000.gb0;
import p000.gi0;
import p000.iz0;
import p000.mh1;
import p000.qd0;
import p000.s71;

/* JADX INFO: compiled from: r8-map-id-738170b7fb69b873ed7524d5270c8e05c6f5fb40ea1ade7a72c8ed7a70699269 */
/* JADX INFO: loaded from: classes.dex */
public class ConstraintLayout extends ViewGroup {

    /* JADX INFO: renamed from: y */
    public static s71 f465y;

    /* JADX INFO: renamed from: j */
    public final SparseArray f466j;

    /* JADX INFO: renamed from: k */
    public final ArrayList f467k;

    /* JADX INFO: renamed from: l */
    public final C0179em f468l;

    /* JADX INFO: renamed from: m */
    public int f469m;

    /* JADX INFO: renamed from: n */
    public int f470n;

    /* JADX INFO: renamed from: o */
    public int f471o;

    /* JADX INFO: renamed from: p */
    public int f472p;

    /* JADX INFO: renamed from: q */
    public boolean f473q;

    /* JADX INFO: renamed from: r */
    public int f474r;

    /* JADX INFO: renamed from: s */
    public C0103cm f475s;

    /* JADX INFO: renamed from: t */
    public C0312i6 f476t;

    /* JADX INFO: renamed from: u */
    public final int f477u;

    /* JADX INFO: renamed from: v */
    public HashMap f478v;

    /* JADX INFO: renamed from: w */
    public final SparseArray f479w;

    /* JADX INFO: renamed from: x */
    public final C0770ul f480x;

    public ConstraintLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        SparseArray sparseArray = new SparseArray();
        this.f466j = sparseArray;
        this.f467k = new ArrayList(4);
        C0179em c0179em = new C0179em();
        c0179em.f2132p0 = new ArrayList();
        c0179em.f2133q0 = new qd0(c0179em);
        C0592ps c0592ps = new C0592ps();
        c0592ps.f6236b = true;
        c0592ps.f6237c = true;
        c0592ps.f6239e = new ArrayList();
        new ArrayList();
        c0592ps.f6240f = null;
        c0592ps.f6241g = new C0834wb();
        c0592ps.f6242h = new ArrayList();
        c0592ps.f6235a = c0179em;
        c0592ps.f6238d = c0179em;
        c0179em.f2134r0 = c0592ps;
        c0179em.f2136t0 = null;
        c0179em.f2137u0 = false;
        c0179em.f2138v0 = new gi0();
        c0179em.f2141y0 = 0;
        c0179em.f2142z0 = 0;
        c0179em.f2121A0 = new C0579pf[4];
        c0179em.f2122B0 = new C0579pf[4];
        c0179em.f2123C0 = 257;
        c0179em.f2124D0 = false;
        c0179em.f2125E0 = false;
        c0179em.f2126F0 = null;
        c0179em.f2127G0 = null;
        c0179em.f2128H0 = null;
        c0179em.f2129I0 = null;
        c0179em.f2130J0 = new HashSet();
        c0179em.f2131K0 = new C0834wb();
        this.f468l = c0179em;
        this.f469m = 0;
        this.f470n = 0;
        this.f471o = Integer.MAX_VALUE;
        this.f472p = Integer.MAX_VALUE;
        this.f473q = true;
        this.f474r = 257;
        this.f475s = null;
        this.f476t = null;
        this.f477u = -1;
        this.f478v = new HashMap();
        this.f479w = new SparseArray();
        C0770ul c0770ul = new C0770ul(this, this);
        this.f480x = c0770ul;
        c0179em.f1716e0 = this;
        c0179em.f2136t0 = c0770ul;
        c0592ps.f6240f = c0770ul;
        sparseArray.put(getId(), this);
        this.f475s = null;
        if (attributeSet != null) {
            TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, iz0.f3751b, 0, 0);
            int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
            for (int i = 0; i < indexCount; i++) {
                int index = typedArrayObtainStyledAttributes.getIndex(i);
                if (index == 16) {
                    this.f469m = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, this.f469m);
                } else if (index == 17) {
                    this.f470n = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, this.f470n);
                } else if (index == 14) {
                    this.f471o = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, this.f471o);
                } else if (index == 15) {
                    this.f472p = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, this.f472p);
                } else if (index == 113) {
                    this.f474r = typedArrayObtainStyledAttributes.getInt(index, this.f474r);
                } else if (index == 56) {
                    int resourceId = typedArrayObtainStyledAttributes.getResourceId(index, 0);
                    if (resourceId != 0) {
                        try {
                            m387i(resourceId);
                        } catch (Resources.NotFoundException unused) {
                            this.f476t = null;
                        }
                    }
                } else if (index == 34) {
                    int resourceId2 = typedArrayObtainStyledAttributes.getResourceId(index, 0);
                    try {
                        C0103cm c0103cm = new C0103cm();
                        this.f475s = c0103cm;
                        c0103cm.m973d(getContext(), resourceId2);
                    } catch (Resources.NotFoundException unused2) {
                        this.f475s = null;
                    }
                    this.f477u = resourceId2;
                }
            }
            typedArrayObtainStyledAttributes.recycle();
        }
        c0179em.f2123C0 = this.f474r;
        gi0.f2742q = c0179em.m1463S(512);
    }

    /* JADX INFO: renamed from: g */
    public static C0733tl m385g() {
        C0733tl c0733tl = new C0733tl(-2, -2);
        c0733tl.f7487a = -1;
        c0733tl.f7489b = -1;
        c0733tl.f7491c = -1.0f;
        c0733tl.f7493d = true;
        c0733tl.f7495e = -1;
        c0733tl.f7497f = -1;
        c0733tl.f7499g = -1;
        c0733tl.f7501h = -1;
        c0733tl.f7503i = -1;
        c0733tl.f7505j = -1;
        c0733tl.f7507k = -1;
        c0733tl.f7509l = -1;
        c0733tl.f7511m = -1;
        c0733tl.f7513n = -1;
        c0733tl.f7515o = -1;
        c0733tl.f7517p = -1;
        c0733tl.f7519q = 0;
        c0733tl.f7520r = 0.0f;
        c0733tl.f7521s = -1;
        c0733tl.f7522t = -1;
        c0733tl.f7523u = -1;
        c0733tl.f7524v = -1;
        c0733tl.f7525w = Integer.MIN_VALUE;
        c0733tl.f7526x = Integer.MIN_VALUE;
        c0733tl.f7527y = Integer.MIN_VALUE;
        c0733tl.f7528z = Integer.MIN_VALUE;
        c0733tl.f7461A = Integer.MIN_VALUE;
        c0733tl.f7462B = Integer.MIN_VALUE;
        c0733tl.f7463C = Integer.MIN_VALUE;
        c0733tl.f7464D = 0;
        c0733tl.f7465E = 0.5f;
        c0733tl.f7466F = 0.5f;
        c0733tl.f7467G = null;
        c0733tl.f7468H = -1.0f;
        c0733tl.f7469I = -1.0f;
        c0733tl.f7470J = 0;
        c0733tl.f7471K = 0;
        c0733tl.f7472L = 0;
        c0733tl.f7473M = 0;
        c0733tl.f7474N = 0;
        c0733tl.f7475O = 0;
        c0733tl.f7476P = 0;
        c0733tl.f7477Q = 0;
        c0733tl.f7478R = 1.0f;
        c0733tl.f7479S = 1.0f;
        c0733tl.f7480T = -1;
        c0733tl.f7481U = -1;
        c0733tl.f7482V = -1;
        c0733tl.f7483W = false;
        c0733tl.f7484X = false;
        c0733tl.f7485Y = null;
        c0733tl.f7486Z = 0;
        c0733tl.f7488a0 = true;
        c0733tl.f7490b0 = true;
        c0733tl.f7492c0 = false;
        c0733tl.f7494d0 = false;
        c0733tl.f7496e0 = false;
        c0733tl.f7498f0 = -1;
        c0733tl.f7500g0 = -1;
        c0733tl.f7502h0 = -1;
        c0733tl.f7504i0 = -1;
        c0733tl.f7506j0 = Integer.MIN_VALUE;
        c0733tl.f7508k0 = Integer.MIN_VALUE;
        c0733tl.f7510l0 = 0.5f;
        c0733tl.f7518p0 = new C0143dm();
        return c0733tl;
    }

    private int getPaddingWidth() {
        int iMax = Math.max(0, getPaddingRight()) + Math.max(0, getPaddingLeft());
        int iMax2 = Math.max(0, getPaddingEnd()) + Math.max(0, getPaddingStart());
        return iMax2 > 0 ? iMax2 : iMax;
    }

    public static s71 getSharedValues() {
        if (f465y == null) {
            s71 s71Var = new s71();
            new SparseIntArray();
            new HashMap();
            f465y = s71Var;
        }
        return f465y;
    }

    @Override // android.view.ViewGroup
    public final boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof C0733tl;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        Object tag;
        int size;
        ArrayList arrayList = this.f467k;
        if (arrayList != null && (size = arrayList.size()) > 0) {
            for (int i = 0; i < size; i++) {
                ((AbstractC0659rl) arrayList.get(i)).getClass();
            }
        }
        super.dispatchDraw(canvas);
        if (isInEditMode()) {
            float width = getWidth();
            float height = getHeight();
            int childCount = getChildCount();
            for (int i2 = 0; i2 < childCount; i2++) {
                View childAt = getChildAt(i2);
                if (childAt.getVisibility() != 8 && (tag = childAt.getTag()) != null && (tag instanceof String)) {
                    String[] strArrSplit = ((String) tag).split(",");
                    if (strArrSplit.length == 4) {
                        int i3 = Integer.parseInt(strArrSplit[0]);
                        int i4 = Integer.parseInt(strArrSplit[1]);
                        int i5 = Integer.parseInt(strArrSplit[2]);
                        int i6 = (int) ((i3 / 1080.0f) * width);
                        int i7 = (int) ((i4 / 1920.0f) * height);
                        int i8 = (int) ((Integer.parseInt(strArrSplit[3]) / 1920.0f) * height);
                        Paint paint = new Paint();
                        paint.setColor(-65536);
                        float f = i6;
                        float f2 = i7;
                        float f3 = i6 + ((int) ((i5 / 1080.0f) * width));
                        canvas.drawLine(f, f2, f3, f2, paint);
                        float f4 = i7 + i8;
                        canvas.drawLine(f3, f2, f3, f4, paint);
                        canvas.drawLine(f3, f4, f, f4, paint);
                        canvas.drawLine(f, f4, f, f2, paint);
                        paint.setColor(-16711936);
                        canvas.drawLine(f, f2, f3, f4, paint);
                        canvas.drawLine(f, f4, f3, f2, paint);
                    }
                }
            }
        }
    }

    @Override // android.view.View
    public final void forceLayout() {
        this.f473q = true;
        super.forceLayout();
    }

    @Override // android.view.ViewGroup
    public final /* bridge */ /* synthetic */ ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return m385g();
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        Context context = getContext();
        C0733tl c0733tl = new C0733tl(context, attributeSet);
        c0733tl.f7487a = -1;
        c0733tl.f7489b = -1;
        c0733tl.f7491c = -1.0f;
        c0733tl.f7493d = true;
        c0733tl.f7495e = -1;
        c0733tl.f7497f = -1;
        c0733tl.f7499g = -1;
        c0733tl.f7501h = -1;
        c0733tl.f7503i = -1;
        c0733tl.f7505j = -1;
        c0733tl.f7507k = -1;
        c0733tl.f7509l = -1;
        c0733tl.f7511m = -1;
        c0733tl.f7513n = -1;
        c0733tl.f7515o = -1;
        c0733tl.f7517p = -1;
        c0733tl.f7519q = 0;
        c0733tl.f7520r = 0.0f;
        c0733tl.f7521s = -1;
        c0733tl.f7522t = -1;
        c0733tl.f7523u = -1;
        c0733tl.f7524v = -1;
        c0733tl.f7525w = Integer.MIN_VALUE;
        c0733tl.f7526x = Integer.MIN_VALUE;
        c0733tl.f7527y = Integer.MIN_VALUE;
        c0733tl.f7528z = Integer.MIN_VALUE;
        c0733tl.f7461A = Integer.MIN_VALUE;
        c0733tl.f7462B = Integer.MIN_VALUE;
        c0733tl.f7463C = Integer.MIN_VALUE;
        c0733tl.f7464D = 0;
        c0733tl.f7465E = 0.5f;
        c0733tl.f7466F = 0.5f;
        c0733tl.f7467G = null;
        c0733tl.f7468H = -1.0f;
        c0733tl.f7469I = -1.0f;
        c0733tl.f7470J = 0;
        c0733tl.f7471K = 0;
        c0733tl.f7472L = 0;
        c0733tl.f7473M = 0;
        c0733tl.f7474N = 0;
        c0733tl.f7475O = 0;
        c0733tl.f7476P = 0;
        c0733tl.f7477Q = 0;
        c0733tl.f7478R = 1.0f;
        c0733tl.f7479S = 1.0f;
        c0733tl.f7480T = -1;
        c0733tl.f7481U = -1;
        c0733tl.f7482V = -1;
        c0733tl.f7483W = false;
        c0733tl.f7484X = false;
        c0733tl.f7485Y = null;
        c0733tl.f7486Z = 0;
        c0733tl.f7488a0 = true;
        c0733tl.f7490b0 = true;
        c0733tl.f7492c0 = false;
        c0733tl.f7494d0 = false;
        c0733tl.f7496e0 = false;
        c0733tl.f7498f0 = -1;
        c0733tl.f7500g0 = -1;
        c0733tl.f7502h0 = -1;
        c0733tl.f7504i0 = -1;
        c0733tl.f7506j0 = Integer.MIN_VALUE;
        c0733tl.f7508k0 = Integer.MIN_VALUE;
        c0733tl.f7510l0 = 0.5f;
        c0733tl.f7518p0 = new C0143dm();
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, iz0.f3751b);
        int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
        for (int i = 0; i < indexCount; i++) {
            int index = typedArrayObtainStyledAttributes.getIndex(i);
            int i2 = AbstractC0696sl.f7139a.get(index);
            switch (i2) {
                case 1:
                    c0733tl.f7482V = typedArrayObtainStyledAttributes.getInt(index, c0733tl.f7482V);
                    break;
                case 2:
                    int resourceId = typedArrayObtainStyledAttributes.getResourceId(index, c0733tl.f7517p);
                    c0733tl.f7517p = resourceId;
                    if (resourceId == -1) {
                        c0733tl.f7517p = typedArrayObtainStyledAttributes.getInt(index, -1);
                    }
                    break;
                case 3:
                    c0733tl.f7519q = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, c0733tl.f7519q);
                    break;
                case 4:
                    float f = typedArrayObtainStyledAttributes.getFloat(index, c0733tl.f7520r) % 360.0f;
                    c0733tl.f7520r = f;
                    if (f < 0.0f) {
                        c0733tl.f7520r = (360.0f - f) % 360.0f;
                    }
                    break;
                case 5:
                    c0733tl.f7487a = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, c0733tl.f7487a);
                    break;
                case 6:
                    c0733tl.f7489b = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, c0733tl.f7489b);
                    break;
                case 7:
                    c0733tl.f7491c = typedArrayObtainStyledAttributes.getFloat(index, c0733tl.f7491c);
                    break;
                case 8:
                    int resourceId2 = typedArrayObtainStyledAttributes.getResourceId(index, c0733tl.f7495e);
                    c0733tl.f7495e = resourceId2;
                    if (resourceId2 == -1) {
                        c0733tl.f7495e = typedArrayObtainStyledAttributes.getInt(index, -1);
                    }
                    break;
                case 9:
                    int resourceId3 = typedArrayObtainStyledAttributes.getResourceId(index, c0733tl.f7497f);
                    c0733tl.f7497f = resourceId3;
                    if (resourceId3 == -1) {
                        c0733tl.f7497f = typedArrayObtainStyledAttributes.getInt(index, -1);
                    }
                    break;
                case 10:
                    int resourceId4 = typedArrayObtainStyledAttributes.getResourceId(index, c0733tl.f7499g);
                    c0733tl.f7499g = resourceId4;
                    if (resourceId4 == -1) {
                        c0733tl.f7499g = typedArrayObtainStyledAttributes.getInt(index, -1);
                    }
                    break;
                case C0561oy.TTL_EXPIRY_EVENT_TO_LOG_FIELD_NUMBER /* 11 */:
                    int resourceId5 = typedArrayObtainStyledAttributes.getResourceId(index, c0733tl.f7501h);
                    c0733tl.f7501h = resourceId5;
                    if (resourceId5 == -1) {
                        c0733tl.f7501h = typedArrayObtainStyledAttributes.getInt(index, -1);
                    }
                    break;
                case C0561oy.OVERFLOW_POLICY_FIELD_NUMBER /* 12 */:
                    int resourceId6 = typedArrayObtainStyledAttributes.getResourceId(index, c0733tl.f7503i);
                    c0733tl.f7503i = resourceId6;
                    if (resourceId6 == -1) {
                        c0733tl.f7503i = typedArrayObtainStyledAttributes.getInt(index, -1);
                    }
                    break;
                case C0561oy.ONGOING_EXPERIMENTS_FIELD_NUMBER /* 13 */:
                    int resourceId7 = typedArrayObtainStyledAttributes.getResourceId(index, c0733tl.f7505j);
                    c0733tl.f7505j = resourceId7;
                    if (resourceId7 == -1) {
                        c0733tl.f7505j = typedArrayObtainStyledAttributes.getInt(index, -1);
                    }
                    break;
                case 14:
                    int resourceId8 = typedArrayObtainStyledAttributes.getResourceId(index, c0733tl.f7507k);
                    c0733tl.f7507k = resourceId8;
                    if (resourceId8 == -1) {
                        c0733tl.f7507k = typedArrayObtainStyledAttributes.getInt(index, -1);
                    }
                    break;
                case 15:
                    int resourceId9 = typedArrayObtainStyledAttributes.getResourceId(index, c0733tl.f7509l);
                    c0733tl.f7509l = resourceId9;
                    if (resourceId9 == -1) {
                        c0733tl.f7509l = typedArrayObtainStyledAttributes.getInt(index, -1);
                    }
                    break;
                case 16:
                    int resourceId10 = typedArrayObtainStyledAttributes.getResourceId(index, c0733tl.f7511m);
                    c0733tl.f7511m = resourceId10;
                    if (resourceId10 == -1) {
                        c0733tl.f7511m = typedArrayObtainStyledAttributes.getInt(index, -1);
                    }
                    break;
                case 17:
                    int resourceId11 = typedArrayObtainStyledAttributes.getResourceId(index, c0733tl.f7521s);
                    c0733tl.f7521s = resourceId11;
                    if (resourceId11 == -1) {
                        c0733tl.f7521s = typedArrayObtainStyledAttributes.getInt(index, -1);
                    }
                    break;
                case 18:
                    int resourceId12 = typedArrayObtainStyledAttributes.getResourceId(index, c0733tl.f7522t);
                    c0733tl.f7522t = resourceId12;
                    if (resourceId12 == -1) {
                        c0733tl.f7522t = typedArrayObtainStyledAttributes.getInt(index, -1);
                    }
                    break;
                case 19:
                    int resourceId13 = typedArrayObtainStyledAttributes.getResourceId(index, c0733tl.f7523u);
                    c0733tl.f7523u = resourceId13;
                    if (resourceId13 == -1) {
                        c0733tl.f7523u = typedArrayObtainStyledAttributes.getInt(index, -1);
                    }
                    break;
                case 20:
                    int resourceId14 = typedArrayObtainStyledAttributes.getResourceId(index, c0733tl.f7524v);
                    c0733tl.f7524v = resourceId14;
                    if (resourceId14 == -1) {
                        c0733tl.f7524v = typedArrayObtainStyledAttributes.getInt(index, -1);
                    }
                    break;
                case 21:
                    c0733tl.f7525w = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, c0733tl.f7525w);
                    break;
                case 22:
                    c0733tl.f7526x = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, c0733tl.f7526x);
                    break;
                case 23:
                    c0733tl.f7527y = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, c0733tl.f7527y);
                    break;
                case 24:
                    c0733tl.f7528z = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, c0733tl.f7528z);
                    break;
                case 25:
                    c0733tl.f7461A = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, c0733tl.f7461A);
                    break;
                case 26:
                    c0733tl.f7462B = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, c0733tl.f7462B);
                    break;
                case 27:
                    c0733tl.f7483W = typedArrayObtainStyledAttributes.getBoolean(index, c0733tl.f7483W);
                    break;
                case 28:
                    c0733tl.f7484X = typedArrayObtainStyledAttributes.getBoolean(index, c0733tl.f7484X);
                    break;
                case 29:
                    c0733tl.f7465E = typedArrayObtainStyledAttributes.getFloat(index, c0733tl.f7465E);
                    break;
                case 30:
                    c0733tl.f7466F = typedArrayObtainStyledAttributes.getFloat(index, c0733tl.f7466F);
                    break;
                case 31:
                    int i3 = typedArrayObtainStyledAttributes.getInt(index, 0);
                    c0733tl.f7472L = i3;
                    if (i3 == 1) {
                        Log.e("ConstraintLayout", "layout_constraintWidth_default=\"wrap\" is deprecated.\nUse layout_width=\"WRAP_CONTENT\" and layout_constrainedWidth=\"true\" instead.");
                    }
                    break;
                case 32:
                    int i4 = typedArrayObtainStyledAttributes.getInt(index, 0);
                    c0733tl.f7473M = i4;
                    if (i4 == 1) {
                        Log.e("ConstraintLayout", "layout_constraintHeight_default=\"wrap\" is deprecated.\nUse layout_height=\"WRAP_CONTENT\" and layout_constrainedHeight=\"true\" instead.");
                    }
                    break;
                case 33:
                    try {
                        c0733tl.f7474N = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, c0733tl.f7474N);
                    } catch (Exception unused) {
                        if (typedArrayObtainStyledAttributes.getInt(index, c0733tl.f7474N) == -2) {
                            c0733tl.f7474N = -2;
                        }
                    }
                    break;
                case 34:
                    try {
                        c0733tl.f7476P = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, c0733tl.f7476P);
                    } catch (Exception unused2) {
                        if (typedArrayObtainStyledAttributes.getInt(index, c0733tl.f7476P) == -2) {
                            c0733tl.f7476P = -2;
                        }
                    }
                    break;
                case 35:
                    c0733tl.f7478R = Math.max(0.0f, typedArrayObtainStyledAttributes.getFloat(index, c0733tl.f7478R));
                    c0733tl.f7472L = 2;
                    break;
                case 36:
                    try {
                        c0733tl.f7475O = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, c0733tl.f7475O);
                    } catch (Exception unused3) {
                        if (typedArrayObtainStyledAttributes.getInt(index, c0733tl.f7475O) == -2) {
                            c0733tl.f7475O = -2;
                        }
                    }
                    break;
                case 37:
                    try {
                        c0733tl.f7477Q = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, c0733tl.f7477Q);
                    } catch (Exception unused4) {
                        if (typedArrayObtainStyledAttributes.getInt(index, c0733tl.f7477Q) == -2) {
                            c0733tl.f7477Q = -2;
                        }
                    }
                    break;
                case 38:
                    c0733tl.f7479S = Math.max(0.0f, typedArrayObtainStyledAttributes.getFloat(index, c0733tl.f7479S));
                    c0733tl.f7473M = 2;
                    break;
                default:
                    switch (i2) {
                        case 44:
                            C0103cm.m971g(c0733tl, typedArrayObtainStyledAttributes.getString(index));
                            break;
                        case 45:
                            c0733tl.f7468H = typedArrayObtainStyledAttributes.getFloat(index, c0733tl.f7468H);
                            break;
                        case 46:
                            c0733tl.f7469I = typedArrayObtainStyledAttributes.getFloat(index, c0733tl.f7469I);
                            break;
                        case 47:
                            c0733tl.f7470J = typedArrayObtainStyledAttributes.getInt(index, 0);
                            break;
                        case 48:
                            c0733tl.f7471K = typedArrayObtainStyledAttributes.getInt(index, 0);
                            break;
                        case 49:
                            c0733tl.f7480T = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, c0733tl.f7480T);
                            break;
                        case 50:
                            c0733tl.f7481U = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, c0733tl.f7481U);
                            break;
                        case 51:
                            c0733tl.f7485Y = typedArrayObtainStyledAttributes.getString(index);
                            break;
                        case 52:
                            int resourceId15 = typedArrayObtainStyledAttributes.getResourceId(index, c0733tl.f7513n);
                            c0733tl.f7513n = resourceId15;
                            if (resourceId15 == -1) {
                                c0733tl.f7513n = typedArrayObtainStyledAttributes.getInt(index, -1);
                            }
                            break;
                        case 53:
                            int resourceId16 = typedArrayObtainStyledAttributes.getResourceId(index, c0733tl.f7515o);
                            c0733tl.f7515o = resourceId16;
                            if (resourceId16 == -1) {
                                c0733tl.f7515o = typedArrayObtainStyledAttributes.getInt(index, -1);
                            }
                            break;
                        case 54:
                            c0733tl.f7464D = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, c0733tl.f7464D);
                            break;
                        case 55:
                            c0733tl.f7463C = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, c0733tl.f7463C);
                            break;
                        default:
                            switch (i2) {
                                case 64:
                                    C0103cm.m970f(c0733tl, typedArrayObtainStyledAttributes, index, 0);
                                    break;
                                case 65:
                                    C0103cm.m970f(c0733tl, typedArrayObtainStyledAttributes, index, 1);
                                    break;
                                case 66:
                                    c0733tl.f7486Z = typedArrayObtainStyledAttributes.getInt(index, c0733tl.f7486Z);
                                    break;
                                case 67:
                                    c0733tl.f7493d = typedArrayObtainStyledAttributes.getBoolean(index, c0733tl.f7493d);
                                    break;
                            }
                            break;
                    }
                    break;
            }
        }
        typedArrayObtainStyledAttributes.recycle();
        c0733tl.m4793a();
        return c0733tl;
    }

    public int getMaxHeight() {
        return this.f472p;
    }

    public int getMaxWidth() {
        return this.f471o;
    }

    public int getMinHeight() {
        return this.f470n;
    }

    public int getMinWidth() {
        return this.f469m;
    }

    public int getOptimizationLevel() {
        return this.f468l.f2123C0;
    }

    public String getSceneString() {
        int id;
        StringBuilder sb = new StringBuilder();
        C0179em c0179em = this.f468l;
        if (c0179em.f1725j == null) {
            int id2 = getId();
            if (id2 != -1) {
                c0179em.f1725j = getContext().getResources().getResourceEntryName(id2);
            } else {
                c0179em.f1725j = "parent";
            }
        }
        if (c0179em.f1720g0 == null) {
            c0179em.f1720g0 = c0179em.f1725j;
            Log.v("ConstraintLayout", " setDebugName " + c0179em.f1720g0);
        }
        ArrayList arrayList = c0179em.f2132p0;
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            C0143dm c0143dm = (C0143dm) obj;
            View view = c0143dm.f1716e0;
            if (view != null) {
                if (c0143dm.f1725j == null && (id = view.getId()) != -1) {
                    c0143dm.f1725j = getContext().getResources().getResourceEntryName(id);
                }
                if (c0143dm.f1720g0 == null) {
                    c0143dm.f1720g0 = c0143dm.f1725j;
                    Log.v("ConstraintLayout", " setDebugName " + c0143dm.f1720g0);
                }
            }
        }
        c0179em.mo1259l(sb);
        return sb.toString();
    }

    /* JADX INFO: renamed from: h */
    public final C0143dm m386h(View view) {
        if (view == this) {
            return this.f468l;
        }
        if (view == null) {
            return null;
        }
        if (view.getLayoutParams() instanceof C0733tl) {
            return ((C0733tl) view.getLayoutParams()).f7518p0;
        }
        view.setLayoutParams(generateLayoutParams(view.getLayoutParams()));
        if (view.getLayoutParams() instanceof C0733tl) {
            return ((C0733tl) view.getLayoutParams()).f7518p0;
        }
        return null;
    }

    /* JADX INFO: renamed from: i */
    public final void m387i(int i) {
        String str;
        Context context = getContext();
        C0312i6 c0312i6 = new C0312i6(18, false);
        c0312i6.f3447k = new SparseArray();
        c0312i6.f3448l = new SparseArray();
        XmlResourceParser xml = context.getResources().getXml(i);
        try {
            C0392kd c0392kd = null;
            for (int eventType = xml.getEventType(); eventType != 1; eventType = xml.next()) {
                if (eventType == 2) {
                    String name = xml.getName();
                    switch (name.hashCode()) {
                        case -1349929691:
                            if (name.equals("ConstraintSet")) {
                                c0312i6.m2549u(context, xml);
                            }
                            break;
                        case 80204913:
                            if (name.equals("State")) {
                                C0392kd c0392kd2 = new C0392kd(context, xml);
                                ((SparseArray) c0312i6.f3447k).put(c0392kd2.f4346a, c0392kd2);
                                c0392kd = c0392kd2;
                            }
                            break;
                        case 1382829617:
                            str = "StateSet";
                            name.equals(str);
                            break;
                        case 1657696882:
                            str = "layoutDescription";
                            name.equals(str);
                            break;
                        case 1901439077:
                            if (name.equals("Variant")) {
                                C0807vl c0807vl = new C0807vl(context, xml);
                                if (c0392kd != null) {
                                    ((ArrayList) c0392kd.f4348c).add(c0807vl);
                                }
                            }
                            break;
                    }
                }
            }
        } catch (IOException e) {
            Log.e("ConstraintLayoutStates", "Error parsing resource: " + i, e);
        } catch (XmlPullParserException e2) {
            Log.e("ConstraintLayoutStates", "Error parsing resource: " + i, e2);
        }
        this.f476t = c0312i6;
    }

    /* JADX INFO: renamed from: j */
    public final void m388j(C0143dm c0143dm, C0733tl c0733tl, SparseArray sparseArray, int i, int i2) {
        View view = (View) this.f466j.get(i);
        C0143dm c0143dm2 = (C0143dm) sparseArray.get(i);
        if (c0143dm2 == null || view == null || !(view.getLayoutParams() instanceof C0733tl)) {
            return;
        }
        c0733tl.f7492c0 = true;
        if (i2 == 6) {
            C0733tl c0733tl2 = (C0733tl) view.getLayoutParams();
            c0733tl2.f7492c0 = true;
            c0733tl2.f7518p0.f1685E = true;
        }
        c0143dm.mo1254g(6).m3954a(c0143dm2.mo1254g(i2), c0733tl.f7464D, c0733tl.f7463C);
        c0143dm.f1685E = true;
        c0143dm.mo1254g(3).m3960g();
        c0143dm.mo1254g(5).m3960g();
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:216:0x05cb  */
    /* JADX WARN: Code duplicated, block: B:270:0x06f0  */
    /* JADX WARN: Code duplicated, block: B:272:0x06f9  */
    /* JADX WARN: Code duplicated, block: B:275:0x0703  */
    /* JADX WARN: Code duplicated, block: B:282:0x071c  */
    /* JADX WARN: Code duplicated, block: B:284:0x0725  */
    /* JADX WARN: Code duplicated, block: B:285:0x0731  */
    /* JADX WARN: Code duplicated, block: B:287:0x0738  */
    /* JADX WARN: Code duplicated, block: B:292:0x0758  */
    /* JADX WARN: Code duplicated, block: B:295:0x0760  */
    /* JADX WARN: Code duplicated, block: B:297:0x0769  */
    /* JADX WARN: Code duplicated, block: B:300:0x0774  */
    /* JADX WARN: Code duplicated, block: B:307:0x0791  */
    /* JADX WARN: Code duplicated, block: B:308:0x079e  */
    /* JADX WARN: Code duplicated, block: B:310:0x07a6  */
    /* JADX WARN: Code duplicated, block: B:311:0x07af  */
    /* JADX WARN: Code duplicated, block: B:313:0x07b5  */
    /* JADX WARN: Code duplicated, block: B:316:0x07bf  */
    /* JADX WARN: Code duplicated, block: B:319:0x07c7  */
    /* JADX WARN: Code duplicated, block: B:391:0x08eb  */
    /* JADX INFO: renamed from: k */
    public final boolean m389k() {
        boolean z;
        SparseArray sparseArray;
        boolean z2;
        boolean z3;
        int i;
        C0179em c0179em;
        int i2;
        int i3;
        int i4;
        float f;
        C0143dm c0143dm;
        int i5;
        int i6;
        int i7;
        int i8;
        C0143dm c0143dm2;
        int i9;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        C0143dm c0143dm3;
        int i15;
        int i16;
        int i17;
        C0143dm c0143dm4;
        float f2;
        int i18;
        int i19;
        C0143dm c0143dm5;
        int i20;
        int i21;
        int i22;
        int i23;
        float f3;
        C0143dm c0143dm6;
        C0143dm c0143dm7;
        int i24;
        C0143dm c0143dm8;
        int i25;
        char c;
        int i26;
        int i27;
        float fAbs;
        int i28;
        byte b;
        SparseArray sparseArray2;
        String str;
        int iM4376d;
        SparseArray sparseArray3;
        int i29;
        C0103cm c0103cm;
        HashSet hashSet;
        boolean z4;
        boolean z5;
        int i30;
        C0179em c0179em2;
        C0179em c0179em3;
        String resourceEntryName;
        C0143dm c0143dm9;
        ConstraintLayout constraintLayout = this;
        int childCount = constraintLayout.getChildCount();
        int i31 = 0;
        while (true) {
            if (i31 >= childCount) {
                z = false;
                break;
            }
            if (constraintLayout.getChildAt(i31).isLayoutRequested()) {
                z = true;
                break;
            }
            i31++;
        }
        if (!z) {
            return z;
        }
        boolean zIsInEditMode = constraintLayout.isInEditMode();
        int childCount2 = constraintLayout.getChildCount();
        for (int i32 = 0; i32 < childCount2; i32++) {
            C0143dm c0143dmM386h = constraintLayout.m386h(constraintLayout.getChildAt(i32));
            if (c0143dmM386h != null) {
                c0143dmM386h.mo1237A();
            }
        }
        SparseArray sparseArray4 = constraintLayout.f466j;
        int i33 = -1;
        C0179em c0179em4 = constraintLayout.f468l;
        if (zIsInEditMode) {
            for (int i34 = 0; i34 < childCount2; i34++) {
                View childAt = constraintLayout.getChildAt(i34);
                try {
                    String resourceName = constraintLayout.getResources().getResourceName(childAt.getId());
                    Integer numValueOf = Integer.valueOf(childAt.getId());
                    if (resourceName != null) {
                        if (constraintLayout.f478v == null) {
                            constraintLayout.f478v = new HashMap();
                        }
                        int iIndexOf = resourceName.indexOf("/");
                        constraintLayout.f478v.put(iIndexOf != -1 ? resourceName.substring(iIndexOf + 1) : resourceName, numValueOf);
                    }
                    int iIndexOf2 = resourceName.indexOf(47);
                    if (iIndexOf2 != -1) {
                        resourceName = resourceName.substring(iIndexOf2 + 1);
                    }
                    int id = childAt.getId();
                    if (id != 0) {
                        View viewFindViewById = (View) sparseArray4.get(id);
                        if (viewFindViewById == null && (viewFindViewById = constraintLayout.findViewById(id)) != null && viewFindViewById != constraintLayout && viewFindViewById.getParent() == constraintLayout) {
                            constraintLayout.onViewAdded(viewFindViewById);
                        }
                        c0143dm9 = viewFindViewById == constraintLayout ? c0179em4 : viewFindViewById == null ? null : ((C0733tl) viewFindViewById.getLayoutParams()).f7518p0;
                    }
                    c0143dm9.f1720g0 = resourceName;
                } catch (Resources.NotFoundException unused) {
                }
            }
        }
        if (constraintLayout.f477u != -1) {
            for (int i35 = 0; i35 < childCount2; i35++) {
                constraintLayout.getChildAt(i35).getId();
            }
        }
        C0103cm c0103cm2 = constraintLayout.f475s;
        if (c0103cm2 != null) {
            int childCount3 = constraintLayout.getChildCount();
            HashMap map = c0103cm2.f1293c;
            HashSet<Integer> hashSet2 = new HashSet(map.keySet());
            int i36 = 0;
            while (i36 < childCount3) {
                View childAt2 = constraintLayout.getChildAt(i36);
                int id2 = childAt2.getId();
                if (!map.containsKey(Integer.valueOf(id2))) {
                    StringBuilder sb = new StringBuilder("id unknown ");
                    try {
                        resourceEntryName = childAt2.getContext().getResources().getResourceEntryName(childAt2.getId());
                    } catch (Exception unused2) {
                        resourceEntryName = "UNKNOWN";
                    }
                    sb.append(resourceEntryName);
                    Log.w("ConstraintSet", sb.toString());
                } else {
                    if (c0103cm2.f1292b && id2 == i33) {
                        throw new RuntimeException("All children of ConstraintLayout must have ids to use ConstraintSet");
                    }
                    if (id2 != i33) {
                        if (map.containsKey(Integer.valueOf(id2))) {
                            hashSet2.remove(Integer.valueOf(id2));
                            C0881xl c0881xl = (C0881xl) map.get(Integer.valueOf(id2));
                            if (c0881xl != null) {
                                C0023am c0023am = c0881xl.f8985b;
                                C0918yl c0918yl = c0881xl.f8987d;
                                i29 = i36;
                                C0067bm c0067bm = c0881xl.f8988e;
                                c0103cm = c0103cm2;
                                if (childAt2 instanceof C0168eb) {
                                    c0918yl.f9362h0 = 1;
                                    C0168eb c0168eb = (C0168eb) childAt2;
                                    c0168eb.setId(id2);
                                    c0168eb.setType(c0918yl.f9358f0);
                                    c0168eb.setMargin(c0918yl.f9360g0);
                                    c0168eb.setAllowsGoneWidget(c0918yl.f9374n0);
                                    int[] iArr = c0918yl.f9364i0;
                                    if (iArr != null) {
                                        c0168eb.setReferencedIds(iArr);
                                    } else {
                                        String str2 = c0918yl.f9366j0;
                                        if (str2 != null) {
                                            int[] iArrM967b = C0103cm.m967b(c0168eb, str2);
                                            c0918yl.f9364i0 = iArrM967b;
                                            c0168eb.setReferencedIds(iArrM967b);
                                        }
                                    }
                                }
                                C0733tl c0733tl = (C0733tl) childAt2.getLayoutParams();
                                c0733tl.m4793a();
                                c0881xl.m5668a(c0733tl);
                                HashMap map2 = c0881xl.f8989f;
                                hashSet = hashSet2;
                                z4 = z;
                                z5 = zIsInEditMode;
                                Class<?> cls = childAt2.getClass();
                                for (String str3 : map2.keySet()) {
                                    int i37 = childCount2;
                                    C0622ql c0622ql = (C0622ql) map2.get(str3);
                                    HashMap map3 = map2;
                                    String strM283f = !c0622ql.f6522a ? AbstractC0024an.m283f("set", str3) : str3;
                                    SparseArray sparseArray5 = sparseArray4;
                                    try {
                                        int iM292o = AbstractC0024an.m292o(c0622ql.f6523b);
                                        Class cls2 = Float.TYPE;
                                        Class cls3 = Integer.TYPE;
                                        switch (iM292o) {
                                            case 0:
                                                c0179em3 = c0179em4;
                                                cls.getMethod(strM283f, cls3).invoke(childAt2, Integer.valueOf(c0622ql.f6524c));
                                                break;
                                            case 1:
                                                c0179em3 = c0179em4;
                                                cls.getMethod(strM283f, cls2).invoke(childAt2, Float.valueOf(c0622ql.f6525d));
                                                break;
                                            case 2:
                                                c0179em3 = c0179em4;
                                                cls.getMethod(strM283f, cls3).invoke(childAt2, Integer.valueOf(c0622ql.f6528g));
                                                break;
                                            case 3:
                                                Method method = cls.getMethod(strM283f, Drawable.class);
                                                c0179em3 = c0179em4;
                                                try {
                                                    ColorDrawable colorDrawable = new ColorDrawable();
                                                    colorDrawable.setColor(c0622ql.f6528g);
                                                    method.invoke(childAt2, colorDrawable);
                                                } catch (IllegalAccessException e) {
                                                    e = e;
                                                    Log.e("TransitionLayout", " Custom Attribute \"" + str3 + "\" not found on " + cls.getName(), e);
                                                } catch (NoSuchMethodException e2) {
                                                    e = e2;
                                                    Log.e("TransitionLayout", cls.getName() + " must have a method " + strM283f, e);
                                                } catch (InvocationTargetException e3) {
                                                    e = e3;
                                                    Log.e("TransitionLayout", " Custom Attribute \"" + str3 + "\" not found on " + cls.getName(), e);
                                                }
                                                break;
                                            case 4:
                                                cls.getMethod(strM283f, CharSequence.class).invoke(childAt2, c0622ql.f6526e);
                                                c0179em3 = c0179em4;
                                                break;
                                            case 5:
                                                cls.getMethod(strM283f, Boolean.TYPE).invoke(childAt2, Boolean.valueOf(c0622ql.f6527f));
                                                c0179em3 = c0179em4;
                                                break;
                                            case 6:
                                                cls.getMethod(strM283f, cls2).invoke(childAt2, Float.valueOf(c0622ql.f6525d));
                                                c0179em3 = c0179em4;
                                                break;
                                            case 7:
                                                cls.getMethod(strM283f, cls3).invoke(childAt2, Integer.valueOf(c0622ql.f6524c));
                                                c0179em3 = c0179em4;
                                                break;
                                            default:
                                                c0179em3 = c0179em4;
                                                break;
                                        }
                                    } catch (IllegalAccessException e4) {
                                        e = e4;
                                        c0179em3 = c0179em4;
                                    } catch (NoSuchMethodException e5) {
                                        e = e5;
                                        c0179em3 = c0179em4;
                                    } catch (InvocationTargetException e6) {
                                        e = e6;
                                        c0179em3 = c0179em4;
                                    }
                                    childCount2 = i37;
                                    map2 = map3;
                                    sparseArray4 = sparseArray5;
                                    c0179em4 = c0179em3;
                                }
                                sparseArray3 = sparseArray4;
                                i30 = childCount2;
                                c0179em2 = c0179em4;
                                childAt2.setLayoutParams(c0733tl);
                                if (c0023am.f244b == 0) {
                                    childAt2.setVisibility(c0023am.f243a);
                                }
                                childAt2.setAlpha(c0023am.f245c);
                                childAt2.setRotation(c0067bm.f905a);
                                childAt2.setRotationX(c0067bm.f906b);
                                childAt2.setRotationY(c0067bm.f907c);
                                childAt2.setScaleX(c0067bm.f908d);
                                childAt2.setScaleY(c0067bm.f909e);
                                if (c0067bm.f912h != -1) {
                                    View viewFindViewById2 = ((View) childAt2.getParent()).findViewById(c0067bm.f912h);
                                    if (viewFindViewById2 != null) {
                                        float bottom = (viewFindViewById2.getBottom() + viewFindViewById2.getTop()) / 2.0f;
                                        float right = (viewFindViewById2.getRight() + viewFindViewById2.getLeft()) / 2.0f;
                                        if (childAt2.getRight() - childAt2.getLeft() > 0 && childAt2.getBottom() - childAt2.getTop() > 0) {
                                            float left = right - childAt2.getLeft();
                                            float top = bottom - childAt2.getTop();
                                            childAt2.setPivotX(left);
                                            childAt2.setPivotY(top);
                                        }
                                    }
                                } else {
                                    if (!Float.isNaN(c0067bm.f910f)) {
                                        childAt2.setPivotX(c0067bm.f910f);
                                    }
                                    if (!Float.isNaN(c0067bm.f911g)) {
                                        childAt2.setPivotY(c0067bm.f911g);
                                    }
                                }
                                childAt2.setTranslationX(c0067bm.f913i);
                                childAt2.setTranslationY(c0067bm.f914j);
                                childAt2.setTranslationZ(c0067bm.f915k);
                                if (c0067bm.f916l) {
                                    childAt2.setElevation(c0067bm.f917m);
                                }
                            }
                        } else {
                            sparseArray3 = sparseArray4;
                            i29 = i36;
                            c0103cm = c0103cm2;
                            hashSet = hashSet2;
                            z4 = z;
                            z5 = zIsInEditMode;
                            i30 = childCount2;
                            c0179em2 = c0179em4;
                            Log.v("ConstraintSet", "WARNING NO CONSTRAINTS for view " + id2);
                        }
                    }
                    i36 = i29 + 1;
                    c0103cm2 = c0103cm;
                    hashSet2 = hashSet;
                    z = z4;
                    zIsInEditMode = z5;
                    childCount2 = i30;
                    sparseArray4 = sparseArray3;
                    c0179em4 = c0179em2;
                    i33 = -1;
                }
                sparseArray3 = sparseArray4;
                i29 = i36;
                c0103cm = c0103cm2;
                hashSet = hashSet2;
                z4 = z;
                z5 = zIsInEditMode;
                i30 = childCount2;
                c0179em2 = c0179em4;
                i36 = i29 + 1;
                c0103cm2 = c0103cm;
                hashSet2 = hashSet;
                z = z4;
                zIsInEditMode = z5;
                childCount2 = i30;
                sparseArray4 = sparseArray3;
                c0179em4 = c0179em2;
                i33 = -1;
            }
            sparseArray = sparseArray4;
            z2 = z;
            z3 = zIsInEditMode;
            i = childCount2;
            C0179em c0179em5 = c0179em4;
            for (Integer num : hashSet2) {
                C0881xl c0881xl2 = (C0881xl) map.get(num);
                if (c0881xl2 != null) {
                    C0918yl c0918yl2 = c0881xl2.f8987d;
                    if (c0918yl2.f9362h0 == 1) {
                        Context context = constraintLayout.getContext();
                        C0168eb c0168eb2 = new C0168eb(context);
                        c0168eb2.f6878j = new int[32];
                        c0168eb2.f6884p = new HashMap();
                        c0168eb2.f6880l = context;
                        C0205fb c0205fb = new C0205fb();
                        c0205fb.f2366p0 = new C0143dm[4];
                        c0205fb.f2367q0 = 0;
                        c0205fb.f2368r0 = 0;
                        c0205fb.f2369s0 = true;
                        c0205fb.f2370t0 = 0;
                        c0205fb.f2371u0 = false;
                        c0168eb2.f2050s = c0205fb;
                        c0168eb2.f6881m = c0205fb;
                        c0168eb2.m4377e();
                        c0168eb2.setVisibility(8);
                        c0168eb2.setId(num.intValue());
                        int[] iArr2 = c0918yl2.f9364i0;
                        if (iArr2 != null) {
                            c0168eb2.setReferencedIds(iArr2);
                        } else {
                            String str4 = c0918yl2.f9366j0;
                            if (str4 != null) {
                                int[] iArrM967b2 = C0103cm.m967b(c0168eb2, str4);
                                c0918yl2.f9364i0 = iArrM967b2;
                                c0168eb2.setReferencedIds(iArrM967b2);
                            }
                        }
                        c0168eb2.setType(c0918yl2.f9358f0);
                        c0168eb2.setMargin(c0918yl2.f9360g0);
                        C0733tl c0733tlM385g = m385g();
                        c0168eb2.m4377e();
                        c0881xl2.m5668a(c0733tlM385g);
                        constraintLayout.addView(c0168eb2, c0733tlM385g);
                    }
                    if (c0918yl2.f9347a) {
                        da0 da0Var = new da0(constraintLayout.getContext());
                        da0Var.setId(num.intValue());
                        C0733tl c0733tlM385g2 = m385g();
                        c0881xl2.m5668a(c0733tlM385g2);
                        constraintLayout.addView(da0Var, c0733tlM385g2);
                    }
                }
            }
            for (int i38 = 0; i38 < childCount3; i38++) {
                constraintLayout.getChildAt(i38);
            }
            c0179em = c0179em5;
        } else {
            sparseArray = sparseArray4;
            z2 = z;
            z3 = zIsInEditMode;
            i = childCount2;
            c0179em = c0179em4;
        }
        c0179em.f2132p0.clear();
        ArrayList arrayList = constraintLayout.f467k;
        int size = arrayList.size();
        char c2 = 2;
        if (size > 0) {
            int i39 = 0;
            while (i39 < size) {
                AbstractC0659rl abstractC0659rl = (AbstractC0659rl) arrayList.get(i39);
                HashMap map4 = abstractC0659rl.f6884p;
                if (abstractC0659rl.isInEditMode()) {
                    abstractC0659rl.setIds(abstractC0659rl.f6882n);
                }
                C0205fb c0205fb2 = abstractC0659rl.f6881m;
                if (c0205fb2 == null) {
                    sparseArray2 = sparseArray;
                } else {
                    c0205fb2.f2367q0 = 0;
                    Arrays.fill(c0205fb2.f2366p0, (Object) null);
                    int i40 = 0;
                    while (i40 < abstractC0659rl.f6879k) {
                        int i41 = abstractC0659rl.f6878j[i40];
                        SparseArray sparseArray6 = sparseArray;
                        View view = (View) sparseArray6.get(i41);
                        if (view == null && (iM4376d = abstractC0659rl.m4376d(constraintLayout, (str = (String) map4.get(Integer.valueOf(i41))))) != 0) {
                            abstractC0659rl.f6878j[i40] = iM4376d;
                            map4.put(Integer.valueOf(iM4376d), str);
                            view = (View) sparseArray6.get(iM4376d);
                        }
                        if (view != null) {
                            C0205fb c0205fb3 = abstractC0659rl.f6881m;
                            C0143dm c0143dmM386h2 = constraintLayout.m386h(view);
                            c0205fb3.getClass();
                            if (c0143dmM386h2 != c0205fb3 && c0143dmM386h2 != null) {
                                int i42 = c0205fb3.f2367q0 + 1;
                                C0143dm[] c0143dmArr = c0205fb3.f2366p0;
                                if (i42 > c0143dmArr.length) {
                                    c0205fb3.f2366p0 = (C0143dm[]) Arrays.copyOf(c0143dmArr, c0143dmArr.length * 2);
                                }
                                C0143dm[] c0143dmArr2 = c0205fb3.f2366p0;
                                int i43 = c0205fb3.f2367q0;
                                c0143dmArr2[i43] = c0143dmM386h2;
                                c0205fb3.f2367q0 = i43 + 1;
                            }
                        }
                        i40++;
                        sparseArray = sparseArray6;
                    }
                    sparseArray2 = sparseArray;
                    abstractC0659rl.f6881m.getClass();
                }
                i39++;
                sparseArray = sparseArray2;
            }
        }
        int i44 = i;
        for (int i45 = 0; i45 < i44; i45++) {
            constraintLayout.getChildAt(i45);
        }
        SparseArray sparseArray7 = constraintLayout.f479w;
        sparseArray7.clear();
        sparseArray7.put(0, c0179em);
        sparseArray7.put(constraintLayout.getId(), c0179em);
        for (int i46 = 0; i46 < i44; i46++) {
            View childAt3 = constraintLayout.getChildAt(i46);
            sparseArray7.put(childAt3.getId(), constraintLayout.m386h(childAt3));
        }
        int i47 = 0;
        while (i47 < i44) {
            View childAt4 = constraintLayout.getChildAt(i47);
            C0143dm c0143dmM386h3 = constraintLayout.m386h(childAt4);
            if (c0143dmM386h3 == null) {
                c = c2;
            } else {
                C0733tl c0733tl2 = (C0733tl) childAt4.getLayoutParams();
                c0179em.f2132p0.add(c0143dmM386h3);
                C0143dm c0143dm10 = c0143dmM386h3.f1699S;
                if (c0143dm10 != null) {
                    ((C0179em) c0143dm10).f2132p0.remove(c0143dmM386h3);
                    c0143dmM386h3.mo1237A();
                }
                c0143dmM386h3.f1699S = c0179em;
                c0733tl2.m4793a();
                c0143dmM386h3.f1718f0 = childAt4.getVisibility();
                c0143dmM386h3.f1716e0 = childAt4;
                if (childAt4 instanceof AbstractC0659rl) {
                    boolean z6 = c0179em.f2137u0;
                    C0168eb c0168eb3 = (C0168eb) ((AbstractC0659rl) childAt4);
                    int i48 = c0168eb3.f2048q;
                    c0168eb3.f2049r = i48;
                    if (z6) {
                        if (i48 == 5) {
                            c0168eb3.f2049r = 1;
                        } else if (i48 == 6) {
                            c0168eb3.f2049r = 0;
                        }
                    } else if (i48 == 5) {
                        c0168eb3.f2049r = 0;
                    } else if (i48 == 6) {
                        c0168eb3.f2049r = 1;
                    }
                    if (c0143dmM386h3 instanceof C0205fb) {
                        ((C0205fb) c0143dmM386h3).f2368r0 = c0168eb3.f2049r;
                    }
                }
                if (c0733tl2.f7494d0) {
                    ea0 ea0Var = (ea0) c0143dmM386h3;
                    int i49 = c0733tl2.f7512m0;
                    int i50 = c0733tl2.f7514n0;
                    float f4 = c0733tl2.f7516o0;
                    if (f4 == -1.0f) {
                        b = -1;
                        if (i49 != -1) {
                            if (i49 > -1) {
                                ea0Var.f2037p0 = -1.0f;
                                ea0Var.f2038q0 = i49;
                                ea0Var.f2039r0 = -1;
                            }
                        } else if (i50 != -1 && i50 > -1) {
                            ea0Var.f2037p0 = -1.0f;
                            ea0Var.f2038q0 = -1;
                            ea0Var.f2039r0 = i50;
                            c = c2;
                        }
                        c = c2;
                    } else if (f4 > -1.0f) {
                        ea0Var.f2037p0 = f4;
                        b = -1;
                        ea0Var.f2038q0 = -1;
                        ea0Var.f2039r0 = -1;
                        c = c2;
                    } else {
                        c = c2;
                    }
                } else {
                    int i51 = c0733tl2.f7498f0;
                    int i52 = c0733tl2.f7500g0;
                    int i53 = c0733tl2.f7502h0;
                    int i54 = c0733tl2.f7504i0;
                    int i55 = c0733tl2.f7506j0;
                    int i56 = c0733tl2.f7508k0;
                    float f5 = c0733tl2.f7510l0;
                    int i57 = c0733tl2.f7517p;
                    if (i57 != -1) {
                        C0143dm c0143dm11 = (C0143dm) sparseArray7.get(i57);
                        if (c0143dm11 != null) {
                            float f6 = c0733tl2.f7520r;
                            c0143dmM386h3.m1265t(7, 7, c0733tl2.f7519q, 0, c0143dm11);
                            c0143dmM386h3.f1684D = f6;
                        }
                        c0143dm5 = c0143dmM386h3;
                        i19 = 4;
                        i20 = 2;
                        i14 = 5;
                        i22 = 3;
                    } else {
                        if (i51 != -1) {
                            C0143dm c0143dm12 = (C0143dm) sparseArray7.get(i51);
                            if (c0143dm12 != null) {
                                i3 = i56;
                                f = f5;
                                i2 = i54;
                                i4 = 2;
                                c0143dmM386h3.m1265t(2, 2, ((ViewGroup.MarginLayoutParams) c0733tl2).leftMargin, i55, c0143dm12);
                            } else {
                                i2 = i54;
                                i3 = i56;
                                f = f5;
                                i4 = 2;
                            }
                        } else {
                            i2 = i54;
                            i3 = i56;
                            i4 = 2;
                            if (i52 == -1 || (c0143dm = (C0143dm) sparseArray7.get(i52)) == null) {
                                f = f5;
                            } else {
                                f = f5;
                                c0143dmM386h3.m1265t(2, 4, ((ViewGroup.MarginLayoutParams) c0733tl2).leftMargin, i55, c0143dm);
                                i5 = 2;
                                i6 = 4;
                            }
                            if (i53 != -1) {
                                c0143dm8 = (C0143dm) sparseArray7.get(i53);
                                if (c0143dm8 != null) {
                                    c0143dmM386h3.m1265t(i6, i5, ((ViewGroup.MarginLayoutParams) c0733tl2).rightMargin, i3, c0143dm8);
                                }
                                i7 = i5;
                            } else {
                                i7 = i5;
                                i8 = i3;
                                if (i2 != -1 && (c0143dm2 = (C0143dm) sparseArray7.get(i2)) != null) {
                                    c0143dmM386h3.m1265t(i6, i6, ((ViewGroup.MarginLayoutParams) c0733tl2).rightMargin, i8, c0143dm2);
                                }
                            }
                            i9 = i6;
                            i10 = c0733tl2.f7503i;
                            if (i10 != -1) {
                                c0143dm7 = (C0143dm) sparseArray7.get(i10);
                                if (c0143dm7 != null) {
                                    i24 = 3;
                                    c0143dmM386h3.m1265t(3, 3, ((ViewGroup.MarginLayoutParams) c0733tl2).topMargin, c0733tl2.f7526x, c0143dm7);
                                } else {
                                    i24 = 3;
                                }
                                i13 = i24;
                                i14 = 5;
                                i12 = -1;
                            } else {
                                i11 = c0733tl2.f7505j;
                                if (i11 != -1 || (c0143dm3 = (C0143dm) sparseArray7.get(i11)) == null) {
                                    i12 = -1;
                                    i13 = 3;
                                    i14 = 5;
                                } else {
                                    i12 = -1;
                                    c0143dmM386h3.m1265t(3, 5, ((ViewGroup.MarginLayoutParams) c0733tl2).topMargin, c0733tl2.f7526x, c0143dm3);
                                    i13 = 3;
                                    i14 = 5;
                                }
                            }
                            i15 = c0733tl2.f7507k;
                            if (i15 != i12) {
                                c0143dm6 = (C0143dm) sparseArray7.get(i15);
                                if (c0143dm6 != null) {
                                    c0143dmM386h3.m1265t(i14, i13, ((ViewGroup.MarginLayoutParams) c0733tl2).bottomMargin, c0733tl2.f7528z, c0143dm6);
                                }
                                i16 = i13;
                            } else {
                                i16 = i13;
                                i17 = c0733tl2.f7509l;
                                if (i17 != i12 && (c0143dm4 = (C0143dm) sparseArray7.get(i17)) != null) {
                                    c0143dmM386h3.m1265t(i14, i14, ((ViewGroup.MarginLayoutParams) c0733tl2).bottomMargin, c0733tl2.f7528z, c0143dm4);
                                }
                            }
                            f2 = f;
                            i18 = c0733tl2.f7511m;
                            if (i18 != -1) {
                                i20 = i7;
                                i19 = i9;
                                c0143dm5 = c0143dmM386h3;
                                constraintLayout.m388j(c0143dm5, c0733tl2, sparseArray7, i18, 6);
                                i22 = i16;
                            } else {
                                i19 = i9;
                                c0143dm5 = c0143dmM386h3;
                                i20 = i7;
                                i21 = c0733tl2.f7513n;
                                if (i21 != -1) {
                                    int i58 = i16;
                                    m388j(c0143dm5, c0733tl2, sparseArray7, i21, i58);
                                    i22 = i58;
                                } else {
                                    i22 = i16;
                                    i23 = c0733tl2.f7515o;
                                    if (i23 != -1) {
                                        m388j(c0143dm5, c0733tl2, sparseArray7, i23, i14);
                                    }
                                }
                            }
                            if (f2 >= 0.0f) {
                                c0143dm5.f1712c0 = f2;
                            }
                            f3 = c0733tl2.f7466F;
                            if (f3 >= 0.0f) {
                                c0143dm5.f1714d0 = f3;
                            }
                        }
                        i5 = i4;
                        i6 = 4;
                        if (i53 != -1) {
                            c0143dm8 = (C0143dm) sparseArray7.get(i53);
                            if (c0143dm8 != null) {
                                c0143dmM386h3.m1265t(i6, i5, ((ViewGroup.MarginLayoutParams) c0733tl2).rightMargin, i3, c0143dm8);
                            }
                            i7 = i5;
                        } else {
                            i7 = i5;
                            i8 = i3;
                            if (i2 != -1) {
                                c0143dmM386h3.m1265t(i6, i6, ((ViewGroup.MarginLayoutParams) c0733tl2).rightMargin, i8, c0143dm2);
                            }
                        }
                        i9 = i6;
                        i10 = c0733tl2.f7503i;
                        if (i10 != -1) {
                            c0143dm7 = (C0143dm) sparseArray7.get(i10);
                            if (c0143dm7 != null) {
                                i24 = 3;
                                c0143dmM386h3.m1265t(3, 3, ((ViewGroup.MarginLayoutParams) c0733tl2).topMargin, c0733tl2.f7526x, c0143dm7);
                            } else {
                                i24 = 3;
                            }
                            i13 = i24;
                            i14 = 5;
                            i12 = -1;
                        } else {
                            i11 = c0733tl2.f7505j;
                            if (i11 != -1) {
                                i12 = -1;
                                i13 = 3;
                                i14 = 5;
                            } else {
                                i12 = -1;
                                i13 = 3;
                                i14 = 5;
                            }
                        }
                        i15 = c0733tl2.f7507k;
                        if (i15 != i12) {
                            c0143dm6 = (C0143dm) sparseArray7.get(i15);
                            if (c0143dm6 != null) {
                                c0143dmM386h3.m1265t(i14, i13, ((ViewGroup.MarginLayoutParams) c0733tl2).bottomMargin, c0733tl2.f7528z, c0143dm6);
                            }
                            i16 = i13;
                        } else {
                            i16 = i13;
                            i17 = c0733tl2.f7509l;
                            if (i17 != i12) {
                                c0143dmM386h3.m1265t(i14, i14, ((ViewGroup.MarginLayoutParams) c0733tl2).bottomMargin, c0733tl2.f7528z, c0143dm4);
                            }
                        }
                        f2 = f;
                        i18 = c0733tl2.f7511m;
                        if (i18 != -1) {
                            i20 = i7;
                            i19 = i9;
                            c0143dm5 = c0143dmM386h3;
                            constraintLayout.m388j(c0143dm5, c0733tl2, sparseArray7, i18, 6);
                            i22 = i16;
                        } else {
                            i19 = i9;
                            c0143dm5 = c0143dmM386h3;
                            i20 = i7;
                            i21 = c0733tl2.f7513n;
                            if (i21 != -1) {
                                int i59 = i16;
                                m388j(c0143dm5, c0733tl2, sparseArray7, i21, i59);
                                i22 = i59;
                            } else {
                                i22 = i16;
                                i23 = c0733tl2.f7515o;
                                if (i23 != -1) {
                                    m388j(c0143dm5, c0733tl2, sparseArray7, i23, i14);
                                }
                            }
                        }
                        if (f2 >= 0.0f) {
                            c0143dm5.f1712c0 = f2;
                        }
                        f3 = c0733tl2.f7466F;
                        if (f3 >= 0.0f) {
                            c0143dm5.f1714d0 = f3;
                        }
                    }
                    if (z3 && ((i28 = c0733tl2.f7480T) != -1 || c0733tl2.f7481U != -1)) {
                        int i60 = c0733tl2.f7481U;
                        c0143dm5.f1704X = i28;
                        c0143dm5.f1705Y = i60;
                    }
                    if (c0733tl2.f7488a0) {
                        c0143dm5.m1243I(1);
                        c0143dm5.m1245K(((ViewGroup.MarginLayoutParams) c0733tl2).width);
                        if (((ViewGroup.MarginLayoutParams) c0733tl2).width == -2) {
                            c0143dm5.m1243I(2);
                        }
                    } else if (((ViewGroup.MarginLayoutParams) c0733tl2).width == -1) {
                        if (c0733tl2.f7483W) {
                            c0143dm5.m1243I(3);
                        } else {
                            c0143dm5.m1243I(4);
                        }
                        c0143dm5.mo1254g(i20).f6198g = ((ViewGroup.MarginLayoutParams) c0733tl2).leftMargin;
                        c0143dm5.mo1254g(i19).f6198g = ((ViewGroup.MarginLayoutParams) c0733tl2).rightMargin;
                    } else {
                        c0143dm5.m1243I(3);
                        c0143dm5.m1245K(0);
                    }
                    if (c0733tl2.f7490b0) {
                        i25 = -1;
                        c0143dm5.m1244J(1);
                        c0143dm5.m1242H(((ViewGroup.MarginLayoutParams) c0733tl2).height);
                        if (((ViewGroup.MarginLayoutParams) c0733tl2).height == -2) {
                            c0143dm5.m1244J(2);
                        }
                    } else {
                        i25 = -1;
                        if (((ViewGroup.MarginLayoutParams) c0733tl2).height == -1) {
                            if (c0733tl2.f7484X) {
                                c0143dm5.m1244J(3);
                            } else {
                                c0143dm5.m1244J(4);
                            }
                            c0143dm5.mo1254g(i22).f6198g = ((ViewGroup.MarginLayoutParams) c0733tl2).topMargin;
                            c0143dm5.mo1254g(i14).f6198g = ((ViewGroup.MarginLayoutParams) c0733tl2).bottomMargin;
                        } else {
                            c0143dm5.m1244J(3);
                            c0143dm5.m1242H(0);
                        }
                    }
                    String str5 = c0733tl2.f7467G;
                    if (str5 == null || str5.length() == 0) {
                        c0143dm5.f1702V = 0.0f;
                    } else {
                        int length = str5.length();
                        int iIndexOf3 = str5.indexOf(44);
                        if (iIndexOf3 <= 0 || iIndexOf3 >= length - 1) {
                            i26 = i25;
                            i27 = 0;
                        } else {
                            String strSubstring = str5.substring(0, iIndexOf3);
                            i26 = strSubstring.equalsIgnoreCase("W") ? 0 : strSubstring.equalsIgnoreCase("H") ? 1 : i25;
                            i27 = iIndexOf3 + 1;
                        }
                        int iIndexOf4 = str5.indexOf(58);
                        if (iIndexOf4 < 0 || iIndexOf4 >= length - 1) {
                            String strSubstring2 = str5.substring(i27);
                            if (strSubstring2.length() > 0) {
                                fAbs = Float.parseFloat(strSubstring2);
                            } else {
                                fAbs = 0.0f;
                            }
                        } else {
                            String strSubstring3 = str5.substring(i27, iIndexOf4);
                            String strSubstring4 = str5.substring(iIndexOf4 + 1);
                            if (strSubstring3.length() <= 0 || strSubstring4.length() <= 0) {
                                fAbs = 0.0f;
                            } else {
                                try {
                                    float f7 = Float.parseFloat(strSubstring3);
                                    float f8 = Float.parseFloat(strSubstring4);
                                    if (f7 <= 0.0f || f8 <= 0.0f) {
                                        fAbs = 0.0f;
                                    } else {
                                        fAbs = i26 == 1 ? Math.abs(f8 / f7) : Math.abs(f7 / f8);
                                    }
                                } catch (NumberFormatException unused3) {
                                }
                            }
                        }
                        if (fAbs > 0.0f) {
                            c0143dm5.f1702V = fAbs;
                            c0143dm5.f1703W = i26;
                        }
                    }
                    float f9 = c0733tl2.f7468H;
                    float[] fArr = c0143dm5.f1726j0;
                    fArr[0] = f9;
                    fArr[1] = c0733tl2.f7469I;
                    c0143dm5.f1722h0 = c0733tl2.f7470J;
                    c0143dm5.f1724i0 = c0733tl2.f7471K;
                    int i61 = c0733tl2.f7486Z;
                    if (i61 >= 0 && i61 <= 3) {
                        c0143dm5.f1738q = i61;
                    }
                    int i62 = c0733tl2.f7472L;
                    int i63 = c0733tl2.f7474N;
                    int i64 = c0733tl2.f7476P;
                    float f10 = c0733tl2.f7478R;
                    c0143dm5.f1739r = i62;
                    c0143dm5.f1742u = i63;
                    if (i64 == Integer.MAX_VALUE) {
                        i64 = 0;
                    }
                    c0143dm5.f1743v = i64;
                    c0143dm5.f1744w = f10;
                    if (f10 > 0.0f && f10 < 1.0f && i62 == 0) {
                        c0143dm5.f1739r = 2;
                    }
                    int i65 = c0733tl2.f7473M;
                    int i66 = c0733tl2.f7475O;
                    int i67 = c0733tl2.f7477Q;
                    float f11 = c0733tl2.f7479S;
                    c0143dm5.f1740s = i65;
                    c0143dm5.f1745x = i66;
                    if (i67 == Integer.MAX_VALUE) {
                        i67 = 0;
                    }
                    c0143dm5.f1746y = i67;
                    c0143dm5.f1747z = f11;
                    if (f11 <= 0.0f || f11 >= 1.0f || i65 != 0) {
                        c = 2;
                    } else {
                        c = 2;
                        c0143dm5.f1740s = 2;
                    }
                }
            }
            i47++;
            constraintLayout = this;
            c2 = c;
        }
        return z2;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int childCount = getChildCount();
        boolean zIsInEditMode = isInEditMode();
        for (int i5 = 0; i5 < childCount; i5++) {
            View childAt = getChildAt(i5);
            C0733tl c0733tl = (C0733tl) childAt.getLayoutParams();
            C0143dm c0143dm = c0733tl.f7518p0;
            if (childAt.getVisibility() != 8 || c0733tl.f7494d0 || c0733tl.f7496e0 || zIsInEditMode) {
                int iM1261p = c0143dm.m1261p();
                int iM1262q = c0143dm.m1262q();
                childAt.layout(iM1261p, iM1262q, c0143dm.m1260o() + iM1261p, c0143dm.m1256i() + iM1262q);
            }
        }
        ArrayList arrayList = this.f467k;
        int size = arrayList.size();
        if (size > 0) {
            for (int i6 = 0; i6 < size; i6++) {
                ((AbstractC0659rl) arrayList.get(i6)).getClass();
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:102:0x021b  */
    /* JADX WARN: Code duplicated, block: B:117:0x0246 A[PHI: r5 r9
      0x0246: PHI (r5v12 int) = (r5v11 int), (r5v67 int) binds: [B:85:0x01e2, B:385:0x0246] A[DONT_GENERATE, DONT_INLINE]
      0x0246: PHI (r9v5 boolean) = (r9v4 boolean), (r9v26 boolean) binds: [B:85:0x01e2, B:385:0x0246] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:125:0x0259  */
    /* JADX WARN: Code duplicated, block: B:131:0x027d  */
    /* JADX WARN: Code duplicated, block: B:133:0x0281  */
    /* JADX WARN: Code duplicated, block: B:135:0x0287  */
    /* JADX WARN: Code duplicated, block: B:137:0x028f  */
    /* JADX WARN: Code duplicated, block: B:181:0x038a  */
    /* JADX WARN: Code duplicated, block: B:183:0x03a6  */
    /* JADX WARN: Code duplicated, block: B:185:0x03a9  */
    /* JADX WARN: Code duplicated, block: B:189:0x03ca  */
    /* JADX WARN: Code duplicated, block: B:197:0x03e6  */
    /* JADX WARN: Code duplicated, block: B:219:0x0424  */
    /* JADX WARN: Code duplicated, block: B:221:0x0430  */
    /* JADX WARN: Code duplicated, block: B:223:0x0439 A[LOOP:12: B:222:0x0437->B:223:0x0439, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:225:0x0482  */
    /* JADX WARN: Code duplicated, block: B:228:0x049e  */
    /* JADX WARN: Code duplicated, block: B:229:0x04a4  */
    /* JADX WARN: Code duplicated, block: B:231:0x04a8  */
    /* JADX WARN: Code duplicated, block: B:233:0x04b2 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:234:0x04b4  */
    /* JADX WARN: Code duplicated, block: B:235:0x04b6  */
    /* JADX WARN: Code duplicated, block: B:237:0x04b9  */
    /* JADX WARN: Code duplicated, block: B:238:0x04bb  */
    /* JADX WARN: Code duplicated, block: B:240:0x04c0  */
    /* JADX WARN: Code duplicated, block: B:244:0x04cd  */
    /* JADX WARN: Code duplicated, block: B:246:0x04d1  */
    /* JADX WARN: Code duplicated, block: B:248:0x04e2  */
    /* JADX WARN: Code duplicated, block: B:250:0x04ee  */
    /* JADX WARN: Code duplicated, block: B:251:0x04f1  */
    /* JADX WARN: Code duplicated, block: B:256:0x04fb  */
    /* JADX WARN: Code duplicated, block: B:267:0x051d  */
    /* JADX WARN: Code duplicated, block: B:273:0x0529  */
    /* JADX WARN: Code duplicated, block: B:275:0x052c  */
    /* JADX WARN: Code duplicated, block: B:297:0x055d  */
    /* JADX WARN: Code duplicated, block: B:300:0x0561  */
    /* JADX WARN: Code duplicated, block: B:304:0x0574 A[LOOP:5: B:303:0x0572->B:304:0x0574, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:307:0x0580  */
    /* JADX WARN: Code duplicated, block: B:309:0x0583 A[LOOP:6: B:308:0x0581->B:309:0x0583, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:312:0x0599  */
    /* JADX WARN: Code duplicated, block: B:314:0x059e  */
    /* JADX WARN: Code duplicated, block: B:316:0x05a5  */
    /* JADX WARN: Code duplicated, block: B:318:0x05a9  */
    /* JADX WARN: Code duplicated, block: B:321:0x05af  */
    /* JADX WARN: Code duplicated, block: B:322:0x05b1  */
    /* JADX WARN: Code duplicated, block: B:325:0x05c9 A[LOOP:7: B:324:0x05c7->B:325:0x05c9, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:329:0x05db  */
    /* JADX WARN: Code duplicated, block: B:331:0x05e0  */
    /* JADX WARN: Code duplicated, block: B:333:0x05ea  */
    /* JADX WARN: Code duplicated, block: B:334:0x05ed  */
    /* JADX WARN: Code duplicated, block: B:340:0x05fb A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:345:0x060d A[PHI: r21
      0x060d: PHI (r21v3 int) = (r21v1 int), (r21v1 int), (r21v4 int) binds: [B:338:0x05f8, B:344:0x060b, B:333:0x05ea] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:348:0x0628  */
    /* JADX WARN: Code duplicated, block: B:351:0x063e  */
    /* JADX WARN: Code duplicated, block: B:353:0x0643  */
    /* JADX WARN: Code duplicated, block: B:356:0x0662  */
    /* JADX WARN: Code duplicated, block: B:358:0x0665  */
    /* JADX WARN: Code duplicated, block: B:360:0x0668  */
    /* JADX WARN: Code duplicated, block: B:362:0x066d  */
    /* JADX WARN: Code duplicated, block: B:368:0x0690  */
    /* JADX WARN: Code duplicated, block: B:374:0x06af A[LOOP:8: B:327:0x05d8->B:374:0x06af, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:378:0x06ff  */
    /* JADX WARN: Code duplicated, block: B:380:0x0702  */
    /* JADX WARN: Code duplicated, block: B:385:0x0246 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:396:0x0417 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:412:0x0565 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:417:0x06bd A[EDGE_INSN: B:417:0x06bd->B:375:0x06bd BREAK  A[LOOP:8: B:327:0x05d8->B:374:0x06af], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:421:0x0695 A[ADDED_TO_REGION, REMOVE, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:47:0x0120 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:48:0x0122  */
    /* JADX WARN: Code duplicated, block: B:50:0x0126  */
    /* JADX WARN: Code duplicated, block: B:51:0x012b  */
    /* JADX WARN: Code duplicated, block: B:52:0x0137 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:53:0x0139  */
    /* JADX WARN: Code duplicated, block: B:55:0x0146  */
    /* JADX WARN: Code duplicated, block: B:57:0x014b  */
    /* JADX WARN: Code duplicated, block: B:59:0x014e  */
    /* JADX WARN: Code duplicated, block: B:60:0x0155  */
    /* JADX WARN: Code duplicated, block: B:65:0x0169  */
    /* JADX WARN: Code duplicated, block: B:71:0x019e  */
    /* JADX WARN: Code duplicated, block: B:72:0x01a1  */
    /* JADX WARN: Code duplicated, block: B:75:0x01a9  */
    /* JADX WARN: Code duplicated, block: B:76:0x01ac  */
    /* JADX WARN: Code duplicated, block: B:83:0x01df  */
    /* JADX WARN: Code duplicated, block: B:86:0x01e4  */
    /* JADX WARN: Code duplicated, block: B:88:0x01e7  */
    /* JADX WARN: Code duplicated, block: B:90:0x0200  */
    /* JADX WARN: Code duplicated, block: B:92:0x0205  */
    /* JADX WARN: Code duplicated, block: B:95:0x020c  */
    /* JADX WARN: Code duplicated, block: B:96:0x020e  */
    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        int i3;
        int iMax;
        int i4;
        int i5;
        int iMax2;
        int i6;
        int iM1260o;
        int[] iArr;
        char c;
        int i7;
        int i8;
        C0179em c0179em;
        ArrayList arrayList;
        C0770ul c0770ul;
        int size;
        int iM1260o2;
        int iM1256i;
        boolean zM134r;
        boolean z;
        int i9;
        boolean z2;
        int i10;
        boolean z3;
        ArrayList arrayList2;
        C0770ul c0770ul2;
        boolean zM1461P;
        int i11;
        int size2;
        int[] iArr2;
        boolean z4;
        boolean z5;
        int iMax3;
        int i12;
        ArrayList arrayList3;
        int i13;
        int i14;
        int iMax4;
        int i15;
        boolean z6;
        int i16;
        boolean z7;
        int i17;
        boolean z8;
        C0143dm c0143dm;
        int i18;
        int iM1260o3;
        int iM1256i2;
        boolean z9;
        boolean z10;
        int i19;
        boolean zM4084v;
        int iM1260o4;
        int iM1256i3;
        int size3;
        boolean zM1463S;
        C0770ul c0770ul3;
        int i20;
        ConstraintLayout constraintLayout;
        int childCount;
        ArrayList arrayList4;
        int i21;
        int size4;
        int i22;
        C0143dm c0143dm2;
        int iM1255h;
        boolean z11;
        gb0 gb0Var;
        mh1 mh1Var;
        boolean z12;
        boolean z13;
        int iMin;
        int iMin2;
        int iMin3;
        boolean z14;
        int i23;
        C0179em c0179em2;
        int i24;
        int i25;
        ArrayList arrayList5;
        int size5;
        int i26;
        boolean z15;
        boolean z16;
        int i27;
        int i28;
        int i29;
        int i30;
        int i31;
        boolean z17;
        int size6;
        int i32;
        int size7;
        int i33;
        boolean z18;
        bj1 bj1Var;
        bj1 bj1Var2;
        int i34;
        C0143dm c0143dm3;
        boolean z19;
        int[] iArr3;
        int i35;
        boolean z20;
        boolean z21;
        boolean z22;
        boolean z23 = this.f473q;
        this.f473q = z23;
        if (!z23) {
            int childCount2 = getChildCount();
            for (int i36 = 0; i36 < childCount2; i36++) {
                if (getChildAt(i36).isLayoutRequested()) {
                    this.f473q = true;
                    break;
                }
            }
        }
        boolean z24 = (getContext().getApplicationInfo().flags & 4194304) != 0 && 1 == getLayoutDirection();
        C0179em c0179em3 = this.f468l;
        c0179em3.f2137u0 = z24;
        qd0 qd0Var = c0179em3.f2133q0;
        C0592ps c0592ps = c0179em3.f2134r0;
        if (this.f473q) {
            this.f473q = false;
            if (m389k()) {
                qd0Var.m4071C(c0179em3);
            }
        }
        c0179em3.f2138v0.getClass();
        int i37 = this.f474r;
        int mode = View.MeasureSpec.getMode(i);
        int size8 = View.MeasureSpec.getSize(i);
        int mode2 = View.MeasureSpec.getMode(i2);
        int size9 = View.MeasureSpec.getSize(i2);
        int iMax5 = Math.max(0, getPaddingTop());
        int iMax6 = Math.max(0, getPaddingBottom());
        int i38 = iMax5 + iMax6;
        int paddingWidth = getPaddingWidth();
        C0770ul c0770ul4 = this.f480x;
        c0770ul4.f7843b = iMax5;
        c0770ul4.f7844c = iMax6;
        c0770ul4.f7845d = paddingWidth;
        c0770ul4.f7846e = i38;
        c0770ul4.f7847f = i;
        c0770ul4.f7848g = i2;
        int iMax7 = Math.max(0, getPaddingStart());
        int iMax8 = Math.max(0, getPaddingEnd());
        if (iMax7 <= 0 && iMax8 <= 0) {
            iMax7 = Math.max(0, getPaddingLeft());
        } else if ((getContext().getApplicationInfo().flags & 4194304) != 0 && 1 == getLayoutDirection()) {
            iMax7 = iMax8;
        }
        int i39 = size8 - paddingWidth;
        int i40 = size9 - i38;
        int i41 = c0770ul4.f7846e;
        int i42 = c0770ul4.f7845d;
        int childCount3 = getChildCount();
        if (mode != Integer.MIN_VALUE) {
            if (mode != 0) {
                if (mode != 1073741824) {
                    i3 = i42;
                    i4 = Integer.MIN_VALUE;
                    i5 = 1;
                    iMax = 0;
                } else {
                    i3 = i42;
                    i4 = Integer.MIN_VALUE;
                    iMax = Math.min(this.f471o - i42, i39);
                    i5 = 1;
                }
            } else if (childCount3 == 0) {
                i3 = i42;
                iMax = Math.max(0, this.f469m);
            } else {
                i3 = i42;
                iMax = 0;
            }
            if (mode2 != i4) {
                if (childCount3 == 0) {
                    iMax2 = Math.max(0, this.f470n);
                } else {
                    iMax2 = i40;
                }
                i6 = 2;
            } else if (mode2 != 0) {
                if (childCount3 == 0) {
                    iMax2 = Math.max(0, this.f470n);
                } else {
                    iMax2 = 0;
                }
                i6 = 2;
            } else if (mode2 != 1073741824) {
                c0770ul4 = c0770ul4;
                i6 = 1;
                iMax2 = 0;
            } else {
                iMax2 = Math.min(this.f472p - i41, i40);
                c0770ul4 = c0770ul4;
                i6 = 1;
            }
            iM1260o = c0179em3.m1260o();
            iArr = c0179em3.f1683C;
            if (iMax == iM1260o || iMax2 != c0179em3.m1256i()) {
                c0592ps.f6237c = true;
                c = 1;
            } else {
                c = 1;
            }
            c0179em3.f1704X = 0;
            c0179em3.f1705Y = 0;
            iArr[0] = this.f471o - i3;
            iArr[c] = this.f472p - i41;
            c0179em3.f1708a0 = 0;
            c0179em3.f1710b0 = 0;
            c0179em3.m1243I(i5);
            c0179em3.m1245K(iMax);
            c0179em3.m1244J(i6);
            c0179em3.m1242H(iMax2);
            i7 = this.f469m - i3;
            if (i7 < 0) {
                c0179em3.f1708a0 = 0;
            } else {
                c0179em3.f1708a0 = i7;
            }
            i8 = this.f470n - i41;
            if (i8 < 0) {
                c0179em3.f1710b0 = 0;
            } else {
                c0179em3.f1710b0 = i8;
            }
            c0179em3.f2139w0 = iMax7;
            c0179em3.f2140x0 = iMax5;
            c0179em = (C0179em) qd0Var.f6473m;
            arrayList = (ArrayList) qd0Var.f6471k;
            c0770ul = c0179em3.f2136t0;
            size = c0179em3.f2132p0.size();
            iM1260o2 = c0179em3.m1260o();
            iM1256i = c0179em3.m1256i();
            zM134r = a90.m134r(i37, 128);
            if (!zM134r || a90.m134r(i37, 64)) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                i34 = 0;
                while (true) {
                    if (i34 < size) {
                        i9 = size;
                        c0143dm3 = (C0143dm) c0179em3.f2132p0.get(i34);
                        z19 = z;
                        iArr3 = c0143dm3.f1736o0;
                        i35 = i34;
                        if (iArr3[0] == 3) {
                            z20 = true;
                        } else {
                            z20 = false;
                        }
                        if (iArr3[1] == 3) {
                            z21 = true;
                        } else {
                            z21 = false;
                        }
                        if (z20 || !z21 || c0143dm3.f1702V <= 0.0f) {
                            z22 = false;
                        } else {
                            z22 = true;
                        }
                        if ((c0143dm3.m1267v() || !z22) && !((c0143dm3.m1268w() && z22) || c0143dm3.m1267v() || c0143dm3.m1268w())) {
                            i34 = i35 + 1;
                            size = i9;
                            z = z19;
                        } else {
                            i10 = 1073741824;
                            z2 = false;
                        }
                    } else {
                        i9 = size;
                        z2 = z;
                        i10 = 1073741824;
                    }
                }
            } else {
                i9 = size;
                z2 = z;
                i10 = 1073741824;
            }
            z3 = z2 & ((mode != i10 && mode2 == i10) || zM134r);
            if (z3) {
                int iMin4 = Math.min(iArr[0], i39);
                iMin3 = Math.min(iArr[1], i40);
                if (mode == 1073741824 || c0179em3.m1260o() == iMin4) {
                    z14 = true;
                } else {
                    c0179em3.m1245K(iMin4);
                    z14 = true;
                    c0592ps.f6236b = true;
                }
                if (mode2 == 1073741824) {
                    if (c0179em3.m1256i() != iMin3) {
                        c0179em3.m1242H(iMin3);
                        c0592ps.f6236b = z14;
                    }
                    i23 = 1073741824;
                } else {
                    i23 = 1073741824;
                }
                if (mode == i23 || mode2 != i23) {
                    arrayList2 = arrayList;
                    c0770ul2 = c0770ul;
                    z3 = z3;
                    c0179em2 = c0592ps.f6235a;
                    if (c0592ps.f6236b) {
                        arrayList5 = c0179em2.f2132p0;
                        size5 = arrayList5.size();
                        i26 = 0;
                        while (i26 < size5) {
                            Object obj = arrayList5.get(i26);
                            i26++;
                            C0143dm c0143dm4 = (C0143dm) obj;
                            c0143dm4.m1253f();
                            c0143dm4.f1707a = false;
                            gb0 gb0Var2 = c0143dm4.f1713d;
                            ArrayList arrayList6 = arrayList5;
                            gb0Var2.f893e.f6581j = false;
                            gb0Var2.f895g = false;
                            gb0Var2.m2015n();
                            mh1 mh1Var2 = c0143dm4.f1715e;
                            mh1Var2.f893e.f6581j = false;
                            mh1Var2.f895g = false;
                            mh1Var2.m3385m();
                            arrayList5 = arrayList6;
                        }
                        i24 = 0;
                        c0179em2.m1253f();
                        c0179em2.f1707a = false;
                        gb0 gb0Var3 = c0179em2.f1713d;
                        gb0Var3.f893e.f6581j = false;
                        gb0Var3.f895g = false;
                        gb0Var3.m2015n();
                        mh1 mh1Var3 = c0179em2.f1715e;
                        mh1Var3.f893e.f6581j = false;
                        mh1Var3.f895g = false;
                        mh1Var3.m3385m();
                        c0592ps.m3978c();
                    } else {
                        i24 = 0;
                    }
                    c0592ps.m3977b(c0592ps.f6238d);
                    c0179em2.f1704X = i24;
                    c0179em2.f1705Y = i24;
                    c0179em2.f1713d.f896h.mo759d(i24);
                    c0179em2.f1715e.f896h.mo759d(i24);
                    i25 = 1073741824;
                    if (mode == 1073741824) {
                        zM1461P = c0179em3.m1461P(i24, zM134r);
                        i11 = 1;
                    } else {
                        zM1461P = true;
                        i11 = 0;
                    }
                    if (mode2 == 1073741824) {
                        zM1461P &= c0179em3.m1461P(1, zM134r);
                        i11++;
                    }
                } else {
                    ArrayList arrayList7 = c0592ps.f6239e;
                    C0179em c0179em4 = c0592ps.f6235a;
                    if (c0592ps.f6236b || c0592ps.f6237c) {
                        ArrayList arrayList8 = c0179em4.f2132p0;
                        int size10 = arrayList8.size();
                        int i43 = 0;
                        while (i43 < size10) {
                            Object obj2 = arrayList8.get(i43);
                            int i44 = i43 + 1;
                            C0143dm c0143dm5 = (C0143dm) obj2;
                            c0143dm5.m1253f();
                            c0143dm5.f1707a = false;
                            c0143dm5.f1713d.m2015n();
                            c0143dm5.f1715e.m3385m();
                            size10 = size10;
                            i43 = i44;
                        }
                        c0179em4.m1253f();
                        i27 = 0;
                        c0179em4.f1707a = false;
                        c0179em4.f1713d.m2015n();
                        c0179em4.f1715e.m3385m();
                        c0592ps.f6237c = false;
                    } else {
                        i27 = 0;
                    }
                    c0592ps.m3977b(c0592ps.f6238d);
                    c0179em4.f1704X = i27;
                    int[] iArr4 = c0179em4.f1736o0;
                    c0179em4.f1705Y = i27;
                    int iM1255h2 = c0179em4.m1255h(i27);
                    int iM1255h3 = c0179em4.m1255h(1);
                    if (c0592ps.f6236b) {
                        c0592ps.m3978c();
                    }
                    int iM1261p = c0179em4.m1261p();
                    c0770ul2 = c0770ul;
                    int iM1262q = c0179em4.m1262q();
                    arrayList2 = arrayList;
                    c0179em4.f1713d.f896h.mo759d(iM1261p);
                    c0179em4.f1715e.f896h.mo759d(iM1262q);
                    c0592ps.m3982g();
                    if (iM1255h2 == 2 || iM1255h3 == 2) {
                        if (zM134r) {
                            int size11 = arrayList7.size();
                            i28 = iM1262q;
                            int i45 = 0;
                            while (i45 < size11) {
                                Object obj3 = arrayList7.get(i45);
                                i45++;
                                if (!((bj1) obj3).mo713k()) {
                                    zM134r = false;
                                    break;
                                }
                            }
                        } else {
                            i28 = iM1262q;
                        }
                        if (zM134r && iM1255h2 == 2) {
                            c0179em4.m1243I(1);
                            c0179em4.m1245K(c0592ps.m3979d(c0179em4, 0));
                            c0179em4.f1713d.f893e.mo759d(c0179em4.m1260o());
                        }
                        if (zM134r && iM1255h3 == 2) {
                            i29 = 1;
                            c0179em4.m1244J(1);
                            c0179em4.m1242H(c0592ps.m3979d(c0179em4, 1));
                            c0179em4.f1715e.f893e.mo759d(c0179em4.m1256i());
                        }
                        i30 = iArr4[0];
                        if (i30 != i29 || i30 == 4) {
                            int iM1260o5 = c0179em4.m1260o() + iM1261p;
                            c0179em4.f1713d.f897i.mo759d(iM1260o5);
                            c0179em4.f1713d.f893e.mo759d(iM1260o5 - iM1261p);
                            c0592ps.m3982g();
                            i31 = iArr4[1];
                            if (i31 != 1 || i31 == 4) {
                                int iM1256i4 = c0179em4.m1256i() + i28;
                                c0179em4.f1715e.f897i.mo759d(iM1256i4);
                                c0179em4.f1715e.f893e.mo759d(iM1256i4 - i28);
                            }
                            c0592ps.m3982g();
                            z17 = true;
                        } else {
                            z17 = false;
                        }
                        size6 = arrayList7.size();
                        i32 = 0;
                        while (i32 < size6) {
                            Object obj4 = arrayList7.get(i32);
                            i32++;
                            bj1Var2 = (bj1) obj4;
                            if (bj1Var2.f890b == c0179em4 || bj1Var2.f895g) {
                                bj1Var2.mo709e();
                            }
                        }
                        size7 = arrayList7.size();
                        i33 = 0;
                        while (true) {
                            if (i33 < size7) {
                                z18 = true;
                                break;
                            }
                            Object obj5 = arrayList7.get(i33);
                            i33++;
                            bj1Var = (bj1) obj5;
                            if (!z17 || bj1Var.f890b != c0179em4) {
                                if (bj1Var.f896h.f6581j || ((!bj1Var.f897i.f6581j && !(bj1Var instanceof fa0)) || (!bj1Var.f893e.f6581j && !(bj1Var instanceof C0616qf) && !(bj1Var instanceof fa0)))) {
                                    z18 = false;
                                    break;
                                }
                            }
                        }
                        c0179em4.m1243I(iM1255h2);
                        c0179em4.m1244J(iM1255h3);
                        zM1461P = z18;
                        i11 = 2;
                        i25 = 1073741824;
                    } else {
                        i28 = iM1262q;
                    }
                    i29 = 1;
                    i30 = iArr4[0];
                    if (i30 != i29) {
                        int iM1260o6 = c0179em4.m1260o() + iM1261p;
                        c0179em4.f1713d.f897i.mo759d(iM1260o6);
                        c0179em4.f1713d.f893e.mo759d(iM1260o6 - iM1261p);
                        c0592ps.m3982g();
                        i31 = iArr4[1];
                        if (i31 != 1) {
                            int iM1256i5 = c0179em4.m1256i() + i28;
                            c0179em4.f1715e.f897i.mo759d(iM1256i5);
                            c0179em4.f1715e.f893e.mo759d(iM1256i5 - i28);
                        } else {
                            int iM1256i6 = c0179em4.m1256i() + i28;
                            c0179em4.f1715e.f897i.mo759d(iM1256i6);
                            c0179em4.f1715e.f893e.mo759d(iM1256i6 - i28);
                        }
                        c0592ps.m3982g();
                        z17 = true;
                    } else {
                        int iM1260o7 = c0179em4.m1260o() + iM1261p;
                        c0179em4.f1713d.f897i.mo759d(iM1260o7);
                        c0179em4.f1713d.f893e.mo759d(iM1260o7 - iM1261p);
                        c0592ps.m3982g();
                        i31 = iArr4[1];
                        if (i31 != 1) {
                            int iM1256i7 = c0179em4.m1256i() + i28;
                            c0179em4.f1715e.f897i.mo759d(iM1256i7);
                            c0179em4.f1715e.f893e.mo759d(iM1256i7 - i28);
                        } else {
                            int iM1256i8 = c0179em4.m1256i() + i28;
                            c0179em4.f1715e.f897i.mo759d(iM1256i8);
                            c0179em4.f1715e.f893e.mo759d(iM1256i8 - i28);
                        }
                        c0592ps.m3982g();
                        z17 = true;
                    }
                    size6 = arrayList7.size();
                    i32 = 0;
                    while (i32 < size6) {
                        Object obj6 = arrayList7.get(i32);
                        i32++;
                        bj1Var2 = (bj1) obj6;
                        if (bj1Var2.f890b == c0179em4) {
                        }
                        bj1Var2.mo709e();
                    }
                    size7 = arrayList7.size();
                    i33 = 0;
                    while (true) {
                        if (i33 < size7) {
                            z18 = true;
                            break;
                        }
                        Object obj7 = arrayList7.get(i33);
                        i33++;
                        bj1Var = (bj1) obj7;
                        if (!z17) {
                        }
                        if (bj1Var.f896h.f6581j) {
                        }
                        z18 = false;
                        break;
                    }
                    c0179em4.m1243I(iM1255h2);
                    c0179em4.m1244J(iM1255h3);
                    zM1461P = z18;
                    i11 = 2;
                    i25 = 1073741824;
                }
                if (zM1461P) {
                    if (mode == i25) {
                        z15 = true;
                    } else {
                        z15 = false;
                    }
                    if (mode2 == i25) {
                        z16 = true;
                    } else {
                        z16 = false;
                    }
                    c0179em3.mo1246L(z15, z16);
                }
            } else {
                arrayList2 = arrayList;
                c0770ul2 = c0770ul;
                z3 = z3;
                zM1461P = false;
                i11 = 0;
            }
            if (zM1461P || i11 != 2) {
                int i46 = c0179em3.f2123C0;
                if (i9 > 0) {
                    size3 = c0179em3.f2132p0.size();
                    zM1463S = c0179em3.m1463S(64);
                    c0770ul3 = c0179em3.f2136t0;
                    for (i20 = 0; i20 < size3; i20++) {
                        c0143dm2 = (C0143dm) c0179em3.f2132p0.get(i20);
                        if ((c0143dm2 instanceof ea0) && !(c0143dm2 instanceof C0205fb)) {
                            c0143dm2.getClass();
                            if (zM1463S || (gb0Var = c0143dm2.f1713d) == null || (mh1Var = c0143dm2.f1715e) == null || !gb0Var.f893e.f6581j || !mh1Var.f893e.f6581j) {
                                iM1255h = c0143dm2.m1255h(0);
                                int iM1255h4 = c0143dm2.m1255h(1);
                                if (iM1255h == 3 || c0143dm2.f1739r == 1 || iM1255h4 != 3 || c0143dm2.f1740s == 1) {
                                    z11 = false;
                                } else {
                                    z11 = true;
                                }
                                if (z11 && c0179em3.m1463S(1)) {
                                    if (iM1255h == 3 && c0143dm2.f1739r == 0 && iM1255h4 != 3 && !c0143dm2.m1267v()) {
                                        z11 = true;
                                    }
                                    if (iM1255h4 == 3 && c0143dm2.f1740s == 0 && iM1255h != 3 && !c0143dm2.m1267v()) {
                                        z11 = true;
                                    }
                                    if ((iM1255h == 3 || iM1255h4 == 3) && c0143dm2.f1702V > 0.0f) {
                                        z11 = true;
                                    }
                                }
                                if (!z11) {
                                    qd0Var.m4084v(0, c0770ul3, c0143dm2);
                                }
                            }
                        }
                    }
                    constraintLayout = c0770ul3.f7842a;
                    childCount = constraintLayout.getChildCount();
                    arrayList4 = constraintLayout.f467k;
                    for (i21 = 0; i21 < childCount; i21++) {
                        constraintLayout.getChildAt(i21);
                    }
                    size4 = arrayList4.size();
                    if (size4 > 0) {
                        for (i22 = 0; i22 < size4; i22++) {
                            ((AbstractC0659rl) arrayList4.get(i22)).getClass();
                        }
                    }
                }
                qd0Var.m4071C(c0179em3);
                size2 = arrayList2.size();
                if (i9 > 0) {
                    qd0Var.m4088z(c0179em3, 0, iM1260o2, iM1256i);
                }
                if (size2 > 0) {
                    iArr2 = c0179em3.f1736o0;
                    if (iArr2[0] == 2) {
                        z4 = true;
                    } else {
                        z4 = false;
                    }
                    if (iArr2[1] == 2) {
                        z5 = true;
                    } else {
                        z5 = false;
                    }
                    int iMax9 = Math.max(c0179em3.m1260o(), c0179em.f1708a0);
                    iMax3 = Math.max(c0179em3.m1256i(), c0179em.f1710b0);
                    for (i12 = 0; i12 < size2; i12++) {
                    }
                    arrayList3 = arrayList2;
                    i13 = iMax9;
                    i14 = 0;
                    while (i14 < 2) {
                        iMax4 = i13;
                        i15 = 0;
                        z6 = false;
                        while (i15 < size2) {
                            c0143dm = (C0143dm) arrayList3.get(i15);
                            if ((c0143dm instanceof C0205fb) && !(c0143dm instanceof ea0)) {
                                i18 = size2;
                                if (c0143dm.f1718f0 == 8 && (!z3 || !c0143dm.f1713d.f893e.f6581j || !c0143dm.f1715e.f893e.f6581j)) {
                                    iM1260o3 = c0143dm.m1260o();
                                    iM1256i2 = c0143dm.m1256i();
                                    z9 = z5;
                                    int i47 = c0143dm.f1706Z;
                                    z10 = z4;
                                    int i48 = i14 == 1 ? 2 : 1;
                                    i19 = i14;
                                    C0770ul c0770ul5 = c0770ul2;
                                    zM4084v = qd0Var.m4084v(i48, c0770ul5, c0143dm) | z6;
                                    iM1260o4 = c0143dm.m1260o();
                                    c0770ul2 = c0770ul5;
                                    iM1256i3 = c0143dm.m1256i();
                                    if (iM1260o4 != iM1260o3) {
                                        c0143dm.m1245K(iM1260o4);
                                        if (!z10 && c0143dm.m1261p() + c0143dm.f1700T > iMax4) {
                                            iMax4 = Math.max(iMax4, c0143dm.mo1254g(4).m3957d() + c0143dm.m1261p() + c0143dm.f1700T);
                                        }
                                        zM4084v = true;
                                    }
                                    if (iM1256i3 != iM1256i2) {
                                        c0143dm.m1242H(iM1256i3);
                                        if (z9 && c0143dm.m1262q() + c0143dm.f1701U > iMax3) {
                                            iMax3 = Math.max(iMax3, c0143dm.mo1254g(5).m3957d() + c0143dm.m1262q() + c0143dm.f1701U);
                                        }
                                        zM4084v = true;
                                    }
                                    if (!c0143dm.f1685E && i47 != c0143dm.f1706Z) {
                                        zM4084v = true;
                                    }
                                }
                                i15++;
                                z6 = zM4084v;
                                size2 = i18;
                                z5 = z9;
                                z4 = z10;
                                i14 = i19;
                            } else {
                                i18 = size2;
                            }
                            z9 = z5;
                            i19 = i14;
                            z10 = z4;
                            zM4084v = z6;
                            i15++;
                            z6 = zM4084v;
                            size2 = i18;
                            z5 = z9;
                            z4 = z10;
                            i14 = i19;
                        }
                        i16 = size2;
                        z7 = z5;
                        i17 = i14;
                        z8 = z4;
                        if (!z6) {
                            break;
                        }
                        i14 = i17 + 1;
                        qd0Var.m4088z(c0179em3, i14, iM1260o2, iM1256i);
                        i13 = iMax4;
                        size2 = i16;
                        z5 = z7;
                        z4 = z8;
                    }
                }
                c0179em3.f2123C0 = i46;
                gi0.f2742q = c0179em3.m1463S(512);
            }
            int iM1260o8 = c0179em3.m1260o();
            int iM1256i9 = c0179em3.m1256i();
            z12 = c0179em3.f2124D0;
            z13 = c0179em3.f2125E0;
            C0770ul c0770ul6 = c0770ul4;
            int i49 = c0770ul6.f7846e;
            int iResolveSizeAndState = View.resolveSizeAndState(iM1260o8 + c0770ul6.f7845d, i, 0);
            int iResolveSizeAndState2 = View.resolveSizeAndState(iM1256i9 + i49, i2, 0) & 16777215;
            iMin = Math.min(this.f471o, iResolveSizeAndState & 16777215);
            iMin2 = Math.min(this.f472p, iResolveSizeAndState2);
            if (z12) {
                iMin |= 16777216;
            }
            if (z13) {
                iMin2 |= 16777216;
            }
            setMeasuredDimension(iMin, iMin2);
        }
        i3 = i42;
        iMax = childCount3 == 0 ? Math.max(0, this.f469m) : i39;
        i4 = Integer.MIN_VALUE;
        i5 = 2;
        if (mode2 != i4) {
            if (childCount3 == 0) {
                iMax2 = Math.max(0, this.f470n);
            } else {
                iMax2 = i40;
            }
            i6 = 2;
        } else if (mode2 != 0) {
            if (childCount3 == 0) {
                iMax2 = Math.max(0, this.f470n);
            } else {
                iMax2 = 0;
            }
            i6 = 2;
        } else if (mode2 != 1073741824) {
            c0770ul4 = c0770ul4;
            i6 = 1;
            iMax2 = 0;
        } else {
            iMax2 = Math.min(this.f472p - i41, i40);
            c0770ul4 = c0770ul4;
            i6 = 1;
        }
        iM1260o = c0179em3.m1260o();
        iArr = c0179em3.f1683C;
        if (iMax == iM1260o) {
            c0592ps.f6237c = true;
            c = 1;
        } else {
            c0592ps.f6237c = true;
            c = 1;
        }
        c0179em3.f1704X = 0;
        c0179em3.f1705Y = 0;
        iArr[0] = this.f471o - i3;
        iArr[c] = this.f472p - i41;
        c0179em3.f1708a0 = 0;
        c0179em3.f1710b0 = 0;
        c0179em3.m1243I(i5);
        c0179em3.m1245K(iMax);
        c0179em3.m1244J(i6);
        c0179em3.m1242H(iMax2);
        i7 = this.f469m - i3;
        if (i7 < 0) {
            c0179em3.f1708a0 = 0;
        } else {
            c0179em3.f1708a0 = i7;
        }
        i8 = this.f470n - i41;
        if (i8 < 0) {
            c0179em3.f1710b0 = 0;
        } else {
            c0179em3.f1710b0 = i8;
        }
        c0179em3.f2139w0 = iMax7;
        c0179em3.f2140x0 = iMax5;
        c0179em = (C0179em) qd0Var.f6473m;
        arrayList = (ArrayList) qd0Var.f6471k;
        c0770ul = c0179em3.f2136t0;
        size = c0179em3.f2132p0.size();
        iM1260o2 = c0179em3.m1260o();
        iM1256i = c0179em3.m1256i();
        zM134r = a90.m134r(i37, 128);
        if (zM134r) {
            z = true;
        } else {
            z = true;
        }
        if (z) {
            i34 = 0;
            while (true) {
                if (i34 < size) {
                    i9 = size;
                    c0143dm3 = (C0143dm) c0179em3.f2132p0.get(i34);
                    z19 = z;
                    iArr3 = c0143dm3.f1736o0;
                    i35 = i34;
                    if (iArr3[0] == 3) {
                        z20 = true;
                    } else {
                        z20 = false;
                    }
                    if (iArr3[1] == 3) {
                        z21 = true;
                    } else {
                        z21 = false;
                    }
                    if (z20) {
                        z22 = false;
                    } else {
                        z22 = false;
                    }
                    if (c0143dm3.m1267v()) {
                        i34 = i35 + 1;
                        size = i9;
                        z = z19;
                    } else {
                        i34 = i35 + 1;
                        size = i9;
                        z = z19;
                    }
                    i10 = 1073741824;
                    z2 = false;
                } else {
                    i9 = size;
                    z2 = z;
                    i10 = 1073741824;
                }
            }
        } else {
            i9 = size;
            z2 = z;
            i10 = 1073741824;
        }
        z3 = z2 & ((mode != i10 && mode2 == i10) || zM134r);
        if (z3) {
            int iMin5 = Math.min(iArr[0], i39);
            iMin3 = Math.min(iArr[1], i40);
            if (mode == 1073741824) {
                z14 = true;
            } else {
                z14 = true;
            }
            if (mode2 == 1073741824) {
                if (c0179em3.m1256i() != iMin3) {
                    c0179em3.m1242H(iMin3);
                    c0592ps.f6236b = z14;
                }
                i23 = 1073741824;
            } else {
                i23 = 1073741824;
            }
            if (mode == i23) {
                arrayList2 = arrayList;
                c0770ul2 = c0770ul;
                z3 = z3;
                c0179em2 = c0592ps.f6235a;
                if (c0592ps.f6236b) {
                    arrayList5 = c0179em2.f2132p0;
                    size5 = arrayList5.size();
                    i26 = 0;
                    while (i26 < size5) {
                        Object obj8 = arrayList5.get(i26);
                        i26++;
                        C0143dm c0143dm6 = (C0143dm) obj8;
                        c0143dm6.m1253f();
                        c0143dm6.f1707a = false;
                        gb0 gb0Var4 = c0143dm6.f1713d;
                        ArrayList arrayList9 = arrayList5;
                        gb0Var4.f893e.f6581j = false;
                        gb0Var4.f895g = false;
                        gb0Var4.m2015n();
                        mh1 mh1Var4 = c0143dm6.f1715e;
                        mh1Var4.f893e.f6581j = false;
                        mh1Var4.f895g = false;
                        mh1Var4.m3385m();
                        arrayList5 = arrayList9;
                    }
                    i24 = 0;
                    c0179em2.m1253f();
                    c0179em2.f1707a = false;
                    gb0 gb0Var5 = c0179em2.f1713d;
                    gb0Var5.f893e.f6581j = false;
                    gb0Var5.f895g = false;
                    gb0Var5.m2015n();
                    mh1 mh1Var5 = c0179em2.f1715e;
                    mh1Var5.f893e.f6581j = false;
                    mh1Var5.f895g = false;
                    mh1Var5.m3385m();
                    c0592ps.m3978c();
                } else {
                    i24 = 0;
                }
                c0592ps.m3977b(c0592ps.f6238d);
                c0179em2.f1704X = i24;
                c0179em2.f1705Y = i24;
                c0179em2.f1713d.f896h.mo759d(i24);
                c0179em2.f1715e.f896h.mo759d(i24);
                i25 = 1073741824;
                if (mode == 1073741824) {
                    zM1461P = c0179em3.m1461P(i24, zM134r);
                    i11 = 1;
                } else {
                    zM1461P = true;
                    i11 = 0;
                }
                if (mode2 == 1073741824) {
                    zM1461P &= c0179em3.m1461P(1, zM134r);
                    i11++;
                }
            } else {
                arrayList2 = arrayList;
                c0770ul2 = c0770ul;
                z3 = z3;
                c0179em2 = c0592ps.f6235a;
                if (c0592ps.f6236b) {
                    arrayList5 = c0179em2.f2132p0;
                    size5 = arrayList5.size();
                    i26 = 0;
                    while (i26 < size5) {
                        Object obj9 = arrayList5.get(i26);
                        i26++;
                        C0143dm c0143dm7 = (C0143dm) obj9;
                        c0143dm7.m1253f();
                        c0143dm7.f1707a = false;
                        gb0 gb0Var6 = c0143dm7.f1713d;
                        ArrayList arrayList10 = arrayList5;
                        gb0Var6.f893e.f6581j = false;
                        gb0Var6.f895g = false;
                        gb0Var6.m2015n();
                        mh1 mh1Var6 = c0143dm7.f1715e;
                        mh1Var6.f893e.f6581j = false;
                        mh1Var6.f895g = false;
                        mh1Var6.m3385m();
                        arrayList5 = arrayList10;
                    }
                    i24 = 0;
                    c0179em2.m1253f();
                    c0179em2.f1707a = false;
                    gb0 gb0Var7 = c0179em2.f1713d;
                    gb0Var7.f893e.f6581j = false;
                    gb0Var7.f895g = false;
                    gb0Var7.m2015n();
                    mh1 mh1Var7 = c0179em2.f1715e;
                    mh1Var7.f893e.f6581j = false;
                    mh1Var7.f895g = false;
                    mh1Var7.m3385m();
                    c0592ps.m3978c();
                } else {
                    i24 = 0;
                }
                c0592ps.m3977b(c0592ps.f6238d);
                c0179em2.f1704X = i24;
                c0179em2.f1705Y = i24;
                c0179em2.f1713d.f896h.mo759d(i24);
                c0179em2.f1715e.f896h.mo759d(i24);
                i25 = 1073741824;
                if (mode == 1073741824) {
                    zM1461P = c0179em3.m1461P(i24, zM134r);
                    i11 = 1;
                } else {
                    zM1461P = true;
                    i11 = 0;
                }
                if (mode2 == 1073741824) {
                    zM1461P &= c0179em3.m1461P(1, zM134r);
                    i11++;
                }
            }
            if (zM1461P) {
                if (mode == i25) {
                    z15 = true;
                } else {
                    z15 = false;
                }
                if (mode2 == i25) {
                    z16 = true;
                } else {
                    z16 = false;
                }
                c0179em3.mo1246L(z15, z16);
            }
        } else {
            arrayList2 = arrayList;
            c0770ul2 = c0770ul;
            z3 = z3;
            zM1461P = false;
            i11 = 0;
        }
        if (zM1461P) {
            int i410 = c0179em3.f2123C0;
            if (i9 > 0) {
                size3 = c0179em3.f2132p0.size();
                zM1463S = c0179em3.m1463S(64);
                c0770ul3 = c0179em3.f2136t0;
                while (i20 < size3) {
                    c0143dm2 = (C0143dm) c0179em3.f2132p0.get(i20);
                    if (c0143dm2 instanceof ea0) {
                        c0143dm2.getClass();
                        if (zM1463S) {
                        }
                        iM1255h = c0143dm2.m1255h(0);
                        int iM1255h5 = c0143dm2.m1255h(1);
                        if (iM1255h == 3) {
                            z11 = false;
                        } else {
                            z11 = false;
                        }
                        if (z11) {
                        }
                        if (!z11) {
                            qd0Var.m4084v(0, c0770ul3, c0143dm2);
                        }
                    }
                }
                constraintLayout = c0770ul3.f7842a;
                childCount = constraintLayout.getChildCount();
                arrayList4 = constraintLayout.f467k;
                while (i21 < childCount) {
                    constraintLayout.getChildAt(i21);
                }
                size4 = arrayList4.size();
                if (size4 > 0) {
                    while (i22 < size4) {
                        ((AbstractC0659rl) arrayList4.get(i22)).getClass();
                    }
                }
            }
            qd0Var.m4071C(c0179em3);
            size2 = arrayList2.size();
            if (i9 > 0) {
                qd0Var.m4088z(c0179em3, 0, iM1260o2, iM1256i);
            }
            if (size2 > 0) {
                iArr2 = c0179em3.f1736o0;
                if (iArr2[0] == 2) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                if (iArr2[1] == 2) {
                    z5 = true;
                } else {
                    z5 = false;
                }
                int iMax10 = Math.max(c0179em3.m1260o(), c0179em.f1708a0);
                iMax3 = Math.max(c0179em3.m1256i(), c0179em.f1710b0);
                while (i12 < size2) {
                }
                arrayList3 = arrayList2;
                i13 = iMax10;
                i14 = 0;
                while (i14 < 2) {
                    iMax4 = i13;
                    i15 = 0;
                    z6 = false;
                    while (i15 < size2) {
                        c0143dm = (C0143dm) arrayList3.get(i15);
                        if (c0143dm instanceof C0205fb) {
                            i18 = size2;
                            z9 = z5;
                            i19 = i14;
                            z10 = z4;
                            zM4084v = z6;
                        } else {
                            i18 = size2;
                            if (c0143dm.f1718f0 == 8) {
                                z9 = z5;
                                i19 = i14;
                                z10 = z4;
                                zM4084v = z6;
                            } else {
                                iM1260o3 = c0143dm.m1260o();
                                iM1256i2 = c0143dm.m1256i();
                                z9 = z5;
                                int i411 = c0143dm.f1706Z;
                                z10 = z4;
                                if (i14 == 1) {
                                }
                                i19 = i14;
                                C0770ul c0770ul7 = c0770ul2;
                                zM4084v = qd0Var.m4084v(i48, c0770ul7, c0143dm) | z6;
                                iM1260o4 = c0143dm.m1260o();
                                c0770ul2 = c0770ul7;
                                iM1256i3 = c0143dm.m1256i();
                                if (iM1260o4 != iM1260o3) {
                                    c0143dm.m1245K(iM1260o4);
                                    if (!z10) {
                                    }
                                    zM4084v = true;
                                }
                                if (iM1256i3 != iM1256i2) {
                                    c0143dm.m1242H(iM1256i3);
                                    if (z9) {
                                        iMax3 = Math.max(iMax3, c0143dm.mo1254g(5).m3957d() + c0143dm.m1262q() + c0143dm.f1701U);
                                    }
                                    zM4084v = true;
                                }
                                if (!c0143dm.f1685E) {
                                }
                            }
                        }
                        i15++;
                        z6 = zM4084v;
                        size2 = i18;
                        z5 = z9;
                        z4 = z10;
                        i14 = i19;
                    }
                    i16 = size2;
                    z7 = z5;
                    i17 = i14;
                    z8 = z4;
                    if (!z6) {
                        break;
                        break;
                    }
                    i14 = i17 + 1;
                    qd0Var.m4088z(c0179em3, i14, iM1260o2, iM1256i);
                    i13 = iMax4;
                    size2 = i16;
                    z5 = z7;
                    z4 = z8;
                }
            }
            c0179em3.f2123C0 = i410;
            gi0.f2742q = c0179em3.m1463S(512);
        } else {
            int i412 = c0179em3.f2123C0;
            if (i9 > 0) {
                size3 = c0179em3.f2132p0.size();
                zM1463S = c0179em3.m1463S(64);
                c0770ul3 = c0179em3.f2136t0;
                while (i20 < size3) {
                    c0143dm2 = (C0143dm) c0179em3.f2132p0.get(i20);
                    if (c0143dm2 instanceof ea0) {
                        c0143dm2.getClass();
                        if (zM1463S) {
                        }
                        iM1255h = c0143dm2.m1255h(0);
                        int iM1255h6 = c0143dm2.m1255h(1);
                        if (iM1255h == 3) {
                            z11 = false;
                        } else {
                            z11 = false;
                        }
                        if (z11) {
                        }
                        if (!z11) {
                            qd0Var.m4084v(0, c0770ul3, c0143dm2);
                        }
                    }
                }
                constraintLayout = c0770ul3.f7842a;
                childCount = constraintLayout.getChildCount();
                arrayList4 = constraintLayout.f467k;
                while (i21 < childCount) {
                    constraintLayout.getChildAt(i21);
                }
                size4 = arrayList4.size();
                if (size4 > 0) {
                    while (i22 < size4) {
                        ((AbstractC0659rl) arrayList4.get(i22)).getClass();
                    }
                }
            }
            qd0Var.m4071C(c0179em3);
            size2 = arrayList2.size();
            if (i9 > 0) {
                qd0Var.m4088z(c0179em3, 0, iM1260o2, iM1256i);
            }
            if (size2 > 0) {
                iArr2 = c0179em3.f1736o0;
                if (iArr2[0] == 2) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                if (iArr2[1] == 2) {
                    z5 = true;
                } else {
                    z5 = false;
                }
                int iMax11 = Math.max(c0179em3.m1260o(), c0179em.f1708a0);
                iMax3 = Math.max(c0179em3.m1256i(), c0179em.f1710b0);
                while (i12 < size2) {
                }
                arrayList3 = arrayList2;
                i13 = iMax11;
                i14 = 0;
                while (i14 < 2) {
                    iMax4 = i13;
                    i15 = 0;
                    z6 = false;
                    while (i15 < size2) {
                        c0143dm = (C0143dm) arrayList3.get(i15);
                        if (c0143dm instanceof C0205fb) {
                            i18 = size2;
                            z9 = z5;
                            i19 = i14;
                            z10 = z4;
                            zM4084v = z6;
                        } else {
                            i18 = size2;
                            if (c0143dm.f1718f0 == 8) {
                                z9 = z5;
                                i19 = i14;
                                z10 = z4;
                                zM4084v = z6;
                            } else {
                                iM1260o3 = c0143dm.m1260o();
                                iM1256i2 = c0143dm.m1256i();
                                z9 = z5;
                                int i413 = c0143dm.f1706Z;
                                z10 = z4;
                                if (i14 == 1) {
                                }
                                i19 = i14;
                                C0770ul c0770ul8 = c0770ul2;
                                zM4084v = qd0Var.m4084v(i48, c0770ul8, c0143dm) | z6;
                                iM1260o4 = c0143dm.m1260o();
                                c0770ul2 = c0770ul8;
                                iM1256i3 = c0143dm.m1256i();
                                if (iM1260o4 != iM1260o3) {
                                    c0143dm.m1245K(iM1260o4);
                                    if (!z10) {
                                    }
                                    zM4084v = true;
                                }
                                if (iM1256i3 != iM1256i2) {
                                    c0143dm.m1242H(iM1256i3);
                                    if (z9) {
                                        iMax3 = Math.max(iMax3, c0143dm.mo1254g(5).m3957d() + c0143dm.m1262q() + c0143dm.f1701U);
                                    }
                                    zM4084v = true;
                                }
                                if (!c0143dm.f1685E) {
                                }
                            }
                        }
                        i15++;
                        z6 = zM4084v;
                        size2 = i18;
                        z5 = z9;
                        z4 = z10;
                        i14 = i19;
                    }
                    i16 = size2;
                    z7 = z5;
                    i17 = i14;
                    z8 = z4;
                    if (!z6) {
                        break;
                        break;
                    }
                    i14 = i17 + 1;
                    qd0Var.m4088z(c0179em3, i14, iM1260o2, iM1256i);
                    i13 = iMax4;
                    size2 = i16;
                    z5 = z7;
                    z4 = z8;
                }
            }
            c0179em3.f2123C0 = i412;
            gi0.f2742q = c0179em3.m1463S(512);
        }
        int iM1260o9 = c0179em3.m1260o();
        int iM1256i10 = c0179em3.m1256i();
        z12 = c0179em3.f2124D0;
        z13 = c0179em3.f2125E0;
        C0770ul c0770ul9 = c0770ul4;
        int i414 = c0770ul9.f7846e;
        int iResolveSizeAndState3 = View.resolveSizeAndState(iM1260o9 + c0770ul9.f7845d, i, 0);
        int iResolveSizeAndState4 = View.resolveSizeAndState(iM1256i10 + i414, i2, 0) & 16777215;
        iMin = Math.min(this.f471o, iResolveSizeAndState3 & 16777215);
        iMin2 = Math.min(this.f472p, iResolveSizeAndState4);
        if (z12) {
            iMin |= 16777216;
        }
        if (z13) {
            iMin2 |= 16777216;
        }
        setMeasuredDimension(iMin, iMin2);
    }

    @Override // android.view.ViewGroup
    public final void onViewAdded(View view) {
        super.onViewAdded(view);
        C0143dm c0143dmM386h = m386h(view);
        if ((view instanceof da0) && !(c0143dmM386h instanceof ea0)) {
            C0733tl c0733tl = (C0733tl) view.getLayoutParams();
            ea0 ea0Var = new ea0();
            c0733tl.f7518p0 = ea0Var;
            c0733tl.f7494d0 = true;
            ea0Var.m1398O(c0733tl.f7482V);
        }
        if (view instanceof AbstractC0659rl) {
            AbstractC0659rl abstractC0659rl = (AbstractC0659rl) view;
            abstractC0659rl.m4377e();
            ((C0733tl) view.getLayoutParams()).f7496e0 = true;
            ArrayList arrayList = this.f467k;
            if (!arrayList.contains(abstractC0659rl)) {
                arrayList.add(abstractC0659rl);
            }
        }
        this.f466j.put(view.getId(), view);
        this.f473q = true;
    }

    @Override // android.view.ViewGroup
    public final void onViewRemoved(View view) {
        super.onViewRemoved(view);
        this.f466j.remove(view.getId());
        C0143dm c0143dmM386h = m386h(view);
        this.f468l.f2132p0.remove(c0143dmM386h);
        c0143dmM386h.mo1237A();
        this.f467k.remove(view);
        this.f473q = true;
    }

    @Override // android.view.View, android.view.ViewParent
    public final void requestLayout() {
        this.f473q = true;
        super.requestLayout();
    }

    public void setConstraintSet(C0103cm c0103cm) {
        this.f475s = c0103cm;
    }

    @Override // android.view.View
    public void setId(int i) {
        int id = getId();
        SparseArray sparseArray = this.f466j;
        sparseArray.remove(id);
        super.setId(i);
        sparseArray.put(getId(), this);
    }

    public void setMaxHeight(int i) {
        if (i == this.f472p) {
            return;
        }
        this.f472p = i;
        requestLayout();
    }

    public void setMaxWidth(int i) {
        if (i == this.f471o) {
            return;
        }
        this.f471o = i;
        requestLayout();
    }

    public void setMinHeight(int i) {
        if (i == this.f470n) {
            return;
        }
        this.f470n = i;
        requestLayout();
    }

    public void setMinWidth(int i) {
        if (i == this.f469m) {
            return;
        }
        this.f469m = i;
        requestLayout();
    }

    public void setOnConstraintsChanged(AbstractC0216fm abstractC0216fm) {
        C0312i6 c0312i6 = this.f476t;
        if (c0312i6 != null) {
            c0312i6.getClass();
        }
    }

    public void setOptimizationLevel(int i) {
        this.f474r = i;
        C0179em c0179em = this.f468l;
        c0179em.f2123C0 = i;
        gi0.f2742q = c0179em.m1463S(512);
    }

    @Override // android.view.ViewGroup
    public final boolean shouldDelayChildPressedState() {
        return false;
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        C0733tl c0733tl = new C0733tl(layoutParams);
        c0733tl.f7487a = -1;
        c0733tl.f7489b = -1;
        c0733tl.f7491c = -1.0f;
        c0733tl.f7493d = true;
        c0733tl.f7495e = -1;
        c0733tl.f7497f = -1;
        c0733tl.f7499g = -1;
        c0733tl.f7501h = -1;
        c0733tl.f7503i = -1;
        c0733tl.f7505j = -1;
        c0733tl.f7507k = -1;
        c0733tl.f7509l = -1;
        c0733tl.f7511m = -1;
        c0733tl.f7513n = -1;
        c0733tl.f7515o = -1;
        c0733tl.f7517p = -1;
        c0733tl.f7519q = 0;
        c0733tl.f7520r = 0.0f;
        c0733tl.f7521s = -1;
        c0733tl.f7522t = -1;
        c0733tl.f7523u = -1;
        c0733tl.f7524v = -1;
        c0733tl.f7525w = Integer.MIN_VALUE;
        c0733tl.f7526x = Integer.MIN_VALUE;
        c0733tl.f7527y = Integer.MIN_VALUE;
        c0733tl.f7528z = Integer.MIN_VALUE;
        c0733tl.f7461A = Integer.MIN_VALUE;
        c0733tl.f7462B = Integer.MIN_VALUE;
        c0733tl.f7463C = Integer.MIN_VALUE;
        c0733tl.f7464D = 0;
        c0733tl.f7465E = 0.5f;
        c0733tl.f7466F = 0.5f;
        c0733tl.f7467G = null;
        c0733tl.f7468H = -1.0f;
        c0733tl.f7469I = -1.0f;
        c0733tl.f7470J = 0;
        c0733tl.f7471K = 0;
        c0733tl.f7472L = 0;
        c0733tl.f7473M = 0;
        c0733tl.f7474N = 0;
        c0733tl.f7475O = 0;
        c0733tl.f7476P = 0;
        c0733tl.f7477Q = 0;
        c0733tl.f7478R = 1.0f;
        c0733tl.f7479S = 1.0f;
        c0733tl.f7480T = -1;
        c0733tl.f7481U = -1;
        c0733tl.f7482V = -1;
        c0733tl.f7483W = false;
        c0733tl.f7484X = false;
        c0733tl.f7485Y = null;
        c0733tl.f7486Z = 0;
        c0733tl.f7488a0 = true;
        c0733tl.f7490b0 = true;
        c0733tl.f7492c0 = false;
        c0733tl.f7494d0 = false;
        c0733tl.f7496e0 = false;
        c0733tl.f7498f0 = -1;
        c0733tl.f7500g0 = -1;
        c0733tl.f7502h0 = -1;
        c0733tl.f7504i0 = -1;
        c0733tl.f7506j0 = Integer.MIN_VALUE;
        c0733tl.f7508k0 = Integer.MIN_VALUE;
        c0733tl.f7510l0 = 0.5f;
        c0733tl.f7518p0 = new C0143dm();
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
            ((ViewGroup.MarginLayoutParams) c0733tl).leftMargin = marginLayoutParams.leftMargin;
            ((ViewGroup.MarginLayoutParams) c0733tl).rightMargin = marginLayoutParams.rightMargin;
            ((ViewGroup.MarginLayoutParams) c0733tl).topMargin = marginLayoutParams.topMargin;
            ((ViewGroup.MarginLayoutParams) c0733tl).bottomMargin = marginLayoutParams.bottomMargin;
            c0733tl.setMarginStart(marginLayoutParams.getMarginStart());
            c0733tl.setMarginEnd(marginLayoutParams.getMarginEnd());
        }
        if (!(layoutParams instanceof C0733tl)) {
            return c0733tl;
        }
        C0733tl c0733tl2 = (C0733tl) layoutParams;
        c0733tl.f7487a = c0733tl2.f7487a;
        c0733tl.f7489b = c0733tl2.f7489b;
        c0733tl.f7491c = c0733tl2.f7491c;
        c0733tl.f7493d = c0733tl2.f7493d;
        c0733tl.f7495e = c0733tl2.f7495e;
        c0733tl.f7497f = c0733tl2.f7497f;
        c0733tl.f7499g = c0733tl2.f7499g;
        c0733tl.f7501h = c0733tl2.f7501h;
        c0733tl.f7503i = c0733tl2.f7503i;
        c0733tl.f7505j = c0733tl2.f7505j;
        c0733tl.f7507k = c0733tl2.f7507k;
        c0733tl.f7509l = c0733tl2.f7509l;
        c0733tl.f7511m = c0733tl2.f7511m;
        c0733tl.f7513n = c0733tl2.f7513n;
        c0733tl.f7515o = c0733tl2.f7515o;
        c0733tl.f7517p = c0733tl2.f7517p;
        c0733tl.f7519q = c0733tl2.f7519q;
        c0733tl.f7520r = c0733tl2.f7520r;
        c0733tl.f7521s = c0733tl2.f7521s;
        c0733tl.f7522t = c0733tl2.f7522t;
        c0733tl.f7523u = c0733tl2.f7523u;
        c0733tl.f7524v = c0733tl2.f7524v;
        c0733tl.f7525w = c0733tl2.f7525w;
        c0733tl.f7526x = c0733tl2.f7526x;
        c0733tl.f7527y = c0733tl2.f7527y;
        c0733tl.f7528z = c0733tl2.f7528z;
        c0733tl.f7461A = c0733tl2.f7461A;
        c0733tl.f7462B = c0733tl2.f7462B;
        c0733tl.f7463C = c0733tl2.f7463C;
        c0733tl.f7464D = c0733tl2.f7464D;
        c0733tl.f7465E = c0733tl2.f7465E;
        c0733tl.f7466F = c0733tl2.f7466F;
        c0733tl.f7467G = c0733tl2.f7467G;
        c0733tl.f7468H = c0733tl2.f7468H;
        c0733tl.f7469I = c0733tl2.f7469I;
        c0733tl.f7470J = c0733tl2.f7470J;
        c0733tl.f7471K = c0733tl2.f7471K;
        c0733tl.f7483W = c0733tl2.f7483W;
        c0733tl.f7484X = c0733tl2.f7484X;
        c0733tl.f7472L = c0733tl2.f7472L;
        c0733tl.f7473M = c0733tl2.f7473M;
        c0733tl.f7474N = c0733tl2.f7474N;
        c0733tl.f7476P = c0733tl2.f7476P;
        c0733tl.f7475O = c0733tl2.f7475O;
        c0733tl.f7477Q = c0733tl2.f7477Q;
        c0733tl.f7478R = c0733tl2.f7478R;
        c0733tl.f7479S = c0733tl2.f7479S;
        c0733tl.f7480T = c0733tl2.f7480T;
        c0733tl.f7481U = c0733tl2.f7481U;
        c0733tl.f7482V = c0733tl2.f7482V;
        c0733tl.f7488a0 = c0733tl2.f7488a0;
        c0733tl.f7490b0 = c0733tl2.f7490b0;
        c0733tl.f7492c0 = c0733tl2.f7492c0;
        c0733tl.f7494d0 = c0733tl2.f7494d0;
        c0733tl.f7498f0 = c0733tl2.f7498f0;
        c0733tl.f7500g0 = c0733tl2.f7500g0;
        c0733tl.f7502h0 = c0733tl2.f7502h0;
        c0733tl.f7504i0 = c0733tl2.f7504i0;
        c0733tl.f7506j0 = c0733tl2.f7506j0;
        c0733tl.f7508k0 = c0733tl2.f7508k0;
        c0733tl.f7510l0 = c0733tl2.f7510l0;
        c0733tl.f7485Y = c0733tl2.f7485Y;
        c0733tl.f7486Z = c0733tl2.f7486Z;
        c0733tl.f7518p0 = c0733tl2.f7518p0;
        return c0733tl;
    }
}
