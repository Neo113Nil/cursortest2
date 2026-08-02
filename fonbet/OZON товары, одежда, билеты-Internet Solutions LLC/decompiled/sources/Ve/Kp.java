package Ve;

import fd.InterfaceC6511n;
import kotlin.jvm.internal.C7735q;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes10.dex */
public abstract class Kp {

    /* renamed from: a, reason: collision with root package name */
    public final C7735q f29370a;

    /* JADX WARN: Multi-variable type inference failed */
    public Kp(InterfaceC6511n viewBindingInflater) {
        Intrinsics.checkNotNullParameter(viewBindingInflater, "viewBindingInflater");
        this.f29370a = (C7735q) viewBindingInflater;
    }

    public abstract Integer a(Object obj);

    public abstract void b(X4.a aVar, Object obj);

    public abstract boolean c(Object obj);
}
