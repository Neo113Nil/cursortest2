package com.paypal.oslo.feature.settings.domain.model;

@kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\b6\u0018\u00002\u00020\u0001:\u0003\u0004\u0005\u0006B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0003\u0007\b\t"}, d2 = {"Lcom/paypal/oslo/feature/settings/domain/model/SettingsItemStatus;", "", "<init>", "()V", "Badge", "Toggle", "Action", "Lcom/paypal/oslo/feature/settings/domain/model/SettingsItemStatus$Action;", "Lcom/paypal/oslo/feature/settings/domain/model/SettingsItemStatus$Badge;", "Lcom/paypal/oslo/feature/settings/domain/model/SettingsItemStatus$Toggle;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes14.dex */
public abstract class SettingsItemStatus {
    public static final int $stable = 0;

    @kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0015\u001a\u0004\b\u0016\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/settings/domain/model/SettingsItemStatus$Badge;", "Lcom/paypal/oslo/feature/settings/domain/model/SettingsItemStatus;", "Lcom/paypal/oslo/feature/settings/domain/model/BadgeType;", "type", "<init>", "(Lcom/paypal/oslo/feature/settings/domain/model/BadgeType;)V", "component1", "()Lcom/paypal/oslo/feature/settings/domain/model/BadgeType;", "copy", "(Lcom/paypal/oslo/feature/settings/domain/model/BadgeType;)Lcom/paypal/oslo/feature/settings/domain/model/SettingsItemStatus$Badge;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lcom/paypal/oslo/feature/settings/domain/model/BadgeType;", "getType"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class Badge extends com.paypal.oslo.feature.settings.domain.model.SettingsItemStatus {
        public static final int $stable = 0;
        private final com.paypal.oslo.feature.settings.domain.model.BadgeType type;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Badge(com.paypal.oslo.feature.settings.domain.model.BadgeType badgeType) {
            super(null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(badgeType, "");
            this.type = badgeType;
        }

        public final com.paypal.oslo.feature.settings.domain.model.BadgeType getType() {
            return this.type;
        }

        public final java.lang.String toString() {
            com.paypal.oslo.feature.settings.domain.model.BadgeType badgeType = this.type;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Badge(type=");
            sb.append(badgeType);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return this.type.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof com.paypal.oslo.feature.settings.domain.model.SettingsItemStatus.Badge) && this.type == ((com.paypal.oslo.feature.settings.domain.model.SettingsItemStatus.Badge) other).type;
        }

        public final com.paypal.oslo.feature.settings.domain.model.SettingsItemStatus.Badge copy(com.paypal.oslo.feature.settings.domain.model.BadgeType type) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(type, "");
            return new com.paypal.oslo.feature.settings.domain.model.SettingsItemStatus.Badge(type);
        }

        /* renamed from: component1, reason: from getter */
        public final com.paypal.oslo.feature.settings.domain.model.BadgeType getType() {
            return this.type;
        }

        public static /* synthetic */ com.paypal.oslo.feature.settings.domain.model.SettingsItemStatus.Badge copy$default(com.paypal.oslo.feature.settings.domain.model.SettingsItemStatus.Badge badge, com.paypal.oslo.feature.settings.domain.model.BadgeType badgeType, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                badgeType = badge.type;
            }
            return badge.copy(badgeType);
        }
    }

    private SettingsItemStatus() {
    }

    @kotlin.Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\f\u001a\u00020\u00022\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0014\u001a\u0004\b\u0015\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/settings/domain/model/SettingsItemStatus$Toggle;", "Lcom/paypal/oslo/feature/settings/domain/model/SettingsItemStatus;", "", "enabled", "<init>", "(Z)V", "component1", "()Z", "copy", "(Z)Lcom/paypal/oslo/feature/settings/domain/model/SettingsItemStatus$Toggle;", "", "other", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Z", "getEnabled"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class Toggle extends com.paypal.oslo.feature.settings.domain.model.SettingsItemStatus {
        public static final int $stable = 0;
        private final boolean enabled;

        public Toggle(boolean z) {
            super(null);
            this.enabled = z;
        }

        public final boolean getEnabled() {
            return this.enabled;
        }

        public final java.lang.String toString() {
            boolean z = this.enabled;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Toggle(enabled=");
            sb.append(z);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return java.lang.Boolean.hashCode(this.enabled);
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof com.paypal.oslo.feature.settings.domain.model.SettingsItemStatus.Toggle) && this.enabled == ((com.paypal.oslo.feature.settings.domain.model.SettingsItemStatus.Toggle) other).enabled;
        }

        public final com.paypal.oslo.feature.settings.domain.model.SettingsItemStatus.Toggle copy(boolean enabled) {
            return new com.paypal.oslo.feature.settings.domain.model.SettingsItemStatus.Toggle(enabled);
        }

        /* renamed from: component1, reason: from getter */
        public final boolean getEnabled() {
            return this.enabled;
        }

        public static /* synthetic */ com.paypal.oslo.feature.settings.domain.model.SettingsItemStatus.Toggle copy$default(com.paypal.oslo.feature.settings.domain.model.SettingsItemStatus.Toggle toggle, boolean z, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                z = toggle.enabled;
            }
            return toggle.copy(z);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/paypal/oslo/feature/settings/domain/model/SettingsItemStatus$Action;", "Lcom/paypal/oslo/feature/settings/domain/model/SettingsItemStatus;", "<init>", "()V"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Action extends com.paypal.oslo.feature.settings.domain.model.SettingsItemStatus {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.settings.domain.model.SettingsItemStatus.Action INSTANCE = new com.paypal.oslo.feature.settings.domain.model.SettingsItemStatus.Action();

        private Action() {
            super(null);
        }
    }

    public /* synthetic */ SettingsItemStatus(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }
}
