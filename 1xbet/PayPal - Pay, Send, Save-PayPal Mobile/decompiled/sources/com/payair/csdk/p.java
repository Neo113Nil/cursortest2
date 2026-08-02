package com.payair.csdk;

/* loaded from: classes10.dex */
public final class p extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2 {

    /* renamed from: a, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f4296a;
    public final /* synthetic */ java.util.Map b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p(java.util.Map map, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.b = map;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        com.payair.csdk.p pVar = new com.payair.csdk.p(this.b, continuation);
        pVar.f4296a = obj;
        return pVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        com.payair.csdk.p pVar = new com.payair.csdk.p(this.b, (kotlin.coroutines.Continuation) obj2);
        pVar.f4296a = (androidx.content.preferences.core.MutablePreferences) obj;
        return pVar.invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        androidx.datastore.preferences.core.Preferences.Key key;
        kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        kotlin.ResultKt.throwOnFailure(obj);
        androidx.content.preferences.core.MutablePreferences mutablePreferences = (androidx.content.preferences.core.MutablePreferences) this.f4296a;
        key = com.payair.logic.storage.DataStoreEnrollmentIdStorage.e;
        kotlinx.serialization.json.Json.Companion companion = kotlinx.serialization.json.Json.INSTANCE;
        com.payair.csdk.n0 n0Var = new com.payair.csdk.n0(this.b);
        companion.getSerializersModule();
        mutablePreferences.set(key, companion.encodeToString(com.payair.csdk.n0.Companion.serializer(), n0Var));
        return kotlin.Unit.INSTANCE;
    }
}
