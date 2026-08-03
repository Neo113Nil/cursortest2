package com.iab.omid.library.vungle.walking.async;

/* loaded from: classes5.dex */
public abstract class b extends android.os.AsyncTask<java.lang.Object, java.lang.Void, java.lang.String> {

    /* renamed from: a, reason: collision with root package name */
    private com.iab.omid.library.vungle.walking.async.b.a f4573a;
    protected final com.iab.omid.library.vungle.walking.async.b.InterfaceC0115b b;

    public interface a {
        void a(com.iab.omid.library.vungle.walking.async.b bVar);
    }

    /* renamed from: com.iab.omid.library.vungle.walking.async.b$b, reason: collision with other inner class name */
    public interface InterfaceC0115b {
        org.json.JSONObject a();

        void a(org.json.JSONObject jSONObject);
    }

    public b(com.iab.omid.library.vungle.walking.async.b.InterfaceC0115b interfaceC0115b) {
        this.b = interfaceC0115b;
    }

    public void a(com.iab.omid.library.vungle.walking.async.b.a aVar) {
        this.f4573a = aVar;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.os.AsyncTask
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public void onPostExecute(java.lang.String str) {
        com.iab.omid.library.vungle.walking.async.b.a aVar = this.f4573a;
        if (aVar != null) {
            aVar.a(this);
        }
    }

    public void a(java.util.concurrent.ThreadPoolExecutor threadPoolExecutor) {
        executeOnExecutor(threadPoolExecutor, new java.lang.Object[0]);
    }
}
