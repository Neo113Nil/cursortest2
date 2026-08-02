package e3;

import W5.AbstractC0486a1;
import android.content.Context;
import android.os.Binder;
import android.os.Looper;
import android.os.Parcel;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import com.google.android.gms.auth.api.signin.RevocationBoundService;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.BasePendingResult;
import com.google.android.gms.common.api.internal.C0843u;
import com.google.android.gms.common.api.internal.F;
import com.google.android.gms.common.api.l;
import com.google.android.gms.common.api.o;
import com.google.android.gms.common.api.x;
import com.google.android.gms.common.internal.D;
import com.google.android.gms.common.internal.y;
import com.google.android.gms.internal.p000authapi.zbb;
import com.google.android.gms.tasks.TaskCompletionSource;
import d3.C0960a;
import i3.C1263a;
import w1.C1718l0;
import w1.C1722m0;

/* renamed from: e3.k, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class BinderC1026k extends zbb {

    /* renamed from: a, reason: collision with root package name */
    public final RevocationBoundService f12668a;

    public BinderC1026k(RevocationBoundService revocationBoundService) {
        super("com.google.android.gms.auth.api.signin.internal.IRevocationService");
        this.f12668a = revocationBoundService;
    }

    public final void Z() {
        if (!m3.c.j(this.f12668a, Binder.getCallingUid())) {
            throw new SecurityException(AbstractC0486a1.f(Binder.getCallingUid(), "Calling UID ", " is not Google Play services."));
        }
    }

    @Override // com.google.android.gms.internal.p000authapi.zbb
    public final boolean zba(int i7, Parcel parcel, Parcel parcel2, int i8) {
        BasePendingResult doWrite;
        BasePendingResult doWrite2;
        int i9 = 15;
        RevocationBoundService revocationBoundService = this.f12668a;
        if (i7 == 1) {
            Z();
            C1016a a2 = C1016a.a(revocationBoundService);
            GoogleSignInAccount b7 = a2.b();
            GoogleSignInOptions googleSignInOptions = GoogleSignInOptions.f11030B;
            if (b7 != null) {
                googleSignInOptions = a2.c();
            }
            GoogleSignInOptions googleSignInOptions2 = googleSignInOptions;
            D.i(googleSignInOptions2);
            C0960a c0960a = new C0960a(this.f12668a, null, X2.b.f7469b, googleSignInOptions2, new com.google.android.gms.common.api.k(new C1718l0(i9), Looper.getMainLooper()));
            if (b7 != null) {
                o asGoogleApiClient = c0960a.asGoogleApiClient();
                Context applicationContext = c0960a.getApplicationContext();
                boolean z4 = c0960a.c() == 3;
                AbstractC1022g.f12665a.a("Revoking access", new Object[0]);
                String e7 = C1016a.a(applicationContext).e("refreshToken");
                AbstractC1022g.a(applicationContext);
                if (!z4) {
                    doWrite2 = ((F) asGoogleApiClient).f11115b.doWrite((l) new C1021f(asGoogleApiClient, 1));
                } else if (e7 == null) {
                    C1263a c1263a = RunnableC1017b.f12649c;
                    Status status = new Status(4, null, null, null);
                    D.a("Status code must not be SUCCESS", !status.j());
                    doWrite2 = new x(status);
                    doWrite2.setResult((BasePendingResult) status);
                } else {
                    RunnableC1017b runnableC1017b = new RunnableC1017b(e7);
                    new Thread(runnableC1017b).start();
                    doWrite2 = runnableC1017b.f12651b;
                }
                C1722m0 c1722m0 = new C1722m0(i9);
                TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
                doWrite2.addStatusListener(new y(doWrite2, taskCompletionSource, c1722m0));
                taskCompletionSource.getTask();
            } else {
                o asGoogleApiClient2 = c0960a.asGoogleApiClient();
                Context applicationContext2 = c0960a.getApplicationContext();
                boolean z7 = c0960a.c() == 3;
                AbstractC1022g.f12665a.a("Signing out", new Object[0]);
                AbstractC1022g.a(applicationContext2);
                if (z7) {
                    Status status2 = Status.f11077e;
                    doWrite = new C0843u(asGoogleApiClient2);
                    doWrite.setResult((BasePendingResult) status2);
                } else {
                    doWrite = ((F) asGoogleApiClient2).f11115b.doWrite((l) new C1021f(asGoogleApiClient2, 0));
                }
                C1722m0 c1722m02 = new C1722m0(i9);
                TaskCompletionSource taskCompletionSource2 = new TaskCompletionSource();
                doWrite.addStatusListener(new y(doWrite, taskCompletionSource2, c1722m02));
                taskCompletionSource2.getTask();
            }
        } else {
            if (i7 != 2) {
                return false;
            }
            Z();
            C1023h.e0(revocationBoundService).f0();
        }
        return true;
    }
}
