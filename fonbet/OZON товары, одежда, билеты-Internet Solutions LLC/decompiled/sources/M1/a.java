package M1;

import android.text.SegmentFinder;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes8.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    public static final a f17231a = new a();

    /* renamed from: M1.a$a, reason: collision with other inner class name */
    public static final class C0335a extends SegmentFinder {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ f f17232a;

        C0335a(f fVar) {
            this.f17232a = fVar;
        }

        public final int nextEndBoundary(int i11) {
            return this.f17232a.d(i11);
        }

        public final int nextStartBoundary(int i11) {
            return this.f17232a.b(i11);
        }

        public final int previousEndBoundary(int i11) {
            return this.f17232a.a(i11);
        }

        public final int previousStartBoundary(int i11) {
            return this.f17232a.c(i11);
        }
    }

    @NotNull
    public final SegmentFinder a(@NotNull f fVar) {
        return new C0335a(fVar);
    }
}
