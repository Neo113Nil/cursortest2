package W;

import androidx.annotation.NonNull;

/* loaded from: classes8.dex */
public abstract class t0 {

    /* renamed from: a, reason: collision with root package name */
    private final AbstractC4849u f33133a;

    /* renamed from: b, reason: collision with root package name */
    private final X f33134b;

    public static final class a extends t0 {

        /* renamed from: c, reason: collision with root package name */
        private final int f33135c;

        a(@NonNull AbstractC4849u abstractC4849u, @NonNull X x11, int i11) {
            super(abstractC4849u, x11);
            this.f33135c = i11;
        }

        public final int c() {
            return this.f33135c;
        }

        public final boolean d() {
            return this.f33135c != 0;
        }
    }

    public static final class b extends t0 {
    }

    public static final class c extends t0 {
    }

    public static final class d extends t0 {
    }

    public static final class e extends t0 {
    }

    t0(@NonNull AbstractC4849u abstractC4849u, @NonNull X x11) {
        abstractC4849u.getClass();
        this.f33133a = abstractC4849u;
        this.f33134b = x11;
    }

    @NonNull
    public final AbstractC4849u a() {
        return this.f33133a;
    }

    @NonNull
    public final X b() {
        return this.f33134b;
    }
}
