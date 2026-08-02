package T7;

import T7.C4033o;
import com.google.crypto.tink.internal.InterfaceC5884c;
import j8.C7307b;
import java.security.GeneralSecurityException;

/* renamed from: T7.p, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class C4034p implements InterfaceC5884c {
    @Override // com.google.crypto.tink.internal.InterfaceC5884c
    public final He.g a(S7.q qVar, Integer num) {
        r rVar = (r) qVar;
        if (rVar.d() == 24) {
            throw new GeneralSecurityException("192 bit AES GCM Parameters are not valid");
        }
        C4033o.a aVar = new C4033o.a();
        aVar.d(rVar);
        aVar.b(num);
        aVar.c(C7307b.b(rVar.d()));
        return aVar.a();
    }
}
