package Ve;

import android.content.Context;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: Ve.o8, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C4495o8 implements Jb.e {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f31711a;

    /* renamed from: b, reason: collision with root package name */
    public final Pc.a f31712b;

    public /* synthetic */ C4495o8(Pc.a aVar, int i11) {
        this.f31711a = i11;
        this.f31712b = aVar;
    }

    @Override // Pc.a
    public final Object get() {
        switch (this.f31711a) {
            case 0:
                return new J7((Vm) this.f31712b.get());
            default:
                Context context = (Context) ((Jb.f) this.f31712b).get();
                Intrinsics.checkNotNullParameter(context, "context");
                return new C4700vb(context);
        }
    }
}
