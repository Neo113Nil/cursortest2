package com.dexterous.flutterlocalnotifications;

import com.dexterous.flutterlocalnotifications.models.NotificationDetails;
import java.io.Serializable;
import java.util.ArrayList;

/* loaded from: classes3.dex */
public final class c implements Serializable {
    public final NotificationDetails a;
    public final int b;
    public final ArrayList<Integer> c;

    public c(NotificationDetails notificationDetails, int i, ArrayList<Integer> arrayList) {
        this.a = notificationDetails;
        this.b = i;
        this.c = arrayList;
    }

    public final String toString() {
        return "ForegroundServiceStartParameter{notificationData=" + this.a + ", startMode=" + this.b + ", foregroundServiceTypes=" + this.c + '}';
    }
}
