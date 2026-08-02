package com.paypal.oslo.feature.shaketoreport.ui;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0004\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005"}, d2 = {"Lcom/paypal/oslo/feature/shaketoreport/ui/AnnotationTool;", "", "<init>", "(Ljava/lang/String;I)V", "PEN", "ERASER"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class AnnotationTool {
    public static final com.paypal.oslo.feature.shaketoreport.ui.AnnotationTool ERASER;
    public static final com.paypal.oslo.feature.shaketoreport.ui.AnnotationTool PEN;
    private static final /* synthetic */ com.paypal.oslo.feature.shaketoreport.ui.AnnotationTool[] getHighSpeedVideoFpsRanges;
    private static final /* synthetic */ kotlin.enums.EnumEntries getHighSpeedVideoSizes;

    private AnnotationTool(java.lang.String str, int i) {
    }

    static {
        com.paypal.oslo.feature.shaketoreport.ui.AnnotationTool annotationTool = new com.paypal.oslo.feature.shaketoreport.ui.AnnotationTool("PEN", 0);
        PEN = annotationTool;
        com.paypal.oslo.feature.shaketoreport.ui.AnnotationTool annotationTool2 = new com.paypal.oslo.feature.shaketoreport.ui.AnnotationTool("ERASER", 1);
        ERASER = annotationTool2;
        com.paypal.oslo.feature.shaketoreport.ui.AnnotationTool[] annotationToolArr = {annotationTool, annotationTool2};
        getHighSpeedVideoFpsRanges = annotationToolArr;
        getHighSpeedVideoSizes = kotlin.enums.EnumEntriesKt.enumEntries(annotationToolArr);
    }

    public static com.paypal.oslo.feature.shaketoreport.ui.AnnotationTool[] values() {
        return (com.paypal.oslo.feature.shaketoreport.ui.AnnotationTool[]) getHighSpeedVideoFpsRanges.clone();
    }

    public static com.paypal.oslo.feature.shaketoreport.ui.AnnotationTool valueOf(java.lang.String str) {
        return (com.paypal.oslo.feature.shaketoreport.ui.AnnotationTool) java.lang.Enum.valueOf(com.paypal.oslo.feature.shaketoreport.ui.AnnotationTool.class, str);
    }

    public static kotlin.enums.EnumEntries<com.paypal.oslo.feature.shaketoreport.ui.AnnotationTool> getEntries() {
        return getHighSpeedVideoSizes;
    }
}
