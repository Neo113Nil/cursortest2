package kotlinx.datetime.serializers;

@kotlin.Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0001\n\u0002\b\u0002\u001a\u0017\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u0000¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "index", "", "throwUnknownIndexException", "(I)Ljava/lang/Void;"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes17.dex */
public final class DateTimeUnitSerializersKt {
    public static final java.lang.Void throwUnknownIndexException(int i) {
        throw new kotlinx.serialization.SerializationException("An unknown field for index ".concat(java.lang.String.valueOf(i)));
    }
}
