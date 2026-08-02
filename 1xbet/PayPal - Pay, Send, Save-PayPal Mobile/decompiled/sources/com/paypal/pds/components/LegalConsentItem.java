package com.paypal.pds.components;

@kotlin.Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\b6\u0018\u0000 \f2\u00020\u0001:\u0001\fB\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0006\u001a\u00020\u00002\u0006\u0010\u0005\u001a\u00020\u0004H&¢\u0006\u0004\b\u0006\u0010\u0007R\u0014\u0010\u000b\u001a\u00020\b8!X \u0004¢\u0006\u0006\u001a\u0004\b\t\u0010\n\u0082\u0001\u0002\r\u000e"}, d2 = {"Lcom/paypal/pds/components/LegalConsentItem;", "", "<init>", "()V", "", "checked", "updateChecked", "(Z)Lcom/paypal/pds/components/LegalConsentItem;", "Lcom/paypal/pds/core/AnalyticsScope;", "getAnalyticsScope$pds_release", "()Lcom/paypal/pds/core/AnalyticsScope;", "analyticsScope", "Companion", "Lcom/paypal/pds/components/Explicit;", "Lcom/paypal/pds/components/Implicit;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes16.dex */
public abstract class LegalConsentItem {
    public static final int $stable = 0;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final com.paypal.pds.components.LegalConsentItem.Companion INSTANCE = new com.paypal.pds.components.LegalConsentItem.Companion(null);

    public abstract com.paypal.pds.core.AnalyticsScope getAnalyticsScope$pds_release();

    public abstract com.paypal.pds.components.LegalConsentItem updateChecked(boolean checked);

    private LegalConsentItem() {
    }

    @kotlin.Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J/\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\n\u001a\u00020\t¢\u0006\u0004\b\f\u0010\rJ/\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\n\u001a\u00020\t¢\u0006\u0004\b\f\u0010\u0010J\u001f\u0010\u0011\u001a\u00020\u000b2\u0006\u0010\u0006\u001a\u00020\u00042\b\b\u0002\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u0011\u0010\u0012J\u001f\u0010\u0011\u001a\u00020\u000b2\u0006\u0010\u000f\u001a\u00020\u000e2\b\b\u0002\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u0011\u0010\u0013"}, d2 = {"Lcom/paypal/pds/components/LegalConsentItem$Companion;", "", "<init>", "()V", "", "label", com.paypal.oslo.feature.inappcheckout.domain.util.LoggerParameterKeys.DESCRIPTION, "", "checked", "Lcom/paypal/pds/core/AnalyticsScope;", "analyticsScope", "Lcom/paypal/pds/components/LegalConsentItem;", "explicit", "(Ljava/lang/String;Ljava/lang/String;ZLcom/paypal/pds/core/AnalyticsScope;)Lcom/paypal/pds/components/LegalConsentItem;", "Lcom/paypal/pds/core/RichText;", "richTextDescription", "(Ljava/lang/String;Lcom/paypal/pds/core/RichText;ZLcom/paypal/pds/core/AnalyticsScope;)Lcom/paypal/pds/components/LegalConsentItem;", "implicit", "(Ljava/lang/String;Lcom/paypal/pds/core/AnalyticsScope;)Lcom/paypal/pds/components/LegalConsentItem;", "(Lcom/paypal/pds/core/RichText;Lcom/paypal/pds/core/AnalyticsScope;)Lcom/paypal/pds/components/LegalConsentItem;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public static /* synthetic */ com.paypal.pds.components.LegalConsentItem explicit$default(com.paypal.pds.components.LegalConsentItem.Companion companion, java.lang.String str, java.lang.String str2, boolean z, com.paypal.pds.core.AnalyticsScope analyticsScope, int i, java.lang.Object obj) {
            if ((i & 8) != 0) {
                analyticsScope = com.paypal.pds.core.AnalyticsScope.INSTANCE.getEmpty();
            }
            return companion.explicit(str, str2, z, analyticsScope);
        }

        public final com.paypal.pds.components.LegalConsentItem explicit(java.lang.String label, java.lang.String description, boolean checked, com.paypal.pds.core.AnalyticsScope analyticsScope) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(label, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(description, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(analyticsScope, "");
            return new com.paypal.pds.components.Explicit(label, description, null, checked, analyticsScope, 4, null);
        }

        public static /* synthetic */ com.paypal.pds.components.LegalConsentItem explicit$default(com.paypal.pds.components.LegalConsentItem.Companion companion, java.lang.String str, com.paypal.pds.core.RichText richText, boolean z, com.paypal.pds.core.AnalyticsScope analyticsScope, int i, java.lang.Object obj) {
            if ((i & 8) != 0) {
                analyticsScope = com.paypal.pds.core.AnalyticsScope.INSTANCE.getEmpty();
            }
            return companion.explicit(str, richText, z, analyticsScope);
        }

        public final com.paypal.pds.components.LegalConsentItem explicit(java.lang.String label, com.paypal.pds.core.RichText richTextDescription, boolean checked, com.paypal.pds.core.AnalyticsScope analyticsScope) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(label, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(richTextDescription, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(analyticsScope, "");
            return new com.paypal.pds.components.Explicit(label, null, richTextDescription, checked, analyticsScope, 2, null);
        }

        public static /* synthetic */ com.paypal.pds.components.LegalConsentItem implicit$default(com.paypal.pds.components.LegalConsentItem.Companion companion, java.lang.String str, com.paypal.pds.core.AnalyticsScope analyticsScope, int i, java.lang.Object obj) {
            if ((i & 2) != 0) {
                analyticsScope = com.paypal.pds.core.AnalyticsScope.INSTANCE.getEmpty();
            }
            return companion.implicit(str, analyticsScope);
        }

        public final com.paypal.pds.components.LegalConsentItem implicit(java.lang.String description, com.paypal.pds.core.AnalyticsScope analyticsScope) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(description, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(analyticsScope, "");
            return new com.paypal.pds.components.Implicit(description, null, analyticsScope, 2, null);
        }

        public static /* synthetic */ com.paypal.pds.components.LegalConsentItem implicit$default(com.paypal.pds.components.LegalConsentItem.Companion companion, com.paypal.pds.core.RichText richText, com.paypal.pds.core.AnalyticsScope analyticsScope, int i, java.lang.Object obj) {
            if ((i & 2) != 0) {
                analyticsScope = com.paypal.pds.core.AnalyticsScope.INSTANCE.getEmpty();
            }
            return companion.implicit(richText, analyticsScope);
        }

        public final com.paypal.pds.components.LegalConsentItem implicit(com.paypal.pds.core.RichText richTextDescription, com.paypal.pds.core.AnalyticsScope analyticsScope) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(richTextDescription, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(analyticsScope, "");
            return new com.paypal.pds.components.Implicit(null, richTextDescription, analyticsScope, 1, null);
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public /* synthetic */ LegalConsentItem(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }
}
