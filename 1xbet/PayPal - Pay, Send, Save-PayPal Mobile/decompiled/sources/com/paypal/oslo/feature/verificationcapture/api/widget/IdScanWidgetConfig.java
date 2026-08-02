package com.paypal.oslo.feature.verificationcapture.api.widget;

@kotlin.Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b-\b\u0086\b\u0018\u00002\u00020\u0001B\u007f\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\u0006\u0010\b\u001a\u00020\u0002\u0012\b\b\u0002\u0010\n\u001a\u00020\t\u0012\b\b\u0002\u0010\u000b\u001a\u00020\t\u0012\b\b\u0002\u0010\r\u001a\u00020\f\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u000e\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0010\u0012\b\b\u0002\u0010\u0012\u001a\u00020\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u0012\u0010\u0015\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0015\u0010\u0016J\u0012\u0010\u0017\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0017\u0010\u0016J\u0010\u0010\u0018\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0018\u0010\u0016J\u0010\u0010\u0019\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0019\u0010\u0016J\u0010\u0010\u001a\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001a\u0010\u0016J\u0010\u0010\u001b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001b\u0010\u0016J\u0010\u0010\u001c\u001a\u00020\tHÆ\u0003¢\u0006\u0004\b\u001c\u0010\u001dJ\u0010\u0010\u001e\u001a\u00020\tHÆ\u0003¢\u0006\u0004\b\u001e\u0010\u001dJ\u0010\u0010\u001f\u001a\u00020\fHÆ\u0003¢\u0006\u0004\b\u001f\u0010 J\u0010\u0010!\u001a\u00020\u000eHÆ\u0003¢\u0006\u0004\b!\u0010\"J\u0012\u0010#\u001a\u0004\u0018\u00010\u0010HÆ\u0003¢\u0006\u0004\b#\u0010$J\u0010\u0010%\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b%\u0010\u0016J\u008e\u0001\u0010&\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00022\b\b\u0002\u0010\u0007\u001a\u00020\u00022\b\b\u0002\u0010\b\u001a\u00020\u00022\b\b\u0002\u0010\n\u001a\u00020\t2\b\b\u0002\u0010\u000b\u001a\u00020\t2\b\b\u0002\u0010\r\u001a\u00020\f2\b\b\u0002\u0010\u000f\u001a\u00020\u000e2\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00102\b\b\u0002\u0010\u0012\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b&\u0010'J\u001a\u0010)\u001a\u00020\u000e2\b\u0010(\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b)\u0010*J\u0010\u0010+\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b+\u0010\u001dJ\u0010\u0010,\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b,\u0010\u0016R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010-\u001a\u0004\b.\u0010\u0016R\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010-\u001a\u0004\b/\u0010\u0016R\u001a\u0010\u0005\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010-\u001a\u0004\b0\u0010\u0016R\u001a\u0010\u0006\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010-\u001a\u0004\b1\u0010\u0016R\u001a\u0010\u0007\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010-\u001a\u0004\b2\u0010\u0016R\u001a\u0010\b\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010-\u001a\u0004\b3\u0010\u0016R\u001a\u0010\n\u001a\u00020\t8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\n\u00104\u001a\u0004\b5\u0010\u001dR\u001a\u0010\u000b\u001a\u00020\t8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u00104\u001a\u0004\b6\u0010\u001dR\u001a\u0010\r\u001a\u00020\f8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\r\u00107\u001a\u0004\b8\u0010 R\u001a\u0010\u000f\u001a\u00020\u000e8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u000f\u00109\u001a\u0004\b:\u0010\"R\u001c\u0010\u0011\u001a\u0004\u0018\u00010\u00108\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0011\u0010;\u001a\u0004\b<\u0010$R\u001a\u0010\u0012\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0012\u0010-\u001a\u0004\b=\u0010\u0016"}, d2 = {"Lcom/paypal/oslo/feature/verificationcapture/api/widget/IdScanWidgetConfig;", "", "", "client", com.google.android.libraries.places.api.model.PlaceTypes.COUNTRY, "partyId", com.paypal.oslo.core.network.graphql.interceptor.StepupChallengeInterceptor.FIELD_FLOW_NAME, "documentType", "documentSide", "", "maxFiles", "maxFileSizeKB", "Lcom/paypal/oslo/feature/verificationcapture/api/widget/CaptureMode;", "captureMode", "", "enableAutoUpload", "Lcom/paypal/oslo/feature/verificationcapture/api/models/SupportedLocale;", "locale", "entityType", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;IILcom/paypal/oslo/feature/verificationcapture/api/widget/CaptureMode;ZLcom/paypal/oslo/feature/verificationcapture/api/models/SupportedLocale;Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "component2", "component3", "component4", "component5", "component6", "component7", "()I", "component8", "component9", "()Lcom/paypal/oslo/feature/verificationcapture/api/widget/CaptureMode;", "component10", "()Z", "component11", "()Lcom/paypal/oslo/feature/verificationcapture/api/models/SupportedLocale;", "component12", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;IILcom/paypal/oslo/feature/verificationcapture/api/widget/CaptureMode;ZLcom/paypal/oslo/feature/verificationcapture/api/models/SupportedLocale;Ljava/lang/String;)Lcom/paypal/oslo/feature/verificationcapture/api/widget/IdScanWidgetConfig;", "other", "equals", "(Ljava/lang/Object;)Z", "hashCode", "toString", "Ljava/lang/String;", "getClient", "getCountry", "getPartyId", "getFlowName", "getDocumentType", "getDocumentSide", com.visa.cbp.getEncExpo.warmup, "getMaxFiles", "getMaxFileSizeKB", "Lcom/paypal/oslo/feature/verificationcapture/api/widget/CaptureMode;", "getCaptureMode", "Z", "getEnableAutoUpload", "Lcom/paypal/oslo/feature/verificationcapture/api/models/SupportedLocale;", "getLocale", "getEntityType"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes15.dex */
public final /* data */ class IdScanWidgetConfig {
    public static final int $stable = 0;
    private final com.paypal.oslo.feature.verificationcapture.api.widget.CaptureMode captureMode;
    private final java.lang.String client;
    private final java.lang.String country;
    private final java.lang.String documentSide;
    private final java.lang.String documentType;
    private final boolean enableAutoUpload;
    private final java.lang.String entityType;
    private final java.lang.String flowName;
    private final com.paypal.oslo.feature.verificationcapture.api.models.SupportedLocale locale;
    private final int maxFileSizeKB;
    private final int maxFiles;
    private final java.lang.String partyId;

    public IdScanWidgetConfig(java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, java.lang.String str5, java.lang.String str6, int i, int i2, com.paypal.oslo.feature.verificationcapture.api.widget.CaptureMode captureMode, boolean z, com.paypal.oslo.feature.verificationcapture.api.models.SupportedLocale supportedLocale, java.lang.String str7) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str3, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str4, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str5, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str6, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(captureMode, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str7, "");
        this.client = str;
        this.country = str2;
        this.partyId = str3;
        this.flowName = str4;
        this.documentType = str5;
        this.documentSide = str6;
        this.maxFiles = i;
        this.maxFileSizeKB = i2;
        this.captureMode = captureMode;
        this.enableAutoUpload = z;
        this.locale = supportedLocale;
        this.entityType = str7;
    }

    public final java.lang.String getClient() {
        return this.client;
    }

    public final java.lang.String getCountry() {
        return this.country;
    }

    public final java.lang.String getPartyId() {
        return this.partyId;
    }

    public /* synthetic */ IdScanWidgetConfig(java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, java.lang.String str5, java.lang.String str6, int i, int i2, com.paypal.oslo.feature.verificationcapture.api.widget.CaptureMode captureMode, boolean z, com.paypal.oslo.feature.verificationcapture.api.models.SupportedLocale supportedLocale, java.lang.String str7, int i3, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this((i3 & 1) != 0 ? null : str, (i3 & 2) != 0 ? null : str2, str3, (i3 & 8) != 0 ? "UNKNOWN" : str4, str5, str6, (i3 & 64) != 0 ? 2 : i, (i3 & 128) != 0 ? 10240 : i2, (i3 & 256) != 0 ? com.paypal.oslo.feature.verificationcapture.api.widget.CaptureMode.SDK : captureMode, (i3 & 512) != 0 ? false : z, (i3 & 1024) != 0 ? null : supportedLocale, (i3 & 2048) != 0 ? "PAYER" : str7);
    }

    public final java.lang.String getFlowName() {
        return this.flowName;
    }

    public final java.lang.String getDocumentType() {
        return this.documentType;
    }

    public final java.lang.String getDocumentSide() {
        return this.documentSide;
    }

    public final int getMaxFiles() {
        return this.maxFiles;
    }

    public final int getMaxFileSizeKB() {
        return this.maxFileSizeKB;
    }

    public final com.paypal.oslo.feature.verificationcapture.api.widget.CaptureMode getCaptureMode() {
        return this.captureMode;
    }

    public final boolean getEnableAutoUpload() {
        return this.enableAutoUpload;
    }

    public final com.paypal.oslo.feature.verificationcapture.api.models.SupportedLocale getLocale() {
        return this.locale;
    }

    public final java.lang.String getEntityType() {
        return this.entityType;
    }

    public final java.lang.String toString() {
        java.lang.String str = this.client;
        java.lang.String str2 = this.country;
        java.lang.String str3 = this.partyId;
        java.lang.String str4 = this.flowName;
        java.lang.String str5 = this.documentType;
        java.lang.String str6 = this.documentSide;
        int i = this.maxFiles;
        int i2 = this.maxFileSizeKB;
        com.paypal.oslo.feature.verificationcapture.api.widget.CaptureMode captureMode = this.captureMode;
        boolean z = this.enableAutoUpload;
        com.paypal.oslo.feature.verificationcapture.api.models.SupportedLocale supportedLocale = this.locale;
        java.lang.String str7 = this.entityType;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("IdScanWidgetConfig(client=");
        sb.append(str);
        sb.append(", country=");
        sb.append(str2);
        sb.append(", partyId=");
        sb.append(str3);
        sb.append(", flowName=");
        sb.append(str4);
        sb.append(", documentType=");
        sb.append(str5);
        sb.append(", documentSide=");
        sb.append(str6);
        sb.append(", maxFiles=");
        sb.append(i);
        sb.append(", maxFileSizeKB=");
        sb.append(i2);
        sb.append(", captureMode=");
        sb.append(captureMode);
        sb.append(", enableAutoUpload=");
        sb.append(z);
        sb.append(", locale=");
        sb.append(supportedLocale);
        sb.append(", entityType=");
        sb.append(str7);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        java.lang.String str = this.client;
        int hashCode = str == null ? 0 : str.hashCode();
        java.lang.String str2 = this.country;
        int hashCode2 = str2 == null ? 0 : str2.hashCode();
        int hashCode3 = this.partyId.hashCode();
        int hashCode4 = this.flowName.hashCode();
        int hashCode5 = this.documentType.hashCode();
        int hashCode6 = this.documentSide.hashCode();
        int hashCode7 = java.lang.Integer.hashCode(this.maxFiles);
        int hashCode8 = java.lang.Integer.hashCode(this.maxFileSizeKB);
        int hashCode9 = this.captureMode.hashCode();
        int hashCode10 = java.lang.Boolean.hashCode(this.enableAutoUpload);
        com.paypal.oslo.feature.verificationcapture.api.models.SupportedLocale supportedLocale = this.locale;
        return (((((((((((((((((((((hashCode * 31) + hashCode2) * 31) + hashCode3) * 31) + hashCode4) * 31) + hashCode5) * 31) + hashCode6) * 31) + hashCode7) * 31) + hashCode8) * 31) + hashCode9) * 31) + hashCode10) * 31) + (supportedLocale != null ? supportedLocale.hashCode() : 0)) * 31) + this.entityType.hashCode();
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.paypal.oslo.feature.verificationcapture.api.widget.IdScanWidgetConfig)) {
            return false;
        }
        com.paypal.oslo.feature.verificationcapture.api.widget.IdScanWidgetConfig idScanWidgetConfig = (com.paypal.oslo.feature.verificationcapture.api.widget.IdScanWidgetConfig) other;
        return kotlin.jvm.internal.Intrinsics.areEqual(this.client, idScanWidgetConfig.client) && kotlin.jvm.internal.Intrinsics.areEqual(this.country, idScanWidgetConfig.country) && kotlin.jvm.internal.Intrinsics.areEqual(this.partyId, idScanWidgetConfig.partyId) && kotlin.jvm.internal.Intrinsics.areEqual(this.flowName, idScanWidgetConfig.flowName) && kotlin.jvm.internal.Intrinsics.areEqual(this.documentType, idScanWidgetConfig.documentType) && kotlin.jvm.internal.Intrinsics.areEqual(this.documentSide, idScanWidgetConfig.documentSide) && this.maxFiles == idScanWidgetConfig.maxFiles && this.maxFileSizeKB == idScanWidgetConfig.maxFileSizeKB && this.captureMode == idScanWidgetConfig.captureMode && this.enableAutoUpload == idScanWidgetConfig.enableAutoUpload && this.locale == idScanWidgetConfig.locale && kotlin.jvm.internal.Intrinsics.areEqual(this.entityType, idScanWidgetConfig.entityType);
    }

    public final com.paypal.oslo.feature.verificationcapture.api.widget.IdScanWidgetConfig copy(java.lang.String client, java.lang.String country, java.lang.String partyId, java.lang.String flowName, java.lang.String documentType, java.lang.String documentSide, int maxFiles, int maxFileSizeKB, com.paypal.oslo.feature.verificationcapture.api.widget.CaptureMode captureMode, boolean enableAutoUpload, com.paypal.oslo.feature.verificationcapture.api.models.SupportedLocale locale, java.lang.String entityType) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(partyId, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(flowName, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(documentType, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(documentSide, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(captureMode, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(entityType, "");
        return new com.paypal.oslo.feature.verificationcapture.api.widget.IdScanWidgetConfig(client, country, partyId, flowName, documentType, documentSide, maxFiles, maxFileSizeKB, captureMode, enableAutoUpload, locale, entityType);
    }

    /* renamed from: component9, reason: from getter */
    public final com.paypal.oslo.feature.verificationcapture.api.widget.CaptureMode getCaptureMode() {
        return this.captureMode;
    }

    /* renamed from: component8, reason: from getter */
    public final int getMaxFileSizeKB() {
        return this.maxFileSizeKB;
    }

    /* renamed from: component7, reason: from getter */
    public final int getMaxFiles() {
        return this.maxFiles;
    }

    /* renamed from: component6, reason: from getter */
    public final java.lang.String getDocumentSide() {
        return this.documentSide;
    }

    /* renamed from: component5, reason: from getter */
    public final java.lang.String getDocumentType() {
        return this.documentType;
    }

    /* renamed from: component4, reason: from getter */
    public final java.lang.String getFlowName() {
        return this.flowName;
    }

    /* renamed from: component3, reason: from getter */
    public final java.lang.String getPartyId() {
        return this.partyId;
    }

    /* renamed from: component2, reason: from getter */
    public final java.lang.String getCountry() {
        return this.country;
    }

    /* renamed from: component12, reason: from getter */
    public final java.lang.String getEntityType() {
        return this.entityType;
    }

    /* renamed from: component11, reason: from getter */
    public final com.paypal.oslo.feature.verificationcapture.api.models.SupportedLocale getLocale() {
        return this.locale;
    }

    /* renamed from: component10, reason: from getter */
    public final boolean getEnableAutoUpload() {
        return this.enableAutoUpload;
    }

    /* renamed from: component1, reason: from getter */
    public final java.lang.String getClient() {
        return this.client;
    }
}
