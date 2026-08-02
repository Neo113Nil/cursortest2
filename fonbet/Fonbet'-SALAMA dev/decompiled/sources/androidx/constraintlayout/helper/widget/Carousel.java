package androidx.constraintlayout.helper.widget;

import B.q;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import androidx.appcompat.widget.b1;
import androidx.constraintlayout.motion.widget.MotionHelper;
import androidx.constraintlayout.motion.widget.MotionLayout;
import java.util.ArrayList;
import x.InterfaceC1784a;
import z.B;
import z.y;

/* loaded from: classes.dex */
public class Carousel extends MotionHelper {

    /* renamed from: D, reason: collision with root package name */
    public final ArrayList f8768D;

    /* renamed from: E, reason: collision with root package name */
    public int f8769E;

    /* renamed from: F, reason: collision with root package name */
    public MotionLayout f8770F;

    /* renamed from: G, reason: collision with root package name */
    public final int f8771G;

    /* renamed from: H, reason: collision with root package name */
    public final boolean f8772H;

    /* renamed from: I, reason: collision with root package name */
    public final int f8773I;

    /* renamed from: J, reason: collision with root package name */
    public final int f8774J;

    /* renamed from: K, reason: collision with root package name */
    public final int f8775K;

    /* renamed from: L, reason: collision with root package name */
    public final int f8776L;

    /* renamed from: M, reason: collision with root package name */
    public final float f8777M;

    /* renamed from: N, reason: collision with root package name */
    public final int f8778N;

    /* renamed from: O, reason: collision with root package name */
    public final int f8779O;

    /* renamed from: P, reason: collision with root package name */
    public final float f8780P;

    public Carousel(Context context, AttributeSet attributeSet, int i7) {
        super(context, attributeSet, i7);
        this.f8768D = new ArrayList();
        this.f8769E = 0;
        this.f8771G = -1;
        this.f8772H = false;
        this.f8773I = -1;
        this.f8774J = -1;
        this.f8775K = -1;
        this.f8776L = -1;
        this.f8777M = 0.9f;
        this.f8778N = 4;
        this.f8779O = 1;
        this.f8780P = 2.0f;
        new b1(this, 18);
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, q.f930a);
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i8 = 0; i8 < indexCount; i8++) {
                int index = obtainStyledAttributes.getIndex(i8);
                if (index == 2) {
                    this.f8771G = obtainStyledAttributes.getResourceId(index, this.f8771G);
                } else if (index == 0) {
                    this.f8773I = obtainStyledAttributes.getResourceId(index, this.f8773I);
                } else if (index == 3) {
                    this.f8774J = obtainStyledAttributes.getResourceId(index, this.f8774J);
                } else if (index == 1) {
                    this.f8778N = obtainStyledAttributes.getInt(index, this.f8778N);
                } else if (index == 6) {
                    this.f8775K = obtainStyledAttributes.getResourceId(index, this.f8775K);
                } else if (index == 5) {
                    this.f8776L = obtainStyledAttributes.getResourceId(index, this.f8776L);
                } else if (index == 8) {
                    this.f8777M = obtainStyledAttributes.getFloat(index, this.f8777M);
                } else if (index == 7) {
                    this.f8779O = obtainStyledAttributes.getInt(index, this.f8779O);
                } else if (index == 9) {
                    this.f8780P = obtainStyledAttributes.getFloat(index, this.f8780P);
                } else if (index == 4) {
                    this.f8772H = obtainStyledAttributes.getBoolean(index, this.f8772H);
                }
            }
            obtainStyledAttributes.recycle();
        }
    }

    @Override // androidx.constraintlayout.motion.widget.MotionHelper, z.u
    public final void a(int i7) {
        int i8 = this.f8769E;
        if (i7 == this.f8776L) {
            this.f8769E = i8 + 1;
        } else if (i7 == this.f8775K) {
            this.f8769E = i8 - 1;
        }
        if (!this.f8772H) {
            throw null;
        }
        throw null;
    }

    public int getCount() {
        return 0;
    }

    public int getCurrentIndex() {
        return this.f8769E;
    }

    @Override // androidx.constraintlayout.widget.ConstraintHelper, android.view.View
    public final void onAttachedToWindow() {
        B b7;
        B b8;
        super.onAttachedToWindow();
        if (getParent() instanceof MotionLayout) {
            MotionLayout motionLayout = (MotionLayout) getParent();
            for (int i7 = 0; i7 < this.f8991b; i7++) {
                this.f8768D.add(motionLayout.b(this.f8990a[i7]));
            }
            this.f8770F = motionLayout;
            if (this.f8779O == 2) {
                y q7 = motionLayout.q(this.f8774J);
                if (q7 != null && (b8 = q7.f18402l) != null) {
                    b8.f18204c = 5;
                }
                y q8 = this.f8770F.q(this.f8773I);
                if (q8 == null || (b7 = q8.f18402l) == null) {
                    return;
                }
                b7.f18204c = 5;
            }
        }
    }

    public void setAdapter(InterfaceC1784a interfaceC1784a) {
    }
}
