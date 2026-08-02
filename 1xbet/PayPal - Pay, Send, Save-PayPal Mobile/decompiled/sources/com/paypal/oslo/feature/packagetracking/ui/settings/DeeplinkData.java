package com.paypal.oslo.feature.packagetracking.ui.settings;

@kotlin.Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\b\b\u0080\b\u0018\u0000 \u001a2\u00020\u0001:\u0001\u001aB%\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u0012\u0010\b\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0012\u0010\n\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\n\u0010\tJ\u0012\u0010\u000b\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u000b\u0010\tJ4\u0010\f\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0015\u0010\tR\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0016\u001a\u0004\b\u0017\u0010\tR\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0016\u001a\u0004\b\u0018\u0010\tR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0016\u001a\u0004\b\u0019\u0010\t"}, d2 = {"Lcom/paypal/oslo/feature/packagetracking/ui/settings/DeeplinkData;", "", "", "source", "triggerPoint", "emailProvider", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "component2", "component3", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/paypal/oslo/feature/packagetracking/ui/settings/DeeplinkData;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getSource", "getTriggerPoint", "getEmailProvider", "Companion"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes13.dex */
public final /* data */ class DeeplinkData {
    public static final int $stable = 0;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final com.paypal.oslo.feature.packagetracking.ui.settings.DeeplinkData.Companion INSTANCE = new com.paypal.oslo.feature.packagetracking.ui.settings.DeeplinkData.Companion(null);
    private final java.lang.String emailProvider;
    private final java.lang.String source;
    private final java.lang.String triggerPoint;

    public DeeplinkData(java.lang.String str, java.lang.String str2, java.lang.String str3) {
        this.source = str;
        this.triggerPoint = str2;
        this.emailProvider = str3;
    }

    public final java.lang.String getSource() {
        return this.source;
    }

    public final java.lang.String getTriggerPoint() {
        return this.triggerPoint;
    }

    public final java.lang.String getEmailProvider() {
        return this.emailProvider;
    }

    @kotlin.Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0080\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lcom/paypal/oslo/feature/packagetracking/ui/settings/DeeplinkData$Companion;", "", "<init>", "()V", "Lcom/paypal/oslo/feature/packagetracking/api/navigation/PackageSettingsDestination;", "destination", "Lcom/paypal/oslo/feature/packagetracking/ui/settings/DeeplinkData;", "fromDestination", "(Lcom/paypal/oslo/feature/packagetracking/api/navigation/PackageSettingsDestination;)Lcom/paypal/oslo/feature/packagetracking/ui/settings/DeeplinkData;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public final com.paypal.oslo.feature.packagetracking.ui.settings.DeeplinkData fromDestination(com.paypal.oslo.feature.packagetracking.api.navigation.PackageSettingsDestination destination) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(destination, "");
            if (destination.getSource() == null && destination.getTriggerPoint() == null && destination.getEmailProvider() == null) {
                return null;
            }
            return new com.paypal.oslo.feature.packagetracking.ui.settings.DeeplinkData(destination.getSource(), destination.getTriggerPoint(), destination.getEmailProvider());
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public final java.lang.String toString() {
        java.lang.String str = this.source;
        java.lang.String str2 = this.triggerPoint;
        java.lang.String str3 = this.emailProvider;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("DeeplinkData(source=");
        sb.append(str);
        sb.append(", triggerPoint=");
        sb.append(str2);
        sb.append(", emailProvider=");
        sb.append(str3);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        java.lang.String str = this.source;
        int hashCode = str == null ? 0 : str.hashCode();
        java.lang.String str2 = this.triggerPoint;
        int hashCode2 = str2 == null ? 0 : str2.hashCode();
        java.lang.String str3 = this.emailProvider;
        return (((hashCode * 31) + hashCode2) * 31) + (str3 != null ? str3.hashCode() : 0);
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.paypal.oslo.feature.packagetracking.ui.settings.DeeplinkData)) {
            return false;
        }
        com.paypal.oslo.feature.packagetracking.ui.settings.DeeplinkData deeplinkData = (com.paypal.oslo.feature.packagetracking.ui.settings.DeeplinkData) other;
        return kotlin.jvm.internal.Intrinsics.areEqual(this.source, deeplinkData.source) && kotlin.jvm.internal.Intrinsics.areEqual(this.triggerPoint, deeplinkData.triggerPoint) && kotlin.jvm.internal.Intrinsics.areEqual(this.emailProvider, deeplinkData.emailProvider);
    }

    public final com.paypal.oslo.feature.packagetracking.ui.settings.DeeplinkData copy(java.lang.String source, java.lang.String triggerPoint, java.lang.String emailProvider) {
        return new com.paypal.oslo.feature.packagetracking.ui.settings.DeeplinkData(source, triggerPoint, emailProvider);
    }

    /* renamed from: component3, reason: from getter */
    public final java.lang.String getEmailProvider() {
        return this.emailProvider;
    }

    /* renamed from: component2, reason: from getter */
    public final java.lang.String getTriggerPoint() {
        return this.triggerPoint;
    }

    /* renamed from: component1, reason: from getter */
    public final java.lang.String getSource() {
        return this.source;
    }

    public static /* synthetic */ com.paypal.oslo.feature.packagetracking.ui.settings.DeeplinkData copy$default(com.paypal.oslo.feature.packagetracking.ui.settings.DeeplinkData deeplinkData, java.lang.String str, java.lang.String str2, java.lang.String str3, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            str = deeplinkData.source;
        }
        if ((i & 2) != 0) {
            str2 = deeplinkData.triggerPoint;
        }
        if ((i & 4) != 0) {
            str3 = deeplinkData.emailProvider;
        }
        return deeplinkData.copy(str, str2, str3);
    }
}
