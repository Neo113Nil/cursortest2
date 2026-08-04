package p033e3;

import W5.AbstractC0486a1;
import X2.b;
import android.content.Context;
import android.os.Binder;
import android.os.Looper;
import android.os.Parcel;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import com.google.android.gms.auth.api.signin.RevocationBoundService;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.BasePendingResult;
import com.google.android.gms.common.api.internal.C0799u;
import com.google.android.gms.common.api.internal.F;
import com.google.android.gms.common.api.o;
import com.google.android.gms.common.api.x;
import com.google.android.gms.common.internal.D;
import com.google.android.gms.common.internal.y;
import com.google.android.gms.internal.p000authapi.zbb;
import com.google.android.gms.tasks.TaskCompletionSource;
import p025d3.a;
import p090m3.c;
import p155w1.C1009l0;
import p155w1.C1013m0;

/* JADX INFO: loaded from: classes.dex */
public final class k extends zbb {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final RevocationBoundService f12674a;

    public k(RevocationBoundService revocationBoundService) {
        super("com.google.android.gms.auth.api.signin.internal.IRevocationService");
        this.f12674a = revocationBoundService;
    }

    public final void Z() {
        if (!c.j(this.f12674a, Binder.getCallingUid())) {
            throw new SecurityException(AbstractC0486a1.f(Binder.getCallingUid(), "Calling UID ", " is not Google Play services."));
        }
    }

    @Override // com.google.android.gms.internal.p000authapi.zbb
    public final boolean zba(int i7, Parcel parcel, Parcel parcel2, int i8) {
        BasePendingResult basePendingResultDoWrite;
        BasePendingResult basePendingResultDoWrite2;
        int i9 = 15;
        RevocationBoundService revocationBoundService = this.f12674a;
        if (i7 == 1) {
            Z();
            a aVarA = a.a(revocationBoundService);
            GoogleSignInAccount googleSignInAccountB = aVarA.b();
            GoogleSignInOptions googleSignInOptionsC = GoogleSignInOptions.f11030B;
            if (googleSignInAccountB != null) {
                googleSignInOptionsC = aVarA.c();
            }
            GoogleSignInOptions googleSignInOptions = googleSignInOptionsC;
            D.i(googleSignInOptions);
            a aVar = new a(this.f12674a, null, b.f7469b, googleSignInOptions, new com.google.android.gms.common.api.k(new C1009l0(i9), Looper.getMainLooper()));
            if (googleSignInAccountB != null) {
                o oVarAsGoogleApiClient = aVar.asGoogleApiClient();
                Context applicationContext = aVar.getApplicationContext();
                boolean z4 = aVar.c() == 3;
                g.f12671a.a("Revoking access", new Object[0]);
                String strE = a.a(applicationContext).e("refreshToken");
                g.a(applicationContext);
                if (!z4) {
                    basePendingResultDoWrite2 = ((F) oVarAsGoogleApiClient).f11115b.doWrite(new f(oVarAsGoogleApiClient, 1));
                } else if (strE == null) {
                    p062i3.a aVar2 = b.f12655c;
                    Status status = new Status(4, null, null, null);
                    D.a("Status code must not be SUCCESS", !status.j());
                    basePendingResultDoWrite2 = new x(status);
                    basePendingResultDoWrite2.setResult(status);
                } else {
                    b bVar = new b(strE);
                    new Thread(bVar).start();
                    basePendingResultDoWrite2 = bVar.f12657b;
                }
                C1013m0 c1013m0 = new C1013m0(i9);
                TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
                basePendingResultDoWrite2.addStatusListener(new y(basePendingResultDoWrite2, taskCompletionSource, c1013m0));
                taskCompletionSource.getTask();
            } else {
                o oVarAsGoogleApiClient2 = aVar.asGoogleApiClient();
                Context applicationContext2 = aVar.getApplicationContext();
                boolean z7 = aVar.c() == 3;
                g.f12671a.a("Signing out", new Object[0]);
                g.a(applicationContext2);
                if (z7) {
                    Status status2 = Status.f11077e;
                    basePendingResultDoWrite = new C0799u(oVarAsGoogleApiClient2);
                    basePendingResultDoWrite.setResult(status2);
                } else {
                    basePendingResultDoWrite = ((F) oVarAsGoogleApiClient2).f11115b.doWrite(new f(oVarAsGoogleApiClient2, 0));
                }
                C1013m0 c1013m1 = new C1013m0(i9);
                TaskCompletionSource taskCompletionSource2 = new TaskCompletionSource();
                basePendingResultDoWrite.addStatusListener(new y(basePendingResultDoWrite, taskCompletionSource2, c1013m1));
                taskCompletionSource2.getTask();
            }
        } else {
            if (i7 != 2) {
                return false;
            }
            Z();
            h.e0(revocationBoundService).f0();
        }
        return true;
    }
}
