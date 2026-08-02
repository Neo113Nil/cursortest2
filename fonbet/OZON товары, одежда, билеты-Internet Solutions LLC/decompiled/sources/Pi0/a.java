package Pi0;

import Qi0.d;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes3.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final Qi0.a f22557a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final Qi0.a f22558b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private final Qi0.a f22559c;

    /* renamed from: d, reason: collision with root package name */
    @NotNull
    private final Qi0.a f22560d;

    /* renamed from: e, reason: collision with root package name */
    @NotNull
    private final Qi0.a f22561e;

    /* renamed from: f, reason: collision with root package name */
    private final d f22562f;

    public a(@NotNull Qi0.a trackCampaign, @NotNull Qi0.a eventV2, @NotNull Qi0.a trinityEvent, @NotNull Qi0.a pageViewEvent, @NotNull Qi0.a customEvent, d dVar) {
        Intrinsics.checkNotNullParameter(trackCampaign, "trackCampaign");
        Intrinsics.checkNotNullParameter(eventV2, "eventV2");
        Intrinsics.checkNotNullParameter(trinityEvent, "trinityEvent");
        Intrinsics.checkNotNullParameter(pageViewEvent, "pageViewEvent");
        Intrinsics.checkNotNullParameter(customEvent, "customEvent");
        this.f22557a = trackCampaign;
        this.f22558b = eventV2;
        this.f22559c = trinityEvent;
        this.f22560d = pageViewEvent;
        this.f22561e = customEvent;
        this.f22562f = dVar;
    }

    public static a a(a aVar, Qi0.a aVar2, Qi0.a aVar3, Qi0.a aVar4, Qi0.a aVar5, Qi0.a aVar6, d dVar, int i11) {
        if ((i11 & 1) != 0) {
            aVar2 = aVar.f22557a;
        }
        Qi0.a trackCampaign = aVar2;
        if ((i11 & 2) != 0) {
            aVar3 = aVar.f22558b;
        }
        Qi0.a eventV2 = aVar3;
        if ((i11 & 4) != 0) {
            aVar4 = aVar.f22559c;
        }
        Qi0.a trinityEvent = aVar4;
        if ((i11 & 8) != 0) {
            aVar5 = aVar.f22560d;
        }
        Qi0.a pageViewEvent = aVar5;
        if ((i11 & 16) != 0) {
            aVar6 = aVar.f22561e;
        }
        Qi0.a customEvent = aVar6;
        if ((i11 & 32) != 0) {
            dVar = aVar.f22562f;
        }
        aVar.getClass();
        Intrinsics.checkNotNullParameter(trackCampaign, "trackCampaign");
        Intrinsics.checkNotNullParameter(eventV2, "eventV2");
        Intrinsics.checkNotNullParameter(trinityEvent, "trinityEvent");
        Intrinsics.checkNotNullParameter(pageViewEvent, "pageViewEvent");
        Intrinsics.checkNotNullParameter(customEvent, "customEvent");
        return new a(trackCampaign, eventV2, trinityEvent, pageViewEvent, customEvent, dVar);
    }

    @NotNull
    public final Qi0.a b() {
        return this.f22561e;
    }

    @NotNull
    public final Qi0.a c() {
        return this.f22558b;
    }

    public final d d() {
        return this.f22562f;
    }

    @NotNull
    public final Qi0.a e() {
        return this.f22560d;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return Intrinsics.d(this.f22557a, aVar.f22557a) && Intrinsics.d(this.f22558b, aVar.f22558b) && Intrinsics.d(this.f22559c, aVar.f22559c) && Intrinsics.d(this.f22560d, aVar.f22560d) && Intrinsics.d(this.f22561e, aVar.f22561e) && Intrinsics.d(this.f22562f, aVar.f22562f);
    }

    @NotNull
    public final Qi0.a f() {
        return this.f22557a;
    }

    @NotNull
    public final Qi0.a g() {
        return this.f22559c;
    }

    public final int hashCode() {
        int hashCode = (this.f22561e.hashCode() + ((this.f22560d.hashCode() + ((this.f22559c.hashCode() + ((this.f22558b.hashCode() + (this.f22557a.hashCode() * 31)) * 31)) * 31)) * 31)) * 31;
        d dVar = this.f22562f;
        return hashCode + (dVar == null ? 0 : dVar.hashCode());
    }

    @NotNull
    public final String toString() {
        return "ProductEventUIState(trackCampaign=" + this.f22557a + ", eventV2=" + this.f22558b + ", trinityEvent=" + this.f22559c + ", pageViewEvent=" + this.f22560d + ", customEvent=" + this.f22561e + ", notification=" + this.f22562f + ")";
    }
}
