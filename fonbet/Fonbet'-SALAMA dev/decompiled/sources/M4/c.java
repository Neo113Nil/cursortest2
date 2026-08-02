package M4;

import android.util.Base64OutputStream;
import java.io.ByteArrayOutputStream;
import java.util.ArrayList;
import java.util.Collection;
import java.util.concurrent.Callable;
import java.util.zip.GZIPOutputStream;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public final /* synthetic */ class c implements Callable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f4583a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ d f4584b;

    public /* synthetic */ c(d dVar, int i7) {
        this.f4583a = i7;
        this.f4584b = dVar;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        String byteArrayOutputStream;
        switch (this.f4583a) {
            case 0:
                d dVar = this.f4584b;
                synchronized (dVar) {
                    try {
                        h hVar = (h) dVar.f4585a.get();
                        ArrayList c3 = hVar.c();
                        hVar.b();
                        JSONArray jSONArray = new JSONArray();
                        for (int i7 = 0; i7 < c3.size(); i7++) {
                            a aVar = (a) c3.get(i7);
                            JSONObject jSONObject = new JSONObject();
                            jSONObject.put("agent", aVar.f4578a);
                            jSONObject.put("dates", new JSONArray((Collection) aVar.f4579b));
                            jSONArray.put(jSONObject);
                        }
                        JSONObject jSONObject2 = new JSONObject();
                        jSONObject2.put("heartbeats", jSONArray);
                        jSONObject2.put("version", "2");
                        ByteArrayOutputStream byteArrayOutputStream2 = new ByteArrayOutputStream();
                        Base64OutputStream base64OutputStream = new Base64OutputStream(byteArrayOutputStream2, 11);
                        try {
                            GZIPOutputStream gZIPOutputStream = new GZIPOutputStream(base64OutputStream);
                            try {
                                gZIPOutputStream.write(jSONObject2.toString().getBytes("UTF-8"));
                                gZIPOutputStream.close();
                                base64OutputStream.close();
                                byteArrayOutputStream = byteArrayOutputStream2.toString("UTF-8");
                            } finally {
                            }
                        } finally {
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                return byteArrayOutputStream;
            default:
                d dVar2 = this.f4584b;
                synchronized (dVar2) {
                    ((h) dVar2.f4585a.get()).h(((R4.b) dVar2.f4587c.get()).a(), System.currentTimeMillis());
                }
                return null;
        }
    }
}
