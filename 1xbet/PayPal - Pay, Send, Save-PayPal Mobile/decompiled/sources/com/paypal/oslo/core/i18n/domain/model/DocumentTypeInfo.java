package com.paypal.oslo.core.i18n.domain.model;

@kotlin.Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\t\u0010\nJ\u0016\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0003¢\u0006\u0004\b\u000b\u0010\fJ*\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0017\u001a\u00020\u0016HÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0018R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0019\u001a\u0004\b\u001a\u0010\nR \u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u001b\u001a\u0004\b\u001c\u0010\f"}, d2 = {"Lcom/paypal/oslo/core/i18n/domain/model/DocumentTypeInfo;", "", "Lcom/paypal/oslo/core/i18n/domain/model/DocumentType;", "type", "", "Lcom/paypal/oslo/core/i18n/domain/model/DocumentSubType;", "subTypes", "<init>", "(Lcom/paypal/oslo/core/i18n/domain/model/DocumentType;Ljava/util/List;)V", "component1", "()Lcom/paypal/oslo/core/i18n/domain/model/DocumentType;", "component2", "()Ljava/util/List;", "copy", "(Lcom/paypal/oslo/core/i18n/domain/model/DocumentType;Ljava/util/List;)Lcom/paypal/oslo/core/i18n/domain/model/DocumentTypeInfo;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lcom/paypal/oslo/core/i18n/domain/model/DocumentType;", "getType", "Ljava/util/List;", "getSubTypes"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes10.dex */
public final /* data */ class DocumentTypeInfo {
    private final java.util.List<com.paypal.oslo.core.i18n.domain.model.DocumentSubType> subTypes;
    private final com.paypal.oslo.core.i18n.domain.model.DocumentType type;

    /* JADX WARN: Multi-variable type inference failed */
    public DocumentTypeInfo(com.paypal.oslo.core.i18n.domain.model.DocumentType documentType, java.util.List<? extends com.paypal.oslo.core.i18n.domain.model.DocumentSubType> list) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(documentType, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list, "");
        this.type = documentType;
        this.subTypes = list;
    }

    public final com.paypal.oslo.core.i18n.domain.model.DocumentType getType() {
        return this.type;
    }

    public final java.util.List<com.paypal.oslo.core.i18n.domain.model.DocumentSubType> getSubTypes() {
        return this.subTypes;
    }

    public final java.lang.String toString() {
        com.paypal.oslo.core.i18n.domain.model.DocumentType documentType = this.type;
        java.util.List<com.paypal.oslo.core.i18n.domain.model.DocumentSubType> list = this.subTypes;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("DocumentTypeInfo(type=");
        sb.append(documentType);
        sb.append(", subTypes=");
        sb.append(list);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        return (this.type.hashCode() * 31) + this.subTypes.hashCode();
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.paypal.oslo.core.i18n.domain.model.DocumentTypeInfo)) {
            return false;
        }
        com.paypal.oslo.core.i18n.domain.model.DocumentTypeInfo documentTypeInfo = (com.paypal.oslo.core.i18n.domain.model.DocumentTypeInfo) other;
        return this.type == documentTypeInfo.type && kotlin.jvm.internal.Intrinsics.areEqual(this.subTypes, documentTypeInfo.subTypes);
    }

    public final com.paypal.oslo.core.i18n.domain.model.DocumentTypeInfo copy(com.paypal.oslo.core.i18n.domain.model.DocumentType type, java.util.List<? extends com.paypal.oslo.core.i18n.domain.model.DocumentSubType> subTypes) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(type, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(subTypes, "");
        return new com.paypal.oslo.core.i18n.domain.model.DocumentTypeInfo(type, subTypes);
    }

    public final java.util.List<com.paypal.oslo.core.i18n.domain.model.DocumentSubType> component2() {
        return this.subTypes;
    }

    /* renamed from: component1, reason: from getter */
    public final com.paypal.oslo.core.i18n.domain.model.DocumentType getType() {
        return this.type;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ com.paypal.oslo.core.i18n.domain.model.DocumentTypeInfo copy$default(com.paypal.oslo.core.i18n.domain.model.DocumentTypeInfo documentTypeInfo, com.paypal.oslo.core.i18n.domain.model.DocumentType documentType, java.util.List list, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            documentType = documentTypeInfo.type;
        }
        if ((i & 2) != 0) {
            list = documentTypeInfo.subTypes;
        }
        return documentTypeInfo.copy(documentType, list);
    }
}
