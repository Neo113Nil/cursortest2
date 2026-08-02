package com.facebook.appevents.integrity;

import android.os.Bundle;
import com.facebook.internal.E;
import io.flutter.plugins.firebase.crashlytics.Constants;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Locale;
import java.util.Set;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.Regex;
import org.json.JSONArray;
import org.json.JSONObject;

@SourceDebugExtension({"SMAP\nStdParamsEnforcementManager.kt\nKotlin\n*S Kotlin\n*F\n+ 1 StdParamsEnforcementManager.kt\ncom/facebook/appevents/integrity/StdParamsEnforcementManager\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,129:1\n1#2:130\n1855#3,2:131\n1747#3,3:133\n1747#3,3:136\n*S KotlinDebug\n*F\n+ 1 StdParamsEnforcementManager.kt\ncom/facebook/appevents/integrity/StdParamsEnforcementManager\n*L\n115#1:131,2\n121#1:133,3\n125#1:136,3\n*E\n"})
/* loaded from: classes3.dex */
public final class h {
    public static boolean b;
    public static final h a = new h();
    public static final HashMap c = new HashMap();
    public static final HashMap d = new HashMap();

    @JvmStatic
    public static final void c(Bundle bundle) {
        h hVar = a;
        HashMap hashMap = d;
        if (com.facebook.internal.instrument.crashshield.a.b(h.class)) {
            return;
        }
        try {
            if (b && bundle != null) {
                ArrayList arrayList = new ArrayList();
                for (String key : bundle.keySet()) {
                    String valueOf = String.valueOf(bundle.get(key));
                    HashMap hashMap2 = c;
                    boolean z = false;
                    boolean z2 = hashMap2.get(key) != null;
                    boolean z3 = hashMap.get(key) != null;
                    if (z2 || z3) {
                        Set set = (Set) hashMap2.get(key);
                        hVar.getClass();
                        if (!com.facebook.internal.instrument.crashshield.a.b(hVar) && set != null) {
                            try {
                                Set set2 = set;
                                if (!(set2 instanceof Collection) || !set2.isEmpty()) {
                                    Iterator it = set2.iterator();
                                    while (true) {
                                        if (it.hasNext()) {
                                            if (new Regex((String) it.next()).matches(valueOf)) {
                                                z = true;
                                                break;
                                            }
                                        } else {
                                            break;
                                        }
                                    }
                                }
                            } catch (Throwable th) {
                                com.facebook.internal.instrument.crashshield.a.a(th, hVar);
                            }
                        }
                        boolean b2 = hVar.b(valueOf, (Set) hashMap.get(key));
                        if (!z && !b2) {
                            Intrinsics.checkNotNullExpressionValue(key, "key");
                            arrayList.add(key);
                        }
                    }
                }
                Iterator it2 = arrayList.iterator();
                while (it2.hasNext()) {
                    bundle.remove((String) it2.next());
                }
            }
        } catch (Throwable th2) {
            com.facebook.internal.instrument.crashshield.a.a(th2, h.class);
        }
    }

    public final void a(JSONArray jSONArray) {
        HashSet<String> hashSet;
        HashMap hashMap = c;
        HashMap hashMap2 = d;
        if (com.facebook.internal.instrument.crashshield.a.b(this) || jSONArray == null) {
            return;
        }
        try {
            if (b) {
                return;
            }
            int length = jSONArray.length();
            for (int i = 0; i < length; i++) {
                JSONObject jSONObject = jSONArray.getJSONObject(i);
                String key = jSONObject.getString(Constants.KEY);
                if (key != null && key.length() != 0) {
                    try {
                        JSONArray jSONArray2 = jSONObject.getJSONArray("value");
                        int length2 = jSONArray2.length();
                        for (int i2 = 0; i2 < length2; i2++) {
                            boolean z = jSONArray2.getJSONObject(i2).getBoolean("require_exact_match");
                            JSONArray jSONArray3 = jSONArray2.getJSONObject(i2).getJSONArray("potential_matches");
                            HashSet<String> hashSet2 = null;
                            if (!com.facebook.internal.instrument.crashshield.a.b(this)) {
                                try {
                                    try {
                                        hashSet = E.e(jSONArray3);
                                        if (hashSet == null) {
                                            hashSet = new HashSet<>();
                                        }
                                    } catch (Exception unused) {
                                        hashSet = new HashSet<>();
                                    }
                                    hashSet2 = hashSet;
                                } catch (Throwable th) {
                                    com.facebook.internal.instrument.crashshield.a.a(th, this);
                                }
                            }
                            if (z) {
                                Intrinsics.checkNotNullExpressionValue(key, "key");
                                HashSet<String> hashSet3 = (HashSet) hashMap2.get(key);
                                if (hashSet3 != null) {
                                    hashSet3.addAll(hashSet2);
                                    hashSet2 = hashSet3;
                                }
                                hashMap2.put(key, hashSet2);
                            } else {
                                Intrinsics.checkNotNullExpressionValue(key, "key");
                                HashSet<String> hashSet4 = (HashSet) hashMap.get(key);
                                if (hashSet4 != null) {
                                    hashSet4.addAll(hashSet2);
                                    hashSet2 = hashSet4;
                                }
                                hashMap.put(key, hashSet2);
                            }
                        }
                    } catch (Exception unused2) {
                        hashMap2.remove(key);
                        hashMap.remove(key);
                    }
                }
            }
        } catch (Throwable th2) {
            com.facebook.internal.instrument.crashshield.a.a(th2, this);
        }
    }

    public final boolean b(String str, Set<String> set) {
        if (!com.facebook.internal.instrument.crashshield.a.b(this) && set != null) {
            try {
                Set<String> set2 = set;
                if (!(set2 instanceof Collection) || !set2.isEmpty()) {
                    for (String str2 : set2) {
                        Locale locale = Locale.ROOT;
                        String lowerCase = str2.toLowerCase(locale);
                        Intrinsics.checkNotNullExpressionValue(lowerCase, "this as java.lang.String).toLowerCase(Locale.ROOT)");
                        String lowerCase2 = str.toLowerCase(locale);
                        Intrinsics.checkNotNullExpressionValue(lowerCase2, "this as java.lang.String).toLowerCase(Locale.ROOT)");
                        if (Intrinsics.areEqual(lowerCase, lowerCase2)) {
                            return true;
                        }
                    }
                }
            } catch (Throwable th) {
                com.facebook.internal.instrument.crashshield.a.a(th, this);
            }
        }
        return false;
    }
}
