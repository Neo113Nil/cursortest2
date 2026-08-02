package com.paypal.oslo.core.pushnotification.domain.notification;

@kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\bv\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005À\u0006\u0003"}, d2 = {"Lcom/paypal/oslo/core/pushnotification/domain/notification/NotificationChannel;", "", "Default", androidx.constraintlayout.core.motion.utils.TypedValues.Custom.NAME, "Lcom/paypal/oslo/core/pushnotification/domain/notification/NotificationChannel$Custom;", "Lcom/paypal/oslo/core/pushnotification/domain/notification/NotificationChannel$Default;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes10.dex */
public interface NotificationChannel {

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @kotlin.Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0004\b\u0086\u0001\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004j\u0002\b\u0005j\u0002\b\u0006"}, d2 = {"Lcom/paypal/oslo/core/pushnotification/domain/notification/NotificationChannel$Default;", "Lcom/paypal/oslo/core/pushnotification/domain/notification/NotificationChannel;", "", "<init>", "(Ljava/lang/String;I)V", "GENERAL", "IMPORTANT"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Default implements com.paypal.oslo.core.pushnotification.domain.notification.NotificationChannel {
        public static final com.paypal.oslo.core.pushnotification.domain.notification.NotificationChannel.Default GENERAL;
        public static final com.paypal.oslo.core.pushnotification.domain.notification.NotificationChannel.Default IMPORTANT;
        private static final /* synthetic */ com.paypal.oslo.core.pushnotification.domain.notification.NotificationChannel.Default[] getHighResolutionOutputSizeshNQ4ISI;
        private static final /* synthetic */ kotlin.enums.EnumEntries getHighSpeedVideoFpsRanges;

        private Default(java.lang.String str, int i) {
        }

        static {
            com.paypal.oslo.core.pushnotification.domain.notification.NotificationChannel.Default r0 = new com.paypal.oslo.core.pushnotification.domain.notification.NotificationChannel.Default("GENERAL", 0);
            GENERAL = r0;
            com.paypal.oslo.core.pushnotification.domain.notification.NotificationChannel.Default r1 = new com.paypal.oslo.core.pushnotification.domain.notification.NotificationChannel.Default("IMPORTANT", 1);
            IMPORTANT = r1;
            com.paypal.oslo.core.pushnotification.domain.notification.NotificationChannel.Default[] defaultArr = {r0, r1};
            getHighResolutionOutputSizeshNQ4ISI = defaultArr;
            getHighSpeedVideoFpsRanges = kotlin.enums.EnumEntriesKt.enumEntries(defaultArr);
        }

        public static com.paypal.oslo.core.pushnotification.domain.notification.NotificationChannel.Default[] values() {
            return (com.paypal.oslo.core.pushnotification.domain.notification.NotificationChannel.Default[]) getHighResolutionOutputSizeshNQ4ISI.clone();
        }

        public static com.paypal.oslo.core.pushnotification.domain.notification.NotificationChannel.Default valueOf(java.lang.String str) {
            return (com.paypal.oslo.core.pushnotification.domain.notification.NotificationChannel.Default) java.lang.Enum.valueOf(com.paypal.oslo.core.pushnotification.domain.notification.NotificationChannel.Default.class, str);
        }

        public static kotlin.enums.EnumEntries<com.paypal.oslo.core.pushnotification.domain.notification.NotificationChannel.Default> getEntries() {
            return getHighSpeedVideoFpsRanges;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0011\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\r\b\u0086\b\u0018\u00002\u00020\u0001BK\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0002\u0010\t\u001a\u00020\b\u0012\b\b\u0002\u0010\n\u001a\u00020\b\u0012\b\b\u0002\u0010\u000b\u001a\u00020\b¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0010\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0010\u0010\u000fJ\u0012\u0010\u0011\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0011\u0010\u000fJ\u0010\u0010\u0012\u001a\u00020\u0006HÆ\u0003¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0014\u001a\u00020\bHÆ\u0003¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0016\u001a\u00020\bHÆ\u0003¢\u0006\u0004\b\u0016\u0010\u0015J\u0010\u0010\u0017\u001a\u00020\bHÆ\u0003¢\u0006\u0004\b\u0017\u0010\u0015JX\u0010\u0018\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\n\u001a\u00020\b2\b\b\u0002\u0010\u000b\u001a\u00020\bHÆ\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u001a\u0010\u001c\u001a\u00020\b2\b\u0010\u001b\u001a\u0004\u0018\u00010\u001aHÖ\u0003¢\u0006\u0004\b\u001c\u0010\u001dJ\u0010\u0010\u001f\u001a\u00020\u001eHÖ\u0001¢\u0006\u0004\b\u001f\u0010 J\u0010\u0010!\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b!\u0010\u000fR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\"\u001a\u0004\b#\u0010\u000fR\u001a\u0010\u0004\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\"\u001a\u0004\b$\u0010\u000fR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\"\u001a\u0004\b%\u0010\u000fR\u001a\u0010\u0007\u001a\u00020\u00068\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010&\u001a\u0004\b'\u0010\u0013R\u001a\u0010\t\u001a\u00020\b8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010(\u001a\u0004\b)\u0010\u0015R\u001a\u0010\n\u001a\u00020\b8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010(\u001a\u0004\b*\u0010\u0015R\u001a\u0010\u000b\u001a\u00020\b8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010(\u001a\u0004\b+\u0010\u0015"}, d2 = {"Lcom/paypal/oslo/core/pushnotification/domain/notification/NotificationChannel$Custom;", "Lcom/paypal/oslo/core/pushnotification/domain/notification/NotificationChannel;", "", "id", "name", com.paypal.oslo.feature.inappcheckout.domain.util.LoggerParameterKeys.DESCRIPTION, "Lcom/paypal/oslo/core/pushnotification/domain/notification/NotificationImportance;", "importance", "", "enableSound", "enableVibration", "showBadge", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/paypal/oslo/core/pushnotification/domain/notification/NotificationImportance;ZZZ)V", "component1", "()Ljava/lang/String;", "component2", "component3", "component4", "()Lcom/paypal/oslo/core/pushnotification/domain/notification/NotificationImportance;", "component5", "()Z", "component6", "component7", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/paypal/oslo/core/pushnotification/domain/notification/NotificationImportance;ZZZ)Lcom/paypal/oslo/core/pushnotification/domain/notification/NotificationChannel$Custom;", "", "other", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getId", "getName", "getDescription", "Lcom/paypal/oslo/core/pushnotification/domain/notification/NotificationImportance;", "getImportance", "Z", "getEnableSound", "getEnableVibration", "getShowBadge"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class Custom implements com.paypal.oslo.core.pushnotification.domain.notification.NotificationChannel {
        private final java.lang.String description;
        private final boolean enableSound;
        private final boolean enableVibration;
        private final java.lang.String id;
        private final com.paypal.oslo.core.pushnotification.domain.notification.NotificationImportance importance;
        private final java.lang.String name;
        private final boolean showBadge;

        public Custom(java.lang.String str, java.lang.String str2, java.lang.String str3, com.paypal.oslo.core.pushnotification.domain.notification.NotificationImportance notificationImportance, boolean z, boolean z2, boolean z3) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str2, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(notificationImportance, "");
            this.id = str;
            this.name = str2;
            this.description = str3;
            this.importance = notificationImportance;
            this.enableSound = z;
            this.enableVibration = z2;
            this.showBadge = z3;
        }

        public final java.lang.String getId() {
            return this.id;
        }

        public final java.lang.String getName() {
            return this.name;
        }

        public final java.lang.String getDescription() {
            return this.description;
        }

        public /* synthetic */ Custom(java.lang.String str, java.lang.String str2, java.lang.String str3, com.paypal.oslo.core.pushnotification.domain.notification.NotificationImportance notificationImportance, boolean z, boolean z2, boolean z3, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this(str, str2, (i & 4) != 0 ? null : str3, (i & 8) != 0 ? com.paypal.oslo.core.pushnotification.domain.notification.NotificationImportance.DEFAULT : notificationImportance, (i & 16) != 0 ? true : z, (i & 32) != 0 ? true : z2, (i & 64) != 0 ? true : z3);
        }

        public final com.paypal.oslo.core.pushnotification.domain.notification.NotificationImportance getImportance() {
            return this.importance;
        }

        public final boolean getEnableSound() {
            return this.enableSound;
        }

        public final boolean getEnableVibration() {
            return this.enableVibration;
        }

        public final boolean getShowBadge() {
            return this.showBadge;
        }

        public final java.lang.String toString() {
            java.lang.String str = this.id;
            java.lang.String str2 = this.name;
            java.lang.String str3 = this.description;
            com.paypal.oslo.core.pushnotification.domain.notification.NotificationImportance notificationImportance = this.importance;
            boolean z = this.enableSound;
            boolean z2 = this.enableVibration;
            boolean z3 = this.showBadge;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Custom(id=");
            sb.append(str);
            sb.append(", name=");
            sb.append(str2);
            sb.append(", description=");
            sb.append(str3);
            sb.append(", importance=");
            sb.append(notificationImportance);
            sb.append(", enableSound=");
            sb.append(z);
            sb.append(", enableVibration=");
            sb.append(z2);
            sb.append(", showBadge=");
            sb.append(z3);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            int hashCode = this.id.hashCode();
            int hashCode2 = this.name.hashCode();
            java.lang.String str = this.description;
            return (((((((((((hashCode * 31) + hashCode2) * 31) + (str == null ? 0 : str.hashCode())) * 31) + this.importance.hashCode()) * 31) + java.lang.Boolean.hashCode(this.enableSound)) * 31) + java.lang.Boolean.hashCode(this.enableVibration)) * 31) + java.lang.Boolean.hashCode(this.showBadge);
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.core.pushnotification.domain.notification.NotificationChannel.Custom)) {
                return false;
            }
            com.paypal.oslo.core.pushnotification.domain.notification.NotificationChannel.Custom custom = (com.paypal.oslo.core.pushnotification.domain.notification.NotificationChannel.Custom) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.id, custom.id) && kotlin.jvm.internal.Intrinsics.areEqual(this.name, custom.name) && kotlin.jvm.internal.Intrinsics.areEqual(this.description, custom.description) && this.importance == custom.importance && this.enableSound == custom.enableSound && this.enableVibration == custom.enableVibration && this.showBadge == custom.showBadge;
        }

        public final com.paypal.oslo.core.pushnotification.domain.notification.NotificationChannel.Custom copy(java.lang.String id, java.lang.String name2, java.lang.String description, com.paypal.oslo.core.pushnotification.domain.notification.NotificationImportance importance, boolean enableSound, boolean enableVibration, boolean showBadge) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(id, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(name2, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(importance, "");
            return new com.paypal.oslo.core.pushnotification.domain.notification.NotificationChannel.Custom(id, name2, description, importance, enableSound, enableVibration, showBadge);
        }

        /* renamed from: component7, reason: from getter */
        public final boolean getShowBadge() {
            return this.showBadge;
        }

        /* renamed from: component6, reason: from getter */
        public final boolean getEnableVibration() {
            return this.enableVibration;
        }

        /* renamed from: component5, reason: from getter */
        public final boolean getEnableSound() {
            return this.enableSound;
        }

        /* renamed from: component4, reason: from getter */
        public final com.paypal.oslo.core.pushnotification.domain.notification.NotificationImportance getImportance() {
            return this.importance;
        }

        /* renamed from: component3, reason: from getter */
        public final java.lang.String getDescription() {
            return this.description;
        }

        /* renamed from: component2, reason: from getter */
        public final java.lang.String getName() {
            return this.name;
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.String getId() {
            return this.id;
        }

        public static /* synthetic */ com.paypal.oslo.core.pushnotification.domain.notification.NotificationChannel.Custom copy$default(com.paypal.oslo.core.pushnotification.domain.notification.NotificationChannel.Custom custom, java.lang.String str, java.lang.String str2, java.lang.String str3, com.paypal.oslo.core.pushnotification.domain.notification.NotificationImportance notificationImportance, boolean z, boolean z2, boolean z3, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = custom.id;
            }
            if ((i & 2) != 0) {
                str2 = custom.name;
            }
            java.lang.String str4 = str2;
            if ((i & 4) != 0) {
                str3 = custom.description;
            }
            java.lang.String str5 = str3;
            if ((i & 8) != 0) {
                notificationImportance = custom.importance;
            }
            com.paypal.oslo.core.pushnotification.domain.notification.NotificationImportance notificationImportance2 = notificationImportance;
            if ((i & 16) != 0) {
                z = custom.enableSound;
            }
            boolean z4 = z;
            if ((i & 32) != 0) {
                z2 = custom.enableVibration;
            }
            boolean z5 = z2;
            if ((i & 64) != 0) {
                z3 = custom.showBadge;
            }
            return custom.copy(str, str4, str5, notificationImportance2, z4, z5, z3);
        }
    }
}
