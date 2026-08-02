package kotlin.reflect.jvm.internal.impl.descriptors.impl;

/* loaded from: classes5.dex */
public final class ModuleAwareClassDescriptorKt {
    public static final kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope getRefinedUnsubstitutedMemberScopeIfPossible(kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor classDescriptor, kotlin.reflect.jvm.internal.impl.types.checker.KotlinTypeRefiner kotlinTypeRefiner) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(classDescriptor, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(kotlinTypeRefiner, "");
        return kotlin.reflect.jvm.internal.impl.descriptors.impl.ModuleAwareClassDescriptor.Companion.getRefinedUnsubstitutedMemberScopeIfPossible$descriptors(classDescriptor, kotlinTypeRefiner);
    }

    public static final kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope getRefinedMemberScopeIfPossible(kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor classDescriptor, kotlin.reflect.jvm.internal.impl.types.TypeSubstitution typeSubstitution, kotlin.reflect.jvm.internal.impl.types.checker.KotlinTypeRefiner kotlinTypeRefiner) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(classDescriptor, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(typeSubstitution, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(kotlinTypeRefiner, "");
        return kotlin.reflect.jvm.internal.impl.descriptors.impl.ModuleAwareClassDescriptor.Companion.getRefinedMemberScopeIfPossible$descriptors(classDescriptor, typeSubstitution, kotlinTypeRefiner);
    }
}
