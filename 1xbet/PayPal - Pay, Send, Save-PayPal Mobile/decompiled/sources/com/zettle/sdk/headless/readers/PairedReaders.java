package com.zettle.sdk.headless.readers;

@kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0086\b\u0018\u0000 \u001c2\u00020\u0001:\u0001\u001cB\u001d\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\t\u0010\nJ\u0016\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0003¢\u0006\u0004\b\u000b\u0010\fJ*\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0010\u001a\u00020\u00022\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0016\u001a\u00020\u0015HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017R\u001d\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0007¢\u0006\f\n\u0004\b\u0006\u0010\u0018\u001a\u0004\b\u0019\u0010\fR\u001a\u0010\u0003\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u001a\u001a\u0004\b\u001b\u0010\n"}, d2 = {"Lcom/zettle/sdk/headless/readers/PairedReaders;", "", "", "updating", "", "Lcom/zettle/sdk/headless/readers/PairedReader;", "readers", "<init>", "(ZLjava/util/Set;)V", "component1", "()Z", "component2", "()Ljava/util/Set;", "copy", "(ZLjava/util/Set;)Lcom/zettle/sdk/headless/readers/PairedReaders;", "other", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Ljava/util/Set;", "getReaders", "Z", "getUpdating", "Companion"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes17.dex */
public final /* data */ class PairedReaders {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final com.zettle.sdk.headless.readers.PairedReaders.Companion INSTANCE = new com.zettle.sdk.headless.readers.PairedReaders.Companion(null);
    private static final com.zettle.sdk.headless.readers.PairedReaders INACTIVE = new com.zettle.sdk.headless.readers.PairedReaders(false, kotlin.collections.SetsKt.emptySet());
    private final java.util.Set<com.zettle.sdk.headless.readers.PairedReader> readers;
    private final boolean updating;

    public PairedReaders(boolean z, java.util.Set<com.zettle.sdk.headless.readers.PairedReader> set) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(set, "");
        this.updating = z;
        this.readers = set;
    }

    public final java.util.Set<com.zettle.sdk.headless.readers.PairedReader> getReaders() {
        return this.readers;
    }

    public final boolean getUpdating() {
        return this.updating;
    }

    @kotlin.Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001b\u0010\b\u001a\u00020\u00072\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\b\u0010\tR\u0017\u0010\n\u001a\u00020\u00078\u0007¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\r"}, d2 = {"Lcom/zettle/sdk/headless/readers/PairedReaders$Companion;", "", "<init>", "()V", "", "Lcom/zettle/sdk/headless/readers/PairedReader;", "readers", "Lcom/zettle/sdk/headless/readers/PairedReaders;", com.paypal.oslo.feature.shoppingrewards.rewards.common.analytics.RewardsAnalyticsConstants.Action.ACTIVE, "(Ljava/util/List;)Lcom/zettle/sdk/headless/readers/PairedReaders;", com.payair.model.TokenStatusKt.TOKEN_INACTIVE, "Lcom/zettle/sdk/headless/readers/PairedReaders;", "getINACTIVE", "()Lcom/zettle/sdk/headless/readers/PairedReaders;"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public final com.zettle.sdk.headless.readers.PairedReaders getINACTIVE() {
            return com.zettle.sdk.headless.readers.PairedReaders.INACTIVE;
        }

        public final com.zettle.sdk.headless.readers.PairedReaders active(java.util.List<com.zettle.sdk.headless.readers.PairedReader> readers) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(readers, "");
            return new com.zettle.sdk.headless.readers.PairedReaders(true, kotlin.collections.CollectionsKt.toSet(readers));
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public final java.lang.String toString() {
        boolean z = this.updating;
        java.util.Set<com.zettle.sdk.headless.readers.PairedReader> set = this.readers;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("PairedReaders(updating=");
        sb.append(z);
        sb.append(", readers=");
        sb.append(set);
        sb.append(")");
        return sb.toString();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [int] */
    /* JADX WARN: Type inference failed for: r0v4 */
    /* JADX WARN: Type inference failed for: r0v5 */
    public final int hashCode() {
        boolean z = this.updating;
        ?? r0 = z;
        if (z) {
            r0 = 1;
        }
        return (r0 * 31) + this.readers.hashCode();
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.zettle.sdk.headless.readers.PairedReaders)) {
            return false;
        }
        com.zettle.sdk.headless.readers.PairedReaders pairedReaders = (com.zettle.sdk.headless.readers.PairedReaders) other;
        return this.updating == pairedReaders.updating && kotlin.jvm.internal.Intrinsics.areEqual(this.readers, pairedReaders.readers);
    }

    public final com.zettle.sdk.headless.readers.PairedReaders copy(boolean updating, java.util.Set<com.zettle.sdk.headless.readers.PairedReader> readers) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(readers, "");
        return new com.zettle.sdk.headless.readers.PairedReaders(updating, readers);
    }

    public final java.util.Set<com.zettle.sdk.headless.readers.PairedReader> component2() {
        return this.readers;
    }

    /* renamed from: component1, reason: from getter */
    public final boolean getUpdating() {
        return this.updating;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ com.zettle.sdk.headless.readers.PairedReaders copy$default(com.zettle.sdk.headless.readers.PairedReaders pairedReaders, boolean z, java.util.Set set, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            z = pairedReaders.updating;
        }
        if ((i & 2) != 0) {
            set = pairedReaders.readers;
        }
        return pairedReaders.copy(z, set);
    }
}
