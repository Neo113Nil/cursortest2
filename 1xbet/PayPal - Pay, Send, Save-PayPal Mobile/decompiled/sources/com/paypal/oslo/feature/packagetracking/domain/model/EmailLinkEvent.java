package com.paypal.oslo.feature.packagetracking.domain.model;

@kotlin.Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000e\n\u0002\u0010\b\n\u0002\b\t\b\u0086\b\u0018\u00002\u00020\u0001B#\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ\u0012\u0010\f\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0012\u0010\u000e\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ2\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006HÆ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0013\u001a\u00020\u00042\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0016\u001a\u00020\u0015HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0018\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0018\u0010\u000fR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0019\u001a\u0004\b\u001a\u0010\u000bR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u001b\u001a\u0004\b\u001c\u0010\rR\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u001d\u001a\u0004\b\u001e\u0010\u000f"}, d2 = {"Lcom/paypal/oslo/feature/packagetracking/domain/model/EmailLinkEvent;", "", "Lcom/paypal/oslo/feature/packagetracking/domain/model/EmailLinkEventType;", "type", "", "hasActiveReminder", "", "reminderDateMessage", "<init>", "(Lcom/paypal/oslo/feature/packagetracking/domain/model/EmailLinkEventType;Ljava/lang/Boolean;Ljava/lang/String;)V", "component1", "()Lcom/paypal/oslo/feature/packagetracking/domain/model/EmailLinkEventType;", "component2", "()Ljava/lang/Boolean;", "component3", "()Ljava/lang/String;", "copy", "(Lcom/paypal/oslo/feature/packagetracking/domain/model/EmailLinkEventType;Ljava/lang/Boolean;Ljava/lang/String;)Lcom/paypal/oslo/feature/packagetracking/domain/model/EmailLinkEvent;", "other", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Lcom/paypal/oslo/feature/packagetracking/domain/model/EmailLinkEventType;", "getType", "Ljava/lang/Boolean;", "getHasActiveReminder", "Ljava/lang/String;", "getReminderDateMessage"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes13.dex */
public final /* data */ class EmailLinkEvent {
    public static final int $stable = 0;
    private final java.lang.Boolean hasActiveReminder;
    private final java.lang.String reminderDateMessage;
    private final com.paypal.oslo.feature.packagetracking.domain.model.EmailLinkEventType type;

    public EmailLinkEvent(com.paypal.oslo.feature.packagetracking.domain.model.EmailLinkEventType emailLinkEventType, java.lang.Boolean bool, java.lang.String str) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(emailLinkEventType, "");
        this.type = emailLinkEventType;
        this.hasActiveReminder = bool;
        this.reminderDateMessage = str;
    }

    public final com.paypal.oslo.feature.packagetracking.domain.model.EmailLinkEventType getType() {
        return this.type;
    }

    public final java.lang.Boolean getHasActiveReminder() {
        return this.hasActiveReminder;
    }

    public final java.lang.String getReminderDateMessage() {
        return this.reminderDateMessage;
    }

    public final java.lang.String toString() {
        com.paypal.oslo.feature.packagetracking.domain.model.EmailLinkEventType emailLinkEventType = this.type;
        java.lang.Boolean bool = this.hasActiveReminder;
        java.lang.String str = this.reminderDateMessage;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("EmailLinkEvent(type=");
        sb.append(emailLinkEventType);
        sb.append(", hasActiveReminder=");
        sb.append(bool);
        sb.append(", reminderDateMessage=");
        sb.append(str);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        int hashCode = this.type.hashCode();
        java.lang.Boolean bool = this.hasActiveReminder;
        int hashCode2 = bool == null ? 0 : bool.hashCode();
        java.lang.String str = this.reminderDateMessage;
        return (((hashCode * 31) + hashCode2) * 31) + (str != null ? str.hashCode() : 0);
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.paypal.oslo.feature.packagetracking.domain.model.EmailLinkEvent)) {
            return false;
        }
        com.paypal.oslo.feature.packagetracking.domain.model.EmailLinkEvent emailLinkEvent = (com.paypal.oslo.feature.packagetracking.domain.model.EmailLinkEvent) other;
        return this.type == emailLinkEvent.type && kotlin.jvm.internal.Intrinsics.areEqual(this.hasActiveReminder, emailLinkEvent.hasActiveReminder) && kotlin.jvm.internal.Intrinsics.areEqual(this.reminderDateMessage, emailLinkEvent.reminderDateMessage);
    }

    public final com.paypal.oslo.feature.packagetracking.domain.model.EmailLinkEvent copy(com.paypal.oslo.feature.packagetracking.domain.model.EmailLinkEventType type, java.lang.Boolean hasActiveReminder, java.lang.String reminderDateMessage) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(type, "");
        return new com.paypal.oslo.feature.packagetracking.domain.model.EmailLinkEvent(type, hasActiveReminder, reminderDateMessage);
    }

    /* renamed from: component3, reason: from getter */
    public final java.lang.String getReminderDateMessage() {
        return this.reminderDateMessage;
    }

    /* renamed from: component2, reason: from getter */
    public final java.lang.Boolean getHasActiveReminder() {
        return this.hasActiveReminder;
    }

    /* renamed from: component1, reason: from getter */
    public final com.paypal.oslo.feature.packagetracking.domain.model.EmailLinkEventType getType() {
        return this.type;
    }

    public static /* synthetic */ com.paypal.oslo.feature.packagetracking.domain.model.EmailLinkEvent copy$default(com.paypal.oslo.feature.packagetracking.domain.model.EmailLinkEvent emailLinkEvent, com.paypal.oslo.feature.packagetracking.domain.model.EmailLinkEventType emailLinkEventType, java.lang.Boolean bool, java.lang.String str, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            emailLinkEventType = emailLinkEvent.type;
        }
        if ((i & 2) != 0) {
            bool = emailLinkEvent.hasActiveReminder;
        }
        if ((i & 4) != 0) {
            str = emailLinkEvent.reminderDateMessage;
        }
        return emailLinkEvent.copy(emailLinkEventType, bool, str);
    }
}
