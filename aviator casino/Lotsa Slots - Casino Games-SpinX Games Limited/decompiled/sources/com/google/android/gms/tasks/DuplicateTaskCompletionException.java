package com.google.android.gms.tasks;

/* compiled from: com.google.android.gms:play-services-tasks@@18.1.0 */
/* loaded from: classes4.dex */
public final class DuplicateTaskCompletionException extends java.lang.IllegalStateException {
    private DuplicateTaskCompletionException(java.lang.String str, java.lang.Throwable th) {
        super(str, th);
    }

    public static java.lang.IllegalStateException of(com.google.android.gms.tasks.Task<?> task) {
        if (!task.isComplete()) {
            return new java.lang.IllegalStateException("DuplicateTaskCompletionException can only be created from completed Task.");
        }
        java.lang.Exception exception = task.getException();
        return new com.google.android.gms.tasks.DuplicateTaskCompletionException("Complete with: ".concat(exception != null ? com.facebook.login.LoginLogger.EVENT_EXTRAS_FAILURE : task.isSuccessful() ? "result ".concat(java.lang.String.valueOf(java.lang.String.valueOf(task.getResult()))) : task.isCanceled() ? "cancellation" : "unknown issue"), exception);
    }
}
