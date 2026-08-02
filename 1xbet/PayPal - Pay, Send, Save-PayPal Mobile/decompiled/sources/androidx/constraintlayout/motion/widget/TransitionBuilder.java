package androidx.constraintlayout.motion.widget;

/* loaded from: classes7.dex */
public class TransitionBuilder {
    public static void validate(androidx.constraintlayout.motion.widget.MotionLayout motionLayout) {
        if (motionLayout.accessartificialFrame == null) {
            throw new java.lang.RuntimeException("Invalid motion layout. Layout missing Motion Scene.");
        }
        androidx.constraintlayout.motion.widget.MotionScene motionScene = motionLayout.accessartificialFrame;
        if (!motionScene.validateLayout(motionLayout)) {
            throw new java.lang.RuntimeException("MotionLayout doesn't have the right motion scene.");
        }
        if (motionScene.getHighSpeedVideoFpsRangesFor == null || motionScene.getDefinedTransitions().isEmpty()) {
            throw new java.lang.RuntimeException("Invalid motion layout. Motion Scene doesn't have any transition.");
        }
    }

    public static androidx.constraintlayout.motion.widget.MotionScene.Transition buildTransition(androidx.constraintlayout.motion.widget.MotionScene motionScene, int i, int i2, androidx.constraintlayout.widget.ConstraintSet constraintSet, int i3, androidx.constraintlayout.widget.ConstraintSet constraintSet2) {
        androidx.constraintlayout.motion.widget.MotionScene.Transition transition = new androidx.constraintlayout.motion.widget.MotionScene.Transition(i, motionScene, i2, i3);
        int startConstraintSetId = transition.getStartConstraintSetId();
        int endConstraintSetId = transition.getEndConstraintSetId();
        motionScene.setConstraintSet(startConstraintSetId, constraintSet);
        motionScene.setConstraintSet(endConstraintSetId, constraintSet2);
        return transition;
    }
}
