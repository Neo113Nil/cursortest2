package com.ironsource.sdk.controller;

import com.ironsource.C4491k4;
import com.ironsource.C4549n8;
import com.ironsource.C4551na;
import com.ironsource.C4569oa;
import com.ironsource.C4710w8;
import com.ironsource.InterfaceC4533ma;
import com.ironsource.Nc;
import com.ironsource.S5;
import com.ironsource.U5;
import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.sdk.utils.IronSourceStorageUtils;
import org.json.JSONObject;

/* loaded from: classes6.dex */
class j {

    /* renamed from: a, reason: collision with root package name */
    private final String f8580a;
    private final U5 b;

    j(String str, U5 u5) {
        this.f8580a = str;
        this.b = u5;
    }

    private C4710w8 b(JSONObject jSONObject, String str) throws Exception {
        if (!jSONObject.has(S5.c.c) || !jSONObject.has(S5.c.b)) {
            throw new Exception(S5.a.f7886a);
        }
        String string = jSONObject.getString(S5.c.c);
        return new C4710w8(IronSourceStorageUtils.buildAbsolutePathToDirInCache(str, string), jSONObject.getString(S5.c.b));
    }

    void a(JSONObject jSONObject, InterfaceC4533ma interfaceC4533ma) {
        char c;
        C4551na c4551na = new C4551na(jSONObject);
        C4569oa c4569oa = new C4569oa(interfaceC4533ma);
        try {
            String b = c4551na.b();
            JSONObject c2 = c4551na.c();
            C4710w8 b2 = b(c2, this.f8580a);
            IronSourceStorageUtils.ensurePathSafety(b2, this.f8580a);
            switch (b.hashCode()) {
                case -2073025383:
                    if (b.equals(S5.b.f7887a)) {
                        c = 0;
                        break;
                    }
                    c = 65535;
                    break;
                case -1137024519:
                    if (b.equals("deleteFolder")) {
                        c = 2;
                        break;
                    }
                    c = 65535;
                    break;
                case -318115535:
                    if (b.equals(S5.b.e)) {
                        c = 4;
                        break;
                    }
                    c = 65535;
                    break;
                case 537556755:
                    if (b.equals(S5.b.f)) {
                        c = 5;
                        break;
                    }
                    c = 65535;
                    break;
                case 1764172231:
                    if (b.equals("deleteFile")) {
                        c = 1;
                        break;
                    }
                    c = 65535;
                    break;
                case 1953259713:
                    if (b.equals(S5.b.d)) {
                        c = 3;
                        break;
                    }
                    c = 65535;
                    break;
                default:
                    c = 65535;
                    break;
            }
            if (c == 0) {
                this.b.a(b2, c2.optString(S5.c.f7888a), c2.optInt("connectionTimeout"), c2.optInt("readTimeout"), a(c4551na, c4569oa));
                return;
            }
            if (c == 1) {
                this.b.a(b2);
                c4569oa.b(c4551na, a(c4551na, b2.a()));
                return;
            }
            if (c == 2) {
                this.b.b(b2);
                c4569oa.b(c4551na, a(c4551na, b2.a()));
                return;
            }
            if (c == 3) {
                c4569oa.b(c4551na, a(c4551na, this.b.c(b2)));
                return;
            }
            if (c == 4) {
                c4569oa.b(c4551na, a(c4551na, this.b.d(b2)));
            } else {
                if (c != 5) {
                    return;
                }
                this.b.a(b2, c2.optJSONObject(S5.c.g));
                c4569oa.b(c4551na, a(c4551na, b2.a()));
            }
        } catch (Exception e) {
            C4491k4.d().a(e);
            c4569oa.a(c4551na, a(c4551na, e.getMessage()));
        }
    }

    class a implements Nc {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ C4569oa f8581a;
        final /* synthetic */ C4551na b;

        a(C4569oa c4569oa, C4551na c4551na) {
            this.f8581a = c4569oa;
            this.b = c4551na;
        }

        @Override // com.ironsource.Nc
        public void a(C4710w8 c4710w8) {
            try {
                C4569oa c4569oa = this.f8581a;
                C4551na c4551na = this.b;
                c4569oa.b(c4551na, j.this.a(c4551na, c4710w8.a()));
            } catch (Exception e) {
                C4491k4.d().a(e);
                IronLog.INTERNAL.error(e.toString());
            }
        }

        @Override // com.ironsource.Nc
        public void a(C4710w8 c4710w8, C4549n8 c4549n8) {
            try {
                C4569oa c4569oa = this.f8581a;
                C4551na c4551na = this.b;
                c4569oa.a(c4551na, j.this.a(c4551na, c4549n8.b()));
            } catch (Exception e) {
                C4491k4.d().a(e);
                IronLog.INTERNAL.error(e.toString());
            }
        }
    }

    private Nc a(C4551na c4551na, C4569oa c4569oa) {
        return new a(c4569oa, c4551na);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public JSONObject a(C4551na c4551na, JSONObject jSONObject) {
        try {
            return c4551na.e().put("result", jSONObject);
        } catch (Exception e) {
            C4491k4.d().a(e);
            IronLog.INTERNAL.error(e.toString());
            return new JSONObject();
        }
    }

    private JSONObject a(C4551na c4551na, long j) {
        try {
            return c4551na.e().put("result", j);
        } catch (Exception e) {
            C4491k4.d().a(e);
            IronLog.INTERNAL.error(e.toString());
            return new JSONObject();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public JSONObject a(C4551na c4551na, String str) {
        try {
            return c4551na.e().put("errMsg", str);
        } catch (Exception e) {
            C4491k4.d().a(e);
            IronLog.INTERNAL.error(e.toString());
            return new JSONObject();
        }
    }

    private C4710w8 a(JSONObject jSONObject, String str) throws Exception {
        if (jSONObject.has(S5.c.d)) {
            return new C4710w8(IronSourceStorageUtils.buildAbsolutePathToDirInCache(str, jSONObject.getString(S5.c.d)));
        }
        throw new Exception(S5.a.b);
    }
}
