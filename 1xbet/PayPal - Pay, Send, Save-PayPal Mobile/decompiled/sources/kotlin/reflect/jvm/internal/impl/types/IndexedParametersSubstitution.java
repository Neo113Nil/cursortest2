package kotlin.reflect.jvm.internal.impl.types;

/* loaded from: classes5.dex */
public final class IndexedParametersSubstitution extends kotlin.reflect.jvm.internal.impl.types.TypeSubstitution {
    private final kotlin.reflect.jvm.internal.impl.types.TypeProjection[] getHighResolutionOutputSizeshNQ4ISI;
    private final kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor[] getHighSpeedVideoFpsRangesFor;
    private final boolean getHighSpeedVideoSizes;

    public IndexedParametersSubstitution(kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor[] typeParameterDescriptorArr, kotlin.reflect.jvm.internal.impl.types.TypeProjection[] typeProjectionArr, boolean z) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(typeParameterDescriptorArr, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(typeProjectionArr, "");
        this.getHighSpeedVideoFpsRangesFor = typeParameterDescriptorArr;
        this.getHighResolutionOutputSizeshNQ4ISI = typeProjectionArr;
        this.getHighSpeedVideoSizes = z;
        int length = typeParameterDescriptorArr.length;
        int length2 = typeProjectionArr.length;
    }

    public /* synthetic */ IndexedParametersSubstitution(kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor[] typeParameterDescriptorArr, kotlin.reflect.jvm.internal.impl.types.TypeProjection[] typeProjectionArr, boolean z, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(typeParameterDescriptorArr, typeProjectionArr, (i & 4) != 0 ? false : z);
    }

    public final kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor[] getParameters() {
        return this.getHighSpeedVideoFpsRangesFor;
    }

    public final kotlin.reflect.jvm.internal.impl.types.TypeProjection[] getArguments() {
        return this.getHighResolutionOutputSizeshNQ4ISI;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public IndexedParametersSubstitution(java.util.List<? extends kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor> list, java.util.List<? extends kotlin.reflect.jvm.internal.impl.types.TypeProjection> list2) {
        this((kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor[]) list.toArray(new kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor[0]), (kotlin.reflect.jvm.internal.impl.types.TypeProjection[]) list2.toArray(new kotlin.reflect.jvm.internal.impl.types.TypeProjection[0]), false, 4, null);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list2, "");
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.TypeSubstitution
    public final boolean isEmpty() {
        return this.getHighResolutionOutputSizeshNQ4ISI.length == 0;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.TypeSubstitution
    public final boolean approximateContravariantCapturedTypes() {
        return this.getHighSpeedVideoSizes;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.TypeSubstitution
    /* renamed from: get */
    public final kotlin.reflect.jvm.internal.impl.types.TypeProjection mo23902get(kotlin.reflect.jvm.internal.impl.types.KotlinType kotlinType) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(kotlinType, "");
        kotlin.reflect.jvm.internal.impl.descriptors.ClassifierDescriptor mo23898getDeclarationDescriptor = kotlinType.getConstructor().mo23898getDeclarationDescriptor();
        kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor typeParameterDescriptor = mo23898getDeclarationDescriptor instanceof kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor ? (kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor) mo23898getDeclarationDescriptor : null;
        if (typeParameterDescriptor == null) {
            return null;
        }
        int index = typeParameterDescriptor.getIndex();
        kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor[] typeParameterDescriptorArr = this.getHighSpeedVideoFpsRangesFor;
        if (index >= typeParameterDescriptorArr.length || !kotlin.jvm.internal.Intrinsics.areEqual(typeParameterDescriptorArr[index].getTypeConstructor(), typeParameterDescriptor.getTypeConstructor())) {
            return null;
        }
        return this.getHighResolutionOutputSizeshNQ4ISI[index];
    }
}
