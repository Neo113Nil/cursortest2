package kotlin.reflect.jvm.internal.impl.metadata.deserialization;

/* loaded from: classes5.dex */
public final class ProtoBufUtilKt {
    /* JADX WARN: Multi-variable type inference failed */
    public static final <M extends kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.ExtendableMessage<M>, T> T getExtensionOrNull(kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.ExtendableMessage<M> extendableMessage, kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.GeneratedExtension<M, T> generatedExtension) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(extendableMessage, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(generatedExtension, "");
        if (extendableMessage.hasExtension(generatedExtension)) {
            return (T) extendableMessage.getExtension(generatedExtension);
        }
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final <M extends kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.ExtendableMessage<M>, T> T getExtensionOrNull(kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.ExtendableMessage<M> extendableMessage, kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.GeneratedExtension<M, java.util.List<T>> generatedExtension, int i) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(extendableMessage, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(generatedExtension, "");
        if (i < extendableMessage.getExtensionCount(generatedExtension)) {
            return (T) extendableMessage.getExtension(generatedExtension, i);
        }
        return null;
    }
}
