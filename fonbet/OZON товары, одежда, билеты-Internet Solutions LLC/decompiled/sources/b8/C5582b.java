package b8;

import S7.q;
import b8.C5581a;
import com.google.crypto.tink.internal.InterfaceC5884c;
import j8.C7307b;
import java.security.GeneralSecurityException;

/* renamed from: b8.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class C5582b implements InterfaceC5884c {
    @Override // com.google.crypto.tink.internal.InterfaceC5884c
    public final He.g a(q qVar, Integer num) {
        C5584d c5584d = (C5584d) qVar;
        if (c5584d.d() != 32) {
            throw new GeneralSecurityException("AesCmacKey size wrong, must be 32 bytes");
        }
        C5581a.C0831a c0831a = new C5581a.C0831a();
        c0831a.d(c5584d);
        c0831a.b(C7307b.b(c5584d.d()));
        c0831a.c(num);
        return c0831a.a();
    }
}
