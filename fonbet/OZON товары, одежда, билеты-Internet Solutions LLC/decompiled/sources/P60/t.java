package P60;

import android.content.Context;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class t implements Jb.e {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f21927a;

    /* renamed from: b, reason: collision with root package name */
    private final Pc.a f21928b;

    public /* synthetic */ t(Pc.a aVar, int i11) {
        this.f21927a = i11;
        this.f21928b = aVar;
    }

    @Override // Pc.a
    public final Object get() {
        switch (this.f21927a) {
            case 0:
                return new s((g) this.f21928b.get());
            case 1:
                return new w30.t((Context) this.f21928b.get());
            default:
                Context context = (Context) ((Jb.f) this.f21928b).get();
                Intrinsics.checkNotNullParameter(context, "context");
                return new ru.ozon.android.messenger.utils.file.d(context);
        }
    }
}
