package Qj0;

import B90.C2618u;
import Ve.Om;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes3.dex */
public final class z0 {

    /* renamed from: a, reason: collision with root package name */
    private final Integer f23762a;

    /* renamed from: b, reason: collision with root package name */
    private final Integer f23763b;

    /* renamed from: c, reason: collision with root package name */
    private final Double f23764c;

    /* renamed from: d, reason: collision with root package name */
    private final Double f23765d;

    /* renamed from: e, reason: collision with root package name */
    private final Double f23766e;

    /* renamed from: f, reason: collision with root package name */
    private final String f23767f;

    /* renamed from: g, reason: collision with root package name */
    private final LinkedHashMap f23768g;

    /* renamed from: h, reason: collision with root package name */
    private final List<b> f23769h;

    /* renamed from: i, reason: collision with root package name */
    private final List<b> f23770i;

    /* renamed from: j, reason: collision with root package name */
    private final a f23771j;

    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        private final Integer f23772a;

        /* renamed from: b, reason: collision with root package name */
        private final String f23773b;

        /* renamed from: c, reason: collision with root package name */
        private final Boolean f23774c;

        public a(Integer num, String str, Boolean bool) {
            this.f23772a = num;
            this.f23773b = str;
            this.f23774c = bool;
        }

        public final Integer a() {
            return this.f23772a;
        }

        public final String b() {
            return this.f23773b;
        }

        public final Boolean c() {
            return this.f23774c;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return Intrinsics.d(this.f23772a, aVar.f23772a) && Intrinsics.d(this.f23773b, aVar.f23773b) && Intrinsics.d(this.f23774c, aVar.f23774c);
        }

        public final int hashCode() {
            Integer num = this.f23772a;
            int hashCode = (num != null ? num.hashCode() : 0) * 31;
            String str = this.f23773b;
            int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 31;
            Boolean bool = this.f23774c;
            return hashCode2 + (bool != null ? bool.hashCode() : 0);
        }

        @NotNull
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("ErrorDetails(count=");
            sb2.append(this.f23772a);
            sb2.append(", fatalErrorType=");
            sb2.append(this.f23773b);
            sb2.append(", isTimeoutError=");
            return D3.g.d(sb2, this.f23774c, ")");
        }
    }

    public static final class b {

        /* renamed from: a, reason: collision with root package name */
        @NotNull
        private final String f23775a;

        /* renamed from: b, reason: collision with root package name */
        private final a f23776b;

        /* renamed from: c, reason: collision with root package name */
        private final C0478b f23777c;

        public static final class a {

            /* renamed from: a, reason: collision with root package name */
            private final Double f23778a;

            /* renamed from: b, reason: collision with root package name */
            private final Double f23779b;

            /* renamed from: c, reason: collision with root package name */
            private final Double f23780c;

            /* renamed from: d, reason: collision with root package name */
            private final Double f23781d;

            /* renamed from: e, reason: collision with root package name */
            private final Double f23782e;

            /* renamed from: f, reason: collision with root package name */
            private final Double f23783f;

            /* renamed from: g, reason: collision with root package name */
            private final Double f23784g;

            /* renamed from: h, reason: collision with root package name */
            private final Double f23785h;

            /* renamed from: i, reason: collision with root package name */
            private final Double f23786i;

            /* renamed from: j, reason: collision with root package name */
            private final Double f23787j;

            /* renamed from: k, reason: collision with root package name */
            private final Double f23788k;

            public a() {
                this(4095);
            }

            public final Double a() {
                return this.f23787j;
            }

            public final Double b() {
                return this.f23778a;
            }

            public final Double c() {
                return this.f23786i;
            }

            public final Double d() {
                return this.f23783f;
            }

            public final Double e() {
                return this.f23782e;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof a)) {
                    return false;
                }
                a aVar = (a) obj;
                return Intrinsics.a(this.f23778a, aVar.f23778a) && Intrinsics.a(this.f23779b, aVar.f23779b) && Intrinsics.a(this.f23780c, aVar.f23780c) && Intrinsics.a(this.f23781d, aVar.f23781d) && Intrinsics.a(this.f23782e, aVar.f23782e) && Intrinsics.a(this.f23783f, aVar.f23783f) && Intrinsics.a(this.f23784g, aVar.f23784g) && Intrinsics.a(this.f23785h, aVar.f23785h) && Intrinsics.a(this.f23786i, aVar.f23786i) && Intrinsics.a(this.f23787j, aVar.f23787j) && Intrinsics.a(this.f23788k, aVar.f23788k);
            }

            public final Double f() {
                return this.f23781d;
            }

            public final Double g() {
                return this.f23779b;
            }

            public final Double h() {
                return this.f23784g;
            }

            public final int hashCode() {
                Double d11 = this.f23778a;
                int hashCode = (d11 != null ? d11.hashCode() : 0) * 31;
                Double d12 = this.f23779b;
                int hashCode2 = (hashCode + (d12 != null ? d12.hashCode() : 0)) * 31;
                Double d13 = this.f23780c;
                int hashCode3 = (hashCode2 + (d13 != null ? d13.hashCode() : 0)) * 961;
                Double d14 = this.f23781d;
                int hashCode4 = (hashCode3 + (d14 != null ? d14.hashCode() : 0)) * 31;
                Double d15 = this.f23782e;
                int hashCode5 = (hashCode4 + (d15 != null ? d15.hashCode() : 0)) * 31;
                Double d16 = this.f23783f;
                int hashCode6 = (hashCode5 + (d16 != null ? d16.hashCode() : 0)) * 31;
                Double d17 = this.f23784g;
                int hashCode7 = (hashCode6 + (d17 != null ? d17.hashCode() : 0)) * 31;
                Double d18 = this.f23785h;
                int hashCode8 = (hashCode7 + (d18 != null ? d18.hashCode() : 0)) * 31;
                Double d19 = this.f23786i;
                int hashCode9 = (hashCode8 + (d19 != null ? d19.hashCode() : 0)) * 31;
                Double d21 = this.f23787j;
                int hashCode10 = (hashCode9 + (d21 != null ? d21.hashCode() : 0)) * 31;
                Double d22 = this.f23788k;
                return hashCode10 + (d22 != null ? d22.hashCode() : 0);
            }

            public final Double i() {
                return this.f23785h;
            }

            public final Double j() {
                return this.f23780c;
            }

            public final Double k() {
                return this.f23788k;
            }

            @NotNull
            public final String toString() {
                return "AppMetrics(dnsTime=" + this.f23778a + ", tcpTime=" + this.f23779b + ", tlsTime=" + this.f23780c + ", requestTime=null, serverTime=" + this.f23781d + ", responseTime=" + this.f23782e + ", protocolVersion=" + this.f23783f + ", timeToFirstByte=" + this.f23784g + ", timeToLastByte=" + this.f23785h + ", encodedSize=" + this.f23786i + ", decodedSize=" + this.f23787j + ", transferSize=" + this.f23788k + ")";
            }

            public /* synthetic */ a(int i11) {
                this(null, null, null, null, null, null, null, null, null, null, (i11 & 2048) != 0 ? null : Double.valueOf(0.0d));
            }

            public a(Double d11, Double d12, Double d13, Double d14, Double d15, Double d16, Double d17, Double d18, Double d19, Double d21, Double d22) {
                this.f23778a = d11;
                this.f23779b = d12;
                this.f23780c = d13;
                this.f23781d = d14;
                this.f23782e = d15;
                this.f23783f = d16;
                this.f23784g = d17;
                this.f23785h = d18;
                this.f23786i = d19;
                this.f23787j = d21;
                this.f23788k = d22;
            }
        }

        /* renamed from: Qj0.z0$b$b, reason: collision with other inner class name */
        public static final class C0478b {

            /* renamed from: a, reason: collision with root package name */
            private final ArrayList f23789a;

            /* renamed from: Qj0.z0$b$b$a */
            public static final class a {

                /* renamed from: a, reason: collision with root package name */
                @NotNull
                private final String f23790a;

                /* renamed from: b, reason: collision with root package name */
                @NotNull
                private final Number f23791b;

                /* renamed from: c, reason: collision with root package name */
                @NotNull
                private final String f23792c;

                public a(@NotNull String name, @NotNull Number duration, @NotNull String description) {
                    Intrinsics.checkNotNullParameter(name, "name");
                    Intrinsics.checkNotNullParameter(duration, "duration");
                    Intrinsics.checkNotNullParameter(description, "description");
                    this.f23790a = name;
                    this.f23791b = duration;
                    this.f23792c = description;
                }

                @NotNull
                public final String a() {
                    return this.f23792c;
                }

                @NotNull
                public final Number b() {
                    return this.f23791b;
                }

                @NotNull
                public final String c() {
                    return this.f23790a;
                }

                public final boolean equals(Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    if (!(obj instanceof a)) {
                        return false;
                    }
                    a aVar = (a) obj;
                    return Intrinsics.d(this.f23790a, aVar.f23790a) && Intrinsics.d(this.f23791b, aVar.f23791b) && Intrinsics.d(this.f23792c, aVar.f23792c);
                }

                public final int hashCode() {
                    return this.f23792c.hashCode() + ((this.f23791b.hashCode() + (this.f23790a.hashCode() * 31)) * 31);
                }

                @NotNull
                public final String toString() {
                    StringBuilder sb2 = new StringBuilder("ServerTimingData(name='");
                    sb2.append(this.f23790a);
                    sb2.append("', duration=");
                    sb2.append(this.f23791b);
                    sb2.append(", description='");
                    return C.o0.c(sb2, this.f23792c, "')");
                }
            }

            public C0478b() {
                this(null);
            }

            public final List<a> a() {
                return this.f23789a;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof C0478b)) {
                    return false;
                }
                C0478b c0478b = (C0478b) obj;
                c0478b.getClass();
                return Intrinsics.d(this.f23789a, c0478b.f23789a);
            }

            public final int hashCode() {
                ArrayList arrayList = this.f23789a;
                if (arrayList != null) {
                    return arrayList.hashCode();
                }
                return 0;
            }

            @NotNull
            public final String toString() {
                return Om.a(")", new StringBuilder("PlayerMetrics(videoResolution=null, serverTimings="), this.f23789a);
            }

            public C0478b(ArrayList arrayList) {
                this.f23789a = arrayList;
            }
        }

        public /* synthetic */ b(String str, a aVar) {
            this(str, aVar, null);
        }

        public final a a() {
            return this.f23776b;
        }

        public final C0478b b() {
            return this.f23777c;
        }

        @NotNull
        public final String c() {
            return this.f23775a;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return Intrinsics.d(this.f23775a, bVar.f23775a) && Intrinsics.d(this.f23776b, bVar.f23776b) && Intrinsics.d(this.f23777c, bVar.f23777c);
        }

        public final int hashCode() {
            int hashCode = this.f23775a.hashCode() * 31;
            a aVar = this.f23776b;
            int hashCode2 = (hashCode + (aVar != null ? aVar.hashCode() : 0)) * 31;
            C0478b c0478b = this.f23777c;
            return hashCode2 + (c0478b != null ? c0478b.hashCode() : 0);
        }

        @NotNull
        public final String toString() {
            return "VideoFile(url='" + this.f23775a + "', appMetrics=" + this.f23776b + ", playerMetrics=" + this.f23777c + ")";
        }

        public b(@NotNull String url, a aVar, C0478b c0478b) {
            Intrinsics.checkNotNullParameter(url, "url");
            this.f23775a = url;
            this.f23776b = aVar;
            this.f23777c = c0478b;
        }
    }

    public z0(Integer num, Integer num2, Double d11, Double d12, Double d13, String str, LinkedHashMap linkedHashMap, List list, List list2, a aVar) {
        this.f23762a = num;
        this.f23763b = num2;
        this.f23764c = d11;
        this.f23765d = d12;
        this.f23766e = d13;
        this.f23767f = str;
        this.f23768g = linkedHashMap;
        this.f23769h = list;
        this.f23770i = list2;
        this.f23771j = aVar;
    }

    public final Map<String, Integer> a() {
        return this.f23768g;
    }

    public final a b() {
        return this.f23771j;
    }

    public final List<b> c() {
        return this.f23770i;
    }

    public final Integer d() {
        return this.f23762a;
    }

    public final List<b> e() {
        return this.f23769h;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof z0)) {
            return false;
        }
        z0 z0Var = (z0) obj;
        return Intrinsics.d(this.f23762a, z0Var.f23762a) && Intrinsics.d(this.f23763b, z0Var.f23763b) && Intrinsics.a(this.f23764c, z0Var.f23764c) && Intrinsics.a(this.f23765d, z0Var.f23765d) && Intrinsics.a(this.f23766e, z0Var.f23766e) && Intrinsics.d(this.f23767f, z0Var.f23767f) && this.f23768g.equals(z0Var.f23768g) && this.f23771j.equals(z0Var.f23771j) && Intrinsics.d(this.f23769h, z0Var.f23769h) && Intrinsics.d(this.f23770i, z0Var.f23770i);
    }

    public final String f() {
        return this.f23767f;
    }

    public final Integer g() {
        return this.f23763b;
    }

    public final Double h() {
        return this.f23764c;
    }

    public final int hashCode() {
        Integer num = this.f23762a;
        int hashCode = (num != null ? num.hashCode() : 0) * 31;
        Integer num2 = this.f23763b;
        int hashCode2 = (hashCode + (num2 != null ? num2.hashCode() : 0)) * 31;
        Double d11 = this.f23764c;
        int hashCode3 = (hashCode2 + (d11 != null ? d11.hashCode() : 0)) * 31;
        Double d12 = this.f23765d;
        int hashCode4 = (hashCode3 + (d12 != null ? d12.hashCode() : 0)) * 31;
        Double d13 = this.f23766e;
        int hashCode5 = (hashCode4 + (d13 != null ? d13.hashCode() : 0)) * 31;
        String str = this.f23767f;
        int hashCode6 = (this.f23771j.hashCode() + ((this.f23768g.hashCode() + ((hashCode5 + (str != null ? str.hashCode() : 0)) * 887503681)) * 31)) * 31;
        List<b> list = this.f23769h;
        int hashCode7 = (hashCode6 + (list != null ? list.hashCode() : 0)) * 31;
        List<b> list2 = this.f23770i;
        return hashCode7 + (list2 != null ? list2.hashCode() : 0);
    }

    public final Double i() {
        return this.f23765d;
    }

    public final Double j() {
        return this.f23766e;
    }

    @NotNull
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("VideoMetric(index=");
        sb2.append(this.f23762a);
        sb2.append(", stallCount=");
        sb2.append(this.f23763b);
        sb2.append(", stallDuration=");
        sb2.append(this.f23764c);
        sb2.append(", startupTime=");
        sb2.append(this.f23765d);
        sb2.append(", viewTime=");
        sb2.append(this.f23766e);
        sb2.append(", productType=");
        sb2.append(this.f23767f);
        sb2.append(", videoRequestId=null, playerLoadTime=null, seekCount=null, duration=null, effectiveStartupTime=null, errorCount=");
        sb2.append(this.f23768g);
        sb2.append(", errorDetails=");
        sb2.append(this.f23771j);
        sb2.append(", manifests=");
        sb2.append(this.f23769h);
        sb2.append(", files=");
        return C2618u.h(sb2, this.f23770i, ")");
    }
}
