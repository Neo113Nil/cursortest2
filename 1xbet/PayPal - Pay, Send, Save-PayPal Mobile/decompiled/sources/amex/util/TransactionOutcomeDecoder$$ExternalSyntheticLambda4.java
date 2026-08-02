package amex.util;

/* loaded from: classes5.dex */
public final /* synthetic */ class TransactionOutcomeDecoder$$ExternalSyntheticLambda4 implements java.util.function.Function {
    @Override // java.util.function.Function
    public final java.lang.Object apply(java.lang.Object obj) {
        return common.emv.kernel.TransactionOutcome.AlternateInterfacePreference.fromCode(((java.lang.Integer) obj).intValue());
    }
}
