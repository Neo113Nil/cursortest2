package kotlin.reflect.jvm.internal.impl.util;

/* loaded from: classes5.dex */
public interface ModuleVisibilityHelper {
    boolean isInFriendModule(kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor declarationDescriptor, kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor declarationDescriptor2);

    public static final class EMPTY implements kotlin.reflect.jvm.internal.impl.util.ModuleVisibilityHelper {
        public static final kotlin.reflect.jvm.internal.impl.util.ModuleVisibilityHelper.EMPTY INSTANCE = new kotlin.reflect.jvm.internal.impl.util.ModuleVisibilityHelper.EMPTY();

        private EMPTY() {
        }

        @Override // kotlin.reflect.jvm.internal.impl.util.ModuleVisibilityHelper
        public final boolean isInFriendModule(kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor declarationDescriptor, kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor declarationDescriptor2) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(declarationDescriptor, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(declarationDescriptor2, "");
            return true;
        }
    }
}
