package androidx.constraintlayout.widget;

/* loaded from: classes7.dex */
public class ConstraintSet {
    public static final int BASELINE = 5;
    public static final int BOTTOM = 4;
    public static final int CHAIN_PACKED = 2;
    public static final int CHAIN_SPREAD = 0;
    public static final int CHAIN_SPREAD_INSIDE = 1;
    public static final int CIRCLE_REFERENCE = 8;
    public static final int END = 7;
    public static final int GONE = 8;
    public static final int HORIZONTAL = 0;
    public static final int HORIZONTAL_GUIDELINE = 0;
    public static final int INVISIBLE = 4;
    public static final int LEFT = 1;
    public static final int MATCH_CONSTRAINT = 0;
    public static final int MATCH_CONSTRAINT_PERCENT = 2;
    public static final int MATCH_CONSTRAINT_SPREAD = 0;
    public static final int MATCH_CONSTRAINT_WRAP = 1;
    public static final int PARENT_ID = 0;
    public static final int RIGHT = 2;
    public static final int ROTATE_LEFT_OF_PORTRATE = 4;
    public static final int ROTATE_NONE = 0;
    public static final int ROTATE_PORTRATE_OF_LEFT = 2;
    public static final int ROTATE_PORTRATE_OF_RIGHT = 1;
    public static final int ROTATE_RIGHT_OF_PORTRATE = 3;
    public static final int START = 6;
    public static final int TOP = 3;
    public static final int UNSET = -1;
    public static final int VERTICAL = 1;
    public static final int VERTICAL_GUIDELINE = 1;
    public static final int VISIBILITY_MODE_IGNORE = 1;
    public static final int VISIBILITY_MODE_NORMAL = 0;
    public static final int VISIBLE = 0;
    public static final int WRAP_CONTENT = -2;
    private boolean getOutputMinFrameDuration;
    public java.lang.String mIdString;
    private static final int[] getHighSpeedVideoFpsRanges = {0, 4, 8};
    private static android.util.SparseIntArray getHighSpeedVideoFpsRangesFor = new android.util.SparseIntArray();
    private static android.util.SparseIntArray getHighResolutionOutputSizeshNQ4ISI = new android.util.SparseIntArray();
    public java.lang.String derivedState = "";
    private java.lang.String[] getHighSpeedVideoSizesFor = new java.lang.String[0];
    public int mRotate = 0;
    private java.util.HashMap<java.lang.String, androidx.constraintlayout.widget.ConstraintAttribute> getOutputFormats = new java.util.HashMap<>();
    private boolean Camera2StreamConfigurationMap = true;
    private java.util.HashMap<java.lang.Integer, androidx.constraintlayout.widget.ConstraintSet.Constraint> getHighSpeedVideoSizes = new java.util.HashMap<>();

    static {
        getHighSpeedVideoFpsRangesFor.append(androidx.constraintlayout.widget.R.styleable.Constraint_layout_constraintLeft_toLeftOf, 25);
        getHighSpeedVideoFpsRangesFor.append(androidx.constraintlayout.widget.R.styleable.Constraint_layout_constraintLeft_toRightOf, 26);
        getHighSpeedVideoFpsRangesFor.append(androidx.constraintlayout.widget.R.styleable.Constraint_layout_constraintRight_toLeftOf, 29);
        getHighSpeedVideoFpsRangesFor.append(androidx.constraintlayout.widget.R.styleable.Constraint_layout_constraintRight_toRightOf, 30);
        getHighSpeedVideoFpsRangesFor.append(androidx.constraintlayout.widget.R.styleable.Constraint_layout_constraintTop_toTopOf, 36);
        getHighSpeedVideoFpsRangesFor.append(androidx.constraintlayout.widget.R.styleable.Constraint_layout_constraintTop_toBottomOf, 35);
        getHighSpeedVideoFpsRangesFor.append(androidx.constraintlayout.widget.R.styleable.Constraint_layout_constraintBottom_toTopOf, 4);
        getHighSpeedVideoFpsRangesFor.append(androidx.constraintlayout.widget.R.styleable.Constraint_layout_constraintBottom_toBottomOf, 3);
        getHighSpeedVideoFpsRangesFor.append(androidx.constraintlayout.widget.R.styleable.Constraint_layout_constraintBaseline_toBaselineOf, 1);
        getHighSpeedVideoFpsRangesFor.append(androidx.constraintlayout.widget.R.styleable.Constraint_layout_constraintBaseline_toTopOf, 91);
        getHighSpeedVideoFpsRangesFor.append(androidx.constraintlayout.widget.R.styleable.Constraint_layout_constraintBaseline_toBottomOf, 92);
        getHighSpeedVideoFpsRangesFor.append(androidx.constraintlayout.widget.R.styleable.Constraint_layout_editor_absoluteX, 6);
        getHighSpeedVideoFpsRangesFor.append(androidx.constraintlayout.widget.R.styleable.Constraint_layout_editor_absoluteY, 7);
        getHighSpeedVideoFpsRangesFor.append(androidx.constraintlayout.widget.R.styleable.Constraint_layout_constraintGuide_begin, 17);
        getHighSpeedVideoFpsRangesFor.append(androidx.constraintlayout.widget.R.styleable.Constraint_layout_constraintGuide_end, 18);
        getHighSpeedVideoFpsRangesFor.append(androidx.constraintlayout.widget.R.styleable.Constraint_layout_constraintGuide_percent, 19);
        getHighSpeedVideoFpsRangesFor.append(androidx.constraintlayout.widget.R.styleable.Constraint_guidelineUseRtl, 99);
        getHighSpeedVideoFpsRangesFor.append(androidx.constraintlayout.widget.R.styleable.Constraint_android_orientation, 27);
        getHighSpeedVideoFpsRangesFor.append(androidx.constraintlayout.widget.R.styleable.Constraint_layout_constraintStart_toEndOf, 32);
        getHighSpeedVideoFpsRangesFor.append(androidx.constraintlayout.widget.R.styleable.Constraint_layout_constraintStart_toStartOf, 33);
        getHighSpeedVideoFpsRangesFor.append(androidx.constraintlayout.widget.R.styleable.Constraint_layout_constraintEnd_toStartOf, 10);
        getHighSpeedVideoFpsRangesFor.append(androidx.constraintlayout.widget.R.styleable.Constraint_layout_constraintEnd_toEndOf, 9);
        getHighSpeedVideoFpsRangesFor.append(androidx.constraintlayout.widget.R.styleable.Constraint_layout_goneMarginLeft, 13);
        getHighSpeedVideoFpsRangesFor.append(androidx.constraintlayout.widget.R.styleable.Constraint_layout_goneMarginTop, 16);
        getHighSpeedVideoFpsRangesFor.append(androidx.constraintlayout.widget.R.styleable.Constraint_layout_goneMarginRight, 14);
        getHighSpeedVideoFpsRangesFor.append(androidx.constraintlayout.widget.R.styleable.Constraint_layout_goneMarginBottom, 11);
        getHighSpeedVideoFpsRangesFor.append(androidx.constraintlayout.widget.R.styleable.Constraint_layout_goneMarginStart, 15);
        getHighSpeedVideoFpsRangesFor.append(androidx.constraintlayout.widget.R.styleable.Constraint_layout_goneMarginEnd, 12);
        getHighSpeedVideoFpsRangesFor.append(androidx.constraintlayout.widget.R.styleable.Constraint_layout_constraintVertical_weight, 40);
        getHighSpeedVideoFpsRangesFor.append(androidx.constraintlayout.widget.R.styleable.Constraint_layout_constraintHorizontal_weight, 39);
        getHighSpeedVideoFpsRangesFor.append(androidx.constraintlayout.widget.R.styleable.Constraint_layout_constraintHorizontal_chainStyle, 41);
        getHighSpeedVideoFpsRangesFor.append(androidx.constraintlayout.widget.R.styleable.Constraint_layout_constraintVertical_chainStyle, 42);
        getHighSpeedVideoFpsRangesFor.append(androidx.constraintlayout.widget.R.styleable.Constraint_layout_constraintHorizontal_bias, 20);
        getHighSpeedVideoFpsRangesFor.append(androidx.constraintlayout.widget.R.styleable.Constraint_layout_constraintVertical_bias, 37);
        getHighSpeedVideoFpsRangesFor.append(androidx.constraintlayout.widget.R.styleable.Constraint_layout_constraintDimensionRatio, 5);
        getHighSpeedVideoFpsRangesFor.append(androidx.constraintlayout.widget.R.styleable.Constraint_layout_constraintLeft_creator, 87);
        getHighSpeedVideoFpsRangesFor.append(androidx.constraintlayout.widget.R.styleable.Constraint_layout_constraintTop_creator, 87);
        getHighSpeedVideoFpsRangesFor.append(androidx.constraintlayout.widget.R.styleable.Constraint_layout_constraintRight_creator, 87);
        getHighSpeedVideoFpsRangesFor.append(androidx.constraintlayout.widget.R.styleable.Constraint_layout_constraintBottom_creator, 87);
        getHighSpeedVideoFpsRangesFor.append(androidx.constraintlayout.widget.R.styleable.Constraint_layout_constraintBaseline_creator, 87);
        getHighSpeedVideoFpsRangesFor.append(androidx.constraintlayout.widget.R.styleable.Constraint_android_layout_marginLeft, 24);
        getHighSpeedVideoFpsRangesFor.append(androidx.constraintlayout.widget.R.styleable.Constraint_android_layout_marginRight, 28);
        getHighSpeedVideoFpsRangesFor.append(androidx.constraintlayout.widget.R.styleable.Constraint_android_layout_marginStart, 31);
        getHighSpeedVideoFpsRangesFor.append(androidx.constraintlayout.widget.R.styleable.Constraint_android_layout_marginEnd, 8);
        getHighSpeedVideoFpsRangesFor.append(androidx.constraintlayout.widget.R.styleable.Constraint_android_layout_marginTop, 34);
        getHighSpeedVideoFpsRangesFor.append(androidx.constraintlayout.widget.R.styleable.Constraint_android_layout_marginBottom, 2);
        getHighSpeedVideoFpsRangesFor.append(androidx.constraintlayout.widget.R.styleable.Constraint_android_layout_width, 23);
        getHighSpeedVideoFpsRangesFor.append(androidx.constraintlayout.widget.R.styleable.Constraint_android_layout_height, 21);
        getHighSpeedVideoFpsRangesFor.append(androidx.constraintlayout.widget.R.styleable.Constraint_layout_constraintWidth, 95);
        getHighSpeedVideoFpsRangesFor.append(androidx.constraintlayout.widget.R.styleable.Constraint_layout_constraintHeight, 96);
        getHighSpeedVideoFpsRangesFor.append(androidx.constraintlayout.widget.R.styleable.Constraint_android_visibility, 22);
        getHighSpeedVideoFpsRangesFor.append(androidx.constraintlayout.widget.R.styleable.Constraint_android_alpha, 43);
        getHighSpeedVideoFpsRangesFor.append(androidx.constraintlayout.widget.R.styleable.Constraint_android_elevation, 44);
        getHighSpeedVideoFpsRangesFor.append(androidx.constraintlayout.widget.R.styleable.Constraint_android_rotationX, 45);
        getHighSpeedVideoFpsRangesFor.append(androidx.constraintlayout.widget.R.styleable.Constraint_android_rotationY, 46);
        getHighSpeedVideoFpsRangesFor.append(androidx.constraintlayout.widget.R.styleable.Constraint_android_rotation, 60);
        getHighSpeedVideoFpsRangesFor.append(androidx.constraintlayout.widget.R.styleable.Constraint_android_scaleX, 47);
        getHighSpeedVideoFpsRangesFor.append(androidx.constraintlayout.widget.R.styleable.Constraint_android_scaleY, 48);
        getHighSpeedVideoFpsRangesFor.append(androidx.constraintlayout.widget.R.styleable.Constraint_android_transformPivotX, 49);
        getHighSpeedVideoFpsRangesFor.append(androidx.constraintlayout.widget.R.styleable.Constraint_android_transformPivotY, 50);
        getHighSpeedVideoFpsRangesFor.append(androidx.constraintlayout.widget.R.styleable.Constraint_android_translationX, 51);
        getHighSpeedVideoFpsRangesFor.append(androidx.constraintlayout.widget.R.styleable.Constraint_android_translationY, 52);
        getHighSpeedVideoFpsRangesFor.append(androidx.constraintlayout.widget.R.styleable.Constraint_android_translationZ, 53);
        getHighSpeedVideoFpsRangesFor.append(androidx.constraintlayout.widget.R.styleable.Constraint_layout_constraintWidth_default, 54);
        getHighSpeedVideoFpsRangesFor.append(androidx.constraintlayout.widget.R.styleable.Constraint_layout_constraintHeight_default, 55);
        getHighSpeedVideoFpsRangesFor.append(androidx.constraintlayout.widget.R.styleable.Constraint_layout_constraintWidth_max, 56);
        getHighSpeedVideoFpsRangesFor.append(androidx.constraintlayout.widget.R.styleable.Constraint_layout_constraintHeight_max, 57);
        getHighSpeedVideoFpsRangesFor.append(androidx.constraintlayout.widget.R.styleable.Constraint_layout_constraintWidth_min, 58);
        getHighSpeedVideoFpsRangesFor.append(androidx.constraintlayout.widget.R.styleable.Constraint_layout_constraintHeight_min, 59);
        getHighSpeedVideoFpsRangesFor.append(androidx.constraintlayout.widget.R.styleable.Constraint_layout_constraintCircle, 61);
        getHighSpeedVideoFpsRangesFor.append(androidx.constraintlayout.widget.R.styleable.Constraint_layout_constraintCircleRadius, 62);
        getHighSpeedVideoFpsRangesFor.append(androidx.constraintlayout.widget.R.styleable.Constraint_layout_constraintCircleAngle, 63);
        getHighSpeedVideoFpsRangesFor.append(androidx.constraintlayout.widget.R.styleable.Constraint_animateRelativeTo, 64);
        getHighSpeedVideoFpsRangesFor.append(androidx.constraintlayout.widget.R.styleable.Constraint_transitionEasing, 65);
        getHighSpeedVideoFpsRangesFor.append(androidx.constraintlayout.widget.R.styleable.Constraint_drawPath, 66);
        getHighSpeedVideoFpsRangesFor.append(androidx.constraintlayout.widget.R.styleable.Constraint_transitionPathRotate, 67);
        getHighSpeedVideoFpsRangesFor.append(androidx.constraintlayout.widget.R.styleable.Constraint_motionStagger, 79);
        getHighSpeedVideoFpsRangesFor.append(androidx.constraintlayout.widget.R.styleable.Constraint_android_id, 38);
        getHighSpeedVideoFpsRangesFor.append(androidx.constraintlayout.widget.R.styleable.Constraint_motionProgress, 68);
        getHighSpeedVideoFpsRangesFor.append(androidx.constraintlayout.widget.R.styleable.Constraint_layout_constraintWidth_percent, 69);
        getHighSpeedVideoFpsRangesFor.append(androidx.constraintlayout.widget.R.styleable.Constraint_layout_constraintHeight_percent, 70);
        getHighSpeedVideoFpsRangesFor.append(androidx.constraintlayout.widget.R.styleable.Constraint_layout_wrapBehaviorInParent, 97);
        getHighSpeedVideoFpsRangesFor.append(androidx.constraintlayout.widget.R.styleable.Constraint_chainUseRtl, 71);
        getHighSpeedVideoFpsRangesFor.append(androidx.constraintlayout.widget.R.styleable.Constraint_barrierDirection, 72);
        getHighSpeedVideoFpsRangesFor.append(androidx.constraintlayout.widget.R.styleable.Constraint_barrierMargin, 73);
        getHighSpeedVideoFpsRangesFor.append(androidx.constraintlayout.widget.R.styleable.Constraint_constraint_referenced_ids, 74);
        getHighSpeedVideoFpsRangesFor.append(androidx.constraintlayout.widget.R.styleable.Constraint_barrierAllowsGoneWidgets, 75);
        getHighSpeedVideoFpsRangesFor.append(androidx.constraintlayout.widget.R.styleable.Constraint_pathMotionArc, 76);
        getHighSpeedVideoFpsRangesFor.append(androidx.constraintlayout.widget.R.styleable.Constraint_layout_constraintTag, 77);
        getHighSpeedVideoFpsRangesFor.append(androidx.constraintlayout.widget.R.styleable.Constraint_visibilityMode, 78);
        getHighSpeedVideoFpsRangesFor.append(androidx.constraintlayout.widget.R.styleable.Constraint_layout_constrainedWidth, 80);
        getHighSpeedVideoFpsRangesFor.append(androidx.constraintlayout.widget.R.styleable.Constraint_layout_constrainedHeight, 81);
        getHighSpeedVideoFpsRangesFor.append(androidx.constraintlayout.widget.R.styleable.Constraint_polarRelativeTo, 82);
        getHighSpeedVideoFpsRangesFor.append(androidx.constraintlayout.widget.R.styleable.Constraint_transformPivotTarget, 83);
        getHighSpeedVideoFpsRangesFor.append(androidx.constraintlayout.widget.R.styleable.Constraint_quantizeMotionSteps, 84);
        getHighSpeedVideoFpsRangesFor.append(androidx.constraintlayout.widget.R.styleable.Constraint_quantizeMotionPhase, 85);
        getHighSpeedVideoFpsRangesFor.append(androidx.constraintlayout.widget.R.styleable.Constraint_quantizeMotionInterpolator, 86);
        getHighResolutionOutputSizeshNQ4ISI.append(androidx.constraintlayout.widget.R.styleable.ConstraintOverride_layout_editor_absoluteY, 6);
        getHighResolutionOutputSizeshNQ4ISI.append(androidx.constraintlayout.widget.R.styleable.ConstraintOverride_layout_editor_absoluteY, 7);
        getHighResolutionOutputSizeshNQ4ISI.append(androidx.constraintlayout.widget.R.styleable.ConstraintOverride_android_orientation, 27);
        getHighResolutionOutputSizeshNQ4ISI.append(androidx.constraintlayout.widget.R.styleable.ConstraintOverride_layout_goneMarginLeft, 13);
        getHighResolutionOutputSizeshNQ4ISI.append(androidx.constraintlayout.widget.R.styleable.ConstraintOverride_layout_goneMarginTop, 16);
        getHighResolutionOutputSizeshNQ4ISI.append(androidx.constraintlayout.widget.R.styleable.ConstraintOverride_layout_goneMarginRight, 14);
        getHighResolutionOutputSizeshNQ4ISI.append(androidx.constraintlayout.widget.R.styleable.ConstraintOverride_layout_goneMarginBottom, 11);
        getHighResolutionOutputSizeshNQ4ISI.append(androidx.constraintlayout.widget.R.styleable.ConstraintOverride_layout_goneMarginStart, 15);
        getHighResolutionOutputSizeshNQ4ISI.append(androidx.constraintlayout.widget.R.styleable.ConstraintOverride_layout_goneMarginEnd, 12);
        getHighResolutionOutputSizeshNQ4ISI.append(androidx.constraintlayout.widget.R.styleable.ConstraintOverride_layout_constraintVertical_weight, 40);
        getHighResolutionOutputSizeshNQ4ISI.append(androidx.constraintlayout.widget.R.styleable.ConstraintOverride_layout_constraintHorizontal_weight, 39);
        getHighResolutionOutputSizeshNQ4ISI.append(androidx.constraintlayout.widget.R.styleable.ConstraintOverride_layout_constraintHorizontal_chainStyle, 41);
        getHighResolutionOutputSizeshNQ4ISI.append(androidx.constraintlayout.widget.R.styleable.ConstraintOverride_layout_constraintVertical_chainStyle, 42);
        getHighResolutionOutputSizeshNQ4ISI.append(androidx.constraintlayout.widget.R.styleable.ConstraintOverride_layout_constraintHorizontal_bias, 20);
        getHighResolutionOutputSizeshNQ4ISI.append(androidx.constraintlayout.widget.R.styleable.ConstraintOverride_layout_constraintVertical_bias, 37);
        getHighResolutionOutputSizeshNQ4ISI.append(androidx.constraintlayout.widget.R.styleable.ConstraintOverride_layout_constraintDimensionRatio, 5);
        getHighResolutionOutputSizeshNQ4ISI.append(androidx.constraintlayout.widget.R.styleable.ConstraintOverride_layout_constraintLeft_creator, 87);
        getHighResolutionOutputSizeshNQ4ISI.append(androidx.constraintlayout.widget.R.styleable.ConstraintOverride_layout_constraintTop_creator, 87);
        getHighResolutionOutputSizeshNQ4ISI.append(androidx.constraintlayout.widget.R.styleable.ConstraintOverride_layout_constraintRight_creator, 87);
        getHighResolutionOutputSizeshNQ4ISI.append(androidx.constraintlayout.widget.R.styleable.ConstraintOverride_layout_constraintBottom_creator, 87);
        getHighResolutionOutputSizeshNQ4ISI.append(androidx.constraintlayout.widget.R.styleable.ConstraintOverride_layout_constraintBaseline_creator, 87);
        getHighResolutionOutputSizeshNQ4ISI.append(androidx.constraintlayout.widget.R.styleable.ConstraintOverride_android_layout_marginLeft, 24);
        getHighResolutionOutputSizeshNQ4ISI.append(androidx.constraintlayout.widget.R.styleable.ConstraintOverride_android_layout_marginRight, 28);
        getHighResolutionOutputSizeshNQ4ISI.append(androidx.constraintlayout.widget.R.styleable.ConstraintOverride_android_layout_marginStart, 31);
        getHighResolutionOutputSizeshNQ4ISI.append(androidx.constraintlayout.widget.R.styleable.ConstraintOverride_android_layout_marginEnd, 8);
        getHighResolutionOutputSizeshNQ4ISI.append(androidx.constraintlayout.widget.R.styleable.ConstraintOverride_android_layout_marginTop, 34);
        getHighResolutionOutputSizeshNQ4ISI.append(androidx.constraintlayout.widget.R.styleable.ConstraintOverride_android_layout_marginBottom, 2);
        getHighResolutionOutputSizeshNQ4ISI.append(androidx.constraintlayout.widget.R.styleable.ConstraintOverride_android_layout_width, 23);
        getHighResolutionOutputSizeshNQ4ISI.append(androidx.constraintlayout.widget.R.styleable.ConstraintOverride_android_layout_height, 21);
        getHighResolutionOutputSizeshNQ4ISI.append(androidx.constraintlayout.widget.R.styleable.ConstraintOverride_layout_constraintWidth, 95);
        getHighResolutionOutputSizeshNQ4ISI.append(androidx.constraintlayout.widget.R.styleable.ConstraintOverride_layout_constraintHeight, 96);
        getHighResolutionOutputSizeshNQ4ISI.append(androidx.constraintlayout.widget.R.styleable.ConstraintOverride_android_visibility, 22);
        getHighResolutionOutputSizeshNQ4ISI.append(androidx.constraintlayout.widget.R.styleable.ConstraintOverride_android_alpha, 43);
        getHighResolutionOutputSizeshNQ4ISI.append(androidx.constraintlayout.widget.R.styleable.ConstraintOverride_android_elevation, 44);
        getHighResolutionOutputSizeshNQ4ISI.append(androidx.constraintlayout.widget.R.styleable.ConstraintOverride_android_rotationX, 45);
        getHighResolutionOutputSizeshNQ4ISI.append(androidx.constraintlayout.widget.R.styleable.ConstraintOverride_android_rotationY, 46);
        getHighResolutionOutputSizeshNQ4ISI.append(androidx.constraintlayout.widget.R.styleable.ConstraintOverride_android_rotation, 60);
        getHighResolutionOutputSizeshNQ4ISI.append(androidx.constraintlayout.widget.R.styleable.ConstraintOverride_android_scaleX, 47);
        getHighResolutionOutputSizeshNQ4ISI.append(androidx.constraintlayout.widget.R.styleable.ConstraintOverride_android_scaleY, 48);
        getHighResolutionOutputSizeshNQ4ISI.append(androidx.constraintlayout.widget.R.styleable.ConstraintOverride_android_transformPivotX, 49);
        getHighResolutionOutputSizeshNQ4ISI.append(androidx.constraintlayout.widget.R.styleable.ConstraintOverride_android_transformPivotY, 50);
        getHighResolutionOutputSizeshNQ4ISI.append(androidx.constraintlayout.widget.R.styleable.ConstraintOverride_android_translationX, 51);
        getHighResolutionOutputSizeshNQ4ISI.append(androidx.constraintlayout.widget.R.styleable.ConstraintOverride_android_translationY, 52);
        getHighResolutionOutputSizeshNQ4ISI.append(androidx.constraintlayout.widget.R.styleable.ConstraintOverride_android_translationZ, 53);
        getHighResolutionOutputSizeshNQ4ISI.append(androidx.constraintlayout.widget.R.styleable.ConstraintOverride_layout_constraintWidth_default, 54);
        getHighResolutionOutputSizeshNQ4ISI.append(androidx.constraintlayout.widget.R.styleable.ConstraintOverride_layout_constraintHeight_default, 55);
        getHighResolutionOutputSizeshNQ4ISI.append(androidx.constraintlayout.widget.R.styleable.ConstraintOverride_layout_constraintWidth_max, 56);
        getHighResolutionOutputSizeshNQ4ISI.append(androidx.constraintlayout.widget.R.styleable.ConstraintOverride_layout_constraintHeight_max, 57);
        getHighResolutionOutputSizeshNQ4ISI.append(androidx.constraintlayout.widget.R.styleable.ConstraintOverride_layout_constraintWidth_min, 58);
        getHighResolutionOutputSizeshNQ4ISI.append(androidx.constraintlayout.widget.R.styleable.ConstraintOverride_layout_constraintHeight_min, 59);
        getHighResolutionOutputSizeshNQ4ISI.append(androidx.constraintlayout.widget.R.styleable.ConstraintOverride_layout_constraintCircleRadius, 62);
        getHighResolutionOutputSizeshNQ4ISI.append(androidx.constraintlayout.widget.R.styleable.ConstraintOverride_layout_constraintCircleAngle, 63);
        getHighResolutionOutputSizeshNQ4ISI.append(androidx.constraintlayout.widget.R.styleable.ConstraintOverride_animateRelativeTo, 64);
        getHighResolutionOutputSizeshNQ4ISI.append(androidx.constraintlayout.widget.R.styleable.ConstraintOverride_transitionEasing, 65);
        getHighResolutionOutputSizeshNQ4ISI.append(androidx.constraintlayout.widget.R.styleable.ConstraintOverride_drawPath, 66);
        getHighResolutionOutputSizeshNQ4ISI.append(androidx.constraintlayout.widget.R.styleable.ConstraintOverride_transitionPathRotate, 67);
        getHighResolutionOutputSizeshNQ4ISI.append(androidx.constraintlayout.widget.R.styleable.ConstraintOverride_motionStagger, 79);
        getHighResolutionOutputSizeshNQ4ISI.append(androidx.constraintlayout.widget.R.styleable.ConstraintOverride_android_id, 38);
        getHighResolutionOutputSizeshNQ4ISI.append(androidx.constraintlayout.widget.R.styleable.ConstraintOverride_motionTarget, 98);
        getHighResolutionOutputSizeshNQ4ISI.append(androidx.constraintlayout.widget.R.styleable.ConstraintOverride_motionProgress, 68);
        getHighResolutionOutputSizeshNQ4ISI.append(androidx.constraintlayout.widget.R.styleable.ConstraintOverride_layout_constraintWidth_percent, 69);
        getHighResolutionOutputSizeshNQ4ISI.append(androidx.constraintlayout.widget.R.styleable.ConstraintOverride_layout_constraintHeight_percent, 70);
        getHighResolutionOutputSizeshNQ4ISI.append(androidx.constraintlayout.widget.R.styleable.ConstraintOverride_chainUseRtl, 71);
        getHighResolutionOutputSizeshNQ4ISI.append(androidx.constraintlayout.widget.R.styleable.ConstraintOverride_barrierDirection, 72);
        getHighResolutionOutputSizeshNQ4ISI.append(androidx.constraintlayout.widget.R.styleable.ConstraintOverride_barrierMargin, 73);
        getHighResolutionOutputSizeshNQ4ISI.append(androidx.constraintlayout.widget.R.styleable.ConstraintOverride_constraint_referenced_ids, 74);
        getHighResolutionOutputSizeshNQ4ISI.append(androidx.constraintlayout.widget.R.styleable.ConstraintOverride_barrierAllowsGoneWidgets, 75);
        getHighResolutionOutputSizeshNQ4ISI.append(androidx.constraintlayout.widget.R.styleable.ConstraintOverride_pathMotionArc, 76);
        getHighResolutionOutputSizeshNQ4ISI.append(androidx.constraintlayout.widget.R.styleable.ConstraintOverride_layout_constraintTag, 77);
        getHighResolutionOutputSizeshNQ4ISI.append(androidx.constraintlayout.widget.R.styleable.ConstraintOverride_visibilityMode, 78);
        getHighResolutionOutputSizeshNQ4ISI.append(androidx.constraintlayout.widget.R.styleable.ConstraintOverride_layout_constrainedWidth, 80);
        getHighResolutionOutputSizeshNQ4ISI.append(androidx.constraintlayout.widget.R.styleable.ConstraintOverride_layout_constrainedHeight, 81);
        getHighResolutionOutputSizeshNQ4ISI.append(androidx.constraintlayout.widget.R.styleable.ConstraintOverride_polarRelativeTo, 82);
        getHighResolutionOutputSizeshNQ4ISI.append(androidx.constraintlayout.widget.R.styleable.ConstraintOverride_transformPivotTarget, 83);
        getHighResolutionOutputSizeshNQ4ISI.append(androidx.constraintlayout.widget.R.styleable.ConstraintOverride_quantizeMotionSteps, 84);
        getHighResolutionOutputSizeshNQ4ISI.append(androidx.constraintlayout.widget.R.styleable.ConstraintOverride_quantizeMotionPhase, 85);
        getHighResolutionOutputSizeshNQ4ISI.append(androidx.constraintlayout.widget.R.styleable.ConstraintOverride_quantizeMotionInterpolator, 86);
        getHighResolutionOutputSizeshNQ4ISI.append(androidx.constraintlayout.widget.R.styleable.ConstraintOverride_layout_wrapBehaviorInParent, 97);
    }

    public java.util.HashMap<java.lang.String, androidx.constraintlayout.widget.ConstraintAttribute> getCustomAttributeSet() {
        return this.getOutputFormats;
    }

    public androidx.constraintlayout.widget.ConstraintSet.Constraint getParameters(int i) {
        return Camera2StreamConfigurationMap(i);
    }

    public void readFallback(androidx.constraintlayout.widget.ConstraintSet constraintSet) {
        for (java.lang.Integer num : constraintSet.getHighSpeedVideoSizes.keySet()) {
            int intValue = num.intValue();
            androidx.constraintlayout.widget.ConstraintSet.Constraint constraint = constraintSet.getHighSpeedVideoSizes.get(num);
            if (!this.getHighSpeedVideoSizes.containsKey(java.lang.Integer.valueOf(intValue))) {
                this.getHighSpeedVideoSizes.put(java.lang.Integer.valueOf(intValue), new androidx.constraintlayout.widget.ConstraintSet.Constraint());
            }
            androidx.constraintlayout.widget.ConstraintSet.Constraint constraint2 = this.getHighSpeedVideoSizes.get(java.lang.Integer.valueOf(intValue));
            if (constraint2 != null) {
                if (!constraint2.layout.mApply) {
                    constraint2.layout.copyFrom(constraint.layout);
                }
                if (!constraint2.propertySet.mApply) {
                    constraint2.propertySet.copyFrom(constraint.propertySet);
                }
                if (!constraint2.transform.mApply) {
                    constraint2.transform.copyFrom(constraint.transform);
                }
                if (!constraint2.motion.mApply) {
                    constraint2.motion.copyFrom(constraint.motion);
                }
                for (java.lang.String str : constraint.mCustomConstraints.keySet()) {
                    if (!constraint2.mCustomConstraints.containsKey(str)) {
                        constraint2.mCustomConstraints.put(str, constraint.mCustomConstraints.get(str));
                    }
                }
            }
        }
    }

    public void readFallback(androidx.constraintlayout.widget.ConstraintLayout constraintLayout) {
        int childCount = constraintLayout.getChildCount();
        for (int i = 0; i < childCount; i++) {
            android.view.View childAt = constraintLayout.getChildAt(i);
            androidx.constraintlayout.widget.ConstraintLayout.LayoutParams layoutParams = (androidx.constraintlayout.widget.ConstraintLayout.LayoutParams) childAt.getLayoutParams();
            int id = childAt.getId();
            if (this.Camera2StreamConfigurationMap && id == -1) {
                throw new java.lang.RuntimeException("All children of ConstraintLayout must have ids to use ConstraintSet");
            }
            if (!this.getHighSpeedVideoSizes.containsKey(java.lang.Integer.valueOf(id))) {
                this.getHighSpeedVideoSizes.put(java.lang.Integer.valueOf(id), new androidx.constraintlayout.widget.ConstraintSet.Constraint());
            }
            androidx.constraintlayout.widget.ConstraintSet.Constraint constraint = this.getHighSpeedVideoSizes.get(java.lang.Integer.valueOf(id));
            if (constraint != null) {
                if (!constraint.layout.mApply) {
                    constraint.getHighSpeedVideoFpsRangesFor(id, layoutParams);
                    if (childAt instanceof androidx.constraintlayout.widget.ConstraintHelper) {
                        constraint.layout.mReferenceIds = ((androidx.constraintlayout.widget.ConstraintHelper) childAt).getReferencedIds();
                        if (childAt instanceof androidx.constraintlayout.widget.Barrier) {
                            androidx.constraintlayout.widget.Barrier barrier = (androidx.constraintlayout.widget.Barrier) childAt;
                            constraint.layout.mBarrierAllowsGoneWidgets = barrier.getAllowsGoneWidget();
                            constraint.layout.mBarrierDirection = barrier.getType();
                            constraint.layout.mBarrierMargin = barrier.getMargin();
                        }
                    }
                    constraint.layout.mApply = true;
                }
                if (!constraint.propertySet.mApply) {
                    constraint.propertySet.visibility = childAt.getVisibility();
                    constraint.propertySet.alpha = childAt.getAlpha();
                    constraint.propertySet.mApply = true;
                }
                if (!constraint.transform.mApply) {
                    constraint.transform.mApply = true;
                    constraint.transform.rotation = childAt.getRotation();
                    constraint.transform.rotationX = childAt.getRotationX();
                    constraint.transform.rotationY = childAt.getRotationY();
                    constraint.transform.scaleX = childAt.getScaleX();
                    constraint.transform.scaleY = childAt.getScaleY();
                    float pivotX = childAt.getPivotX();
                    float pivotY = childAt.getPivotY();
                    if (pivotX != 0.0d || pivotY != 0.0d) {
                        constraint.transform.transformPivotX = pivotX;
                        constraint.transform.transformPivotY = pivotY;
                    }
                    constraint.transform.translationX = childAt.getTranslationX();
                    constraint.transform.translationY = childAt.getTranslationY();
                    constraint.transform.translationZ = childAt.getTranslationZ();
                    if (constraint.transform.applyElevation) {
                        constraint.transform.elevation = childAt.getElevation();
                    }
                }
            }
        }
    }

    public void applyDeltaFrom(androidx.constraintlayout.widget.ConstraintSet constraintSet) {
        for (androidx.constraintlayout.widget.ConstraintSet.Constraint constraint : constraintSet.getHighSpeedVideoSizes.values()) {
            if (constraint.Camera2StreamConfigurationMap != null) {
                if (constraint.getHighResolutionOutputSizeshNQ4ISI == null) {
                    constraint.Camera2StreamConfigurationMap.getHighSpeedVideoSizes(getConstraint(constraint.getHighSpeedVideoSizes));
                } else {
                    java.util.Iterator<java.lang.Integer> it = this.getHighSpeedVideoSizes.keySet().iterator();
                    while (it.hasNext()) {
                        androidx.constraintlayout.widget.ConstraintSet.Constraint constraint2 = getConstraint(it.next().intValue());
                        if (constraint2.layout.mConstraintTag != null && constraint.getHighResolutionOutputSizeshNQ4ISI.matches(constraint2.layout.mConstraintTag)) {
                            constraint.Camera2StreamConfigurationMap.getHighSpeedVideoSizes(constraint2);
                            constraint2.mCustomConstraints.putAll((java.util.HashMap) constraint.mCustomConstraints.clone());
                        }
                    }
                }
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0030  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x003e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    static void getHighResolutionOutputSizeshNQ4ISI(java.lang.Object obj, android.content.res.TypedArray typedArray, int i, int i2) {
        int dimensionPixelSize;
        boolean z;
        if (obj == null) {
            return;
        }
        int i3 = typedArray.peekValue(i).type;
        if (i3 == 3) {
            Camera2StreamConfigurationMap(obj, typedArray.getString(i), i2);
            return;
        }
        int i4 = 0;
        if (i3 == 5) {
            dimensionPixelSize = typedArray.getDimensionPixelSize(i, 0);
        } else {
            dimensionPixelSize = typedArray.getInt(i, 0);
            if (dimensionPixelSize == -4) {
                z = true;
                i4 = -2;
            } else if (dimensionPixelSize == -3 || (dimensionPixelSize != -2 && dimensionPixelSize != -1)) {
                z = false;
            }
            if (!(obj instanceof androidx.constraintlayout.widget.ConstraintLayout.LayoutParams)) {
                androidx.constraintlayout.widget.ConstraintLayout.LayoutParams layoutParams = (androidx.constraintlayout.widget.ConstraintLayout.LayoutParams) obj;
                if (i2 == 0) {
                    layoutParams.width = i4;
                    layoutParams.constrainedWidth = z;
                    return;
                } else {
                    layoutParams.height = i4;
                    layoutParams.constrainedHeight = z;
                    return;
                }
            }
            if (obj instanceof androidx.constraintlayout.widget.ConstraintSet.Layout) {
                androidx.constraintlayout.widget.ConstraintSet.Layout layout = (androidx.constraintlayout.widget.ConstraintSet.Layout) obj;
                if (i2 == 0) {
                    layout.mWidth = i4;
                    layout.constrainedWidth = z;
                    return;
                } else {
                    layout.mHeight = i4;
                    layout.constrainedHeight = z;
                    return;
                }
            }
            if (obj instanceof androidx.constraintlayout.widget.ConstraintSet.Constraint.Delta) {
                androidx.constraintlayout.widget.ConstraintSet.Constraint.Delta delta = (androidx.constraintlayout.widget.ConstraintSet.Constraint.Delta) obj;
                if (i2 == 0) {
                    delta.getHighResolutionOutputSizeshNQ4ISI(23, i4);
                    delta.getHighSpeedVideoSizes(80, z);
                    return;
                } else {
                    delta.getHighResolutionOutputSizeshNQ4ISI(21, i4);
                    delta.getHighSpeedVideoSizes(81, z);
                    return;
                }
            }
            return;
        }
        i4 = dimensionPixelSize;
        z = false;
        if (!(obj instanceof androidx.constraintlayout.widget.ConstraintLayout.LayoutParams)) {
        }
    }

    static void getHighResolutionOutputSizeshNQ4ISI(androidx.constraintlayout.widget.ConstraintLayout.LayoutParams layoutParams, java.lang.String str) {
        float f = Float.NaN;
        int i = -1;
        if (str != null) {
            int length = str.length();
            int indexOf = str.indexOf(44);
            int i2 = 0;
            if (indexOf > 0 && indexOf < length - 1) {
                java.lang.String substring = str.substring(0, indexOf);
                if (substring.equalsIgnoreCase("W")) {
                    i = 0;
                } else if (substring.equalsIgnoreCase("H")) {
                    i = 1;
                }
                i2 = indexOf + 1;
            }
            int indexOf2 = str.indexOf(58);
            try {
                if (indexOf2 >= 0 && indexOf2 < length - 1) {
                    java.lang.String substring2 = str.substring(i2, indexOf2);
                    java.lang.String substring3 = str.substring(indexOf2 + 1);
                    if (substring2.length() > 0 && substring3.length() > 0) {
                        float parseFloat = java.lang.Float.parseFloat(substring2);
                        float parseFloat2 = java.lang.Float.parseFloat(substring3);
                        if (parseFloat > 0.0f && parseFloat2 > 0.0f) {
                            if (i == 1) {
                                f = java.lang.Math.abs(parseFloat2 / parseFloat);
                                i = 1;
                            } else {
                                f = java.lang.Math.abs(parseFloat / parseFloat2);
                            }
                        }
                    }
                } else {
                    java.lang.String substring4 = str.substring(i2);
                    if (substring4.length() > 0) {
                        f = java.lang.Float.parseFloat(substring4);
                    }
                }
            } catch (java.lang.NumberFormatException unused) {
            }
        }
        layoutParams.dimensionRatio = str;
        layoutParams.Camera2StreamConfigurationMap = f;
        layoutParams.getHighResolutionOutputSizeshNQ4ISI = i;
    }

    private static void Camera2StreamConfigurationMap(java.lang.Object obj, java.lang.String str, int i) {
        if (str != null) {
            int indexOf = str.indexOf(61);
            int length = str.length();
            if (indexOf <= 0 || indexOf >= length - 1) {
                return;
            }
            java.lang.String substring = str.substring(0, indexOf);
            java.lang.String substring2 = str.substring(indexOf + 1);
            if (substring2.length() > 0) {
                java.lang.String trim = substring.trim();
                java.lang.String trim2 = substring2.trim();
                if ("ratio".equalsIgnoreCase(trim)) {
                    if (obj instanceof androidx.constraintlayout.widget.ConstraintLayout.LayoutParams) {
                        androidx.constraintlayout.widget.ConstraintLayout.LayoutParams layoutParams = (androidx.constraintlayout.widget.ConstraintLayout.LayoutParams) obj;
                        if (i == 0) {
                            layoutParams.width = 0;
                        } else {
                            layoutParams.height = 0;
                        }
                        getHighResolutionOutputSizeshNQ4ISI(layoutParams, trim2);
                        return;
                    }
                    if (obj instanceof androidx.constraintlayout.widget.ConstraintSet.Layout) {
                        ((androidx.constraintlayout.widget.ConstraintSet.Layout) obj).dimensionRatio = trim2;
                        return;
                    } else {
                        if (obj instanceof androidx.constraintlayout.widget.ConstraintSet.Constraint.Delta) {
                            ((androidx.constraintlayout.widget.ConstraintSet.Constraint.Delta) obj).getHighSpeedVideoSizes(5, trim2);
                            return;
                        }
                        return;
                    }
                }
                try {
                    if ("weight".equalsIgnoreCase(trim)) {
                        float parseFloat = java.lang.Float.parseFloat(trim2);
                        if (obj instanceof androidx.constraintlayout.widget.ConstraintLayout.LayoutParams) {
                            androidx.constraintlayout.widget.ConstraintLayout.LayoutParams layoutParams2 = (androidx.constraintlayout.widget.ConstraintLayout.LayoutParams) obj;
                            if (i == 0) {
                                layoutParams2.width = 0;
                                layoutParams2.horizontalWeight = parseFloat;
                                return;
                            } else {
                                layoutParams2.height = 0;
                                layoutParams2.verticalWeight = parseFloat;
                                return;
                            }
                        }
                        if (obj instanceof androidx.constraintlayout.widget.ConstraintSet.Layout) {
                            androidx.constraintlayout.widget.ConstraintSet.Layout layout = (androidx.constraintlayout.widget.ConstraintSet.Layout) obj;
                            if (i == 0) {
                                layout.mWidth = 0;
                                layout.horizontalWeight = parseFloat;
                                return;
                            } else {
                                layout.mHeight = 0;
                                layout.verticalWeight = parseFloat;
                                return;
                            }
                        }
                        if (obj instanceof androidx.constraintlayout.widget.ConstraintSet.Constraint.Delta) {
                            androidx.constraintlayout.widget.ConstraintSet.Constraint.Delta delta = (androidx.constraintlayout.widget.ConstraintSet.Constraint.Delta) obj;
                            if (i == 0) {
                                delta.getHighResolutionOutputSizeshNQ4ISI(23, 0);
                                delta.getHighSpeedVideoSizes(39, parseFloat);
                                return;
                            } else {
                                delta.getHighResolutionOutputSizeshNQ4ISI(21, 0);
                                delta.getHighSpeedVideoSizes(40, parseFloat);
                                return;
                            }
                        }
                        return;
                    }
                    if ("parent".equalsIgnoreCase(trim)) {
                        float max = java.lang.Math.max(0.0f, java.lang.Math.min(1.0f, java.lang.Float.parseFloat(trim2)));
                        if (obj instanceof androidx.constraintlayout.widget.ConstraintLayout.LayoutParams) {
                            androidx.constraintlayout.widget.ConstraintLayout.LayoutParams layoutParams3 = (androidx.constraintlayout.widget.ConstraintLayout.LayoutParams) obj;
                            if (i == 0) {
                                layoutParams3.width = 0;
                                layoutParams3.matchConstraintPercentWidth = max;
                                layoutParams3.matchConstraintDefaultWidth = 2;
                                return;
                            } else {
                                layoutParams3.height = 0;
                                layoutParams3.matchConstraintPercentHeight = max;
                                layoutParams3.matchConstraintDefaultHeight = 2;
                                return;
                            }
                        }
                        if (obj instanceof androidx.constraintlayout.widget.ConstraintSet.Layout) {
                            androidx.constraintlayout.widget.ConstraintSet.Layout layout2 = (androidx.constraintlayout.widget.ConstraintSet.Layout) obj;
                            if (i == 0) {
                                layout2.mWidth = 0;
                                layout2.widthPercent = max;
                                layout2.widthDefault = 2;
                                return;
                            } else {
                                layout2.mHeight = 0;
                                layout2.heightPercent = max;
                                layout2.heightDefault = 2;
                                return;
                            }
                        }
                        if (obj instanceof androidx.constraintlayout.widget.ConstraintSet.Constraint.Delta) {
                            androidx.constraintlayout.widget.ConstraintSet.Constraint.Delta delta2 = (androidx.constraintlayout.widget.ConstraintSet.Constraint.Delta) obj;
                            if (i == 0) {
                                delta2.getHighResolutionOutputSizeshNQ4ISI(23, 0);
                                delta2.getHighResolutionOutputSizeshNQ4ISI(54, 2);
                            } else {
                                delta2.getHighResolutionOutputSizeshNQ4ISI(21, 0);
                                delta2.getHighResolutionOutputSizeshNQ4ISI(55, 2);
                            }
                        }
                    }
                } catch (java.lang.NumberFormatException unused) {
                }
            }
        }
    }

    public java.lang.String[] getStateLabels() {
        java.lang.String[] strArr = this.getHighSpeedVideoSizesFor;
        return (java.lang.String[]) java.util.Arrays.copyOf(strArr, strArr.length);
    }

    public void setStateLabels(java.lang.String str) {
        this.getHighSpeedVideoSizesFor = str.split(",");
        int i = 0;
        while (true) {
            java.lang.String[] strArr = this.getHighSpeedVideoSizesFor;
            if (i >= strArr.length) {
                return;
            }
            strArr[i] = strArr[i].trim();
            i++;
        }
    }

    public void setStateLabelsList(java.lang.String... strArr) {
        this.getHighSpeedVideoSizesFor = strArr;
        int i = 0;
        while (true) {
            java.lang.String[] strArr2 = this.getHighSpeedVideoSizesFor;
            if (i >= strArr2.length) {
                return;
            }
            strArr2[i] = strArr2[i].trim();
            i++;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:9:0x0015, code lost:
    
        r2 = r2 + 1;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public boolean matchesLabels(java.lang.String... strArr) {
        int length = strArr.length;
        int i = 0;
        while (i < length) {
            java.lang.String str = strArr[i];
            for (java.lang.String str2 : this.getHighSpeedVideoSizesFor) {
                if (str2.equals(str)) {
                    break;
                }
            }
            return false;
        }
        return true;
    }

    public static class Layout {
        public static final int UNSET = -1;
        public static final int UNSET_GONE_MARGIN = Integer.MIN_VALUE;
        static android.util.SparseIntArray getHighSpeedVideoSizes;
        public java.lang.String mConstraintTag;
        public int mHeight;
        public java.lang.String mReferenceIdString;
        public int[] mReferenceIds;
        public int mWidth;
        public boolean mIsGuideline = false;
        public boolean mApply = false;
        public boolean mOverride = false;
        public int guideBegin = -1;
        public int guideEnd = -1;
        public float guidePercent = -1.0f;
        public boolean guidelineUseRtl = true;
        public int leftToLeft = -1;
        public int leftToRight = -1;
        public int rightToLeft = -1;
        public int rightToRight = -1;
        public int topToTop = -1;
        public int topToBottom = -1;
        public int bottomToTop = -1;
        public int bottomToBottom = -1;
        public int baselineToBaseline = -1;
        public int baselineToTop = -1;
        public int baselineToBottom = -1;
        public int startToEnd = -1;
        public int startToStart = -1;
        public int endToStart = -1;
        public int endToEnd = -1;
        public float horizontalBias = 0.5f;
        public float verticalBias = 0.5f;
        public java.lang.String dimensionRatio = null;
        public int circleConstraint = -1;
        public int circleRadius = 0;
        public float circleAngle = 0.0f;
        public int editorAbsoluteX = -1;
        public int editorAbsoluteY = -1;
        public int orientation = -1;
        public int leftMargin = 0;
        public int rightMargin = 0;
        public int topMargin = 0;
        public int bottomMargin = 0;
        public int endMargin = 0;
        public int startMargin = 0;
        public int baselineMargin = 0;
        public int goneLeftMargin = Integer.MIN_VALUE;
        public int goneTopMargin = Integer.MIN_VALUE;
        public int goneRightMargin = Integer.MIN_VALUE;
        public int goneBottomMargin = Integer.MIN_VALUE;
        public int goneEndMargin = Integer.MIN_VALUE;
        public int goneStartMargin = Integer.MIN_VALUE;
        public int goneBaselineMargin = Integer.MIN_VALUE;
        public float verticalWeight = -1.0f;
        public float horizontalWeight = -1.0f;
        public int horizontalChainStyle = 0;
        public int verticalChainStyle = 0;
        public int widthDefault = 0;
        public int heightDefault = 0;
        public int widthMax = 0;
        public int heightMax = 0;
        public int widthMin = 0;
        public int heightMin = 0;
        public float widthPercent = 1.0f;
        public float heightPercent = 1.0f;
        public int mBarrierDirection = -1;
        public int mBarrierMargin = 0;
        public int mHelperType = -1;
        public boolean constrainedWidth = false;
        public boolean constrainedHeight = false;
        public boolean mBarrierAllowsGoneWidgets = true;
        public int mWrapBehavior = 0;

        public void copyFrom(androidx.constraintlayout.widget.ConstraintSet.Layout layout) {
            this.mIsGuideline = layout.mIsGuideline;
            this.mWidth = layout.mWidth;
            this.mApply = layout.mApply;
            this.mHeight = layout.mHeight;
            this.guideBegin = layout.guideBegin;
            this.guideEnd = layout.guideEnd;
            this.guidePercent = layout.guidePercent;
            this.guidelineUseRtl = layout.guidelineUseRtl;
            this.leftToLeft = layout.leftToLeft;
            this.leftToRight = layout.leftToRight;
            this.rightToLeft = layout.rightToLeft;
            this.rightToRight = layout.rightToRight;
            this.topToTop = layout.topToTop;
            this.topToBottom = layout.topToBottom;
            this.bottomToTop = layout.bottomToTop;
            this.bottomToBottom = layout.bottomToBottom;
            this.baselineToBaseline = layout.baselineToBaseline;
            this.baselineToTop = layout.baselineToTop;
            this.baselineToBottom = layout.baselineToBottom;
            this.startToEnd = layout.startToEnd;
            this.startToStart = layout.startToStart;
            this.endToStart = layout.endToStart;
            this.endToEnd = layout.endToEnd;
            this.horizontalBias = layout.horizontalBias;
            this.verticalBias = layout.verticalBias;
            this.dimensionRatio = layout.dimensionRatio;
            this.circleConstraint = layout.circleConstraint;
            this.circleRadius = layout.circleRadius;
            this.circleAngle = layout.circleAngle;
            this.editorAbsoluteX = layout.editorAbsoluteX;
            this.editorAbsoluteY = layout.editorAbsoluteY;
            this.orientation = layout.orientation;
            this.leftMargin = layout.leftMargin;
            this.rightMargin = layout.rightMargin;
            this.topMargin = layout.topMargin;
            this.bottomMargin = layout.bottomMargin;
            this.endMargin = layout.endMargin;
            this.startMargin = layout.startMargin;
            this.baselineMargin = layout.baselineMargin;
            this.goneLeftMargin = layout.goneLeftMargin;
            this.goneTopMargin = layout.goneTopMargin;
            this.goneRightMargin = layout.goneRightMargin;
            this.goneBottomMargin = layout.goneBottomMargin;
            this.goneEndMargin = layout.goneEndMargin;
            this.goneStartMargin = layout.goneStartMargin;
            this.goneBaselineMargin = layout.goneBaselineMargin;
            this.verticalWeight = layout.verticalWeight;
            this.horizontalWeight = layout.horizontalWeight;
            this.horizontalChainStyle = layout.horizontalChainStyle;
            this.verticalChainStyle = layout.verticalChainStyle;
            this.widthDefault = layout.widthDefault;
            this.heightDefault = layout.heightDefault;
            this.widthMax = layout.widthMax;
            this.heightMax = layout.heightMax;
            this.widthMin = layout.widthMin;
            this.heightMin = layout.heightMin;
            this.widthPercent = layout.widthPercent;
            this.heightPercent = layout.heightPercent;
            this.mBarrierDirection = layout.mBarrierDirection;
            this.mBarrierMargin = layout.mBarrierMargin;
            this.mHelperType = layout.mHelperType;
            this.mConstraintTag = layout.mConstraintTag;
            int[] iArr = layout.mReferenceIds;
            if (iArr != null && layout.mReferenceIdString == null) {
                this.mReferenceIds = java.util.Arrays.copyOf(iArr, iArr.length);
            } else {
                this.mReferenceIds = null;
            }
            this.mReferenceIdString = layout.mReferenceIdString;
            this.constrainedWidth = layout.constrainedWidth;
            this.constrainedHeight = layout.constrainedHeight;
            this.mBarrierAllowsGoneWidgets = layout.mBarrierAllowsGoneWidgets;
            this.mWrapBehavior = layout.mWrapBehavior;
        }

        static {
            android.util.SparseIntArray sparseIntArray = new android.util.SparseIntArray();
            getHighSpeedVideoSizes = sparseIntArray;
            sparseIntArray.append(androidx.constraintlayout.widget.R.styleable.Layout_layout_constraintLeft_toLeftOf, 24);
            getHighSpeedVideoSizes.append(androidx.constraintlayout.widget.R.styleable.Layout_layout_constraintLeft_toRightOf, 25);
            getHighSpeedVideoSizes.append(androidx.constraintlayout.widget.R.styleable.Layout_layout_constraintRight_toLeftOf, 28);
            getHighSpeedVideoSizes.append(androidx.constraintlayout.widget.R.styleable.Layout_layout_constraintRight_toRightOf, 29);
            getHighSpeedVideoSizes.append(androidx.constraintlayout.widget.R.styleable.Layout_layout_constraintTop_toTopOf, 35);
            getHighSpeedVideoSizes.append(androidx.constraintlayout.widget.R.styleable.Layout_layout_constraintTop_toBottomOf, 34);
            getHighSpeedVideoSizes.append(androidx.constraintlayout.widget.R.styleable.Layout_layout_constraintBottom_toTopOf, 4);
            getHighSpeedVideoSizes.append(androidx.constraintlayout.widget.R.styleable.Layout_layout_constraintBottom_toBottomOf, 3);
            getHighSpeedVideoSizes.append(androidx.constraintlayout.widget.R.styleable.Layout_layout_constraintBaseline_toBaselineOf, 1);
            getHighSpeedVideoSizes.append(androidx.constraintlayout.widget.R.styleable.Layout_layout_editor_absoluteX, 6);
            getHighSpeedVideoSizes.append(androidx.constraintlayout.widget.R.styleable.Layout_layout_editor_absoluteY, 7);
            getHighSpeedVideoSizes.append(androidx.constraintlayout.widget.R.styleable.Layout_layout_constraintGuide_begin, 17);
            getHighSpeedVideoSizes.append(androidx.constraintlayout.widget.R.styleable.Layout_layout_constraintGuide_end, 18);
            getHighSpeedVideoSizes.append(androidx.constraintlayout.widget.R.styleable.Layout_layout_constraintGuide_percent, 19);
            getHighSpeedVideoSizes.append(androidx.constraintlayout.widget.R.styleable.Layout_guidelineUseRtl, 90);
            getHighSpeedVideoSizes.append(androidx.constraintlayout.widget.R.styleable.Layout_android_orientation, 26);
            getHighSpeedVideoSizes.append(androidx.constraintlayout.widget.R.styleable.Layout_layout_constraintStart_toEndOf, 31);
            getHighSpeedVideoSizes.append(androidx.constraintlayout.widget.R.styleable.Layout_layout_constraintStart_toStartOf, 32);
            getHighSpeedVideoSizes.append(androidx.constraintlayout.widget.R.styleable.Layout_layout_constraintEnd_toStartOf, 10);
            getHighSpeedVideoSizes.append(androidx.constraintlayout.widget.R.styleable.Layout_layout_constraintEnd_toEndOf, 9);
            getHighSpeedVideoSizes.append(androidx.constraintlayout.widget.R.styleable.Layout_layout_goneMarginLeft, 13);
            getHighSpeedVideoSizes.append(androidx.constraintlayout.widget.R.styleable.Layout_layout_goneMarginTop, 16);
            getHighSpeedVideoSizes.append(androidx.constraintlayout.widget.R.styleable.Layout_layout_goneMarginRight, 14);
            getHighSpeedVideoSizes.append(androidx.constraintlayout.widget.R.styleable.Layout_layout_goneMarginBottom, 11);
            getHighSpeedVideoSizes.append(androidx.constraintlayout.widget.R.styleable.Layout_layout_goneMarginStart, 15);
            getHighSpeedVideoSizes.append(androidx.constraintlayout.widget.R.styleable.Layout_layout_goneMarginEnd, 12);
            getHighSpeedVideoSizes.append(androidx.constraintlayout.widget.R.styleable.Layout_layout_constraintVertical_weight, 38);
            getHighSpeedVideoSizes.append(androidx.constraintlayout.widget.R.styleable.Layout_layout_constraintHorizontal_weight, 37);
            getHighSpeedVideoSizes.append(androidx.constraintlayout.widget.R.styleable.Layout_layout_constraintHorizontal_chainStyle, 39);
            getHighSpeedVideoSizes.append(androidx.constraintlayout.widget.R.styleable.Layout_layout_constraintVertical_chainStyle, 40);
            getHighSpeedVideoSizes.append(androidx.constraintlayout.widget.R.styleable.Layout_layout_constraintHorizontal_bias, 20);
            getHighSpeedVideoSizes.append(androidx.constraintlayout.widget.R.styleable.Layout_layout_constraintVertical_bias, 36);
            getHighSpeedVideoSizes.append(androidx.constraintlayout.widget.R.styleable.Layout_layout_constraintDimensionRatio, 5);
            getHighSpeedVideoSizes.append(androidx.constraintlayout.widget.R.styleable.Layout_layout_constraintLeft_creator, 91);
            getHighSpeedVideoSizes.append(androidx.constraintlayout.widget.R.styleable.Layout_layout_constraintTop_creator, 91);
            getHighSpeedVideoSizes.append(androidx.constraintlayout.widget.R.styleable.Layout_layout_constraintRight_creator, 91);
            getHighSpeedVideoSizes.append(androidx.constraintlayout.widget.R.styleable.Layout_layout_constraintBottom_creator, 91);
            getHighSpeedVideoSizes.append(androidx.constraintlayout.widget.R.styleable.Layout_layout_constraintBaseline_creator, 91);
            getHighSpeedVideoSizes.append(androidx.constraintlayout.widget.R.styleable.Layout_android_layout_marginLeft, 23);
            getHighSpeedVideoSizes.append(androidx.constraintlayout.widget.R.styleable.Layout_android_layout_marginRight, 27);
            getHighSpeedVideoSizes.append(androidx.constraintlayout.widget.R.styleable.Layout_android_layout_marginStart, 30);
            getHighSpeedVideoSizes.append(androidx.constraintlayout.widget.R.styleable.Layout_android_layout_marginEnd, 8);
            getHighSpeedVideoSizes.append(androidx.constraintlayout.widget.R.styleable.Layout_android_layout_marginTop, 33);
            getHighSpeedVideoSizes.append(androidx.constraintlayout.widget.R.styleable.Layout_android_layout_marginBottom, 2);
            getHighSpeedVideoSizes.append(androidx.constraintlayout.widget.R.styleable.Layout_android_layout_width, 22);
            getHighSpeedVideoSizes.append(androidx.constraintlayout.widget.R.styleable.Layout_android_layout_height, 21);
            getHighSpeedVideoSizes.append(androidx.constraintlayout.widget.R.styleable.Layout_layout_constraintWidth, 41);
            getHighSpeedVideoSizes.append(androidx.constraintlayout.widget.R.styleable.Layout_layout_constraintHeight, 42);
            getHighSpeedVideoSizes.append(androidx.constraintlayout.widget.R.styleable.Layout_layout_constrainedWidth, 87);
            getHighSpeedVideoSizes.append(androidx.constraintlayout.widget.R.styleable.Layout_layout_constrainedHeight, 88);
            getHighSpeedVideoSizes.append(androidx.constraintlayout.widget.R.styleable.Layout_layout_wrapBehaviorInParent, 76);
            getHighSpeedVideoSizes.append(androidx.constraintlayout.widget.R.styleable.Layout_layout_constraintCircle, 61);
            getHighSpeedVideoSizes.append(androidx.constraintlayout.widget.R.styleable.Layout_layout_constraintCircleRadius, 62);
            getHighSpeedVideoSizes.append(androidx.constraintlayout.widget.R.styleable.Layout_layout_constraintCircleAngle, 63);
            getHighSpeedVideoSizes.append(androidx.constraintlayout.widget.R.styleable.Layout_layout_constraintWidth_percent, 69);
            getHighSpeedVideoSizes.append(androidx.constraintlayout.widget.R.styleable.Layout_layout_constraintHeight_percent, 70);
            getHighSpeedVideoSizes.append(androidx.constraintlayout.widget.R.styleable.Layout_chainUseRtl, 71);
            getHighSpeedVideoSizes.append(androidx.constraintlayout.widget.R.styleable.Layout_barrierDirection, 72);
            getHighSpeedVideoSizes.append(androidx.constraintlayout.widget.R.styleable.Layout_barrierMargin, 73);
            getHighSpeedVideoSizes.append(androidx.constraintlayout.widget.R.styleable.Layout_constraint_referenced_ids, 74);
            getHighSpeedVideoSizes.append(androidx.constraintlayout.widget.R.styleable.Layout_barrierAllowsGoneWidgets, 75);
            getHighSpeedVideoSizes.append(androidx.constraintlayout.widget.R.styleable.Layout_layout_constraintWidth_max, 84);
            getHighSpeedVideoSizes.append(androidx.constraintlayout.widget.R.styleable.Layout_layout_constraintWidth_min, 86);
            getHighSpeedVideoSizes.append(androidx.constraintlayout.widget.R.styleable.Layout_layout_constraintWidth_max, 83);
            getHighSpeedVideoSizes.append(androidx.constraintlayout.widget.R.styleable.Layout_layout_constraintHeight_min, 85);
            getHighSpeedVideoSizes.append(androidx.constraintlayout.widget.R.styleable.Layout_layout_constraintWidth, 87);
            getHighSpeedVideoSizes.append(androidx.constraintlayout.widget.R.styleable.Layout_layout_constraintHeight, 88);
            getHighSpeedVideoSizes.append(androidx.constraintlayout.widget.R.styleable.ConstraintLayout_Layout_layout_constraintTag, 89);
            getHighSpeedVideoSizes.append(androidx.constraintlayout.widget.R.styleable.Layout_guidelineUseRtl, 90);
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r11v0, types: [java.lang.StringBuilder] */
        /* JADX WARN: Type inference failed for: r4v4, types: [java.lang.Integer, java.lang.Number] */
        public void dump(androidx.constraintlayout.motion.widget.MotionScene motionScene, java.lang.StringBuilder sb) {
            java.lang.reflect.Field[] declaredFields = getClass().getDeclaredFields();
            sb.append(com.paypal.oslo.feature.activity.domain.base.constants.ActivityConstants.UIConstants.NEW_LINE);
            for (java.lang.reflect.Field field : declaredFields) {
                java.lang.String name2 = field.getName();
                if (!java.lang.reflect.Modifier.isStatic(field.getModifiers())) {
                    try {
                        java.lang.Object obj = field.get(this);
                        java.lang.Class<?> type = field.getType();
                        if (type == java.lang.Integer.TYPE) {
                            ?? r4 = (java.lang.Integer) obj;
                            if (r4.intValue() != -1) {
                                java.lang.String lookUpConstraintName = motionScene.lookUpConstraintName(r4.intValue());
                                sb.append("    ");
                                sb.append(name2);
                                sb.append(" = \"");
                                java.lang.String str = r4;
                                if (lookUpConstraintName != null) {
                                    str = lookUpConstraintName;
                                }
                                sb.append(str);
                                sb.append("\"\n");
                            }
                        } else if (type == java.lang.Float.TYPE) {
                            java.lang.Float f = (java.lang.Float) obj;
                            if (f.floatValue() != -1.0f) {
                                sb.append("    ");
                                sb.append(name2);
                                sb.append(" = \"");
                                sb.append(f);
                                sb.append("\"\n");
                            }
                        }
                    } catch (java.lang.IllegalAccessException unused) {
                    }
                }
            }
        }
    }

    public static class Transform {
        static android.util.SparseIntArray getHighSpeedVideoFpsRangesFor;
        public boolean mApply = false;
        public float rotation = 0.0f;
        public float rotationX = 0.0f;
        public float rotationY = 0.0f;
        public float scaleX = 1.0f;
        public float scaleY = 1.0f;
        public float transformPivotX = Float.NaN;
        public float transformPivotY = Float.NaN;
        public int transformPivotTarget = -1;
        public float translationX = 0.0f;
        public float translationY = 0.0f;
        public float translationZ = 0.0f;
        public boolean applyElevation = false;
        public float elevation = 0.0f;

        public void copyFrom(androidx.constraintlayout.widget.ConstraintSet.Transform transform) {
            this.mApply = transform.mApply;
            this.rotation = transform.rotation;
            this.rotationX = transform.rotationX;
            this.rotationY = transform.rotationY;
            this.scaleX = transform.scaleX;
            this.scaleY = transform.scaleY;
            this.transformPivotX = transform.transformPivotX;
            this.transformPivotY = transform.transformPivotY;
            this.transformPivotTarget = transform.transformPivotTarget;
            this.translationX = transform.translationX;
            this.translationY = transform.translationY;
            this.translationZ = transform.translationZ;
            this.applyElevation = transform.applyElevation;
            this.elevation = transform.elevation;
        }

        static {
            android.util.SparseIntArray sparseIntArray = new android.util.SparseIntArray();
            getHighSpeedVideoFpsRangesFor = sparseIntArray;
            sparseIntArray.append(androidx.constraintlayout.widget.R.styleable.Transform_android_rotation, 1);
            getHighSpeedVideoFpsRangesFor.append(androidx.constraintlayout.widget.R.styleable.Transform_android_rotationX, 2);
            getHighSpeedVideoFpsRangesFor.append(androidx.constraintlayout.widget.R.styleable.Transform_android_rotationY, 3);
            getHighSpeedVideoFpsRangesFor.append(androidx.constraintlayout.widget.R.styleable.Transform_android_scaleX, 4);
            getHighSpeedVideoFpsRangesFor.append(androidx.constraintlayout.widget.R.styleable.Transform_android_scaleY, 5);
            getHighSpeedVideoFpsRangesFor.append(androidx.constraintlayout.widget.R.styleable.Transform_android_transformPivotX, 6);
            getHighSpeedVideoFpsRangesFor.append(androidx.constraintlayout.widget.R.styleable.Transform_android_transformPivotY, 7);
            getHighSpeedVideoFpsRangesFor.append(androidx.constraintlayout.widget.R.styleable.Transform_android_translationX, 8);
            getHighSpeedVideoFpsRangesFor.append(androidx.constraintlayout.widget.R.styleable.Transform_android_translationY, 9);
            getHighSpeedVideoFpsRangesFor.append(androidx.constraintlayout.widget.R.styleable.Transform_android_translationZ, 10);
            getHighSpeedVideoFpsRangesFor.append(androidx.constraintlayout.widget.R.styleable.Transform_android_elevation, 11);
            getHighSpeedVideoFpsRangesFor.append(androidx.constraintlayout.widget.R.styleable.Transform_transformPivotTarget, 12);
        }
    }

    public static class PropertySet {
        public boolean mApply = false;
        public int visibility = 0;
        public int mVisibilityMode = 0;
        public float alpha = 1.0f;
        public float mProgress = Float.NaN;

        public void copyFrom(androidx.constraintlayout.widget.ConstraintSet.PropertySet propertySet) {
            this.mApply = propertySet.mApply;
            this.visibility = propertySet.visibility;
            this.alpha = propertySet.alpha;
            this.mProgress = propertySet.mProgress;
            this.mVisibilityMode = propertySet.mVisibilityMode;
        }
    }

    public static class Motion {
        static android.util.SparseIntArray getHighSpeedVideoSizes;
        public boolean mApply = false;
        public int mAnimateRelativeTo = -1;
        public int mAnimateCircleAngleTo = 0;
        public java.lang.String mTransitionEasing = null;
        public int mPathMotionArc = -1;
        public int mDrawPath = 0;
        public float mMotionStagger = Float.NaN;
        public int mPolarRelativeTo = -1;
        public float mPathRotate = Float.NaN;
        public float mQuantizeMotionPhase = Float.NaN;
        public int mQuantizeMotionSteps = -1;
        public java.lang.String mQuantizeInterpolatorString = null;
        public int mQuantizeInterpolatorType = -3;
        public int mQuantizeInterpolatorID = -1;

        public void copyFrom(androidx.constraintlayout.widget.ConstraintSet.Motion motion) {
            this.mApply = motion.mApply;
            this.mAnimateRelativeTo = motion.mAnimateRelativeTo;
            this.mTransitionEasing = motion.mTransitionEasing;
            this.mPathMotionArc = motion.mPathMotionArc;
            this.mDrawPath = motion.mDrawPath;
            this.mPathRotate = motion.mPathRotate;
            this.mMotionStagger = motion.mMotionStagger;
            this.mPolarRelativeTo = motion.mPolarRelativeTo;
        }

        static {
            android.util.SparseIntArray sparseIntArray = new android.util.SparseIntArray();
            getHighSpeedVideoSizes = sparseIntArray;
            sparseIntArray.append(androidx.constraintlayout.widget.R.styleable.Motion_motionPathRotate, 1);
            getHighSpeedVideoSizes.append(androidx.constraintlayout.widget.R.styleable.Motion_pathMotionArc, 2);
            getHighSpeedVideoSizes.append(androidx.constraintlayout.widget.R.styleable.Motion_transitionEasing, 3);
            getHighSpeedVideoSizes.append(androidx.constraintlayout.widget.R.styleable.Motion_drawPath, 4);
            getHighSpeedVideoSizes.append(androidx.constraintlayout.widget.R.styleable.Motion_animateRelativeTo, 5);
            getHighSpeedVideoSizes.append(androidx.constraintlayout.widget.R.styleable.Motion_animateCircleAngleTo, 6);
            getHighSpeedVideoSizes.append(androidx.constraintlayout.widget.R.styleable.Motion_motionStagger, 7);
            getHighSpeedVideoSizes.append(androidx.constraintlayout.widget.R.styleable.Motion_quantizeMotionSteps, 8);
            getHighSpeedVideoSizes.append(androidx.constraintlayout.widget.R.styleable.Motion_quantizeMotionPhase, 9);
            getHighSpeedVideoSizes.append(androidx.constraintlayout.widget.R.styleable.Motion_quantizeMotionInterpolator, 10);
        }
    }

    public static class Constraint {
        androidx.constraintlayout.widget.ConstraintSet.Constraint.Delta Camera2StreamConfigurationMap;
        java.lang.String getHighResolutionOutputSizeshNQ4ISI;
        int getHighSpeedVideoSizes;
        public final androidx.constraintlayout.widget.ConstraintSet.PropertySet propertySet = new androidx.constraintlayout.widget.ConstraintSet.PropertySet();
        public final androidx.constraintlayout.widget.ConstraintSet.Motion motion = new androidx.constraintlayout.widget.ConstraintSet.Motion();
        public final androidx.constraintlayout.widget.ConstraintSet.Layout layout = new androidx.constraintlayout.widget.ConstraintSet.Layout();
        public final androidx.constraintlayout.widget.ConstraintSet.Transform transform = new androidx.constraintlayout.widget.ConstraintSet.Transform();
        public java.util.HashMap<java.lang.String, androidx.constraintlayout.widget.ConstraintAttribute> mCustomConstraints = new java.util.HashMap<>();

        public void printDelta(java.lang.String str) {
        }

        static class Delta {
            int[] getHighSpeedVideoSizesFor = new int[10];
            int[] getOutputStallDuration = new int[10];
            int getHighResolutionOutputSizeshNQ4ISI = 0;
            int[] getOutputFormats = new int[10];
            float[] getInputFormats = new float[10];
            int getHighSpeedVideoSizes = 0;
            int[] getInputSizeshNQ4ISI = new int[5];
            java.lang.String[] getOutputMinFrameDurationlomOqCM = new java.lang.String[5];
            int getHighSpeedVideoFpsRangesFor = 0;
            int[] getHighSpeedVideoFpsRanges = new int[4];
            boolean[] getOutputMinFrameDuration = new boolean[4];
            int Camera2StreamConfigurationMap = 0;

            Delta() {
            }

            final void getHighResolutionOutputSizeshNQ4ISI(int i, int i2) {
                int i3 = this.getHighResolutionOutputSizeshNQ4ISI;
                int[] iArr = this.getHighSpeedVideoSizesFor;
                if (i3 >= iArr.length) {
                    this.getHighSpeedVideoSizesFor = java.util.Arrays.copyOf(iArr, iArr.length * 2);
                    int[] iArr2 = this.getOutputStallDuration;
                    this.getOutputStallDuration = java.util.Arrays.copyOf(iArr2, iArr2.length * 2);
                }
                int[] iArr3 = this.getHighSpeedVideoSizesFor;
                int i4 = this.getHighResolutionOutputSizeshNQ4ISI;
                iArr3[i4] = i;
                int[] iArr4 = this.getOutputStallDuration;
                this.getHighResolutionOutputSizeshNQ4ISI = i4 + 1;
                iArr4[i4] = i2;
            }

            final void getHighSpeedVideoSizes(int i, float f) {
                int i2 = this.getHighSpeedVideoSizes;
                int[] iArr = this.getOutputFormats;
                if (i2 >= iArr.length) {
                    this.getOutputFormats = java.util.Arrays.copyOf(iArr, iArr.length * 2);
                    float[] fArr = this.getInputFormats;
                    this.getInputFormats = java.util.Arrays.copyOf(fArr, fArr.length * 2);
                }
                int[] iArr2 = this.getOutputFormats;
                int i3 = this.getHighSpeedVideoSizes;
                iArr2[i3] = i;
                float[] fArr2 = this.getInputFormats;
                this.getHighSpeedVideoSizes = i3 + 1;
                fArr2[i3] = f;
            }

            final void getHighSpeedVideoSizes(int i, java.lang.String str) {
                int i2 = this.getHighSpeedVideoFpsRangesFor;
                int[] iArr = this.getInputSizeshNQ4ISI;
                if (i2 >= iArr.length) {
                    this.getInputSizeshNQ4ISI = java.util.Arrays.copyOf(iArr, iArr.length * 2);
                    java.lang.String[] strArr = this.getOutputMinFrameDurationlomOqCM;
                    this.getOutputMinFrameDurationlomOqCM = (java.lang.String[]) java.util.Arrays.copyOf(strArr, strArr.length * 2);
                }
                int[] iArr2 = this.getInputSizeshNQ4ISI;
                int i3 = this.getHighSpeedVideoFpsRangesFor;
                iArr2[i3] = i;
                java.lang.String[] strArr2 = this.getOutputMinFrameDurationlomOqCM;
                this.getHighSpeedVideoFpsRangesFor = i3 + 1;
                strArr2[i3] = str;
            }

            final void getHighSpeedVideoSizes(int i, boolean z) {
                int i2 = this.Camera2StreamConfigurationMap;
                int[] iArr = this.getHighSpeedVideoFpsRanges;
                if (i2 >= iArr.length) {
                    this.getHighSpeedVideoFpsRanges = java.util.Arrays.copyOf(iArr, iArr.length * 2);
                    boolean[] zArr = this.getOutputMinFrameDuration;
                    this.getOutputMinFrameDuration = java.util.Arrays.copyOf(zArr, zArr.length * 2);
                }
                int[] iArr2 = this.getHighSpeedVideoFpsRanges;
                int i3 = this.Camera2StreamConfigurationMap;
                iArr2[i3] = i;
                boolean[] zArr2 = this.getOutputMinFrameDuration;
                this.Camera2StreamConfigurationMap = i3 + 1;
                zArr2[i3] = z;
            }

            final void getHighSpeedVideoSizes(androidx.constraintlayout.widget.ConstraintSet.Constraint constraint) {
                for (int i = 0; i < this.getHighResolutionOutputSizeshNQ4ISI; i++) {
                    androidx.constraintlayout.widget.ConstraintSet.getHighResolutionOutputSizeshNQ4ISI(constraint, this.getHighSpeedVideoSizesFor[i], this.getOutputStallDuration[i]);
                }
                for (int i2 = 0; i2 < this.getHighSpeedVideoSizes; i2++) {
                    androidx.constraintlayout.widget.ConstraintSet.getHighSpeedVideoSizes(constraint, this.getOutputFormats[i2], this.getInputFormats[i2]);
                }
                for (int i3 = 0; i3 < this.getHighSpeedVideoFpsRangesFor; i3++) {
                    androidx.constraintlayout.widget.ConstraintSet.Camera2StreamConfigurationMap(constraint, this.getInputSizeshNQ4ISI[i3], this.getOutputMinFrameDurationlomOqCM[i3]);
                }
                for (int i4 = 0; i4 < this.Camera2StreamConfigurationMap; i4++) {
                    androidx.constraintlayout.widget.ConstraintSet.getHighSpeedVideoFpsRangesFor(constraint, this.getHighSpeedVideoFpsRanges[i4], this.getOutputMinFrameDuration[i4]);
                }
            }
        }

        public void applyDelta(androidx.constraintlayout.widget.ConstraintSet.Constraint constraint) {
            androidx.constraintlayout.widget.ConstraintSet.Constraint.Delta delta = this.Camera2StreamConfigurationMap;
            if (delta != null) {
                delta.getHighSpeedVideoSizes(constraint);
            }
        }

        private androidx.constraintlayout.widget.ConstraintAttribute getHighSpeedVideoFpsRangesFor(java.lang.String str, androidx.constraintlayout.widget.ConstraintAttribute.AttributeType attributeType) {
            if (this.mCustomConstraints.containsKey(str)) {
                androidx.constraintlayout.widget.ConstraintAttribute constraintAttribute = this.mCustomConstraints.get(str);
                if (constraintAttribute.getType() == attributeType) {
                    return constraintAttribute;
                }
                java.lang.StringBuilder sb = new java.lang.StringBuilder("ConstraintAttribute is already a ");
                sb.append(constraintAttribute.getType().name());
                throw new java.lang.IllegalArgumentException(sb.toString());
            }
            androidx.constraintlayout.widget.ConstraintAttribute constraintAttribute2 = new androidx.constraintlayout.widget.ConstraintAttribute(str, attributeType);
            this.mCustomConstraints.put(str, constraintAttribute2);
            return constraintAttribute2;
        }

        /* renamed from: clone, reason: merged with bridge method [inline-methods] */
        public androidx.constraintlayout.widget.ConstraintSet.Constraint m9056clone() {
            androidx.constraintlayout.widget.ConstraintSet.Constraint constraint = new androidx.constraintlayout.widget.ConstraintSet.Constraint();
            constraint.layout.copyFrom(this.layout);
            constraint.motion.copyFrom(this.motion);
            constraint.propertySet.copyFrom(this.propertySet);
            constraint.transform.copyFrom(this.transform);
            constraint.getHighSpeedVideoSizes = this.getHighSpeedVideoSizes;
            constraint.Camera2StreamConfigurationMap = this.Camera2StreamConfigurationMap;
            return constraint;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void getHighSpeedVideoSizes(int i, androidx.constraintlayout.widget.Constraints.LayoutParams layoutParams) {
            getHighSpeedVideoFpsRangesFor(i, layoutParams);
            this.propertySet.alpha = layoutParams.alpha;
            this.transform.rotation = layoutParams.rotation;
            this.transform.rotationX = layoutParams.rotationX;
            this.transform.rotationY = layoutParams.rotationY;
            this.transform.scaleX = layoutParams.scaleX;
            this.transform.scaleY = layoutParams.scaleY;
            this.transform.transformPivotX = layoutParams.transformPivotX;
            this.transform.transformPivotY = layoutParams.transformPivotY;
            this.transform.translationX = layoutParams.translationX;
            this.transform.translationY = layoutParams.translationY;
            this.transform.translationZ = layoutParams.translationZ;
            this.transform.elevation = layoutParams.elevation;
            this.transform.applyElevation = layoutParams.applyElevation;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void getHighSpeedVideoFpsRangesFor(int i, androidx.constraintlayout.widget.ConstraintLayout.LayoutParams layoutParams) {
            this.getHighSpeedVideoSizes = i;
            this.layout.leftToLeft = layoutParams.leftToLeft;
            this.layout.leftToRight = layoutParams.leftToRight;
            this.layout.rightToLeft = layoutParams.rightToLeft;
            this.layout.rightToRight = layoutParams.rightToRight;
            this.layout.topToTop = layoutParams.topToTop;
            this.layout.topToBottom = layoutParams.topToBottom;
            this.layout.bottomToTop = layoutParams.bottomToTop;
            this.layout.bottomToBottom = layoutParams.bottomToBottom;
            this.layout.baselineToBaseline = layoutParams.baselineToBaseline;
            this.layout.baselineToTop = layoutParams.baselineToTop;
            this.layout.baselineToBottom = layoutParams.baselineToBottom;
            this.layout.startToEnd = layoutParams.startToEnd;
            this.layout.startToStart = layoutParams.startToStart;
            this.layout.endToStart = layoutParams.endToStart;
            this.layout.endToEnd = layoutParams.endToEnd;
            this.layout.horizontalBias = layoutParams.horizontalBias;
            this.layout.verticalBias = layoutParams.verticalBias;
            this.layout.dimensionRatio = layoutParams.dimensionRatio;
            this.layout.circleConstraint = layoutParams.circleConstraint;
            this.layout.circleRadius = layoutParams.circleRadius;
            this.layout.circleAngle = layoutParams.circleAngle;
            this.layout.editorAbsoluteX = layoutParams.editorAbsoluteX;
            this.layout.editorAbsoluteY = layoutParams.editorAbsoluteY;
            this.layout.orientation = layoutParams.orientation;
            this.layout.guidePercent = layoutParams.guidePercent;
            this.layout.guideBegin = layoutParams.guideBegin;
            this.layout.guideEnd = layoutParams.guideEnd;
            this.layout.mWidth = layoutParams.width;
            this.layout.mHeight = layoutParams.height;
            this.layout.leftMargin = layoutParams.leftMargin;
            this.layout.rightMargin = layoutParams.rightMargin;
            this.layout.topMargin = layoutParams.topMargin;
            this.layout.bottomMargin = layoutParams.bottomMargin;
            this.layout.baselineMargin = layoutParams.baselineMargin;
            this.layout.verticalWeight = layoutParams.verticalWeight;
            this.layout.horizontalWeight = layoutParams.horizontalWeight;
            this.layout.verticalChainStyle = layoutParams.verticalChainStyle;
            this.layout.horizontalChainStyle = layoutParams.horizontalChainStyle;
            this.layout.constrainedWidth = layoutParams.constrainedWidth;
            this.layout.constrainedHeight = layoutParams.constrainedHeight;
            this.layout.widthDefault = layoutParams.matchConstraintDefaultWidth;
            this.layout.heightDefault = layoutParams.matchConstraintDefaultHeight;
            this.layout.widthMax = layoutParams.matchConstraintMaxWidth;
            this.layout.heightMax = layoutParams.matchConstraintMaxHeight;
            this.layout.widthMin = layoutParams.matchConstraintMinWidth;
            this.layout.heightMin = layoutParams.matchConstraintMinHeight;
            this.layout.widthPercent = layoutParams.matchConstraintPercentWidth;
            this.layout.heightPercent = layoutParams.matchConstraintPercentHeight;
            this.layout.mConstraintTag = layoutParams.constraintTag;
            this.layout.goneTopMargin = layoutParams.goneTopMargin;
            this.layout.goneBottomMargin = layoutParams.goneBottomMargin;
            this.layout.goneLeftMargin = layoutParams.goneLeftMargin;
            this.layout.goneRightMargin = layoutParams.goneRightMargin;
            this.layout.goneStartMargin = layoutParams.goneStartMargin;
            this.layout.goneEndMargin = layoutParams.goneEndMargin;
            this.layout.goneBaselineMargin = layoutParams.goneBaselineMargin;
            this.layout.mWrapBehavior = layoutParams.wrapBehaviorInParent;
            this.layout.endMargin = layoutParams.getMarginEnd();
            this.layout.startMargin = layoutParams.getMarginStart();
        }

        public void applyTo(androidx.constraintlayout.widget.ConstraintLayout.LayoutParams layoutParams) {
            layoutParams.leftToLeft = this.layout.leftToLeft;
            layoutParams.leftToRight = this.layout.leftToRight;
            layoutParams.rightToLeft = this.layout.rightToLeft;
            layoutParams.rightToRight = this.layout.rightToRight;
            layoutParams.topToTop = this.layout.topToTop;
            layoutParams.topToBottom = this.layout.topToBottom;
            layoutParams.bottomToTop = this.layout.bottomToTop;
            layoutParams.bottomToBottom = this.layout.bottomToBottom;
            layoutParams.baselineToBaseline = this.layout.baselineToBaseline;
            layoutParams.baselineToTop = this.layout.baselineToTop;
            layoutParams.baselineToBottom = this.layout.baselineToBottom;
            layoutParams.startToEnd = this.layout.startToEnd;
            layoutParams.startToStart = this.layout.startToStart;
            layoutParams.endToStart = this.layout.endToStart;
            layoutParams.endToEnd = this.layout.endToEnd;
            layoutParams.leftMargin = this.layout.leftMargin;
            layoutParams.rightMargin = this.layout.rightMargin;
            layoutParams.topMargin = this.layout.topMargin;
            layoutParams.bottomMargin = this.layout.bottomMargin;
            layoutParams.goneStartMargin = this.layout.goneStartMargin;
            layoutParams.goneEndMargin = this.layout.goneEndMargin;
            layoutParams.goneTopMargin = this.layout.goneTopMargin;
            layoutParams.goneBottomMargin = this.layout.goneBottomMargin;
            layoutParams.horizontalBias = this.layout.horizontalBias;
            layoutParams.verticalBias = this.layout.verticalBias;
            layoutParams.circleConstraint = this.layout.circleConstraint;
            layoutParams.circleRadius = this.layout.circleRadius;
            layoutParams.circleAngle = this.layout.circleAngle;
            layoutParams.dimensionRatio = this.layout.dimensionRatio;
            layoutParams.editorAbsoluteX = this.layout.editorAbsoluteX;
            layoutParams.editorAbsoluteY = this.layout.editorAbsoluteY;
            layoutParams.verticalWeight = this.layout.verticalWeight;
            layoutParams.horizontalWeight = this.layout.horizontalWeight;
            layoutParams.verticalChainStyle = this.layout.verticalChainStyle;
            layoutParams.horizontalChainStyle = this.layout.horizontalChainStyle;
            layoutParams.constrainedWidth = this.layout.constrainedWidth;
            layoutParams.constrainedHeight = this.layout.constrainedHeight;
            layoutParams.matchConstraintDefaultWidth = this.layout.widthDefault;
            layoutParams.matchConstraintDefaultHeight = this.layout.heightDefault;
            layoutParams.matchConstraintMaxWidth = this.layout.widthMax;
            layoutParams.matchConstraintMaxHeight = this.layout.heightMax;
            layoutParams.matchConstraintMinWidth = this.layout.widthMin;
            layoutParams.matchConstraintMinHeight = this.layout.heightMin;
            layoutParams.matchConstraintPercentWidth = this.layout.widthPercent;
            layoutParams.matchConstraintPercentHeight = this.layout.heightPercent;
            layoutParams.orientation = this.layout.orientation;
            layoutParams.guidePercent = this.layout.guidePercent;
            layoutParams.guideBegin = this.layout.guideBegin;
            layoutParams.guideEnd = this.layout.guideEnd;
            layoutParams.width = this.layout.mWidth;
            layoutParams.height = this.layout.mHeight;
            if (this.layout.mConstraintTag != null) {
                layoutParams.constraintTag = this.layout.mConstraintTag;
            }
            layoutParams.wrapBehaviorInParent = this.layout.mWrapBehavior;
            layoutParams.setMarginStart(this.layout.startMargin);
            layoutParams.setMarginEnd(this.layout.endMargin);
            layoutParams.validate();
        }

        static /* synthetic */ void getHighSpeedVideoFpsRanges(androidx.constraintlayout.widget.ConstraintSet.Constraint constraint, java.lang.String str, int i) {
            constraint.getHighSpeedVideoFpsRangesFor(str, androidx.constraintlayout.widget.ConstraintAttribute.AttributeType.COLOR_TYPE).setColorValue(i);
        }

        static /* synthetic */ void getHighResolutionOutputSizeshNQ4ISI(androidx.constraintlayout.widget.ConstraintSet.Constraint constraint, java.lang.String str, float f) {
            constraint.getHighSpeedVideoFpsRangesFor(str, androidx.constraintlayout.widget.ConstraintAttribute.AttributeType.FLOAT_TYPE).setFloatValue(f);
        }

        static /* synthetic */ void getHighResolutionOutputSizeshNQ4ISI(androidx.constraintlayout.widget.ConstraintSet.Constraint constraint, java.lang.String str, java.lang.String str2) {
            constraint.getHighSpeedVideoFpsRangesFor(str, androidx.constraintlayout.widget.ConstraintAttribute.AttributeType.STRING_TYPE).setStringValue(str2);
        }

        static /* synthetic */ void getHighSpeedVideoFpsRanges(androidx.constraintlayout.widget.ConstraintSet.Constraint constraint, androidx.constraintlayout.widget.ConstraintHelper constraintHelper, int i, androidx.constraintlayout.widget.Constraints.LayoutParams layoutParams) {
            constraint.getHighSpeedVideoSizes(i, layoutParams);
            if (constraintHelper instanceof androidx.constraintlayout.widget.Barrier) {
                constraint.layout.mHelperType = 1;
                androidx.constraintlayout.widget.Barrier barrier = (androidx.constraintlayout.widget.Barrier) constraintHelper;
                constraint.layout.mBarrierDirection = barrier.getType();
                constraint.layout.mReferenceIds = barrier.getReferencedIds();
                constraint.layout.mBarrierMargin = barrier.getMargin();
            }
        }

        static /* synthetic */ void getHighResolutionOutputSizeshNQ4ISI(androidx.constraintlayout.widget.ConstraintSet.Constraint constraint, java.lang.String str, int i) {
            constraint.getHighSpeedVideoFpsRangesFor(str, androidx.constraintlayout.widget.ConstraintAttribute.AttributeType.INT_TYPE).setIntValue(i);
        }
    }

    public void clone(android.content.Context context, int i) {
        clone((androidx.constraintlayout.widget.ConstraintLayout) android.view.LayoutInflater.from(context).inflate(i, (android.view.ViewGroup) null));
    }

    public void clone(androidx.constraintlayout.widget.ConstraintSet constraintSet) {
        this.getHighSpeedVideoSizes.clear();
        for (java.lang.Integer num : constraintSet.getHighSpeedVideoSizes.keySet()) {
            androidx.constraintlayout.widget.ConstraintSet.Constraint constraint = constraintSet.getHighSpeedVideoSizes.get(num);
            if (constraint != null) {
                this.getHighSpeedVideoSizes.put(num, constraint.m9056clone());
            }
        }
    }

    public void clone(androidx.constraintlayout.widget.ConstraintLayout constraintLayout) {
        int childCount = constraintLayout.getChildCount();
        this.getHighSpeedVideoSizes.clear();
        for (int i = 0; i < childCount; i++) {
            android.view.View childAt = constraintLayout.getChildAt(i);
            androidx.constraintlayout.widget.ConstraintLayout.LayoutParams layoutParams = (androidx.constraintlayout.widget.ConstraintLayout.LayoutParams) childAt.getLayoutParams();
            int id = childAt.getId();
            if (this.Camera2StreamConfigurationMap && id == -1) {
                throw new java.lang.RuntimeException("All children of ConstraintLayout must have ids to use ConstraintSet");
            }
            if (!this.getHighSpeedVideoSizes.containsKey(java.lang.Integer.valueOf(id))) {
                this.getHighSpeedVideoSizes.put(java.lang.Integer.valueOf(id), new androidx.constraintlayout.widget.ConstraintSet.Constraint());
            }
            androidx.constraintlayout.widget.ConstraintSet.Constraint constraint = this.getHighSpeedVideoSizes.get(java.lang.Integer.valueOf(id));
            if (constraint != null) {
                constraint.mCustomConstraints = androidx.constraintlayout.widget.ConstraintAttribute.extractAttributes(this.getOutputFormats, childAt);
                constraint.getHighSpeedVideoFpsRangesFor(id, layoutParams);
                constraint.propertySet.visibility = childAt.getVisibility();
                constraint.propertySet.alpha = childAt.getAlpha();
                constraint.transform.rotation = childAt.getRotation();
                constraint.transform.rotationX = childAt.getRotationX();
                constraint.transform.rotationY = childAt.getRotationY();
                constraint.transform.scaleX = childAt.getScaleX();
                constraint.transform.scaleY = childAt.getScaleY();
                float pivotX = childAt.getPivotX();
                float pivotY = childAt.getPivotY();
                if (pivotX != 0.0d || pivotY != 0.0d) {
                    constraint.transform.transformPivotX = pivotX;
                    constraint.transform.transformPivotY = pivotY;
                }
                constraint.transform.translationX = childAt.getTranslationX();
                constraint.transform.translationY = childAt.getTranslationY();
                constraint.transform.translationZ = childAt.getTranslationZ();
                if (constraint.transform.applyElevation) {
                    constraint.transform.elevation = childAt.getElevation();
                }
                if (childAt instanceof androidx.constraintlayout.widget.Barrier) {
                    androidx.constraintlayout.widget.Barrier barrier = (androidx.constraintlayout.widget.Barrier) childAt;
                    constraint.layout.mBarrierAllowsGoneWidgets = barrier.getAllowsGoneWidget();
                    constraint.layout.mReferenceIds = barrier.getReferencedIds();
                    constraint.layout.mBarrierDirection = barrier.getType();
                    constraint.layout.mBarrierMargin = barrier.getMargin();
                }
            }
        }
    }

    public void clone(androidx.constraintlayout.widget.Constraints constraints) {
        int childCount = constraints.getChildCount();
        this.getHighSpeedVideoSizes.clear();
        for (int i = 0; i < childCount; i++) {
            android.view.View childAt = constraints.getChildAt(i);
            androidx.constraintlayout.widget.Constraints.LayoutParams layoutParams = (androidx.constraintlayout.widget.Constraints.LayoutParams) childAt.getLayoutParams();
            int id = childAt.getId();
            if (this.Camera2StreamConfigurationMap && id == -1) {
                throw new java.lang.RuntimeException("All children of ConstraintLayout must have ids to use ConstraintSet");
            }
            if (!this.getHighSpeedVideoSizes.containsKey(java.lang.Integer.valueOf(id))) {
                this.getHighSpeedVideoSizes.put(java.lang.Integer.valueOf(id), new androidx.constraintlayout.widget.ConstraintSet.Constraint());
            }
            androidx.constraintlayout.widget.ConstraintSet.Constraint constraint = this.getHighSpeedVideoSizes.get(java.lang.Integer.valueOf(id));
            if (constraint != null) {
                if (childAt instanceof androidx.constraintlayout.widget.ConstraintHelper) {
                    androidx.constraintlayout.widget.ConstraintSet.Constraint.getHighSpeedVideoFpsRanges(constraint, (androidx.constraintlayout.widget.ConstraintHelper) childAt, id, layoutParams);
                }
                constraint.getHighSpeedVideoSizes(id, layoutParams);
            }
        }
    }

    public void applyTo(androidx.constraintlayout.widget.ConstraintLayout constraintLayout) {
        getHighSpeedVideoSizes(constraintLayout, true);
        constraintLayout.setConstraintSet(null);
        constraintLayout.requestLayout();
    }

    public void applyToWithoutCustom(androidx.constraintlayout.widget.ConstraintLayout constraintLayout) {
        getHighSpeedVideoSizes(constraintLayout, false);
        constraintLayout.setConstraintSet(null);
    }

    public void applyCustomAttributes(androidx.constraintlayout.widget.ConstraintLayout constraintLayout) {
        androidx.constraintlayout.widget.ConstraintSet.Constraint constraint;
        int childCount = constraintLayout.getChildCount();
        for (int i = 0; i < childCount; i++) {
            android.view.View childAt = constraintLayout.getChildAt(i);
            int id = childAt.getId();
            if (!this.getHighSpeedVideoSizes.containsKey(java.lang.Integer.valueOf(id))) {
                androidx.constraintlayout.motion.widget.Debug.getName(childAt);
            } else {
                if (this.Camera2StreamConfigurationMap && id == -1) {
                    throw new java.lang.RuntimeException("All children of ConstraintLayout must have ids to use ConstraintSet");
                }
                if (this.getHighSpeedVideoSizes.containsKey(java.lang.Integer.valueOf(id)) && (constraint = this.getHighSpeedVideoSizes.get(java.lang.Integer.valueOf(id))) != null) {
                    androidx.constraintlayout.widget.ConstraintAttribute.setAttributes(childAt, constraint.mCustomConstraints);
                }
            }
        }
    }

    public void applyToHelper(androidx.constraintlayout.widget.ConstraintHelper constraintHelper, androidx.constraintlayout.core.widgets.ConstraintWidget constraintWidget, androidx.constraintlayout.widget.ConstraintLayout.LayoutParams layoutParams, android.util.SparseArray<androidx.constraintlayout.core.widgets.ConstraintWidget> sparseArray) {
        androidx.constraintlayout.widget.ConstraintSet.Constraint constraint;
        int id = constraintHelper.getId();
        if (this.getHighSpeedVideoSizes.containsKey(java.lang.Integer.valueOf(id)) && (constraint = this.getHighSpeedVideoSizes.get(java.lang.Integer.valueOf(id))) != null && (constraintWidget instanceof androidx.constraintlayout.core.widgets.HelperWidget)) {
            constraintHelper.loadParameters(constraint, (androidx.constraintlayout.core.widgets.HelperWidget) constraintWidget, layoutParams, sparseArray);
        }
    }

    public void applyToLayoutParams(int i, androidx.constraintlayout.widget.ConstraintLayout.LayoutParams layoutParams) {
        androidx.constraintlayout.widget.ConstraintSet.Constraint constraint;
        if (!this.getHighSpeedVideoSizes.containsKey(java.lang.Integer.valueOf(i)) || (constraint = this.getHighSpeedVideoSizes.get(java.lang.Integer.valueOf(i))) == null) {
            return;
        }
        constraint.applyTo(layoutParams);
    }

    final void getHighSpeedVideoSizes(androidx.constraintlayout.widget.ConstraintLayout constraintLayout, boolean z) {
        int childCount = constraintLayout.getChildCount();
        java.util.HashSet hashSet = new java.util.HashSet(this.getHighSpeedVideoSizes.keySet());
        for (int i = 0; i < childCount; i++) {
            android.view.View childAt = constraintLayout.getChildAt(i);
            int id = childAt.getId();
            if (!this.getHighSpeedVideoSizes.containsKey(java.lang.Integer.valueOf(id))) {
                androidx.constraintlayout.motion.widget.Debug.getName(childAt);
            } else {
                if (this.Camera2StreamConfigurationMap && id == -1) {
                    throw new java.lang.RuntimeException("All children of ConstraintLayout must have ids to use ConstraintSet");
                }
                if (id != -1 && this.getHighSpeedVideoSizes.containsKey(java.lang.Integer.valueOf(id))) {
                    hashSet.remove(java.lang.Integer.valueOf(id));
                    androidx.constraintlayout.widget.ConstraintSet.Constraint constraint = this.getHighSpeedVideoSizes.get(java.lang.Integer.valueOf(id));
                    if (constraint != null) {
                        if (childAt instanceof androidx.constraintlayout.widget.Barrier) {
                            constraint.layout.mHelperType = 1;
                            androidx.constraintlayout.widget.Barrier barrier = (androidx.constraintlayout.widget.Barrier) childAt;
                            barrier.setId(id);
                            barrier.setType(constraint.layout.mBarrierDirection);
                            barrier.setMargin(constraint.layout.mBarrierMargin);
                            barrier.setAllowsGoneWidget(constraint.layout.mBarrierAllowsGoneWidgets);
                            if (constraint.layout.mReferenceIds != null) {
                                barrier.setReferencedIds(constraint.layout.mReferenceIds);
                            } else if (constraint.layout.mReferenceIdString != null) {
                                constraint.layout.mReferenceIds = getHighResolutionOutputSizeshNQ4ISI(barrier, constraint.layout.mReferenceIdString);
                                barrier.setReferencedIds(constraint.layout.mReferenceIds);
                            }
                        }
                        androidx.constraintlayout.widget.ConstraintLayout.LayoutParams layoutParams = (androidx.constraintlayout.widget.ConstraintLayout.LayoutParams) childAt.getLayoutParams();
                        layoutParams.validate();
                        constraint.applyTo(layoutParams);
                        if (z) {
                            androidx.constraintlayout.widget.ConstraintAttribute.setAttributes(childAt, constraint.mCustomConstraints);
                        }
                        childAt.setLayoutParams(layoutParams);
                        if (constraint.propertySet.mVisibilityMode == 0) {
                            childAt.setVisibility(constraint.propertySet.visibility);
                        }
                        childAt.setAlpha(constraint.propertySet.alpha);
                        childAt.setRotation(constraint.transform.rotation);
                        childAt.setRotationX(constraint.transform.rotationX);
                        childAt.setRotationY(constraint.transform.rotationY);
                        childAt.setScaleX(constraint.transform.scaleX);
                        childAt.setScaleY(constraint.transform.scaleY);
                        if (constraint.transform.transformPivotTarget != -1) {
                            if (((android.view.View) childAt.getParent()).findViewById(constraint.transform.transformPivotTarget) != null) {
                                float top = (r4.getTop() + r4.getBottom()) / 2.0f;
                                float left = (r4.getLeft() + r4.getRight()) / 2.0f;
                                if (childAt.getRight() - childAt.getLeft() > 0 && childAt.getBottom() - childAt.getTop() > 0) {
                                    float left2 = childAt.getLeft();
                                    float top2 = childAt.getTop();
                                    childAt.setPivotX(left - left2);
                                    childAt.setPivotY(top - top2);
                                }
                            }
                        } else {
                            if (!java.lang.Float.isNaN(constraint.transform.transformPivotX)) {
                                childAt.setPivotX(constraint.transform.transformPivotX);
                            }
                            if (!java.lang.Float.isNaN(constraint.transform.transformPivotY)) {
                                childAt.setPivotY(constraint.transform.transformPivotY);
                            }
                        }
                        childAt.setTranslationX(constraint.transform.translationX);
                        childAt.setTranslationY(constraint.transform.translationY);
                        childAt.setTranslationZ(constraint.transform.translationZ);
                        if (constraint.transform.applyElevation) {
                            childAt.setElevation(constraint.transform.elevation);
                        }
                    }
                }
            }
        }
        java.util.Iterator it = hashSet.iterator();
        while (it.hasNext()) {
            java.lang.Integer num = (java.lang.Integer) it.next();
            androidx.constraintlayout.widget.ConstraintSet.Constraint constraint2 = this.getHighSpeedVideoSizes.get(num);
            if (constraint2 != null) {
                if (constraint2.layout.mHelperType == 1) {
                    androidx.constraintlayout.widget.Barrier barrier2 = new androidx.constraintlayout.widget.Barrier(constraintLayout.getContext());
                    barrier2.setId(num.intValue());
                    if (constraint2.layout.mReferenceIds != null) {
                        barrier2.setReferencedIds(constraint2.layout.mReferenceIds);
                    } else if (constraint2.layout.mReferenceIdString != null) {
                        constraint2.layout.mReferenceIds = getHighResolutionOutputSizeshNQ4ISI(barrier2, constraint2.layout.mReferenceIdString);
                        barrier2.setReferencedIds(constraint2.layout.mReferenceIds);
                    }
                    barrier2.setType(constraint2.layout.mBarrierDirection);
                    barrier2.setMargin(constraint2.layout.mBarrierMargin);
                    androidx.constraintlayout.widget.ConstraintLayout.LayoutParams generateDefaultLayoutParams = constraintLayout.generateDefaultLayoutParams();
                    barrier2.validateParams();
                    constraint2.applyTo(generateDefaultLayoutParams);
                    constraintLayout.addView(barrier2, generateDefaultLayoutParams);
                }
                if (constraint2.layout.mIsGuideline) {
                    android.view.View guideline = new androidx.constraintlayout.widget.Guideline(constraintLayout.getContext());
                    guideline.setId(num.intValue());
                    androidx.constraintlayout.widget.ConstraintLayout.LayoutParams generateDefaultLayoutParams2 = constraintLayout.generateDefaultLayoutParams();
                    constraint2.applyTo(generateDefaultLayoutParams2);
                    constraintLayout.addView(guideline, generateDefaultLayoutParams2);
                }
            }
        }
        for (int i2 = 0; i2 < childCount; i2++) {
            android.view.View childAt2 = constraintLayout.getChildAt(i2);
            if (childAt2 instanceof androidx.constraintlayout.widget.ConstraintHelper) {
                ((androidx.constraintlayout.widget.ConstraintHelper) childAt2).applyLayoutFeaturesInConstraintSet(constraintLayout);
            }
        }
    }

    public void center(int i, int i2, int i3, int i4, int i5, int i6, int i7, float f) {
        if (i4 < 0) {
            throw new java.lang.IllegalArgumentException("margin must be > 0");
        }
        if (i7 < 0) {
            throw new java.lang.IllegalArgumentException("margin must be > 0");
        }
        if (f <= 0.0f || f > 1.0f) {
            throw new java.lang.IllegalArgumentException("bias must be between 0 and 1 inclusive");
        }
        if (i3 == 1 || i3 == 2) {
            connect(i, 1, i2, i3, i4);
            connect(i, 2, i5, i6, i7);
            androidx.constraintlayout.widget.ConstraintSet.Constraint constraint = this.getHighSpeedVideoSizes.get(java.lang.Integer.valueOf(i));
            if (constraint != null) {
                constraint.layout.horizontalBias = f;
                return;
            }
            return;
        }
        if (i3 == 6 || i3 == 7) {
            connect(i, 6, i2, i3, i4);
            connect(i, 7, i5, i6, i7);
            androidx.constraintlayout.widget.ConstraintSet.Constraint constraint2 = this.getHighSpeedVideoSizes.get(java.lang.Integer.valueOf(i));
            if (constraint2 != null) {
                constraint2.layout.horizontalBias = f;
                return;
            }
            return;
        }
        connect(i, 3, i2, i3, i4);
        connect(i, 4, i5, i6, i7);
        androidx.constraintlayout.widget.ConstraintSet.Constraint constraint3 = this.getHighSpeedVideoSizes.get(java.lang.Integer.valueOf(i));
        if (constraint3 != null) {
            constraint3.layout.verticalBias = f;
        }
    }

    public void centerHorizontally(int i, int i2, int i3, int i4, int i5, int i6, int i7, float f) {
        connect(i, 1, i2, i3, i4);
        connect(i, 2, i5, i6, i7);
        androidx.constraintlayout.widget.ConstraintSet.Constraint constraint = this.getHighSpeedVideoSizes.get(java.lang.Integer.valueOf(i));
        if (constraint != null) {
            constraint.layout.horizontalBias = f;
        }
    }

    public void centerHorizontallyRtl(int i, int i2, int i3, int i4, int i5, int i6, int i7, float f) {
        connect(i, 6, i2, i3, i4);
        connect(i, 7, i5, i6, i7);
        androidx.constraintlayout.widget.ConstraintSet.Constraint constraint = this.getHighSpeedVideoSizes.get(java.lang.Integer.valueOf(i));
        if (constraint != null) {
            constraint.layout.horizontalBias = f;
        }
    }

    public void centerVertically(int i, int i2, int i3, int i4, int i5, int i6, int i7, float f) {
        connect(i, 3, i2, i3, i4);
        connect(i, 4, i5, i6, i7);
        androidx.constraintlayout.widget.ConstraintSet.Constraint constraint = this.getHighSpeedVideoSizes.get(java.lang.Integer.valueOf(i));
        if (constraint != null) {
            constraint.layout.verticalBias = f;
        }
    }

    public void createVerticalChain(int i, int i2, int i3, int i4, int[] iArr, float[] fArr, int i5) {
        if (iArr.length < 2) {
            throw new java.lang.IllegalArgumentException("must have 2 or more widgets in a chain");
        }
        if (fArr != null && fArr.length != iArr.length) {
            throw new java.lang.IllegalArgumentException("must have 2 or more widgets in a chain");
        }
        if (fArr != null) {
            Camera2StreamConfigurationMap(iArr[0]).layout.verticalWeight = fArr[0];
        }
        Camera2StreamConfigurationMap(iArr[0]).layout.verticalChainStyle = i5;
        connect(iArr[0], 3, i, i2, 0);
        for (int i6 = 1; i6 < iArr.length; i6++) {
            int i7 = i6 - 1;
            connect(iArr[i6], 3, iArr[i7], 4, 0);
            connect(iArr[i7], 4, iArr[i6], 3, 0);
            if (fArr != null) {
                Camera2StreamConfigurationMap(iArr[i6]).layout.verticalWeight = fArr[i6];
            }
        }
        connect(iArr[iArr.length - 1], 4, i3, i4, 0);
    }

    public void createHorizontalChain(int i, int i2, int i3, int i4, int[] iArr, float[] fArr, int i5) {
        getHighSpeedVideoSizes(i, i2, i3, i4, iArr, fArr, i5, 1, 2);
    }

    public void createHorizontalChainRtl(int i, int i2, int i3, int i4, int[] iArr, float[] fArr, int i5) {
        getHighSpeedVideoSizes(i, i2, i3, i4, iArr, fArr, i5, 6, 7);
    }

    private void getHighSpeedVideoSizes(int i, int i2, int i3, int i4, int[] iArr, float[] fArr, int i5, int i6, int i7) {
        if (iArr.length < 2) {
            throw new java.lang.IllegalArgumentException("must have 2 or more widgets in a chain");
        }
        if (fArr != null && fArr.length != iArr.length) {
            throw new java.lang.IllegalArgumentException("must have 2 or more widgets in a chain");
        }
        if (fArr != null) {
            Camera2StreamConfigurationMap(iArr[0]).layout.horizontalWeight = fArr[0];
        }
        Camera2StreamConfigurationMap(iArr[0]).layout.horizontalChainStyle = i5;
        connect(iArr[0], i6, i, i2, -1);
        for (int i8 = 1; i8 < iArr.length; i8++) {
            int i9 = i8 - 1;
            connect(iArr[i8], i6, iArr[i9], i7, -1);
            connect(iArr[i9], i7, iArr[i8], i6, -1);
            if (fArr != null) {
                Camera2StreamConfigurationMap(iArr[i8]).layout.horizontalWeight = fArr[i8];
            }
        }
        connect(iArr[iArr.length - 1], i7, i3, i4, -1);
    }

    public void connect(int i, int i2, int i3, int i4, int i5) {
        if (!this.getHighSpeedVideoSizes.containsKey(java.lang.Integer.valueOf(i))) {
            this.getHighSpeedVideoSizes.put(java.lang.Integer.valueOf(i), new androidx.constraintlayout.widget.ConstraintSet.Constraint());
        }
        androidx.constraintlayout.widget.ConstraintSet.Constraint constraint = this.getHighSpeedVideoSizes.get(java.lang.Integer.valueOf(i));
        if (constraint == null) {
            return;
        }
        switch (i2) {
            case 1:
                if (i4 == 1) {
                    constraint.layout.leftToLeft = i3;
                    constraint.layout.leftToRight = -1;
                } else if (i4 == 2) {
                    constraint.layout.leftToRight = i3;
                    constraint.layout.leftToLeft = -1;
                } else {
                    java.lang.StringBuilder sb = new java.lang.StringBuilder("Left to ");
                    sb.append(getHighResolutionOutputSizeshNQ4ISI(i4));
                    sb.append(" undefined");
                    throw new java.lang.IllegalArgumentException(sb.toString());
                }
                constraint.layout.leftMargin = i5;
                return;
            case 2:
                if (i4 == 1) {
                    constraint.layout.rightToLeft = i3;
                    constraint.layout.rightToRight = -1;
                } else if (i4 == 2) {
                    constraint.layout.rightToRight = i3;
                    constraint.layout.rightToLeft = -1;
                } else {
                    java.lang.StringBuilder sb2 = new java.lang.StringBuilder("right to ");
                    sb2.append(getHighResolutionOutputSizeshNQ4ISI(i4));
                    sb2.append(" undefined");
                    throw new java.lang.IllegalArgumentException(sb2.toString());
                }
                constraint.layout.rightMargin = i5;
                return;
            case 3:
                if (i4 == 3) {
                    constraint.layout.topToTop = i3;
                    constraint.layout.topToBottom = -1;
                    constraint.layout.baselineToBaseline = -1;
                    constraint.layout.baselineToTop = -1;
                    constraint.layout.baselineToBottom = -1;
                } else if (i4 == 4) {
                    constraint.layout.topToBottom = i3;
                    constraint.layout.topToTop = -1;
                    constraint.layout.baselineToBaseline = -1;
                    constraint.layout.baselineToTop = -1;
                    constraint.layout.baselineToBottom = -1;
                } else {
                    java.lang.StringBuilder sb3 = new java.lang.StringBuilder("right to ");
                    sb3.append(getHighResolutionOutputSizeshNQ4ISI(i4));
                    sb3.append(" undefined");
                    throw new java.lang.IllegalArgumentException(sb3.toString());
                }
                constraint.layout.topMargin = i5;
                return;
            case 4:
                if (i4 == 4) {
                    constraint.layout.bottomToBottom = i3;
                    constraint.layout.bottomToTop = -1;
                    constraint.layout.baselineToBaseline = -1;
                    constraint.layout.baselineToTop = -1;
                    constraint.layout.baselineToBottom = -1;
                } else if (i4 == 3) {
                    constraint.layout.bottomToTop = i3;
                    constraint.layout.bottomToBottom = -1;
                    constraint.layout.baselineToBaseline = -1;
                    constraint.layout.baselineToTop = -1;
                    constraint.layout.baselineToBottom = -1;
                } else {
                    java.lang.StringBuilder sb4 = new java.lang.StringBuilder("right to ");
                    sb4.append(getHighResolutionOutputSizeshNQ4ISI(i4));
                    sb4.append(" undefined");
                    throw new java.lang.IllegalArgumentException(sb4.toString());
                }
                constraint.layout.bottomMargin = i5;
                return;
            case 5:
                if (i4 == 5) {
                    constraint.layout.baselineToBaseline = i3;
                    constraint.layout.bottomToBottom = -1;
                    constraint.layout.bottomToTop = -1;
                    constraint.layout.topToTop = -1;
                    constraint.layout.topToBottom = -1;
                    return;
                }
                if (i4 == 3) {
                    constraint.layout.baselineToTop = i3;
                    constraint.layout.bottomToBottom = -1;
                    constraint.layout.bottomToTop = -1;
                    constraint.layout.topToTop = -1;
                    constraint.layout.topToBottom = -1;
                    return;
                }
                if (i4 == 4) {
                    constraint.layout.baselineToBottom = i3;
                    constraint.layout.bottomToBottom = -1;
                    constraint.layout.bottomToTop = -1;
                    constraint.layout.topToTop = -1;
                    constraint.layout.topToBottom = -1;
                    return;
                }
                java.lang.StringBuilder sb5 = new java.lang.StringBuilder("right to ");
                sb5.append(getHighResolutionOutputSizeshNQ4ISI(i4));
                sb5.append(" undefined");
                throw new java.lang.IllegalArgumentException(sb5.toString());
            case 6:
                if (i4 == 6) {
                    constraint.layout.startToStart = i3;
                    constraint.layout.startToEnd = -1;
                } else if (i4 == 7) {
                    constraint.layout.startToEnd = i3;
                    constraint.layout.startToStart = -1;
                } else {
                    java.lang.StringBuilder sb6 = new java.lang.StringBuilder("right to ");
                    sb6.append(getHighResolutionOutputSizeshNQ4ISI(i4));
                    sb6.append(" undefined");
                    throw new java.lang.IllegalArgumentException(sb6.toString());
                }
                constraint.layout.startMargin = i5;
                return;
            case 7:
                if (i4 == 7) {
                    constraint.layout.endToEnd = i3;
                    constraint.layout.endToStart = -1;
                } else if (i4 == 6) {
                    constraint.layout.endToStart = i3;
                    constraint.layout.endToEnd = -1;
                } else {
                    java.lang.StringBuilder sb7 = new java.lang.StringBuilder("right to ");
                    sb7.append(getHighResolutionOutputSizeshNQ4ISI(i4));
                    sb7.append(" undefined");
                    throw new java.lang.IllegalArgumentException(sb7.toString());
                }
                constraint.layout.endMargin = i5;
                return;
            default:
                java.lang.StringBuilder sb8 = new java.lang.StringBuilder();
                sb8.append(getHighResolutionOutputSizeshNQ4ISI(i2));
                sb8.append(" to ");
                sb8.append(getHighResolutionOutputSizeshNQ4ISI(i4));
                sb8.append(" unknown");
                throw new java.lang.IllegalArgumentException(sb8.toString());
        }
    }

    public void connect(int i, int i2, int i3, int i4) {
        if (!this.getHighSpeedVideoSizes.containsKey(java.lang.Integer.valueOf(i))) {
            this.getHighSpeedVideoSizes.put(java.lang.Integer.valueOf(i), new androidx.constraintlayout.widget.ConstraintSet.Constraint());
        }
        androidx.constraintlayout.widget.ConstraintSet.Constraint constraint = this.getHighSpeedVideoSizes.get(java.lang.Integer.valueOf(i));
        if (constraint == null) {
            return;
        }
        switch (i2) {
            case 1:
                if (i4 == 1) {
                    constraint.layout.leftToLeft = i3;
                    constraint.layout.leftToRight = -1;
                    return;
                } else if (i4 == 2) {
                    constraint.layout.leftToRight = i3;
                    constraint.layout.leftToLeft = -1;
                    return;
                } else {
                    java.lang.StringBuilder sb = new java.lang.StringBuilder("left to ");
                    sb.append(getHighResolutionOutputSizeshNQ4ISI(i4));
                    sb.append(" undefined");
                    throw new java.lang.IllegalArgumentException(sb.toString());
                }
            case 2:
                if (i4 == 1) {
                    constraint.layout.rightToLeft = i3;
                    constraint.layout.rightToRight = -1;
                    return;
                } else if (i4 == 2) {
                    constraint.layout.rightToRight = i3;
                    constraint.layout.rightToLeft = -1;
                    return;
                } else {
                    java.lang.StringBuilder sb2 = new java.lang.StringBuilder("right to ");
                    sb2.append(getHighResolutionOutputSizeshNQ4ISI(i4));
                    sb2.append(" undefined");
                    throw new java.lang.IllegalArgumentException(sb2.toString());
                }
            case 3:
                if (i4 == 3) {
                    constraint.layout.topToTop = i3;
                    constraint.layout.topToBottom = -1;
                    constraint.layout.baselineToBaseline = -1;
                    constraint.layout.baselineToTop = -1;
                    constraint.layout.baselineToBottom = -1;
                    return;
                }
                if (i4 == 4) {
                    constraint.layout.topToBottom = i3;
                    constraint.layout.topToTop = -1;
                    constraint.layout.baselineToBaseline = -1;
                    constraint.layout.baselineToTop = -1;
                    constraint.layout.baselineToBottom = -1;
                    return;
                }
                java.lang.StringBuilder sb3 = new java.lang.StringBuilder("right to ");
                sb3.append(getHighResolutionOutputSizeshNQ4ISI(i4));
                sb3.append(" undefined");
                throw new java.lang.IllegalArgumentException(sb3.toString());
            case 4:
                if (i4 == 4) {
                    constraint.layout.bottomToBottom = i3;
                    constraint.layout.bottomToTop = -1;
                    constraint.layout.baselineToBaseline = -1;
                    constraint.layout.baselineToTop = -1;
                    constraint.layout.baselineToBottom = -1;
                    return;
                }
                if (i4 == 3) {
                    constraint.layout.bottomToTop = i3;
                    constraint.layout.bottomToBottom = -1;
                    constraint.layout.baselineToBaseline = -1;
                    constraint.layout.baselineToTop = -1;
                    constraint.layout.baselineToBottom = -1;
                    return;
                }
                java.lang.StringBuilder sb4 = new java.lang.StringBuilder("right to ");
                sb4.append(getHighResolutionOutputSizeshNQ4ISI(i4));
                sb4.append(" undefined");
                throw new java.lang.IllegalArgumentException(sb4.toString());
            case 5:
                if (i4 == 5) {
                    constraint.layout.baselineToBaseline = i3;
                    constraint.layout.bottomToBottom = -1;
                    constraint.layout.bottomToTop = -1;
                    constraint.layout.topToTop = -1;
                    constraint.layout.topToBottom = -1;
                    return;
                }
                if (i4 == 3) {
                    constraint.layout.baselineToTop = i3;
                    constraint.layout.bottomToBottom = -1;
                    constraint.layout.bottomToTop = -1;
                    constraint.layout.topToTop = -1;
                    constraint.layout.topToBottom = -1;
                    return;
                }
                if (i4 == 4) {
                    constraint.layout.baselineToBottom = i3;
                    constraint.layout.bottomToBottom = -1;
                    constraint.layout.bottomToTop = -1;
                    constraint.layout.topToTop = -1;
                    constraint.layout.topToBottom = -1;
                    return;
                }
                java.lang.StringBuilder sb5 = new java.lang.StringBuilder("right to ");
                sb5.append(getHighResolutionOutputSizeshNQ4ISI(i4));
                sb5.append(" undefined");
                throw new java.lang.IllegalArgumentException(sb5.toString());
            case 6:
                if (i4 == 6) {
                    constraint.layout.startToStart = i3;
                    constraint.layout.startToEnd = -1;
                    return;
                } else if (i4 == 7) {
                    constraint.layout.startToEnd = i3;
                    constraint.layout.startToStart = -1;
                    return;
                } else {
                    java.lang.StringBuilder sb6 = new java.lang.StringBuilder("right to ");
                    sb6.append(getHighResolutionOutputSizeshNQ4ISI(i4));
                    sb6.append(" undefined");
                    throw new java.lang.IllegalArgumentException(sb6.toString());
                }
            case 7:
                if (i4 == 7) {
                    constraint.layout.endToEnd = i3;
                    constraint.layout.endToStart = -1;
                    return;
                } else if (i4 == 6) {
                    constraint.layout.endToStart = i3;
                    constraint.layout.endToEnd = -1;
                    return;
                } else {
                    java.lang.StringBuilder sb7 = new java.lang.StringBuilder("right to ");
                    sb7.append(getHighResolutionOutputSizeshNQ4ISI(i4));
                    sb7.append(" undefined");
                    throw new java.lang.IllegalArgumentException(sb7.toString());
                }
            default:
                java.lang.StringBuilder sb8 = new java.lang.StringBuilder();
                sb8.append(getHighResolutionOutputSizeshNQ4ISI(i2));
                sb8.append(" to ");
                sb8.append(getHighResolutionOutputSizeshNQ4ISI(i4));
                sb8.append(" unknown");
                throw new java.lang.IllegalArgumentException(sb8.toString());
        }
    }

    public void centerHorizontally(int i, int i2) {
        if (i2 == 0) {
            center(i, 0, 1, 0, 0, 2, 0, 0.5f);
        } else {
            center(i, i2, 2, 0, i2, 1, 0, 0.5f);
        }
    }

    public void centerHorizontallyRtl(int i, int i2) {
        if (i2 == 0) {
            center(i, 0, 6, 0, 0, 7, 0, 0.5f);
        } else {
            center(i, i2, 7, 0, i2, 6, 0, 0.5f);
        }
    }

    public void centerVertically(int i, int i2) {
        if (i2 == 0) {
            center(i, 0, 3, 0, 0, 4, 0, 0.5f);
        } else {
            center(i, i2, 4, 0, i2, 3, 0, 0.5f);
        }
    }

    public void clear(int i) {
        this.getHighSpeedVideoSizes.remove(java.lang.Integer.valueOf(i));
    }

    public void clear(int i, int i2) {
        androidx.constraintlayout.widget.ConstraintSet.Constraint constraint;
        if (!this.getHighSpeedVideoSizes.containsKey(java.lang.Integer.valueOf(i)) || (constraint = this.getHighSpeedVideoSizes.get(java.lang.Integer.valueOf(i))) == null) {
            return;
        }
        switch (i2) {
            case 1:
                constraint.layout.leftToRight = -1;
                constraint.layout.leftToLeft = -1;
                constraint.layout.leftMargin = -1;
                constraint.layout.goneLeftMargin = Integer.MIN_VALUE;
                return;
            case 2:
                constraint.layout.rightToRight = -1;
                constraint.layout.rightToLeft = -1;
                constraint.layout.rightMargin = -1;
                constraint.layout.goneRightMargin = Integer.MIN_VALUE;
                return;
            case 3:
                constraint.layout.topToBottom = -1;
                constraint.layout.topToTop = -1;
                constraint.layout.topMargin = 0;
                constraint.layout.goneTopMargin = Integer.MIN_VALUE;
                return;
            case 4:
                constraint.layout.bottomToTop = -1;
                constraint.layout.bottomToBottom = -1;
                constraint.layout.bottomMargin = 0;
                constraint.layout.goneBottomMargin = Integer.MIN_VALUE;
                return;
            case 5:
                constraint.layout.baselineToBaseline = -1;
                constraint.layout.baselineToTop = -1;
                constraint.layout.baselineToBottom = -1;
                constraint.layout.baselineMargin = 0;
                constraint.layout.goneBaselineMargin = Integer.MIN_VALUE;
                return;
            case 6:
                constraint.layout.startToEnd = -1;
                constraint.layout.startToStart = -1;
                constraint.layout.startMargin = 0;
                constraint.layout.goneStartMargin = Integer.MIN_VALUE;
                return;
            case 7:
                constraint.layout.endToStart = -1;
                constraint.layout.endToEnd = -1;
                constraint.layout.endMargin = 0;
                constraint.layout.goneEndMargin = Integer.MIN_VALUE;
                return;
            case 8:
                constraint.layout.circleAngle = -1.0f;
                constraint.layout.circleRadius = -1;
                constraint.layout.circleConstraint = -1;
                return;
            default:
                throw new java.lang.IllegalArgumentException("unknown constraint");
        }
    }

    public void setMargin(int i, int i2, int i3) {
        androidx.constraintlayout.widget.ConstraintSet.Constraint Camera2StreamConfigurationMap = Camera2StreamConfigurationMap(i);
        switch (i2) {
            case 1:
                Camera2StreamConfigurationMap.layout.leftMargin = i3;
                return;
            case 2:
                Camera2StreamConfigurationMap.layout.rightMargin = i3;
                return;
            case 3:
                Camera2StreamConfigurationMap.layout.topMargin = i3;
                return;
            case 4:
                Camera2StreamConfigurationMap.layout.bottomMargin = i3;
                return;
            case 5:
                Camera2StreamConfigurationMap.layout.baselineMargin = i3;
                return;
            case 6:
                Camera2StreamConfigurationMap.layout.startMargin = i3;
                return;
            case 7:
                Camera2StreamConfigurationMap.layout.endMargin = i3;
                return;
            default:
                throw new java.lang.IllegalArgumentException("unknown constraint");
        }
    }

    public void setGoneMargin(int i, int i2, int i3) {
        androidx.constraintlayout.widget.ConstraintSet.Constraint Camera2StreamConfigurationMap = Camera2StreamConfigurationMap(i);
        switch (i2) {
            case 1:
                Camera2StreamConfigurationMap.layout.goneLeftMargin = i3;
                return;
            case 2:
                Camera2StreamConfigurationMap.layout.goneRightMargin = i3;
                return;
            case 3:
                Camera2StreamConfigurationMap.layout.goneTopMargin = i3;
                return;
            case 4:
                Camera2StreamConfigurationMap.layout.goneBottomMargin = i3;
                return;
            case 5:
                Camera2StreamConfigurationMap.layout.goneBaselineMargin = i3;
                return;
            case 6:
                Camera2StreamConfigurationMap.layout.goneStartMargin = i3;
                return;
            case 7:
                Camera2StreamConfigurationMap.layout.goneEndMargin = i3;
                return;
            default:
                throw new java.lang.IllegalArgumentException("unknown constraint");
        }
    }

    public void setHorizontalBias(int i, float f) {
        Camera2StreamConfigurationMap(i).layout.horizontalBias = f;
    }

    public void setVerticalBias(int i, float f) {
        Camera2StreamConfigurationMap(i).layout.verticalBias = f;
    }

    public void setDimensionRatio(int i, java.lang.String str) {
        Camera2StreamConfigurationMap(i).layout.dimensionRatio = str;
    }

    public void setVisibility(int i, int i2) {
        Camera2StreamConfigurationMap(i).propertySet.visibility = i2;
    }

    public void setVisibilityMode(int i, int i2) {
        Camera2StreamConfigurationMap(i).propertySet.mVisibilityMode = i2;
    }

    public int getVisibilityMode(int i) {
        return Camera2StreamConfigurationMap(i).propertySet.mVisibilityMode;
    }

    public int getVisibility(int i) {
        return Camera2StreamConfigurationMap(i).propertySet.visibility;
    }

    public int getHeight(int i) {
        return Camera2StreamConfigurationMap(i).layout.mHeight;
    }

    public int getWidth(int i) {
        return Camera2StreamConfigurationMap(i).layout.mWidth;
    }

    public void setAlpha(int i, float f) {
        Camera2StreamConfigurationMap(i).propertySet.alpha = f;
    }

    public boolean getApplyElevation(int i) {
        return Camera2StreamConfigurationMap(i).transform.applyElevation;
    }

    public void setApplyElevation(int i, boolean z) {
        Camera2StreamConfigurationMap(i).transform.applyElevation = z;
    }

    public void setElevation(int i, float f) {
        Camera2StreamConfigurationMap(i).transform.elevation = f;
        Camera2StreamConfigurationMap(i).transform.applyElevation = true;
    }

    public void setRotation(int i, float f) {
        Camera2StreamConfigurationMap(i).transform.rotation = f;
    }

    public void setRotationX(int i, float f) {
        Camera2StreamConfigurationMap(i).transform.rotationX = f;
    }

    public void setRotationY(int i, float f) {
        Camera2StreamConfigurationMap(i).transform.rotationY = f;
    }

    public void setScaleX(int i, float f) {
        Camera2StreamConfigurationMap(i).transform.scaleX = f;
    }

    public void setScaleY(int i, float f) {
        Camera2StreamConfigurationMap(i).transform.scaleY = f;
    }

    public void setTransformPivotX(int i, float f) {
        Camera2StreamConfigurationMap(i).transform.transformPivotX = f;
    }

    public void setTransformPivotY(int i, float f) {
        Camera2StreamConfigurationMap(i).transform.transformPivotY = f;
    }

    public void setTransformPivot(int i, float f, float f2) {
        androidx.constraintlayout.widget.ConstraintSet.Constraint Camera2StreamConfigurationMap = Camera2StreamConfigurationMap(i);
        Camera2StreamConfigurationMap.transform.transformPivotY = f2;
        Camera2StreamConfigurationMap.transform.transformPivotX = f;
    }

    public void setTranslationX(int i, float f) {
        Camera2StreamConfigurationMap(i).transform.translationX = f;
    }

    public void setTranslationY(int i, float f) {
        Camera2StreamConfigurationMap(i).transform.translationY = f;
    }

    public void setTranslation(int i, float f, float f2) {
        androidx.constraintlayout.widget.ConstraintSet.Constraint Camera2StreamConfigurationMap = Camera2StreamConfigurationMap(i);
        Camera2StreamConfigurationMap.transform.translationX = f;
        Camera2StreamConfigurationMap.transform.translationY = f2;
    }

    public void setTranslationZ(int i, float f) {
        Camera2StreamConfigurationMap(i).transform.translationZ = f;
    }

    public void setEditorAbsoluteX(int i, int i2) {
        Camera2StreamConfigurationMap(i).layout.editorAbsoluteX = i2;
    }

    public void setEditorAbsoluteY(int i, int i2) {
        Camera2StreamConfigurationMap(i).layout.editorAbsoluteY = i2;
    }

    public void setLayoutWrapBehavior(int i, int i2) {
        if (i2 < 0 || i2 > 3) {
            return;
        }
        Camera2StreamConfigurationMap(i).layout.mWrapBehavior = i2;
    }

    public void constrainHeight(int i, int i2) {
        Camera2StreamConfigurationMap(i).layout.mHeight = i2;
    }

    public void constrainWidth(int i, int i2) {
        Camera2StreamConfigurationMap(i).layout.mWidth = i2;
    }

    public void constrainCircle(int i, int i2, int i3, float f) {
        androidx.constraintlayout.widget.ConstraintSet.Constraint Camera2StreamConfigurationMap = Camera2StreamConfigurationMap(i);
        Camera2StreamConfigurationMap.layout.circleConstraint = i2;
        Camera2StreamConfigurationMap.layout.circleRadius = i3;
        Camera2StreamConfigurationMap.layout.circleAngle = f;
    }

    public void constrainMaxHeight(int i, int i2) {
        Camera2StreamConfigurationMap(i).layout.heightMax = i2;
    }

    public void constrainMaxWidth(int i, int i2) {
        Camera2StreamConfigurationMap(i).layout.widthMax = i2;
    }

    public void constrainMinHeight(int i, int i2) {
        Camera2StreamConfigurationMap(i).layout.heightMin = i2;
    }

    public void constrainMinWidth(int i, int i2) {
        Camera2StreamConfigurationMap(i).layout.widthMin = i2;
    }

    public void constrainPercentWidth(int i, float f) {
        Camera2StreamConfigurationMap(i).layout.widthPercent = f;
    }

    public void constrainPercentHeight(int i, float f) {
        Camera2StreamConfigurationMap(i).layout.heightPercent = f;
    }

    public void constrainDefaultHeight(int i, int i2) {
        Camera2StreamConfigurationMap(i).layout.heightDefault = i2;
    }

    public void constrainedWidth(int i, boolean z) {
        Camera2StreamConfigurationMap(i).layout.constrainedWidth = z;
    }

    public void constrainedHeight(int i, boolean z) {
        Camera2StreamConfigurationMap(i).layout.constrainedHeight = z;
    }

    public void constrainDefaultWidth(int i, int i2) {
        Camera2StreamConfigurationMap(i).layout.widthDefault = i2;
    }

    public void setHorizontalWeight(int i, float f) {
        Camera2StreamConfigurationMap(i).layout.horizontalWeight = f;
    }

    public void setVerticalWeight(int i, float f) {
        Camera2StreamConfigurationMap(i).layout.verticalWeight = f;
    }

    public void setHorizontalChainStyle(int i, int i2) {
        Camera2StreamConfigurationMap(i).layout.horizontalChainStyle = i2;
    }

    public void setVerticalChainStyle(int i, int i2) {
        Camera2StreamConfigurationMap(i).layout.verticalChainStyle = i2;
    }

    public void addToHorizontalChain(int i, int i2, int i3) {
        connect(i, 1, i2, i2 == 0 ? 1 : 2, 0);
        connect(i, 2, i3, i3 == 0 ? 2 : 1, 0);
        if (i2 != 0) {
            connect(i2, 2, i, 1, 0);
        }
        if (i3 != 0) {
            connect(i3, 1, i, 2, 0);
        }
    }

    public void addToHorizontalChainRTL(int i, int i2, int i3) {
        connect(i, 6, i2, i2 == 0 ? 6 : 7, 0);
        connect(i, 7, i3, i3 == 0 ? 7 : 6, 0);
        if (i2 != 0) {
            connect(i2, 7, i, 6, 0);
        }
        if (i3 != 0) {
            connect(i3, 6, i, 7, 0);
        }
    }

    public void addToVerticalChain(int i, int i2, int i3) {
        connect(i, 3, i2, i2 == 0 ? 3 : 4, 0);
        connect(i, 4, i3, i3 == 0 ? 4 : 3, 0);
        if (i2 != 0) {
            connect(i2, 4, i, 3, 0);
        }
        if (i3 != 0) {
            connect(i3, 3, i, 4, 0);
        }
    }

    public void removeFromVerticalChain(int i) {
        if (this.getHighSpeedVideoSizes.containsKey(java.lang.Integer.valueOf(i))) {
            androidx.constraintlayout.widget.ConstraintSet.Constraint constraint = this.getHighSpeedVideoSizes.get(java.lang.Integer.valueOf(i));
            if (constraint == null) {
                return;
            }
            int i2 = constraint.layout.topToBottom;
            int i3 = constraint.layout.bottomToTop;
            if (i2 != -1 || i3 != -1) {
                if (i2 != -1 && i3 != -1) {
                    connect(i2, 4, i3, 3, 0);
                    connect(i3, 3, i2, 4, 0);
                } else if (constraint.layout.bottomToBottom != -1) {
                    connect(i2, 4, constraint.layout.bottomToBottom, 4, 0);
                } else if (constraint.layout.topToTop != -1) {
                    connect(i3, 3, constraint.layout.topToTop, 3, 0);
                }
            }
        }
        clear(i, 3);
        clear(i, 4);
    }

    public void removeFromHorizontalChain(int i) {
        androidx.constraintlayout.widget.ConstraintSet.Constraint constraint;
        if (!this.getHighSpeedVideoSizes.containsKey(java.lang.Integer.valueOf(i)) || (constraint = this.getHighSpeedVideoSizes.get(java.lang.Integer.valueOf(i))) == null) {
            return;
        }
        int i2 = constraint.layout.leftToRight;
        int i3 = constraint.layout.rightToLeft;
        if (i2 != -1 || i3 != -1) {
            if (i2 != -1 && i3 != -1) {
                connect(i2, 2, i3, 1, 0);
                connect(i3, 1, i2, 2, 0);
            } else if (constraint.layout.rightToRight != -1) {
                connect(i2, 2, constraint.layout.rightToRight, 2, 0);
            } else if (constraint.layout.leftToLeft != -1) {
                connect(i3, 1, constraint.layout.leftToLeft, 1, 0);
            }
            clear(i, 1);
            clear(i, 2);
            return;
        }
        int i4 = constraint.layout.startToEnd;
        int i5 = constraint.layout.endToStart;
        if (i4 != -1 || i5 != -1) {
            if (i4 != -1 && i5 != -1) {
                connect(i4, 7, i5, 6, 0);
                connect(i5, 6, i2, 7, 0);
            } else if (i5 != -1) {
                if (constraint.layout.rightToRight != -1) {
                    connect(i2, 7, constraint.layout.rightToRight, 7, 0);
                } else if (constraint.layout.leftToLeft != -1) {
                    connect(i5, 6, constraint.layout.leftToLeft, 6, 0);
                }
            }
        }
        clear(i, 6);
        clear(i, 7);
    }

    public void create(int i, int i2) {
        androidx.constraintlayout.widget.ConstraintSet.Constraint Camera2StreamConfigurationMap = Camera2StreamConfigurationMap(i);
        Camera2StreamConfigurationMap.layout.mIsGuideline = true;
        Camera2StreamConfigurationMap.layout.orientation = i2;
    }

    public void createBarrier(int i, int i2, int i3, int... iArr) {
        androidx.constraintlayout.widget.ConstraintSet.Constraint Camera2StreamConfigurationMap = Camera2StreamConfigurationMap(i);
        Camera2StreamConfigurationMap.layout.mHelperType = 1;
        Camera2StreamConfigurationMap.layout.mBarrierDirection = i2;
        Camera2StreamConfigurationMap.layout.mBarrierMargin = i3;
        Camera2StreamConfigurationMap.layout.mIsGuideline = false;
        Camera2StreamConfigurationMap.layout.mReferenceIds = iArr;
    }

    public void setGuidelineBegin(int i, int i2) {
        Camera2StreamConfigurationMap(i).layout.guideBegin = i2;
        Camera2StreamConfigurationMap(i).layout.guideEnd = -1;
        Camera2StreamConfigurationMap(i).layout.guidePercent = -1.0f;
    }

    public void setGuidelineEnd(int i, int i2) {
        Camera2StreamConfigurationMap(i).layout.guideEnd = i2;
        Camera2StreamConfigurationMap(i).layout.guideBegin = -1;
        Camera2StreamConfigurationMap(i).layout.guidePercent = -1.0f;
    }

    public void setGuidelinePercent(int i, float f) {
        Camera2StreamConfigurationMap(i).layout.guidePercent = f;
        Camera2StreamConfigurationMap(i).layout.guideEnd = -1;
        Camera2StreamConfigurationMap(i).layout.guideBegin = -1;
    }

    public int[] getReferencedIds(int i) {
        androidx.constraintlayout.widget.ConstraintSet.Constraint Camera2StreamConfigurationMap = Camera2StreamConfigurationMap(i);
        if (Camera2StreamConfigurationMap.layout.mReferenceIds == null) {
            return new int[0];
        }
        return java.util.Arrays.copyOf(Camera2StreamConfigurationMap.layout.mReferenceIds, Camera2StreamConfigurationMap.layout.mReferenceIds.length);
    }

    public void setReferencedIds(int i, int... iArr) {
        Camera2StreamConfigurationMap(i).layout.mReferenceIds = iArr;
    }

    public void setBarrierType(int i, int i2) {
        Camera2StreamConfigurationMap(i).layout.mHelperType = i2;
    }

    public void removeAttribute(java.lang.String str) {
        this.getOutputFormats.remove(str);
    }

    public void setIntValue(int i, java.lang.String str, int i2) {
        androidx.constraintlayout.widget.ConstraintSet.Constraint.getHighResolutionOutputSizeshNQ4ISI(Camera2StreamConfigurationMap(i), str, i2);
    }

    public void setColorValue(int i, java.lang.String str, int i2) {
        androidx.constraintlayout.widget.ConstraintSet.Constraint.getHighSpeedVideoFpsRanges(Camera2StreamConfigurationMap(i), str, i2);
    }

    public void setFloatValue(int i, java.lang.String str, float f) {
        androidx.constraintlayout.widget.ConstraintSet.Constraint.getHighResolutionOutputSizeshNQ4ISI(Camera2StreamConfigurationMap(i), str, f);
    }

    public void setStringValue(int i, java.lang.String str, java.lang.String str2) {
        androidx.constraintlayout.widget.ConstraintSet.Constraint.getHighResolutionOutputSizeshNQ4ISI(Camera2StreamConfigurationMap(i), str, str2);
    }

    private void getHighSpeedVideoFpsRanges(androidx.constraintlayout.widget.ConstraintAttribute.AttributeType attributeType, java.lang.String... strArr) {
        for (int i = 0; i < strArr.length; i++) {
            if (this.getOutputFormats.containsKey(strArr[i])) {
                androidx.constraintlayout.widget.ConstraintAttribute constraintAttribute = this.getOutputFormats.get(strArr[i]);
                if (constraintAttribute != null && constraintAttribute.getType() != attributeType) {
                    java.lang.StringBuilder sb = new java.lang.StringBuilder("ConstraintAttribute is already a ");
                    sb.append(constraintAttribute.getType().name());
                    throw new java.lang.IllegalArgumentException(sb.toString());
                }
            } else {
                this.getOutputFormats.put(strArr[i], new androidx.constraintlayout.widget.ConstraintAttribute(strArr[i], attributeType));
            }
        }
    }

    public void parseIntAttributes(androidx.constraintlayout.widget.ConstraintSet.Constraint constraint, java.lang.String str) {
        java.lang.String[] split = str.split(",");
        for (int i = 0; i < split.length; i++) {
            java.lang.String[] split2 = split[i].split("=");
            if (split2.length != 2) {
                java.lang.String str2 = split[i];
            } else {
                androidx.constraintlayout.widget.ConstraintSet.Constraint.getHighResolutionOutputSizeshNQ4ISI(constraint, split2[0], java.lang.Integer.decode(split2[1]).intValue());
            }
        }
    }

    public void parseColorAttributes(androidx.constraintlayout.widget.ConstraintSet.Constraint constraint, java.lang.String str) {
        java.lang.String[] split = str.split(",");
        for (int i = 0; i < split.length; i++) {
            java.lang.String[] split2 = split[i].split("=");
            if (split2.length != 2) {
                java.lang.String str2 = split[i];
            } else {
                androidx.constraintlayout.widget.ConstraintSet.Constraint.getHighSpeedVideoFpsRanges(constraint, split2[0], android.graphics.Color.parseColor(split2[1]));
            }
        }
    }

    public void parseFloatAttributes(androidx.constraintlayout.widget.ConstraintSet.Constraint constraint, java.lang.String str) {
        java.lang.String[] split = str.split(",");
        for (int i = 0; i < split.length; i++) {
            java.lang.String[] split2 = split[i].split("=");
            if (split2.length != 2) {
                java.lang.String str2 = split[i];
            } else {
                androidx.constraintlayout.widget.ConstraintSet.Constraint.getHighResolutionOutputSizeshNQ4ISI(constraint, split2[0], java.lang.Float.parseFloat(split2[1]));
            }
        }
    }

    public void addIntAttributes(java.lang.String... strArr) {
        getHighSpeedVideoFpsRanges(androidx.constraintlayout.widget.ConstraintAttribute.AttributeType.INT_TYPE, strArr);
    }

    public void addColorAttributes(java.lang.String... strArr) {
        getHighSpeedVideoFpsRanges(androidx.constraintlayout.widget.ConstraintAttribute.AttributeType.COLOR_TYPE, strArr);
    }

    public void addFloatAttributes(java.lang.String... strArr) {
        getHighSpeedVideoFpsRanges(androidx.constraintlayout.widget.ConstraintAttribute.AttributeType.FLOAT_TYPE, strArr);
    }

    public void addStringAttributes(java.lang.String... strArr) {
        getHighSpeedVideoFpsRanges(androidx.constraintlayout.widget.ConstraintAttribute.AttributeType.STRING_TYPE, strArr);
    }

    private androidx.constraintlayout.widget.ConstraintSet.Constraint Camera2StreamConfigurationMap(int i) {
        if (!this.getHighSpeedVideoSizes.containsKey(java.lang.Integer.valueOf(i))) {
            this.getHighSpeedVideoSizes.put(java.lang.Integer.valueOf(i), new androidx.constraintlayout.widget.ConstraintSet.Constraint());
        }
        return this.getHighSpeedVideoSizes.get(java.lang.Integer.valueOf(i));
    }

    private static java.lang.String getHighResolutionOutputSizeshNQ4ISI(int i) {
        switch (i) {
            case 1:
                return com.datadog.android.rum.internal.instrumentation.gestures.GesturesListener.SCROLL_DIRECTION_LEFT;
            case 2:
                return com.datadog.android.rum.internal.instrumentation.gestures.GesturesListener.SCROLL_DIRECTION_RIGHT;
            case 3:
                return com.dyneti.android.dyscan.DyScanHelperTextPosition.TOP;
            case 4:
                return com.dyneti.android.dyscan.DyScanHelperTextPosition.BOTTOM;
            case 5:
                return "baseline";
            case 6:
                return com.adobe.marketing.mobile.internal.CoreConstants.EventDataKeys.Lifecycle.LIFECYCLE_START;
            case 7:
                return "end";
            default:
                return "undefined";
        }
    }

    public void load(android.content.Context context, int i) {
        android.content.res.XmlResourceParser xml = context.getResources().getXml(i);
        try {
            for (int eventType = xml.getEventType(); eventType != 1; eventType = xml.next()) {
                if (eventType == 2) {
                    java.lang.String name2 = xml.getName();
                    androidx.constraintlayout.widget.ConstraintSet.Constraint highSpeedVideoFpsRangesFor = getHighSpeedVideoFpsRangesFor(context, android.util.Xml.asAttributeSet(xml), false);
                    if (name2.equalsIgnoreCase("Guideline")) {
                        highSpeedVideoFpsRangesFor.layout.mIsGuideline = true;
                    }
                    this.getHighSpeedVideoSizes.put(java.lang.Integer.valueOf(highSpeedVideoFpsRangesFor.getHighSpeedVideoSizes), highSpeedVideoFpsRangesFor);
                }
            }
        } catch (java.io.IOException | org.xmlpull.v1.XmlPullParserException unused) {
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x0048, code lost:
    
        if (r1.equals("guideline") != false) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x00a5, code lost:
    
        if (r5.equals(androidx.constraintlayout.motion.widget.ViewTransition.CUSTOM_METHOD) != false) goto L43;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void load(android.content.Context context, org.xmlpull.v1.XmlPullParser xmlPullParser) {
        try {
            int eventType = xmlPullParser.getEventType();
            androidx.constraintlayout.widget.ConstraintSet.Constraint constraint = null;
            while (eventType != 1) {
                if (eventType != 0) {
                    if (eventType != 2) {
                        if (eventType == 3) {
                            java.lang.String lowerCase = xmlPullParser.getName().toLowerCase(java.util.Locale.ROOT);
                            switch (lowerCase.hashCode()) {
                                case -2075718416:
                                    break;
                                case -190376483:
                                    if (lowerCase.equals("constraint")) {
                                        try {
                                            this.getHighSpeedVideoSizes.put(java.lang.Integer.valueOf(constraint.getHighSpeedVideoSizes), constraint);
                                            constraint = null;
                                            break;
                                        } catch (java.io.IOException | org.xmlpull.v1.XmlPullParserException unused) {
                                            return;
                                        }
                                    }
                                    break;
                                case 426575017:
                                    if (lowerCase.equals("constraintoverride")) {
                                        this.getHighSpeedVideoSizes.put(java.lang.Integer.valueOf(constraint.getHighSpeedVideoSizes), constraint);
                                        constraint = null;
                                        break;
                                    }
                                    break;
                                case 2146106725:
                                    if (lowerCase.equals("constraintset")) {
                                        return;
                                    }
                                    break;
                            }
                        }
                    } else {
                        java.lang.String name2 = xmlPullParser.getName();
                        int i = 0;
                        switch (name2.hashCode()) {
                            case -2025855158:
                                if (name2.equals("Layout")) {
                                    if (constraint == null) {
                                        java.lang.StringBuilder sb = new java.lang.StringBuilder();
                                        sb.append("XML parser error must be within a Constraint ");
                                        sb.append(xmlPullParser.getLineNumber());
                                        throw new java.lang.RuntimeException(sb.toString());
                                    }
                                    androidx.constraintlayout.widget.ConstraintSet.Layout layout = constraint.layout;
                                    android.content.res.TypedArray obtainStyledAttributes = context.obtainStyledAttributes(android.util.Xml.asAttributeSet(xmlPullParser), androidx.constraintlayout.widget.R.styleable.Layout);
                                    layout.mApply = true;
                                    int indexCount = obtainStyledAttributes.getIndexCount();
                                    for (int i2 = 0; i2 < indexCount; i2++) {
                                        int index = obtainStyledAttributes.getIndex(i2);
                                        int i3 = androidx.constraintlayout.widget.ConstraintSet.Layout.getHighSpeedVideoSizes.get(index);
                                        switch (i3) {
                                            case 1:
                                                layout.baselineToBaseline = getHighSpeedVideoFpsRangesFor(obtainStyledAttributes, index, layout.baselineToBaseline);
                                                break;
                                            case 2:
                                                layout.bottomMargin = obtainStyledAttributes.getDimensionPixelSize(index, layout.bottomMargin);
                                                break;
                                            case 3:
                                                layout.bottomToBottom = getHighSpeedVideoFpsRangesFor(obtainStyledAttributes, index, layout.bottomToBottom);
                                                break;
                                            case 4:
                                                layout.bottomToTop = getHighSpeedVideoFpsRangesFor(obtainStyledAttributes, index, layout.bottomToTop);
                                                break;
                                            case 5:
                                                layout.dimensionRatio = obtainStyledAttributes.getString(index);
                                                break;
                                            case 6:
                                                layout.editorAbsoluteX = obtainStyledAttributes.getDimensionPixelOffset(index, layout.editorAbsoluteX);
                                                break;
                                            case 7:
                                                layout.editorAbsoluteY = obtainStyledAttributes.getDimensionPixelOffset(index, layout.editorAbsoluteY);
                                                break;
                                            case 8:
                                                layout.endMargin = obtainStyledAttributes.getDimensionPixelSize(index, layout.endMargin);
                                                break;
                                            case 9:
                                                layout.endToEnd = getHighSpeedVideoFpsRangesFor(obtainStyledAttributes, index, layout.endToEnd);
                                                break;
                                            case 10:
                                                layout.endToStart = getHighSpeedVideoFpsRangesFor(obtainStyledAttributes, index, layout.endToStart);
                                                break;
                                            case 11:
                                                layout.goneBottomMargin = obtainStyledAttributes.getDimensionPixelSize(index, layout.goneBottomMargin);
                                                break;
                                            case 12:
                                                layout.goneEndMargin = obtainStyledAttributes.getDimensionPixelSize(index, layout.goneEndMargin);
                                                break;
                                            case 13:
                                                layout.goneLeftMargin = obtainStyledAttributes.getDimensionPixelSize(index, layout.goneLeftMargin);
                                                break;
                                            case 14:
                                                layout.goneRightMargin = obtainStyledAttributes.getDimensionPixelSize(index, layout.goneRightMargin);
                                                break;
                                            case 15:
                                                layout.goneStartMargin = obtainStyledAttributes.getDimensionPixelSize(index, layout.goneStartMargin);
                                                break;
                                            case 16:
                                                layout.goneTopMargin = obtainStyledAttributes.getDimensionPixelSize(index, layout.goneTopMargin);
                                                break;
                                            case 17:
                                                layout.guideBegin = obtainStyledAttributes.getDimensionPixelOffset(index, layout.guideBegin);
                                                break;
                                            case 18:
                                                layout.guideEnd = obtainStyledAttributes.getDimensionPixelOffset(index, layout.guideEnd);
                                                break;
                                            case 19:
                                                layout.guidePercent = obtainStyledAttributes.getFloat(index, layout.guidePercent);
                                                break;
                                            case 20:
                                                layout.horizontalBias = obtainStyledAttributes.getFloat(index, layout.horizontalBias);
                                                break;
                                            case 21:
                                                layout.mHeight = obtainStyledAttributes.getLayoutDimension(index, layout.mHeight);
                                                break;
                                            case 22:
                                                layout.mWidth = obtainStyledAttributes.getLayoutDimension(index, layout.mWidth);
                                                break;
                                            case 23:
                                                layout.leftMargin = obtainStyledAttributes.getDimensionPixelSize(index, layout.leftMargin);
                                                break;
                                            case 24:
                                                layout.leftToLeft = getHighSpeedVideoFpsRangesFor(obtainStyledAttributes, index, layout.leftToLeft);
                                                break;
                                            case 25:
                                                layout.leftToRight = getHighSpeedVideoFpsRangesFor(obtainStyledAttributes, index, layout.leftToRight);
                                                break;
                                            case 26:
                                                layout.orientation = obtainStyledAttributes.getInt(index, layout.orientation);
                                                break;
                                            case 27:
                                                layout.rightMargin = obtainStyledAttributes.getDimensionPixelSize(index, layout.rightMargin);
                                                break;
                                            case 28:
                                                layout.rightToLeft = getHighSpeedVideoFpsRangesFor(obtainStyledAttributes, index, layout.rightToLeft);
                                                break;
                                            case 29:
                                                layout.rightToRight = getHighSpeedVideoFpsRangesFor(obtainStyledAttributes, index, layout.rightToRight);
                                                break;
                                            case 30:
                                                layout.startMargin = obtainStyledAttributes.getDimensionPixelSize(index, layout.startMargin);
                                                break;
                                            case 31:
                                                layout.startToEnd = getHighSpeedVideoFpsRangesFor(obtainStyledAttributes, index, layout.startToEnd);
                                                break;
                                            case 32:
                                                layout.startToStart = getHighSpeedVideoFpsRangesFor(obtainStyledAttributes, index, layout.startToStart);
                                                break;
                                            case 33:
                                                layout.topMargin = obtainStyledAttributes.getDimensionPixelSize(index, layout.topMargin);
                                                break;
                                            case 34:
                                                layout.topToBottom = getHighSpeedVideoFpsRangesFor(obtainStyledAttributes, index, layout.topToBottom);
                                                break;
                                            case 35:
                                                layout.topToTop = getHighSpeedVideoFpsRangesFor(obtainStyledAttributes, index, layout.topToTop);
                                                break;
                                            case 36:
                                                layout.verticalBias = obtainStyledAttributes.getFloat(index, layout.verticalBias);
                                                break;
                                            case 37:
                                                layout.horizontalWeight = obtainStyledAttributes.getFloat(index, layout.horizontalWeight);
                                                break;
                                            case 38:
                                                layout.verticalWeight = obtainStyledAttributes.getFloat(index, layout.verticalWeight);
                                                break;
                                            case 39:
                                                layout.horizontalChainStyle = obtainStyledAttributes.getInt(index, layout.horizontalChainStyle);
                                                break;
                                            case 40:
                                                layout.verticalChainStyle = obtainStyledAttributes.getInt(index, layout.verticalChainStyle);
                                                break;
                                            case 41:
                                                getHighResolutionOutputSizeshNQ4ISI(layout, obtainStyledAttributes, index, 0);
                                                break;
                                            case 42:
                                                getHighResolutionOutputSizeshNQ4ISI(layout, obtainStyledAttributes, index, 1);
                                                break;
                                            default:
                                                switch (i3) {
                                                    case 61:
                                                        layout.circleConstraint = getHighSpeedVideoFpsRangesFor(obtainStyledAttributes, index, layout.circleConstraint);
                                                        break;
                                                    case 62:
                                                        layout.circleRadius = obtainStyledAttributes.getDimensionPixelSize(index, layout.circleRadius);
                                                        break;
                                                    case 63:
                                                        layout.circleAngle = obtainStyledAttributes.getFloat(index, layout.circleAngle);
                                                        break;
                                                    default:
                                                        switch (i3) {
                                                            case 69:
                                                                layout.widthPercent = obtainStyledAttributes.getFloat(index, 1.0f);
                                                                break;
                                                            case 70:
                                                                layout.heightPercent = obtainStyledAttributes.getFloat(index, 1.0f);
                                                                break;
                                                            case 71:
                                                                break;
                                                            case 72:
                                                                layout.mBarrierDirection = obtainStyledAttributes.getInt(index, layout.mBarrierDirection);
                                                                break;
                                                            case 73:
                                                                layout.mBarrierMargin = obtainStyledAttributes.getDimensionPixelSize(index, layout.mBarrierMargin);
                                                                break;
                                                            case 74:
                                                                layout.mReferenceIdString = obtainStyledAttributes.getString(index);
                                                                break;
                                                            case 75:
                                                                layout.mBarrierAllowsGoneWidgets = obtainStyledAttributes.getBoolean(index, layout.mBarrierAllowsGoneWidgets);
                                                                break;
                                                            case 76:
                                                                layout.mWrapBehavior = obtainStyledAttributes.getInt(index, layout.mWrapBehavior);
                                                                break;
                                                            case 77:
                                                                layout.baselineToTop = getHighSpeedVideoFpsRangesFor(obtainStyledAttributes, index, layout.baselineToTop);
                                                                break;
                                                            case 78:
                                                                layout.baselineToBottom = getHighSpeedVideoFpsRangesFor(obtainStyledAttributes, index, layout.baselineToBottom);
                                                                break;
                                                            case 79:
                                                                layout.goneBaselineMargin = obtainStyledAttributes.getDimensionPixelSize(index, layout.goneBaselineMargin);
                                                                break;
                                                            case 80:
                                                                layout.baselineMargin = obtainStyledAttributes.getDimensionPixelSize(index, layout.baselineMargin);
                                                                break;
                                                            case 81:
                                                                layout.widthDefault = obtainStyledAttributes.getInt(index, layout.widthDefault);
                                                                break;
                                                            case 82:
                                                                layout.heightDefault = obtainStyledAttributes.getInt(index, layout.heightDefault);
                                                                break;
                                                            case 83:
                                                                layout.heightMax = obtainStyledAttributes.getDimensionPixelSize(index, layout.heightMax);
                                                                break;
                                                            case 84:
                                                                layout.widthMax = obtainStyledAttributes.getDimensionPixelSize(index, layout.widthMax);
                                                                break;
                                                            case 85:
                                                                layout.heightMin = obtainStyledAttributes.getDimensionPixelSize(index, layout.heightMin);
                                                                break;
                                                            case 86:
                                                                layout.widthMin = obtainStyledAttributes.getDimensionPixelSize(index, layout.widthMin);
                                                                break;
                                                            case 87:
                                                                layout.constrainedWidth = obtainStyledAttributes.getBoolean(index, layout.constrainedWidth);
                                                                break;
                                                            case 88:
                                                                layout.constrainedHeight = obtainStyledAttributes.getBoolean(index, layout.constrainedHeight);
                                                                break;
                                                            case 89:
                                                                layout.mConstraintTag = obtainStyledAttributes.getString(index);
                                                                break;
                                                            case 90:
                                                                layout.guidelineUseRtl = obtainStyledAttributes.getBoolean(index, layout.guidelineUseRtl);
                                                                break;
                                                            case 91:
                                                                androidx.constraintlayout.widget.ConstraintSet.Layout.getHighSpeedVideoSizes.get(index);
                                                                break;
                                                            default:
                                                                androidx.constraintlayout.widget.ConstraintSet.Layout.getHighSpeedVideoSizes.get(index);
                                                                break;
                                                        }
                                                }
                                        }
                                    }
                                    obtainStyledAttributes.recycle();
                                    break;
                                }
                                break;
                            case -1984451626:
                                if (name2.equals(androidx.constraintlayout.core.motion.utils.TypedValues.MotionType.NAME)) {
                                    if (constraint == null) {
                                        java.lang.StringBuilder sb2 = new java.lang.StringBuilder();
                                        sb2.append("XML parser error must be within a Constraint ");
                                        sb2.append(xmlPullParser.getLineNumber());
                                        throw new java.lang.RuntimeException(sb2.toString());
                                    }
                                    androidx.constraintlayout.widget.ConstraintSet.Motion motion = constraint.motion;
                                    android.content.res.TypedArray obtainStyledAttributes2 = context.obtainStyledAttributes(android.util.Xml.asAttributeSet(xmlPullParser), androidx.constraintlayout.widget.R.styleable.Motion);
                                    motion.mApply = true;
                                    int indexCount2 = obtainStyledAttributes2.getIndexCount();
                                    for (int i4 = 0; i4 < indexCount2; i4++) {
                                        int index2 = obtainStyledAttributes2.getIndex(i4);
                                        switch (androidx.constraintlayout.widget.ConstraintSet.Motion.getHighSpeedVideoSizes.get(index2)) {
                                            case 1:
                                                motion.mPathRotate = obtainStyledAttributes2.getFloat(index2, motion.mPathRotate);
                                                break;
                                            case 2:
                                                motion.mPathMotionArc = obtainStyledAttributes2.getInt(index2, motion.mPathMotionArc);
                                                break;
                                            case 3:
                                                if (obtainStyledAttributes2.peekValue(index2).type == 3) {
                                                    motion.mTransitionEasing = obtainStyledAttributes2.getString(index2);
                                                    break;
                                                } else {
                                                    motion.mTransitionEasing = androidx.constraintlayout.core.motion.utils.Easing.NAMED_EASING[obtainStyledAttributes2.getInteger(index2, 0)];
                                                    break;
                                                }
                                            case 4:
                                                motion.mDrawPath = obtainStyledAttributes2.getInt(index2, 0);
                                                break;
                                            case 5:
                                                motion.mAnimateRelativeTo = getHighSpeedVideoFpsRangesFor(obtainStyledAttributes2, index2, motion.mAnimateRelativeTo);
                                                break;
                                            case 6:
                                                motion.mAnimateCircleAngleTo = obtainStyledAttributes2.getInteger(index2, motion.mAnimateCircleAngleTo);
                                                break;
                                            case 7:
                                                motion.mMotionStagger = obtainStyledAttributes2.getFloat(index2, motion.mMotionStagger);
                                                break;
                                            case 8:
                                                motion.mQuantizeMotionSteps = obtainStyledAttributes2.getInteger(index2, motion.mQuantizeMotionSteps);
                                                break;
                                            case 9:
                                                motion.mQuantizeMotionPhase = obtainStyledAttributes2.getFloat(index2, motion.mQuantizeMotionPhase);
                                                break;
                                            case 10:
                                                android.util.TypedValue peekValue = obtainStyledAttributes2.peekValue(index2);
                                                if (peekValue.type == 1) {
                                                    int resourceId = obtainStyledAttributes2.getResourceId(index2, -1);
                                                    motion.mQuantizeInterpolatorID = resourceId;
                                                    if (resourceId != -1) {
                                                        motion.mQuantizeInterpolatorType = -2;
                                                        break;
                                                    } else {
                                                        break;
                                                    }
                                                } else if (peekValue.type == 3) {
                                                    java.lang.String string = obtainStyledAttributes2.getString(index2);
                                                    motion.mQuantizeInterpolatorString = string;
                                                    if (string.indexOf(androidx.view.exceptions.publickeycredential.DomExceptionUtils.SEPARATOR) > 0) {
                                                        motion.mQuantizeInterpolatorID = obtainStyledAttributes2.getResourceId(index2, -1);
                                                        motion.mQuantizeInterpolatorType = -2;
                                                        break;
                                                    } else {
                                                        motion.mQuantizeInterpolatorType = -1;
                                                        break;
                                                    }
                                                } else {
                                                    motion.mQuantizeInterpolatorType = obtainStyledAttributes2.getInteger(index2, motion.mQuantizeInterpolatorID);
                                                    break;
                                                }
                                        }
                                    }
                                    obtainStyledAttributes2.recycle();
                                    break;
                                }
                                break;
                            case -1962203927:
                                if (name2.equals(androidx.constraintlayout.motion.widget.ViewTransition.CONSTRAINT_OVERRIDE)) {
                                    constraint = getHighSpeedVideoFpsRangesFor(context, android.util.Xml.asAttributeSet(xmlPullParser), true);
                                    break;
                                }
                                break;
                            case -1269513683:
                                if (name2.equals("PropertySet")) {
                                    if (constraint == null) {
                                        java.lang.StringBuilder sb3 = new java.lang.StringBuilder();
                                        sb3.append("XML parser error must be within a Constraint ");
                                        sb3.append(xmlPullParser.getLineNumber());
                                        throw new java.lang.RuntimeException(sb3.toString());
                                    }
                                    androidx.constraintlayout.widget.ConstraintSet.PropertySet propertySet = constraint.propertySet;
                                    android.content.res.TypedArray obtainStyledAttributes3 = context.obtainStyledAttributes(android.util.Xml.asAttributeSet(xmlPullParser), androidx.constraintlayout.widget.R.styleable.PropertySet);
                                    propertySet.mApply = true;
                                    int indexCount3 = obtainStyledAttributes3.getIndexCount();
                                    while (i < indexCount3) {
                                        int index3 = obtainStyledAttributes3.getIndex(i);
                                        if (index3 == androidx.constraintlayout.widget.R.styleable.PropertySet_android_alpha) {
                                            propertySet.alpha = obtainStyledAttributes3.getFloat(index3, propertySet.alpha);
                                        } else if (index3 == androidx.constraintlayout.widget.R.styleable.PropertySet_android_visibility) {
                                            propertySet.visibility = obtainStyledAttributes3.getInt(index3, propertySet.visibility);
                                            propertySet.visibility = getHighSpeedVideoFpsRanges[propertySet.visibility];
                                        } else if (index3 == androidx.constraintlayout.widget.R.styleable.PropertySet_visibilityMode) {
                                            propertySet.mVisibilityMode = obtainStyledAttributes3.getInt(index3, propertySet.mVisibilityMode);
                                        } else if (index3 == androidx.constraintlayout.widget.R.styleable.PropertySet_motionProgress) {
                                            propertySet.mProgress = obtainStyledAttributes3.getFloat(index3, propertySet.mProgress);
                                        }
                                        i++;
                                    }
                                    obtainStyledAttributes3.recycle();
                                    break;
                                }
                                break;
                            case -1238332596:
                                if (name2.equals("Transform")) {
                                    if (constraint == null) {
                                        java.lang.StringBuilder sb4 = new java.lang.StringBuilder();
                                        sb4.append("XML parser error must be within a Constraint ");
                                        sb4.append(xmlPullParser.getLineNumber());
                                        throw new java.lang.RuntimeException(sb4.toString());
                                    }
                                    androidx.constraintlayout.widget.ConstraintSet.Transform transform = constraint.transform;
                                    android.content.res.TypedArray obtainStyledAttributes4 = context.obtainStyledAttributes(android.util.Xml.asAttributeSet(xmlPullParser), androidx.constraintlayout.widget.R.styleable.Transform);
                                    transform.mApply = true;
                                    int indexCount4 = obtainStyledAttributes4.getIndexCount();
                                    while (i < indexCount4) {
                                        int index4 = obtainStyledAttributes4.getIndex(i);
                                        switch (androidx.constraintlayout.widget.ConstraintSet.Transform.getHighSpeedVideoFpsRangesFor.get(index4)) {
                                            case 1:
                                                transform.rotation = obtainStyledAttributes4.getFloat(index4, transform.rotation);
                                                break;
                                            case 2:
                                                transform.rotationX = obtainStyledAttributes4.getFloat(index4, transform.rotationX);
                                                break;
                                            case 3:
                                                transform.rotationY = obtainStyledAttributes4.getFloat(index4, transform.rotationY);
                                                break;
                                            case 4:
                                                transform.scaleX = obtainStyledAttributes4.getFloat(index4, transform.scaleX);
                                                break;
                                            case 5:
                                                transform.scaleY = obtainStyledAttributes4.getFloat(index4, transform.scaleY);
                                                break;
                                            case 6:
                                                transform.transformPivotX = obtainStyledAttributes4.getDimension(index4, transform.transformPivotX);
                                                break;
                                            case 7:
                                                transform.transformPivotY = obtainStyledAttributes4.getDimension(index4, transform.transformPivotY);
                                                break;
                                            case 8:
                                                transform.translationX = obtainStyledAttributes4.getDimension(index4, transform.translationX);
                                                break;
                                            case 9:
                                                transform.translationY = obtainStyledAttributes4.getDimension(index4, transform.translationY);
                                                break;
                                            case 10:
                                                transform.translationZ = obtainStyledAttributes4.getDimension(index4, transform.translationZ);
                                                break;
                                            case 11:
                                                transform.applyElevation = true;
                                                transform.elevation = obtainStyledAttributes4.getDimension(index4, transform.elevation);
                                                break;
                                            case 12:
                                                transform.transformPivotTarget = getHighSpeedVideoFpsRangesFor(obtainStyledAttributes4, index4, transform.transformPivotTarget);
                                                break;
                                        }
                                        i++;
                                    }
                                    obtainStyledAttributes4.recycle();
                                    break;
                                }
                                break;
                            case -71750448:
                                if (name2.equals("Guideline")) {
                                    constraint = getHighSpeedVideoFpsRangesFor(context, android.util.Xml.asAttributeSet(xmlPullParser), false);
                                    constraint.layout.mIsGuideline = true;
                                    constraint.layout.mApply = true;
                                    break;
                                }
                                break;
                            case 366511058:
                                break;
                            case 1331510167:
                                if (name2.equals("Barrier")) {
                                    constraint = getHighSpeedVideoFpsRangesFor(context, android.util.Xml.asAttributeSet(xmlPullParser), false);
                                    constraint.layout.mHelperType = 1;
                                }
                                break;
                            case 1791837707:
                                if (name2.equals(androidx.constraintlayout.motion.widget.ViewTransition.CUSTOM_ATTRIBUTE)) {
                                    if (constraint == null) {
                                        java.lang.StringBuilder sb5 = new java.lang.StringBuilder();
                                        sb5.append("XML parser error must be within a Constraint ");
                                        sb5.append(xmlPullParser.getLineNumber());
                                        throw new java.lang.RuntimeException(sb5.toString());
                                    }
                                    androidx.constraintlayout.widget.ConstraintAttribute.parse(context, xmlPullParser, constraint.mCustomConstraints);
                                    break;
                                }
                                break;
                            case 1803088381:
                                if (name2.equals("Constraint")) {
                                    constraint = getHighSpeedVideoFpsRangesFor(context, android.util.Xml.asAttributeSet(xmlPullParser), false);
                                }
                                break;
                        }
                    }
                } else {
                    xmlPullParser.getName();
                }
                eventType = xmlPullParser.next();
            }
        } catch (java.io.IOException unused2) {
        } catch (org.xmlpull.v1.XmlPullParserException unused3) {
        }
    }

    private static androidx.constraintlayout.widget.ConstraintSet.Constraint getHighSpeedVideoFpsRangesFor(android.content.Context context, android.util.AttributeSet attributeSet, boolean z) {
        androidx.constraintlayout.widget.ConstraintSet.Constraint constraint = new androidx.constraintlayout.widget.ConstraintSet.Constraint();
        android.content.res.TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, z ? androidx.constraintlayout.widget.R.styleable.ConstraintOverride : androidx.constraintlayout.widget.R.styleable.Constraint);
        if (z) {
            getHighSpeedVideoSizes(constraint, obtainStyledAttributes);
        } else {
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i = 0; i < indexCount; i++) {
                int index = obtainStyledAttributes.getIndex(i);
                if (index != androidx.constraintlayout.widget.R.styleable.Constraint_android_id && androidx.constraintlayout.widget.R.styleable.Constraint_android_layout_marginStart != index && androidx.constraintlayout.widget.R.styleable.Constraint_android_layout_marginEnd != index) {
                    constraint.motion.mApply = true;
                    constraint.layout.mApply = true;
                    constraint.propertySet.mApply = true;
                    constraint.transform.mApply = true;
                }
                switch (getHighSpeedVideoFpsRangesFor.get(index)) {
                    case 1:
                        androidx.constraintlayout.widget.ConstraintSet.Layout layout = constraint.layout;
                        int resourceId = obtainStyledAttributes.getResourceId(index, constraint.layout.baselineToBaseline);
                        if (resourceId == -1) {
                            resourceId = obtainStyledAttributes.getInt(index, -1);
                        }
                        layout.baselineToBaseline = resourceId;
                        break;
                    case 2:
                        constraint.layout.bottomMargin = obtainStyledAttributes.getDimensionPixelSize(index, constraint.layout.bottomMargin);
                        break;
                    case 3:
                        androidx.constraintlayout.widget.ConstraintSet.Layout layout2 = constraint.layout;
                        int resourceId2 = obtainStyledAttributes.getResourceId(index, constraint.layout.bottomToBottom);
                        if (resourceId2 == -1) {
                            resourceId2 = obtainStyledAttributes.getInt(index, -1);
                        }
                        layout2.bottomToBottom = resourceId2;
                        break;
                    case 4:
                        androidx.constraintlayout.widget.ConstraintSet.Layout layout3 = constraint.layout;
                        int resourceId3 = obtainStyledAttributes.getResourceId(index, constraint.layout.bottomToTop);
                        if (resourceId3 == -1) {
                            resourceId3 = obtainStyledAttributes.getInt(index, -1);
                        }
                        layout3.bottomToTop = resourceId3;
                        break;
                    case 5:
                        constraint.layout.dimensionRatio = obtainStyledAttributes.getString(index);
                        break;
                    case 6:
                        constraint.layout.editorAbsoluteX = obtainStyledAttributes.getDimensionPixelOffset(index, constraint.layout.editorAbsoluteX);
                        break;
                    case 7:
                        constraint.layout.editorAbsoluteY = obtainStyledAttributes.getDimensionPixelOffset(index, constraint.layout.editorAbsoluteY);
                        break;
                    case 8:
                        constraint.layout.endMargin = obtainStyledAttributes.getDimensionPixelSize(index, constraint.layout.endMargin);
                        break;
                    case 9:
                        androidx.constraintlayout.widget.ConstraintSet.Layout layout4 = constraint.layout;
                        int resourceId4 = obtainStyledAttributes.getResourceId(index, constraint.layout.endToEnd);
                        if (resourceId4 == -1) {
                            resourceId4 = obtainStyledAttributes.getInt(index, -1);
                        }
                        layout4.endToEnd = resourceId4;
                        break;
                    case 10:
                        androidx.constraintlayout.widget.ConstraintSet.Layout layout5 = constraint.layout;
                        int resourceId5 = obtainStyledAttributes.getResourceId(index, constraint.layout.endToStart);
                        if (resourceId5 == -1) {
                            resourceId5 = obtainStyledAttributes.getInt(index, -1);
                        }
                        layout5.endToStart = resourceId5;
                        break;
                    case 11:
                        constraint.layout.goneBottomMargin = obtainStyledAttributes.getDimensionPixelSize(index, constraint.layout.goneBottomMargin);
                        break;
                    case 12:
                        constraint.layout.goneEndMargin = obtainStyledAttributes.getDimensionPixelSize(index, constraint.layout.goneEndMargin);
                        break;
                    case 13:
                        constraint.layout.goneLeftMargin = obtainStyledAttributes.getDimensionPixelSize(index, constraint.layout.goneLeftMargin);
                        break;
                    case 14:
                        constraint.layout.goneRightMargin = obtainStyledAttributes.getDimensionPixelSize(index, constraint.layout.goneRightMargin);
                        break;
                    case 15:
                        constraint.layout.goneStartMargin = obtainStyledAttributes.getDimensionPixelSize(index, constraint.layout.goneStartMargin);
                        break;
                    case 16:
                        constraint.layout.goneTopMargin = obtainStyledAttributes.getDimensionPixelSize(index, constraint.layout.goneTopMargin);
                        break;
                    case 17:
                        constraint.layout.guideBegin = obtainStyledAttributes.getDimensionPixelOffset(index, constraint.layout.guideBegin);
                        break;
                    case 18:
                        constraint.layout.guideEnd = obtainStyledAttributes.getDimensionPixelOffset(index, constraint.layout.guideEnd);
                        break;
                    case 19:
                        constraint.layout.guidePercent = obtainStyledAttributes.getFloat(index, constraint.layout.guidePercent);
                        break;
                    case 20:
                        constraint.layout.horizontalBias = obtainStyledAttributes.getFloat(index, constraint.layout.horizontalBias);
                        break;
                    case 21:
                        constraint.layout.mHeight = obtainStyledAttributes.getLayoutDimension(index, constraint.layout.mHeight);
                        break;
                    case 22:
                        constraint.propertySet.visibility = obtainStyledAttributes.getInt(index, constraint.propertySet.visibility);
                        constraint.propertySet.visibility = getHighSpeedVideoFpsRanges[constraint.propertySet.visibility];
                        break;
                    case 23:
                        constraint.layout.mWidth = obtainStyledAttributes.getLayoutDimension(index, constraint.layout.mWidth);
                        break;
                    case 24:
                        constraint.layout.leftMargin = obtainStyledAttributes.getDimensionPixelSize(index, constraint.layout.leftMargin);
                        break;
                    case 25:
                        androidx.constraintlayout.widget.ConstraintSet.Layout layout6 = constraint.layout;
                        int resourceId6 = obtainStyledAttributes.getResourceId(index, constraint.layout.leftToLeft);
                        if (resourceId6 == -1) {
                            resourceId6 = obtainStyledAttributes.getInt(index, -1);
                        }
                        layout6.leftToLeft = resourceId6;
                        break;
                    case 26:
                        androidx.constraintlayout.widget.ConstraintSet.Layout layout7 = constraint.layout;
                        int resourceId7 = obtainStyledAttributes.getResourceId(index, constraint.layout.leftToRight);
                        if (resourceId7 == -1) {
                            resourceId7 = obtainStyledAttributes.getInt(index, -1);
                        }
                        layout7.leftToRight = resourceId7;
                        break;
                    case 27:
                        constraint.layout.orientation = obtainStyledAttributes.getInt(index, constraint.layout.orientation);
                        break;
                    case 28:
                        constraint.layout.rightMargin = obtainStyledAttributes.getDimensionPixelSize(index, constraint.layout.rightMargin);
                        break;
                    case 29:
                        androidx.constraintlayout.widget.ConstraintSet.Layout layout8 = constraint.layout;
                        int resourceId8 = obtainStyledAttributes.getResourceId(index, constraint.layout.rightToLeft);
                        if (resourceId8 == -1) {
                            resourceId8 = obtainStyledAttributes.getInt(index, -1);
                        }
                        layout8.rightToLeft = resourceId8;
                        break;
                    case 30:
                        androidx.constraintlayout.widget.ConstraintSet.Layout layout9 = constraint.layout;
                        int resourceId9 = obtainStyledAttributes.getResourceId(index, constraint.layout.rightToRight);
                        if (resourceId9 == -1) {
                            resourceId9 = obtainStyledAttributes.getInt(index, -1);
                        }
                        layout9.rightToRight = resourceId9;
                        break;
                    case 31:
                        constraint.layout.startMargin = obtainStyledAttributes.getDimensionPixelSize(index, constraint.layout.startMargin);
                        break;
                    case 32:
                        androidx.constraintlayout.widget.ConstraintSet.Layout layout10 = constraint.layout;
                        int resourceId10 = obtainStyledAttributes.getResourceId(index, constraint.layout.startToEnd);
                        if (resourceId10 == -1) {
                            resourceId10 = obtainStyledAttributes.getInt(index, -1);
                        }
                        layout10.startToEnd = resourceId10;
                        break;
                    case 33:
                        androidx.constraintlayout.widget.ConstraintSet.Layout layout11 = constraint.layout;
                        int resourceId11 = obtainStyledAttributes.getResourceId(index, constraint.layout.startToStart);
                        if (resourceId11 == -1) {
                            resourceId11 = obtainStyledAttributes.getInt(index, -1);
                        }
                        layout11.startToStart = resourceId11;
                        break;
                    case 34:
                        constraint.layout.topMargin = obtainStyledAttributes.getDimensionPixelSize(index, constraint.layout.topMargin);
                        break;
                    case 35:
                        androidx.constraintlayout.widget.ConstraintSet.Layout layout12 = constraint.layout;
                        int resourceId12 = obtainStyledAttributes.getResourceId(index, constraint.layout.topToBottom);
                        if (resourceId12 == -1) {
                            resourceId12 = obtainStyledAttributes.getInt(index, -1);
                        }
                        layout12.topToBottom = resourceId12;
                        break;
                    case 36:
                        androidx.constraintlayout.widget.ConstraintSet.Layout layout13 = constraint.layout;
                        int resourceId13 = obtainStyledAttributes.getResourceId(index, constraint.layout.topToTop);
                        if (resourceId13 == -1) {
                            resourceId13 = obtainStyledAttributes.getInt(index, -1);
                        }
                        layout13.topToTop = resourceId13;
                        break;
                    case 37:
                        constraint.layout.verticalBias = obtainStyledAttributes.getFloat(index, constraint.layout.verticalBias);
                        break;
                    case 38:
                        constraint.getHighSpeedVideoSizes = obtainStyledAttributes.getResourceId(index, constraint.getHighSpeedVideoSizes);
                        break;
                    case 39:
                        constraint.layout.horizontalWeight = obtainStyledAttributes.getFloat(index, constraint.layout.horizontalWeight);
                        break;
                    case 40:
                        constraint.layout.verticalWeight = obtainStyledAttributes.getFloat(index, constraint.layout.verticalWeight);
                        break;
                    case 41:
                        constraint.layout.horizontalChainStyle = obtainStyledAttributes.getInt(index, constraint.layout.horizontalChainStyle);
                        break;
                    case 42:
                        constraint.layout.verticalChainStyle = obtainStyledAttributes.getInt(index, constraint.layout.verticalChainStyle);
                        break;
                    case 43:
                        constraint.propertySet.alpha = obtainStyledAttributes.getFloat(index, constraint.propertySet.alpha);
                        break;
                    case 44:
                        constraint.transform.applyElevation = true;
                        constraint.transform.elevation = obtainStyledAttributes.getDimension(index, constraint.transform.elevation);
                        break;
                    case 45:
                        constraint.transform.rotationX = obtainStyledAttributes.getFloat(index, constraint.transform.rotationX);
                        break;
                    case 46:
                        constraint.transform.rotationY = obtainStyledAttributes.getFloat(index, constraint.transform.rotationY);
                        break;
                    case 47:
                        constraint.transform.scaleX = obtainStyledAttributes.getFloat(index, constraint.transform.scaleX);
                        break;
                    case 48:
                        constraint.transform.scaleY = obtainStyledAttributes.getFloat(index, constraint.transform.scaleY);
                        break;
                    case 49:
                        constraint.transform.transformPivotX = obtainStyledAttributes.getDimension(index, constraint.transform.transformPivotX);
                        break;
                    case 50:
                        constraint.transform.transformPivotY = obtainStyledAttributes.getDimension(index, constraint.transform.transformPivotY);
                        break;
                    case 51:
                        constraint.transform.translationX = obtainStyledAttributes.getDimension(index, constraint.transform.translationX);
                        break;
                    case 52:
                        constraint.transform.translationY = obtainStyledAttributes.getDimension(index, constraint.transform.translationY);
                        break;
                    case 53:
                        constraint.transform.translationZ = obtainStyledAttributes.getDimension(index, constraint.transform.translationZ);
                        break;
                    case 54:
                        constraint.layout.widthDefault = obtainStyledAttributes.getInt(index, constraint.layout.widthDefault);
                        break;
                    case 55:
                        constraint.layout.heightDefault = obtainStyledAttributes.getInt(index, constraint.layout.heightDefault);
                        break;
                    case 56:
                        constraint.layout.widthMax = obtainStyledAttributes.getDimensionPixelSize(index, constraint.layout.widthMax);
                        break;
                    case 57:
                        constraint.layout.heightMax = obtainStyledAttributes.getDimensionPixelSize(index, constraint.layout.heightMax);
                        break;
                    case 58:
                        constraint.layout.widthMin = obtainStyledAttributes.getDimensionPixelSize(index, constraint.layout.widthMin);
                        break;
                    case 59:
                        constraint.layout.heightMin = obtainStyledAttributes.getDimensionPixelSize(index, constraint.layout.heightMin);
                        break;
                    case 60:
                        constraint.transform.rotation = obtainStyledAttributes.getFloat(index, constraint.transform.rotation);
                        break;
                    case 61:
                        androidx.constraintlayout.widget.ConstraintSet.Layout layout14 = constraint.layout;
                        int resourceId14 = obtainStyledAttributes.getResourceId(index, constraint.layout.circleConstraint);
                        if (resourceId14 == -1) {
                            resourceId14 = obtainStyledAttributes.getInt(index, -1);
                        }
                        layout14.circleConstraint = resourceId14;
                        break;
                    case 62:
                        constraint.layout.circleRadius = obtainStyledAttributes.getDimensionPixelSize(index, constraint.layout.circleRadius);
                        break;
                    case 63:
                        constraint.layout.circleAngle = obtainStyledAttributes.getFloat(index, constraint.layout.circleAngle);
                        break;
                    case 64:
                        androidx.constraintlayout.widget.ConstraintSet.Motion motion = constraint.motion;
                        int resourceId15 = obtainStyledAttributes.getResourceId(index, constraint.motion.mAnimateRelativeTo);
                        if (resourceId15 == -1) {
                            resourceId15 = obtainStyledAttributes.getInt(index, -1);
                        }
                        motion.mAnimateRelativeTo = resourceId15;
                        break;
                    case 65:
                        if (obtainStyledAttributes.peekValue(index).type == 3) {
                            constraint.motion.mTransitionEasing = obtainStyledAttributes.getString(index);
                            break;
                        } else {
                            constraint.motion.mTransitionEasing = androidx.constraintlayout.core.motion.utils.Easing.NAMED_EASING[obtainStyledAttributes.getInteger(index, 0)];
                            break;
                        }
                    case 66:
                        constraint.motion.mDrawPath = obtainStyledAttributes.getInt(index, 0);
                        break;
                    case 67:
                        constraint.motion.mPathRotate = obtainStyledAttributes.getFloat(index, constraint.motion.mPathRotate);
                        break;
                    case 68:
                        constraint.propertySet.mProgress = obtainStyledAttributes.getFloat(index, constraint.propertySet.mProgress);
                        break;
                    case 69:
                        constraint.layout.widthPercent = obtainStyledAttributes.getFloat(index, 1.0f);
                        break;
                    case 70:
                        constraint.layout.heightPercent = obtainStyledAttributes.getFloat(index, 1.0f);
                        break;
                    case 71:
                        break;
                    case 72:
                        constraint.layout.mBarrierDirection = obtainStyledAttributes.getInt(index, constraint.layout.mBarrierDirection);
                        break;
                    case 73:
                        constraint.layout.mBarrierMargin = obtainStyledAttributes.getDimensionPixelSize(index, constraint.layout.mBarrierMargin);
                        break;
                    case 74:
                        constraint.layout.mReferenceIdString = obtainStyledAttributes.getString(index);
                        break;
                    case 75:
                        constraint.layout.mBarrierAllowsGoneWidgets = obtainStyledAttributes.getBoolean(index, constraint.layout.mBarrierAllowsGoneWidgets);
                        break;
                    case 76:
                        constraint.motion.mPathMotionArc = obtainStyledAttributes.getInt(index, constraint.motion.mPathMotionArc);
                        break;
                    case 77:
                        constraint.layout.mConstraintTag = obtainStyledAttributes.getString(index);
                        break;
                    case 78:
                        constraint.propertySet.mVisibilityMode = obtainStyledAttributes.getInt(index, constraint.propertySet.mVisibilityMode);
                        break;
                    case 79:
                        constraint.motion.mMotionStagger = obtainStyledAttributes.getFloat(index, constraint.motion.mMotionStagger);
                        break;
                    case 80:
                        constraint.layout.constrainedWidth = obtainStyledAttributes.getBoolean(index, constraint.layout.constrainedWidth);
                        break;
                    case 81:
                        constraint.layout.constrainedHeight = obtainStyledAttributes.getBoolean(index, constraint.layout.constrainedHeight);
                        break;
                    case 82:
                        constraint.motion.mAnimateCircleAngleTo = obtainStyledAttributes.getInteger(index, constraint.motion.mAnimateCircleAngleTo);
                        break;
                    case 83:
                        androidx.constraintlayout.widget.ConstraintSet.Transform transform = constraint.transform;
                        int resourceId16 = obtainStyledAttributes.getResourceId(index, constraint.transform.transformPivotTarget);
                        if (resourceId16 == -1) {
                            resourceId16 = obtainStyledAttributes.getInt(index, -1);
                        }
                        transform.transformPivotTarget = resourceId16;
                        break;
                    case 84:
                        constraint.motion.mQuantizeMotionSteps = obtainStyledAttributes.getInteger(index, constraint.motion.mQuantizeMotionSteps);
                        break;
                    case 85:
                        constraint.motion.mQuantizeMotionPhase = obtainStyledAttributes.getFloat(index, constraint.motion.mQuantizeMotionPhase);
                        break;
                    case 86:
                        android.util.TypedValue peekValue = obtainStyledAttributes.peekValue(index);
                        if (peekValue.type == 1) {
                            constraint.motion.mQuantizeInterpolatorID = obtainStyledAttributes.getResourceId(index, -1);
                            if (constraint.motion.mQuantizeInterpolatorID != -1) {
                                constraint.motion.mQuantizeInterpolatorType = -2;
                                break;
                            } else {
                                break;
                            }
                        } else if (peekValue.type == 3) {
                            constraint.motion.mQuantizeInterpolatorString = obtainStyledAttributes.getString(index);
                            if (constraint.motion.mQuantizeInterpolatorString.indexOf(androidx.view.exceptions.publickeycredential.DomExceptionUtils.SEPARATOR) > 0) {
                                constraint.motion.mQuantizeInterpolatorID = obtainStyledAttributes.getResourceId(index, -1);
                                constraint.motion.mQuantizeInterpolatorType = -2;
                                break;
                            } else {
                                constraint.motion.mQuantizeInterpolatorType = -1;
                                break;
                            }
                        } else {
                            constraint.motion.mQuantizeInterpolatorType = obtainStyledAttributes.getInteger(index, constraint.motion.mQuantizeInterpolatorID);
                            break;
                        }
                    case 87:
                        getHighSpeedVideoFpsRangesFor.get(index);
                        break;
                    case 88:
                    case 89:
                    case 90:
                    default:
                        getHighSpeedVideoFpsRangesFor.get(index);
                        break;
                    case 91:
                        androidx.constraintlayout.widget.ConstraintSet.Layout layout15 = constraint.layout;
                        int resourceId17 = obtainStyledAttributes.getResourceId(index, constraint.layout.baselineToTop);
                        if (resourceId17 == -1) {
                            resourceId17 = obtainStyledAttributes.getInt(index, -1);
                        }
                        layout15.baselineToTop = resourceId17;
                        break;
                    case 92:
                        androidx.constraintlayout.widget.ConstraintSet.Layout layout16 = constraint.layout;
                        int resourceId18 = obtainStyledAttributes.getResourceId(index, constraint.layout.baselineToBottom);
                        if (resourceId18 == -1) {
                            resourceId18 = obtainStyledAttributes.getInt(index, -1);
                        }
                        layout16.baselineToBottom = resourceId18;
                        break;
                    case 93:
                        constraint.layout.baselineMargin = obtainStyledAttributes.getDimensionPixelSize(index, constraint.layout.baselineMargin);
                        break;
                    case 94:
                        constraint.layout.goneBaselineMargin = obtainStyledAttributes.getDimensionPixelSize(index, constraint.layout.goneBaselineMargin);
                        break;
                    case 95:
                        getHighResolutionOutputSizeshNQ4ISI(constraint.layout, obtainStyledAttributes, index, 0);
                        break;
                    case 96:
                        getHighResolutionOutputSizeshNQ4ISI(constraint.layout, obtainStyledAttributes, index, 1);
                        break;
                    case 97:
                        constraint.layout.mWrapBehavior = obtainStyledAttributes.getInt(index, constraint.layout.mWrapBehavior);
                        break;
                }
            }
            if (constraint.layout.mReferenceIdString != null) {
                constraint.layout.mReferenceIds = null;
            }
        }
        obtainStyledAttributes.recycle();
        return constraint;
    }

    public static androidx.constraintlayout.widget.ConstraintSet.Constraint buildDelta(android.content.Context context, org.xmlpull.v1.XmlPullParser xmlPullParser) {
        android.util.AttributeSet asAttributeSet = android.util.Xml.asAttributeSet(xmlPullParser);
        androidx.constraintlayout.widget.ConstraintSet.Constraint constraint = new androidx.constraintlayout.widget.ConstraintSet.Constraint();
        android.content.res.TypedArray obtainStyledAttributes = context.obtainStyledAttributes(asAttributeSet, androidx.constraintlayout.widget.R.styleable.ConstraintOverride);
        getHighSpeedVideoSizes(constraint, obtainStyledAttributes);
        obtainStyledAttributes.recycle();
        return constraint;
    }

    private static void getHighSpeedVideoSizes(androidx.constraintlayout.widget.ConstraintSet.Constraint constraint, android.content.res.TypedArray typedArray) {
        int indexCount = typedArray.getIndexCount();
        androidx.constraintlayout.widget.ConstraintSet.Constraint.Delta delta = new androidx.constraintlayout.widget.ConstraintSet.Constraint.Delta();
        constraint.Camera2StreamConfigurationMap = delta;
        constraint.motion.mApply = false;
        constraint.layout.mApply = false;
        constraint.propertySet.mApply = false;
        constraint.transform.mApply = false;
        for (int i = 0; i < indexCount; i++) {
            int index = typedArray.getIndex(i);
            switch (getHighResolutionOutputSizeshNQ4ISI.get(index)) {
                case 2:
                    delta.getHighResolutionOutputSizeshNQ4ISI(2, typedArray.getDimensionPixelSize(index, constraint.layout.bottomMargin));
                    break;
                case 3:
                case 4:
                case 9:
                case 10:
                case 25:
                case 26:
                case 29:
                case 30:
                case 32:
                case 33:
                case 35:
                case 36:
                case 61:
                case 88:
                case 89:
                case 90:
                case 91:
                case 92:
                default:
                    getHighSpeedVideoFpsRangesFor.get(index);
                    break;
                case 5:
                    delta.getHighSpeedVideoSizes(5, typedArray.getString(index));
                    break;
                case 6:
                    delta.getHighResolutionOutputSizeshNQ4ISI(6, typedArray.getDimensionPixelOffset(index, constraint.layout.editorAbsoluteX));
                    break;
                case 7:
                    delta.getHighResolutionOutputSizeshNQ4ISI(7, typedArray.getDimensionPixelOffset(index, constraint.layout.editorAbsoluteY));
                    break;
                case 8:
                    delta.getHighResolutionOutputSizeshNQ4ISI(8, typedArray.getDimensionPixelSize(index, constraint.layout.endMargin));
                    break;
                case 11:
                    delta.getHighResolutionOutputSizeshNQ4ISI(11, typedArray.getDimensionPixelSize(index, constraint.layout.goneBottomMargin));
                    break;
                case 12:
                    delta.getHighResolutionOutputSizeshNQ4ISI(12, typedArray.getDimensionPixelSize(index, constraint.layout.goneEndMargin));
                    break;
                case 13:
                    delta.getHighResolutionOutputSizeshNQ4ISI(13, typedArray.getDimensionPixelSize(index, constraint.layout.goneLeftMargin));
                    break;
                case 14:
                    delta.getHighResolutionOutputSizeshNQ4ISI(14, typedArray.getDimensionPixelSize(index, constraint.layout.goneRightMargin));
                    break;
                case 15:
                    delta.getHighResolutionOutputSizeshNQ4ISI(15, typedArray.getDimensionPixelSize(index, constraint.layout.goneStartMargin));
                    break;
                case 16:
                    delta.getHighResolutionOutputSizeshNQ4ISI(16, typedArray.getDimensionPixelSize(index, constraint.layout.goneTopMargin));
                    break;
                case 17:
                    delta.getHighResolutionOutputSizeshNQ4ISI(17, typedArray.getDimensionPixelOffset(index, constraint.layout.guideBegin));
                    break;
                case 18:
                    delta.getHighResolutionOutputSizeshNQ4ISI(18, typedArray.getDimensionPixelOffset(index, constraint.layout.guideEnd));
                    break;
                case 19:
                    delta.getHighSpeedVideoSizes(19, typedArray.getFloat(index, constraint.layout.guidePercent));
                    break;
                case 20:
                    delta.getHighSpeedVideoSizes(20, typedArray.getFloat(index, constraint.layout.horizontalBias));
                    break;
                case 21:
                    delta.getHighResolutionOutputSizeshNQ4ISI(21, typedArray.getLayoutDimension(index, constraint.layout.mHeight));
                    break;
                case 22:
                    delta.getHighResolutionOutputSizeshNQ4ISI(22, getHighSpeedVideoFpsRanges[typedArray.getInt(index, constraint.propertySet.visibility)]);
                    break;
                case 23:
                    delta.getHighResolutionOutputSizeshNQ4ISI(23, typedArray.getLayoutDimension(index, constraint.layout.mWidth));
                    break;
                case 24:
                    delta.getHighResolutionOutputSizeshNQ4ISI(24, typedArray.getDimensionPixelSize(index, constraint.layout.leftMargin));
                    break;
                case 27:
                    delta.getHighResolutionOutputSizeshNQ4ISI(27, typedArray.getInt(index, constraint.layout.orientation));
                    break;
                case 28:
                    delta.getHighResolutionOutputSizeshNQ4ISI(28, typedArray.getDimensionPixelSize(index, constraint.layout.rightMargin));
                    break;
                case 31:
                    delta.getHighResolutionOutputSizeshNQ4ISI(31, typedArray.getDimensionPixelSize(index, constraint.layout.startMargin));
                    break;
                case 34:
                    delta.getHighResolutionOutputSizeshNQ4ISI(34, typedArray.getDimensionPixelSize(index, constraint.layout.topMargin));
                    break;
                case 37:
                    delta.getHighSpeedVideoSizes(37, typedArray.getFloat(index, constraint.layout.verticalBias));
                    break;
                case 38:
                    constraint.getHighSpeedVideoSizes = typedArray.getResourceId(index, constraint.getHighSpeedVideoSizes);
                    delta.getHighResolutionOutputSizeshNQ4ISI(38, constraint.getHighSpeedVideoSizes);
                    break;
                case 39:
                    delta.getHighSpeedVideoSizes(39, typedArray.getFloat(index, constraint.layout.horizontalWeight));
                    break;
                case 40:
                    delta.getHighSpeedVideoSizes(40, typedArray.getFloat(index, constraint.layout.verticalWeight));
                    break;
                case 41:
                    delta.getHighResolutionOutputSizeshNQ4ISI(41, typedArray.getInt(index, constraint.layout.horizontalChainStyle));
                    break;
                case 42:
                    delta.getHighResolutionOutputSizeshNQ4ISI(42, typedArray.getInt(index, constraint.layout.verticalChainStyle));
                    break;
                case 43:
                    delta.getHighSpeedVideoSizes(43, typedArray.getFloat(index, constraint.propertySet.alpha));
                    break;
                case 44:
                    delta.getHighSpeedVideoSizes(44, true);
                    delta.getHighSpeedVideoSizes(44, typedArray.getDimension(index, constraint.transform.elevation));
                    break;
                case 45:
                    delta.getHighSpeedVideoSizes(45, typedArray.getFloat(index, constraint.transform.rotationX));
                    break;
                case 46:
                    delta.getHighSpeedVideoSizes(46, typedArray.getFloat(index, constraint.transform.rotationY));
                    break;
                case 47:
                    delta.getHighSpeedVideoSizes(47, typedArray.getFloat(index, constraint.transform.scaleX));
                    break;
                case 48:
                    delta.getHighSpeedVideoSizes(48, typedArray.getFloat(index, constraint.transform.scaleY));
                    break;
                case 49:
                    delta.getHighSpeedVideoSizes(49, typedArray.getDimension(index, constraint.transform.transformPivotX));
                    break;
                case 50:
                    delta.getHighSpeedVideoSizes(50, typedArray.getDimension(index, constraint.transform.transformPivotY));
                    break;
                case 51:
                    delta.getHighSpeedVideoSizes(51, typedArray.getDimension(index, constraint.transform.translationX));
                    break;
                case 52:
                    delta.getHighSpeedVideoSizes(52, typedArray.getDimension(index, constraint.transform.translationY));
                    break;
                case 53:
                    delta.getHighSpeedVideoSizes(53, typedArray.getDimension(index, constraint.transform.translationZ));
                    break;
                case 54:
                    delta.getHighResolutionOutputSizeshNQ4ISI(54, typedArray.getInt(index, constraint.layout.widthDefault));
                    break;
                case 55:
                    delta.getHighResolutionOutputSizeshNQ4ISI(55, typedArray.getInt(index, constraint.layout.heightDefault));
                    break;
                case 56:
                    delta.getHighResolutionOutputSizeshNQ4ISI(56, typedArray.getDimensionPixelSize(index, constraint.layout.widthMax));
                    break;
                case 57:
                    delta.getHighResolutionOutputSizeshNQ4ISI(57, typedArray.getDimensionPixelSize(index, constraint.layout.heightMax));
                    break;
                case 58:
                    delta.getHighResolutionOutputSizeshNQ4ISI(58, typedArray.getDimensionPixelSize(index, constraint.layout.widthMin));
                    break;
                case 59:
                    delta.getHighResolutionOutputSizeshNQ4ISI(59, typedArray.getDimensionPixelSize(index, constraint.layout.heightMin));
                    break;
                case 60:
                    delta.getHighSpeedVideoSizes(60, typedArray.getFloat(index, constraint.transform.rotation));
                    break;
                case 62:
                    delta.getHighResolutionOutputSizeshNQ4ISI(62, typedArray.getDimensionPixelSize(index, constraint.layout.circleRadius));
                    break;
                case 63:
                    delta.getHighSpeedVideoSizes(63, typedArray.getFloat(index, constraint.layout.circleAngle));
                    break;
                case 64:
                    int resourceId = typedArray.getResourceId(index, constraint.motion.mAnimateRelativeTo);
                    if (resourceId == -1) {
                        resourceId = typedArray.getInt(index, -1);
                    }
                    delta.getHighResolutionOutputSizeshNQ4ISI(64, resourceId);
                    break;
                case 65:
                    if (typedArray.peekValue(index).type == 3) {
                        delta.getHighSpeedVideoSizes(65, typedArray.getString(index));
                        break;
                    } else {
                        delta.getHighSpeedVideoSizes(65, androidx.constraintlayout.core.motion.utils.Easing.NAMED_EASING[typedArray.getInteger(index, 0)]);
                        break;
                    }
                case 66:
                    delta.getHighResolutionOutputSizeshNQ4ISI(66, typedArray.getInt(index, 0));
                    break;
                case 67:
                    delta.getHighSpeedVideoSizes(67, typedArray.getFloat(index, constraint.motion.mPathRotate));
                    break;
                case 68:
                    delta.getHighSpeedVideoSizes(68, typedArray.getFloat(index, constraint.propertySet.mProgress));
                    break;
                case 69:
                    delta.getHighSpeedVideoSizes(69, typedArray.getFloat(index, 1.0f));
                    break;
                case 70:
                    delta.getHighSpeedVideoSizes(70, typedArray.getFloat(index, 1.0f));
                    break;
                case 71:
                    break;
                case 72:
                    delta.getHighResolutionOutputSizeshNQ4ISI(72, typedArray.getInt(index, constraint.layout.mBarrierDirection));
                    break;
                case 73:
                    delta.getHighResolutionOutputSizeshNQ4ISI(73, typedArray.getDimensionPixelSize(index, constraint.layout.mBarrierMargin));
                    break;
                case 74:
                    delta.getHighSpeedVideoSizes(74, typedArray.getString(index));
                    break;
                case 75:
                    delta.getHighSpeedVideoSizes(75, typedArray.getBoolean(index, constraint.layout.mBarrierAllowsGoneWidgets));
                    break;
                case 76:
                    delta.getHighResolutionOutputSizeshNQ4ISI(76, typedArray.getInt(index, constraint.motion.mPathMotionArc));
                    break;
                case 77:
                    delta.getHighSpeedVideoSizes(77, typedArray.getString(index));
                    break;
                case 78:
                    delta.getHighResolutionOutputSizeshNQ4ISI(78, typedArray.getInt(index, constraint.propertySet.mVisibilityMode));
                    break;
                case 79:
                    delta.getHighSpeedVideoSizes(79, typedArray.getFloat(index, constraint.motion.mMotionStagger));
                    break;
                case 80:
                    delta.getHighSpeedVideoSizes(80, typedArray.getBoolean(index, constraint.layout.constrainedWidth));
                    break;
                case 81:
                    delta.getHighSpeedVideoSizes(81, typedArray.getBoolean(index, constraint.layout.constrainedHeight));
                    break;
                case 82:
                    delta.getHighResolutionOutputSizeshNQ4ISI(82, typedArray.getInteger(index, constraint.motion.mAnimateCircleAngleTo));
                    break;
                case 83:
                    int resourceId2 = typedArray.getResourceId(index, constraint.transform.transformPivotTarget);
                    if (resourceId2 == -1) {
                        resourceId2 = typedArray.getInt(index, -1);
                    }
                    delta.getHighResolutionOutputSizeshNQ4ISI(83, resourceId2);
                    break;
                case 84:
                    delta.getHighResolutionOutputSizeshNQ4ISI(84, typedArray.getInteger(index, constraint.motion.mQuantizeMotionSteps));
                    break;
                case 85:
                    delta.getHighSpeedVideoSizes(85, typedArray.getFloat(index, constraint.motion.mQuantizeMotionPhase));
                    break;
                case 86:
                    android.util.TypedValue peekValue = typedArray.peekValue(index);
                    if (peekValue.type == 1) {
                        constraint.motion.mQuantizeInterpolatorID = typedArray.getResourceId(index, -1);
                        delta.getHighResolutionOutputSizeshNQ4ISI(89, constraint.motion.mQuantizeInterpolatorID);
                        if (constraint.motion.mQuantizeInterpolatorID != -1) {
                            constraint.motion.mQuantizeInterpolatorType = -2;
                            delta.getHighResolutionOutputSizeshNQ4ISI(88, constraint.motion.mQuantizeInterpolatorType);
                            break;
                        } else {
                            break;
                        }
                    } else if (peekValue.type == 3) {
                        constraint.motion.mQuantizeInterpolatorString = typedArray.getString(index);
                        delta.getHighSpeedVideoSizes(90, constraint.motion.mQuantizeInterpolatorString);
                        if (constraint.motion.mQuantizeInterpolatorString.indexOf(androidx.view.exceptions.publickeycredential.DomExceptionUtils.SEPARATOR) > 0) {
                            constraint.motion.mQuantizeInterpolatorID = typedArray.getResourceId(index, -1);
                            delta.getHighResolutionOutputSizeshNQ4ISI(89, constraint.motion.mQuantizeInterpolatorID);
                            constraint.motion.mQuantizeInterpolatorType = -2;
                            delta.getHighResolutionOutputSizeshNQ4ISI(88, constraint.motion.mQuantizeInterpolatorType);
                            break;
                        } else {
                            constraint.motion.mQuantizeInterpolatorType = -1;
                            delta.getHighResolutionOutputSizeshNQ4ISI(88, constraint.motion.mQuantizeInterpolatorType);
                            break;
                        }
                    } else {
                        constraint.motion.mQuantizeInterpolatorType = typedArray.getInteger(index, constraint.motion.mQuantizeInterpolatorID);
                        delta.getHighResolutionOutputSizeshNQ4ISI(88, constraint.motion.mQuantizeInterpolatorType);
                        break;
                    }
                case 87:
                    getHighSpeedVideoFpsRangesFor.get(index);
                    break;
                case 93:
                    delta.getHighResolutionOutputSizeshNQ4ISI(93, typedArray.getDimensionPixelSize(index, constraint.layout.baselineMargin));
                    break;
                case 94:
                    delta.getHighResolutionOutputSizeshNQ4ISI(94, typedArray.getDimensionPixelSize(index, constraint.layout.goneBaselineMargin));
                    break;
                case 95:
                    getHighResolutionOutputSizeshNQ4ISI(delta, typedArray, index, 0);
                    break;
                case 96:
                    getHighResolutionOutputSizeshNQ4ISI(delta, typedArray, index, 1);
                    break;
                case 97:
                    delta.getHighResolutionOutputSizeshNQ4ISI(97, typedArray.getInt(index, constraint.layout.mWrapBehavior));
                    break;
                case 98:
                    if (androidx.constraintlayout.motion.widget.MotionLayout.IS_IN_EDIT_MODE) {
                        constraint.getHighSpeedVideoSizes = typedArray.getResourceId(index, constraint.getHighSpeedVideoSizes);
                        if (constraint.getHighSpeedVideoSizes == -1) {
                            constraint.getHighResolutionOutputSizeshNQ4ISI = typedArray.getString(index);
                            break;
                        } else {
                            break;
                        }
                    } else if (typedArray.peekValue(index).type == 3) {
                        constraint.getHighResolutionOutputSizeshNQ4ISI = typedArray.getString(index);
                        break;
                    } else {
                        constraint.getHighSpeedVideoSizes = typedArray.getResourceId(index, constraint.getHighSpeedVideoSizes);
                        break;
                    }
                case 99:
                    delta.getHighSpeedVideoSizes(99, typedArray.getBoolean(index, constraint.layout.guidelineUseRtl));
                    break;
            }
        }
    }

    private static int[] getHighResolutionOutputSizeshNQ4ISI(android.view.View view, java.lang.String str) {
        int i;
        java.lang.Object designInformation;
        java.lang.String[] split = str.split(",");
        android.content.Context context = view.getContext();
        int[] iArr = new int[split.length];
        int i2 = 0;
        int i3 = 0;
        while (i2 < split.length) {
            java.lang.String trim = split[i2].trim();
            try {
                i = androidx.constraintlayout.widget.R.id.class.getField(trim).getInt(null);
            } catch (java.lang.Exception unused) {
                i = 0;
            }
            if (i == 0) {
                i = context.getResources().getIdentifier(trim, "id", context.getPackageName());
            }
            if (i == 0 && view.isInEditMode() && (view.getParent() instanceof androidx.constraintlayout.widget.ConstraintLayout) && (designInformation = ((androidx.constraintlayout.widget.ConstraintLayout) view.getParent()).getDesignInformation(0, trim)) != null && (designInformation instanceof java.lang.Integer)) {
                i = ((java.lang.Integer) designInformation).intValue();
            }
            iArr[i3] = i;
            i2++;
            i3++;
        }
        return i3 != split.length ? java.util.Arrays.copyOf(iArr, i3) : iArr;
    }

    public androidx.constraintlayout.widget.ConstraintSet.Constraint getConstraint(int i) {
        if (this.getHighSpeedVideoSizes.containsKey(java.lang.Integer.valueOf(i))) {
            return this.getHighSpeedVideoSizes.get(java.lang.Integer.valueOf(i));
        }
        return null;
    }

    public int[] getKnownIds() {
        java.lang.Integer[] numArr = (java.lang.Integer[]) this.getHighSpeedVideoSizes.keySet().toArray(new java.lang.Integer[0]);
        int length = numArr.length;
        int[] iArr = new int[length];
        for (int i = 0; i < length; i++) {
            iArr[i] = numArr[i].intValue();
        }
        return iArr;
    }

    public boolean isForceId() {
        return this.Camera2StreamConfigurationMap;
    }

    public void setForceId(boolean z) {
        this.Camera2StreamConfigurationMap = z;
    }

    public void setValidateOnParse(boolean z) {
        this.getOutputMinFrameDuration = z;
    }

    public boolean isValidateOnParse() {
        return this.getOutputMinFrameDuration;
    }

    public void dump(androidx.constraintlayout.motion.widget.MotionScene motionScene, int... iArr) {
        java.util.HashSet hashSet;
        java.util.Set<java.lang.Integer> keySet = this.getHighSpeedVideoSizes.keySet();
        if (iArr.length != 0) {
            hashSet = new java.util.HashSet();
            for (int i : iArr) {
                hashSet.add(java.lang.Integer.valueOf(i));
            }
        } else {
            hashSet = new java.util.HashSet(keySet);
        }
        java.io.PrintStream printStream = java.lang.System.out;
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append(hashSet.size());
        sb.append(" constraints");
        printStream.println(sb.toString());
        java.lang.StringBuilder sb2 = new java.lang.StringBuilder();
        for (java.lang.Integer num : (java.lang.Integer[]) hashSet.toArray(new java.lang.Integer[0])) {
            androidx.constraintlayout.widget.ConstraintSet.Constraint constraint = this.getHighSpeedVideoSizes.get(num);
            if (constraint != null) {
                sb2.append("<Constraint id=");
                sb2.append(num);
                sb2.append(" \n");
                constraint.layout.dump(motionScene, sb2);
                sb2.append("/>\n");
            }
        }
        java.lang.System.out.println(sb2.toString());
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r8v0 */
    /* JADX WARN: Type inference failed for: r8v53, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r8v69 */
    public void writeState(java.io.Writer writer, androidx.constraintlayout.widget.ConstraintLayout constraintLayout, int i) throws java.io.IOException {
        int[] iArr;
        int[] iArr2;
        writer.write("\n---------------------------------------------\n");
        ?? r8 = 0;
        if ((i & 1) == 1) {
            androidx.constraintlayout.widget.ConstraintSet.WriteXmlEngine writeXmlEngine = new androidx.constraintlayout.widget.ConstraintSet.WriteXmlEngine(writer, constraintLayout, i);
            writeXmlEngine.getOutputSizeshNQ4ISI.write("\n<ConstraintSet>\n");
            for (java.lang.Integer num : androidx.constraintlayout.widget.ConstraintSet.this.getHighSpeedVideoSizes.keySet()) {
                androidx.constraintlayout.widget.ConstraintSet.Constraint constraint = androidx.constraintlayout.widget.ConstraintSet.this.getHighSpeedVideoSizes.get(num);
                java.lang.String highSpeedVideoFpsRanges = writeXmlEngine.getHighSpeedVideoFpsRanges(num.intValue());
                writeXmlEngine.getOutputSizeshNQ4ISI.write("  <Constraint");
                java.io.Writer writer2 = writeXmlEngine.getOutputSizeshNQ4ISI;
                java.lang.StringBuilder sb = new java.lang.StringBuilder("\n       android:id=\"");
                sb.append(highSpeedVideoFpsRanges);
                sb.append("\"");
                writer2.write(sb.toString());
                androidx.constraintlayout.widget.ConstraintSet.Layout layout = constraint.layout;
                writeXmlEngine.getHighSpeedVideoFpsRangesFor("android:layout_width", layout.mWidth);
                writeXmlEngine.getHighSpeedVideoFpsRangesFor("android:layout_height", layout.mHeight);
                writeXmlEngine.getHighSpeedVideoFpsRangesFor("app:layout_constraintGuide_begin", layout.guideBegin, -1.0f);
                writeXmlEngine.getHighSpeedVideoFpsRangesFor("app:layout_constraintGuide_end", layout.guideEnd, -1.0f);
                writeXmlEngine.getHighSpeedVideoFpsRangesFor("app:layout_constraintGuide_percent", layout.guidePercent, -1.0f);
                writeXmlEngine.getHighSpeedVideoFpsRangesFor("app:layout_constraintHorizontal_bias", layout.horizontalBias, 0.5f);
                writeXmlEngine.getHighSpeedVideoFpsRangesFor("app:layout_constraintVertical_bias", layout.verticalBias, 0.5f);
                writeXmlEngine.getHighSpeedVideoFpsRanges("app:layout_constraintDimensionRatio", layout.dimensionRatio);
                writeXmlEngine.getHighSpeedVideoSizes("app:layout_constraintCircle", layout.circleConstraint);
                writeXmlEngine.getHighSpeedVideoFpsRangesFor("app:layout_constraintCircleRadius", layout.circleRadius, 0.0f);
                writeXmlEngine.getHighSpeedVideoFpsRangesFor("app:layout_constraintCircleAngle", layout.circleAngle, 0.0f);
                writeXmlEngine.getHighSpeedVideoFpsRangesFor("android:orientation", layout.orientation, -1.0f);
                writeXmlEngine.getHighSpeedVideoFpsRangesFor("app:layout_constraintVertical_weight", layout.verticalWeight, -1.0f);
                writeXmlEngine.getHighSpeedVideoFpsRangesFor("app:layout_constraintHorizontal_weight", layout.horizontalWeight, -1.0f);
                writeXmlEngine.getHighSpeedVideoFpsRangesFor("app:layout_constraintHorizontal_chainStyle", layout.horizontalChainStyle, 0.0f);
                writeXmlEngine.getHighSpeedVideoFpsRangesFor("app:layout_constraintVertical_chainStyle", layout.verticalChainStyle, 0.0f);
                writeXmlEngine.getHighSpeedVideoFpsRangesFor("app:barrierDirection", layout.mBarrierDirection, -1.0f);
                writeXmlEngine.getHighSpeedVideoFpsRangesFor("app:barrierMargin", layout.mBarrierMargin, 0.0f);
                writeXmlEngine.getHighSpeedVideoFpsRangesFor("app:layout_marginLeft", layout.leftMargin, (int) r8);
                writeXmlEngine.getHighSpeedVideoFpsRangesFor("app:layout_goneMarginLeft", layout.goneLeftMargin, Integer.MIN_VALUE);
                writeXmlEngine.getHighSpeedVideoFpsRangesFor("app:layout_marginRight", layout.rightMargin, (int) r8);
                writeXmlEngine.getHighSpeedVideoFpsRangesFor("app:layout_goneMarginRight", layout.goneRightMargin, Integer.MIN_VALUE);
                writeXmlEngine.getHighSpeedVideoFpsRangesFor("app:layout_marginStart", layout.startMargin, (int) r8);
                writeXmlEngine.getHighSpeedVideoFpsRangesFor("app:layout_goneMarginStart", layout.goneStartMargin, Integer.MIN_VALUE);
                writeXmlEngine.getHighSpeedVideoFpsRangesFor("app:layout_marginEnd", layout.endMargin, (int) r8);
                writeXmlEngine.getHighSpeedVideoFpsRangesFor("app:layout_goneMarginEnd", layout.goneEndMargin, Integer.MIN_VALUE);
                writeXmlEngine.getHighSpeedVideoFpsRangesFor("app:layout_marginTop", layout.topMargin, (int) r8);
                writeXmlEngine.getHighSpeedVideoFpsRangesFor("app:layout_goneMarginTop", layout.goneTopMargin, Integer.MIN_VALUE);
                writeXmlEngine.getHighSpeedVideoFpsRangesFor("app:layout_marginBottom", layout.bottomMargin, (int) r8);
                writeXmlEngine.getHighSpeedVideoFpsRangesFor("app:layout_goneMarginBottom", layout.goneBottomMargin, Integer.MIN_VALUE);
                writeXmlEngine.getHighSpeedVideoFpsRangesFor("app:goneBaselineMargin", layout.goneBaselineMargin, Integer.MIN_VALUE);
                writeXmlEngine.getHighSpeedVideoFpsRangesFor("app:baselineMargin", layout.baselineMargin, (int) r8);
                writeXmlEngine.Camera2StreamConfigurationMap("app:layout_constrainedWidth", layout.constrainedWidth, r8);
                writeXmlEngine.Camera2StreamConfigurationMap("app:layout_constrainedHeight", layout.constrainedHeight, r8);
                writeXmlEngine.Camera2StreamConfigurationMap("app:barrierAllowsGoneWidgets", layout.mBarrierAllowsGoneWidgets, true);
                writeXmlEngine.getHighSpeedVideoFpsRangesFor("app:layout_wrapBehaviorInParent", layout.mWrapBehavior, 0.0f);
                writeXmlEngine.getHighSpeedVideoSizes("app:baselineToBaseline", layout.baselineToBaseline);
                writeXmlEngine.getHighSpeedVideoSizes("app:baselineToBottom", layout.baselineToBottom);
                writeXmlEngine.getHighSpeedVideoSizes("app:baselineToTop", layout.baselineToTop);
                writeXmlEngine.getHighSpeedVideoSizes("app:layout_constraintBottom_toBottomOf", layout.bottomToBottom);
                writeXmlEngine.getHighSpeedVideoSizes("app:layout_constraintBottom_toTopOf", layout.bottomToTop);
                writeXmlEngine.getHighSpeedVideoSizes("app:layout_constraintEnd_toEndOf", layout.endToEnd);
                writeXmlEngine.getHighSpeedVideoSizes("app:layout_constraintEnd_toStartOf", layout.endToStart);
                writeXmlEngine.getHighSpeedVideoSizes("app:layout_constraintLeft_toLeftOf", layout.leftToLeft);
                writeXmlEngine.getHighSpeedVideoSizes("app:layout_constraintLeft_toRightOf", layout.leftToRight);
                writeXmlEngine.getHighSpeedVideoSizes("app:layout_constraintRight_toLeftOf", layout.rightToLeft);
                writeXmlEngine.getHighSpeedVideoSizes("app:layout_constraintRight_toRightOf", layout.rightToRight);
                writeXmlEngine.getHighSpeedVideoSizes("app:layout_constraintStart_toEndOf", layout.startToEnd);
                writeXmlEngine.getHighSpeedVideoSizes("app:layout_constraintStart_toStartOf", layout.startToStart);
                writeXmlEngine.getHighSpeedVideoSizes("app:layout_constraintTop_toBottomOf", layout.topToBottom);
                writeXmlEngine.getHighSpeedVideoSizes("app:layout_constraintTop_toTopOf", layout.topToTop);
                java.lang.String[] strArr = {"spread", "wrap", "percent"};
                writeXmlEngine.getHighSpeedVideoSizes("app:layout_constraintHeight_default", layout.heightDefault, strArr, r8);
                writeXmlEngine.getHighSpeedVideoFpsRangesFor("app:layout_constraintHeight_percent", layout.heightPercent, 1.0f);
                writeXmlEngine.getHighSpeedVideoFpsRangesFor("app:layout_constraintHeight_min", layout.heightMin, 0);
                writeXmlEngine.getHighSpeedVideoFpsRangesFor("app:layout_constraintHeight_max", layout.heightMax, 0);
                writeXmlEngine.Camera2StreamConfigurationMap("android:layout_constrainedHeight", layout.constrainedHeight, false);
                writeXmlEngine.getHighSpeedVideoSizes("app:layout_constraintWidth_default", layout.widthDefault, strArr, 0);
                writeXmlEngine.getHighSpeedVideoFpsRangesFor("app:layout_constraintWidth_percent", layout.widthPercent, 1.0f);
                writeXmlEngine.getHighSpeedVideoFpsRangesFor("app:layout_constraintWidth_min", layout.widthMin, 0);
                writeXmlEngine.getHighSpeedVideoFpsRangesFor("app:layout_constraintWidth_max", layout.widthMax, 0);
                writeXmlEngine.Camera2StreamConfigurationMap("android:layout_constrainedWidth", layout.constrainedWidth, false);
                writeXmlEngine.getHighSpeedVideoFpsRangesFor("app:layout_constraintVertical_weight", layout.verticalWeight, -1.0f);
                writeXmlEngine.getHighSpeedVideoFpsRangesFor("app:layout_constraintHorizontal_weight", layout.horizontalWeight, -1.0f);
                writeXmlEngine.Camera2StreamConfigurationMap("app:layout_constraintHorizontal_chainStyle", layout.horizontalChainStyle);
                writeXmlEngine.Camera2StreamConfigurationMap("app:layout_constraintVertical_chainStyle", layout.verticalChainStyle);
                writeXmlEngine.getHighSpeedVideoSizes("app:barrierDirection", layout.mBarrierDirection, new java.lang.String[]{com.datadog.android.rum.internal.instrumentation.gestures.GesturesListener.SCROLL_DIRECTION_LEFT, com.datadog.android.rum.internal.instrumentation.gestures.GesturesListener.SCROLL_DIRECTION_RIGHT, com.dyneti.android.dyscan.DyScanHelperTextPosition.TOP, com.dyneti.android.dyscan.DyScanHelperTextPosition.BOTTOM, com.adobe.marketing.mobile.internal.CoreConstants.EventDataKeys.Lifecycle.LIFECYCLE_START, "end"}, -1);
                writeXmlEngine.getHighSpeedVideoFpsRanges("app:layout_constraintTag", layout.mConstraintTag);
                if (layout.mReferenceIds != null && (iArr2 = layout.mReferenceIds) != null) {
                    writeXmlEngine.getOutputSizeshNQ4ISI.write("\n       ".concat("'ReferenceIds'"));
                    writeXmlEngine.getOutputSizeshNQ4ISI.write(io.ktor.sse.ServerSentEventKt.COLON);
                    int i2 = 0;
                    while (i2 < iArr2.length) {
                        java.io.Writer writer3 = writeXmlEngine.getOutputSizeshNQ4ISI;
                        java.lang.StringBuilder sb2 = new java.lang.StringBuilder();
                        sb2.append(i2 == 0 ? "[" : ", ");
                        sb2.append(writeXmlEngine.getHighSpeedVideoFpsRanges(iArr2[i2]));
                        writer3.write(sb2.toString());
                        i2++;
                    }
                    writeXmlEngine.getOutputSizeshNQ4ISI.write("],\n");
                }
                writeXmlEngine.getOutputSizeshNQ4ISI.write(" />\n");
                r8 = 0;
            }
            writeXmlEngine.getOutputSizeshNQ4ISI.write("</ConstraintSet>\n");
        } else {
            androidx.constraintlayout.widget.ConstraintSet.WriteJsonEngine writeJsonEngine = new androidx.constraintlayout.widget.ConstraintSet.WriteJsonEngine(writer, constraintLayout, i);
            writeJsonEngine.getOutputStallDurationlomOqCM.write("\n'ConstraintSet':{\n");
            for (java.lang.Integer num2 : androidx.constraintlayout.widget.ConstraintSet.this.getHighSpeedVideoSizes.keySet()) {
                androidx.constraintlayout.widget.ConstraintSet.Constraint constraint2 = androidx.constraintlayout.widget.ConstraintSet.this.getHighSpeedVideoSizes.get(num2);
                java.lang.String Camera2StreamConfigurationMap = writeJsonEngine.Camera2StreamConfigurationMap(num2.intValue());
                java.io.Writer writer4 = writeJsonEngine.getOutputStallDurationlomOqCM;
                java.lang.StringBuilder sb3 = new java.lang.StringBuilder();
                sb3.append(Camera2StreamConfigurationMap);
                sb3.append(":{\n");
                writer4.write(sb3.toString());
                androidx.constraintlayout.widget.ConstraintSet.Layout layout2 = constraint2.layout;
                int i3 = layout2.mHeight;
                int i4 = layout2.heightDefault;
                float f = layout2.heightPercent;
                int i5 = layout2.heightMin;
                int i6 = layout2.heightMax;
                boolean z = layout2.constrainedHeight;
                writeJsonEngine.getHighSpeedVideoFpsRanges("height", i3, i4, f, i5, i6);
                int i7 = layout2.mWidth;
                int i8 = layout2.widthDefault;
                float f2 = layout2.widthPercent;
                int i9 = layout2.widthMin;
                int i10 = layout2.widthMax;
                boolean z2 = layout2.constrainedWidth;
                writeJsonEngine.getHighSpeedVideoFpsRanges("width", i7, i8, f2, i9, i10);
                int i11 = layout2.leftToLeft;
                int i12 = layout2.leftMargin;
                int i13 = layout2.goneLeftMargin;
                writeJsonEngine.getHighSpeedVideoFpsRanges("'left'", i11, "'left'", i12);
                int i14 = layout2.leftToRight;
                int i15 = layout2.leftMargin;
                int i16 = layout2.goneLeftMargin;
                writeJsonEngine.getHighSpeedVideoFpsRanges("'left'", i14, "'right'", i15);
                int i17 = layout2.rightToLeft;
                int i18 = layout2.rightMargin;
                int i19 = layout2.goneRightMargin;
                writeJsonEngine.getHighSpeedVideoFpsRanges("'right'", i17, "'left'", i18);
                int i20 = layout2.rightToRight;
                int i21 = layout2.rightMargin;
                int i22 = layout2.goneRightMargin;
                writeJsonEngine.getHighSpeedVideoFpsRanges("'right'", i20, "'right'", i21);
                int i23 = layout2.baselineToBaseline;
                int i24 = layout2.goneBaselineMargin;
                writeJsonEngine.getHighSpeedVideoFpsRanges("'baseline'", i23, "'baseline'", -1);
                int i25 = layout2.baselineToTop;
                int i26 = layout2.goneBaselineMargin;
                writeJsonEngine.getHighSpeedVideoFpsRanges("'baseline'", i25, "'top'", -1);
                int i27 = layout2.baselineToBottom;
                int i28 = layout2.goneBaselineMargin;
                writeJsonEngine.getHighSpeedVideoFpsRanges("'baseline'", i27, "'bottom'", -1);
                int i29 = layout2.topToBottom;
                int i30 = layout2.topMargin;
                int i31 = layout2.goneTopMargin;
                writeJsonEngine.getHighSpeedVideoFpsRanges("'top'", i29, "'bottom'", i30);
                int i32 = layout2.topToTop;
                int i33 = layout2.topMargin;
                int i34 = layout2.goneTopMargin;
                writeJsonEngine.getHighSpeedVideoFpsRanges("'top'", i32, "'top'", i33);
                int i35 = layout2.bottomToBottom;
                int i36 = layout2.bottomMargin;
                int i37 = layout2.goneBottomMargin;
                writeJsonEngine.getHighSpeedVideoFpsRanges("'bottom'", i35, "'bottom'", i36);
                int i38 = layout2.bottomToTop;
                int i39 = layout2.bottomMargin;
                int i40 = layout2.goneBottomMargin;
                writeJsonEngine.getHighSpeedVideoFpsRanges("'bottom'", i38, "'top'", i39);
                int i41 = layout2.startToStart;
                int i42 = layout2.startMargin;
                int i43 = layout2.goneStartMargin;
                writeJsonEngine.getHighSpeedVideoFpsRanges("'start'", i41, "'start'", i42);
                int i44 = layout2.startToEnd;
                int i45 = layout2.startMargin;
                int i46 = layout2.goneStartMargin;
                writeJsonEngine.getHighSpeedVideoFpsRanges("'start'", i44, "'end'", i45);
                int i47 = layout2.endToStart;
                int i48 = layout2.endMargin;
                int i49 = layout2.goneEndMargin;
                writeJsonEngine.getHighSpeedVideoFpsRanges("'end'", i47, "'start'", i48);
                int i50 = layout2.endToEnd;
                int i51 = layout2.endMargin;
                int i52 = layout2.goneEndMargin;
                writeJsonEngine.getHighSpeedVideoFpsRanges("'end'", i50, "'end'", i51);
                writeJsonEngine.Camera2StreamConfigurationMap("'horizontalBias'", layout2.horizontalBias);
                writeJsonEngine.Camera2StreamConfigurationMap("'verticalBias'", layout2.verticalBias);
                int i53 = layout2.circleConstraint;
                float f3 = layout2.circleAngle;
                int i54 = layout2.circleRadius;
                if (i53 != -1) {
                    writeJsonEngine.getOutputStallDurationlomOqCM.write("       circle");
                    writeJsonEngine.getOutputStallDurationlomOqCM.write(":[");
                    writeJsonEngine.getOutputStallDurationlomOqCM.write(writeJsonEngine.Camera2StreamConfigurationMap(i53));
                    writeJsonEngine.getOutputStallDurationlomOqCM.write(", ".concat(java.lang.String.valueOf(f3)));
                    java.io.Writer writer5 = writeJsonEngine.getOutputStallDurationlomOqCM;
                    java.lang.StringBuilder sb4 = new java.lang.StringBuilder();
                    sb4.append(i54);
                    sb4.append("]");
                    writer5.write(sb4.toString());
                }
                int i55 = layout2.orientation;
                int i56 = layout2.guideBegin;
                int i57 = layout2.guideEnd;
                float f4 = layout2.guidePercent;
                writeJsonEngine.getHighSpeedVideoFpsRangesFor("'orientation'", i55);
                writeJsonEngine.getHighSpeedVideoFpsRangesFor("'guideBegin'", i56);
                writeJsonEngine.getHighSpeedVideoFpsRangesFor("'guideEnd'", i57);
                writeJsonEngine.getHighSpeedVideoSizes("'guidePercent'", f4);
                writeJsonEngine.getHighSpeedVideoSizes("'dimensionRatio'", layout2.dimensionRatio);
                writeJsonEngine.getHighSpeedVideoFpsRangesFor("'barrierMargin'", layout2.mBarrierMargin);
                writeJsonEngine.getHighSpeedVideoFpsRangesFor("'type'", layout2.mHelperType);
                writeJsonEngine.getHighSpeedVideoSizes("'ReferenceId'", layout2.mReferenceIdString);
                boolean z3 = layout2.mBarrierAllowsGoneWidgets;
                if (!z3) {
                    writeJsonEngine.getOutputStallDurationlomOqCM.write("       ".concat("'mBarrierAllowsGoneWidgets'"));
                    writeJsonEngine.getOutputStallDurationlomOqCM.write(": ".concat(java.lang.String.valueOf(z3)));
                    writeJsonEngine.getOutputStallDurationlomOqCM.write(",\n");
                }
                writeJsonEngine.getHighSpeedVideoFpsRangesFor("'WrapBehavior'", layout2.mWrapBehavior);
                writeJsonEngine.getHighSpeedVideoSizes("'verticalWeight'", layout2.verticalWeight);
                writeJsonEngine.getHighSpeedVideoSizes("'horizontalWeight'", layout2.horizontalWeight);
                writeJsonEngine.getHighSpeedVideoFpsRangesFor("'horizontalChainStyle'", layout2.horizontalChainStyle);
                writeJsonEngine.getHighSpeedVideoFpsRangesFor("'verticalChainStyle'", layout2.verticalChainStyle);
                writeJsonEngine.getHighSpeedVideoFpsRangesFor("'barrierDirection'", layout2.mBarrierDirection);
                if (layout2.mReferenceIds != null && (iArr = layout2.mReferenceIds) != null) {
                    writeJsonEngine.getOutputStallDurationlomOqCM.write("       ".concat("'ReferenceIds'"));
                    writeJsonEngine.getOutputStallDurationlomOqCM.write(": ");
                    int i58 = 0;
                    while (i58 < iArr.length) {
                        java.io.Writer writer6 = writeJsonEngine.getOutputStallDurationlomOqCM;
                        java.lang.StringBuilder sb5 = new java.lang.StringBuilder();
                        sb5.append(i58 == 0 ? "[" : ", ");
                        sb5.append(writeJsonEngine.Camera2StreamConfigurationMap(iArr[i58]));
                        writer6.write(sb5.toString());
                        i58++;
                    }
                    writeJsonEngine.getOutputStallDurationlomOqCM.write("],\n");
                }
                writeJsonEngine.getOutputStallDurationlomOqCM.write("}\n");
            }
            writeJsonEngine.getOutputStallDurationlomOqCM.write("}\n");
        }
        writer.write("\n---------------------------------------------\n");
    }

    class WriteXmlEngine {
        android.content.Context getHighResolutionOutputSizeshNQ4ISI;
        int getHighSpeedVideoFpsRanges;
        androidx.constraintlayout.widget.ConstraintLayout getOutputFormats;
        java.io.Writer getOutputSizeshNQ4ISI;
        int getOutputStallDurationlomOqCM = 0;
        final java.lang.String getOutputMinFrameDuration = "'left'";
        final java.lang.String getInputFormats = "'right'";
        final java.lang.String Camera2StreamConfigurationMap = "'baseline'";
        final java.lang.String getHighSpeedVideoSizes = "'bottom'";
        final java.lang.String getOutputMinFrameDurationlomOqCM = "'top'";
        final java.lang.String getInputSizeshNQ4ISI = "'start'";
        final java.lang.String getHighSpeedVideoFpsRangesFor = "'end'";
        java.util.HashMap<java.lang.Integer, java.lang.String> getHighSpeedVideoSizesFor = new java.util.HashMap<>();

        WriteXmlEngine(java.io.Writer writer, androidx.constraintlayout.widget.ConstraintLayout constraintLayout, int i) throws java.io.IOException {
            this.getOutputSizeshNQ4ISI = writer;
            this.getOutputFormats = constraintLayout;
            this.getHighResolutionOutputSizeshNQ4ISI = constraintLayout.getContext();
            this.getHighSpeedVideoFpsRanges = i;
        }

        final void Camera2StreamConfigurationMap(java.lang.String str, boolean z, boolean z2) throws java.io.IOException {
            if (z != z2) {
                java.io.Writer writer = this.getOutputSizeshNQ4ISI;
                java.lang.StringBuilder sb = new java.lang.StringBuilder("\n       ");
                sb.append(str);
                sb.append("=\"");
                sb.append(z);
                sb.append("dp\"");
                writer.write(sb.toString());
            }
        }

        final void getHighSpeedVideoSizes(java.lang.String str, int i, java.lang.String[] strArr, int i2) throws java.io.IOException {
            if (i != i2) {
                java.io.Writer writer = this.getOutputSizeshNQ4ISI;
                java.lang.StringBuilder sb = new java.lang.StringBuilder("\n       ");
                sb.append(str);
                sb.append("=\"");
                sb.append(strArr[i]);
                sb.append("\"");
                writer.write(sb.toString());
            }
        }

        final void getHighSpeedVideoFpsRangesFor(java.lang.String str, int i, int i2) throws java.io.IOException {
            if (i != i2) {
                java.io.Writer writer = this.getOutputSizeshNQ4ISI;
                java.lang.StringBuilder sb = new java.lang.StringBuilder("\n       ");
                sb.append(str);
                sb.append("=\"");
                sb.append(i);
                sb.append("dp\"");
                writer.write(sb.toString());
            }
        }

        final void getHighSpeedVideoFpsRangesFor(java.lang.String str, int i) throws java.io.IOException {
            if (i != -5) {
                if (i == -2) {
                    java.io.Writer writer = this.getOutputSizeshNQ4ISI;
                    java.lang.StringBuilder sb = new java.lang.StringBuilder("\n       ");
                    sb.append(str);
                    sb.append("=\"wrap_content\"");
                    writer.write(sb.toString());
                    return;
                }
                if (i == -1) {
                    java.io.Writer writer2 = this.getOutputSizeshNQ4ISI;
                    java.lang.StringBuilder sb2 = new java.lang.StringBuilder("\n       ");
                    sb2.append(str);
                    sb2.append("=\"match_parent\"");
                    writer2.write(sb2.toString());
                    return;
                }
                java.io.Writer writer3 = this.getOutputSizeshNQ4ISI;
                java.lang.StringBuilder sb3 = new java.lang.StringBuilder("\n       ");
                sb3.append(str);
                sb3.append("=\"");
                sb3.append(i);
                sb3.append("dp\"");
                writer3.write(sb3.toString());
            }
        }

        final java.lang.String getHighSpeedVideoFpsRanges(int i) {
            if (this.getHighSpeedVideoSizesFor.containsKey(java.lang.Integer.valueOf(i))) {
                java.lang.StringBuilder sb = new java.lang.StringBuilder("@+id/");
                sb.append(this.getHighSpeedVideoSizesFor.get(java.lang.Integer.valueOf(i)));
                return sb.toString();
            }
            if (i == 0) {
                return "parent";
            }
            java.lang.String highSpeedVideoFpsRangesFor = getHighSpeedVideoFpsRangesFor(i);
            this.getHighSpeedVideoSizesFor.put(java.lang.Integer.valueOf(i), highSpeedVideoFpsRangesFor);
            return "@+id/".concat(java.lang.String.valueOf(highSpeedVideoFpsRangesFor));
        }

        private java.lang.String getHighSpeedVideoFpsRangesFor(int i) {
            try {
                if (i != -1) {
                    return this.getHighResolutionOutputSizeshNQ4ISI.getResources().getResourceEntryName(i);
                }
                java.lang.StringBuilder sb = new java.lang.StringBuilder("unknown");
                int i2 = this.getOutputStallDurationlomOqCM + 1;
                this.getOutputStallDurationlomOqCM = i2;
                sb.append(i2);
                return sb.toString();
            } catch (java.lang.Exception unused) {
                java.lang.StringBuilder sb2 = new java.lang.StringBuilder("unknown");
                int i3 = this.getOutputStallDurationlomOqCM + 1;
                this.getOutputStallDurationlomOqCM = i3;
                sb2.append(i3);
                return sb2.toString();
            }
        }

        final void getHighSpeedVideoSizes(java.lang.String str, int i) throws java.io.IOException {
            if (i == -1) {
                return;
            }
            this.getOutputSizeshNQ4ISI.write("\n       ".concat(java.lang.String.valueOf(str)));
            java.io.Writer writer = this.getOutputSizeshNQ4ISI;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("=\"");
            sb.append(getHighSpeedVideoFpsRanges(i));
            sb.append("\"");
            writer.write(sb.toString());
        }

        final void Camera2StreamConfigurationMap(java.lang.String str, int i) throws java.io.IOException {
            if (i == 0 || i == -1) {
                return;
            }
            java.io.Writer writer = this.getOutputSizeshNQ4ISI;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("\n       ");
            sb.append(str);
            sb.append("=\"");
            sb.append(i);
            sb.append("\"\n");
            writer.write(sb.toString());
        }

        final void getHighSpeedVideoFpsRangesFor(java.lang.String str, float f, float f2) throws java.io.IOException {
            if (f == f2) {
                return;
            }
            this.getOutputSizeshNQ4ISI.write("\n       ".concat(java.lang.String.valueOf(str)));
            java.io.Writer writer = this.getOutputSizeshNQ4ISI;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("=\"");
            sb.append(f);
            sb.append("\"");
            writer.write(sb.toString());
        }

        final void getHighSpeedVideoFpsRanges(java.lang.String str, java.lang.String str2) throws java.io.IOException {
            if (str2 == null || str2.equals(null)) {
                return;
            }
            this.getOutputSizeshNQ4ISI.write("\n       ".concat(java.lang.String.valueOf(str)));
            java.io.Writer writer = this.getOutputSizeshNQ4ISI;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("=\"");
            sb.append(str2);
            sb.append("\"");
            writer.write(sb.toString());
        }
    }

    class WriteJsonEngine {
        int getHighSpeedVideoFpsRanges;
        android.content.Context getHighSpeedVideoSizes;
        androidx.constraintlayout.widget.ConstraintLayout getInputFormats;
        java.io.Writer getOutputStallDurationlomOqCM;
        int getOutputSizes = 0;
        final java.lang.String getOutputFormats = "'left'";
        final java.lang.String getOutputMinFrameDuration = "'right'";
        final java.lang.String getHighResolutionOutputSizeshNQ4ISI = "'baseline'";
        final java.lang.String Camera2StreamConfigurationMap = "'bottom'";
        final java.lang.String getOutputMinFrameDurationlomOqCM = "'top'";
        final java.lang.String getInputSizeshNQ4ISI = "'start'";
        final java.lang.String getHighSpeedVideoFpsRangesFor = "'end'";
        java.util.HashMap<java.lang.Integer, java.lang.String> getHighSpeedVideoSizesFor = new java.util.HashMap<>();

        WriteJsonEngine(java.io.Writer writer, androidx.constraintlayout.widget.ConstraintLayout constraintLayout, int i) throws java.io.IOException {
            this.getOutputStallDurationlomOqCM = writer;
            this.getInputFormats = constraintLayout;
            this.getHighSpeedVideoSizes = constraintLayout.getContext();
            this.getHighSpeedVideoFpsRanges = i;
        }

        final void getHighSpeedVideoFpsRanges(java.lang.String str, int i, int i2, float f, int i3, int i4) throws java.io.IOException {
            if (i != 0) {
                if (i == -2) {
                    java.io.Writer writer = this.getOutputStallDurationlomOqCM;
                    java.lang.StringBuilder sb = new java.lang.StringBuilder("       ");
                    sb.append(str);
                    sb.append(": 'wrap'\n");
                    writer.write(sb.toString());
                    return;
                }
                if (i == -1) {
                    java.io.Writer writer2 = this.getOutputStallDurationlomOqCM;
                    java.lang.StringBuilder sb2 = new java.lang.StringBuilder("       ");
                    sb2.append(str);
                    sb2.append(": 'parent'\n");
                    writer2.write(sb2.toString());
                    return;
                }
                java.io.Writer writer3 = this.getOutputStallDurationlomOqCM;
                java.lang.StringBuilder sb3 = new java.lang.StringBuilder("       ");
                sb3.append(str);
                sb3.append(": ");
                sb3.append(i);
                sb3.append(",\n");
                writer3.write(sb3.toString());
                return;
            }
            if (i4 == -1 && i3 == -1) {
                if (i2 == 1) {
                    java.io.Writer writer4 = this.getOutputStallDurationlomOqCM;
                    java.lang.StringBuilder sb4 = new java.lang.StringBuilder("       ");
                    sb4.append(str);
                    sb4.append(": '???????????',\n");
                    writer4.write(sb4.toString());
                    return;
                }
                if (i2 == 2) {
                    java.io.Writer writer5 = this.getOutputStallDurationlomOqCM;
                    java.lang.StringBuilder sb5 = new java.lang.StringBuilder("       ");
                    sb5.append(str);
                    sb5.append(": '");
                    sb5.append(f);
                    sb5.append("%',\n");
                    writer5.write(sb5.toString());
                    return;
                }
                return;
            }
            if (i2 == 0) {
                java.io.Writer writer6 = this.getOutputStallDurationlomOqCM;
                java.lang.StringBuilder sb6 = new java.lang.StringBuilder("       ");
                sb6.append(str);
                sb6.append(": {'spread' ,");
                sb6.append(i3);
                sb6.append(", ");
                sb6.append(i4);
                sb6.append("}\n");
                writer6.write(sb6.toString());
                return;
            }
            if (i2 == 1) {
                java.io.Writer writer7 = this.getOutputStallDurationlomOqCM;
                java.lang.StringBuilder sb7 = new java.lang.StringBuilder("       ");
                sb7.append(str);
                sb7.append(": {'wrap' ,");
                sb7.append(i3);
                sb7.append(", ");
                sb7.append(i4);
                sb7.append("}\n");
                writer7.write(sb7.toString());
                return;
            }
            if (i2 != 2) {
                return;
            }
            java.io.Writer writer8 = this.getOutputStallDurationlomOqCM;
            java.lang.StringBuilder sb8 = new java.lang.StringBuilder("       ");
            sb8.append(str);
            sb8.append(": {'");
            sb8.append(f);
            sb8.append("'% ,");
            sb8.append(i3);
            sb8.append(", ");
            sb8.append(i4);
            sb8.append("}\n");
            writer8.write(sb8.toString());
        }

        final java.lang.String Camera2StreamConfigurationMap(int i) {
            if (this.getHighSpeedVideoSizesFor.containsKey(java.lang.Integer.valueOf(i))) {
                java.lang.StringBuilder sb = new java.lang.StringBuilder("'");
                sb.append(this.getHighSpeedVideoSizesFor.get(java.lang.Integer.valueOf(i)));
                sb.append("'");
                return sb.toString();
            }
            if (i == 0) {
                return "'parent'";
            }
            java.lang.String highSpeedVideoFpsRanges = getHighSpeedVideoFpsRanges(i);
            this.getHighSpeedVideoSizesFor.put(java.lang.Integer.valueOf(i), highSpeedVideoFpsRanges);
            java.lang.StringBuilder sb2 = new java.lang.StringBuilder("'");
            sb2.append(highSpeedVideoFpsRanges);
            sb2.append("'");
            return sb2.toString();
        }

        private java.lang.String getHighSpeedVideoFpsRanges(int i) {
            try {
                if (i != -1) {
                    return this.getHighSpeedVideoSizes.getResources().getResourceEntryName(i);
                }
                java.lang.StringBuilder sb = new java.lang.StringBuilder("unknown");
                int i2 = this.getOutputSizes + 1;
                this.getOutputSizes = i2;
                sb.append(i2);
                return sb.toString();
            } catch (java.lang.Exception unused) {
                java.lang.StringBuilder sb2 = new java.lang.StringBuilder("unknown");
                int i3 = this.getOutputSizes + 1;
                this.getOutputSizes = i3;
                sb2.append(i3);
                return sb2.toString();
            }
        }

        final void getHighSpeedVideoFpsRanges(java.lang.String str, int i, java.lang.String str2, int i2) throws java.io.IOException {
            if (i == -1) {
                return;
            }
            this.getOutputStallDurationlomOqCM.write("       ".concat(java.lang.String.valueOf(str)));
            this.getOutputStallDurationlomOqCM.write(":[");
            this.getOutputStallDurationlomOqCM.write(Camera2StreamConfigurationMap(i));
            this.getOutputStallDurationlomOqCM.write(" , ");
            this.getOutputStallDurationlomOqCM.write(str2);
            if (i2 != 0) {
                this.getOutputStallDurationlomOqCM.write(" , ".concat(java.lang.String.valueOf(i2)));
            }
            this.getOutputStallDurationlomOqCM.write("],\n");
        }

        final void getHighSpeedVideoFpsRangesFor(java.lang.String str, int i) throws java.io.IOException {
            if (i == 0 || i == -1) {
                return;
            }
            this.getOutputStallDurationlomOqCM.write("       ".concat(java.lang.String.valueOf(str)));
            this.getOutputStallDurationlomOqCM.write(io.ktor.sse.ServerSentEventKt.COLON);
            this.getOutputStallDurationlomOqCM.write(", ".concat(java.lang.String.valueOf(i)));
            this.getOutputStallDurationlomOqCM.write(com.paypal.oslo.feature.activity.domain.base.constants.ActivityConstants.UIConstants.NEW_LINE);
        }

        final void getHighSpeedVideoSizes(java.lang.String str, float f) throws java.io.IOException {
            if (f == -1.0f) {
                return;
            }
            this.getOutputStallDurationlomOqCM.write("       ".concat(java.lang.String.valueOf(str)));
            this.getOutputStallDurationlomOqCM.write(": ".concat(java.lang.String.valueOf(f)));
            this.getOutputStallDurationlomOqCM.write(",\n");
        }

        final void Camera2StreamConfigurationMap(java.lang.String str, float f) throws java.io.IOException {
            if (f == 0.5f) {
                return;
            }
            this.getOutputStallDurationlomOqCM.write("       ".concat(java.lang.String.valueOf(str)));
            this.getOutputStallDurationlomOqCM.write(": ".concat(java.lang.String.valueOf(f)));
            this.getOutputStallDurationlomOqCM.write(",\n");
        }

        final void getHighSpeedVideoSizes(java.lang.String str, java.lang.String str2) throws java.io.IOException {
            if (str2 == null) {
                return;
            }
            this.getOutputStallDurationlomOqCM.write("       ".concat(java.lang.String.valueOf(str)));
            this.getOutputStallDurationlomOqCM.write(io.ktor.sse.ServerSentEventKt.COLON);
            this.getOutputStallDurationlomOqCM.write(", ".concat(java.lang.String.valueOf(str2)));
            this.getOutputStallDurationlomOqCM.write(com.paypal.oslo.feature.activity.domain.base.constants.ActivityConstants.UIConstants.NEW_LINE);
        }
    }

    private static /* synthetic */ int getHighSpeedVideoFpsRangesFor(android.content.res.TypedArray typedArray, int i, int i2) {
        int resourceId = typedArray.getResourceId(i, i2);
        return resourceId == -1 ? typedArray.getInt(i, -1) : resourceId;
    }

    static /* synthetic */ void getHighResolutionOutputSizeshNQ4ISI(androidx.constraintlayout.widget.ConstraintSet.Constraint constraint, int i, int i2) {
        if (i == 6) {
            constraint.layout.editorAbsoluteX = i2;
            return;
        }
        if (i == 7) {
            constraint.layout.editorAbsoluteY = i2;
            return;
        }
        if (i == 8) {
            constraint.layout.endMargin = i2;
            return;
        }
        if (i == 27) {
            constraint.layout.orientation = i2;
            return;
        }
        if (i == 28) {
            constraint.layout.rightMargin = i2;
            return;
        }
        if (i == 41) {
            constraint.layout.horizontalChainStyle = i2;
            return;
        }
        if (i == 42) {
            constraint.layout.verticalChainStyle = i2;
            return;
        }
        if (i == 61) {
            constraint.layout.circleConstraint = i2;
            return;
        }
        if (i == 62) {
            constraint.layout.circleRadius = i2;
            return;
        }
        if (i == 72) {
            constraint.layout.mBarrierDirection = i2;
            return;
        }
        if (i == 73) {
            constraint.layout.mBarrierMargin = i2;
            return;
        }
        if (i == 2) {
            constraint.layout.bottomMargin = i2;
            return;
        }
        if (i == 31) {
            constraint.layout.startMargin = i2;
            return;
        }
        if (i == 34) {
            constraint.layout.topMargin = i2;
            return;
        }
        if (i == 38) {
            constraint.getHighSpeedVideoSizes = i2;
            return;
        }
        if (i == 64) {
            constraint.motion.mAnimateRelativeTo = i2;
            return;
        }
        if (i == 66) {
            constraint.motion.mDrawPath = i2;
            return;
        }
        if (i == 76) {
            constraint.motion.mPathMotionArc = i2;
            return;
        }
        if (i == 78) {
            constraint.propertySet.mVisibilityMode = i2;
            return;
        }
        if (i == 97) {
            constraint.layout.mWrapBehavior = i2;
            return;
        }
        if (i == 93) {
            constraint.layout.baselineMargin = i2;
            return;
        }
        if (i != 94) {
            switch (i) {
                case 11:
                    constraint.layout.goneBottomMargin = i2;
                    break;
                case 12:
                    constraint.layout.goneEndMargin = i2;
                    break;
                case 13:
                    constraint.layout.goneLeftMargin = i2;
                    break;
                case 14:
                    constraint.layout.goneRightMargin = i2;
                    break;
                case 15:
                    constraint.layout.goneStartMargin = i2;
                    break;
                case 16:
                    constraint.layout.goneTopMargin = i2;
                    break;
                case 17:
                    constraint.layout.guideBegin = i2;
                    break;
                case 18:
                    constraint.layout.guideEnd = i2;
                    break;
                default:
                    switch (i) {
                        case 21:
                            constraint.layout.mHeight = i2;
                            break;
                        case 22:
                            constraint.propertySet.visibility = i2;
                            break;
                        case 23:
                            constraint.layout.mWidth = i2;
                            break;
                        case 24:
                            constraint.layout.leftMargin = i2;
                            break;
                        default:
                            switch (i) {
                                case 54:
                                    constraint.layout.widthDefault = i2;
                                    break;
                                case 55:
                                    constraint.layout.heightDefault = i2;
                                    break;
                                case 56:
                                    constraint.layout.widthMax = i2;
                                    break;
                                case 57:
                                    constraint.layout.heightMax = i2;
                                    break;
                                case 58:
                                    constraint.layout.widthMin = i2;
                                    break;
                                case 59:
                                    constraint.layout.heightMin = i2;
                                    break;
                                default:
                                    switch (i) {
                                        case 82:
                                            constraint.motion.mAnimateCircleAngleTo = i2;
                                            break;
                                        case 83:
                                            constraint.transform.transformPivotTarget = i2;
                                            break;
                                        case 84:
                                            constraint.motion.mQuantizeMotionSteps = i2;
                                            break;
                                        default:
                                            if (i == 88) {
                                                constraint.motion.mQuantizeInterpolatorType = i2;
                                                break;
                                            } else if (i == 89) {
                                                constraint.motion.mQuantizeInterpolatorID = i2;
                                                break;
                                            }
                                            break;
                                    }
                            }
                    }
            }
            return;
        }
        constraint.layout.goneBaselineMargin = i2;
    }

    static /* synthetic */ void getHighSpeedVideoSizes(androidx.constraintlayout.widget.ConstraintSet.Constraint constraint, int i, float f) {
        if (i == 19) {
            constraint.layout.guidePercent = f;
            return;
        }
        if (i == 20) {
            constraint.layout.horizontalBias = f;
            return;
        }
        if (i == 37) {
            constraint.layout.verticalBias = f;
            return;
        }
        if (i == 60) {
            constraint.transform.rotation = f;
            return;
        }
        if (i == 63) {
            constraint.layout.circleAngle = f;
            return;
        }
        if (i == 79) {
            constraint.motion.mMotionStagger = f;
            return;
        }
        if (i == 85) {
            constraint.motion.mQuantizeMotionPhase = f;
            return;
        }
        if (i != 87) {
            if (i == 39) {
                constraint.layout.horizontalWeight = f;
                return;
            }
            if (i != 40) {
                switch (i) {
                    case 43:
                        constraint.propertySet.alpha = f;
                        break;
                    case 44:
                        constraint.transform.elevation = f;
                        constraint.transform.applyElevation = true;
                        break;
                    case 45:
                        constraint.transform.rotationX = f;
                        break;
                    case 46:
                        constraint.transform.rotationY = f;
                        break;
                    case 47:
                        constraint.transform.scaleX = f;
                        break;
                    case 48:
                        constraint.transform.scaleY = f;
                        break;
                    case 49:
                        constraint.transform.transformPivotX = f;
                        break;
                    case 50:
                        constraint.transform.transformPivotY = f;
                        break;
                    case 51:
                        constraint.transform.translationX = f;
                        break;
                    case 52:
                        constraint.transform.translationY = f;
                        break;
                    case 53:
                        constraint.transform.translationZ = f;
                        break;
                    default:
                        switch (i) {
                            case 67:
                                constraint.motion.mPathRotate = f;
                                break;
                            case 68:
                                constraint.propertySet.mProgress = f;
                                break;
                            case 69:
                                constraint.layout.widthPercent = f;
                                break;
                            case 70:
                                constraint.layout.heightPercent = f;
                                break;
                        }
                }
                return;
            }
            constraint.layout.verticalWeight = f;
        }
    }

    static /* synthetic */ void Camera2StreamConfigurationMap(androidx.constraintlayout.widget.ConstraintSet.Constraint constraint, int i, java.lang.String str) {
        if (i == 5) {
            constraint.layout.dimensionRatio = str;
            return;
        }
        if (i == 65) {
            constraint.motion.mTransitionEasing = str;
            return;
        }
        if (i == 74) {
            constraint.layout.mReferenceIdString = str;
            constraint.layout.mReferenceIds = null;
        } else if (i == 77) {
            constraint.layout.mConstraintTag = str;
        } else {
            if (i == 87 || i != 90) {
                return;
            }
            constraint.motion.mQuantizeInterpolatorString = str;
        }
    }

    static /* synthetic */ void getHighSpeedVideoFpsRangesFor(androidx.constraintlayout.widget.ConstraintSet.Constraint constraint, int i, boolean z) {
        if (i == 44) {
            constraint.transform.applyElevation = z;
            return;
        }
        if (i == 75) {
            constraint.layout.mBarrierAllowsGoneWidgets = z;
            return;
        }
        if (i != 87) {
            if (i == 80) {
                constraint.layout.constrainedWidth = z;
            } else if (i == 81) {
                constraint.layout.constrainedHeight = z;
            }
        }
    }

    public void parseStringAttributes(androidx.constraintlayout.widget.ConstraintSet.Constraint constraint, java.lang.String str) {
        char[] charArray = str.toCharArray();
        java.util.ArrayList arrayList = new java.util.ArrayList();
        int i = 0;
        boolean z = false;
        for (int i2 = 0; i2 < charArray.length; i2++) {
            char c = charArray[i2];
            if (c == ',' && !z) {
                arrayList.add(new java.lang.String(charArray, i, i2 - i));
                i = i2 + 1;
            } else if (c == '\"') {
                z = !z;
            }
        }
        arrayList.add(new java.lang.String(charArray, i, charArray.length - i));
        java.lang.String[] strArr = (java.lang.String[]) arrayList.toArray(new java.lang.String[arrayList.size()]);
        for (int i3 = 0; i3 < strArr.length; i3++) {
            java.lang.String[] split = strArr[i3].split("=");
            java.lang.String str2 = strArr[i3];
            androidx.constraintlayout.widget.ConstraintSet.Constraint.getHighResolutionOutputSizeshNQ4ISI(constraint, split[0], split[1]);
        }
    }
}
