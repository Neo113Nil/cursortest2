package com.fyber.inneractive.sdk.network;

/* loaded from: classes3.dex */
public final class w {
    public static final java.text.SimpleDateFormat h = new java.text.SimpleDateFormat("yyyy-MM-dd", java.util.Locale.US);

    /* renamed from: a, reason: collision with root package name */
    public com.fyber.inneractive.sdk.external.InneractiveAdRequest f3860a;
    public com.fyber.inneractive.sdk.network.t b;
    public com.fyber.inneractive.sdk.network.u c;
    public org.json.JSONArray d;
    public final com.fyber.inneractive.sdk.response.e e;
    public final org.json.JSONArray f;
    public boolean g;

    public w(com.fyber.inneractive.sdk.network.t tVar) {
        this((com.fyber.inneractive.sdk.response.e) null);
        this.b = tVar;
        this.f3860a = null;
        this.d = null;
    }

    public final com.fyber.inneractive.sdk.network.w a(java.lang.Object... objArr) {
        if (objArr.length > 0) {
            org.json.JSONObject jSONObject = new org.json.JSONObject();
            for (int i = 0; i < objArr.length - 1; i += 2) {
                java.lang.String obj = objArr[i].toString();
                java.lang.Object obj2 = objArr[i + 1];
                try {
                    jSONObject.put(obj, obj2);
                } catch (java.lang.Exception unused) {
                    com.fyber.inneractive.sdk.util.IAlog.f("Got exception adding param to json object: %s, %s", obj, obj2);
                }
            }
            this.f.put(jSONObject);
        }
        return this;
    }

    public w(com.fyber.inneractive.sdk.network.t tVar, com.fyber.inneractive.sdk.external.InneractiveAdRequest inneractiveAdRequest, com.fyber.inneractive.sdk.response.e eVar) {
        this(eVar);
        this.b = tVar;
        this.f3860a = inneractiveAdRequest;
        this.d = null;
    }

    public w(com.fyber.inneractive.sdk.network.u uVar) {
        this((com.fyber.inneractive.sdk.response.e) null);
        this.c = uVar;
        this.f3860a = null;
        this.d = null;
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x017d  */
    /* JADX WARN: Removed duplicated region for block: B:101:0x016e  */
    /* JADX WARN: Removed duplicated region for block: B:102:0x0149  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0139  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x0147  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0163  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x017b  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x0188  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x018b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void a(java.lang.String str) {
        java.lang.String str2;
        java.lang.String str3;
        java.lang.Long l;
        java.lang.String str4;
        java.lang.String str5;
        java.lang.String str6;
        java.lang.String str7;
        java.lang.String str8;
        com.fyber.inneractive.sdk.config.enums.UnitDisplayType unitDisplayType;
        com.fyber.inneractive.sdk.external.InneractiveAdRequest inneractiveAdRequest;
        com.fyber.inneractive.sdk.response.e eVar;
        com.fyber.inneractive.sdk.config.enums.UnitDisplayType unitDisplayType2;
        boolean isDeprecated;
        com.fyber.inneractive.sdk.config.enums.UnitDisplayType unitDisplayType3;
        if (!com.fyber.inneractive.sdk.network.u.IA_IAB_NO_CMP_FOUND.equals(this.c) && !com.fyber.inneractive.sdk.network.u.INVALID_GDPR_APPLIES_FLAG.equals(this.c) && com.fyber.inneractive.sdk.config.IAConfigManager.c() && !com.fyber.inneractive.sdk.network.u.IA_IAB_GDPR_TCF_PURPOSE_1_DISABLED.equals(this.c)) {
            java.lang.String a2 = com.fyber.inneractive.sdk.util.IAlog.a(this);
            java.lang.Object obj = this.c;
            if (obj == null) {
                obj = this.b;
            }
            com.fyber.inneractive.sdk.util.IAlog.a("%sSdk event dispatcher - aborting dispatch: %s", a2, obj);
            return;
        }
        com.fyber.inneractive.sdk.response.e eVar2 = this.e;
        if (eVar2 != null) {
            com.fyber.inneractive.sdk.external.ImpressionData impressionData = eVar2.r;
            java.lang.String impressionId = impressionData != null ? impressionData.getImpressionId() : null;
            com.fyber.inneractive.sdk.external.ImpressionData impressionData2 = this.e.r;
            java.lang.String demandSource = impressionData2 != null ? impressionData2.getDemandSource() : null;
            com.fyber.inneractive.sdk.external.ImpressionData impressionData3 = this.e.r;
            java.lang.Long demandId = impressionData3 != null ? impressionData3.getDemandId() : null;
            com.fyber.inneractive.sdk.external.ImpressionData impressionData4 = this.e.r;
            java.lang.String creativeId = impressionData4 != null ? impressionData4.getCreativeId() : null;
            com.fyber.inneractive.sdk.external.ImpressionData impressionData5 = this.e.r;
            java.lang.String advertiserDomain = impressionData5 != null ? impressionData5.getAdvertiserDomain() : null;
            com.fyber.inneractive.sdk.external.ImpressionData impressionData6 = this.e.r;
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
        com.fyber.inneractive.sdk.config.IAConfigManager iAConfigManager = com.fyber.inneractive.sdk.config.IAConfigManager.N;
        com.fyber.inneractive.sdk.network.y yVar = new com.fyber.inneractive.sdk.network.y(iAConfigManager.c, str2, str3, l, str4, str5, str6, str);
        com.fyber.inneractive.sdk.external.InneractiveAdRequest inneractiveAdRequest2 = this.f3860a;
        com.fyber.inneractive.sdk.config.s0 selectedUnitConfig = inneractiveAdRequest2 == null ? null : inneractiveAdRequest2.getSelectedUnitConfig();
        if (selectedUnitConfig != null) {
            com.fyber.inneractive.sdk.config.r0 r0Var = (com.fyber.inneractive.sdk.config.r0) selectedUnitConfig;
            com.fyber.inneractive.sdk.config.o0 o0Var = r0Var.d;
            com.fyber.inneractive.sdk.config.enums.Track track = com.fyber.inneractive.sdk.config.enums.Track.ERRORS;
            java.util.Set set = o0Var.f3623a;
            if (set == null || !set.contains(track)) {
                return;
            }
            com.fyber.inneractive.sdk.config.l0 l0Var = r0Var.c;
            if (l0Var != null && (unitDisplayType3 = l0Var.b) != null) {
                isDeprecated = unitDisplayType3.isDeprecated();
            } else {
                com.fyber.inneractive.sdk.config.t0 t0Var = r0Var.f;
                if (t0Var != null && (unitDisplayType2 = t0Var.j) != null) {
                    isDeprecated = unitDisplayType2.isDeprecated();
                }
            }
            if (isDeprecated) {
                return;
            }
        }
        if (selectedUnitConfig == null && (eVar = this.e) != null) {
            com.fyber.inneractive.sdk.config.a.a(eVar.m);
        }
        com.fyber.inneractive.sdk.response.e eVar3 = this.e;
        java.lang.String str9 = eVar3 == null ? null : eVar3.d;
        java.lang.String str10 = android.text.TextUtils.isEmpty(iAConfigManager.s) ? null : iAConfigManager.s;
        if (this.b == null && this.c == null) {
            com.fyber.inneractive.sdk.util.IAlog.a("Sdk event dispatcher - error id or event id must be provided", new java.lang.Object[0]);
            return;
        }
        com.fyber.inneractive.sdk.external.InneractiveAdRequest inneractiveAdRequest3 = this.f3860a;
        if (inneractiveAdRequest3 != null) {
            str8 = inneractiveAdRequest3.getSpotId();
        } else {
            com.fyber.inneractive.sdk.response.e eVar4 = this.e;
            if (eVar4 != null) {
                str8 = eVar4.z;
            } else {
                str7 = null;
                java.lang.StringBuilder sb = new java.lang.StringBuilder();
                if (!android.text.TextUtils.isEmpty(iAConfigManager.l)) {
                    sb.append(iAConfigManager.l);
                    sb.append("_");
                }
                com.fyber.inneractive.sdk.response.e eVar5 = this.e;
                unitDisplayType = eVar5 != null ? null : eVar5.n;
                if (unitDisplayType == null && (inneractiveAdRequest = this.f3860a) != null && inneractiveAdRequest.getSpotId() != null) {
                    unitDisplayType = com.fyber.inneractive.sdk.serverapi.b.a(this.f3860a.getSpotId());
                }
                sb.append(unitDisplayType == null ? unitDisplayType.name().toLowerCase(java.util.Locale.US) : "unknown");
                java.lang.String sb2 = sb.toString();
                com.fyber.inneractive.sdk.response.e eVar6 = this.e;
                java.lang.Integer valueOf = eVar6 != null ? null : java.lang.Integer.valueOf(eVar6.g);
                com.fyber.inneractive.sdk.response.e eVar7 = this.e;
                com.fyber.inneractive.sdk.util.r.f4308a.execute(new com.fyber.inneractive.sdk.network.v(this, yVar, str9, str10, sb2, str7, valueOf, eVar7 != null ? "" : eVar7.h));
            }
        }
        str7 = str8;
        java.lang.StringBuilder sb3 = new java.lang.StringBuilder();
        if (!android.text.TextUtils.isEmpty(iAConfigManager.l)) {
        }
        com.fyber.inneractive.sdk.response.e eVar52 = this.e;
        if (eVar52 != null) {
        }
        if (unitDisplayType == null) {
            unitDisplayType = com.fyber.inneractive.sdk.serverapi.b.a(this.f3860a.getSpotId());
        }
        sb3.append(unitDisplayType == null ? unitDisplayType.name().toLowerCase(java.util.Locale.US) : "unknown");
        java.lang.String sb22 = sb3.toString();
        com.fyber.inneractive.sdk.response.e eVar62 = this.e;
        if (eVar62 != null) {
        }
        com.fyber.inneractive.sdk.response.e eVar72 = this.e;
        com.fyber.inneractive.sdk.util.r.f4308a.execute(new com.fyber.inneractive.sdk.network.v(this, yVar, str9, str10, sb22, str7, valueOf, eVar72 != null ? "" : eVar72.h));
    }

    public w(com.fyber.inneractive.sdk.network.u uVar, com.fyber.inneractive.sdk.external.InneractiveAdRequest inneractiveAdRequest, com.fyber.inneractive.sdk.response.e eVar) {
        this(eVar);
        this.c = uVar;
        this.f3860a = inneractiveAdRequest;
        this.d = null;
    }

    public w(com.fyber.inneractive.sdk.response.e eVar) {
        this.g = false;
        this.e = eVar;
        this.f = new org.json.JSONArray();
    }
}
