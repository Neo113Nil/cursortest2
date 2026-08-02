package com.paypal.pds.components;

@kotlin.Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u000e\n\u0002\u0010\b\n\u0002\b\t\b\u0086\b\u0018\u00002\u00020\u0001B/\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\u0010\b\u0002\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006¢\u0006\u0004\b\t\u0010\nJ\u0012\u0010\u000b\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\r\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0018\u0010\u000f\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b\u000f\u0010\u0010J8\u0010\u0011\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\u0010\b\u0002\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006HÆ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u001a\u0010\u0014\u001a\u00020\u00042\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0017\u001a\u00020\u0016HÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u0019\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0019\u0010\fR\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u001a\u001a\u0004\b\u001b\u0010\fR\u001a\u0010\u0005\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u001c\u001a\u0004\b\u001d\u0010\u000eR\"\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u00068\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\u001e\u001a\u0004\b\u001f\u0010\u0010"}, d2 = {"Lcom/paypal/pds/components/TopNavConfig;", "", "", "title", "", "shouldShowBackButton", "Lkotlin/Function0;", "", "onBackButtonClick", "<init>", "(Ljava/lang/String;ZLkotlin/jvm/functions/Function0;)V", "component1", "()Ljava/lang/String;", "component2", "()Z", "component3", "()Lkotlin/jvm/functions/Function0;", "copy", "(Ljava/lang/String;ZLkotlin/jvm/functions/Function0;)Lcom/paypal/pds/components/TopNavConfig;", "other", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getTitle", "Z", "getShouldShowBackButton", "Lkotlin/jvm/functions/Function0;", "getOnBackButtonClick"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class TopNavConfig {
    public static final int $stable = 0;
    private final kotlin.jvm.functions.Function0<kotlin.Unit> onBackButtonClick;
    private final boolean shouldShowBackButton;
    private final java.lang.String title;

    public TopNavConfig(java.lang.String str, boolean z, kotlin.jvm.functions.Function0<kotlin.Unit> function0) {
        this.title = str;
        this.shouldShowBackButton = z;
        this.onBackButtonClick = function0;
    }

    public /* synthetic */ TopNavConfig(java.lang.String str, boolean z, kotlin.jvm.functions.Function0 function0, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? false : z, (i & 4) != 0 ? null : function0);
    }

    public final java.lang.String getTitle() {
        return this.title;
    }

    public final boolean getShouldShowBackButton() {
        return this.shouldShowBackButton;
    }

    public final kotlin.jvm.functions.Function0<kotlin.Unit> getOnBackButtonClick() {
        return this.onBackButtonClick;
    }

    public final java.lang.String toString() {
        java.lang.String str = this.title;
        boolean z = this.shouldShowBackButton;
        kotlin.jvm.functions.Function0<kotlin.Unit> function0 = this.onBackButtonClick;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("TopNavConfig(title=");
        sb.append(str);
        sb.append(", shouldShowBackButton=");
        sb.append(z);
        sb.append(", onBackButtonClick=");
        sb.append(function0);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        java.lang.String str = this.title;
        int hashCode = str == null ? 0 : str.hashCode();
        int hashCode2 = java.lang.Boolean.hashCode(this.shouldShowBackButton);
        kotlin.jvm.functions.Function0<kotlin.Unit> function0 = this.onBackButtonClick;
        return (((hashCode * 31) + hashCode2) * 31) + (function0 != null ? function0.hashCode() : 0);
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.paypal.pds.components.TopNavConfig)) {
            return false;
        }
        com.paypal.pds.components.TopNavConfig topNavConfig = (com.paypal.pds.components.TopNavConfig) other;
        return kotlin.jvm.internal.Intrinsics.areEqual(this.title, topNavConfig.title) && this.shouldShowBackButton == topNavConfig.shouldShowBackButton && kotlin.jvm.internal.Intrinsics.areEqual(this.onBackButtonClick, topNavConfig.onBackButtonClick);
    }

    public final com.paypal.pds.components.TopNavConfig copy(java.lang.String title, boolean shouldShowBackButton, kotlin.jvm.functions.Function0<kotlin.Unit> onBackButtonClick) {
        return new com.paypal.pds.components.TopNavConfig(title, shouldShowBackButton, onBackButtonClick);
    }

    public final kotlin.jvm.functions.Function0<kotlin.Unit> component3() {
        return this.onBackButtonClick;
    }

    /* renamed from: component2, reason: from getter */
    public final boolean getShouldShowBackButton() {
        return this.shouldShowBackButton;
    }

    /* renamed from: component1, reason: from getter */
    public final java.lang.String getTitle() {
        return this.title;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ com.paypal.pds.components.TopNavConfig copy$default(com.paypal.pds.components.TopNavConfig topNavConfig, java.lang.String str, boolean z, kotlin.jvm.functions.Function0 function0, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            str = topNavConfig.title;
        }
        if ((i & 2) != 0) {
            z = topNavConfig.shouldShowBackButton;
        }
        if ((i & 4) != 0) {
            function0 = topNavConfig.onBackButtonClick;
        }
        return topNavConfig.copy(str, z, function0);
    }

    public TopNavConfig() {
        this(null, false, null, 7, null);
    }
}
