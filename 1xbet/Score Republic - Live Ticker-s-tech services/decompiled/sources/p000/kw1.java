package p000;

import android.os.Bundle;
import android.os.Parcel;

/* JADX INFO: compiled from: r8-map-id-738170b7fb69b873ed7524d5270c8e05c6f5fb40ea1ade7a72c8ed7a70699269 */
/* JADX INFO: loaded from: classes.dex */
public final class kw1 extends hu1 implements kv1 {

    /* JADX INFO: renamed from: b */
    public final tv1 f4585b;

    public kw1(tv1 tv1Var) {
        super("com.google.android.gms.measurement.api.internal.IEventHandlerProxy");
        this.f4585b = tv1Var;
    }

    @Override // p000.hu1
    /* JADX INFO: renamed from: a */
    public final boolean mo563a(int i, Parcel parcel, Parcel parcel2) {
        if (i != 1) {
            if (i != 2) {
                return false;
            }
            int iIdentityHashCode = System.identityHashCode(this.f4585b);
            parcel2.writeNoException();
            parcel2.writeInt(iIdentityHashCode);
            return true;
        }
        String string = parcel.readString();
        String string2 = parcel.readString();
        Bundle bundle = (Bundle) iu1.m2701a(parcel, Bundle.CREATOR);
        long j = parcel.readLong();
        iu1.m2704d(parcel);
        mo2968h(string, string2, bundle, j);
        parcel2.writeNoException();
        return true;
    }

    @Override // p000.kv1
    /* JADX INFO: renamed from: b */
    public final int mo2967b() {
        return System.identityHashCode(this.f4585b);
    }

    @Override // p000.kv1
    /* JADX INFO: renamed from: h */
    public final void mo2968h(String str, String str2, Bundle bundle, long j) {
        this.f4585b.mo3188a(str, str2, bundle, j);
    }
}
