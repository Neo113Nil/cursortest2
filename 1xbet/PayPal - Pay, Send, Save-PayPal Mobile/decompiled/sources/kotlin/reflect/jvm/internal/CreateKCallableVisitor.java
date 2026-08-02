package kotlin.reflect.jvm.internal;

@kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0010\u0018\u00002\u0012\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J!\u0010\b\u001a\u0006\u0012\u0002\b\u00030\u00022\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\u0003H\u0016¢\u0006\u0002\u0010\fJ!\u0010\r\u001a\u0006\u0012\u0002\b\u00030\u00022\u0006\u0010\t\u001a\u00020\u000e2\u0006\u0010\u000b\u001a\u00020\u0003H\u0016¢\u0006\u0002\u0010\u000fR\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0010"}, d2 = {"Lkotlin/reflect/jvm/internal/CreateKCallableVisitor;", "Lkotlin/reflect/jvm/internal/impl/descriptors/impl/DeclarationDescriptorVisitorEmptyBodies;", "Lkotlin/reflect/jvm/internal/DescriptorKCallable;", "", "container", "Lkotlin/reflect/jvm/internal/KDeclarationContainerImpl;", "<init>", "(Lkotlin/reflect/jvm/internal/KDeclarationContainerImpl;)V", "visitPropertyDescriptor", "descriptor", "Lkotlin/reflect/jvm/internal/impl/descriptors/PropertyDescriptor;", com.google.firebase.messaging.Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "(Lorg/jetbrains/kotlin/descriptors/PropertyDescriptor;Lkotlin/Unit;)Lkotlin/reflect/jvm/internal/DescriptorKCallable;", "visitFunctionDescriptor", "Lkotlin/reflect/jvm/internal/impl/descriptors/FunctionDescriptor;", "(Lorg/jetbrains/kotlin/descriptors/FunctionDescriptor;Lkotlin/Unit;)Lkotlin/reflect/jvm/internal/DescriptorKCallable;", "kotlin-reflection"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public class CreateKCallableVisitor extends kotlin.reflect.jvm.internal.impl.descriptors.impl.DeclarationDescriptorVisitorEmptyBodies<kotlin.reflect.jvm.internal.DescriptorKCallable<?>, kotlin.Unit> {
    private final kotlin.reflect.jvm.internal.KDeclarationContainerImpl getHighSpeedVideoSizes;

    public CreateKCallableVisitor(kotlin.reflect.jvm.internal.KDeclarationContainerImpl kDeclarationContainerImpl) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(kDeclarationContainerImpl, "");
        this.getHighSpeedVideoSizes = kDeclarationContainerImpl;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.impl.DeclarationDescriptorVisitorEmptyBodies, kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptorVisitor
    public kotlin.reflect.jvm.internal.DescriptorKCallable<?> visitPropertyDescriptor(kotlin.reflect.jvm.internal.impl.descriptors.PropertyDescriptor propertyDescriptor, kotlin.Unit unit) {
        int i;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(propertyDescriptor, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(unit, "");
        java.util.List<kotlin.reflect.jvm.internal.impl.descriptors.ReceiverParameterDescriptor> contextReceiverParameters = propertyDescriptor.getContextReceiverParameters();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(contextReceiverParameters, "");
        if (contextReceiverParameters.isEmpty()) {
            i = (propertyDescriptor.getDispatchReceiverParameter() != null ? 1 : 0) + (propertyDescriptor.getExtensionReceiverParameter() != null ? 1 : 0);
        } else {
            i = -1;
        }
        if (propertyDescriptor.isVar()) {
            if (i == -1) {
                return new kotlin.reflect.jvm.internal.DescriptorKMutablePropertyN(this.getHighSpeedVideoSizes, propertyDescriptor);
            }
            if (i == 0) {
                return new kotlin.reflect.jvm.internal.DescriptorKMutableProperty0(this.getHighSpeedVideoSizes, propertyDescriptor);
            }
            if (i == 1) {
                return new kotlin.reflect.jvm.internal.DescriptorKMutableProperty1(this.getHighSpeedVideoSizes, propertyDescriptor);
            }
            return new kotlin.reflect.jvm.internal.DescriptorKMutableProperty2(this.getHighSpeedVideoSizes, propertyDescriptor);
        }
        if (i == -1) {
            return new kotlin.reflect.jvm.internal.DescriptorKPropertyN(this.getHighSpeedVideoSizes, propertyDescriptor);
        }
        if (i == 0) {
            return new kotlin.reflect.jvm.internal.DescriptorKProperty0(this.getHighSpeedVideoSizes, propertyDescriptor);
        }
        if (i == 1) {
            return new kotlin.reflect.jvm.internal.DescriptorKProperty1(this.getHighSpeedVideoSizes, propertyDescriptor);
        }
        return new kotlin.reflect.jvm.internal.DescriptorKProperty2(this.getHighSpeedVideoSizes, propertyDescriptor);
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.impl.DeclarationDescriptorVisitorEmptyBodies, kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptorVisitor
    public kotlin.reflect.jvm.internal.DescriptorKCallable<?> visitFunctionDescriptor(kotlin.reflect.jvm.internal.impl.descriptors.FunctionDescriptor functionDescriptor, kotlin.Unit unit) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(functionDescriptor, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(unit, "");
        return new kotlin.reflect.jvm.internal.DescriptorKFunction(this.getHighSpeedVideoSizes, functionDescriptor);
    }
}
