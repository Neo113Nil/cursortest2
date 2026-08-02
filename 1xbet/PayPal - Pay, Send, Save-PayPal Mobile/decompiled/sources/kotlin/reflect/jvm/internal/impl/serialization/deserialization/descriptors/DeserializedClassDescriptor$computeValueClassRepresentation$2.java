package kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors;

/* loaded from: classes5.dex */
final /* synthetic */ class DeserializedClassDescriptor$computeValueClassRepresentation$2 extends kotlin.jvm.internal.FunctionReferenceImpl implements kotlin.jvm.functions.Function1<kotlin.reflect.jvm.internal.impl.name.Name, kotlin.reflect.jvm.internal.impl.types.SimpleType> {
    @Override // kotlin.jvm.functions.Function1
    public final /* synthetic */ kotlin.reflect.jvm.internal.impl.types.SimpleType invoke(kotlin.reflect.jvm.internal.impl.name.Name name2) {
        kotlin.reflect.jvm.internal.impl.types.SimpleType highSpeedVideoFpsRanges;
        kotlin.reflect.jvm.internal.impl.name.Name name3 = name2;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(name3, "");
        highSpeedVideoFpsRanges = ((kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedClassDescriptor) this.receiver).getHighSpeedVideoFpsRanges(name3);
        return highSpeedVideoFpsRanges;
    }

    DeserializedClassDescriptor$computeValueClassRepresentation$2(java.lang.Object obj) {
        super(1, obj, kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedClassDescriptor.class, "getValueClassPropertyType", "getValueClassPropertyType(Lorg/jetbrains/kotlin/name/Name;)Lorg/jetbrains/kotlin/types/SimpleType;", 0);
    }
}
