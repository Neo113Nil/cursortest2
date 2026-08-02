package kotlin.reflect.jvm;

@kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
final /* synthetic */ class ReflectLambdaKt$reflect$descriptor$1 extends kotlin.jvm.internal.FunctionReferenceImpl implements kotlin.jvm.functions.Function2<kotlin.reflect.jvm.internal.impl.serialization.deserialization.MemberDeserializer, kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Function, kotlin.reflect.jvm.internal.impl.descriptors.SimpleFunctionDescriptor> {
    public static final kotlin.reflect.jvm.ReflectLambdaKt$reflect$descriptor$1 getHighSpeedVideoSizes = new kotlin.reflect.jvm.ReflectLambdaKt$reflect$descriptor$1();

    @Override // kotlin.jvm.functions.Function2
    public final /* synthetic */ kotlin.reflect.jvm.internal.impl.descriptors.SimpleFunctionDescriptor invoke(kotlin.reflect.jvm.internal.impl.serialization.deserialization.MemberDeserializer memberDeserializer, kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Function function) {
        kotlin.reflect.jvm.internal.impl.serialization.deserialization.MemberDeserializer memberDeserializer2 = memberDeserializer;
        kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Function function2 = function;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(memberDeserializer2, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function2, "");
        return memberDeserializer2.loadFunction(function2);
    }

    ReflectLambdaKt$reflect$descriptor$1() {
        super(2, kotlin.reflect.jvm.internal.impl.serialization.deserialization.MemberDeserializer.class, "loadFunction", "loadFunction(Lorg/jetbrains/kotlin/metadata/ProtoBuf$Function;)Lorg/jetbrains/kotlin/descriptors/SimpleFunctionDescriptor;", 0);
    }
}
