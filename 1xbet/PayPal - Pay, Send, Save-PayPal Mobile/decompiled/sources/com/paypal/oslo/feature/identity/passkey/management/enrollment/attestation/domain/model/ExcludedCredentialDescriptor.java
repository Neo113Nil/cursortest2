package com.paypal.oslo.feature.identity.passkey.management.enrollment.attestation.domain.model;

@kotlin.Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\b\b\u0086\b\u0018\u00002\u00020\u0001B)\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0010\b\u0002\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000b\u0010\nJ\u0018\u0010\f\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0005HÆ\u0003¢\u0006\u0004\b\f\u0010\rJ6\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\u0010\b\u0002\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0005HÆ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0015\u001a\u00020\u0014HÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0017\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0017\u0010\nR\u001a\u0010\u0003\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0018\u001a\u0004\b\u0019\u0010\nR\u001a\u0010\u0004\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0018\u001a\u0004\b\u001a\u0010\nR\"\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00058\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u001b\u001a\u0004\b\u001c\u0010\r"}, d2 = {"Lcom/paypal/oslo/feature/identity/passkey/management/enrollment/attestation/domain/model/ExcludedCredentialDescriptor;", "", "", "id", "type", "", "transports", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)V", "component1", "()Ljava/lang/String;", "component2", "component3", "()Ljava/util/List;", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)Lcom/paypal/oslo/feature/identity/passkey/management/enrollment/attestation/domain/model/ExcludedCredentialDescriptor;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getId", "getType", "Ljava/util/List;", "getTransports"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes12.dex */
public final /* data */ class ExcludedCredentialDescriptor {
    public static final int $stable = 8;
    private final java.lang.String id;
    private final java.util.List<java.lang.String> transports;
    private final java.lang.String type;

    public ExcludedCredentialDescriptor(java.lang.String str, java.lang.String str2, java.util.List<java.lang.String> list) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str2, "");
        this.id = str;
        this.type = str2;
        this.transports = list;
    }

    public /* synthetic */ ExcludedCredentialDescriptor(java.lang.String str, java.lang.String str2, java.util.List list, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, (i & 4) != 0 ? null : list);
    }

    public final java.lang.String getId() {
        return this.id;
    }

    public final java.lang.String getType() {
        return this.type;
    }

    public final java.util.List<java.lang.String> getTransports() {
        return this.transports;
    }

    public final java.lang.String toString() {
        java.lang.String str = this.id;
        java.lang.String str2 = this.type;
        java.util.List<java.lang.String> list = this.transports;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("ExcludedCredentialDescriptor(id=");
        sb.append(str);
        sb.append(", type=");
        sb.append(str2);
        sb.append(", transports=");
        sb.append(list);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        int hashCode = this.id.hashCode();
        int hashCode2 = this.type.hashCode();
        java.util.List<java.lang.String> list = this.transports;
        return (((hashCode * 31) + hashCode2) * 31) + (list == null ? 0 : list.hashCode());
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.paypal.oslo.feature.identity.passkey.management.enrollment.attestation.domain.model.ExcludedCredentialDescriptor)) {
            return false;
        }
        com.paypal.oslo.feature.identity.passkey.management.enrollment.attestation.domain.model.ExcludedCredentialDescriptor excludedCredentialDescriptor = (com.paypal.oslo.feature.identity.passkey.management.enrollment.attestation.domain.model.ExcludedCredentialDescriptor) other;
        return kotlin.jvm.internal.Intrinsics.areEqual(this.id, excludedCredentialDescriptor.id) && kotlin.jvm.internal.Intrinsics.areEqual(this.type, excludedCredentialDescriptor.type) && kotlin.jvm.internal.Intrinsics.areEqual(this.transports, excludedCredentialDescriptor.transports);
    }

    public final com.paypal.oslo.feature.identity.passkey.management.enrollment.attestation.domain.model.ExcludedCredentialDescriptor copy(java.lang.String id, java.lang.String type, java.util.List<java.lang.String> transports) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(id, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(type, "");
        return new com.paypal.oslo.feature.identity.passkey.management.enrollment.attestation.domain.model.ExcludedCredentialDescriptor(id, type, transports);
    }

    public final java.util.List<java.lang.String> component3() {
        return this.transports;
    }

    /* renamed from: component2, reason: from getter */
    public final java.lang.String getType() {
        return this.type;
    }

    /* renamed from: component1, reason: from getter */
    public final java.lang.String getId() {
        return this.id;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ com.paypal.oslo.feature.identity.passkey.management.enrollment.attestation.domain.model.ExcludedCredentialDescriptor copy$default(com.paypal.oslo.feature.identity.passkey.management.enrollment.attestation.domain.model.ExcludedCredentialDescriptor excludedCredentialDescriptor, java.lang.String str, java.lang.String str2, java.util.List list, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            str = excludedCredentialDescriptor.id;
        }
        if ((i & 2) != 0) {
            str2 = excludedCredentialDescriptor.type;
        }
        if ((i & 4) != 0) {
            list = excludedCredentialDescriptor.transports;
        }
        return excludedCredentialDescriptor.copy(str, str2, list);
    }
}
