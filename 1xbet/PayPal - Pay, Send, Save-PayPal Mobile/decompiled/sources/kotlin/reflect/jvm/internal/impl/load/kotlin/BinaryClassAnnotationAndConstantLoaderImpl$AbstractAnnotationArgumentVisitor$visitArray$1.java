package kotlin.reflect.jvm.internal.impl.load.kotlin;

/* loaded from: classes5.dex */
public final class BinaryClassAnnotationAndConstantLoaderImpl$AbstractAnnotationArgumentVisitor$visitArray$1 implements kotlin.reflect.jvm.internal.impl.load.kotlin.KotlinJvmBinaryClass.AnnotationArrayArgumentVisitor {
    private final java.util.ArrayList<kotlin.reflect.jvm.internal.impl.resolve.constants.ConstantValue<?>> Camera2StreamConfigurationMap = new java.util.ArrayList<>();
    final /* synthetic */ kotlin.reflect.jvm.internal.impl.load.kotlin.BinaryClassAnnotationAndConstantLoaderImpl getHighSpeedVideoFpsRanges;
    final /* synthetic */ kotlin.reflect.jvm.internal.impl.name.Name getHighSpeedVideoFpsRangesFor;
    final /* synthetic */ kotlin.reflect.jvm.internal.impl.load.kotlin.BinaryClassAnnotationAndConstantLoaderImpl.AbstractAnnotationArgumentVisitor getHighSpeedVideoSizes;

    BinaryClassAnnotationAndConstantLoaderImpl$AbstractAnnotationArgumentVisitor$visitArray$1(kotlin.reflect.jvm.internal.impl.load.kotlin.BinaryClassAnnotationAndConstantLoaderImpl binaryClassAnnotationAndConstantLoaderImpl, kotlin.reflect.jvm.internal.impl.name.Name name2, kotlin.reflect.jvm.internal.impl.load.kotlin.BinaryClassAnnotationAndConstantLoaderImpl.AbstractAnnotationArgumentVisitor abstractAnnotationArgumentVisitor) {
        this.getHighSpeedVideoFpsRanges = binaryClassAnnotationAndConstantLoaderImpl;
        this.getHighSpeedVideoFpsRangesFor = name2;
        this.getHighSpeedVideoSizes = abstractAnnotationArgumentVisitor;
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.kotlin.KotlinJvmBinaryClass.AnnotationArrayArgumentVisitor
    public final void visit(java.lang.Object obj) {
        this.Camera2StreamConfigurationMap.add(kotlin.reflect.jvm.internal.impl.load.kotlin.BinaryClassAnnotationAndConstantLoaderImpl.access$createConstant(this.getHighSpeedVideoFpsRanges, this.getHighSpeedVideoFpsRangesFor, obj));
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.kotlin.KotlinJvmBinaryClass.AnnotationArrayArgumentVisitor
    public final void visitEnum(kotlin.reflect.jvm.internal.impl.name.ClassId classId, kotlin.reflect.jvm.internal.impl.name.Name name2) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(classId, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(name2, "");
        this.Camera2StreamConfigurationMap.add(new kotlin.reflect.jvm.internal.impl.resolve.constants.EnumValue(classId, name2));
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.kotlin.KotlinJvmBinaryClass.AnnotationArrayArgumentVisitor
    public final void visitClassLiteral(kotlin.reflect.jvm.internal.impl.resolve.constants.ClassLiteralValue classLiteralValue) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(classLiteralValue, "");
        this.Camera2StreamConfigurationMap.add(new kotlin.reflect.jvm.internal.impl.resolve.constants.KClassValue(classLiteralValue));
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.kotlin.KotlinJvmBinaryClass.AnnotationArrayArgumentVisitor
    public final kotlin.reflect.jvm.internal.impl.load.kotlin.KotlinJvmBinaryClass.AnnotationArgumentVisitor visitAnnotation(kotlin.reflect.jvm.internal.impl.name.ClassId classId) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(classId, "");
        final java.util.ArrayList arrayList = new java.util.ArrayList();
        kotlin.reflect.jvm.internal.impl.load.kotlin.BinaryClassAnnotationAndConstantLoaderImpl binaryClassAnnotationAndConstantLoaderImpl = this.getHighSpeedVideoFpsRanges;
        kotlin.reflect.jvm.internal.impl.descriptors.SourceElement sourceElement = kotlin.reflect.jvm.internal.impl.descriptors.SourceElement.NO_SOURCE;
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(sourceElement, "");
        final kotlin.reflect.jvm.internal.impl.load.kotlin.KotlinJvmBinaryClass.AnnotationArgumentVisitor loadAnnotation = binaryClassAnnotationAndConstantLoaderImpl.loadAnnotation(classId, sourceElement, arrayList);
        kotlin.jvm.internal.Intrinsics.checkNotNull(loadAnnotation);
        return new kotlin.reflect.jvm.internal.impl.load.kotlin.KotlinJvmBinaryClass.AnnotationArgumentVisitor(this, arrayList) { // from class: kotlin.reflect.jvm.internal.impl.load.kotlin.BinaryClassAnnotationAndConstantLoaderImpl$AbstractAnnotationArgumentVisitor$visitArray$1$visitAnnotation$1
            private final /* synthetic */ kotlin.reflect.jvm.internal.impl.load.kotlin.KotlinJvmBinaryClass.AnnotationArgumentVisitor getHighResolutionOutputSizeshNQ4ISI;
            final /* synthetic */ java.util.ArrayList<kotlin.reflect.jvm.internal.impl.descriptors.annotations.AnnotationDescriptor> getHighSpeedVideoFpsRanges;
            final /* synthetic */ kotlin.reflect.jvm.internal.impl.load.kotlin.BinaryClassAnnotationAndConstantLoaderImpl$AbstractAnnotationArgumentVisitor$visitArray$1 getHighSpeedVideoSizes;

            {
                this.getHighSpeedVideoSizes = this;
                this.getHighSpeedVideoFpsRanges = arrayList;
                this.getHighResolutionOutputSizeshNQ4ISI = kotlin.reflect.jvm.internal.impl.load.kotlin.KotlinJvmBinaryClass.AnnotationArgumentVisitor.this;
            }

            @Override // kotlin.reflect.jvm.internal.impl.load.kotlin.KotlinJvmBinaryClass.AnnotationArgumentVisitor
            public final void visitEnd() {
                java.util.ArrayList arrayList2;
                kotlin.reflect.jvm.internal.impl.load.kotlin.KotlinJvmBinaryClass.AnnotationArgumentVisitor.this.visitEnd();
                arrayList2 = this.getHighSpeedVideoSizes.Camera2StreamConfigurationMap;
                arrayList2.add(new kotlin.reflect.jvm.internal.impl.resolve.constants.AnnotationValue((kotlin.reflect.jvm.internal.impl.descriptors.annotations.AnnotationDescriptor) kotlin.collections.CollectionsKt.single((java.util.List) this.getHighSpeedVideoFpsRanges)));
            }

            @Override // kotlin.reflect.jvm.internal.impl.load.kotlin.KotlinJvmBinaryClass.AnnotationArgumentVisitor
            public final void visitEnum(kotlin.reflect.jvm.internal.impl.name.Name name2, kotlin.reflect.jvm.internal.impl.name.ClassId classId2, kotlin.reflect.jvm.internal.impl.name.Name name3) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(classId2, "");
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(name3, "");
                this.getHighResolutionOutputSizeshNQ4ISI.visitEnum(name2, classId2, name3);
            }

            @Override // kotlin.reflect.jvm.internal.impl.load.kotlin.KotlinJvmBinaryClass.AnnotationArgumentVisitor
            public final void visitClassLiteral(kotlin.reflect.jvm.internal.impl.name.Name name2, kotlin.reflect.jvm.internal.impl.resolve.constants.ClassLiteralValue classLiteralValue) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(classLiteralValue, "");
                this.getHighResolutionOutputSizeshNQ4ISI.visitClassLiteral(name2, classLiteralValue);
            }

            @Override // kotlin.reflect.jvm.internal.impl.load.kotlin.KotlinJvmBinaryClass.AnnotationArgumentVisitor
            public final kotlin.reflect.jvm.internal.impl.load.kotlin.KotlinJvmBinaryClass.AnnotationArrayArgumentVisitor visitArray(kotlin.reflect.jvm.internal.impl.name.Name name2) {
                return this.getHighResolutionOutputSizeshNQ4ISI.visitArray(name2);
            }

            @Override // kotlin.reflect.jvm.internal.impl.load.kotlin.KotlinJvmBinaryClass.AnnotationArgumentVisitor
            public final kotlin.reflect.jvm.internal.impl.load.kotlin.KotlinJvmBinaryClass.AnnotationArgumentVisitor visitAnnotation(kotlin.reflect.jvm.internal.impl.name.Name name2, kotlin.reflect.jvm.internal.impl.name.ClassId classId2) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(classId2, "");
                return this.getHighResolutionOutputSizeshNQ4ISI.visitAnnotation(name2, classId2);
            }

            @Override // kotlin.reflect.jvm.internal.impl.load.kotlin.KotlinJvmBinaryClass.AnnotationArgumentVisitor
            public final void visit(kotlin.reflect.jvm.internal.impl.name.Name name2, java.lang.Object obj) {
                this.getHighResolutionOutputSizeshNQ4ISI.visit(name2, obj);
            }
        };
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.kotlin.KotlinJvmBinaryClass.AnnotationArrayArgumentVisitor
    public final void visitEnd() {
        this.getHighSpeedVideoSizes.visitArrayValue(this.getHighSpeedVideoFpsRangesFor, this.Camera2StreamConfigurationMap);
    }
}
