package com.paypal.pds.components;

@kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u000f\b\u0086\b\u0018\u0000 %2\u00020\u0001:\u0001%B5\b\u0002\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u0012\u0010\u000b\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u000b\u0010\fJ\u0012\u0010\r\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\r\u0010\fJ\u0012\u0010\u000e\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0010\u001a\u00020\u0007HÆ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0014\u001a\u00020\u00132\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0017\u001a\u00020\u0016HÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u0019\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0019\u0010\fR\u0019\u0010\u001a\u001a\u0004\u0018\u00010\u00028\u0007¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\fR\u001c\u0010\u001d\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u001d\u0010\u001b\u001a\u0004\b\u001e\u0010\fR\u001c\u0010\u001f\u001a\u0004\u0018\u00010\u00058\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u001f\u0010 \u001a\u0004\b!\u0010\u000fR\u001a\u0010\"\u001a\u00020\u00078\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\"\u0010#\u001a\u0004\b$\u0010\u0011"}, d2 = {"Lcom/paypal/pds/components/RadioButtonItem;", "", "", "p0", "p1", "Lcom/paypal/pds/core/RichText;", "p2", "Lcom/paypal/pds/core/AnalyticsScope;", "p3", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lcom/paypal/pds/core/RichText;Lcom/paypal/pds/core/AnalyticsScope;)V", "component1", "()Ljava/lang/String;", "component2", "component3", "()Lcom/paypal/pds/core/RichText;", "component4", "()Lcom/paypal/pds/core/AnalyticsScope;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "label", "Ljava/lang/String;", "getLabel", com.paypal.oslo.feature.inappcheckout.domain.util.LoggerParameterKeys.DESCRIPTION, "getDescription", "richTextDescription", "Lcom/paypal/pds/core/RichText;", "getRichTextDescription", "analyticsScope", "Lcom/paypal/pds/core/AnalyticsScope;", "getAnalyticsScope", "Companion"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes16.dex */
public final /* data */ class RadioButtonItem {
    public static final int $stable = 0;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final com.paypal.pds.components.RadioButtonItem.Companion INSTANCE = new com.paypal.pds.components.RadioButtonItem.Companion(null);
    private final com.paypal.pds.core.AnalyticsScope analyticsScope;
    private final java.lang.String description;
    private final java.lang.String label;
    private final com.paypal.pds.core.RichText richTextDescription;

    private RadioButtonItem(java.lang.String str, java.lang.String str2, com.paypal.pds.core.RichText richText, com.paypal.pds.core.AnalyticsScope analyticsScope) {
        this.label = str;
        this.description = str2;
        this.richTextDescription = richText;
        this.analyticsScope = analyticsScope;
    }

    /* synthetic */ RadioButtonItem(java.lang.String str, java.lang.String str2, com.paypal.pds.core.RichText richText, com.paypal.pds.core.AnalyticsScope analyticsScope, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : richText, analyticsScope);
    }

    public final java.lang.String getLabel() {
        return this.label;
    }

    public final java.lang.String getDescription() {
        return this.description;
    }

    public final com.paypal.pds.core.RichText getRichTextDescription() {
        return this.richTextDescription;
    }

    public final com.paypal.pds.core.AnalyticsScope getAnalyticsScope() {
        return this.analyticsScope;
    }

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J+\u0010\n\u001a\u00020\t2\u0006\u0010\u0005\u001a\u00020\u00042\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00042\b\b\u0002\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\n\u0010\u000bJ'\u0010\n\u001a\u00020\t2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\r\u001a\u00020\f2\b\b\u0002\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\n\u0010\u000eJ\u0017\u0010\n\u001a\u00020\t2\b\b\u0002\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\n\u0010\u000f"}, d2 = {"Lcom/paypal/pds/components/RadioButtonItem$Companion;", "", "<init>", "()V", "", "label", com.paypal.oslo.feature.inappcheckout.domain.util.LoggerParameterKeys.DESCRIPTION, "Lcom/paypal/pds/core/AnalyticsScope;", "analyticsScope", "Lcom/paypal/pds/components/RadioButtonItem;", "create", "(Ljava/lang/String;Ljava/lang/String;Lcom/paypal/pds/core/AnalyticsScope;)Lcom/paypal/pds/components/RadioButtonItem;", "Lcom/paypal/pds/core/RichText;", "richText", "(Ljava/lang/String;Lcom/paypal/pds/core/RichText;Lcom/paypal/pds/core/AnalyticsScope;)Lcom/paypal/pds/components/RadioButtonItem;", "(Lcom/paypal/pds/core/AnalyticsScope;)Lcom/paypal/pds/components/RadioButtonItem;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public static /* synthetic */ com.paypal.pds.components.RadioButtonItem create$default(com.paypal.pds.components.RadioButtonItem.Companion companion, java.lang.String str, java.lang.String str2, com.paypal.pds.core.AnalyticsScope analyticsScope, int i, java.lang.Object obj) {
            if ((i & 2) != 0) {
                str2 = null;
            }
            if ((i & 4) != 0) {
                analyticsScope = com.paypal.pds.core.AnalyticsScope.INSTANCE.getEmpty();
            }
            return companion.create(str, str2, analyticsScope);
        }

        public final com.paypal.pds.components.RadioButtonItem create(java.lang.String label, java.lang.String description, com.paypal.pds.core.AnalyticsScope analyticsScope) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(label, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(analyticsScope, "");
            if (description == null || kotlin.text.StringsKt.isBlank(description)) {
                description = null;
            }
            return new com.paypal.pds.components.RadioButtonItem(label, description, null, analyticsScope, 4, null);
        }

        public static /* synthetic */ com.paypal.pds.components.RadioButtonItem create$default(com.paypal.pds.components.RadioButtonItem.Companion companion, java.lang.String str, com.paypal.pds.core.RichText richText, com.paypal.pds.core.AnalyticsScope analyticsScope, int i, java.lang.Object obj) {
            if ((i & 4) != 0) {
                analyticsScope = com.paypal.pds.core.AnalyticsScope.INSTANCE.getEmpty();
            }
            return companion.create(str, richText, analyticsScope);
        }

        public final com.paypal.pds.components.RadioButtonItem create(java.lang.String label, com.paypal.pds.core.RichText richText, com.paypal.pds.core.AnalyticsScope analyticsScope) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(label, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(richText, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(analyticsScope, "");
            return new com.paypal.pds.components.RadioButtonItem(label, null, richText, analyticsScope, 2, null);
        }

        public static /* synthetic */ com.paypal.pds.components.RadioButtonItem create$default(com.paypal.pds.components.RadioButtonItem.Companion companion, com.paypal.pds.core.AnalyticsScope analyticsScope, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                analyticsScope = com.paypal.pds.core.AnalyticsScope.INSTANCE.getEmpty();
            }
            return companion.create(analyticsScope);
        }

        public final com.paypal.pds.components.RadioButtonItem create(com.paypal.pds.core.AnalyticsScope analyticsScope) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(analyticsScope, "");
            return new com.paypal.pds.components.RadioButtonItem(null, null, null, analyticsScope, 7, null);
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public final java.lang.String toString() {
        java.lang.String str = this.label;
        java.lang.String str2 = this.description;
        com.paypal.pds.core.RichText richText = this.richTextDescription;
        com.paypal.pds.core.AnalyticsScope analyticsScope = this.analyticsScope;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("RadioButtonItem(label=");
        sb.append(str);
        sb.append(", description=");
        sb.append(str2);
        sb.append(", richTextDescription=");
        sb.append(richText);
        sb.append(", analyticsScope=");
        sb.append(analyticsScope);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        java.lang.String str = this.label;
        int hashCode = str == null ? 0 : str.hashCode();
        java.lang.String str2 = this.description;
        int hashCode2 = str2 == null ? 0 : str2.hashCode();
        com.paypal.pds.core.RichText richText = this.richTextDescription;
        return (((((hashCode * 31) + hashCode2) * 31) + (richText != null ? richText.hashCode() : 0)) * 31) + this.analyticsScope.hashCode();
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.paypal.pds.components.RadioButtonItem)) {
            return false;
        }
        com.paypal.pds.components.RadioButtonItem radioButtonItem = (com.paypal.pds.components.RadioButtonItem) other;
        return kotlin.jvm.internal.Intrinsics.areEqual(this.label, radioButtonItem.label) && kotlin.jvm.internal.Intrinsics.areEqual(this.description, radioButtonItem.description) && kotlin.jvm.internal.Intrinsics.areEqual(this.richTextDescription, radioButtonItem.richTextDescription) && kotlin.jvm.internal.Intrinsics.areEqual(this.analyticsScope, radioButtonItem.analyticsScope);
    }

    /* renamed from: component4, reason: from getter */
    public final com.paypal.pds.core.AnalyticsScope getAnalyticsScope() {
        return this.analyticsScope;
    }

    /* renamed from: component3, reason: from getter */
    public final com.paypal.pds.core.RichText getRichTextDescription() {
        return this.richTextDescription;
    }

    /* renamed from: component2, reason: from getter */
    public final java.lang.String getDescription() {
        return this.description;
    }

    /* renamed from: component1, reason: from getter */
    public final java.lang.String getLabel() {
        return this.label;
    }
}
