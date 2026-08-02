package com.bbflight.background_downloader;

import com.bbflight.background_downloader.S0;
import com.google.firebase.messaging.Constants;
import kotlin.Deprecated;
import kotlin.DeprecationLevel;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.internal.C1141i;

@kotlinx.serialization.i
/* renamed from: com.bbflight.background_downloader.k0, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C0654k0 {
    public static final b Companion = new b();
    public final S0 a;
    public final S0 b;
    public final S0 c;
    public final S0 d;
    public final boolean e;
    public final boolean f;
    public final String g;

    @Deprecated(level = DeprecationLevel.HIDDEN, message = "This synthesized declaration should not be used directly")
    /* renamed from: com.bbflight.background_downloader.k0$a */
    public static final /* synthetic */ class a implements kotlinx.serialization.internal.M<C0654k0> {
        public static final a a;
        private static final kotlinx.serialization.descriptors.f descriptor;

        static {
            a aVar = new a();
            a = aVar;
            kotlinx.serialization.internal.D0 d0 = new kotlinx.serialization.internal.D0("com.bbflight.background_downloader.NotificationConfig", aVar, 7);
            d0.j("running", false);
            d0.j("complete", false);
            d0.j(Constants.IPC_BUNDLE_KEY_SEND_ERROR, false);
            d0.j("paused", false);
            d0.j("progressBar", false);
            d0.j("tapOpensFile", false);
            d0.j("groupNotificationId", false);
            descriptor = d0;
        }

        @Override // kotlinx.serialization.internal.M
        public final kotlinx.serialization.b<?>[] childSerializers() {
            S0.a aVar = S0.a.a;
            kotlinx.serialization.b<?> c = kotlinx.serialization.builtins.a.c(aVar);
            kotlinx.serialization.b<?> c2 = kotlinx.serialization.builtins.a.c(aVar);
            kotlinx.serialization.b<?> c3 = kotlinx.serialization.builtins.a.c(aVar);
            kotlinx.serialization.b<?> c4 = kotlinx.serialization.builtins.a.c(aVar);
            C1141i c1141i = C1141i.a;
            return new kotlinx.serialization.b[]{c, c2, c3, c4, c1141i, c1141i, kotlinx.serialization.internal.S0.a};
        }

        @Override // kotlinx.serialization.a
        public final Object deserialize(kotlinx.serialization.encoding.e decoder) {
            boolean z;
            boolean z2;
            int i;
            S0 s0;
            S0 s02;
            S0 s03;
            S0 s04;
            String str;
            Intrinsics.checkNotNullParameter(decoder, "decoder");
            kotlinx.serialization.descriptors.f fVar = descriptor;
            kotlinx.serialization.encoding.c beginStructure = decoder.beginStructure(fVar);
            int i2 = 6;
            if (beginStructure.decodeSequentially()) {
                S0.a aVar = S0.a.a;
                S0 s05 = (S0) beginStructure.decodeNullableSerializableElement(fVar, 0, aVar, null);
                S0 s06 = (S0) beginStructure.decodeNullableSerializableElement(fVar, 1, aVar, null);
                S0 s07 = (S0) beginStructure.decodeNullableSerializableElement(fVar, 2, aVar, null);
                S0 s08 = (S0) beginStructure.decodeNullableSerializableElement(fVar, 3, aVar, null);
                boolean decodeBooleanElement = beginStructure.decodeBooleanElement(fVar, 4);
                boolean decodeBooleanElement2 = beginStructure.decodeBooleanElement(fVar, 5);
                s04 = s08;
                str = beginStructure.decodeStringElement(fVar, 6);
                z = decodeBooleanElement2;
                z2 = decodeBooleanElement;
                i = 127;
                s03 = s07;
                s02 = s06;
                s0 = s05;
            } else {
                boolean z3 = true;
                boolean z4 = false;
                int i3 = 0;
                S0 s09 = null;
                S0 s010 = null;
                S0 s011 = null;
                S0 s012 = null;
                String str2 = null;
                boolean z5 = false;
                while (z3) {
                    int decodeElementIndex = beginStructure.decodeElementIndex(fVar);
                    switch (decodeElementIndex) {
                        case -1:
                            z3 = false;
                            i2 = 6;
                        case 0:
                            s09 = (S0) beginStructure.decodeNullableSerializableElement(fVar, 0, S0.a.a, s09);
                            i3 |= 1;
                            i2 = 6;
                        case 1:
                            s010 = (S0) beginStructure.decodeNullableSerializableElement(fVar, 1, S0.a.a, s010);
                            i3 |= 2;
                        case 2:
                            s011 = (S0) beginStructure.decodeNullableSerializableElement(fVar, 2, S0.a.a, s011);
                            i3 |= 4;
                        case 3:
                            s012 = (S0) beginStructure.decodeNullableSerializableElement(fVar, 3, S0.a.a, s012);
                            i3 |= 8;
                        case 4:
                            z5 = beginStructure.decodeBooleanElement(fVar, 4);
                            i3 |= 16;
                        case 5:
                            z4 = beginStructure.decodeBooleanElement(fVar, 5);
                            i3 |= 32;
                        case 6:
                            str2 = beginStructure.decodeStringElement(fVar, i2);
                            i3 |= 64;
                        default:
                            throw new kotlinx.serialization.s(decodeElementIndex);
                    }
                }
                z = z4;
                z2 = z5;
                i = i3;
                s0 = s09;
                s02 = s010;
                s03 = s011;
                s04 = s012;
                str = str2;
            }
            beginStructure.endStructure(fVar);
            return new C0654k0(i, s0, s02, s03, s04, z2, z, str);
        }

        @Override // kotlinx.serialization.k, kotlinx.serialization.a
        public final kotlinx.serialization.descriptors.f getDescriptor() {
            return descriptor;
        }

        @Override // kotlinx.serialization.k
        public final void serialize(kotlinx.serialization.encoding.f encoder, Object obj) {
            C0654k0 value = (C0654k0) obj;
            Intrinsics.checkNotNullParameter(encoder, "encoder");
            Intrinsics.checkNotNullParameter(value, "value");
            kotlinx.serialization.descriptors.f fVar = descriptor;
            kotlinx.serialization.encoding.d beginStructure = encoder.beginStructure(fVar);
            b bVar = C0654k0.Companion;
            S0.a aVar = S0.a.a;
            beginStructure.encodeNullableSerializableElement(fVar, 0, aVar, value.a);
            beginStructure.encodeNullableSerializableElement(fVar, 1, aVar, value.b);
            beginStructure.encodeNullableSerializableElement(fVar, 2, aVar, value.c);
            beginStructure.encodeNullableSerializableElement(fVar, 3, aVar, value.d);
            beginStructure.encodeBooleanElement(fVar, 4, value.e);
            beginStructure.encodeBooleanElement(fVar, 5, value.f);
            beginStructure.encodeStringElement(fVar, 6, value.g);
            beginStructure.endStructure(fVar);
        }

        @Override // kotlinx.serialization.internal.M
        public final /* bridge */ kotlinx.serialization.b<?>[] typeParametersSerializers() {
            return kotlinx.serialization.internal.F0.a;
        }
    }

    /* renamed from: com.bbflight.background_downloader.k0$b */
    public static final class b {
        public final kotlinx.serialization.b<C0654k0> serializer() {
            return a.a;
        }
    }

    public /* synthetic */ C0654k0(int i, S0 s0, S0 s02, S0 s03, S0 s04, boolean z, boolean z2, String str) {
        if (127 != (i & 127)) {
            kotlinx.serialization.internal.A0.a(a.a.getDescriptor(), i, 127);
            throw null;
        }
        this.a = s0;
        this.b = s02;
        this.c = s03;
        this.d = s04;
        this.e = z;
        this.f = z2;
        this.g = str;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("NotificationConfig(running=");
        sb.append(this.a);
        sb.append(", complete=");
        sb.append(this.b);
        sb.append(", error=");
        sb.append(this.c);
        sb.append(", paused=");
        sb.append(this.d);
        sb.append(", progressBar=");
        sb.append(this.e);
        sb.append(", tapOpensFile=");
        sb.append(this.f);
        sb.append(", groupNotificationId=");
        return androidx.concurrent.futures.a.a(sb, this.g, ")");
    }
}
