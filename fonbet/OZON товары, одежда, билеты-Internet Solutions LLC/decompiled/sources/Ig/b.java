package Ig;

import android.os.Process;
import android.os.SystemClock;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.C7704k;
import kotlin.collections.C7714v;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.h;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes10.dex */
public final class b {

    /* renamed from: b, reason: collision with root package name */
    private int f12489b;

    /* renamed from: a, reason: collision with root package name */
    private final long f12488a = Process.getStartElapsedRealtime();

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private final C7704k<a> f12490c = new C7704k<>();

    @NotNull
    public final List<a> a() {
        List<a> U02;
        synchronized (this.f12490c) {
            U02 = C7714v.U0(this.f12490c);
        }
        return U02;
    }

    public final void b(@NotNull String msg) {
        Intrinsics.checkNotNullParameter(msg, "msg");
        String q02 = h.q0(65506, msg);
        a aVar = new a(SystemClock.elapsedRealtime() - this.f12488a, q02);
        synchronized (this.f12490c) {
            try {
                this.f12490c.addLast(aVar);
                this.f12489b = q02.length() + 30 + this.f12489b;
                while (this.f12489b > 65536) {
                    this.f12490c.removeFirst();
                }
                Unit unit = Unit.f71690a;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
