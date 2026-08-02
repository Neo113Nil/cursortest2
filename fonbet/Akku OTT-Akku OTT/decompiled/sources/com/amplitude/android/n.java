package com.amplitude.android;

import androidx.media3.session.C0510i;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.Q0;

@SourceDebugExtension({"SMAP\nFrustrationInteractionsDetector.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FrustrationInteractionsDetector.kt\ncom/amplitude/android/FrustrationInteractionsDetector\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,395:1\n1855#2,2:396\n1549#2:398\n1620#2,3:399\n*S KotlinDebug\n*F\n+ 1 FrustrationInteractionsDetector.kt\ncom/amplitude/android/FrustrationInteractionsDetector\n*L\n75#1:396,2\n355#1:398\n355#1:399,3\n*E\n"})
/* loaded from: classes3.dex */
public final class n {
    public static final b Companion = new b();
    public final com.amplitude.core.b a;
    public final com.amplitude.common.a b;
    public final g c;
    public final float d;
    public Q0 e;
    public final ConcurrentHashMap<String, c> f;

    public static final class a {
        public final float a;
        public final float b;
        public final long c;

        public a(float f, float f2, long j) {
            this.a = f;
            this.b = f2;
            this.c = j;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return Float.compare(this.a, aVar.a) == 0 && Float.compare(this.b, aVar.b) == 0 && this.c == aVar.c;
        }

        public final int hashCode() {
            return Long.hashCode(this.c) + androidx.compose.runtime.t.a(this.b, Float.hashCode(this.a) * 31, 31);
        }

        public final String toString() {
            return "ClickInfo(x=" + this.a + ", y=" + this.b + ", timestamp=" + this.c + ')';
        }
    }

    public static final class b {
    }

    public static final class c {
        public final long a;
        public long b;
        public int c;
        public final float d;
        public final float e;
        public final d f;
        public final List<a> g;

        public c(long j, long j2, float f, float f2, d targetInfo, List clicks) {
            Intrinsics.checkNotNullParameter(targetInfo, "targetInfo");
            Intrinsics.checkNotNullParameter(clicks, "clicks");
            this.a = j;
            this.b = j2;
            this.c = 1;
            this.d = f;
            this.e = f2;
            this.f = targetInfo;
            this.g = clicks;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            return this.a == cVar.a && this.b == cVar.b && this.c == cVar.c && Float.compare(this.d, cVar.d) == 0 && Float.compare(this.e, cVar.e) == 0 && Intrinsics.areEqual(this.f, cVar.f) && Intrinsics.areEqual(this.g, cVar.g);
        }

        public final int hashCode() {
            return this.g.hashCode() + ((this.f.hashCode() + androidx.compose.runtime.t.a(this.e, androidx.compose.runtime.t.a(this.d, androidx.collection.g.a(this.c, C0510i.a(this.b, Long.hashCode(this.a) * 31, 31), 31), 31), 31)) * 31);
        }

        public final String toString() {
            return "RageClickSession(firstClickTime=" + this.a + ", lastClickTime=" + this.b + ", clickCount=" + this.c + ", firstClickX=" + this.d + ", firstClickY=" + this.e + ", targetInfo=" + this.f + ", clicks=" + this.g + ')';
        }
    }

    public static final class d {
        public final String a;
        public final String b;
        public final String c;
        public final String d;
        public final String e;
        public final String f;

        public d(String str, String str2, String str3, String str4, String str5, String str6) {
            this.a = str;
            this.b = str2;
            this.c = str3;
            this.d = str4;
            this.e = str5;
            this.f = str6;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof d)) {
                return false;
            }
            d dVar = (d) obj;
            return Intrinsics.areEqual(this.a, dVar.a) && Intrinsics.areEqual(this.b, dVar.b) && Intrinsics.areEqual(this.c, dVar.c) && Intrinsics.areEqual(this.d, dVar.d) && Intrinsics.areEqual(this.e, dVar.e) && Intrinsics.areEqual(this.f, dVar.f);
        }

        public final int hashCode() {
            String str = this.a;
            int hashCode = (str == null ? 0 : str.hashCode()) * 31;
            String str2 = this.b;
            int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
            String str3 = this.c;
            int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
            String str4 = this.d;
            int hashCode4 = (hashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
            String str5 = this.e;
            int hashCode5 = (hashCode4 + (str5 == null ? 0 : str5.hashCode())) * 31;
            String str6 = this.f;
            return hashCode5 + (str6 != null ? str6.hashCode() : 0);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("TargetInfo(className=");
            sb.append(this.a);
            sb.append(", resourceName=");
            sb.append(this.b);
            sb.append(", tag=");
            sb.append(this.c);
            sb.append(", text=");
            sb.append(this.d);
            sb.append(", source=");
            sb.append(this.e);
            sb.append(", hierarchy=");
            return androidx.compose.runtime.t.b(')', this.f, sb);
        }
    }

    public n(com.amplitude.core.b amplitude, com.amplitude.common.a logger, float f, g autocaptureState) {
        Intrinsics.checkNotNullParameter(amplitude, "amplitude");
        Intrinsics.checkNotNullParameter(logger, "logger");
        Intrinsics.checkNotNullParameter(autocaptureState, "autocaptureState");
        this.a = amplitude;
        this.b = logger;
        this.c = autocaptureState;
        this.d = f * 50.0f;
        this.f = new ConcurrentHashMap<>();
        new ConcurrentHashMap();
    }

    public final void a(String str, a aVar, d dVar, long j) {
        float f = aVar.a;
        float f2 = aVar.b;
        this.f.put(str, new c(j, j, f, f2, dVar, CollectionsKt.mutableListOf(new a(f, f2, j))));
    }
}
