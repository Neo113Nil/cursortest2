package com.paypal.pds.core;

@kotlin.Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\f\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\b\b\u0086\b\u0018\u0000 \"2\u00020\u0001:\u0002#\"B.\b\u0000\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u0015\b\u0002\u0010\b\u001a\u000f\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005¢\u0006\u0002\b\u0007¢\u0006\u0004\b\t\u0010\nJ\r\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\f\u0010\rJ\r\u0010\u000e\u001a\u00020\u000b¢\u0006\u0004\b\u000e\u0010\rJ\u0016\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÀ\u0003¢\u0006\u0004\b\u000f\u0010\u0010J\u001d\u0010\u0011\u001a\u000f\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005¢\u0006\u0002\b\u0007HÀ\u0003¢\u0006\u0004\b\u0011\u0010\u0012J7\u0010\u0013\u001a\u00020\u00002\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u0015\b\u0002\u0010\b\u001a\u000f\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005¢\u0006\u0002\b\u0007HÀ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u001a\u0010\u0016\u001a\u00020\u000b2\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0019\u001a\u00020\u0018HÖ\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001c\u001a\u00020\u001bHÖ\u0001¢\u0006\u0004\b\u001c\u0010\u001dR \u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0001X\u0081\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u001e\u001a\u0004\b\u001f\u0010\u0010R'\u0010\b\u001a\u000f\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005¢\u0006\u0002\b\u00078\u0001X\u0081\u0004¢\u0006\f\n\u0004\b\b\u0010 \u001a\u0004\b!\u0010\u0012"}, d2 = {"Lcom/paypal/pds/core/RichText;", "", "", "Lcom/paypal/pds/core/RichText$Entry;", "entries", "Lkotlin/Function0;", "", "Landroidx/compose/runtime/Composable;", "trailingInline", "<init>", "(Ljava/util/List;Lkotlin/jvm/functions/Function2;)V", "", "isNotBlank", "()Z", "isBlank", "component1$pds_release", "()Ljava/util/List;", "component2$pds_release", "()Lkotlin/jvm/functions/Function2;", "copy$pds_release", "(Ljava/util/List;Lkotlin/jvm/functions/Function2;)Lcom/paypal/pds/core/RichText;", "other", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Ljava/util/List;", "getEntries$pds_release", "Lkotlin/jvm/functions/Function2;", "getTrailingInline$pds_release", "Companion", "Entry"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class RichText {
    public static final int $stable = 0;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final com.paypal.pds.core.RichText.Companion INSTANCE = new com.paypal.pds.core.RichText.Companion(null);
    private final java.util.List<com.paypal.pds.core.RichText.Entry> entries;
    private final kotlin.jvm.functions.Function2<androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit> trailingInline;

    /* JADX WARN: Multi-variable type inference failed */
    public RichText(java.util.List<com.paypal.pds.core.RichText.Entry> list, kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> function2) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list, "");
        this.entries = list;
        this.trailingInline = function2;
    }

    public /* synthetic */ RichText(java.util.List list, kotlin.jvm.functions.Function2 function2, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(list, (i & 2) != 0 ? null : function2);
    }

    public final java.util.List<com.paypal.pds.core.RichText.Entry> getEntries$pds_release() {
        return this.entries;
    }

    public final kotlin.jvm.functions.Function2<androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit> getTrailingInline$pds_release() {
        return this.trailingInline;
    }

    @kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000f\n\u0002\u0010\b\n\u0002\b\t\b\u0080\b\u0018\u00002\u00020\u0001B1\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000b\u0010\fJ\u0012\u0010\r\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\r\u0010\fJ\u0012\u0010\u000e\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0010\u001a\u00020\u0007HÆ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J<\u0010\u0012\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\b\u001a\u00020\u0007HÆ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u001a\u0010\u0015\u001a\u00020\u00072\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0018\u001a\u00020\u0017HÖ\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001a\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001a\u0010\fR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u001b\u001a\u0004\b\u001c\u0010\fR\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u001b\u001a\u0004\b\u001d\u0010\fR\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u001e\u001a\u0004\b\u001f\u0010\u000fR\u001a\u0010\b\u001a\u00020\u00078\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010 \u001a\u0004\b\b\u0010\u0011"}, d2 = {"Lcom/paypal/pds/core/RichText$Entry;", "", "", "text", "href", "Lcom/paypal/pds/core/Color;", androidx.constraintlayout.core.motion.utils.TypedValues.Custom.S_COLOR, "", "isBold", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lcom/paypal/pds/core/Color;Z)V", "component1", "()Ljava/lang/String;", "component2", "component3", "()Lcom/paypal/pds/core/Color;", "component4", "()Z", "copy", "(Ljava/lang/String;Ljava/lang/String;Lcom/paypal/pds/core/Color;Z)Lcom/paypal/pds/core/RichText$Entry;", "other", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getText", "getHref", "Lcom/paypal/pds/core/Color;", "getColor", "Z"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes16.dex */
    public static final /* data */ class Entry {
        public static final int $stable = 0;
        private final com.paypal.pds.core.Color color;
        private final java.lang.String href;
        private final boolean isBold;
        private final java.lang.String text;

        public Entry(java.lang.String str, java.lang.String str2, com.paypal.pds.core.Color color, boolean z) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            this.text = str;
            this.href = str2;
            this.color = color;
            this.isBold = z;
        }

        public /* synthetic */ Entry(java.lang.String str, java.lang.String str2, com.paypal.pds.core.Color color, boolean z, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this(str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : color, (i & 8) != 0 ? false : z);
        }

        public final java.lang.String getText() {
            return this.text;
        }

        public final java.lang.String getHref() {
            return this.href;
        }

        public final com.paypal.pds.core.Color getColor() {
            return this.color;
        }

        public final boolean isBold() {
            return this.isBold;
        }

        public final java.lang.String toString() {
            java.lang.String str = this.text;
            java.lang.String str2 = this.href;
            com.paypal.pds.core.Color color = this.color;
            boolean z = this.isBold;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Entry(text=");
            sb.append(str);
            sb.append(", href=");
            sb.append(str2);
            sb.append(", color=");
            sb.append(color);
            sb.append(", isBold=");
            sb.append(z);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            int hashCode = this.text.hashCode();
            java.lang.String str = this.href;
            int hashCode2 = str == null ? 0 : str.hashCode();
            com.paypal.pds.core.Color color = this.color;
            return (((((hashCode * 31) + hashCode2) * 31) + (color != null ? color.hashCode() : 0)) * 31) + java.lang.Boolean.hashCode(this.isBold);
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.pds.core.RichText.Entry)) {
                return false;
            }
            com.paypal.pds.core.RichText.Entry entry = (com.paypal.pds.core.RichText.Entry) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.text, entry.text) && kotlin.jvm.internal.Intrinsics.areEqual(this.href, entry.href) && kotlin.jvm.internal.Intrinsics.areEqual(this.color, entry.color) && this.isBold == entry.isBold;
        }

        public final com.paypal.pds.core.RichText.Entry copy(java.lang.String text, java.lang.String href, com.paypal.pds.core.Color color, boolean isBold) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(text, "");
            return new com.paypal.pds.core.RichText.Entry(text, href, color, isBold);
        }

        /* renamed from: component4, reason: from getter */
        public final boolean getIsBold() {
            return this.isBold;
        }

        /* renamed from: component3, reason: from getter */
        public final com.paypal.pds.core.Color getColor() {
            return this.color;
        }

        /* renamed from: component2, reason: from getter */
        public final java.lang.String getHref() {
            return this.href;
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.String getText() {
            return this.text;
        }

        public static /* synthetic */ com.paypal.pds.core.RichText.Entry copy$default(com.paypal.pds.core.RichText.Entry entry, java.lang.String str, java.lang.String str2, com.paypal.pds.core.Color color, boolean z, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = entry.text;
            }
            if ((i & 2) != 0) {
                str2 = entry.href;
            }
            if ((i & 4) != 0) {
                color = entry.color;
            }
            if ((i & 8) != 0) {
                z = entry.isBold;
            }
            return entry.copy(str, str2, color, z);
        }
    }

    public final boolean isNotBlank() {
        java.util.List<com.paypal.pds.core.RichText.Entry> list = this.entries;
        if (!(list instanceof java.util.Collection) || !list.isEmpty()) {
            java.util.Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                if (!kotlin.text.StringsKt.isBlank(((com.paypal.pds.core.RichText.Entry) it.next()).getText())) {
                    return true;
                }
            }
        }
        return this.trailingInline != null;
    }

    public final boolean isBlank() {
        return !isNotBlank();
    }

    @kotlin.Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J)\u0010\n\u001a\u00020\t2\u0017\u0010\b\u001a\u0013\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004¢\u0006\u0002\b\u0007H\u0086\u0002¢\u0006\u0004\b\n\u0010\u000bJE\u0010\n\u001a\u00020\t2\u0006\u0010\r\u001a\u00020\f2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u000e2\b\b\u0002\u0010\u0011\u001a\u00020\u00102\u0015\b\u0002\u0010\u0014\u001a\u000f\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0012¢\u0006\u0002\b\u0013H\u0086\u0002¢\u0006\u0004\b\n\u0010\u0015"}, d2 = {"Lcom/paypal/pds/core/RichText$Companion;", "", "<init>", "()V", "Lkotlin/Function1;", "Lcom/paypal/pds/core/Builder;", "", "Lkotlin/ExtensionFunctionType;", "builderScope", "Lcom/paypal/pds/core/RichText;", "invoke", "(Lkotlin/jvm/functions/Function1;)Lcom/paypal/pds/core/RichText;", "", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "Lcom/paypal/pds/core/Color;", androidx.constraintlayout.core.motion.utils.TypedValues.Custom.S_COLOR, "", "isBold", "Lkotlin/Function0;", "Landroidx/compose/runtime/Composable;", "trailingInline", "(Ljava/lang/String;Lcom/paypal/pds/core/Color;ZLkotlin/jvm/functions/Function2;)Lcom/paypal/pds/core/RichText;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes16.dex */
    public static final class Companion {
        private Companion() {
        }

        /* JADX WARN: Multi-variable type inference failed */
        public final com.paypal.pds.core.RichText invoke(kotlin.jvm.functions.Function1<? super com.paypal.pds.core.Builder, kotlin.Unit> builderScope) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(builderScope, "");
            com.paypal.pds.core.Builder builder = new com.paypal.pds.core.Builder(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
            builderScope.invoke(builder);
            return builder.build$pds_release();
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ com.paypal.pds.core.RichText invoke$default(com.paypal.pds.core.RichText.Companion companion, java.lang.String str, com.paypal.pds.core.Color color, boolean z, kotlin.jvm.functions.Function2 function2, int i, java.lang.Object obj) {
            if ((i & 2) != 0) {
                color = null;
            }
            if ((i & 4) != 0) {
                z = false;
            }
            if ((i & 8) != 0) {
                function2 = null;
            }
            return companion.invoke(str, color, z, function2);
        }

        public final com.paypal.pds.core.RichText invoke(java.lang.String value, com.paypal.pds.core.Color color, boolean isBold, kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> trailingInline) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(value, "");
            return new com.paypal.pds.core.RichText(kotlin.collections.CollectionsKt.listOf(new com.paypal.pds.core.RichText.Entry(value, null, color, isBold, 2, null)), trailingInline);
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public final java.lang.String toString() {
        java.util.List<com.paypal.pds.core.RichText.Entry> list = this.entries;
        kotlin.jvm.functions.Function2<androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit> function2 = this.trailingInline;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("RichText(entries=");
        sb.append(list);
        sb.append(", trailingInline=");
        sb.append(function2);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        int hashCode = this.entries.hashCode();
        kotlin.jvm.functions.Function2<androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit> function2 = this.trailingInline;
        return (hashCode * 31) + (function2 == null ? 0 : function2.hashCode());
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.paypal.pds.core.RichText)) {
            return false;
        }
        com.paypal.pds.core.RichText richText = (com.paypal.pds.core.RichText) other;
        return kotlin.jvm.internal.Intrinsics.areEqual(this.entries, richText.entries) && kotlin.jvm.internal.Intrinsics.areEqual(this.trailingInline, richText.trailingInline);
    }

    public final com.paypal.pds.core.RichText copy$pds_release(java.util.List<com.paypal.pds.core.RichText.Entry> entries, kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> trailingInline) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(entries, "");
        return new com.paypal.pds.core.RichText(entries, trailingInline);
    }

    public final kotlin.jvm.functions.Function2<androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit> component2$pds_release() {
        return this.trailingInline;
    }

    public final java.util.List<com.paypal.pds.core.RichText.Entry> component1$pds_release() {
        return this.entries;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ com.paypal.pds.core.RichText copy$pds_release$default(com.paypal.pds.core.RichText richText, java.util.List list, kotlin.jvm.functions.Function2 function2, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            list = richText.entries;
        }
        if ((i & 2) != 0) {
            function2 = richText.trailingInline;
        }
        return richText.copy$pds_release(list, function2);
    }
}
