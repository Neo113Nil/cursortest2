package Fl0;

import ab.InterfaceC4990a;
import db.InterfaceC6134a;
import fb.InterfaceC6491b;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes8.dex */
public final class c implements InterfaceC4990a {
    @Override // ab.InterfaceC4990a
    public final <T extends InterfaceC6491b & InterfaceC6134a> void a(@NotNull T target) {
        Intrinsics.checkNotNullParameter(target, "target");
        T topicComponent = target;
        Intrinsics.checkNotNullParameter(topicComponent, "topicComponent");
        a pushInterceptor = new a(topicComponent);
        Ll0.b bVar = (Ll0.b) Pl0.a.f22641a.getValue();
        bVar.getClass();
        Intrinsics.checkNotNullParameter(pushInterceptor, "pushInterceptor");
        synchronized (bVar) {
            bVar.f17148a.add(pushInterceptor);
        }
    }
}
