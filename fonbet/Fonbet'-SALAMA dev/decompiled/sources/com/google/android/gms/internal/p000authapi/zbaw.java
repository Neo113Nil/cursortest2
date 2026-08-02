package com.google.android.gms.internal.p000authapi;

import a.AbstractC0603a;
import a3.C0620d;
import a3.InterfaceC0617a;
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
import com.google.android.gms.common.api.a;
import com.google.android.gms.common.api.h;
import com.google.android.gms.common.api.i;
import com.google.android.gms.common.api.internal.AbstractC0845w;
import com.google.android.gms.common.api.internal.C0844v;
import com.google.android.gms.common.api.internal.InterfaceC0841s;
import com.google.android.gms.common.api.k;
import com.google.android.gms.common.api.l;
import com.google.android.gms.common.internal.D;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final class zbaw extends l implements InterfaceC0617a {
    private static final h zba;
    private static final a zbb;
    private static final i zbc;
    private final String zbd;

    static {
        h hVar = new h();
        zba = hVar;
        zbat zbatVar = new zbat();
        zbb = zbatVar;
        zbc = new i("Auth.Api.Identity.CredentialSaving.API", zbatVar, hVar);
    }

    public zbaw(Activity activity, C0620d c0620d) {
        super(activity, activity, zbc, c0620d, k.f11205c);
        this.zbd = zbbj.zba();
    }

    public final Status getStatusFromIntent(Intent intent) {
        Status status = Status.f11079x;
        if (intent == null) {
            return status;
        }
        Parcelable.Creator<Status> creator = Status.CREATOR;
        byte[] byteArrayExtra = intent.getByteArrayExtra("status");
        Status status2 = (Status) (byteArrayExtra == null ? null : AbstractC0603a.Q(byteArrayExtra, creator));
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
        C0844v a2 = AbstractC0845w.a();
        a2.f11197d = new Feature[]{zbbi.zbg};
        a2.f11196c = new InterfaceC0841s() { // from class: com.google.android.gms.internal.auth-api.zbar
            @Override // com.google.android.gms.common.api.internal.InterfaceC0841s
            public final void accept(Object obj, Object obj2) {
                zbaw zbawVar = zbaw.this;
                SaveAccountLinkingTokenRequest saveAccountLinkingTokenRequest3 = saveAccountLinkingTokenRequest2;
                zbau zbauVar = new zbau(zbawVar, (TaskCompletionSource) obj2);
                zbad zbadVar = (zbad) ((zbx) obj).getService();
                D.i(saveAccountLinkingTokenRequest3);
                zbadVar.zbc(zbauVar, saveAccountLinkingTokenRequest3);
            }
        };
        a2.f11195b = false;
        a2.f11194a = 1535;
        return doRead(a2.e());
    }

    @Override // a3.InterfaceC0617a
    public final Task<SavePasswordResult> savePassword(SavePasswordRequest savePasswordRequest) {
        D.i(savePasswordRequest);
        final SavePasswordRequest savePasswordRequest2 = new SavePasswordRequest(savePasswordRequest.f10990a, this.zbd, savePasswordRequest.f10992c);
        C0844v a2 = AbstractC0845w.a();
        a2.f11197d = new Feature[]{zbbi.zbe};
        a2.f11196c = new InterfaceC0841s() { // from class: com.google.android.gms.internal.auth-api.zbas
            @Override // com.google.android.gms.common.api.internal.InterfaceC0841s
            public final void accept(Object obj, Object obj2) {
                zbaw zbawVar = zbaw.this;
                SavePasswordRequest savePasswordRequest3 = savePasswordRequest2;
                zbav zbavVar = new zbav(zbawVar, (TaskCompletionSource) obj2);
                zbad zbadVar = (zbad) ((zbx) obj).getService();
                D.i(savePasswordRequest3);
                zbadVar.zbd(zbavVar, savePasswordRequest3);
            }
        };
        a2.f11195b = false;
        a2.f11194a = 1536;
        return doRead(a2.e());
    }

    public zbaw(Context context, C0620d c0620d) {
        super(context, null, zbc, c0620d, k.f11205c);
        this.zbd = zbbj.zba();
    }
}
