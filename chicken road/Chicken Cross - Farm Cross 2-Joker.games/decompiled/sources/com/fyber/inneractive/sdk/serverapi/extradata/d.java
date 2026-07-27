package com.fyber.inneractive.sdk.serverapi.extradata;

import android.util.Base64;
import com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters;
import com.fyber.inneractive.sdk.bidder.k;
import com.fyber.inneractive.sdk.config.IAConfigManager;
import com.fyber.inneractive.sdk.config.global.features.g;
import com.fyber.inneractive.sdk.config.global.r;
import com.fyber.inneractive.sdk.config.v;
import com.fyber.inneractive.sdk.config.x;
import com.fyber.inneractive.sdk.config.y;
import com.fyber.inneractive.sdk.external.InneractiveAdManager;
import com.fyber.inneractive.sdk.network.t;
import com.fyber.inneractive.sdk.network.w;
import com.fyber.inneractive.sdk.util.IAlog;
import com.google.firebase.crashlytics.internal.metadata.UserMetadata;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes4.dex */
public final class d {
    public r f;

    /* renamed from: a, reason: collision with root package name */
    public final ConcurrentHashMap f5922a = new ConcurrentHashMap();
    public final AtomicBoolean b = new AtomicBoolean(false);
    public final AtomicBoolean c = new AtomicBoolean(false);
    public final ConcurrentHashMap d = new ConcurrentHashMap();
    public final ConcurrentHashMap e = new ConcurrentHashMap();
    public int g = -1;

    public final TokenParametersOuterClass$TokenParameters a(int i) {
        if (i <= 0) {
            IAlog.a("%sExtra data size limit is invalid: %s", "UserExtraDataManager", Integer.valueOf(i));
            return null;
        }
        IAlog.a("%sExtra data token size limit: %s", "UserExtraDataManager", Integer.valueOf(i));
        k kVar = (k) a(TokenParametersOuterClass$TokenParameters.newBuilder(), new a());
        if (kVar == null) {
            IAlog.a("%sExtra data token is empty", "UserExtraDataManager");
            return null;
        }
        TokenParametersOuterClass$TokenParameters tokenParametersOuterClass$TokenParameters = (TokenParametersOuterClass$TokenParameters) kVar.a();
        String encodeToString = Base64.encodeToString(tokenParametersOuterClass$TokenParameters.toByteArray(), 2);
        if (encodeToString == null) {
            return null;
        }
        int length = encodeToString.length();
        IAlog.a("%sExtra data token size is: %s", "UserExtraDataManager", Integer.valueOf(length));
        if (length <= i) {
            IAlog.a("%sReturning extra data token", "UserExtraDataManager");
            return tokenParametersOuterClass$TokenParameters;
        }
        IAlog.a("%sTrimming extra data from token", "UserExtraDataManager");
        if (this.c.compareAndSet(false, true)) {
            HashMap hashMap = new HashMap();
            hashMap.put("reason", "Token with extra data exceeded limit");
            hashMap.put(UserMetadata.KEYDATA_FILENAME, new JSONArray((Collection) this.d.keySet()));
            a(hashMap);
        }
        return null;
    }

    public final Object a(Object obj, c cVar) {
        Integer num;
        int i;
        r rVar = this.f;
        if (rVar != null) {
            Boolean c = ((g) rVar.a(g.class)).c(com.ironsource.mediationsdk.metadata.a.k);
            boolean booleanValue = c != null ? c.booleanValue() : false;
            IAlog.a("ExtraDataFeature %s", String.valueOf(booleanValue));
            if (booleanValue) {
                if (this.d.isEmpty()) {
                    return null;
                }
                for (Map.Entry entry : this.d.entrySet()) {
                    String str = (String) entry.getKey();
                    String str2 = (String) entry.getValue();
                    if (!this.e.containsKey(str)) {
                        if (str != null) {
                            Set set = (Set) this.f5922a.get("unsupported_keys");
                            if (set == null) {
                                set = new HashSet();
                            }
                            set.add(str);
                            this.f5922a.put("unsupported_keys", set);
                        }
                        IAlog.a("%sCould not set extra data for unsupported key: %s", "UserExtraDataManager", str);
                        this.d.remove(str);
                    } else {
                        if (this.g == -1) {
                            v vVar = IAConfigManager.R.u;
                            if (vVar == null) {
                                IAlog.b("%sGlobalConfigResolver is null, cannot resolve ExtraDataValueMaxLength", new Object[0]);
                            } else {
                                com.fyber.inneractive.sdk.config.r rVar2 = vVar.b;
                                rVar2.getClass();
                                try {
                                    i = Integer.parseInt(rVar2.a("edvml", Integer.toString(512)));
                                } catch (Throwable unused) {
                                    i = 512;
                                }
                                int i2 = i >= 1 ? i : 512;
                                this.g = i2;
                                IAlog.a("%sExtraDataValueMaxLength: %s", "UserExtraDataManager", Integer.valueOf(i2));
                            }
                        }
                        if (str2.length() > this.g) {
                            if (str != null) {
                                Set set2 = (Set) this.f5922a.get("value_too_long_keys");
                                if (set2 == null) {
                                    set2 = new HashSet();
                                }
                                set2.add(str);
                                this.f5922a.put("value_too_long_keys", set2);
                            }
                            IAlog.a("%sCould not set extra data for key: %s, value is too long", "UserExtraDataManager", str);
                            this.d.remove(str);
                        } else {
                            if (str != null && (num = (Integer) this.e.get(str)) != null) {
                                if (num.intValue() == 1) {
                                    if (!InneractiveAdManager.isCurrentUserAChild()) {
                                        y yVar = x.f5294a.b;
                                        if (yVar != null ? yVar.b : false) {
                                        }
                                    }
                                }
                                try {
                                    cVar.a(str, str2, obj);
                                } catch (Exception e) {
                                    IAlog.b("%sCouldn't process entry for %s. %s", "UserExtraDataManager", str, e.getMessage());
                                }
                            }
                            IAlog.a("%sCould not set extra data for key: %s, limited tracking is on", "UserExtraDataManager", str);
                            this.d.remove(str);
                        }
                    }
                }
                if (!this.f5922a.isEmpty() && this.b.compareAndSet(false, true)) {
                    HashMap hashMap = new HashMap();
                    hashMap.put("reason", "Publisher failed to set extra data");
                    for (Map.Entry entry2 : this.f5922a.entrySet()) {
                        if (entry2.getValue() != null) {
                            hashMap.put((String) entry2.getKey(), new JSONArray((Collection) new ArrayList((Collection) entry2.getValue())));
                        }
                    }
                    a(hashMap);
                }
                if (cVar.a(obj)) {
                    return null;
                }
                return obj;
            }
        }
        IAlog.a("%sFeature is disabled, not providing extra data", "UserExtraDataManager");
        return null;
    }

    public static void a(HashMap hashMap) {
        w wVar = new w(t.FIRST_PARTY_EXTRA_DATA_ERROR);
        JSONObject jSONObject = new JSONObject();
        for (Map.Entry entry : hashMap.entrySet()) {
            String str = (String) entry.getKey();
            Object value = entry.getValue();
            try {
                jSONObject.put(str, value);
            } catch (Exception unused) {
                IAlog.f("Got exception adding param to json object: %s, %s", str, value);
            }
        }
        wVar.f.put(jSONObject);
        wVar.a((String) null);
    }
}
