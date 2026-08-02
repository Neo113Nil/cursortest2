package G1;

import android.net.Uri;
import i4.InterfaceC2015a;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import o4.AbstractC2234l;

/* loaded from: classes.dex */
public final class t extends kotlin.jvm.internal.m implements InterfaceC2015a {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ int f1936l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ v f1937m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ t(v vVar, int i) {
        super(0);
        this.f1936l = i;
        this.f1937m = vVar;
    }

    /* JADX WARN: Type inference failed for: r0v16, types: [W3.e, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v2, types: [W3.e, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v22, types: [W3.e, java.lang.Object] */
    @Override // i4.InterfaceC2015a
    public final Object invoke() {
        List list;
        switch (this.f1936l) {
            case 0:
                W3.h hVar = (W3.h) this.f1937m.f1952h.getValue();
                return (hVar == null || (list = (List) hVar.f6036k) == null) ? new ArrayList() : list;
            case 1:
                String str = this.f1937m.f1946a;
                if (Uri.parse(str).getFragment() == null) {
                    return null;
                }
                ArrayList arrayList = new ArrayList();
                String fragment = Uri.parse(str).getFragment();
                StringBuilder sb = new StringBuilder();
                kotlin.jvm.internal.l.c(fragment);
                v.a(fragment, arrayList, sb);
                String sb2 = sb.toString();
                kotlin.jvm.internal.l.e("fragRegex.toString()", sb2);
                return new W3.h(arrayList, sb2);
            case 2:
                String str2 = (String) this.f1937m.f1953j.getValue();
                if (str2 != null) {
                    return Pattern.compile(str2, 2);
                }
                return null;
            case 3:
                W3.h hVar2 = (W3.h) this.f1937m.f1952h.getValue();
                if (hVar2 != null) {
                    return (String) hVar2.f6037l;
                }
                return null;
            case 4:
                String str3 = this.f1937m.f1946a;
                return Boolean.valueOf((str3 == null || Uri.parse(str3).getQuery() == null) ? false : true);
            case 5:
                this.f1937m.getClass();
                return null;
            case 6:
                String str4 = this.f1937m.f1948c;
                if (str4 != null) {
                    return Pattern.compile(str4, 2);
                }
                return null;
            default:
                v vVar = this.f1937m;
                vVar.getClass();
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                if (((Boolean) vVar.f1950e.getValue()).booleanValue()) {
                    String str5 = vVar.f1946a;
                    Uri parse = Uri.parse(str5);
                    for (String str6 : parse.getQueryParameterNames()) {
                        StringBuilder sb3 = new StringBuilder();
                        List<String> queryParameters = parse.getQueryParameters(str6);
                        if (queryParameters.size() > 1) {
                            throw new IllegalArgumentException(("Query parameter " + str6 + " must only be present once in " + str5 + ". To support repeated query parameters, use an array type for your argument and the pattern provided in your URI will be used to parse each query parameter instance.").toString());
                        }
                        String str7 = (String) X3.m.Z(queryParameters);
                        if (str7 == null) {
                            vVar.f1951g = true;
                            str7 = str6;
                        }
                        Matcher matcher = v.f1941n.matcher(str7);
                        s sVar = new s();
                        int i = 0;
                        while (matcher.find()) {
                            String group = matcher.group(1);
                            kotlin.jvm.internal.l.d("null cannot be cast to non-null type kotlin.String", group);
                            sVar.f1935b.add(group);
                            kotlin.jvm.internal.l.e("queryParam", str7);
                            String substring = str7.substring(i, matcher.start());
                            kotlin.jvm.internal.l.e("substring(...)", substring);
                            sb3.append(Pattern.quote(substring));
                            sb3.append("(.+?)?");
                            i = matcher.end();
                        }
                        if (i < str7.length()) {
                            String substring2 = str7.substring(i);
                            kotlin.jvm.internal.l.e("substring(...)", substring2);
                            sb3.append(Pattern.quote(substring2));
                        }
                        String sb4 = sb3.toString();
                        kotlin.jvm.internal.l.e("argRegex.toString()", sb4);
                        sVar.f1934a = AbstractC2234l.v0(sb4, v.f1943p, v.f1944q);
                        kotlin.jvm.internal.l.e("paramName", str6);
                        linkedHashMap.put(str6, sVar);
                    }
                }
                return linkedHashMap;
        }
    }
}
