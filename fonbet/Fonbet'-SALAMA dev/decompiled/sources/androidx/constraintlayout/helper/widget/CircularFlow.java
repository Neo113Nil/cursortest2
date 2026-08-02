package androidx.constraintlayout.helper.widget;

import B.c;
import B.q;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.VirtualLayout;
import java.util.Arrays;
import java.util.HashMap;
import w1.L;

/* loaded from: classes.dex */
public class CircularFlow extends VirtualLayout {

    /* renamed from: L, reason: collision with root package name */
    public static int f8781L;

    /* renamed from: M, reason: collision with root package name */
    public static float f8782M;

    /* renamed from: B, reason: collision with root package name */
    public ConstraintLayout f8783B;

    /* renamed from: C, reason: collision with root package name */
    public int f8784C;

    /* renamed from: D, reason: collision with root package name */
    public float[] f8785D;

    /* renamed from: E, reason: collision with root package name */
    public int[] f8786E;

    /* renamed from: F, reason: collision with root package name */
    public int f8787F;

    /* renamed from: G, reason: collision with root package name */
    public int f8788G;

    /* renamed from: H, reason: collision with root package name */
    public String f8789H;

    /* renamed from: I, reason: collision with root package name */
    public String f8790I;

    /* renamed from: J, reason: collision with root package name */
    public Float f8791J;

    /* renamed from: K, reason: collision with root package name */
    public Integer f8792K;

    public CircularFlow(Context context, AttributeSet attributeSet, int i7) {
        super(context, attributeSet, i7);
    }

    private void setAngles(String str) {
        if (str == null) {
            return;
        }
        int i7 = 0;
        this.f8788G = 0;
        while (true) {
            int indexOf = str.indexOf(44, i7);
            if (indexOf == -1) {
                s(str.substring(i7).trim());
                return;
            } else {
                s(str.substring(i7, indexOf).trim());
                i7 = indexOf + 1;
            }
        }
    }

    private void setRadius(String str) {
        if (str == null) {
            return;
        }
        int i7 = 0;
        this.f8787F = 0;
        while (true) {
            int indexOf = str.indexOf(44, i7);
            if (indexOf == -1) {
                t(str.substring(i7).trim());
                return;
            } else {
                t(str.substring(i7, indexOf).trim());
                i7 = indexOf + 1;
            }
        }
    }

    public float[] getAngles() {
        return Arrays.copyOf(this.f8785D, this.f8788G);
    }

    public int[] getRadius() {
        return Arrays.copyOf(this.f8786E, this.f8787F);
    }

    @Override // androidx.constraintlayout.widget.VirtualLayout, androidx.constraintlayout.widget.ConstraintHelper
    public final void k(AttributeSet attributeSet) {
        super.k(attributeSet);
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, q.f932c);
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i7 = 0; i7 < indexCount; i7++) {
                int index = obtainStyledAttributes.getIndex(i7);
                if (index == 33) {
                    this.f8784C = obtainStyledAttributes.getResourceId(index, 0);
                } else if (index == 29) {
                    String string = obtainStyledAttributes.getString(index);
                    this.f8789H = string;
                    setAngles(string);
                } else if (index == 32) {
                    String string2 = obtainStyledAttributes.getString(index);
                    this.f8790I = string2;
                    setRadius(string2);
                } else if (index == 30) {
                    Float valueOf = Float.valueOf(obtainStyledAttributes.getFloat(index, f8782M));
                    this.f8791J = valueOf;
                    setDefaultAngle(valueOf.floatValue());
                } else if (index == 31) {
                    Integer valueOf2 = Integer.valueOf(obtainStyledAttributes.getDimensionPixelSize(index, f8781L));
                    this.f8792K = valueOf2;
                    setDefaultRadius(valueOf2.intValue());
                }
            }
            obtainStyledAttributes.recycle();
        }
    }

    @Override // androidx.constraintlayout.widget.VirtualLayout, androidx.constraintlayout.widget.ConstraintHelper, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        String str = this.f8789H;
        if (str != null) {
            this.f8785D = new float[1];
            setAngles(str);
        }
        String str2 = this.f8790I;
        if (str2 != null) {
            this.f8786E = new int[1];
            setRadius(str2);
        }
        Float f7 = this.f8791J;
        if (f7 != null) {
            setDefaultAngle(f7.floatValue());
        }
        Integer num = this.f8792K;
        if (num != null) {
            setDefaultRadius(num.intValue());
        }
        this.f8783B = (ConstraintLayout) getParent();
        for (int i7 = 0; i7 < this.f8991b; i7++) {
            View b7 = this.f8783B.b(this.f8990a[i7]);
            if (b7 != null) {
                int i8 = f8781L;
                float f8 = f8782M;
                int[] iArr = this.f8786E;
                HashMap hashMap = this.f8997y;
                if (iArr == null || i7 >= iArr.length) {
                    Integer num2 = this.f8792K;
                    if (num2 == null || num2.intValue() == -1) {
                        L.m(new StringBuilder("Added radius to view with id: "), (String) hashMap.get(Integer.valueOf(b7.getId())), "CircularFlow");
                    } else {
                        this.f8787F++;
                        if (this.f8786E == null) {
                            this.f8786E = new int[1];
                        }
                        int[] radius = getRadius();
                        this.f8786E = radius;
                        radius[this.f8787F - 1] = i8;
                    }
                } else {
                    i8 = iArr[i7];
                }
                float[] fArr = this.f8785D;
                if (fArr == null || i7 >= fArr.length) {
                    Float f9 = this.f8791J;
                    if (f9 == null || f9.floatValue() == -1.0f) {
                        L.m(new StringBuilder("Added angle to view with id: "), (String) hashMap.get(Integer.valueOf(b7.getId())), "CircularFlow");
                    } else {
                        this.f8788G++;
                        if (this.f8785D == null) {
                            this.f8785D = new float[1];
                        }
                        float[] angles = getAngles();
                        this.f8785D = angles;
                        angles[this.f8788G - 1] = f8;
                    }
                } else {
                    f8 = fArr[i7];
                }
                c cVar = (c) b7.getLayoutParams();
                cVar.f759r = f8;
                cVar.f755p = this.f8784C;
                cVar.f757q = i8;
                b7.setLayoutParams(cVar);
            }
        }
        e();
    }

    public final void s(String str) {
        float[] fArr;
        if (str == null || str.length() == 0 || this.f8992c == null || (fArr = this.f8785D) == null) {
            return;
        }
        if (this.f8788G + 1 > fArr.length) {
            this.f8785D = Arrays.copyOf(fArr, fArr.length + 1);
        }
        this.f8785D[this.f8788G] = Integer.parseInt(str);
        this.f8788G++;
    }

    public void setDefaultAngle(float f7) {
        f8782M = f7;
    }

    public void setDefaultRadius(int i7) {
        f8781L = i7;
    }

    public final void t(String str) {
        Context context;
        int[] iArr;
        if (str == null || str.length() == 0 || (context = this.f8992c) == null || (iArr = this.f8786E) == null) {
            return;
        }
        if (this.f8787F + 1 > iArr.length) {
            this.f8786E = Arrays.copyOf(iArr, iArr.length + 1);
        }
        this.f8786E[this.f8787F] = (int) (Integer.parseInt(str) * context.getResources().getDisplayMetrics().density);
        this.f8787F++;
    }
}
