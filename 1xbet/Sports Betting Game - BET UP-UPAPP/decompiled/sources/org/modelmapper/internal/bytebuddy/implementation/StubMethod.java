package org.modelmapper.internal.bytebuddy.implementation;

import org.modelmapper.internal.asm.MethodVisitor;
import org.modelmapper.internal.bytebuddy.description.method.MethodDescription;
import org.modelmapper.internal.bytebuddy.dynamic.scaffold.InstrumentedType;
import org.modelmapper.internal.bytebuddy.implementation.Implementation;
import org.modelmapper.internal.bytebuddy.implementation.bytecode.ByteCodeAppender;
import org.modelmapper.internal.bytebuddy.implementation.bytecode.StackManipulation;
import org.modelmapper.internal.bytebuddy.implementation.bytecode.constant.DefaultValue;
import org.modelmapper.internal.bytebuddy.implementation.bytecode.member.MethodReturn;

/* loaded from: classes4.dex */
public enum StubMethod implements Implementation.Composable, ByteCodeAppender {
    INSTANCE;

    @Override // org.modelmapper.internal.bytebuddy.implementation.Implementation.Composable
    public Implementation.Composable andThen(Implementation.Composable composable) {
        return composable;
    }

    @Override // org.modelmapper.internal.bytebuddy.implementation.Implementation.Composable
    public Implementation andThen(Implementation implementation) {
        return implementation;
    }

    @Override // org.modelmapper.internal.bytebuddy.implementation.Implementation
    public ByteCodeAppender appender(Implementation.Target target) {
        return this;
    }

    @Override // org.modelmapper.internal.bytebuddy.dynamic.scaffold.InstrumentedType.Prepareable
    public InstrumentedType prepare(InstrumentedType instrumentedType) {
        return instrumentedType;
    }

    @Override // org.modelmapper.internal.bytebuddy.implementation.bytecode.ByteCodeAppender
    public ByteCodeAppender.Size apply(MethodVisitor methodVisitor, Implementation.Context context, MethodDescription methodDescription) {
        return new ByteCodeAppender.Size(new StackManipulation.Compound(DefaultValue.of(methodDescription.getReturnType()), MethodReturn.of(methodDescription.getReturnType())).apply(methodVisitor, context).getMaximalSize(), methodDescription.getStackSize());
    }
}
