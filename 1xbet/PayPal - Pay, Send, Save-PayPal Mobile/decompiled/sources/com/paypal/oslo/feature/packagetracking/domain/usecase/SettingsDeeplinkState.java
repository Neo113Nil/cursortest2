package com.paypal.oslo.feature.packagetracking.domain.usecase;

@kotlin.Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\bp\u0018\u00002\u00020\u0001:\u0004\u0002\u0003\u0004\u0005\u0082\u0001\u0004\u0006\u0007\b\tÀ\u0006\u0003"}, d2 = {"Lcom/paypal/oslo/feature/packagetracking/domain/usecase/SettingsDeeplinkState;", "", "Settings", "RelinkReminderPush", "Relink", com.adobe.marketing.mobile.internal.CoreConstants.Wrapper.Name.NONE, "Lcom/paypal/oslo/feature/packagetracking/domain/usecase/SettingsDeeplinkState$None;", "Lcom/paypal/oslo/feature/packagetracking/domain/usecase/SettingsDeeplinkState$Relink;", "Lcom/paypal/oslo/feature/packagetracking/domain/usecase/SettingsDeeplinkState$RelinkReminderPush;", "Lcom/paypal/oslo/feature/packagetracking/domain/usecase/SettingsDeeplinkState$Settings;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes13.dex */
public interface SettingsDeeplinkState {

    @kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u000b\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\b\u0086\b\u0018\u00002\u00020\u0001B%\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u0012\u0010\b\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0012\u0010\n\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\n\u0010\tJ\u0012\u0010\u000b\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u000b\u0010\tJ4\u0010\f\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0016\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0016\u0010\tR\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0017\u001a\u0004\b\u0018\u0010\tR\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0017\u001a\u0004\b\u0019\u0010\tR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0017\u001a\u0004\b\u001a\u0010\t"}, d2 = {"Lcom/paypal/oslo/feature/packagetracking/domain/usecase/SettingsDeeplinkState$Settings;", "Lcom/paypal/oslo/feature/packagetracking/domain/usecase/SettingsDeeplinkState;", "", "source", "triggerPoint", "emailProvider", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "component2", "component3", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/paypal/oslo/feature/packagetracking/domain/usecase/SettingsDeeplinkState$Settings;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getSource", "getTriggerPoint", "getEmailProvider"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class Settings implements com.paypal.oslo.feature.packagetracking.domain.usecase.SettingsDeeplinkState {
        public static final int $stable = 0;
        private final java.lang.String emailProvider;
        private final java.lang.String source;
        private final java.lang.String triggerPoint;

        public Settings(java.lang.String str, java.lang.String str2, java.lang.String str3) {
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

        public final java.lang.String toString() {
            java.lang.String str = this.source;
            java.lang.String str2 = this.triggerPoint;
            java.lang.String str3 = this.emailProvider;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Settings(source=");
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
            if (!(other instanceof com.paypal.oslo.feature.packagetracking.domain.usecase.SettingsDeeplinkState.Settings)) {
                return false;
            }
            com.paypal.oslo.feature.packagetracking.domain.usecase.SettingsDeeplinkState.Settings settings = (com.paypal.oslo.feature.packagetracking.domain.usecase.SettingsDeeplinkState.Settings) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.source, settings.source) && kotlin.jvm.internal.Intrinsics.areEqual(this.triggerPoint, settings.triggerPoint) && kotlin.jvm.internal.Intrinsics.areEqual(this.emailProvider, settings.emailProvider);
        }

        public final com.paypal.oslo.feature.packagetracking.domain.usecase.SettingsDeeplinkState.Settings copy(java.lang.String source, java.lang.String triggerPoint, java.lang.String emailProvider) {
            return new com.paypal.oslo.feature.packagetracking.domain.usecase.SettingsDeeplinkState.Settings(source, triggerPoint, emailProvider);
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

        public static /* synthetic */ com.paypal.oslo.feature.packagetracking.domain.usecase.SettingsDeeplinkState.Settings copy$default(com.paypal.oslo.feature.packagetracking.domain.usecase.SettingsDeeplinkState.Settings settings, java.lang.String str, java.lang.String str2, java.lang.String str3, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = settings.source;
            }
            if ((i & 2) != 0) {
                str2 = settings.triggerPoint;
            }
            if ((i & 4) != 0) {
                str3 = settings.emailProvider;
            }
            return settings.copy(str, str2, str3);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0015\u001a\u0004\b\u0016\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/packagetracking/domain/usecase/SettingsDeeplinkState$RelinkReminderPush;", "Lcom/paypal/oslo/feature/packagetracking/domain/usecase/SettingsDeeplinkState;", "Lcom/paypal/oslo/feature/packagetracking/domain/model/EmailProvider;", "emailProvider", "<init>", "(Lcom/paypal/oslo/feature/packagetracking/domain/model/EmailProvider;)V", "component1", "()Lcom/paypal/oslo/feature/packagetracking/domain/model/EmailProvider;", "copy", "(Lcom/paypal/oslo/feature/packagetracking/domain/model/EmailProvider;)Lcom/paypal/oslo/feature/packagetracking/domain/usecase/SettingsDeeplinkState$RelinkReminderPush;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lcom/paypal/oslo/feature/packagetracking/domain/model/EmailProvider;", "getEmailProvider"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class RelinkReminderPush implements com.paypal.oslo.feature.packagetracking.domain.usecase.SettingsDeeplinkState {
        public static final int $stable = 0;
        private final com.paypal.oslo.feature.packagetracking.domain.model.EmailProvider emailProvider;

        public RelinkReminderPush(com.paypal.oslo.feature.packagetracking.domain.model.EmailProvider emailProvider) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(emailProvider, "");
            this.emailProvider = emailProvider;
        }

        public final com.paypal.oslo.feature.packagetracking.domain.model.EmailProvider getEmailProvider() {
            return this.emailProvider;
        }

        public final java.lang.String toString() {
            com.paypal.oslo.feature.packagetracking.domain.model.EmailProvider emailProvider = this.emailProvider;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("RelinkReminderPush(emailProvider=");
            sb.append(emailProvider);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return this.emailProvider.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof com.paypal.oslo.feature.packagetracking.domain.usecase.SettingsDeeplinkState.RelinkReminderPush) && this.emailProvider == ((com.paypal.oslo.feature.packagetracking.domain.usecase.SettingsDeeplinkState.RelinkReminderPush) other).emailProvider;
        }

        public final com.paypal.oslo.feature.packagetracking.domain.usecase.SettingsDeeplinkState.RelinkReminderPush copy(com.paypal.oslo.feature.packagetracking.domain.model.EmailProvider emailProvider) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(emailProvider, "");
            return new com.paypal.oslo.feature.packagetracking.domain.usecase.SettingsDeeplinkState.RelinkReminderPush(emailProvider);
        }

        /* renamed from: component1, reason: from getter */
        public final com.paypal.oslo.feature.packagetracking.domain.model.EmailProvider getEmailProvider() {
            return this.emailProvider;
        }

        public static /* synthetic */ com.paypal.oslo.feature.packagetracking.domain.usecase.SettingsDeeplinkState.RelinkReminderPush copy$default(com.paypal.oslo.feature.packagetracking.domain.usecase.SettingsDeeplinkState.RelinkReminderPush relinkReminderPush, com.paypal.oslo.feature.packagetracking.domain.model.EmailProvider emailProvider, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                emailProvider = relinkReminderPush.emailProvider;
            }
            return relinkReminderPush.copy(emailProvider);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ$\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u00042\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0016\u001a\u00020\u0015HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0018\u001a\u0004\b\u0019\u0010\tR\u001a\u0010\u0005\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u001a\u001a\u0004\b\u001b\u0010\u000b"}, d2 = {"Lcom/paypal/oslo/feature/packagetracking/domain/usecase/SettingsDeeplinkState$Relink;", "Lcom/paypal/oslo/feature/packagetracking/domain/usecase/SettingsDeeplinkState;", "Lcom/paypal/oslo/feature/packagetracking/domain/model/EmailProvider;", "emailProvider", "", "showError", "<init>", "(Lcom/paypal/oslo/feature/packagetracking/domain/model/EmailProvider;Z)V", "component1", "()Lcom/paypal/oslo/feature/packagetracking/domain/model/EmailProvider;", "component2", "()Z", "copy", "(Lcom/paypal/oslo/feature/packagetracking/domain/model/EmailProvider;Z)Lcom/paypal/oslo/feature/packagetracking/domain/usecase/SettingsDeeplinkState$Relink;", "", "other", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lcom/paypal/oslo/feature/packagetracking/domain/model/EmailProvider;", "getEmailProvider", "Z", "getShowError"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class Relink implements com.paypal.oslo.feature.packagetracking.domain.usecase.SettingsDeeplinkState {
        public static final int $stable = 0;
        private final com.paypal.oslo.feature.packagetracking.domain.model.EmailProvider emailProvider;
        private final boolean showError;

        public Relink(com.paypal.oslo.feature.packagetracking.domain.model.EmailProvider emailProvider, boolean z) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(emailProvider, "");
            this.emailProvider = emailProvider;
            this.showError = z;
        }

        public final com.paypal.oslo.feature.packagetracking.domain.model.EmailProvider getEmailProvider() {
            return this.emailProvider;
        }

        public final boolean getShowError() {
            return this.showError;
        }

        public final java.lang.String toString() {
            com.paypal.oslo.feature.packagetracking.domain.model.EmailProvider emailProvider = this.emailProvider;
            boolean z = this.showError;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Relink(emailProvider=");
            sb.append(emailProvider);
            sb.append(", showError=");
            sb.append(z);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return (this.emailProvider.hashCode() * 31) + java.lang.Boolean.hashCode(this.showError);
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.packagetracking.domain.usecase.SettingsDeeplinkState.Relink)) {
                return false;
            }
            com.paypal.oslo.feature.packagetracking.domain.usecase.SettingsDeeplinkState.Relink relink = (com.paypal.oslo.feature.packagetracking.domain.usecase.SettingsDeeplinkState.Relink) other;
            return this.emailProvider == relink.emailProvider && this.showError == relink.showError;
        }

        public final com.paypal.oslo.feature.packagetracking.domain.usecase.SettingsDeeplinkState.Relink copy(com.paypal.oslo.feature.packagetracking.domain.model.EmailProvider emailProvider, boolean showError) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(emailProvider, "");
            return new com.paypal.oslo.feature.packagetracking.domain.usecase.SettingsDeeplinkState.Relink(emailProvider, showError);
        }

        /* renamed from: component2, reason: from getter */
        public final boolean getShowError() {
            return this.showError;
        }

        /* renamed from: component1, reason: from getter */
        public final com.paypal.oslo.feature.packagetracking.domain.model.EmailProvider getEmailProvider() {
            return this.emailProvider;
        }

        public static /* synthetic */ com.paypal.oslo.feature.packagetracking.domain.usecase.SettingsDeeplinkState.Relink copy$default(com.paypal.oslo.feature.packagetracking.domain.usecase.SettingsDeeplinkState.Relink relink, com.paypal.oslo.feature.packagetracking.domain.model.EmailProvider emailProvider, boolean z, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                emailProvider = relink.emailProvider;
            }
            if ((i & 2) != 0) {
                z = relink.showError;
            }
            return relink.copy(emailProvider, z);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/packagetracking/domain/usecase/SettingsDeeplinkState$None;", "Lcom/paypal/oslo/feature/packagetracking/domain/usecase/SettingsDeeplinkState;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class None implements com.paypal.oslo.feature.packagetracking.domain.usecase.SettingsDeeplinkState {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.packagetracking.domain.usecase.SettingsDeeplinkState.None INSTANCE = new com.paypal.oslo.feature.packagetracking.domain.usecase.SettingsDeeplinkState.None();

        public final int hashCode() {
            return 881122173;
        }

        private None() {
        }

        public final java.lang.String toString() {
            return com.adobe.marketing.mobile.internal.CoreConstants.Wrapper.Name.NONE;
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.packagetracking.domain.usecase.SettingsDeeplinkState.None)) {
                return false;
            }
            return true;
        }
    }
}
