package org.modelmapper.internal.bytebuddy.implementation.attribute;

import com.ironsource.mediationsdk.logger.IronSourceError;
import java.lang.annotation.RetentionPolicy;
import java.lang.reflect.Array;
import java.util.Iterator;
import java.util.List;
import org.modelmapper.internal.asm.AnnotationVisitor;
import org.modelmapper.internal.asm.ClassVisitor;
import org.modelmapper.internal.asm.FieldVisitor;
import org.modelmapper.internal.asm.MethodVisitor;
import org.modelmapper.internal.asm.Type;
import org.modelmapper.internal.asm.TypePath;
import org.modelmapper.internal.asm.TypeReference;
import org.modelmapper.internal.bytebuddy.build.HashCodeAndEqualsPlugin;
import org.modelmapper.internal.bytebuddy.description.annotation.AnnotationDescription;
import org.modelmapper.internal.bytebuddy.description.enumeration.EnumerationDescription;
import org.modelmapper.internal.bytebuddy.description.method.MethodDescription;
import org.modelmapper.internal.bytebuddy.description.type.TypeDescription;
import org.modelmapper.internal.bytebuddy.description.type.TypeList;
import org.modelmapper.internal.bytebuddy.implementation.attribute.AnnotationValueFilter;

/* loaded from: classes4.dex */
public interface AnnotationAppender {
    public static final String NO_NAME = null;

    AnnotationAppender append(AnnotationDescription annotationDescription, AnnotationValueFilter annotationValueFilter);

    AnnotationAppender append(AnnotationDescription annotationDescription, AnnotationValueFilter annotationValueFilter, int i, String str);

    public interface Target {
        AnnotationVisitor visit(String str, boolean z);

        AnnotationVisitor visit(String str, boolean z, int i, String str2);

        @HashCodeAndEqualsPlugin.Enhance
        public static class OnType implements Target {
            private final ClassVisitor classVisitor;

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return obj != null && getClass() == obj.getClass() && this.classVisitor.equals(((OnType) obj).classVisitor);
            }

            public int hashCode() {
                return IronSourceError.ERROR_NON_EXISTENT_INSTANCE + this.classVisitor.hashCode();
            }

            public OnType(ClassVisitor classVisitor) {
                this.classVisitor = classVisitor;
            }

            @Override // org.modelmapper.internal.bytebuddy.implementation.attribute.AnnotationAppender.Target
            public AnnotationVisitor visit(String str, boolean z) {
                return this.classVisitor.visitAnnotation(str, z);
            }

            @Override // org.modelmapper.internal.bytebuddy.implementation.attribute.AnnotationAppender.Target
            public AnnotationVisitor visit(String str, boolean z, int i, String str2) {
                return this.classVisitor.visitTypeAnnotation(i, TypePath.fromString(str2), str, z);
            }
        }

        @HashCodeAndEqualsPlugin.Enhance
        public static class OnMethod implements Target {
            private final MethodVisitor methodVisitor;

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return obj != null && getClass() == obj.getClass() && this.methodVisitor.equals(((OnMethod) obj).methodVisitor);
            }

            public int hashCode() {
                return IronSourceError.ERROR_NON_EXISTENT_INSTANCE + this.methodVisitor.hashCode();
            }

            public OnMethod(MethodVisitor methodVisitor) {
                this.methodVisitor = methodVisitor;
            }

            @Override // org.modelmapper.internal.bytebuddy.implementation.attribute.AnnotationAppender.Target
            public AnnotationVisitor visit(String str, boolean z) {
                return this.methodVisitor.visitAnnotation(str, z);
            }

            @Override // org.modelmapper.internal.bytebuddy.implementation.attribute.AnnotationAppender.Target
            public AnnotationVisitor visit(String str, boolean z, int i, String str2) {
                return this.methodVisitor.visitTypeAnnotation(i, TypePath.fromString(str2), str, z);
            }
        }

        @HashCodeAndEqualsPlugin.Enhance
        public static class OnMethodParameter implements Target {
            private final MethodVisitor methodVisitor;
            private final int parameterIndex;

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (obj == null || getClass() != obj.getClass()) {
                    return false;
                }
                OnMethodParameter onMethodParameter = (OnMethodParameter) obj;
                return this.methodVisitor.equals(onMethodParameter.methodVisitor) && this.parameterIndex == onMethodParameter.parameterIndex;
            }

            public int hashCode() {
                return ((IronSourceError.ERROR_NON_EXISTENT_INSTANCE + this.methodVisitor.hashCode()) * 31) + this.parameterIndex;
            }

            public OnMethodParameter(MethodVisitor methodVisitor, int i) {
                this.methodVisitor = methodVisitor;
                this.parameterIndex = i;
            }

            @Override // org.modelmapper.internal.bytebuddy.implementation.attribute.AnnotationAppender.Target
            public AnnotationVisitor visit(String str, boolean z) {
                return this.methodVisitor.visitParameterAnnotation(this.parameterIndex, str, z);
            }

            @Override // org.modelmapper.internal.bytebuddy.implementation.attribute.AnnotationAppender.Target
            public AnnotationVisitor visit(String str, boolean z, int i, String str2) {
                return this.methodVisitor.visitTypeAnnotation(i, TypePath.fromString(str2), str, z);
            }
        }

        @HashCodeAndEqualsPlugin.Enhance
        public static class OnField implements Target {
            private final FieldVisitor fieldVisitor;

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return obj != null && getClass() == obj.getClass() && this.fieldVisitor.equals(((OnField) obj).fieldVisitor);
            }

            public int hashCode() {
                return IronSourceError.ERROR_NON_EXISTENT_INSTANCE + this.fieldVisitor.hashCode();
            }

            public OnField(FieldVisitor fieldVisitor) {
                this.fieldVisitor = fieldVisitor;
            }

            @Override // org.modelmapper.internal.bytebuddy.implementation.attribute.AnnotationAppender.Target
            public AnnotationVisitor visit(String str, boolean z) {
                return this.fieldVisitor.visitAnnotation(str, z);
            }

            @Override // org.modelmapper.internal.bytebuddy.implementation.attribute.AnnotationAppender.Target
            public AnnotationVisitor visit(String str, boolean z, int i, String str2) {
                return this.fieldVisitor.visitTypeAnnotation(i, TypePath.fromString(str2), str, z);
            }
        }
    }

    @HashCodeAndEqualsPlugin.Enhance
    public static class Default implements AnnotationAppender {
        private final Target target;

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return obj != null && getClass() == obj.getClass() && this.target.equals(((Default) obj).target);
        }

        public int hashCode() {
            return IronSourceError.ERROR_NON_EXISTENT_INSTANCE + this.target.hashCode();
        }

        public Default(Target target) {
            this.target = target;
        }

        private static void handle(AnnotationVisitor annotationVisitor, AnnotationDescription annotationDescription, AnnotationValueFilter annotationValueFilter) {
            for (MethodDescription.InDefinedShape inDefinedShape : annotationDescription.getAnnotationType().getDeclaredMethods()) {
                if (annotationValueFilter.isRelevant(annotationDescription, inDefinedShape)) {
                    apply(annotationVisitor, inDefinedShape.getReturnType().asErasure(), inDefinedShape.getName(), annotationDescription.getValue(inDefinedShape).resolve());
                }
            }
            annotationVisitor.visitEnd();
        }

        public static void apply(AnnotationVisitor annotationVisitor, TypeDescription typeDescription, String str, Object obj) {
            if (typeDescription.isArray()) {
                AnnotationVisitor visitArray = annotationVisitor.visitArray(str);
                int length = Array.getLength(obj);
                TypeDescription componentType = typeDescription.getComponentType();
                for (int i = 0; i < length; i++) {
                    apply(visitArray, componentType, NO_NAME, Array.get(obj, i));
                }
                visitArray.visitEnd();
                return;
            }
            if (typeDescription.isAnnotation()) {
                handle(annotationVisitor.visitAnnotation(str, typeDescription.getDescriptor()), (AnnotationDescription) obj, AnnotationValueFilter.Default.APPEND_DEFAULTS);
                return;
            }
            if (typeDescription.isEnum()) {
                annotationVisitor.visitEnum(str, typeDescription.getDescriptor(), ((EnumerationDescription) obj).getValue());
            } else if (typeDescription.represents(Class.class)) {
                annotationVisitor.visit(str, Type.getType(((TypeDescription) obj).getDescriptor()));
            } else {
                annotationVisitor.visit(str, obj);
            }
        }

        @Override // org.modelmapper.internal.bytebuddy.implementation.attribute.AnnotationAppender
        public AnnotationAppender append(AnnotationDescription annotationDescription, AnnotationValueFilter annotationValueFilter) {
            int i = AnonymousClass1.$SwitchMap$java$lang$annotation$RetentionPolicy[annotationDescription.getRetention().ordinal()];
            if (i == 1) {
                doAppend(annotationDescription, true, annotationValueFilter);
            } else if (i == 2) {
                doAppend(annotationDescription, false, annotationValueFilter);
            } else if (i != 3) {
                throw new IllegalStateException("Unexpected retention policy: " + annotationDescription.getRetention());
            }
            return this;
        }

        private void doAppend(AnnotationDescription annotationDescription, boolean z, AnnotationValueFilter annotationValueFilter) {
            handle(this.target.visit(annotationDescription.getAnnotationType().getDescriptor(), z), annotationDescription, annotationValueFilter);
        }

        @Override // org.modelmapper.internal.bytebuddy.implementation.attribute.AnnotationAppender
        public AnnotationAppender append(AnnotationDescription annotationDescription, AnnotationValueFilter annotationValueFilter, int i, String str) {
            int i2 = AnonymousClass1.$SwitchMap$java$lang$annotation$RetentionPolicy[annotationDescription.getRetention().ordinal()];
            if (i2 == 1) {
                doAppend(annotationDescription, true, annotationValueFilter, i, str);
            } else if (i2 == 2) {
                doAppend(annotationDescription, false, annotationValueFilter, i, str);
            } else if (i2 != 3) {
                throw new IllegalStateException("Unexpected retention policy: " + annotationDescription.getRetention());
            }
            return this;
        }

        private void doAppend(AnnotationDescription annotationDescription, boolean z, AnnotationValueFilter annotationValueFilter, int i, String str) {
            handle(this.target.visit(annotationDescription.getAnnotationType().getDescriptor(), z, i, str), annotationDescription, annotationValueFilter);
        }
    }

    /* renamed from: org.modelmapper.internal.bytebuddy.implementation.attribute.AnnotationAppender$1, reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$java$lang$annotation$RetentionPolicy;

        static {
            int[] iArr = new int[RetentionPolicy.values().length];
            $SwitchMap$java$lang$annotation$RetentionPolicy = iArr;
            try {
                iArr[RetentionPolicy.RUNTIME.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$java$lang$annotation$RetentionPolicy[RetentionPolicy.CLASS.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$java$lang$annotation$RetentionPolicy[RetentionPolicy.SOURCE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    @HashCodeAndEqualsPlugin.Enhance
    public static class ForTypeAnnotations implements TypeDescription.Generic.Visitor<AnnotationAppender> {
        private static final char COMPONENT_TYPE_PATH = '[';
        private static final String EMPTY_TYPE_PATH = "";
        private static final char INDEXED_TYPE_DELIMITER = ';';
        private static final char INNER_CLASS_PATH = '.';
        private static final int SUPER_CLASS_INDEX = -1;
        public static final boolean VARIABLE_ON_INVOKEABLE = false;
        public static final boolean VARIABLE_ON_TYPE = true;
        private static final char WILDCARD_TYPE_PATH = '*';
        private final AnnotationAppender annotationAppender;
        private final AnnotationValueFilter annotationValueFilter;
        private final String typePath;
        private final int typeReference;

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            ForTypeAnnotations forTypeAnnotations = (ForTypeAnnotations) obj;
            return this.annotationAppender.equals(forTypeAnnotations.annotationAppender) && this.annotationValueFilter.equals(forTypeAnnotations.annotationValueFilter) && this.typeReference == forTypeAnnotations.typeReference && this.typePath.equals(forTypeAnnotations.typePath);
        }

        public int hashCode() {
            return ((((((IronSourceError.ERROR_NON_EXISTENT_INSTANCE + this.annotationAppender.hashCode()) * 31) + this.annotationValueFilter.hashCode()) * 31) + this.typeReference) * 31) + this.typePath.hashCode();
        }

        protected ForTypeAnnotations(AnnotationAppender annotationAppender, AnnotationValueFilter annotationValueFilter, TypeReference typeReference) {
            this(annotationAppender, annotationValueFilter, typeReference.getValue(), "");
        }

        protected ForTypeAnnotations(AnnotationAppender annotationAppender, AnnotationValueFilter annotationValueFilter, int i, String str) {
            this.annotationAppender = annotationAppender;
            this.annotationValueFilter = annotationValueFilter;
            this.typeReference = i;
            this.typePath = str;
        }

        public static TypeDescription.Generic.Visitor<AnnotationAppender> ofSuperClass(AnnotationAppender annotationAppender, AnnotationValueFilter annotationValueFilter) {
            return new ForTypeAnnotations(annotationAppender, annotationValueFilter, TypeReference.newSuperTypeReference(-1));
        }

        public static TypeDescription.Generic.Visitor<AnnotationAppender> ofInterfaceType(AnnotationAppender annotationAppender, AnnotationValueFilter annotationValueFilter, int i) {
            return new ForTypeAnnotations(annotationAppender, annotationValueFilter, TypeReference.newSuperTypeReference(i));
        }

        public static TypeDescription.Generic.Visitor<AnnotationAppender> ofFieldType(AnnotationAppender annotationAppender, AnnotationValueFilter annotationValueFilter) {
            return new ForTypeAnnotations(annotationAppender, annotationValueFilter, TypeReference.newTypeReference(19));
        }

        public static TypeDescription.Generic.Visitor<AnnotationAppender> ofMethodReturnType(AnnotationAppender annotationAppender, AnnotationValueFilter annotationValueFilter) {
            return new ForTypeAnnotations(annotationAppender, annotationValueFilter, TypeReference.newTypeReference(20));
        }

        public static TypeDescription.Generic.Visitor<AnnotationAppender> ofMethodParameterType(AnnotationAppender annotationAppender, AnnotationValueFilter annotationValueFilter, int i) {
            return new ForTypeAnnotations(annotationAppender, annotationValueFilter, TypeReference.newFormalParameterReference(i));
        }

        public static TypeDescription.Generic.Visitor<AnnotationAppender> ofExceptionType(AnnotationAppender annotationAppender, AnnotationValueFilter annotationValueFilter, int i) {
            return new ForTypeAnnotations(annotationAppender, annotationValueFilter, TypeReference.newExceptionReference(i));
        }

        public static TypeDescription.Generic.Visitor<AnnotationAppender> ofReceiverType(AnnotationAppender annotationAppender, AnnotationValueFilter annotationValueFilter) {
            return new ForTypeAnnotations(annotationAppender, annotationValueFilter, TypeReference.newTypeReference(21));
        }

        public static AnnotationAppender ofTypeVariable(AnnotationAppender annotationAppender, AnnotationValueFilter annotationValueFilter, boolean z, List<? extends TypeDescription.Generic> list) {
            return ofTypeVariable(annotationAppender, annotationValueFilter, z, 0, list);
        }

        public static AnnotationAppender ofTypeVariable(AnnotationAppender annotationAppender, AnnotationValueFilter annotationValueFilter, boolean z, int i, List<? extends TypeDescription.Generic> list) {
            int i2;
            int i3;
            if (z) {
                i2 = 17;
                i3 = 0;
            } else {
                i2 = 18;
                i3 = 1;
            }
            for (TypeDescription.Generic generic : list.subList(i, list.size())) {
                int value = TypeReference.newTypeParameterReference(i3, i).getValue();
                Iterator it = generic.getDeclaredAnnotations().iterator();
                while (it.hasNext()) {
                    annotationAppender = annotationAppender.append((AnnotationDescription) it.next(), annotationValueFilter, value, "");
                }
                int i4 = (((TypeDescription.Generic) generic.getUpperBounds().get(0)).getSort().isTypeVariable() || !((TypeDescription.Generic) generic.getUpperBounds().get(0)).isInterface()) ? 0 : 1;
                Iterator it2 = generic.getUpperBounds().iterator();
                while (it2.hasNext()) {
                    annotationAppender = (AnnotationAppender) ((TypeDescription.Generic) it2.next()).accept(new ForTypeAnnotations(annotationAppender, annotationValueFilter, TypeReference.newTypeParameterBoundReference(i2, i, i4)));
                    i4++;
                }
                i++;
            }
            return annotationAppender;
        }

        @Override // org.modelmapper.internal.bytebuddy.description.type.TypeDescription.Generic.Visitor
        public AnnotationAppender onGenericArray(TypeDescription.Generic generic) {
            return (AnnotationAppender) generic.getComponentType().accept(new ForTypeAnnotations(apply(generic, this.typePath), this.annotationValueFilter, this.typeReference, this.typePath + '['));
        }

        @Override // org.modelmapper.internal.bytebuddy.description.type.TypeDescription.Generic.Visitor
        public AnnotationAppender onWildcard(TypeDescription.Generic generic) {
            TypeDescription.Generic only;
            TypeList.Generic lowerBounds = generic.getLowerBounds();
            if (lowerBounds.isEmpty()) {
                only = generic.getUpperBounds().getOnly();
            } else {
                only = lowerBounds.getOnly();
            }
            return (AnnotationAppender) only.accept(new ForTypeAnnotations(apply(generic, this.typePath), this.annotationValueFilter, this.typeReference, this.typePath + '*'));
        }

        @Override // org.modelmapper.internal.bytebuddy.description.type.TypeDescription.Generic.Visitor
        public AnnotationAppender onParameterizedType(TypeDescription.Generic generic) {
            StringBuilder sb = new StringBuilder(this.typePath);
            int i = 0;
            for (int i2 = 0; i2 < generic.asErasure().getInnerClassCount(); i2++) {
                sb = sb.append('.');
            }
            AnnotationAppender apply = apply(generic, sb.toString());
            TypeDescription.Generic ownerType = generic.getOwnerType();
            if (ownerType != null) {
                apply = (AnnotationAppender) ownerType.accept(new ForTypeAnnotations(apply, this.annotationValueFilter, this.typeReference, this.typePath));
            }
            Iterator it = generic.getTypeArguments().iterator();
            while (it.hasNext()) {
                apply = (AnnotationAppender) ((TypeDescription.Generic) it.next()).accept(new ForTypeAnnotations(apply, this.annotationValueFilter, this.typeReference, sb.toString() + i + ';'));
                i++;
            }
            return apply;
        }

        @Override // org.modelmapper.internal.bytebuddy.description.type.TypeDescription.Generic.Visitor
        public AnnotationAppender onTypeVariable(TypeDescription.Generic generic) {
            return apply(generic, this.typePath);
        }

        @Override // org.modelmapper.internal.bytebuddy.description.type.TypeDescription.Generic.Visitor
        public AnnotationAppender onNonGenericType(TypeDescription.Generic generic) {
            StringBuilder sb = new StringBuilder(this.typePath);
            for (int i = 0; i < generic.asErasure().getInnerClassCount(); i++) {
                sb = sb.append('.');
            }
            AnnotationAppender apply = apply(generic, sb.toString());
            return generic.isArray() ? (AnnotationAppender) generic.getComponentType().accept(new ForTypeAnnotations(apply, this.annotationValueFilter, this.typeReference, this.typePath + '[')) : apply;
        }

        private AnnotationAppender apply(TypeDescription.Generic generic, String str) {
            AnnotationAppender annotationAppender = this.annotationAppender;
            Iterator it = generic.getDeclaredAnnotations().iterator();
            while (it.hasNext()) {
                annotationAppender = annotationAppender.append((AnnotationDescription) it.next(), this.annotationValueFilter, this.typeReference, str);
            }
            return annotationAppender;
        }
    }
}
