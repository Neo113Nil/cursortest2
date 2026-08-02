package com.miteksystems.misnap.controller;

@kotlin.Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\f\u001a\u0019\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001¢\u0006\u0004\b\u0004\u0010\u0005\u001a\u0013\u0010\u0007\u001a\u00020\u0006*\u00020\u0000H\u0000¢\u0006\u0004\b\u0007\u0010\b\u001a\u0019\u0010\n\u001a\u00020\u0000*\u00020\t2\u0006\u0010\u0002\u001a\u00020\u0001¢\u0006\u0004\b\n\u0010\u000b\u001a\u0019\u0010\r\u001a\u00020\f*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001¢\u0006\u0004\b\r\u0010\u000e\u001a\u0019\u0010\u000f\u001a\u00020\f*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001¢\u0006\u0004\b\u000f\u0010\u000e\u001a\u0019\u0010\u0010\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001¢\u0006\u0004\b\u0010\u0010\u0005\u001a\u0019\u0010\u0012\u001a\u00020\u0011*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001¢\u0006\u0004\b\u0012\u0010\u0013\"\u0014\u0010\u0014\u001a\u00020\f8\u0000X\u0080T¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015\"\u0014\u0010\u0016\u001a\u00020\f8\u0000X\u0080T¢\u0006\u0006\n\u0004\b\u0016\u0010\u0015\"\u0014\u0010\u0017\u001a\u00020\f8\u0000X\u0080T¢\u0006\u0006\n\u0004\b\u0017\u0010\u0015\"\u0014\u0010\u0018\u001a\u00020\f8\u0000X\u0080T¢\u0006\u0006\n\u0004\b\u0018\u0010\u0015\"\u001a\u0010\u001d\u001a\u00020\u00118\u0001X\u0080\u0004¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001c"}, d2 = {"Lcom/miteksystems/misnap/core/MiSnapSettings$Analysis;", "Lcom/miteksystems/misnap/core/MiSnapSettings$UseCase;", "useCase", "", "shouldEnableAiBasedRts", "(Lcom/miteksystems/misnap/core/MiSnapSettings$Analysis;Lcom/miteksystems/misnap/core/MiSnapSettings$UseCase;)Z", "Lcom/miteksystems/misnap/core/MiSnapSettings$Analysis$AiBasedRtsPayloadSize;", "getAiBasedRtsPayloadSize", "(Lcom/miteksystems/misnap/core/MiSnapSettings$Analysis;)Lcom/miteksystems/misnap/core/MiSnapSettings$Analysis$AiBasedRtsPayloadSize;", "Lcom/miteksystems/misnap/core/MiSnapSettings$Analysis$Companion;", com.paypal.oslo.feature.activity.domain.base.constants.ActivityConstants.ActivityLedgerFilters.KEY_DEFAULT, "(Lcom/miteksystems/misnap/core/MiSnapSettings$Analysis$Companion;Lcom/miteksystems/misnap/core/MiSnapSettings$UseCase;)Lcom/miteksystems/misnap/core/MiSnapSettings$Analysis;", "", "getImageQuality", "(Lcom/miteksystems/misnap/core/MiSnapSettings$Analysis;Lcom/miteksystems/misnap/core/MiSnapSettings$UseCase;)I", "getInitialDelay", "isAutoTrigger", "Lcom/miteksystems/misnap/core/MiSnapSettings$Analysis$MotionDetectorSensitivity;", "getMotionDetectorSensitivity", "(Lcom/miteksystems/misnap/core/MiSnapSettings$Analysis;Lcom/miteksystems/misnap/core/MiSnapSettings$UseCase;)Lcom/miteksystems/misnap/core/MiSnapSettings$Analysis$MotionDetectorSensitivity;", "DEFAULT_IMAGE_QUALITY_FACE_IAD_SMALL", com.visa.cbp.getEncExpo.warmup, "DEFAULT_IMAGE_QUALITY_FACE_IAD_NORMAL", "DEFAULT_BARCODE_FACE_INITIAL_DELAY", "DEFAULT_DOCUMENT_INITIAL_DELAY", "a", "Lcom/miteksystems/misnap/core/MiSnapSettings$Analysis$MotionDetectorSensitivity;", "getDEFAULT_DEVICE_MOTION_SENSITIVITY", "()Lcom/miteksystems/misnap/core/MiSnapSettings$Analysis$MotionDetectorSensitivity;", "DEFAULT_DEVICE_MOTION_SENSITIVITY"}, k = 2, mv = {1, 8, 0})
/* loaded from: classes10.dex */
public final class AnalysisSettings {
    public static final /* synthetic */ int DEFAULT_BARCODE_FACE_INITIAL_DELAY = 0;
    public static final /* synthetic */ int DEFAULT_DOCUMENT_INITIAL_DELAY = 1000;
    public static final /* synthetic */ int DEFAULT_IMAGE_QUALITY_FACE_IAD_NORMAL = 100;
    public static final /* synthetic */ int DEFAULT_IMAGE_QUALITY_FACE_IAD_SMALL = 70;

    /* renamed from: a, reason: collision with root package name */
    private static final /* synthetic */ com.miteksystems.misnap.core.MiSnapSettings.Analysis.MotionDetectorSensitivity f3973a = com.miteksystems.misnap.core.MiSnapSettings.Analysis.MotionDetectorSensitivity.HIGH;

    public static final boolean shouldEnableAiBasedRts(com.miteksystems.misnap.core.MiSnapSettings.Analysis analysis, com.miteksystems.misnap.core.MiSnapSettings.UseCase useCase) {
        java.lang.Boolean enableAiBasedRts;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(analysis, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(useCase, "");
        if (useCase != com.miteksystems.misnap.core.MiSnapSettings.UseCase.FACE || (enableAiBasedRts = analysis.getEnableAiBasedRts()) == null) {
            return false;
        }
        return enableAiBasedRts.booleanValue();
    }

    public static final boolean isAutoTrigger(com.miteksystems.misnap.core.MiSnapSettings.Analysis analysis, com.miteksystems.misnap.core.MiSnapSettings.UseCase useCase) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(analysis, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(useCase, "");
        int i = com.miteksystems.misnap.controller.AnalysisSettings.a.f3974a[useCase.ordinal()];
        if (i != 1) {
            if (i != 4) {
                if (analysis.document.getTrigger() == null || analysis.document.getTrigger() == com.miteksystems.misnap.core.MiSnapSettings.Analysis.Document.Trigger.MANUAL) {
                    return false;
                }
            } else if (analysis.barcode.getTrigger() == null || analysis.barcode.getTrigger() == com.miteksystems.misnap.core.MiSnapSettings.Analysis.Barcode.Trigger.MANUAL) {
                return false;
            }
        } else if (analysis.face.getTrigger() == null || analysis.face.getTrigger() == com.miteksystems.misnap.core.MiSnapSettings.Analysis.Face.Trigger.MANUAL) {
            return false;
        }
        return true;
    }

    public static final com.miteksystems.misnap.core.MiSnapSettings.Analysis.MotionDetectorSensitivity getMotionDetectorSensitivity(com.miteksystems.misnap.core.MiSnapSettings.Analysis analysis, com.miteksystems.misnap.core.MiSnapSettings.UseCase useCase) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(analysis, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(useCase, "");
        int i = com.miteksystems.misnap.controller.AnalysisSettings.a.f3974a[useCase.ordinal()];
        if (i == 1 || i == 2 || i == 3 || i == 4) {
            return com.miteksystems.misnap.core.MiSnapSettings.Analysis.MotionDetectorSensitivity.NONE;
        }
        com.miteksystems.misnap.core.MiSnapSettings.Analysis.MotionDetectorSensitivity motionDetectorSensitivity = analysis.getMotionDetectorSensitivity();
        return motionDetectorSensitivity == null ? f3973a : motionDetectorSensitivity;
    }

    public static final int getInitialDelay(com.miteksystems.misnap.core.MiSnapSettings.Analysis analysis, com.miteksystems.misnap.core.MiSnapSettings.UseCase useCase) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(analysis, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(useCase, "");
        java.lang.Integer initialDelay = analysis.getInitialDelay();
        return (initialDelay == null || initialDelay.intValue() <= 0) ? (useCase == com.miteksystems.misnap.core.MiSnapSettings.UseCase.FACE || useCase == com.miteksystems.misnap.core.MiSnapSettings.UseCase.BARCODE) ? 0 : 1000 : initialDelay.intValue();
    }

    public static final int getImageQuality(com.miteksystems.misnap.core.MiSnapSettings.Analysis analysis, com.miteksystems.misnap.core.MiSnapSettings.UseCase useCase) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(analysis, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(useCase, "");
        java.lang.Integer jpgQuality = analysis.getJpgQuality();
        if (useCase == com.miteksystems.misnap.core.MiSnapSettings.UseCase.FACE && shouldEnableAiBasedRts(analysis, useCase)) {
            return getAiBasedRtsPayloadSize(analysis) == com.miteksystems.misnap.core.MiSnapSettings.Analysis.AiBasedRtsPayloadSize.SMALL ? 70 : 100;
        }
        if (jpgQuality != null && new kotlin.ranges.IntRange(0, 100).contains(jpgQuality.intValue()) && (!new kotlin.ranges.IntRange(0, 49).contains(jpgQuality.intValue()) || useCase == com.miteksystems.misnap.core.MiSnapSettings.UseCase.CHECK_FRONT || useCase == com.miteksystems.misnap.core.MiSnapSettings.UseCase.CHECK_BACK)) {
            return jpgQuality.intValue();
        }
        java.lang.Integer jpgQuality2 = m10905default(com.miteksystems.misnap.core.MiSnapSettings.Analysis.INSTANCE, useCase).getJpgQuality();
        kotlin.jvm.internal.Intrinsics.checkNotNull(jpgQuality2);
        return jpgQuality2.intValue();
    }

    public static final com.miteksystems.misnap.core.MiSnapSettings.Analysis.MotionDetectorSensitivity getDEFAULT_DEVICE_MOTION_SENSITIVITY() {
        return f3973a;
    }

    public static final /* synthetic */ com.miteksystems.misnap.core.MiSnapSettings.Analysis.AiBasedRtsPayloadSize getAiBasedRtsPayloadSize(com.miteksystems.misnap.core.MiSnapSettings.Analysis analysis) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(analysis, "");
        return com.miteksystems.misnap.core.MiSnapSettings.Analysis.AiBasedRtsPayloadSize.SMALL;
    }

    @kotlin.Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    public final /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f3974a;

        static {
            int[] iArr = new int[com.miteksystems.misnap.core.MiSnapSettings.UseCase.values().length];
            try {
                iArr[com.miteksystems.misnap.core.MiSnapSettings.UseCase.FACE.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                iArr[com.miteksystems.misnap.core.MiSnapSettings.UseCase.CHECK_FRONT.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            try {
                iArr[com.miteksystems.misnap.core.MiSnapSettings.UseCase.CHECK_BACK.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused3) {
            }
            try {
                iArr[com.miteksystems.misnap.core.MiSnapSettings.UseCase.BARCODE.ordinal()] = 4;
            } catch (java.lang.NoSuchFieldError unused4) {
            }
            f3974a = iArr;
        }
    }

    /* renamed from: default, reason: not valid java name */
    public static final com.miteksystems.misnap.core.MiSnapSettings.Analysis m10905default(com.miteksystems.misnap.core.MiSnapSettings.Analysis.Companion companion, com.miteksystems.misnap.core.MiSnapSettings.UseCase useCase) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(companion, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(useCase, "");
        com.miteksystems.misnap.core.MiSnapSettings.Analysis analysis = new com.miteksystems.misnap.core.MiSnapSettings.Analysis();
        int i = com.miteksystems.misnap.controller.AnalysisSettings.a.f3974a[useCase.ordinal()];
        analysis.setJpgQuality(java.lang.Integer.valueOf(i != 1 ? (i == 2 || i == 3) ? 30 : 90 : 95));
        return analysis;
    }
}
