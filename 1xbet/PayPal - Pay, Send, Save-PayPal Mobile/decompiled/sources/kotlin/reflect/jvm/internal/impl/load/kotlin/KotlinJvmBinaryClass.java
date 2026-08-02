package kotlin.reflect.jvm.internal.impl.load.kotlin;

/* loaded from: classes5.dex */
public interface KotlinJvmBinaryClass {

    public interface AnnotationArgumentVisitor {
        void visit(kotlin.reflect.jvm.internal.impl.name.Name name2, java.lang.Object obj);

        kotlin.reflect.jvm.internal.impl.load.kotlin.KotlinJvmBinaryClass.AnnotationArgumentVisitor visitAnnotation(kotlin.reflect.jvm.internal.impl.name.Name name2, kotlin.reflect.jvm.internal.impl.name.ClassId classId);

        kotlin.reflect.jvm.internal.impl.load.kotlin.KotlinJvmBinaryClass.AnnotationArrayArgumentVisitor visitArray(kotlin.reflect.jvm.internal.impl.name.Name name2);

        void visitClassLiteral(kotlin.reflect.jvm.internal.impl.name.Name name2, kotlin.reflect.jvm.internal.impl.resolve.constants.ClassLiteralValue classLiteralValue);

        void visitEnd();

        void visitEnum(kotlin.reflect.jvm.internal.impl.name.Name name2, kotlin.reflect.jvm.internal.impl.name.ClassId classId, kotlin.reflect.jvm.internal.impl.name.Name name3);
    }

    public interface AnnotationArrayArgumentVisitor {
        void visit(java.lang.Object obj);

        kotlin.reflect.jvm.internal.impl.load.kotlin.KotlinJvmBinaryClass.AnnotationArgumentVisitor visitAnnotation(kotlin.reflect.jvm.internal.impl.name.ClassId classId);

        void visitClassLiteral(kotlin.reflect.jvm.internal.impl.resolve.constants.ClassLiteralValue classLiteralValue);

        void visitEnd();

        void visitEnum(kotlin.reflect.jvm.internal.impl.name.ClassId classId, kotlin.reflect.jvm.internal.impl.name.Name name2);
    }

    public interface AnnotationVisitor {
        kotlin.reflect.jvm.internal.impl.load.kotlin.KotlinJvmBinaryClass.AnnotationArgumentVisitor visitAnnotation(kotlin.reflect.jvm.internal.impl.name.ClassId classId, kotlin.reflect.jvm.internal.impl.descriptors.SourceElement sourceElement);

        void visitEnd();
    }

    public interface MemberVisitor {
        kotlin.reflect.jvm.internal.impl.load.kotlin.KotlinJvmBinaryClass.AnnotationVisitor visitField(kotlin.reflect.jvm.internal.impl.name.Name name2, java.lang.String str, java.lang.Object obj);

        kotlin.reflect.jvm.internal.impl.load.kotlin.KotlinJvmBinaryClass.MethodAnnotationVisitor visitMethod(kotlin.reflect.jvm.internal.impl.name.Name name2, java.lang.String str);
    }

    public interface MethodAnnotationVisitor extends kotlin.reflect.jvm.internal.impl.load.kotlin.KotlinJvmBinaryClass.AnnotationVisitor {
        kotlin.reflect.jvm.internal.impl.load.kotlin.KotlinJvmBinaryClass.AnnotationArgumentVisitor visitParameterAnnotation(int i, kotlin.reflect.jvm.internal.impl.name.ClassId classId, kotlin.reflect.jvm.internal.impl.descriptors.SourceElement sourceElement);
    }

    kotlin.reflect.jvm.internal.impl.load.kotlin.header.KotlinClassHeader getClassHeader();

    kotlin.reflect.jvm.internal.impl.name.ClassId getClassId();

    java.lang.String getLocation();

    void loadClassAnnotations(kotlin.reflect.jvm.internal.impl.load.kotlin.KotlinJvmBinaryClass.AnnotationVisitor annotationVisitor, byte[] bArr);

    void visitMembers(kotlin.reflect.jvm.internal.impl.load.kotlin.KotlinJvmBinaryClass.MemberVisitor memberVisitor, byte[] bArr);
}
