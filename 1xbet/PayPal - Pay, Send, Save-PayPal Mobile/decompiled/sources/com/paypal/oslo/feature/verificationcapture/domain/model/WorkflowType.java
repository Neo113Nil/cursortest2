package com.paypal.oslo.feature.verificationcapture.domain.model;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@kotlin.Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\b\n\u0002\b\u000b\b\u0086\u0001\u0018\u0000 \n2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\nB\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0017\u0010\u0006\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\tj\u0002\b\u000bj\u0002\b\fj\u0002\b\r"}, d2 = {"Lcom/paypal/oslo/feature/verificationcapture/domain/model/WorkflowType;", "", "", "p0", "<init>", "(Ljava/lang/String;II)V", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, com.visa.cbp.getEncExpo.warmup, "getValue", "()I", "Companion", "DOCUMENT_UPLOAD", "SELFIE", "POA"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class WorkflowType {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final com.paypal.oslo.feature.verificationcapture.domain.model.WorkflowType.Companion INSTANCE;
    public static final com.paypal.oslo.feature.verificationcapture.domain.model.WorkflowType DOCUMENT_UPLOAD;
    public static final com.paypal.oslo.feature.verificationcapture.domain.model.WorkflowType POA;
    public static final com.paypal.oslo.feature.verificationcapture.domain.model.WorkflowType SELFIE;
    private static final /* synthetic */ com.paypal.oslo.feature.verificationcapture.domain.model.WorkflowType[] getHighResolutionOutputSizeshNQ4ISI;
    private static final /* synthetic */ kotlin.enums.EnumEntries getHighSpeedVideoFpsRangesFor;
    private final int value;

    private WorkflowType(java.lang.String str, int i, int i2) {
        this.value = i2;
    }

    public final int getValue() {
        return this.value;
    }

    static {
        com.paypal.oslo.feature.verificationcapture.domain.model.WorkflowType workflowType = new com.paypal.oslo.feature.verificationcapture.domain.model.WorkflowType("DOCUMENT_UPLOAD", 0, 0);
        DOCUMENT_UPLOAD = workflowType;
        com.paypal.oslo.feature.verificationcapture.domain.model.WorkflowType workflowType2 = new com.paypal.oslo.feature.verificationcapture.domain.model.WorkflowType("SELFIE", 1, 1);
        SELFIE = workflowType2;
        com.paypal.oslo.feature.verificationcapture.domain.model.WorkflowType workflowType3 = new com.paypal.oslo.feature.verificationcapture.domain.model.WorkflowType("POA", 2, 2);
        POA = workflowType3;
        com.paypal.oslo.feature.verificationcapture.domain.model.WorkflowType[] workflowTypeArr = {workflowType, workflowType2, workflowType3};
        getHighResolutionOutputSizeshNQ4ISI = workflowTypeArr;
        getHighSpeedVideoFpsRangesFor = kotlin.enums.EnumEntriesKt.enumEntries(workflowTypeArr);
        INSTANCE = new com.paypal.oslo.feature.verificationcapture.domain.model.WorkflowType.Companion(null);
    }

    @kotlin.Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lcom/paypal/oslo/feature/verificationcapture/domain/model/WorkflowType$Companion;", "", "<init>", "()V", "", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "Lcom/paypal/oslo/feature/verificationcapture/domain/model/WorkflowType;", "fromInt", "(I)Lcom/paypal/oslo/feature/verificationcapture/domain/model/WorkflowType;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public final com.paypal.oslo.feature.verificationcapture.domain.model.WorkflowType fromInt(int value) {
            java.lang.Object obj;
            java.util.Iterator<E> it = com.paypal.oslo.feature.verificationcapture.domain.model.WorkflowType.getEntries().iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj = null;
                    break;
                }
                obj = it.next();
                if (((com.paypal.oslo.feature.verificationcapture.domain.model.WorkflowType) obj).getValue() == value) {
                    break;
                }
            }
            com.paypal.oslo.feature.verificationcapture.domain.model.WorkflowType workflowType = (com.paypal.oslo.feature.verificationcapture.domain.model.WorkflowType) obj;
            return workflowType == null ? com.paypal.oslo.feature.verificationcapture.domain.model.WorkflowType.DOCUMENT_UPLOAD : workflowType;
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public static com.paypal.oslo.feature.verificationcapture.domain.model.WorkflowType[] values() {
        return (com.paypal.oslo.feature.verificationcapture.domain.model.WorkflowType[]) getHighResolutionOutputSizeshNQ4ISI.clone();
    }

    public static com.paypal.oslo.feature.verificationcapture.domain.model.WorkflowType valueOf(java.lang.String str) {
        return (com.paypal.oslo.feature.verificationcapture.domain.model.WorkflowType) java.lang.Enum.valueOf(com.paypal.oslo.feature.verificationcapture.domain.model.WorkflowType.class, str);
    }

    public static kotlin.enums.EnumEntries<com.paypal.oslo.feature.verificationcapture.domain.model.WorkflowType> getEntries() {
        return getHighSpeedVideoFpsRangesFor;
    }
}
