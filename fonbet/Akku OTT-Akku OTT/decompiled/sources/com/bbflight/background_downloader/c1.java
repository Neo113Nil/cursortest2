package com.bbflight.background_downloader;

import com.bbflight.background_downloader.M0;
import io.flutter.plugins.firebase.crashlytics.Constants;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Deprecated;
import kotlin.DeprecationLevel;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.jvm.JvmField;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

@kotlinx.serialization.i
/* loaded from: classes3.dex */
public final class c1 {
    public static final b Companion = new b();

    @JvmField
    public static final Lazy<kotlinx.serialization.b<Object>>[] i;
    public final M0 a;
    public final W0 b;
    public final P0 c;
    public final String d;
    public final Integer e;
    public final Map<String, String> f;
    public final String g;
    public final String h;

    @Deprecated(level = DeprecationLevel.HIDDEN, message = "This synthesized declaration should not be used directly")
    public static final /* synthetic */ class a implements kotlinx.serialization.internal.M<c1> {
        public static final a a;
        private static final kotlinx.serialization.descriptors.f descriptor;

        static {
            a aVar = new a();
            a = aVar;
            kotlinx.serialization.internal.D0 d0 = new kotlinx.serialization.internal.D0("com.bbflight.background_downloader.TaskStatusUpdate", aVar, 8);
            d0.j("task", false);
            d0.j("taskStatus", false);
            d0.j(Constants.EXCEPTION, false);
            d0.j("responseBody", false);
            d0.j("responseStatusCode", false);
            d0.j("responseHeaders", false);
            d0.j("mimeType", false);
            d0.j("charSet", false);
            descriptor = d0;
        }

        @Override // kotlinx.serialization.internal.M
        public final kotlinx.serialization.b<?>[] childSerializers() {
            Lazy<kotlinx.serialization.b<Object>>[] lazyArr = c1.i;
            kotlinx.serialization.internal.S0 s0 = kotlinx.serialization.internal.S0.a;
            return new kotlinx.serialization.b[]{M0.a.a, lazyArr[1].getValue(), kotlinx.serialization.builtins.a.c(R0.a), kotlinx.serialization.builtins.a.c(s0), kotlinx.serialization.builtins.a.c(kotlinx.serialization.internal.W.a), kotlinx.serialization.builtins.a.c(lazyArr[5].getValue()), kotlinx.serialization.builtins.a.c(s0), kotlinx.serialization.builtins.a.c(s0)};
        }

        @Override // kotlinx.serialization.a
        public final Object deserialize(kotlinx.serialization.encoding.e decoder) {
            int i;
            String str;
            String str2;
            Map map;
            Integer num;
            M0 m0;
            W0 w0;
            P0 p0;
            String str3;
            Intrinsics.checkNotNullParameter(decoder, "decoder");
            kotlinx.serialization.descriptors.f fVar = descriptor;
            kotlinx.serialization.encoding.c beginStructure = decoder.beginStructure(fVar);
            Lazy<kotlinx.serialization.b<Object>>[] lazyArr = c1.i;
            int i2 = 7;
            M0 m02 = null;
            if (beginStructure.decodeSequentially()) {
                M0 m03 = (M0) beginStructure.decodeSerializableElement(fVar, 0, M0.a.a, null);
                W0 w02 = (W0) beginStructure.decodeSerializableElement(fVar, 1, lazyArr[1].getValue(), null);
                P0 p02 = (P0) beginStructure.decodeNullableSerializableElement(fVar, 2, R0.a, null);
                kotlinx.serialization.internal.S0 s0 = kotlinx.serialization.internal.S0.a;
                String str4 = (String) beginStructure.decodeNullableSerializableElement(fVar, 3, s0, null);
                Integer num2 = (Integer) beginStructure.decodeNullableSerializableElement(fVar, 4, kotlinx.serialization.internal.W.a, null);
                Map map2 = (Map) beginStructure.decodeNullableSerializableElement(fVar, 5, lazyArr[5].getValue(), null);
                String str5 = (String) beginStructure.decodeNullableSerializableElement(fVar, 6, s0, null);
                map = map2;
                m0 = m03;
                str = (String) beginStructure.decodeNullableSerializableElement(fVar, 7, s0, null);
                str2 = str5;
                str3 = str4;
                num = num2;
                p0 = p02;
                i = 255;
                w0 = w02;
            } else {
                int i3 = 1;
                boolean z = true;
                int i4 = 0;
                String str6 = null;
                String str7 = null;
                Map map3 = null;
                Integer num3 = null;
                W0 w03 = null;
                P0 p03 = null;
                String str8 = null;
                while (z) {
                    int decodeElementIndex = beginStructure.decodeElementIndex(fVar);
                    switch (decodeElementIndex) {
                        case -1:
                            z = false;
                            i2 = 7;
                            i3 = 1;
                        case 0:
                            m02 = (M0) beginStructure.decodeSerializableElement(fVar, 0, M0.a.a, m02);
                            i4 |= 1;
                            i2 = 7;
                            i3 = 1;
                        case 1:
                            w03 = (W0) beginStructure.decodeSerializableElement(fVar, i3, lazyArr[i3].getValue(), w03);
                            i4 |= 2;
                            i2 = 7;
                        case 2:
                            p03 = (P0) beginStructure.decodeNullableSerializableElement(fVar, 2, R0.a, p03);
                            i4 |= 4;
                            i2 = 7;
                        case 3:
                            str8 = (String) beginStructure.decodeNullableSerializableElement(fVar, 3, kotlinx.serialization.internal.S0.a, str8);
                            i4 |= 8;
                            i2 = 7;
                        case 4:
                            num3 = (Integer) beginStructure.decodeNullableSerializableElement(fVar, 4, kotlinx.serialization.internal.W.a, num3);
                            i4 |= 16;
                            i2 = 7;
                        case 5:
                            map3 = (Map) beginStructure.decodeNullableSerializableElement(fVar, 5, lazyArr[5].getValue(), map3);
                            i4 |= 32;
                        case 6:
                            str7 = (String) beginStructure.decodeNullableSerializableElement(fVar, 6, kotlinx.serialization.internal.S0.a, str7);
                            i4 |= 64;
                        case 7:
                            str6 = (String) beginStructure.decodeNullableSerializableElement(fVar, i2, kotlinx.serialization.internal.S0.a, str6);
                            i4 |= 128;
                        default:
                            throw new kotlinx.serialization.s(decodeElementIndex);
                    }
                }
                i = i4;
                str = str6;
                str2 = str7;
                map = map3;
                num = num3;
                m0 = m02;
                w0 = w03;
                p0 = p03;
                str3 = str8;
            }
            beginStructure.endStructure(fVar);
            return new c1(i, m0, w0, p0, str3, num, map, str2, str);
        }

        @Override // kotlinx.serialization.k, kotlinx.serialization.a
        public final kotlinx.serialization.descriptors.f getDescriptor() {
            return descriptor;
        }

        @Override // kotlinx.serialization.k
        public final void serialize(kotlinx.serialization.encoding.f encoder, Object obj) {
            c1 value = (c1) obj;
            Intrinsics.checkNotNullParameter(encoder, "encoder");
            Intrinsics.checkNotNullParameter(value, "value");
            kotlinx.serialization.descriptors.f fVar = descriptor;
            kotlinx.serialization.encoding.d beginStructure = encoder.beginStructure(fVar);
            Lazy<kotlinx.serialization.b<Object>>[] lazyArr = c1.i;
            beginStructure.encodeSerializableElement(fVar, 0, M0.a.a, value.a);
            beginStructure.encodeSerializableElement(fVar, 1, lazyArr[1].getValue(), value.b);
            beginStructure.encodeNullableSerializableElement(fVar, 2, R0.a, value.c);
            kotlinx.serialization.internal.S0 s0 = kotlinx.serialization.internal.S0.a;
            beginStructure.encodeNullableSerializableElement(fVar, 3, s0, value.d);
            beginStructure.encodeNullableSerializableElement(fVar, 4, kotlinx.serialization.internal.W.a, value.e);
            beginStructure.encodeNullableSerializableElement(fVar, 5, lazyArr[5].getValue(), value.f);
            beginStructure.encodeNullableSerializableElement(fVar, 6, s0, value.g);
            beginStructure.encodeNullableSerializableElement(fVar, 7, s0, value.h);
            beginStructure.endStructure(fVar);
        }

        @Override // kotlinx.serialization.internal.M
        public final /* bridge */ kotlinx.serialization.b<?>[] typeParametersSerializers() {
            return kotlinx.serialization.internal.F0.a;
        }
    }

    public static final class b {
        public final kotlinx.serialization.b<c1> serializer() {
            return a.a;
        }
    }

    static {
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.PUBLICATION;
        i = new Lazy[]{null, LazyKt.lazy(lazyThreadSafetyMode, (Function0) new C0634a1()), null, null, null, LazyKt.lazy(lazyThreadSafetyMode, (Function0) new b1()), null, null};
    }

    public /* synthetic */ c1(int i2, M0 m0, W0 w0, P0 p0, String str, Integer num, Map map, String str2, String str3) {
        if (255 != (i2 & 255)) {
            kotlinx.serialization.internal.A0.a(a.a.getDescriptor(), i2, 255);
            throw null;
        }
        this.a = m0;
        this.b = w0;
        this.c = p0;
        this.d = str;
        this.e = num;
        this.f = map;
        this.g = str2;
        this.h = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c1)) {
            return false;
        }
        c1 c1Var = (c1) obj;
        return Intrinsics.areEqual(this.a, c1Var.a) && this.b == c1Var.b && Intrinsics.areEqual(this.c, c1Var.c) && Intrinsics.areEqual(this.d, c1Var.d) && Intrinsics.areEqual(this.e, c1Var.e) && Intrinsics.areEqual(this.f, c1Var.f) && Intrinsics.areEqual(this.g, c1Var.g) && Intrinsics.areEqual(this.h, c1Var.h);
    }

    public final int hashCode() {
        int hashCode = (this.b.hashCode() + (this.a.a.hashCode() * 31)) * 31;
        P0 p0 = this.c;
        int hashCode2 = (hashCode + (p0 == null ? 0 : p0.hashCode())) * 31;
        String str = this.d;
        int hashCode3 = (hashCode2 + (str == null ? 0 : str.hashCode())) * 31;
        Integer num = this.e;
        int hashCode4 = (hashCode3 + (num == null ? 0 : num.hashCode())) * 31;
        Map<String, String> map = this.f;
        int hashCode5 = (hashCode4 + (map == null ? 0 : map.hashCode())) * 31;
        String str2 = this.g;
        int hashCode6 = (hashCode5 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.h;
        return hashCode6 + (str3 != null ? str3.hashCode() : 0);
    }

    public final String toString() {
        return "TaskStatusUpdate(task=" + this.a + ", taskStatus=" + this.b + ", exception=" + this.c + ", responseBody=" + this.d + ", responseStatusCode=" + this.e + ", responseHeaders=" + this.f + ", mimeType=" + this.g + ", charSet=" + this.h + ")";
    }

    public c1(M0 task, W0 taskStatus, P0 p0, String str, Integer num, LinkedHashMap linkedHashMap, String str2, String str3) {
        Intrinsics.checkNotNullParameter(task, "task");
        Intrinsics.checkNotNullParameter(taskStatus, "taskStatus");
        this.a = task;
        this.b = taskStatus;
        this.c = p0;
        this.d = str;
        this.e = num;
        this.f = linkedHashMap;
        this.g = str2;
        this.h = str3;
    }
}
