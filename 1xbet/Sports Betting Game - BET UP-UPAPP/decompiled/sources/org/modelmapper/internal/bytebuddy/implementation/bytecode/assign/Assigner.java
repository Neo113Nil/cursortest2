package org.modelmapper.internal.bytebuddy.implementation.bytecode.assign;

import org.modelmapper.internal.bytebuddy.description.type.TypeDescription;
import org.modelmapper.internal.bytebuddy.implementation.bytecode.StackManipulation;
import org.modelmapper.internal.bytebuddy.implementation.bytecode.assign.primitive.PrimitiveTypeAwareAssigner;
import org.modelmapper.internal.bytebuddy.implementation.bytecode.assign.primitive.VoidAwareAssigner;
import org.modelmapper.internal.bytebuddy.implementation.bytecode.assign.reference.ReferenceTypeAwareAssigner;

/* loaded from: classes4.dex */
public interface Assigner {
    public static final Assigner DEFAULT = new VoidAwareAssigner(new PrimitiveTypeAwareAssigner(ReferenceTypeAwareAssigner.INSTANCE));

    public enum EqualTypesOnly implements Assigner {
        GENERIC { // from class: org.modelmapper.internal.bytebuddy.implementation.bytecode.assign.Assigner.EqualTypesOnly.1
            @Override // org.modelmapper.internal.bytebuddy.implementation.bytecode.assign.Assigner
            public StackManipulation assign(TypeDescription.Generic generic, TypeDescription.Generic generic2, Typing typing) {
                return generic.equals(generic2) ? StackManipulation.Trivial.INSTANCE : StackManipulation.Illegal.INSTANCE;
            }
        },
        ERASURE { // from class: org.modelmapper.internal.bytebuddy.implementation.bytecode.assign.Assigner.EqualTypesOnly.2
            @Override // org.modelmapper.internal.bytebuddy.implementation.bytecode.assign.Assigner
            public StackManipulation assign(TypeDescription.Generic generic, TypeDescription.Generic generic2, Typing typing) {
                return generic.asErasure().equals(generic2.asErasure()) ? StackManipulation.Trivial.INSTANCE : StackManipulation.Illegal.INSTANCE;
            }
        }
    }

    StackManipulation assign(TypeDescription.Generic generic, TypeDescription.Generic generic2, Typing typing);

    public enum Typing {
        STATIC(false),
        DYNAMIC(true);

        private final boolean dynamic;

        Typing(boolean z) {
            this.dynamic = z;
        }

        public static Typing of(boolean z) {
            return z ? DYNAMIC : STATIC;
        }

        public boolean isDynamic() {
            return this.dynamic;
        }
    }

    public enum Refusing implements Assigner {
        INSTANCE;

        @Override // org.modelmapper.internal.bytebuddy.implementation.bytecode.assign.Assigner
        public StackManipulation assign(TypeDescription.Generic generic, TypeDescription.Generic generic2, Typing typing) {
            return StackManipulation.Illegal.INSTANCE;
        }
    }
}
