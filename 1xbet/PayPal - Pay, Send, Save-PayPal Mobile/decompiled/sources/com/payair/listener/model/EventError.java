package com.payair.listener.model;

@kotlin.Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\u0007\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\t\u0010\bJ$\u0010\n\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\f\u0010\bJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\bR\u001a\u0010\u0004\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0017\u0010\u0015\u001a\u0004\b\u0018\u0010\b"}, d2 = {"Lcom/payair/listener/model/EventError;", "", "", "errorCode", "errorMessage", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "component2", "copy", "(Ljava/lang/String;Ljava/lang/String;)Lcom/payair/listener/model/EventError;", "toString", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "getErrorCode", util.h.xy.cb.b.f1091, "getErrorMessage"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class EventError {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    public final java.lang.String errorCode;

    /* renamed from: b, reason: from kotlin metadata */
    public final java.lang.String errorMessage;

    public EventError(java.lang.String str, java.lang.String str2) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str2, "");
        this.errorCode = str;
        this.errorMessage = str2;
    }

    public final java.lang.String getErrorCode() {
        return this.errorCode;
    }

    public final java.lang.String getErrorMessage() {
        return this.errorMessage;
    }

    public final java.lang.String toString() {
        java.lang.String str = this.errorCode;
        java.lang.String str2 = this.errorMessage;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("EventError(errorCode=");
        sb.append(str);
        sb.append(", errorMessage=");
        sb.append(str2);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        return this.errorMessage.hashCode() + (this.errorCode.hashCode() * 31);
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.payair.listener.model.EventError)) {
            return false;
        }
        com.payair.listener.model.EventError eventError = (com.payair.listener.model.EventError) other;
        return kotlin.jvm.internal.Intrinsics.areEqual(this.errorCode, eventError.errorCode) && kotlin.jvm.internal.Intrinsics.areEqual(this.errorMessage, eventError.errorMessage);
    }

    public final com.payair.listener.model.EventError copy(java.lang.String errorCode, java.lang.String errorMessage) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(errorCode, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(errorMessage, "");
        return new com.payair.listener.model.EventError(errorCode, errorMessage);
    }

    /* renamed from: component2, reason: from getter */
    public final java.lang.String getErrorMessage() {
        return this.errorMessage;
    }

    /* renamed from: component1, reason: from getter */
    public final java.lang.String getErrorCode() {
        return this.errorCode;
    }

    public static /* synthetic */ com.payair.listener.model.EventError copy$default(com.payair.listener.model.EventError eventError, java.lang.String str, java.lang.String str2, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            str = eventError.errorCode;
        }
        if ((i & 2) != 0) {
            str2 = eventError.errorMessage;
        }
        return eventError.copy(str, str2);
    }
}
