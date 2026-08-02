package com.google.android.gms.auth.api.signin.internal;

import android.content.Context;
import android.os.Looper;
import android.os.Parcel;
import android.os.RemoteException;
import android.text.TextUtils;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import com.google.android.gms.auth.api.signin.RevocationBoundService;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.g;
import com.google.android.gms.common.api.internal.BasePendingResult;
import com.google.android.gms.common.api.internal.C0827a;
import com.google.android.gms.common.api.internal.C0846u;
import com.google.android.gms.common.internal.C0875q;
import com.google.android.gms.common.internal.I;
import com.google.android.gms.common.internal.J;
import com.google.android.gms.internal.p000authapi.zbb;
import com.google.android.gms.tasks.TaskCompletionSource;
import org.json.JSONException;

/* loaded from: classes4.dex */
public abstract class o extends zbb {
    @Override // com.google.android.gms.internal.p000authapi.zbb
    public final boolean zba(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        BasePendingResult b;
        BasePendingResult b2;
        String d;
        if (i != 1) {
            if (i != 2) {
                return false;
            }
            s sVar = (s) this;
            sVar.C();
            n.a(sVar.a).b();
            return true;
        }
        s sVar2 = (s) this;
        sVar2.C();
        RevocationBoundService revocationBoundService = sVar2.a;
        b a = b.a(revocationBoundService);
        GoogleSignInAccount b3 = a.b();
        GoogleSignInOptions googleSignInOptions = GoogleSignInOptions.n;
        if (b3 != null) {
            String d2 = a.d("defaultGoogleSignInAccount");
            if (!TextUtils.isEmpty(d2) && (d = a.d(b.f("googleSignInOptions", d2))) != null) {
                try {
                    googleSignInOptions = GoogleSignInOptions.l(d);
                } catch (JSONException unused) {
                }
            }
            googleSignInOptions = null;
        }
        C0875q.g(googleSignInOptions);
        com.google.android.gms.auth.api.signin.a aVar = new com.google.android.gms.auth.api.signin.a(revocationBoundService, com.google.android.gms.auth.api.a.a, googleSignInOptions, new g.a(new C0827a(), Looper.getMainLooper()));
        if (b3 != null) {
            com.google.android.gms.common.api.h asGoogleApiClient = aVar.asGoogleApiClient();
            Context applicationContext = aVar.getApplicationContext();
            boolean z = aVar.a() == 3;
            m.a.a("Revoking access", new Object[0]);
            String d3 = b.a(applicationContext).d("refreshToken");
            m.a(applicationContext);
            if (!z) {
                b2 = asGoogleApiClient.b(new k(asGoogleApiClient));
            } else if (d3 == null) {
                com.google.android.gms.common.logging.a aVar2 = e.c;
                Status status = new Status(4, null, null, null);
                C0875q.b(!status.l(), "Status code must not be SUCCESS");
                b2 = new com.google.android.gms.common.api.q(status);
                b2.setResult(status);
            } else {
                e eVar = new e(d3);
                new Thread(eVar).start();
                b2 = eVar.b;
            }
            J j = new J();
            TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
            b2.addStatusListener(new I(b2, taskCompletionSource, j));
            taskCompletionSource.getTask();
        } else {
            com.google.android.gms.common.api.h asGoogleApiClient2 = aVar.asGoogleApiClient();
            Context applicationContext2 = aVar.getApplicationContext();
            boolean z2 = aVar.a() == 3;
            m.a.a("Signing out", new Object[0]);
            m.a(applicationContext2);
            if (z2) {
                Status status2 = Status.e;
                C0875q.h(status2, "Result must not be null");
                b = new C0846u(asGoogleApiClient2);
                b.setResult(status2);
            } else {
                b = asGoogleApiClient2.b(new i(asGoogleApiClient2));
            }
            J j2 = new J();
            TaskCompletionSource taskCompletionSource2 = new TaskCompletionSource();
            b.addStatusListener(new I(b, taskCompletionSource2, j2));
            taskCompletionSource2.getTask();
        }
        return true;
    }
}
