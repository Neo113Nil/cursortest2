package org.modelmapper.internal.bytebuddy.implementation;

import com.ironsource.mediationsdk.logger.IronSourceError;
import org.modelmapper.internal.asm.MethodVisitor;
import org.modelmapper.internal.bytebuddy.build.HashCodeAndEqualsPlugin;
import org.modelmapper.internal.bytebuddy.description.method.MethodDescription;
import org.modelmapper.internal.bytebuddy.description.type.TypeDescription;
import org.modelmapper.internal.bytebuddy.dynamic.scaffold.InstrumentedType;
import org.modelmapper.internal.bytebuddy.implementation.Implementation;
import org.modelmapper.internal.bytebuddy.implementation.bytecode.ByteCodeAppender;
import org.modelmapper.internal.bytebuddy.implementation.bytecode.Duplication;
import org.modelmapper.internal.bytebuddy.implementation.bytecode.StackManipulation;
import org.modelmapper.internal.bytebuddy.implementation.bytecode.Throw;
import org.modelmapper.internal.bytebuddy.implementation.bytecode.TypeCreation;
import org.modelmapper.internal.bytebuddy.implementation.bytecode.constant.TextConstant;
import org.modelmapper.internal.bytebuddy.implementation.bytecode.member.MethodInvocation;
import org.modelmapper.internal.bytebuddy.matcher.ElementMatchers;

@HashCodeAndEqualsPlugin.Enhance
/* loaded from: classes4.dex */
public class ExceptionMethod implements Implementation, ByteCodeAppender {
    private final ConstructionDelegate constructionDelegate;

    @Override // org.modelmapper.internal.bytebuddy.implementation.Implementation
    public ByteCodeAppender appender(Implementation.Target target) {
        return this;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return obj != null && getClass() == obj.getClass() && this.constructionDelegate.equals(((ExceptionMethod) obj).constructionDelegate);
    }

    public int hashCode() {
        return IronSourceError.ERROR_NON_EXISTENT_INSTANCE + this.constructionDelegate.hashCode();
    }

    @Override // org.modelmapper.internal.bytebuddy.dynamic.scaffold.InstrumentedType.Prepareable
    public InstrumentedType prepare(InstrumentedType instrumentedType) {
        return instrumentedType;
    }

    public ExceptionMethod(ConstructionDelegate constructionDelegate) {
        this.constructionDelegate = constructionDelegate;
    }

    public static Implementation throwing(Class<? extends Throwable> cls) {
        return throwing(TypeDescription.ForLoadedType.of(cls));
    }

    public static Implementation throwing(TypeDescription typeDescription) {
        if (!typeDescription.isAssignableTo(Throwable.class)) {
            throw new IllegalArgumentException(typeDescription + " does not extend throwable");
        }
        return new ExceptionMethod(new ConstructionDelegate.ForDefaultConstructor(typeDescription));
    }

    public static Implementation throwing(Class<? extends Throwable> cls, String str) {
        return throwing(TypeDescription.ForLoadedType.of(cls), str);
    }

    public static Implementation throwing(TypeDescription typeDescription, String str) {
        if (!typeDescription.isAssignableTo(Throwable.class)) {
            throw new IllegalArgumentException(typeDescription + " does not extend throwable");
        }
        return new ExceptionMethod(new ConstructionDelegate.ForStringConstructor(typeDescription, str));
    }

    @Override // org.modelmapper.internal.bytebuddy.implementation.bytecode.ByteCodeAppender
    public ByteCodeAppender.Size apply(MethodVisitor methodVisitor, Implementation.Context context, MethodDescription methodDescription) {
        return new ByteCodeAppender.Size(new StackManipulation.Compound(this.constructionDelegate.make(), Throw.INSTANCE).apply(methodVisitor, context).getMaximalSize(), methodDescription.getStackSize());
    }

    public interface ConstructionDelegate {
        StackManipulation make();

        @HashCodeAndEqualsPlugin.Enhance
        public static class ForDefaultConstructor implements ConstructionDelegate {
            private final MethodDescription targetConstructor;
            private final TypeDescription throwableType;

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (obj == null || getClass() != obj.getClass()) {
                    return false;
                }
                ForDefaultConstructor forDefaultConstructor = (ForDefaultConstructor) obj;
                return this.throwableType.equals(forDefaultConstructor.throwableType) && this.targetConstructor.equals(forDefaultConstructor.targetConstructor);
            }

            public int hashCode() {
                return ((IronSourceError.ERROR_NON_EXISTENT_INSTANCE + this.throwableType.hashCode()) * 31) + this.targetConstructor.hashCode();
            }

            public ForDefaultConstructor(TypeDescription typeDescription) {
                this.throwableType = typeDescription;
                this.targetConstructor = (MethodDescription) typeDescription.getDeclaredMethods().filter(ElementMatchers.isConstructor().and(ElementMatchers.takesArguments(0))).getOnly();
            }

            @Override // org.modelmapper.internal.bytebuddy.implementation.ExceptionMethod.ConstructionDelegate
            public StackManipulation make() {
                return new StackManipulation.Compound(TypeCreation.of(this.throwableType), Duplication.SINGLE, MethodInvocation.invoke(this.targetConstructor));
            }
        }

        @HashCodeAndEqualsPlugin.Enhance
        public static class ForStringConstructor implements ConstructionDelegate {
            private final String message;
            private final MethodDescription targetConstructor;
            private final TypeDescription throwableType;

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (obj == null || getClass() != obj.getClass()) {
                    return false;
                }
                ForStringConstructor forStringConstructor = (ForStringConstructor) obj;
                return this.throwableType.equals(forStringConstructor.throwableType) && this.targetConstructor.equals(forStringConstructor.targetConstructor) && this.message.equals(forStringConstructor.message);
            }

            public int hashCode() {
                return ((((IronSourceError.ERROR_NON_EXISTENT_INSTANCE + this.throwableType.hashCode()) * 31) + this.targetConstructor.hashCode()) * 31) + this.message.hashCode();
            }

            public ForStringConstructor(TypeDescription typeDescription, String str) {
                this.throwableType = typeDescription;
                this.targetConstructor = (MethodDescription) typeDescription.getDeclaredMethods().filter(ElementMatchers.isConstructor().and(ElementMatchers.takesArguments((Class<?>[]) new Class[]{String.class}))).getOnly();
                this.message = str;
            }

            @Override // org.modelmapper.internal.bytebuddy.implementation.ExceptionMethod.ConstructionDelegate
            public StackManipulation make() {
                return new StackManipulation.Compound(TypeCreation.of(this.throwableType), Duplication.SINGLE, new TextConstant(this.message), MethodInvocation.invoke(this.targetConstructor));
            }
        }
    }
}
