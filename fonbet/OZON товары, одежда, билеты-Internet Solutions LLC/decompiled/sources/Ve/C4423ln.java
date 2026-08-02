package Ve;

import kotlin.jvm.internal.Intrinsics;
import nf.C8588a;

/* renamed from: Ve.ln, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C4423ln implements Jb.e {

    /* renamed from: a, reason: collision with root package name */
    public final Pc.a f31537a;

    /* renamed from: b, reason: collision with root package name */
    public final Pc.a f31538b;

    public C4423ln(Pc.a aVar, Pc.a aVar2) {
        this.f31537a = aVar;
        this.f31538b = aVar2;
    }

    @Override // Pc.a
    public final Object get() {
        Tf loggingContract = (Tf) this.f31537a.get();
        T8 sPaySdkMerchantOptionsRepository = (T8) this.f31538b.get();
        Intrinsics.checkNotNullParameter(loggingContract, "loggingContract");
        Intrinsics.checkNotNullParameter(sPaySdkMerchantOptionsRepository, "sPaySdkMerchantOptionsRepository");
        C8588a c8588a = new C8588a(new Th(loggingContract, sPaySdkMerchantOptionsRepository));
        c8588a.c(C8588a.EnumC1299a.BODY);
        return c8588a;
    }
}
