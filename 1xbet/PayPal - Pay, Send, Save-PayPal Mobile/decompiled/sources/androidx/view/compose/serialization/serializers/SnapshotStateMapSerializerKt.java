package androidx.view.compose.serialization.serializers;

@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a,\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0002\"\u0006\b\u0000\u0010\u0000\u0018\u0001\"\u0006\b\u0001\u0010\u0001\u0018\u0001H\u0086\b¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"K", "V", "Landroidx/savedstate/compose/serialization/serializers/SnapshotStateMapSerializer;", "SnapshotStateMapSerializer", "()Landroidx/savedstate/compose/serialization/serializers/SnapshotStateMapSerializer;"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class SnapshotStateMapSerializerKt {
    public static final /* synthetic */ <K, V> androidx.view.compose.serialization.serializers.SnapshotStateMapSerializer<K, V> SnapshotStateMapSerializer() {
        kotlin.jvm.internal.Intrinsics.reifiedOperationMarker(6, "K");
        kotlin.jvm.internal.MagicApiIntrinsics.voidMagicApiCall("kotlinx.serialization.serializer.simple");
        kotlinx.serialization.KSerializer<java.lang.Object> serializer = kotlinx.serialization.SerializersKt.serializer((kotlin.reflect.KType) null);
        kotlin.jvm.internal.Intrinsics.reifiedOperationMarker(6, "V");
        kotlin.jvm.internal.MagicApiIntrinsics.voidMagicApiCall("kotlinx.serialization.serializer.simple");
        return new androidx.view.compose.serialization.serializers.SnapshotStateMapSerializer<>(serializer, kotlinx.serialization.SerializersKt.serializer((kotlin.reflect.KType) null));
    }
}
