package sg.bigo.ads.f;

import android.os.SystemClock;
import java.util.WeakHashMap;

/* renamed from: sg.bigo.ads.f.c, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC5098c {

    /* renamed from: a, reason: collision with root package name */
    public static final WeakHashMap f12761a = new WeakHashMap();

    public static void a(InterfaceC5097b interfaceC5097b, int i) {
        WeakHashMap weakHashMap = f12761a;
        C5096a c5096a = (C5096a) weakHashMap.get(interfaceC5097b);
        if (c5096a == null) {
            c5096a = new C5096a();
            weakHashMap.put(interfaceC5097b, c5096a);
        }
        c5096a.f12760a[i] = SystemClock.elapsedRealtime();
    }
}
