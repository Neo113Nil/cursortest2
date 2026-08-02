package com.paypal.pds.components;

@kotlin.Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0018\b\u0086\b\u0018\u0000 82\u00020\u0001:\u00018BR\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\u0015\b\u0002\u0010\u000b\u001a\u000f\u0012\u0004\u0012\u00020\t\u0018\u00010\b¢\u0006\u0002\b\n\u0012\b\b\u0002\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0010\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u0012\u0010\u0013J\u0012\u0010\u0014\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0014\u0010\u0011J\u0012\u0010\u0015\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0015\u0010\u0011J\u001d\u0010\u0016\u001a\u000f\u0012\u0004\u0012\u00020\t\u0018\u00010\b¢\u0006\u0002\b\nHÆ\u0003¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0018\u001a\u00020\fHÆ\u0003¢\u0006\u0004\b\u0018\u0010\u0019J]\u0010\u001a\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00022\u0015\b\u0002\u0010\u000b\u001a\u000f\u0012\u0004\u0012\u00020\t\u0018\u00010\b¢\u0006\u0002\b\n2\b\b\u0002\u0010\r\u001a\u00020\fHÆ\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\u001a\u0010\u001e\u001a\u00020\u001d2\b\u0010\u001c\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001e\u0010\u001fJ\u0010\u0010!\u001a\u00020 HÖ\u0001¢\u0006\u0004\b!\u0010\"J\u0010\u0010#\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b#\u0010\u0011R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010$\u001a\u0004\b%\u0010\u0011R\u001a\u0010\u0005\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010&\u001a\u0004\b'\u0010\u0013R\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010$\u001a\u0004\b(\u0010\u0011R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010$\u001a\u0004\b)\u0010\u0011R'\u0010\u000b\u001a\u000f\u0012\u0004\u0012\u00020\t\u0018\u00010\b¢\u0006\u0002\b\n8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010*\u001a\u0004\b+\u0010\u0017R\u001a\u0010\r\u001a\u00020\f8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\r\u0010,\u001a\u0004\b-\u0010\u0019R\u001a\u00101\u001a\u00020\u00048GX\u0087\u0004¢\u0006\f\u0012\u0004\b/\u00100\u001a\u0004\b.\u0010\u0013R\u001c\u00104\u001a\u0004\u0018\u00010\u00028GX\u0087\u0004¢\u0006\f\u0012\u0004\b3\u00100\u001a\u0004\b2\u0010\u0011R\u001c\u00107\u001a\u0004\u0018\u00010\u00028GX\u0087\u0004¢\u0006\f\u0012\u0004\b6\u00100\u001a\u0004\b5\u0010\u0011"}, d2 = {"Lcom/paypal/pds/components/TimelineVerticalItem;", "", "", "title", "Lcom/paypal/pds/components/TimelineState;", "state", "subtitle", "metadata", "Lkotlin/Function0;", "", "Landroidx/compose/runtime/Composable;", "bottomSlot", "Lcom/paypal/pds/core/AnalyticsScope;", "analyticsScope", "<init>", "(Ljava/lang/String;Lcom/paypal/pds/components/TimelineState;Ljava/lang/String;Ljava/lang/String;Lkotlin/jvm/functions/Function2;Lcom/paypal/pds/core/AnalyticsScope;)V", "component1", "()Ljava/lang/String;", "component2", "()Lcom/paypal/pds/components/TimelineState;", "component3", "component4", "component5", "()Lkotlin/jvm/functions/Function2;", "component6", "()Lcom/paypal/pds/core/AnalyticsScope;", "copy", "(Ljava/lang/String;Lcom/paypal/pds/components/TimelineState;Ljava/lang/String;Ljava/lang/String;Lkotlin/jvm/functions/Function2;Lcom/paypal/pds/core/AnalyticsScope;)Lcom/paypal/pds/components/TimelineVerticalItem;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getTitle", "Lcom/paypal/pds/components/TimelineState;", "getState", "getSubtitle", "getMetadata", "Lkotlin/jvm/functions/Function2;", "getBottomSlot", "Lcom/paypal/pds/core/AnalyticsScope;", "getAnalyticsScope", "getTimelineState", "getTimelineState$annotations", "()V", "timelineState", "getSubTitle", "getSubTitle$annotations", "subTitle", "getMetaDate", "getMetaDate$annotations", "metaDate", "Companion"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class TimelineVerticalItem {
    public static final int $stable = 0;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final com.paypal.pds.components.TimelineVerticalItem.Companion INSTANCE = new com.paypal.pds.components.TimelineVerticalItem.Companion(null);
    private final com.paypal.pds.core.AnalyticsScope analyticsScope;
    private final kotlin.jvm.functions.Function2<androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit> bottomSlot;
    private final java.lang.String metadata;
    private final com.paypal.pds.components.TimelineState state;
    private final java.lang.String subtitle;
    private final java.lang.String title;

    @kotlin.Deprecated(message = "Use metadata property", replaceWith = @kotlin.ReplaceWith(expression = "metadata", imports = {}))
    public static /* synthetic */ void getMetaDate$annotations() {
    }

    @kotlin.Deprecated(message = "Use subtitle property", replaceWith = @kotlin.ReplaceWith(expression = "subtitle", imports = {}))
    public static /* synthetic */ void getSubTitle$annotations() {
    }

    @kotlin.Deprecated(message = "Use state property", replaceWith = @kotlin.ReplaceWith(expression = "state", imports = {}))
    public static /* synthetic */ void getTimelineState$annotations() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    public TimelineVerticalItem(java.lang.String str, com.paypal.pds.components.TimelineState timelineState, java.lang.String str2, java.lang.String str3, kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> function2, com.paypal.pds.core.AnalyticsScope analyticsScope) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(timelineState, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(analyticsScope, "");
        this.title = str;
        this.state = timelineState;
        this.subtitle = str2;
        this.metadata = str3;
        this.bottomSlot = function2;
        this.analyticsScope = analyticsScope;
    }

    public final java.lang.String getTitle() {
        return this.title;
    }

    public /* synthetic */ TimelineVerticalItem(java.lang.String str, com.paypal.pds.components.TimelineState.NotStarted notStarted, java.lang.String str2, java.lang.String str3, kotlin.jvm.functions.Function2 function2, com.paypal.pds.core.AnalyticsScope analyticsScope, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i & 2) != 0 ? com.paypal.pds.components.TimelineState.INSTANCE.getNotStarted() : notStarted, (i & 4) != 0 ? null : str2, (i & 8) != 0 ? null : str3, (i & 16) != 0 ? null : function2, (i & 32) != 0 ? com.paypal.pds.core.AnalyticsScope.INSTANCE.getEmpty() : analyticsScope);
    }

    public final com.paypal.pds.components.TimelineState getState() {
        return this.state;
    }

    public final java.lang.String getSubtitle() {
        return this.subtitle;
    }

    public final java.lang.String getMetadata() {
        return this.metadata;
    }

    public final kotlin.jvm.functions.Function2<androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit> getBottomSlot() {
        return this.bottomSlot;
    }

    public final com.paypal.pds.core.AnalyticsScope getAnalyticsScope() {
        return this.analyticsScope;
    }

    public final com.paypal.pds.components.TimelineState getTimelineState() {
        return this.state;
    }

    public final java.lang.String getSubTitle() {
        return this.subtitle;
    }

    public final java.lang.String getMetaDate() {
        return this.metadata;
    }

    @kotlin.Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J:\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00062\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0004H\u0087\u0002¢\u0006\u0004\b\u000b\u0010\f"}, d2 = {"Lcom/paypal/pds/components/TimelineVerticalItem$Companion;", "", "<init>", "()V", "", "title", "Lcom/paypal/pds/components/TimelineState;", "timelineState", "subTitle", "metaDate", "Lcom/paypal/pds/components/TimelineVerticalItem;", "invoke", "(Ljava/lang/String;Lcom/paypal/pds/components/TimelineState;Ljava/lang/String;Ljava/lang/String;)Lcom/paypal/pds/components/TimelineVerticalItem;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public static /* synthetic */ com.paypal.pds.components.TimelineVerticalItem invoke$default(com.paypal.pds.components.TimelineVerticalItem.Companion companion, java.lang.String str, com.paypal.pds.components.TimelineState timelineState, java.lang.String str2, java.lang.String str3, int i, java.lang.Object obj) {
            if ((i & 2) != 0) {
                timelineState = com.paypal.pds.components.TimelineState.INSTANCE.getNotStarted();
            }
            if ((i & 4) != 0) {
                str2 = null;
            }
            if ((i & 8) != 0) {
                str3 = null;
            }
            return companion.invoke(str, timelineState, str2, str3);
        }

        @kotlin.Deprecated(message = "Use TimelineVerticalItem(title = ..., state = ..., subtitle = ..., metadata = ...) instead", replaceWith = @kotlin.ReplaceWith(expression = "TimelineVerticalItem(title = title, state = timelineState, subtitle = subTitle, metadata = metaDate)", imports = {}))
        public final com.paypal.pds.components.TimelineVerticalItem invoke(java.lang.String title, com.paypal.pds.components.TimelineState timelineState, java.lang.String subTitle, java.lang.String metaDate) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(title, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(timelineState, "");
            return new com.paypal.pds.components.TimelineVerticalItem(title, timelineState, subTitle, metaDate, null, null, 48, null);
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public final java.lang.String toString() {
        java.lang.String str = this.title;
        com.paypal.pds.components.TimelineState timelineState = this.state;
        java.lang.String str2 = this.subtitle;
        java.lang.String str3 = this.metadata;
        kotlin.jvm.functions.Function2<androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit> function2 = this.bottomSlot;
        com.paypal.pds.core.AnalyticsScope analyticsScope = this.analyticsScope;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("TimelineVerticalItem(title=");
        sb.append(str);
        sb.append(", state=");
        sb.append(timelineState);
        sb.append(", subtitle=");
        sb.append(str2);
        sb.append(", metadata=");
        sb.append(str3);
        sb.append(", bottomSlot=");
        sb.append(function2);
        sb.append(", analyticsScope=");
        sb.append(analyticsScope);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        int hashCode = this.title.hashCode();
        int hashCode2 = this.state.hashCode();
        java.lang.String str = this.subtitle;
        int hashCode3 = str == null ? 0 : str.hashCode();
        java.lang.String str2 = this.metadata;
        int hashCode4 = str2 == null ? 0 : str2.hashCode();
        kotlin.jvm.functions.Function2<androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit> function2 = this.bottomSlot;
        return (((((((((hashCode * 31) + hashCode2) * 31) + hashCode3) * 31) + hashCode4) * 31) + (function2 != null ? function2.hashCode() : 0)) * 31) + this.analyticsScope.hashCode();
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.paypal.pds.components.TimelineVerticalItem)) {
            return false;
        }
        com.paypal.pds.components.TimelineVerticalItem timelineVerticalItem = (com.paypal.pds.components.TimelineVerticalItem) other;
        return kotlin.jvm.internal.Intrinsics.areEqual(this.title, timelineVerticalItem.title) && kotlin.jvm.internal.Intrinsics.areEqual(this.state, timelineVerticalItem.state) && kotlin.jvm.internal.Intrinsics.areEqual(this.subtitle, timelineVerticalItem.subtitle) && kotlin.jvm.internal.Intrinsics.areEqual(this.metadata, timelineVerticalItem.metadata) && kotlin.jvm.internal.Intrinsics.areEqual(this.bottomSlot, timelineVerticalItem.bottomSlot) && kotlin.jvm.internal.Intrinsics.areEqual(this.analyticsScope, timelineVerticalItem.analyticsScope);
    }

    public final com.paypal.pds.components.TimelineVerticalItem copy(java.lang.String title, com.paypal.pds.components.TimelineState state, java.lang.String subtitle, java.lang.String metadata, kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> bottomSlot, com.paypal.pds.core.AnalyticsScope analyticsScope) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(title, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(state, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(analyticsScope, "");
        return new com.paypal.pds.components.TimelineVerticalItem(title, state, subtitle, metadata, bottomSlot, analyticsScope);
    }

    /* renamed from: component6, reason: from getter */
    public final com.paypal.pds.core.AnalyticsScope getAnalyticsScope() {
        return this.analyticsScope;
    }

    public final kotlin.jvm.functions.Function2<androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit> component5() {
        return this.bottomSlot;
    }

    /* renamed from: component4, reason: from getter */
    public final java.lang.String getMetadata() {
        return this.metadata;
    }

    /* renamed from: component3, reason: from getter */
    public final java.lang.String getSubtitle() {
        return this.subtitle;
    }

    /* renamed from: component2, reason: from getter */
    public final com.paypal.pds.components.TimelineState getState() {
        return this.state;
    }

    /* renamed from: component1, reason: from getter */
    public final java.lang.String getTitle() {
        return this.title;
    }

    public static /* synthetic */ com.paypal.pds.components.TimelineVerticalItem copy$default(com.paypal.pds.components.TimelineVerticalItem timelineVerticalItem, java.lang.String str, com.paypal.pds.components.TimelineState timelineState, java.lang.String str2, java.lang.String str3, kotlin.jvm.functions.Function2 function2, com.paypal.pds.core.AnalyticsScope analyticsScope, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            str = timelineVerticalItem.title;
        }
        if ((i & 2) != 0) {
            timelineState = timelineVerticalItem.state;
        }
        com.paypal.pds.components.TimelineState timelineState2 = timelineState;
        if ((i & 4) != 0) {
            str2 = timelineVerticalItem.subtitle;
        }
        java.lang.String str4 = str2;
        if ((i & 8) != 0) {
            str3 = timelineVerticalItem.metadata;
        }
        java.lang.String str5 = str3;
        if ((i & 16) != 0) {
            function2 = timelineVerticalItem.bottomSlot;
        }
        kotlin.jvm.functions.Function2 function22 = function2;
        if ((i & 32) != 0) {
            analyticsScope = timelineVerticalItem.analyticsScope;
        }
        return timelineVerticalItem.copy(str, timelineState2, str4, str5, function22, analyticsScope);
    }
}
