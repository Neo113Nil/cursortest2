package financial.atomic.muppet.bridge;

@kotlin.Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bà\u0080\u0001\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002J7\u0010\u000b\u001a\u0004\u0018\u00010\u00072\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u00032\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\tH&¢\u0006\u0004\b\u000b\u0010\f"}, d2 = {"Lfinancial/atomic/muppet/bridge/Handler;", "T", "", "Lfinancial/atomic/muppet/bridge/Bridge;", "bridge", "", "handle", "", "method", "Lkotlinx/serialization/json/JsonArray;", "params", "invoke", "(Lfinancial/atomic/muppet/bridge/Bridge;ILjava/lang/String;Lkotlinx/serialization/json/JsonArray;)Ljava/lang/String;"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes17.dex */
public interface Handler<T> {
    java.lang.String invoke(financial.atomic.muppet.bridge.Bridge<T> bridge, int handle, java.lang.String method, kotlinx.serialization.json.JsonArray params);
}
