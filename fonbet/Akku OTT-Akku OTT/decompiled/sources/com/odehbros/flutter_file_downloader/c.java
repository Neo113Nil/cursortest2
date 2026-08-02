package com.odehbros.flutter_file_downloader;

import androidx.core.app.NotificationCompat;
import io.flutter.plugins.firebase.crashlytics.Constants;
import java.util.HashMap;

/* loaded from: classes4.dex */
public final class c extends com.odehbros.flutter_file_downloader.core.a {
    public final /* synthetic */ String b;
    public final /* synthetic */ f c;
    public final /* synthetic */ e d;

    public c(e eVar, f fVar, String str) {
        this.d = eVar;
        this.b = str;
        this.c = fVar;
    }

    @Override // com.odehbros.flutter_file_downloader.core.a
    public final void a(String str) {
        e eVar = this.d;
        HashMap hashMap = new HashMap();
        hashMap.put("id", Long.valueOf(this.a));
        hashMap.put("path", str);
        hashMap.put(Constants.KEY, this.b);
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
        hashMap.put(Constants.KEY, this.c.c.argument(Constants.KEY));
        try {
            eVar.e.invokeMethod("onDownloadError", hashMap);
        } catch (Exception e) {
            e.printStackTrace();
        }
        eVar.c.remove(Long.valueOf(this.a));
    }

    public final void c(String str, double d) {
        HashMap hashMap = new HashMap();
        hashMap.put("id", Long.valueOf(this.a));
        hashMap.put("name", str);
        hashMap.put(NotificationCompat.CATEGORY_PROGRESS, Double.valueOf(d));
        hashMap.put(Constants.KEY, this.b);
        try {
            this.d.e.invokeMethod("onProgress", hashMap);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
