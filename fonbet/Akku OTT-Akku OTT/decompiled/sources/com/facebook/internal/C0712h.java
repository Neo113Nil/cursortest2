package com.facebook.internal;

import com.facebook.t;
import com.google.android.gms.wallet.WalletConstants;
import com.google.firebase.analytics.FirebaseAnalytics;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import kotlin.TuplesKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: com.facebook.internal.h, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C0712h {
    public static final a Companion = new a();
    public static C0712h d;
    public final Map<Integer, Set<Integer>> a;
    public final Map<Integer, Set<Integer>> b;
    public final Map<Integer, Set<Integer>> c;

    /* renamed from: com.facebook.internal.h$a */
    public static final class a {
        public static C0712h b() {
            return new C0712h(null, MapsKt.hashMapOf(TuplesKt.to(2, null), TuplesKt.to(4, null), TuplesKt.to(9, null), TuplesKt.to(17, null), TuplesKt.to(341, null)), MapsKt.hashMapOf(TuplesKt.to(102, null), TuplesKt.to(190, null), TuplesKt.to(Integer.valueOf(WalletConstants.ERROR_CODE_UNSUPPORTED_API_VERSION), null)), null, null, null);
        }

        public static HashMap c(JSONObject jSONObject) {
            int optInt;
            HashSet hashSet;
            JSONArray optJSONArray = jSONObject.optJSONArray(FirebaseAnalytics.Param.ITEMS);
            if (optJSONArray == null || optJSONArray.length() == 0) {
                return null;
            }
            HashMap hashMap = new HashMap();
            int length = optJSONArray.length();
            for (int i = 0; i < length; i++) {
                JSONObject optJSONObject = optJSONArray.optJSONObject(i);
                if (optJSONObject != null && (optInt = optJSONObject.optInt("code")) != 0) {
                    JSONArray optJSONArray2 = optJSONObject.optJSONArray("subcodes");
                    if (optJSONArray2 == null || optJSONArray2.length() <= 0) {
                        hashSet = null;
                    } else {
                        hashSet = new HashSet();
                        int length2 = optJSONArray2.length();
                        for (int i2 = 0; i2 < length2; i2++) {
                            int optInt2 = optJSONArray2.optInt(i2);
                            if (optInt2 != 0) {
                                hashSet.add(Integer.valueOf(optInt2));
                            }
                        }
                    }
                    hashMap.put(Integer.valueOf(optInt), hashSet);
                }
            }
            return hashMap;
        }

        public final synchronized C0712h a() {
            C0712h c0712h;
            try {
                if (C0712h.d == null) {
                    C0712h.d = b();
                }
                c0712h = C0712h.d;
                Intrinsics.checkNotNull(c0712h, "null cannot be cast to non-null type com.facebook.internal.FacebookRequestErrorClassification");
            } catch (Throwable th) {
                throw th;
            }
            return c0712h;
        }
    }

    /* renamed from: com.facebook.internal.h$b */
    public /* synthetic */ class b {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[t.a.values().length];
            try {
                iArr[1] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[0] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[2] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public C0712h(HashMap hashMap, HashMap hashMap2, HashMap hashMap3, String str, String str2, String str3) {
        this.a = hashMap;
        this.b = hashMap2;
        this.c = hashMap3;
    }
}
