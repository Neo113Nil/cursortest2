package com.google.firebase.crashlytics.internal.metadata;

/* loaded from: classes3.dex */
public final class AutoRolloutAssignmentEncoder implements com.google.firebase.encoders.config.Configurator {
    public static final int CODEGEN_VERSION = 2;
    public static final com.google.firebase.encoders.config.Configurator CONFIG = new com.google.firebase.crashlytics.internal.metadata.AutoRolloutAssignmentEncoder();

    private AutoRolloutAssignmentEncoder() {
    }

    @Override // com.google.firebase.encoders.config.Configurator
    public void configure(com.google.firebase.encoders.config.EncoderConfig<?> encoderConfig) {
        encoderConfig.registerEncoder(com.google.firebase.crashlytics.internal.metadata.RolloutAssignment.class, com.google.firebase.crashlytics.internal.metadata.AutoRolloutAssignmentEncoder.RolloutAssignmentEncoder.INSTANCE);
        encoderConfig.registerEncoder(com.google.firebase.crashlytics.internal.metadata.AutoValue_RolloutAssignment.class, com.google.firebase.crashlytics.internal.metadata.AutoRolloutAssignmentEncoder.RolloutAssignmentEncoder.INSTANCE);
    }

    private static final class RolloutAssignmentEncoder implements com.google.firebase.encoders.ObjectEncoder<com.google.firebase.crashlytics.internal.metadata.RolloutAssignment> {
        static final com.google.firebase.crashlytics.internal.metadata.AutoRolloutAssignmentEncoder.RolloutAssignmentEncoder INSTANCE = new com.google.firebase.crashlytics.internal.metadata.AutoRolloutAssignmentEncoder.RolloutAssignmentEncoder();
        private static final com.google.firebase.encoders.FieldDescriptor ROLLOUTID_DESCRIPTOR = com.google.firebase.encoders.FieldDescriptor.of(com.google.firebase.remoteconfig.internal.ConfigContainer.ROLLOUT_METADATA_ID);
        private static final com.google.firebase.encoders.FieldDescriptor PARAMETERKEY_DESCRIPTOR = com.google.firebase.encoders.FieldDescriptor.of("parameterKey");
        private static final com.google.firebase.encoders.FieldDescriptor PARAMETERVALUE_DESCRIPTOR = com.google.firebase.encoders.FieldDescriptor.of("parameterValue");
        private static final com.google.firebase.encoders.FieldDescriptor VARIANTID_DESCRIPTOR = com.google.firebase.encoders.FieldDescriptor.of("variantId");
        private static final com.google.firebase.encoders.FieldDescriptor TEMPLATEVERSION_DESCRIPTOR = com.google.firebase.encoders.FieldDescriptor.of(com.google.firebase.remoteconfig.RemoteConfigConstants.ResponseFieldKey.TEMPLATE_VERSION_NUMBER);

        private RolloutAssignmentEncoder() {
        }

        @Override // com.google.firebase.encoders.Encoder
        public void encode(com.google.firebase.crashlytics.internal.metadata.RolloutAssignment rolloutAssignment, com.google.firebase.encoders.ObjectEncoderContext objectEncoderContext) throws java.io.IOException {
            objectEncoderContext.add(ROLLOUTID_DESCRIPTOR, rolloutAssignment.getRolloutId());
            objectEncoderContext.add(PARAMETERKEY_DESCRIPTOR, rolloutAssignment.getParameterKey());
            objectEncoderContext.add(PARAMETERVALUE_DESCRIPTOR, rolloutAssignment.getParameterValue());
            objectEncoderContext.add(VARIANTID_DESCRIPTOR, rolloutAssignment.getVariantId());
            objectEncoderContext.add(TEMPLATEVERSION_DESCRIPTOR, rolloutAssignment.getTemplateVersion());
        }
    }
}
