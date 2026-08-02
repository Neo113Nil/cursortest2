package com.odehbros.flutter_file_downloader;

import androidx.core.app.NotificationCompat;
import io.flutter.plugins.firebase.crashlytics.Constants;
import java.util.HashMap;

/* loaded from: classes4.dex */
public final class d extends com.odehbros.flutter_file_downloader.core.a {
    public final /* synthetic */ f b;
    public final /* synthetic */ String c;
    public final /* synthetic */ e d;

    public d(e eVar, f fVar, String str) {
        this.d = eVar;
        this.b = fVar;
        this.c = str;
    }

    @Override // com.odehbros.flutter_file_downloader.core.a
    public final void a(String str) {
        e eVar = this.d;
        HashMap hashMap = new HashMap();
        hashMap.put("id", Long.valueOf(this.a));
        hashMap.put("path", str);
        hashMap.put(Constants.KEY, this.c);
        try {
            eVar.e.invokeMethod("onDownloadCompleted", hashMap);
        } catch (Exception e) {
            e.printStackTrace();
        }
        eVar.c.remove(Long.valueOf(this.a));
    }

    @Override // com.odehbros.flutter_file_downloader.core.a
    public final void b(String str) {
        e eVar = this.d;
        HashMap hashMap = new HashMap();
        hashMap.put("id", Long.valueOf(this.a));
        hashMap.put(com.google.firebase.messaging.Constants.IPC_BUNDLE_KEY_SEND_ERROR, str);
        hashMap.put(Constants.KEY, this.b.c.argument(Constants.KEY));
        try {
            eVar.e.invokeMethod("onDownloadError", hashMap);
        } catch (Exception e) {
            e.printStackTrace();
        }
        eVar.c.remove(Long.valueOf(this.a));
    }

    public final void c(long j) {
        this.a = j;
        e eVar = this.d;
        eVar.c.put(Long.valueOf(j), this);
        HashMap hashMap = new HashMap();
        hashMap.put("id", Long.valueOf(j));
        f fVar = this.b;
        hashMap.put("url", fVar.c.argument("url"));
        hashMap.put(Constants.KEY, fVar.c.argument(Constants.KEY));
        ((f) eVar.d.get(this.c)).a = String.valueOf(j);
        try {
            eVar.e.invokeMethod("onIDReceived", hashMap);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public final void d() {
        HashMap hashMap = new HashMap();
        hashMap.put("id", Long.valueOf(this.a));
        hashMap.put(NotificationCompat.CATEGORY_PROGRESS, Double.valueOf(0.0d));
        hashMap.put(Constants.KEY, this.c);
        try {
            this.d.e.invokeMethod("onProgress", hashMap);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public final void e(String str, double d) {
        HashMap hashMap = new HashMap();
        hashMap.put("id", Long.valueOf(this.a));
        hashMap.put("name", str);
        hashMap.put(NotificationCompat.CATEGORY_PROGRESS, Double.valueOf(d));
        hashMap.put(Constants.KEY, this.c);
        try {
            this.d.e.invokeMethod("onProgress", hashMap);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
