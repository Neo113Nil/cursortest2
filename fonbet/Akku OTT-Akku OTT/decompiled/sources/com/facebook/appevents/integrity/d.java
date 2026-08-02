package com.facebook.appevents.integrity;

import android.os.Build;
import android.os.Bundle;
import androidx.core.app.NotificationCompat;
import com.facebook.internal.E;
import com.facebook.w;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.Locale;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt__StringsJVMKt;
import kotlin.text.StringsKt__StringsKt;
import okhttp3.internal.url._UrlKt;
import org.json.JSONArray;
import org.json.JSONObject;

@SourceDebugExtension({"SMAP\nMACARuleMatchingManager.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MACARuleMatchingManager.kt\ncom/facebook/appevents/integrity/MACARuleMatchingManager\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,261:1\n1747#2,3:262\n1726#2,3:265\n*S KotlinDebug\n*F\n+ 1 MACARuleMatchingManager.kt\ncom/facebook/appevents/integrity/MACARuleMatchingManager\n*L\n112#1:262,3\n120#1:265,3\n*E\n"})
/* loaded from: classes3.dex */
public final class d {
    public static boolean b;
    public static JSONArray c;
    public static final d a = new d();
    public static final String[] d = {NotificationCompat.CATEGORY_EVENT, "_locale", "_appVersion", "_deviceOS", "_platform", "_deviceModel", "_nativeAppID", "_nativeAppShortVersion", "_timezone", "_carrier", "_deviceOSTypeName", "_deviceOSVersion", "_remainingDiskGB"};

    @JvmStatic
    public static final void a(Bundle params, String event) {
        if (com.facebook.internal.instrument.crashshield.a.b(d.class)) {
            return;
        }
        try {
            Intrinsics.checkNotNullParameter(params, "params");
            Intrinsics.checkNotNullParameter(event, "event");
            params.putString(NotificationCompat.CATEGORY_EVENT, event);
            StringBuilder sb = new StringBuilder();
            E e = E.a;
            e.getClass();
            Locale locale = E.j;
            String language = locale != null ? locale.getLanguage() : null;
            String str = "";
            if (language == null) {
                language = "";
            }
            sb.append(language);
            sb.append('_');
            e.getClass();
            Locale locale2 = E.j;
            String country = locale2 != null ? locale2.getCountry() : null;
            if (country == null) {
                country = "";
            }
            sb.append(country);
            params.putString("_locale", sb.toString());
            e.getClass();
            String str2 = E.i;
            if (str2 == null) {
                str2 = "";
            }
            params.putString("_appVersion", str2);
            params.putString("_deviceOS", "ANDROID");
            params.putString("_platform", "mobile");
            String str3 = Build.MODEL;
            if (str3 == null) {
                str3 = "";
            }
            params.putString("_deviceModel", str3);
            params.putString("_nativeAppID", w.b());
            e.getClass();
            String str4 = E.i;
            if (str4 != null) {
                str = str4;
            }
            params.putString("_nativeAppShortVersion", str);
            e.getClass();
            params.putString("_timezone", E.g);
            e.getClass();
            params.putString("_carrier", E.h);
            params.putString("_deviceOSTypeName", "ANDROID");
            params.putString("_deviceOSVersion", Build.VERSION.RELEASE);
            e.getClass();
            params.putLong("_remainingDiskGB", E.e);
        } catch (Throwable th) {
            com.facebook.internal.instrument.crashshield.a.a(th, d.class);
        }
    }

    @JvmStatic
    public static final String b(JSONObject logic) {
        if (!com.facebook.internal.instrument.crashshield.a.b(d.class)) {
            try {
                Intrinsics.checkNotNullParameter(logic, "logic");
                Iterator<String> keys = logic.keys();
                if (keys.hasNext()) {
                    return keys.next();
                }
            } catch (Throwable th) {
                com.facebook.internal.instrument.crashshield.a.a(th, d.class);
                return null;
            }
        }
        return null;
    }

    @JvmStatic
    public static final String c(Bundle bundle) {
        String optString;
        if (com.facebook.internal.instrument.crashshield.a.b(d.class)) {
            return null;
        }
        try {
            JSONArray jSONArray = c;
            if (jSONArray == null) {
                return _UrlKt.PATH_SEGMENT_ENCODE_SET_URI;
            }
            if (jSONArray != null && jSONArray.length() == 0) {
                return _UrlKt.PATH_SEGMENT_ENCODE_SET_URI;
            }
            JSONArray jSONArray2 = c;
            Intrinsics.checkNotNull(jSONArray2, "null cannot be cast to non-null type org.json.JSONArray");
            ArrayList arrayList = new ArrayList();
            int length = jSONArray2.length();
            for (int i = 0; i < length; i++) {
                String optString2 = jSONArray2.optString(i);
                if (optString2 != null) {
                    JSONObject jSONObject = new JSONObject(optString2);
                    long optLong = jSONObject.optLong("id");
                    if (optLong != 0 && (optString = jSONObject.optString("rule")) != null && d(bundle, optString)) {
                        arrayList.add(Long.valueOf(optLong));
                    }
                }
            }
            String jSONArray3 = new JSONArray((Collection) arrayList).toString();
            Intrinsics.checkNotNullExpressionValue(jSONArray3, "JSONArray(res).toString()");
            return jSONArray3;
        } catch (Throwable th) {
            com.facebook.internal.instrument.crashshield.a.a(th, d.class);
            return null;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x007e A[Catch: all -> 0x0049, TryCatch #0 {all -> 0x0049, blocks: (B:6:0x0011, B:9:0x001e, B:16:0x0079, B:19:0x007e, B:22:0x0036, B:25:0x003f, B:27:0x004b, B:29:0x0053, B:32:0x0058, B:34:0x005f, B:36:0x006e, B:41:0x0071, B:43:0x0083, B:46:0x0088, B:48:0x008f), top: B:5:0x0011 }] */
    @JvmStatic
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final boolean d(Bundle bundle, String str) {
        JSONObject jSONObject;
        if (!com.facebook.internal.instrument.crashshield.a.b(d.class) && str != null && bundle != null) {
            try {
                JSONObject jSONObject2 = new JSONObject(str);
                String b2 = b(jSONObject2);
                if (b2 != null) {
                    Object obj = jSONObject2.get(b2);
                    int hashCode = b2.hashCode();
                    if (hashCode != 3555) {
                        if (hashCode != 96727) {
                            if (hashCode == 109267 && b2.equals("not")) {
                                return !d(bundle, obj.toString());
                            }
                        } else if (b2.equals("and")) {
                            JSONArray jSONArray = (JSONArray) obj;
                            if (jSONArray != null) {
                                int length = jSONArray.length();
                                for (int i = 0; i < length; i++) {
                                    if (d(bundle, jSONArray.get(i).toString())) {
                                    }
                                }
                                return true;
                            }
                        }
                        jSONObject = (JSONObject) obj;
                        if (jSONObject == null) {
                            return g(b2, jSONObject, bundle);
                        }
                    } else {
                        if (b2.equals("or")) {
                            JSONArray jSONArray2 = (JSONArray) obj;
                            if (jSONArray2 != null) {
                                int length2 = jSONArray2.length();
                                for (int i2 = 0; i2 < length2; i2++) {
                                    if (d(bundle, jSONArray2.get(i2).toString())) {
                                        return true;
                                    }
                                }
                            }
                        }
                        jSONObject = (JSONObject) obj;
                        if (jSONObject == null) {
                        }
                    }
                }
            } catch (Throwable th) {
                com.facebook.internal.instrument.crashshield.a.a(th, d.class);
            }
        }
        return false;
    }

    @JvmStatic
    public static final void e(Bundle bundle, String event) {
        if (com.facebook.internal.instrument.crashshield.a.b(d.class)) {
            return;
        }
        try {
            Intrinsics.checkNotNullParameter(event, "event");
            if (!b || bundle == null) {
                return;
            }
            try {
                a(bundle, event);
                bundle.putString("_audiencePropertyIds", c(bundle));
                bundle.putString("cs_maca", "1");
                f(bundle);
            } catch (Exception unused) {
            }
        } catch (Throwable th) {
            com.facebook.internal.instrument.crashshield.a.a(th, d.class);
        }
    }

    @JvmStatic
    public static final void f(Bundle params) {
        if (com.facebook.internal.instrument.crashshield.a.b(d.class)) {
            return;
        }
        try {
            Intrinsics.checkNotNullParameter(params, "params");
            for (String str : d) {
                params.remove(str);
            }
        } catch (Throwable th) {
            com.facebook.internal.instrument.crashshield.a.a(th, d.class);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x0083, code lost:
    
        if (r7 == null) goto L33;
     */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:102:0x01ea  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x01d4  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x01ae  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x0236  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x034c A[Catch: all -> 0x006d, TryCatch #1 {all -> 0x006d, blocks: (B:6:0x000b, B:9:0x001f, B:13:0x0056, B:16:0x0061, B:24:0x0076, B:26:0x0090, B:27:0x0094, B:30:0x0099, B:34:0x00a3, B:36:0x00bd, B:40:0x00c7, B:45:0x00d4, B:51:0x0246, B:54:0x024e, B:55:0x0252, B:57:0x0258, B:64:0x00de, B:68:0x00e8, B:70:0x0102, B:76:0x0288, B:80:0x0290, B:81:0x0294, B:83:0x029a, B:90:0x010c, B:94:0x0116, B:96:0x0130, B:100:0x01e0, B:104:0x013a, B:108:0x01c4, B:112:0x0144, B:116:0x019e, B:120:0x014e, B:124:0x0158, B:128:0x0226, B:132:0x0162, B:136:0x016c, B:141:0x034c, B:143:0x0176, B:147:0x01f6, B:151:0x0180, B:155:0x018a, B:159:0x0212, B:161:0x0194, B:165:0x01b0, B:169:0x01ba, B:173:0x01d6, B:177:0x01ec, B:181:0x0208, B:185:0x021c, B:189:0x0238, B:193:0x027a, B:197:0x02bc, B:201:0x02c6, B:205:0x02e2, B:209:0x02ec, B:211:0x02f6, B:217:0x0337, B:219:0x0300, B:223:0x030a, B:225:0x0318, B:229:0x0322, B:231:0x032b, B:235:0x0340, B:239:0x0355, B:243:0x035e, B:247:0x0087, B:260:0x0052, B:253:0x0037, B:255:0x0043), top: B:5:0x000b, inners: #0 }] */
    /* JADX WARN: Removed duplicated region for block: B:149:0x0206  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x005f  */
    /* JADX WARN: Removed duplicated region for block: B:216:0x0336  */
    /* JADX WARN: Removed duplicated region for block: B:217:0x0337 A[Catch: all -> 0x006d, TryCatch #1 {all -> 0x006d, blocks: (B:6:0x000b, B:9:0x001f, B:13:0x0056, B:16:0x0061, B:24:0x0076, B:26:0x0090, B:27:0x0094, B:30:0x0099, B:34:0x00a3, B:36:0x00bd, B:40:0x00c7, B:45:0x00d4, B:51:0x0246, B:54:0x024e, B:55:0x0252, B:57:0x0258, B:64:0x00de, B:68:0x00e8, B:70:0x0102, B:76:0x0288, B:80:0x0290, B:81:0x0294, B:83:0x029a, B:90:0x010c, B:94:0x0116, B:96:0x0130, B:100:0x01e0, B:104:0x013a, B:108:0x01c4, B:112:0x0144, B:116:0x019e, B:120:0x014e, B:124:0x0158, B:128:0x0226, B:132:0x0162, B:136:0x016c, B:141:0x034c, B:143:0x0176, B:147:0x01f6, B:151:0x0180, B:155:0x018a, B:159:0x0212, B:161:0x0194, B:165:0x01b0, B:169:0x01ba, B:173:0x01d6, B:177:0x01ec, B:181:0x0208, B:185:0x021c, B:189:0x0238, B:193:0x027a, B:197:0x02bc, B:201:0x02c6, B:205:0x02e2, B:209:0x02ec, B:211:0x02f6, B:217:0x0337, B:219:0x0300, B:223:0x030a, B:225:0x0318, B:229:0x0322, B:231:0x032b, B:235:0x0340, B:239:0x0355, B:243:0x035e, B:247:0x0087, B:260:0x0052, B:253:0x0037, B:255:0x0043), top: B:5:0x000b, inners: #0 }] */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0244  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0246 A[Catch: all -> 0x006d, TryCatch #1 {all -> 0x006d, blocks: (B:6:0x000b, B:9:0x001f, B:13:0x0056, B:16:0x0061, B:24:0x0076, B:26:0x0090, B:27:0x0094, B:30:0x0099, B:34:0x00a3, B:36:0x00bd, B:40:0x00c7, B:45:0x00d4, B:51:0x0246, B:54:0x024e, B:55:0x0252, B:57:0x0258, B:64:0x00de, B:68:0x00e8, B:70:0x0102, B:76:0x0288, B:80:0x0290, B:81:0x0294, B:83:0x029a, B:90:0x010c, B:94:0x0116, B:96:0x0130, B:100:0x01e0, B:104:0x013a, B:108:0x01c4, B:112:0x0144, B:116:0x019e, B:120:0x014e, B:124:0x0158, B:128:0x0226, B:132:0x0162, B:136:0x016c, B:141:0x034c, B:143:0x0176, B:147:0x01f6, B:151:0x0180, B:155:0x018a, B:159:0x0212, B:161:0x0194, B:165:0x01b0, B:169:0x01ba, B:173:0x01d6, B:177:0x01ec, B:181:0x0208, B:185:0x021c, B:189:0x0238, B:193:0x027a, B:197:0x02bc, B:201:0x02c6, B:205:0x02e2, B:209:0x02ec, B:211:0x02f6, B:217:0x0337, B:219:0x0300, B:223:0x030a, B:225:0x0318, B:229:0x0322, B:231:0x032b, B:235:0x0340, B:239:0x0355, B:243:0x035e, B:247:0x0087, B:260:0x0052, B:253:0x0037, B:255:0x0043), top: B:5:0x000b, inners: #0 }] */
    /* JADX WARN: Removed duplicated region for block: B:83:0x029a A[Catch: all -> 0x006d, TryCatch #1 {all -> 0x006d, blocks: (B:6:0x000b, B:9:0x001f, B:13:0x0056, B:16:0x0061, B:24:0x0076, B:26:0x0090, B:27:0x0094, B:30:0x0099, B:34:0x00a3, B:36:0x00bd, B:40:0x00c7, B:45:0x00d4, B:51:0x0246, B:54:0x024e, B:55:0x0252, B:57:0x0258, B:64:0x00de, B:68:0x00e8, B:70:0x0102, B:76:0x0288, B:80:0x0290, B:81:0x0294, B:83:0x029a, B:90:0x010c, B:94:0x0116, B:96:0x0130, B:100:0x01e0, B:104:0x013a, B:108:0x01c4, B:112:0x0144, B:116:0x019e, B:120:0x014e, B:124:0x0158, B:128:0x0226, B:132:0x0162, B:136:0x016c, B:141:0x034c, B:143:0x0176, B:147:0x01f6, B:151:0x0180, B:155:0x018a, B:159:0x0212, B:161:0x0194, B:165:0x01b0, B:169:0x01ba, B:173:0x01d6, B:177:0x01ec, B:181:0x0208, B:185:0x021c, B:189:0x0238, B:193:0x027a, B:197:0x02bc, B:201:0x02c6, B:205:0x02e2, B:209:0x02ec, B:211:0x02f6, B:217:0x0337, B:219:0x0300, B:223:0x030a, B:225:0x0318, B:229:0x0322, B:231:0x032b, B:235:0x0340, B:239:0x0355, B:243:0x035e, B:247:0x0087, B:260:0x0052, B:253:0x0037, B:255:0x0043), top: B:5:0x000b, inners: #0 }] */
    @JvmStatic
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final boolean g(String variable, JSONObject values, Bundle bundle) {
        ArrayList<String> arrayList;
        Object obj;
        boolean contains$default;
        boolean startsWith$default;
        boolean contains$default2;
        boolean contains$default3;
        boolean contains$default4;
        boolean startsWith$default2;
        if (!com.facebook.internal.instrument.crashshield.a.b(d.class)) {
            try {
                Intrinsics.checkNotNullParameter(variable, "variable");
                Intrinsics.checkNotNullParameter(values, "values");
                String b2 = b(values);
                if (b2 != null) {
                    String obj2 = values.get(b2).toString();
                    JSONArray optJSONArray = values.optJSONArray(b2);
                    if (!com.facebook.internal.instrument.crashshield.a.b(d.class) && optJSONArray != null) {
                        try {
                            arrayList = new ArrayList();
                            int length = optJSONArray.length();
                            for (int i = 0; i < length; i++) {
                                arrayList.add(optJSONArray.get(i).toString());
                            }
                        } catch (Throwable th) {
                            com.facebook.internal.instrument.crashshield.a.a(th, d.class);
                        }
                        if (!Intrinsics.areEqual(b2, "exists")) {
                            return bundle != null && bundle.containsKey(variable) == Boolean.parseBoolean(obj2);
                        }
                        if (bundle != null) {
                            String lowerCase = variable.toLowerCase(Locale.ROOT);
                            Intrinsics.checkNotNullExpressionValue(lowerCase, "this as java.lang.String).toLowerCase(Locale.ROOT)");
                            obj = bundle.get(lowerCase);
                        }
                        Object obj3 = bundle != null ? bundle.get(variable) : null;
                        if (obj3 != null) {
                            obj = obj3;
                            switch (b2.hashCode()) {
                                case -1729128927:
                                    if (b2.equals("i_not_contains")) {
                                        String obj4 = obj.toString();
                                        Locale locale = Locale.ROOT;
                                        String lowerCase2 = obj4.toLowerCase(locale);
                                        Intrinsics.checkNotNullExpressionValue(lowerCase2, "this as java.lang.String).toLowerCase(Locale.ROOT)");
                                        String lowerCase3 = obj2.toLowerCase(locale);
                                        Intrinsics.checkNotNullExpressionValue(lowerCase3, "this as java.lang.String).toLowerCase(Locale.ROOT)");
                                        contains$default = StringsKt__StringsKt.contains$default(lowerCase2, lowerCase3, false, 2, (Object) null);
                                        if (contains$default) {
                                        }
                                        break;
                                    } else {
                                        break;
                                    }
                                    break;
                                case -1179774633:
                                    if (!b2.equals("is_any")) {
                                        break;
                                    }
                                    if (arrayList != null) {
                                        break;
                                    }
                                    break;
                                case -1039699439:
                                    if (!b2.equals("not_in")) {
                                        break;
                                    }
                                    if (arrayList != null) {
                                        break;
                                    } else {
                                        break;
                                    }
                                case -969266188:
                                    if (b2.equals("starts_with")) {
                                        startsWith$default = StringsKt__StringsJVMKt.startsWith$default(obj.toString(), obj2, false, 2, null);
                                        break;
                                    } else {
                                        break;
                                    }
                                case -966353971:
                                    if (b2.equals("regex_match")) {
                                        break;
                                    } else {
                                        break;
                                    }
                                case -665609109:
                                    if (!b2.equals("is_not_any")) {
                                        break;
                                    }
                                    if (arrayList != null) {
                                    }
                                    break;
                                case -567445985:
                                    if (b2.equals("contains")) {
                                        contains$default2 = StringsKt__StringsKt.contains$default(obj.toString(), obj2, false, 2, (Object) null);
                                        break;
                                    } else {
                                        break;
                                    }
                                case -327990090:
                                    if (b2.equals("i_str_neq")) {
                                        String obj5 = obj.toString();
                                        Locale locale2 = Locale.ROOT;
                                        String lowerCase4 = obj5.toLowerCase(locale2);
                                        Intrinsics.checkNotNullExpressionValue(lowerCase4, "this as java.lang.String).toLowerCase(Locale.ROOT)");
                                        String lowerCase5 = obj2.toLowerCase(locale2);
                                        Intrinsics.checkNotNullExpressionValue(lowerCase5, "this as java.lang.String).toLowerCase(Locale.ROOT)");
                                        if (!Intrinsics.areEqual(lowerCase4, lowerCase5)) {
                                            break;
                                        }
                                    } else {
                                        break;
                                    }
                                    break;
                                case -159812115:
                                    if (!b2.equals("i_is_any")) {
                                        break;
                                    }
                                    if (arrayList != null && !arrayList.isEmpty()) {
                                        for (String str : arrayList) {
                                            Locale locale3 = Locale.ROOT;
                                            String lowerCase6 = str.toLowerCase(locale3);
                                            Intrinsics.checkNotNullExpressionValue(lowerCase6, "this as java.lang.String).toLowerCase(Locale.ROOT)");
                                            String lowerCase7 = obj.toString().toLowerCase(locale3);
                                            Intrinsics.checkNotNullExpressionValue(lowerCase7, "this as java.lang.String).toLowerCase(Locale.ROOT)");
                                            if (Intrinsics.areEqual(lowerCase6, lowerCase7)) {
                                                break;
                                            }
                                        }
                                        break;
                                    }
                                    break;
                                case -92753547:
                                    if (!b2.equals("i_str_not_in")) {
                                        break;
                                    }
                                    if (arrayList != null) {
                                        break;
                                    } else {
                                        if (!arrayList.isEmpty()) {
                                            for (String str2 : arrayList) {
                                                Locale locale4 = Locale.ROOT;
                                                String lowerCase8 = str2.toLowerCase(locale4);
                                                Intrinsics.checkNotNullExpressionValue(lowerCase8, "this as java.lang.String).toLowerCase(Locale.ROOT)");
                                                String lowerCase9 = obj.toString().toLowerCase(locale4);
                                                Intrinsics.checkNotNullExpressionValue(lowerCase9, "this as java.lang.String).toLowerCase(Locale.ROOT)");
                                                if (Intrinsics.areEqual(lowerCase8, lowerCase9)) {
                                                    break;
                                                }
                                            }
                                        }
                                        break;
                                    }
                                case 60:
                                    if (!b2.equals("<")) {
                                        break;
                                    }
                                    if (Double.parseDouble(obj.toString()) >= Double.parseDouble(obj2)) {
                                        break;
                                    }
                                    break;
                                case 61:
                                    if (!b2.equals("=")) {
                                        break;
                                    }
                                    break;
                                case 62:
                                    if (!b2.equals(">")) {
                                        break;
                                    }
                                    if (Double.parseDouble(obj.toString()) <= Double.parseDouble(obj2)) {
                                        break;
                                    }
                                    break;
                                case 1084:
                                    if (!b2.equals("!=")) {
                                        break;
                                    }
                                    if (!Intrinsics.areEqual(obj.toString(), obj2)) {
                                        break;
                                    }
                                    break;
                                case 1921:
                                    if (!b2.equals("<=")) {
                                        break;
                                    }
                                    if (Double.parseDouble(obj.toString()) <= Double.parseDouble(obj2)) {
                                        break;
                                    }
                                    break;
                                case 1952:
                                    if (!b2.equals("==")) {
                                        break;
                                    }
                                    break;
                                case 1983:
                                    if (!b2.equals(">=")) {
                                        break;
                                    }
                                    if (Double.parseDouble(obj.toString()) >= Double.parseDouble(obj2)) {
                                        break;
                                    }
                                    break;
                                case 3244:
                                    if (!b2.equals("eq")) {
                                        break;
                                    }
                                    break;
                                case 3294:
                                    if (!b2.equals("ge")) {
                                        break;
                                    }
                                    if (Double.parseDouble(obj.toString()) >= Double.parseDouble(obj2)) {
                                    }
                                    break;
                                case 3309:
                                    if (!b2.equals("gt")) {
                                        break;
                                    }
                                    if (Double.parseDouble(obj.toString()) <= Double.parseDouble(obj2)) {
                                    }
                                    break;
                                case 3365:
                                    if (!b2.equals("in")) {
                                        break;
                                    }
                                    if (arrayList != null) {
                                    }
                                    break;
                                case 3449:
                                    if (!b2.equals("le")) {
                                        break;
                                    }
                                    if (Double.parseDouble(obj.toString()) <= Double.parseDouble(obj2)) {
                                    }
                                    break;
                                case 3464:
                                    if (!b2.equals("lt")) {
                                        break;
                                    }
                                    if (Double.parseDouble(obj.toString()) >= Double.parseDouble(obj2)) {
                                    }
                                    break;
                                case 3511:
                                    if (!b2.equals("ne")) {
                                        break;
                                    }
                                    if (!Intrinsics.areEqual(obj.toString(), obj2)) {
                                    }
                                    break;
                                case 102680:
                                    if (!b2.equals("gte")) {
                                        break;
                                    }
                                    if (Double.parseDouble(obj.toString()) >= Double.parseDouble(obj2)) {
                                    }
                                    break;
                                case 107485:
                                    if (!b2.equals("lte")) {
                                        break;
                                    }
                                    if (Double.parseDouble(obj.toString()) <= Double.parseDouble(obj2)) {
                                    }
                                    break;
                                case 108954:
                                    if (!b2.equals("neq")) {
                                        break;
                                    }
                                    if (!Intrinsics.areEqual(obj.toString(), obj2)) {
                                    }
                                    break;
                                case 127966736:
                                    if (b2.equals("i_str_eq")) {
                                        String obj6 = obj.toString();
                                        Locale locale5 = Locale.ROOT;
                                        String lowerCase10 = obj6.toLowerCase(locale5);
                                        Intrinsics.checkNotNullExpressionValue(lowerCase10, "this as java.lang.String).toLowerCase(Locale.ROOT)");
                                        String lowerCase11 = obj2.toLowerCase(locale5);
                                        Intrinsics.checkNotNullExpressionValue(lowerCase11, "this as java.lang.String).toLowerCase(Locale.ROOT)");
                                        break;
                                    } else {
                                        break;
                                    }
                                case 127966857:
                                    if (!b2.equals("i_str_in")) {
                                        break;
                                    }
                                    if (arrayList != null) {
                                        while (r9.hasNext()) {
                                        }
                                        break;
                                    }
                                case 363990325:
                                    if (b2.equals("i_contains")) {
                                        String obj7 = obj.toString();
                                        Locale locale6 = Locale.ROOT;
                                        String lowerCase12 = obj7.toLowerCase(locale6);
                                        Intrinsics.checkNotNullExpressionValue(lowerCase12, "this as java.lang.String).toLowerCase(Locale.ROOT)");
                                        String lowerCase13 = obj2.toLowerCase(locale6);
                                        Intrinsics.checkNotNullExpressionValue(lowerCase13, "this as java.lang.String).toLowerCase(Locale.ROOT)");
                                        contains$default3 = StringsKt__StringsKt.contains$default(lowerCase12, lowerCase13, false, 2, (Object) null);
                                        break;
                                    } else {
                                        break;
                                    }
                                case 1091487233:
                                    if (!b2.equals("i_is_not_any")) {
                                        break;
                                    }
                                    if (arrayList != null) {
                                    }
                                    break;
                                case 1918401035:
                                    if (b2.equals("not_contains")) {
                                        contains$default4 = StringsKt__StringsKt.contains$default(obj.toString(), obj2, false, 2, (Object) null);
                                        if (contains$default4) {
                                        }
                                        break;
                                    } else {
                                        break;
                                    }
                                case 1961112862:
                                    if (b2.equals("i_starts_with")) {
                                        String obj8 = obj.toString();
                                        Locale locale7 = Locale.ROOT;
                                        String lowerCase14 = obj8.toLowerCase(locale7);
                                        Intrinsics.checkNotNullExpressionValue(lowerCase14, "this as java.lang.String).toLowerCase(Locale.ROOT)");
                                        String lowerCase15 = obj2.toLowerCase(locale7);
                                        Intrinsics.checkNotNullExpressionValue(lowerCase15, "this as java.lang.String).toLowerCase(Locale.ROOT)");
                                        startsWith$default2 = StringsKt__StringsJVMKt.startsWith$default(lowerCase14, lowerCase15, false, 2, null);
                                        break;
                                    } else {
                                        break;
                                    }
                            }
                        }
                    }
                    arrayList = null;
                    if (!Intrinsics.areEqual(b2, "exists")) {
                    }
                }
            } catch (Throwable th2) {
                com.facebook.internal.instrument.crashshield.a.a(th2, d.class);
                return false;
            }
        }
        return false;
    }
}
