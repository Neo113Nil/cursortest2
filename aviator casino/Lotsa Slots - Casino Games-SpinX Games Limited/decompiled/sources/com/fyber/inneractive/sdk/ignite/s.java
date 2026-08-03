package com.fyber.inneractive.sdk.ignite;

/* loaded from: classes3.dex */
public final class s extends com.digitalturbine.ignite.cl.aidl.IIgniteServiceCallback.Stub {

    /* renamed from: a, reason: collision with root package name */
    public final com.fyber.inneractive.sdk.ignite.r f3781a;
    public final com.fyber.inneractive.sdk.ignite.c b;

    public s(com.fyber.inneractive.sdk.ignite.e eVar, com.fyber.inneractive.sdk.ignite.c cVar) {
        this.f3781a = eVar;
        this.b = cVar;
    }

    public static java.lang.String a(java.lang.String str) {
        try {
            return new org.json.JSONObject(str).optString("taskId");
        } catch (java.lang.Exception unused) {
            return null;
        }
    }

    /* JADX WARN: Can't wrap try/catch for region: R(9:3|(2:4|5)|(6:7|8|9|(1:11)|13|14)|18|8|9|(0)|13|14) */
    /* JADX WARN: Removed duplicated region for block: B:11:0x0034 A[Catch: Exception -> 0x003a, TRY_LEAVE, TryCatch #0 {Exception -> 0x003a, blocks: (B:9:0x0029, B:11:0x0034), top: B:8:0x0029 }] */
    @Override // com.digitalturbine.ignite.cl.aidl.IIgniteServiceCallback
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void onError(java.lang.String str) {
        java.lang.String str2;
        org.json.JSONObject optJSONObject;
        org.json.JSONObject optJSONObject2;
        com.fyber.inneractive.sdk.util.IAlog.a("InstallCallback onError %s", str);
        if (this.f3781a != null) {
            java.lang.String a2 = a(str);
            java.lang.String str3 = null;
            try {
                optJSONObject2 = new org.json.JSONObject(str).optJSONObject("data");
            } catch (java.lang.Exception unused) {
            }
            if (optJSONObject2 != null) {
                str2 = optJSONObject2.optString("message");
                optJSONObject = new org.json.JSONObject(str).optJSONObject("data");
                if (optJSONObject != null) {
                    str3 = optJSONObject.optString("code");
                }
                this.f3781a.a(a2, str2, str3);
            }
            str2 = null;
            optJSONObject = new org.json.JSONObject(str).optJSONObject("data");
            if (optJSONObject != null) {
            }
            this.f3781a.a(a2, str2, str3);
        }
    }

    @Override // com.digitalturbine.ignite.cl.aidl.IIgniteServiceCallback
    public final void onProgress(java.lang.String str) {
        org.json.JSONObject optJSONObject;
        com.fyber.inneractive.sdk.util.IAlog.a("InstallCallback onProgress %s", str);
        try {
            java.lang.String a2 = a(str);
            org.json.JSONObject optJSONObject2 = new org.json.JSONObject(str).optJSONObject("data");
            if (optJSONObject2 == null || (optJSONObject = optJSONObject2.optJSONObject(androidx.core.app.NotificationCompat.CATEGORY_PROGRESS)) == null) {
                return;
            }
            int optInt = optJSONObject.optInt("action");
            double optDouble = optJSONObject.optDouble("value");
            com.fyber.inneractive.sdk.ignite.r rVar = this.f3781a;
            if (rVar != null) {
                rVar.a(a2, optInt, optDouble);
            }
        } catch (java.lang.Exception unused) {
            com.fyber.inneractive.sdk.util.IAlog.a("Failed to resolve progress data", new java.lang.Object[0]);
        }
    }

    @Override // com.digitalturbine.ignite.cl.aidl.IIgniteServiceCallback
    public final void onScheduled(java.lang.String str) {
        java.lang.String str2;
        com.fyber.inneractive.sdk.util.IAlog.a("InstallCallback onScheduled %s", str);
        try {
            java.lang.String a2 = a(str);
            try {
                str2 = new org.json.JSONObject(str).getJSONObject("application").optString("packageName");
            } catch (java.lang.Exception unused) {
                str2 = null;
            }
            com.fyber.inneractive.sdk.ignite.r rVar = this.f3781a;
            if (rVar != null) {
                rVar.a(a2, str2);
            }
        } catch (java.lang.Exception unused2) {
            com.fyber.inneractive.sdk.util.IAlog.a("Failed to resolve taskId", new java.lang.Object[0]);
        }
    }

    @Override // com.digitalturbine.ignite.cl.aidl.IIgniteServiceCallback
    public final void onStart(java.lang.String str) {
        com.fyber.inneractive.sdk.util.IAlog.a("InstallCallback onStart %s", str);
        if (this.f3781a != null) {
            this.f3781a.a(a(str));
        }
    }

    @Override // com.digitalturbine.ignite.cl.aidl.IIgniteServiceCallback
    public final void onSuccess(java.lang.String str) {
        com.fyber.inneractive.sdk.util.IAlog.a("InstallCallback onSuccess %s", str);
        if (this.f3781a != null) {
            this.f3781a.b(a(str));
            com.fyber.inneractive.sdk.ignite.c cVar = this.b;
            if (cVar != null) {
                com.fyber.inneractive.sdk.ignite.h hVar = cVar.b;
                java.lang.String str2 = cVar.f3772a.f3776a;
                hVar.getClass();
                if (!android.text.TextUtils.isEmpty(str2)) {
                    com.fyber.inneractive.sdk.config.IAConfigManager.N.r.a(new com.fyber.inneractive.sdk.network.z0(new com.fyber.inneractive.sdk.ignite.f(str2), str2));
                }
                com.fyber.inneractive.sdk.ignite.g gVar = cVar.f3772a;
                com.fyber.inneractive.sdk.flow.w wVar = gVar.b;
                com.fyber.inneractive.sdk.ignite.m mVar = gVar.c;
                com.fyber.inneractive.sdk.flow.v vVar = wVar.h;
                com.fyber.inneractive.sdk.network.u uVar = com.fyber.inneractive.sdk.network.u.IGNITE_FLOW_INSTALL_DONE;
                if (mVar == null) {
                    mVar = com.fyber.inneractive.sdk.ignite.m.SINGLE_TAP;
                }
                vVar.a(uVar, mVar);
            }
        }
    }
}
