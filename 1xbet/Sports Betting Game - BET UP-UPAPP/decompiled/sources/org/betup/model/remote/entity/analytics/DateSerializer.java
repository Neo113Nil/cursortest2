package org.betup.model.remote.entity.analytics;

import com.google.common.net.HttpHeaders;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.PrimitiveKind;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.descriptors.SerialDescriptorsKt;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import org.modelmapper.internal.bytebuddy.description.method.MethodDescription;

/* compiled from: OfferModel.kt */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0018\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0002H\u0016J\u0010\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u0012H\u0016R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\u00020\bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0013"}, d2 = {"Lorg/betup/model/remote/entity/analytics/DateSerializer;", "Lkotlinx/serialization/KSerializer;", "Ljava/util/Date;", MethodDescription.CONSTRUCTOR_INTERNAL_NAME, "()V", "dateFormat", "Ljava/text/SimpleDateFormat;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "app_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class DateSerializer implements KSerializer<Date> {
    public static final DateSerializer INSTANCE = new DateSerializer();
    private static final SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSSXXX", Locale.getDefault());
    private static final SerialDescriptor descriptor = SerialDescriptorsKt.PrimitiveSerialDescriptor(HttpHeaders.DATE, PrimitiveKind.STRING.INSTANCE);
    public static final int $stable = 8;

    private DateSerializer() {
    }

    @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.SerializationStrategy, kotlinx.serialization.DeserializationStrategy
    public SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.SerializationStrategy
    public void serialize(Encoder encoder, Date value) {
        Intrinsics.checkNotNullParameter(encoder, "encoder");
        Intrinsics.checkNotNullParameter(value, "value");
        String format = dateFormat.format(value);
        Intrinsics.checkNotNull(format);
        encoder.encodeString(format);
    }

    @Override // kotlinx.serialization.DeserializationStrategy
    public Date deserialize(Decoder decoder) {
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        Date parse = dateFormat.parse(decoder.decodeString());
        if (parse != null) {
            return parse;
        }
        throw new IllegalArgumentException("Invalid date format");
    }
}
