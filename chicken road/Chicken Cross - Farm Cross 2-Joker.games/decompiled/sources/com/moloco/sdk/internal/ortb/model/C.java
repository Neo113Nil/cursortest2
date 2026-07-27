package com.moloco.sdk.internal.ortb.model;

import androidx.compose.ui.graphics.Color;
import com.facebook.internal.AnalyticsEvents;
import kotlin.Deprecated;
import kotlin.DeprecationLevel;
import kotlin.Metadata;
import kotlin.UInt;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.SerialName;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.UnknownFieldException;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeDecoder;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.GeneratedSerializer;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.UIntSerializer;

@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0015\b\u0001\u0018\u0000 *2\u00020\u0001:\u0002\u0017\u001eB'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bBC\b\u0010\u0012\u0006\u0010\r\u001a\u00020\f\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e¢\u0006\u0004\b\n\u0010\u0010J'\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0011\u001a\u00020\u00002\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\u0014H\u0001¢\u0006\u0004\b\u0017\u0010\u0018R \u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0017\u0010\u0019\u0012\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001a\u0010\u001bR \u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u001e\u0010\u001f\u0012\u0004\b\"\u0010\u001d\u001a\u0004\b \u0010!R \u0010\u0007\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b#\u0010$\u0012\u0004\b'\u0010\u001d\u001a\u0004\b%\u0010&R \u0010\t\u001a\u00020\b8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b \u0010(\u0012\u0004\b#\u0010\u001d\u001a\u0004\b\u001e\u0010)¨\u0006+"}, d2 = {"Lcom/moloco/sdk/internal/ortb/model/C;", "", "Lkotlin/UInt;", "padding", "Lcom/moloco/sdk/internal/ortb/model/w;", "horizontalAlignment", "Lcom/moloco/sdk/internal/ortb/model/H;", "verticalAlignment", "Landroidx/compose/ui/graphics/Color;", "foregroundColor", "<init>", "(ILcom/moloco/sdk/internal/ortb/model/w;Lcom/moloco/sdk/internal/ortb/model/H;JLkotlin/jvm/internal/DefaultConstructorMarker;)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILkotlin/UInt;Lcom/moloco/sdk/internal/ortb/model/w;Lcom/moloco/sdk/internal/ortb/model/H;Landroidx/compose/ui/graphics/Color;Lkotlinx/serialization/internal/SerializationConstructorMarker;Lkotlin/jvm/internal/DefaultConstructorMarker;)V", "self", "Lkotlinx/serialization/encoding/CompositeEncoder;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "a", "(Lcom/moloco/sdk/internal/ortb/model/C;Lkotlinx/serialization/encoding/CompositeEncoder;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "I", "f", "()I", "g", "()V", "b", "Lcom/moloco/sdk/internal/ortb/model/w;", "d", "()Lcom/moloco/sdk/internal/ortb/model/w;", "e", "c", "Lcom/moloco/sdk/internal/ortb/model/H;", "h", "()Lcom/moloco/sdk/internal/ortb/model/H;", "i", "J", "()J", com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.k.M, "moloco-sdk_release"}, k = 1, mv = {2, 0, 0})
@Serializable
/* loaded from: classes7.dex */
public final class C {
    public static final int e = 0;

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    public final int padding;

    /* renamed from: b, reason: from kotlin metadata */
    public final w horizontalAlignment;

    /* renamed from: c, reason: from kotlin metadata */
    public final H verticalAlignment;

    /* renamed from: d, reason: from kotlin metadata */
    public final long foregroundColor;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final KSerializer<Object>[] f = {null, w.INSTANCE.serializer(), H.INSTANCE.serializer(), null};

    @Deprecated(level = DeprecationLevel.HIDDEN, message = "This synthesized declaration should not be used directly")
    public /* synthetic */ class a implements GeneratedSerializer<C> {

        /* renamed from: a, reason: collision with root package name */
        public static final a f10522a;
        public static final int b;
        private static final SerialDescriptor descriptor;

        static {
            a aVar = new a();
            f10522a = aVar;
            b = 8;
            PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.moloco.sdk.internal.ortb.model.ProgressBar", aVar, 4);
            pluginGeneratedSerialDescriptor.addElement("padding", false);
            pluginGeneratedSerialDescriptor.addElement(AnalyticsEvents.PARAMETER_LIKE_VIEW_HORIZONTAL_ALIGNMENT, false);
            pluginGeneratedSerialDescriptor.addElement("vertical_alignment", false);
            pluginGeneratedSerialDescriptor.addElement("foreground_color", false);
            descriptor = pluginGeneratedSerialDescriptor;
        }

        @Override // kotlinx.serialization.DeserializationStrategy
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final C deserialize(Decoder decoder) {
            int i;
            UInt uInt;
            w wVar;
            H h;
            Color color;
            Intrinsics.checkNotNullParameter(decoder, "decoder");
            SerialDescriptor serialDescriptor = descriptor;
            CompositeDecoder beginStructure = decoder.beginStructure(serialDescriptor);
            KSerializer[] kSerializerArr = C.f;
            UInt uInt2 = null;
            if (beginStructure.decodeSequentially()) {
                UInt uInt3 = (UInt) beginStructure.decodeSerializableElement(serialDescriptor, 0, UIntSerializer.INSTANCE, null);
                w wVar2 = (w) beginStructure.decodeSerializableElement(serialDescriptor, 1, kSerializerArr[1], null);
                h = (H) beginStructure.decodeSerializableElement(serialDescriptor, 2, kSerializerArr[2], null);
                uInt = uInt3;
                color = (Color) beginStructure.decodeSerializableElement(serialDescriptor, 3, j.f10549a, null);
                i = 15;
                wVar = wVar2;
            } else {
                boolean z = true;
                int i2 = 0;
                w wVar3 = null;
                H h2 = null;
                Color color2 = null;
                while (z) {
                    int decodeElementIndex = beginStructure.decodeElementIndex(serialDescriptor);
                    if (decodeElementIndex == -1) {
                        z = false;
                    } else if (decodeElementIndex == 0) {
                        uInt2 = (UInt) beginStructure.decodeSerializableElement(serialDescriptor, 0, UIntSerializer.INSTANCE, uInt2);
                        i2 |= 1;
                    } else if (decodeElementIndex == 1) {
                        wVar3 = (w) beginStructure.decodeSerializableElement(serialDescriptor, 1, kSerializerArr[1], wVar3);
                        i2 |= 2;
                    } else if (decodeElementIndex == 2) {
                        h2 = (H) beginStructure.decodeSerializableElement(serialDescriptor, 2, kSerializerArr[2], h2);
                        i2 |= 4;
                    } else {
                        if (decodeElementIndex != 3) {
                            throw new UnknownFieldException(decodeElementIndex);
                        }
                        color2 = (Color) beginStructure.decodeSerializableElement(serialDescriptor, 3, j.f10549a, color2);
                        i2 |= 8;
                    }
                }
                i = i2;
                uInt = uInt2;
                wVar = wVar3;
                h = h2;
                color = color2;
            }
            beginStructure.endStructure(serialDescriptor);
            return new C(i, uInt, wVar, h, color, null, null);
        }

        @Override // kotlinx.serialization.internal.GeneratedSerializer
        public final KSerializer<?>[] childSerializers() {
            KSerializer<?>[] kSerializerArr = C.f;
            return new KSerializer[]{UIntSerializer.INSTANCE, kSerializerArr[1], kSerializerArr[2], j.f10549a};
        }

        @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.SerializationStrategy, kotlinx.serialization.DeserializationStrategy
        public final SerialDescriptor getDescriptor() {
            return descriptor;
        }

        @Override // kotlinx.serialization.SerializationStrategy
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final void serialize(Encoder encoder, C value) {
            Intrinsics.checkNotNullParameter(encoder, "encoder");
            Intrinsics.checkNotNullParameter(value, "value");
            SerialDescriptor serialDescriptor = descriptor;
            CompositeEncoder beginStructure = encoder.beginStructure(serialDescriptor);
            C.a(value, beginStructure, serialDescriptor);
            beginStructure.endStructure(serialDescriptor);
        }
    }

    /* renamed from: com.moloco.sdk.internal.ortb.model.C$b, reason: from kotlin metadata */
    public static final class Companion {
        public Companion() {
        }

        public final KSerializer<C> serializer() {
            return a.f10522a;
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public /* synthetic */ C(int i, w wVar, H h, long j, DefaultConstructorMarker defaultConstructorMarker) {
        this(i, wVar, h, j);
    }

    @SerialName("foreground_color")
    @Serializable(with = j.class)
    public static /* synthetic */ void c() {
    }

    @SerialName(AnalyticsEvents.PARAMETER_LIKE_VIEW_HORIZONTAL_ALIGNMENT)
    public static /* synthetic */ void e() {
    }

    @SerialName("padding")
    public static /* synthetic */ void g() {
    }

    @SerialName("vertical_alignment")
    public static /* synthetic */ void i() {
    }

    /* renamed from: b, reason: from getter */
    public final long getForegroundColor() {
        return this.foregroundColor;
    }

    /* renamed from: d, reason: from getter */
    public final w getHorizontalAlignment() {
        return this.horizontalAlignment;
    }

    /* renamed from: f, reason: from getter */
    public final int getPadding() {
        return this.padding;
    }

    /* renamed from: h, reason: from getter */
    public final H getVerticalAlignment() {
        return this.verticalAlignment;
    }

    public /* synthetic */ C(int i, UInt uInt, w wVar, H h, Color color, SerializationConstructorMarker serializationConstructorMarker, DefaultConstructorMarker defaultConstructorMarker) {
        this(i, uInt, wVar, h, color, serializationConstructorMarker);
    }

    @JvmStatic
    public static final /* synthetic */ void a(C self, CompositeEncoder output, SerialDescriptor serialDesc) {
        KSerializer<Object>[] kSerializerArr = f;
        output.encodeSerializableElement(serialDesc, 0, UIntSerializer.INSTANCE, UInt.m8170boximpl(self.padding));
        output.encodeSerializableElement(serialDesc, 1, kSerializerArr[1], self.horizontalAlignment);
        output.encodeSerializableElement(serialDesc, 2, kSerializerArr[2], self.verticalAlignment);
        output.encodeSerializableElement(serialDesc, 3, j.f10549a, Color.m1618boximpl(self.foregroundColor));
    }

    public /* synthetic */ C(int i, UInt uInt, w wVar, H h, Color color, SerializationConstructorMarker serializationConstructorMarker) {
        if (15 != (i & 15)) {
            PluginExceptionsKt.throwMissingFieldException(i, 15, a.f10522a.getDescriptor());
        }
        this.padding = uInt.getData();
        this.horizontalAlignment = wVar;
        this.verticalAlignment = h;
        this.foregroundColor = color.m1638unboximpl();
    }

    public C(int i, w horizontalAlignment, H verticalAlignment, long j) {
        Intrinsics.checkNotNullParameter(horizontalAlignment, "horizontalAlignment");
        Intrinsics.checkNotNullParameter(verticalAlignment, "verticalAlignment");
        this.padding = i;
        this.horizontalAlignment = horizontalAlignment;
        this.verticalAlignment = verticalAlignment;
        this.foregroundColor = j;
    }
}
