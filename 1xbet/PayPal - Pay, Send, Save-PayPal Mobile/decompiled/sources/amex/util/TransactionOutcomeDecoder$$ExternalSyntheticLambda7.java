package amex.util;

/* loaded from: classes5.dex */
public final /* synthetic */ class TransactionOutcomeDecoder$$ExternalSyntheticLambda7 implements java.util.function.Function {
    @Override // java.util.function.Function
    public final java.lang.Object apply(java.lang.Object obj) {
        return common.emv.kernel.TransactionOutcome.ValueQualifier.fromCode(((java.lang.Integer) obj).intValue());
    }
}
