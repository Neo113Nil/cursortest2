package D2;

import A0.C0052p0;
import Q2.C0375o;
import android.graphics.Bitmap;
import java.text.DateFormat;
import java.text.ParsePosition;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Locale;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.l;
import o4.AbstractC2234l;
import y4.C2674b;
import y4.C2675c;
import y4.m;
import y4.n;

/* loaded from: classes.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public final C0.c f932a;

    /* renamed from: b, reason: collision with root package name */
    public final b f933b;

    /* renamed from: c, reason: collision with root package name */
    public final Date f934c;

    /* renamed from: d, reason: collision with root package name */
    public final String f935d;

    /* renamed from: e, reason: collision with root package name */
    public final Date f936e;
    public final String f;

    /* renamed from: g, reason: collision with root package name */
    public final Date f937g;

    /* renamed from: h, reason: collision with root package name */
    public final long f938h;
    public final long i;

    /* renamed from: j, reason: collision with root package name */
    public final String f939j;

    /* renamed from: k, reason: collision with root package name */
    public final int f940k;

    public c(C0.c cVar, b bVar) {
        int i;
        this.f932a = cVar;
        this.f933b = bVar;
        this.f940k = -1;
        if (bVar != null) {
            this.f938h = bVar.f929c;
            this.i = bVar.f930d;
            m mVar = bVar.f;
            int size = mVar.size();
            for (int i5 = 0; i5 < size; i5++) {
                String e3 = mVar.e(i5);
                if (AbstractC2234l.s0(e3, "Date", true)) {
                    String c5 = mVar.c("Date");
                    Date date = null;
                    if (c5 != null) {
                        C0052p0 c0052p0 = D4.c.f973a;
                        if (c5.length() != 0) {
                            ParsePosition parsePosition = new ParsePosition(0);
                            Date parse = ((DateFormat) D4.c.f973a.get()).parse(c5, parsePosition);
                            if (parsePosition.getIndex() == c5.length()) {
                                date = parse;
                            } else {
                                String[] strArr = D4.c.f974b;
                                synchronized (strArr) {
                                    try {
                                        int length = strArr.length;
                                        int i6 = 0;
                                        while (true) {
                                            if (i6 >= length) {
                                                break;
                                            }
                                            DateFormat[] dateFormatArr = D4.c.f975c;
                                            DateFormat dateFormat = dateFormatArr[i6];
                                            if (dateFormat == null) {
                                                dateFormat = new SimpleDateFormat(D4.c.f974b[i6], Locale.US);
                                                dateFormat.setTimeZone(z4.b.f21983e);
                                                dateFormatArr[i6] = dateFormat;
                                            }
                                            parsePosition.setIndex(0);
                                            Date parse2 = dateFormat.parse(c5, parsePosition);
                                            if (parsePosition.getIndex() != 0) {
                                                date = parse2;
                                                break;
                                            }
                                            i6++;
                                        }
                                    } catch (Throwable th) {
                                        throw th;
                                    }
                                }
                            }
                        }
                    }
                    this.f934c = date;
                    this.f935d = mVar.g(i5);
                } else if (AbstractC2234l.s0(e3, "Expires", true)) {
                    this.f937g = mVar.d("Expires");
                } else if (AbstractC2234l.s0(e3, "Last-Modified", true)) {
                    this.f936e = mVar.d("Last-Modified");
                    this.f = mVar.g(i5);
                } else if (AbstractC2234l.s0(e3, "ETag", true)) {
                    this.f939j = mVar.g(i5);
                } else if (AbstractC2234l.s0(e3, "Age", true)) {
                    String g5 = mVar.g(i5);
                    Bitmap.Config config = H2.e.f2284a;
                    Long z02 = AbstractC2234l.z0(g5);
                    if (z02 != null) {
                        long longValue = z02.longValue();
                        i = longValue > 2147483647L ? Integer.MAX_VALUE : longValue < 0 ? 0 : (int) longValue;
                    } else {
                        i = -1;
                    }
                    this.f940k = i;
                }
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:68:0x00d6, code lost:
    
        if (r4 > 0) goto L55;
     */
    /* JADX WARN: Type inference failed for: r5v1, types: [W3.e, java.lang.Object] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final d a() {
        b bVar;
        long j5;
        Date date;
        String str;
        String sb;
        long j6;
        String str2;
        int i;
        C0.c cVar = this.f932a;
        b bVar2 = this.f933b;
        if (bVar2 == null) {
            return new d(cVar, null);
        }
        n nVar = (n) cVar.f811b;
        if (nVar.f21369j && !bVar2.f931e) {
            return new d(cVar, null);
        }
        ?? r5 = bVar2.f927a;
        C2675c c2675c = (C2675c) r5.getValue();
        if (cVar.d().f21306b || ((C2675c) r5.getValue()).f21306b || l.a(bVar2.f.c("Vary"), "*")) {
            return new d(cVar, null);
        }
        C2675c d5 = cVar.d();
        if (!d5.f21305a) {
            m mVar = (m) cVar.f813d;
            if (mVar.c("If-Modified-Since") == null && mVar.c("If-None-Match") == null) {
                long j7 = this.i;
                Date date2 = this.f934c;
                if (date2 != null) {
                    bVar = bVar2;
                    j5 = Math.max(0L, j7 - date2.getTime());
                } else {
                    bVar = bVar2;
                    j5 = 0;
                }
                int i5 = this.f940k;
                long j8 = 0;
                if (i5 != -1) {
                    date = date2;
                    str = "If-Modified-Since";
                    j5 = Math.max(j5, TimeUnit.SECONDS.toMillis(i5));
                } else {
                    date = date2;
                    str = "If-Modified-Since";
                }
                long j9 = this.f938h;
                long longValue = j5 + (j7 - j9) + (((Number) H2.n.f2309a.invoke()).longValue() - j7);
                int i6 = ((C2675c) r5.getValue()).f21307c;
                Date date3 = this.f936e;
                if (i6 != -1) {
                    j6 = TimeUnit.SECONDS.toMillis(i6);
                } else {
                    Date date4 = this.f937g;
                    if (date4 != null) {
                        if (date != null) {
                            j7 = date.getTime();
                        }
                        j6 = date4.getTime() - j7;
                    } else {
                        if (date3 != null) {
                            ArrayList arrayList = nVar.f21367g;
                            if (arrayList == null) {
                                sb = null;
                            } else {
                                StringBuilder sb2 = new StringBuilder();
                                C2674b.g(arrayList, sb2);
                                sb = sb2.toString();
                            }
                            if (sb == null) {
                                if (date != null) {
                                    j9 = date.getTime();
                                }
                                long time = j9 - date3.getTime();
                                if (time > 0) {
                                    j6 = time / 10;
                                }
                            }
                        }
                        j6 = 0;
                    }
                }
                int i7 = d5.f21307c;
                if (i7 != -1) {
                    j6 = Math.min(j6, TimeUnit.SECONDS.toMillis(i7));
                }
                int i8 = d5.i;
                long millis = i8 != -1 ? TimeUnit.SECONDS.toMillis(i8) : 0L;
                if (!c2675c.f21310g && (i = d5.f21311h) != -1) {
                    j8 = TimeUnit.SECONDS.toMillis(i);
                }
                if (!c2675c.f21305a && longValue + millis < j6 + j8) {
                    return new d(null, bVar);
                }
                b bVar3 = bVar;
                String str3 = this.f939j;
                if (str3 != null) {
                    str2 = "If-None-Match";
                } else {
                    if (date3 != null) {
                        str3 = this.f;
                        l.c(str3);
                    } else {
                        if (date == null) {
                            return new d(cVar, null);
                        }
                        str3 = this.f935d;
                        l.c(str3);
                    }
                    str2 = str;
                }
                C0375o h3 = cVar.h();
                h3.j(str2, str3);
                return new d(h3.m(), bVar3);
            }
        }
        return new d(cVar, null);
    }
}
