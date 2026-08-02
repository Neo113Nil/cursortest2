package androidx.content.preferences.protobuf;

@androidx.content.preferences.protobuf.CheckReturnValue
/* loaded from: classes3.dex */
final class ManifestSchemaFactory implements androidx.content.preferences.protobuf.SchemaFactory {
    private static final androidx.content.preferences.protobuf.MessageInfoFactory getHighResolutionOutputSizeshNQ4ISI = new androidx.content.preferences.protobuf.MessageInfoFactory() { // from class: androidx.datastore.preferences.protobuf.ManifestSchemaFactory.1
        @Override // androidx.content.preferences.protobuf.MessageInfoFactory
        public final boolean getHighSpeedVideoSizes(java.lang.Class<?> cls) {
            return false;
        }

        @Override // androidx.content.preferences.protobuf.MessageInfoFactory
        public final androidx.content.preferences.protobuf.MessageInfo getHighResolutionOutputSizeshNQ4ISI(java.lang.Class<?> cls) {
            throw new java.lang.IllegalStateException("This should never be called.");
        }
    };
    private final androidx.content.preferences.protobuf.MessageInfoFactory Camera2StreamConfigurationMap;

    private ManifestSchemaFactory(androidx.content.preferences.protobuf.MessageInfoFactory messageInfoFactory) {
        this.Camera2StreamConfigurationMap = (androidx.content.preferences.protobuf.MessageInfoFactory) androidx.content.preferences.protobuf.Internal.getHighSpeedVideoSizes(messageInfoFactory, "messageInfoFactory");
    }

    @Override // androidx.content.preferences.protobuf.SchemaFactory
    public final <T> androidx.content.preferences.protobuf.Schema<T> Camera2StreamConfigurationMap(java.lang.Class<T> cls) {
        androidx.content.preferences.protobuf.SchemaUtil.getHighSpeedVideoFpsRangesFor((java.lang.Class<?>) cls);
        androidx.content.preferences.protobuf.MessageInfo highResolutionOutputSizeshNQ4ISI = this.Camera2StreamConfigurationMap.getHighResolutionOutputSizeshNQ4ISI(cls);
        if (highResolutionOutputSizeshNQ4ISI.getHighSpeedVideoFpsRangesFor()) {
            if (androidx.content.preferences.protobuf.Protobuf.getHighSpeedVideoFpsRanges || androidx.content.preferences.protobuf.GeneratedMessageLite.class.isAssignableFrom(cls)) {
                return androidx.content.preferences.protobuf.MessageSetSchema.getHighSpeedVideoFpsRangesFor(androidx.content.preferences.protobuf.SchemaUtil.getHighResolutionOutputSizeshNQ4ISI(), androidx.content.preferences.protobuf.ExtensionSchemas.Camera2StreamConfigurationMap(), highResolutionOutputSizeshNQ4ISI.Camera2StreamConfigurationMap());
            }
            return androidx.content.preferences.protobuf.MessageSetSchema.getHighSpeedVideoFpsRangesFor(androidx.content.preferences.protobuf.SchemaUtil.getHighSpeedVideoFpsRangesFor(), androidx.content.preferences.protobuf.ExtensionSchemas.getHighSpeedVideoFpsRanges(), highResolutionOutputSizeshNQ4ISI.Camera2StreamConfigurationMap());
        }
        if (androidx.content.preferences.protobuf.Protobuf.getHighSpeedVideoFpsRanges || androidx.content.preferences.protobuf.GeneratedMessageLite.class.isAssignableFrom(cls)) {
            return androidx.content.preferences.protobuf.MessageSchema.getHighResolutionOutputSizeshNQ4ISI(highResolutionOutputSizeshNQ4ISI, androidx.content.preferences.protobuf.NewInstanceSchemas.getHighSpeedVideoSizes(), androidx.content.preferences.protobuf.ListFieldSchemas.Camera2StreamConfigurationMap(), androidx.content.preferences.protobuf.SchemaUtil.getHighResolutionOutputSizeshNQ4ISI(), androidx.content.preferences.protobuf.ManifestSchemaFactory.AnonymousClass2.getHighResolutionOutputSizeshNQ4ISI[highResolutionOutputSizeshNQ4ISI.getHighResolutionOutputSizeshNQ4ISI().ordinal()] != 1 ? androidx.content.preferences.protobuf.ExtensionSchemas.Camera2StreamConfigurationMap() : null, androidx.content.preferences.protobuf.MapFieldSchemas.getHighSpeedVideoFpsRangesFor());
        }
        return androidx.content.preferences.protobuf.MessageSchema.getHighResolutionOutputSizeshNQ4ISI(highResolutionOutputSizeshNQ4ISI, androidx.content.preferences.protobuf.NewInstanceSchemas.getHighResolutionOutputSizeshNQ4ISI(), androidx.content.preferences.protobuf.ListFieldSchemas.getHighResolutionOutputSizeshNQ4ISI(), androidx.content.preferences.protobuf.SchemaUtil.getHighSpeedVideoFpsRangesFor(), androidx.content.preferences.protobuf.ManifestSchemaFactory.AnonymousClass2.getHighResolutionOutputSizeshNQ4ISI[highResolutionOutputSizeshNQ4ISI.getHighResolutionOutputSizeshNQ4ISI().ordinal()] != 1 ? androidx.content.preferences.protobuf.ExtensionSchemas.getHighSpeedVideoFpsRanges() : null, androidx.content.preferences.protobuf.MapFieldSchemas.Camera2StreamConfigurationMap());
    }

    /* renamed from: androidx.datastore.preferences.protobuf.ManifestSchemaFactory$2, reason: invalid class name */
    static /* synthetic */ class AnonymousClass2 {
        static final /* synthetic */ int[] getHighResolutionOutputSizeshNQ4ISI;

        static {
            int[] iArr = new int[androidx.content.preferences.protobuf.ProtoSyntax.values().length];
            getHighResolutionOutputSizeshNQ4ISI = iArr;
            try {
                iArr[androidx.content.preferences.protobuf.ProtoSyntax.PROTO3.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
        }
    }

    static class CompositeMessageInfoFactory implements androidx.content.preferences.protobuf.MessageInfoFactory {
        private androidx.content.preferences.protobuf.MessageInfoFactory[] getHighResolutionOutputSizeshNQ4ISI;

        CompositeMessageInfoFactory(androidx.content.preferences.protobuf.MessageInfoFactory... messageInfoFactoryArr) {
            this.getHighResolutionOutputSizeshNQ4ISI = messageInfoFactoryArr;
        }

        @Override // androidx.content.preferences.protobuf.MessageInfoFactory
        public final boolean getHighSpeedVideoSizes(java.lang.Class<?> cls) {
            for (androidx.content.preferences.protobuf.MessageInfoFactory messageInfoFactory : this.getHighResolutionOutputSizeshNQ4ISI) {
                if (messageInfoFactory.getHighSpeedVideoSizes(cls)) {
                    return true;
                }
            }
            return false;
        }

        @Override // androidx.content.preferences.protobuf.MessageInfoFactory
        public final androidx.content.preferences.protobuf.MessageInfo getHighResolutionOutputSizeshNQ4ISI(java.lang.Class<?> cls) {
            for (androidx.content.preferences.protobuf.MessageInfoFactory messageInfoFactory : this.getHighResolutionOutputSizeshNQ4ISI) {
                if (messageInfoFactory.getHighSpeedVideoSizes(cls)) {
                    return messageInfoFactory.getHighResolutionOutputSizeshNQ4ISI(cls);
                }
            }
            java.lang.StringBuilder sb = new java.lang.StringBuilder("No factory is available for message type: ");
            sb.append(cls.getName());
            throw new java.lang.UnsupportedOperationException(sb.toString());
        }
    }

    private static androidx.content.preferences.protobuf.MessageInfoFactory getHighSpeedVideoFpsRanges() {
        if (androidx.content.preferences.protobuf.Protobuf.getHighSpeedVideoFpsRanges) {
            return getHighResolutionOutputSizeshNQ4ISI;
        }
        try {
            return (androidx.content.preferences.protobuf.MessageInfoFactory) java.lang.Class.forName("androidx.datastore.preferences.protobuf.DescriptorMessageInfoFactory").getDeclaredMethod("getInstance", new java.lang.Class[0]).invoke(null, new java.lang.Object[0]);
        } catch (java.lang.Exception unused) {
            return getHighResolutionOutputSizeshNQ4ISI;
        }
    }

    public ManifestSchemaFactory() {
        this(new androidx.datastore.preferences.protobuf.ManifestSchemaFactory.CompositeMessageInfoFactory(androidx.content.preferences.protobuf.GeneratedMessageInfoFactory.getHighSpeedVideoFpsRangesFor(), getHighSpeedVideoFpsRanges()));
    }
}
