package com.paypal.oslo.feature.qrc.ui.review.model;

@kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u000e\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\t\b\u0086\b\u0018\u00002\u00020\u0001B+\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000e\u0010\u000bJ\u0012\u0010\u000f\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u000f\u0010\u000bJ:\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00022\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0014\u001a\u00020\u00132\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0017\u001a\u00020\u0016HÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u0019\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0019\u0010\u000bR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u001a\u001a\u0004\b\u001b\u0010\u000bR\u001a\u0010\u0005\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u001c\u001a\u0004\b\u001d\u0010\rR\u001a\u0010\u0006\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u001a\u001a\u0004\b\u001e\u0010\u000bR\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u001a\u001a\u0004\b\u001f\u0010\u000b"}, d2 = {"Lcom/paypal/oslo/feature/qrc/ui/review/model/PresetTipOption;", "", "", "id", "", "rawValue", "primaryDisplay", "secondaryDisplay", "<init>", "(Ljava/lang/String;DLjava/lang/String;Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "component2", "()D", "component3", "component4", "copy", "(Ljava/lang/String;DLjava/lang/String;Ljava/lang/String;)Lcom/paypal/oslo/feature/qrc/ui/review/model/PresetTipOption;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getId", "D", "getRawValue", "getPrimaryDisplay", "getSecondaryDisplay"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes14.dex */
public final /* data */ class PresetTipOption {
    public static final int $stable = 0;
    private final java.lang.String id;
    private final java.lang.String primaryDisplay;
    private final double rawValue;
    private final java.lang.String secondaryDisplay;

    public PresetTipOption(java.lang.String str, double d, java.lang.String str2, java.lang.String str3) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str2, "");
        this.id = str;
        this.rawValue = d;
        this.primaryDisplay = str2;
        this.secondaryDisplay = str3;
    }

    public /* synthetic */ PresetTipOption(java.lang.String str, double d, java.lang.String str2, java.lang.String str3, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(str, d, str2, (i & 8) != 0 ? null : str3);
    }

    public final java.lang.String getId() {
        return this.id;
    }

    public final double getRawValue() {
        return this.rawValue;
    }

    public final java.lang.String getPrimaryDisplay() {
        return this.primaryDisplay;
    }

    public final java.lang.String getSecondaryDisplay() {
        return this.secondaryDisplay;
    }

    public final java.lang.String toString() {
        java.lang.String str = this.id;
        double d = this.rawValue;
        java.lang.String str2 = this.primaryDisplay;
        java.lang.String str3 = this.secondaryDisplay;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("PresetTipOption(id=");
        sb.append(str);
        sb.append(", rawValue=");
        sb.append(d);
        sb.append(", primaryDisplay=");
        sb.append(str2);
        sb.append(", secondaryDisplay=");
        sb.append(str3);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        int hashCode = this.id.hashCode();
        int hashCode2 = java.lang.Double.hashCode(this.rawValue);
        int hashCode3 = this.primaryDisplay.hashCode();
        java.lang.String str = this.secondaryDisplay;
        return (((((hashCode * 31) + hashCode2) * 31) + hashCode3) * 31) + (str == null ? 0 : str.hashCode());
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.paypal.oslo.feature.qrc.ui.review.model.PresetTipOption)) {
            return false;
        }
        com.paypal.oslo.feature.qrc.ui.review.model.PresetTipOption presetTipOption = (com.paypal.oslo.feature.qrc.ui.review.model.PresetTipOption) other;
        return kotlin.jvm.internal.Intrinsics.areEqual(this.id, presetTipOption.id) && java.lang.Double.compare(this.rawValue, presetTipOption.rawValue) == 0 && kotlin.jvm.internal.Intrinsics.areEqual(this.primaryDisplay, presetTipOption.primaryDisplay) && kotlin.jvm.internal.Intrinsics.areEqual(this.secondaryDisplay, presetTipOption.secondaryDisplay);
    }

    public final com.paypal.oslo.feature.qrc.ui.review.model.PresetTipOption copy(java.lang.String id, double rawValue, java.lang.String primaryDisplay, java.lang.String secondaryDisplay) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(id, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(primaryDisplay, "");
        return new com.paypal.oslo.feature.qrc.ui.review.model.PresetTipOption(id, rawValue, primaryDisplay, secondaryDisplay);
    }

    /* renamed from: component4, reason: from getter */
    public final java.lang.String getSecondaryDisplay() {
        return this.secondaryDisplay;
    }

    /* renamed from: component3, reason: from getter */
    public final java.lang.String getPrimaryDisplay() {
        return this.primaryDisplay;
    }

    /* renamed from: component2, reason: from getter */
    public final double getRawValue() {
        return this.rawValue;
    }

    /* renamed from: component1, reason: from getter */
    public final java.lang.String getId() {
        return this.id;
    }

    public static /* synthetic */ com.paypal.oslo.feature.qrc.ui.review.model.PresetTipOption copy$default(com.paypal.oslo.feature.qrc.ui.review.model.PresetTipOption presetTipOption, java.lang.String str, double d, java.lang.String str2, java.lang.String str3, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            str = presetTipOption.id;
        }
        if ((i & 2) != 0) {
            d = presetTipOption.rawValue;
        }
        double d2 = d;
        if ((i & 4) != 0) {
            str2 = presetTipOption.primaryDisplay;
        }
        java.lang.String str4 = str2;
        if ((i & 8) != 0) {
            str3 = presetTipOption.secondaryDisplay;
        }
        return presetTipOption.copy(str, d2, str4, str3);
    }
}
