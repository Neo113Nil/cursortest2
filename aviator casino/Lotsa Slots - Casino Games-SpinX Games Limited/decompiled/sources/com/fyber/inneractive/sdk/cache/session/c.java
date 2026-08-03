package com.fyber.inneractive.sdk.cache.session;

/* loaded from: classes3.dex */
public final class c implements java.lang.Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.fyber.inneractive.sdk.cache.session.e f3562a;

    public c(com.fyber.inneractive.sdk.cache.session.e eVar) {
        this.f3562a = eVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x005c  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0038 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run() {
        java.io.FileInputStream fileInputStream;
        java.lang.String str;
        android.app.Application application = com.fyber.inneractive.sdk.util.o.f4302a;
        org.json.JSONObject jSONObject = null;
        try {
            fileInputStream = application.openFileInput("session_details.json");
        } catch (java.lang.Throwable unused) {
            fileInputStream = null;
        }
        try {
            int available = fileInputStream.available();
            byte[] bArr = new byte[available];
            str = fileInputStream.read(bArr) == available ? new java.lang.String(bArr, "UTF-8") : null;
        } catch (java.lang.Throwable unused2) {
            try {
                com.fyber.inneractive.sdk.util.IAlog.a("readFileFromContext failed reading %s", "session_details.json");
                com.fyber.inneractive.sdk.util.v.a((java.io.Closeable) fileInputStream);
                str = null;
                if (!android.text.TextUtils.isEmpty(str)) {
                }
            } finally {
                com.fyber.inneractive.sdk.util.v.a((java.io.Closeable) fileInputStream);
            }
        }
        if (!android.text.TextUtils.isEmpty(str)) {
            this.f3562a.getClass();
            return;
        }
        try {
            jSONObject = new org.json.JSONObject(str);
        } catch (java.lang.Throwable unused3) {
            com.fyber.inneractive.sdk.util.IAlog.f("Failed parsing SessionCache", new java.lang.Object[0]);
        }
        if (jSONObject != null) {
            com.fyber.inneractive.sdk.util.r.b.post(new com.fyber.inneractive.sdk.cache.session.b(this, jSONObject));
        } else {
            application.deleteFile("session_details.json");
            this.f3562a.getClass();
        }
    }
}
