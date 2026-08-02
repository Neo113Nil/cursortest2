package kotlin.contracts;

@kotlin.Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0003\u0010\u0004J\u0019\u0010\u0003\u001a\u00020\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u0001H&¢\u0006\u0004\b\u0003\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H&¢\u0006\u0004\b\b\u0010\tJ-\u0010\u0010\u001a\u00020\u000f\"\u0004\b\u0000\u0010\n2\f\u0010\f\u001a\b\u0012\u0004\u0012\u00028\u00000\u000b2\b\b\u0002\u0010\u000e\u001a\u00020\rH&¢\u0006\u0004\b\u0010\u0010\u0011J\u001c\u0010\u0014\u001a\u00020\u0013*\u00020\u00122\u0006\u0010\u0005\u001a\u00020\u0007H¦\u0004¢\u0006\u0004\b\u0014\u0010\u0015J(\u0010\u0017\u001a\u00020\u0016\"\u0004\b\u0000\u0010\n*\u00020\u00122\f\u0010\f\u001a\b\u0012\u0004\u0012\u00028\u00000\u000bH¦\u0004¢\u0006\u0004\b\u0017\u0010\u0018"}, d2 = {"Lkotlin/contracts/ContractBuilder;", "", "Lkotlin/contracts/Returns;", "returns", "()Lkotlin/contracts/Returns;", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "(Ljava/lang/Object;)Lkotlin/contracts/Returns;", "Lkotlin/contracts/ReturnsNotNull;", "returnsNotNull", "()Lkotlin/contracts/ReturnsNotNull;", com.adobe.marketing.mobile.internal.CoreConstants.Wrapper.Type.REACT_NATIVE, "Lkotlin/Function;", "lambda", "Lkotlin/contracts/InvocationKind;", "kind", "Lkotlin/contracts/CallsInPlace;", "callsInPlace", "(Lkotlin/Function;Lkotlin/contracts/InvocationKind;)Lkotlin/contracts/CallsInPlace;", "", "", "implies", "(ZLkotlin/contracts/ReturnsNotNull;)V", "Lkotlin/contracts/HoldsIn;", "holdsIn", "(ZLkotlin/Function;)Lkotlin/contracts/HoldsIn;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes17.dex */
public interface ContractBuilder {
    <R> kotlin.contracts.CallsInPlace callsInPlace(kotlin.Function<? extends R> lambda, kotlin.contracts.InvocationKind kind);

    <R> kotlin.contracts.HoldsIn holdsIn(boolean z, kotlin.Function<? extends R> function);

    void implies(boolean z, kotlin.contracts.ReturnsNotNull returnsNotNull);

    kotlin.contracts.Returns returns();

    kotlin.contracts.Returns returns(java.lang.Object value);

    kotlin.contracts.ReturnsNotNull returnsNotNull();

    @kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class DefaultImpls {
        public static /* synthetic */ kotlin.contracts.CallsInPlace callsInPlace$default(kotlin.contracts.ContractBuilder contractBuilder, kotlin.Function function, kotlin.contracts.InvocationKind invocationKind, int i, java.lang.Object obj) {
            if (obj != null) {
                throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: callsInPlace");
            }
            if ((i & 2) != 0) {
                invocationKind = kotlin.contracts.InvocationKind.UNKNOWN;
            }
            return contractBuilder.callsInPlace(function, invocationKind);
        }
    }
}
