package com.paypal.pds.components;

@kotlin.Deprecated(message = "Use CardHeaderScope instead for more flexible header configuration.", replaceWith = @kotlin.ReplaceWith(expression = "CardHeaderScope", imports = {}))
@kotlin.Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u000b\b\u0087\b\u0018\u00002\u00020\u0001BS\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005\u0012\u0015\b\u0002\u0010\n\u001a\u000f\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007¢\u0006\u0002\b\t\u0012\u0015\b\u0002\u0010\u000b\u001a\u000f\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007¢\u0006\u0002\b\t¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0010\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0010\u0010\u000fJ\u0010\u0010\u0011\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b\u0011\u0010\u0012J\u001d\u0010\u0013\u001a\u000f\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007¢\u0006\u0002\b\tHÆ\u0003¢\u0006\u0004\b\u0013\u0010\u0014J\u001d\u0010\u0015\u001a\u000f\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007¢\u0006\u0002\b\tHÆ\u0003¢\u0006\u0004\b\u0015\u0010\u0014J\\\u0010\u0016\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00052\u0015\b\u0002\u0010\n\u001a\u000f\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007¢\u0006\u0002\b\t2\u0015\b\u0002\u0010\u000b\u001a\u000f\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007¢\u0006\u0002\b\tHÆ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u001a\u0010\u001a\u001a\u00020\u00192\b\u0010\u0018\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001d\u001a\u00020\u001cHÖ\u0001¢\u0006\u0004\b\u001d\u0010\u001eJ\u0010\u0010\u001f\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001f\u0010\u000fR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010 \u001a\u0004\b!\u0010\u000fR\u001a\u0010\u0004\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010 \u001a\u0004\b\"\u0010\u000fR\u001a\u0010\u0006\u001a\u00020\u00058\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010#\u001a\u0004\b$\u0010\u0012R'\u0010\n\u001a\u000f\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007¢\u0006\u0002\b\t8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010%\u001a\u0004\b&\u0010\u0014R'\u0010\u000b\u001a\u000f\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007¢\u0006\u0002\b\t8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010%\u001a\u0004\b'\u0010\u0014"}, d2 = {"Lcom/paypal/pds/components/HeaderConfig;", "", "", "title", com.paypal.oslo.feature.inappcheckout.domain.util.LoggerParameterKeys.DESCRIPTION, "Lcom/paypal/pds/components/HeaderAlignment;", "alignment", "Lkotlin/Function0;", "", "Landroidx/compose/runtime/Composable;", "leading", "trailing", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lcom/paypal/pds/components/HeaderAlignment;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;)V", "component1", "()Ljava/lang/String;", "component2", "component3", "()Lcom/paypal/pds/components/HeaderAlignment;", "component4", "()Lkotlin/jvm/functions/Function2;", "component5", "copy", "(Ljava/lang/String;Ljava/lang/String;Lcom/paypal/pds/components/HeaderAlignment;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;)Lcom/paypal/pds/components/HeaderConfig;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getTitle", "getDescription", "Lcom/paypal/pds/components/HeaderAlignment;", "getAlignment", "Lkotlin/jvm/functions/Function2;", "getLeading", "getTrailing"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class HeaderConfig {
    public static final int $stable = 0;
    private final com.paypal.pds.components.HeaderAlignment alignment;
    private final java.lang.String description;
    private final kotlin.jvm.functions.Function2<androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit> leading;
    private final java.lang.String title;
    private final kotlin.jvm.functions.Function2<androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit> trailing;

    /* JADX WARN: Multi-variable type inference failed */
    public HeaderConfig(java.lang.String str, java.lang.String str2, com.paypal.pds.components.HeaderAlignment headerAlignment, kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> function2, kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> function22) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str2, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(headerAlignment, "");
        this.title = str;
        this.description = str2;
        this.alignment = headerAlignment;
        this.leading = function2;
        this.trailing = function22;
    }

    public /* synthetic */ HeaderConfig(java.lang.String str, java.lang.String str2, com.paypal.pds.components.HeaderAlignment headerAlignment, kotlin.jvm.functions.Function2 function2, kotlin.jvm.functions.Function2 function22, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) == 0 ? str2 : "", (i & 4) != 0 ? com.paypal.pds.components.HeaderAlignment.Top : headerAlignment, (i & 8) != 0 ? null : function2, (i & 16) != 0 ? null : function22);
    }

    public final java.lang.String getTitle() {
        return this.title;
    }

    public final java.lang.String getDescription() {
        return this.description;
    }

    public final com.paypal.pds.components.HeaderAlignment getAlignment() {
        return this.alignment;
    }

    public final kotlin.jvm.functions.Function2<androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit> getLeading() {
        return this.leading;
    }

    public final kotlin.jvm.functions.Function2<androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit> getTrailing() {
        return this.trailing;
    }

    public final java.lang.String toString() {
        java.lang.String str = this.title;
        java.lang.String str2 = this.description;
        com.paypal.pds.components.HeaderAlignment headerAlignment = this.alignment;
        kotlin.jvm.functions.Function2<androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit> function2 = this.leading;
        kotlin.jvm.functions.Function2<androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit> function22 = this.trailing;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("HeaderConfig(title=");
        sb.append(str);
        sb.append(", description=");
        sb.append(str2);
        sb.append(", alignment=");
        sb.append(headerAlignment);
        sb.append(", leading=");
        sb.append(function2);
        sb.append(", trailing=");
        sb.append(function22);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        int hashCode = this.title.hashCode();
        int hashCode2 = this.description.hashCode();
        int hashCode3 = this.alignment.hashCode();
        kotlin.jvm.functions.Function2<androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit> function2 = this.leading;
        int hashCode4 = function2 == null ? 0 : function2.hashCode();
        kotlin.jvm.functions.Function2<androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit> function22 = this.trailing;
        return (((((((hashCode * 31) + hashCode2) * 31) + hashCode3) * 31) + hashCode4) * 31) + (function22 != null ? function22.hashCode() : 0);
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.paypal.pds.components.HeaderConfig)) {
            return false;
        }
        com.paypal.pds.components.HeaderConfig headerConfig = (com.paypal.pds.components.HeaderConfig) other;
        return kotlin.jvm.internal.Intrinsics.areEqual(this.title, headerConfig.title) && kotlin.jvm.internal.Intrinsics.areEqual(this.description, headerConfig.description) && this.alignment == headerConfig.alignment && kotlin.jvm.internal.Intrinsics.areEqual(this.leading, headerConfig.leading) && kotlin.jvm.internal.Intrinsics.areEqual(this.trailing, headerConfig.trailing);
    }

    public final com.paypal.pds.components.HeaderConfig copy(java.lang.String title, java.lang.String description, com.paypal.pds.components.HeaderAlignment alignment, kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> leading, kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> trailing) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(title, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(description, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(alignment, "");
        return new com.paypal.pds.components.HeaderConfig(title, description, alignment, leading, trailing);
    }

    public final kotlin.jvm.functions.Function2<androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit> component5() {
        return this.trailing;
    }

    public final kotlin.jvm.functions.Function2<androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit> component4() {
        return this.leading;
    }

    /* renamed from: component3, reason: from getter */
    public final com.paypal.pds.components.HeaderAlignment getAlignment() {
        return this.alignment;
    }

    /* renamed from: component2, reason: from getter */
    public final java.lang.String getDescription() {
        return this.description;
    }

    /* renamed from: component1, reason: from getter */
    public final java.lang.String getTitle() {
        return this.title;
    }

    public static /* synthetic */ com.paypal.pds.components.HeaderConfig copy$default(com.paypal.pds.components.HeaderConfig headerConfig, java.lang.String str, java.lang.String str2, com.paypal.pds.components.HeaderAlignment headerAlignment, kotlin.jvm.functions.Function2 function2, kotlin.jvm.functions.Function2 function22, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            str = headerConfig.title;
        }
        if ((i & 2) != 0) {
            str2 = headerConfig.description;
        }
        java.lang.String str3 = str2;
        if ((i & 4) != 0) {
            headerAlignment = headerConfig.alignment;
        }
        com.paypal.pds.components.HeaderAlignment headerAlignment2 = headerAlignment;
        if ((i & 8) != 0) {
            function2 = headerConfig.leading;
        }
        kotlin.jvm.functions.Function2 function23 = function2;
        if ((i & 16) != 0) {
            function22 = headerConfig.trailing;
        }
        return headerConfig.copy(str, str3, headerAlignment2, function23, function22);
    }

    public HeaderConfig() {
        this(null, null, null, null, null, 31, null);
    }
}
