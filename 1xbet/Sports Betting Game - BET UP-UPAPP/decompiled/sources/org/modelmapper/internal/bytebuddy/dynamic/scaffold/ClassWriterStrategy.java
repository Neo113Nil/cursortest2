package org.modelmapper.internal.bytebuddy.dynamic.scaffold;

import org.modelmapper.internal.asm.ClassReader;
import org.modelmapper.internal.asm.ClassWriter;
import org.modelmapper.internal.bytebuddy.description.type.TypeDescription;
import org.modelmapper.internal.bytebuddy.pool.TypePool;

/* loaded from: classes4.dex */
public interface ClassWriterStrategy {
    ClassWriter resolve(int i, TypePool typePool);

    ClassWriter resolve(int i, TypePool typePool, ClassReader classReader);

    public enum Default implements ClassWriterStrategy {
        CONSTANT_POOL_RETAINING { // from class: org.modelmapper.internal.bytebuddy.dynamic.scaffold.ClassWriterStrategy.Default.1
            @Override // org.modelmapper.internal.bytebuddy.dynamic.scaffold.ClassWriterStrategy
            public ClassWriter resolve(int i, TypePool typePool, ClassReader classReader) {
                return new FrameComputingClassWriter(classReader, i, typePool);
            }
        },
        CONSTANT_POOL_DISCARDING { // from class: org.modelmapper.internal.bytebuddy.dynamic.scaffold.ClassWriterStrategy.Default.2
            @Override // org.modelmapper.internal.bytebuddy.dynamic.scaffold.ClassWriterStrategy
            public ClassWriter resolve(int i, TypePool typePool, ClassReader classReader) {
                return resolve(i, typePool);
            }
        };

        @Override // org.modelmapper.internal.bytebuddy.dynamic.scaffold.ClassWriterStrategy
        public ClassWriter resolve(int i, TypePool typePool) {
            return new FrameComputingClassWriter(i, typePool);
        }
    }

    public static class FrameComputingClassWriter extends ClassWriter {
        private final TypePool typePool;

        public FrameComputingClassWriter(int i, TypePool typePool) {
            super(i);
            this.typePool = typePool;
        }

        public FrameComputingClassWriter(ClassReader classReader, int i, TypePool typePool) {
            super(classReader, i);
            this.typePool = typePool;
        }

        @Override // org.modelmapper.internal.asm.ClassWriter
        protected String getCommonSuperClass(String str, String str2) {
            TypeDescription resolve = this.typePool.describe(str.replace('/', TypePool.Default.LazyTypeDescription.GenericTypeToken.INNER_CLASS_PATH)).resolve();
            TypeDescription resolve2 = this.typePool.describe(str2.replace('/', TypePool.Default.LazyTypeDescription.GenericTypeToken.INNER_CLASS_PATH)).resolve();
            if (resolve.isAssignableFrom(resolve2)) {
                return resolve.getInternalName();
            }
            if (resolve.isAssignableTo(resolve2)) {
                return resolve2.getInternalName();
            }
            if (resolve.isInterface() || resolve2.isInterface()) {
                return TypeDescription.OBJECT.getInternalName();
            }
            do {
                resolve = resolve.getSuperClass().asErasure();
            } while (!resolve.isAssignableFrom(resolve2));
            return resolve.getInternalName();
        }
    }
}
