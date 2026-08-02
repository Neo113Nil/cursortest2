package com.payair.csdk;

/* loaded from: classes10.dex */
public final class c0 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2 {

    /* renamed from: a, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f4236a;
    public final /* synthetic */ com.payair.model.CardScheme b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c0(com.payair.model.CardScheme cardScheme, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.b = cardScheme;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        com.payair.csdk.c0 c0Var = new com.payair.csdk.c0(this.b, continuation);
        c0Var.f4236a = obj;
        return c0Var;
    }

    @Override // kotlin.jvm.functions.Function2
    public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        com.payair.csdk.c0 c0Var = new com.payair.csdk.c0(this.b, (kotlin.coroutines.Continuation) obj2);
        c0Var.f4236a = (androidx.content.preferences.core.MutablePreferences) obj;
        return c0Var.invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        androidx.datastore.preferences.core.Preferences.Key key;
        kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        kotlin.ResultKt.throwOnFailure(obj);
        androidx.content.preferences.core.MutablePreferences mutablePreferences = (androidx.content.preferences.core.MutablePreferences) this.f4236a;
        key = com.payair.logic.storage.DataStoreSchemeStorage.f;
        kotlinx.serialization.json.Json.Companion companion = kotlinx.serialization.json.Json.INSTANCE;
        com.payair.model.CardScheme cardScheme = this.b;
        companion.getSerializersModule();
        mutablePreferences.set(key, companion.encodeToString(kotlinx.serialization.internal.EnumsKt.createSimpleEnumSerializer("com.payair.model.CardScheme", com.payair.model.CardScheme.values()), cardScheme));
        return kotlin.Unit.INSTANCE;
    }
}
