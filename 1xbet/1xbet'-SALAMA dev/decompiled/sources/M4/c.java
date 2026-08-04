package M4;

import android.util.Base64OutputStream;
import java.io.ByteArrayOutputStream;
import java.util.ArrayList;
import java.util.Collection;
import java.util.concurrent.Callable;
import java.util.zip.GZIPOutputStream;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class c implements Callable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f4583a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ d f4584b;

    public /* synthetic */ c(d dVar, int i7) {
        this.f4583a = i7;
        this.f4584b = dVar;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        String string;
        switch (this.f4583a) {
            case 0:
                d dVar = this.f4584b;
                synchronized (dVar) {
                    try {
                        h hVar = (h) dVar.f4585a.get();
                        ArrayList arrayListC = hVar.c();
                        hVar.b();
                        JSONArray jSONArray = new JSONArray();
                        for (int i7 = 0; i7 < arrayListC.size(); i7++) {
                            a aVar = (a) arrayListC.get(i7);
                            JSONObject jSONObject = new JSONObject();
                            jSONObject.put("agent", aVar.f4578a);
                            jSONObject.put("dates", new JSONArray((Collection) aVar.f4579b));
                            jSONArray.put(jSONObject);
                        }
                        JSONObject jSONObject2 = new JSONObject();
                        jSONObject2.put("heartbeats", jSONArray);
                        jSONObject2.put("version", "2");
                        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                        Base64OutputStream base64OutputStream = new Base64OutputStream(byteArrayOutputStream, 11);
                        try {
                            GZIPOutputStream gZIPOutputStream = new GZIPOutputStream(base64OutputStream);
                            try {
                                gZIPOutputStream.write(jSONObject2.toString().getBytes("UTF-8"));
                                gZIPOutputStream.close();
                                base64OutputStream.close();
                                string = byteArrayOutputStream.toString("UTF-8");
                            } catch (Throwable th) {
                                try {
                                    gZIPOutputStream.close();
                                    break;
                                } catch (Throwable th2) {
                                    th.addSuppressed(th2);
                                }
                                throw th;
                            }
                        } catch (Throwable th3) {
                            try {
                                base64OutputStream.close();
                                break;
                            } catch (Throwable th4) {
                                th3.addSuppressed(th4);
                            }
                            throw th3;
                        }
                    } catch (Throwable th5) {
                        throw th5;
                    }
                }
                return string;
            default:
                d dVar2 = this.f4584b;
                synchronized (dVar2) {
                    ((h) dVar2.f4585a.get()).h(((R4.b) dVar2.f4587c.get()).a(), System.currentTimeMillis());
                    break;
                }
                return null;
        }
    }
}
