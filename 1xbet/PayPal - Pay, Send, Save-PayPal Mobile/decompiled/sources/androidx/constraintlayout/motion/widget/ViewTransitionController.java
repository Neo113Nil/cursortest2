package androidx.constraintlayout.motion.widget;

/* loaded from: classes7.dex */
public class ViewTransitionController {
    java.util.HashSet<android.view.View> Camera2StreamConfigurationMap;
    java.util.ArrayList<androidx.constraintlayout.motion.widget.ViewTransition.Animate> getHighSpeedVideoFpsRanges;
    final androidx.constraintlayout.motion.widget.MotionLayout getHighSpeedVideoFpsRangesFor;
    java.util.ArrayList<androidx.constraintlayout.motion.widget.ViewTransition> getOutputFormats = new java.util.ArrayList<>();
    java.lang.String getHighResolutionOutputSizeshNQ4ISI = "ViewTransitionController";
    java.util.ArrayList<androidx.constraintlayout.motion.widget.ViewTransition.Animate> getHighSpeedVideoSizes = new java.util.ArrayList<>();

    public ViewTransitionController(androidx.constraintlayout.motion.widget.MotionLayout motionLayout) {
        this.getHighSpeedVideoFpsRangesFor = motionLayout;
    }

    public void add(androidx.constraintlayout.motion.widget.ViewTransition viewTransition) {
        this.getOutputFormats.add(viewTransition);
        this.Camera2StreamConfigurationMap = null;
        if (viewTransition.getStateTransition() == 4) {
            getHighSpeedVideoFpsRangesFor(viewTransition, true);
        } else if (viewTransition.getStateTransition() == 5) {
            getHighSpeedVideoFpsRangesFor(viewTransition, false);
        }
    }

    private void getHighSpeedVideoFpsRangesFor(final androidx.constraintlayout.motion.widget.ViewTransition viewTransition, final boolean z) {
        final int sharedValueID = viewTransition.getSharedValueID();
        final int sharedValue = viewTransition.getSharedValue();
        androidx.constraintlayout.widget.ConstraintLayout.getSharedValues().addListener(viewTransition.getSharedValueID(), new androidx.constraintlayout.widget.SharedValues.SharedValuesListener() { // from class: androidx.constraintlayout.motion.widget.ViewTransitionController.1
            @Override // androidx.constraintlayout.widget.SharedValues.SharedValuesListener
            public void onNewValue(int i, int i2, int i3) {
                int sharedValueCurrent = viewTransition.getSharedValueCurrent();
                viewTransition.setSharedValueCurrent(i2);
                if (sharedValueID != i || sharedValueCurrent == i2) {
                    return;
                }
                int i4 = 0;
                if (z) {
                    if (sharedValue == i2) {
                        int childCount = androidx.constraintlayout.motion.widget.ViewTransitionController.this.getHighSpeedVideoFpsRangesFor.getChildCount();
                        while (i4 < childCount) {
                            android.view.View childAt = androidx.constraintlayout.motion.widget.ViewTransitionController.this.getHighSpeedVideoFpsRangesFor.getChildAt(i4);
                            if (viewTransition.getHighSpeedVideoFpsRanges(childAt)) {
                                int currentState = androidx.constraintlayout.motion.widget.ViewTransitionController.this.getHighSpeedVideoFpsRangesFor.getCurrentState();
                                androidx.constraintlayout.widget.ConstraintSet constraintSet = androidx.constraintlayout.motion.widget.ViewTransitionController.this.getHighSpeedVideoFpsRangesFor.getConstraintSet(currentState);
                                androidx.constraintlayout.motion.widget.ViewTransition viewTransition2 = viewTransition;
                                androidx.constraintlayout.motion.widget.ViewTransitionController viewTransitionController = androidx.constraintlayout.motion.widget.ViewTransitionController.this;
                                viewTransition2.getHighSpeedVideoSizes(viewTransitionController, viewTransitionController.getHighSpeedVideoFpsRangesFor, currentState, constraintSet, childAt);
                            }
                            i4++;
                        }
                        return;
                    }
                    return;
                }
                if (sharedValue != i2) {
                    int childCount2 = androidx.constraintlayout.motion.widget.ViewTransitionController.this.getHighSpeedVideoFpsRangesFor.getChildCount();
                    while (i4 < childCount2) {
                        android.view.View childAt2 = androidx.constraintlayout.motion.widget.ViewTransitionController.this.getHighSpeedVideoFpsRangesFor.getChildAt(i4);
                        if (viewTransition.getHighSpeedVideoFpsRanges(childAt2)) {
                            int currentState2 = androidx.constraintlayout.motion.widget.ViewTransitionController.this.getHighSpeedVideoFpsRangesFor.getCurrentState();
                            androidx.constraintlayout.widget.ConstraintSet constraintSet2 = androidx.constraintlayout.motion.widget.ViewTransitionController.this.getHighSpeedVideoFpsRangesFor.getConstraintSet(currentState2);
                            androidx.constraintlayout.motion.widget.ViewTransition viewTransition3 = viewTransition;
                            androidx.constraintlayout.motion.widget.ViewTransitionController viewTransitionController2 = androidx.constraintlayout.motion.widget.ViewTransitionController.this;
                            viewTransition3.getHighSpeedVideoSizes(viewTransitionController2, viewTransitionController2.getHighSpeedVideoFpsRangesFor, currentState2, constraintSet2, childAt2);
                        }
                        i4++;
                    }
                }
            }
        });
    }
}
