package T7;

import T7.C4028j;
import com.google.crypto.tink.internal.InterfaceC5884c;
import j8.C7307b;
import java.security.GeneralSecurityException;

/* renamed from: T7.l, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class C4030l implements InterfaceC5884c {
    @Override // com.google.crypto.tink.internal.InterfaceC5884c
    public final He.g a(S7.q qVar, Integer num) {
        C4032n c4032n = (C4032n) qVar;
        if (c4032n.d() == 24) {
            throw new GeneralSecurityException("192 bit AES GCM Parameters are not valid");
        }
        C4028j.a aVar = new C4028j.a();
        aVar.d(c4032n);
        aVar.b(num);
        aVar.c(C7307b.b(c4032n.d()));
        return aVar.a();
    }
}
