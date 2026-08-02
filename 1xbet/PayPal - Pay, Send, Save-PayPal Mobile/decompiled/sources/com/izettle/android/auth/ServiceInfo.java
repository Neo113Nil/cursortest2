package com.izettle.android.auth;

@kotlin.Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0080\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\u0007\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0001HÆ\u0003¢\u0006\u0004\b\t\u0010\nJ$\u0010\u000b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u0001HÆ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0011\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0011\u0010\bJ\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0015\u001a\u0004\b\u0016\u0010\bR\u001a\u0010\u0004\u001a\u00020\u00018\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0017\u001a\u0004\b\u0018\u0010\n"}, d2 = {"Lcom/izettle/android/auth/ServiceInfo;", "", "", "priority", "service", "<init>", "(ILjava/lang/Object;)V", "component1", "()I", "component2", "()Ljava/lang/Object;", "copy", "(ILjava/lang/Object;)Lcom/izettle/android/auth/ServiceInfo;", "other", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "", "toString", "()Ljava/lang/String;", com.visa.cbp.getEncExpo.warmup, "getPriority", "Ljava/lang/Object;", "getService"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final /* data */ class ServiceInfo {
    private final int priority;
    private final java.lang.Object service;

    public ServiceInfo(int i, java.lang.Object obj) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(obj, "");
        this.priority = i;
        this.service = obj;
    }

    public final int getPriority() {
        return this.priority;
    }

    public final java.lang.Object getService() {
        return this.service;
    }

    public final java.lang.String toString() {
        int i = this.priority;
        java.lang.Object obj = this.service;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("ServiceInfo(priority=");
        sb.append(i);
        sb.append(", service=");
        sb.append(obj);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        return (java.lang.Integer.hashCode(this.priority) * 31) + this.service.hashCode();
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.izettle.android.auth.ServiceInfo)) {
            return false;
        }
        com.izettle.android.auth.ServiceInfo serviceInfo = (com.izettle.android.auth.ServiceInfo) other;
        return this.priority == serviceInfo.priority && kotlin.jvm.internal.Intrinsics.areEqual(this.service, serviceInfo.service);
    }

    public final com.izettle.android.auth.ServiceInfo copy(int priority, java.lang.Object service) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(service, "");
        return new com.izettle.android.auth.ServiceInfo(priority, service);
    }

    /* renamed from: component2, reason: from getter */
    public final java.lang.Object getService() {
        return this.service;
    }

    /* renamed from: component1, reason: from getter */
    public final int getPriority() {
        return this.priority;
    }

    public static /* synthetic */ com.izettle.android.auth.ServiceInfo copy$default(com.izettle.android.auth.ServiceInfo serviceInfo, int i, java.lang.Object obj, int i2, java.lang.Object obj2) {
        if ((i2 & 1) != 0) {
            i = serviceInfo.priority;
        }
        if ((i2 & 2) != 0) {
            obj = serviceInfo.service;
        }
        return serviceInfo.copy(i, obj);
    }
}
