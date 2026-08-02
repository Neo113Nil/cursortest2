package com.bbflight.background_downloader;

import androidx.core.app.NotificationCompat;
import com.bbflight.background_downloader.M0;
import kotlin.Deprecated;
import kotlin.DeprecationLevel;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.internal.C1138g0;

@kotlinx.serialization.i
/* loaded from: classes3.dex */
public final class U0 {
    public static final b Companion = new b();
    public final M0 a;
    public final double b;
    public final long c;

    @Deprecated(level = DeprecationLevel.HIDDEN, message = "This synthesized declaration should not be used directly")
    public static final /* synthetic */ class a implements kotlinx.serialization.internal.M<U0> {
        public static final a a;
        private static final kotlinx.serialization.descriptors.f descriptor;

        static {
            a aVar = new a();
            a = aVar;
            kotlinx.serialization.internal.D0 d0 = new kotlinx.serialization.internal.D0("com.bbflight.background_downloader.TaskProgressUpdate", aVar, 3);
            d0.j("task", false);
            d0.j(NotificationCompat.CATEGORY_PROGRESS, false);
            d0.j("expectedFileSize", false);
            descriptor = d0;
        }

        @Override // kotlinx.serialization.internal.M
        public final kotlinx.serialization.b<?>[] childSerializers() {
            return new kotlinx.serialization.b[]{M0.a.a, kotlinx.serialization.internal.C.a, C1138g0.a};
        }

        @Override // kotlinx.serialization.a
        public final Object deserialize(kotlinx.serialization.encoding.e decoder) {
            int i;
            M0 m0;
            double d;
            long j;
            Intrinsics.checkNotNullParameter(decoder, "decoder");
            kotlinx.serialization.descriptors.f fVar = descriptor;
            kotlinx.serialization.encoding.c beginStructure = decoder.beginStructure(fVar);
            M0 m02 = null;
            if (beginStructure.decodeSequentially()) {
                m0 = (M0) beginStructure.decodeSerializableElement(fVar, 0, M0.a.a, null);
                i = 7;
                d = beginStructure.decodeDoubleElement(fVar, 1);
                j = beginStructure.decodeLongElement(fVar, 2);
            } else {
                double d2 = 0.0d;
                long j2 = 0;
                boolean z = true;
                int i2 = 0;
                while (z) {
                    int decodeElementIndex = beginStructure.decodeElementIndex(fVar);
                    if (decodeElementIndex == -1) {
                        z = false;
                    } else if (decodeElementIndex == 0) {
                        m02 = (M0) beginStructure.decodeSerializableElement(fVar, 0, M0.a.a, m02);
                        i2 |= 1;
                    } else if (decodeElementIndex == 1) {
                        d2 = beginStructure.decodeDoubleElement(fVar, 1);
                        i2 |= 2;
                    } else {
                        if (decodeElementIndex != 2) {
                            throw new kotlinx.serialization.s(decodeElementIndex);
                        }
                        j2 = beginStructure.decodeLongElement(fVar, 2);
                        i2 |= 4;
                    }
                }
                i = i2;
                m0 = m02;
                d = d2;
                j = j2;
            }
            beginStructure.endStructure(fVar);
            return new U0(i, m0, d, j);
        }

        @Override // kotlinx.serialization.k, kotlinx.serialization.a
        public final kotlinx.serialization.descriptors.f getDescriptor() {
            return descriptor;
        }

        @Override // kotlinx.serialization.k
        public final void serialize(kotlinx.serialization.encoding.f encoder, Object obj) {
            U0 value = (U0) obj;
            Intrinsics.checkNotNullParameter(encoder, "encoder");
            Intrinsics.checkNotNullParameter(value, "value");
            kotlinx.serialization.descriptors.f fVar = descriptor;
            kotlinx.serialization.encoding.d beginStructure = encoder.beginStructure(fVar);
            b bVar = U0.Companion;
            beginStructure.encodeSerializableElement(fVar, 0, M0.a.a, value.a);
            beginStructure.encodeDoubleElement(fVar, 1, value.b);
            beginStructure.encodeLongElement(fVar, 2, value.c);
            beginStructure.endStructure(fVar);
        }

        @Override // kotlinx.serialization.internal.M
        public final /* bridge */ kotlinx.serialization.b<?>[] typeParametersSerializers() {
            return kotlinx.serialization.internal.F0.a;
        }
    }

    public static final class b {
        public final kotlinx.serialization.b<U0> serializer() {
            return a.a;
        }
    }

    public /* synthetic */ U0(int i, M0 m0, double d, long j) {
        if (7 != (i & 7)) {
            kotlinx.serialization.internal.A0.a(a.a.getDescriptor(), i, 7);
            throw null;
        }
        this.a = m0;
        this.b = d;
        this.c = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof U0)) {
            return false;
        }
        U0 u0 = (U0) obj;
        return Intrinsics.areEqual(this.a, u0.a) && Double.compare(this.b, u0.b) == 0 && this.c == u0.c;
    }

    public final int hashCode() {
        return Long.hashCode(this.c) + ((Double.hashCode(this.b) + (this.a.a.hashCode() * 31)) * 31);
    }

    public final String toString() {
        return "TaskProgressUpdate(task=" + this.a + ", progress=" + this.b + ", expectedFileSize=" + this.c + ")";
    }

    public U0(M0 task, double d, long j) {
        Intrinsics.checkNotNullParameter(task, "task");
        this.a = task;
        this.b = d;
        this.c = j;
    }
}
