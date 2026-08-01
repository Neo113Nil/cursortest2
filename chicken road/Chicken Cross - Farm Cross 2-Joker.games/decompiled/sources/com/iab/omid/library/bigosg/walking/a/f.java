package com.iab.omid.library.bigosg.walking.a;

import android.text.TextUtils;
import com.iab.omid.library.bigosg.walking.a.b;
import java.util.HashSet;
import org.json.JSONObject;

/* loaded from: classes4.dex */
public class f extends a {
    public f(b.InterfaceC0268b interfaceC0268b, HashSet<String> hashSet, JSONObject jSONObject, long j) {
        super(interfaceC0268b, hashSet, jSONObject, j);
    }

    private void b(String str) {
        com.iab.omid.library.bigosg.b.a a2 = com.iab.omid.library.bigosg.b.a.a();
        if (a2 != null) {
            for (com.iab.omid.library.bigosg.adsession.a aVar : a2.b()) {
                if (((a) this).f6116a.contains(aVar.getAdSessionId())) {
                    aVar.getAdSessionStatePublisher().a(str, this.c);
                }
            }
        }
    }

    @Override // android.os.AsyncTask
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public String doInBackground(Object... objArr) {
        if (com.iab.omid.library.bigosg.d.b.b(this.b, this.d.b())) {
            return null;
        }
        this.d.a(this.b);
        return this.b.toString();
    }

    @Override // com.iab.omid.library.bigosg.walking.a.b, android.os.AsyncTask
    /* renamed from: a */
    public void onPostExecute(String str) {
        if (!TextUtils.isEmpty(str)) {
            b(str);
        }
        super.onPostExecute(str);
    }
}
