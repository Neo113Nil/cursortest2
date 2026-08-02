package financial.atomic.muppet.c;

/* loaded from: classes17.dex */
public final class r extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2 {

    /* renamed from: a, reason: collision with root package name */
    public byte[] f6855a;
    public io.ktor.utils.io.ByteReadChannel b;
    public int c;
    public final /* synthetic */ kotlin.jvm.internal.Ref.ObjectRef e;
    private /* synthetic */ java.lang.Object getHighResolutionOutputSizeshNQ4ISI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r(kotlin.jvm.internal.Ref.ObjectRef objectRef, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.e = objectRef;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        financial.atomic.muppet.c.r rVar = new financial.atomic.muppet.c.r(this.e, continuation);
        rVar.getHighResolutionOutputSizeshNQ4ISI = obj;
        return rVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        financial.atomic.muppet.c.r rVar = new financial.atomic.muppet.c.r(this.e, (kotlin.coroutines.Continuation) obj2);
        rVar.getHighResolutionOutputSizeshNQ4ISI = (kotlinx.coroutines.channels.ProducerScope) obj;
        return rVar.invokeSuspend(kotlin.Unit.INSTANCE);
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0081, code lost:
    
        if (r15 != r0) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x00a0, code lost:
    
        if (r6.send(r15, r14) == r0) goto L29;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0068  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:14:0x0089 -> B:7:0x0062). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:16:0x00a0 -> B:7:0x0062). Please report as a decompilation issue!!! */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        byte[] bArr;
        kotlinx.coroutines.channels.ProducerScope producerScope;
        byte[] bArr2;
        io.ktor.utils.io.ByteReadChannel byteReadChannel;
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.c;
        if (i == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            kotlinx.coroutines.channels.ProducerScope producerScope2 = (kotlinx.coroutines.channels.ProducerScope) this.getHighResolutionOutputSizeshNQ4ISI;
            bArr = new byte[8192];
            T t = this.e.element;
            kotlin.jvm.internal.Intrinsics.checkNotNull(t);
            this.getHighResolutionOutputSizeshNQ4ISI = producerScope2;
            this.f6855a = bArr;
            this.c = 1;
            java.lang.Object bodyAsChannel = io.ktor.client.statement.HttpResponseKt.bodyAsChannel((io.ktor.client.statement.HttpResponse) t, this);
            if (bodyAsChannel != coroutine_suspended) {
                producerScope = producerScope2;
                obj = bodyAsChannel;
            }
            return coroutine_suspended;
        }
        if (i == 1) {
            bArr = this.f6855a;
            kotlinx.coroutines.channels.ProducerScope producerScope3 = (kotlinx.coroutines.channels.ProducerScope) this.getHighResolutionOutputSizeshNQ4ISI;
            kotlin.ResultKt.throwOnFailure(obj);
            producerScope = producerScope3;
        } else {
            if (i == 2) {
                byteReadChannel = this.b;
                bArr2 = this.f6855a;
                producerScope = (kotlinx.coroutines.channels.ProducerScope) this.getHighResolutionOutputSizeshNQ4ISI;
                kotlin.ResultKt.throwOnFailure(obj);
                int intValue = ((java.lang.Number) obj).intValue();
                if (intValue > 0) {
                    byte[] copyOf = java.util.Arrays.copyOf(bArr2, intValue);
                    kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(copyOf, "");
                    this.getHighResolutionOutputSizeshNQ4ISI = producerScope;
                    this.f6855a = bArr2;
                    this.b = byteReadChannel;
                    this.c = 3;
                }
                if (!byteReadChannel.isClosedForRead()) {
                }
                kotlinx.coroutines.channels.SendChannel.DefaultImpls.close$default(producerScope, null, 1, null);
                return kotlin.Unit.INSTANCE;
            }
            if (i != 3) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            byteReadChannel = this.b;
            bArr2 = this.f6855a;
            producerScope = (kotlinx.coroutines.channels.ProducerScope) this.getHighResolutionOutputSizeshNQ4ISI;
            kotlin.ResultKt.throwOnFailure(obj);
            if (!byteReadChannel.isClosedForRead() || !kotlinx.coroutines.CoroutineScopeKt.isActive(producerScope)) {
                kotlinx.coroutines.channels.SendChannel.DefaultImpls.close$default(producerScope, null, 1, null);
                return kotlin.Unit.INSTANCE;
            }
            this.getHighResolutionOutputSizeshNQ4ISI = producerScope;
            this.f6855a = bArr2;
            this.b = byteReadChannel;
            this.c = 2;
            obj = io.ktor.utils.io.ByteReadChannelOperationsKt.readAvailable$default(byteReadChannel, bArr2, 0, 0, this, 6, null);
        }
        bArr2 = bArr;
        byteReadChannel = (io.ktor.utils.io.ByteReadChannel) obj;
        if (!byteReadChannel.isClosedForRead()) {
        }
        kotlinx.coroutines.channels.SendChannel.DefaultImpls.close$default(producerScope, null, 1, null);
        return kotlin.Unit.INSTANCE;
    }
}
