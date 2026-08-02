package p2;

import android.content.Context;
import android.os.PowerManager;
import java.util.WeakHashMap;

/* renamed from: p2.k, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC2253k {

    /* renamed from: a, reason: collision with root package name */
    public static final String f18712a = f2.m.f("WakeLocks");

    /* renamed from: b, reason: collision with root package name */
    public static final WeakHashMap f18713b = new WeakHashMap();

    public static PowerManager.WakeLock a(Context context, String str) {
        PowerManager powerManager = (PowerManager) context.getApplicationContext().getSystemService("power");
        String concat = "WorkManager: ".concat(str);
        PowerManager.WakeLock newWakeLock = powerManager.newWakeLock(1, concat);
        WeakHashMap weakHashMap = f18713b;
        synchronized (weakHashMap) {
            weakHashMap.put(newWakeLock, concat);
        }
        return newWakeLock;
    }
}
