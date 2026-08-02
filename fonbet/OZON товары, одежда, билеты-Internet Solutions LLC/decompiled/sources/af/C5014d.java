package af;

import We.C4864f;
import We.G;
import We.L;
import We.z;
import ef.C6353c;
import java.util.Date;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* renamed from: af.d, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C5014d {

    /* renamed from: a, reason: collision with root package name */
    private final G f36696a;

    /* renamed from: b, reason: collision with root package name */
    private final L f36697b;

    /* renamed from: af.d$a */
    public static final class a {
        public static boolean a(@NotNull G request, @NotNull L response) {
            Intrinsics.checkNotNullParameter(response, "response");
            Intrinsics.checkNotNullParameter(request, "request");
            int m11 = response.m();
            if (m11 != 200 && m11 != 410 && m11 != 414 && m11 != 501 && m11 != 203 && m11 != 204) {
                if (m11 != 307) {
                    if (m11 != 308 && m11 != 404 && m11 != 405) {
                        switch (m11) {
                            case 300:
                            case 301:
                                break;
                            case 302:
                                break;
                            default:
                                return false;
                        }
                    }
                }
                if (L.q(response, "Expires") == null && response.d().c() == -1 && !response.d().b() && !response.d().a()) {
                    return false;
                }
            }
            return (response.d().h() || request.b().h()) ? false : true;
        }
    }

    /* renamed from: af.d$b */
    public static final class b {

        /* renamed from: a, reason: collision with root package name */
        private Date f36698a;

        /* renamed from: b, reason: collision with root package name */
        private String f36699b;

        /* renamed from: c, reason: collision with root package name */
        private Date f36700c;

        /* renamed from: d, reason: collision with root package name */
        private String f36701d;

        /* renamed from: e, reason: collision with root package name */
        private Date f36702e;

        /* renamed from: f, reason: collision with root package name */
        private long f36703f;

        /* renamed from: g, reason: collision with root package name */
        private long f36704g;

        /* renamed from: h, reason: collision with root package name */
        private String f36705h;

        /* renamed from: i, reason: collision with root package name */
        private int f36706i;

        /* renamed from: j, reason: collision with root package name */
        private final long f36707j;

        /* renamed from: k, reason: collision with root package name */
        @NotNull
        private final G f36708k;

        /* renamed from: l, reason: collision with root package name */
        private final L f36709l;

        public b(long j11, @NotNull G request, L l11) {
            Intrinsics.checkNotNullParameter(request, "request");
            this.f36707j = j11;
            this.f36708k = request;
            this.f36709l = l11;
            this.f36706i = -1;
            if (l11 != null) {
                this.f36703f = l11.O();
                this.f36704g = l11.I();
                z r11 = l11.r();
                int size = r11.size();
                for (int i11 = 0; i11 < size; i11++) {
                    String e11 = r11.e(i11);
                    String k11 = r11.k(i11);
                    if (kotlin.text.h.D(e11, "Date", true)) {
                        this.f36698a = C6353c.a(k11);
                        this.f36699b = k11;
                    } else if (kotlin.text.h.D(e11, "Expires", true)) {
                        this.f36702e = C6353c.a(k11);
                    } else if (kotlin.text.h.D(e11, "Last-Modified", true)) {
                        this.f36700c = C6353c.a(k11);
                        this.f36701d = k11;
                    } else if (kotlin.text.h.D(e11, "ETag", true)) {
                        this.f36705h = k11;
                    } else if (kotlin.text.h.D(e11, "Age", true)) {
                        this.f36706i = Ye.b.C(-1, k11);
                    }
                }
            }
        }

        /* JADX WARN: Code restructure failed: missing block: B:77:0x00b1, code lost:
        
            if (r8 > 0) goto L47;
         */
        /* JADX WARN: Removed duplicated region for block: B:7:0x01b9  */
        /* JADX WARN: Type inference failed for: r4v10 */
        /* JADX WARN: Type inference failed for: r4v13 */
        /* JADX WARN: Type inference failed for: r4v17, types: [We.G, We.L] */
        /* JADX WARN: Type inference failed for: r4v18 */
        /* JADX WARN: Type inference failed for: r4v3 */
        /* JADX WARN: Type inference failed for: r4v5 */
        @NotNull
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final C5014d a() {
            ?? r42;
            C5014d c5014d;
            L l11;
            long j11;
            C4864f c4864f;
            Date date;
            G g10 = this.f36708k;
            L l12 = this.f36709l;
            if (l12 == null) {
                c5014d = new C5014d(g10, null);
            } else if (g10.g() && l12.p() == null) {
                c5014d = new C5014d(g10, null);
            } else {
                if (a.a(g10, l12)) {
                    C4864f b11 = g10.b();
                    if (!b11.g()) {
                        String str = "If-Modified-Since";
                        if (g10.d("If-Modified-Since") == null && g10.d("If-None-Match") == null) {
                            C4864f d11 = l12.d();
                            long j12 = this.f36704g;
                            Date date2 = this.f36698a;
                            long max = date2 != null ? Math.max(0L, j12 - date2.getTime()) : 0L;
                            int i11 = this.f36706i;
                            long j13 = 0;
                            if (i11 != -1) {
                                l11 = l12;
                                max = Math.max(max, TimeUnit.SECONDS.toMillis(i11));
                            } else {
                                l11 = l12;
                            }
                            long j14 = this.f36703f;
                            long j15 = max + (j12 - j14) + (this.f36707j - j12);
                            int c11 = l11.d().c();
                            Date date3 = this.f36700c;
                            long j16 = j14;
                            Date date4 = this.f36702e;
                            if (c11 == -1) {
                                if (date4 != null) {
                                    if (date2 != null) {
                                        j12 = date2.getTime();
                                    }
                                    j11 = date4.getTime() - j12;
                                } else {
                                    if (date3 != null && l11.L().j().o() == null) {
                                        if (date2 != null) {
                                            j16 = date2.getTime();
                                        }
                                        long time = j16 - date3.getTime();
                                        if (time > 0) {
                                            j11 = time / 10;
                                        }
                                    }
                                    j11 = 0;
                                }
                                return (c5014d.b() == null && g10.b().i()) ? new C5014d(r42, r42) : c5014d;
                            }
                            j11 = TimeUnit.SECONDS.toMillis(r11.c());
                            if (b11.c() != -1) {
                                c4864f = b11;
                                j11 = Math.min(j11, TimeUnit.SECONDS.toMillis(b11.c()));
                            } else {
                                c4864f = b11;
                            }
                            long millis = c4864f.e() != -1 ? TimeUnit.SECONDS.toMillis(c4864f.e()) : 0L;
                            if (d11.f() || c4864f.d() == -1) {
                                date = date4;
                            } else {
                                TimeUnit timeUnit = TimeUnit.SECONDS;
                                int d12 = c4864f.d();
                                date = date4;
                                j13 = timeUnit.toMillis(d12);
                            }
                            if (!d11.g()) {
                                long j17 = millis + j15;
                                if (j17 < j11 + j13) {
                                    L l13 = l11;
                                    L.a aVar = new L.a(l13);
                                    if (j17 >= j11) {
                                        aVar.a("Warning", "110 HttpURLConnection \"Response is stale\"");
                                    }
                                    if (j15 > 86400000 && l13.d().c() == -1 && date == null) {
                                        aVar.a("Warning", "113 HttpURLConnection \"Heuristic expiration\"");
                                    }
                                    r42 = 0;
                                    c5014d = new C5014d(null, aVar.c());
                                    if (c5014d.b() == null) {
                                    }
                                }
                            }
                            L l14 = l11;
                            String str2 = this.f36705h;
                            if (str2 != null) {
                                str = "If-None-Match";
                            } else if (date3 != null) {
                                str2 = this.f36701d;
                            } else {
                                if (date2 == null) {
                                    r42 = 0;
                                    c5014d = new C5014d(g10, null);
                                    if (c5014d.b() == null) {
                                    }
                                }
                                str2 = this.f36699b;
                            }
                            z.a h11 = g10.e().h();
                            Intrinsics.f(str2);
                            h11.c(str, str2);
                            G.a aVar2 = new G.a(g10);
                            aVar2.e(h11.e());
                            c5014d = new C5014d(aVar2.b(), l14);
                            r42 = 0;
                            if (c5014d.b() == null) {
                            }
                        }
                    }
                    r42 = 0;
                    c5014d = new C5014d(g10, null);
                    if (c5014d.b() == null) {
                    }
                }
                c5014d = new C5014d(g10, null);
            }
            r42 = 0;
            if (c5014d.b() == null) {
            }
        }
    }

    public C5014d(G g10, L l11) {
        this.f36696a = g10;
        this.f36697b = l11;
    }

    public final L a() {
        return this.f36697b;
    }

    public final G b() {
        return this.f36696a;
    }
}
