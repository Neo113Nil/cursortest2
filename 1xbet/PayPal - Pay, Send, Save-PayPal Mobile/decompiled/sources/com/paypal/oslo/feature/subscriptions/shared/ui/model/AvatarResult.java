package com.paypal.oslo.feature.subscriptions.shared.ui.model;

@kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\f\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0086\b\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ$\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u000f\u001a\u00020\u00042\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0015\u001a\u00020\u0014HÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0016R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0017\u001a\u0004\b\u0018\u0010\tR\u001a\u0010\u0005\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0019\u001a\u0004\b\u0005\u0010\u000b"}, d2 = {"Lcom/paypal/oslo/feature/subscriptions/shared/ui/model/AvatarResult;", "", "Lcom/paypal/pds/components/AvatarSource;", "source", "", "isFallback", "<init>", "(Lcom/paypal/pds/components/AvatarSource;Z)V", "component1", "()Lcom/paypal/pds/components/AvatarSource;", "component2", "()Z", "copy", "(Lcom/paypal/pds/components/AvatarSource;Z)Lcom/paypal/oslo/feature/subscriptions/shared/ui/model/AvatarResult;", "other", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lcom/paypal/pds/components/AvatarSource;", "getSource", "Z"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes15.dex */
public final /* data */ class AvatarResult {
    public static final int $stable = 0;
    private final boolean isFallback;
    private final com.paypal.pds.components.AvatarSource source;

    public AvatarResult(com.paypal.pds.components.AvatarSource avatarSource, boolean z) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(avatarSource, "");
        this.source = avatarSource;
        this.isFallback = z;
    }

    public /* synthetic */ AvatarResult(com.paypal.pds.components.AvatarSource avatarSource, boolean z, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(avatarSource, (i & 2) != 0 ? false : z);
    }

    public final com.paypal.pds.components.AvatarSource getSource() {
        return this.source;
    }

    public final boolean isFallback() {
        return this.isFallback;
    }

    public final java.lang.String toString() {
        com.paypal.pds.components.AvatarSource avatarSource = this.source;
        boolean z = this.isFallback;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("AvatarResult(source=");
        sb.append(avatarSource);
        sb.append(", isFallback=");
        sb.append(z);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        return (this.source.hashCode() * 31) + java.lang.Boolean.hashCode(this.isFallback);
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.paypal.oslo.feature.subscriptions.shared.ui.model.AvatarResult)) {
            return false;
        }
        com.paypal.oslo.feature.subscriptions.shared.ui.model.AvatarResult avatarResult = (com.paypal.oslo.feature.subscriptions.shared.ui.model.AvatarResult) other;
        return kotlin.jvm.internal.Intrinsics.areEqual(this.source, avatarResult.source) && this.isFallback == avatarResult.isFallback;
    }

    public final com.paypal.oslo.feature.subscriptions.shared.ui.model.AvatarResult copy(com.paypal.pds.components.AvatarSource source, boolean isFallback) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(source, "");
        return new com.paypal.oslo.feature.subscriptions.shared.ui.model.AvatarResult(source, isFallback);
    }

    /* renamed from: component2, reason: from getter */
    public final boolean getIsFallback() {
        return this.isFallback;
    }

    /* renamed from: component1, reason: from getter */
    public final com.paypal.pds.components.AvatarSource getSource() {
        return this.source;
    }

    public static /* synthetic */ com.paypal.oslo.feature.subscriptions.shared.ui.model.AvatarResult copy$default(com.paypal.oslo.feature.subscriptions.shared.ui.model.AvatarResult avatarResult, com.paypal.pds.components.AvatarSource avatarSource, boolean z, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            avatarSource = avatarResult.source;
        }
        if ((i & 2) != 0) {
            z = avatarResult.isFallback;
        }
        return avatarResult.copy(avatarSource, z);
    }
}
