package Hj0;

import com.squareup.moshi.Moshi;
import k00.C7451d;
import kotlin.jvm.internal.Intrinsics;
import mi0.C8340j;
import mi0.C8341k;

/* loaded from: classes7.dex */
public final class Q implements Jb.e {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f11101a;

    /* renamed from: b, reason: collision with root package name */
    private final Pc.a f11102b;

    /* renamed from: c, reason: collision with root package name */
    private final Pc.a f11103c;

    public /* synthetic */ Q(Pc.a aVar, Pc.a aVar2, int i11) {
        this.f11101a = i11;
        this.f11102b = aVar;
        this.f11103c = aVar2;
    }

    @Override // Pc.a
    public final Object get() {
        switch (this.f11101a) {
            case 0:
                Moshi moshi = (Moshi) this.f11102b.get();
                fi0.x trackerSettings = (fi0.x) ((Jb.f) this.f11103c).get();
                Intrinsics.checkNotNullParameter(moshi, "moshi");
                Intrinsics.checkNotNullParameter(trackerSettings, "trackerSettings");
                return trackerSettings.I() ? new C8340j(moshi) : new C8341k();
            default:
                return new C7451d(this.f11102b, this.f11103c);
        }
    }
}
