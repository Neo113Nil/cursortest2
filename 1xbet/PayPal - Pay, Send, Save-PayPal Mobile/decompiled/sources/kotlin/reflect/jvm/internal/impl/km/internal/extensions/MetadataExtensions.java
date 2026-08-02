package kotlin.reflect.jvm.internal.impl.km.internal.extensions;

/* loaded from: classes5.dex */
public interface MetadataExtensions {
    public static final kotlin.reflect.jvm.internal.impl.km.internal.extensions.MetadataExtensions.Companion Companion = kotlin.reflect.jvm.internal.impl.km.internal.extensions.MetadataExtensions.Companion.Camera2StreamConfigurationMap;

    kotlin.reflect.jvm.internal.impl.km.internal.extensions.KmClassExtension createClassExtension();

    kotlin.reflect.jvm.internal.impl.km.internal.extensions.KmConstructorExtension createConstructorExtension();

    kotlin.reflect.jvm.internal.impl.km.internal.extensions.KmEnumEntryExtension createEnumEntryExtension();

    kotlin.reflect.jvm.internal.impl.km.internal.extensions.KmFunctionExtension createFunctionExtension();

    kotlin.reflect.jvm.internal.impl.km.internal.extensions.KmPackageExtension createPackageExtension();

    kotlin.reflect.jvm.internal.impl.km.internal.extensions.KmPropertyExtension createPropertyExtension();

    kotlin.reflect.jvm.internal.impl.km.internal.extensions.KmTypeAliasExtension createTypeAliasExtension();

    kotlin.reflect.jvm.internal.impl.km.internal.extensions.KmTypeExtension createTypeExtension();

    kotlin.reflect.jvm.internal.impl.km.internal.extensions.KmTypeParameterExtension createTypeParameterExtension();

    kotlin.reflect.jvm.internal.impl.km.internal.extensions.KmValueParameterExtension createValueParameterExtension();

    void readClassExtensions(kotlin.reflect.jvm.internal.impl.km.KmClass kmClass, kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Class r2, kotlin.reflect.jvm.internal.impl.km.internal.ReadContext readContext);

    void readConstructorExtensions(kotlin.reflect.jvm.internal.impl.km.KmConstructor kmConstructor, kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Constructor constructor, kotlin.reflect.jvm.internal.impl.km.internal.ReadContext readContext);

    void readEnumEntryExtensions(kotlin.reflect.jvm.internal.impl.km.KmEnumEntry kmEnumEntry, kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.EnumEntry enumEntry, kotlin.reflect.jvm.internal.impl.km.internal.ReadContext readContext);

    void readFunctionExtensions(kotlin.reflect.jvm.internal.impl.km.KmFunction kmFunction, kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Function function, kotlin.reflect.jvm.internal.impl.km.internal.ReadContext readContext);

    void readPackageExtensions(kotlin.reflect.jvm.internal.impl.km.KmPackage kmPackage, kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Package r2, kotlin.reflect.jvm.internal.impl.km.internal.ReadContext readContext);

    void readPropertyExtensions(kotlin.reflect.jvm.internal.impl.km.KmProperty kmProperty, kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Property property, kotlin.reflect.jvm.internal.impl.km.internal.ReadContext readContext);

    void readTypeAliasExtensions(kotlin.reflect.jvm.internal.impl.km.KmTypeAlias kmTypeAlias, kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.TypeAlias typeAlias, kotlin.reflect.jvm.internal.impl.km.internal.ReadContext readContext);

    void readTypeExtensions(kotlin.reflect.jvm.internal.impl.km.KmType kmType, kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Type type, kotlin.reflect.jvm.internal.impl.km.internal.ReadContext readContext);

    void readTypeParameterExtensions(kotlin.reflect.jvm.internal.impl.km.KmTypeParameter kmTypeParameter, kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.TypeParameter typeParameter, kotlin.reflect.jvm.internal.impl.km.internal.ReadContext readContext);

    void readValueParameterExtensions(kotlin.reflect.jvm.internal.impl.km.KmValueParameter kmValueParameter, kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.ValueParameter valueParameter, kotlin.reflect.jvm.internal.impl.km.internal.ReadContext readContext);

    void writePropertyExtensions(kotlin.reflect.jvm.internal.impl.km.KmProperty kmProperty, kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Property.Builder builder, kotlin.reflect.jvm.internal.impl.km.internal.WriteContext writeContext);

    void writeTypeExtensions(kotlin.reflect.jvm.internal.impl.km.KmType kmType, kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Type.Builder builder, kotlin.reflect.jvm.internal.impl.km.internal.WriteContext writeContext);

    void writeTypeParameterExtensions(kotlin.reflect.jvm.internal.impl.km.KmTypeParameter kmTypeParameter, kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.TypeParameter.Builder builder, kotlin.reflect.jvm.internal.impl.km.internal.WriteContext writeContext);

    void writeValueParameterExtensions(kotlin.reflect.jvm.internal.impl.km.KmValueParameter kmValueParameter, kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.ValueParameter.Builder builder, kotlin.reflect.jvm.internal.impl.km.internal.WriteContext writeContext);

    public static final class Companion {
        static final /* synthetic */ kotlin.reflect.jvm.internal.impl.km.internal.extensions.MetadataExtensions.Companion Camera2StreamConfigurationMap = new kotlin.reflect.jvm.internal.impl.km.internal.extensions.MetadataExtensions.Companion();
        private static final kotlin.Lazy<java.util.List<kotlin.reflect.jvm.internal.impl.km.internal.extensions.MetadataExtensions>> getHighSpeedVideoFpsRangesFor = kotlin.LazyKt.lazy(new kotlin.jvm.functions.Function0() { // from class: kotlin.reflect.jvm.internal.impl.km.internal.extensions.MetadataExtensions$Companion$$Lambda$0
            @Override // kotlin.jvm.functions.Function0
            public java.lang.Object invoke() {
                return kotlin.reflect.jvm.internal.impl.km.internal.extensions.MetadataExtensions.Companion.getHighSpeedVideoFpsRanges();
            }
        });

        private Companion() {
        }

        public final java.util.List<kotlin.reflect.jvm.internal.impl.km.internal.extensions.MetadataExtensions> getINSTANCES$kotlin_metadata() {
            return getHighSpeedVideoFpsRangesFor.getValue();
        }

        static /* synthetic */ java.util.List getHighSpeedVideoFpsRanges() {
            java.util.ServiceLoader load = java.util.ServiceLoader.load(kotlin.reflect.jvm.internal.impl.km.internal.extensions.MetadataExtensions.class, kotlin.reflect.jvm.internal.impl.km.internal.extensions.MetadataExtensions.class.getClassLoader());
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(load, "");
            java.util.List list = kotlin.collections.CollectionsKt.toList(load);
            if (list.isEmpty()) {
                throw new java.lang.IllegalStateException("No MetadataExtensions instances found in the classpath. Please ensure that the META-INF/services/ is not stripped from your application and that the Java virtual machine is not running under a security manager".toString());
            }
            return list;
        }
    }
}
