package androidx.constraintlayout.core.state.helpers;

/* loaded from: classes7.dex */
public class AlignVerticallyReference extends androidx.constraintlayout.core.state.HelperReference {
    private float c;

    public AlignVerticallyReference(androidx.constraintlayout.core.state.State state) {
        super(state, androidx.constraintlayout.core.state.State.Helper.ALIGN_VERTICALLY);
        this.c = 0.5f;
    }

    @Override // androidx.constraintlayout.core.state.HelperReference, androidx.constraintlayout.core.state.ConstraintReference, androidx.constraintlayout.core.state.Reference
    public void apply() {
        java.util.Iterator<java.lang.Object> it = this.mReferences.iterator();
        while (it.hasNext()) {
            androidx.constraintlayout.core.state.ConstraintReference constraints = this.mHelperState.constraints(it.next());
            constraints.clearVertical();
            if (this.mTopToTop != null) {
                constraints.topToTop(this.mTopToTop);
            } else if (this.mTopToBottom != null) {
                constraints.topToBottom(this.mTopToBottom);
            } else {
                constraints.topToTop(androidx.constraintlayout.core.state.State.PARENT);
            }
            if (this.mBottomToTop != null) {
                constraints.bottomToTop(this.mBottomToTop);
            } else if (this.mBottomToBottom != null) {
                constraints.bottomToBottom(this.mBottomToBottom);
            } else {
                constraints.bottomToBottom(androidx.constraintlayout.core.state.State.PARENT);
            }
            float f = this.c;
            if (f != 0.5f) {
                constraints.verticalBias(f);
            }
        }
    }
}
