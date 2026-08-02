package com.paypal.android.threeds.data.model;

@kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\b\u000f\n\u0002\u0010\b\n\u0002\b\n\b\u0086\b\u0018\u00002\u00020\u0001B3\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u0012\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00040\u0007¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\r\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u000f\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u000f\u0010\u000eJ\u001c\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00040\u0007HÆ\u0003¢\u0006\u0004\b\u0010\u0010\u0011JD\u0010\u0012\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00042\u0014\b\u0002\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00040\u0007HÆ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u001a\u0010\u0015\u001a\u00020\u00022\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0018\u001a\u00020\u0017HÖ\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001a\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u001a\u0010\u000eR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u001b\u001a\u0004\b\u001c\u0010\fR\u001a\u0010\u0005\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u001d\u001a\u0004\b\u001e\u0010\u000eR\u001a\u0010\u0006\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u001d\u001a\u0004\b\u001f\u0010\u000eR&\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00040\u00078\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010 \u001a\u0004\b!\u0010\u0011"}, d2 = {"Lcom/paypal/android/threeds/data/model/MessageExtension;", "", "", "criticalityIndicator", "", "id", "name", "", com.google.firebase.messaging.Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "<init>", "(ZLjava/lang/String;Ljava/lang/String;Ljava/util/Map;)V", "component1", "()Z", "component2", "()Ljava/lang/String;", "component3", "component4", "()Ljava/util/Map;", "copy", "(ZLjava/lang/String;Ljava/lang/String;Ljava/util/Map;)Lcom/paypal/android/threeds/data/model/MessageExtension;", "other", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Z", "getCriticalityIndicator", "Ljava/lang/String;", "getId", "getName", "Ljava/util/Map;", "getData"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class MessageExtension {
    public static final int $stable = 8;
    public boolean criticalityIndicator;
    public java.util.Map<java.lang.String, java.lang.String> data;
    public java.lang.String id;
    public java.lang.String name;

    public MessageExtension(boolean z, java.lang.String str, java.lang.String str2, java.util.Map<java.lang.String, java.lang.String> map) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str2, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(map, "");
        this.criticalityIndicator = z;
        this.id = str;
        this.name = str2;
        this.data = map;
    }

    public final boolean getCriticalityIndicator() {
        return this.criticalityIndicator;
    }

    public final java.lang.String getId() {
        return this.id;
    }

    public final java.lang.String getName() {
        return this.name;
    }

    public final java.util.Map<java.lang.String, java.lang.String> getData() {
        return this.data;
    }

    public /* synthetic */ MessageExtension() {
    }

    public final java.lang.String toString() {
        boolean z = this.criticalityIndicator;
        java.lang.String str = this.id;
        java.lang.String str2 = this.name;
        java.util.Map<java.lang.String, java.lang.String> map = this.data;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("MessageExtension(criticalityIndicator=");
        sb.append(z);
        sb.append(", id=");
        sb.append(str);
        sb.append(", name=");
        sb.append(str2);
        sb.append(", data=");
        sb.append(map);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        return (((((java.lang.Boolean.hashCode(this.criticalityIndicator) * 31) + this.id.hashCode()) * 31) + this.name.hashCode()) * 31) + this.data.hashCode();
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.paypal.android.threeds.data.model.MessageExtension)) {
            return false;
        }
        com.paypal.android.threeds.data.model.MessageExtension messageExtension = (com.paypal.android.threeds.data.model.MessageExtension) other;
        return this.criticalityIndicator == messageExtension.criticalityIndicator && kotlin.jvm.internal.Intrinsics.areEqual(this.id, messageExtension.id) && kotlin.jvm.internal.Intrinsics.areEqual(this.name, messageExtension.name) && kotlin.jvm.internal.Intrinsics.areEqual(this.data, messageExtension.data);
    }

    public final com.paypal.android.threeds.data.model.MessageExtension copy(boolean criticalityIndicator, java.lang.String id, java.lang.String name2, java.util.Map<java.lang.String, java.lang.String> data) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(id, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(name2, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(data, "");
        return new com.paypal.android.threeds.data.model.MessageExtension(criticalityIndicator, id, name2, data);
    }

    public final java.util.Map<java.lang.String, java.lang.String> component4() {
        return this.data;
    }

    /* renamed from: component3, reason: from getter */
    public final java.lang.String getName() {
        return this.name;
    }

    /* renamed from: component2, reason: from getter */
    public final java.lang.String getId() {
        return this.id;
    }

    /* renamed from: component1, reason: from getter */
    public final boolean getCriticalityIndicator() {
        return this.criticalityIndicator;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ com.paypal.android.threeds.data.model.MessageExtension copy$default(com.paypal.android.threeds.data.model.MessageExtension messageExtension, boolean z, java.lang.String str, java.lang.String str2, java.util.Map map, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            z = messageExtension.criticalityIndicator;
        }
        if ((i & 2) != 0) {
            str = messageExtension.id;
        }
        if ((i & 4) != 0) {
            str2 = messageExtension.name;
        }
        if ((i & 8) != 0) {
            map = messageExtension.data;
        }
        return messageExtension.copy(z, str, str2, map);
    }
}
