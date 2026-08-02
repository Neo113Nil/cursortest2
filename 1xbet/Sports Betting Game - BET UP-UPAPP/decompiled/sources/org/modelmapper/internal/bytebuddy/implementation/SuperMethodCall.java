package org.modelmapper.internal.bytebuddy.implementation;

import com.ironsource.mediationsdk.logger.IronSourceError;
import org.modelmapper.internal.asm.MethodVisitor;
import org.modelmapper.internal.bytebuddy.build.HashCodeAndEqualsPlugin;
import org.modelmapper.internal.bytebuddy.description.method.MethodDescription;
import org.modelmapper.internal.bytebuddy.dynamic.scaffold.InstrumentedType;
import org.modelmapper.internal.bytebuddy.implementation.Implementation;
import org.modelmapper.internal.bytebuddy.implementation.bytecode.ByteCodeAppender;
import org.modelmapper.internal.bytebuddy.implementation.bytecode.Removal;
import org.modelmapper.internal.bytebuddy.implementation.bytecode.StackManipulation;
import org.modelmapper.internal.bytebuddy.implementation.bytecode.member.MethodReturn;
import org.modelmapper.internal.bytebuddy.implementation.bytecode.member.MethodVariableAccess;

/* loaded from: classes4.dex */
public enum SuperMethodCall implements Implementation.Composable {
    INSTANCE;

    @Override // org.modelmapper.internal.bytebuddy.dynamic.scaffold.InstrumentedType.Prepareable
    public InstrumentedType prepare(InstrumentedType instrumentedType) {
        return instrumentedType;
    }

    @Override // org.modelmapper.internal.bytebuddy.implementation.Implementation
    public ByteCodeAppender appender(Implementation.Target target) {
        return new Appender(target, Appender.TerminationHandler.RETURNING);
    }

    @Override // org.modelmapper.internal.bytebuddy.implementation.Implementation.Composable
    public Implementation andThen(Implementation implementation) {
        return new Implementation.Compound(WithoutReturn.INSTANCE, implementation);
    }

    @Override // org.modelmapper.internal.bytebuddy.implementation.Implementation.Composable
    public Implementation.Composable andThen(Implementation.Composable composable) {
        return new Implementation.Compound.Composable(WithoutReturn.INSTANCE, composable);
    }

    protected enum WithoutReturn implements Implementation {
        INSTANCE;

        @Override // org.modelmapper.internal.bytebuddy.dynamic.scaffold.InstrumentedType.Prepareable
        public InstrumentedType prepare(InstrumentedType instrumentedType) {
            return instrumentedType;
        }

        @Override // org.modelmapper.internal.bytebuddy.implementation.Implementation
        public ByteCodeAppender appender(Implementation.Target target) {
            return new Appender(target, Appender.TerminationHandler.DROPPING);
        }
    }

    @HashCodeAndEqualsPlugin.Enhance
    protected static class Appender implements ByteCodeAppender {
        private final Implementation.Target implementationTarget;
        private final TerminationHandler terminationHandler;

        protected enum TerminationHandler {
            RETURNING { // from class: org.modelmapper.internal.bytebuddy.implementation.SuperMethodCall.Appender.TerminationHandler.1
                @Override // org.modelmapper.internal.bytebuddy.implementation.SuperMethodCall.Appender.TerminationHandler
                protected StackManipulation of(MethodDescription methodDescription) {
                    return MethodReturn.of(methodDescription.getReturnType());
                }
            },
            DROPPING { // from class: org.modelmapper.internal.bytebuddy.implementation.SuperMethodCall.Appender.TerminationHandler.2
                @Override // org.modelmapper.internal.bytebuddy.implementation.SuperMethodCall.Appender.TerminationHandler
                protected StackManipulation of(MethodDescription methodDescription) {
                    return Removal.of(methodDescription.getReturnType());
                }
            };

            protected abstract StackManipulation of(MethodDescription methodDescription);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            Appender appender = (Appender) obj;
            return this.implementationTarget.equals(appender.implementationTarget) && this.terminationHandler.equals(appender.terminationHandler);
        }

        public int hashCode() {
            return ((IronSourceError.ERROR_NON_EXISTENT_INSTANCE + this.implementationTarget.hashCode()) * 31) + this.terminationHandler.hashCode();
        }

        protected Appender(Implementation.Target target, TerminationHandler terminationHandler) {
            this.implementationTarget = target;
            this.terminationHandler = terminationHandler;
        }

        @Override // org.modelmapper.internal.bytebuddy.implementation.bytecode.ByteCodeAppender
        public ByteCodeAppender.Size apply(MethodVisitor methodVisitor, Implementation.Context context, MethodDescription methodDescription) {
            Implementation.SpecialMethodInvocation invokeDominant = this.implementationTarget.invokeDominant(methodDescription.asSignatureToken());
            if (!invokeDominant.isValid()) {
                throw new IllegalStateException("Cannot call super (or default) method for " + methodDescription);
            }
            return new ByteCodeAppender.Size(new StackManipulation.Compound(MethodVariableAccess.allArgumentsOf(methodDescription).prependThisReference(), invokeDominant, this.terminationHandler.of(methodDescription)).apply(methodVisitor, context).getMaximalSize(), methodDescription.getStackSize());
        }
    }
}
