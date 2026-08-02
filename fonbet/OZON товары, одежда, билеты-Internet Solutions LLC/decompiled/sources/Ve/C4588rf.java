package Ve;

import androidx.recyclerview.widget.LinearLayoutManager;
import kotlin.jvm.internal.Intrinsics;
import spay.seamlessAuth.core.data.model.OIDCStand;

/* renamed from: Ve.rf, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C4588rf {

    /* renamed from: a, reason: collision with root package name */
    public final In f31976a;

    /* renamed from: b, reason: collision with root package name */
    public final C4365jn f31977b;

    public C4588rf(In appTokenStoreSP, C4365jn appTokenRepository) {
        Intrinsics.checkNotNullParameter(appTokenStoreSP, "appTokenStoreSP");
        Intrinsics.checkNotNullParameter(appTokenRepository, "appTokenRepository");
        this.f31976a = appTokenStoreSP;
        this.f31977b = appTokenRepository;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0087  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0049  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(String str, String str2, kotlin.coroutines.jvm.internal.c cVar) {
        Oe oe2;
        int i11;
        Object obj;
        String str3;
        C4588rf c4588rf;
        C4393km c4393km;
        C4393km c4393km2;
        String str4;
        if (cVar instanceof Oe) {
            oe2 = (Oe) cVar;
            int i12 = oe2.f29617i;
            if ((i12 & LinearLayoutManager.INVALID_OFFSET) != 0) {
                oe2.f29617i = i12 - LinearLayoutManager.INVALID_OFFSET;
                Object obj2 = oe2.f29615g;
                Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
                i11 = oe2.f29617i;
                if (i11 != 0) {
                    Sc.s.b(obj2);
                    oe2.f29612d = this;
                    oe2.f29613e = str;
                    oe2.f29614f = str2;
                    oe2.f29617i = 1;
                    C4393km b11 = ((C4483np) this.f31976a).b();
                    if (b11 != aVar) {
                        obj = b11;
                        str3 = str2;
                        c4588rf = this;
                    }
                    return aVar;
                }
                if (i11 != 1) {
                    if (i11 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    c4393km2 = (C4393km) oe2.f29613e;
                    c4588rf = oe2.f29612d;
                    Sc.s.b(obj2);
                    C4207e9 c4207e9 = (C4207e9) obj2;
                    str4 = c4207e9 == null ? c4207e9.f30918a : null;
                    c4588rf.getClass();
                    if (str4 != null) {
                        return new A8(U7.d.e(M1.b.m(OIDCStand.INSTANCE.getActualOIDCStand().getUrl()).concat("?token="), str4), c4393km2.f31455b, c4393km2.f31456c);
                    }
                    return null;
                }
                String str5 = oe2.f29614f;
                str = (String) oe2.f29613e;
                C4588rf c4588rf2 = oe2.f29612d;
                Sc.s.b(obj2);
                str3 = str5;
                c4588rf = c4588rf2;
                obj = obj2;
                c4393km = (C4393km) obj;
                if (c4393km != null) {
                    C4365jn c4365jn = c4588rf.f31977b;
                    oe2.f29612d = c4588rf;
                    oe2.f29613e = c4393km;
                    oe2.f29614f = null;
                    oe2.f29617i = 2;
                    obj2 = c4365jn.a(c4393km, str3, str, oe2);
                    if (obj2 != aVar) {
                        c4393km2 = c4393km;
                        C4207e9 c4207e92 = (C4207e9) obj2;
                        if (c4207e92 == null) {
                        }
                        c4588rf.getClass();
                        if (str4 != null) {
                        }
                    }
                    return aVar;
                }
                return null;
            }
        }
        oe2 = new Oe(this, cVar);
        Object obj22 = oe2.f29615g;
        Wc.a aVar2 = Wc.a.COROUTINE_SUSPENDED;
        i11 = oe2.f29617i;
        if (i11 != 0) {
        }
        c4393km = (C4393km) obj;
        if (c4393km != null) {
        }
        return null;
    }
}
