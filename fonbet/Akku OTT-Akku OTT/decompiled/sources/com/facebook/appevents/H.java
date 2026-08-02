package com.facebook.appevents;

import android.content.SharedPreferences;
import android.os.Bundle;
import android.preference.PreferenceManager;
import android.util.Patterns;
import androidx.annotation.RestrictTo;
import androidx.media3.exoplayer.upstream.CmcdData;
import com.facebook.appevents.z;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.Regex;

@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
@SourceDebugExtension({"SMAP\nUserDataStore.kt\nKotlin\n*S Kotlin\n*F\n+ 1 UserDataStore.kt\ncom/facebook/appevents/UserDataStore\n+ 2 Strings.kt\nkotlin/text/StringsKt__StringsKt\n+ 3 ArraysJVM.kt\nkotlin/collections/ArraysKt__ArraysJVMKt\n*L\n1#1,275:1\n107#2:276\n79#2,22:277\n107#2:301\n79#2,22:302\n37#3,2:299\n*S KotlinDebug\n*F\n+ 1 UserDataStore.kt\ncom/facebook/appevents/UserDataStore\n*L\n216#1:276\n216#1:277,22\n247#1:301\n247#1:302,22\n219#1:299,2\n*E\n"})
/* loaded from: classes3.dex */
public final class H {
    public static SharedPreferences b;
    public static final H a = new H();
    public static final AtomicBoolean c = new AtomicBoolean(false);
    public static final ConcurrentHashMap<String, String> d = new ConcurrentHashMap<>();
    public static final ConcurrentHashMap<String, String> e = new ConcurrentHashMap<>();

    @JvmStatic
    public static final void d(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10) {
        if (com.facebook.internal.instrument.crashshield.a.b(H.class)) {
            return;
        }
        try {
            Bundle bundle = new Bundle();
            if (str != null) {
                bundle.putString("em", str);
            }
            if (str2 != null) {
                bundle.putString("fn", str2);
            }
            if (str3 != null) {
                bundle.putString("ln", str3);
            }
            if (str4 != null) {
                bundle.putString("ph", str4);
            }
            if (str5 != null) {
                bundle.putString("db", str5);
            }
            if (str6 != null) {
                bundle.putString("ge", str6);
            }
            if (str7 != null) {
                bundle.putString("ct", str7);
            }
            if (str8 != null) {
                bundle.putString("st", str8);
            }
            if (str9 != null) {
                bundle.putString("zp", str9);
            }
            if (str10 != null) {
                bundle.putString("country", str10);
            }
            if (com.facebook.internal.instrument.crashshield.a.b(H.class)) {
                return;
            }
            try {
                z.Companion.getClass();
                z.a.a().execute(new androidx.work.b(bundle, 1));
            } catch (Throwable th) {
                com.facebook.internal.instrument.crashshield.a.a(th, H.class);
            }
        } catch (Throwable th2) {
            com.facebook.internal.instrument.crashshield.a.a(th2, H.class);
        }
    }

    public final HashMap a() {
        ConcurrentHashMap<String, String> concurrentHashMap = e;
        if (com.facebook.internal.instrument.crashshield.a.b(this)) {
            return null;
        }
        try {
            HashMap hashMap = new HashMap();
            com.facebook.appevents.aam.d.Companion.getClass();
            HashSet hashSet = new HashSet();
            Iterator it = com.facebook.appevents.aam.d.a().iterator();
            while (it.hasNext()) {
                hashSet.add(((com.facebook.appevents.aam.d) it.next()).b());
            }
            for (String str : concurrentHashMap.keySet()) {
                if (hashSet.contains(str)) {
                    hashMap.put(str, concurrentHashMap.get(str));
                }
            }
            return hashMap;
        } catch (Throwable th) {
            com.facebook.internal.instrument.crashshield.a.a(th, this);
            return null;
        }
    }

    public final synchronized void b() {
        if (com.facebook.internal.instrument.crashshield.a.b(this)) {
            return;
        }
        try {
            AtomicBoolean atomicBoolean = c;
            if (atomicBoolean.get()) {
                return;
            }
            SharedPreferences defaultSharedPreferences = PreferenceManager.getDefaultSharedPreferences(com.facebook.w.a());
            Intrinsics.checkNotNullExpressionValue(defaultSharedPreferences, "getDefaultSharedPreferen….getApplicationContext())");
            b = defaultSharedPreferences;
            SharedPreferences sharedPreferences = null;
            if (defaultSharedPreferences == null) {
                Intrinsics.throwUninitializedPropertyAccessException("sharedPreferences");
                defaultSharedPreferences = null;
            }
            String string = defaultSharedPreferences.getString("com.facebook.appevents.UserDataStore.userData", "");
            if (string == null) {
                string = "";
            }
            SharedPreferences sharedPreferences2 = b;
            if (sharedPreferences2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("sharedPreferences");
            } else {
                sharedPreferences = sharedPreferences2;
            }
            String string2 = sharedPreferences.getString("com.facebook.appevents.UserDataStore.internalUserData", "");
            if (string2 == null) {
                string2 = "";
            }
            d.putAll(com.facebook.internal.E.C(string));
            e.putAll(com.facebook.internal.E.C(string2));
            atomicBoolean.set(true);
        } catch (Throwable th) {
            com.facebook.internal.instrument.crashshield.a.a(th, this);
        }
    }

    public final String c(String str, String str2) {
        String str3;
        if (com.facebook.internal.instrument.crashshield.a.b(this)) {
            return null;
        }
        try {
            int length = str2.length() - 1;
            int i = 0;
            boolean z = false;
            while (i <= length) {
                boolean z2 = Intrinsics.compare((int) str2.charAt(!z ? i : length), 32) <= 0;
                if (z) {
                    if (!z2) {
                        break;
                    }
                    length--;
                } else if (z2) {
                    i++;
                } else {
                    z = true;
                }
            }
            String lowerCase = str2.subSequence(i, length + 1).toString().toLowerCase();
            Intrinsics.checkNotNullExpressionValue(lowerCase, "this as java.lang.String).toLowerCase()");
            if (Intrinsics.areEqual("em", str)) {
                if (!Patterns.EMAIL_ADDRESS.matcher(lowerCase).matches()) {
                    return "";
                }
            } else {
                if (Intrinsics.areEqual("ph", str)) {
                    return new Regex("[^0-9]").replace(lowerCase, "");
                }
                if (Intrinsics.areEqual("ge", str)) {
                    if (lowerCase.length() > 0) {
                        str3 = lowerCase.substring(0, 1);
                        Intrinsics.checkNotNullExpressionValue(str3, "this as java.lang.String…ing(startIndex, endIndex)");
                    } else {
                        str3 = "";
                    }
                    return (Intrinsics.areEqual("f", str3) || Intrinsics.areEqual(CmcdData.OBJECT_TYPE_MANIFEST, str3)) ? str3 : "";
                }
            }
            return lowerCase;
        } catch (Throwable th) {
            com.facebook.internal.instrument.crashshield.a.a(th, this);
            return null;
        }
    }

    public final void e(Bundle bundle) {
        if (com.facebook.internal.instrument.crashshield.a.b(this)) {
            return;
        }
        try {
            for (String key : bundle.keySet()) {
                Object obj = bundle.get(key);
                if (obj != null) {
                    String obj2 = obj.toString();
                    boolean z = false;
                    if (!com.facebook.internal.instrument.crashshield.a.b(this)) {
                        try {
                            z = new Regex("[A-Fa-f0-9]{64}").matches(obj2);
                        } catch (Throwable th) {
                            com.facebook.internal.instrument.crashshield.a.a(th, this);
                        }
                    }
                    ConcurrentHashMap<String, String> concurrentHashMap = d;
                    if (z) {
                        String lowerCase = obj2.toLowerCase();
                        Intrinsics.checkNotNullExpressionValue(lowerCase, "this as java.lang.String).toLowerCase()");
                        concurrentHashMap.put(key, lowerCase);
                    } else {
                        Intrinsics.checkNotNullExpressionValue(key, "key");
                        String J = com.facebook.internal.E.J(c(key, obj2));
                        if (J != null) {
                            concurrentHashMap.put(key, J);
                        }
                    }
                }
            }
        } catch (Throwable th2) {
            com.facebook.internal.instrument.crashshield.a.a(th2, this);
        }
    }

    public final void f(final String str, final String str2) {
        if (com.facebook.internal.instrument.crashshield.a.b(this)) {
            return;
        }
        try {
            com.facebook.w.c().execute(new Runnable() { // from class: com.facebook.appevents.G
                @Override // java.lang.Runnable
                public final void run() {
                    String key = str;
                    String value = str2;
                    if (com.facebook.internal.instrument.crashshield.a.b(H.class)) {
                        return;
                    }
                    try {
                        Intrinsics.checkNotNullParameter(key, "$key");
                        Intrinsics.checkNotNullParameter(value, "$value");
                        if (!H.c.get()) {
                            H.a.b();
                        }
                        SharedPreferences sharedPreferences = H.b;
                        if (sharedPreferences == null) {
                            Intrinsics.throwUninitializedPropertyAccessException("sharedPreferences");
                            sharedPreferences = null;
                        }
                        sharedPreferences.edit().putString(key, value).apply();
                    } catch (Throwable th) {
                        com.facebook.internal.instrument.crashshield.a.a(th, H.class);
                    }
                }
            });
        } catch (Throwable th) {
            com.facebook.internal.instrument.crashshield.a.a(th, this);
        }
    }
}
