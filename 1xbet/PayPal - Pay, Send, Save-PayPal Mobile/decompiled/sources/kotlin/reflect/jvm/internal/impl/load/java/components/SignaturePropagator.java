package kotlin.reflect.jvm.internal.impl.load.java.components;

/* loaded from: classes5.dex */
public interface SignaturePropagator {
    public static final kotlin.reflect.jvm.internal.impl.load.java.components.SignaturePropagator DO_NOTHING = new kotlin.reflect.jvm.internal.impl.load.java.components.SignaturePropagator() { // from class: kotlin.reflect.jvm.internal.impl.load.java.components.SignaturePropagator.1
        @Override // kotlin.reflect.jvm.internal.impl.load.java.components.SignaturePropagator
        public final kotlin.reflect.jvm.internal.impl.load.java.components.SignaturePropagator.PropagatedSignature resolvePropagatedSignature(kotlin.reflect.jvm.internal.impl.load.java.structure.JavaMethod javaMethod, kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor classDescriptor, kotlin.reflect.jvm.internal.impl.types.KotlinType kotlinType, kotlin.reflect.jvm.internal.impl.types.KotlinType kotlinType2, java.util.List<kotlin.reflect.jvm.internal.impl.descriptors.ValueParameterDescriptor> list, java.util.List<kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor> list2) {
            if (javaMethod == null) {
                getHighSpeedVideoFpsRangesFor(0);
            }
            if (classDescriptor == null) {
                getHighSpeedVideoFpsRangesFor(1);
            }
            if (kotlinType == null) {
                getHighSpeedVideoFpsRangesFor(2);
            }
            if (list == null) {
                getHighSpeedVideoFpsRangesFor(3);
            }
            if (list2 == null) {
                getHighSpeedVideoFpsRangesFor(4);
            }
            return new kotlin.reflect.jvm.internal.impl.load.java.components.SignaturePropagator.PropagatedSignature(kotlinType, kotlinType2, list, list2, java.util.Collections.emptyList(), false);
        }

        @Override // kotlin.reflect.jvm.internal.impl.load.java.components.SignaturePropagator
        public final void reportSignatureErrors(kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor callableMemberDescriptor, java.util.List<java.lang.String> list) {
            if (callableMemberDescriptor == null) {
                getHighSpeedVideoFpsRangesFor(5);
            }
            if (list == null) {
                getHighSpeedVideoFpsRangesFor(6);
            }
            throw new java.lang.UnsupportedOperationException("Should not be called");
        }

        private static /* synthetic */ void getHighSpeedVideoFpsRangesFor(int i) {
            java.lang.Object[] objArr = new java.lang.Object[3];
            switch (i) {
                case 1:
                    objArr[0] = com.microblink.blinkid.entities.recognizers.blinkcard.BlinkCardRecognizer.VerificationConstants.Owner;
                    break;
                case 2:
                    objArr[0] = "returnType";
                    break;
                case 3:
                    objArr[0] = "valueParameters";
                    break;
                case 4:
                    objArr[0] = "typeParameters";
                    break;
                case 5:
                    objArr[0] = "descriptor";
                    break;
                case 6:
                    objArr[0] = "signatureErrors";
                    break;
                default:
                    objArr[0] = "method";
                    break;
            }
            objArr[1] = "kotlin/reflect/jvm/internal/impl/load/java/components/SignaturePropagator$1";
            if (i == 5 || i == 6) {
                objArr[2] = "reportSignatureErrors";
            } else {
                objArr[2] = "resolvePropagatedSignature";
            }
            throw new java.lang.IllegalArgumentException(java.lang.String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", objArr));
        }
    };

    void reportSignatureErrors(kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor callableMemberDescriptor, java.util.List<java.lang.String> list);

    kotlin.reflect.jvm.internal.impl.load.java.components.SignaturePropagator.PropagatedSignature resolvePropagatedSignature(kotlin.reflect.jvm.internal.impl.load.java.structure.JavaMethod javaMethod, kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor classDescriptor, kotlin.reflect.jvm.internal.impl.types.KotlinType kotlinType, kotlin.reflect.jvm.internal.impl.types.KotlinType kotlinType2, java.util.List<kotlin.reflect.jvm.internal.impl.descriptors.ValueParameterDescriptor> list, java.util.List<kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor> list2);

    public static class PropagatedSignature {
        private final boolean Camera2StreamConfigurationMap;
        private final java.util.List<kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor> getHighResolutionOutputSizeshNQ4ISI;
        private final java.util.List<java.lang.String> getHighSpeedVideoFpsRanges;
        private final kotlin.reflect.jvm.internal.impl.types.KotlinType getHighSpeedVideoFpsRangesFor;
        private final kotlin.reflect.jvm.internal.impl.types.KotlinType getHighSpeedVideoSizes;
        private final java.util.List<kotlin.reflect.jvm.internal.impl.descriptors.ValueParameterDescriptor> getInputFormats;

        public PropagatedSignature(kotlin.reflect.jvm.internal.impl.types.KotlinType kotlinType, kotlin.reflect.jvm.internal.impl.types.KotlinType kotlinType2, java.util.List<kotlin.reflect.jvm.internal.impl.descriptors.ValueParameterDescriptor> list, java.util.List<kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor> list2, java.util.List<java.lang.String> list3, boolean z) {
            if (kotlinType == null) {
                Camera2StreamConfigurationMap(0);
            }
            if (list == null) {
                Camera2StreamConfigurationMap(1);
            }
            if (list2 == null) {
                Camera2StreamConfigurationMap(2);
            }
            if (list3 == null) {
                Camera2StreamConfigurationMap(3);
            }
            this.getHighSpeedVideoFpsRangesFor = kotlinType;
            this.getHighSpeedVideoSizes = kotlinType2;
            this.getInputFormats = list;
            this.getHighResolutionOutputSizeshNQ4ISI = list2;
            this.getHighSpeedVideoFpsRanges = list3;
            this.Camera2StreamConfigurationMap = z;
        }

        public kotlin.reflect.jvm.internal.impl.types.KotlinType getReturnType() {
            kotlin.reflect.jvm.internal.impl.types.KotlinType kotlinType = this.getHighSpeedVideoFpsRangesFor;
            if (kotlinType == null) {
                Camera2StreamConfigurationMap(4);
            }
            return kotlinType;
        }

        public kotlin.reflect.jvm.internal.impl.types.KotlinType getReceiverType() {
            return this.getHighSpeedVideoSizes;
        }

        public java.util.List<kotlin.reflect.jvm.internal.impl.descriptors.ValueParameterDescriptor> getValueParameters() {
            java.util.List<kotlin.reflect.jvm.internal.impl.descriptors.ValueParameterDescriptor> list = this.getInputFormats;
            if (list == null) {
                Camera2StreamConfigurationMap(5);
            }
            return list;
        }

        public java.util.List<kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor> getTypeParameters() {
            java.util.List<kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor> list = this.getHighResolutionOutputSizeshNQ4ISI;
            if (list == null) {
                Camera2StreamConfigurationMap(6);
            }
            return list;
        }

        public boolean hasStableParameterNames() {
            return this.Camera2StreamConfigurationMap;
        }

        public java.util.List<java.lang.String> getErrors() {
            java.util.List<java.lang.String> list = this.getHighSpeedVideoFpsRanges;
            if (list == null) {
                Camera2StreamConfigurationMap(7);
            }
            return list;
        }

        private static /* synthetic */ void Camera2StreamConfigurationMap(int i) {
            java.lang.String str = (i == 4 || i == 5 || i == 6 || i == 7) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
            java.lang.Object[] objArr = new java.lang.Object[(i == 4 || i == 5 || i == 6 || i == 7) ? 2 : 3];
            switch (i) {
                case 1:
                    objArr[0] = "valueParameters";
                    break;
                case 2:
                    objArr[0] = "typeParameters";
                    break;
                case 3:
                    objArr[0] = "signatureErrors";
                    break;
                case 4:
                case 5:
                case 6:
                case 7:
                    objArr[0] = "kotlin/reflect/jvm/internal/impl/load/java/components/SignaturePropagator$PropagatedSignature";
                    break;
                default:
                    objArr[0] = "returnType";
                    break;
            }
            if (i == 4) {
                objArr[1] = "getReturnType";
            } else if (i == 5) {
                objArr[1] = "getValueParameters";
            } else if (i == 6) {
                objArr[1] = "getTypeParameters";
            } else if (i != 7) {
                objArr[1] = "kotlin/reflect/jvm/internal/impl/load/java/components/SignaturePropagator$PropagatedSignature";
            } else {
                objArr[1] = "getErrors";
            }
            if (i != 4 && i != 5 && i != 6 && i != 7) {
                objArr[2] = "<init>";
            }
            java.lang.String format = java.lang.String.format(str, objArr);
            if (i != 4 && i != 5 && i != 6 && i != 7) {
                throw new java.lang.IllegalArgumentException(format);
            }
            throw new java.lang.IllegalStateException(format);
        }
    }
}
