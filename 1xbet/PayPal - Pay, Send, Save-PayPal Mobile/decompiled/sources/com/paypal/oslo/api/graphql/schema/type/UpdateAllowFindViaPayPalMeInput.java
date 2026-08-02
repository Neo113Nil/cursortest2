package com.paypal.oslo.api.graphql.schema.type;

@kotlin.Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\f\n\u0002\u0010\b\n\u0002\b\u0007\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ$\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u000f\u001a\u00020\u00022\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0014\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u000bR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0015\u001a\u0004\b\u0016\u0010\tR\u001a\u0010\u0005\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0017\u001a\u0004\b\u0018\u0010\u000b"}, d2 = {"Lcom/paypal/oslo/api/graphql/schema/type/UpdateAllowFindViaPayPalMeInput;", "", "", "allowFindViaPayPalMe", "", "profileId", "<init>", "(ZLjava/lang/String;)V", "component1", "()Z", "component2", "()Ljava/lang/String;", "copy", "(ZLjava/lang/String;)Lcom/paypal/oslo/api/graphql/schema/type/UpdateAllowFindViaPayPalMeInput;", "other", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Z", "getAllowFindViaPayPalMe", "Ljava/lang/String;", "getProfileId"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class UpdateAllowFindViaPayPalMeInput {
    private final boolean allowFindViaPayPalMe;
    private final java.lang.String profileId;

    public UpdateAllowFindViaPayPalMeInput(boolean z, java.lang.String str) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        this.allowFindViaPayPalMe = z;
        this.profileId = str;
    }

    public final boolean getAllowFindViaPayPalMe() {
        return this.allowFindViaPayPalMe;
    }

    public final java.lang.String getProfileId() {
        return this.profileId;
    }

    public final java.lang.String toString() {
        boolean z = this.allowFindViaPayPalMe;
        java.lang.String str = this.profileId;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("UpdateAllowFindViaPayPalMeInput(allowFindViaPayPalMe=");
        sb.append(z);
        sb.append(", profileId=");
        sb.append(str);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        return (java.lang.Boolean.hashCode(this.allowFindViaPayPalMe) * 31) + this.profileId.hashCode();
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.paypal.oslo.api.graphql.schema.type.UpdateAllowFindViaPayPalMeInput)) {
            return false;
        }
        com.paypal.oslo.api.graphql.schema.type.UpdateAllowFindViaPayPalMeInput updateAllowFindViaPayPalMeInput = (com.paypal.oslo.api.graphql.schema.type.UpdateAllowFindViaPayPalMeInput) other;
        return this.allowFindViaPayPalMe == updateAllowFindViaPayPalMeInput.allowFindViaPayPalMe && kotlin.jvm.internal.Intrinsics.areEqual(this.profileId, updateAllowFindViaPayPalMeInput.profileId);
    }

    public final com.paypal.oslo.api.graphql.schema.type.UpdateAllowFindViaPayPalMeInput copy(boolean allowFindViaPayPalMe, java.lang.String profileId) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(profileId, "");
        return new com.paypal.oslo.api.graphql.schema.type.UpdateAllowFindViaPayPalMeInput(allowFindViaPayPalMe, profileId);
    }

    /* renamed from: component2, reason: from getter */
    public final java.lang.String getProfileId() {
        return this.profileId;
    }

    /* renamed from: component1, reason: from getter */
    public final boolean getAllowFindViaPayPalMe() {
        return this.allowFindViaPayPalMe;
    }

    public static /* synthetic */ com.paypal.oslo.api.graphql.schema.type.UpdateAllowFindViaPayPalMeInput copy$default(com.paypal.oslo.api.graphql.schema.type.UpdateAllowFindViaPayPalMeInput updateAllowFindViaPayPalMeInput, boolean z, java.lang.String str, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            z = updateAllowFindViaPayPalMeInput.allowFindViaPayPalMe;
        }
        if ((i & 2) != 0) {
            str = updateAllowFindViaPayPalMeInput.profileId;
        }
        return updateAllowFindViaPayPalMeInput.copy(z, str);
    }
}
