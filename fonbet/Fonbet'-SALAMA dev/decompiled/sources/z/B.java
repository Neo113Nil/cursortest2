package z;

import android.content.Context;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.graphics.RectF;
import android.util.Xml;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.motion.widget.MotionLayout;

/* loaded from: classes.dex */
public final class B {

    /* renamed from: E, reason: collision with root package name */
    public static final float[][] f18196E = {new float[]{0.5f, 0.0f}, new float[]{0.0f, 0.5f}, new float[]{1.0f, 0.5f}, new float[]{0.5f, 1.0f}, new float[]{0.5f, 0.5f}, new float[]{0.0f, 0.5f}, new float[]{1.0f, 0.5f}};

    /* renamed from: F, reason: collision with root package name */
    public static final float[][] f18197F = {new float[]{0.0f, -1.0f}, new float[]{0.0f, 1.0f}, new float[]{-1.0f, 0.0f}, new float[]{1.0f, 0.0f}, new float[]{-1.0f, 0.0f}, new float[]{1.0f, 0.0f}};

    /* renamed from: A, reason: collision with root package name */
    public final float f18198A;

    /* renamed from: B, reason: collision with root package name */
    public final float f18199B;

    /* renamed from: C, reason: collision with root package name */
    public final int f18200C;

    /* renamed from: D, reason: collision with root package name */
    public final int f18201D;

    /* renamed from: a, reason: collision with root package name */
    public final int f18202a;

    /* renamed from: b, reason: collision with root package name */
    public final int f18203b;

    /* renamed from: c, reason: collision with root package name */
    public int f18204c;

    /* renamed from: d, reason: collision with root package name */
    public final int f18205d;

    /* renamed from: e, reason: collision with root package name */
    public final int f18206e;

    /* renamed from: f, reason: collision with root package name */
    public final int f18207f;

    /* renamed from: g, reason: collision with root package name */
    public float f18208g;

    /* renamed from: h, reason: collision with root package name */
    public float f18209h;

    /* renamed from: i, reason: collision with root package name */
    public final int f18210i;
    public final boolean j;

    /* renamed from: k, reason: collision with root package name */
    public float f18211k;

    /* renamed from: l, reason: collision with root package name */
    public float f18212l;

    /* renamed from: m, reason: collision with root package name */
    public boolean f18213m = false;

    /* renamed from: n, reason: collision with root package name */
    public final float[] f18214n = new float[2];

    /* renamed from: o, reason: collision with root package name */
    public final int[] f18215o = new int[2];

    /* renamed from: p, reason: collision with root package name */
    public float f18216p;

    /* renamed from: q, reason: collision with root package name */
    public float f18217q;

    /* renamed from: r, reason: collision with root package name */
    public final MotionLayout f18218r;

    /* renamed from: s, reason: collision with root package name */
    public final float f18219s;

    /* renamed from: t, reason: collision with root package name */
    public final float f18220t;

    /* renamed from: u, reason: collision with root package name */
    public final boolean f18221u;

    /* renamed from: v, reason: collision with root package name */
    public final float f18222v;

    /* renamed from: w, reason: collision with root package name */
    public final int f18223w;

    /* renamed from: x, reason: collision with root package name */
    public final float f18224x;

    /* renamed from: y, reason: collision with root package name */
    public final float f18225y;

    /* renamed from: z, reason: collision with root package name */
    public final float f18226z;

    public B(Context context, MotionLayout motionLayout, XmlResourceParser xmlResourceParser) {
        this.f18202a = 0;
        this.f18203b = 0;
        this.f18204c = 0;
        this.f18205d = -1;
        this.f18206e = -1;
        this.f18207f = -1;
        this.f18208g = 0.5f;
        this.f18209h = 0.5f;
        this.f18210i = -1;
        this.j = false;
        this.f18211k = 0.0f;
        this.f18212l = 1.0f;
        this.f18219s = 4.0f;
        this.f18220t = 1.2f;
        this.f18221u = true;
        this.f18222v = 1.0f;
        this.f18223w = 0;
        this.f18224x = 10.0f;
        this.f18225y = 10.0f;
        this.f18226z = 1.0f;
        this.f18198A = Float.NaN;
        this.f18199B = Float.NaN;
        this.f18200C = 0;
        this.f18201D = 0;
        this.f18218r = motionLayout;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(Xml.asAttributeSet(xmlResourceParser), B.q.f950v);
        int indexCount = obtainStyledAttributes.getIndexCount();
        for (int i7 = 0; i7 < indexCount; i7++) {
            int index = obtainStyledAttributes.getIndex(i7);
            if (index == 16) {
                this.f18205d = obtainStyledAttributes.getResourceId(index, this.f18205d);
            } else if (index == 17) {
                int i8 = obtainStyledAttributes.getInt(index, this.f18202a);
                this.f18202a = i8;
                float[] fArr = f18196E[i8];
                this.f18209h = fArr[0];
                this.f18208g = fArr[1];
            } else if (index == 1) {
                int i9 = obtainStyledAttributes.getInt(index, this.f18203b);
                this.f18203b = i9;
                if (i9 < 6) {
                    float[] fArr2 = f18197F[i9];
                    this.f18211k = fArr2[0];
                    this.f18212l = fArr2[1];
                } else {
                    this.f18212l = Float.NaN;
                    this.f18211k = Float.NaN;
                    this.j = true;
                }
            } else if (index == 6) {
                this.f18219s = obtainStyledAttributes.getFloat(index, this.f18219s);
            } else if (index == 5) {
                this.f18220t = obtainStyledAttributes.getFloat(index, this.f18220t);
            } else if (index == 7) {
                this.f18221u = obtainStyledAttributes.getBoolean(index, this.f18221u);
            } else if (index == 2) {
                this.f18222v = obtainStyledAttributes.getFloat(index, this.f18222v);
            } else if (index == 3) {
                this.f18224x = obtainStyledAttributes.getFloat(index, this.f18224x);
            } else if (index == 18) {
                this.f18206e = obtainStyledAttributes.getResourceId(index, this.f18206e);
            } else if (index == 9) {
                this.f18204c = obtainStyledAttributes.getInt(index, this.f18204c);
            } else if (index == 8) {
                this.f18223w = obtainStyledAttributes.getInteger(index, 0);
            } else if (index == 4) {
                this.f18207f = obtainStyledAttributes.getResourceId(index, 0);
            } else if (index == 10) {
                this.f18210i = obtainStyledAttributes.getResourceId(index, this.f18210i);
            } else if (index == 12) {
                this.f18225y = obtainStyledAttributes.getFloat(index, this.f18225y);
            } else if (index == 13) {
                this.f18226z = obtainStyledAttributes.getFloat(index, this.f18226z);
            } else if (index == 14) {
                this.f18198A = obtainStyledAttributes.getFloat(index, this.f18198A);
            } else if (index == 15) {
                this.f18199B = obtainStyledAttributes.getFloat(index, this.f18199B);
            } else if (index == 11) {
                this.f18200C = obtainStyledAttributes.getInt(index, this.f18200C);
            } else if (index == 0) {
                this.f18201D = obtainStyledAttributes.getInt(index, this.f18201D);
            }
        }
        obtainStyledAttributes.recycle();
    }

    public final RectF a(ViewGroup viewGroup, RectF rectF) {
        View findViewById;
        int i7 = this.f18207f;
        if (i7 == -1 || (findViewById = viewGroup.findViewById(i7)) == null) {
            return null;
        }
        rectF.set(findViewById.getLeft(), findViewById.getTop(), findViewById.getRight(), findViewById.getBottom());
        return rectF;
    }

    public final RectF b(ViewGroup viewGroup, RectF rectF) {
        View findViewById;
        int i7 = this.f18206e;
        if (i7 == -1 || (findViewById = viewGroup.findViewById(i7)) == null) {
            return null;
        }
        rectF.set(findViewById.getLeft(), findViewById.getTop(), findViewById.getRight(), findViewById.getBottom());
        return rectF;
    }

    public final void c(boolean z4) {
        float[][] fArr = f18196E;
        float[][] fArr2 = f18197F;
        if (z4) {
            fArr2[4] = fArr2[3];
            fArr2[5] = fArr2[2];
            fArr[5] = fArr[2];
            fArr[6] = fArr[1];
        } else {
            fArr2[4] = fArr2[2];
            fArr2[5] = fArr2[3];
            fArr[5] = fArr[1];
            fArr[6] = fArr[2];
        }
        float[] fArr3 = fArr[this.f18202a];
        this.f18209h = fArr3[0];
        this.f18208g = fArr3[1];
        int i7 = this.f18203b;
        if (i7 >= 6) {
            return;
        }
        float[] fArr4 = fArr2[i7];
        this.f18211k = fArr4[0];
        this.f18212l = fArr4[1];
    }

    public final String toString() {
        if (Float.isNaN(this.f18211k)) {
            return "rotation";
        }
        return this.f18211k + " , " + this.f18212l;
    }
}
