package kotlinx.serialization.json.internal;

@kotlin.Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0010\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lkotlinx/serialization/json/internal/JsonException;", "Lkotlinx/serialization/SerializationException;", "", "message", "<init>", "(Ljava/lang/String;)V"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public class JsonException extends kotlinx.serialization.SerializationException {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public JsonException(java.lang.String str) {
        super(str);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
    }
}
