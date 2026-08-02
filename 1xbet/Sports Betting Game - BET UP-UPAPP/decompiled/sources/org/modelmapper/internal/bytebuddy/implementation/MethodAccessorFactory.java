package org.modelmapper.internal.bytebuddy.implementation;

import org.modelmapper.internal.bytebuddy.description.field.FieldDescription;
import org.modelmapper.internal.bytebuddy.description.method.MethodDescription;
import org.modelmapper.internal.bytebuddy.description.modifier.Visibility;
import org.modelmapper.internal.bytebuddy.implementation.Implementation;

/* loaded from: classes4.dex */
public interface MethodAccessorFactory {
    MethodDescription.InDefinedShape registerAccessorFor(Implementation.SpecialMethodInvocation specialMethodInvocation, AccessType accessType);

    MethodDescription.InDefinedShape registerGetterFor(FieldDescription fieldDescription, AccessType accessType);

    MethodDescription.InDefinedShape registerSetterFor(FieldDescription fieldDescription, AccessType accessType);

    public enum AccessType {
        PUBLIC(Visibility.PUBLIC),
        DEFAULT(Visibility.PACKAGE_PRIVATE);

        private final Visibility visibility;

        AccessType(Visibility visibility) {
            this.visibility = visibility;
        }

        public Visibility getVisibility() {
            return this.visibility;
        }
    }

    public enum Illegal implements MethodAccessorFactory {
        INSTANCE;

        @Override // org.modelmapper.internal.bytebuddy.implementation.MethodAccessorFactory
        public MethodDescription.InDefinedShape registerAccessorFor(Implementation.SpecialMethodInvocation specialMethodInvocation, AccessType accessType) {
            throw new IllegalStateException("It is illegal to register an accessor for this type");
        }

        @Override // org.modelmapper.internal.bytebuddy.implementation.MethodAccessorFactory
        public MethodDescription.InDefinedShape registerGetterFor(FieldDescription fieldDescription, AccessType accessType) {
            throw new IllegalStateException("It is illegal to register a field getter for this type");
        }

        @Override // org.modelmapper.internal.bytebuddy.implementation.MethodAccessorFactory
        public MethodDescription.InDefinedShape registerSetterFor(FieldDescription fieldDescription, AccessType accessType) {
            throw new IllegalStateException("It is illegal to register a field setter for this type");
        }
    }
}
