package com.payair.csdk;

/* loaded from: classes10.dex */
public final class g0 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2 {

    /* renamed from: a, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f4252a;
    public final /* synthetic */ java.util.Map b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g0(java.util.Map map, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.b = map;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        com.payair.csdk.g0 g0Var = new com.payair.csdk.g0(this.b, continuation);
        g0Var.f4252a = obj;
        return g0Var;
    }

    @Override // kotlin.jvm.functions.Function2
    public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        com.payair.csdk.g0 g0Var = new com.payair.csdk.g0(this.b, (kotlin.coroutines.Continuation) obj2);
        g0Var.f4252a = (androidx.content.preferences.core.MutablePreferences) obj;
        return g0Var.invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        androidx.datastore.preferences.core.Preferences.Key key;
        kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        kotlin.ResultKt.throwOnFailure(obj);
        androidx.content.preferences.core.MutablePreferences mutablePreferences = (androidx.content.preferences.core.MutablePreferences) this.f4252a;
        key = com.payair.logic.storage.DataStoreTokenizationTimestampStorage.d;
        kotlinx.serialization.json.Json.Companion companion = kotlinx.serialization.json.Json.INSTANCE;
        com.payair.csdk.r2 r2Var = new com.payair.csdk.r2(this.b);
        companion.getSerializersModule();
        mutablePreferences.set(key, companion.encodeToString(com.payair.csdk.r2.Companion.serializer(), r2Var));
        return kotlin.Unit.INSTANCE;
    }
}
