package dev.fluttercommunity.workmanager.pigeon;

import androidx.media3.extractor.ts.TsExtractor;
import io.flutter.plugin.common.StandardMessageCodec;
import java.io.ByteArrayOutputStream;
import java.nio.ByteBuffer;
import java.util.List;
import java.util.Map;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class n extends StandardMessageCodec {
    @Override // io.flutter.plugin.common.StandardMessageCodec
    public final Object readValueOfType(byte b, ByteBuffer buffer) {
        Intrinsics.checkNotNullParameter(buffer, "buffer");
        int i = 0;
        if (b == -127) {
            Long l = (Long) readValue(buffer);
            if (l != null) {
                int longValue = (int) l.longValue();
                m.Companion.getClass();
                m[] values = m.values();
                int length = values.length;
                while (i < length) {
                    m mVar = values[i];
                    if (mVar.a == longValue) {
                        return mVar;
                    }
                    i++;
                }
            }
        } else if (b == -126) {
            Long l2 = (Long) readValue(buffer);
            if (l2 != null) {
                int longValue2 = (int) l2.longValue();
                h.Companion.getClass();
                h[] values2 = h.values();
                int length2 = values2.length;
                while (i < length2) {
                    h hVar = values2[i];
                    if (hVar.a == longValue2) {
                        return hVar;
                    }
                    i++;
                }
            }
        } else if (b == -125) {
            Long l3 = (Long) readValue(buffer);
            if (l3 != null) {
                int longValue3 = (int) l3.longValue();
                EnumC0980a.Companion.getClass();
                EnumC0980a[] values3 = EnumC0980a.values();
                int length3 = values3.length;
                while (i < length3) {
                    EnumC0980a enumC0980a = values3[i];
                    if (enumC0980a.a == longValue3) {
                        return enumC0980a;
                    }
                    i++;
                }
            }
        } else if (b == -124) {
            Long l4 = (Long) readValue(buffer);
            if (l4 != null) {
                int longValue4 = (int) l4.longValue();
                e.Companion.getClass();
                e[] values4 = e.values();
                int length4 = values4.length;
                while (i < length4) {
                    e eVar = values4[i];
                    if (eVar.a == longValue4) {
                        return eVar;
                    }
                    i++;
                }
            }
        } else if (b == -123) {
            Long l5 = (Long) readValue(buffer);
            if (l5 != null) {
                int longValue5 = (int) l5.longValue();
                d.Companion.getClass();
                d[] values5 = d.values();
                int length5 = values5.length;
                while (i < length5) {
                    d dVar = values5[i];
                    if (dVar.a == longValue5) {
                        return dVar;
                    }
                    i++;
                }
            }
        } else if (b == -122) {
            Long l6 = (Long) readValue(buffer);
            if (l6 != null) {
                int longValue6 = (int) l6.longValue();
                j.Companion.getClass();
                j[] values6 = j.values();
                int length6 = values6.length;
                while (i < length6) {
                    j jVar = values6[i];
                    if (jVar.a == longValue6) {
                        return jVar;
                    }
                    i++;
                }
            }
        } else if (b == -121) {
            Object readValue = readValue(buffer);
            List pigeonVar_list = readValue instanceof List ? (List) readValue : null;
            if (pigeonVar_list != null) {
                c.Companion.getClass();
                Intrinsics.checkNotNullParameter(pigeonVar_list, "pigeonVar_list");
                return new c((h) pigeonVar_list.get(0), (Boolean) pigeonVar_list.get(1), (Boolean) pigeonVar_list.get(2), (Boolean) pigeonVar_list.get(3), (Boolean) pigeonVar_list.get(4));
            }
        } else if (b == -120) {
            Object readValue2 = readValue(buffer);
            List pigeonVar_list2 = readValue2 instanceof List ? (List) readValue2 : null;
            if (pigeonVar_list2 != null) {
                C0981b.Companion.getClass();
                Intrinsics.checkNotNullParameter(pigeonVar_list2, "pigeonVar_list");
                return new C0981b((EnumC0980a) pigeonVar_list2.get(0), (Long) pigeonVar_list2.get(1));
            }
        } else {
            if (b != -119) {
                if (b == -118) {
                    Object readValue3 = readValue(buffer);
                    List pigeonVar_list3 = readValue3 instanceof List ? (List) readValue3 : null;
                    if (pigeonVar_list3 == null) {
                        return null;
                    }
                    i.Companion.getClass();
                    Intrinsics.checkNotNullParameter(pigeonVar_list3, "pigeonVar_list");
                    Object obj = pigeonVar_list3.get(0);
                    Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlin.String");
                    String str = (String) obj;
                    Object obj2 = pigeonVar_list3.get(1);
                    Intrinsics.checkNotNull(obj2, "null cannot be cast to non-null type kotlin.String");
                    return new i(str, (String) obj2, (Map) pigeonVar_list3.get(2), (Long) pigeonVar_list3.get(3), (c) pigeonVar_list3.get(4), (C0981b) pigeonVar_list3.get(5), (String) pigeonVar_list3.get(6), (e) pigeonVar_list3.get(7), (j) pigeonVar_list3.get(8));
                }
                if (b != -117) {
                    if (b != -116) {
                        return super.readValueOfType(b, buffer);
                    }
                    Object readValue4 = readValue(buffer);
                    List pigeonVar_list4 = readValue4 instanceof List ? (List) readValue4 : null;
                    if (pigeonVar_list4 == null) {
                        return null;
                    }
                    l.Companion.getClass();
                    Intrinsics.checkNotNullParameter(pigeonVar_list4, "pigeonVar_list");
                    Object obj3 = pigeonVar_list4.get(0);
                    Intrinsics.checkNotNull(obj3, "null cannot be cast to non-null type kotlin.String");
                    String str2 = (String) obj3;
                    Object obj4 = pigeonVar_list4.get(1);
                    Intrinsics.checkNotNull(obj4, "null cannot be cast to non-null type kotlin.String");
                    return new l(str2, (String) obj4, (Map) pigeonVar_list4.get(2), (Long) pigeonVar_list4.get(3), (h) pigeonVar_list4.get(4), (Boolean) pigeonVar_list4.get(5));
                }
                Object readValue5 = readValue(buffer);
                List pigeonVar_list5 = readValue5 instanceof List ? (List) readValue5 : null;
                if (pigeonVar_list5 == null) {
                    return null;
                }
                k.Companion.getClass();
                Intrinsics.checkNotNullParameter(pigeonVar_list5, "pigeonVar_list");
                Object obj5 = pigeonVar_list5.get(0);
                Intrinsics.checkNotNull(obj5, "null cannot be cast to non-null type kotlin.String");
                String str3 = (String) obj5;
                Object obj6 = pigeonVar_list5.get(1);
                Intrinsics.checkNotNull(obj6, "null cannot be cast to non-null type kotlin.String");
                String str4 = (String) obj6;
                Object obj7 = pigeonVar_list5.get(2);
                Intrinsics.checkNotNull(obj7, "null cannot be cast to non-null type kotlin.Long");
                return new k(str3, str4, ((Long) obj7).longValue(), (Long) pigeonVar_list5.get(3), (Map) pigeonVar_list5.get(4), (Long) pigeonVar_list5.get(5), (c) pigeonVar_list5.get(6), (C0981b) pigeonVar_list5.get(7), (String) pigeonVar_list5.get(8), (d) pigeonVar_list5.get(9));
            }
            Object readValue6 = readValue(buffer);
            List pigeonVar_list6 = readValue6 instanceof List ? (List) readValue6 : null;
            if (pigeonVar_list6 != null) {
                g.Companion.getClass();
                Intrinsics.checkNotNullParameter(pigeonVar_list6, "pigeonVar_list");
                Object obj8 = pigeonVar_list6.get(0);
                Intrinsics.checkNotNull(obj8, "null cannot be cast to non-null type kotlin.Long");
                return new g(((Long) obj8).longValue());
            }
        }
        return null;
    }

    @Override // io.flutter.plugin.common.StandardMessageCodec
    public final void writeValue(ByteArrayOutputStream stream, Object obj) {
        Intrinsics.checkNotNullParameter(stream, "stream");
        if (obj instanceof m) {
            stream.write(129);
            writeValue(stream, Integer.valueOf(((m) obj).a));
            return;
        }
        if (obj instanceof h) {
            stream.write(130);
            writeValue(stream, Integer.valueOf(((h) obj).a));
            return;
        }
        if (obj instanceof EnumC0980a) {
            stream.write(131);
            writeValue(stream, Integer.valueOf(((EnumC0980a) obj).a));
            return;
        }
        if (obj instanceof e) {
            stream.write(132);
            writeValue(stream, Integer.valueOf(((e) obj).a));
            return;
        }
        if (obj instanceof d) {
            stream.write(133);
            writeValue(stream, Integer.valueOf(((d) obj).a));
            return;
        }
        if (obj instanceof j) {
            stream.write(134);
            writeValue(stream, Integer.valueOf(((j) obj).a));
            return;
        }
        if (obj instanceof c) {
            stream.write(135);
            writeValue(stream, ((c) obj).a());
            return;
        }
        if (obj instanceof C0981b) {
            stream.write(TsExtractor.TS_STREAM_TYPE_DTS_HD);
            C0981b c0981b = (C0981b) obj;
            writeValue(stream, CollectionsKt.listOf(c0981b.a, c0981b.b));
            return;
        }
        if (obj instanceof g) {
            stream.write(137);
            writeValue(stream, CollectionsKt.listOf(Long.valueOf(((g) obj).a)));
            return;
        }
        if (obj instanceof i) {
            stream.write(138);
            writeValue(stream, ((i) obj).a());
        } else if (obj instanceof k) {
            stream.write(TsExtractor.TS_STREAM_TYPE_DTS_UHD);
            writeValue(stream, ((k) obj).a());
        } else if (!(obj instanceof l)) {
            super.writeValue(stream, obj);
        } else {
            stream.write(140);
            writeValue(stream, ((l) obj).a());
        }
    }
}
