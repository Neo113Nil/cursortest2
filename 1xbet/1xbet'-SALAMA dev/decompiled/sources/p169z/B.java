package p169z;

import B.q;
import android.content.Context;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.graphics.RectF;
import android.util.Xml;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.motion.widget.MotionLayout;

/* JADX INFO: loaded from: classes.dex */
public final class B {

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    public static final float[][] f18202E = {new float[]{0.5f, 0.0f}, new float[]{0.0f, 0.5f}, new float[]{1.0f, 0.5f}, new float[]{0.5f, 1.0f}, new float[]{0.5f, 0.5f}, new float[]{0.0f, 0.5f}, new float[]{1.0f, 0.5f}};

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    public static final float[][] f18203F = {new float[]{0.0f, -1.0f}, new float[]{0.0f, 1.0f}, new float[]{-1.0f, 0.0f}, new float[]{1.0f, 0.0f}, new float[]{-1.0f, 0.0f}, new float[]{1.0f, 0.0f}};

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public final float f18204A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public final float f18205B;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public final int f18206C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    public final int f18207D;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f18208a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f18209b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f18210c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f18211d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f18212e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f18213f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public float f18214g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public float f18215h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final int f18216i;
    public final boolean j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public float f18217k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public float f18218l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public boolean f18219m = false;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final float[] f18220n = new float[2];

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final int[] f18221o = new int[2];

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public float f18222p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public float f18223q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final MotionLayout f18224r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final float f18225s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final float f18226t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final boolean f18227u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final float f18228v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final int f18229w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final float f18230x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final float f18231y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public final float f18232z;

    public B(Context context, MotionLayout motionLayout, XmlResourceParser xmlResourceParser) {
        this.f18208a = 0;
        this.f18209b = 0;
        this.f18210c = 0;
        this.f18211d = -1;
        this.f18212e = -1;
        this.f18213f = -1;
        this.f18214g = 0.5f;
        this.f18215h = 0.5f;
        this.f18216i = -1;
        this.j = false;
        this.f18217k = 0.0f;
        this.f18218l = 1.0f;
        this.f18225s = 4.0f;
        this.f18226t = 1.2f;
        this.f18227u = true;
        this.f18228v = 1.0f;
        this.f18229w = 0;
        this.f18230x = 10.0f;
        this.f18231y = 10.0f;
        this.f18232z = 1.0f;
        this.f18204A = Float.NaN;
        this.f18205B = Float.NaN;
        this.f18206C = 0;
        this.f18207D = 0;
        this.f18224r = motionLayout;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(Xml.asAttributeSet(xmlResourceParser), q.f950v);
        int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
        for (int i7 = 0; i7 < indexCount; i7++) {
            int index = typedArrayObtainStyledAttributes.getIndex(i7);
            if (index == 16) {
                this.f18211d = typedArrayObtainStyledAttributes.getResourceId(index, this.f18211d);
            } else if (index == 17) {
                int i8 = typedArrayObtainStyledAttributes.getInt(index, this.f18208a);
                this.f18208a = i8;
                float[] fArr = f18202E[i8];
                this.f18215h = fArr[0];
                this.f18214g = fArr[1];
            } else if (index == 1) {
                int i9 = typedArrayObtainStyledAttributes.getInt(index, this.f18209b);
                this.f18209b = i9;
                if (i9 < 6) {
                    float[] fArr2 = f18203F[i9];
                    this.f18217k = fArr2[0];
                    this.f18218l = fArr2[1];
                } else {
                    this.f18218l = Float.NaN;
                    this.f18217k = Float.NaN;
                    this.j = true;
                }
            } else if (index == 6) {
                this.f18225s = typedArrayObtainStyledAttributes.getFloat(index, this.f18225s);
            } else if (index == 5) {
                this.f18226t = typedArrayObtainStyledAttributes.getFloat(index, this.f18226t);
            } else if (index == 7) {
                this.f18227u = typedArrayObtainStyledAttributes.getBoolean(index, this.f18227u);
            } else if (index == 2) {
                this.f18228v = typedArrayObtainStyledAttributes.getFloat(index, this.f18228v);
            } else if (index == 3) {
                this.f18230x = typedArrayObtainStyledAttributes.getFloat(index, this.f18230x);
            } else if (index == 18) {
                this.f18212e = typedArrayObtainStyledAttributes.getResourceId(index, this.f18212e);
            } else if (index == 9) {
                this.f18210c = typedArrayObtainStyledAttributes.getInt(index, this.f18210c);
            } else if (index == 8) {
                this.f18229w = typedArrayObtainStyledAttributes.getInteger(index, 0);
            } else if (index == 4) {
                this.f18213f = typedArrayObtainStyledAttributes.getResourceId(index, 0);
            } else if (index == 10) {
                this.f18216i = typedArrayObtainStyledAttributes.getResourceId(index, this.f18216i);
            } else if (index == 12) {
                this.f18231y = typedArrayObtainStyledAttributes.getFloat(index, this.f18231y);
            } else if (index == 13) {
                this.f18232z = typedArrayObtainStyledAttributes.getFloat(index, this.f18232z);
            } else if (index == 14) {
                this.f18204A = typedArrayObtainStyledAttributes.getFloat(index, this.f18204A);
            } else if (index == 15) {
                this.f18205B = typedArrayObtainStyledAttributes.getFloat(index, this.f18205B);
            } else if (index == 11) {
                this.f18206C = typedArrayObtainStyledAttributes.getInt(index, this.f18206C);
            } else if (index == 0) {
                this.f18207D = typedArrayObtainStyledAttributes.getInt(index, this.f18207D);
            }
        }
        typedArrayObtainStyledAttributes.recycle();
    }

    public final RectF a(ViewGroup viewGroup, RectF rectF) {
        View viewFindViewById;
        int i7 = this.f18213f;
        if (i7 == -1 || (viewFindViewById = viewGroup.findViewById(i7)) == null) {
            return null;
        }
        rectF.set(viewFindViewById.getLeft(), viewFindViewById.getTop(), viewFindViewById.getRight(), viewFindViewById.getBottom());
        return rectF;
    }

    public final RectF b(ViewGroup viewGroup, RectF rectF) {
        View viewFindViewById;
        int i7 = this.f18212e;
        if (i7 == -1 || (viewFindViewById = viewGroup.findViewById(i7)) == null) {
            return null;
        }
        rectF.set(viewFindViewById.getLeft(), viewFindViewById.getTop(), viewFindViewById.getRight(), viewFindViewById.getBottom());
        return rectF;
    }

    public final void c(boolean z4) {
        float[][] fArr = f18202E;
        float[][] fArr2 = f18203F;
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
        float[] fArr3 = fArr[this.f18208a];
        this.f18215h = fArr3[0];
        this.f18214g = fArr3[1];
        int i7 = this.f18209b;
        if (i7 >= 6) {
            return;
        }
        float[] fArr4 = fArr2[i7];
        this.f18217k = fArr4[0];
        this.f18218l = fArr4[1];
    }

    public final String toString() {
        if (Float.isNaN(this.f18217k)) {
            return "rotation";
        }
        return this.f18217k + " , " + this.f18218l;
    }
}
