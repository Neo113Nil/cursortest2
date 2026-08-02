package F1;

import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import kotlin.jvm.internal.l;

/* loaded from: classes.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    public final c f1523a = new c();

    /* renamed from: b, reason: collision with root package name */
    public final LinkedHashMap f1524b = new LinkedHashMap();

    /* renamed from: c, reason: collision with root package name */
    public final LinkedHashSet f1525c = new LinkedHashSet();

    /* renamed from: d, reason: collision with root package name */
    public volatile boolean f1526d;

    public static void b(AutoCloseable autoCloseable) {
        if (autoCloseable != null) {
            try {
                L1.a.s(autoCloseable);
            } catch (Exception e3) {
                throw new RuntimeException(e3);
            }
        }
    }

    public final void a(AutoCloseable autoCloseable) {
        l.f("closeable", autoCloseable);
        if (this.f1526d) {
            b(autoCloseable);
            return;
        }
        synchronized (this.f1523a) {
            this.f1525c.add(autoCloseable);
        }
    }
}
