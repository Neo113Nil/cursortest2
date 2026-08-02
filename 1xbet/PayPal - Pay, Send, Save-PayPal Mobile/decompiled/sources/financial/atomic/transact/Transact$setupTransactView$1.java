package financial.atomic.transact;

@kotlin.Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "financial.atomic.transact.Transact", f = "Transact.kt", i = {0, 0, 1, 1, 1}, l = {492, my.com.softspace.ssfasstapsdk.pog.AttestationPOG.POGStatusCodes.RST_POG_ACTIVATION_SCRP_FAIL, 544}, m = "setupTransactView", n = {"config", "url", "config", "url", "$this$setupTransactView_u24lambda_u2416"}, s = {"L$0", "L$1", "L$0", "L$1", "L$3"})
/* loaded from: classes17.dex */
final class Transact$setupTransactView$1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
    java.lang.Object L$0;
    java.lang.Object L$1;
    java.lang.Object L$2;
    java.lang.Object L$3;
    int label;
    /* synthetic */ java.lang.Object result;
    final /* synthetic */ financial.atomic.transact.Transact this$0;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.a((financial.atomic.transact.Config) null, this);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Transact$setupTransactView$1(financial.atomic.transact.Transact transact, kotlin.coroutines.Continuation<? super financial.atomic.transact.Transact$setupTransactView$1> continuation) {
        super(continuation);
        this.this$0 = transact;
    }
}
