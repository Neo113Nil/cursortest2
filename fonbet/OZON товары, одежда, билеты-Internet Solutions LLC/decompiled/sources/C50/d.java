package C50;

import B0.C2454a;
import Kk.C3532b;
import Ve.Om;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes3.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final String f4415a;

    /* renamed from: b, reason: collision with root package name */
    private final int f4416b;

    /* renamed from: c, reason: collision with root package name */
    private final int f4417c;

    /* renamed from: d, reason: collision with root package name */
    private final boolean f4418d;

    /* renamed from: e, reason: collision with root package name */
    private final Boolean f4419e;

    /* renamed from: f, reason: collision with root package name */
    @NotNull
    private final ArrayList f4420f;

    public d(@NotNull String id2, int i11, int i12, boolean z11, Boolean bool, @NotNull ArrayList storiesList) {
        Intrinsics.checkNotNullParameter(id2, "id");
        Intrinsics.checkNotNullParameter(storiesList, "storiesList");
        this.f4415a = id2;
        this.f4416b = i11;
        this.f4417c = i12;
        this.f4418d = z11;
        this.f4419e = bool;
        this.f4420f = storiesList;
    }

    public final boolean a() {
        return this.f4418d;
    }

    public final Boolean b() {
        return this.f4419e;
    }

    @NotNull
    public final String c() {
        return this.f4415a;
    }

    public final int d() {
        return this.f4417c;
    }

    public final int e() {
        return this.f4416b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        return Intrinsics.d(this.f4415a, dVar.f4415a) && this.f4416b == dVar.f4416b && this.f4417c == dVar.f4417c && this.f4418d == dVar.f4418d && this.f4419e.equals(dVar.f4419e) && this.f4420f.equals(dVar.f4420f);
    }

    @NotNull
    public final List<e> f() {
        return this.f4420f;
    }

    public final int hashCode() {
        return this.f4420f.hashCode() + ((this.f4419e.hashCode() + C3532b.a(C2454a.a(this.f4417c, C2454a.a(this.f4416b, C2454a.a(2, this.f4415a.hashCode() * 31, 31), 31), 31), 31, this.f4418d)) * 31);
    }

    @NotNull
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("StoriesUI(id=");
        sb2.append(this.f4415a);
        sb2.append(", cbottomVersion=2, selectedStory=");
        sb2.append(this.f4416b);
        sb2.append(", selectedFrame=");
        sb2.append(this.f4417c);
        sb2.append(", canClose=");
        sb2.append(this.f4418d);
        sb2.append(", displayCloseCross=");
        sb2.append(this.f4419e);
        sb2.append(", storiesList=");
        return Om.a(")", sb2, this.f4420f);
    }
}
