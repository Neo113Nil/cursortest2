package com.facebook.appevents;

import android.content.SharedPreferences;
import com.facebook.internal.C0715k;
import org.json.JSONObject;

/* renamed from: com.facebook.appevents.b, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final /* synthetic */ class RunnableC0690b implements Runnable {
    public final /* synthetic */ int a;

    public /* synthetic */ RunnableC0690b(int i) {
        this.a = i;
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x0068, code lost:
    
        if ((java.lang.System.currentTimeMillis() - r9) >= 259200000) goto L32;
     */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0076 A[Catch: all -> 0x0034, Exception -> 0x0097, TryCatch #3 {Exception -> 0x0097, all -> 0x0034, blocks: (B:6:0x0015, B:8:0x0027, B:11:0x002e, B:12:0x003b, B:14:0x0049, B:16:0x004f, B:24:0x008d, B:30:0x006c, B:31:0x006f, B:35:0x0076, B:36:0x0036, B:21:0x005e), top: B:5:0x0015, inners: #2 }] */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run() {
        JSONObject jSONObject;
        switch (this.a) {
            case 0:
                C0691c.a.getClass();
                C0691c.a();
                break;
            default:
                com.facebook.appevents.ml.d dVar = com.facebook.appevents.ml.d.a;
                if (!com.facebook.internal.instrument.crashshield.a.b(com.facebook.appevents.ml.d.class)) {
                    try {
                        SharedPreferences sharedPreferences = com.facebook.w.a().getSharedPreferences("com.facebook.internal.MODEL_STORE", 0);
                        String string = sharedPreferences.getString("models", null);
                        if (string != null && string.length() != 0) {
                            jSONObject = new JSONObject(string);
                            long j = sharedPreferences.getLong("model_request_timestamp", 0L);
                            if (C0715k.b(C0715k.b.ModelRequest) && jSONObject.length() != 0) {
                                dVar.getClass();
                                if (!com.facebook.internal.instrument.crashshield.a.b(dVar) && j != 0) {
                                    try {
                                        break;
                                    } catch (Throwable th) {
                                        com.facebook.internal.instrument.crashshield.a.a(th, dVar);
                                    }
                                }
                            }
                            jSONObject = dVar.c();
                            if (jSONObject == null) {
                                sharedPreferences.edit().putString("models", jSONObject.toString()).putLong("model_request_timestamp", System.currentTimeMillis()).apply();
                                dVar.a(jSONObject);
                                dVar.b();
                                break;
                            } else {
                                break;
                            }
                        }
                        jSONObject = new JSONObject();
                        long j2 = sharedPreferences.getLong("model_request_timestamp", 0L);
                        if (C0715k.b(C0715k.b.ModelRequest)) {
                            dVar.getClass();
                            if (!com.facebook.internal.instrument.crashshield.a.b(dVar)) {
                            }
                        }
                        jSONObject = dVar.c();
                        if (jSONObject == null) {
                        }
                    } catch (Exception unused) {
                        return;
                    } catch (Throwable th2) {
                        com.facebook.internal.instrument.crashshield.a.a(th2, com.facebook.appevents.ml.d.class);
                    }
                }
                break;
        }
    }
}
