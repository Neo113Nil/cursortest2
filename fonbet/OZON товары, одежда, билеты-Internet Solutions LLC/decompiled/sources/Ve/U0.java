package Ve;

import a8.C4960a;
import android.content.Context;
import androidx.recyclerview.widget.LinearLayoutManager;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes10.dex */
public final class U0 {

    /* renamed from: a, reason: collision with root package name */
    public static final U0 f30086a = new U0();

    /* renamed from: b, reason: collision with root package name */
    public static final Je.d f30087b = Je.e.a();

    /* renamed from: c, reason: collision with root package name */
    public static S7.s f30088c;

    public static final S7.s a(Context context) {
        int i11 = g8.k.f64020a;
        g8.o.d();
        if (!X7.a.b()) {
            g8.c.a();
            g8.g.a();
        }
        C4960a.C0700a c0700a = new C4960a.C0700a();
        c0700a.m(context, "__androidx_security_crypto_encrypted_file_keyset__", "__androidx_security_crypto_encrypted_file_pref__");
        c0700a.k(S7.h.a(com.google.crypto.tink.internal.s.b().a("AES256_GCM_HKDF_4KB")));
        c0700a.l("android-keystore://spay_datastore_tink");
        S7.j b11 = c0700a.f().b();
        Intrinsics.checkNotNullExpressionValue(b11, "Builder()\n            .w…            .keysetHandle");
        Object h11 = b11.h(com.google.crypto.tink.internal.I.c(), S7.s.class);
        S7.s sVar = (S7.s) h11;
        Lm0.a.f17149a.i("Successfully create cipher", new Object[0]);
        Intrinsics.checkNotNullExpressionValue(h11, "keysetHandle.getPrimitiv…te cipher\")\n            }");
        return sVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0047 A[DONT_GENERATE] */
    /* JADX WARN: Removed duplicated region for block: B:17:0x004b A[Catch: all -> 0x0053, TRY_ENTER, TryCatch #0 {all -> 0x0053, blocks: (B:12:0x0043, B:17:0x004b, B:18:0x0052), top: B:11:0x0043 }] */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object b(kotlin.coroutines.jvm.internal.c cVar) {
        Tr tr;
        int i11;
        Je.d dVar;
        S7.s sVar;
        try {
            if (cVar instanceof Tr) {
                tr = (Tr) cVar;
                int i12 = tr.f30083g;
                if ((i12 & LinearLayoutManager.INVALID_OFFSET) != 0) {
                    tr.f30083g = i12 - LinearLayoutManager.INVALID_OFFSET;
                    Object obj = tr.f30081e;
                    Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
                    i11 = tr.f30083g;
                    if (i11 != 0) {
                        Sc.s.b(obj);
                        Je.d dVar2 = f30087b;
                        tr.f30080d = dVar2;
                        tr.f30083g = 1;
                        if (dVar2.a(tr) == aVar) {
                            return aVar;
                        }
                        dVar = dVar2;
                    } else {
                        if (i11 != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        dVar = tr.f30080d;
                        Sc.s.b(obj);
                    }
                    sVar = f30088c;
                    if (sVar == null) {
                        return sVar;
                    }
                    throw new IllegalStateException("TinkEncryptionConfig is not initialized. Call initialize() first.");
                }
            }
            sVar = f30088c;
            if (sVar == null) {
            }
        } finally {
            dVar.c(null);
        }
        tr = new Tr(this, cVar);
        Object obj2 = tr.f30081e;
        Wc.a aVar2 = Wc.a.COROUTINE_SUSPENDED;
        i11 = tr.f30083g;
        if (i11 != 0) {
        }
    }
}
