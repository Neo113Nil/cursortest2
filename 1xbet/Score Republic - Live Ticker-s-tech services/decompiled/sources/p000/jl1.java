package p000;

import android.os.RemoteException;
import com.google.android.gms.common.api.Status;

/* JADX INFO: compiled from: r8-map-id-738170b7fb69b873ed7524d5270c8e05c6f5fb40ea1ade7a72c8ed7a70699269 */
/* JADX INFO: loaded from: classes.dex */
public abstract class jl1 {

    /* JADX INFO: renamed from: a */
    public final int f4026a;

    public jl1(int i) {
        this.f4026a = i;
    }

    /* JADX INFO: renamed from: h */
    public static Status m2925h(RemoteException remoteException) {
        return new Status(19, remoteException.getClass().getSimpleName() + ": " + remoteException.getLocalizedMessage(), null, null);
    }

    /* JADX INFO: renamed from: a */
    public abstract C0451lz[] mo2926a(el1 el1Var);

    /* JADX INFO: renamed from: b */
    public abstract boolean mo2927b(el1 el1Var);

    /* JADX INFO: renamed from: c */
    public abstract int mo2928c(el1 el1Var);

    /* JADX INFO: renamed from: d */
    public abstract void mo2929d(Status status);

    /* JADX INFO: renamed from: e */
    public abstract void mo2930e(Exception exc);

    /* JADX INFO: renamed from: f */
    public abstract void mo2931f(a81 a81Var, boolean z);

    /* JADX INFO: renamed from: g */
    public abstract void mo2932g(el1 el1Var);
}
