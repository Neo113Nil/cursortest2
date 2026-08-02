package com.zettle.sdk.features;

@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u0011\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001c\u0010\u0002\u001a\u0004\u0018\u00010\u00018\u0017X\u0096\u0004¢\u0006\f\n\u0004\b\u0002\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007"}, d2 = {"Lcom/zettle/sdk/features/ActionValidationError;", "", "cause", "<init>", "(Ljava/lang/Throwable;)V", "Ljava/lang/Throwable;", "getCause", "()Ljava/lang/Throwable;"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes17.dex */
public final class ActionValidationError extends java.lang.Throwable {
    private final java.lang.Throwable cause;

    @Override // java.lang.Throwable
    public final java.lang.Throwable getCause() {
        return this.cause;
    }

    public ActionValidationError(java.lang.Throwable th) {
        super("Error validating", th);
        this.cause = th;
    }
}
