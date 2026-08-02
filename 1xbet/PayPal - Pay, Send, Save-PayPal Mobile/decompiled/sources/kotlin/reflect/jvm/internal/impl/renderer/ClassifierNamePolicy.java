package kotlin.reflect.jvm.internal.impl.renderer;

/* loaded from: classes5.dex */
public interface ClassifierNamePolicy {
    java.lang.String renderClassifier(kotlin.reflect.jvm.internal.impl.descriptors.ClassifierDescriptor classifierDescriptor, kotlin.reflect.jvm.internal.impl.renderer.DescriptorRenderer descriptorRenderer);

    public static final class SHORT implements kotlin.reflect.jvm.internal.impl.renderer.ClassifierNamePolicy {
        public static final kotlin.reflect.jvm.internal.impl.renderer.ClassifierNamePolicy.SHORT INSTANCE = new kotlin.reflect.jvm.internal.impl.renderer.ClassifierNamePolicy.SHORT();

        private SHORT() {
        }

        @Override // kotlin.reflect.jvm.internal.impl.renderer.ClassifierNamePolicy
        public final java.lang.String renderClassifier(kotlin.reflect.jvm.internal.impl.descriptors.ClassifierDescriptor classifierDescriptor, kotlin.reflect.jvm.internal.impl.renderer.DescriptorRenderer descriptorRenderer) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(classifierDescriptor, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(descriptorRenderer, "");
            if (classifierDescriptor instanceof kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor) {
                kotlin.reflect.jvm.internal.impl.name.Name name2 = ((kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor) classifierDescriptor).getName();
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(name2, "");
                return descriptorRenderer.renderName(name2, false);
            }
            java.util.ArrayList arrayList = new java.util.ArrayList();
            kotlin.reflect.jvm.internal.impl.descriptors.ClassifierDescriptor classifierDescriptor2 = classifierDescriptor;
            do {
                arrayList.add(classifierDescriptor2.getName());
                classifierDescriptor2 = classifierDescriptor2.getContainingDeclaration();
            } while (classifierDescriptor2 instanceof kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor);
            return kotlin.reflect.jvm.internal.impl.renderer.RenderingUtilsKt.renderFqName(kotlin.collections.CollectionsKt.asReversedMutable(arrayList));
        }
    }

    public static final class FULLY_QUALIFIED implements kotlin.reflect.jvm.internal.impl.renderer.ClassifierNamePolicy {
        public static final kotlin.reflect.jvm.internal.impl.renderer.ClassifierNamePolicy.FULLY_QUALIFIED INSTANCE = new kotlin.reflect.jvm.internal.impl.renderer.ClassifierNamePolicy.FULLY_QUALIFIED();

        private FULLY_QUALIFIED() {
        }

        @Override // kotlin.reflect.jvm.internal.impl.renderer.ClassifierNamePolicy
        public final java.lang.String renderClassifier(kotlin.reflect.jvm.internal.impl.descriptors.ClassifierDescriptor classifierDescriptor, kotlin.reflect.jvm.internal.impl.renderer.DescriptorRenderer descriptorRenderer) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(classifierDescriptor, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(descriptorRenderer, "");
            if (classifierDescriptor instanceof kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor) {
                kotlin.reflect.jvm.internal.impl.name.Name name2 = ((kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor) classifierDescriptor).getName();
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(name2, "");
                return descriptorRenderer.renderName(name2, false);
            }
            kotlin.reflect.jvm.internal.impl.name.FqNameUnsafe fqName = kotlin.reflect.jvm.internal.impl.resolve.DescriptorUtils.getFqName(classifierDescriptor);
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(fqName, "");
            return descriptorRenderer.renderFqName(fqName);
        }
    }

    public static final class SOURCE_CODE_QUALIFIED implements kotlin.reflect.jvm.internal.impl.renderer.ClassifierNamePolicy {
        public static final kotlin.reflect.jvm.internal.impl.renderer.ClassifierNamePolicy.SOURCE_CODE_QUALIFIED INSTANCE = new kotlin.reflect.jvm.internal.impl.renderer.ClassifierNamePolicy.SOURCE_CODE_QUALIFIED();

        private SOURCE_CODE_QUALIFIED() {
        }

        @Override // kotlin.reflect.jvm.internal.impl.renderer.ClassifierNamePolicy
        public final java.lang.String renderClassifier(kotlin.reflect.jvm.internal.impl.descriptors.ClassifierDescriptor classifierDescriptor, kotlin.reflect.jvm.internal.impl.renderer.DescriptorRenderer descriptorRenderer) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(classifierDescriptor, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(descriptorRenderer, "");
            return getHighSpeedVideoSizes(classifierDescriptor);
        }

        private final java.lang.String getHighSpeedVideoSizes(kotlin.reflect.jvm.internal.impl.descriptors.ClassifierDescriptor classifierDescriptor) {
            kotlin.reflect.jvm.internal.impl.name.Name name2 = classifierDescriptor.getName();
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(name2, "");
            java.lang.String str = null;
            java.lang.String render$default = kotlin.reflect.jvm.internal.impl.renderer.RenderingUtilsKt.render$default(name2, false, 1, null);
            if (!(classifierDescriptor instanceof kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor)) {
                kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor containingDeclaration = classifierDescriptor.getContainingDeclaration();
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(containingDeclaration, "");
                if (containingDeclaration instanceof kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor) {
                    str = getHighSpeedVideoSizes((kotlin.reflect.jvm.internal.impl.descriptors.ClassifierDescriptor) containingDeclaration);
                } else if (containingDeclaration instanceof kotlin.reflect.jvm.internal.impl.descriptors.PackageFragmentDescriptor) {
                    str = kotlin.reflect.jvm.internal.impl.renderer.RenderingUtilsKt.render(((kotlin.reflect.jvm.internal.impl.descriptors.PackageFragmentDescriptor) containingDeclaration).getFqName().toUnsafe());
                }
                if (str != null && !kotlin.jvm.internal.Intrinsics.areEqual(str, "")) {
                    java.lang.StringBuilder sb = new java.lang.StringBuilder();
                    sb.append(str);
                    sb.append(com.paypal.oslo.core.money.MoneyKt.DECIMALSEPARATOR);
                    sb.append(render$default);
                    return sb.toString();
                }
            }
            return render$default;
        }
    }
}
