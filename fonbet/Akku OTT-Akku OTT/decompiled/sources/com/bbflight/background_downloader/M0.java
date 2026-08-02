package com.bbflight.background_downloader;

import android.content.Context;
import android.net.Uri;
import androidx.browser.trusted.sharing.ShareTarget;
import androidx.compose.runtime.C0223n;
import androidx.credentials.exceptions.publickeycredential.DomExceptionUtils;
import com.bbflight.background_downloader.T0;
import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Objects;
import kotlin.Deprecated;
import kotlin.DeprecationLevel;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.ResultKt;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.SpillingKt;
import kotlin.io.FilesKt;
import kotlin.jvm.JvmField;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.random.Random;
import kotlin.text.MatchResult;
import kotlin.text.Regex;
import kotlin.text.RegexOption;
import kotlin.text.StringsKt;
import kotlin.text.StringsKt__StringsKt;
import kotlinx.coroutines.C1049c0;
import kotlinx.coroutines.C1082i;
import kotlinx.serialization.internal.C1138g0;
import kotlinx.serialization.internal.C1141i;

@kotlinx.serialization.i
@SourceDebugExtension({"SMAP\nModels.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Models.kt\ncom/bbflight/background_downloader/Task\n+ 2 Json.kt\nkotlinx/serialization/json/Json\n*L\n1#1,619:1\n96#2:620\n96#2:621\n96#2:622\n*S KotlinDebug\n*F\n+ 1 Models.kt\ncom/bbflight/background_downloader/Task\n*L\n348#1:620\n349#1:621\n350#1:622\n*E\n"})
/* loaded from: classes3.dex */
public final class M0 {
    public static final b Companion = new b();

    @JvmField
    public static final Lazy<kotlinx.serialization.b<Object>>[] z;
    public final String a;
    public final String b;
    public final List<String> c;
    public final String d;
    public final Map<String, String> e;
    public final String f;
    public final int g;
    public final String h;
    public final String i;
    public final String j;
    public final Map<String, String> k;
    public final String l;
    public final B m;
    public final String n;
    public final s1 o;
    public final boolean p;
    public final int q;
    public int r;
    public final boolean s;
    public final int t;
    public final String u;
    public final String v;
    public final long w;
    public final T0 x;
    public final String y;

    @Deprecated(level = DeprecationLevel.HIDDEN, message = "This synthesized declaration should not be used directly")
    public static final /* synthetic */ class a implements kotlinx.serialization.internal.M<M0> {
        public static final a a;
        private static final kotlinx.serialization.descriptors.f descriptor;

        static {
            a aVar = new a();
            a = aVar;
            kotlinx.serialization.internal.D0 d0 = new kotlinx.serialization.internal.D0("com.bbflight.background_downloader.Task", aVar, 25);
            d0.j("taskId", true);
            d0.j("url", false);
            d0.j("urls", true);
            d0.j("filename", false);
            d0.j("headers", false);
            d0.j("httpRequestMethod", true);
            d0.j("chunks", true);
            d0.j("post", true);
            d0.j("fileField", true);
            d0.j("mimeType", true);
            d0.j("fields", true);
            d0.j("directory", true);
            d0.j("baseDirectory", false);
            d0.j("group", false);
            d0.j("updates", false);
            d0.j("requiresWiFi", true);
            d0.j("retries", true);
            d0.j("retriesRemaining", true);
            d0.j("allowPause", true);
            d0.j("priority", true);
            d0.j("metaData", true);
            d0.j("displayName", true);
            d0.j("creationTime", true);
            d0.j("options", true);
            d0.j("taskType", false);
            descriptor = d0;
        }

        @Override // kotlinx.serialization.internal.M
        public final kotlinx.serialization.b<?>[] childSerializers() {
            Lazy<kotlinx.serialization.b<Object>>[] lazyArr = M0.z;
            kotlinx.serialization.internal.S0 s0 = kotlinx.serialization.internal.S0.a;
            kotlinx.serialization.internal.W w = kotlinx.serialization.internal.W.a;
            C1141i c1141i = C1141i.a;
            return new kotlinx.serialization.b[]{s0, s0, lazyArr[2].getValue(), s0, lazyArr[4].getValue(), s0, w, kotlinx.serialization.builtins.a.c(s0), s0, s0, lazyArr[10].getValue(), s0, lazyArr[12].getValue(), s0, lazyArr[14].getValue(), c1141i, w, w, c1141i, w, s0, s0, C1138g0.a, kotlinx.serialization.builtins.a.c(T0.a.a), s0};
        }

        @Override // kotlinx.serialization.a
        public final Object deserialize(kotlinx.serialization.encoding.e decoder) {
            int i;
            T0 t0;
            s1 s1Var;
            B b;
            String str;
            Map map;
            int i2;
            Map map2;
            List list;
            boolean z;
            int i3;
            boolean z2;
            int i4;
            String str2;
            String str3;
            String str4;
            String str5;
            String str6;
            String str7;
            String str8;
            String str9;
            int i5;
            String str10;
            String str11;
            String str12;
            long j;
            int i6;
            Intrinsics.checkNotNullParameter(decoder, "decoder");
            kotlinx.serialization.descriptors.f fVar = descriptor;
            kotlinx.serialization.encoding.c beginStructure = decoder.beginStructure(fVar);
            Lazy<kotlinx.serialization.b<Object>>[] lazyArr = M0.z;
            int i7 = 10;
            if (beginStructure.decodeSequentially()) {
                String decodeStringElement = beginStructure.decodeStringElement(fVar, 0);
                String decodeStringElement2 = beginStructure.decodeStringElement(fVar, 1);
                List list2 = (List) beginStructure.decodeSerializableElement(fVar, 2, lazyArr[2].getValue(), null);
                String decodeStringElement3 = beginStructure.decodeStringElement(fVar, 3);
                Map map3 = (Map) beginStructure.decodeSerializableElement(fVar, 4, lazyArr[4].getValue(), null);
                String decodeStringElement4 = beginStructure.decodeStringElement(fVar, 5);
                int decodeIntElement = beginStructure.decodeIntElement(fVar, 6);
                String str13 = (String) beginStructure.decodeNullableSerializableElement(fVar, 7, kotlinx.serialization.internal.S0.a, null);
                String decodeStringElement5 = beginStructure.decodeStringElement(fVar, 8);
                String decodeStringElement6 = beginStructure.decodeStringElement(fVar, 9);
                Map map4 = (Map) beginStructure.decodeSerializableElement(fVar, 10, lazyArr[10].getValue(), null);
                String decodeStringElement7 = beginStructure.decodeStringElement(fVar, 11);
                B b2 = (B) beginStructure.decodeSerializableElement(fVar, 12, lazyArr[12].getValue(), null);
                String decodeStringElement8 = beginStructure.decodeStringElement(fVar, 13);
                s1 s1Var2 = (s1) beginStructure.decodeSerializableElement(fVar, 14, lazyArr[14].getValue(), null);
                boolean decodeBooleanElement = beginStructure.decodeBooleanElement(fVar, 15);
                int decodeIntElement2 = beginStructure.decodeIntElement(fVar, 16);
                int decodeIntElement3 = beginStructure.decodeIntElement(fVar, 17);
                boolean decodeBooleanElement2 = beginStructure.decodeBooleanElement(fVar, 18);
                int decodeIntElement4 = beginStructure.decodeIntElement(fVar, 19);
                String decodeStringElement9 = beginStructure.decodeStringElement(fVar, 20);
                String decodeStringElement10 = beginStructure.decodeStringElement(fVar, 21);
                long decodeLongElement = beginStructure.decodeLongElement(fVar, 22);
                t0 = (T0) beginStructure.decodeNullableSerializableElement(fVar, 23, T0.a.a, null);
                str12 = beginStructure.decodeStringElement(fVar, 24);
                str = str13;
                i4 = decodeIntElement;
                str5 = decodeStringElement4;
                str4 = decodeStringElement3;
                map2 = map4;
                str6 = decodeStringElement5;
                list = list2;
                i = 33554431;
                map = map3;
                str7 = decodeStringElement6;
                i5 = decodeIntElement2;
                str8 = decodeStringElement7;
                str3 = decodeStringElement2;
                z2 = decodeBooleanElement;
                str11 = decodeStringElement10;
                str10 = decodeStringElement9;
                i3 = decodeIntElement4;
                z = decodeBooleanElement2;
                i2 = decodeIntElement3;
                s1Var = s1Var2;
                j = decodeLongElement;
                str9 = decodeStringElement8;
                b = b2;
                str2 = decodeStringElement;
            } else {
                int i8 = 0;
                int i9 = 24;
                boolean z3 = false;
                int i10 = 0;
                int i11 = 0;
                T0 t02 = null;
                s1 s1Var3 = null;
                B b3 = null;
                String str14 = null;
                Map map5 = null;
                String str15 = null;
                String str16 = null;
                String str17 = null;
                String str18 = null;
                String str19 = null;
                String str20 = null;
                String str21 = null;
                String str22 = null;
                String str23 = null;
                String str24 = null;
                String str25 = null;
                int i12 = 4;
                boolean z4 = true;
                long j2 = 0;
                int i13 = 0;
                int i14 = 0;
                boolean z5 = false;
                Map map6 = null;
                List list3 = null;
                while (z4) {
                    int decodeElementIndex = beginStructure.decodeElementIndex(fVar);
                    switch (decodeElementIndex) {
                        case -1:
                            z4 = false;
                            i9 = 24;
                            i12 = 4;
                        case 0:
                            str15 = beginStructure.decodeStringElement(fVar, 0);
                            i8 |= 1;
                            i9 = 24;
                            i7 = 10;
                            i12 = 4;
                        case 1:
                            str16 = beginStructure.decodeStringElement(fVar, 1);
                            i8 |= 2;
                            i9 = 24;
                            i7 = 10;
                            i12 = 4;
                        case 2:
                            list3 = (List) beginStructure.decodeSerializableElement(fVar, 2, lazyArr[2].getValue(), list3);
                            i8 |= 4;
                            i9 = 24;
                            i7 = 10;
                            i12 = 4;
                        case 3:
                            str17 = beginStructure.decodeStringElement(fVar, 3);
                            i8 |= 8;
                            i9 = 24;
                            i7 = 10;
                        case 4:
                            map5 = (Map) beginStructure.decodeSerializableElement(fVar, i12, lazyArr[i12].getValue(), map5);
                            i8 |= 16;
                            i9 = 24;
                            i7 = 10;
                        case 5:
                            str18 = beginStructure.decodeStringElement(fVar, 5);
                            i8 |= 32;
                            i9 = 24;
                            i7 = 10;
                        case 6:
                            i10 = beginStructure.decodeIntElement(fVar, 6);
                            i8 |= 64;
                            i9 = 24;
                            i7 = 10;
                        case 7:
                            str14 = (String) beginStructure.decodeNullableSerializableElement(fVar, 7, kotlinx.serialization.internal.S0.a, str14);
                            i8 |= 128;
                            i9 = 24;
                            i7 = 10;
                        case 8:
                            str19 = beginStructure.decodeStringElement(fVar, 8);
                            i8 |= 256;
                            i9 = 24;
                        case 9:
                            str20 = beginStructure.decodeStringElement(fVar, 9);
                            i8 |= 512;
                            i9 = 24;
                        case 10:
                            map6 = (Map) beginStructure.decodeSerializableElement(fVar, i7, lazyArr[i7].getValue(), map6);
                            i8 |= 1024;
                            i9 = 24;
                        case 11:
                            str21 = beginStructure.decodeStringElement(fVar, 11);
                            i8 |= 2048;
                            i9 = 24;
                        case 12:
                            b3 = (B) beginStructure.decodeSerializableElement(fVar, 12, lazyArr[12].getValue(), b3);
                            i8 |= 4096;
                            i9 = 24;
                        case 13:
                            str22 = beginStructure.decodeStringElement(fVar, 13);
                            i8 |= 8192;
                            i9 = 24;
                        case 14:
                            s1Var3 = (s1) beginStructure.decodeSerializableElement(fVar, 14, lazyArr[14].getValue(), s1Var3);
                            i8 |= 16384;
                            i9 = 24;
                        case 15:
                            z5 = beginStructure.decodeBooleanElement(fVar, 15);
                            i6 = 32768;
                            i8 |= i6;
                            i9 = 24;
                        case 16:
                            i11 = beginStructure.decodeIntElement(fVar, 16);
                            i6 = 65536;
                            i8 |= i6;
                            i9 = 24;
                        case 17:
                            i8 |= 131072;
                            i13 = beginStructure.decodeIntElement(fVar, 17);
                            i9 = 24;
                        case 18:
                            i8 |= 262144;
                            z3 = beginStructure.decodeBooleanElement(fVar, 18);
                            i9 = 24;
                        case 19:
                            i14 = beginStructure.decodeIntElement(fVar, 19);
                            i6 = 524288;
                            i8 |= i6;
                            i9 = 24;
                        case 20:
                            str23 = beginStructure.decodeStringElement(fVar, 20);
                            i6 = 1048576;
                            i8 |= i6;
                            i9 = 24;
                        case 21:
                            str24 = beginStructure.decodeStringElement(fVar, 21);
                            i6 = 2097152;
                            i8 |= i6;
                            i9 = 24;
                        case 22:
                            j2 = beginStructure.decodeLongElement(fVar, 22);
                            i8 |= 4194304;
                            i9 = 24;
                        case 23:
                            t02 = (T0) beginStructure.decodeNullableSerializableElement(fVar, 23, T0.a.a, t02);
                            i8 |= 8388608;
                            i9 = 24;
                        case 24:
                            str25 = beginStructure.decodeStringElement(fVar, i9);
                            i8 |= 16777216;
                        default:
                            throw new kotlinx.serialization.s(decodeElementIndex);
                    }
                }
                i = i8;
                t0 = t02;
                s1Var = s1Var3;
                b = b3;
                str = str14;
                map = map5;
                i2 = i13;
                map2 = map6;
                list = list3;
                z = z3;
                i3 = i14;
                z2 = z5;
                i4 = i10;
                str2 = str15;
                str3 = str16;
                str4 = str17;
                str5 = str18;
                str6 = str19;
                str7 = str20;
                str8 = str21;
                str9 = str22;
                i5 = i11;
                str10 = str23;
                str11 = str24;
                str12 = str25;
                j = j2;
            }
            beginStructure.endStructure(fVar);
            return new M0(i, str2, str3, list, str4, map, str5, i4, str, str6, str7, map2, str8, b, str9, s1Var, z2, i5, i2, z, i3, str10, str11, j, t0, str12);
        }

        @Override // kotlinx.serialization.k, kotlinx.serialization.a
        public final kotlinx.serialization.descriptors.f getDescriptor() {
            return descriptor;
        }

        /*  JADX ERROR: JadxRuntimeException in pass: IfRegionVisitor
            jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r5v23 int, still in use, count: 2, list:
              (r5v23 int) from 0x0193: IF  (r5v23 int) != (5 int)  -> B:52:0x0195 A[HIDDEN] (LINE:404)
              (r5v23 int) from 0x0195: PHI (r5v27 int) = (r5v23 int) binds: [B:79:0x0193] A[DONT_GENERATE, DONT_INLINE]
            	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:162)
            	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:127)
            	at jadx.core.dex.visitors.regions.TernaryMod.makeTernaryInsn(TernaryMod.java:125)
            	at jadx.core.dex.visitors.regions.TernaryMod.processRegion(TernaryMod.java:62)
            	at jadx.core.dex.visitors.regions.TernaryMod.enterRegion(TernaryMod.java:45)
            	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:67)
            	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
            	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
            	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
            	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverse(DepthRegionTraversal.java:19)
            	at jadx.core.dex.visitors.regions.TernaryMod.process(TernaryMod.java:35)
            	at jadx.core.dex.visitors.regions.IfRegionVisitor.process(IfRegionVisitor.java:34)
            	at jadx.core.dex.visitors.regions.IfRegionVisitor.visit(IfRegionVisitor.java:30)
            */
        @Override // kotlinx.serialization.k
        public final void serialize(kotlinx.serialization.encoding.f r23, java.lang.Object r24) {
            /*
                Method dump skipped, instructions count: 504
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: com.bbflight.background_downloader.M0.a.serialize(kotlinx.serialization.encoding.f, java.lang.Object):void");
        }

        @Override // kotlinx.serialization.internal.M
        public final /* bridge */ kotlinx.serialization.b<?>[] typeParametersSerializers() {
            return kotlinx.serialization.internal.F0.a;
        }
    }

    public static final class b {
        public final kotlinx.serialization.b<M0> serializer() {
            return a.a;
        }
    }

    static {
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.PUBLICATION;
        z = new Lazy[]{null, null, LazyKt.lazy(lazyThreadSafetyMode, (Function0) new I0()), null, LazyKt.lazy(lazyThreadSafetyMode, (Function0) new J0()), null, null, null, null, null, LazyKt.lazy(lazyThreadSafetyMode, (Function0) new K0()), null, LazyKt.lazy(lazyThreadSafetyMode, (Function0) new C0223n(1)), null, LazyKt.lazy(lazyThreadSafetyMode, (Function0) new L0()), null, null, null, null, null, null, null, null, null, null};
    }

    public /* synthetic */ M0(int i, String str, String str2, List list, String str3, Map map, String str4, int i2, String str5, String str6, String str7, Map map2, String str8, B b2, String str9, s1 s1Var, boolean z2, int i3, int i4, boolean z3, int i5, String str10, String str11, long j, T0 t0, String str12) {
        if (16805914 != (i & 16805914)) {
            kotlinx.serialization.internal.A0.a(a.a.getDescriptor(), i, 16805914);
            throw null;
        }
        this.a = (i & 1) == 0 ? String.valueOf(Math.abs(Random.INSTANCE.nextInt())) : str;
        this.b = str2;
        if ((i & 4) == 0) {
            this.c = CollectionsKt.emptyList();
        } else {
            this.c = list;
        }
        this.d = str3;
        this.e = map;
        if ((i & 32) == 0) {
            this.f = ShareTarget.METHOD_GET;
        } else {
            this.f = str4;
        }
        if ((i & 64) == 0) {
            this.g = 1;
        } else {
            this.g = i2;
        }
        if ((i & 128) == 0) {
            this.h = null;
        } else {
            this.h = str5;
        }
        if ((i & 256) == 0) {
            this.i = "";
        } else {
            this.i = str6;
        }
        if ((i & 512) == 0) {
            this.j = "";
        } else {
            this.j = str7;
        }
        if ((i & 1024) == 0) {
            this.k = MapsKt.emptyMap();
        } else {
            this.k = map2;
        }
        if ((i & 2048) == 0) {
            this.l = "";
        } else {
            this.l = str8;
        }
        this.m = b2;
        this.n = str9;
        this.o = s1Var;
        if ((32768 & i) == 0) {
            this.p = false;
        } else {
            this.p = z2;
        }
        if ((65536 & i) == 0) {
            this.q = 0;
        } else {
            this.q = i3;
        }
        if ((131072 & i) == 0) {
            this.r = 0;
        } else {
            this.r = i4;
        }
        if ((262144 & i) == 0) {
            this.s = false;
        } else {
            this.s = z3;
        }
        this.t = (524288 & i) == 0 ? 5 : i5;
        if ((1048576 & i) == 0) {
            this.u = "";
        } else {
            this.u = str10;
        }
        if ((2097152 & i) == 0) {
            this.v = "";
        } else {
            this.v = str11;
        }
        this.w = (4194304 & i) == 0 ? System.currentTimeMillis() : j;
        if ((i & 8388608) == 0) {
            this.x = null;
        } else {
            this.x = t0;
        }
        this.y = str12;
    }

    public static M0 a(M0 m0, String str, String str2, Map map, int i) {
        String str3 = (i & 2) != 0 ? null : str;
        String str4 = (i & 8) != 0 ? null : str2;
        Map map2 = (i & 16) == 0 ? map : null;
        String str5 = m0.a;
        if (str3 == null) {
            str3 = m0.b;
        }
        String str6 = str3;
        List<String> list = m0.c;
        if (str4 == null) {
            str4 = m0.d;
        }
        String str7 = str4;
        if (map2 == null) {
            map2 = m0.e;
        }
        return new M0(str5, str6, list, str7, map2, m0.f, m0.g, m0.h, m0.i, m0.j, m0.k, m0.l, m0.m, m0.n, m0.o, m0.p, m0.q, m0.r, m0.s, m0.t, m0.u, m0.v, m0.w, m0.x, m0.y);
    }

    public static final M0 f(Context context, M0 m0, boolean z2) {
        String str;
        String str2;
        String substringBeforeLast$default;
        List<String> groupValues;
        String str3;
        Integer intOrNull;
        if (!z2) {
            return m0;
        }
        Regex regex = new Regex("\\((\\d+)\\)\\.?[^.]*$");
        Regex regex2 = new Regex("\\.[^.]*$");
        boolean exists = new File(m0.b(context, null)).exists();
        while (true) {
            String str4 = m0.d;
            if (!exists) {
                return m0;
            }
            MatchResult find$default = Regex.find$default(regex2, str4, 0, 2, null);
            if (find$default == null || (str = find$default.getValue()) == null) {
                str = "";
            }
            MatchResult find$default2 = Regex.find$default(regex, str4, 0, 2, null);
            int intValue = ((find$default2 == null || (groupValues = find$default2.getGroupValues()) == null || (str3 = groupValues.get(1)) == null || (intOrNull = StringsKt.toIntOrNull(str3)) == null) ? 0 : intOrNull.intValue()) + 1;
            if (find$default2 == null) {
                File file = new File(str4);
                Intrinsics.checkNotNullParameter(file, "file");
                String name = file.getName();
                String extension = FilesKt.getExtension(file);
                Intrinsics.checkNotNull(name);
                substringBeforeLast$default = StringsKt__StringsKt.substringBeforeLast$default(name, "." + extension, (String) null, 2, (Object) null);
                str2 = substringBeforeLast$default + " (" + intValue + ")" + str;
            } else {
                String substring = str4.substring(0, find$default2.getRange().getFirst() - 1);
                Intrinsics.checkNotNullExpressionValue(substring, "substring(...)");
                str2 = substring + " (" + intValue + ")" + str;
            }
            m0 = a(m0, null, str2, null, 33554423);
            exists = new File(m0.b(context, null)).exists();
        }
    }

    public final String b(Context context, String str) {
        Intrinsics.checkNotNullParameter(context, "context");
        if (Intrinsics.areEqual(this.y, "MultiUploadTask") && str == null) {
            return "";
        }
        if (str == null) {
            str = this.d;
        }
        String a2 = C0633a0.a(context, this.m);
        if (a2 == null) {
            throw new IllegalStateException("External storage is requested but not available");
        }
        String str2 = this.l;
        if (str2.length() == 0) {
            return android.support.v4.media.session.f.b(a2, DomExceptionUtils.SEPARATOR, str);
        }
        return a2 + DomExceptionUtils.SEPARATOR + str2 + DomExceptionUtils.SEPARATOR + str;
    }

    public final String c() {
        try {
            return new URL(this.b).getHost();
        } catch (MalformedURLException unused) {
            return "";
        }
    }

    public final boolean d() {
        String str = this.y;
        return Intrinsics.areEqual(str, "DownloadTask") || Intrinsics.areEqual(str, "ParallelDownloadTask");
    }

    /* JADX WARN: Can't wrap try/catch for region: R(12:0|1|(2:3|(8:5|6|7|(1:(4:10|11|12|13)(2:40|41))(13:42|43|44|(1:46)|(1:48)(1:87)|(2:50|(8:85|22|(2:26|27)|28|29|(2:31|32)|34|35)(4:56|57|58|(9:63|64|65|66|67|68|69|70|(1:72)(1:73))(5:60|61|62|16|17)))|86|79|28|29|(0)|34|35)|14|15|16|17))|90|6|7|(0)(0)|14|15|16|17|(1:(0))) */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:24:0x014f A[Catch: all -> 0x017a, TryCatch #7 {all -> 0x017a, blocks: (B:15:0x00ff, B:16:0x0120, B:21:0x0129, B:22:0x013e, B:24:0x014f, B:26:0x015f, B:70:0x00f3, B:61:0x0111), top: B:7:0x002e }] */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0186 A[Catch: all -> 0x018f, TRY_LEAVE, TryCatch #9 {all -> 0x018f, blocks: (B:29:0x017a, B:31:0x0186), top: B:28:0x017a }] */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0056  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0030  */
    /* JADX WARN: Type inference failed for: r13v1, types: [T, kotlin.text.MatchResult] */
    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference failed for: r1v14, types: [boolean] */
    /* JADX WARN: Type inference failed for: r1v16 */
    /* JADX WARN: Type inference failed for: r1v21, types: [boolean] */
    /* JADX WARN: Type inference failed for: r1v24 */
    /* JADX WARN: Type inference failed for: r1v6 */
    /* JADX WARN: Type inference failed for: r1v9 */
    /* JADX WARN: Type inference failed for: r2v23, types: [T, kotlin.text.MatchResult] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object e(Context context, Map map, boolean z2, ContinuationImpl continuationImpl) {
        N0 n0;
        int i;
        Context context2;
        String lastPathSegment;
        String str;
        Ref.ObjectRef objectRef;
        Ref.ObjectRef objectRef2;
        kotlinx.coroutines.scheduling.b bVar;
        O0 o0;
        String str2;
        ?? find$default;
        boolean z3 = map;
        if (continuationImpl instanceof N0) {
            n0 = (N0) continuationImpl;
            int i2 = n0.k;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                n0.k = i2 - Integer.MIN_VALUE;
                Object obj = n0.i;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = n0.k;
                if (i != 0) {
                    ResultKt.throwOnFailure(obj);
                    try {
                        List list = (List) z3.get("Content-Disposition");
                        if (list == null) {
                            list = (List) z3.get("content-disposition");
                        }
                        str = list != null ? (String) list.get(0) : null;
                    } catch (Throwable unused) {
                    }
                    if (str != null) {
                        Regex regex = new Regex("filename\\*=\\s*([^']+)'([^']*)'\"?([^\"]+)\"?", RegexOption.IGNORE_CASE);
                        objectRef = new Ref.ObjectRef();
                        ?? find$default2 = Regex.find$default(regex, str, 0, 2, null);
                        objectRef.element = find$default2;
                        if (find$default2 == 0 || find$default2.getGroupValues().get(1).length() <= 0 || ((MatchResult) objectRef.element).getGroupValues().get(3).length() <= 0) {
                            context2 = context;
                            z3 = z2;
                            find$default = Regex.find$default(new Regex("filename=\\s*\"?([^\"]+)\"?.*$", RegexOption.IGNORE_CASE), str, 0, 2, null);
                            objectRef.element = find$default;
                            if (find$default != 0 && find$default.getGroupValues().get(1).length() > 0) {
                                return f(context2, a(this, null, ((MatchResult) objectRef.element).getGroupValues().get(1), null, 33554423), z3);
                            }
                            lastPathSegment = Uri.parse(this.b).getLastPathSegment();
                            if (lastPathSegment != null) {
                                return f(context2, a(this, null, lastPathSegment, null, 33554423), z3);
                            }
                            return f(context2, this, z3);
                        }
                        try {
                            String upperCase = ((MatchResult) objectRef.element).getGroupValues().get(1).toUpperCase(Locale.ROOT);
                            Intrinsics.checkNotNullExpressionValue(upperCase, "toUpperCase(...)");
                            try {
                                if (!Intrinsics.areEqual(upperCase, "UTF-8")) {
                                    context2 = context;
                                    str2 = ((MatchResult) objectRef.element).getGroupValues().get(3);
                                    objectRef2 = objectRef;
                                    return f(context2, a(this, null, str2, null, 33554423), true);
                                }
                                try {
                                    kotlinx.coroutines.scheduling.c cVar = C1049c0.a;
                                    bVar = kotlinx.coroutines.scheduling.b.a;
                                    o0 = new O0(objectRef, null);
                                    context2 = context;
                                } catch (IllegalArgumentException unused2) {
                                    context2 = context;
                                }
                                try {
                                    n0.a = context2;
                                    n0.b = SpillingKt.nullOutSpilledVariable(z3);
                                    n0.c = str;
                                    n0.d = SpillingKt.nullOutSpilledVariable(regex);
                                    n0.e = objectRef;
                                    boolean z4 = z2;
                                    n0.f = z4;
                                    n0.k = 1;
                                    obj = C1082i.f(o0, bVar, n0);
                                    if (obj == coroutine_suspended) {
                                        return coroutine_suspended;
                                    }
                                    objectRef2 = objectRef;
                                    z3 = z4;
                                } catch (IllegalArgumentException unused3) {
                                    z3 = z2;
                                    objectRef2 = objectRef;
                                    Objects.toString(((MatchResult) objectRef2.element).getGroupValues().get(3));
                                    objectRef = objectRef2;
                                    z3 = z3;
                                    find$default = Regex.find$default(new Regex("filename=\\s*\"?([^\"]+)\"?.*$", RegexOption.IGNORE_CASE), str, 0, 2, null);
                                    objectRef.element = find$default;
                                    if (find$default != 0) {
                                    }
                                    lastPathSegment = Uri.parse(this.b).getLastPathSegment();
                                    if (lastPathSegment != null) {
                                    }
                                    return f(context2, this, z3);
                                } catch (Throwable unused4) {
                                }
                            } catch (IllegalArgumentException unused5) {
                                objectRef2 = objectRef;
                                Objects.toString(((MatchResult) objectRef2.element).getGroupValues().get(3));
                                objectRef = objectRef2;
                                z3 = z3;
                                find$default = Regex.find$default(new Regex("filename=\\s*\"?([^\"]+)\"?.*$", RegexOption.IGNORE_CASE), str, 0, 2, null);
                                objectRef.element = find$default;
                                if (find$default != 0) {
                                    return f(context2, a(this, null, ((MatchResult) objectRef.element).getGroupValues().get(1), null, 33554423), z3);
                                }
                                lastPathSegment = Uri.parse(this.b).getLastPathSegment();
                                if (lastPathSegment != null) {
                                }
                                return f(context2, this, z3);
                            }
                        } catch (IllegalArgumentException unused6) {
                            context2 = context;
                        }
                    }
                    context2 = context;
                    z3 = z2;
                    lastPathSegment = Uri.parse(this.b).getLastPathSegment();
                    if (lastPathSegment != null) {
                    }
                    return f(context2, this, z3);
                }
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                z3 = n0.f;
                objectRef2 = n0.e;
                str = n0.c;
                Context context3 = n0.a;
                try {
                    ResultKt.throwOnFailure(obj);
                    context2 = context3;
                    z3 = z3;
                } catch (IllegalArgumentException unused7) {
                    context2 = context3;
                    Objects.toString(((MatchResult) objectRef2.element).getGroupValues().get(3));
                    objectRef = objectRef2;
                    z3 = z3;
                    find$default = Regex.find$default(new Regex("filename=\\s*\"?([^\"]+)\"?.*$", RegexOption.IGNORE_CASE), str, 0, 2, null);
                    objectRef.element = find$default;
                    if (find$default != 0) {
                    }
                    try {
                        lastPathSegment = Uri.parse(this.b).getLastPathSegment();
                        if (lastPathSegment != null) {
                        }
                    } catch (Throwable unused8) {
                    }
                    return f(context2, this, z3);
                } catch (Throwable unused9) {
                    context2 = context3;
                }
                str2 = (String) obj;
                return f(context2, a(this, null, str2, null, 33554423), true);
            }
        }
        n0 = new N0(this, continuationImpl);
        Object obj2 = n0.i;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = n0.k;
        if (i != 0) {
        }
        str2 = (String) obj2;
        return f(context2, a(this, null, str2, null, 33554423), true);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!Intrinsics.areEqual(M0.class, obj != null ? obj.getClass() : null)) {
            return false;
        }
        Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type com.bbflight.background_downloader.Task");
        return Intrinsics.areEqual(this.a, ((M0) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        int i = this.r;
        StringBuilder a2 = androidx.datastore.preferences.protobuf.c.a("Task(taskId='", this.a, "', url='", this.b, "', filename='");
        a2.append(this.d);
        a2.append("', headers=");
        a2.append(this.e);
        a2.append(", httpRequestMethod=");
        androidx.collection.e.d(a2, this.f, ", post=", this.h, ", fileField='");
        androidx.collection.e.d(a2, this.i, "', mimeType='", this.j, "', fields=");
        a2.append(this.k);
        a2.append(", directory='");
        a2.append(this.l);
        a2.append("', baseDirectory=");
        a2.append(this.m);
        a2.append(", group='");
        a2.append(this.n);
        a2.append("', updates=");
        a2.append(this.o);
        a2.append(", requiresWiFi=");
        a2.append(this.p);
        a2.append(", retries=");
        a2.append(this.q);
        a2.append(", retriesRemaining=");
        a2.append(i);
        a2.append(", allowPause=");
        a2.append(this.s);
        a2.append(", metaData='");
        a2.append(this.u);
        a2.append("', creationTime=");
        a2.append(this.w);
        a2.append(", taskType='");
        a2.append(this.y);
        a2.append("')");
        return a2.toString();
    }

    public M0(String taskId, String url, List<String> urls, String filename, Map<String, String> headers, String httpRequestMethod, int i, String str, String fileField, String mimeType, Map<String, String> fields, String directory, B baseDirectory, String group, s1 updates, boolean z2, int i2, int i3, boolean z3, int i4, String metaData, String displayName, long j, T0 t0, String taskType) {
        Intrinsics.checkNotNullParameter(taskId, "taskId");
        Intrinsics.checkNotNullParameter(url, "url");
        Intrinsics.checkNotNullParameter(urls, "urls");
        Intrinsics.checkNotNullParameter(filename, "filename");
        Intrinsics.checkNotNullParameter(headers, "headers");
        Intrinsics.checkNotNullParameter(httpRequestMethod, "httpRequestMethod");
        Intrinsics.checkNotNullParameter(fileField, "fileField");
        Intrinsics.checkNotNullParameter(mimeType, "mimeType");
        Intrinsics.checkNotNullParameter(fields, "fields");
        Intrinsics.checkNotNullParameter(directory, "directory");
        Intrinsics.checkNotNullParameter(baseDirectory, "baseDirectory");
        Intrinsics.checkNotNullParameter(group, "group");
        Intrinsics.checkNotNullParameter(updates, "updates");
        Intrinsics.checkNotNullParameter(metaData, "metaData");
        Intrinsics.checkNotNullParameter(displayName, "displayName");
        Intrinsics.checkNotNullParameter(taskType, "taskType");
        this.a = taskId;
        this.b = url;
        this.c = urls;
        this.d = filename;
        this.e = headers;
        this.f = httpRequestMethod;
        this.g = i;
        this.h = str;
        this.i = fileField;
        this.j = mimeType;
        this.k = fields;
        this.l = directory;
        this.m = baseDirectory;
        this.n = group;
        this.o = updates;
        this.p = z2;
        this.q = i2;
        this.r = i3;
        this.s = z3;
        this.t = i4;
        this.u = metaData;
        this.v = displayName;
        this.w = j;
        this.x = t0;
        this.y = taskType;
    }
}
