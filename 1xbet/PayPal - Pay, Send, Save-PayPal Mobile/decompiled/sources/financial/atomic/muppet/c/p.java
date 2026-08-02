package financial.atomic.muppet.c;

/* loaded from: classes17.dex */
public final class p extends io.ktor.http.content.OutgoingContent.WriteChannelContent {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ financial.atomic.muppet.http.Request f6853a;

    public p(financial.atomic.muppet.http.Request request) {
        this.f6853a = request;
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x005b, code lost:
    
        if (r6.flushAndClose(r0) != r1) goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0061, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0050, code lost:
    
        if (r7.collect(r2, r0) != r1) goto L18;
     */
    /* JADX WARN: Removed duplicated region for block: B:20:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    @Override // io.ktor.http.content.OutgoingContent.WriteChannelContent
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object writeTo(io.ktor.utils.io.ByteWriteChannel byteWriteChannel, kotlin.coroutines.Continuation continuation) {
        financial.atomic.muppet.c.n nVar;
        int i;
        if (continuation instanceof financial.atomic.muppet.c.n) {
            nVar = (financial.atomic.muppet.c.n) continuation;
            int i2 = nVar.d;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                nVar.d = i2 - 2147483648;
                java.lang.Object obj = nVar.b;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = nVar.d;
                if (i != 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    kotlinx.coroutines.flow.Flow<byte[]> stream = this.f6853a.getStream();
                    financial.atomic.muppet.c.o oVar = new financial.atomic.muppet.c.o(byteWriteChannel);
                    nVar.f6851a = byteWriteChannel;
                    nVar.d = 1;
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        kotlin.ResultKt.throwOnFailure(obj);
                        return kotlin.Unit.INSTANCE;
                    }
                    byteWriteChannel = nVar.f6851a;
                    kotlin.ResultKt.throwOnFailure(obj);
                }
                nVar.f6851a = null;
                nVar.d = 2;
            }
        }
        nVar = new financial.atomic.muppet.c.n(this, continuation);
        java.lang.Object obj2 = nVar.b;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = nVar.d;
        if (i != 0) {
        }
        nVar.f6851a = null;
        nVar.d = 2;
    }
}
