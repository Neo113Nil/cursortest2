package Sg;

import org.jetbrains.annotations.NotNull;

/* loaded from: classes6.dex */
public final class d implements a {

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    public static final d f26237b = new d();

    /* renamed from: c, reason: collision with root package name */
    private static volatile Rg.a f26238c;

    @Override // Sg.a
    public final Rg.a a() {
        return f26238c;
    }

    @Override // Sg.a
    public final void b(a aVar) {
        throw new UnsupportedOperationException("Can't set parent storage for top level storage.");
    }

    @Override // Sg.a
    public final void c() {
        throw new UnsupportedOperationException("Can't use parent storage in top level storage.");
    }

    @Override // Sg.a
    public final a d() {
        return null;
    }

    @Override // Sg.a
    public final void e(Rg.a aVar) {
        f26238c = aVar;
    }
}
