package com.paypal.oslo.feature.dataprivacy.data.mapper;

@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u0013\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u0000¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/paypal/oslo/feature/dataprivacy/graphql/GetSubjectAccessRequestsQuery$SubjectAccessRequest;", "Lcom/paypal/oslo/feature/dataprivacy/domain/model/ErasureRequest;", "toErasureDomain", "(Lcom/paypal/oslo/feature/dataprivacy/graphql/GetSubjectAccessRequestsQuery$SubjectAccessRequest;)Lcom/paypal/oslo/feature/dataprivacy/domain/model/ErasureRequest;"}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class ErasureMapperKt {
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0051, code lost:
    
        if (r1 == null) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0087, code lost:
    
        if (r1 == null) goto L44;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x00a9, code lost:
    
        if (r1 == null) goto L55;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0028, code lost:
    
        if (r1 == null) goto L13;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final com.paypal.oslo.feature.dataprivacy.domain.model.ErasureRequest toErasureDomain(com.paypal.oslo.feature.dataprivacy.graphql.GetSubjectAccessRequestsQuery.SubjectAccessRequest subjectAccessRequest) {
        com.paypal.oslo.feature.dataprivacy.domain.model.ErasureDomain erasureDomain;
        com.paypal.oslo.feature.dataprivacy.domain.model.ErasureRequestType erasureRequestType;
        com.paypal.oslo.feature.dataprivacy.domain.model.ErasureStatus erasureStatus;
        com.paypal.oslo.feature.dataprivacy.domain.model.ErasureSource erasureSource;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(subjectAccessRequest, "");
        java.lang.String id = subjectAccessRequest.getId();
        java.lang.String partyId = subjectAccessRequest.getPartyId();
        java.lang.String str = partyId == null ? "" : partyId;
        com.paypal.oslo.api.graphql.schema.type.DSRDomain domain = subjectAccessRequest.getDomain();
        if (domain != null) {
            if (com.paypal.oslo.feature.dataprivacy.data.mapper.ErasureMapperKt.WhenMappings.$EnumSwitchMapping$1[domain.ordinal()] == 1) {
                erasureDomain = com.paypal.oslo.feature.dataprivacy.domain.model.ErasureDomain.PAYPAL;
            } else {
                erasureDomain = com.paypal.oslo.feature.dataprivacy.domain.model.ErasureDomain.UNKNOWN;
            }
        }
        erasureDomain = com.paypal.oslo.feature.dataprivacy.domain.model.ErasureDomain.UNKNOWN;
        com.paypal.oslo.feature.dataprivacy.domain.model.ErasureDomain erasureDomain2 = erasureDomain;
        com.paypal.oslo.api.graphql.schema.type.DSRRequestType requestType = subjectAccessRequest.getRequestType();
        if (requestType != null) {
            int i = com.paypal.oslo.feature.dataprivacy.data.mapper.ErasureMapperKt.WhenMappings.$EnumSwitchMapping$2[requestType.ordinal()];
            if (i == 1) {
                erasureRequestType = com.paypal.oslo.feature.dataprivacy.domain.model.ErasureRequestType.DATA_ACCESS_REQUEST;
            } else if (i == 2) {
                erasureRequestType = com.paypal.oslo.feature.dataprivacy.domain.model.ErasureRequestType.DATA_ERASURE;
            } else {
                if (i != 3) {
                    throw new kotlin.NoWhenBranchMatchedException();
                }
                erasureRequestType = com.paypal.oslo.feature.dataprivacy.domain.model.ErasureRequestType.UNKNOWN;
            }
        }
        erasureRequestType = com.paypal.oslo.feature.dataprivacy.domain.model.ErasureRequestType.UNKNOWN;
        com.paypal.oslo.feature.dataprivacy.domain.model.ErasureRequestType erasureRequestType2 = erasureRequestType;
        com.paypal.oslo.api.graphql.schema.type.DSRCaseStatus status = subjectAccessRequest.getStatus();
        if (status != null) {
            switch (com.paypal.oslo.feature.dataprivacy.data.mapper.ErasureMapperKt.WhenMappings.$EnumSwitchMapping$0[status.ordinal()]) {
                case 1:
                    erasureStatus = com.paypal.oslo.feature.dataprivacy.domain.model.ErasureStatus.OPEN;
                    break;
                case 2:
                    erasureStatus = com.paypal.oslo.feature.dataprivacy.domain.model.ErasureStatus.CLOSED;
                    break;
                case 3:
                    erasureStatus = com.paypal.oslo.feature.dataprivacy.domain.model.ErasureStatus.FAILED;
                    break;
                case 4:
                    erasureStatus = com.paypal.oslo.feature.dataprivacy.domain.model.ErasureStatus.IN_PROGRESS;
                    break;
                case 5:
                    erasureStatus = com.paypal.oslo.feature.dataprivacy.domain.model.ErasureStatus.WITHDRAWN;
                    break;
                case 6:
                    erasureStatus = com.paypal.oslo.feature.dataprivacy.domain.model.ErasureStatus.AWAITING_VERIFICATION;
                    break;
                case 7:
                    erasureStatus = com.paypal.oslo.feature.dataprivacy.domain.model.ErasureStatus.PENDING;
                    break;
                case 8:
                    erasureStatus = com.paypal.oslo.feature.dataprivacy.domain.model.ErasureStatus.REJECTED;
                    break;
                case 9:
                    erasureStatus = com.paypal.oslo.feature.dataprivacy.domain.model.ErasureStatus.UNKNOWN;
                    break;
                default:
                    throw new kotlin.NoWhenBranchMatchedException();
            }
        }
        erasureStatus = com.paypal.oslo.feature.dataprivacy.domain.model.ErasureStatus.UNKNOWN;
        com.paypal.oslo.feature.dataprivacy.domain.model.ErasureStatus erasureStatus2 = erasureStatus;
        com.paypal.oslo.api.graphql.schema.type.DSRSource source = subjectAccessRequest.getSource();
        if (source != null) {
            int i2 = com.paypal.oslo.feature.dataprivacy.data.mapper.ErasureMapperKt.WhenMappings.$EnumSwitchMapping$3[source.ordinal()];
            if (i2 == 1) {
                erasureSource = com.paypal.oslo.feature.dataprivacy.domain.model.ErasureSource.SELF_SERVICE;
            } else {
                if (i2 != 2) {
                    throw new kotlin.NoWhenBranchMatchedException();
                }
                erasureSource = com.paypal.oslo.feature.dataprivacy.domain.model.ErasureSource.UNKNOWN;
            }
        }
        erasureSource = com.paypal.oslo.feature.dataprivacy.domain.model.ErasureSource.UNKNOWN;
        com.paypal.oslo.feature.dataprivacy.domain.model.ErasureSource erasureSource2 = erasureSource;
        java.lang.Object createTime = subjectAccessRequest.getCreateTime();
        java.lang.String str2 = createTime instanceof java.lang.String ? (java.lang.String) createTime : null;
        java.lang.String str3 = str2 == null ? "" : str2;
        java.lang.Object updateTime = subjectAccessRequest.getUpdateTime();
        java.lang.String str4 = updateTime instanceof java.lang.String ? (java.lang.String) updateTime : null;
        return new com.paypal.oslo.feature.dataprivacy.domain.model.ErasureRequest(id, str, erasureDomain2, erasureRequestType2, erasureStatus2, erasureSource2, str3, str4 != null ? str4 : "", subjectAccessRequest.getAlias());
    }

    @kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;
        public static final /* synthetic */ int[] $EnumSwitchMapping$2;
        public static final /* synthetic */ int[] $EnumSwitchMapping$3;

        static {
            int[] iArr = new int[com.paypal.oslo.api.graphql.schema.type.DSRCaseStatus.values().length];
            try {
                iArr[com.paypal.oslo.api.graphql.schema.type.DSRCaseStatus.OPEN.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                iArr[com.paypal.oslo.api.graphql.schema.type.DSRCaseStatus.CLOSED.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            try {
                iArr[com.paypal.oslo.api.graphql.schema.type.DSRCaseStatus.FAILED.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused3) {
            }
            try {
                iArr[com.paypal.oslo.api.graphql.schema.type.DSRCaseStatus.IN_PROGRESS.ordinal()] = 4;
            } catch (java.lang.NoSuchFieldError unused4) {
            }
            try {
                iArr[com.paypal.oslo.api.graphql.schema.type.DSRCaseStatus.WITHDRAWN.ordinal()] = 5;
            } catch (java.lang.NoSuchFieldError unused5) {
            }
            try {
                iArr[com.paypal.oslo.api.graphql.schema.type.DSRCaseStatus.UNVERIFIED.ordinal()] = 6;
            } catch (java.lang.NoSuchFieldError unused6) {
            }
            try {
                iArr[com.paypal.oslo.api.graphql.schema.type.DSRCaseStatus.VERIFIED.ordinal()] = 7;
            } catch (java.lang.NoSuchFieldError unused7) {
            }
            try {
                iArr[com.paypal.oslo.api.graphql.schema.type.DSRCaseStatus.REJECTED.ordinal()] = 8;
            } catch (java.lang.NoSuchFieldError unused8) {
            }
            try {
                iArr[com.paypal.oslo.api.graphql.schema.type.DSRCaseStatus.UNKNOWN__.ordinal()] = 9;
            } catch (java.lang.NoSuchFieldError unused9) {
            }
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[com.paypal.oslo.api.graphql.schema.type.DSRDomain.values().length];
            try {
                iArr2[com.paypal.oslo.api.graphql.schema.type.DSRDomain.PAYPAL.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused10) {
            }
            $EnumSwitchMapping$1 = iArr2;
            int[] iArr3 = new int[com.paypal.oslo.api.graphql.schema.type.DSRRequestType.values().length];
            try {
                iArr3[com.paypal.oslo.api.graphql.schema.type.DSRRequestType.DATA_ACCESS_REQUEST.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused11) {
            }
            try {
                iArr3[com.paypal.oslo.api.graphql.schema.type.DSRRequestType.DATA_ERASURE.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused12) {
            }
            try {
                iArr3[com.paypal.oslo.api.graphql.schema.type.DSRRequestType.UNKNOWN__.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused13) {
            }
            $EnumSwitchMapping$2 = iArr3;
            int[] iArr4 = new int[com.paypal.oslo.api.graphql.schema.type.DSRSource.values().length];
            try {
                iArr4[com.paypal.oslo.api.graphql.schema.type.DSRSource.SELF_SERVICE.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused14) {
            }
            try {
                iArr4[com.paypal.oslo.api.graphql.schema.type.DSRSource.UNKNOWN__.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused15) {
            }
            $EnumSwitchMapping$3 = iArr4;
        }
    }
}
