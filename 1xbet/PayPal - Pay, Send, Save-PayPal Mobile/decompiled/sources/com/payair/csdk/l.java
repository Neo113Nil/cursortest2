package com.payair.csdk;

/* loaded from: classes4.dex */
public final class l extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2 {

    /* renamed from: a, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f4276a;
    public final /* synthetic */ java.util.Map b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(java.util.Map map, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.b = map;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        com.payair.csdk.l lVar = new com.payair.csdk.l(this.b, continuation);
        lVar.f4276a = obj;
        return lVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        com.payair.csdk.l lVar = new com.payair.csdk.l(this.b, (kotlin.coroutines.Continuation) obj2);
        lVar.f4276a = (androidx.content.preferences.core.MutablePreferences) obj;
        return lVar.invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        androidx.datastore.preferences.core.Preferences.Key key;
        kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        kotlin.ResultKt.throwOnFailure(obj);
        androidx.content.preferences.core.MutablePreferences mutablePreferences = (androidx.content.preferences.core.MutablePreferences) this.f4276a;
        key = com.payair.logic.storage.DataStoreEnrollmentIdStorage.e;
        kotlinx.serialization.json.Json.Companion companion = kotlinx.serialization.json.Json.INSTANCE;
        com.payair.csdk.n0 n0Var = new com.payair.csdk.n0(this.b);
        companion.getSerializersModule();
        mutablePreferences.set(key, companion.encodeToString(com.payair.csdk.n0.Companion.serializer(), n0Var));
        return kotlin.Unit.INSTANCE;
    }
}
