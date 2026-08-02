package org.modelmapper.internal.bytebuddy.description;

import org.modelmapper.internal.bytebuddy.description.modifier.EnumerationState;
import org.modelmapper.internal.bytebuddy.description.modifier.FieldManifestation;
import org.modelmapper.internal.bytebuddy.description.modifier.FieldPersistence;
import org.modelmapper.internal.bytebuddy.description.modifier.MethodManifestation;
import org.modelmapper.internal.bytebuddy.description.modifier.MethodStrictness;
import org.modelmapper.internal.bytebuddy.description.modifier.Ownership;
import org.modelmapper.internal.bytebuddy.description.modifier.ParameterManifestation;
import org.modelmapper.internal.bytebuddy.description.modifier.ProvisioningState;
import org.modelmapper.internal.bytebuddy.description.modifier.SynchronizationState;
import org.modelmapper.internal.bytebuddy.description.modifier.SyntheticState;
import org.modelmapper.internal.bytebuddy.description.modifier.TypeManifestation;
import org.modelmapper.internal.bytebuddy.description.modifier.Visibility;

/* loaded from: classes4.dex */
public interface ModifierReviewable {
    public static final int EMPTY_MASK = 0;

    public interface ForFieldDescription extends OfEnumeration {
        FieldManifestation getFieldManifestation();

        FieldPersistence getFieldPersistence();

        boolean isTransient();

        boolean isVolatile();
    }

    public interface ForMethodDescription extends OfAbstraction {
        MethodManifestation getMethodManifestation();

        MethodStrictness getMethodStrictness();

        SynchronizationState getSynchronizationState();

        boolean isBridge();

        boolean isNative();

        boolean isStrict();

        boolean isSynchronized();

        boolean isVarArgs();
    }

    public interface ForParameterDescription extends ModifierReviewable {
        ParameterManifestation getParameterManifestation();

        ProvisioningState getProvisioningState();

        boolean isMandated();
    }

    public interface ForTypeDefinition extends OfAbstraction, OfEnumeration {
        TypeManifestation getTypeManifestation();

        boolean isAnnotation();

        boolean isInterface();
    }

    public interface OfAbstraction extends OfByteCodeElement {
        boolean isAbstract();
    }

    public interface OfByteCodeElement extends ModifierReviewable {
        Ownership getOwnership();

        Visibility getVisibility();

        boolean isDeprecated();

        boolean isPackagePrivate();

        boolean isPrivate();

        boolean isProtected();

        boolean isPublic();

        boolean isStatic();
    }

    public interface OfEnumeration extends OfByteCodeElement {
        EnumerationState getEnumerationState();

        boolean isEnum();
    }

    int getModifiers();

    SyntheticState getSyntheticState();

    boolean isFinal();

    boolean isSynthetic();

    public static abstract class AbstractBase implements ForTypeDefinition, ForFieldDescription, ForMethodDescription, ForParameterDescription {
        @Override // org.modelmapper.internal.bytebuddy.description.ModifierReviewable.OfAbstraction
        public boolean isAbstract() {
            return matchesMask(1024);
        }

        @Override // org.modelmapper.internal.bytebuddy.description.ModifierReviewable
        public boolean isFinal() {
            return matchesMask(16);
        }

        @Override // org.modelmapper.internal.bytebuddy.description.ModifierReviewable.OfByteCodeElement
        public boolean isStatic() {
            return matchesMask(8);
        }

        @Override // org.modelmapper.internal.bytebuddy.description.ModifierReviewable.OfByteCodeElement
        public boolean isPublic() {
            return matchesMask(1);
        }

        @Override // org.modelmapper.internal.bytebuddy.description.ModifierReviewable.OfByteCodeElement
        public boolean isProtected() {
            return matchesMask(4);
        }

        @Override // org.modelmapper.internal.bytebuddy.description.ModifierReviewable.OfByteCodeElement
        public boolean isPackagePrivate() {
            return (isPublic() || isProtected() || isPrivate()) ? false : true;
        }

        @Override // org.modelmapper.internal.bytebuddy.description.ModifierReviewable.OfByteCodeElement
        public boolean isPrivate() {
            return matchesMask(2);
        }

        @Override // org.modelmapper.internal.bytebuddy.description.ModifierReviewable.ForMethodDescription
        public boolean isNative() {
            return matchesMask(256);
        }

        @Override // org.modelmapper.internal.bytebuddy.description.ModifierReviewable.ForMethodDescription
        public boolean isSynchronized() {
            return matchesMask(32);
        }

        @Override // org.modelmapper.internal.bytebuddy.description.ModifierReviewable.ForMethodDescription
        public boolean isStrict() {
            return matchesMask(2048);
        }

        @Override // org.modelmapper.internal.bytebuddy.description.ModifierReviewable.ForParameterDescription
        public boolean isMandated() {
            return matchesMask(32768);
        }

        @Override // org.modelmapper.internal.bytebuddy.description.ModifierReviewable
        public boolean isSynthetic() {
            return matchesMask(4096);
        }

        @Override // org.modelmapper.internal.bytebuddy.description.ModifierReviewable.ForMethodDescription
        public boolean isBridge() {
            return matchesMask(64);
        }

        @Override // org.modelmapper.internal.bytebuddy.description.ModifierReviewable.OfByteCodeElement
        public boolean isDeprecated() {
            return matchesMask(131072);
        }

        @Override // org.modelmapper.internal.bytebuddy.description.ModifierReviewable.ForTypeDefinition
        public boolean isAnnotation() {
            return matchesMask(8192);
        }

        @Override // org.modelmapper.internal.bytebuddy.description.ModifierReviewable.OfEnumeration
        public boolean isEnum() {
            return matchesMask(16384);
        }

        @Override // org.modelmapper.internal.bytebuddy.description.ModifierReviewable.ForTypeDefinition
        public boolean isInterface() {
            return matchesMask(512);
        }

        @Override // org.modelmapper.internal.bytebuddy.description.ModifierReviewable.ForFieldDescription
        public boolean isTransient() {
            return matchesMask(128);
        }

        @Override // org.modelmapper.internal.bytebuddy.description.ModifierReviewable.ForFieldDescription
        public boolean isVolatile() {
            return matchesMask(64);
        }

        @Override // org.modelmapper.internal.bytebuddy.description.ModifierReviewable.ForMethodDescription
        public boolean isVarArgs() {
            return matchesMask(128);
        }

        @Override // org.modelmapper.internal.bytebuddy.description.ModifierReviewable
        public SyntheticState getSyntheticState() {
            return isSynthetic() ? SyntheticState.SYNTHETIC : SyntheticState.PLAIN;
        }

        @Override // org.modelmapper.internal.bytebuddy.description.ModifierReviewable.OfByteCodeElement
        public Visibility getVisibility() {
            int modifiers = getModifiers();
            int i = modifiers & 7;
            if (i == 0) {
                return Visibility.PACKAGE_PRIVATE;
            }
            if (i == 1) {
                return Visibility.PUBLIC;
            }
            if (i == 2) {
                return Visibility.PRIVATE;
            }
            if (i == 4) {
                return Visibility.PROTECTED;
            }
            throw new IllegalStateException("Unexpected modifiers: " + modifiers);
        }

        @Override // org.modelmapper.internal.bytebuddy.description.ModifierReviewable.OfByteCodeElement
        public Ownership getOwnership() {
            return isStatic() ? Ownership.STATIC : Ownership.MEMBER;
        }

        @Override // org.modelmapper.internal.bytebuddy.description.ModifierReviewable.OfEnumeration
        public EnumerationState getEnumerationState() {
            return isEnum() ? EnumerationState.ENUMERATION : EnumerationState.PLAIN;
        }

        @Override // org.modelmapper.internal.bytebuddy.description.ModifierReviewable.ForTypeDefinition
        public TypeManifestation getTypeManifestation() {
            int modifiers = getModifiers();
            int i = modifiers & 9744;
            if (i == 0) {
                return TypeManifestation.PLAIN;
            }
            if (i == 16) {
                return TypeManifestation.FINAL;
            }
            if (i == 1024) {
                return TypeManifestation.ABSTRACT;
            }
            if (i == 1536) {
                return TypeManifestation.INTERFACE;
            }
            if (i == 9728) {
                return TypeManifestation.ANNOTATION;
            }
            throw new IllegalStateException("Unexpected modifiers: " + modifiers);
        }

        @Override // org.modelmapper.internal.bytebuddy.description.ModifierReviewable.ForFieldDescription
        public FieldManifestation getFieldManifestation() {
            int modifiers = getModifiers();
            int i = modifiers & 80;
            if (i == 0) {
                return FieldManifestation.PLAIN;
            }
            if (i == 16) {
                return FieldManifestation.FINAL;
            }
            if (i == 64) {
                return FieldManifestation.VOLATILE;
            }
            throw new IllegalStateException("Unexpected modifiers: " + modifiers);
        }

        @Override // org.modelmapper.internal.bytebuddy.description.ModifierReviewable.ForFieldDescription
        public FieldPersistence getFieldPersistence() {
            int modifiers = getModifiers();
            int i = modifiers & 128;
            if (i == 0) {
                return FieldPersistence.PLAIN;
            }
            if (i == 128) {
                return FieldPersistence.TRANSIENT;
            }
            throw new IllegalStateException("Unexpected modifiers: " + modifiers);
        }

        @Override // org.modelmapper.internal.bytebuddy.description.ModifierReviewable.ForMethodDescription
        public SynchronizationState getSynchronizationState() {
            return isSynchronized() ? SynchronizationState.SYNCHRONIZED : SynchronizationState.PLAIN;
        }

        @Override // org.modelmapper.internal.bytebuddy.description.ModifierReviewable.ForMethodDescription
        public MethodManifestation getMethodManifestation() {
            int modifiers = getModifiers();
            int i = modifiers & 1360;
            if (i == 0) {
                return MethodManifestation.PLAIN;
            }
            if (i == 16) {
                return MethodManifestation.FINAL;
            }
            if (i == 64) {
                return MethodManifestation.BRIDGE;
            }
            if (i == 80) {
                return MethodManifestation.FINAL_BRIDGE;
            }
            if (i == 256) {
                return MethodManifestation.NATIVE;
            }
            if (i == 272) {
                return MethodManifestation.FINAL_NATIVE;
            }
            if (i == 1024) {
                return MethodManifestation.ABSTRACT;
            }
            throw new IllegalStateException("Unexpected modifiers: " + modifiers);
        }

        @Override // org.modelmapper.internal.bytebuddy.description.ModifierReviewable.ForMethodDescription
        public MethodStrictness getMethodStrictness() {
            return isStrict() ? MethodStrictness.STRICT : MethodStrictness.PLAIN;
        }

        @Override // org.modelmapper.internal.bytebuddy.description.ModifierReviewable.ForParameterDescription
        public ParameterManifestation getParameterManifestation() {
            return isFinal() ? ParameterManifestation.FINAL : ParameterManifestation.PLAIN;
        }

        @Override // org.modelmapper.internal.bytebuddy.description.ModifierReviewable.ForParameterDescription
        public ProvisioningState getProvisioningState() {
            return isMandated() ? ProvisioningState.MANDATED : ProvisioningState.PLAIN;
        }

        private boolean matchesMask(int i) {
            return (getModifiers() & i) == i;
        }
    }
}
