package com.paypal.oslo.feature.searchandintelligence.domain.model;

@kotlin.Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\t\b\u0086\b\u0018\u00002\u00020\u0001:\u0001\u001eB3\u0012\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u001a\b\u0002\u0010\b\u001a\u0014\u0012\u0004\u0012\u00020\u0006\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u00020\u0005¢\u0006\u0004\b\t\u0010\nJ\u0016\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0003¢\u0006\u0004\b\u000b\u0010\fJ\"\u0010\r\u001a\u0014\u0012\u0004\u0012\u00020\u0006\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u00020\u0005HÆ\u0003¢\u0006\u0004\b\r\u0010\u000eJ<\u0010\u000f\u001a\u00020\u00002\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u001a\b\u0002\u0010\b\u001a\u0014\u0012\u0004\u0012\u00020\u0006\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u00020\u0005HÆ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u001a\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0016\u001a\u00020\u0015HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0018\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b\u0018\u0010\u0019R\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0007¢\u0006\f\n\u0004\b\u0004\u0010\u001a\u001a\u0004\b\u001b\u0010\fR,\u0010\b\u001a\u0014\u0012\u0004\u0012\u00020\u0006\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u00020\u00058\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\u001c\u001a\u0004\b\u001d\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/searchandintelligence/domain/model/Starters;", "", "", "", "greetings", "", "Lcom/paypal/oslo/feature/searchandintelligence/domain/model/Starters$Surface;", "Lcom/paypal/oslo/feature/searchandintelligence/domain/model/QuickStartPrompt;", "quickStartPrompts", "<init>", "(Ljava/util/List;Ljava/util/Map;)V", "component1", "()Ljava/util/List;", "component2", "()Ljava/util/Map;", "copy", "(Ljava/util/List;Ljava/util/Map;)Lcom/paypal/oslo/feature/searchandintelligence/domain/model/Starters;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "()Ljava/lang/String;", "Ljava/util/List;", "getGreetings", "Ljava/util/Map;", "getQuickStartPrompts", "Surface"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class Starters {
    public static final int $stable = 8;
    private final java.util.List<java.lang.String> greetings;
    private final java.util.Map<com.paypal.oslo.feature.searchandintelligence.domain.model.Starters.Surface, java.util.List<com.paypal.oslo.feature.searchandintelligence.domain.model.QuickStartPrompt>> quickStartPrompts;

    /* JADX WARN: Multi-variable type inference failed */
    public Starters(java.util.List<java.lang.String> list, java.util.Map<com.paypal.oslo.feature.searchandintelligence.domain.model.Starters.Surface, ? extends java.util.List<com.paypal.oslo.feature.searchandintelligence.domain.model.QuickStartPrompt>> map) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(map, "");
        this.greetings = list;
        this.quickStartPrompts = map;
    }

    public /* synthetic */ Starters(java.util.List list, java.util.Map map, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? kotlin.collections.CollectionsKt.emptyList() : list, (i & 2) != 0 ? kotlin.collections.MapsKt.emptyMap() : map);
    }

    public final java.util.List<java.lang.String> getGreetings() {
        return this.greetings;
    }

    public final java.util.Map<com.paypal.oslo.feature.searchandintelligence.domain.model.Starters.Surface, java.util.List<com.paypal.oslo.feature.searchandintelligence.domain.model.QuickStartPrompt>> getQuickStartPrompts() {
        return this.quickStartPrompts;
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0007\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\b"}, d2 = {"Lcom/paypal/oslo/feature/searchandintelligence/domain/model/Starters$Surface;", "", "<init>", "(Ljava/lang/String;I)V", "ANY", "HOME", com.paypal.oslo.feature.p2p.ui.transfer.TransferScreenKt.IntentActionSend, "SPEND", "ME"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes2.dex */
    public static final class Surface {
        public static final com.paypal.oslo.feature.searchandintelligence.domain.model.Starters.Surface ANY;
        public static final com.paypal.oslo.feature.searchandintelligence.domain.model.Starters.Surface HOME;
        public static final com.paypal.oslo.feature.searchandintelligence.domain.model.Starters.Surface ME;
        public static final com.paypal.oslo.feature.searchandintelligence.domain.model.Starters.Surface SEND;
        public static final com.paypal.oslo.feature.searchandintelligence.domain.model.Starters.Surface SPEND;
        private static final /* synthetic */ com.paypal.oslo.feature.searchandintelligence.domain.model.Starters.Surface[] getHighResolutionOutputSizeshNQ4ISI;
        private static final /* synthetic */ kotlin.enums.EnumEntries getHighSpeedVideoSizes;

        private Surface(java.lang.String str, int i) {
        }

        static {
            com.paypal.oslo.feature.searchandintelligence.domain.model.Starters.Surface surface = new com.paypal.oslo.feature.searchandintelligence.domain.model.Starters.Surface("ANY", 0);
            ANY = surface;
            com.paypal.oslo.feature.searchandintelligence.domain.model.Starters.Surface surface2 = new com.paypal.oslo.feature.searchandintelligence.domain.model.Starters.Surface("HOME", 1);
            HOME = surface2;
            com.paypal.oslo.feature.searchandintelligence.domain.model.Starters.Surface surface3 = new com.paypal.oslo.feature.searchandintelligence.domain.model.Starters.Surface(com.paypal.oslo.feature.p2p.ui.transfer.TransferScreenKt.IntentActionSend, 2);
            SEND = surface3;
            com.paypal.oslo.feature.searchandintelligence.domain.model.Starters.Surface surface4 = new com.paypal.oslo.feature.searchandintelligence.domain.model.Starters.Surface("SPEND", 3);
            SPEND = surface4;
            com.paypal.oslo.feature.searchandintelligence.domain.model.Starters.Surface surface5 = new com.paypal.oslo.feature.searchandintelligence.domain.model.Starters.Surface("ME", 4);
            ME = surface5;
            com.paypal.oslo.feature.searchandintelligence.domain.model.Starters.Surface[] surfaceArr = {surface, surface2, surface3, surface4, surface5};
            getHighResolutionOutputSizeshNQ4ISI = surfaceArr;
            getHighSpeedVideoSizes = kotlin.enums.EnumEntriesKt.enumEntries(surfaceArr);
        }

        public static com.paypal.oslo.feature.searchandintelligence.domain.model.Starters.Surface[] values() {
            return (com.paypal.oslo.feature.searchandintelligence.domain.model.Starters.Surface[]) getHighResolutionOutputSizeshNQ4ISI.clone();
        }

        public static com.paypal.oslo.feature.searchandintelligence.domain.model.Starters.Surface valueOf(java.lang.String str) {
            return (com.paypal.oslo.feature.searchandintelligence.domain.model.Starters.Surface) java.lang.Enum.valueOf(com.paypal.oslo.feature.searchandintelligence.domain.model.Starters.Surface.class, str);
        }

        public static kotlin.enums.EnumEntries<com.paypal.oslo.feature.searchandintelligence.domain.model.Starters.Surface> getEntries() {
            return getHighSpeedVideoSizes;
        }
    }

    public final java.lang.String toString() {
        java.util.List<java.lang.String> list = this.greetings;
        java.util.Map<com.paypal.oslo.feature.searchandintelligence.domain.model.Starters.Surface, java.util.List<com.paypal.oslo.feature.searchandintelligence.domain.model.QuickStartPrompt>> map = this.quickStartPrompts;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("Starters(greetings=");
        sb.append(list);
        sb.append(", quickStartPrompts=");
        sb.append(map);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        return (this.greetings.hashCode() * 31) + this.quickStartPrompts.hashCode();
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.paypal.oslo.feature.searchandintelligence.domain.model.Starters)) {
            return false;
        }
        com.paypal.oslo.feature.searchandintelligence.domain.model.Starters starters = (com.paypal.oslo.feature.searchandintelligence.domain.model.Starters) other;
        return kotlin.jvm.internal.Intrinsics.areEqual(this.greetings, starters.greetings) && kotlin.jvm.internal.Intrinsics.areEqual(this.quickStartPrompts, starters.quickStartPrompts);
    }

    public final com.paypal.oslo.feature.searchandintelligence.domain.model.Starters copy(java.util.List<java.lang.String> greetings, java.util.Map<com.paypal.oslo.feature.searchandintelligence.domain.model.Starters.Surface, ? extends java.util.List<com.paypal.oslo.feature.searchandintelligence.domain.model.QuickStartPrompt>> quickStartPrompts) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(greetings, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(quickStartPrompts, "");
        return new com.paypal.oslo.feature.searchandintelligence.domain.model.Starters(greetings, quickStartPrompts);
    }

    public final java.util.Map<com.paypal.oslo.feature.searchandintelligence.domain.model.Starters.Surface, java.util.List<com.paypal.oslo.feature.searchandintelligence.domain.model.QuickStartPrompt>> component2() {
        return this.quickStartPrompts;
    }

    public final java.util.List<java.lang.String> component1() {
        return this.greetings;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ com.paypal.oslo.feature.searchandintelligence.domain.model.Starters copy$default(com.paypal.oslo.feature.searchandintelligence.domain.model.Starters starters, java.util.List list, java.util.Map map, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            list = starters.greetings;
        }
        if ((i & 2) != 0) {
            map = starters.quickStartPrompts;
        }
        return starters.copy(list, map);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public Starters() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }
}
