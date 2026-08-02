package P1;

import org.jetbrains.annotations.NotNull;

/* renamed from: P1.p, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC3809p {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private static final C3807n f21585a = new C3807n(0);

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private static final I f21586b = new I("sans-serif", "FontFamily.SansSerif");

    /* renamed from: P1.p$a */
    public interface a {
        @NotNull
        Z a(AbstractC3809p abstractC3809p, @NotNull F f7, int i11, int i12);
    }

    static {
        new I("serif", "FontFamily.Serif");
        new I("monospace", "FontFamily.Monospace");
        new I("cursive", "FontFamily.Cursive");
    }
}
