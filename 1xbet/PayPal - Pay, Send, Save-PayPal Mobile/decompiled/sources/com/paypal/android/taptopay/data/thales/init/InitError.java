package com.paypal.android.taptopay.data.thales.init;

@kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0003\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\b\u0086\b\u0018\u00002\u00020\u0001B\u001b\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0012\u0010\n\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ&\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0015\u0010\tR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0016\u001a\u0004\b\u0017\u0010\tR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0018\u001a\u0004\b\u0019\u0010\u000b"}, d2 = {"Lcom/paypal/android/taptopay/data/thales/init/InitError;", "", "", "debugMessage", "", com.datadog.android.rum.internal.RumFeature.EVENT_THROWABLE_PROPERTY, "<init>", "(Ljava/lang/String;Ljava/lang/Throwable;)V", "component1", "()Ljava/lang/String;", "component2", "()Ljava/lang/Throwable;", "copy", "(Ljava/lang/String;Ljava/lang/Throwable;)Lcom/paypal/android/taptopay/data/thales/init/InitError;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getDebugMessage", "Ljava/lang/Throwable;", "getThrowable"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final /* data */ class InitError {
    private final java.lang.String debugMessage;
    private final java.lang.Throwable throwable;

    public InitError(java.lang.String str, java.lang.Throwable th) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        this.debugMessage = str;
        this.throwable = th;
    }

    public /* synthetic */ InitError(java.lang.String str, java.lang.Throwable th, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i & 2) != 0 ? null : th);
    }

    public final java.lang.String getDebugMessage() {
        return this.debugMessage;
    }

    public final java.lang.Throwable getThrowable() {
        return this.throwable;
    }

    public final java.lang.String toString() {
        java.lang.String str = this.debugMessage;
        java.lang.Throwable th = this.throwable;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("InitError(debugMessage=");
        sb.append(str);
        sb.append(", throwable=");
        sb.append(th);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        int hashCode = this.debugMessage.hashCode();
        java.lang.Throwable th = this.throwable;
        return (hashCode * 31) + (th == null ? 0 : th.hashCode());
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.paypal.android.taptopay.data.thales.init.InitError)) {
            return false;
        }
        com.paypal.android.taptopay.data.thales.init.InitError initError = (com.paypal.android.taptopay.data.thales.init.InitError) other;
        return kotlin.jvm.internal.Intrinsics.areEqual(this.debugMessage, initError.debugMessage) && kotlin.jvm.internal.Intrinsics.areEqual(this.throwable, initError.throwable);
    }

    public final com.paypal.android.taptopay.data.thales.init.InitError copy(java.lang.String debugMessage, java.lang.Throwable throwable) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(debugMessage, "");
        return new com.paypal.android.taptopay.data.thales.init.InitError(debugMessage, throwable);
    }

    /* renamed from: component2, reason: from getter */
    public final java.lang.Throwable getThrowable() {
        return this.throwable;
    }

    /* renamed from: component1, reason: from getter */
    public final java.lang.String getDebugMessage() {
        return this.debugMessage;
    }

    public static /* synthetic */ com.paypal.android.taptopay.data.thales.init.InitError copy$default(com.paypal.android.taptopay.data.thales.init.InitError initError, java.lang.String str, java.lang.Throwable th, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            str = initError.debugMessage;
        }
        if ((i & 2) != 0) {
            th = initError.throwable;
        }
        return initError.copy(str, th);
    }
}
