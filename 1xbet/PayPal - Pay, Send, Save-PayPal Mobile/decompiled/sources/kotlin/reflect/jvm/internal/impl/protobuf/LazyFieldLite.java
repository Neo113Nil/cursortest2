package kotlin.reflect.jvm.internal.impl.protobuf;

/* loaded from: classes5.dex */
public class LazyFieldLite {
    private kotlin.reflect.jvm.internal.impl.protobuf.ByteString Camera2StreamConfigurationMap;
    private kotlin.reflect.jvm.internal.impl.protobuf.ExtensionRegistryLite getHighResolutionOutputSizeshNQ4ISI;
    private volatile boolean getHighSpeedVideoSizes;
    protected volatile kotlin.reflect.jvm.internal.impl.protobuf.MessageLite value;

    public kotlin.reflect.jvm.internal.impl.protobuf.MessageLite getValue(kotlin.reflect.jvm.internal.impl.protobuf.MessageLite messageLite) {
        ensureInitialized(messageLite);
        return this.value;
    }

    public kotlin.reflect.jvm.internal.impl.protobuf.MessageLite setValue(kotlin.reflect.jvm.internal.impl.protobuf.MessageLite messageLite) {
        kotlin.reflect.jvm.internal.impl.protobuf.MessageLite messageLite2 = this.value;
        this.value = messageLite;
        this.Camera2StreamConfigurationMap = null;
        this.getHighSpeedVideoSizes = true;
        return messageLite2;
    }

    public int getSerializedSize() {
        if (this.getHighSpeedVideoSizes) {
            return this.value.getSerializedSize();
        }
        return this.Camera2StreamConfigurationMap.size();
    }

    protected void ensureInitialized(kotlin.reflect.jvm.internal.impl.protobuf.MessageLite messageLite) {
        if (this.value == null) {
            synchronized (this) {
                if (this.value != null) {
                    return;
                }
                try {
                    if (this.Camera2StreamConfigurationMap != null) {
                        this.value = messageLite.getParserForType().parseFrom(this.Camera2StreamConfigurationMap, this.getHighResolutionOutputSizeshNQ4ISI);
                    } else {
                        this.value = messageLite;
                    }
                } catch (java.io.IOException unused) {
                }
            }
        }
    }
}
