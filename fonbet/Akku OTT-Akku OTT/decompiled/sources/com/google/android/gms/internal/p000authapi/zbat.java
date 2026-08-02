package com.google.android.gms.internal.p000authapi;

import android.app.Activity;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.core.app.NotificationCompat;
import com.google.android.gms.auth.api.identity.C0810d;
import com.google.android.gms.auth.api.identity.C0811e;
import com.google.android.gms.auth.api.identity.C0814h;
import com.google.android.gms.auth.api.identity.C0815i;
import com.google.android.gms.auth.api.identity.K;
import com.google.android.gms.auth.api.identity.n;
import com.google.android.gms.auth.api.identity.o;
import com.google.android.gms.common.C0854d;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.a;
import com.google.android.gms.common.api.b;
import com.google.android.gms.common.api.g;
import com.google.android.gms.common.api.h;
import com.google.android.gms.common.api.internal.AbstractC0847v;
import com.google.android.gms.common.api.internal.C0833g;
import com.google.android.gms.common.api.internal.r;
import com.google.android.gms.common.internal.C0875q;
import com.google.android.gms.common.internal.safeparcel.e;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import java.util.Iterator;
import java.util.Set;

/* loaded from: classes4.dex */
public final class zbat extends g implements n {
    private static final a.g zba;
    private static final a.AbstractC0110a zbb;
    private static final a zbc;
    private final String zbd;

    static {
        a.g gVar = new a.g();
        zba = gVar;
        zbak zbakVar = new zbak();
        zbb = zbakVar;
        zbc = new a("Auth.Api.Identity.SignIn.API", zbakVar, gVar);
    }

    public zbat(@NonNull Activity activity, @NonNull K k) {
        super(activity, (a<K>) zbc, k, g.a.c);
        this.zbd = zbaw.zba();
    }

    @Override // com.google.android.gms.auth.api.identity.n
    public final Task<C0811e> beginSignIn(@NonNull C0810d c0810d) {
        C0875q.g(c0810d);
        new C0810d.C0107d(false);
        C0810d.a.C0106a l = C0810d.a.l();
        l.a = false;
        l.a();
        new C0810d.c(null, null, false);
        new C0810d.b(false, null);
        C0810d.a aVar = c0810d.b;
        C0875q.g(aVar);
        C0810d.C0107d c0107d = c0810d.a;
        C0875q.g(c0107d);
        C0810d.c cVar = c0810d.f;
        C0875q.g(cVar);
        C0810d.b bVar = c0810d.i;
        C0875q.g(bVar);
        final C0810d c0810d2 = new C0810d(c0107d, aVar, this.zbd, c0810d.d, c0810d.e, cVar, bVar, c0810d.j);
        AbstractC0847v.a a = AbstractC0847v.a();
        a.c = new C0854d[]{new C0854d("auth_api_credentials_begin_sign_in", 8L)};
        a.a = new r() { // from class: com.google.android.gms.internal.auth-api.zbas
            /* JADX WARN: Multi-variable type inference failed */
            @Override // com.google.android.gms.common.api.internal.r
            public final /* synthetic */ void accept(Object obj, Object obj2) {
                zbau zbauVar = (zbau) obj;
                zbal zbalVar = new zbal(zbat.this, (TaskCompletionSource) obj2);
                zbv zbvVar = (zbv) zbauVar.getService();
                C0810d c0810d3 = c0810d2;
                C0875q.g(c0810d3);
                zbvVar.zbc(zbalVar, c0810d3, zbaz.zba(zbauVar.getContext()));
            }
        };
        a.b = false;
        a.d = 1553;
        return doRead(a.a());
    }

    @Override // com.google.android.gms.auth.api.identity.n
    public final String getPhoneNumberFromIntent(@Nullable Intent intent) throws b {
        if (intent == null) {
            throw new b(Status.i);
        }
        Parcelable.Creator<Status> creator = Status.CREATOR;
        byte[] byteArrayExtra = intent.getByteArrayExtra(NotificationCompat.CATEGORY_STATUS);
        Status status = (Status) (byteArrayExtra == null ? null : e.a(byteArrayExtra, creator));
        if (status == null) {
            throw new b(Status.k);
        }
        if (!status.l()) {
            throw new b(status);
        }
        String stringExtra = intent.getStringExtra("phone_number_hint_result");
        if (stringExtra != null) {
            return stringExtra;
        }
        throw new b(Status.i);
    }

    @Override // com.google.android.gms.auth.api.identity.n
    public final Task<PendingIntent> getPhoneNumberHintIntent(@NonNull final C0814h c0814h) {
        C0875q.g(c0814h);
        AbstractC0847v.a a = AbstractC0847v.a();
        a.c = new C0854d[]{zbav.zbi};
        a.a = new r() { // from class: com.google.android.gms.internal.auth-api.zbar
            @Override // com.google.android.gms.common.api.internal.r
            public final /* synthetic */ void accept(Object obj, Object obj2) {
                zbat.this.zbb(c0814h, (zbau) obj, (TaskCompletionSource) obj2);
            }
        };
        a.d = 1653;
        return doRead(a.a());
    }

    @Override // com.google.android.gms.auth.api.identity.n
    public final o getSignInCredentialFromIntent(@Nullable Intent intent) throws b {
        if (intent == null) {
            throw new b(Status.i);
        }
        Parcelable.Creator<Status> creator = Status.CREATOR;
        byte[] byteArrayExtra = intent.getByteArrayExtra(NotificationCompat.CATEGORY_STATUS);
        Status status = (Status) (byteArrayExtra == null ? null : e.a(byteArrayExtra, creator));
        if (status == null) {
            throw new b(Status.k);
        }
        if (!status.l()) {
            throw new b(status);
        }
        Parcelable.Creator<o> creator2 = o.CREATOR;
        byte[] byteArrayExtra2 = intent.getByteArrayExtra("sign_in_credential");
        o oVar = (o) (byteArrayExtra2 != null ? e.a(byteArrayExtra2, creator2) : null);
        if (oVar != null) {
            return oVar;
        }
        throw new b(Status.i);
    }

    @Override // com.google.android.gms.auth.api.identity.n
    public final Task<PendingIntent> getSignInIntent(@NonNull C0815i c0815i) {
        C0875q.g(c0815i);
        String str = c0815i.a;
        C0875q.g(str);
        String str2 = c0815i.d;
        final C0815i c0815i2 = new C0815i(str, c0815i.b, this.zbd, str2, c0815i.e, c0815i.f, c0815i.i);
        AbstractC0847v.a a = AbstractC0847v.a();
        a.c = new C0854d[]{zbav.zbg};
        a.a = new r() { // from class: com.google.android.gms.internal.auth-api.zbaq
            /* JADX WARN: Multi-variable type inference failed */
            @Override // com.google.android.gms.common.api.internal.r
            public final /* synthetic */ void accept(Object obj, Object obj2) {
                zbau zbauVar = (zbau) obj;
                zban zbanVar = new zban(zbat.this, (TaskCompletionSource) obj2);
                zbv zbvVar = (zbv) zbauVar.getService();
                C0815i c0815i3 = c0815i2;
                C0875q.g(c0815i3);
                zbvVar.zbe(zbanVar, c0815i3, zbaz.zba(zbauVar.getContext()));
            }
        };
        a.d = 1555;
        return doRead(a.a());
    }

    @Override // com.google.android.gms.auth.api.identity.n
    public final Task<Void> signOut() {
        getApplicationContext().getSharedPreferences("com.google.android.gms.signin", 0).edit().clear().apply();
        Set set = h.a;
        synchronized (set) {
        }
        Iterator it = set.iterator();
        if (it.hasNext()) {
            ((h) it.next()).getClass();
            throw new UnsupportedOperationException();
        }
        C0833g.a();
        AbstractC0847v.a a = AbstractC0847v.a();
        a.c = new C0854d[]{zbav.zbb};
        a.a = new r() { // from class: com.google.android.gms.internal.auth-api.zbap
            @Override // com.google.android.gms.common.api.internal.r
            public final /* synthetic */ void accept(Object obj, Object obj2) {
                zbat.this.zba((zbau) obj, (TaskCompletionSource) obj2);
            }
        };
        a.b = false;
        a.d = 1554;
        return doWrite(a.a());
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final /* synthetic */ void zba(zbau zbauVar, TaskCompletionSource taskCompletionSource) {
        zbam zbamVar = new zbam(this, taskCompletionSource);
        ((zbv) zbauVar.getService()).zbd(zbamVar, this.zbd, zbaz.zba(zbauVar.getContext()));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final /* synthetic */ void zbb(C0814h c0814h, zbau zbauVar, TaskCompletionSource taskCompletionSource) {
        zbao zbaoVar = new zbao(this, taskCompletionSource);
        ((zbv) zbauVar.getService()).zbf(zbaoVar, c0814h, this.zbd, zbaz.zba(zbauVar.getContext()));
    }

    public zbat(@NonNull Context context, @NonNull K k) {
        super(context, (a<K>) zbc, k, g.a.c);
        this.zbd = zbaw.zba();
    }
}
