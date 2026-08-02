package com.odehbros.flutter_file_downloader.downloader;

import android.app.DownloadManager;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.database.Cursor;
import androidx.core.app.NotificationCompat;
import io.flutter.plugins.firebase.crashlytics.Constants;

/* loaded from: classes4.dex */
public final class a extends BroadcastReceiver {
    public final com.odehbros.flutter_file_downloader.e a;

    public a(com.odehbros.flutter_file_downloader.e eVar) {
        this.a = eVar;
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        String action = intent.getAction();
        if (action != null && action.equals("android.intent.action.DOWNLOAD_COMPLETE")) {
            try {
                DownloadManager.Query query = new DownloadManager.Query();
                long longExtra = intent.getLongExtra("extra_download_id", 0L);
                query.setFilterById(longExtra);
                Cursor query2 = ((DownloadManager) context.getSystemService("download")).query(query);
                if (!query2.moveToFirst() || query2.getCount() <= 0) {
                    return;
                }
                int i = query2.getInt(query2.getColumnIndex(NotificationCompat.CATEGORY_STATUS));
                com.odehbros.flutter_file_downloader.e eVar = this.a;
                if (i == 8) {
                    com.odehbros.flutter_file_downloader.core.a aVar = (com.odehbros.flutter_file_downloader.core.a) eVar.c.get(Long.valueOf(longExtra));
                    String replace = query2.getString(query2.getColumnIndex("local_uri")).replace("file://", "");
                    if (aVar != null) {
                        aVar.a(replace);
                    }
                    com.odehbros.flutter_file_downloader.f a = eVar.a(longExtra);
                    if (a != null) {
                        a.d.success(replace);
                        return;
                    }
                    return;
                }
                int columnIndex = query2.getColumnIndex(Constants.REASON);
                if (columnIndex > -1) {
                    int i2 = query2.getInt(columnIndex);
                    com.odehbros.flutter_file_downloader.core.a aVar2 = (com.odehbros.flutter_file_downloader.core.a) eVar.c.get(Long.valueOf(longExtra));
                    if (aVar2 != null) {
                        aVar2.b(i2 + "");
                    }
                    com.odehbros.flutter_file_downloader.f a2 = eVar.a(longExtra);
                    if (a2 != null) {
                        a2.d.error("Download file error", i2 + "", null);
                    }
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}
