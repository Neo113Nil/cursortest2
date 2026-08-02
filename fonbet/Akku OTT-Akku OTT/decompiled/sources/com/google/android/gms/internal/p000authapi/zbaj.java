package com.google.android.gms.internal.p000authapi;

import android.app.Activity;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.os.Parcelable;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.core.app.NotificationCompat;
import com.google.android.gms.auth.api.identity.C0817k;
import com.google.android.gms.auth.api.identity.C0818l;
import com.google.android.gms.auth.api.identity.InterfaceC0813g;
import com.google.android.gms.auth.api.identity.SaveAccountLinkingTokenRequest;
import com.google.android.gms.auth.api.identity.m;
import com.google.android.gms.auth.api.identity.x;
import com.google.android.gms.common.C0854d;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.a;
import com.google.android.gms.common.api.g;
import com.google.android.gms.common.api.internal.AbstractC0847v;
import com.google.android.gms.common.api.internal.r;
import com.google.android.gms.common.internal.C0875q;
import com.google.android.gms.common.internal.safeparcel.e;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes4.dex */
public final class zbaj extends g implements InterfaceC0813g {
    private static final a.g zba;
    private static final a.AbstractC0110a zbb;
    private static final a zbc;
    private final String zbd;

    static {
        a.g gVar = new a.g();
        zba = gVar;
        zbae zbaeVar = new zbae();
        zbb = zbaeVar;
        zbc = new a("Auth.Api.Identity.CredentialSaving.API", zbaeVar, gVar);
    }

    public zbaj(@NonNull Activity activity, @NonNull x xVar) {
        super(activity, (a<x>) zbc, xVar, g.a.c);
        this.zbd = zbaw.zba();
    }

    public final Status getStatusFromIntent(@Nullable Intent intent) {
        if (intent == null) {
            return Status.i;
        }
        Parcelable.Creator<Status> creator = Status.CREATOR;
        byte[] byteArrayExtra = intent.getByteArrayExtra(NotificationCompat.CATEGORY_STATUS);
        Status status = (Status) (byteArrayExtra == null ? null : e.a(byteArrayExtra, creator));
        return status == null ? Status.i : status;
    }

    public final Task<C0817k> saveAccountLinkingToken(@NonNull SaveAccountLinkingTokenRequest saveAccountLinkingTokenRequest) {
        C0875q.g(saveAccountLinkingTokenRequest);
        new ArrayList();
        List list = saveAccountLinkingTokenRequest.d;
        String str = saveAccountLinkingTokenRequest.c;
        PendingIntent pendingIntent = saveAccountLinkingTokenRequest.a;
        String str2 = saveAccountLinkingTokenRequest.b;
        int i = saveAccountLinkingTokenRequest.f;
        TextUtils.isEmpty(saveAccountLinkingTokenRequest.e);
        String str3 = this.zbd;
        C0875q.b(pendingIntent != null, "Consent PendingIntent cannot be null");
        C0875q.b("auth_code".equals(str2), "Invalid tokenType");
        C0875q.b(!TextUtils.isEmpty(str), "serviceId cannot be null or empty");
        C0875q.b(list != null, "scopes cannot be null");
        final SaveAccountLinkingTokenRequest saveAccountLinkingTokenRequest2 = new SaveAccountLinkingTokenRequest(pendingIntent, str2, str, list, str3, i);
        AbstractC0847v.a a = AbstractC0847v.a();
        a.c = new C0854d[]{zbav.zbh};
        a.a = new r() { // from class: com.google.android.gms.internal.auth-api.zbai
            /* JADX WARN: Multi-variable type inference failed */
            @Override // com.google.android.gms.common.api.internal.r
            public final /* synthetic */ void accept(Object obj, Object obj2) {
                zbg zbgVar = (zbg) obj;
                zbaf zbafVar = new zbaf(zbaj.this, (TaskCompletionSource) obj2);
                zbm zbmVar = (zbm) zbgVar.getService();
                SaveAccountLinkingTokenRequest saveAccountLinkingTokenRequest3 = saveAccountLinkingTokenRequest2;
                C0875q.g(saveAccountLinkingTokenRequest3);
                zbmVar.zbc(zbafVar, saveAccountLinkingTokenRequest3, zbaz.zba(zbgVar.getContext()));
            }
        };
        a.b = false;
        a.d = 1535;
        return doRead(a.a());
    }

    @Override // com.google.android.gms.auth.api.identity.InterfaceC0813g
    public final Task<m> savePassword(@NonNull C0818l c0818l) {
        C0875q.g(c0818l);
        final C0818l c0818l2 = new C0818l(c0818l.a, this.zbd, c0818l.c);
        AbstractC0847v.a a = AbstractC0847v.a();
        a.c = new C0854d[]{zbav.zbf};
        a.a = new r() { // from class: com.google.android.gms.internal.auth-api.zbah
            /* JADX WARN: Multi-variable type inference failed */
            @Override // com.google.android.gms.common.api.internal.r
            public final /* synthetic */ void accept(Object obj, Object obj2) {
                zbg zbgVar = (zbg) obj;
                zbag zbagVar = new zbag(zbaj.this, (TaskCompletionSource) obj2);
                zbm zbmVar = (zbm) zbgVar.getService();
                C0818l c0818l3 = c0818l2;
                C0875q.g(c0818l3);
                zbmVar.zbd(zbagVar, c0818l3, zbaz.zba(zbgVar.getContext()));
            }
        };
        a.b = false;
        a.d = 1536;
        return doRead(a.a());
    }

    public zbaj(@NonNull Context context, @NonNull x xVar) {
        super(context, (a<x>) zbc, xVar, g.a.c);
        this.zbd = zbaw.zba();
    }
}
