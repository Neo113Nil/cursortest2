package com.izettle.android.auth.tasks;

@kotlin.Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\b\u0000\u0018\u00002\u00020\u0001B9\u0012\b\b\u0001\u0010\u0003\u001a\u00020\u0002\u0012\u0014\b\u0001\u0010\u0006\u001a\u000e\u0012\n\b\u0001\u0012\u0006\u0012\u0002\b\u00030\u00050\u0004\u0012\u0010\b\u0001\u0010\b\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00070\u0004¢\u0006\u0004\b\t\u0010\nR\"\u0010\b\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00070\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\u000b\u001a\u0004\b\f\u0010\rR\u001a\u0010\u0003\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R&\u0010\u0006\u001a\u000e\u0012\n\b\u0001\u0012\u0006\u0012\u0002\b\u00030\u00050\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u000b\u001a\u0004\b\u0011\u0010\r"}, d2 = {"Lcom/izettle/android/auth/tasks/OAuthState;", "", "", "taskId", "Lkotlin/reflect/KClass;", "Lcom/izettle/android/auth/tasks/AbstractAuthTask;", "taskType", "Landroid/app/Activity;", "callingActivityClass", "<init>", "(Ljava/lang/String;Lkotlin/reflect/KClass;Lkotlin/reflect/KClass;)V", "Lkotlin/reflect/KClass;", "getCallingActivityClass", "()Lkotlin/reflect/KClass;", "Ljava/lang/String;", "getTaskId", "()Ljava/lang/String;", "getTaskType"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes9.dex */
public final class OAuthState {

    @com.izettle.android.serialization.annotations.JsonSerialize("callingActivityClass")
    private final kotlin.reflect.KClass<? extends android.app.Activity> callingActivityClass;

    @com.izettle.android.serialization.annotations.JsonSerialize("taskId")
    private final java.lang.String taskId;

    @com.izettle.android.serialization.annotations.JsonSerialize("taskType")
    private final kotlin.reflect.KClass<? extends com.izettle.android.auth.tasks.AbstractAuthTask<?>> taskType;

    public OAuthState(@com.izettle.android.serialization.annotations.JsonDeserialize("taskId") java.lang.String str, @com.izettle.android.serialization.annotations.JsonDeserialize("taskType") kotlin.reflect.KClass<? extends com.izettle.android.auth.tasks.AbstractAuthTask<?>> kClass, @com.izettle.android.serialization.annotations.JsonDeserialize("callingActivityClass") kotlin.reflect.KClass<? extends android.app.Activity> kClass2) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(kClass, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(kClass2, "");
        this.taskId = str;
        this.taskType = kClass;
        this.callingActivityClass = kClass2;
    }

    public final java.lang.String getTaskId() {
        return this.taskId;
    }

    public final kotlin.reflect.KClass<? extends com.izettle.android.auth.tasks.AbstractAuthTask<?>> getTaskType() {
        return this.taskType;
    }

    public final kotlin.reflect.KClass<? extends android.app.Activity> getCallingActivityClass() {
        return this.callingActivityClass;
    }
}
