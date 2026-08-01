package com.iab.omid.library.bigosg.walking.a;

import android.os.AsyncTask;
import java.util.concurrent.ThreadPoolExecutor;
import org.json.JSONObject;

/* loaded from: classes4.dex */
public abstract class b extends AsyncTask<Object, Void, String> {

    /* renamed from: a, reason: collision with root package name */
    private a f6117a;
    protected final InterfaceC0268b d;

    public interface a {
        void a(b bVar);
    }

    /* renamed from: com.iab.omid.library.bigosg.walking.a.b$b, reason: collision with other inner class name */
    public interface InterfaceC0268b {
        void a(JSONObject jSONObject);

        JSONObject b();
    }

    public b(InterfaceC0268b interfaceC0268b) {
        this.d = interfaceC0268b;
    }

    public void a(a aVar) {
        this.f6117a = aVar;
    }

    @Override // android.os.AsyncTask
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public void onPostExecute(String str) {
        a aVar = this.f6117a;
        if (aVar != null) {
            aVar.a(this);
        }
    }

    public void a(ThreadPoolExecutor threadPoolExecutor) {
        executeOnExecutor(threadPoolExecutor, new Object[0]);
    }
}
