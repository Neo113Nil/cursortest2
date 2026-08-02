package com.izettle.android.auth.tasks;

@kotlin.Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\f\u0018\u00002\u00020\u0001B3\u0012\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u000e\u0010\n\u001a\n\u0012\u0006\b\u0001\u0012\u00020\t0\b¢\u0006\u0004\b\u000b\u0010\fR\"\u0010\n\u001a\n\u0012\u0006\b\u0001\u0012\u00020\t0\b8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010\r\u001a\u0004\b\u000e\u0010\u000fR&\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012R\u001a\u0010\u0007\u001a\u00020\u00068\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015"}, d2 = {"Lcom/izettle/android/auth/tasks/RestoredAuthTaskResultInfo;", "", "Lcom/izettle/android/core/data/result/Result;", "Lcom/izettle/android/auth/model/AuthData;", "", "result", "Lcom/izettle/android/auth/tasks/AuthTaskType;", "type", "Ljava/lang/Class;", "Landroid/app/Activity;", "callingActivityClass", "<init>", "(Lcom/izettle/android/core/data/result/Result;Lcom/izettle/android/auth/tasks/AuthTaskType;Ljava/lang/Class;)V", "Ljava/lang/Class;", "getCallingActivityClass", "()Ljava/lang/Class;", "Lcom/izettle/android/core/data/result/Result;", "getResult", "()Lcom/izettle/android/core/data/result/Result;", "Lcom/izettle/android/auth/tasks/AuthTaskType;", "getType", "()Lcom/izettle/android/auth/tasks/AuthTaskType;"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final class RestoredAuthTaskResultInfo {
    private final java.lang.Class<? extends android.app.Activity> callingActivityClass;
    private final com.izettle.android.core.data.result.Result<com.izettle.android.auth.model.AuthData, java.lang.Throwable> result;
    private final com.izettle.android.auth.tasks.AuthTaskType type;

    /* JADX WARN: Multi-variable type inference failed */
    public RestoredAuthTaskResultInfo(com.izettle.android.core.data.result.Result<com.izettle.android.auth.model.AuthData, ? extends java.lang.Throwable> result, com.izettle.android.auth.tasks.AuthTaskType authTaskType, java.lang.Class<? extends android.app.Activity> cls) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(result, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(authTaskType, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(cls, "");
        this.result = result;
        this.type = authTaskType;
        this.callingActivityClass = cls;
    }

    public final com.izettle.android.core.data.result.Result<com.izettle.android.auth.model.AuthData, java.lang.Throwable> getResult() {
        return this.result;
    }

    public final com.izettle.android.auth.tasks.AuthTaskType getType() {
        return this.type;
    }

    public final java.lang.Class<? extends android.app.Activity> getCallingActivityClass() {
        return this.callingActivityClass;
    }
}
