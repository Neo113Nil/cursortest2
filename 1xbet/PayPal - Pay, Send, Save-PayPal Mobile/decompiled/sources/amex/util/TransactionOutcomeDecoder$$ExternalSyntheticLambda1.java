package amex.util;

/* loaded from: classes5.dex */
public final /* synthetic */ class TransactionOutcomeDecoder$$ExternalSyntheticLambda1 implements java.util.function.Function {
    @Override // java.util.function.Function
    public final java.lang.Object apply(java.lang.Object obj) {
        return common.emv.kernel.TransactionOutcome.Start.fromCode(((java.lang.Integer) obj).intValue());
    }
}
