package com.google.protobuf.kotlin;

@kotlin.Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u001aN\u0010\u0007\u001a\u00020\u0006\"\u0012\b\u0000\u0010\u0001*\f\u0012\u0004\u0012\u00028\u0000\u0012\u0002\b\u00030\u0000\"\u0012\b\u0001\u0010\u0003*\f\u0012\u0004\u0012\u00028\u0000\u0012\u0002\b\u00030\u0002*\u00028\u00012\u0010\u0010\u0005\u001a\f\u0012\u0004\u0012\u00028\u0000\u0012\u0002\b\u00030\u0004H\u0086\u0002¢\u0006\u0004\b\u0007\u0010\b\u001aZ\u0010\f\u001a\u00028\u0002\"\u0012\b\u0000\u0010\u0001*\f\u0012\u0004\u0012\u00028\u0000\u0012\u0002\b\u00030\u0000\"\u0012\b\u0001\u0010\t*\f\u0012\u0004\u0012\u00028\u0000\u0012\u0002\b\u00030\u0002\"\b\b\u0002\u0010\u000b*\u00020\n*\u00028\u00012\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00020\u0004H\u0086\u0002¢\u0006\u0004\b\f\u0010\r\u001af\u0010\u0012\u001a\u00020\u0011\"\u0014\b\u0000\u0010\u0001*\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0000\"\u0014\b\u0001\u0010\u000f*\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u000e\"\b\b\u0002\u0010\u000b*\u00020\n*\u00028\u00012\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00020\u00042\u0006\u0010\u0010\u001a\u00028\u0002H\u0086\u0002¢\u0006\u0004\b\u0012\u0010\u0013"}, d2 = {"Lcom/google/protobuf/GeneratedMessageLite$ExtendableMessage;", "M", "Lcom/google/protobuf/GeneratedMessageLite$ExtendableMessageOrBuilder;", "MorBT", "Lcom/google/protobuf/ExtensionLite;", "extension", "", "contains", "(Lcom/google/protobuf/GeneratedMessageLite$ExtendableMessageOrBuilder;Lcom/google/protobuf/ExtensionLite;)Z", "MOrBT", "", "T", "get", "(Lcom/google/protobuf/GeneratedMessageLite$ExtendableMessageOrBuilder;Lcom/google/protobuf/ExtensionLite;)Ljava/lang/Object;", "Lcom/google/protobuf/GeneratedMessageLite$ExtendableBuilder;", "B", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "", "set", "(Lcom/google/protobuf/GeneratedMessageLite$ExtendableBuilder;Lcom/google/protobuf/ExtensionLite;Ljava/lang/Object;)V"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes9.dex */
public final class ExtendableMessageLiteExtensionsKt {
    public static final <M extends com.google.protobuf.GeneratedMessageLite.ExtendableMessage<M, ?>, MOrBT extends com.google.protobuf.GeneratedMessageLite.ExtendableMessageOrBuilder<M, ?>, T> T get(MOrBT morbt, com.google.protobuf.ExtensionLite<M, T> extensionLite) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(morbt, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(extensionLite, "");
        T t = (T) morbt.getExtension(extensionLite);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(t, "");
        return t;
    }

    public static final <M extends com.google.protobuf.GeneratedMessageLite.ExtendableMessage<M, B>, B extends com.google.protobuf.GeneratedMessageLite.ExtendableBuilder<M, B>, T> void set(B b, com.google.protobuf.ExtensionLite<M, T> extensionLite, T t) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(b, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(extensionLite, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(t, "");
        b.setExtension(extensionLite, t);
    }

    public static final <M extends com.google.protobuf.GeneratedMessageLite.ExtendableMessage<M, ?>, MorBT extends com.google.protobuf.GeneratedMessageLite.ExtendableMessageOrBuilder<M, ?>> boolean contains(MorBT morbt, com.google.protobuf.ExtensionLite<M, ?> extensionLite) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(morbt, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(extensionLite, "");
        return morbt.hasExtension(extensionLite);
    }
}
