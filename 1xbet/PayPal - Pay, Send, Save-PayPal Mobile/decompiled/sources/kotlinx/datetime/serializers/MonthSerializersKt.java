package kotlinx.datetime.serializers;

@kotlin.Metadata(d1 = {"\u0000\u001a\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a;\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00000\u0006\"\u000e\b\u0000\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00000\u00002\u0006\u0010\u0003\u001a\u00020\u00022\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004H\u0000¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"", "E", "", "serialName", "", "values", "Lkotlinx/serialization/KSerializer;", "createEnumSerializer", "(Ljava/lang/String;[Ljava/lang/Enum;)Lkotlinx/serialization/KSerializer;"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes17.dex */
public final class MonthSerializersKt {
    public static final <E extends java.lang.Enum<E>> kotlinx.serialization.KSerializer<E> createEnumSerializer(java.lang.String str, E[] eArr) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(eArr, "");
        return new kotlinx.serialization.internal.EnumSerializer(str, eArr);
    }
}
