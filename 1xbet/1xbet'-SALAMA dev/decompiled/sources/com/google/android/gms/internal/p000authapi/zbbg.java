package com.google.android.gms.internal.p000authapi;

import android.app.Activity;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.os.Parcelable;
import com.google.android.gms.auth.api.identity.BeginSignInRequest;
import com.google.android.gms.auth.api.identity.BeginSignInResult;
import com.google.android.gms.auth.api.identity.GetPhoneNumberHintIntentRequest;
import com.google.android.gms.auth.api.identity.GetSignInIntentRequest;
import com.google.android.gms.auth.api.identity.SignInCredential;
import com.google.android.gms.common.Feature;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.a;
import com.google.android.gms.common.api.h;
import com.google.android.gms.common.api.i;
import com.google.android.gms.common.api.internal.AbstractC0801w;
import com.google.android.gms.common.api.internal.C0787h;
import com.google.android.gms.common.api.internal.C0800v;
import com.google.android.gms.common.api.internal.InterfaceC0797s;
import com.google.android.gms.common.api.j;
import com.google.android.gms.common.api.k;
import com.google.android.gms.common.api.l;
import com.google.android.gms.common.api.o;
import com.google.android.gms.common.internal.D;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import java.util.Iterator;
import java.util.Set;
import p006a3.b;
import p006a3.e;

/* JADX INFO: loaded from: classes.dex */
public final class zbbg extends l implements b {
    private static final h zba;
    private static final a zbb;
    private static final i zbc;
    private final String zbd;

    static {
        h hVar = new h();
        zba = hVar;
        zbbb zbbbVar = new zbbb();
        zbb = zbbbVar;
        zbc = new i("Auth.Api.Identity.SignIn.API", zbbbVar, hVar);
    }

    public zbbg(Activity activity, e eVar) {
        super(activity, activity, zbc, eVar, k.f11205c);
        this.zbd = zbbj.zba();
    }

    @Override // p006a3.b
    public final Task<BeginSignInResult> beginSignIn(BeginSignInRequest beginSignInRequest) {
        D.i(beginSignInRequest);
        new BeginSignInRequest.GoogleIdTokenRequestOptions(false, null, null, true, null, null, false);
        new BeginSignInRequest.PasskeysRequestOptions(null, null, false);
        new BeginSignInRequest.PasskeyJsonRequestOptions(false, null);
        BeginSignInRequest.GoogleIdTokenRequestOptions googleIdTokenRequestOptions = beginSignInRequest.f10956b;
        D.i(googleIdTokenRequestOptions);
        BeginSignInRequest.PasswordRequestOptions passwordRequestOptions = beginSignInRequest.f10955a;
        D.i(passwordRequestOptions);
        BeginSignInRequest.PasskeysRequestOptions passkeysRequestOptions = beginSignInRequest.f10960f;
        D.i(passkeysRequestOptions);
        BeginSignInRequest.PasskeyJsonRequestOptions passkeyJsonRequestOptions = beginSignInRequest.f10961x;
        D.i(passkeyJsonRequestOptions);
        final BeginSignInRequest beginSignInRequest2 = new BeginSignInRequest(passwordRequestOptions, googleIdTokenRequestOptions, this.zbd, beginSignInRequest.f10958d, beginSignInRequest.f10959e, passkeysRequestOptions, passkeyJsonRequestOptions);
        C0800v c0800vA = AbstractC0801w.a();
        c0800vA.f11197d = new Feature[]{zbbi.zba};
        c0800vA.f11196c = new InterfaceC0797s() { // from class: com.google.android.gms.internal.auth-api.zbax
            @Override // com.google.android.gms.common.api.internal.InterfaceC0797s
            public final void accept(Object obj, Object obj2) {
                zbbg zbbgVar = this.zba;
                BeginSignInRequest beginSignInRequest3 = beginSignInRequest2;
                zbbc zbbcVar = new zbbc(zbbgVar, (TaskCompletionSource) obj2);
                zbam zbamVar = (zbam) ((zbbh) obj).getService();
                D.i(beginSignInRequest3);
                zbamVar.zbc(zbbcVar, beginSignInRequest3);
            }
        };
        c0800vA.f11195b = false;
        c0800vA.f11194a = 1553;
        return doRead(c0800vA.e());
    }

    public final String getPhoneNumberFromIntent(Intent intent) throws j {
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
        String stringExtra = intent.getStringExtra("phone_number_hint_result");
        if (stringExtra != null) {
            return stringExtra;
        }
        throw new j(status);
    }

    public final Task<PendingIntent> getPhoneNumberHintIntent(final GetPhoneNumberHintIntentRequest getPhoneNumberHintIntentRequest) {
        D.i(getPhoneNumberHintIntentRequest);
        C0800v c0800vA = AbstractC0801w.a();
        c0800vA.f11197d = new Feature[]{zbbi.zbh};
        c0800vA.f11196c = new InterfaceC0797s() { // from class: com.google.android.gms.internal.auth-api.zbba
            @Override // com.google.android.gms.common.api.internal.InterfaceC0797s
            public final void accept(Object obj, Object obj2) {
                this.zba.zba(getPhoneNumberHintIntentRequest, (zbbh) obj, (TaskCompletionSource) obj2);
            }
        };
        c0800vA.f11194a = 1653;
        return doRead(c0800vA.e());
    }

    public final SignInCredential getSignInCredentialFromIntent(Intent intent) throws j {
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
        Parcelable.Creator<SignInCredential> creator2 = SignInCredential.CREATOR;
        byte[] byteArrayExtra2 = intent.getByteArrayExtra("sign_in_credential");
        SignInCredential signInCredential = (SignInCredential) (byteArrayExtra2 != null ? p003a.a.Q(byteArrayExtra2, creator2) : null);
        if (signInCredential != null) {
            return signInCredential;
        }
        throw new j(status);
    }

    @Override // p006a3.b
    public final Task<PendingIntent> getSignInIntent(GetSignInIntentRequest getSignInIntentRequest) {
        D.i(getSignInIntentRequest);
        String str = getSignInIntentRequest.f10977a;
        D.i(str);
        final GetSignInIntentRequest getSignInIntentRequest2 = new GetSignInIntentRequest(str, getSignInIntentRequest.f10978b, this.zbd, getSignInIntentRequest.f10980d, getSignInIntentRequest.f10981e, getSignInIntentRequest.f10982f);
        C0800v c0800vA = AbstractC0801w.a();
        c0800vA.f11197d = new Feature[]{zbbi.zbf};
        c0800vA.f11196c = new InterfaceC0797s() { // from class: com.google.android.gms.internal.auth-api.zbay
            @Override // com.google.android.gms.common.api.internal.InterfaceC0797s
            public final void accept(Object obj, Object obj2) {
                zbbg zbbgVar = this.zba;
                GetSignInIntentRequest getSignInIntentRequest3 = getSignInIntentRequest2;
                zbbe zbbeVar = new zbbe(zbbgVar, (TaskCompletionSource) obj2);
                zbam zbamVar = (zbam) ((zbbh) obj).getService();
                D.i(getSignInIntentRequest3);
                zbamVar.zbe(zbbeVar, getSignInIntentRequest3);
            }
        };
        c0800vA.f11194a = 1555;
        return doRead(c0800vA.e());
    }

    public final Task<Void> signOut() {
        getApplicationContext().getSharedPreferences("com.google.android.gms.signin", 0).edit().clear().apply();
        Set set = o.f11208a;
        synchronized (set) {
        }
        Iterator it = set.iterator();
        if (it.hasNext()) {
            ((o) it.next()).getClass();
            throw new UnsupportedOperationException();
        }
        C0787h.a();
        C0800v c0800vA = AbstractC0801w.a();
        c0800vA.f11197d = new Feature[]{zbbi.zbb};
        c0800vA.f11196c = new InterfaceC0797s() { // from class: com.google.android.gms.internal.auth-api.zbaz
            @Override // com.google.android.gms.common.api.internal.InterfaceC0797s
            public final void accept(Object obj, Object obj2) {
                this.zba.zbb((zbbh) obj, (TaskCompletionSource) obj2);
            }
        };
        c0800vA.f11195b = false;
        c0800vA.f11194a = 1554;
        return doWrite(c0800vA.e());
    }

    public final /* synthetic */ void zba(GetPhoneNumberHintIntentRequest getPhoneNumberHintIntentRequest, zbbh zbbhVar, TaskCompletionSource taskCompletionSource) {
        ((zbam) zbbhVar.getService()).zbd(new zbbf(this, taskCompletionSource), getPhoneNumberHintIntentRequest, this.zbd);
    }

    public final /* synthetic */ void zbb(zbbh zbbhVar, TaskCompletionSource taskCompletionSource) {
        ((zbam) zbbhVar.getService()).zbf(new zbbd(this, taskCompletionSource), this.zbd);
    }

    public zbbg(Context context, e eVar) {
        super(context, null, zbc, eVar, k.f11205c);
        this.zbd = zbbj.zba();
    }
}
