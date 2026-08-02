package Td;

import java.io.IOException;

/* loaded from: classes.dex */
public final class j extends IOException {

    /* renamed from: a, reason: collision with root package name */
    private p f27092a;

    public j(String str) {
        super(str);
        this.f27092a = null;
    }

    static j d() {
        return new j("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either than the input has been truncated or that an embedded message misreported its own length.");
    }

    public final p a() {
        return this.f27092a;
    }

    public final void b(p pVar) {
        this.f27092a = pVar;
    }
}
