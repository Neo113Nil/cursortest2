package com.bbflight.background_downloader;

import com.bbflight.background_downloader.C0639d;
import kotlin.Deprecated;
import kotlin.DeprecationLevel;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.internal.C1138g0;

@kotlinx.serialization.i
/* loaded from: classes3.dex */
public final class T0 {
    public static final b Companion = new b();
    public final Long a;
    public final Long b;
    public final C0639d c;

    @Deprecated(level = DeprecationLevel.HIDDEN, message = "This synthesized declaration should not be used directly")
    public static final /* synthetic */ class a implements kotlinx.serialization.internal.M<T0> {
        public static final a a;
        private static final kotlinx.serialization.descriptors.f descriptor;

        static {
            a aVar = new a();
            a = aVar;
            kotlinx.serialization.internal.D0 d0 = new kotlinx.serialization.internal.D0("com.bbflight.background_downloader.TaskOptions", aVar, 3);
            d0.j("onTaskStartRawHandle", false);
            d0.j("onTaskFinishedRawHandle", false);
            d0.j("auth", false);
            descriptor = d0;
        }

        @Override // kotlinx.serialization.internal.M
        public final kotlinx.serialization.b<?>[] childSerializers() {
            C1138g0 c1138g0 = C1138g0.a;
            return new kotlinx.serialization.b[]{kotlinx.serialization.builtins.a.c(c1138g0), kotlinx.serialization.builtins.a.c(c1138g0), kotlinx.serialization.builtins.a.c(C0639d.a.a)};
        }

        @Override // kotlinx.serialization.a
        public final Object deserialize(kotlinx.serialization.encoding.e decoder) {
            int i;
            Long l;
            Long l2;
            C0639d c0639d;
            Intrinsics.checkNotNullParameter(decoder, "decoder");
            kotlinx.serialization.descriptors.f fVar = descriptor;
            kotlinx.serialization.encoding.c beginStructure = decoder.beginStructure(fVar);
            Long l3 = null;
            if (beginStructure.decodeSequentially()) {
                C1138g0 c1138g0 = C1138g0.a;
                l = (Long) beginStructure.decodeNullableSerializableElement(fVar, 0, c1138g0, null);
                l2 = (Long) beginStructure.decodeNullableSerializableElement(fVar, 1, c1138g0, null);
                c0639d = (C0639d) beginStructure.decodeNullableSerializableElement(fVar, 2, C0639d.a.a, null);
                i = 7;
            } else {
                boolean z = true;
                int i2 = 0;
                Long l4 = null;
                C0639d c0639d2 = null;
                while (z) {
                    int decodeElementIndex = beginStructure.decodeElementIndex(fVar);
                    if (decodeElementIndex == -1) {
                        z = false;
                    } else if (decodeElementIndex == 0) {
                        l3 = (Long) beginStructure.decodeNullableSerializableElement(fVar, 0, C1138g0.a, l3);
                        i2 |= 1;
                    } else if (decodeElementIndex == 1) {
                        l4 = (Long) beginStructure.decodeNullableSerializableElement(fVar, 1, C1138g0.a, l4);
                        i2 |= 2;
                    } else {
                        if (decodeElementIndex != 2) {
                            throw new kotlinx.serialization.s(decodeElementIndex);
                        }
                        c0639d2 = (C0639d) beginStructure.decodeNullableSerializableElement(fVar, 2, C0639d.a.a, c0639d2);
                        i2 |= 4;
                    }
                }
                i = i2;
                l = l3;
                l2 = l4;
                c0639d = c0639d2;
            }
            beginStructure.endStructure(fVar);
            return new T0(i, l, l2, c0639d);
        }

        @Override // kotlinx.serialization.k, kotlinx.serialization.a
        public final kotlinx.serialization.descriptors.f getDescriptor() {
            return descriptor;
        }

        @Override // kotlinx.serialization.k
        public final void serialize(kotlinx.serialization.encoding.f encoder, Object obj) {
            T0 value = (T0) obj;
            Intrinsics.checkNotNullParameter(encoder, "encoder");
            Intrinsics.checkNotNullParameter(value, "value");
            kotlinx.serialization.descriptors.f fVar = descriptor;
            kotlinx.serialization.encoding.d beginStructure = encoder.beginStructure(fVar);
            b bVar = T0.Companion;
            C1138g0 c1138g0 = C1138g0.a;
            beginStructure.encodeNullableSerializableElement(fVar, 0, c1138g0, value.a);
            beginStructure.encodeNullableSerializableElement(fVar, 1, c1138g0, value.b);
            beginStructure.encodeNullableSerializableElement(fVar, 2, C0639d.a.a, value.c);
            beginStructure.endStructure(fVar);
        }

        @Override // kotlinx.serialization.internal.M
        public final /* bridge */ kotlinx.serialization.b<?>[] typeParametersSerializers() {
            return kotlinx.serialization.internal.F0.a;
        }
    }

    public static final class b {
        public final kotlinx.serialization.b<T0> serializer() {
            return a.a;
        }
    }

    public /* synthetic */ T0(int i, Long l, Long l2, C0639d c0639d) {
        if (7 != (i & 7)) {
            kotlinx.serialization.internal.A0.a(a.a.getDescriptor(), i, 7);
            throw null;
        }
        this.a = l;
        this.b = l2;
        this.c = c0639d;
    }
}
