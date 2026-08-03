package com.unity3d.services.core.fid;

/* compiled from: FIdStaticBridge.kt */
@kotlin.Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H\u0014J\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0007\u001a\u00020\b¨\u0006\t"}, d2 = {"Lcom/unity3d/services/core/fid/FIdStaticBridge;", "Lcom/unity3d/services/core/reflection/GenericBridge;", "()V", "getClassName", "", com.unity3d.services.core.fid.Constants.GET_INSTANCE, "Lcom/unity3d/services/core/fid/FIdBridge;", "context", "Landroid/content/Context;", "unity-ads_defaultRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class FIdStaticBridge extends com.unity3d.services.core.reflection.GenericBridge {
    public FIdStaticBridge() {
        super(kotlin.collections.MapsKt.mapOf(new kotlin.Pair(com.unity3d.services.core.fid.Constants.GET_INSTANCE, new java.lang.Class[]{android.content.Context.class})), false);
    }

    public final com.unity3d.services.core.fid.FIdBridge getInstance(android.content.Context context) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "context");
        java.lang.Object callNonVoidMethod = callNonVoidMethod(com.unity3d.services.core.fid.Constants.GET_INSTANCE, null, context);
        if (callNonVoidMethod != null) {
            return new com.unity3d.services.core.fid.FIdBridge(callNonVoidMethod);
        }
        return null;
    }

    @Override // com.unity3d.services.core.reflection.GenericBridge
    protected java.lang.String getClassName() {
        return com.unity3d.services.core.fid.Constants.INSTANCE.getClassName();
    }
}
