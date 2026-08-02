package kotlin.reflect.jvm;

@kotlin.Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a%\u0010\u0003\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u0002\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u0001¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {com.adobe.marketing.mobile.internal.CoreConstants.Wrapper.Type.REACT_NATIVE, "Lkotlin/Function;", "Lkotlin/reflect/KFunction;", "reflect", "(Lkotlin/Function;)Lkotlin/reflect/KFunction;"}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class ReflectLambdaKt {
    public static final <R> kotlin.reflect.KFunction<R> reflect(kotlin.Function<? extends R> function) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function, "");
        kotlin.Metadata metadata = (kotlin.Metadata) function.getClass().getAnnotation(kotlin.Metadata.class);
        if (metadata == null) {
            return null;
        }
        java.lang.String[] d1 = metadata.d1();
        if (d1.length == 0) {
            d1 = null;
        }
        if (d1 == null) {
            return null;
        }
        kotlin.Pair<kotlin.reflect.jvm.internal.impl.metadata.jvm.deserialization.JvmNameResolver, kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Function> readFunctionDataFrom = kotlin.reflect.jvm.internal.impl.metadata.jvm.deserialization.JvmProtoBufUtil.readFunctionDataFrom(d1, metadata.d2());
        kotlin.reflect.jvm.internal.impl.metadata.jvm.deserialization.JvmNameResolver component1 = readFunctionDataFrom.component1();
        kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Function component2 = readFunctionDataFrom.component2();
        kotlin.reflect.jvm.internal.impl.metadata.deserialization.MetadataVersion metadataVersion = new kotlin.reflect.jvm.internal.impl.metadata.deserialization.MetadataVersion(metadata.mv(), (metadata.xi() & 8) != 0);
        kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.TypeTable typeTable = component2.getTypeTable();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(typeTable, "");
        return new kotlin.reflect.jvm.internal.DescriptorKFunction(kotlin.reflect.jvm.internal.EmptyContainerForLocal.INSTANCE, (kotlin.reflect.jvm.internal.impl.descriptors.SimpleFunctionDescriptor) kotlin.reflect.jvm.internal.UtilKt.deserializeToDescriptor(function.getClass(), component2, component1, new kotlin.reflect.jvm.internal.impl.metadata.deserialization.TypeTable(typeTable), metadataVersion, kotlin.reflect.jvm.ReflectLambdaKt$reflect$descriptor$1.getHighSpeedVideoSizes));
    }
}
