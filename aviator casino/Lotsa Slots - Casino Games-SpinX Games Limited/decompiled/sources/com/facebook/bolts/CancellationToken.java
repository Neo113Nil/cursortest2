package com.facebook.bolts;

/* compiled from: CancellationToken.kt */
@kotlin.Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\u0018\u00002\u00020\u0001B\u000f\b\u0000\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0010\u0010\b\u001a\u00020\t2\b\u0010\n\u001a\u0004\u0018\u00010\u000bJ\u0006\u0010\f\u001a\u00020\rJ\b\u0010\u000e\u001a\u00020\u000fH\u0016R\u0011\u0010\u0005\u001a\u00020\u00068F¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0007R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0010"}, d2 = {"Lcom/facebook/bolts/CancellationToken;", "", "tokenSource", "Lcom/facebook/bolts/CancellationTokenSource;", "(Lcom/facebook/bolts/CancellationTokenSource;)V", "isCancellationRequested", "", "()Z", "register", "Lcom/facebook/bolts/CancellationTokenRegistration;", "action", "Ljava/lang/Runnable;", "throwIfCancellationRequested", "", "toString", "", "facebook-bolts_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
/* loaded from: classes2.dex */
public final class CancellationToken {
    private final com.facebook.bolts.CancellationTokenSource tokenSource;

    public CancellationToken(com.facebook.bolts.CancellationTokenSource tokenSource) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(tokenSource, "tokenSource");
        this.tokenSource = tokenSource;
    }

    public final boolean isCancellationRequested() {
        return this.tokenSource.isCancellationRequested();
    }

    public final com.facebook.bolts.CancellationTokenRegistration register(java.lang.Runnable action) {
        return this.tokenSource.register$facebook_bolts_release(action);
    }

    public final void throwIfCancellationRequested() throws java.util.concurrent.CancellationException {
        this.tokenSource.throwIfCancellationRequested$facebook_bolts_release();
    }

    public java.lang.String toString() {
        kotlin.jvm.internal.StringCompanionObject stringCompanionObject = kotlin.jvm.internal.StringCompanionObject.INSTANCE;
        java.lang.String format = java.lang.String.format(java.util.Locale.US, "%s@%s[cancellationRequested=%s]", java.util.Arrays.copyOf(new java.lang.Object[]{getClass().getName(), java.lang.Integer.toHexString(hashCode()), java.lang.Boolean.toString(this.tokenSource.isCancellationRequested())}, 3));
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(format, "java.lang.String.format(locale, format, *args)");
        return format;
    }
}
