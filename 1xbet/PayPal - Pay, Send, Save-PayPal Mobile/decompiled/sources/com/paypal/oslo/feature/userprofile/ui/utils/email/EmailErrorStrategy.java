package com.paypal.oslo.feature.userprofile.ui.utils.email;

@kotlin.Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\bp\u0018\u00002\u00020\u0001:\u0004\u0002\u0003\u0004\u0005\u0082\u0001\u0004\u0006\u0007\b\tÀ\u0006\u0003"}, d2 = {"Lcom/paypal/oslo/feature/userprofile/ui/utils/email/EmailErrorStrategy;", "", "Inline", "Banner", "FullScreen", "Retryable", "Lcom/paypal/oslo/feature/userprofile/ui/utils/email/EmailErrorStrategy$Banner;", "Lcom/paypal/oslo/feature/userprofile/ui/utils/email/EmailErrorStrategy$FullScreen;", "Lcom/paypal/oslo/feature/userprofile/ui/utils/email/EmailErrorStrategy$Inline;", "Lcom/paypal/oslo/feature/userprofile/ui/utils/email/EmailErrorStrategy$Retryable;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes15.dex */
public interface EmailErrorStrategy {

    @kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0007R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0013\u001a\u0004\b\u0014\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/userprofile/ui/utils/email/EmailErrorStrategy$Inline;", "Lcom/paypal/oslo/feature/userprofile/ui/utils/email/EmailErrorStrategy;", "", "message", "<init>", "(Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "copy", "(Ljava/lang/String;)Lcom/paypal/oslo/feature/userprofile/ui/utils/email/EmailErrorStrategy$Inline;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getMessage"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class Inline implements com.paypal.oslo.feature.userprofile.ui.utils.email.EmailErrorStrategy {
        public static final int $stable = 0;
        private final java.lang.String message;

        public Inline(java.lang.String str) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            this.message = str;
        }

        public final java.lang.String getMessage() {
            return this.message;
        }

        public final java.lang.String toString() {
            java.lang.String str = this.message;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Inline(message=");
            sb.append(str);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return this.message.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof com.paypal.oslo.feature.userprofile.ui.utils.email.EmailErrorStrategy.Inline) && kotlin.jvm.internal.Intrinsics.areEqual(this.message, ((com.paypal.oslo.feature.userprofile.ui.utils.email.EmailErrorStrategy.Inline) other).message);
        }

        public final com.paypal.oslo.feature.userprofile.ui.utils.email.EmailErrorStrategy.Inline copy(java.lang.String message) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(message, "");
            return new com.paypal.oslo.feature.userprofile.ui.utils.email.EmailErrorStrategy.Inline(message);
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.String getMessage() {
            return this.message;
        }

        public static /* synthetic */ com.paypal.oslo.feature.userprofile.ui.utils.email.EmailErrorStrategy.Inline copy$default(com.paypal.oslo.feature.userprofile.ui.utils.email.EmailErrorStrategy.Inline inline, java.lang.String str, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = inline.message;
            }
            return inline.copy(str);
        }
    }

    @kotlin.Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u000b\b\u0086\b\u0018\u00002\u00020\u0001B-\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0010\u001a\u00020\u0006HÆ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\u0012\u0010\u0012\u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0004\b\u0012\u0010\u0013J:\u0010\u0014\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00062\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\bHÆ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u001a\u0010\u0018\u001a\u00020\u00062\b\u0010\u0017\u001a\u0004\u0018\u00010\u0016HÖ\u0003¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001b\u001a\u00020\u001aHÖ\u0001¢\u0006\u0004\b\u001b\u0010\u001cJ\u0010\u0010\u001d\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u001d\u0010\u000fR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u001e\u001a\u0004\b\u001f\u0010\rR\u001a\u0010\u0005\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010 \u001a\u0004\b!\u0010\u000fR\u001a\u0010\u0007\u001a\u00020\u00068\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\"\u001a\u0004\b#\u0010\u0011R\u001c\u0010\t\u001a\u0004\u0018\u00010\b8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010$\u001a\u0004\b%\u0010\u0013"}, d2 = {"Lcom/paypal/oslo/feature/userprofile/ui/utils/email/EmailErrorStrategy$Banner;", "Lcom/paypal/oslo/feature/userprofile/ui/utils/email/EmailErrorStrategy;", "Lcom/paypal/pds/core/RichText;", "richTextMessage", "", "message", "", "dismissable", "Landroidx/navigation3/runtime/NavKey;", "linkDestination", "<init>", "(Lcom/paypal/pds/core/RichText;Ljava/lang/String;ZLandroidx/navigation3/runtime/NavKey;)V", "component1", "()Lcom/paypal/pds/core/RichText;", "component2", "()Ljava/lang/String;", "component3", "()Z", "component4", "()Landroidx/navigation3/runtime/NavKey;", "copy", "(Lcom/paypal/pds/core/RichText;Ljava/lang/String;ZLandroidx/navigation3/runtime/NavKey;)Lcom/paypal/oslo/feature/userprofile/ui/utils/email/EmailErrorStrategy$Banner;", "", "other", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Lcom/paypal/pds/core/RichText;", "getRichTextMessage", "Ljava/lang/String;", "getMessage", "Z", "getDismissable", "Landroidx/navigation3/runtime/NavKey;", "getLinkDestination"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class Banner implements com.paypal.oslo.feature.userprofile.ui.utils.email.EmailErrorStrategy {
        public static final int $stable = 8;
        private final boolean dismissable;
        private final androidx.navigation3.runtime.NavKey linkDestination;
        private final java.lang.String message;
        private final com.paypal.pds.core.RichText richTextMessage;

        public Banner(com.paypal.pds.core.RichText richText, java.lang.String str, boolean z, androidx.navigation3.runtime.NavKey navKey) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(richText, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            this.richTextMessage = richText;
            this.message = str;
            this.dismissable = z;
            this.linkDestination = navKey;
        }

        public /* synthetic */ Banner(com.paypal.pds.core.RichText richText, java.lang.String str, boolean z, androidx.navigation3.runtime.NavKey navKey, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this(richText, str, (i & 4) != 0 ? true : z, (i & 8) != 0 ? null : navKey);
        }

        public final com.paypal.pds.core.RichText getRichTextMessage() {
            return this.richTextMessage;
        }

        public final java.lang.String getMessage() {
            return this.message;
        }

        public final boolean getDismissable() {
            return this.dismissable;
        }

        public final androidx.navigation3.runtime.NavKey getLinkDestination() {
            return this.linkDestination;
        }

        public final java.lang.String toString() {
            com.paypal.pds.core.RichText richText = this.richTextMessage;
            java.lang.String str = this.message;
            boolean z = this.dismissable;
            androidx.navigation3.runtime.NavKey navKey = this.linkDestination;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Banner(richTextMessage=");
            sb.append(richText);
            sb.append(", message=");
            sb.append(str);
            sb.append(", dismissable=");
            sb.append(z);
            sb.append(", linkDestination=");
            sb.append(navKey);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            int hashCode = this.richTextMessage.hashCode();
            int hashCode2 = this.message.hashCode();
            int hashCode3 = java.lang.Boolean.hashCode(this.dismissable);
            androidx.navigation3.runtime.NavKey navKey = this.linkDestination;
            return (((((hashCode * 31) + hashCode2) * 31) + hashCode3) * 31) + (navKey == null ? 0 : navKey.hashCode());
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.userprofile.ui.utils.email.EmailErrorStrategy.Banner)) {
                return false;
            }
            com.paypal.oslo.feature.userprofile.ui.utils.email.EmailErrorStrategy.Banner banner = (com.paypal.oslo.feature.userprofile.ui.utils.email.EmailErrorStrategy.Banner) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.richTextMessage, banner.richTextMessage) && kotlin.jvm.internal.Intrinsics.areEqual(this.message, banner.message) && this.dismissable == banner.dismissable && kotlin.jvm.internal.Intrinsics.areEqual(this.linkDestination, banner.linkDestination);
        }

        public final com.paypal.oslo.feature.userprofile.ui.utils.email.EmailErrorStrategy.Banner copy(com.paypal.pds.core.RichText richTextMessage, java.lang.String message, boolean dismissable, androidx.navigation3.runtime.NavKey linkDestination) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(richTextMessage, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(message, "");
            return new com.paypal.oslo.feature.userprofile.ui.utils.email.EmailErrorStrategy.Banner(richTextMessage, message, dismissable, linkDestination);
        }

        /* renamed from: component4, reason: from getter */
        public final androidx.navigation3.runtime.NavKey getLinkDestination() {
            return this.linkDestination;
        }

        /* renamed from: component3, reason: from getter */
        public final boolean getDismissable() {
            return this.dismissable;
        }

        /* renamed from: component2, reason: from getter */
        public final java.lang.String getMessage() {
            return this.message;
        }

        /* renamed from: component1, reason: from getter */
        public final com.paypal.pds.core.RichText getRichTextMessage() {
            return this.richTextMessage;
        }

        public static /* synthetic */ com.paypal.oslo.feature.userprofile.ui.utils.email.EmailErrorStrategy.Banner copy$default(com.paypal.oslo.feature.userprofile.ui.utils.email.EmailErrorStrategy.Banner banner, com.paypal.pds.core.RichText richText, java.lang.String str, boolean z, androidx.navigation3.runtime.NavKey navKey, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                richText = banner.richTextMessage;
            }
            if ((i & 2) != 0) {
                str = banner.message;
            }
            if ((i & 4) != 0) {
                z = banner.dismissable;
            }
            if ((i & 8) != 0) {
                navKey = banner.linkDestination;
            }
            return banner.copy(richText, str, z, navKey);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\n\b\u0086\b\u0018\u00002\u00020\u0001B3\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\r\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\r\u0010\fJ\u0010\u0010\u000e\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000e\u0010\fJ\u0010\u0010\u000f\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000f\u0010\fJ\u0012\u0010\u0010\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0004\b\u0010\u0010\u0011JD\u0010\u0012\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00022\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007HÆ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u001a\u0010\u0017\u001a\u00020\u00162\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014HÖ\u0003¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u001a\u001a\u00020\u0019HÖ\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001c\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001c\u0010\fR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u001d\u001a\u0004\b\u001e\u0010\fR\u001a\u0010\u0004\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u001d\u001a\u0004\b\u001f\u0010\fR\u001a\u0010\u0005\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u001d\u001a\u0004\b \u0010\fR\u001a\u0010\u0006\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u001d\u001a\u0004\b!\u0010\fR\u001c\u0010\b\u001a\u0004\u0018\u00010\u00078\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\"\u001a\u0004\b#\u0010\u0011"}, d2 = {"Lcom/paypal/oslo/feature/userprofile/ui/utils/email/EmailErrorStrategy$FullScreen;", "Lcom/paypal/oslo/feature/userprofile/ui/utils/email/EmailErrorStrategy;", "", "title", "subtitle", "buttonText", "iconName", "Landroidx/navigation3/runtime/NavKey;", "actionDestination", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Landroidx/navigation3/runtime/NavKey;)V", "component1", "()Ljava/lang/String;", "component2", "component3", "component4", "component5", "()Landroidx/navigation3/runtime/NavKey;", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Landroidx/navigation3/runtime/NavKey;)Lcom/paypal/oslo/feature/userprofile/ui/utils/email/EmailErrorStrategy$FullScreen;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getTitle", "getSubtitle", "getButtonText", "getIconName", "Landroidx/navigation3/runtime/NavKey;", "getActionDestination"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class FullScreen implements com.paypal.oslo.feature.userprofile.ui.utils.email.EmailErrorStrategy {
        public static final int $stable = 8;
        private final androidx.navigation3.runtime.NavKey actionDestination;
        private final java.lang.String buttonText;
        private final java.lang.String iconName;
        private final java.lang.String subtitle;
        private final java.lang.String title;

        public FullScreen(java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, androidx.navigation3.runtime.NavKey navKey) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str2, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str3, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str4, "");
            this.title = str;
            this.subtitle = str2;
            this.buttonText = str3;
            this.iconName = str4;
            this.actionDestination = navKey;
        }

        public /* synthetic */ FullScreen(java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, androidx.navigation3.runtime.NavKey navKey, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this(str, str2, str3, str4, (i & 16) != 0 ? null : navKey);
        }

        public final java.lang.String getTitle() {
            return this.title;
        }

        public final java.lang.String getSubtitle() {
            return this.subtitle;
        }

        public final java.lang.String getButtonText() {
            return this.buttonText;
        }

        public final java.lang.String getIconName() {
            return this.iconName;
        }

        public final androidx.navigation3.runtime.NavKey getActionDestination() {
            return this.actionDestination;
        }

        public final java.lang.String toString() {
            java.lang.String str = this.title;
            java.lang.String str2 = this.subtitle;
            java.lang.String str3 = this.buttonText;
            java.lang.String str4 = this.iconName;
            androidx.navigation3.runtime.NavKey navKey = this.actionDestination;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("FullScreen(title=");
            sb.append(str);
            sb.append(", subtitle=");
            sb.append(str2);
            sb.append(", buttonText=");
            sb.append(str3);
            sb.append(", iconName=");
            sb.append(str4);
            sb.append(", actionDestination=");
            sb.append(navKey);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            int hashCode = this.title.hashCode();
            int hashCode2 = this.subtitle.hashCode();
            int hashCode3 = this.buttonText.hashCode();
            int hashCode4 = this.iconName.hashCode();
            androidx.navigation3.runtime.NavKey navKey = this.actionDestination;
            return (((((((hashCode * 31) + hashCode2) * 31) + hashCode3) * 31) + hashCode4) * 31) + (navKey == null ? 0 : navKey.hashCode());
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.userprofile.ui.utils.email.EmailErrorStrategy.FullScreen)) {
                return false;
            }
            com.paypal.oslo.feature.userprofile.ui.utils.email.EmailErrorStrategy.FullScreen fullScreen = (com.paypal.oslo.feature.userprofile.ui.utils.email.EmailErrorStrategy.FullScreen) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.title, fullScreen.title) && kotlin.jvm.internal.Intrinsics.areEqual(this.subtitle, fullScreen.subtitle) && kotlin.jvm.internal.Intrinsics.areEqual(this.buttonText, fullScreen.buttonText) && kotlin.jvm.internal.Intrinsics.areEqual(this.iconName, fullScreen.iconName) && kotlin.jvm.internal.Intrinsics.areEqual(this.actionDestination, fullScreen.actionDestination);
        }

        public final com.paypal.oslo.feature.userprofile.ui.utils.email.EmailErrorStrategy.FullScreen copy(java.lang.String title, java.lang.String subtitle, java.lang.String buttonText, java.lang.String iconName, androidx.navigation3.runtime.NavKey actionDestination) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(title, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(subtitle, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(buttonText, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(iconName, "");
            return new com.paypal.oslo.feature.userprofile.ui.utils.email.EmailErrorStrategy.FullScreen(title, subtitle, buttonText, iconName, actionDestination);
        }

        /* renamed from: component5, reason: from getter */
        public final androidx.navigation3.runtime.NavKey getActionDestination() {
            return this.actionDestination;
        }

        /* renamed from: component4, reason: from getter */
        public final java.lang.String getIconName() {
            return this.iconName;
        }

        /* renamed from: component3, reason: from getter */
        public final java.lang.String getButtonText() {
            return this.buttonText;
        }

        /* renamed from: component2, reason: from getter */
        public final java.lang.String getSubtitle() {
            return this.subtitle;
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.String getTitle() {
            return this.title;
        }

        public static /* synthetic */ com.paypal.oslo.feature.userprofile.ui.utils.email.EmailErrorStrategy.FullScreen copy$default(com.paypal.oslo.feature.userprofile.ui.utils.email.EmailErrorStrategy.FullScreen fullScreen, java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, androidx.navigation3.runtime.NavKey navKey, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = fullScreen.title;
            }
            if ((i & 2) != 0) {
                str2 = fullScreen.subtitle;
            }
            java.lang.String str5 = str2;
            if ((i & 4) != 0) {
                str3 = fullScreen.buttonText;
            }
            java.lang.String str6 = str3;
            if ((i & 8) != 0) {
                str4 = fullScreen.iconName;
            }
            java.lang.String str7 = str4;
            if ((i & 16) != 0) {
                navKey = fullScreen.actionDestination;
            }
            return fullScreen.copy(str, str5, str6, str7, navKey);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\r\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\b\b\u0086\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000b\u0010\nJ\u0010\u0010\f\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\f\u0010\nJ\u0010\u0010\r\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\r\u0010\nJ8\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0016\u001a\u00020\u0015HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0018\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0018\u0010\nR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0019\u001a\u0004\b\u001a\u0010\nR\u001a\u0010\u0004\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0019\u001a\u0004\b\u001b\u0010\nR\u001a\u0010\u0005\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0019\u001a\u0004\b\u001c\u0010\nR\u001a\u0010\u0006\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0019\u001a\u0004\b\u001d\u0010\n"}, d2 = {"Lcom/paypal/oslo/feature/userprofile/ui/utils/email/EmailErrorStrategy$Retryable;", "Lcom/paypal/oslo/feature/userprofile/ui/utils/email/EmailErrorStrategy;", "", "title", "subtitle", "buttonText", "iconName", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "component2", "component3", "component4", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/paypal/oslo/feature/userprofile/ui/utils/email/EmailErrorStrategy$Retryable;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getTitle", "getSubtitle", "getButtonText", "getIconName"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class Retryable implements com.paypal.oslo.feature.userprofile.ui.utils.email.EmailErrorStrategy {
        public static final int $stable = 0;
        private final java.lang.String buttonText;
        private final java.lang.String iconName;
        private final java.lang.String subtitle;
        private final java.lang.String title;

        public Retryable(java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str2, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str3, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str4, "");
            this.title = str;
            this.subtitle = str2;
            this.buttonText = str3;
            this.iconName = str4;
        }

        public final java.lang.String getTitle() {
            return this.title;
        }

        public final java.lang.String getSubtitle() {
            return this.subtitle;
        }

        public final java.lang.String getButtonText() {
            return this.buttonText;
        }

        public final java.lang.String getIconName() {
            return this.iconName;
        }

        public final java.lang.String toString() {
            java.lang.String str = this.title;
            java.lang.String str2 = this.subtitle;
            java.lang.String str3 = this.buttonText;
            java.lang.String str4 = this.iconName;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Retryable(title=");
            sb.append(str);
            sb.append(", subtitle=");
            sb.append(str2);
            sb.append(", buttonText=");
            sb.append(str3);
            sb.append(", iconName=");
            sb.append(str4);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return (((((this.title.hashCode() * 31) + this.subtitle.hashCode()) * 31) + this.buttonText.hashCode()) * 31) + this.iconName.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.userprofile.ui.utils.email.EmailErrorStrategy.Retryable)) {
                return false;
            }
            com.paypal.oslo.feature.userprofile.ui.utils.email.EmailErrorStrategy.Retryable retryable = (com.paypal.oslo.feature.userprofile.ui.utils.email.EmailErrorStrategy.Retryable) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.title, retryable.title) && kotlin.jvm.internal.Intrinsics.areEqual(this.subtitle, retryable.subtitle) && kotlin.jvm.internal.Intrinsics.areEqual(this.buttonText, retryable.buttonText) && kotlin.jvm.internal.Intrinsics.areEqual(this.iconName, retryable.iconName);
        }

        public final com.paypal.oslo.feature.userprofile.ui.utils.email.EmailErrorStrategy.Retryable copy(java.lang.String title, java.lang.String subtitle, java.lang.String buttonText, java.lang.String iconName) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(title, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(subtitle, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(buttonText, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(iconName, "");
            return new com.paypal.oslo.feature.userprofile.ui.utils.email.EmailErrorStrategy.Retryable(title, subtitle, buttonText, iconName);
        }

        /* renamed from: component4, reason: from getter */
        public final java.lang.String getIconName() {
            return this.iconName;
        }

        /* renamed from: component3, reason: from getter */
        public final java.lang.String getButtonText() {
            return this.buttonText;
        }

        /* renamed from: component2, reason: from getter */
        public final java.lang.String getSubtitle() {
            return this.subtitle;
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.String getTitle() {
            return this.title;
        }

        public static /* synthetic */ com.paypal.oslo.feature.userprofile.ui.utils.email.EmailErrorStrategy.Retryable copy$default(com.paypal.oslo.feature.userprofile.ui.utils.email.EmailErrorStrategy.Retryable retryable, java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = retryable.title;
            }
            if ((i & 2) != 0) {
                str2 = retryable.subtitle;
            }
            if ((i & 4) != 0) {
                str3 = retryable.buttonText;
            }
            if ((i & 8) != 0) {
                str4 = retryable.iconName;
            }
            return retryable.copy(str, str2, str3, str4);
        }
    }
}
