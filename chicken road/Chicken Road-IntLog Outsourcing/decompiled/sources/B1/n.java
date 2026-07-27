package B1;

import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.BasePendingResult;
import m1.C1277d;
import m1.InterfaceC1276c;
import o1.u;

/* loaded from: classes.dex */
public abstract class n extends BasePendingResult {

    /* renamed from: l, reason: collision with root package name */
    public final C1277d f236l;

    /* renamed from: m, reason: collision with root package name */
    public final m1.e f237m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(GoogleApiClient googleApiClient) {
        super(googleApiClient);
        m1.e eVar = E1.c.f641a;
        u.h(googleApiClient, "GoogleApiClient must not be null");
        u.h(eVar, "Api must not be null");
        this.f236l = eVar.f11124b;
        this.f237m = eVar;
    }

    public abstract void K(InterfaceC1276c interfaceC1276c);

    public final void L(Status status) {
        u.a("Failed result must not be success", !(status.f4977a <= 0));
        H(status);
    }
}
