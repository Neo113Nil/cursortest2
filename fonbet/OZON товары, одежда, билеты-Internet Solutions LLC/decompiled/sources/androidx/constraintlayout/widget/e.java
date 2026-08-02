package androidx.constraintlayout.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;

/* loaded from: classes.dex */
public final class e extends ViewGroup {
    @Override // android.view.ViewGroup
    protected final ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new a();
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new a(getContext(), attributeSet);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected final void onLayout(boolean z11, int i11, int i12, int i13, int i14) {
    }

    @Override // android.view.ViewGroup
    protected final ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return new ConstraintLayout.b(layoutParams);
    }

    /* loaded from: classes8.dex */
    public static class a extends ConstraintLayout.b {

        /* renamed from: A0, reason: collision with root package name */
        public float f41830A0;

        /* renamed from: B0, reason: collision with root package name */
        public float f41831B0;

        /* renamed from: C0, reason: collision with root package name */
        public float f41832C0;

        /* renamed from: D0, reason: collision with root package name */
        public float f41833D0;

        /* renamed from: r0, reason: collision with root package name */
        public float f41834r0;

        /* renamed from: s0, reason: collision with root package name */
        public boolean f41835s0;

        /* renamed from: t0, reason: collision with root package name */
        public float f41836t0;

        /* renamed from: u0, reason: collision with root package name */
        public float f41837u0;

        /* renamed from: v0, reason: collision with root package name */
        public float f41838v0;

        /* renamed from: w0, reason: collision with root package name */
        public float f41839w0;

        /* renamed from: x0, reason: collision with root package name */
        public float f41840x0;

        /* renamed from: y0, reason: collision with root package name */
        public float f41841y0;

        /* renamed from: z0, reason: collision with root package name */
        public float f41842z0;

        public a() {
            super(-2, -2);
            this.f41834r0 = 1.0f;
            this.f41835s0 = false;
            this.f41836t0 = 0.0f;
            this.f41837u0 = 0.0f;
            this.f41838v0 = 0.0f;
            this.f41839w0 = 0.0f;
            this.f41840x0 = 1.0f;
            this.f41841y0 = 1.0f;
            this.f41842z0 = 0.0f;
            this.f41830A0 = 0.0f;
            this.f41831B0 = 0.0f;
            this.f41832C0 = 0.0f;
            this.f41833D0 = 0.0f;
        }

        public a(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            this.f41834r0 = 1.0f;
            this.f41835s0 = false;
            this.f41836t0 = 0.0f;
            this.f41837u0 = 0.0f;
            this.f41838v0 = 0.0f;
            this.f41839w0 = 0.0f;
            this.f41840x0 = 1.0f;
            this.f41841y0 = 1.0f;
            this.f41842z0 = 0.0f;
            this.f41830A0 = 0.0f;
            this.f41831B0 = 0.0f;
            this.f41832C0 = 0.0f;
            this.f41833D0 = 0.0f;
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, i.f41847d);
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i11 = 0; i11 < indexCount; i11++) {
                int index = obtainStyledAttributes.getIndex(i11);
                if (index == 15) {
                    this.f41834r0 = obtainStyledAttributes.getFloat(index, this.f41834r0);
                } else if (index == 28) {
                    this.f41836t0 = obtainStyledAttributes.getFloat(index, this.f41836t0);
                    this.f41835s0 = true;
                } else if (index == 23) {
                    this.f41838v0 = obtainStyledAttributes.getFloat(index, this.f41838v0);
                } else if (index == 24) {
                    this.f41839w0 = obtainStyledAttributes.getFloat(index, this.f41839w0);
                } else if (index == 22) {
                    this.f41837u0 = obtainStyledAttributes.getFloat(index, this.f41837u0);
                } else if (index == 20) {
                    this.f41840x0 = obtainStyledAttributes.getFloat(index, this.f41840x0);
                } else if (index == 21) {
                    this.f41841y0 = obtainStyledAttributes.getFloat(index, this.f41841y0);
                } else if (index == 16) {
                    this.f41842z0 = obtainStyledAttributes.getFloat(index, this.f41842z0);
                } else if (index == 17) {
                    this.f41830A0 = obtainStyledAttributes.getFloat(index, this.f41830A0);
                } else if (index == 18) {
                    this.f41831B0 = obtainStyledAttributes.getFloat(index, this.f41831B0);
                } else if (index == 19) {
                    this.f41832C0 = obtainStyledAttributes.getFloat(index, this.f41832C0);
                } else if (index == 27) {
                    this.f41833D0 = obtainStyledAttributes.getFloat(index, this.f41833D0);
                }
            }
            obtainStyledAttributes.recycle();
        }
    }
}
