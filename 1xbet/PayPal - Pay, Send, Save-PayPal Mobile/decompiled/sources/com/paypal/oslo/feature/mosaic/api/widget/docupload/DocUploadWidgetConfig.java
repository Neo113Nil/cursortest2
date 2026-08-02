package com.paypal.oslo.feature.mosaic.api.widget.docupload;

@kotlin.Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b1\b\u0086\b\u0018\u00002\u00020\u0001B\u009a\u0001\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012#\b\u0002\u0010\u000b\u001a\u001d\u0012\u0004\u0012\u00020\u0005\u0012\u0006\u0012\u0004\u0018\u00010\b\u0018\u00010\u0007j\u0004\u0018\u0001`\t¢\u0006\u0002\b\n\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u000e\u001a\u00020\r\u0012\b\b\u0002\u0010\u000f\u001a\u00020\r\u0012\b\b\u0002\u0010\u0010\u001a\u00020\r\u0012\b\b\u0002\u0010\u0012\u001a\u00020\u0011\u0012\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0018\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0018\u0010\u0019J\u0016\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0003¢\u0006\u0004\b\u001a\u0010\u001bJ+\u0010\u001c\u001a\u001d\u0012\u0004\u0012\u00020\u0005\u0012\u0006\u0012\u0004\u0018\u00010\b\u0018\u00010\u0007j\u0004\u0018\u0001`\t¢\u0006\u0002\b\nHÆ\u0003¢\u0006\u0004\b\u001c\u0010\u001dJ\u0012\u0010\u001e\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0004\b\u001e\u0010\u001fJ\u0010\u0010 \u001a\u00020\rHÆ\u0003¢\u0006\u0004\b \u0010!J\u0010\u0010\"\u001a\u00020\rHÆ\u0003¢\u0006\u0004\b\"\u0010!J\u0010\u0010#\u001a\u00020\rHÆ\u0003¢\u0006\u0004\b#\u0010!J\u0010\u0010$\u001a\u00020\u0011HÆ\u0003¢\u0006\u0004\b$\u0010%J\u0012\u0010&\u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0004\b&\u0010'J\u0012\u0010(\u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0004\b(\u0010'J\u0012\u0010)\u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0004\b)\u0010'J§\u0001\u0010*\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042#\b\u0002\u0010\u000b\u001a\u001d\u0012\u0004\u0012\u00020\u0005\u0012\u0006\u0012\u0004\u0018\u00010\b\u0018\u00010\u0007j\u0004\u0018\u0001`\t¢\u0006\u0002\b\n2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\u000e\u001a\u00020\r2\b\b\u0002\u0010\u000f\u001a\u00020\r2\b\b\u0002\u0010\u0010\u001a\u00020\r2\b\b\u0002\u0010\u0012\u001a\u00020\u00112\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\bHÆ\u0001¢\u0006\u0004\b*\u0010+J\u001a\u0010-\u001a\u00020\u00112\b\u0010,\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b-\u0010.J\u0010\u0010/\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b/\u0010!J\u0010\u00100\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b0\u0010'R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u00101\u001a\u0004\b2\u0010\u0019R \u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u00103\u001a\u0004\b4\u0010\u001bR5\u0010\u000b\u001a\u001d\u0012\u0004\u0012\u00020\u0005\u0012\u0006\u0012\u0004\u0018\u00010\b\u0018\u00010\u0007j\u0004\u0018\u0001`\t¢\u0006\u0002\b\n8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u00105\u001a\u0004\b6\u0010\u001dR\u001c\u0010\f\u001a\u0004\u0018\u00010\u00058\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\f\u00107\u001a\u0004\b8\u0010\u001fR\u001a\u0010\u000e\u001a\u00020\r8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u000e\u00109\u001a\u0004\b:\u0010!R\u001a\u0010\u000f\u001a\u00020\r8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u000f\u00109\u001a\u0004\b;\u0010!R\u001a\u0010\u0010\u001a\u00020\r8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0010\u00109\u001a\u0004\b<\u0010!R\u001a\u0010\u0012\u001a\u00020\u00118\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0012\u0010=\u001a\u0004\b>\u0010%R\u001c\u0010\u0013\u001a\u0004\u0018\u00010\b8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0013\u0010?\u001a\u0004\b@\u0010'R\u001c\u0010\u0014\u001a\u0004\u0018\u00010\b8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0014\u0010?\u001a\u0004\bA\u0010'R\u001c\u0010\u0015\u001a\u0004\u0018\u00010\b8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0015\u0010?\u001a\u0004\bB\u0010'"}, d2 = {"Lcom/paypal/oslo/feature/mosaic/api/widget/docupload/DocUploadWidgetConfig;", "", "Lcom/paypal/oslo/feature/mosaic/api/widget/docupload/DocCategory;", "docCategory", "", "Lcom/paypal/oslo/feature/mosaic/api/widget/docupload/DocumentTypeID;", "allowedDocTypes", "Lkotlin/Function1;", "", "Lcom/paypal/oslo/feature/mosaic/api/widget/docupload/DocDescriptionProvider;", "Landroidx/compose/runtime/Composable;", "docDescription", "selectedDocType", "", "maxFiles", "maxFileSize", "minFileSize", "", "forceEnUSLocale", "client", "product", "entityType", "<init>", "(Lcom/paypal/oslo/feature/mosaic/api/widget/docupload/DocCategory;Ljava/util/List;Lkotlin/jvm/functions/Function3;Lcom/paypal/oslo/feature/mosaic/api/widget/docupload/DocumentTypeID;IIIZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "component1", "()Lcom/paypal/oslo/feature/mosaic/api/widget/docupload/DocCategory;", "component2", "()Ljava/util/List;", "component3", "()Lkotlin/jvm/functions/Function3;", "component4", "()Lcom/paypal/oslo/feature/mosaic/api/widget/docupload/DocumentTypeID;", "component5", "()I", "component6", "component7", "component8", "()Z", "component9", "()Ljava/lang/String;", "component10", "component11", "copy", "(Lcom/paypal/oslo/feature/mosaic/api/widget/docupload/DocCategory;Ljava/util/List;Lkotlin/jvm/functions/Function3;Lcom/paypal/oslo/feature/mosaic/api/widget/docupload/DocumentTypeID;IIIZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/paypal/oslo/feature/mosaic/api/widget/docupload/DocUploadWidgetConfig;", "other", "equals", "(Ljava/lang/Object;)Z", "hashCode", "toString", "Lcom/paypal/oslo/feature/mosaic/api/widget/docupload/DocCategory;", "getDocCategory", "Ljava/util/List;", "getAllowedDocTypes", "Lkotlin/jvm/functions/Function3;", "getDocDescription", "Lcom/paypal/oslo/feature/mosaic/api/widget/docupload/DocumentTypeID;", "getSelectedDocType", com.visa.cbp.getEncExpo.warmup, "getMaxFiles", "getMaxFileSize", "getMinFileSize", "Z", "getForceEnUSLocale", "Ljava/lang/String;", "getClient", "getProduct", "getEntityType"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class DocUploadWidgetConfig {
    public static final int $stable = 8;
    private final java.util.List<com.paypal.oslo.feature.mosaic.api.widget.docupload.DocumentTypeID> allowedDocTypes;
    private final java.lang.String client;
    private final com.paypal.oslo.feature.mosaic.api.widget.docupload.DocCategory docCategory;
    private final kotlin.jvm.functions.Function3<com.paypal.oslo.feature.mosaic.api.widget.docupload.DocumentTypeID, androidx.compose.runtime.Composer, java.lang.Integer, java.lang.String> docDescription;
    private final java.lang.String entityType;
    private final boolean forceEnUSLocale;
    private final int maxFileSize;
    private final int maxFiles;
    private final int minFileSize;
    private final java.lang.String product;
    private final com.paypal.oslo.feature.mosaic.api.widget.docupload.DocumentTypeID selectedDocType;

    /* JADX WARN: Multi-variable type inference failed */
    public DocUploadWidgetConfig(com.paypal.oslo.feature.mosaic.api.widget.docupload.DocCategory docCategory, java.util.List<? extends com.paypal.oslo.feature.mosaic.api.widget.docupload.DocumentTypeID> list, kotlin.jvm.functions.Function3<? super com.paypal.oslo.feature.mosaic.api.widget.docupload.DocumentTypeID, ? super androidx.compose.runtime.Composer, ? super java.lang.Integer, java.lang.String> function3, com.paypal.oslo.feature.mosaic.api.widget.docupload.DocumentTypeID documentTypeID, int i, int i2, int i3, boolean z, java.lang.String str, java.lang.String str2, java.lang.String str3) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(docCategory, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list, "");
        this.docCategory = docCategory;
        this.allowedDocTypes = list;
        this.docDescription = function3;
        this.selectedDocType = documentTypeID;
        this.maxFiles = i;
        this.maxFileSize = i2;
        this.minFileSize = i3;
        this.forceEnUSLocale = z;
        this.client = str;
        this.product = str2;
        this.entityType = str3;
    }

    public /* synthetic */ DocUploadWidgetConfig(com.paypal.oslo.feature.mosaic.api.widget.docupload.DocCategory docCategory, java.util.List list, kotlin.jvm.functions.Function3 function3, com.paypal.oslo.feature.mosaic.api.widget.docupload.DocumentTypeID documentTypeID, int i, int i2, int i3, boolean z, java.lang.String str, java.lang.String str2, java.lang.String str3, int i4, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(docCategory, list, (i4 & 4) != 0 ? null : function3, (i4 & 8) != 0 ? null : documentTypeID, (i4 & 16) != 0 ? 2 : i, (i4 & 32) != 0 ? 10240 : i2, (i4 & 64) != 0 ? 0 : i3, (i4 & 128) != 0 ? false : z, (i4 & 256) != 0 ? null : str, (i4 & 512) != 0 ? null : str2, (i4 & 1024) != 0 ? null : str3);
    }

    public final com.paypal.oslo.feature.mosaic.api.widget.docupload.DocCategory getDocCategory() {
        return this.docCategory;
    }

    public final java.util.List<com.paypal.oslo.feature.mosaic.api.widget.docupload.DocumentTypeID> getAllowedDocTypes() {
        return this.allowedDocTypes;
    }

    public final kotlin.jvm.functions.Function3<com.paypal.oslo.feature.mosaic.api.widget.docupload.DocumentTypeID, androidx.compose.runtime.Composer, java.lang.Integer, java.lang.String> getDocDescription() {
        return this.docDescription;
    }

    public final com.paypal.oslo.feature.mosaic.api.widget.docupload.DocumentTypeID getSelectedDocType() {
        return this.selectedDocType;
    }

    public final int getMaxFiles() {
        return this.maxFiles;
    }

    public final int getMaxFileSize() {
        return this.maxFileSize;
    }

    public final int getMinFileSize() {
        return this.minFileSize;
    }

    public final boolean getForceEnUSLocale() {
        return this.forceEnUSLocale;
    }

    public final java.lang.String getClient() {
        return this.client;
    }

    public final java.lang.String getProduct() {
        return this.product;
    }

    public final java.lang.String getEntityType() {
        return this.entityType;
    }

    public final java.lang.String toString() {
        com.paypal.oslo.feature.mosaic.api.widget.docupload.DocCategory docCategory = this.docCategory;
        java.util.List<com.paypal.oslo.feature.mosaic.api.widget.docupload.DocumentTypeID> list = this.allowedDocTypes;
        kotlin.jvm.functions.Function3<com.paypal.oslo.feature.mosaic.api.widget.docupload.DocumentTypeID, androidx.compose.runtime.Composer, java.lang.Integer, java.lang.String> function3 = this.docDescription;
        com.paypal.oslo.feature.mosaic.api.widget.docupload.DocumentTypeID documentTypeID = this.selectedDocType;
        int i = this.maxFiles;
        int i2 = this.maxFileSize;
        int i3 = this.minFileSize;
        boolean z = this.forceEnUSLocale;
        java.lang.String str = this.client;
        java.lang.String str2 = this.product;
        java.lang.String str3 = this.entityType;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("DocUploadWidgetConfig(docCategory=");
        sb.append(docCategory);
        sb.append(", allowedDocTypes=");
        sb.append(list);
        sb.append(", docDescription=");
        sb.append(function3);
        sb.append(", selectedDocType=");
        sb.append(documentTypeID);
        sb.append(", maxFiles=");
        sb.append(i);
        sb.append(", maxFileSize=");
        sb.append(i2);
        sb.append(", minFileSize=");
        sb.append(i3);
        sb.append(", forceEnUSLocale=");
        sb.append(z);
        sb.append(", client=");
        sb.append(str);
        sb.append(", product=");
        sb.append(str2);
        sb.append(", entityType=");
        sb.append(str3);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        int hashCode = this.docCategory.hashCode();
        int hashCode2 = this.allowedDocTypes.hashCode();
        kotlin.jvm.functions.Function3<com.paypal.oslo.feature.mosaic.api.widget.docupload.DocumentTypeID, androidx.compose.runtime.Composer, java.lang.Integer, java.lang.String> function3 = this.docDescription;
        int hashCode3 = function3 == null ? 0 : function3.hashCode();
        com.paypal.oslo.feature.mosaic.api.widget.docupload.DocumentTypeID documentTypeID = this.selectedDocType;
        int hashCode4 = documentTypeID == null ? 0 : documentTypeID.hashCode();
        int hashCode5 = java.lang.Integer.hashCode(this.maxFiles);
        int hashCode6 = java.lang.Integer.hashCode(this.maxFileSize);
        int hashCode7 = java.lang.Integer.hashCode(this.minFileSize);
        int hashCode8 = java.lang.Boolean.hashCode(this.forceEnUSLocale);
        java.lang.String str = this.client;
        int hashCode9 = str == null ? 0 : str.hashCode();
        java.lang.String str2 = this.product;
        int hashCode10 = str2 == null ? 0 : str2.hashCode();
        java.lang.String str3 = this.entityType;
        return (((((((((((((((((((hashCode * 31) + hashCode2) * 31) + hashCode3) * 31) + hashCode4) * 31) + hashCode5) * 31) + hashCode6) * 31) + hashCode7) * 31) + hashCode8) * 31) + hashCode9) * 31) + hashCode10) * 31) + (str3 != null ? str3.hashCode() : 0);
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.paypal.oslo.feature.mosaic.api.widget.docupload.DocUploadWidgetConfig)) {
            return false;
        }
        com.paypal.oslo.feature.mosaic.api.widget.docupload.DocUploadWidgetConfig docUploadWidgetConfig = (com.paypal.oslo.feature.mosaic.api.widget.docupload.DocUploadWidgetConfig) other;
        return this.docCategory == docUploadWidgetConfig.docCategory && kotlin.jvm.internal.Intrinsics.areEqual(this.allowedDocTypes, docUploadWidgetConfig.allowedDocTypes) && kotlin.jvm.internal.Intrinsics.areEqual(this.docDescription, docUploadWidgetConfig.docDescription) && this.selectedDocType == docUploadWidgetConfig.selectedDocType && this.maxFiles == docUploadWidgetConfig.maxFiles && this.maxFileSize == docUploadWidgetConfig.maxFileSize && this.minFileSize == docUploadWidgetConfig.minFileSize && this.forceEnUSLocale == docUploadWidgetConfig.forceEnUSLocale && kotlin.jvm.internal.Intrinsics.areEqual(this.client, docUploadWidgetConfig.client) && kotlin.jvm.internal.Intrinsics.areEqual(this.product, docUploadWidgetConfig.product) && kotlin.jvm.internal.Intrinsics.areEqual(this.entityType, docUploadWidgetConfig.entityType);
    }

    public final com.paypal.oslo.feature.mosaic.api.widget.docupload.DocUploadWidgetConfig copy(com.paypal.oslo.feature.mosaic.api.widget.docupload.DocCategory docCategory, java.util.List<? extends com.paypal.oslo.feature.mosaic.api.widget.docupload.DocumentTypeID> allowedDocTypes, kotlin.jvm.functions.Function3<? super com.paypal.oslo.feature.mosaic.api.widget.docupload.DocumentTypeID, ? super androidx.compose.runtime.Composer, ? super java.lang.Integer, java.lang.String> docDescription, com.paypal.oslo.feature.mosaic.api.widget.docupload.DocumentTypeID selectedDocType, int maxFiles, int maxFileSize, int minFileSize, boolean forceEnUSLocale, java.lang.String client, java.lang.String product, java.lang.String entityType) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(docCategory, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(allowedDocTypes, "");
        return new com.paypal.oslo.feature.mosaic.api.widget.docupload.DocUploadWidgetConfig(docCategory, allowedDocTypes, docDescription, selectedDocType, maxFiles, maxFileSize, minFileSize, forceEnUSLocale, client, product, entityType);
    }

    /* renamed from: component9, reason: from getter */
    public final java.lang.String getClient() {
        return this.client;
    }

    /* renamed from: component8, reason: from getter */
    public final boolean getForceEnUSLocale() {
        return this.forceEnUSLocale;
    }

    /* renamed from: component7, reason: from getter */
    public final int getMinFileSize() {
        return this.minFileSize;
    }

    /* renamed from: component6, reason: from getter */
    public final int getMaxFileSize() {
        return this.maxFileSize;
    }

    /* renamed from: component5, reason: from getter */
    public final int getMaxFiles() {
        return this.maxFiles;
    }

    /* renamed from: component4, reason: from getter */
    public final com.paypal.oslo.feature.mosaic.api.widget.docupload.DocumentTypeID getSelectedDocType() {
        return this.selectedDocType;
    }

    public final kotlin.jvm.functions.Function3<com.paypal.oslo.feature.mosaic.api.widget.docupload.DocumentTypeID, androidx.compose.runtime.Composer, java.lang.Integer, java.lang.String> component3() {
        return this.docDescription;
    }

    public final java.util.List<com.paypal.oslo.feature.mosaic.api.widget.docupload.DocumentTypeID> component2() {
        return this.allowedDocTypes;
    }

    /* renamed from: component11, reason: from getter */
    public final java.lang.String getEntityType() {
        return this.entityType;
    }

    /* renamed from: component10, reason: from getter */
    public final java.lang.String getProduct() {
        return this.product;
    }

    /* renamed from: component1, reason: from getter */
    public final com.paypal.oslo.feature.mosaic.api.widget.docupload.DocCategory getDocCategory() {
        return this.docCategory;
    }
}
