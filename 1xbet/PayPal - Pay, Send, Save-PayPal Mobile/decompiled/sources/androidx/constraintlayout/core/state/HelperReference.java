package androidx.constraintlayout.core.state;

/* loaded from: classes.dex */
public class HelperReference extends androidx.constraintlayout.core.state.ConstraintReference implements androidx.constraintlayout.core.state.helpers.Facade {
    private androidx.constraintlayout.core.widgets.HelperWidget c;
    final androidx.constraintlayout.core.state.State.Helper d;
    protected final androidx.constraintlayout.core.state.State mHelperState;
    protected java.util.ArrayList<java.lang.Object> mReferences;

    @Override // androidx.constraintlayout.core.state.ConstraintReference, androidx.constraintlayout.core.state.Reference
    public void apply() {
    }

    public HelperReference(androidx.constraintlayout.core.state.State state, androidx.constraintlayout.core.state.State.Helper helper) {
        super(state);
        this.mReferences = new java.util.ArrayList<>();
        this.mHelperState = state;
        this.d = helper;
    }

    public androidx.constraintlayout.core.state.State.Helper getType() {
        return this.d;
    }

    public androidx.constraintlayout.core.state.HelperReference add(java.lang.Object... objArr) {
        java.util.Collections.addAll(this.mReferences, objArr);
        return this;
    }

    public void setHelperWidget(androidx.constraintlayout.core.widgets.HelperWidget helperWidget) {
        this.c = helperWidget;
    }

    public androidx.constraintlayout.core.widgets.HelperWidget getHelperWidget() {
        return this.c;
    }

    @Override // androidx.constraintlayout.core.state.ConstraintReference, androidx.constraintlayout.core.state.Reference
    public androidx.constraintlayout.core.widgets.ConstraintWidget getConstraintWidget() {
        return getHelperWidget();
    }

    public void applyBase() {
        super.apply();
    }
}
