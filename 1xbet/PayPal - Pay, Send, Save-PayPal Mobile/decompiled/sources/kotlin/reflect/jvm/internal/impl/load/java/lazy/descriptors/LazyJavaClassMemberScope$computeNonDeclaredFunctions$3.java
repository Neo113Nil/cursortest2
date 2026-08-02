package kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors;

/* loaded from: classes5.dex */
final /* synthetic */ class LazyJavaClassMemberScope$computeNonDeclaredFunctions$3 extends kotlin.jvm.internal.FunctionReferenceImpl implements kotlin.jvm.functions.Function1<kotlin.reflect.jvm.internal.impl.name.Name, java.util.Collection<? extends kotlin.reflect.jvm.internal.impl.descriptors.SimpleFunctionDescriptor>> {
    @Override // kotlin.jvm.functions.Function1
    public final /* synthetic */ java.util.Collection<? extends kotlin.reflect.jvm.internal.impl.descriptors.SimpleFunctionDescriptor> invoke(kotlin.reflect.jvm.internal.impl.name.Name name2) {
        java.util.Collection<? extends kotlin.reflect.jvm.internal.impl.descriptors.SimpleFunctionDescriptor> Camera2StreamConfigurationMap;
        kotlin.reflect.jvm.internal.impl.name.Name name3 = name2;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(name3, "");
        Camera2StreamConfigurationMap = ((kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaClassMemberScope) this.receiver).Camera2StreamConfigurationMap(name3);
        return Camera2StreamConfigurationMap;
    }

    LazyJavaClassMemberScope$computeNonDeclaredFunctions$3(java.lang.Object obj) {
        super(1, obj, kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaClassMemberScope.class, "searchMethodsByNameWithoutBuiltinMagic", "searchMethodsByNameWithoutBuiltinMagic(Lorg/jetbrains/kotlin/name/Name;)Ljava/util/Collection;", 0);
    }
}
