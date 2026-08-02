package com.paypal.oslo.feature.balance.ui.balanceDashboard.externalFeatures;

@kotlin.Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\n\b\u0086\b\u0018\u00002\u00020\u0001B-\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u0007¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000e\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b\u000f\u0010\u0010J\u0016\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\b0\u0007HÆ\u0003¢\u0006\u0004\b\u0011\u0010\u0012J>\u0010\u0013\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00052\u000e\b\u0002\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u0007HÆ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u001a\u0010\u0017\u001a\u00020\u00162\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u001a\u001a\u00020\u0019HÖ\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001c\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001c\u0010\rR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u001d\u001a\u0004\b\u001e\u0010\rR\u001a\u0010\u0004\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u001d\u001a\u0004\b\u001f\u0010\rR\u001a\u0010\u0006\u001a\u00020\u00058\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010 \u001a\u0004\b!\u0010\u0010R \u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u00078\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\"\u001a\u0004\b#\u0010\u0012"}, d2 = {"Lcom/paypal/oslo/feature/balance/ui/balanceDashboard/externalFeatures/ExternalFeatureModel;", "", "", "id", "title", "Lcom/paypal/pds/core/Icon;", "icon", "Lkotlin/Function0;", "", "onClick", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lcom/paypal/pds/core/Icon;Lkotlin/jvm/functions/Function0;)V", "component1", "()Ljava/lang/String;", "component2", "component3", "()Lcom/paypal/pds/core/Icon;", "component4", "()Lkotlin/jvm/functions/Function0;", "copy", "(Ljava/lang/String;Ljava/lang/String;Lcom/paypal/pds/core/Icon;Lkotlin/jvm/functions/Function0;)Lcom/paypal/oslo/feature/balance/ui/balanceDashboard/externalFeatures/ExternalFeatureModel;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getId", "getTitle", "Lcom/paypal/pds/core/Icon;", "getIcon", "Lkotlin/jvm/functions/Function0;", "getOnClick"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes11.dex */
public final /* data */ class ExternalFeatureModel {
    public static final int $stable = 0;
    private final com.paypal.pds.core.Icon icon;
    private final java.lang.String id;
    private final kotlin.jvm.functions.Function0<kotlin.Unit> onClick;
    private final java.lang.String title;

    public ExternalFeatureModel(java.lang.String str, java.lang.String str2, com.paypal.pds.core.Icon icon, kotlin.jvm.functions.Function0<kotlin.Unit> function0) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str2, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(icon, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function0, "");
        this.id = str;
        this.title = str2;
        this.icon = icon;
        this.onClick = function0;
    }

    public final java.lang.String getId() {
        return this.id;
    }

    public final java.lang.String getTitle() {
        return this.title;
    }

    public final com.paypal.pds.core.Icon getIcon() {
        return this.icon;
    }

    public final kotlin.jvm.functions.Function0<kotlin.Unit> getOnClick() {
        return this.onClick;
    }

    public final java.lang.String toString() {
        java.lang.String str = this.id;
        java.lang.String str2 = this.title;
        com.paypal.pds.core.Icon icon = this.icon;
        kotlin.jvm.functions.Function0<kotlin.Unit> function0 = this.onClick;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("ExternalFeatureModel(id=");
        sb.append(str);
        sb.append(", title=");
        sb.append(str2);
        sb.append(", icon=");
        sb.append(icon);
        sb.append(", onClick=");
        sb.append(function0);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        return (((((this.id.hashCode() * 31) + this.title.hashCode()) * 31) + this.icon.hashCode()) * 31) + this.onClick.hashCode();
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.paypal.oslo.feature.balance.ui.balanceDashboard.externalFeatures.ExternalFeatureModel)) {
            return false;
        }
        com.paypal.oslo.feature.balance.ui.balanceDashboard.externalFeatures.ExternalFeatureModel externalFeatureModel = (com.paypal.oslo.feature.balance.ui.balanceDashboard.externalFeatures.ExternalFeatureModel) other;
        return kotlin.jvm.internal.Intrinsics.areEqual(this.id, externalFeatureModel.id) && kotlin.jvm.internal.Intrinsics.areEqual(this.title, externalFeatureModel.title) && kotlin.jvm.internal.Intrinsics.areEqual(this.icon, externalFeatureModel.icon) && kotlin.jvm.internal.Intrinsics.areEqual(this.onClick, externalFeatureModel.onClick);
    }

    public final com.paypal.oslo.feature.balance.ui.balanceDashboard.externalFeatures.ExternalFeatureModel copy(java.lang.String id, java.lang.String title, com.paypal.pds.core.Icon icon, kotlin.jvm.functions.Function0<kotlin.Unit> onClick) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(id, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(title, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(icon, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(onClick, "");
        return new com.paypal.oslo.feature.balance.ui.balanceDashboard.externalFeatures.ExternalFeatureModel(id, title, icon, onClick);
    }

    public final kotlin.jvm.functions.Function0<kotlin.Unit> component4() {
        return this.onClick;
    }

    /* renamed from: component3, reason: from getter */
    public final com.paypal.pds.core.Icon getIcon() {
        return this.icon;
    }

    /* renamed from: component2, reason: from getter */
    public final java.lang.String getTitle() {
        return this.title;
    }

    /* renamed from: component1, reason: from getter */
    public final java.lang.String getId() {
        return this.id;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ com.paypal.oslo.feature.balance.ui.balanceDashboard.externalFeatures.ExternalFeatureModel copy$default(com.paypal.oslo.feature.balance.ui.balanceDashboard.externalFeatures.ExternalFeatureModel externalFeatureModel, java.lang.String str, java.lang.String str2, com.paypal.pds.core.Icon icon, kotlin.jvm.functions.Function0 function0, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            str = externalFeatureModel.id;
        }
        if ((i & 2) != 0) {
            str2 = externalFeatureModel.title;
        }
        if ((i & 4) != 0) {
            icon = externalFeatureModel.icon;
        }
        if ((i & 8) != 0) {
            function0 = externalFeatureModel.onClick;
        }
        return externalFeatureModel.copy(str, str2, icon, function0);
    }
}
