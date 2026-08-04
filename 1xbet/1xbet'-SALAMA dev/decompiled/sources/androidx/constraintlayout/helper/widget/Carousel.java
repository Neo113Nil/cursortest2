package androidx.constraintlayout.helper.widget;

import B.q;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import androidx.appcompat.widget.b1;
import androidx.constraintlayout.motion.widget.MotionHelper;
import androidx.constraintlayout.motion.widget.MotionLayout;
import java.util.ArrayList;
import p160x.a;
import p169z.B;
import p169z.y;

/* JADX INFO: loaded from: classes.dex */
public class Carousel extends MotionHelper {

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    public final ArrayList f8768D;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    public int f8769E;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    public MotionLayout f8770F;

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    public final int f8771G;

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    public final boolean f8772H;

    /* JADX INFO: renamed from: I, reason: collision with root package name */
    public final int f8773I;

    /* JADX INFO: renamed from: J, reason: collision with root package name */
    public final int f8774J;

    /* JADX INFO: renamed from: K, reason: collision with root package name */
    public final int f8775K;

    /* JADX INFO: renamed from: L, reason: collision with root package name */
    public final int f8776L;

    /* JADX INFO: renamed from: M, reason: collision with root package name */
    public final float f8777M;

    /* JADX INFO: renamed from: N, reason: collision with root package name */
    public final int f8778N;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    public final int f8779O;

    /* JADX INFO: renamed from: P, reason: collision with root package name */
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
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, q.f930a);
            int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
            for (int i8 = 0; i8 < indexCount; i8++) {
                int index = typedArrayObtainStyledAttributes.getIndex(i8);
                if (index == 2) {
                    this.f8771G = typedArrayObtainStyledAttributes.getResourceId(index, this.f8771G);
                } else if (index == 0) {
                    this.f8773I = typedArrayObtainStyledAttributes.getResourceId(index, this.f8773I);
                } else if (index == 3) {
                    this.f8774J = typedArrayObtainStyledAttributes.getResourceId(index, this.f8774J);
                } else if (index == 1) {
                    this.f8778N = typedArrayObtainStyledAttributes.getInt(index, this.f8778N);
                } else if (index == 6) {
                    this.f8775K = typedArrayObtainStyledAttributes.getResourceId(index, this.f8775K);
                } else if (index == 5) {
                    this.f8776L = typedArrayObtainStyledAttributes.getResourceId(index, this.f8776L);
                } else if (index == 8) {
                    this.f8777M = typedArrayObtainStyledAttributes.getFloat(index, this.f8777M);
                } else if (index == 7) {
                    this.f8779O = typedArrayObtainStyledAttributes.getInt(index, this.f8779O);
                } else if (index == 9) {
                    this.f8780P = typedArrayObtainStyledAttributes.getFloat(index, this.f8780P);
                } else if (index == 4) {
                    this.f8772H = typedArrayObtainStyledAttributes.getBoolean(index, this.f8772H);
                }
            }
            typedArrayObtainStyledAttributes.recycle();
        }
    }

    @Override // androidx.constraintlayout.motion.widget.MotionHelper, p169z.u
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
                y yVarQ = motionLayout.q(this.f8774J);
                if (yVarQ != null && (b8 = yVarQ.f18408l) != null) {
                    b8.f18210c = 5;
                }
                y yVarQ2 = this.f8770F.q(this.f8773I);
                if (yVarQ2 == null || (b7 = yVarQ2.f18408l) == null) {
                    return;
                }
                b7.f18210c = 5;
            }
        }
    }

    public void setAdapter(a aVar) {
    }
}
