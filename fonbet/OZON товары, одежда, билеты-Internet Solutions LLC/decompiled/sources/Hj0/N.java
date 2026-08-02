package Hj0;

import android.content.Context;
import kotlin.jvm.internal.Intrinsics;
import ru.ozon.android.hardwareinfo.BuildInfoManager;
import ru.ozon.app.android.abtool.AbToolBaseApi;

/* loaded from: classes7.dex */
public final class N implements Jb.e {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f11095a = 0;

    /* renamed from: b, reason: collision with root package name */
    private final Jb.f f11096b;

    public N(Jb.f fVar) {
        this.f11096b = fVar;
    }

    @Override // Pc.a
    public final Object get() {
        switch (this.f11095a) {
            case 0:
                Context context = (Context) this.f11096b.get();
                Intrinsics.checkNotNullParameter(context, "context");
                BuildInfoManager invoke = BuildInfoManager.INSTANCE.invoke(context);
                Jb.j.d(invoke);
                return invoke;
            default:
                Ld0.c store = (Ld0.c) this.f11096b.get();
                Intrinsics.checkNotNullParameter(store, "store");
                return (AbToolBaseApi) store.d(AbToolBaseApi.class);
        }
    }

    public N(O7.o oVar, Jb.f fVar) {
        this.f11096b = fVar;
    }
}
