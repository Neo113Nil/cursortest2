package WZ;

import Sc.InterfaceC3999a;
import WZ.s;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Pair;
import kotlin.collections.C7714v;
import kotlin.collections.U;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.tokenized.model.TokenizedTrackingInfo;

/* loaded from: classes7.dex */
public final class x {
    @InterfaceC3999a
    private static final s a(TokenizedTrackingInfo tokenizedTrackingInfo, Long l11, String str) {
        s.a aVar = new s.a();
        if (str == null) {
            str = tokenizedTrackingInfo.getActionType();
        }
        aVar.a(str);
        aVar.c(tokenizedTrackingInfo.getKey());
        aVar.e(tokenizedTrackingInfo.getFastEvent());
        String sliceKey = tokenizedTrackingInfo.getSliceKey();
        if (sliceKey != null) {
            aVar.h(sliceKey);
        }
        if (l11 != null) {
            aVar.k(l11.longValue());
        }
        Map<String, String> custom = tokenizedTrackingInfo.getCustom();
        if (custom != null) {
            aVar.d(custom);
        }
        return aVar.b();
    }

    @InterfaceC3999a
    @NotNull
    public static final t b(@NotNull Map<String, TokenizedTrackingInfo> map, Long l11, String str) {
        t tVar;
        Intrinsics.checkNotNullParameter(map, "<this>");
        if (map.entrySet().isEmpty()) {
            tVar = t.f33400b;
            return tVar;
        }
        Set<Map.Entry<String, TokenizedTrackingInfo>> entrySet = map.entrySet();
        int h11 = U.h(C7714v.z(entrySet, 10));
        if (h11 < 16) {
            h11 = 16;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(h11);
        Iterator<T> it = entrySet.iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            String type = (String) entry.getKey();
            Intrinsics.checkNotNullParameter(type, "type");
            YZ.a a11 = YZ.a.a(type);
            Tc.b builder = C7714v.B();
            builder.add(a((TokenizedTrackingInfo) entry.getValue(), l11, str));
            List<TokenizedTrackingInfo> nested = ((TokenizedTrackingInfo) entry.getValue()).getNested();
            if (nested != null) {
                Iterator<T> it2 = nested.iterator();
                while (it2.hasNext()) {
                    builder.add(a((TokenizedTrackingInfo) it2.next(), l11, str));
                }
            }
            Intrinsics.checkNotNullParameter(builder, "builder");
            Pair pair = new Pair(a11, builder.B());
            linkedHashMap.put(pair.e(), pair.f());
        }
        return new t(linkedHashMap);
    }

    public static t c(Map map) {
        t tVar;
        Intrinsics.checkNotNullParameter(map, "<this>");
        v tokenizedDataBuilder = v.f33403b;
        Intrinsics.checkNotNullParameter(tokenizedDataBuilder, "tokenizedDataBuilder");
        if (map.entrySet().isEmpty()) {
            tVar = t.f33400b;
            return tVar;
        }
        Set<Map.Entry> entrySet = map.entrySet();
        int h11 = U.h(C7714v.z(entrySet, 10));
        if (h11 < 16) {
            h11 = 16;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(h11);
        for (Map.Entry entry : entrySet) {
            String type = (String) entry.getKey();
            Intrinsics.checkNotNullParameter(type, "type");
            YZ.a a11 = YZ.a.a(type);
            Tc.b builder = C7714v.B();
            TokenizedTrackingInfo tokenizedTrackingInfo = (TokenizedTrackingInfo) entry.getValue();
            s.a aVar = new s.a();
            aVar.a(tokenizedTrackingInfo.getActionType());
            aVar.c(tokenizedTrackingInfo.getKey());
            aVar.e(tokenizedTrackingInfo.getFastEvent());
            String sliceKey = tokenizedTrackingInfo.getSliceKey();
            if (sliceKey != null) {
                aVar.h(sliceKey);
            }
            Map<String, String> custom = tokenizedTrackingInfo.getCustom();
            if (custom != null) {
                aVar.d(custom);
            }
            tokenizedDataBuilder.invoke(aVar);
            builder.add(aVar.b());
            List<TokenizedTrackingInfo> nested = ((TokenizedTrackingInfo) entry.getValue()).getNested();
            if (nested != null) {
                for (TokenizedTrackingInfo tokenizedTrackingInfo2 : nested) {
                    s.a aVar2 = new s.a();
                    aVar2.a(tokenizedTrackingInfo2.getActionType());
                    aVar2.c(tokenizedTrackingInfo2.getKey());
                    aVar2.e(tokenizedTrackingInfo2.getFastEvent());
                    String sliceKey2 = tokenizedTrackingInfo2.getSliceKey();
                    if (sliceKey2 != null) {
                        aVar2.h(sliceKey2);
                    }
                    Map<String, String> custom2 = tokenizedTrackingInfo2.getCustom();
                    if (custom2 != null) {
                        aVar2.d(custom2);
                    }
                    tokenizedDataBuilder.invoke(aVar2);
                    builder.add(aVar2.b());
                }
            }
            Intrinsics.checkNotNullParameter(builder, "builder");
            linkedHashMap.put(a11, builder.B());
        }
        return new t(linkedHashMap);
    }

    public static t d(Map map, l20.d widgetInfo) {
        s b11;
        T00.l lVar;
        Map<String, String> a11;
        s b12;
        T00.l lVar2;
        Map<String, String> a12;
        t tVar;
        Intrinsics.checkNotNullParameter(map, "<this>");
        Intrinsics.checkNotNullParameter(widgetInfo, "widgetInfo");
        w tokenizedDataBuilder = new w();
        Intrinsics.checkNotNullParameter(map, "<this>");
        Intrinsics.checkNotNullParameter(widgetInfo, "widgetInfo");
        Intrinsics.checkNotNullParameter(tokenizedDataBuilder, "tokenizedDataBuilder");
        if (!widgetInfo.c().n()) {
            return null;
        }
        if (map.entrySet().isEmpty()) {
            tVar = t.f33400b;
            return tVar;
        }
        Set<Map.Entry> entrySet = map.entrySet();
        int h11 = U.h(C7714v.z(entrySet, 10));
        if (h11 < 16) {
            h11 = 16;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(h11);
        for (Map.Entry entry : entrySet) {
            String type = (String) entry.getKey();
            Intrinsics.checkNotNullParameter(type, "type");
            YZ.a a13 = YZ.a.a(type);
            Tc.b builder = C7714v.B();
            TokenizedTrackingInfo tokenizedTrackingInfo = (TokenizedTrackingInfo) entry.getValue();
            if (widgetInfo.c().n()) {
                s.a aVar = new s.a();
                aVar.a(tokenizedTrackingInfo.getActionType());
                aVar.c(tokenizedTrackingInfo.getKey());
                aVar.e(tokenizedTrackingInfo.getFastEvent());
                String sliceKey = tokenizedTrackingInfo.getSliceKey();
                if (sliceKey != null) {
                    aVar.h(sliceKey);
                }
                Map<String, String> custom = tokenizedTrackingInfo.getCustom();
                if (custom != null) {
                    aVar.d(custom);
                }
                String j11 = widgetInfo.c().j();
                if (j11 != null) {
                    aVar.l(j11);
                }
                T00.a b13 = widgetInfo.b();
                if (b13 != null) {
                    String j12 = b13.j();
                    if (j12 != null) {
                        aVar.g(j12);
                    }
                    String n11 = b13.n();
                    if (n11 != null) {
                        aVar.j(n11);
                    }
                    aVar.f(b13.g().a());
                    Map<String, T00.l> m11 = b13.m();
                    if (m11 != null && (lVar = m11.get(widgetInfo.d())) != null && (a11 = lVar.a()) != null) {
                        aVar.i(a11);
                    }
                }
                tokenizedDataBuilder.invoke(aVar);
                b11 = aVar.b();
            } else {
                b11 = null;
            }
            if (b11 != null) {
                builder.add(b11);
            }
            List<TokenizedTrackingInfo> nested = ((TokenizedTrackingInfo) entry.getValue()).getNested();
            if (nested != null) {
                for (TokenizedTrackingInfo tokenizedTrackingInfo2 : nested) {
                    if (widgetInfo.c().n()) {
                        s.a aVar2 = new s.a();
                        aVar2.a(tokenizedTrackingInfo2.getActionType());
                        aVar2.c(tokenizedTrackingInfo2.getKey());
                        aVar2.e(tokenizedTrackingInfo2.getFastEvent());
                        String sliceKey2 = tokenizedTrackingInfo2.getSliceKey();
                        if (sliceKey2 != null) {
                            aVar2.h(sliceKey2);
                        }
                        Map<String, String> custom2 = tokenizedTrackingInfo2.getCustom();
                        if (custom2 != null) {
                            aVar2.d(custom2);
                        }
                        String j13 = widgetInfo.c().j();
                        if (j13 != null) {
                            aVar2.l(j13);
                        }
                        T00.a b14 = widgetInfo.b();
                        if (b14 != null) {
                            String j14 = b14.j();
                            if (j14 != null) {
                                aVar2.g(j14);
                            }
                            String n12 = b14.n();
                            if (n12 != null) {
                                aVar2.j(n12);
                            }
                            aVar2.f(b14.g().a());
                            Map<String, T00.l> m12 = b14.m();
                            if (m12 != null && (lVar2 = m12.get(widgetInfo.d())) != null && (a12 = lVar2.a()) != null) {
                                aVar2.i(a12);
                            }
                        }
                        tokenizedDataBuilder.invoke(aVar2);
                        b12 = aVar2.b();
                    } else {
                        b12 = null;
                    }
                    if (b12 != null) {
                        builder.add(b12);
                    }
                }
            }
            Intrinsics.checkNotNullParameter(builder, "builder");
            linkedHashMap.put(a13, builder.B());
        }
        return new t(linkedHashMap);
    }
}
