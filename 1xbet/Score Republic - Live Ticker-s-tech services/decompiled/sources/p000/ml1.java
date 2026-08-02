package p000;

import android.accounts.Account;
import android.content.Context;
import android.os.Handler;
import android.os.Parcel;
import android.os.RemoteException;
import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import java.util.Set;
import java.util.concurrent.locks.ReentrantLock;
import org.json.JSONException;

/* JADX INFO: compiled from: r8-map-id-738170b7fb69b873ed7524d5270c8e05c6f5fb40ea1ade7a72c8ed7a70699269 */
/* JADX INFO: loaded from: classes.dex */
public final class ml1 extends cl1 implements j90, k90 {

    /* JADX INFO: renamed from: j */
    public static final wk1 f5081j = nl1.f5455a;

    /* JADX INFO: renamed from: c */
    public final Context f5082c;

    /* JADX INFO: renamed from: d */
    public final Handler f5083d;

    /* JADX INFO: renamed from: e */
    public final wk1 f5084e;

    /* JADX INFO: renamed from: f */
    public final Set f5085f;

    /* JADX INFO: renamed from: g */
    public final C0902y5 f5086g;

    /* JADX INFO: renamed from: h */
    public u71 f5087h;

    /* JADX INFO: renamed from: i */
    public wp0 f5088i;

    public ml1(Context context, bm1 bm1Var, C0902y5 c0902y5) {
        attachInterface(this, "com.google.android.gms.signin.internal.ISignInCallbacks");
        this.f5082c = context;
        this.f5083d = bm1Var;
        this.f5086g = c0902y5;
        this.f5085f = (Set) c0902y5.f9154a;
        this.f5084e = f5081j;
    }

    @Override // p000.j90
    /* JADX INFO: renamed from: a */
    public final void mo1440a(int i) {
        wp0 wp0Var = this.f5088i;
        el1 el1Var = (el1) ((l90) wp0Var.f8624p).f4731j.get((C0679s4) wp0Var.f8621m);
        if (el1Var != null) {
            if (el1Var.f2117j) {
                el1Var.m1453n(new C0253gl(17, null, null));
            } else {
                el1Var.mo1440a(i);
            }
        }
    }

    @Override // p000.k90
    /* JADX INFO: renamed from: c */
    public final void mo1442c(C0253gl c0253gl) {
        this.f5088i.m5411c(c0253gl);
    }

    @Override // p000.j90
    /* JADX INFO: renamed from: d */
    public final void mo1443d() {
        GoogleSignInAccount googleSignInAccountM990b;
        u71 u71Var = this.f5087h;
        u71Var.getClass();
        try {
            u71Var.f7702B.getClass();
            Account account = new Account("<<default account>>", "com.google");
            if ("<<default account>>".equals(account.name)) {
                Context context = u71Var.f6048c;
                ReentrantLock reentrantLock = oa1.f5680c;
                p80.m3863h(context);
                ReentrantLock reentrantLock2 = oa1.f5680c;
                reentrantLock2.lock();
                try {
                    if (oa1.f5681d == null) {
                        oa1.f5681d = new oa1(context.getApplicationContext());
                    }
                    oa1 oa1Var = oa1.f5681d;
                    reentrantLock2.unlock();
                    String strM3653a = oa1Var.m3653a("defaultGoogleSignInAccount");
                    if (!TextUtils.isEmpty(strM3653a)) {
                        StringBuilder sb = new StringBuilder(20 + String.valueOf(strM3653a).length());
                        sb.append("googleSignInAccount:");
                        sb.append(strM3653a);
                        String strM3653a2 = oa1Var.m3653a(sb.toString());
                        if (strM3653a2 != null) {
                            try {
                                googleSignInAccountM990b = GoogleSignInAccount.m990b(strM3653a2);
                            } catch (JSONException unused) {
                                googleSignInAccountM990b = null;
                            }
                        }
                    }
                    googleSignInAccountM990b = null;
                } catch (Throwable th) {
                    reentrantLock2.unlock();
                    throw th;
                }
            } else {
                googleSignInAccountM990b = null;
            }
            Integer num = u71Var.f7704D;
            p80.m3863h(num);
            fm1 fm1Var = new fm1(2, account, num.intValue(), googleSignInAccountM990b);
            ql1 ql1Var = (ql1) u71Var.m3890l();
            Parcel parcelObtain = Parcel.obtain();
            parcelObtain.writeInterfaceToken(ql1Var.f9319d);
            int i = il1.f3610a;
            parcelObtain.writeInt(1);
            int iM4663q = t22.m4663q(parcelObtain, 20293);
            t22.m4662p(parcelObtain, 1, 4);
            parcelObtain.writeInt(1);
            t22.m4657k(parcelObtain, 2, fm1Var, 0);
            t22.m4665s(parcelObtain, iM4663q);
            parcelObtain.writeStrongBinder(this);
            Parcel parcelObtain2 = Parcel.obtain();
            try {
                ql1Var.f9318c.transact(12, parcelObtain, parcelObtain2, 0);
                parcelObtain2.readException();
            } finally {
                parcelObtain.recycle();
                parcelObtain2.recycle();
            }
        } catch (RemoteException e) {
            Log.w("SignInClientImpl", "Remote service probably died when signIn is called");
            try {
                this.f5083d.post(new f31(6, this, new am1(1, new C0253gl(8, null, null), null)));
            } catch (RemoteException unused2) {
                Log.wtf("SignInClientImpl", "ISignInCallbacks#onSignInComplete should be executed from the same process, unexpected RemoteException.", e);
            }
        }
    }
}
