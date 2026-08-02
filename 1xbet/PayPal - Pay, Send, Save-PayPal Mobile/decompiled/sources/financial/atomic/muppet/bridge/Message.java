package financial.atomic.muppet.bridge;

@kotlin.Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u000e\n\u0002\u0010\u000b\n\u0002\b\f\b\u0081\b\u0018\u0000 +2\u00020\u0001:\u0002,-B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tB7\b\u0010\u0012\u0006\u0010\n\u001a\u00020\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\b\u0010\rJ'\u0010\u0016\u001a\u00020\u00132\u0006\u0010\u000e\u001a\u00020\u00002\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u0011H\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0017\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u0019\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001b\u001a\u00020\u0006HÆ\u0003¢\u0006\u0004\b\u001b\u0010\u001cJ.\u0010\u001d\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u0006HÆ\u0001¢\u0006\u0004\b\u001d\u0010\u001eJ\u0010\u0010\u001f\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u001f\u0010\u001aJ\u0010\u0010 \u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b \u0010\u0018J\u001a\u0010#\u001a\u00020\"2\b\u0010!\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b#\u0010$R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010%\u001a\u0004\b&\u0010\u0018R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010'\u001a\u0004\b(\u0010\u001aR\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010)\u001a\u0004\b*\u0010\u001c¨\u0006."}, d2 = {"Lfinancial/atomic/muppet/bridge/Message;", "", "", "handle", "", "method", "Lkotlinx/serialization/json/JsonArray;", "params", "<init>", "(ILjava/lang/String;Lkotlinx/serialization/json/JsonArray;)V", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(IILjava/lang/String;Lkotlinx/serialization/json/JsonArray;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "self", "Lkotlinx/serialization/encoding/CompositeEncoder;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$core_release", "(Lfinancial/atomic/muppet/bridge/Message;Lkotlinx/serialization/encoding/CompositeEncoder;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "component1", "()I", "component2", "()Ljava/lang/String;", "component3", "()Lkotlinx/serialization/json/JsonArray;", "copy", "(ILjava/lang/String;Lkotlinx/serialization/json/JsonArray;)Lfinancial/atomic/muppet/bridge/Message;", "toString", "hashCode", "other", "", "equals", "(Ljava/lang/Object;)Z", com.visa.cbp.getEncExpo.warmup, "getHandle", "Ljava/lang/String;", "getMethod", "Lkotlinx/serialization/json/JsonArray;", "getParams", "Companion", "a", util.h.xy.cb.b.f1091, "core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@kotlinx.serialization.Serializable
/* loaded from: classes17.dex */
public final /* data */ class Message {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final financial.atomic.muppet.bridge.Message.Companion INSTANCE = new financial.atomic.muppet.bridge.Message.Companion(0);
    private final int handle;
    private final java.lang.String method;
    private final kotlinx.serialization.json.JsonArray params;

    /* renamed from: financial.atomic.muppet.bridge.Message$b, reason: from kotlin metadata */
    public static final class Companion {
        private Companion() {
        }

        public final kotlinx.serialization.KSerializer<financial.atomic.muppet.bridge.Message> serializer() {
            return financial.atomic.muppet.bridge.Message.a.f6836a;
        }

        public /* synthetic */ Companion(int i) {
            this();
        }
    }

    public /* synthetic */ Message(int i, int i2, java.lang.String str, kotlinx.serialization.json.JsonArray jsonArray, kotlinx.serialization.internal.SerializationConstructorMarker serializationConstructorMarker) {
        if (7 != (i & 7)) {
            kotlinx.serialization.internal.PluginExceptionsKt.throwMissingFieldException(i, 7, financial.atomic.muppet.bridge.Message.a.f6836a.getDescriptor());
        }
        this.handle = i2;
        this.method = str;
        this.params = jsonArray;
    }

    @kotlin.jvm.JvmStatic
    public static final /* synthetic */ void write$Self$core_release(financial.atomic.muppet.bridge.Message self, kotlinx.serialization.encoding.CompositeEncoder output, kotlinx.serialization.descriptors.SerialDescriptor serialDesc) {
        output.encodeIntElement(serialDesc, 0, self.handle);
        output.encodeStringElement(serialDesc, 1, self.method);
        output.encodeSerializableElement(serialDesc, 2, kotlinx.serialization.json.JsonArraySerializer.INSTANCE, self.params);
    }

    public final int getHandle() {
        return this.handle;
    }

    public final java.lang.String getMethod() {
        return this.method;
    }

    public final kotlinx.serialization.json.JsonArray getParams() {
        return this.params;
    }

    public Message(int i, java.lang.String str, kotlinx.serialization.json.JsonArray jsonArray) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(jsonArray, "");
        this.handle = i;
        this.method = str;
        this.params = jsonArray;
    }

    public final java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("Message(handle=");
        sb.append(this.handle);
        sb.append(", method=");
        sb.append(this.method);
        sb.append(", params=");
        sb.append(this.params);
        sb.append(')');
        return sb.toString();
    }

    public final int hashCode() {
        int hashCode = java.lang.Integer.hashCode(this.handle);
        return this.params.hashCode() + ((this.method.hashCode() + (hashCode * 31)) * 31);
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof financial.atomic.muppet.bridge.Message)) {
            return false;
        }
        financial.atomic.muppet.bridge.Message message = (financial.atomic.muppet.bridge.Message) other;
        return this.handle == message.handle && kotlin.jvm.internal.Intrinsics.areEqual(this.method, message.method) && kotlin.jvm.internal.Intrinsics.areEqual(this.params, message.params);
    }

    public final financial.atomic.muppet.bridge.Message copy(int handle, java.lang.String method, kotlinx.serialization.json.JsonArray params) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(method, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(params, "");
        return new financial.atomic.muppet.bridge.Message(handle, method, params);
    }

    /* renamed from: component3, reason: from getter */
    public final kotlinx.serialization.json.JsonArray getParams() {
        return this.params;
    }

    /* renamed from: component2, reason: from getter */
    public final java.lang.String getMethod() {
        return this.method;
    }

    public final /* synthetic */ class a implements kotlinx.serialization.internal.GeneratedSerializer {

        /* renamed from: a, reason: collision with root package name */
        public static final financial.atomic.muppet.bridge.Message.a f6836a;
        private static final kotlinx.serialization.descriptors.SerialDescriptor getHighSpeedVideoSizes;

        static {
            financial.atomic.muppet.bridge.Message.a aVar = new financial.atomic.muppet.bridge.Message.a();
            f6836a = aVar;
            kotlinx.serialization.internal.PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new kotlinx.serialization.internal.PluginGeneratedSerialDescriptor("financial.atomic.muppet.bridge.Message", aVar, 3);
            pluginGeneratedSerialDescriptor.addElement("handle", false);
            pluginGeneratedSerialDescriptor.addElement("method", false);
            pluginGeneratedSerialDescriptor.addElement("params", false);
            getHighSpeedVideoSizes = pluginGeneratedSerialDescriptor;
        }

        @Override // kotlinx.serialization.internal.GeneratedSerializer
        public final kotlinx.serialization.KSerializer[] childSerializers() {
            return new kotlinx.serialization.KSerializer[]{kotlinx.serialization.internal.IntSerializer.INSTANCE, kotlinx.serialization.internal.StringSerializer.INSTANCE, kotlinx.serialization.json.JsonArraySerializer.INSTANCE};
        }

        @Override // kotlinx.serialization.DeserializationStrategy
        public final java.lang.Object deserialize(kotlinx.serialization.encoding.Decoder decoder) {
            int i;
            kotlinx.serialization.json.JsonArray jsonArray;
            java.lang.String str;
            int i2;
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(decoder, "");
            kotlinx.serialization.descriptors.SerialDescriptor serialDescriptor = getHighSpeedVideoSizes;
            kotlinx.serialization.encoding.CompositeDecoder beginStructure = decoder.beginStructure(serialDescriptor);
            kotlinx.serialization.json.JsonArray jsonArray2 = null;
            if (beginStructure.decodeSequentially()) {
                int decodeIntElement = beginStructure.decodeIntElement(serialDescriptor, 0);
                java.lang.String decodeStringElement = beginStructure.decodeStringElement(serialDescriptor, 1);
                i = decodeIntElement;
                jsonArray = (kotlinx.serialization.json.JsonArray) beginStructure.decodeSerializableElement(serialDescriptor, 2, kotlinx.serialization.json.JsonArraySerializer.INSTANCE, null);
                i2 = 7;
                str = decodeStringElement;
            } else {
                java.lang.String str2 = null;
                int i3 = 0;
                int i4 = 0;
                boolean z = true;
                while (z) {
                    int decodeElementIndex = beginStructure.decodeElementIndex(serialDescriptor);
                    if (decodeElementIndex == -1) {
                        z = false;
                    } else if (decodeElementIndex == 0) {
                        i3 = beginStructure.decodeIntElement(serialDescriptor, 0);
                        i4 |= 1;
                    } else if (decodeElementIndex == 1) {
                        str2 = beginStructure.decodeStringElement(serialDescriptor, 1);
                        i4 |= 2;
                    } else {
                        if (decodeElementIndex != 2) {
                            throw new kotlinx.serialization.UnknownFieldException(decodeElementIndex);
                        }
                        jsonArray2 = (kotlinx.serialization.json.JsonArray) beginStructure.decodeSerializableElement(serialDescriptor, 2, kotlinx.serialization.json.JsonArraySerializer.INSTANCE, jsonArray2);
                        i4 |= 4;
                    }
                }
                i = i3;
                jsonArray = jsonArray2;
                str = str2;
                i2 = i4;
            }
            beginStructure.endStructure(serialDescriptor);
            return new financial.atomic.muppet.bridge.Message(i2, i, str, jsonArray, null);
        }

        @Override // kotlinx.serialization.SerializationStrategy
        public final void serialize(kotlinx.serialization.encoding.Encoder encoder, java.lang.Object obj) {
            financial.atomic.muppet.bridge.Message message = (financial.atomic.muppet.bridge.Message) obj;
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(encoder, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(message, "");
            kotlinx.serialization.descriptors.SerialDescriptor serialDescriptor = getHighSpeedVideoSizes;
            kotlinx.serialization.encoding.CompositeEncoder beginStructure = encoder.beginStructure(serialDescriptor);
            financial.atomic.muppet.bridge.Message.write$Self$core_release(message, beginStructure, serialDescriptor);
            beginStructure.endStructure(serialDescriptor);
        }

        @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.SerializationStrategy, kotlinx.serialization.DeserializationStrategy
        public final kotlinx.serialization.descriptors.SerialDescriptor getDescriptor() {
            return getHighSpeedVideoSizes;
        }

        private a() {
        }
    }

    /* renamed from: component1, reason: from getter */
    public final int getHandle() {
        return this.handle;
    }

    public static /* synthetic */ financial.atomic.muppet.bridge.Message copy$default(financial.atomic.muppet.bridge.Message message, int i, java.lang.String str, kotlinx.serialization.json.JsonArray jsonArray, int i2, java.lang.Object obj) {
        if ((i2 & 1) != 0) {
            i = message.handle;
        }
        if ((i2 & 2) != 0) {
            str = message.method;
        }
        if ((i2 & 4) != 0) {
            jsonArray = message.params;
        }
        return message.copy(i, str, jsonArray);
    }
}
