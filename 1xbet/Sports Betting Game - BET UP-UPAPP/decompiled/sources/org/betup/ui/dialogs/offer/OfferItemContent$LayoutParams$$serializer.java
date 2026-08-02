package org.betup.ui.dialogs.offer;

import kotlin.Deprecated;
import kotlin.DeprecationLevel;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.UnknownFieldException;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeDecoder;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.GeneratedSerializer;
import kotlinx.serialization.internal.IntSerializer;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import org.betup.ui.dialogs.offer.OfferItemContent;
import org.modelmapper.internal.bytebuddy.description.method.MethodDescription;

/* compiled from: OfferFragment.kt */
@Metadata(d1 = {"\u00006\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0015\u0010\u0005\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00070\u0006¢\u0006\u0002\u0010\bJ\u000e\u0010\t\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\u000bJ\u0016\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u0002R\u0011\u0010\u0011\u001a\u00020\u0012¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014¨\u0006\u0015"}, d2 = {"org/betup/ui/dialogs/offer/OfferItemContent.LayoutParams.$serializer", "Lkotlinx/serialization/internal/GeneratedSerializer;", "Lorg/betup/ui/dialogs/offer/OfferItemContent$LayoutParams;", MethodDescription.CONSTRUCTOR_INTERNAL_NAME, "()V", "childSerializers", "", "Lkotlinx/serialization/KSerializer;", "()[Lkotlinx/serialization/KSerializer;", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "app_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@Deprecated(level = DeprecationLevel.HIDDEN, message = "This synthesized declaration should not be used directly")
/* loaded from: classes2.dex */
public /* synthetic */ class OfferItemContent$LayoutParams$$serializer implements GeneratedSerializer<OfferItemContent.LayoutParams> {
    public static final int $stable;
    public static final OfferItemContent$LayoutParams$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;

    private OfferItemContent$LayoutParams$$serializer() {
    }

    @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.SerializationStrategy, kotlinx.serialization.DeserializationStrategy
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    static {
        OfferItemContent$LayoutParams$$serializer offerItemContent$LayoutParams$$serializer = new OfferItemContent$LayoutParams$$serializer();
        INSTANCE = offerItemContent$LayoutParams$$serializer;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("org.betup.ui.dialogs.offer.OfferItemContent.LayoutParams", offerItemContent$LayoutParams$$serializer, 3);
        pluginGeneratedSerialDescriptor.addElement("margins", false);
        pluginGeneratedSerialDescriptor.addElement("constraints", false);
        pluginGeneratedSerialDescriptor.addElement("viewId", false);
        descriptor = pluginGeneratedSerialDescriptor;
        $stable = 8;
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public final KSerializer<?>[] childSerializers() {
        return new KSerializer[]{OfferItemContent$LayoutParams$Margins$$serializer.INSTANCE, OfferItemContent$LayoutParams$Constraints$$serializer.INSTANCE, IntSerializer.INSTANCE};
    }

    @Override // kotlinx.serialization.DeserializationStrategy
    public final OfferItemContent.LayoutParams deserialize(Decoder decoder) {
        int i;
        int i2;
        OfferItemContent.LayoutParams.Margins margins;
        OfferItemContent.LayoutParams.Constraints constraints;
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeDecoder beginStructure = decoder.beginStructure(serialDescriptor);
        if (beginStructure.decodeSequentially()) {
            OfferItemContent.LayoutParams.Margins margins2 = (OfferItemContent.LayoutParams.Margins) beginStructure.decodeSerializableElement(serialDescriptor, 0, OfferItemContent$LayoutParams$Margins$$serializer.INSTANCE, null);
            OfferItemContent.LayoutParams.Constraints constraints2 = (OfferItemContent.LayoutParams.Constraints) beginStructure.decodeSerializableElement(serialDescriptor, 1, OfferItemContent$LayoutParams$Constraints$$serializer.INSTANCE, null);
            margins = margins2;
            i = beginStructure.decodeIntElement(serialDescriptor, 2);
            constraints = constraints2;
            i2 = 7;
        } else {
            boolean z = true;
            int i3 = 0;
            OfferItemContent.LayoutParams.Margins margins3 = null;
            OfferItemContent.LayoutParams.Constraints constraints3 = null;
            int i4 = 0;
            while (z) {
                int decodeElementIndex = beginStructure.decodeElementIndex(serialDescriptor);
                if (decodeElementIndex == -1) {
                    z = false;
                } else if (decodeElementIndex == 0) {
                    margins3 = (OfferItemContent.LayoutParams.Margins) beginStructure.decodeSerializableElement(serialDescriptor, 0, OfferItemContent$LayoutParams$Margins$$serializer.INSTANCE, margins3);
                    i4 |= 1;
                } else if (decodeElementIndex == 1) {
                    constraints3 = (OfferItemContent.LayoutParams.Constraints) beginStructure.decodeSerializableElement(serialDescriptor, 1, OfferItemContent$LayoutParams$Constraints$$serializer.INSTANCE, constraints3);
                    i4 |= 2;
                } else {
                    if (decodeElementIndex != 2) {
                        throw new UnknownFieldException(decodeElementIndex);
                    }
                    i3 = beginStructure.decodeIntElement(serialDescriptor, 2);
                    i4 |= 4;
                }
            }
            i = i3;
            i2 = i4;
            margins = margins3;
            constraints = constraints3;
        }
        beginStructure.endStructure(serialDescriptor);
        return new OfferItemContent.LayoutParams(i2, margins, constraints, i, null);
    }

    @Override // kotlinx.serialization.SerializationStrategy
    public final void serialize(Encoder encoder, OfferItemContent.LayoutParams value) {
        Intrinsics.checkNotNullParameter(encoder, "encoder");
        Intrinsics.checkNotNullParameter(value, "value");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeEncoder beginStructure = encoder.beginStructure(serialDescriptor);
        OfferItemContent.LayoutParams.write$Self$app_release(value, beginStructure, serialDescriptor);
        beginStructure.endStructure(serialDescriptor);
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public KSerializer<?>[] typeParametersSerializers() {
        return GeneratedSerializer.DefaultImpls.typeParametersSerializers(this);
    }
}
