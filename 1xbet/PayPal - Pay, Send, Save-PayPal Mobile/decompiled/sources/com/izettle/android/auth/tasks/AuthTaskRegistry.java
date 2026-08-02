package com.izettle.android.auth.tasks;

@kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010%\n\u0002\b\u0002\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u001b\u0010\u0007\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u0019\u0010\u000b\u001a\u00020\n2\n\u0010\t\u001a\u0006\u0012\u0002\b\u00030\u0006¢\u0006\u0004\b\u000b\u0010\fJ\u0019\u0010\r\u001a\u00020\n2\n\u0010\t\u001a\u0006\u0012\u0002\b\u00030\u0006¢\u0006\u0004\b\r\u0010\fR$\u0010\u000f\u001a\u0012\u0012\u0004\u0012\u00020\u0004\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00060\u000e8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010"}, d2 = {"Lcom/izettle/android/auth/tasks/AuthTaskRegistry;", "", "<init>", "()V", "", "taskId", "Lcom/izettle/android/auth/tasks/AbstractAuthTask;", "getTask", "(Ljava/lang/String;)Lcom/izettle/android/auth/tasks/AbstractAuthTask;", "task", "", "registerTask", "(Lcom/izettle/android/auth/tasks/AbstractAuthTask;)V", "unregisterTask", "", "tasks", "Ljava/util/Map;"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes9.dex */
public final class AuthTaskRegistry {
    private final java.util.Map<java.lang.String, com.izettle.android.auth.tasks.AbstractAuthTask<?>> tasks = new java.util.LinkedHashMap();

    public final com.izettle.android.auth.tasks.AbstractAuthTask<?> getTask(java.lang.String taskId) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(taskId, "");
        return this.tasks.get(taskId);
    }

    public final void registerTask(com.izettle.android.auth.tasks.AbstractAuthTask<?> task) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(task, "");
        this.tasks.put(task.getTaskId(), task);
    }

    public final void unregisterTask(com.izettle.android.auth.tasks.AbstractAuthTask<?> task) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(task, "");
        this.tasks.remove(task.getTaskId());
    }
}
