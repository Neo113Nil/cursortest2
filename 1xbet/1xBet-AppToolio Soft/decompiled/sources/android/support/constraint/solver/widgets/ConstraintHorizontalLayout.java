package android.support.constraint.solver.widgets;

import android.support.constraint.solver.LinearSystem;
import android.support.constraint.solver.widgets.ConstraintAnchor;

/* loaded from: classes.dex */
public class ConstraintHorizontalLayout extends ConstraintWidgetContainer {
    private ContentAlignment mAlignment;

    public enum ContentAlignment {
        BEGIN,
        MIDDLE,
        END,
        TOP,
        VERTICAL_MIDDLE,
        BOTTOM,
        LEFT,
        RIGHT
    }

    public ConstraintHorizontalLayout() {
        this.mAlignment = ContentAlignment.MIDDLE;
    }

    public ConstraintHorizontalLayout(int i, int i2, int i3, int i4) {
        super(i, i2, i3, i4);
        this.mAlignment = ContentAlignment.MIDDLE;
    }

    public ConstraintHorizontalLayout(int i, int i2) {
        super(i, i2);
        this.mAlignment = ContentAlignment.MIDDLE;
    }

    @Override // android.support.constraint.solver.widgets.ConstraintWidget
    public void addToSolver(LinearSystem linearSystem) {
        if (this.mChildren.size() != 0) {
            int i = 0;
            int size = this.mChildren.size();
            ConstraintHorizontalLayout constraintHorizontalLayout = this;
            while (i < size) {
                ConstraintWidget constraintWidget = this.mChildren.get(i);
                if (constraintHorizontalLayout != this) {
                    constraintWidget.connect(ConstraintAnchor.Type.LEFT, constraintHorizontalLayout, ConstraintAnchor.Type.RIGHT);
                    constraintHorizontalLayout.connect(ConstraintAnchor.Type.RIGHT, constraintWidget, ConstraintAnchor.Type.LEFT);
                } else {
                    constraintWidget.connect(ConstraintAnchor.Type.LEFT, constraintHorizontalLayout, ConstraintAnchor.Type.LEFT, 0, this.mAlignment == ContentAlignment.END ? ConstraintAnchor.Strength.WEAK : ConstraintAnchor.Strength.STRONG);
                }
                constraintWidget.connect(ConstraintAnchor.Type.TOP, this, ConstraintAnchor.Type.TOP);
                constraintWidget.connect(ConstraintAnchor.Type.BOTTOM, this, ConstraintAnchor.Type.BOTTOM);
                i++;
                constraintHorizontalLayout = constraintWidget;
            }
            if (constraintHorizontalLayout != this) {
                constraintHorizontalLayout.connect(ConstraintAnchor.Type.RIGHT, this, ConstraintAnchor.Type.RIGHT, 0, this.mAlignment == ContentAlignment.BEGIN ? ConstraintAnchor.Strength.WEAK : ConstraintAnchor.Strength.STRONG);
            }
        }
        super.addToSolver(linearSystem);
    }
}
