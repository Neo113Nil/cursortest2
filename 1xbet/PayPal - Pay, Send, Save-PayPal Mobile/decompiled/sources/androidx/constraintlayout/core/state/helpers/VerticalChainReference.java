package androidx.constraintlayout.core.state.helpers;

/* loaded from: classes7.dex */
public class VerticalChainReference extends androidx.constraintlayout.core.state.helpers.ChainReference {
    public VerticalChainReference(androidx.constraintlayout.core.state.State state) {
        super(state, androidx.constraintlayout.core.state.State.Helper.VERTICAL_CHAIN);
    }

    @Override // androidx.constraintlayout.core.state.HelperReference, androidx.constraintlayout.core.state.ConstraintReference, androidx.constraintlayout.core.state.Reference
    public void apply() {
        java.util.Iterator<java.lang.Object> it = this.mReferences.iterator();
        while (it.hasNext()) {
            this.mHelperState.constraints(it.next()).clearVertical();
        }
        java.util.Iterator<java.lang.Object> it2 = this.mReferences.iterator();
        androidx.constraintlayout.core.state.ConstraintReference constraintReference = null;
        androidx.constraintlayout.core.state.ConstraintReference constraintReference2 = null;
        while (it2.hasNext()) {
            java.lang.Object next = it2.next();
            androidx.constraintlayout.core.state.ConstraintReference constraints = this.mHelperState.constraints(next);
            if (constraintReference2 == null) {
                if (this.mTopToTop != null) {
                    constraints.topToTop(this.mTopToTop).margin(this.mMarginTop).marginGone(this.mMarginTopGone);
                } else if (this.mTopToBottom != null) {
                    constraints.topToBottom(this.mTopToBottom).margin(this.mMarginTop).marginGone(this.mMarginTopGone);
                } else {
                    java.lang.String obj = constraints.getKey().toString();
                    constraints.topToTop(androidx.constraintlayout.core.state.State.PARENT).margin(java.lang.Float.valueOf(getPreMargin(obj))).marginGone(java.lang.Float.valueOf(getHighSpeedVideoFpsRanges(obj)));
                }
                constraintReference2 = constraints;
            }
            if (constraintReference != null) {
                java.lang.String obj2 = constraintReference.getKey().toString();
                java.lang.String obj3 = constraints.getKey().toString();
                constraintReference.bottomToTop(constraints.getKey()).margin(java.lang.Float.valueOf(getPostMargin(obj2))).marginGone(java.lang.Float.valueOf(Camera2StreamConfigurationMap(obj2)));
                constraints.topToBottom(constraintReference.getKey()).margin(java.lang.Float.valueOf(getPreMargin(obj3))).marginGone(java.lang.Float.valueOf(getHighSpeedVideoFpsRanges(obj3)));
            }
            float weight = getWeight(next.toString());
            if (weight != -1.0f) {
                constraints.setVerticalChainWeight(weight);
            }
            constraintReference = constraints;
        }
        if (constraintReference != null) {
            if (this.mBottomToTop != null) {
                constraintReference.bottomToTop(this.mBottomToTop).margin(this.mMarginBottom).marginGone(this.mMarginBottomGone);
            } else if (this.mBottomToBottom != null) {
                constraintReference.bottomToBottom(this.mBottomToBottom).margin(this.mMarginBottom).marginGone(this.mMarginBottomGone);
            } else {
                java.lang.String obj4 = constraintReference.getKey().toString();
                constraintReference.bottomToBottom(androidx.constraintlayout.core.state.State.PARENT).margin(java.lang.Float.valueOf(getPostMargin(obj4))).marginGone(java.lang.Float.valueOf(Camera2StreamConfigurationMap(obj4)));
            }
        }
        if (constraintReference2 != null) {
            if (this.mBias != 0.5f) {
                constraintReference2.verticalBias(this.mBias);
            }
            int i = androidx.constraintlayout.core.state.helpers.VerticalChainReference.AnonymousClass1.getHighSpeedVideoFpsRangesFor[this.mStyle.ordinal()];
            if (i == 1) {
                constraintReference2.setVerticalChainStyle(0);
            } else if (i == 2) {
                constraintReference2.setVerticalChainStyle(1);
            } else {
                if (i != 3) {
                    return;
                }
                constraintReference2.setVerticalChainStyle(2);
            }
        }
    }

    /* renamed from: androidx.constraintlayout.core.state.helpers.VerticalChainReference$1, reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] getHighSpeedVideoFpsRangesFor;

        static {
            int[] iArr = new int[androidx.constraintlayout.core.state.State.Chain.values().length];
            getHighSpeedVideoFpsRangesFor = iArr;
            try {
                iArr[androidx.constraintlayout.core.state.State.Chain.SPREAD.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                getHighSpeedVideoFpsRangesFor[androidx.constraintlayout.core.state.State.Chain.SPREAD_INSIDE.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            try {
                getHighSpeedVideoFpsRangesFor[androidx.constraintlayout.core.state.State.Chain.PACKED.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused3) {
            }
        }
    }
}
