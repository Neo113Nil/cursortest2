package androidx.savedstate.serialization.serializers;

import androidx.exifinterface.media.ExifInterface;
import androidx.savedstate.serialization.serializers.SparseArraySerializer;
import com.google.firebase.crashlytics.internal.metadata.UserMetadata;
import java.util.List;
import kotlin.Deprecated;
import kotlin.DeprecationLevel;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.b;
import kotlinx.serialization.descriptors.f;
import kotlinx.serialization.encoding.c;
import kotlinx.serialization.encoding.d;
import kotlinx.serialization.encoding.e;
import kotlinx.serialization.internal.C1135f;
import kotlinx.serialization.internal.D0;
import kotlinx.serialization.internal.M;
import kotlinx.serialization.s;

@Metadata(d1 = {"\u0000@\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u0000*\u0004\b\u0002\u0010\u00012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00020\u00030\u0002B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005B\u0017\b\u0016\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00020\u0006¢\u0006\u0004\b\u0004\u0010\bJ#\u0010\r\u001a\u00020\f2\u0006\u0010\n\u001a\u00020\t2\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00028\u00020\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u001b\u0010\u0011\u001a\b\u0012\u0004\u0012\u00028\u00020\u00032\u0006\u0010\u0010\u001a\u00020\u000f¢\u0006\u0004\b\u0011\u0010\u0012J\u0017\u0010\u0014\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00060\u0013¢\u0006\u0004\b\u0014\u0010\u0015J\u0017\u0010\u0016\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00060\u0013¢\u0006\u0004\b\u0016\u0010\u0015R\u0017\u0010\u0018\u001a\u00020\u00178\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001b¨\u0006\u001c"}, d2 = {"androidx/savedstate/serialization/serializers/SparseArraySerializer.SparseArraySurrogate.$serializer", ExifInterface.GPS_DIRECTION_TRUE, "Lkotlinx/serialization/internal/M;", "Landroidx/savedstate/serialization/serializers/SparseArraySerializer$SparseArraySurrogate;", "<init>", "()V", "Lkotlinx/serialization/b;", "typeSerial0", "(Lkotlinx/serialization/b;)V", "Lkotlinx/serialization/encoding/f;", "encoder", "value", "", "serialize", "(Lkotlinx/serialization/encoding/f;Landroidx/savedstate/serialization/serializers/SparseArraySerializer$SparseArraySurrogate;)V", "Lkotlinx/serialization/encoding/e;", "decoder", "deserialize", "(Lkotlinx/serialization/encoding/e;)Landroidx/savedstate/serialization/serializers/SparseArraySerializer$SparseArraySurrogate;", "", "childSerializers", "()[Lkotlinx/serialization/b;", "typeParametersSerializers", "Lkotlinx/serialization/descriptors/f;", "descriptor", "Lkotlinx/serialization/descriptors/f;", "getDescriptor", "()Lkotlinx/serialization/descriptors/f;", "savedstate_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@Deprecated(level = DeprecationLevel.HIDDEN, message = "This synthesized declaration should not be used directly")
/* loaded from: classes3.dex */
public /* synthetic */ class SparseArraySerializer$SparseArraySurrogate$$serializer<T> implements M<SparseArraySerializer.SparseArraySurrogate<T>> {
    private final f descriptor;
    private final /* synthetic */ b<?> typeSerial0;

    private SparseArraySerializer$SparseArraySurrogate$$serializer() {
        D0 d0 = new D0("androidx.savedstate.serialization.serializers.SparseArraySerializer.SparseArraySurrogate", this, 2);
        d0.j(UserMetadata.KEYDATA_FILENAME, false);
        d0.j("values", false);
        this.descriptor = d0;
    }

    private final /* synthetic */ b getTypeSerial0() {
        return this.typeSerial0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlinx.serialization.internal.M
    public final b<?>[] childSerializers() {
        Lazy[] lazyArr;
        lazyArr = SparseArraySerializer.SparseArraySurrogate.$childSerializers;
        return new b[]{lazyArr[0].getValue(), new C1135f(this.typeSerial0)};
    }

    @Override // kotlinx.serialization.a
    public final SparseArraySerializer.SparseArraySurrogate<T> deserialize(e decoder) {
        Lazy[] lazyArr;
        List list;
        List list2;
        int i;
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        f fVar = this.descriptor;
        c beginStructure = decoder.beginStructure(fVar);
        lazyArr = SparseArraySerializer.SparseArraySurrogate.$childSerializers;
        if (beginStructure.decodeSequentially()) {
            list = (List) beginStructure.decodeSerializableElement(fVar, 0, (kotlinx.serialization.a) lazyArr[0].getValue(), null);
            list2 = (List) beginStructure.decodeSerializableElement(fVar, 1, new C1135f(this.typeSerial0), null);
            i = 3;
        } else {
            boolean z = true;
            int i2 = 0;
            List list3 = null;
            List list4 = null;
            while (z) {
                int decodeElementIndex = beginStructure.decodeElementIndex(fVar);
                if (decodeElementIndex == -1) {
                    z = false;
                } else if (decodeElementIndex == 0) {
                    list3 = (List) beginStructure.decodeSerializableElement(fVar, 0, (kotlinx.serialization.a) lazyArr[0].getValue(), list3);
                    i2 |= 1;
                } else {
                    if (decodeElementIndex != 1) {
                        throw new s(decodeElementIndex);
                    }
                    list4 = (List) beginStructure.decodeSerializableElement(fVar, 1, new C1135f(this.typeSerial0), list4);
                    i2 |= 2;
                }
            }
            list = list3;
            list2 = list4;
            i = i2;
        }
        beginStructure.endStructure(fVar);
        return new SparseArraySerializer.SparseArraySurrogate<>(i, list, list2, null);
    }

    @Override // kotlinx.serialization.k, kotlinx.serialization.a
    public final f getDescriptor() {
        return this.descriptor;
    }

    @Override // kotlinx.serialization.k
    public final void serialize(kotlinx.serialization.encoding.f encoder, SparseArraySerializer.SparseArraySurrogate<T> value) {
        Intrinsics.checkNotNullParameter(encoder, "encoder");
        Intrinsics.checkNotNullParameter(value, "value");
        f fVar = this.descriptor;
        d beginStructure = encoder.beginStructure(fVar);
        SparseArraySerializer.SparseArraySurrogate.write$Self$savedstate_release(value, beginStructure, fVar, this.typeSerial0);
        beginStructure.endStructure(fVar);
    }

    @Override // kotlinx.serialization.internal.M
    public final b<?>[] typeParametersSerializers() {
        return new b[]{this.typeSerial0};
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public SparseArraySerializer$SparseArraySurrogate$$serializer(b<T> typeSerial0) {
        this();
        Intrinsics.checkNotNullParameter(typeSerial0, "typeSerial0");
        this.typeSerial0 = typeSerial0;
    }
}
