package C20;

import Dj.EnumC2873a;
import Sc.r;
import Sc.s;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import java.util.ArrayList;
import java.util.List;
import kotlin.collections.K;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.h;
import org.jetbrains.annotations.NotNull;
import org.json.JSONArray;
import org.json.JSONObject;
import u20.InterfaceC9924a;

/* loaded from: classes3.dex */
public final class a {
    @NotNull
    public static D20.c a(@NotNull String jsonString) {
        Object a11;
        Intrinsics.checkNotNullParameter(jsonString, "jsonString");
        JSONObject jSONObject = new JSONObject(jsonString);
        try {
            r.Companion companion = r.INSTANCE;
            String string = jSONObject.getString("schema_version");
            Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
            a11 = new D20.c(string, b(jSONObject.optJSONArray("application")), b(jSONObject.optJSONArray("project_modules")), b(jSONObject.optJSONArray("libraries")));
        } catch (Throwable th2) {
            r.Companion companion2 = r.INSTANCE;
            a11 = s.a(th2);
        }
        Throwable b11 = r.b(a11);
        if (b11 != null) {
            InterfaceC9924a.f99762b.f(EnumC2873a.ERROR, "LocalizationDataParser: Ошибка при парсинге JSON", b11);
        }
        if (a11 instanceof r.b) {
            a11 = null;
        }
        D20.c cVar = (D20.c) a11;
        if (cVar != null) {
            return cVar;
        }
        InterfaceC9924a.C2197a c2197a = InterfaceC9924a.f99762b;
        c2197a.a("LocalizationDataParser: Пробуем достать версию схемы");
        String string2 = jSONObject.getString("schema_version");
        Intrinsics.checkNotNullExpressionValue(string2, "getString(...)");
        K k11 = K.f71697a;
        D20.c cVar2 = new D20.c(string2, k11, k11, k11);
        c2197a.e("LocalizationDataParser: Версия схемы: " + cVar2.d());
        return cVar2;
    }

    private static List b(JSONArray jSONArray) {
        List list;
        List list2;
        JSONArray jSONArray2;
        String str;
        JSONArray jSONArray3 = jSONArray;
        if (jSONArray3 == null) {
            return K.f71697a;
        }
        ArrayList arrayList = new ArrayList();
        int length = jSONArray3.length();
        int i11 = 0;
        while (i11 < length) {
            JSONObject jSONObject = jSONArray3.getJSONObject(i11);
            String string = jSONObject.getString("artifact");
            String str2 = "getString(...)";
            Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
            JSONArray optJSONArray = jSONObject.optJSONArray("locales");
            if (optJSONArray == null) {
                list = K.f71697a;
            } else {
                ArrayList arrayList2 = new ArrayList();
                int length2 = optJSONArray.length();
                int i12 = 0;
                while (i12 < length2) {
                    JSONObject jSONObject2 = optJSONArray.getJSONObject(i12);
                    String string2 = jSONObject2.getString("code");
                    Intrinsics.checkNotNullExpressionValue(string2, str2);
                    JSONArray optJSONArray2 = jSONObject2.optJSONArray("resources");
                    if (optJSONArray2 == null) {
                        list2 = K.f71697a;
                    } else {
                        ArrayList arrayList3 = new ArrayList();
                        int length3 = optJSONArray2.length();
                        int i13 = 0;
                        while (i13 < length3) {
                            int i14 = length;
                            JSONObject jSONObject3 = optJSONArray2.getJSONObject(i13);
                            int i15 = i13;
                            String string3 = jSONObject3.getString("key");
                            Intrinsics.checkNotNullExpressionValue(string3, str2);
                            int i16 = length3;
                            String string4 = jSONObject3.getString(AppMeasurementSdk.ConditionalUserProperty.VALUE);
                            Intrinsics.checkNotNullExpressionValue(string4, str2);
                            int i17 = i11;
                            if (h.u(string4, '\\')) {
                                jSONArray2 = optJSONArray;
                                str = str2;
                                string4 = h.X(h.X(string4, "\\n", "\n", false), "\\t", "\t", false);
                            } else {
                                jSONArray2 = optJSONArray;
                                str = str2;
                            }
                            boolean optBoolean = jSONObject3.optBoolean("translatable", true);
                            String optString = jSONObject3.optString("plural_quantifier");
                            Intrinsics.f(optString);
                            if (optString.length() <= 0) {
                                optString = null;
                            }
                            arrayList3.add(new D20.d(string3, string4, optBoolean, optString));
                            i13 = i15 + 1;
                            length = i14;
                            length3 = i16;
                            i11 = i17;
                            optJSONArray = jSONArray2;
                            str2 = str;
                        }
                        list2 = arrayList3;
                    }
                    int i18 = length;
                    int i19 = i11;
                    JSONArray jSONArray4 = optJSONArray;
                    String str3 = str2;
                    arrayList2.add(new D20.b(string2, list2));
                    i12++;
                    length = i18;
                    i11 = i19;
                    optJSONArray = jSONArray4;
                    str2 = str3;
                }
                list = arrayList2;
            }
            int i21 = length;
            int i22 = i11;
            arrayList.add(new D20.e(string, list));
            i11 = i22 + 1;
            jSONArray3 = jSONArray;
            length = i21;
        }
        return arrayList;
    }
}
