package com.miteksystems.misnap.workflow.util;

@kotlin.Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J'\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH\u0007¢\u0006\u0004\b\u000b\u0010\fJ\u001f\u0010\r\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u000f\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u000f\u0010\u0010J\u001f\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u0013H\u0002¢\u0006\u0004\b\u0016\u0010\u0017J\u001f\u0010\u0019\u001a\u00020\u00152\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u0018H\u0002¢\u0006\u0004\b\u0019\u0010\u001aJ\u0017\u0010\u001b\u001a\u00020\u00152\u0006\u0010\u0012\u001a\u00020\u0011H\u0002¢\u0006\u0004\b\u001b\u0010\u001c"}, d2 = {"Lcom/miteksystems/misnap/workflow/util/SharedPrefsUtil;", "", "<init>", "()V", "Landroid/content/Context;", "context", "Lcom/miteksystems/misnap/core/MiSnapSettings;", "settings", "", "shouldSkip", "", "saveSkipHelpScreenPreference", "(Landroid/content/Context;Lcom/miteksystems/misnap/core/MiSnapSettings;Z)V", "shouldSkipHelpScreen", "(Landroid/content/Context;Lcom/miteksystems/misnap/core/MiSnapSettings;)Z", "clearSharedPreferences", "(Landroid/content/Context;)V", "Lcom/miteksystems/misnap/core/MiSnapSettings$UseCase;", "p0", "Lcom/miteksystems/misnap/core/MiSnapSettings$Analysis$Document$Trigger;", "p1", "", "Camera2StreamConfigurationMap", "(Lcom/miteksystems/misnap/core/MiSnapSettings$UseCase;Lcom/miteksystems/misnap/core/MiSnapSettings$Analysis$Document$Trigger;)Ljava/lang/String;", "Lcom/miteksystems/misnap/core/MiSnapSettings$Analysis$Barcode$Trigger;", "getHighResolutionOutputSizeshNQ4ISI", "(Lcom/miteksystems/misnap/core/MiSnapSettings$UseCase;Lcom/miteksystems/misnap/core/MiSnapSettings$Analysis$Barcode$Trigger;)Ljava/lang/String;", "getHighSpeedVideoFpsRangesFor", "(Lcom/miteksystems/misnap/core/MiSnapSettings$UseCase;)Ljava/lang/String;"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes10.dex */
public final class SharedPrefsUtil {
    public static final com.miteksystems.misnap.workflow.util.SharedPrefsUtil INSTANCE = new com.miteksystems.misnap.workflow.util.SharedPrefsUtil();

    private static java.lang.String getHighSpeedVideoFpsRangesFor(com.miteksystems.misnap.core.MiSnapSettings.UseCase p0) {
        switch (com.miteksystems.misnap.workflow.util.SharedPrefsUtil.a.f4214a[p0.ordinal()]) {
            case 1:
                return "FACE";
            case 2:
                return "BARCODE";
            case 3:
                return "VOICE";
            case 4:
                return "IDCARDFRONT";
            case 5:
                return "IDCARDBACK";
            case 6:
                return com.daon.dmds.utils.face.FaceFinderImpl.PASSPORT_DOCUMENT_CLASS;
            case 7:
                return "CHECKFRONT";
            case 8:
                return "CHECKBACK";
            case 9:
                return "GENERIC_DOCUMENT";
            case 10:
                return "NFC";
            default:
                throw new kotlin.NoWhenBranchMatchedException();
        }
    }

    private static java.lang.String getHighResolutionOutputSizeshNQ4ISI(com.miteksystems.misnap.core.MiSnapSettings.UseCase p0, com.miteksystems.misnap.core.MiSnapSettings.Analysis.Barcode.Trigger p1) {
        java.lang.String str;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("PREF_FIRST_TIME_");
        int i = com.miteksystems.misnap.workflow.util.SharedPrefsUtil.a.c[p1.ordinal()];
        if (i == 1) {
            str = "VIDEO";
        } else {
            if (i != 2) {
                throw new kotlin.NoWhenBranchMatchedException();
            }
            str = "MANUAL";
        }
        sb.append(str);
        sb.append("_USER_");
        sb.append(getHighSpeedVideoFpsRangesFor(p0));
        sb.append("_KEY");
        return sb.toString();
    }

    private static java.lang.String Camera2StreamConfigurationMap(com.miteksystems.misnap.core.MiSnapSettings.UseCase p0, com.miteksystems.misnap.core.MiSnapSettings.Analysis.Document.Trigger p1) {
        java.lang.String str;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("PREF_FIRST_TIME_");
        int i = com.miteksystems.misnap.workflow.util.SharedPrefsUtil.a.b[p1.ordinal()];
        if (i == 1) {
            str = "VIDEO";
        } else {
            if (i != 2) {
                throw new kotlin.NoWhenBranchMatchedException();
            }
            str = "MANUAL";
        }
        sb.append(str);
        sb.append("_USER_");
        sb.append(getHighSpeedVideoFpsRangesFor(p0));
        sb.append("_KEY");
        return sb.toString();
    }

    @kotlin.jvm.JvmStatic
    public static final void saveSkipHelpScreenPreference(android.content.Context context, com.miteksystems.misnap.core.MiSnapSettings settings, boolean shouldSkip) {
        java.lang.String obj;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(settings, "");
        int i = com.miteksystems.misnap.workflow.util.SharedPrefsUtil.a.f4214a[settings.getUseCase().ordinal()];
        if (i == 1) {
            com.miteksystems.misnap.core.MiSnapSettings.Analysis.Face.Trigger trigger = settings.analysis.face.getTrigger();
            if (trigger == null) {
                trigger = com.miteksystems.misnap.core.MiSnapSettings.Analysis.Face.Trigger.MANUAL;
            }
            com.miteksystems.misnap.core.MiSnapSettings.UseCase useCase = settings.getUseCase();
            java.lang.StringBuilder sb = new java.lang.StringBuilder("PREF_FIRST_TIME_");
            sb.append(trigger);
            sb.append("_USER_");
            sb.append(useCase);
            sb.append("_KEY");
            obj = sb.toString();
        } else if (i == 2) {
            com.miteksystems.misnap.core.MiSnapSettings.Analysis.Barcode.Trigger trigger2 = settings.analysis.barcode.getTrigger();
            if (trigger2 == null) {
                trigger2 = com.miteksystems.misnap.core.MiSnapSettings.Analysis.Barcode.Trigger.MANUAL;
            }
            obj = getHighResolutionOutputSizeshNQ4ISI(settings.getUseCase(), trigger2);
        } else if (i != 3) {
            com.miteksystems.misnap.core.MiSnapSettings.Analysis.Document.Trigger trigger3 = settings.analysis.document.getTrigger();
            if (trigger3 == null) {
                trigger3 = com.miteksystems.misnap.core.MiSnapSettings.Analysis.Document.Trigger.MANUAL;
            }
            obj = Camera2StreamConfigurationMap(settings.getUseCase(), trigger3);
        } else {
            com.miteksystems.misnap.core.MiSnapSettings.Voice.Flow flow = settings.voice.getCom.paypal.oslo.feature.p2p.domain.constants.P2pConstants.Log.Attributes.FLOW java.lang.String();
            if (flow == null) {
                flow = com.miteksystems.misnap.core.MiSnapSettings.Voice.Flow.ENROLLMENT;
            }
            com.miteksystems.misnap.core.MiSnapSettings.UseCase useCase2 = settings.getUseCase();
            java.lang.StringBuilder sb2 = new java.lang.StringBuilder("PREF_FIRST_TIME_AUTO_USER_");
            sb2.append(useCase2);
            sb2.append('_');
            sb2.append(flow);
            sb2.append("_FLOW_KEY");
            obj = sb2.toString();
        }
        context.getSharedPreferences("MiSnapWorkflowSettings", 0).edit().putBoolean(obj, shouldSkip).apply();
    }

    @kotlin.jvm.JvmStatic
    public static final boolean shouldSkipHelpScreen(android.content.Context context, com.miteksystems.misnap.core.MiSnapSettings settings) {
        java.lang.String obj;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(settings, "");
        int i = com.miteksystems.misnap.workflow.util.SharedPrefsUtil.a.f4214a[settings.getUseCase().ordinal()];
        if (i == 1) {
            com.miteksystems.misnap.core.MiSnapSettings.Analysis.Face.Trigger trigger = settings.analysis.face.getTrigger();
            if (trigger == null) {
                trigger = com.miteksystems.misnap.core.MiSnapSettings.Analysis.Face.Trigger.MANUAL;
            }
            com.miteksystems.misnap.core.MiSnapSettings.UseCase useCase = settings.getUseCase();
            java.lang.StringBuilder sb = new java.lang.StringBuilder("PREF_FIRST_TIME_");
            sb.append(trigger);
            sb.append("_USER_");
            sb.append(useCase);
            sb.append("_KEY");
            obj = sb.toString();
        } else if (i == 2) {
            com.miteksystems.misnap.core.MiSnapSettings.Analysis.Barcode.Trigger trigger2 = settings.analysis.barcode.getTrigger();
            if (trigger2 == null) {
                trigger2 = com.miteksystems.misnap.core.MiSnapSettings.Analysis.Barcode.Trigger.MANUAL;
            }
            obj = getHighResolutionOutputSizeshNQ4ISI(settings.getUseCase(), trigger2);
        } else if (i != 3) {
            com.miteksystems.misnap.core.MiSnapSettings.Analysis.Document.Trigger trigger3 = settings.analysis.document.getTrigger();
            if (trigger3 == null) {
                trigger3 = com.miteksystems.misnap.core.MiSnapSettings.Analysis.Document.Trigger.MANUAL;
            }
            obj = Camera2StreamConfigurationMap(settings.getUseCase(), trigger3);
        } else {
            com.miteksystems.misnap.core.MiSnapSettings.Voice.Flow flow = settings.voice.getCom.paypal.oslo.feature.p2p.domain.constants.P2pConstants.Log.Attributes.FLOW java.lang.String();
            if (flow == null) {
                flow = com.miteksystems.misnap.core.MiSnapSettings.Voice.Flow.ENROLLMENT;
            }
            com.miteksystems.misnap.core.MiSnapSettings.UseCase useCase2 = settings.getUseCase();
            java.lang.StringBuilder sb2 = new java.lang.StringBuilder("PREF_FIRST_TIME_AUTO_USER_");
            sb2.append(useCase2);
            sb2.append('_');
            sb2.append(flow);
            sb2.append("_FLOW_KEY");
            obj = sb2.toString();
        }
        return context.getSharedPreferences("MiSnapWorkflowSettings", 0).getBoolean(obj, false);
    }

    @kotlin.jvm.JvmStatic
    public static final void clearSharedPreferences(android.content.Context context) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "");
        context.getSharedPreferences("MiSnapWorkflowSettings", 0).edit().clear().apply();
    }

    @kotlin.Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    public final /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f4214a;
        public static final /* synthetic */ int[] b;
        public static final /* synthetic */ int[] c;

        static {
            int[] iArr = new int[com.miteksystems.misnap.core.MiSnapSettings.UseCase.values().length];
            try {
                iArr[com.miteksystems.misnap.core.MiSnapSettings.UseCase.FACE.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                iArr[com.miteksystems.misnap.core.MiSnapSettings.UseCase.BARCODE.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            try {
                iArr[com.miteksystems.misnap.core.MiSnapSettings.UseCase.VOICE.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused3) {
            }
            try {
                iArr[com.miteksystems.misnap.core.MiSnapSettings.UseCase.ID_FRONT.ordinal()] = 4;
            } catch (java.lang.NoSuchFieldError unused4) {
            }
            try {
                iArr[com.miteksystems.misnap.core.MiSnapSettings.UseCase.ID_BACK.ordinal()] = 5;
            } catch (java.lang.NoSuchFieldError unused5) {
            }
            try {
                iArr[com.miteksystems.misnap.core.MiSnapSettings.UseCase.PASSPORT.ordinal()] = 6;
            } catch (java.lang.NoSuchFieldError unused6) {
            }
            try {
                iArr[com.miteksystems.misnap.core.MiSnapSettings.UseCase.CHECK_FRONT.ordinal()] = 7;
            } catch (java.lang.NoSuchFieldError unused7) {
            }
            try {
                iArr[com.miteksystems.misnap.core.MiSnapSettings.UseCase.CHECK_BACK.ordinal()] = 8;
            } catch (java.lang.NoSuchFieldError unused8) {
            }
            try {
                iArr[com.miteksystems.misnap.core.MiSnapSettings.UseCase.GENERIC_DOCUMENT.ordinal()] = 9;
            } catch (java.lang.NoSuchFieldError unused9) {
            }
            try {
                iArr[com.miteksystems.misnap.core.MiSnapSettings.UseCase.NFC.ordinal()] = 10;
            } catch (java.lang.NoSuchFieldError unused10) {
            }
            f4214a = iArr;
            int[] iArr2 = new int[com.miteksystems.misnap.core.MiSnapSettings.Analysis.Document.Trigger.values().length];
            try {
                iArr2[com.miteksystems.misnap.core.MiSnapSettings.Analysis.Document.Trigger.AUTO.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused11) {
            }
            try {
                iArr2[com.miteksystems.misnap.core.MiSnapSettings.Analysis.Document.Trigger.MANUAL.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused12) {
            }
            b = iArr2;
            int[] iArr3 = new int[com.miteksystems.misnap.core.MiSnapSettings.Analysis.Barcode.Trigger.values().length];
            try {
                iArr3[com.miteksystems.misnap.core.MiSnapSettings.Analysis.Barcode.Trigger.AUTO.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused13) {
            }
            try {
                iArr3[com.miteksystems.misnap.core.MiSnapSettings.Analysis.Barcode.Trigger.MANUAL.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused14) {
            }
            c = iArr3;
        }
    }

    private SharedPrefsUtil() {
    }
}
