package com.payair.csdk;

/* loaded from: classes4.dex */
public final class u extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2 {

    /* renamed from: a, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f4319a;
    public final /* synthetic */ java.lang.String b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u(java.lang.String str, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.b = str;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        com.payair.csdk.u uVar = new com.payair.csdk.u(this.b, continuation);
        uVar.f4319a = obj;
        return uVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        com.payair.csdk.u uVar = new com.payair.csdk.u(this.b, (kotlin.coroutines.Continuation) obj2);
        uVar.f4319a = (androidx.content.preferences.core.MutablePreferences) obj;
        return uVar.invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        androidx.datastore.preferences.core.Preferences.Key key;
        kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        kotlin.ResultKt.throwOnFailure(obj);
        androidx.content.preferences.core.MutablePreferences mutablePreferences = (androidx.content.preferences.core.MutablePreferences) this.f4319a;
        key = com.payair.logic.storage.DataStoreEnrollmentIdStorage.d;
        mutablePreferences.set(key, this.b);
        return kotlin.Unit.INSTANCE;
    }
}
