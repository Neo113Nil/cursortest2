package com.payair.logic.remote.model;

@kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\b\u0080\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0007R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0013\u001a\u0004\b\u0014\u0010\u0007"}, d2 = {"Lcom/payair/logic/remote/model/ResponseGetCSDKPKCertificateDto;", "Lcom/payair/hce/communication/JsonResponse;", "", "certificateData", "<init>", "(Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "copy", "(Ljava/lang/String;)Lcom/payair/logic/remote/model/ResponseGetCSDKPKCertificateDto;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getCertificateData"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final /* data */ class ResponseGetCSDKPKCertificateDto extends com.payair.hce.communication.JsonResponse {
    private final java.lang.String certificateData;

    /* JADX WARN: Multi-variable type inference failed */
    public ResponseGetCSDKPKCertificateDto() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    public final java.lang.String getCertificateData() {
        return this.certificateData;
    }

    public /* synthetic */ ResponseGetCSDKPKCertificateDto(java.lang.String str, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str);
    }

    public ResponseGetCSDKPKCertificateDto(java.lang.String str) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        this.certificateData = str;
    }

    @Override // com.payair.hce.communication.JsonResponse
    public final java.lang.String toString() {
        java.lang.String str = this.certificateData;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("ResponseGetCSDKPKCertificateDto(certificateData=");
        sb.append(str);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        return this.certificateData.hashCode();
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof com.payair.logic.remote.model.ResponseGetCSDKPKCertificateDto) && kotlin.jvm.internal.Intrinsics.areEqual(this.certificateData, ((com.payair.logic.remote.model.ResponseGetCSDKPKCertificateDto) other).certificateData);
    }

    public final com.payair.logic.remote.model.ResponseGetCSDKPKCertificateDto copy(java.lang.String certificateData) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(certificateData, "");
        return new com.payair.logic.remote.model.ResponseGetCSDKPKCertificateDto(certificateData);
    }

    /* renamed from: component1, reason: from getter */
    public final java.lang.String getCertificateData() {
        return this.certificateData;
    }

    public static /* synthetic */ com.payair.logic.remote.model.ResponseGetCSDKPKCertificateDto copy$default(com.payair.logic.remote.model.ResponseGetCSDKPKCertificateDto responseGetCSDKPKCertificateDto, java.lang.String str, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            str = responseGetCSDKPKCertificateDto.certificateData;
        }
        return responseGetCSDKPKCertificateDto.copy(str);
    }
}
