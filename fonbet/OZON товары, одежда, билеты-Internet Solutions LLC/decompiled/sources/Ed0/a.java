package Ed0;

import f00.InterfaceC6396b;
import kotlin.jvm.internal.Intrinsics;
import x10.C10644a;

/* loaded from: classes7.dex */
public final class a implements Jb.e {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f7844a;

    /* renamed from: b, reason: collision with root package name */
    private final Jb.e f7845b;

    public /* synthetic */ a(Object obj, Jb.e eVar, int i11) {
        this.f7844a = i11;
        this.f7845b = eVar;
    }

    @Override // Pc.a
    public final Object get() {
        switch (this.f7844a) {
            case 0:
                Fd0.c inAppPushInteractor = (Fd0.c) ((d) this.f7845b).get();
                Intrinsics.checkNotNullParameter(inAppPushInteractor, "inAppPushInteractor");
                return new Id0.f(inAppPushInteractor);
            default:
                InterfaceC6396b debugFlagsManager = (InterfaceC6396b) ((Jb.f) this.f7845b).get();
                Intrinsics.checkNotNullParameter(debugFlagsManager, "debugFlagsManager");
                return new C10644a(debugFlagsManager);
        }
    }
}
