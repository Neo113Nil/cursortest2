package j$.time.format;

import j$.time.LocalDateTime;
import j$.time.ZoneId;
import j$.time.ZoneOffset;
import j$.time.temporal.TemporalAccessor;
import java.text.ParsePosition;
import java.util.AbstractMap;
import java.util.Locale;
import java.util.Map;
import java.util.Set;

/* loaded from: classes6.dex */
public final class g implements e {
    public static volatile Map.Entry b;
    public static volatile Map.Entry c;
    public final /* synthetic */ int a;

    public /* synthetic */ g(int i) {
        this.a = i;
    }

    @Override // j$.time.format.e
    public final boolean o(s sVar, StringBuilder sb) {
        switch (this.a) {
            case 0:
                Long a = sVar.a(j$.time.temporal.a.INSTANT_SECONDS);
                TemporalAccessor temporalAccessor = sVar.a;
                j$.time.temporal.a aVar = j$.time.temporal.a.NANO_OF_SECOND;
                Long valueOf = temporalAccessor.g(aVar) ? Long.valueOf(temporalAccessor.h(aVar)) : null;
                int i = 0;
                if (a == null) {
                    return false;
                }
                long longValue = a.longValue();
                int a2 = aVar.b.a(valueOf != null ? valueOf.longValue() : 0L, aVar);
                if (longValue >= -62167219200L) {
                    long j = longValue - 253402300800L;
                    long floorDiv = Math.floorDiv(j, 315569520000L) + 1;
                    LocalDateTime O = LocalDateTime.O(Math.floorMod(j, 315569520000L) - 62167219200L, 0, ZoneOffset.UTC);
                    if (floorDiv > 0) {
                        sb.append('+');
                        sb.append(floorDiv);
                    }
                    sb.append(O);
                    if (O.b.c == 0) {
                        sb.append(":00");
                    }
                } else {
                    long j2 = longValue + 62167219200L;
                    long j3 = j2 / 315569520000L;
                    long j4 = j2 % 315569520000L;
                    LocalDateTime O2 = LocalDateTime.O(j4 - 62167219200L, 0, ZoneOffset.UTC);
                    int length = sb.length();
                    sb.append(O2);
                    if (O2.b.c == 0) {
                        sb.append(":00");
                    }
                    if (j3 < 0) {
                        if (O2.a.a == -10000) {
                            sb.replace(length, length + 2, Long.toString(j3 - 1));
                        } else if (j4 == 0) {
                            sb.insert(length, j3);
                        } else {
                            sb.insert(length + 1, Math.abs(j3));
                        }
                    }
                }
                if (a2 > 0) {
                    sb.append('.');
                    int i2 = 100000000;
                    while (true) {
                        if (a2 > 0 || i % 3 != 0 || i < -2) {
                            int i3 = a2 / i2;
                            sb.append((char) (i3 + 48));
                            a2 -= i3 * i2;
                            i2 /= 10;
                            i++;
                        }
                    }
                }
                sb.append('Z');
                return true;
            default:
                j$.time.h hVar = o.f;
                TemporalAccessor temporalAccessor2 = sVar.a;
                Object b2 = temporalAccessor2.b(hVar);
                if (b2 == null && sVar.c == 0) {
                    throw new j$.time.c("Unable to extract " + hVar + " from temporal " + temporalAccessor2);
                }
                ZoneId zoneId = (ZoneId) b2;
                if (zoneId == null) {
                    return false;
                }
                sb.append(zoneId.m());
                return true;
        }
    }

    @Override // j$.time.format.e
    public final int v(p pVar, CharSequence charSequence, int i) {
        int i2;
        int i3 = 1;
        switch (this.a) {
            case 0:
                o oVar = new o();
                oVar.a(DateTimeFormatter.ISO_LOCAL_DATE);
                oVar.c('T');
                j$.time.temporal.a aVar = j$.time.temporal.a.HOUR_OF_DAY;
                oVar.g(aVar, 2);
                oVar.c(':');
                j$.time.temporal.a aVar2 = j$.time.temporal.a.MINUTE_OF_HOUR;
                oVar.g(aVar2, 2);
                oVar.c(':');
                j$.time.temporal.a aVar3 = j$.time.temporal.a.SECOND_OF_MINUTE;
                oVar.g(aVar3, 2);
                j$.time.temporal.a aVar4 = j$.time.temporal.a.NANO_OF_SECOND;
                oVar.b(new f(aVar4));
                oVar.c('Z');
                d dVar = oVar.l(Locale.getDefault(), x.SMART, null).a;
                if (dVar.b) {
                    dVar = new d(dVar.a, false);
                }
                p pVar2 = new p(pVar.a);
                pVar2.b = pVar.b;
                pVar2.c = pVar.c;
                int v = dVar.v(pVar2, charSequence, i);
                if (v < 0) {
                    return v;
                }
                long longValue = pVar2.d(j$.time.temporal.a.YEAR).longValue();
                int intValue = pVar2.d(j$.time.temporal.a.MONTH_OF_YEAR).intValue();
                int intValue2 = pVar2.d(j$.time.temporal.a.DAY_OF_MONTH).intValue();
                int intValue3 = pVar2.d(aVar).intValue();
                int intValue4 = pVar2.d(aVar2).intValue();
                Long d = pVar2.d(aVar3);
                Long d2 = pVar2.d(aVar4);
                int intValue5 = d != null ? d.intValue() : 0;
                int intValue6 = d2 != null ? d2.intValue() : 0;
                if (intValue3 == 24 && intValue4 == 0 && intValue5 == 0 && intValue6 == 0) {
                    intValue3 = 0;
                } else if (intValue3 == 23 && intValue4 == 59 && intValue5 == 60) {
                    pVar.c().d = true;
                    i3 = 0;
                    intValue5 = 59;
                } else {
                    i3 = 0;
                }
                int i4 = ((int) longValue) % 10000;
                try {
                    LocalDateTime localDateTime = LocalDateTime.c;
                    return pVar.f(aVar4, intValue6, i, pVar.f(j$.time.temporal.a.INSTANT_SECONDS, new LocalDateTime(j$.time.g.U(i4, intValue, intValue2), j$.time.k.O(intValue3, intValue4, intValue5, 0)).plusDays(i3).s(ZoneOffset.UTC) + Math.multiplyExact(longValue / 10000, 315569520000L), i, v));
                } catch (RuntimeException unused) {
                    return ~i;
                }
            default:
                int length = charSequence.length();
                if (i > length) {
                    throw new IndexOutOfBoundsException();
                }
                if (i != length) {
                    char charAt = charSequence.charAt(i);
                    if (charAt == '+' || charAt == '-') {
                        return a(pVar, charSequence, i, i, i.e);
                    }
                    int i5 = i + 2;
                    if (length >= i5) {
                        char charAt2 = charSequence.charAt(i + 1);
                        if (pVar.a(charAt, 'U') && pVar.a(charAt2, 'T')) {
                            int i6 = i + 3;
                            return (length < i6 || !pVar.a(charSequence.charAt(i5), 'C')) ? a(pVar, charSequence, i, i5, i.f) : a(pVar, charSequence, i, i6, i.f);
                        }
                        if (pVar.a(charAt, 'G') && length >= (i2 = i + 3) && pVar.a(charAt2, 'M') && pVar.a(charSequence.charAt(i5), 'T')) {
                            int i7 = i + 4;
                            if (length < i7 || !pVar.a(charSequence.charAt(i2), '0')) {
                                return a(pVar, charSequence, i, i2, i.f);
                            }
                            pVar.e(ZoneId.of("GMT0"));
                            return i7;
                        }
                    }
                    Set<String> set = j$.time.zone.i.d;
                    int size = set.size();
                    Map.Entry entry = pVar.b ? b : c;
                    if (entry == null || ((Integer) entry.getKey()).intValue() != size) {
                        synchronized (this) {
                            try {
                                entry = pVar.b ? b : c;
                                if (entry == null || ((Integer) entry.getKey()).intValue() != size) {
                                    Integer valueOf = Integer.valueOf(size);
                                    k kVar = pVar.b ? new k("", null, null) : new j("", null, null);
                                    for (String str : set) {
                                        kVar.a(str, str);
                                    }
                                    entry = new AbstractMap.SimpleImmutableEntry(valueOf, kVar);
                                    if (pVar.b) {
                                        b = entry;
                                    } else {
                                        c = entry;
                                    }
                                }
                            } catch (Throwable th) {
                                throw th;
                            }
                        }
                    }
                    k kVar2 = (k) entry.getValue();
                    ParsePosition parsePosition = new ParsePosition(i);
                    String c2 = kVar2.c(charSequence, parsePosition);
                    if (c2 != null) {
                        pVar.e(ZoneId.of(c2));
                        return parsePosition.getIndex();
                    }
                    if (pVar.a(charAt, 'Z')) {
                        pVar.e(ZoneOffset.UTC);
                        return i + 1;
                    }
                }
                return ~i;
        }
    }

    public static int a(p pVar, CharSequence charSequence, int i, int i2, i iVar) {
        String upperCase = charSequence.subSequence(i, i2).toString().toUpperCase();
        if (i2 >= charSequence.length()) {
            pVar.e(ZoneId.of(upperCase));
            return i2;
        }
        if (charSequence.charAt(i2) != '0' && !pVar.a(charSequence.charAt(i2), 'Z')) {
            p pVar2 = new p(pVar.a);
            pVar2.b = pVar.b;
            pVar2.c = pVar.c;
            int v = iVar.v(pVar2, charSequence, i2);
            try {
                if (v < 0) {
                    if (iVar == i.e) {
                        return ~i;
                    }
                    pVar.e(ZoneId.of(upperCase));
                    return i2;
                }
                pVar.e(ZoneId.A(upperCase, ZoneOffset.R((int) pVar2.d(j$.time.temporal.a.OFFSET_SECONDS).longValue())));
                return v;
            } catch (j$.time.c unused) {
                return ~i;
            }
        }
        pVar.e(ZoneId.of(upperCase));
        return i2;
    }

    public final String toString() {
        switch (this.a) {
            case 0:
                return "Instant()";
            default:
                return "ZoneRegionId()";
        }
    }
}
