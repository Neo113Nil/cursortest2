package com.bbflight.background_downloader;

import androidx.browser.trusted.sharing.ShareTarget;
import androidx.core.app.NotificationCompat;
import com.bbflight.background_downloader.M0;
import com.google.android.exoplayer2.source.rtsp.RtspHeaders;
import java.util.Map;
import kotlin.Deprecated;
import kotlin.DeprecationLevel;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.NoWhenBranchMatchedException;
import kotlin.TuplesKt;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.JvmField;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.random.Random;
import kotlinx.serialization.internal.C1138g0;
import kotlinx.serialization.json.b;

@kotlinx.serialization.i
@SourceDebugExtension({"SMAP\nParallelDownloadTaskWorker.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ParallelDownloadTaskWorker.kt\ncom/bbflight/background_downloader/Chunk\n+ 2 SerialFormat.kt\nkotlinx/serialization/SerialFormatKt\n*L\n1#1,502:1\n113#2:503\n*S KotlinDebug\n*F\n+ 1 ParallelDownloadTaskWorker.kt\ncom/bbflight/background_downloader/Chunk\n*L\n491#1:503\n*E\n"})
/* loaded from: classes3.dex */
public final class O {
    public static final b Companion = new b();

    @JvmField
    public static final Lazy<kotlinx.serialization.b<Object>>[] i = {null, null, null, null, null, null, LazyKt.lazy(LazyThreadSafetyMode.PUBLICATION, (Function0) new N()), null};
    public final String a;
    public final String b;
    public final String c;
    public final M0 d;
    public final long e;
    public final long f;
    public W0 g;
    public double h;

    @Deprecated(level = DeprecationLevel.HIDDEN, message = "This synthesized declaration should not be used directly")
    public static final /* synthetic */ class a implements kotlinx.serialization.internal.M<O> {
        public static final a a;
        private static final kotlinx.serialization.descriptors.f descriptor;

        static {
            a aVar = new a();
            a = aVar;
            kotlinx.serialization.internal.D0 d0 = new kotlinx.serialization.internal.D0("com.bbflight.background_downloader.Chunk", aVar, 8);
            d0.j("parentTaskId", false);
            d0.j("url", false);
            d0.j("filename", false);
            d0.j("task", false);
            d0.j("fromByte", false);
            d0.j("toByte", false);
            d0.j(NotificationCompat.CATEGORY_STATUS, true);
            d0.j(NotificationCompat.CATEGORY_PROGRESS, true);
            descriptor = d0;
        }

        @Override // kotlinx.serialization.internal.M
        public final kotlinx.serialization.b<?>[] childSerializers() {
            Lazy<kotlinx.serialization.b<Object>>[] lazyArr = O.i;
            kotlinx.serialization.internal.S0 s0 = kotlinx.serialization.internal.S0.a;
            C1138g0 c1138g0 = C1138g0.a;
            return new kotlinx.serialization.b[]{s0, s0, s0, M0.a.a, c1138g0, c1138g0, lazyArr[6].getValue(), kotlinx.serialization.internal.C.a};
        }

        @Override // kotlinx.serialization.a
        public final Object deserialize(kotlinx.serialization.encoding.e decoder) {
            int i;
            W0 w0;
            M0 m0;
            String str;
            String str2;
            String str3;
            double d;
            long j;
            long j2;
            Intrinsics.checkNotNullParameter(decoder, "decoder");
            kotlinx.serialization.descriptors.f fVar = descriptor;
            kotlinx.serialization.encoding.c beginStructure = decoder.beginStructure(fVar);
            Lazy<kotlinx.serialization.b<Object>>[] lazyArr = O.i;
            String str4 = null;
            if (beginStructure.decodeSequentially()) {
                String decodeStringElement = beginStructure.decodeStringElement(fVar, 0);
                String decodeStringElement2 = beginStructure.decodeStringElement(fVar, 1);
                String decodeStringElement3 = beginStructure.decodeStringElement(fVar, 2);
                M0 m02 = (M0) beginStructure.decodeSerializableElement(fVar, 3, M0.a.a, null);
                long decodeLongElement = beginStructure.decodeLongElement(fVar, 4);
                long decodeLongElement2 = beginStructure.decodeLongElement(fVar, 5);
                w0 = (W0) beginStructure.decodeSerializableElement(fVar, 6, lazyArr[6].getValue(), null);
                str = decodeStringElement;
                d = beginStructure.decodeDoubleElement(fVar, 7);
                m0 = m02;
                i = 255;
                str3 = decodeStringElement3;
                str2 = decodeStringElement2;
                j = decodeLongElement;
                j2 = decodeLongElement2;
            } else {
                double d2 = 0.0d;
                boolean z = true;
                int i2 = 0;
                W0 w02 = null;
                M0 m03 = null;
                long j3 = 0;
                long j4 = 0;
                String str5 = null;
                String str6 = null;
                while (z) {
                    int decodeElementIndex = beginStructure.decodeElementIndex(fVar);
                    switch (decodeElementIndex) {
                        case -1:
                            z = false;
                            break;
                        case 0:
                            i2 |= 1;
                            str4 = beginStructure.decodeStringElement(fVar, 0);
                            continue;
                        case 1:
                            i2 |= 2;
                            str5 = beginStructure.decodeStringElement(fVar, 1);
                            continue;
                        case 2:
                            str6 = beginStructure.decodeStringElement(fVar, 2);
                            i2 |= 4;
                            continue;
                        case 3:
                            m03 = (M0) beginStructure.decodeSerializableElement(fVar, 3, M0.a.a, m03);
                            i2 |= 8;
                            break;
                        case 4:
                            j3 = beginStructure.decodeLongElement(fVar, 4);
                            i2 |= 16;
                            break;
                        case 5:
                            j4 = beginStructure.decodeLongElement(fVar, 5);
                            i2 |= 32;
                            break;
                        case 6:
                            w02 = (W0) beginStructure.decodeSerializableElement(fVar, 6, lazyArr[6].getValue(), w02);
                            i2 |= 64;
                            break;
                        case 7:
                            d2 = beginStructure.decodeDoubleElement(fVar, 7);
                            i2 |= 128;
                            break;
                        default:
                            throw new kotlinx.serialization.s(decodeElementIndex);
                    }
                }
                i = i2;
                w0 = w02;
                m0 = m03;
                str = str4;
                str2 = str5;
                str3 = str6;
                d = d2;
                j = j3;
                j2 = j4;
            }
            beginStructure.endStructure(fVar);
            return new O(i, str, str2, str3, m0, j, j2, w0, d);
        }

        @Override // kotlinx.serialization.k, kotlinx.serialization.a
        public final kotlinx.serialization.descriptors.f getDescriptor() {
            return descriptor;
        }

        @Override // kotlinx.serialization.k
        public final void serialize(kotlinx.serialization.encoding.f encoder, Object obj) {
            O value = (O) obj;
            Intrinsics.checkNotNullParameter(encoder, "encoder");
            Intrinsics.checkNotNullParameter(value, "value");
            kotlinx.serialization.descriptors.f fVar = descriptor;
            kotlinx.serialization.encoding.d beginStructure = encoder.beginStructure(fVar);
            Lazy<kotlinx.serialization.b<Object>>[] lazyArr = O.i;
            beginStructure.encodeStringElement(fVar, 0, value.a);
            beginStructure.encodeStringElement(fVar, 1, value.b);
            beginStructure.encodeStringElement(fVar, 2, value.c);
            beginStructure.encodeSerializableElement(fVar, 3, M0.a.a, value.d);
            beginStructure.encodeLongElement(fVar, 4, value.e);
            beginStructure.encodeLongElement(fVar, 5, value.f);
            if (beginStructure.shouldEncodeElementDefault(fVar, 6) || value.g != W0.b) {
                beginStructure.encodeSerializableElement(fVar, 6, lazyArr[6].getValue(), value.g);
            }
            if (beginStructure.shouldEncodeElementDefault(fVar, 7) || Double.compare(value.h, 0.0d) != 0) {
                beginStructure.encodeDoubleElement(fVar, 7, value.h);
            }
            beginStructure.endStructure(fVar);
        }

        @Override // kotlinx.serialization.internal.M
        public final /* bridge */ kotlinx.serialization.b<?>[] typeParametersSerializers() {
            return kotlinx.serialization.internal.F0.a;
        }
    }

    public static final class b {
        public final kotlinx.serialization.b<O> serializer() {
            return a.a;
        }
    }

    public O(M0 parentTask, String url, String filename, long j, long j2) {
        s1 s1Var;
        Intrinsics.checkNotNullParameter(parentTask, "parentTask");
        Intrinsics.checkNotNullParameter(url, "url");
        Intrinsics.checkNotNullParameter(filename, "filename");
        String str = parentTask.a;
        Map<String, String> map = parentTask.e;
        StringBuilder b2 = androidx.compose.runtime.snapshots.m.b(j, "bytes=", "-");
        b2.append(j2);
        Map plus = MapsKt.plus(map, MapsKt.mapOf(TuplesKt.to(RtspHeaders.RANGE, b2.toString())));
        B b3 = B.b;
        Companion.getClass();
        Intrinsics.checkNotNullParameter(parentTask, "parentTask");
        int ordinal = parentTask.o.ordinal();
        if (ordinal == 0 || ordinal == 1) {
            s1Var = s1.b;
        } else {
            if (ordinal != 2 && ordinal != 3) {
                throw new NoWhenBranchMatchedException();
            }
            s1Var = s1.d;
        }
        s1 s1Var2 = s1Var;
        int i2 = parentTask.q;
        boolean z = parentTask.p;
        boolean z2 = parentTask.s;
        int i3 = parentTask.t;
        b.a aVar = kotlinx.serialization.json.b.d;
        P p = new P(parentTask.a, j, j2);
        aVar.getClass();
        M0 m0 = new M0(String.valueOf(Math.abs(Random.INSTANCE.nextInt())), url, CollectionsKt.emptyList(), filename, plus, ShareTarget.METHOD_GET, 1, null, "", "", MapsKt.emptyMap(), "", b3, "chunk", s1Var2, z, i2, i2, z2, i3, aVar.b(P.Companion.serializer(), p), "", System.currentTimeMillis(), null, "DownloadTask");
        W0 w0 = W0.b;
        this.a = str;
        this.b = url;
        this.c = filename;
        this.d = m0;
        this.e = j;
        this.f = j2;
        this.g = w0;
        this.h = 0.0d;
    }

    public /* synthetic */ O(int i2, String str, String str2, String str3, M0 m0, long j, long j2, W0 w0, double d) {
        if (63 != (i2 & 63)) {
            kotlinx.serialization.internal.A0.a(a.a.getDescriptor(), i2, 63);
            throw null;
        }
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = m0;
        this.e = j;
        this.f = j2;
        if ((i2 & 64) == 0) {
            this.g = W0.b;
        } else {
            this.g = w0;
        }
        if ((i2 & 128) == 0) {
            this.h = 0.0d;
        } else {
            this.h = d;
        }
    }
}
