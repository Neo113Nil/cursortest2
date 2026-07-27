package D3;

import T4.o;
import T4.r;
import T4.z;
import b2.AbstractC0279e;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Locale;
import java.util.Objects;
import java.util.StringJoiner;
import java.util.TreeMap;
import java.util.concurrent.TimeUnit;
import java.util.function.Predicate;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.stream.Collectors;

/* loaded from: classes.dex */
public final class i implements r {

    /* renamed from: f, reason: collision with root package name */
    public static final Logger f450f = Logger.getLogger(i.class.getName());

    /* renamed from: a, reason: collision with root package name */
    public final K3.a f451a;

    /* renamed from: b, reason: collision with root package name */
    public final A3.b f452b;

    /* renamed from: c, reason: collision with root package name */
    public final Predicate f453c;

    /* renamed from: d, reason: collision with root package name */
    public final g f454d;

    /* renamed from: e, reason: collision with root package name */
    public final h f455e;

    public i(K3.a aVar, A3.b bVar) {
        aVar.getClass();
        f fVar = new f(0);
        TimeUnit timeUnit = TimeUnit.NANOSECONDS;
        Objects.requireNonNull(timeUnit);
        g gVar = new g(0, timeUnit);
        h hVar = new h(0);
        this.f451a = aVar;
        this.f452b = bVar;
        this.f453c = fVar;
        this.f454d = gVar;
        this.f455e = hVar;
    }

    public static String b(z zVar) {
        StringJoiner stringJoiner = new StringJoiner(StringUtils.COMMA, "Response{", "}");
        stringJoiner.add("code=" + zVar.f3018d);
        StringBuilder sb = new StringBuilder("headers=");
        o oVar = zVar.f3020f;
        Comparator CASE_INSENSITIVE_ORDER = String.CASE_INSENSITIVE_ORDER;
        kotlin.jvm.internal.i.d(CASE_INSENSITIVE_ORDER, "CASE_INSENSITIVE_ORDER");
        TreeMap treeMap = new TreeMap(CASE_INSENSITIVE_ORDER);
        int size = oVar.size();
        for (int i2 = 0; i2 < size; i2++) {
            String d6 = oVar.d(i2);
            Locale US = Locale.US;
            kotlin.jvm.internal.i.d(US, "US");
            String lowerCase = d6.toLowerCase(US);
            kotlin.jvm.internal.i.d(lowerCase, "toLowerCase(...)");
            List list = (List) treeMap.get(lowerCase);
            if (list == null) {
                list = new ArrayList(2);
                treeMap.put(lowerCase, list);
            }
            list.add(oVar.f(i2));
        }
        sb.append((String) treeMap.entrySet().stream().map(new A3.b(9)).collect(Collectors.joining(StringUtils.COMMA, "[", "]")));
        stringJoiner.add(sb.toString());
        return stringJoiner.toString();
    }

    @Override // T4.r
    public final z a(Y4.i iVar) {
        long nanos;
        String str;
        String str2;
        long nanos2;
        String str3 = "non-retryable";
        String str4 = "retryable";
        Logger logger = f450f;
        K3.a aVar = this.f451a;
        nanos = aVar.f1413a.toNanos();
        long j2 = nanos;
        IOException iOException = null;
        int i2 = 0;
        z zVar = null;
        while (true) {
            if (i2 > 0) {
                nanos2 = aVar.f1414b.toNanos();
                double min = Math.min(j2, nanos2);
                long doubleValue = (long) (((Double) this.f455e.get()).doubleValue() * min);
                str = str3;
                str2 = str4;
                long j6 = (long) (min * aVar.f1415c);
                try {
                    ((TimeUnit) this.f454d.f448b).sleep(doubleValue);
                    if (zVar != null) {
                        zVar.close();
                    }
                    j2 = j6;
                    iOException = null;
                } catch (InterruptedException unused) {
                    Thread.currentThread().interrupt();
                    if (zVar != null) {
                        return zVar;
                    }
                    throw iOException;
                }
            } else {
                str = str3;
                str2 = str4;
            }
            try {
                zVar = iVar.b(iVar.f3716e);
                boolean equals = Boolean.TRUE.equals(this.f452b.apply(zVar));
                Level level = Level.FINER;
                if (logger.isLoggable(level)) {
                    StringBuilder sb = new StringBuilder();
                    sb.append("Attempt ");
                    sb.append(i2);
                    sb.append(" returned ");
                    sb.append(equals ? str2 : str);
                    sb.append(" response: ");
                    sb.append(b(zVar));
                    logger.log(level, sb.toString());
                }
                if (!equals) {
                    return zVar;
                }
            } catch (IOException e3) {
                boolean test = this.f453c.test(e3);
                Level level2 = Level.FINER;
                if (logger.isLoggable(level2)) {
                    logger.log(level2, AbstractC0279e.h(AbstractC0279e.i(i2, "Attempt ", " failed with "), test ? str2 : str, " exception"), (Throwable) e3);
                }
                if (!test) {
                    throw e3;
                }
                iOException = e3;
                zVar = null;
            }
            i2++;
            if (i2 >= 5) {
                break;
            }
            str3 = str;
            str4 = str2;
        }
    }
}
