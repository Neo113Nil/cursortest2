package com.bbflight.background_downloader;

import androidx.core.app.FrameMetricsAggregator;
import io.flutter.plugins.firebase.auth.Constants;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Deprecated;
import kotlin.DeprecationLevel;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.collections.MapsKt;
import kotlin.jvm.JvmField;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt__StringsJVMKt;
import kotlinx.serialization.internal.C1138g0;

@kotlinx.serialization.i
@SourceDebugExtension({"SMAP\nAuth.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Auth.kt\ncom/bbflight/background_downloader/Auth\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 _Maps.kt\nkotlin/collections/MapsKt___MapsKt\n*L\n1#1,92:1\n1300#2,2:93\n1315#2,4:95\n221#3,2:99\n221#3,2:101\n*S KotlinDebug\n*F\n+ 1 Auth.kt\ncom/bbflight/background_downloader/Auth\n*L\n45#1:93,2\n45#1:95,4\n49#1:99,2\n73#1:101,2\n*E\n"})
/* renamed from: com.bbflight.background_downloader.d, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C0639d {
    public static final b Companion = new b();

    @JvmField
    public static final Lazy<kotlinx.serialization.b<Object>>[] j;
    public String a;
    public Map<String, String> b;
    public Map<String, String> c;
    public Long d;
    public String e;
    public Map<String, String> f;
    public Map<String, String> g;
    public String h;
    public Long i;

    @Deprecated(level = DeprecationLevel.HIDDEN, message = "This synthesized declaration should not be used directly")
    /* renamed from: com.bbflight.background_downloader.d$a */
    public static final /* synthetic */ class a implements kotlinx.serialization.internal.M<C0639d> {
        public static final a a;
        private static final kotlinx.serialization.descriptors.f descriptor;

        static {
            a aVar = new a();
            a = aVar;
            kotlinx.serialization.internal.D0 d0 = new kotlinx.serialization.internal.D0("com.bbflight.background_downloader.Auth", aVar, 9);
            d0.j(Constants.ACCESS_TOKEN, true);
            d0.j("accessHeaders", true);
            d0.j("accessQueryParams", true);
            d0.j("accessTokenExpiryTime", true);
            d0.j("refreshToken", true);
            d0.j("refreshHeaders", true);
            d0.j("refreshQueryParams", true);
            d0.j("refreshUrl", true);
            d0.j("onAuthRawHandle", true);
            descriptor = d0;
        }

        @Override // kotlinx.serialization.internal.M
        public final kotlinx.serialization.b<?>[] childSerializers() {
            Lazy<kotlinx.serialization.b<Object>>[] lazyArr = C0639d.j;
            kotlinx.serialization.internal.S0 s0 = kotlinx.serialization.internal.S0.a;
            C1138g0 c1138g0 = C1138g0.a;
            return new kotlinx.serialization.b[]{kotlinx.serialization.builtins.a.c(s0), lazyArr[1].getValue(), lazyArr[2].getValue(), kotlinx.serialization.builtins.a.c(c1138g0), kotlinx.serialization.builtins.a.c(s0), lazyArr[5].getValue(), lazyArr[6].getValue(), kotlinx.serialization.builtins.a.c(s0), kotlinx.serialization.builtins.a.c(c1138g0)};
        }

        @Override // kotlinx.serialization.a
        public final Object deserialize(kotlinx.serialization.encoding.e decoder) {
            Map<String, String> map;
            String str;
            Map<String, String> map2;
            Long l;
            String str2;
            Map<String, String> map3;
            Map<String, String> map4;
            int i;
            Long l2;
            String str3;
            String str4;
            Long l3;
            Intrinsics.checkNotNullParameter(decoder, "decoder");
            kotlinx.serialization.descriptors.f fVar = descriptor;
            kotlinx.serialization.encoding.c beginStructure = decoder.beginStructure(fVar);
            Lazy<kotlinx.serialization.b<Object>>[] lazyArr = C0639d.j;
            int i2 = 7;
            int i3 = 8;
            int i4 = 6;
            int i5 = 5;
            int i6 = 0;
            Long l4 = null;
            if (beginStructure.decodeSequentially()) {
                kotlinx.serialization.internal.S0 s0 = kotlinx.serialization.internal.S0.a;
                str3 = (String) beginStructure.decodeNullableSerializableElement(fVar, 0, s0, null);
                map4 = (Map) beginStructure.decodeSerializableElement(fVar, 1, lazyArr[1].getValue(), null);
                map3 = (Map) beginStructure.decodeSerializableElement(fVar, 2, lazyArr[2].getValue(), null);
                C1138g0 c1138g0 = C1138g0.a;
                l = (Long) beginStructure.decodeNullableSerializableElement(fVar, 3, c1138g0, null);
                str = (String) beginStructure.decodeNullableSerializableElement(fVar, 4, s0, null);
                map2 = (Map) beginStructure.decodeSerializableElement(fVar, 5, lazyArr[5].getValue(), null);
                map = (Map) beginStructure.decodeSerializableElement(fVar, 6, lazyArr[6].getValue(), null);
                str2 = (String) beginStructure.decodeNullableSerializableElement(fVar, 7, s0, null);
                l2 = (Long) beginStructure.decodeNullableSerializableElement(fVar, 8, c1138g0, null);
                i = FrameMetricsAggregator.EVERY_DURATION;
            } else {
                int i7 = 2;
                int i8 = 1;
                boolean z = true;
                Map<String, String> map5 = null;
                String str5 = null;
                Map<String, String> map6 = null;
                String str6 = null;
                Long l5 = null;
                Map<String, String> map7 = null;
                Map<String, String> map8 = null;
                String str7 = null;
                while (z) {
                    int decodeElementIndex = beginStructure.decodeElementIndex(fVar);
                    switch (decodeElementIndex) {
                        case -1:
                            z = false;
                            i2 = 7;
                            i3 = 8;
                            i4 = 6;
                            i5 = 5;
                            i8 = 1;
                            i7 = 2;
                        case 0:
                            str7 = (String) beginStructure.decodeNullableSerializableElement(fVar, 0, kotlinx.serialization.internal.S0.a, str7);
                            i6 |= 1;
                            i2 = 7;
                            i3 = 8;
                            i4 = 6;
                            i5 = 5;
                            i8 = 1;
                            i7 = 2;
                        case 1:
                            map8 = (Map) beginStructure.decodeSerializableElement(fVar, i8, lazyArr[i8].getValue(), map8);
                            i6 |= 2;
                            i2 = 7;
                            i3 = 8;
                            i4 = 6;
                            i7 = 2;
                        case 2:
                            map7 = (Map) beginStructure.decodeSerializableElement(fVar, i7, lazyArr[i7].getValue(), map7);
                            i6 |= 4;
                            i2 = 7;
                            i3 = 8;
                        case 3:
                            l4 = (Long) beginStructure.decodeNullableSerializableElement(fVar, 3, C1138g0.a, l4);
                            i6 |= 8;
                            i2 = 7;
                        case 4:
                            str5 = (String) beginStructure.decodeNullableSerializableElement(fVar, 4, kotlinx.serialization.internal.S0.a, str5);
                            i6 |= 16;
                        case 5:
                            map6 = (Map) beginStructure.decodeSerializableElement(fVar, i5, lazyArr[i5].getValue(), map6);
                            i6 |= 32;
                        case 6:
                            map5 = (Map) beginStructure.decodeSerializableElement(fVar, i4, lazyArr[i4].getValue(), map5);
                            i6 |= 64;
                        case 7:
                            str6 = (String) beginStructure.decodeNullableSerializableElement(fVar, i2, kotlinx.serialization.internal.S0.a, str6);
                            i6 |= 128;
                        case 8:
                            l5 = (Long) beginStructure.decodeNullableSerializableElement(fVar, i3, C1138g0.a, l5);
                            i6 |= 256;
                        default:
                            throw new kotlinx.serialization.s(decodeElementIndex);
                    }
                }
                map = map5;
                str = str5;
                map2 = map6;
                l = l4;
                str2 = str6;
                map3 = map7;
                map4 = map8;
                i = i6;
                l2 = l5;
                str3 = str7;
            }
            beginStructure.endStructure(fVar);
            C0639d c0639d = new C0639d();
            if ((i & 1) == 0) {
                c0639d.a = null;
            } else {
                c0639d.a = str3;
            }
            if ((i & 2) == 0) {
                c0639d.b = MapsKt.emptyMap();
            } else {
                c0639d.b = map4;
            }
            if ((i & 4) == 0) {
                c0639d.c = MapsKt.emptyMap();
            } else {
                c0639d.c = map3;
            }
            if ((i & 8) == 0) {
                str4 = null;
                c0639d.d = null;
            } else {
                str4 = null;
                c0639d.d = l;
            }
            if ((i & 16) == 0) {
                c0639d.e = str4;
            } else {
                c0639d.e = str;
            }
            if ((i & 32) == 0) {
                c0639d.f = MapsKt.emptyMap();
            } else {
                c0639d.f = map2;
            }
            if ((i & 64) == 0) {
                c0639d.g = MapsKt.emptyMap();
            } else {
                c0639d.g = map;
            }
            if ((i & 128) == 0) {
                l3 = null;
                c0639d.h = null;
            } else {
                l3 = null;
                c0639d.h = str2;
            }
            if ((i & 256) == 0) {
                c0639d.i = l3;
                return c0639d;
            }
            c0639d.i = l2;
            return c0639d;
        }

        @Override // kotlinx.serialization.k, kotlinx.serialization.a
        public final kotlinx.serialization.descriptors.f getDescriptor() {
            return descriptor;
        }

        @Override // kotlinx.serialization.k
        public final void serialize(kotlinx.serialization.encoding.f encoder, Object obj) {
            C0639d value = (C0639d) obj;
            Intrinsics.checkNotNullParameter(encoder, "encoder");
            Intrinsics.checkNotNullParameter(value, "value");
            kotlinx.serialization.descriptors.f fVar = descriptor;
            kotlinx.serialization.encoding.d beginStructure = encoder.beginStructure(fVar);
            Lazy<kotlinx.serialization.b<Object>>[] lazyArr = C0639d.j;
            if (beginStructure.shouldEncodeElementDefault(fVar, 0) || value.a != null) {
                beginStructure.encodeNullableSerializableElement(fVar, 0, kotlinx.serialization.internal.S0.a, value.a);
            }
            if (beginStructure.shouldEncodeElementDefault(fVar, 1) || !Intrinsics.areEqual(value.b, MapsKt.emptyMap())) {
                beginStructure.encodeSerializableElement(fVar, 1, lazyArr[1].getValue(), value.b);
            }
            if (beginStructure.shouldEncodeElementDefault(fVar, 2) || !Intrinsics.areEqual(value.c, MapsKt.emptyMap())) {
                beginStructure.encodeSerializableElement(fVar, 2, lazyArr[2].getValue(), value.c);
            }
            if (beginStructure.shouldEncodeElementDefault(fVar, 3) || value.d != null) {
                beginStructure.encodeNullableSerializableElement(fVar, 3, C1138g0.a, value.d);
            }
            if (beginStructure.shouldEncodeElementDefault(fVar, 4) || value.e != null) {
                beginStructure.encodeNullableSerializableElement(fVar, 4, kotlinx.serialization.internal.S0.a, value.e);
            }
            if (beginStructure.shouldEncodeElementDefault(fVar, 5) || !Intrinsics.areEqual(value.f, MapsKt.emptyMap())) {
                beginStructure.encodeSerializableElement(fVar, 5, lazyArr[5].getValue(), value.f);
            }
            if (beginStructure.shouldEncodeElementDefault(fVar, 6) || !Intrinsics.areEqual(value.g, MapsKt.emptyMap())) {
                beginStructure.encodeSerializableElement(fVar, 6, lazyArr[6].getValue(), value.g);
            }
            if (beginStructure.shouldEncodeElementDefault(fVar, 7) || value.h != null) {
                beginStructure.encodeNullableSerializableElement(fVar, 7, kotlinx.serialization.internal.S0.a, value.h);
            }
            if (beginStructure.shouldEncodeElementDefault(fVar, 8) || value.i != null) {
                beginStructure.encodeNullableSerializableElement(fVar, 8, C1138g0.a, value.i);
            }
            beginStructure.endStructure(fVar);
        }

        @Override // kotlinx.serialization.internal.M
        public final /* bridge */ kotlinx.serialization.b<?>[] typeParametersSerializers() {
            return kotlinx.serialization.internal.F0.a;
        }
    }

    /* renamed from: com.bbflight.background_downloader.d$b */
    public static final class b {
        public final kotlinx.serialization.b<C0639d> serializer() {
            return a.a;
        }
    }

    static {
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.PUBLICATION;
        j = new Lazy[]{null, LazyKt.lazy(lazyThreadSafetyMode, (Function0) new C0632a()), LazyKt.lazy(lazyThreadSafetyMode, (Function0) new C0635b()), null, null, LazyKt.lazy(lazyThreadSafetyMode, (Function0) new C0637c()), LazyKt.lazy(lazyThreadSafetyMode, (Function0) new androidx.activity.I(1)), null, null};
    }

    public C0639d() {
        Map<String, String> accessHeaders = MapsKt.emptyMap();
        Map<String, String> accessQueryParams = MapsKt.emptyMap();
        Map<String, String> refreshHeaders = MapsKt.emptyMap();
        Map<String, String> refreshQueryParams = MapsKt.emptyMap();
        Intrinsics.checkNotNullParameter(accessHeaders, "accessHeaders");
        Intrinsics.checkNotNullParameter(accessQueryParams, "accessQueryParams");
        Intrinsics.checkNotNullParameter(refreshHeaders, "refreshHeaders");
        Intrinsics.checkNotNullParameter(refreshQueryParams, "refreshQueryParams");
        this.a = null;
        this.b = accessHeaders;
        this.c = accessQueryParams;
        this.d = null;
        this.e = null;
        this.f = refreshHeaders;
        this.g = refreshQueryParams;
        this.h = null;
        this.i = null;
    }

    public final LinkedHashMap a(Map map) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry entry : map.entrySet()) {
            String str = (String) entry.getKey();
            String str2 = (String) entry.getValue();
            String str3 = this.a;
            if (str3 != null) {
                Intrinsics.checkNotNull(str3);
                str2 = StringsKt__StringsJVMKt.replace$default(str2, "{accessToken}", str3, false, 4, (Object) null);
            }
            String str4 = this.e;
            if (str4 != null) {
                Intrinsics.checkNotNull(str4);
                str2 = StringsKt__StringsJVMKt.replace$default(str2, "{refreshToken}", str4, false, 4, (Object) null);
            }
            linkedHashMap.put(str, str2);
        }
        return linkedHashMap;
    }
}
