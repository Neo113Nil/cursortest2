package com.iab.omid.library.vungle.walking.async;

/* loaded from: classes5.dex */
public class e extends com.iab.omid.library.vungle.walking.async.a {
    public e(com.iab.omid.library.vungle.walking.async.b.InterfaceC0115b interfaceC0115b, java.util.HashSet<java.lang.String> hashSet, org.json.JSONObject jSONObject, long j) {
        super(interfaceC0115b, hashSet, jSONObject, j);
    }

    private void b(java.lang.String str) {
        com.iab.omid.library.vungle.internal.c c = com.iab.omid.library.vungle.internal.c.c();
        if (c != null) {
            for (com.iab.omid.library.vungle.adsession.a aVar : c.b()) {
                if (this.c.contains(aVar.c())) {
                    aVar.d().a(str, this.e);
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.os.AsyncTask
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public java.lang.String doInBackground(java.lang.Object... objArr) {
        return this.d.toString();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.iab.omid.library.vungle.walking.async.b, android.os.AsyncTask
    /* renamed from: a */
    public void onPostExecute(java.lang.String str) {
        b(str);
        super.onPostExecute(str);
    }
}
