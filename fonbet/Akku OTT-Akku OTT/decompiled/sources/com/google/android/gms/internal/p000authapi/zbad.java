package com.google.android.gms.internal.p000authapi;

import android.accounts.Account;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.core.app.NotificationCompat;
import com.bumptech.glide.request.e;
import com.google.android.gms.auth.api.identity.AuthorizationRequest;
import com.google.android.gms.auth.api.identity.C0808b;
import com.google.android.gms.auth.api.identity.C0809c;
import com.google.android.gms.auth.api.identity.ClearTokenRequest;
import com.google.android.gms.auth.api.identity.InterfaceC0807a;
import com.google.android.gms.auth.api.identity.RevokeAccessRequest;
import com.google.android.gms.auth.api.identity.q;
import com.google.android.gms.common.C0854d;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.a;
import com.google.android.gms.common.api.b;
import com.google.android.gms.common.api.g;
import com.google.android.gms.common.api.internal.AbstractC0847v;
import com.google.android.gms.common.api.internal.r;
import com.google.android.gms.common.internal.C0875q;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import java.util.List;

/* loaded from: classes4.dex */
public final class zbad extends g implements InterfaceC0807a {
    private static final a.g zba;
    private static final a.AbstractC0110a zbb;
    private static final a zbc;
    private final String zbd;

    static {
        a.g gVar = new a.g();
        zba = gVar;
        zbw zbwVar = new zbw();
        zbb = zbwVar;
        zbc = new a("Auth.Api.Identity.Authorization.API", zbwVar, gVar);
    }

    public zbad(@NonNull Activity activity, @NonNull q qVar) {
        super(activity, (a<q>) zbc, qVar, g.a.c);
        this.zbd = zbaw.zba();
    }

    @Override // com.google.android.gms.auth.api.identity.InterfaceC0807a
    public final Task<C0809c> authorize(@NonNull AuthorizationRequest authorizationRequest) {
        Bundle bundle;
        Object obj;
        String str;
        boolean z;
        String str2;
        boolean z2;
        boolean z3;
        int i;
        C0875q.g(authorizationRequest);
        List list = authorizationRequest.a;
        C0875q.b((list == null || list.isEmpty()) ? false : true, "requestedScopes cannot be null or empty");
        Bundle bundle2 = authorizationRequest.k;
        String str3 = null;
        if (bundle2 != null) {
            Bundle bundle3 = null;
            for (String str4 : bundle2.keySet()) {
                String string = bundle2.getString(str4);
                int[] b = e.b(6);
                int length = b.length;
                int i2 = 0;
                while (true) {
                    if (i2 >= length) {
                        i = 0;
                        break;
                    }
                    i = b[i2];
                    if (C0808b.a(i).equals(str4)) {
                        break;
                    }
                    i2++;
                }
                if (string != null && i != 0) {
                    if (bundle3 == null) {
                        bundle3 = new Bundle();
                    }
                    bundle3.putString(C0808b.a(i), string);
                }
            }
            bundle = bundle3;
        } else {
            bundle = null;
        }
        boolean z4 = authorizationRequest.j;
        String str5 = authorizationRequest.f;
        Account account = authorizationRequest.e;
        String str6 = authorizationRequest.b;
        if (str5 != null) {
            C0875q.d(str5);
        } else {
            str5 = null;
        }
        if (account == null) {
            account = null;
        }
        if (!authorizationRequest.d || str6 == null) {
            obj = str6;
            str = str5;
            z = false;
        } else {
            str3 = str6;
            obj = str3;
            str = str5;
            z = true;
        }
        if (!authorizationRequest.c || obj == null) {
            str2 = str3;
            z2 = false;
            z3 = false;
        } else {
            C0875q.b(str3 == null || str3.equals(obj), "two different server client ids provided");
            z2 = true;
            z3 = z4;
            str2 = obj;
        }
        final AuthorizationRequest authorizationRequest2 = new AuthorizationRequest(list, str2, z2, z, account, str, this.zbd, z3, bundle, authorizationRequest.l);
        AbstractC0847v.a a = AbstractC0847v.a();
        a.c = new C0854d[]{zbav.zbc};
        a.a = new r() { // from class: com.google.android.gms.internal.auth-api.zbac
            /* JADX WARN: Multi-variable type inference failed */
            @Override // com.google.android.gms.common.api.internal.r
            public final /* synthetic */ void accept(Object obj2, Object obj3) {
                zbf zbfVar = (zbf) obj2;
                zbx zbxVar = new zbx(zbad.this, (TaskCompletionSource) obj3);
                zbj zbjVar = (zbj) zbfVar.getService();
                AuthorizationRequest authorizationRequest3 = authorizationRequest2;
                C0875q.g(authorizationRequest3);
                zbjVar.zbc(zbxVar, authorizationRequest3, zbaz.zba(zbfVar.getContext()));
            }
        };
        a.b = false;
        a.d = 1534;
        return doRead(a.a());
    }

    @Override // com.google.android.gms.auth.api.identity.InterfaceC0807a
    public final Task<Void> clearToken(@NonNull ClearTokenRequest clearTokenRequest) {
        C0875q.g(clearTokenRequest);
        String str = clearTokenRequest.a;
        String str2 = this.zbd;
        if (str == null) {
            throw new IllegalStateException("Missing required properties: token");
        }
        final ClearTokenRequest clearTokenRequest2 = new ClearTokenRequest(str, str2);
        AbstractC0847v.a a = AbstractC0847v.a();
        a.c = new C0854d[]{zbav.zbe};
        a.a = new r() { // from class: com.google.android.gms.internal.auth-api.zbab
            /* JADX WARN: Multi-variable type inference failed */
            @Override // com.google.android.gms.common.api.internal.r
            public final /* synthetic */ void accept(Object obj, Object obj2) {
                zbf zbfVar = (zbf) obj;
                zbz zbzVar = new zbz(zbad.this, (TaskCompletionSource) obj2);
                zbj zbjVar = (zbj) zbfVar.getService();
                ClearTokenRequest clearTokenRequest3 = clearTokenRequest2;
                C0875q.g(clearTokenRequest3);
                zbjVar.zbe(zbzVar, clearTokenRequest3, zbaz.zba(zbfVar.getContext()));
            }
        };
        a.b = true;
        a.d = 1721;
        return doWrite(a.a());
    }

    @Override // com.google.android.gms.auth.api.identity.InterfaceC0807a
    public final C0809c getAuthorizationResultFromIntent(@Nullable Intent intent) throws b {
        if (intent == null) {
            throw new b(Status.i);
        }
        Parcelable.Creator<Status> creator = Status.CREATOR;
        byte[] byteArrayExtra = intent.getByteArrayExtra(NotificationCompat.CATEGORY_STATUS);
        Status status = (Status) (byteArrayExtra == null ? null : com.google.android.gms.common.internal.safeparcel.e.a(byteArrayExtra, creator));
        if (status == null) {
            throw new b(Status.k);
        }
        if (!status.l()) {
            throw new b(status);
        }
        Parcelable.Creator<C0809c> creator2 = C0809c.CREATOR;
        byte[] byteArrayExtra2 = intent.getByteArrayExtra("authorization_result");
        C0809c c0809c = (C0809c) (byteArrayExtra2 != null ? com.google.android.gms.common.internal.safeparcel.e.a(byteArrayExtra2, creator2) : null);
        if (c0809c != null) {
            return c0809c;
        }
        throw new b(Status.i);
    }

    @Override // com.google.android.gms.auth.api.identity.InterfaceC0807a
    public final Task<Void> revokeAccess(@NonNull RevokeAccessRequest revokeAccessRequest) {
        C0875q.g(revokeAccessRequest);
        zbbi zbbiVar = revokeAccessRequest.a;
        Account account = revokeAccessRequest.b;
        String str = this.zbd;
        if (zbbiVar == null || account == null) {
            StringBuilder sb = new StringBuilder();
            if (zbbiVar == null) {
                sb.append(" scopes");
            }
            if (account == null) {
                sb.append(" account");
            }
            throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
        }
        final RevokeAccessRequest revokeAccessRequest2 = new RevokeAccessRequest(zbbiVar, account, str);
        AbstractC0847v.a a = AbstractC0847v.a();
        a.c = new C0854d[]{zbav.zbd};
        a.a = new r() { // from class: com.google.android.gms.internal.auth-api.zbaa
            /* JADX WARN: Multi-variable type inference failed */
            @Override // com.google.android.gms.common.api.internal.r
            public final /* synthetic */ void accept(Object obj, Object obj2) {
                zbf zbfVar = (zbf) obj;
                zby zbyVar = new zby(zbad.this, (TaskCompletionSource) obj2);
                zbj zbjVar = (zbj) zbfVar.getService();
                RevokeAccessRequest revokeAccessRequest3 = revokeAccessRequest2;
                C0875q.g(revokeAccessRequest3);
                zbjVar.zbd(zbyVar, revokeAccessRequest3, zbaz.zba(zbfVar.getContext()));
            }
        };
        a.b = true;
        a.d = 1721;
        return doWrite(a.a());
    }

    public zbad(@NonNull Context context, @NonNull q qVar) {
        super(context, (a<q>) zbc, qVar, g.a.c);
        this.zbd = zbaw.zba();
    }
}
