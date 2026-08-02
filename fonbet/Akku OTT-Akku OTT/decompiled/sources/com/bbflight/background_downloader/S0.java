package com.bbflight.background_downloader;

import kotlin.Deprecated;
import kotlin.DeprecationLevel;
import kotlin.jvm.internal.Intrinsics;

@kotlinx.serialization.i
/* loaded from: classes3.dex */
public final class S0 {
    public static final b Companion = new b();
    public final String a;
    public final String b;

    @Deprecated(level = DeprecationLevel.HIDDEN, message = "This synthesized declaration should not be used directly")
    public static final /* synthetic */ class a implements kotlinx.serialization.internal.M<S0> {
        public static final a a;
        private static final kotlinx.serialization.descriptors.f descriptor;

        static {
            a aVar = new a();
            a = aVar;
            kotlinx.serialization.internal.D0 d0 = new kotlinx.serialization.internal.D0("com.bbflight.background_downloader.TaskNotification", aVar, 2);
            d0.j("title", false);
            d0.j("body", false);
            descriptor = d0;
        }

        @Override // kotlinx.serialization.internal.M
        public final kotlinx.serialization.b<?>[] childSerializers() {
            kotlinx.serialization.internal.S0 s0 = kotlinx.serialization.internal.S0.a;
            return new kotlinx.serialization.b[]{s0, s0};
        }

        @Override // kotlinx.serialization.a
        public final Object deserialize(kotlinx.serialization.encoding.e decoder) {
            String str;
            String str2;
            int i;
            Intrinsics.checkNotNullParameter(decoder, "decoder");
            kotlinx.serialization.descriptors.f fVar = descriptor;
            kotlinx.serialization.encoding.c beginStructure = decoder.beginStructure(fVar);
            if (beginStructure.decodeSequentially()) {
                str = beginStructure.decodeStringElement(fVar, 0);
                str2 = beginStructure.decodeStringElement(fVar, 1);
                i = 3;
            } else {
                str = null;
                String str3 = null;
                boolean z = true;
                int i2 = 0;
                while (z) {
                    int decodeElementIndex = beginStructure.decodeElementIndex(fVar);
                    if (decodeElementIndex == -1) {
                        z = false;
                    } else if (decodeElementIndex == 0) {
                        str = beginStructure.decodeStringElement(fVar, 0);
                        i2 |= 1;
                    } else {
                        if (decodeElementIndex != 1) {
                            throw new kotlinx.serialization.s(decodeElementIndex);
                        }
                        str3 = beginStructure.decodeStringElement(fVar, 1);
                        i2 |= 2;
                    }
                }
                str2 = str3;
                i = i2;
            }
            beginStructure.endStructure(fVar);
            return new S0(i, str, str2);
        }

        @Override // kotlinx.serialization.k, kotlinx.serialization.a
        public final kotlinx.serialization.descriptors.f getDescriptor() {
            return descriptor;
        }

        @Override // kotlinx.serialization.k
        public final void serialize(kotlinx.serialization.encoding.f encoder, Object obj) {
            S0 value = (S0) obj;
            Intrinsics.checkNotNullParameter(encoder, "encoder");
            Intrinsics.checkNotNullParameter(value, "value");
            kotlinx.serialization.descriptors.f fVar = descriptor;
            kotlinx.serialization.encoding.d beginStructure = encoder.beginStructure(fVar);
            beginStructure.encodeStringElement(fVar, 0, value.a);
            beginStructure.encodeStringElement(fVar, 1, value.b);
            beginStructure.endStructure(fVar);
        }

        @Override // kotlinx.serialization.internal.M
        public final /* bridge */ kotlinx.serialization.b<?>[] typeParametersSerializers() {
            return kotlinx.serialization.internal.F0.a;
        }
    }

    public static final class b {
        public final kotlinx.serialization.b<S0> serializer() {
            return a.a;
        }
    }

    public /* synthetic */ S0(int i, String str, String str2) {
        if (3 != (i & 3)) {
            kotlinx.serialization.internal.A0.a(a.a.getDescriptor(), i, 3);
            throw null;
        }
        this.a = str;
        this.b = str2;
    }

    public final String toString() {
        return androidx.core.database.a.d("Notification(title='", this.a, "', body='", this.b, "')");
    }
}
