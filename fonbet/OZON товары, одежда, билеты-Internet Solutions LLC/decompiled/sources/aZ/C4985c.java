package aZ;

import aZ.C4983a;

/* renamed from: aZ.c, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C4985c implements C4983a.InterfaceC0703a {

    /* renamed from: a, reason: collision with root package name */
    private final C4984b f36522a;

    C4985c(C4984b c4984b) {
        this.f36522a = c4984b;
    }

    public static Jb.f a(C4984b c4984b) {
        return Jb.f.a(new C4985c(c4984b));
    }

    @Override // aZ.C4983a.InterfaceC0703a
    public final C4983a create() {
        return this.f36522a.a();
    }
}
