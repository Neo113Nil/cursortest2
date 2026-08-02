package com.paypal.android.taptopay.data.thales.fcm.model;

@kotlin.Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000e\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\n\b\u0086\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\b\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\r\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u000f\u001a\u00020\u0006HÆ\u0003¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0011\u001a\u00020\u0006HÆ\u0003¢\u0006\u0004\b\u0011\u0010\u0010J8\u0010\u0012\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\b\u001a\u00020\u0006HÆ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u001a\u0010\u0016\u001a\u00020\u00152\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0019\u001a\u00020\u0018HÖ\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001b\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u001b\u0010\u0010R\u0017\u0010\u0007\u001a\u00020\u00068\u0007¢\u0006\f\n\u0004\b\u0007\u0010\u001c\u001a\u0004\b\u001d\u0010\u0010R\u001a\u0010\u0003\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u001e\u001a\u0004\b\u001f\u0010\fR\u001a\u0010\b\u001a\u00020\u00068\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\u001c\u001a\u0004\b \u0010\u0010R\u001a\u0010\u0005\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010!\u001a\u0004\b\"\u0010\u000e"}, d2 = {"Lcom/paypal/android/taptopay/data/thales/fcm/model/PushNotification;", "", "Landroid/os/Bundle;", com.google.firebase.messaging.Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "Lcom/paypal/android/taptopay/data/thales/fcm/model/PushSender;", "sender", "", "action", "digitalCardId", "<init>", "(Landroid/os/Bundle;Lcom/paypal/android/taptopay/data/thales/fcm/model/PushSender;Ljava/lang/String;Ljava/lang/String;)V", "component1", "()Landroid/os/Bundle;", "component2", "()Lcom/paypal/android/taptopay/data/thales/fcm/model/PushSender;", "component3", "()Ljava/lang/String;", "component4", "copy", "(Landroid/os/Bundle;Lcom/paypal/android/taptopay/data/thales/fcm/model/PushSender;Ljava/lang/String;Ljava/lang/String;)Lcom/paypal/android/taptopay/data/thales/fcm/model/PushNotification;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getAction", "Landroid/os/Bundle;", "getData", "getDigitalCardId", "Lcom/paypal/android/taptopay/data/thales/fcm/model/PushSender;", "getSender"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class PushNotification {
    private final java.lang.String action;
    private final android.os.Bundle data;
    private final java.lang.String digitalCardId;
    private final com.paypal.android.taptopay.data.thales.fcm.model.PushSender sender;

    public PushNotification(android.os.Bundle bundle, com.paypal.android.taptopay.data.thales.fcm.model.PushSender pushSender, java.lang.String str, java.lang.String str2) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(bundle, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(pushSender, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str2, "");
        this.data = bundle;
        this.sender = pushSender;
        this.action = str;
        this.digitalCardId = str2;
    }

    public final android.os.Bundle getData() {
        return this.data;
    }

    public final com.paypal.android.taptopay.data.thales.fcm.model.PushSender getSender() {
        return this.sender;
    }

    public final java.lang.String getAction() {
        return this.action;
    }

    public final java.lang.String getDigitalCardId() {
        return this.digitalCardId;
    }

    public final java.lang.String toString() {
        android.os.Bundle bundle = this.data;
        com.paypal.android.taptopay.data.thales.fcm.model.PushSender pushSender = this.sender;
        java.lang.String str = this.action;
        java.lang.String str2 = this.digitalCardId;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("PushNotification(data=");
        sb.append(bundle);
        sb.append(", sender=");
        sb.append(pushSender);
        sb.append(", action=");
        sb.append(str);
        sb.append(", digitalCardId=");
        sb.append(str2);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        return (((((this.data.hashCode() * 31) + this.sender.hashCode()) * 31) + this.action.hashCode()) * 31) + this.digitalCardId.hashCode();
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.paypal.android.taptopay.data.thales.fcm.model.PushNotification)) {
            return false;
        }
        com.paypal.android.taptopay.data.thales.fcm.model.PushNotification pushNotification = (com.paypal.android.taptopay.data.thales.fcm.model.PushNotification) other;
        return kotlin.jvm.internal.Intrinsics.areEqual(this.data, pushNotification.data) && this.sender == pushNotification.sender && kotlin.jvm.internal.Intrinsics.areEqual(this.action, pushNotification.action) && kotlin.jvm.internal.Intrinsics.areEqual(this.digitalCardId, pushNotification.digitalCardId);
    }

    public final com.paypal.android.taptopay.data.thales.fcm.model.PushNotification copy(android.os.Bundle data, com.paypal.android.taptopay.data.thales.fcm.model.PushSender sender, java.lang.String action, java.lang.String digitalCardId) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(data, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(sender, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(action, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(digitalCardId, "");
        return new com.paypal.android.taptopay.data.thales.fcm.model.PushNotification(data, sender, action, digitalCardId);
    }

    /* renamed from: component4, reason: from getter */
    public final java.lang.String getDigitalCardId() {
        return this.digitalCardId;
    }

    /* renamed from: component3, reason: from getter */
    public final java.lang.String getAction() {
        return this.action;
    }

    /* renamed from: component2, reason: from getter */
    public final com.paypal.android.taptopay.data.thales.fcm.model.PushSender getSender() {
        return this.sender;
    }

    /* renamed from: component1, reason: from getter */
    public final android.os.Bundle getData() {
        return this.data;
    }

    public static /* synthetic */ com.paypal.android.taptopay.data.thales.fcm.model.PushNotification copy$default(com.paypal.android.taptopay.data.thales.fcm.model.PushNotification pushNotification, android.os.Bundle bundle, com.paypal.android.taptopay.data.thales.fcm.model.PushSender pushSender, java.lang.String str, java.lang.String str2, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            bundle = pushNotification.data;
        }
        if ((i & 2) != 0) {
            pushSender = pushNotification.sender;
        }
        if ((i & 4) != 0) {
            str = pushNotification.action;
        }
        if ((i & 8) != 0) {
            str2 = pushNotification.digitalCardId;
        }
        return pushNotification.copy(bundle, pushSender, str, str2);
    }
}
