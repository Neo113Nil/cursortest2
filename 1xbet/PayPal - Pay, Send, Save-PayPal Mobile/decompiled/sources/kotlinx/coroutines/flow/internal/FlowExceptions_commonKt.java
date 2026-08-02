package kotlinx.coroutines.flow.internal;

@kotlin.Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\u001a\u001b\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0000¢\u0006\u0004\b\u0004\u0010\u0005\u001a\u0018\u0010\b\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u0006H\u0080\b¢\u0006\u0004\b\b\u0010\t"}, d2 = {"Lkotlinx/coroutines/flow/internal/AbortFlowException;", "", com.microblink.blinkid.entities.recognizers.blinkcard.BlinkCardRecognizer.VerificationConstants.Owner, "", "checkOwnership", "(Lkotlinx/coroutines/flow/internal/AbortFlowException;Ljava/lang/Object;)V", "", "index", "checkIndexOverflow", "(I)I"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class FlowExceptions_commonKt {
    public static final void checkOwnership(kotlinx.coroutines.flow.internal.AbortFlowException abortFlowException, java.lang.Object obj) {
        if (abortFlowException.owner != obj) {
            throw abortFlowException;
        }
    }

    public static final int checkIndexOverflow(int i) {
        if (i >= 0) {
            return i;
        }
        throw new java.lang.ArithmeticException("Index overflow has happened");
    }
}
