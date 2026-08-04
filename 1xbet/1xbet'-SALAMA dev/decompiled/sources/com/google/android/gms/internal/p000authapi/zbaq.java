package com.google.android.gms.internal.p000authapi;

import android.accounts.Account;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Parcelable;
import com.google.android.gms.auth.api.identity.AuthorizationRequest;
import com.google.android.gms.auth.api.identity.AuthorizationResult;
import com.google.android.gms.common.Feature;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.a;
import com.google.android.gms.common.api.h;
import com.google.android.gms.common.api.i;
import com.google.android.gms.common.api.internal.AbstractC0801w;
import com.google.android.gms.common.api.internal.C0800v;
import com.google.android.gms.common.api.internal.InterfaceC0797s;
import com.google.android.gms.common.api.j;
import com.google.android.gms.common.api.k;
import com.google.android.gms.common.api.l;
import com.google.android.gms.common.internal.D;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import java.util.ArrayList;
import p006a3.c;

/* JADX INFO: loaded from: classes.dex */
public final class zbaq extends l {
    private static final h zba;
    private static final a zbb;
    private static final i zbc;

    static {
        h hVar = new h();
        zba = hVar;
        zbao zbaoVar = new zbao();
        zbb = zbaoVar;
        zbc = new i("Auth.Api.Identity.Authorization.API", zbaoVar, hVar);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public zbaq(Activity activity, c cVar) {
        i iVar = zbc;
        String str = cVar.f7972a;
        if (str != null) {
            D.e(str);
        }
        String strZba = zbbj.zba();
        D.e(strZba);
        super(activity, activity, iVar, new c(strZba), k.f11205c);
    }

    public final Task<AuthorizationResult> authorize(AuthorizationRequest authorizationRequest) {
        String str;
        boolean z4;
        boolean z7;
        boolean z8;
        String str2;
        D.i(authorizationRequest);
        ArrayList arrayList = authorizationRequest.f10941a;
        D.a("requestedScopes cannot be null or empty", (arrayList == null || arrayList.isEmpty()) ? false : true);
        String str3 = null;
        String str4 = authorizationRequest.f10946f;
        if (str4 != null) {
            D.e(str4);
            str = str4;
        } else {
            str = null;
        }
        Account account = authorizationRequest.f10945e;
        Account account2 = account != null ? account : null;
        boolean z9 = authorizationRequest.f10944d;
        String str5 = authorizationRequest.f10942b;
        if (!z9 || str5 == null) {
            z4 = false;
        } else {
            z4 = true;
            str3 = str5;
        }
        if (!authorizationRequest.f10943c || str5 == null) {
            z7 = false;
            z8 = false;
            str2 = str3;
        } else {
            D.a("two different server client ids provided", str3 == null || str3.equals(str5));
            z8 = authorizationRequest.f10948y;
            str2 = str5;
            z7 = true;
        }
        final AuthorizationRequest authorizationRequest2 = new AuthorizationRequest(arrayList, str2, z7, z4, account2, str, ((c) getApiOptions()).f7972a, z8);
        C0800v c0800vA = AbstractC0801w.a();
        c0800vA.f11197d = new Feature[]{zbbi.zbc};
        c0800vA.f11196c = new InterfaceC0797s() { // from class: com.google.android.gms.internal.auth-api.zban
            @Override // com.google.android.gms.common.api.internal.InterfaceC0797s
            public final void accept(Object obj, Object obj2) {
                zbaq zbaqVar = this.zba;
                AuthorizationRequest authorizationRequest3 = authorizationRequest2;
                zbap zbapVar = new zbap(zbaqVar, (TaskCompletionSource) obj2);
                zbaa zbaaVar = (zbaa) ((zbw) obj).getService();
                D.i(authorizationRequest3);
                zbaaVar.zbc(zbapVar, authorizationRequest3);
            }
        };
        c0800vA.f11195b = false;
        c0800vA.f11194a = 1534;
        return doRead(c0800vA.e());
    }

    public final AuthorizationResult getAuthorizationResultFromIntent(Intent intent) throws j {
        Status status = Status.f11079x;
        if (intent == null) {
            throw new j(status);
        }
        Parcelable.Creator<Status> creator = Status.CREATOR;
        byte[] byteArrayExtra = intent.getByteArrayExtra("status");
        Status status2 = (Status) (byteArrayExtra == null ? null : p003a.a.Q(byteArrayExtra, creator));
        if (status2 == null) {
            throw new j(Status.f11081z);
        }
        if (!status2.j()) {
            throw new j(status2);
        }
        Parcelable.Creator<AuthorizationResult> creator2 = AuthorizationResult.CREATOR;
        byte[] byteArrayExtra2 = intent.getByteArrayExtra("authorization_result");
        AuthorizationResult authorizationResult = (AuthorizationResult) (byteArrayExtra2 != null ? p003a.a.Q(byteArrayExtra2, creator2) : null);
        if (authorizationResult != null) {
            return authorizationResult;
        }
        throw new j(status);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public zbaq(Context context, c cVar) {
        i iVar = zbc;
        String str = cVar.f7972a;
        if (str != null) {
            D.e(str);
        }
        String strZba = zbbj.zba();
        D.e(strZba);
        super(context, null, iVar, new c(strZba), k.f11205c);
    }
}
