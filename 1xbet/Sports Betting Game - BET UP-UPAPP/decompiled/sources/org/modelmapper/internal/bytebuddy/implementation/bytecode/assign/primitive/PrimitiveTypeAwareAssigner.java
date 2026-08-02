package org.modelmapper.internal.bytebuddy.implementation.bytecode.assign.primitive;

import com.ironsource.mediationsdk.logger.IronSourceError;
import org.modelmapper.internal.bytebuddy.build.HashCodeAndEqualsPlugin;
import org.modelmapper.internal.bytebuddy.description.type.TypeDescription;
import org.modelmapper.internal.bytebuddy.implementation.bytecode.StackManipulation;
import org.modelmapper.internal.bytebuddy.implementation.bytecode.assign.Assigner;

@HashCodeAndEqualsPlugin.Enhance
/* loaded from: classes4.dex */
public class PrimitiveTypeAwareAssigner implements Assigner {
    private final Assigner referenceTypeAwareAssigner;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return obj != null && getClass() == obj.getClass() && this.referenceTypeAwareAssigner.equals(((PrimitiveTypeAwareAssigner) obj).referenceTypeAwareAssigner);
    }

    public int hashCode() {
        return IronSourceError.ERROR_NON_EXISTENT_INSTANCE + this.referenceTypeAwareAssigner.hashCode();
    }

    public PrimitiveTypeAwareAssigner(Assigner assigner) {
        this.referenceTypeAwareAssigner = assigner;
    }

    @Override // org.modelmapper.internal.bytebuddy.implementation.bytecode.assign.Assigner
    public StackManipulation assign(TypeDescription.Generic generic, TypeDescription.Generic generic2, Assigner.Typing typing) {
        if (generic.isPrimitive() && generic2.isPrimitive()) {
            return PrimitiveWideningDelegate.forPrimitive(generic).widenTo(generic2);
        }
        if (generic.isPrimitive()) {
            return PrimitiveBoxingDelegate.forPrimitive(generic).assignBoxedTo(generic2, this.referenceTypeAwareAssigner, typing);
        }
        if (generic2.isPrimitive()) {
            return PrimitiveUnboxingDelegate.forReferenceType(generic).assignUnboxedTo(generic2, this.referenceTypeAwareAssigner, typing);
        }
        return this.referenceTypeAwareAssigner.assign(generic, generic2, typing);
    }
}
