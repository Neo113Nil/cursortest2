package com.miteksystems.misnap.workflow;

@kotlin.Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\u001a\u001b\u0010\u0004\u001a\u0004\u0018\u00010\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001¢\u0006\u0004\b\u0004\u0010\u0005\u001a\u0019\u0010\u0007\u001a\u00020\u0006*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lcom/miteksystems/misnap/core/MiSnapSettings$Workflow;", "Lcom/miteksystems/misnap/core/MiSnapSettings$UseCase;", "useCase", "", "getForcedOrientation", "(Lcom/miteksystems/misnap/core/MiSnapSettings$Workflow;Lcom/miteksystems/misnap/core/MiSnapSettings$UseCase;)Ljava/lang/Integer;", "", "shouldShowExitConfirmationDialog", "(Lcom/miteksystems/misnap/core/MiSnapSettings$Workflow;Lcom/miteksystems/misnap/core/MiSnapSettings$UseCase;)Z"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class WorkflowSettings {

    @kotlin.Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    public final /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f4150a;

        static {
            int[] iArr = new int[com.miteksystems.misnap.core.MiSnapSettings.UseCase.values().length];
            try {
                iArr[com.miteksystems.misnap.core.MiSnapSettings.UseCase.FACE.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                iArr[com.miteksystems.misnap.core.MiSnapSettings.UseCase.NFC.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            try {
                iArr[com.miteksystems.misnap.core.MiSnapSettings.UseCase.VOICE.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused3) {
            }
            try {
                iArr[com.miteksystems.misnap.core.MiSnapSettings.UseCase.CHECK_FRONT.ordinal()] = 4;
            } catch (java.lang.NoSuchFieldError unused4) {
            }
            try {
                iArr[com.miteksystems.misnap.core.MiSnapSettings.UseCase.CHECK_BACK.ordinal()] = 5;
            } catch (java.lang.NoSuchFieldError unused5) {
            }
            try {
                iArr[com.miteksystems.misnap.core.MiSnapSettings.UseCase.PASSPORT.ordinal()] = 6;
            } catch (java.lang.NoSuchFieldError unused6) {
            }
            try {
                iArr[com.miteksystems.misnap.core.MiSnapSettings.UseCase.ID_FRONT.ordinal()] = 7;
            } catch (java.lang.NoSuchFieldError unused7) {
            }
            try {
                iArr[com.miteksystems.misnap.core.MiSnapSettings.UseCase.ID_BACK.ordinal()] = 8;
            } catch (java.lang.NoSuchFieldError unused8) {
            }
            try {
                iArr[com.miteksystems.misnap.core.MiSnapSettings.UseCase.GENERIC_DOCUMENT.ordinal()] = 9;
            } catch (java.lang.NoSuchFieldError unused9) {
            }
            f4150a = iArr;
        }
    }

    public static final boolean shouldShowExitConfirmationDialog(com.miteksystems.misnap.core.MiSnapSettings.Workflow workflow, com.miteksystems.misnap.core.MiSnapSettings.UseCase useCase) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(workflow, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(useCase, "");
        switch (com.miteksystems.misnap.workflow.WorkflowSettings.a.f4150a[useCase.ordinal()]) {
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
                java.lang.Boolean showExitConfirmationDialog = workflow.getShowExitConfirmationDialog();
                if (showExitConfirmationDialog != null) {
                    return showExitConfirmationDialog.booleanValue();
                }
                return false;
            default:
                return false;
        }
    }

    public static final java.lang.Integer getForcedOrientation(com.miteksystems.misnap.core.MiSnapSettings.Workflow workflow, com.miteksystems.misnap.core.MiSnapSettings.UseCase useCase) {
        int i;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(workflow, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(useCase, "");
        java.lang.Integer forceOrientation = workflow.getForceOrientation();
        if (forceOrientation != null) {
            return forceOrientation;
        }
        int i2 = com.miteksystems.misnap.workflow.WorkflowSettings.a.f4150a[useCase.ordinal()];
        if (i2 == 1 || i2 == 2 || i2 == 3) {
            i = 12;
        } else {
            if (i2 != 4 && i2 != 5) {
                return null;
            }
            i = 11;
        }
        return java.lang.Integer.valueOf(i);
    }
}
