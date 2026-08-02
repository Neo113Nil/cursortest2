package financial.atomic.muppet.c;

/* loaded from: classes17.dex */
public final class b extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function5 {

    /* renamed from: a, reason: collision with root package name */
    public int f6839a;
    public /* synthetic */ io.ktor.client.statement.HttpResponse b;
    public /* synthetic */ io.ktor.utils.io.ByteReadChannel c;
    public /* synthetic */ io.ktor.util.reflect.TypeInfo d;

    public b(kotlin.coroutines.Continuation continuation) {
        super(5, continuation);
    }

    @Override // kotlin.jvm.functions.Function5
    public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3, java.lang.Object obj4, java.lang.Object obj5) {
        financial.atomic.muppet.c.b bVar = new financial.atomic.muppet.c.b((kotlin.coroutines.Continuation) obj5);
        bVar.b = (io.ktor.client.statement.HttpResponse) obj2;
        bVar.c = (io.ktor.utils.io.ByteReadChannel) obj3;
        bVar.d = (io.ktor.util.reflect.TypeInfo) obj4;
        return bVar.invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.f6839a;
        if (i == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            io.ktor.client.statement.HttpResponse httpResponse = this.b;
            io.ktor.utils.io.ByteReadChannel byteReadChannel = this.c;
            io.ktor.util.reflect.TypeInfo typeInfo = this.d;
            try {
                io.ktor.http.HttpMessagePropertiesKt.contentType(httpResponse);
                return null;
            } catch (io.ktor.http.BadContentTypeFormatException unused) {
                if (!kotlin.jvm.internal.Intrinsics.areEqual(typeInfo.getType(), kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(java.lang.String.class))) {
                    return null;
                }
                this.b = null;
                this.c = null;
                this.f6839a = 1;
                obj = io.ktor.utils.io.ByteReadChannelOperationsKt.readRemaining(byteReadChannel, this);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
            }
        } else {
            if (i != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.ResultKt.throwOnFailure(obj);
        }
        return kotlin.text.StringsKt.decodeToString(kotlinx.io.SourcesKt.readByteArray((kotlinx.io.Source) obj));
    }
}
