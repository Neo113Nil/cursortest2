package m2;

import b2.AbstractC0279e;
import f4.v;
import io.appmetrica.analytics.impl.C0793l9;
import java.io.EOFException;
import java.io.IOException;
import java.time.Duration;
import java.time.Instant;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.t;
import z4.InterfaceC1586c;

/* renamed from: m2.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1280c extends AbstractC1286i {

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ int f11150t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C1280c(EnumC1281d enumC1281d, InterfaceC1586c interfaceC1586c, EnumC1289l enumC1289l, Object obj, int i2, int i3) {
        super(enumC1281d, interfaceC1586c, enumC1289l, obj, i2);
        this.f11150t = i3;
    }

    public static int h(Duration duration) {
        long seconds;
        int nano;
        int nano2;
        int nano3;
        seconds = duration.getSeconds();
        if (seconds < 0) {
            nano2 = duration.getNano();
            if (nano2 != 0) {
                nano3 = duration.getNano();
                return nano3 - 1000000000;
            }
        }
        nano = duration.getNano();
        return nano;
    }

    public static long i(Duration duration) {
        long seconds;
        long seconds2;
        int nano;
        long seconds3;
        seconds = duration.getSeconds();
        if (seconds < 0) {
            nano = duration.getNano();
            if (nano != 0) {
                seconds3 = duration.getSeconds();
                return seconds3 + 1;
            }
        }
        seconds2 = duration.getSeconds();
        return seconds2;
    }

    @Override // m2.AbstractC1286i
    public final Object b(V0.j reader) {
        Duration ofSeconds;
        Instant ofEpochSecond;
        C1280c c1280c = AbstractC1286i.f11167j;
        C1280c c1280c2 = AbstractC1286i.f11164g;
        long j2 = 0;
        C1280c c1280c3 = AbstractC1286i.f11176s;
        C1280c c1280c4 = AbstractC1286i.f11172o;
        int i2 = 0;
        int i3 = 0;
        Object obj = null;
        switch (this.f11150t) {
            case 0:
                kotlin.jvm.internal.i.e(reader, "reader");
                return Double.valueOf(Double.longBitsToDouble(((C1278a) reader.f3212b).i()));
            case 1:
                return Float.valueOf(Float.intBitsToFloat(((C1278a) reader.f3212b).h()));
            case 2:
                throw new IllegalStateException("Operation not supported.");
            case 3:
                kotlin.jvm.internal.i.e(reader, "reader");
                return Boolean.valueOf(((C1278a) reader.f3212b).l() != 0);
            case 4:
                kotlin.jvm.internal.i.e(reader, "reader");
                C1278a c1278a = (C1278a) reader.f3212b;
                int b6 = c1278a.b();
                int i6 = c1278a.f11139b;
                int i7 = i6 + b6;
                if (i7 > c1278a.f11140c) {
                    throw new EOFException();
                }
                j5.i iVar = j5.i.f10496d;
                j5.i l2 = l1.j.l(c1278a.f11138a, i6, b6);
                c1278a.f11139b = i7;
                return l2;
            case 5:
                long z = reader.z();
                while (true) {
                    int f3 = ((C1278a) reader.f3212b).f();
                    if (f3 == -1) {
                        reader.D(z);
                        ofSeconds = Duration.ofSeconds(j2, i3);
                        kotlin.jvm.internal.i.d(ofSeconds, "ofSeconds(...)");
                        return ofSeconds;
                    }
                    if (f3 == 1) {
                        j2 = ((Number) c1280c.b(reader)).longValue();
                    } else if (f3 != 2) {
                        reader.O(f3);
                    } else {
                        i3 = ((Number) c1280c2.b(reader)).intValue();
                    }
                }
            case 6:
                long z5 = reader.z();
                while (true) {
                    int f6 = ((C1278a) reader.f3212b).f();
                    if (f6 == -1) {
                        reader.D(z5);
                        return v.f5689a;
                    }
                    reader.O(f6);
                }
            case 7:
                kotlin.jvm.internal.i.e(reader, "reader");
                return Integer.valueOf(((C1278a) reader.f3212b).h());
            case 8:
                kotlin.jvm.internal.i.e(reader, "reader");
                return Long.valueOf(((C1278a) reader.f3212b).i());
            case 9:
                long z6 = reader.z();
                while (true) {
                    int f7 = ((C1278a) reader.f3212b).f();
                    if (f7 == -1) {
                        reader.D(z6);
                        ofEpochSecond = Instant.ofEpochSecond(j2, i2);
                        kotlin.jvm.internal.i.d(ofEpochSecond, "ofEpochSecond(...)");
                        return ofEpochSecond;
                    }
                    if (f7 == 1) {
                        j2 = ((Number) c1280c.b(reader)).longValue();
                    } else if (f7 != 2) {
                        reader.O(f7);
                    } else {
                        i2 = ((Number) c1280c2.b(reader)).intValue();
                    }
                }
            case 10:
                kotlin.jvm.internal.i.e(reader, "reader");
                return Integer.valueOf(((C1278a) reader.f3212b).l());
            case 11:
                kotlin.jvm.internal.i.e(reader, "reader");
                return Long.valueOf(((C1278a) reader.f3212b).m());
            case 12:
                int l6 = ((C1278a) reader.f3212b).l();
                return Integer.valueOf((-(l6 & 1)) ^ (l6 >>> 1));
            case 13:
                long m6 = ((C1278a) reader.f3212b).m();
                return Long.valueOf((-(m6 & 1)) ^ (m6 >>> 1));
            case 14:
                kotlin.jvm.internal.i.e(reader, "reader");
                return ((C1278a) reader.f3212b).j();
            case 15:
                kotlin.jvm.internal.i.e(reader, "reader");
                ArrayList arrayList = new ArrayList();
                long z7 = reader.z();
                while (true) {
                    C1278a c1278a2 = (C1278a) reader.f3212b;
                    int f8 = c1278a2.f();
                    if (f8 == -1) {
                        reader.D(z7);
                        return arrayList;
                    }
                    if (f8 != 1) {
                        c1278a2.n();
                    } else {
                        arrayList.add(c1280c3.b(reader));
                    }
                }
            case 16:
                kotlin.jvm.internal.i.e(reader, "reader");
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                long z8 = reader.z();
                while (true) {
                    C1278a c1278a3 = (C1278a) reader.f3212b;
                    int f9 = c1278a3.f();
                    if (f9 == -1) {
                        reader.D(z8);
                        return linkedHashMap;
                    }
                    if (f9 != 1) {
                        c1278a3.n();
                    } else {
                        long z9 = reader.z();
                        Object obj2 = obj;
                        Object obj3 = obj2;
                        while (true) {
                            int f10 = c1278a3.f();
                            if (f10 == -1) {
                                reader.D(z9);
                                if (obj2 != null) {
                                    linkedHashMap.put(obj2, obj3);
                                }
                            } else if (f10 == 1) {
                                obj2 = c1280c4.b(reader);
                            } else if (f10 != 2) {
                                reader.O(f10);
                            } else {
                                obj3 = c1280c3.b(reader);
                            }
                        }
                    }
                    obj = null;
                }
            case 17:
                kotlin.jvm.internal.i.e(reader, "reader");
                int l7 = ((C1278a) reader.f3212b).l();
                if (l7 == 0) {
                    return null;
                }
                throw new IOException(AbstractC0279e.d(l7, "expected 0 but was "));
            case 18:
                kotlin.jvm.internal.i.e(reader, "reader");
                long z10 = reader.z();
                while (true) {
                    Object obj4 = null;
                    while (true) {
                        C1278a c1278a4 = (C1278a) reader.f3212b;
                        int f11 = c1278a4.f();
                        if (f11 == -1) {
                            reader.D(z10);
                            return obj4;
                        }
                        switch (f11) {
                            case 1:
                                break;
                            case 2:
                                obj4 = AbstractC1286i.f11170m.b(reader);
                                break;
                            case 3:
                                obj4 = c1280c4.b(reader);
                                break;
                            case 4:
                                obj4 = AbstractC1286i.f11163f.b(reader);
                                break;
                            case 5:
                                obj4 = AbstractC1286i.f11173p.b(reader);
                                break;
                            case 6:
                                obj4 = AbstractC1286i.f11174q.b(reader);
                                break;
                            default:
                                c1278a4.n();
                                break;
                        }
                    }
                    AbstractC1286i.f11175r.b(reader);
                }
                break;
            case C0793l9.f8681C /* 19 */:
                kotlin.jvm.internal.i.e(reader, "reader");
                return Integer.valueOf(((C1278a) reader.f3212b).l());
            default:
                return Long.valueOf(((C1278a) reader.f3212b).m());
        }
    }

    @Override // m2.AbstractC1286i
    public final Object c(C1278a reader) {
        Duration ofSeconds;
        Instant ofEpochSecond;
        C1280c c1280c = AbstractC1286i.f11167j;
        C1280c c1280c2 = AbstractC1286i.f11164g;
        long j2 = 0;
        C1280c c1280c3 = AbstractC1286i.f11176s;
        C1280c c1280c4 = AbstractC1286i.f11172o;
        int i2 = 0;
        int i3 = 0;
        switch (this.f11150t) {
            case 0:
                kotlin.jvm.internal.i.e(reader, "reader");
                return Double.valueOf(Double.longBitsToDouble(reader.i()));
            case 1:
                kotlin.jvm.internal.i.e(reader, "reader");
                return Float.valueOf(Float.intBitsToFloat(reader.h()));
            case 2:
                kotlin.jvm.internal.i.e(reader, "reader");
                throw new IllegalStateException("Operation not supported.");
            case 3:
                kotlin.jvm.internal.i.e(reader, "reader");
                return Boolean.valueOf(reader.l() != 0);
            case 4:
                kotlin.jvm.internal.i.e(reader, "reader");
                int b6 = reader.b();
                int i6 = reader.f11139b;
                int i7 = i6 + b6;
                if (i7 > reader.f11140c) {
                    throw new EOFException();
                }
                j5.i iVar = j5.i.f10496d;
                j5.i l2 = l1.j.l(reader.f11138a, i6, b6);
                reader.f11139b = i7;
                return l2;
            case 5:
                kotlin.jvm.internal.i.e(reader, "reader");
                int c2 = reader.c();
                while (true) {
                    int f3 = reader.f();
                    if (f3 == -1) {
                        reader.d(c2);
                        ofSeconds = Duration.ofSeconds(j2, i3);
                        kotlin.jvm.internal.i.d(ofSeconds, "ofSeconds(...)");
                        return ofSeconds;
                    }
                    if (f3 == 1) {
                        j2 = ((Number) c1280c.c(reader)).longValue();
                    } else if (f3 != 2) {
                        reader.k(f3);
                    } else {
                        i3 = ((Number) c1280c2.c(reader)).intValue();
                    }
                }
            case 6:
                kotlin.jvm.internal.i.e(reader, "reader");
                int c6 = reader.c();
                while (true) {
                    int f6 = reader.f();
                    if (f6 == -1) {
                        reader.d(c6);
                        return v.f5689a;
                    }
                    reader.k(f6);
                }
            case 7:
                kotlin.jvm.internal.i.e(reader, "reader");
                return Integer.valueOf(reader.h());
            case 8:
                kotlin.jvm.internal.i.e(reader, "reader");
                return Long.valueOf(reader.i());
            case 9:
                kotlin.jvm.internal.i.e(reader, "reader");
                int c7 = reader.c();
                while (true) {
                    int f7 = reader.f();
                    if (f7 == -1) {
                        reader.d(c7);
                        ofEpochSecond = Instant.ofEpochSecond(j2, i2);
                        kotlin.jvm.internal.i.d(ofEpochSecond, "ofEpochSecond(...)");
                        return ofEpochSecond;
                    }
                    if (f7 == 1) {
                        j2 = ((Number) c1280c.c(reader)).longValue();
                    } else if (f7 != 2) {
                        reader.k(f7);
                    } else {
                        i2 = ((Number) c1280c2.c(reader)).intValue();
                    }
                }
            case 10:
                kotlin.jvm.internal.i.e(reader, "reader");
                return Integer.valueOf(reader.l());
            case 11:
                kotlin.jvm.internal.i.e(reader, "reader");
                return Long.valueOf(reader.m());
            case 12:
                kotlin.jvm.internal.i.e(reader, "reader");
                int l6 = reader.l();
                return Integer.valueOf((-(l6 & 1)) ^ (l6 >>> 1));
            case 13:
                kotlin.jvm.internal.i.e(reader, "reader");
                long m6 = reader.m();
                return Long.valueOf((-(m6 & 1)) ^ (m6 >>> 1));
            case 14:
                kotlin.jvm.internal.i.e(reader, "reader");
                return reader.j();
            case 15:
                kotlin.jvm.internal.i.e(reader, "reader");
                ArrayList arrayList = new ArrayList();
                int c8 = reader.c();
                while (true) {
                    int f8 = reader.f();
                    if (f8 == -1) {
                        reader.d(c8);
                        return arrayList;
                    }
                    if (f8 != 1) {
                        reader.n();
                    } else {
                        arrayList.add(c1280c3.c(reader));
                    }
                }
            case 16:
                kotlin.jvm.internal.i.e(reader, "reader");
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                int c9 = reader.c();
                while (true) {
                    int f9 = reader.f();
                    if (f9 == -1) {
                        reader.d(c9);
                        return linkedHashMap;
                    }
                    if (f9 != 1) {
                        reader.n();
                    } else {
                        int c10 = reader.c();
                        String str = null;
                        Object obj = null;
                        while (true) {
                            int f10 = reader.f();
                            if (f10 == -1) {
                                reader.d(c10);
                                if (str != null) {
                                    linkedHashMap.put(str, obj);
                                }
                            } else if (f10 == 1) {
                                c1280c4.getClass();
                                str = reader.j();
                            } else if (f10 != 2) {
                                reader.k(f10);
                            } else {
                                obj = c1280c3.c(reader);
                            }
                        }
                    }
                }
            case 17:
                kotlin.jvm.internal.i.e(reader, "reader");
                int l7 = reader.l();
                if (l7 == 0) {
                    return null;
                }
                throw new IOException(AbstractC0279e.d(l7, "expected 0 but was "));
            case 18:
                kotlin.jvm.internal.i.e(reader, "reader");
                int c11 = reader.c();
                while (true) {
                    Object obj2 = null;
                    while (true) {
                        int f11 = reader.f();
                        if (f11 == -1) {
                            reader.d(c11);
                            return obj2;
                        }
                        switch (f11) {
                            case 1:
                                break;
                            case 2:
                                obj2 = AbstractC1286i.f11170m.c(reader);
                                break;
                            case 3:
                                c1280c4.getClass();
                                obj2 = reader.j();
                                break;
                            case 4:
                                obj2 = AbstractC1286i.f11163f.c(reader);
                                break;
                            case 5:
                                obj2 = AbstractC1286i.f11173p.c(reader);
                                break;
                            case 6:
                                obj2 = AbstractC1286i.f11174q.c(reader);
                                break;
                            default:
                                reader.n();
                                break;
                        }
                    }
                    AbstractC1286i.f11175r.c(reader);
                }
                break;
            case C0793l9.f8681C /* 19 */:
                kotlin.jvm.internal.i.e(reader, "reader");
                return Integer.valueOf(reader.l());
            default:
                kotlin.jvm.internal.i.e(reader, "reader");
                return Long.valueOf(reader.m());
        }
    }

    @Override // m2.AbstractC1286i
    public final void d(U.e writer, Object obj) {
        long epochSecond;
        int nano;
        switch (this.f11150t) {
            case 0:
                double doubleValue = ((Number) obj).doubleValue();
                kotlin.jvm.internal.i.e(writer, "writer");
                ((j5.g) writer.f3053a).i(Double.doubleToLongBits(doubleValue));
                return;
            case 1:
                float floatValue = ((Number) obj).floatValue();
                kotlin.jvm.internal.i.e(writer, "writer");
                ((j5.g) writer.f3053a).m(Float.floatToIntBits(floatValue));
                return;
            case 2:
                kotlin.jvm.internal.i.e(writer, "writer");
                kotlin.jvm.internal.i.e((Void) obj, "value");
                throw new IllegalStateException("Operation not supported.");
            case 3:
                boolean booleanValue = ((Boolean) obj).booleanValue();
                kotlin.jvm.internal.i.e(writer, "writer");
                writer.F(booleanValue ? 1 : 0);
                return;
            case 4:
                j5.i value = (j5.i) obj;
                kotlin.jvm.internal.i.e(writer, "writer");
                kotlin.jvm.internal.i.e(value, "value");
                writer.D(value);
                return;
            case 5:
                Duration value2 = l1.e.r(obj);
                kotlin.jvm.internal.i.e(writer, "writer");
                kotlin.jvm.internal.i.e(value2, "value");
                long i2 = i(value2);
                if (i2 != 0) {
                    AbstractC1286i.f11167j.e(writer, 1, Long.valueOf(i2));
                }
                int h3 = h(value2);
                if (h3 != 0) {
                    AbstractC1286i.f11164g.e(writer, 2, Integer.valueOf(h3));
                    return;
                }
                return;
            case 6:
                kotlin.jvm.internal.i.e(writer, "writer");
                kotlin.jvm.internal.i.e((v) obj, "value");
                return;
            case 7:
                int intValue = ((Number) obj).intValue();
                kotlin.jvm.internal.i.e(writer, "writer");
                ((j5.g) writer.f3053a).m(intValue);
                return;
            case 8:
                long longValue = ((Number) obj).longValue();
                kotlin.jvm.internal.i.e(writer, "writer");
                ((j5.g) writer.f3053a).i(longValue);
                return;
            case 9:
                Instant value3 = l1.e.t(obj);
                kotlin.jvm.internal.i.e(writer, "writer");
                kotlin.jvm.internal.i.e(value3, "value");
                epochSecond = value3.getEpochSecond();
                if (epochSecond != 0) {
                    AbstractC1286i.f11167j.e(writer, 1, Long.valueOf(epochSecond));
                }
                nano = value3.getNano();
                if (nano != 0) {
                    AbstractC1286i.f11164g.e(writer, 2, Integer.valueOf(nano));
                    return;
                }
                return;
            case 10:
                int intValue2 = ((Number) obj).intValue();
                kotlin.jvm.internal.i.e(writer, "writer");
                if (intValue2 >= 0) {
                    writer.F(intValue2);
                    return;
                } else {
                    writer.G(intValue2);
                    return;
                }
            case 11:
                long longValue2 = ((Number) obj).longValue();
                kotlin.jvm.internal.i.e(writer, "writer");
                writer.G(longValue2);
                return;
            case 12:
                int intValue3 = ((Number) obj).intValue();
                kotlin.jvm.internal.i.e(writer, "writer");
                writer.F((intValue3 >> 31) ^ (intValue3 << 1));
                return;
            case 13:
                long longValue3 = ((Number) obj).longValue();
                kotlin.jvm.internal.i.e(writer, "writer");
                writer.G((longValue3 >> 63) ^ (longValue3 << 1));
                return;
            case 14:
                String value4 = (String) obj;
                kotlin.jvm.internal.i.e(writer, "writer");
                kotlin.jvm.internal.i.e(value4, "value");
                ((j5.g) writer.f3053a).x(value4);
                return;
            case 15:
                List list = (List) obj;
                kotlin.jvm.internal.i.e(writer, "writer");
                if (list == null) {
                    return;
                }
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    AbstractC1286i.f11176s.e(writer, 1, it.next());
                }
                return;
            case 16:
                Map map = (Map) obj;
                kotlin.jvm.internal.i.e(writer, "writer");
                if (map == null) {
                    return;
                }
                for (Map.Entry entry : map.entrySet()) {
                    String str = (String) entry.getKey();
                    Object value5 = entry.getValue();
                    C1280c c1280c = AbstractC1286i.f11172o;
                    int g6 = c1280c.g(1, str);
                    C1280c c1280c2 = AbstractC1286i.f11176s;
                    int g7 = c1280c2.g(2, value5) + g6;
                    writer.E(1, EnumC1281d.f11153d);
                    writer.F(g7);
                    c1280c.e(writer, 1, str);
                    c1280c2.e(writer, 2, value5);
                }
                return;
            case 17:
                kotlin.jvm.internal.i.e(writer, "writer");
                writer.F(0);
                return;
            case 18:
                kotlin.jvm.internal.i.e(writer, "writer");
                if (obj == null) {
                    AbstractC1286i.f11175r.e(writer, 1, obj);
                    return;
                }
                if (obj instanceof Number) {
                    AbstractC1286i.f11170m.e(writer, 2, Double.valueOf(((Number) obj).doubleValue()));
                    return;
                }
                if (obj instanceof String) {
                    AbstractC1286i.f11172o.e(writer, 3, obj);
                    return;
                }
                if (obj instanceof Boolean) {
                    AbstractC1286i.f11163f.e(writer, 4, obj);
                    return;
                }
                if (obj instanceof Map) {
                    AbstractC1286i.f11173p.e(writer, 5, (Map) obj);
                    return;
                } else {
                    if (!(obj instanceof List)) {
                        throw new IllegalArgumentException("unexpected struct value: " + obj);
                    }
                    AbstractC1286i.f11174q.e(writer, 6, obj);
                    return;
                }
            case C0793l9.f8681C /* 19 */:
                int intValue4 = ((Number) obj).intValue();
                kotlin.jvm.internal.i.e(writer, "writer");
                writer.F(intValue4);
                return;
            default:
                long longValue4 = ((Number) obj).longValue();
                kotlin.jvm.internal.i.e(writer, "writer");
                writer.G(longValue4);
                return;
        }
    }

    @Override // m2.AbstractC1286i
    public void e(U.e writer, int i2, Object obj) {
        switch (this.f11150t) {
            case 17:
                kotlin.jvm.internal.i.e(writer, "writer");
                writer.E(i2, this.f11177a);
                writer.F(0);
                break;
            case 18:
                kotlin.jvm.internal.i.e(writer, "writer");
                if (obj != null) {
                    super.e(writer, i2, obj);
                    break;
                } else {
                    writer.E(i2, this.f11177a);
                    writer.F(f(obj));
                    d(writer, obj);
                    break;
                }
            default:
                super.e(writer, i2, obj);
                break;
        }
    }

    @Override // m2.AbstractC1286i
    public final int f(Object obj) {
        long epochSecond;
        int nano;
        C1280c c1280c = AbstractC1286i.f11164g;
        C1280c c1280c2 = AbstractC1286i.f11167j;
        C1280c c1280c3 = AbstractC1286i.f11176s;
        C1280c c1280c4 = AbstractC1286i.f11172o;
        switch (this.f11150t) {
            case 0:
                ((Number) obj).doubleValue();
                return 8;
            case 1:
                ((Number) obj).floatValue();
                return 4;
            case 2:
                kotlin.jvm.internal.i.e((Void) obj, "value");
                throw new IllegalStateException("Operation not supported.");
            case 3:
                ((Boolean) obj).getClass();
                return 1;
            case 4:
                j5.i value = (j5.i) obj;
                kotlin.jvm.internal.i.e(value, "value");
                return value.a();
            case 5:
                Duration value2 = l1.e.r(obj);
                kotlin.jvm.internal.i.e(value2, "value");
                long i2 = i(value2);
                int g6 = i2 != 0 ? c1280c2.g(1, Long.valueOf(i2)) : 0;
                int h3 = h(value2);
                return h3 != 0 ? g6 + c1280c.g(2, Integer.valueOf(h3)) : g6;
            case 6:
                kotlin.jvm.internal.i.e((v) obj, "value");
                return 0;
            case 7:
                ((Number) obj).intValue();
                return 4;
            case 8:
                ((Number) obj).longValue();
                return 8;
            case 9:
                Instant value3 = l1.e.t(obj);
                kotlin.jvm.internal.i.e(value3, "value");
                epochSecond = value3.getEpochSecond();
                int g7 = epochSecond != 0 ? c1280c2.g(1, Long.valueOf(epochSecond)) : 0;
                nano = value3.getNano();
                return nano != 0 ? g7 + c1280c.g(2, Integer.valueOf(nano)) : g7;
            case 10:
                int intValue = ((Number) obj).intValue();
                if (intValue < 0) {
                    return 10;
                }
                if ((intValue & (-128)) == 0) {
                    return 1;
                }
                if ((intValue & (-16384)) == 0) {
                    return 2;
                }
                if ((intValue & (-2097152)) == 0) {
                    return 3;
                }
                return (intValue & (-268435456)) == 0 ? 4 : 5;
            case 11:
                return K1.b.v0(((Number) obj).longValue());
            case 12:
                int intValue2 = ((Number) obj).intValue();
                int i3 = (intValue2 >> 31) ^ (intValue2 << 1);
                if ((i3 & (-128)) == 0) {
                    return 1;
                }
                if ((i3 & (-16384)) == 0) {
                    return 2;
                }
                if ((i3 & (-2097152)) == 0) {
                    return 3;
                }
                return (i3 & (-268435456)) == 0 ? 4 : 5;
            case 13:
                long longValue = ((Number) obj).longValue();
                return K1.b.v0((longValue >> 63) ^ (longValue << 1));
            case 14:
                String value4 = (String) obj;
                kotlin.jvm.internal.i.e(value4, "value");
                return (int) j5.b.f(value4);
            case 15:
                List list = (List) obj;
                if (list == null) {
                    return 0;
                }
                Iterator it = list.iterator();
                int i6 = 0;
                while (it.hasNext()) {
                    i6 = c1280c3.g(1, it.next()) + i6;
                }
                return i6;
            case 16:
                Map map = (Map) obj;
                if (map == null) {
                    return 0;
                }
                int i7 = 0;
                for (Map.Entry entry : map.entrySet()) {
                    int g8 = c1280c3.g(2, entry.getValue()) + c1280c4.g(1, (String) entry.getKey());
                    EnumC1281d enumC1281d = EnumC1281d.f11151b;
                    i7 = K1.b.u0(g8) + K1.b.u0(8) + g8 + i7;
                }
                return i7;
            case 17:
                return 1;
            case 18:
                if (obj == null) {
                    return AbstractC1286i.f11175r.g(1, obj);
                }
                if (obj instanceof Number) {
                    return AbstractC1286i.f11170m.g(2, Double.valueOf(((Number) obj).doubleValue()));
                }
                if (obj instanceof String) {
                    return c1280c4.g(3, obj);
                }
                if (obj instanceof Boolean) {
                    return AbstractC1286i.f11163f.g(4, obj);
                }
                if (obj instanceof Map) {
                    return AbstractC1286i.f11173p.g(5, (Map) obj);
                }
                if (obj instanceof List) {
                    return AbstractC1286i.f11174q.g(6, obj);
                }
                throw new IllegalArgumentException("unexpected struct value: " + obj);
            case C0793l9.f8681C /* 19 */:
                int intValue3 = ((Number) obj).intValue();
                if ((intValue3 & (-128)) == 0) {
                    return 1;
                }
                if ((intValue3 & (-16384)) == 0) {
                    return 2;
                }
                if ((intValue3 & (-2097152)) == 0) {
                    return 3;
                }
                return (intValue3 & (-268435456)) == 0 ? 4 : 5;
            default:
                return K1.b.v0(((Number) obj).longValue());
        }
    }

    @Override // m2.AbstractC1286i
    public int g(int i2, Object obj) {
        switch (this.f11150t) {
            case 17:
                EnumC1281d enumC1281d = EnumC1281d.f11151b;
                break;
            case 18:
                if (obj != null) {
                    break;
                } else {
                    int f3 = f(obj);
                    EnumC1281d enumC1281d2 = EnumC1281d.f11151b;
                    break;
                }
        }
        return super.g(i2, obj);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1280c() {
        super(EnumC1281d.f11153d, t.a(Void.class), EnumC1289l.f11190b, null);
        this.f11150t = 2;
    }
}
