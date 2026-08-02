package androidx.constraintlayout.widget;

/* loaded from: classes7.dex */
public class ConstraintLayoutStatistics {
    public static final int DURATION_OF_CHILD_MEASURES = 5;
    public static final int DURATION_OF_LAYOUT = 7;
    public static final int DURATION_OF_MEASURES = 6;
    public static final int NUMBER_OF_CHILD_MEASURES = 4;
    public static final int NUMBER_OF_CHILD_VIEWS = 3;
    public static final int NUMBER_OF_EQUATIONS = 9;
    public static final int NUMBER_OF_LAYOUTS = 1;
    public static final int NUMBER_OF_ON_MEASURES = 2;
    public static final int NUMBER_OF_SIMPLE_EQUATIONS = 10;
    public static final int NUMBER_OF_VARIABLES = 8;
    private static int getHighSpeedVideoFpsRangesFor = 25;
    private static final java.lang.String getHighSpeedVideoSizes = new java.lang.String(new char[getHighSpeedVideoFpsRangesFor]).replace((char) 0, ' ');
    androidx.constraintlayout.widget.ConstraintLayout getHighResolutionOutputSizeshNQ4ISI;
    private final androidx.constraintlayout.core.Metrics getHighSpeedVideoFpsRanges;

    public ConstraintLayoutStatistics(androidx.constraintlayout.widget.ConstraintLayout constraintLayout) {
        this.getHighSpeedVideoFpsRanges = new androidx.constraintlayout.core.Metrics();
        attach(constraintLayout);
    }

    public ConstraintLayoutStatistics(androidx.constraintlayout.widget.ConstraintLayoutStatistics constraintLayoutStatistics) {
        androidx.constraintlayout.core.Metrics metrics = new androidx.constraintlayout.core.Metrics();
        this.getHighSpeedVideoFpsRanges = metrics;
        metrics.copy(constraintLayoutStatistics.getHighSpeedVideoFpsRanges);
    }

    public void attach(androidx.constraintlayout.widget.ConstraintLayout constraintLayout) {
        constraintLayout.fillMetrics(this.getHighSpeedVideoFpsRanges);
        this.getHighResolutionOutputSizeshNQ4ISI = constraintLayout;
    }

    public void detach() {
        androidx.constraintlayout.widget.ConstraintLayout constraintLayout = this.getHighResolutionOutputSizeshNQ4ISI;
        if (constraintLayout != null) {
            constraintLayout.fillMetrics(null);
        }
    }

    public void reset() {
        this.getHighSpeedVideoFpsRanges.reset();
    }

    /* renamed from: clone, reason: merged with bridge method [inline-methods] */
    public androidx.constraintlayout.widget.ConstraintLayoutStatistics m9055clone() {
        return new androidx.constraintlayout.widget.ConstraintLayoutStatistics(this);
    }

    private static java.lang.String getHighResolutionOutputSizeshNQ4ISI(java.text.DecimalFormat decimalFormat, float f) {
        java.lang.String replace = new java.lang.String(new char[7]).replace((char) 0, ' ');
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append(replace);
        sb.append(decimalFormat.format(f));
        java.lang.String obj = sb.toString();
        return obj.substring(obj.length() - 7);
    }

    public void logSummary(java.lang.String str) {
        getHighSpeedVideoFpsRangesFor();
    }

    private void getHighSpeedVideoFpsRangesFor() {
        java.lang.StackTraceElement stackTraceElement = new java.lang.Throwable().getStackTrace()[2];
        java.text.DecimalFormat decimalFormat = new java.text.DecimalFormat("###.000");
        getHighResolutionOutputSizeshNQ4ISI(decimalFormat, 5);
        getHighResolutionOutputSizeshNQ4ISI(decimalFormat, 7);
        getHighResolutionOutputSizeshNQ4ISI(decimalFormat, 6);
        getHighResolutionOutputSizeshNQ4ISI(1);
        getHighResolutionOutputSizeshNQ4ISI(2);
        getHighResolutionOutputSizeshNQ4ISI(3);
        getHighResolutionOutputSizeshNQ4ISI(4);
        getHighResolutionOutputSizeshNQ4ISI(8);
        getHighResolutionOutputSizeshNQ4ISI(9);
        getHighResolutionOutputSizeshNQ4ISI(10);
    }

    private java.lang.String getHighResolutionOutputSizeshNQ4ISI(java.text.DecimalFormat decimalFormat, int i) {
        java.lang.String highResolutionOutputSizeshNQ4ISI = getHighResolutionOutputSizeshNQ4ISI(decimalFormat, getValue(i) * 1.0E-6f);
        java.lang.String Camera2StreamConfigurationMap = Camera2StreamConfigurationMap(i);
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append(getHighSpeedVideoSizes);
        sb.append(Camera2StreamConfigurationMap);
        java.lang.String obj = sb.toString();
        java.lang.String substring = obj.substring(obj.length() - getHighSpeedVideoFpsRangesFor);
        java.lang.StringBuilder sb2 = new java.lang.StringBuilder();
        sb2.append(substring);
        sb2.append(com.paypal.oslo.feature.activity.domain.base.constants.ActivityConstants.UIConstants.EQUALS_SIGN_WITH_SPACES);
        java.lang.String obj2 = sb2.toString();
        java.lang.StringBuilder sb3 = new java.lang.StringBuilder("CL Perf: ");
        sb3.append(obj2);
        sb3.append(highResolutionOutputSizeshNQ4ISI);
        return sb3.toString();
    }

    private java.lang.String getHighResolutionOutputSizeshNQ4ISI(int i) {
        java.lang.String l = java.lang.Long.toString(getValue(i));
        java.lang.String Camera2StreamConfigurationMap = Camera2StreamConfigurationMap(i);
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append(getHighSpeedVideoSizes);
        sb.append(Camera2StreamConfigurationMap);
        java.lang.String obj = sb.toString();
        java.lang.String substring = obj.substring(obj.length() - getHighSpeedVideoFpsRangesFor);
        java.lang.StringBuilder sb2 = new java.lang.StringBuilder();
        sb2.append(substring);
        sb2.append(com.paypal.oslo.feature.activity.domain.base.constants.ActivityConstants.UIConstants.EQUALS_SIGN_WITH_SPACES);
        java.lang.String obj2 = sb2.toString();
        java.lang.StringBuilder sb3 = new java.lang.StringBuilder("CL Perf: ");
        sb3.append(obj2);
        sb3.append(l);
        return sb3.toString();
    }

    private java.lang.String getHighResolutionOutputSizeshNQ4ISI(java.text.DecimalFormat decimalFormat, androidx.constraintlayout.widget.ConstraintLayoutStatistics constraintLayoutStatistics, int i) {
        java.lang.String highResolutionOutputSizeshNQ4ISI = getHighResolutionOutputSizeshNQ4ISI(decimalFormat, getValue(i) * 1.0E-6f);
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append(highResolutionOutputSizeshNQ4ISI);
        sb.append(" -> ");
        sb.append(getHighResolutionOutputSizeshNQ4ISI(decimalFormat, constraintLayoutStatistics.getValue(i) * 1.0E-6f));
        sb.append("ms");
        java.lang.String obj = sb.toString();
        java.lang.String Camera2StreamConfigurationMap = Camera2StreamConfigurationMap(i);
        java.lang.StringBuilder sb2 = new java.lang.StringBuilder();
        sb2.append(getHighSpeedVideoSizes);
        sb2.append(Camera2StreamConfigurationMap);
        java.lang.String obj2 = sb2.toString();
        java.lang.String substring = obj2.substring(obj2.length() - getHighSpeedVideoFpsRangesFor);
        java.lang.StringBuilder sb3 = new java.lang.StringBuilder();
        sb3.append(substring);
        sb3.append(com.paypal.oslo.feature.activity.domain.base.constants.ActivityConstants.UIConstants.EQUALS_SIGN_WITH_SPACES);
        java.lang.String obj3 = sb3.toString();
        java.lang.StringBuilder sb4 = new java.lang.StringBuilder("CL Perf: ");
        sb4.append(obj3);
        sb4.append(obj);
        return sb4.toString();
    }

    private java.lang.String getHighSpeedVideoFpsRanges(androidx.constraintlayout.widget.ConstraintLayoutStatistics constraintLayoutStatistics, int i) {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append(getValue(i));
        sb.append(" -> ");
        sb.append(constraintLayoutStatistics.getValue(i));
        java.lang.String obj = sb.toString();
        java.lang.String Camera2StreamConfigurationMap = Camera2StreamConfigurationMap(i);
        java.lang.StringBuilder sb2 = new java.lang.StringBuilder();
        sb2.append(getHighSpeedVideoSizes);
        sb2.append(Camera2StreamConfigurationMap);
        java.lang.String obj2 = sb2.toString();
        java.lang.String substring = obj2.substring(obj2.length() - getHighSpeedVideoFpsRangesFor);
        java.lang.StringBuilder sb3 = new java.lang.StringBuilder();
        sb3.append(substring);
        sb3.append(com.paypal.oslo.feature.activity.domain.base.constants.ActivityConstants.UIConstants.EQUALS_SIGN_WITH_SPACES);
        java.lang.String obj3 = sb3.toString();
        java.lang.StringBuilder sb4 = new java.lang.StringBuilder("CL Perf: ");
        sb4.append(obj3);
        sb4.append(obj);
        return sb4.toString();
    }

    public void logSummary(java.lang.String str, androidx.constraintlayout.widget.ConstraintLayoutStatistics constraintLayoutStatistics) {
        if (constraintLayoutStatistics == null) {
            getHighSpeedVideoFpsRangesFor();
            return;
        }
        java.text.DecimalFormat decimalFormat = new java.text.DecimalFormat("###.000");
        java.lang.StackTraceElement stackTraceElement = new java.lang.Throwable().getStackTrace()[1];
        getHighResolutionOutputSizeshNQ4ISI(decimalFormat, constraintLayoutStatistics, 5);
        getHighResolutionOutputSizeshNQ4ISI(decimalFormat, constraintLayoutStatistics, 7);
        getHighResolutionOutputSizeshNQ4ISI(decimalFormat, constraintLayoutStatistics, 6);
        getHighSpeedVideoFpsRanges(constraintLayoutStatistics, 1);
        getHighSpeedVideoFpsRanges(constraintLayoutStatistics, 2);
        getHighSpeedVideoFpsRanges(constraintLayoutStatistics, 3);
        getHighSpeedVideoFpsRanges(constraintLayoutStatistics, 4);
        getHighSpeedVideoFpsRanges(constraintLayoutStatistics, 8);
        getHighSpeedVideoFpsRanges(constraintLayoutStatistics, 9);
        getHighSpeedVideoFpsRanges(constraintLayoutStatistics, 10);
    }

    public long getValue(int i) {
        switch (i) {
            case 1:
                return this.getHighSpeedVideoFpsRanges.mNumberOfLayouts;
            case 2:
                return this.getHighSpeedVideoFpsRanges.mMeasureCalls;
            case 3:
                return this.getHighSpeedVideoFpsRanges.mChildCount;
            case 4:
                return this.getHighSpeedVideoFpsRanges.mNumberOfMeasures;
            case 5:
                return this.getHighSpeedVideoFpsRanges.measuresWidgetsDuration;
            case 6:
                return this.getHighSpeedVideoFpsRanges.mMeasureDuration;
            case 7:
                return this.getHighSpeedVideoFpsRanges.measuresLayoutDuration;
            case 8:
                return this.getHighSpeedVideoFpsRanges.mVariables;
            case 9:
                return this.getHighSpeedVideoFpsRanges.mEquations;
            case 10:
                return this.getHighSpeedVideoFpsRanges.mSimpleEquations;
            default:
                return 0L;
        }
    }

    private static java.lang.String Camera2StreamConfigurationMap(int i) {
        switch (i) {
            case 1:
                return "NumberOfLayouts";
            case 2:
                return "MeasureCalls";
            case 3:
                return "ChildCount";
            case 4:
                return "ChildrenMeasures";
            case 5:
                return "MeasuresWidgetsDuration ";
            case 6:
                return "MeasureDuration";
            case 7:
                return "MeasuresLayoutDuration";
            case 8:
                return "SolverVariables";
            case 9:
                return "SolverEquations";
            case 10:
                return "SimpleEquations";
            default:
                return "";
        }
    }
}
