package n1;

import android.content.Context;
import android.os.PowerManager;
import java.util.WeakHashMap;

/* renamed from: n1.j, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC1455j {

    /* renamed from: a, reason: collision with root package name */
    public static final String f15319a = d1.n.g("WakeLocks");

    /* renamed from: b, reason: collision with root package name */
    public static final WeakHashMap f15320b = new WeakHashMap();

    public static PowerManager.WakeLock a(Context context, String str) {
        PowerManager powerManager = (PowerManager) context.getApplicationContext().getSystemService("power");
        String concat = "WorkManager: ".concat(str);
        PowerManager.WakeLock newWakeLock = powerManager.newWakeLock(1, concat);
        WeakHashMap weakHashMap = f15320b;
        synchronized (weakHashMap) {
            weakHashMap.put(newWakeLock, concat);
        }
        return newWakeLock;
    }
}
