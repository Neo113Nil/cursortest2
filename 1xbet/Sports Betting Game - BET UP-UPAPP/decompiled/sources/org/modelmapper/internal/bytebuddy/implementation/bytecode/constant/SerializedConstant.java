package org.modelmapper.internal.bytebuddy.implementation.bytecode.constant;

import com.ironsource.mediationsdk.logger.IronSourceError;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import org.modelmapper.internal.asm.MethodVisitor;
import org.modelmapper.internal.bytebuddy.build.HashCodeAndEqualsPlugin;
import org.modelmapper.internal.bytebuddy.description.method.MethodDescription;
import org.modelmapper.internal.bytebuddy.description.type.TypeDescription;
import org.modelmapper.internal.bytebuddy.implementation.Implementation;
import org.modelmapper.internal.bytebuddy.implementation.bytecode.Duplication;
import org.modelmapper.internal.bytebuddy.implementation.bytecode.StackManipulation;
import org.modelmapper.internal.bytebuddy.implementation.bytecode.TypeCreation;
import org.modelmapper.internal.bytebuddy.implementation.bytecode.member.MethodInvocation;

@HashCodeAndEqualsPlugin.Enhance
/* loaded from: classes4.dex */
public class SerializedConstant implements StackManipulation {
    private static final String CHARSET = "ISO-8859-1";
    private final String serialization;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return obj != null && getClass() == obj.getClass() && this.serialization.equals(((SerializedConstant) obj).serialization);
    }

    public int hashCode() {
        return IronSourceError.ERROR_NON_EXISTENT_INSTANCE + this.serialization.hashCode();
    }

    @Override // org.modelmapper.internal.bytebuddy.implementation.bytecode.StackManipulation
    public boolean isValid() {
        return true;
    }

    protected SerializedConstant(String str) {
        this.serialization = str;
    }

    public static StackManipulation of(Serializable serializable) {
        if (serializable == null) {
            return NullConstant.INSTANCE;
        }
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(byteArrayOutputStream);
            try {
                objectOutputStream.writeObject(serializable);
                objectOutputStream.close();
                return new SerializedConstant(byteArrayOutputStream.toString(CHARSET));
            } catch (Throwable th) {
                objectOutputStream.close();
                throw th;
            }
        } catch (IOException e) {
            throw new IllegalStateException("Cannot serialize " + serializable, e);
        }
    }

    @Override // org.modelmapper.internal.bytebuddy.implementation.bytecode.StackManipulation
    public StackManipulation.Size apply(MethodVisitor methodVisitor, Implementation.Context context) {
        try {
            return new StackManipulation.Compound(TypeCreation.of(TypeDescription.ForLoadedType.of(ObjectInputStream.class)), Duplication.SINGLE, TypeCreation.of(TypeDescription.ForLoadedType.of(ByteArrayInputStream.class)), Duplication.SINGLE, new TextConstant(this.serialization), new TextConstant(CHARSET), MethodInvocation.invoke((MethodDescription.InDefinedShape) new MethodDescription.ForLoadedMethod(String.class.getMethod("getBytes", String.class))), MethodInvocation.invoke((MethodDescription.InDefinedShape) new MethodDescription.ForLoadedConstructor(ByteArrayInputStream.class.getConstructor(byte[].class))), MethodInvocation.invoke((MethodDescription.InDefinedShape) new MethodDescription.ForLoadedConstructor(ObjectInputStream.class.getConstructor(InputStream.class))), MethodInvocation.invoke((MethodDescription.InDefinedShape) new MethodDescription.ForLoadedMethod(ObjectInputStream.class.getMethod("readObject", new Class[0])))).apply(methodVisitor, context);
        } catch (NoSuchMethodException e) {
            throw new IllegalStateException("Could not locate Java API method", e);
        }
    }
}
