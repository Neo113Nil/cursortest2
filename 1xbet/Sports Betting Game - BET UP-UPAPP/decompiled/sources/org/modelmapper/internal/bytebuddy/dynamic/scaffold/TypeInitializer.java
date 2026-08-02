package org.modelmapper.internal.bytebuddy.dynamic.scaffold;

import com.ironsource.mediationsdk.logger.IronSourceError;
import org.modelmapper.internal.asm.ClassVisitor;
import org.modelmapper.internal.asm.MethodVisitor;
import org.modelmapper.internal.bytebuddy.build.HashCodeAndEqualsPlugin;
import org.modelmapper.internal.bytebuddy.description.method.MethodDescription;
import org.modelmapper.internal.bytebuddy.description.type.TypeDescription;
import org.modelmapper.internal.bytebuddy.dynamic.scaffold.TypeWriter;
import org.modelmapper.internal.bytebuddy.implementation.Implementation;
import org.modelmapper.internal.bytebuddy.implementation.attribute.AnnotationValueFilter;
import org.modelmapper.internal.bytebuddy.implementation.bytecode.ByteCodeAppender;

/* loaded from: classes4.dex */
public interface TypeInitializer extends ByteCodeAppender {
    TypeInitializer expandWith(ByteCodeAppender byteCodeAppender);

    boolean isDefined();

    TypeWriter.MethodPool.Record wrap(TypeWriter.MethodPool.Record record);

    public interface Drain {
        void apply(ClassVisitor classVisitor, TypeInitializer typeInitializer, Implementation.Context context);

        @HashCodeAndEqualsPlugin.Enhance
        public static class Default implements Drain {
            protected final AnnotationValueFilter.Factory annotationValueFilterFactory;
            protected final TypeDescription instrumentedType;
            protected final TypeWriter.MethodPool methodPool;

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (obj == null || getClass() != obj.getClass()) {
                    return false;
                }
                Default r5 = (Default) obj;
                return this.instrumentedType.equals(r5.instrumentedType) && this.methodPool.equals(r5.methodPool) && this.annotationValueFilterFactory.equals(r5.annotationValueFilterFactory);
            }

            public int hashCode() {
                return ((((IronSourceError.ERROR_NON_EXISTENT_INSTANCE + this.instrumentedType.hashCode()) * 31) + this.methodPool.hashCode()) * 31) + this.annotationValueFilterFactory.hashCode();
            }

            public Default(TypeDescription typeDescription, TypeWriter.MethodPool methodPool, AnnotationValueFilter.Factory factory) {
                this.instrumentedType = typeDescription;
                this.methodPool = methodPool;
                this.annotationValueFilterFactory = factory;
            }

            @Override // org.modelmapper.internal.bytebuddy.dynamic.scaffold.TypeInitializer.Drain
            public void apply(ClassVisitor classVisitor, TypeInitializer typeInitializer, Implementation.Context context) {
                typeInitializer.wrap(this.methodPool.target(new MethodDescription.Latent.TypeInitializer(this.instrumentedType))).apply(classVisitor, context, this.annotationValueFilterFactory);
            }
        }
    }

    public enum None implements TypeInitializer {
        INSTANCE;

        @Override // org.modelmapper.internal.bytebuddy.dynamic.scaffold.TypeInitializer
        public boolean isDefined() {
            return false;
        }

        @Override // org.modelmapper.internal.bytebuddy.dynamic.scaffold.TypeInitializer
        public TypeWriter.MethodPool.Record wrap(TypeWriter.MethodPool.Record record) {
            return record;
        }

        @Override // org.modelmapper.internal.bytebuddy.dynamic.scaffold.TypeInitializer
        public TypeInitializer expandWith(ByteCodeAppender byteCodeAppender) {
            return new Simple(byteCodeAppender);
        }

        @Override // org.modelmapper.internal.bytebuddy.implementation.bytecode.ByteCodeAppender
        public ByteCodeAppender.Size apply(MethodVisitor methodVisitor, Implementation.Context context, MethodDescription methodDescription) {
            return new ByteCodeAppender.Size(0, 0);
        }
    }

    @HashCodeAndEqualsPlugin.Enhance
    public static class Simple implements TypeInitializer {
        private final ByteCodeAppender byteCodeAppender;

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return obj != null && getClass() == obj.getClass() && this.byteCodeAppender.equals(((Simple) obj).byteCodeAppender);
        }

        public int hashCode() {
            return IronSourceError.ERROR_NON_EXISTENT_INSTANCE + this.byteCodeAppender.hashCode();
        }

        @Override // org.modelmapper.internal.bytebuddy.dynamic.scaffold.TypeInitializer
        public boolean isDefined() {
            return true;
        }

        public Simple(ByteCodeAppender byteCodeAppender) {
            this.byteCodeAppender = byteCodeAppender;
        }

        @Override // org.modelmapper.internal.bytebuddy.dynamic.scaffold.TypeInitializer
        public TypeInitializer expandWith(ByteCodeAppender byteCodeAppender) {
            return new Simple(new ByteCodeAppender.Compound(this.byteCodeAppender, byteCodeAppender));
        }

        @Override // org.modelmapper.internal.bytebuddy.dynamic.scaffold.TypeInitializer
        public TypeWriter.MethodPool.Record wrap(TypeWriter.MethodPool.Record record) {
            return record.prepend(this.byteCodeAppender);
        }

        @Override // org.modelmapper.internal.bytebuddy.implementation.bytecode.ByteCodeAppender
        public ByteCodeAppender.Size apply(MethodVisitor methodVisitor, Implementation.Context context, MethodDescription methodDescription) {
            return this.byteCodeAppender.apply(methodVisitor, context, methodDescription);
        }
    }
}
