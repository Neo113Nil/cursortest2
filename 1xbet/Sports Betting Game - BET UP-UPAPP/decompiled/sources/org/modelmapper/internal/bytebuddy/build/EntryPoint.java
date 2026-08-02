package org.modelmapper.internal.bytebuddy.build;

import org.modelmapper.internal.bytebuddy.ByteBuddy;
import org.modelmapper.internal.bytebuddy.ClassFileVersion;
import org.modelmapper.internal.bytebuddy.description.type.TypeDescription;
import org.modelmapper.internal.bytebuddy.dynamic.ClassFileLocator;
import org.modelmapper.internal.bytebuddy.dynamic.DynamicType;
import org.modelmapper.internal.bytebuddy.dynamic.scaffold.MethodGraph;
import org.modelmapper.internal.bytebuddy.dynamic.scaffold.inline.MethodNameTransformer;
import org.modelmapper.internal.bytebuddy.implementation.Implementation;
import org.modelmapper.internal.bytebuddy.matcher.ElementMatchers;

/* loaded from: classes4.dex */
public interface EntryPoint {

    public enum Default implements EntryPoint {
        REBASE { // from class: org.modelmapper.internal.bytebuddy.build.EntryPoint.Default.1
            @Override // org.modelmapper.internal.bytebuddy.build.EntryPoint
            public ByteBuddy byteBuddy(ClassFileVersion classFileVersion) {
                return new ByteBuddy(classFileVersion);
            }

            @Override // org.modelmapper.internal.bytebuddy.build.EntryPoint
            public DynamicType.Builder<?> transform(TypeDescription typeDescription, ByteBuddy byteBuddy, ClassFileLocator classFileLocator, MethodNameTransformer methodNameTransformer) {
                return byteBuddy.rebase(typeDescription, classFileLocator, methodNameTransformer);
            }
        },
        REDEFINE { // from class: org.modelmapper.internal.bytebuddy.build.EntryPoint.Default.2
            @Override // org.modelmapper.internal.bytebuddy.build.EntryPoint
            public ByteBuddy byteBuddy(ClassFileVersion classFileVersion) {
                return new ByteBuddy(classFileVersion);
            }

            @Override // org.modelmapper.internal.bytebuddy.build.EntryPoint
            public DynamicType.Builder<?> transform(TypeDescription typeDescription, ByteBuddy byteBuddy, ClassFileLocator classFileLocator, MethodNameTransformer methodNameTransformer) {
                return byteBuddy.redefine(typeDescription, classFileLocator);
            }
        },
        REDEFINE_LOCAL { // from class: org.modelmapper.internal.bytebuddy.build.EntryPoint.Default.3
            @Override // org.modelmapper.internal.bytebuddy.build.EntryPoint
            public ByteBuddy byteBuddy(ClassFileVersion classFileVersion) {
                return new ByteBuddy(classFileVersion).with(Implementation.Context.Disabled.Factory.INSTANCE);
            }

            @Override // org.modelmapper.internal.bytebuddy.build.EntryPoint
            public DynamicType.Builder<?> transform(TypeDescription typeDescription, ByteBuddy byteBuddy, ClassFileLocator classFileLocator, MethodNameTransformer methodNameTransformer) {
                return byteBuddy.redefine(typeDescription, classFileLocator).ignoreAlso(ElementMatchers.not(ElementMatchers.isDeclaredBy(typeDescription)));
            }
        },
        DECORATE { // from class: org.modelmapper.internal.bytebuddy.build.EntryPoint.Default.4
            @Override // org.modelmapper.internal.bytebuddy.build.EntryPoint
            public ByteBuddy byteBuddy(ClassFileVersion classFileVersion) {
                return new ByteBuddy(classFileVersion).with(MethodGraph.Compiler.ForDeclaredMethods.INSTANCE).with(Implementation.Context.Disabled.Factory.INSTANCE);
            }

            @Override // org.modelmapper.internal.bytebuddy.build.EntryPoint
            public DynamicType.Builder<?> transform(TypeDescription typeDescription, ByteBuddy byteBuddy, ClassFileLocator classFileLocator, MethodNameTransformer methodNameTransformer) {
                return byteBuddy.decorate(typeDescription, classFileLocator);
            }
        }
    }

    ByteBuddy byteBuddy(ClassFileVersion classFileVersion);

    DynamicType.Builder<?> transform(TypeDescription typeDescription, ByteBuddy byteBuddy, ClassFileLocator classFileLocator, MethodNameTransformer methodNameTransformer);
}
