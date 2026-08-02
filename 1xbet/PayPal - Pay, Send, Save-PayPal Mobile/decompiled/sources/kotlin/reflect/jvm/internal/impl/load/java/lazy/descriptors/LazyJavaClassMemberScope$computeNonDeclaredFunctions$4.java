package kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors;

/* loaded from: classes5.dex */
final /* synthetic */ class LazyJavaClassMemberScope$computeNonDeclaredFunctions$4 extends kotlin.jvm.internal.FunctionReferenceImpl implements kotlin.jvm.functions.Function1<kotlin.reflect.jvm.internal.impl.name.Name, java.util.Collection<? extends kotlin.reflect.jvm.internal.impl.descriptors.SimpleFunctionDescriptor>> {
    @Override // kotlin.jvm.functions.Function1
    public final /* synthetic */ java.util.Collection<? extends kotlin.reflect.jvm.internal.impl.descriptors.SimpleFunctionDescriptor> invoke(kotlin.reflect.jvm.internal.impl.name.Name name2) {
        java.util.Collection<? extends kotlin.reflect.jvm.internal.impl.descriptors.SimpleFunctionDescriptor> highSpeedVideoSizes;
        kotlin.reflect.jvm.internal.impl.name.Name name3 = name2;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(name3, "");
        highSpeedVideoSizes = ((kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaClassMemberScope) this.receiver).getHighSpeedVideoSizes(name3);
        return highSpeedVideoSizes;
    }

    LazyJavaClassMemberScope$computeNonDeclaredFunctions$4(java.lang.Object obj) {
        super(1, obj, kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaClassMemberScope.class, "searchMethodsInSupertypesWithoutBuiltinMagic", "searchMethodsInSupertypesWithoutBuiltinMagic(Lorg/jetbrains/kotlin/name/Name;)Ljava/util/Collection;", 0);
    }
}
