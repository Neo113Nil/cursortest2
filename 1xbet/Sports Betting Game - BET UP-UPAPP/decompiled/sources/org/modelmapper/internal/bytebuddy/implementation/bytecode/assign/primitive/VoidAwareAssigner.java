package org.modelmapper.internal.bytebuddy.implementation.bytecode.assign.primitive;

import com.ironsource.mediationsdk.logger.IronSourceError;
import org.modelmapper.internal.bytebuddy.build.HashCodeAndEqualsPlugin;
import org.modelmapper.internal.bytebuddy.description.type.TypeDescription;
import org.modelmapper.internal.bytebuddy.implementation.bytecode.Removal;
import org.modelmapper.internal.bytebuddy.implementation.bytecode.StackManipulation;
import org.modelmapper.internal.bytebuddy.implementation.bytecode.assign.Assigner;
import org.modelmapper.internal.bytebuddy.implementation.bytecode.constant.DefaultValue;

@HashCodeAndEqualsPlugin.Enhance
/* loaded from: classes4.dex */
public class VoidAwareAssigner implements Assigner {
    private final Assigner chained;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return obj != null && getClass() == obj.getClass() && this.chained.equals(((VoidAwareAssigner) obj).chained);
    }

    public int hashCode() {
        return IronSourceError.ERROR_NON_EXISTENT_INSTANCE + this.chained.hashCode();
    }

    public VoidAwareAssigner(Assigner assigner) {
        this.chained = assigner;
    }

    @Override // org.modelmapper.internal.bytebuddy.implementation.bytecode.assign.Assigner
    public StackManipulation assign(TypeDescription.Generic generic, TypeDescription.Generic generic2, Assigner.Typing typing) {
        if (generic.represents(Void.TYPE) && generic2.represents(Void.TYPE)) {
            return StackManipulation.Trivial.INSTANCE;
        }
        if (generic.represents(Void.TYPE)) {
            return typing.isDynamic() ? DefaultValue.of(generic2) : StackManipulation.Illegal.INSTANCE;
        }
        if (generic2.represents(Void.TYPE)) {
            return Removal.of(generic);
        }
        return this.chained.assign(generic, generic2, typing);
    }
}
