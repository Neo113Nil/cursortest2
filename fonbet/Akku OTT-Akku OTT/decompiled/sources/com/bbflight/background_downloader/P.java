package com.bbflight.background_downloader;

import androidx.media3.session.C0510i;
import com.google.firebase.messaging.Constants;
import kotlin.Deprecated;
import kotlin.DeprecationLevel;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.internal.C1138g0;

@kotlinx.serialization.i
/* loaded from: classes3.dex */
public final class P {
    public static final b Companion = new b();
    public final String a;
    public final long b;
    public final long c;

    @Deprecated(level = DeprecationLevel.HIDDEN, message = "This synthesized declaration should not be used directly")
    public static final /* synthetic */ class a implements kotlinx.serialization.internal.M<P> {
        public static final a a;
        private static final kotlinx.serialization.descriptors.f descriptor;

        static {
            a aVar = new a();
            a = aVar;
            kotlinx.serialization.internal.D0 d0 = new kotlinx.serialization.internal.D0("com.bbflight.background_downloader.ChunkTaskMetaData", aVar, 3);
            d0.j("parentTaskId", false);
            d0.j(Constants.MessagePayloadKeys.FROM, false);
            d0.j("to", false);
            descriptor = d0;
        }

        @Override // kotlinx.serialization.internal.M
        public final kotlinx.serialization.b<?>[] childSerializers() {
            C1138g0 c1138g0 = C1138g0.a;
            return new kotlinx.serialization.b[]{kotlinx.serialization.internal.S0.a, c1138g0, c1138g0};
        }

        @Override // kotlinx.serialization.a
        public final Object deserialize(kotlinx.serialization.encoding.e decoder) {
            String str;
            int i;
            long j;
            long j2;
            Intrinsics.checkNotNullParameter(decoder, "decoder");
            kotlinx.serialization.descriptors.f fVar = descriptor;
            kotlinx.serialization.encoding.c beginStructure = decoder.beginStructure(fVar);
            if (beginStructure.decodeSequentially()) {
                str = beginStructure.decodeStringElement(fVar, 0);
                i = 7;
                j = beginStructure.decodeLongElement(fVar, 1);
                j2 = beginStructure.decodeLongElement(fVar, 2);
            } else {
                str = null;
                boolean z = true;
                long j3 = 0;
                int i2 = 0;
                long j4 = 0;
                while (z) {
                    int decodeElementIndex = beginStructure.decodeElementIndex(fVar);
                    if (decodeElementIndex == -1) {
                        z = false;
                    } else if (decodeElementIndex == 0) {
                        str = beginStructure.decodeStringElement(fVar, 0);
                        i2 |= 1;
                    } else if (decodeElementIndex == 1) {
                        j4 = beginStructure.decodeLongElement(fVar, 1);
                        i2 |= 2;
                    } else {
                        if (decodeElementIndex != 2) {
                            throw new kotlinx.serialization.s(decodeElementIndex);
                        }
                        j3 = beginStructure.decodeLongElement(fVar, 2);
                        i2 |= 4;
                    }
                }
                i = i2;
                j = j4;
                j2 = j3;
            }
            String str2 = str;
            beginStructure.endStructure(fVar);
            return new P(str2, j, i, j2);
        }

        @Override // kotlinx.serialization.k, kotlinx.serialization.a
        public final kotlinx.serialization.descriptors.f getDescriptor() {
            return descriptor;
        }

        @Override // kotlinx.serialization.k
        public final void serialize(kotlinx.serialization.encoding.f encoder, Object obj) {
            P value = (P) obj;
            Intrinsics.checkNotNullParameter(encoder, "encoder");
            Intrinsics.checkNotNullParameter(value, "value");
            kotlinx.serialization.descriptors.f fVar = descriptor;
            kotlinx.serialization.encoding.d beginStructure = encoder.beginStructure(fVar);
            beginStructure.encodeStringElement(fVar, 0, value.a);
            beginStructure.encodeLongElement(fVar, 1, value.b);
            beginStructure.encodeLongElement(fVar, 2, value.c);
            beginStructure.endStructure(fVar);
        }

        @Override // kotlinx.serialization.internal.M
        public final /* bridge */ kotlinx.serialization.b<?>[] typeParametersSerializers() {
            return kotlinx.serialization.internal.F0.a;
        }
    }

    public static final class b {
        public final kotlinx.serialization.b<P> serializer() {
            return a.a;
        }
    }

    public /* synthetic */ P(String str, long j, int i, long j2) {
        if (7 != (i & 7)) {
            kotlinx.serialization.internal.A0.a(a.a.getDescriptor(), i, 7);
            throw null;
        }
        this.a = str;
        this.b = j;
        this.c = j2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof P)) {
            return false;
        }
        P p = (P) obj;
        return Intrinsics.areEqual(this.a, p.a) && this.b == p.b && this.c == p.c;
    }

    public final int hashCode() {
        return Long.hashCode(this.c) + C0510i.a(this.b, this.a.hashCode() * 31, 31);
    }

    public final String toString() {
        return "ChunkTaskMetaData(parentTaskId=" + this.a + ", from=" + this.b + ", to=" + this.c + ")";
    }

    public P(String parentTaskId, long j, long j2) {
        Intrinsics.checkNotNullParameter(parentTaskId, "parentTaskId");
        this.a = parentTaskId;
        this.b = j;
        this.c = j2;
    }
}
