package sg.bigo.ads.q0;

import java.lang.Thread;

/* renamed from: sg.bigo.ads.q0.c, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C5439c implements Thread.UncaughtExceptionHandler {
    @Override // java.lang.Thread.UncaughtExceptionHandler
    public final void uncaughtException(Thread thread, Throwable th) {
        InterfaceC5437a interfaceC5437a = ThreadFactoryC5440d.e;
        if (interfaceC5437a != null) {
            interfaceC5437a.a(th);
        }
    }
}
