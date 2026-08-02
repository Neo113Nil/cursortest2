package androidx.constraintlayout.core.state.helpers;

/* loaded from: classes7.dex */
public class HorizontalChainReference extends androidx.constraintlayout.core.state.helpers.ChainReference {
    public HorizontalChainReference(androidx.constraintlayout.core.state.State state) {
        super(state, androidx.constraintlayout.core.state.State.Helper.HORIZONTAL_CHAIN);
    }

    @Override // androidx.constraintlayout.core.state.HelperReference, androidx.constraintlayout.core.state.ConstraintReference, androidx.constraintlayout.core.state.Reference
    public void apply() {
        java.util.Iterator<java.lang.Object> it = this.mReferences.iterator();
        while (it.hasNext()) {
            this.mHelperState.constraints(it.next()).clearHorizontal();
        }
        java.util.Iterator<java.lang.Object> it2 = this.mReferences.iterator();
        androidx.constraintlayout.core.state.ConstraintReference constraintReference = null;
        androidx.constraintlayout.core.state.ConstraintReference constraintReference2 = null;
        while (it2.hasNext()) {
            java.lang.Object next = it2.next();
            androidx.constraintlayout.core.state.ConstraintReference constraints = this.mHelperState.constraints(next);
            if (constraintReference2 == null) {
                if (this.mStartToStart != null) {
                    constraints.startToStart(this.mStartToStart).margin(this.mMarginStart).marginGone(this.mMarginStartGone);
                } else if (this.mStartToEnd != null) {
                    constraints.startToEnd(this.mStartToEnd).margin(this.mMarginStart).marginGone(this.mMarginStartGone);
                } else if (this.mLeftToLeft != null) {
                    constraints.startToStart(this.mLeftToLeft).margin(this.mMarginLeft).marginGone(this.mMarginLeftGone);
                } else if (this.mLeftToRight != null) {
                    constraints.startToEnd(this.mLeftToRight).margin(this.mMarginLeft).marginGone(this.mMarginLeftGone);
                } else {
                    java.lang.String obj = constraints.getKey().toString();
                    constraints.startToStart(androidx.constraintlayout.core.state.State.PARENT).margin(java.lang.Float.valueOf(getPreMargin(obj))).marginGone(java.lang.Float.valueOf(getHighSpeedVideoFpsRanges(obj)));
                }
                constraintReference2 = constraints;
            }
            if (constraintReference != null) {
                java.lang.String obj2 = constraintReference.getKey().toString();
                java.lang.String obj3 = constraints.getKey().toString();
                constraintReference.endToStart(constraints.getKey()).margin(java.lang.Float.valueOf(getPostMargin(obj2))).marginGone(java.lang.Float.valueOf(Camera2StreamConfigurationMap(obj2)));
                constraints.startToEnd(constraintReference.getKey()).margin(java.lang.Float.valueOf(getPreMargin(obj3))).marginGone(java.lang.Float.valueOf(getHighSpeedVideoFpsRanges(obj3)));
            }
            float weight = getWeight(next.toString());
            if (weight != -1.0f) {
                constraints.setHorizontalChainWeight(weight);
            }
            constraintReference = constraints;
        }
        if (constraintReference != null) {
            if (this.mEndToStart != null) {
                constraintReference.endToStart(this.mEndToStart).margin(this.mMarginEnd).marginGone(this.mMarginEndGone);
            } else if (this.mEndToEnd != null) {
                constraintReference.endToEnd(this.mEndToEnd).margin(this.mMarginEnd).marginGone(this.mMarginEndGone);
            } else if (this.mRightToLeft != null) {
                constraintReference.endToStart(this.mRightToLeft).margin(this.mMarginRight).marginGone(this.mMarginRightGone);
            } else if (this.mRightToRight != null) {
                constraintReference.endToEnd(this.mRightToRight).margin(this.mMarginRight).marginGone(this.mMarginRightGone);
            } else {
                java.lang.String obj4 = constraintReference.getKey().toString();
                constraintReference.endToEnd(androidx.constraintlayout.core.state.State.PARENT).margin(java.lang.Float.valueOf(getPostMargin(obj4))).marginGone(java.lang.Float.valueOf(Camera2StreamConfigurationMap(obj4)));
            }
        }
        if (constraintReference2 != null) {
            if (this.mBias != 0.5f) {
                constraintReference2.horizontalBias(this.mBias);
            }
            int i = androidx.constraintlayout.core.state.helpers.HorizontalChainReference.AnonymousClass1.getHighResolutionOutputSizeshNQ4ISI[this.mStyle.ordinal()];
            if (i == 1) {
                constraintReference2.setHorizontalChainStyle(0);
            } else if (i == 2) {
                constraintReference2.setHorizontalChainStyle(1);
            } else {
                if (i != 3) {
                    return;
                }
                constraintReference2.setHorizontalChainStyle(2);
            }
        }
    }

    /* renamed from: androidx.constraintlayout.core.state.helpers.HorizontalChainReference$1, reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] getHighResolutionOutputSizeshNQ4ISI;

        static {
            int[] iArr = new int[androidx.constraintlayout.core.state.State.Chain.values().length];
            getHighResolutionOutputSizeshNQ4ISI = iArr;
            try {
                iArr[androidx.constraintlayout.core.state.State.Chain.SPREAD.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                getHighResolutionOutputSizeshNQ4ISI[androidx.constraintlayout.core.state.State.Chain.SPREAD_INSIDE.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            try {
                getHighResolutionOutputSizeshNQ4ISI[androidx.constraintlayout.core.state.State.Chain.PACKED.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused3) {
            }
        }
    }
}
