package com.paypal.oslo.feature.verificationcapture.domain.model;

@kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\b\u0086\b\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\t\u0010\nJ\u0016\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0003¢\u0006\u0004\b\u000b\u0010\fJ*\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0016\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0016\u0010\nR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0017\u001a\u0004\b\u0018\u0010\nR \u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0019\u001a\u0004\b\u001a\u0010\f"}, d2 = {"Lcom/paypal/oslo/feature/verificationcapture/domain/model/Entity;", "", "", "entityType", "", "Lcom/paypal/oslo/feature/verificationcapture/domain/model/EntityReference;", "references", "<init>", "(Ljava/lang/String;Ljava/util/List;)V", "component1", "()Ljava/lang/String;", "component2", "()Ljava/util/List;", "copy", "(Ljava/lang/String;Ljava/util/List;)Lcom/paypal/oslo/feature/verificationcapture/domain/model/Entity;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getEntityType", "Ljava/util/List;", "getReferences"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes15.dex */
public final /* data */ class Entity {
    public static final int $stable = 8;
    private final java.lang.String entityType;
    private final java.util.List<com.paypal.oslo.feature.verificationcapture.domain.model.EntityReference> references;

    public Entity(java.lang.String str, java.util.List<com.paypal.oslo.feature.verificationcapture.domain.model.EntityReference> list) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list, "");
        this.entityType = str;
        this.references = list;
    }

    public final java.lang.String getEntityType() {
        return this.entityType;
    }

    public final java.util.List<com.paypal.oslo.feature.verificationcapture.domain.model.EntityReference> getReferences() {
        return this.references;
    }

    public final java.lang.String toString() {
        java.lang.String str = this.entityType;
        java.util.List<com.paypal.oslo.feature.verificationcapture.domain.model.EntityReference> list = this.references;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("Entity(entityType=");
        sb.append(str);
        sb.append(", references=");
        sb.append(list);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        return (this.entityType.hashCode() * 31) + this.references.hashCode();
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.paypal.oslo.feature.verificationcapture.domain.model.Entity)) {
            return false;
        }
        com.paypal.oslo.feature.verificationcapture.domain.model.Entity entity = (com.paypal.oslo.feature.verificationcapture.domain.model.Entity) other;
        return kotlin.jvm.internal.Intrinsics.areEqual(this.entityType, entity.entityType) && kotlin.jvm.internal.Intrinsics.areEqual(this.references, entity.references);
    }

    public final com.paypal.oslo.feature.verificationcapture.domain.model.Entity copy(java.lang.String entityType, java.util.List<com.paypal.oslo.feature.verificationcapture.domain.model.EntityReference> references) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(entityType, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(references, "");
        return new com.paypal.oslo.feature.verificationcapture.domain.model.Entity(entityType, references);
    }

    public final java.util.List<com.paypal.oslo.feature.verificationcapture.domain.model.EntityReference> component2() {
        return this.references;
    }

    /* renamed from: component1, reason: from getter */
    public final java.lang.String getEntityType() {
        return this.entityType;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ com.paypal.oslo.feature.verificationcapture.domain.model.Entity copy$default(com.paypal.oslo.feature.verificationcapture.domain.model.Entity entity, java.lang.String str, java.util.List list, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            str = entity.entityType;
        }
        if ((i & 2) != 0) {
            list = entity.references;
        }
        return entity.copy(str, list);
    }
}
