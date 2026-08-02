package financial.atomic.a;

/* loaded from: classes17.dex */
public final class b extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ financial.atomic.a.e f6729a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(financial.atomic.a.e eVar, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f6729a = eVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        return new financial.atomic.a.b(this.f6729a, continuation);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        kotlinx.coroutines.CompletableDeferred completableDeferred;
        kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        kotlin.ResultKt.throwOnFailure(obj);
        android.content.Context applicationContext = this.f6729a.getTransact().getContext().getApplicationContext();
        androidx.security.crypto.MasterKey build = new androidx.security.crypto.MasterKey.Builder(applicationContext, "_financial_atomic_transact_storage_mk_").setKeyScheme(androidx.security.crypto.MasterKey.KeyScheme.AES256_GCM).build();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(build, "");
        android.content.SharedPreferences create = androidx.security.crypto.EncryptedSharedPreferences.create(applicationContext, "financial.atomic.transact.storage", build, androidx.security.crypto.EncryptedSharedPreferences.PrefKeyEncryptionScheme.AES256_SIV, androidx.security.crypto.EncryptedSharedPreferences.PrefValueEncryptionScheme.AES256_GCM);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(create, "");
        completableDeferred = this.f6729a.b;
        completableDeferred.complete(create);
        return kotlin.Unit.INSTANCE;
    }

    @Override // kotlin.jvm.functions.Function2
    public final java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return ((financial.atomic.a.b) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }
}
