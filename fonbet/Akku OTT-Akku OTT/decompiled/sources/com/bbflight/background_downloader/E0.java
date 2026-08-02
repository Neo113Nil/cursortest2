package com.bbflight.background_downloader;

import androidx.media3.session.C0510i;
import com.bbflight.background_downloader.M0;
import kotlin.Deprecated;
import kotlin.DeprecationLevel;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.internal.C1138g0;

@kotlinx.serialization.i
/* loaded from: classes3.dex */
public final class E0 {
    public static final b Companion = new b();
    public final M0 a;
    public final String b;
    public final long c;
    public final String d;

    @Deprecated(level = DeprecationLevel.HIDDEN, message = "This synthesized declaration should not be used directly")
    public static final /* synthetic */ class a implements kotlinx.serialization.internal.M<E0> {
        public static final a a;
        private static final kotlinx.serialization.descriptors.f descriptor;

        static {
            a aVar = new a();
            a = aVar;
            kotlinx.serialization.internal.D0 d0 = new kotlinx.serialization.internal.D0("com.bbflight.background_downloader.ResumeData", aVar, 4);
            d0.j("task", false);
            d0.j("data", false);
            d0.j("requiredStartByte", false);
            d0.j("eTag", false);
            descriptor = d0;
        }

        @Override // kotlinx.serialization.internal.M
        public final kotlinx.serialization.b<?>[] childSerializers() {
            kotlinx.serialization.internal.S0 s0 = kotlinx.serialization.internal.S0.a;
            return new kotlinx.serialization.b[]{M0.a.a, s0, C1138g0.a, kotlinx.serialization.builtins.a.c(s0)};
        }

        @Override // kotlinx.serialization.a
        public final Object deserialize(kotlinx.serialization.encoding.e decoder) {
            int i;
            M0 m0;
            String str;
            String str2;
            long j;
            Intrinsics.checkNotNullParameter(decoder, "decoder");
            kotlinx.serialization.descriptors.f fVar = descriptor;
            kotlinx.serialization.encoding.c beginStructure = decoder.beginStructure(fVar);
            M0 m02 = null;
            if (beginStructure.decodeSequentially()) {
                M0 m03 = (M0) beginStructure.decodeSerializableElement(fVar, 0, M0.a.a, null);
                String decodeStringElement = beginStructure.decodeStringElement(fVar, 1);
                long decodeLongElement = beginStructure.decodeLongElement(fVar, 2);
                m0 = m03;
                str2 = (String) beginStructure.decodeNullableSerializableElement(fVar, 3, kotlinx.serialization.internal.S0.a, null);
                i = 15;
                str = decodeStringElement;
                j = decodeLongElement;
            } else {
                boolean z = true;
                int i2 = 0;
                long j2 = 0;
                String str3 = null;
                String str4 = null;
                while (z) {
                    int decodeElementIndex = beginStructure.decodeElementIndex(fVar);
                    if (decodeElementIndex == -1) {
                        z = false;
                    } else if (decodeElementIndex == 0) {
                        m02 = (M0) beginStructure.decodeSerializableElement(fVar, 0, M0.a.a, m02);
                        i2 |= 1;
                    } else if (decodeElementIndex == 1) {
                        str3 = beginStructure.decodeStringElement(fVar, 1);
                        i2 |= 2;
                    } else if (decodeElementIndex == 2) {
                        j2 = beginStructure.decodeLongElement(fVar, 2);
                        i2 |= 4;
                    } else {
                        if (decodeElementIndex != 3) {
                            throw new kotlinx.serialization.s(decodeElementIndex);
                        }
                        str4 = (String) beginStructure.decodeNullableSerializableElement(fVar, 3, kotlinx.serialization.internal.S0.a, str4);
                        i2 |= 8;
                    }
                }
                i = i2;
                m0 = m02;
                str = str3;
                str2 = str4;
                j = j2;
            }
            beginStructure.endStructure(fVar);
            return new E0(i, m0, str, j, str2);
        }

        @Override // kotlinx.serialization.k, kotlinx.serialization.a
        public final kotlinx.serialization.descriptors.f getDescriptor() {
            return descriptor;
        }

        @Override // kotlinx.serialization.k
        public final void serialize(kotlinx.serialization.encoding.f encoder, Object obj) {
            E0 value = (E0) obj;
            Intrinsics.checkNotNullParameter(encoder, "encoder");
            Intrinsics.checkNotNullParameter(value, "value");
            kotlinx.serialization.descriptors.f fVar = descriptor;
            kotlinx.serialization.encoding.d beginStructure = encoder.beginStructure(fVar);
            b bVar = E0.Companion;
            beginStructure.encodeSerializableElement(fVar, 0, M0.a.a, value.a);
            beginStructure.encodeStringElement(fVar, 1, value.b);
            beginStructure.encodeLongElement(fVar, 2, value.c);
            beginStructure.encodeNullableSerializableElement(fVar, 3, kotlinx.serialization.internal.S0.a, value.d);
            beginStructure.endStructure(fVar);
        }

        @Override // kotlinx.serialization.internal.M
        public final /* bridge */ kotlinx.serialization.b<?>[] typeParametersSerializers() {
            return kotlinx.serialization.internal.F0.a;
        }
    }

    public static final class b {
        public final kotlinx.serialization.b<E0> serializer() {
            return a.a;
        }
    }

    public /* synthetic */ E0(int i, M0 m0, String str, long j, String str2) {
        if (15 != (i & 15)) {
            kotlinx.serialization.internal.A0.a(a.a.getDescriptor(), i, 15);
            throw null;
        }
        this.a = m0;
        this.b = str;
        this.c = j;
        this.d = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof E0)) {
            return false;
        }
        E0 e0 = (E0) obj;
        return Intrinsics.areEqual(this.a, e0.a) && Intrinsics.areEqual(this.b, e0.b) && this.c == e0.c && Intrinsics.areEqual(this.d, e0.d);
    }

    public final int hashCode() {
        int a2 = C0510i.a(this.c, androidx.compose.runtime.collection.a.a(this.a.a.hashCode() * 31, 31, this.b), 31);
        String str = this.d;
        return a2 + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        return "ResumeData(task=" + this.a + ", data=" + this.b + ", requiredStartByte=" + this.c + ", eTag=" + this.d + ")";
    }

    public E0(M0 task, String data, long j, String str) {
        Intrinsics.checkNotNullParameter(task, "task");
        Intrinsics.checkNotNullParameter(data, "data");
        this.a = task;
        this.b = data;
        this.c = j;
        this.d = str;
    }
}
