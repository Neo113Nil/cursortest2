package kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors;

/* loaded from: classes5.dex */
final /* synthetic */ class DeserializedClassDescriptor$computeValueClassRepresentation$1 extends kotlin.jvm.internal.AdaptedFunctionReference implements kotlin.jvm.functions.Function1<kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Type, kotlin.reflect.jvm.internal.impl.types.SimpleType> {
    @Override // kotlin.jvm.functions.Function1
    public final /* synthetic */ kotlin.reflect.jvm.internal.impl.types.SimpleType invoke(kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Type type) {
        kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Type type2 = type;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(type2, "");
        return kotlin.reflect.jvm.internal.impl.serialization.deserialization.TypeDeserializer.simpleType$default((kotlin.reflect.jvm.internal.impl.serialization.deserialization.TypeDeserializer) this.receiver, type2, false, 2, null);
    }

    DeserializedClassDescriptor$computeValueClassRepresentation$1(java.lang.Object obj) {
        super(1, obj, kotlin.reflect.jvm.internal.impl.serialization.deserialization.TypeDeserializer.class, "simpleType", "simpleType(Lorg/jetbrains/kotlin/metadata/ProtoBuf$Type;Z)Lorg/jetbrains/kotlin/types/SimpleType;", 0);
    }
}
