package com.paypal.pds.components;

@kotlin.Deprecated(message = "Use CardFooterScope instead for more flexible footer configuration.", replaceWith = @kotlin.ReplaceWith(expression = "CardFooterScope", imports = {}))
@kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0010\b\n\u0002\b\f\b\u0087\b\u0018\u00002\u00020\u0001Bg\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0002\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007\u0012\u0015\b\u0002\u0010\f\u001a\u000f\u0012\u0004\u0012\u00020\n\u0018\u00010\t¢\u0006\u0002\b\u000b\u0012\u0015\b\u0002\u0010\r\u001a\u000f\u0012\u0004\u0012\u00020\n\u0018\u00010\t¢\u0006\u0002\b\u000b¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0010\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0012\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0013\u0010\u0011J\u0010\u0010\u0014\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0014\u0010\u0011J\u0010\u0010\u0015\u001a\u00020\u0007HÆ\u0003¢\u0006\u0004\b\u0015\u0010\u0016J\u001d\u0010\u0017\u001a\u000f\u0012\u0004\u0012\u00020\n\u0018\u00010\t¢\u0006\u0002\b\u000bHÆ\u0003¢\u0006\u0004\b\u0017\u0010\u0018J\u001d\u0010\u0019\u001a\u000f\u0012\u0004\u0012\u00020\n\u0018\u00010\t¢\u0006\u0002\b\u000bHÆ\u0003¢\u0006\u0004\b\u0019\u0010\u0018Jp\u0010\u001a\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00022\b\b\u0002\u0010\b\u001a\u00020\u00072\u0015\b\u0002\u0010\f\u001a\u000f\u0012\u0004\u0012\u00020\n\u0018\u00010\t¢\u0006\u0002\b\u000b2\u0015\b\u0002\u0010\r\u001a\u000f\u0012\u0004\u0012\u00020\n\u0018\u00010\t¢\u0006\u0002\b\u000bHÆ\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\u001a\u0010\u001d\u001a\u00020\u00072\b\u0010\u001c\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001d\u0010\u001eJ\u0010\u0010 \u001a\u00020\u001fHÖ\u0001¢\u0006\u0004\b \u0010!J\u0010\u0010\"\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\"\u0010\u0011R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010#\u001a\u0004\b$\u0010\u0011R\u001a\u0010\u0004\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010#\u001a\u0004\b%\u0010\u0011R\u001a\u0010\u0005\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010#\u001a\u0004\b&\u0010\u0011R\u001a\u0010\u0006\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010#\u001a\u0004\b'\u0010\u0011R\u001a\u0010\b\u001a\u00020\u00078\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010(\u001a\u0004\b\b\u0010\u0016R'\u0010\f\u001a\u000f\u0012\u0004\u0012\u00020\n\u0018\u00010\t¢\u0006\u0002\b\u000b8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010)\u001a\u0004\b*\u0010\u0018R'\u0010\r\u001a\u000f\u0012\u0004\u0012\u00020\n\u0018\u00010\t¢\u0006\u0002\b\u000b8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\r\u0010)\u001a\u0004\b+\u0010\u0018"}, d2 = {"Lcom/paypal/pds/components/FooterConfig;", "", "", "label", com.paypal.oslo.feature.inappcheckout.domain.util.LoggerParameterKeys.DESCRIPTION, com.google.firebase.messaging.Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "metadata", "", "isOverlay", "Lkotlin/Function0;", "", "Landroidx/compose/runtime/Composable;", "leading", "trailing", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;)V", "component1", "()Ljava/lang/String;", "component2", "component3", "component4", "component5", "()Z", "component6", "()Lkotlin/jvm/functions/Function2;", "component7", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;)Lcom/paypal/pds/components/FooterConfig;", "other", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getLabel", "getDescription", "getData", "getMetadata", "Z", "Lkotlin/jvm/functions/Function2;", "getLeading", "getTrailing"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class FooterConfig {
    public static final int $stable = 0;
    private final java.lang.String data;
    private final java.lang.String description;
    private final boolean isOverlay;
    private final java.lang.String label;
    private final kotlin.jvm.functions.Function2<androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit> leading;
    private final java.lang.String metadata;
    private final kotlin.jvm.functions.Function2<androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit> trailing;

    /* JADX WARN: Multi-variable type inference failed */
    public FooterConfig(java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, boolean z, kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> function2, kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> function22) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str2, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str3, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str4, "");
        this.label = str;
        this.description = str2;
        this.data = str3;
        this.metadata = str4;
        this.isOverlay = z;
        this.leading = function2;
        this.trailing = function22;
    }

    public /* synthetic */ FooterConfig(java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, boolean z, kotlin.jvm.functions.Function2 function2, kotlin.jvm.functions.Function2 function22, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? "" : str3, (i & 8) == 0 ? str4 : "", (i & 16) != 0 ? false : z, (i & 32) != 0 ? null : function2, (i & 64) != 0 ? null : function22);
    }

    public final java.lang.String getLabel() {
        return this.label;
    }

    public final java.lang.String getDescription() {
        return this.description;
    }

    public final java.lang.String getData() {
        return this.data;
    }

    public final java.lang.String getMetadata() {
        return this.metadata;
    }

    public final boolean isOverlay() {
        return this.isOverlay;
    }

    public final kotlin.jvm.functions.Function2<androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit> getLeading() {
        return this.leading;
    }

    public final kotlin.jvm.functions.Function2<androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit> getTrailing() {
        return this.trailing;
    }

    public final java.lang.String toString() {
        java.lang.String str = this.label;
        java.lang.String str2 = this.description;
        java.lang.String str3 = this.data;
        java.lang.String str4 = this.metadata;
        boolean z = this.isOverlay;
        kotlin.jvm.functions.Function2<androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit> function2 = this.leading;
        kotlin.jvm.functions.Function2<androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit> function22 = this.trailing;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("FooterConfig(label=");
        sb.append(str);
        sb.append(", description=");
        sb.append(str2);
        sb.append(", data=");
        sb.append(str3);
        sb.append(", metadata=");
        sb.append(str4);
        sb.append(", isOverlay=");
        sb.append(z);
        sb.append(", leading=");
        sb.append(function2);
        sb.append(", trailing=");
        sb.append(function22);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        int hashCode = this.label.hashCode();
        int hashCode2 = this.description.hashCode();
        int hashCode3 = this.data.hashCode();
        int hashCode4 = this.metadata.hashCode();
        int hashCode5 = java.lang.Boolean.hashCode(this.isOverlay);
        kotlin.jvm.functions.Function2<androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit> function2 = this.leading;
        int hashCode6 = function2 == null ? 0 : function2.hashCode();
        kotlin.jvm.functions.Function2<androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit> function22 = this.trailing;
        return (((((((((((hashCode * 31) + hashCode2) * 31) + hashCode3) * 31) + hashCode4) * 31) + hashCode5) * 31) + hashCode6) * 31) + (function22 != null ? function22.hashCode() : 0);
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.paypal.pds.components.FooterConfig)) {
            return false;
        }
        com.paypal.pds.components.FooterConfig footerConfig = (com.paypal.pds.components.FooterConfig) other;
        return kotlin.jvm.internal.Intrinsics.areEqual(this.label, footerConfig.label) && kotlin.jvm.internal.Intrinsics.areEqual(this.description, footerConfig.description) && kotlin.jvm.internal.Intrinsics.areEqual(this.data, footerConfig.data) && kotlin.jvm.internal.Intrinsics.areEqual(this.metadata, footerConfig.metadata) && this.isOverlay == footerConfig.isOverlay && kotlin.jvm.internal.Intrinsics.areEqual(this.leading, footerConfig.leading) && kotlin.jvm.internal.Intrinsics.areEqual(this.trailing, footerConfig.trailing);
    }

    public final com.paypal.pds.components.FooterConfig copy(java.lang.String label, java.lang.String description, java.lang.String data, java.lang.String metadata, boolean isOverlay, kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> leading, kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> trailing) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(label, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(description, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(data, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(metadata, "");
        return new com.paypal.pds.components.FooterConfig(label, description, data, metadata, isOverlay, leading, trailing);
    }

    public final kotlin.jvm.functions.Function2<androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit> component7() {
        return this.trailing;
    }

    public final kotlin.jvm.functions.Function2<androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit> component6() {
        return this.leading;
    }

    /* renamed from: component5, reason: from getter */
    public final boolean getIsOverlay() {
        return this.isOverlay;
    }

    /* renamed from: component4, reason: from getter */
    public final java.lang.String getMetadata() {
        return this.metadata;
    }

    /* renamed from: component3, reason: from getter */
    public final java.lang.String getData() {
        return this.data;
    }

    /* renamed from: component2, reason: from getter */
    public final java.lang.String getDescription() {
        return this.description;
    }

    /* renamed from: component1, reason: from getter */
    public final java.lang.String getLabel() {
        return this.label;
    }

    public static /* synthetic */ com.paypal.pds.components.FooterConfig copy$default(com.paypal.pds.components.FooterConfig footerConfig, java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, boolean z, kotlin.jvm.functions.Function2 function2, kotlin.jvm.functions.Function2 function22, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            str = footerConfig.label;
        }
        if ((i & 2) != 0) {
            str2 = footerConfig.description;
        }
        java.lang.String str5 = str2;
        if ((i & 4) != 0) {
            str3 = footerConfig.data;
        }
        java.lang.String str6 = str3;
        if ((i & 8) != 0) {
            str4 = footerConfig.metadata;
        }
        java.lang.String str7 = str4;
        if ((i & 16) != 0) {
            z = footerConfig.isOverlay;
        }
        boolean z2 = z;
        if ((i & 32) != 0) {
            function2 = footerConfig.leading;
        }
        kotlin.jvm.functions.Function2 function23 = function2;
        if ((i & 64) != 0) {
            function22 = footerConfig.trailing;
        }
        return footerConfig.copy(str, str5, str6, str7, z2, function23, function22);
    }

    public FooterConfig() {
        this(null, null, null, null, false, null, null, 127, null);
    }
}
