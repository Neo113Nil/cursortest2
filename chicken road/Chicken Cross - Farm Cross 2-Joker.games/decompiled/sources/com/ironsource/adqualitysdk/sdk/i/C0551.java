package com.ironsource.adqualitysdk.sdk.i;

import android.content.SharedPreferences;
import android.os.Bundle;
import android.text.TextUtils;
import com.ironsource.adqualitysdk.sdk.StringFog;
import java.lang.ref.WeakReference;
import java.lang.reflect.Array;
import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicReference;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: com.ironsource.adqualitysdk.sdk.i.ԅ, reason: contains not printable characters */
/* loaded from: classes6.dex */
public final class C0551 {

    /* renamed from: ﾇ, reason: contains not printable characters */
    public final int f1249;

    /* renamed from: ﾒ, reason: contains not printable characters */
    public final List f1250;

    /* renamed from: ｋ, reason: contains not printable characters */
    public final HashSet f1248 = new HashSet();

    /* renamed from: ﻛ, reason: contains not printable characters */
    public final HashSet f1247 = new HashSet();

    /* renamed from: ﻐ, reason: contains not printable characters */
    public int f1246 = 0;

    public C0551(List list, int i) {
        this.f1250 = list;
        this.f1249 = i;
    }

    /* renamed from: ﾇ, reason: contains not printable characters */
    public static boolean m5515(Object obj) {
        if (obj == null) {
            return true;
        }
        return obj instanceof String ? ((String) obj).isEmpty() : obj instanceof Number ? ((Number) obj).doubleValue() == 0.0d : obj instanceof Boolean ? !((Boolean) obj).booleanValue() : obj instanceof Collection ? ((Collection) obj).isEmpty() : obj instanceof Map ? ((Map) obj).isEmpty() : obj.getClass().isArray() && Array.getLength(obj) == 0;
    }

    /* renamed from: ﾒ, reason: contains not printable characters */
    public final String m5518(Collection collection) {
        StringBuilder sb = new StringBuilder(StringFog.decrypt("7A==\n", "t+eIe0vddtE=\n"));
        boolean z = true;
        for (Object obj : collection) {
            if (!m5515(obj)) {
                if (!z) {
                    sb.append(StringFog.decrypt("fQ==\n", "UYy7YPSvjlY=\n"));
                }
                sb.append(m5517(obj));
                z = false;
            }
        }
        sb.append(StringFog.decrypt("6A==\n", "tRHmqEiG1Gg=\n"));
        return sb.toString();
    }

    /* renamed from: ﾒ, reason: contains not printable characters */
    public final String m5519(Map map) {
        StringBuilder sb = new StringBuilder(StringFog.decrypt("ow==\n", "2HO42miUwm4=\n"));
        boolean z = true;
        for (Map.Entry entry : map.entrySet()) {
            if (!m5515(entry.getValue())) {
                if (!z) {
                    sb.append(StringFog.decrypt("EQ==\n", "Pbp0Q3EHvY8=\n"));
                }
                sb.append(m5516(String.valueOf(entry.getKey()))).append(StringFog.decrypt("fQ==\n", "R1nAj4GO0i0=\n")).append(m5517(entry.getValue()));
                z = false;
            }
        }
        sb.append(StringFog.decrypt("ZQ==\n", "GPsQxYFJ9Es=\n"));
        return sb.toString();
    }

    /* renamed from: ﾒ, reason: contains not printable characters */
    public static String m5516(String str) {
        return AbstractC1257.m5940("eg==\n", "WEPGHfDvnKw=\n", new StringBuilder().append(StringFog.decrypt("tA==\n", "lleDN56JIrk=\n")).append(str.replace(StringFog.decrypt("zQ==\n", "kQ+vm65iqww=\n"), StringFog.decrypt("2NM=\n", "hI/6dPJDWNU=\n")).replace(StringFog.decrypt("vA==\n", "nlKIynTYpgU=\n"), StringFog.decrypt("E6A=\n", "T4KliWHPst0=\n")).replace("\n", StringFog.decrypt("6HM=\n", "tB3JQP13BOY=\n")).replace("\r", StringFog.decrypt("BmI=\n", "WhCVP8kdz+A=\n")).replace("\t", StringFog.decrypt("hAc=\n", "2HOlEadv6u0=\n"))));
    }

    /* renamed from: ﾒ, reason: contains not printable characters */
    public final String m5517(Object obj) {
        String m5516;
        if (obj instanceof WeakReference) {
            obj = ((WeakReference) obj).get();
        } else if (obj instanceof AtomicReference) {
            obj = ((AtomicReference) obj).get();
        }
        if (obj == null) {
            return StringFog.decrypt("mnY/UA==\n", "9ANTPE7mqTc=\n");
        }
        if (obj instanceof String) {
            String str = (String) obj;
            if (str.length() > 30) {
                if (this.f1247.contains(str)) {
                    return StringFog.decrypt("kLhS0mESeQ==\n", "soQ2pxEsW6k=\n");
                }
                this.f1247.add(str);
            }
            return m5516(str);
        }
        if (!(obj instanceof Number) && !(obj instanceof Boolean)) {
            if (obj instanceof Character) {
                return m5516(String.valueOf(obj));
            }
            int i = 0;
            if (obj instanceof JSONArray) {
                JSONArray jSONArray = (JSONArray) obj;
                ArrayList arrayList = new ArrayList();
                while (i < jSONArray.length()) {
                    Object opt = jSONArray.opt(i);
                    if (opt != null) {
                        arrayList.add(opt);
                    }
                    i++;
                }
                return m5518((Collection) arrayList);
            }
            String str2 = null;
            if (obj instanceof JSONObject) {
                JSONObject jSONObject = (JSONObject) obj;
                HashMap hashMap = new HashMap();
                Iterator<String> keys = jSONObject.keys();
                while (keys.hasNext()) {
                    String next = keys.next();
                    hashMap.put(next, jSONObject.optString(next, null));
                }
                return m5519((Map) hashMap);
            }
            if (obj instanceof Map) {
                return m5519((Map) obj);
            }
            if (obj instanceof Collection) {
                return m5518((Collection) obj);
            }
            if (obj.getClass().isArray()) {
                ArrayList arrayList2 = new ArrayList();
                while (i < Array.getLength(obj)) {
                    arrayList2.add(Array.get(obj, i));
                    i++;
                }
                return m5518((Collection) arrayList2);
            }
            if (obj instanceof Bundle) {
                Bundle bundle = (Bundle) obj;
                HashMap hashMap2 = new HashMap();
                for (String str3 : bundle.keySet()) {
                    hashMap2.put(str3, bundle.get(str3));
                }
                return AbstractC1257.m5940("7A==\n", "kQn1kHFDq8M=\n", new StringBuilder().append(StringFog.decrypt("+V8LepMz5GmgR3ZbijzzdudfeDugNvZu419u\n", "gn1UGf9Slxo=\n")).append(m5519((Map) hashMap2)));
            }
            if (obj instanceof SharedPreferences) {
                return AbstractC1257.m5940("9g==\n", "i7pWc2SGTKE=\n", new StringBuilder().append(StringFog.decrypt("9BmYM1dbhtqtAeUDU1uHzOtrtTVdX4fM4ViiIxkW1/brWrMxGQA=\n", "jzvHUDs69ak=\n")).append(m5519(((SharedPreferences) obj).getAll())));
            }
            if (AbstractC0940.m5781(obj.getClass(), this.f1250)) {
                if (this.f1246 <= this.f1249 && !this.f1248.contains(obj)) {
                    this.f1248.add(obj);
                    this.f1246++;
                    StringBuilder sb = new StringBuilder(StringFog.decrypt("7Fs5A7/+WGW1Qw==\n", "l3lmYNOfKxY=\n"));
                    sb.append(m5516(obj.getClass().getSimpleName()));
                    try {
                        String obj2 = obj.toString();
                        if (!TextUtils.isEmpty(obj2)) {
                            String hexString = Integer.toHexString(obj.hashCode());
                            if (!obj2.equals(obj.getClass().getName() + StringFog.decrypt("vQ==\n", "/Z6gUCpS+Zo=\n") + hexString)) {
                                if (!obj2.equals(obj.getClass().getSimpleName() + StringFog.decrypt("RA==\n", "BABdd4ktHOY=\n") + hexString)) {
                                    str2 = obj2;
                                }
                            }
                        }
                    } catch (Throwable unused) {
                    }
                    if (!TextUtils.isEmpty(str2)) {
                        StringBuilder append = sb.append(StringFog.decrypt("C4fXxArMJ2ROy++SXw==\n", "J6WIsGWfUxY=\n"));
                        if (str2.length() > 30) {
                            if (this.f1247.contains(str2)) {
                                m5516 = StringFog.decrypt("kLhS0mESeQ==\n", "soQ2pxEsW6k=\n");
                                append.append(m5516);
                            } else {
                                this.f1247.add(str2);
                            }
                        }
                        m5516 = m5516(str2);
                        append.append(m5516);
                    }
                    try {
                        ArrayList arrayList3 = new ArrayList();
                        for (Class<?> cls = obj.getClass(); cls != null && AbstractC0940.m5781(cls, this.f1250); cls = cls.getSuperclass()) {
                            arrayList3.addAll(Arrays.asList(cls.getDeclaredFields()));
                        }
                        Field[] fieldArr = (Field[]) arrayList3.toArray(new Field[0]);
                        int length = fieldArr.length;
                        while (i < length) {
                            Field field = fieldArr[i];
                            if (Modifier.isStatic(field.getModifiers())) {
                                Class<?> type = field.getType();
                                if (!type.isPrimitive()) {
                                    if (type == String.class) {
                                    }
                                }
                                i++;
                            }
                            field.setAccessible(true);
                            Object obj3 = field.get(obj);
                            if (obj3 instanceof WeakReference) {
                                obj3 = ((WeakReference) obj3).get();
                            } else if (obj3 instanceof AtomicReference) {
                                obj3 = ((AtomicReference) obj3).get();
                            }
                            if (!m5515(obj3)) {
                                sb.append(StringFog.decrypt("hno=\n", "qljU3TDnqeA=\n")).append(field.getName()).append(StringFog.decrypt("EwY=\n", "MTylQ0m0SCM=\n")).append(m5517(obj3));
                            }
                            i++;
                        }
                    } catch (Throwable unused2) {
                    }
                    this.f1246--;
                    sb.append(StringFog.decrypt("+A==\n", "hT5gXP3TKVk=\n"));
                    return sb.toString();
                }
                return m5516(obj.getClass().getSimpleName() + StringFog.decrypt("uQ==\n", "+Q6UMy0bkGc=\n") + Integer.toHexString(obj.hashCode()));
            }
            return m5516(obj.getClass().getSimpleName() + StringFog.decrypt("+Q==\n", "uTpGH3aBzgw=\n") + Integer.toHexString(obj.hashCode()));
        }
        return String.valueOf(obj);
    }
}
