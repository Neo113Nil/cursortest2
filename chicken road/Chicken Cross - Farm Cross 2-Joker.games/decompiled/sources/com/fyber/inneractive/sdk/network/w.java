package com.fyber.inneractive.sdk.network;

import android.text.TextUtils;
import com.fyber.inneractive.sdk.config.IAConfigManager;
import com.fyber.inneractive.sdk.config.enums.Track;
import com.fyber.inneractive.sdk.config.enums.UnitDisplayType;
import com.fyber.inneractive.sdk.external.ImpressionData;
import com.fyber.inneractive.sdk.external.InneractiveAdRequest;
import com.fyber.inneractive.sdk.util.IAlog;
import java.text.SimpleDateFormat;
import java.util.Locale;
import java.util.Set;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes4.dex */
public final class w {
    public static final SimpleDateFormat h = new SimpleDateFormat("yyyy-MM-dd", Locale.US);

    /* renamed from: a, reason: collision with root package name */
    public InneractiveAdRequest f5514a;
    public t b;
    public u c;
    public JSONArray d;
    public final com.fyber.inneractive.sdk.response.e e;
    public final JSONArray f;
    public boolean g;

    public w(t tVar) {
        this((com.fyber.inneractive.sdk.response.e) null);
        this.b = tVar;
        this.f5514a = null;
        this.d = null;
    }

    public final w a(Object... objArr) {
        if (objArr.length > 0) {
            JSONObject jSONObject = new JSONObject();
            for (int i = 0; i < objArr.length - 1; i += 2) {
                String obj = objArr[i].toString();
                Object obj2 = objArr[i + 1];
                try {
                    jSONObject.put(obj, obj2);
                } catch (Exception unused) {
                    IAlog.f("Got exception adding param to json object: %s, %s", obj, obj2);
                }
            }
            this.f.put(jSONObject);
        }
        return this;
    }

    public w(t tVar, InneractiveAdRequest inneractiveAdRequest, com.fyber.inneractive.sdk.response.e eVar) {
        this(eVar);
        this.b = tVar;
        this.f5514a = inneractiveAdRequest;
        this.d = null;
    }

    public w(u uVar) {
        this((com.fyber.inneractive.sdk.response.e) null);
        this.c = uVar;
        this.f5514a = null;
        this.d = null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:57:0x00f4, code lost:
    
        if (r5 != false) goto L72;
     */
    /* JADX WARN: Removed duplicated region for block: B:102:0x018a  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x0197  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x019a  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x018c  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x017d  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x0158  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0147  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0156  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x0172  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean a(String str) {
        String str2;
        String str3;
        Long l;
        String str4;
        String str5;
        String str6;
        String str7;
        String str8;
        UnitDisplayType unitDisplayType;
        InneractiveAdRequest inneractiveAdRequest;
        com.fyber.inneractive.sdk.response.e eVar;
        boolean isDeprecated;
        UnitDisplayType unitDisplayType2;
        UnitDisplayType unitDisplayType3;
        IAConfigManager iAConfigManager = IAConfigManager.R;
        if (iAConfigManager.L.get() || iAConfigManager.f != null) {
            if (!u.IA_IAB_NO_CMP_FOUND.equals(this.c) && !u.INVALID_GDPR_APPLIES_FLAG.equals(this.c) && IAConfigManager.c() && !u.IA_IAB_GDPR_TCF_PURPOSE_1_DISABLED.equals(this.c)) {
                String a2 = IAlog.a(this);
                Object obj = this.c;
                if (obj == null) {
                    obj = this.b;
                }
                IAlog.a("%sSdk event dispatcher, Purpose 1 disabled - aborting dispatch: %s", a2, obj);
                return false;
            }
            com.fyber.inneractive.sdk.response.e eVar2 = this.e;
            if (eVar2 != null) {
                ImpressionData impressionData = eVar2.r;
                String impressionId = impressionData != null ? impressionData.getImpressionId() : null;
                ImpressionData impressionData2 = this.e.r;
                String demandSource = impressionData2 != null ? impressionData2.getDemandSource() : null;
                ImpressionData impressionData3 = this.e.r;
                Long demandId = impressionData3 != null ? impressionData3.getDemandId() : null;
                ImpressionData impressionData4 = this.e.r;
                String creativeId = impressionData4 != null ? impressionData4.getCreativeId() : null;
                ImpressionData impressionData5 = this.e.r;
                String advertiserDomain = impressionData5 != null ? impressionData5.getAdvertiserDomain() : null;
                ImpressionData impressionData6 = this.e.r;
                if (impressionData6 != null) {
                    str2 = impressionId;
                    str3 = demandSource;
                    l = demandId;
                    str4 = creativeId;
                    str5 = advertiserDomain;
                    str6 = impressionData6.getCampaignId();
                } else {
                    str2 = impressionId;
                    str6 = null;
                    str3 = demandSource;
                    l = demandId;
                    str4 = creativeId;
                    str5 = advertiserDomain;
                }
            } else {
                str2 = null;
                str3 = null;
                l = null;
                str4 = null;
                str5 = null;
                str6 = null;
            }
            y yVar = new y(iAConfigManager.c, str2, str3, l, str4, str5, str6, str);
            InneractiveAdRequest inneractiveAdRequest2 = this.f5514a;
            com.fyber.inneractive.sdk.config.x0 selectedUnitConfig = inneractiveAdRequest2 == null ? null : inneractiveAdRequest2.getSelectedUnitConfig();
            if (selectedUnitConfig != null) {
                com.fyber.inneractive.sdk.config.w0 w0Var = (com.fyber.inneractive.sdk.config.w0) selectedUnitConfig;
                com.fyber.inneractive.sdk.config.t0 t0Var = w0Var.d;
                Track track = Track.ERRORS;
                Set set = t0Var.f5289a;
                if (set == null ? false : set.contains(track)) {
                    com.fyber.inneractive.sdk.config.q0 q0Var = w0Var.c;
                    if (q0Var != null && (unitDisplayType3 = q0Var.b) != null) {
                        isDeprecated = unitDisplayType3.isDeprecated();
                    } else {
                        com.fyber.inneractive.sdk.config.y0 y0Var = w0Var.f;
                        isDeprecated = (y0Var == null || (unitDisplayType2 = y0Var.j) == null) ? false : unitDisplayType2.isDeprecated();
                    }
                }
                return false;
            }
            if (selectedUnitConfig == null && (eVar = this.e) != null) {
                com.fyber.inneractive.sdk.config.a.a(eVar.m);
            }
            com.fyber.inneractive.sdk.response.e eVar3 = this.e;
            String str9 = eVar3 == null ? null : eVar3.d;
            String str10 = TextUtils.isEmpty(iAConfigManager.t) ? null : iAConfigManager.t;
            if (this.b == null && this.c == null) {
                IAlog.a("Sdk event dispatcher - error id or event id must be provided", new Object[0]);
                return false;
            }
            InneractiveAdRequest inneractiveAdRequest3 = this.f5514a;
            if (inneractiveAdRequest3 != null) {
                str8 = inneractiveAdRequest3.getSpotId();
            } else {
                com.fyber.inneractive.sdk.response.e eVar4 = this.e;
                if (eVar4 != null) {
                    str8 = eVar4.z;
                } else {
                    str7 = null;
                    StringBuilder sb = new StringBuilder();
                    if (!TextUtils.isEmpty(iAConfigManager.m)) {
                        sb.append(iAConfigManager.m).append("_");
                    }
                    com.fyber.inneractive.sdk.response.e eVar5 = this.e;
                    unitDisplayType = eVar5 != null ? null : eVar5.n;
                    if (unitDisplayType == null && (inneractiveAdRequest = this.f5514a) != null && inneractiveAdRequest.getSpotId() != null) {
                        unitDisplayType = com.fyber.inneractive.sdk.serverapi.b.a(this.f5514a.getSpotId());
                    }
                    sb.append(unitDisplayType == null ? unitDisplayType.name().toLowerCase(Locale.US) : "unknown");
                    String sb2 = sb.toString();
                    com.fyber.inneractive.sdk.response.e eVar6 = this.e;
                    Integer valueOf = eVar6 != null ? null : Integer.valueOf(eVar6.g);
                    com.fyber.inneractive.sdk.response.e eVar7 = this.e;
                    com.fyber.inneractive.sdk.util.r.f5965a.execute(new v(this, yVar, str9, str10, sb2, str7, valueOf, eVar7 != null ? "" : eVar7.h));
                    return true;
                }
            }
            str7 = str8;
            StringBuilder sb3 = new StringBuilder();
            if (!TextUtils.isEmpty(iAConfigManager.m)) {
            }
            com.fyber.inneractive.sdk.response.e eVar52 = this.e;
            if (eVar52 != null) {
            }
            if (unitDisplayType == null) {
                unitDisplayType = com.fyber.inneractive.sdk.serverapi.b.a(this.f5514a.getSpotId());
            }
            sb3.append(unitDisplayType == null ? unitDisplayType.name().toLowerCase(Locale.US) : "unknown");
            String sb22 = sb3.toString();
            com.fyber.inneractive.sdk.response.e eVar62 = this.e;
            if (eVar62 != null) {
            }
            com.fyber.inneractive.sdk.response.e eVar72 = this.e;
            com.fyber.inneractive.sdk.util.r.f5965a.execute(new v(this, yVar, str9, str10, sb22, str7, valueOf, eVar72 != null ? "" : eVar72.h));
            return true;
        }
        String a3 = IAlog.a(this);
        Object obj2 = this.c;
        if (obj2 == null) {
            obj2 = this.b;
        }
        IAlog.a("%sSdk event dispatcher, GDPR header missing - aborting dispatch: %s", a3, obj2);
        return false;
    }

    public w(u uVar, InneractiveAdRequest inneractiveAdRequest, com.fyber.inneractive.sdk.response.e eVar) {
        this(eVar);
        this.c = uVar;
        this.f5514a = inneractiveAdRequest;
        this.d = null;
    }

    public w(com.fyber.inneractive.sdk.response.e eVar) {
        this.g = false;
        this.e = eVar;
        this.f = new JSONArray();
    }
}
