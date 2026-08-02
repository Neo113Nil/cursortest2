package A00;

import A00.e;
import G.g;
import P00.k;
import java.util.List;
import kotlin.collections.K;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.IntRange;
import l20.C7854a;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes7.dex */
public final class d<I extends C7854a> extends A00.a {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final IntRange f259a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final List<k<I>> f260b;

    /* renamed from: c, reason: collision with root package name */
    private final e f261c;

    /* loaded from: classes3.dex */
    public static final class a<I extends C7854a> {

        /* renamed from: a, reason: collision with root package name */
        @NotNull
        private IntRange f262a;

        /* renamed from: b, reason: collision with root package name */
        @NotNull
        private List<k<I>> f263b;

        /* renamed from: c, reason: collision with root package name */
        private e f264c;

        public a() {
            IntRange intRange;
            IntRange.INSTANCE.getClass();
            intRange = IntRange.f71831f;
            this.f262a = intRange;
            this.f263b = K.f71697a;
        }

        @NotNull
        public final void a(int i11) throws IllegalArgumentException {
            if (i11 < 0) {
                throw new IllegalArgumentException("Range is not valid, start do not greater than end");
            }
            if (i11 < 0) {
                throw new IllegalArgumentException("End of the range is negative");
            }
            this.f262a = new IntRange(1, i11 + 1, 1);
        }

        @NotNull
        public final d<I> b() {
            IntRange intRange;
            IntRange.INSTANCE.getClass();
            intRange = IntRange.f71831f;
            if (Intrinsics.d(intRange, this.f262a)) {
                throw new IllegalArgumentException("range is empty");
            }
            e eVar = this.f264c;
            if (eVar != null && !f.b(eVar.e())) {
                e.a aVar = new e.a(eVar);
                aVar.d(0);
                this.f264c = aVar.b();
            }
            return new d<>(this.f262a, this.f263b, this.f264c);
        }

        @NotNull
        public final void c(@NotNull List pages) {
            Intrinsics.checkNotNullParameter(pages, "pages");
            this.f263b = pages;
        }
    }

    private d() {
        throw null;
    }

    public d(IntRange intRange, List list, e eVar) {
        this.f259a = intRange;
        this.f260b = list;
        this.f261c = eVar;
    }

    @NotNull
    public final IntRange d() {
        return this.f259a;
    }

    @NotNull
    public final List<k<I>> e() {
        return this.f260b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!d.class.equals(obj != null ? obj.getClass() : null)) {
            return false;
        }
        Intrinsics.g(obj, "null cannot be cast to non-null type ru.ozon.composer.event.ReplacePagesEvent<*>");
        d dVar = (d) obj;
        return Intrinsics.d(this.f259a, dVar.f259a) && Intrinsics.d(this.f260b, dVar.f260b) && Intrinsics.d(this.f261c, dVar.f261c);
    }

    public final e f() {
        return this.f261c;
    }

    public final int hashCode() {
        int b11 = g.b(this.f259a.hashCode() * 31, 31, this.f260b);
        e eVar = this.f261c;
        return b11 + (eVar != null ? eVar.hashCode() : 0);
    }

    @NotNull
    public final String toString() {
        return "ReplacePagesEvent(at=" + this.f259a + ", pagesToReplace=" + this.f260b.size() + ", scrollEvent=" + this.f261c + ")";
    }
}
