package androidx.content.preferences.protobuf;

/* loaded from: classes3.dex */
class GeneratedMessageInfoFactory implements androidx.content.preferences.protobuf.MessageInfoFactory {
    private static final androidx.content.preferences.protobuf.GeneratedMessageInfoFactory getHighResolutionOutputSizeshNQ4ISI = new androidx.content.preferences.protobuf.GeneratedMessageInfoFactory();

    private GeneratedMessageInfoFactory() {
    }

    public static androidx.content.preferences.protobuf.GeneratedMessageInfoFactory getHighSpeedVideoFpsRangesFor() {
        return getHighResolutionOutputSizeshNQ4ISI;
    }

    @Override // androidx.content.preferences.protobuf.MessageInfoFactory
    public final boolean getHighSpeedVideoSizes(java.lang.Class<?> cls) {
        return androidx.content.preferences.protobuf.GeneratedMessageLite.class.isAssignableFrom(cls);
    }

    @Override // androidx.content.preferences.protobuf.MessageInfoFactory
    public final androidx.content.preferences.protobuf.MessageInfo getHighResolutionOutputSizeshNQ4ISI(java.lang.Class<?> cls) {
        if (!androidx.content.preferences.protobuf.GeneratedMessageLite.class.isAssignableFrom(cls)) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Unsupported message type: ");
            sb.append(cls.getName());
            throw new java.lang.IllegalArgumentException(sb.toString());
        }
        try {
            return (androidx.content.preferences.protobuf.MessageInfo) androidx.content.preferences.protobuf.GeneratedMessageLite.Camera2StreamConfigurationMap(cls.asSubclass(androidx.content.preferences.protobuf.GeneratedMessageLite.class)).getOutputMinFrameDuration();
        } catch (java.lang.Exception e) {
            java.lang.StringBuilder sb2 = new java.lang.StringBuilder("Unable to get message info for ");
            sb2.append(cls.getName());
            throw new java.lang.RuntimeException(sb2.toString(), e);
        }
    }
}
