package Eb;

import Sc.r;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import xe.InterfaceC10733l;

/* loaded from: classes9.dex */
public final class b {
    public static final synchronized <T> void a(@NotNull InterfaceC10733l<? super T> interfaceC10733l, T t2) {
        synchronized (b.class) {
            Intrinsics.checkNotNullParameter(interfaceC10733l, "<this>");
            if (interfaceC10733l.isActive()) {
                r.Companion companion = r.INSTANCE;
                interfaceC10733l.resumeWith(t2);
            }
        }
    }
}
