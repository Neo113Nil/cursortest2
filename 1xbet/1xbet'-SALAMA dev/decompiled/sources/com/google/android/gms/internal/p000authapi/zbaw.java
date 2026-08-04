package com.google.android.gms.internal.p000authapi;

import android.app.Activity;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.os.Parcelable;
import android.text.TextUtils;
import com.google.android.gms.auth.api.identity.SaveAccountLinkingTokenRequest;
import com.google.android.gms.auth.api.identity.SaveAccountLinkingTokenResult;
import com.google.android.gms.auth.api.identity.SavePasswordRequest;
import com.google.android.gms.auth.api.identity.SavePasswordResult;
import com.google.android.gms.common.Feature;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.h;
import com.google.android.gms.common.api.i;
import com.google.android.gms.common.api.internal.AbstractC0801w;
import com.google.android.gms.common.api.internal.C0800v;
import com.google.android.gms.common.api.internal.InterfaceC0797s;
import com.google.android.gms.common.api.k;
import com.google.android.gms.common.api.l;
import com.google.android.gms.common.internal.D;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import java.util.ArrayList;
import p006a3.a;
import p006a3.d;

/* JADX INFO: loaded from: classes.dex */
public final class zbaw extends l implements a {
    private static final h zba;
    private static final com.google.android.gms.common.api.a zbb;
    private static final i zbc;
    private final String zbd;

    static {
        h hVar = new h();
        zba = hVar;
        zbat zbatVar = new zbat();
        zbb = zbatVar;
        zbc = new i("Auth.Api.Identity.CredentialSaving.API", zbatVar, hVar);
    }

    public zbaw(Activity activity, d dVar) {
        super(activity, activity, zbc, dVar, k.f11205c);
        this.zbd = zbbj.zba();
    }

    public final Status getStatusFromIntent(Intent intent) {
        Status status = Status.f11079x;
        if (intent == null) {
            return status;
        }
        Parcelable.Creator<Status> creator = Status.CREATOR;
        byte[] byteArrayExtra = intent.getByteArrayExtra("status");
        Status status2 = (Status) (byteArrayExtra == null ? null : p003a.a.Q(byteArrayExtra, creator));
        return status2 == null ? status : status2;
    }

    public final Task<SaveAccountLinkingTokenResult> saveAccountLinkingToken(SaveAccountLinkingTokenRequest saveAccountLinkingTokenRequest) {
        D.i(saveAccountLinkingTokenRequest);
        new ArrayList();
        TextUtils.isEmpty(saveAccountLinkingTokenRequest.f10987e);
        String str = this.zbd;
        PendingIntent pendingIntent = saveAccountLinkingTokenRequest.f10983a;
        D.a("Consent PendingIntent cannot be null", pendingIntent != null);
        String str2 = saveAccountLinkingTokenRequest.f10984b;
        D.a("Invalid tokenType", "auth_code".equals(str2));
        String str3 = saveAccountLinkingTokenRequest.f10985c;
        D.a("serviceId cannot be null or empty", !TextUtils.isEmpty(str3));
        ArrayList arrayList = saveAccountLinkingTokenRequest.f10986d;
        D.a("scopes cannot be null", arrayList != null);
        final SaveAccountLinkingTokenRequest saveAccountLinkingTokenRequest2 = new SaveAccountLinkingTokenRequest(pendingIntent, str2, str3, arrayList, str, saveAccountLinkingTokenRequest.f10988f);
        C0800v c0800vA = AbstractC0801w.a();
        c0800vA.f11197d = new Feature[]{zbbi.zbg};
        c0800vA.f11196c = new InterfaceC0797s() { // from class: com.google.android.gms.internal.auth-api.zbar
            @Override // com.google.android.gms.common.api.internal.InterfaceC0797s
            public final void accept(Object obj, Object obj2) {
                zbaw zbawVar = this.zba;
                SaveAccountLinkingTokenRequest saveAccountLinkingTokenRequest3 = saveAccountLinkingTokenRequest2;
                zbau zbauVar = new zbau(zbawVar, (TaskCompletionSource) obj2);
                zbad zbadVar = (zbad) ((zbx) obj).getService();
                D.i(saveAccountLinkingTokenRequest3);
                zbadVar.zbc(zbauVar, saveAccountLinkingTokenRequest3);
            }
        };
        c0800vA.f11195b = false;
        c0800vA.f11194a = 1535;
        return doRead(c0800vA.e());
    }

    @Override // p006a3.a
    public final Task<SavePasswordResult> savePassword(SavePasswordRequest savePasswordRequest) {
        D.i(savePasswordRequest);
        final SavePasswordRequest savePasswordRequest2 = new SavePasswordRequest(savePasswordRequest.f10990a, this.zbd, savePasswordRequest.f10992c);
        C0800v c0800vA = AbstractC0801w.a();
        c0800vA.f11197d = new Feature[]{zbbi.zbe};
        c0800vA.f11196c = new InterfaceC0797s() { // from class: com.google.android.gms.internal.auth-api.zbas
            @Override // com.google.android.gms.common.api.internal.InterfaceC0797s
            public final void accept(Object obj, Object obj2) {
                zbaw zbawVar = this.zba;
                SavePasswordRequest savePasswordRequest3 = savePasswordRequest2;
                zbav zbavVar = new zbav(zbawVar, (TaskCompletionSource) obj2);
                zbad zbadVar = (zbad) ((zbx) obj).getService();
                D.i(savePasswordRequest3);
                zbadVar.zbd(zbavVar, savePasswordRequest3);
            }
        };
        c0800vA.f11195b = false;
        c0800vA.f11194a = 1536;
        return doRead(c0800vA.e());
    }

    public zbaw(Context context, d dVar) {
        super(context, null, zbc, dVar, k.f11205c);
        this.zbd = zbbj.zba();
    }
}
