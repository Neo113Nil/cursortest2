package androidx.savedstate.serialization.serializers;

import androidx.exifinterface.media.ExifInterface;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import kotlinx.coroutines.flow.G;
import kotlinx.coroutines.flow.Q;
import kotlinx.serialization.b;
import kotlinx.serialization.descriptors.e;
import kotlinx.serialization.descriptors.f;
import kotlinx.serialization.descriptors.l;
import kotlinx.serialization.descriptors.m;
import kotlinx.serialization.descriptors.o;

@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u0000*\u0004\b\u0000\u0010\u00012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00030\u0002B\u0015\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002¢\u0006\u0004\b\u0005\u0010\u0006J%\u0010\u000b\u001a\u00020\n2\u0006\u0010\b\u001a\u00020\u00072\f\u0010\t\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003H\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u001d\u0010\u000f\u001a\b\u0012\u0004\u0012\u00028\u00000\u00032\u0006\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u0011R \u0010\u0013\u001a\u00020\u00128\u0016X\u0096\u0004¢\u0006\u0012\n\u0004\b\u0013\u0010\u0014\u0012\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0015\u0010\u0016¨\u0006\u0019"}, d2 = {"Landroidx/savedstate/serialization/serializers/MutableStateFlowSerializer;", ExifInterface.GPS_DIRECTION_TRUE, "Lkotlinx/serialization/b;", "Lkotlinx/coroutines/flow/G;", "valueSerializer", "<init>", "(Lkotlinx/serialization/b;)V", "Lkotlinx/serialization/encoding/f;", "encoder", "value", "", "serialize", "(Lkotlinx/serialization/encoding/f;Lkotlinx/coroutines/flow/G;)V", "Lkotlinx/serialization/encoding/e;", "decoder", "deserialize", "(Lkotlinx/serialization/encoding/e;)Lkotlinx/coroutines/flow/G;", "Lkotlinx/serialization/b;", "Lkotlinx/serialization/descriptors/f;", "descriptor", "Lkotlinx/serialization/descriptors/f;", "getDescriptor", "()Lkotlinx/serialization/descriptors/f;", "getDescriptor$annotations", "()V", "savedstate_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class MutableStateFlowSerializer<T> implements b<G<T>> {
    private final f descriptor;
    private final b<T> valueSerializer;

    public MutableStateFlowSerializer(b<T> valueSerializer) {
        f oVar;
        Intrinsics.checkNotNullParameter(valueSerializer, "valueSerializer");
        this.valueSerializer = valueSerializer;
        m kind = valueSerializer.getDescriptor().getKind();
        if (kind instanceof e) {
            oVar = l.a("kotlinx.coroutines.flow.MutableStateFlow", (e) kind);
        } else {
            f original = valueSerializer.getDescriptor();
            Intrinsics.checkNotNullParameter("kotlinx.coroutines.flow.MutableStateFlow", "serialName");
            Intrinsics.checkNotNullParameter(original, "original");
            if (StringsKt.isBlank("kotlinx.coroutines.flow.MutableStateFlow")) {
                throw new IllegalArgumentException("Blank serial names are prohibited");
            }
            if (original.getKind() instanceof e) {
                throw new IllegalArgumentException("For primitive descriptors please use 'PrimitiveSerialDescriptor' instead");
            }
            if (Intrinsics.areEqual("kotlinx.coroutines.flow.MutableStateFlow", original.h())) {
                throw new IllegalArgumentException(("The name of the wrapped descriptor (kotlinx.coroutines.flow.MutableStateFlow) cannot be the same as the name of the original descriptor (" + original.h() + ')').toString());
            }
            oVar = new o(original);
        }
        this.descriptor = oVar;
    }

    public static /* synthetic */ void getDescriptor$annotations() {
    }

    @Override // kotlinx.serialization.k, kotlinx.serialization.a
    public f getDescriptor() {
        return this.descriptor;
    }

    @Override // kotlinx.serialization.a
    public G<T> deserialize(kotlinx.serialization.encoding.e decoder) {
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        return Q.a(decoder.decodeSerializableValue(this.valueSerializer));
    }

    @Override // kotlinx.serialization.k
    public void serialize(kotlinx.serialization.encoding.f encoder, G<T> value) {
        Intrinsics.checkNotNullParameter(encoder, "encoder");
        Intrinsics.checkNotNullParameter(value, "value");
        encoder.encodeSerializableValue(this.valueSerializer, value.getValue());
    }
}
