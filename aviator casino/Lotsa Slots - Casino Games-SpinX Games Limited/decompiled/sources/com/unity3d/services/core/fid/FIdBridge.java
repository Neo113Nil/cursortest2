package com.unity3d.services.core.fid;

/* compiled from: FIdBridge.kt */
@kotlin.Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u000e\u0010\u0005\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u0006J\b\u0010\b\u001a\u00020\u0007H\u0014R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\t"}, d2 = {"Lcom/unity3d/services/core/fid/FIdBridge;", "Lcom/unity3d/services/core/reflection/GenericBridge;", com.ironsource.C3232q2.p, "", "(Ljava/lang/Object;)V", com.unity3d.services.core.fid.Constants.GET_APP_INSTANCE_ID, "Lcom/google/android/gms/tasks/Task;", "", "getClassName", "unity-ads_defaultRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class FIdBridge extends com.unity3d.services.core.reflection.GenericBridge {
    private final java.lang.Object instance;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FIdBridge(java.lang.Object instance) {
        super(kotlin.collections.MapsKt.mapOf(new kotlin.Pair(com.unity3d.services.core.fid.Constants.GET_APP_INSTANCE_ID, new java.lang.Class[0])), false);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(instance, "instance");
        this.instance = instance;
    }

    @Override // com.unity3d.services.core.reflection.GenericBridge
    protected java.lang.String getClassName() {
        return com.unity3d.services.core.fid.Constants.INSTANCE.getClassName();
    }

    public final com.google.android.gms.tasks.Task<java.lang.String> getAppInstanceId() {
        com.google.android.gms.tasks.Task<java.lang.String> task = (com.google.android.gms.tasks.Task) callNonVoidMethod(com.unity3d.services.core.fid.Constants.GET_APP_INSTANCE_ID, this.instance, new java.lang.Object[0]);
        if (task != null) {
            return task;
        }
        com.google.android.gms.tasks.Task<java.lang.String> forResult = com.google.android.gms.tasks.Tasks.forResult(null);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(forResult, "forResult(null)");
        return forResult;
    }
}
