package com.facebook.appevents.suggestedevents;

import android.util.Patterns;
import androidx.exifinterface.media.ExifInterface;
import com.google.android.exoplayer2.source.rtsp.SessionDescription;
import com.google.firebase.analytics.FirebaseAnalytics;
import java.io.File;
import java.io.FileInputStream;
import java.util.Map;
import java.util.regex.Pattern;
import kotlin.TuplesKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Charsets;
import kotlin.text.StringsKt__StringsKt;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public final class a {
    public static final a a = new a();
    public static Map<String, String> b;
    public static Map<String, String> c;
    public static Map<String, String> d;
    public static JSONObject e;
    public static boolean f;

    @JvmStatic
    public static final float[] a(String appName, JSONObject viewHierarchy) {
        String lowerCase;
        JSONObject jSONObject;
        String screenName;
        JSONArray jSONArray;
        a aVar;
        JSONObject b2;
        if (!com.facebook.internal.instrument.crashshield.a.b(a.class)) {
            try {
                Intrinsics.checkNotNullParameter(viewHierarchy, "viewHierarchy");
                Intrinsics.checkNotNullParameter(appName, "appName");
                if (f) {
                    float[] fArr = new float[30];
                    for (int i = 0; i < 30; i++) {
                        fArr[i] = 0.0f;
                    }
                    try {
                        lowerCase = appName.toLowerCase();
                        Intrinsics.checkNotNullExpressionValue(lowerCase, "this as java.lang.String).toLowerCase()");
                        jSONObject = new JSONObject(viewHierarchy.optJSONObject("view").toString());
                        screenName = viewHierarchy.optString("screenname");
                        jSONArray = new JSONArray();
                        aVar = a;
                        aVar.h(jSONObject, jSONArray);
                        aVar.k(fArr, aVar.g(jSONObject));
                        b2 = aVar.b(jSONObject);
                    } catch (JSONException unused) {
                    }
                    if (b2 != null) {
                        Intrinsics.checkNotNullExpressionValue(screenName, "screenName");
                        String jSONObject2 = jSONObject.toString();
                        Intrinsics.checkNotNullExpressionValue(jSONObject2, "viewTree.toString()");
                        aVar.k(fArr, aVar.f(b2, jSONArray, screenName, jSONObject2, lowerCase));
                        return fArr;
                    }
                }
            } catch (Throwable th) {
                com.facebook.internal.instrument.crashshield.a.a(th, a.class);
                return null;
            }
        }
        return null;
    }

    @JvmStatic
    public static final String c(String buttonText, String activityName, String appName) {
        if (com.facebook.internal.instrument.crashshield.a.b(a.class)) {
            return null;
        }
        try {
            Intrinsics.checkNotNullParameter(buttonText, "buttonText");
            Intrinsics.checkNotNullParameter(activityName, "activityName");
            Intrinsics.checkNotNullParameter(appName, "appName");
            String lowerCase = (appName + " | " + activityName + ", " + buttonText).toLowerCase();
            Intrinsics.checkNotNullExpressionValue(lowerCase, "this as java.lang.String).toLowerCase()");
            return lowerCase;
        } catch (Throwable th) {
            com.facebook.internal.instrument.crashshield.a.a(th, a.class);
            return null;
        }
    }

    @JvmStatic
    public static final void d(File file) {
        if (com.facebook.internal.instrument.crashshield.a.b(a.class)) {
            return;
        }
        try {
            try {
                e = new JSONObject();
                FileInputStream fileInputStream = new FileInputStream(file);
                byte[] bArr = new byte[fileInputStream.available()];
                fileInputStream.read(bArr);
                fileInputStream.close();
                e = new JSONObject(new String(bArr, Charsets.UTF_8));
                b = MapsKt.mapOf(TuplesKt.to("ENGLISH", "1"), TuplesKt.to("GERMAN", ExifInterface.GPS_MEASUREMENT_2D), TuplesKt.to("SPANISH", ExifInterface.GPS_MEASUREMENT_3D), TuplesKt.to("JAPANESE", "4"));
                c = MapsKt.mapOf(TuplesKt.to("VIEW_CONTENT", SessionDescription.SUPPORTED_SDP_VERSION), TuplesKt.to("SEARCH", "1"), TuplesKt.to("ADD_TO_CART", ExifInterface.GPS_MEASUREMENT_2D), TuplesKt.to("ADD_TO_WISHLIST", ExifInterface.GPS_MEASUREMENT_3D), TuplesKt.to("INITIATE_CHECKOUT", "4"), TuplesKt.to("ADD_PAYMENT_INFO", "5"), TuplesKt.to("PURCHASE", "6"), TuplesKt.to("LEAD", "7"), TuplesKt.to("COMPLETE_REGISTRATION", "8"));
                d = MapsKt.mapOf(TuplesKt.to("BUTTON_TEXT", "1"), TuplesKt.to("PAGE_TITLE", ExifInterface.GPS_MEASUREMENT_2D), TuplesKt.to("RESOLVED_DOCUMENT_LINK", ExifInterface.GPS_MEASUREMENT_3D), TuplesKt.to("BUTTON_ID", "4"));
                f = true;
            } catch (Exception unused) {
            }
        } catch (Throwable th) {
            com.facebook.internal.instrument.crashshield.a.a(th, a.class);
        }
    }

    public final JSONObject b(JSONObject jSONObject) {
        if (com.facebook.internal.instrument.crashshield.a.b(this)) {
            return null;
        }
        try {
        } catch (JSONException unused) {
        } catch (Throwable th) {
            com.facebook.internal.instrument.crashshield.a.a(th, this);
        }
        if (jSONObject.optBoolean("is_interacted")) {
            return jSONObject;
        }
        JSONArray optJSONArray = jSONObject.optJSONArray("childviews");
        if (optJSONArray == null) {
            return null;
        }
        int length = optJSONArray.length();
        for (int i = 0; i < length; i++) {
            JSONObject jSONObject2 = optJSONArray.getJSONObject(i);
            Intrinsics.checkNotNullExpressionValue(jSONObject2, "children.getJSONObject(i)");
            JSONObject b2 = b(jSONObject2);
            if (b2 != null) {
                return b2;
            }
        }
        return null;
    }

    public final boolean e(String[] strArr, String[] strArr2) {
        boolean contains$default;
        if (!com.facebook.internal.instrument.crashshield.a.b(this)) {
            try {
                for (String str : strArr) {
                    for (String str2 : strArr2) {
                        contains$default = StringsKt__StringsKt.contains$default(str2, str, false, 2, (Object) null);
                        if (contains$default) {
                            return true;
                        }
                    }
                }
            } catch (Throwable th) {
                com.facebook.internal.instrument.crashshield.a.a(th, this);
                return false;
            }
        }
        return false;
    }

    public final float[] f(JSONObject jSONObject, JSONArray jSONArray, String str, String str2, String str3) {
        float[] fArr;
        boolean contains$default;
        float[] fArr2 = null;
        if (com.facebook.internal.instrument.crashshield.a.b(this)) {
            return null;
        }
        try {
            float[] fArr3 = new float[30];
            int i = 0;
            int i2 = 0;
            while (true) {
                if (i2 >= 30) {
                    break;
                }
                fArr3[i2] = 0.0f;
                i2++;
            }
            int length = jSONArray.length();
            fArr3[3] = length > 1 ? length - 1.0f : 0.0f;
            try {
                int length2 = jSONArray.length();
                while (i < length2) {
                    JSONObject jSONObject2 = jSONArray.getJSONObject(i);
                    fArr = fArr2;
                    try {
                        try {
                            Intrinsics.checkNotNullExpressionValue(jSONObject2, "siblings.getJSONObject(i)");
                            if (!com.facebook.internal.instrument.crashshield.a.b(this)) {
                                try {
                                    if (((jSONObject2.optInt("classtypebitmask") & 1) << 5) > 0) {
                                        fArr3[9] = fArr3[9] + 1.0f;
                                    }
                                } catch (Throwable th) {
                                    com.facebook.internal.instrument.crashshield.a.a(th, this);
                                }
                            }
                            i++;
                            fArr2 = fArr;
                        } catch (JSONException unused) {
                        }
                    } catch (Throwable th2) {
                        th = th2;
                        com.facebook.internal.instrument.crashshield.a.a(th, this);
                        return fArr;
                    }
                }
            } catch (JSONException unused2) {
            }
            fArr = fArr2;
            fArr3[13] = -1.0f;
            fArr3[14] = -1.0f;
            String str4 = str + '|' + str3;
            StringBuilder sb = new StringBuilder();
            StringBuilder sb2 = new StringBuilder();
            l(jSONObject, sb2, sb);
            String sb3 = sb.toString();
            Intrinsics.checkNotNullExpressionValue(sb3, "hintSB.toString()");
            String sb4 = sb2.toString();
            Intrinsics.checkNotNullExpressionValue(sb4, "textSB.toString()");
            fArr3[15] = j("COMPLETE_REGISTRATION", "BUTTON_TEXT", sb4) ? 1.0f : 0.0f;
            fArr3[16] = j("COMPLETE_REGISTRATION", "PAGE_TITLE", str4) ? 1.0f : 0.0f;
            fArr3[17] = j("COMPLETE_REGISTRATION", "BUTTON_ID", sb3) ? 1.0f : 0.0f;
            contains$default = StringsKt__StringsKt.contains$default(str2, "password", false, 2, (Object) null);
            fArr3[18] = contains$default ? 1.0f : 0.0f;
            fArr3[19] = i("(?i)(confirm.*password)|(password.*(confirmation|confirm)|confirmation)", str2) ? 1.0f : 0.0f;
            fArr3[20] = i("(?i)(sign in)|login|signIn", str2) ? 1.0f : 0.0f;
            fArr3[21] = i("(?i)(sign.*(up|now)|registration|register|(create|apply).*(profile|account)|open.*account|account.*(open|creation|application)|enroll|join.*now)", str2) ? 1.0f : 0.0f;
            fArr3[22] = j("PURCHASE", "BUTTON_TEXT", sb4) ? 1.0f : 0.0f;
            fArr3[24] = j("PURCHASE", "PAGE_TITLE", str4) ? 1.0f : 0.0f;
            fArr3[25] = i("(?i)add to(\\s|\\Z)|update(\\s|\\Z)|cart", sb4) ? 1.0f : 0.0f;
            fArr3[27] = i("(?i)add to(\\s|\\Z)|update(\\s|\\Z)|cart|shop|buy", str4) ? 1.0f : 0.0f;
            fArr3[28] = j("LEAD", "BUTTON_TEXT", sb4) ? 1.0f : 0.0f;
            fArr3[29] = j("LEAD", "PAGE_TITLE", str4) ? 1.0f : 0.0f;
            return fArr3;
        } catch (Throwable th3) {
            th = th3;
            fArr = fArr2;
        }
    }

    public final float[] g(JSONObject jSONObject) {
        boolean contains$default;
        boolean contains$default2;
        boolean contains$default3;
        if (com.facebook.internal.instrument.crashshield.a.b(this)) {
            return null;
        }
        try {
            float[] fArr = new float[30];
            for (int i = 0; i < 30; i++) {
                fArr[i] = 0.0f;
            }
            String optString = jSONObject.optString("text");
            Intrinsics.checkNotNullExpressionValue(optString, "node.optString(TEXT_KEY)");
            String lowerCase = optString.toLowerCase();
            Intrinsics.checkNotNullExpressionValue(lowerCase, "this as java.lang.String).toLowerCase()");
            String optString2 = jSONObject.optString("hint");
            Intrinsics.checkNotNullExpressionValue(optString2, "node.optString(HINT_KEY)");
            String lowerCase2 = optString2.toLowerCase();
            Intrinsics.checkNotNullExpressionValue(lowerCase2, "this as java.lang.String).toLowerCase()");
            String optString3 = jSONObject.optString("classname");
            Intrinsics.checkNotNullExpressionValue(optString3, "node.optString(CLASS_NAME_KEY)");
            String lowerCase3 = optString3.toLowerCase();
            Intrinsics.checkNotNullExpressionValue(lowerCase3, "this as java.lang.String).toLowerCase()");
            int optInt = jSONObject.optInt("inputtype", -1);
            String[] strArr = {lowerCase, lowerCase2};
            if (e(new String[]{"$", "amount", FirebaseAnalytics.Param.PRICE, "total"}, strArr)) {
                fArr[0] = fArr[0] + 1.0f;
            }
            if (e(new String[]{"password", "pwd"}, strArr)) {
                fArr[1] = fArr[1] + 1.0f;
            }
            if (e(new String[]{"tel", "phone"}, strArr)) {
                fArr[2] = fArr[2] + 1.0f;
            }
            if (e(new String[]{FirebaseAnalytics.Event.SEARCH}, strArr)) {
                fArr[4] = fArr[4] + 1.0f;
            }
            if (optInt >= 0) {
                fArr[5] = fArr[5] + 1.0f;
            }
            if (optInt == 2 || optInt == 3) {
                fArr[6] = fArr[6] + 1.0f;
            }
            if (optInt == 32 || Patterns.EMAIL_ADDRESS.matcher(lowerCase).matches()) {
                fArr[7] = fArr[7] + 1.0f;
            }
            contains$default = StringsKt__StringsKt.contains$default(lowerCase3, "checkbox", false, 2, (Object) null);
            if (contains$default) {
                fArr[8] = fArr[8] + 1.0f;
            }
            if (e(new String[]{"complete", "confirm", "done", "submit"}, new String[]{lowerCase})) {
                fArr[10] = fArr[10] + 1.0f;
            }
            contains$default2 = StringsKt__StringsKt.contains$default(lowerCase3, "radio", false, 2, (Object) null);
            if (contains$default2) {
                contains$default3 = StringsKt__StringsKt.contains$default(lowerCase3, "button", false, 2, (Object) null);
                if (contains$default3) {
                    fArr[12] = fArr[12] + 1.0f;
                }
            }
            try {
                JSONArray optJSONArray = jSONObject.optJSONArray("childviews");
                int length = optJSONArray.length();
                for (int i2 = 0; i2 < length; i2++) {
                    JSONObject jSONObject2 = optJSONArray.getJSONObject(i2);
                    Intrinsics.checkNotNullExpressionValue(jSONObject2, "childViews.getJSONObject(i)");
                    k(fArr, g(jSONObject2));
                }
            } catch (JSONException unused) {
            }
            return fArr;
        } catch (Throwable th) {
            com.facebook.internal.instrument.crashshield.a.a(th, this);
            return null;
        }
    }

    public final boolean h(JSONObject jSONObject, JSONArray jSONArray) {
        boolean z;
        if (!com.facebook.internal.instrument.crashshield.a.b(this)) {
            try {
                if (jSONObject.optBoolean("is_interacted")) {
                    return true;
                }
                JSONArray optJSONArray = jSONObject.optJSONArray("childviews");
                int length = optJSONArray.length();
                int i = 0;
                while (true) {
                    if (i >= length) {
                        z = false;
                        break;
                    }
                    if (optJSONArray.getJSONObject(i).optBoolean("is_interacted")) {
                        z = true;
                        break;
                    }
                    i++;
                }
                boolean z2 = z;
                JSONArray jSONArray2 = new JSONArray();
                if (z) {
                    int length2 = optJSONArray.length();
                    for (int i2 = 0; i2 < length2; i2++) {
                        jSONArray.put(optJSONArray.getJSONObject(i2));
                    }
                    return z2;
                }
                int length3 = optJSONArray.length();
                for (int i3 = 0; i3 < length3; i3++) {
                    JSONObject child = optJSONArray.getJSONObject(i3);
                    Intrinsics.checkNotNullExpressionValue(child, "child");
                    if (h(child, jSONArray)) {
                        jSONArray2.put(child);
                        z2 = true;
                    }
                }
                jSONObject.put("childviews", jSONArray2);
                return z2;
            } catch (JSONException unused) {
            } catch (Throwable th) {
                com.facebook.internal.instrument.crashshield.a.a(th, this);
            }
        }
        return false;
    }

    public final boolean i(String str, String str2) {
        if (com.facebook.internal.instrument.crashshield.a.b(this)) {
            return false;
        }
        try {
            return Pattern.compile(str).matcher(str2).find();
        } catch (Throwable th) {
            com.facebook.internal.instrument.crashshield.a.a(th, this);
            return false;
        }
    }

    public final boolean j(String str, String str2, String str3) {
        JSONObject optJSONObject;
        JSONObject optJSONObject2;
        if (!com.facebook.internal.instrument.crashshield.a.b(this)) {
            try {
                JSONObject jSONObject = e;
                String str4 = null;
                Map<String, String> map = null;
                str4 = null;
                str4 = null;
                str4 = null;
                str4 = null;
                if (jSONObject == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("rules");
                    jSONObject = null;
                }
                JSONObject optJSONObject3 = jSONObject.optJSONObject("rulesForLanguage");
                if (optJSONObject3 != null) {
                    Map<String, String> map2 = b;
                    if (map2 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("languageInfo");
                        map2 = null;
                    }
                    JSONObject optJSONObject4 = optJSONObject3.optJSONObject(map2.get("ENGLISH"));
                    if (optJSONObject4 != null && (optJSONObject = optJSONObject4.optJSONObject("rulesForEvent")) != null) {
                        Map<String, String> map3 = c;
                        if (map3 == null) {
                            Intrinsics.throwUninitializedPropertyAccessException("eventInfo");
                            map3 = null;
                        }
                        JSONObject optJSONObject5 = optJSONObject.optJSONObject(map3.get(str));
                        if (optJSONObject5 != null && (optJSONObject2 = optJSONObject5.optJSONObject("positiveRules")) != null) {
                            Map<String, String> map4 = d;
                            if (map4 == null) {
                                Intrinsics.throwUninitializedPropertyAccessException("textTypeInfo");
                            } else {
                                map = map4;
                            }
                            str4 = optJSONObject2.optString(map.get(str2));
                        }
                    }
                }
                if (str4 != null) {
                    return i(str4, str3);
                }
            } catch (Throwable th) {
                com.facebook.internal.instrument.crashshield.a.a(th, this);
                return false;
            }
        }
        return false;
    }

    public final void k(float[] fArr, float[] fArr2) {
        if (com.facebook.internal.instrument.crashshield.a.b(this)) {
            return;
        }
        try {
            int length = fArr.length;
            for (int i = 0; i < length; i++) {
                fArr[i] = fArr[i] + fArr2[i];
            }
        } catch (Throwable th) {
            com.facebook.internal.instrument.crashshield.a.a(th, this);
        }
    }

    public final void l(JSONObject jSONObject, StringBuilder sb, StringBuilder sb2) {
        if (com.facebook.internal.instrument.crashshield.a.b(this)) {
            return;
        }
        try {
            String optString = jSONObject.optString("text", "");
            Intrinsics.checkNotNullExpressionValue(optString, "view.optString(TEXT_KEY, \"\")");
            String lowerCase = optString.toLowerCase();
            Intrinsics.checkNotNullExpressionValue(lowerCase, "this as java.lang.String).toLowerCase()");
            String optString2 = jSONObject.optString("hint", "");
            Intrinsics.checkNotNullExpressionValue(optString2, "view.optString(HINT_KEY, \"\")");
            String lowerCase2 = optString2.toLowerCase();
            Intrinsics.checkNotNullExpressionValue(lowerCase2, "this as java.lang.String).toLowerCase()");
            if (lowerCase.length() > 0) {
                sb.append(lowerCase);
                sb.append(" ");
            }
            if (lowerCase2.length() > 0) {
                sb2.append(lowerCase2);
                sb2.append(" ");
            }
            JSONArray optJSONArray = jSONObject.optJSONArray("childviews");
            if (optJSONArray == null) {
                return;
            }
            int length = optJSONArray.length();
            for (int i = 0; i < length; i++) {
                try {
                    JSONObject currentChildView = optJSONArray.getJSONObject(i);
                    Intrinsics.checkNotNullExpressionValue(currentChildView, "currentChildView");
                    l(currentChildView, sb, sb2);
                } catch (JSONException unused) {
                }
            }
        } catch (Throwable th) {
            com.facebook.internal.instrument.crashshield.a.a(th, this);
        }
    }
}
