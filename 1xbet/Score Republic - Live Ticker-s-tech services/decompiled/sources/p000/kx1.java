package p000;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-738170b7fb69b873ed7524d5270c8e05c6f5fb40ea1ade7a72c8ed7a70699269 */
/* JADX INFO: loaded from: classes.dex */
public final class kx1 extends yk1 implements nx1 {
    public kx1(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.measurement.internal.IMeasurementService", 2);
    }

    @Override // p000.nx1
    /* JADX INFO: renamed from: A */
    public final void mo556A(z72 z72Var) {
        Parcel parcelM5810d = m5810d();
        iu1.m2702b(parcelM5810d, z72Var);
        m5806F(parcelM5810d, 25);
    }

    @Override // p000.nx1
    /* JADX INFO: renamed from: B */
    public final void mo557B(z72 z72Var, g62 g62Var, tx1 tx1Var) {
        Parcel parcelM5810d = m5810d();
        iu1.m2702b(parcelM5810d, z72Var);
        iu1.m2702b(parcelM5810d, g62Var);
        iu1.m2703c(parcelM5810d, tx1Var);
        m5806F(parcelM5810d, 29);
    }

    @Override // p000.nx1
    /* JADX INFO: renamed from: C */
    public final void mo558C(hr1 hr1Var, z72 z72Var) {
        Parcel parcelM5810d = m5810d();
        iu1.m2702b(parcelM5810d, hr1Var);
        iu1.m2702b(parcelM5810d, z72Var);
        m5806F(parcelM5810d, 12);
    }

    @Override // p000.nx1
    /* JADX INFO: renamed from: D */
    public final void mo559D(fu1 fu1Var, z72 z72Var) {
        Parcel parcelM5810d = m5810d();
        iu1.m2702b(parcelM5810d, fu1Var);
        iu1.m2702b(parcelM5810d, z72Var);
        m5806F(parcelM5810d, 1);
    }

    @Override // p000.nx1
    /* JADX INFO: renamed from: E */
    public final void mo560E(z72 z72Var) {
        Parcel parcelM5810d = m5810d();
        iu1.m2702b(parcelM5810d, z72Var);
        m5806F(parcelM5810d, 27);
    }

    @Override // p000.nx1
    /* JADX INFO: renamed from: f */
    public final void mo566f(z72 z72Var) {
        Parcel parcelM5810d = m5810d();
        iu1.m2702b(parcelM5810d, z72Var);
        m5806F(parcelM5810d, 20);
    }

    @Override // p000.nx1
    /* JADX INFO: renamed from: g */
    public final List mo567g(String str, String str2, String str3, boolean z) {
        Parcel parcelM5810d = m5810d();
        parcelM5810d.writeString(null);
        parcelM5810d.writeString(str2);
        parcelM5810d.writeString(str3);
        ClassLoader classLoader = iu1.f3667a;
        parcelM5810d.writeInt(z ? 1 : 0);
        Parcel parcelM5809c = m5809c(parcelM5810d, 15);
        ArrayList arrayListCreateTypedArrayList = parcelM5809c.createTypedArrayList(b72.CREATOR);
        parcelM5809c.recycle();
        return arrayListCreateTypedArrayList;
    }

    @Override // p000.nx1
    /* JADX INFO: renamed from: i */
    public final void mo568i(z72 z72Var) {
        Parcel parcelM5810d = m5810d();
        iu1.m2702b(parcelM5810d, z72Var);
        m5806F(parcelM5810d, 6);
    }

    @Override // p000.nx1
    /* JADX INFO: renamed from: j */
    public final void mo569j(z72 z72Var) {
        Parcel parcelM5810d = m5810d();
        iu1.m2702b(parcelM5810d, z72Var);
        m5806F(parcelM5810d, 26);
    }

    @Override // p000.nx1
    /* JADX INFO: renamed from: k */
    public final void mo570k(b72 b72Var, z72 z72Var) {
        Parcel parcelM5810d = m5810d();
        iu1.m2702b(parcelM5810d, b72Var);
        iu1.m2702b(parcelM5810d, z72Var);
        m5806F(parcelM5810d, 2);
    }

    @Override // p000.nx1
    /* JADX INFO: renamed from: l */
    public final String mo571l(z72 z72Var) {
        Parcel parcelM5810d = m5810d();
        iu1.m2702b(parcelM5810d, z72Var);
        Parcel parcelM5809c = m5809c(parcelM5810d, 11);
        String string = parcelM5809c.readString();
        parcelM5809c.recycle();
        return string;
    }

    @Override // p000.nx1
    /* JADX INFO: renamed from: m */
    public final byte[] mo572m(String str, fu1 fu1Var) {
        Parcel parcelM5810d = m5810d();
        iu1.m2702b(parcelM5810d, fu1Var);
        parcelM5810d.writeString(str);
        Parcel parcelM5809c = m5809c(parcelM5810d, 9);
        byte[] bArrCreateByteArray = parcelM5809c.createByteArray();
        parcelM5809c.recycle();
        return bArrCreateByteArray;
    }

    @Override // p000.nx1
    /* JADX INFO: renamed from: o */
    public final gt1 mo573o(z72 z72Var) {
        Parcel parcelM5810d = m5810d();
        iu1.m2702b(parcelM5810d, z72Var);
        Parcel parcelM5809c = m5809c(parcelM5810d, 21);
        gt1 gt1Var = (gt1) iu1.m2701a(parcelM5809c, gt1.CREATOR);
        parcelM5809c.recycle();
        return gt1Var;
    }

    @Override // p000.nx1
    /* JADX INFO: renamed from: p */
    public final void mo574p(z72 z72Var, Bundle bundle, qx1 qx1Var) {
        Parcel parcelM5810d = m5810d();
        iu1.m2702b(parcelM5810d, z72Var);
        iu1.m2702b(parcelM5810d, bundle);
        iu1.m2703c(parcelM5810d, qx1Var);
        m5806F(parcelM5810d, 31);
    }

    @Override // p000.nx1
    /* JADX INFO: renamed from: q */
    public final void mo575q(long j, String str, String str2, String str3) {
        Parcel parcelM5810d = m5810d();
        parcelM5810d.writeLong(j);
        parcelM5810d.writeString(str);
        parcelM5810d.writeString(str2);
        parcelM5810d.writeString(str3);
        m5806F(parcelM5810d, 10);
    }

    @Override // p000.nx1
    /* JADX INFO: renamed from: r */
    public final List mo576r(String str, String str2, z72 z72Var) {
        Parcel parcelM5810d = m5810d();
        parcelM5810d.writeString(str);
        parcelM5810d.writeString(str2);
        iu1.m2702b(parcelM5810d, z72Var);
        Parcel parcelM5809c = m5809c(parcelM5810d, 16);
        ArrayList arrayListCreateTypedArrayList = parcelM5809c.createTypedArrayList(hr1.CREATOR);
        parcelM5809c.recycle();
        return arrayListCreateTypedArrayList;
    }

    @Override // p000.nx1
    /* JADX INFO: renamed from: s */
    public final void mo577s(z72 z72Var) {
        Parcel parcelM5810d = m5810d();
        iu1.m2702b(parcelM5810d, z72Var);
        m5806F(parcelM5810d, 18);
    }

    @Override // p000.nx1
    /* JADX INFO: renamed from: u */
    public final void mo578u(z72 z72Var) {
        Parcel parcelM5810d = m5810d();
        iu1.m2702b(parcelM5810d, z72Var);
        m5806F(parcelM5810d, 4);
    }

    @Override // p000.nx1
    /* JADX INFO: renamed from: v */
    public final List mo579v(String str, String str2, String str3) {
        Parcel parcelM5810d = m5810d();
        parcelM5810d.writeString(null);
        parcelM5810d.writeString(str2);
        parcelM5810d.writeString(str3);
        Parcel parcelM5809c = m5809c(parcelM5810d, 17);
        ArrayList arrayListCreateTypedArrayList = parcelM5809c.createTypedArrayList(hr1.CREATOR);
        parcelM5809c.recycle();
        return arrayListCreateTypedArrayList;
    }

    @Override // p000.nx1
    /* JADX INFO: renamed from: w */
    public final List mo580w(String str, String str2, boolean z, z72 z72Var) {
        Parcel parcelM5810d = m5810d();
        parcelM5810d.writeString(str);
        parcelM5810d.writeString(str2);
        ClassLoader classLoader = iu1.f3667a;
        parcelM5810d.writeInt(z ? 1 : 0);
        iu1.m2702b(parcelM5810d, z72Var);
        Parcel parcelM5809c = m5809c(parcelM5810d, 14);
        ArrayList arrayListCreateTypedArrayList = parcelM5809c.createTypedArrayList(b72.CREATOR);
        parcelM5809c.recycle();
        return arrayListCreateTypedArrayList;
    }

    @Override // p000.nx1
    /* JADX INFO: renamed from: x */
    public final void mo581x(z72 z72Var, vp1 vp1Var) {
        Parcel parcelM5810d = m5810d();
        iu1.m2702b(parcelM5810d, z72Var);
        iu1.m2702b(parcelM5810d, vp1Var);
        m5806F(parcelM5810d, 30);
    }

    @Override // p000.nx1
    /* JADX INFO: renamed from: z */
    public final void mo582z(Bundle bundle, z72 z72Var) {
        Parcel parcelM5810d = m5810d();
        iu1.m2702b(parcelM5810d, bundle);
        iu1.m2702b(parcelM5810d, z72Var);
        m5806F(parcelM5810d, 19);
    }
}
