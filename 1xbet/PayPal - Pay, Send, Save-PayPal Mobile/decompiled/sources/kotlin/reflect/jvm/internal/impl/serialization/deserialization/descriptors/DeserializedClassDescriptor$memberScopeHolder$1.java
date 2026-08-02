package kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors;

/* loaded from: classes5.dex */
final /* synthetic */ class DeserializedClassDescriptor$memberScopeHolder$1 extends kotlin.jvm.internal.FunctionReferenceImpl implements kotlin.jvm.functions.Function1<kotlin.reflect.jvm.internal.impl.types.checker.KotlinTypeRefiner, kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedClassDescriptor.DeserializedClassMemberScope> {
    @Override // kotlin.jvm.functions.Function1
    public final /* synthetic */ kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedClassDescriptor.DeserializedClassMemberScope invoke(kotlin.reflect.jvm.internal.impl.types.checker.KotlinTypeRefiner kotlinTypeRefiner) {
        kotlin.reflect.jvm.internal.impl.types.checker.KotlinTypeRefiner kotlinTypeRefiner2 = kotlinTypeRefiner;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(kotlinTypeRefiner2, "");
        return new kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedClassDescriptor.DeserializedClassMemberScope((kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedClassDescriptor) this.receiver, kotlinTypeRefiner2);
    }

    DeserializedClassDescriptor$memberScopeHolder$1(java.lang.Object obj) {
        super(1, obj, kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedClassDescriptor.DeserializedClassMemberScope.class, "<init>", "<init>(Lorg/jetbrains/kotlin/serialization/deserialization/descriptors/DeserializedClassDescriptor;Lorg/jetbrains/kotlin/types/checker/KotlinTypeRefiner;)V", 0);
    }
}
