package com.dexterous.flutterlocalnotifications;

import android.app.Notification;
import android.app.Service;
import android.content.Intent;
import android.os.Build;
import android.os.IBinder;
import com.dexterous.flutterlocalnotifications.models.NotificationDetails;
import java.io.Serializable;
import java.util.ArrayList;

/* loaded from: classes3.dex */
public final class b extends Service {
    @Override // android.app.Service
    public final IBinder onBind(Intent intent) {
        return null;
    }

    @Override // android.app.Service
    public final int onStartCommand(Intent intent, int i, int i2) {
        c cVar;
        Serializable serializableExtra;
        int i3 = Build.VERSION.SDK_INT;
        if (i3 >= 33) {
            serializableExtra = intent.getSerializableExtra("com.dexterous.flutterlocalnotifications.ForegroundServiceStartParameter", c.class);
            cVar = (c) serializableExtra;
        } else {
            cVar = (c) intent.getSerializableExtra("com.dexterous.flutterlocalnotifications.ForegroundServiceStartParameter");
        }
        NotificationDetails notificationDetails = cVar.a;
        ArrayList<Integer> arrayList = cVar.c;
        Notification createNotification = FlutterLocalNotificationsPlugin.createNotification(this, notificationDetails);
        if (arrayList == null || i3 < 29) {
            startForeground(notificationDetails.f70id.intValue(), createNotification);
        } else {
            int intValue = notificationDetails.f70id.intValue();
            int intValue2 = arrayList.get(0).intValue();
            for (int i4 = 1; i4 < arrayList.size(); i4++) {
                intValue2 |= arrayList.get(i4).intValue();
            }
            startForeground(intValue, createNotification, intValue2);
        }
        return cVar.b;
    }
}
