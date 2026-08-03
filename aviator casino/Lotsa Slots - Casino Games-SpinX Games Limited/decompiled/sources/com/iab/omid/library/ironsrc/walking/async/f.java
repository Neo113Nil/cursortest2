package com.iab.omid.library.ironsrc.walking.async;

/* loaded from: classes5.dex */
public class f extends com.iab.omid.library.ironsrc.walking.async.a {
    public f(com.iab.omid.library.ironsrc.walking.async.b.InterfaceC0105b interfaceC0105b, java.util.HashSet<java.lang.String> hashSet, org.json.JSONObject jSONObject, long j) {
        super(interfaceC0105b, hashSet, jSONObject, j);
    }

    private void b(java.lang.String str) {
        com.iab.omid.library.ironsrc.internal.c c = com.iab.omid.library.ironsrc.internal.c.c();
        if (c != null) {
            for (com.iab.omid.library.ironsrc.adsession.a aVar : c.b()) {
                if (this.c.contains(aVar.getAdSessionId())) {
                    aVar.getAdSessionStatePublisher().b(str, this.e);
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.os.AsyncTask
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public java.lang.String doInBackground(java.lang.Object... objArr) {
        if (com.iab.omid.library.ironsrc.utils.c.h(this.d, this.b.a())) {
            return null;
        }
        this.b.a(this.d);
        return this.d.toString();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.iab.omid.library.ironsrc.walking.async.b, android.os.AsyncTask
    /* renamed from: a */
    public void onPostExecute(java.lang.String str) {
        if (!android.text.TextUtils.isEmpty(str)) {
            b(str);
        }
        super.onPostExecute(str);
    }
}
