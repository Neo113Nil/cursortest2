package com.odehbros.flutter_file_downloader.downloader;

import android.app.Activity;
import android.app.DownloadManager;
import android.database.Cursor;
import android.net.Uri;
import android.os.Environment;
import android.os.Handler;
import android.os.Looper;
import androidx.core.app.NotificationCompat;
import androidx.core.view.E;
import androidx.credentials.exceptions.publickeycredential.DomExceptionUtils;
import java.io.File;
import java.util.Map;

/* loaded from: classes4.dex */
public final class d extends e {
    public final DownloadManager.Request i;
    public boolean j;

    public d(Activity activity, String str, String str2, com.odehbros.flutter_file_downloader.core.b bVar, com.odehbros.flutter_file_downloader.downloadDestination.b bVar2, com.odehbros.flutter_file_downloader.d dVar, Map map, com.odehbros.flutter_file_downloader.f fVar) {
        super(activity, str, str2, bVar, bVar2, dVar, map, fVar);
        this.j = false;
        DownloadManager.Request request = new DownloadManager.Request(Uri.parse(str));
        this.i = request;
        String path = bVar2.a().getPath();
        String a = com.odehbros.flutter_file_downloader.fileStore.b.a(bVar2.a);
        String b = androidx.compose.runtime.changelist.d.b(a, e());
        File file = new File(android.support.v4.media.session.f.b(path, DomExceptionUtils.SEPARATOR, a));
        if (!file.exists()) {
            file.mkdirs();
        }
        if (bVar2 instanceof com.odehbros.flutter_file_downloader.downloadDestination.a) {
            request.setDestinationInExternalFilesDir(activity, path, b);
        } else if (bVar2 instanceof com.odehbros.flutter_file_downloader.downloadDestination.c) {
            request.setDestinationInExternalPublicDir(Environment.DIRECTORY_DOWNLOADS, b);
        }
    }

    @Override // com.odehbros.flutter_file_downloader.downloader.e
    public final void a() {
        for (Map.Entry<String, String> entry : this.g.entrySet()) {
            this.i.addRequestHeader(entry.getKey(), entry.getValue());
        }
    }

    @Override // com.odehbros.flutter_file_downloader.downloader.e
    public final boolean b(long j) {
        return ((DownloadManager) this.a.getSystemService("download")).remove(j) > 0;
    }

    @Override // com.odehbros.flutter_file_downloader.downloader.e
    public final void c() {
        String str;
        final long enqueue;
        final Handler handler;
        com.odehbros.flutter_file_downloader.d dVar = this.f;
        this.j = true;
        final DownloadManager downloadManager = (DownloadManager) this.a.getSystemService("download");
        try {
            enqueue = downloadManager.enqueue(this.i);
            dVar.c(enqueue);
            dVar.d();
            handler = new Handler(Looper.getMainLooper());
        } catch (Exception e) {
            e = e;
        }
        try {
            new Thread(new Runnable() { // from class: com.odehbros.flutter_file_downloader.downloader.b
                @Override // java.lang.Runnable
                public final void run() {
                    Handler handler2 = handler;
                    double d = -1.0d;
                    while (true) {
                        final d dVar2 = d.this;
                        if (!dVar2.j) {
                            return;
                        }
                        DownloadManager.Query query = new DownloadManager.Query();
                        query.setFilterById(enqueue);
                        Cursor query2 = downloadManager.query(query);
                        query2.moveToFirst();
                        int columnIndex = query2.getColumnIndex("bytes_so_far");
                        int columnIndex2 = query2.getColumnIndex("total_size");
                        int columnIndex3 = query2.getColumnIndex(NotificationCompat.CATEGORY_STATUS);
                        int columnIndex4 = query2.getColumnIndex("title");
                        try {
                            int i = query2.getInt(columnIndex);
                            int i2 = query2.getInt(columnIndex2);
                            int i3 = query2.getInt(columnIndex3);
                            final String string = query2.getString(columnIndex4);
                            if (i3 == 8) {
                                dVar2.j = false;
                            }
                            if (i2 == 0) {
                                dVar2.j = false;
                                handler2.post(new E(dVar2, 3));
                                return;
                            }
                            final double d2 = (int) ((i * 100) / i2);
                            if (d != d2) {
                                System.out.getClass();
                                if (string != null && !string.isEmpty()) {
                                    handler2.post(new Runnable() { // from class: com.odehbros.flutter_file_downloader.downloader.c
                                        @Override // java.lang.Runnable
                                        public final void run() {
                                            d.this.f.e(string, d2);
                                        }
                                    });
                                }
                                d = d2;
                            }
                            query2.close();
                        } catch (Exception unused) {
                            dVar2.j = false;
                            handler2.post(new com.csdcorp.speech_to_text.g(dVar2, 2));
                            return;
                        }
                    }
                }
            }).start();
        } catch (Exception e2) {
            e = e2;
            if (e.getMessage().startsWith("Unsupported path") || e.getMessage().startsWith("java.io.IOException: Invalid file path")) {
                str = "Invalid file name " + e() + " try changing the download file name";
            } else {
                str = e instanceof SecurityException ? "Missing permission, see the log for more info" : e.getMessage();
            }
            e.printStackTrace();
            new Handler(Looper.getMainLooper()).post(new androidx.media3.common.util.c(2, this, str));
        }
    }

    @Override // com.odehbros.flutter_file_downloader.downloader.e
    public final void f() {
        int ordinal = this.d.ordinal();
        DownloadManager.Request request = this.i;
        if (ordinal == 0) {
            request.setNotificationVisibility(1);
            return;
        }
        if (ordinal == 1) {
            request.setNotificationVisibility(0);
        } else if (ordinal == 2) {
            request.setNotificationVisibility(3);
        } else {
            if (ordinal != 3) {
                return;
            }
            request.setNotificationVisibility(2);
        }
    }
}
