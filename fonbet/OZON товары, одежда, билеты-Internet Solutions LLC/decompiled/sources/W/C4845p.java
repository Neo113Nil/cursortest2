package W;

import androidx.annotation.NonNull;

/* renamed from: W.p, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public class C4845p {

    /* renamed from: a, reason: collision with root package name */
    static final C4845p f33113a = new C4834e(C4852x.f33153g, 0);

    /* renamed from: W.p$a */
    static abstract class a extends C4845p {
        a() {
        }

        @NonNull
        abstract C4852x b();

        abstract int c();
    }

    @NonNull
    public static C4845p a(@NonNull C4852x c4852x) {
        return new C4834e(c4852x, 1);
    }
}
