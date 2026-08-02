package I1;

import D1.H;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes.dex */
public final class t {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final H f11742a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final f f11743b;

    public t(@NotNull H h11, @NotNull f fVar) {
        this.f11742a = h11;
        this.f11743b = fVar;
    }

    @NotNull
    public final r a() {
        return new r(this.f11743b, false, this.f11742a, new l());
    }
}
