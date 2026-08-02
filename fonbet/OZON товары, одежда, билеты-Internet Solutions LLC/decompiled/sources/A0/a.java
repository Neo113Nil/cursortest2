package A0;

import Z1.s;
import k1.C7464j;
import l1.AbstractC7839p0;
import l1.J0;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes.dex */
public abstract class a implements J0 {

    @NotNull
    private final b bottomEnd;

    @NotNull
    private final b bottomStart;

    @NotNull
    private final b topEnd;

    @NotNull
    private final b topStart;

    public a(@NotNull b bVar, @NotNull b bVar2, @NotNull b bVar3, @NotNull b bVar4) {
        this.topStart = bVar;
        this.topEnd = bVar2;
        this.bottomEnd = bVar3;
        this.bottomStart = bVar4;
    }

    public static /* synthetic */ a copy$default(a aVar, b bVar, b bVar2, b bVar3, b bVar4, int i11, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: copy");
        }
        if ((i11 & 1) != 0) {
            bVar = aVar.topStart;
        }
        if ((i11 & 2) != 0) {
            bVar2 = aVar.topEnd;
        }
        if ((i11 & 4) != 0) {
            bVar3 = aVar.bottomEnd;
        }
        if ((i11 & 8) != 0) {
            bVar4 = aVar.bottomStart;
        }
        return aVar.copy(bVar, bVar2, bVar3, bVar4);
    }

    @NotNull
    public final a copy(@NotNull b bVar) {
        return copy(bVar, bVar, bVar, bVar);
    }

    @NotNull
    public abstract a copy(@NotNull b bVar, @NotNull b bVar2, @NotNull b bVar3, @NotNull b bVar4);

    @NotNull
    /* renamed from: createOutline-LjSzlW0, reason: not valid java name */
    public abstract AbstractC7839p0 mo0createOutlineLjSzlW0(long j11, float f7, float f11, float f12, float f13, @NotNull s sVar);

    @Override // l1.J0
    @NotNull
    /* renamed from: createOutline-Pq9zytI, reason: not valid java name */
    public final AbstractC7839p0 mo1createOutlinePq9zytI(long j11, @NotNull s sVar, @NotNull Z1.d dVar) {
        float a11 = this.topStart.a(dVar, j11);
        float a12 = this.topEnd.a(dVar, j11);
        float a13 = this.bottomEnd.a(dVar, j11);
        float a14 = this.bottomStart.a(dVar, j11);
        float e11 = C7464j.e(j11);
        float f7 = a11 + a14;
        if (f7 > e11) {
            float f11 = e11 / f7;
            a11 *= f11;
            a14 *= f11;
        }
        float f12 = a12 + a13;
        if (f12 > e11) {
            float f13 = e11 / f12;
            a12 *= f13;
            a13 *= f13;
        }
        if (a11 >= 0.0f && a12 >= 0.0f && a13 >= 0.0f && a14 >= 0.0f) {
            return mo0createOutlineLjSzlW0(j11, a11, a12, a13, a14, sVar);
        }
        throw new IllegalArgumentException(("Corner size in Px can't be negative(topStart = " + a11 + ", topEnd = " + a12 + ", bottomEnd = " + a13 + ", bottomStart = " + a14 + ")!").toString());
    }

    @NotNull
    public final b getBottomEnd() {
        return this.bottomEnd;
    }

    @NotNull
    public final b getBottomStart() {
        return this.bottomStart;
    }

    @NotNull
    public final b getTopEnd() {
        return this.topEnd;
    }

    @NotNull
    public final b getTopStart() {
        return this.topStart;
    }
}
