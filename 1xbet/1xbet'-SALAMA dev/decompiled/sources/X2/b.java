package X2;

import W2.g;
import com.google.android.gms.common.api.h;
import com.google.android.gms.common.api.i;
import com.google.android.gms.internal.p000authapi.zbl;

/* JADX INFO: loaded from: classes.dex */
public abstract class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final i f7468a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final i f7469b;

    static {
        h hVar = new h();
        h hVar2 = new h();
        g gVar = new g(1);
        g gVar2 = new g(2);
        i iVar = c.f7470a;
        f7468a = new i("Auth.CREDENTIALS_API", gVar, hVar);
        f7469b = new i("Auth.GOOGLE_SIGN_IN_API", gVar2, hVar2);
        new zbl();
    }
}
