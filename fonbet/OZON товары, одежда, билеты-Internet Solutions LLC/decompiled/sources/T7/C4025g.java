package T7;

import T7.C4023e;
import com.google.crypto.tink.internal.InterfaceC5884c;
import j8.C7307b;
import java.security.GeneralSecurityException;

/* renamed from: T7.g, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class C4025g implements InterfaceC5884c {
    @Override // com.google.crypto.tink.internal.InterfaceC5884c
    public final He.g a(S7.q qVar, Integer num) {
        C4027i c4027i = (C4027i) qVar;
        if (c4027i.c() != 16 && c4027i.c() != 32) {
            throw new GeneralSecurityException("AES key size must be 16 or 32 bytes");
        }
        C4023e.a aVar = new C4023e.a();
        aVar.e(c4027i);
        aVar.d(num);
        aVar.b(C7307b.b(c4027i.c()));
        aVar.c(C7307b.b(c4027i.e()));
        return aVar.a();
    }
}
