package p000;

import android.os.Parcel;

/* JADX INFO: compiled from: r8-map-id-738170b7fb69b873ed7524d5270c8e05c6f5fb40ea1ade7a72c8ed7a70699269 */
/* JADX INFO: loaded from: classes.dex */
public final class k72 extends yk1 {
    /* JADX INFO: renamed from: H */
    public final xb0 m2997H(vs0 vs0Var, String str, int i, vs0 vs0Var2) {
        Parcel parcelM5810d = m5810d();
        ru1.m4408b(parcelM5810d, vs0Var);
        parcelM5810d.writeString(str);
        parcelM5810d.writeInt(i);
        ru1.m4408b(parcelM5810d, vs0Var2);
        Parcel parcelM5808a = m5808a(parcelM5810d, 2);
        xb0 xb0VarM5187G = vs0.m5187G(parcelM5808a.readStrongBinder());
        parcelM5808a.recycle();
        return xb0VarM5187G;
    }

    /* JADX INFO: renamed from: I */
    public final xb0 m2998I(vs0 vs0Var, String str, int i, vs0 vs0Var2) {
        Parcel parcelM5810d = m5810d();
        ru1.m4408b(parcelM5810d, vs0Var);
        parcelM5810d.writeString(str);
        parcelM5810d.writeInt(i);
        ru1.m4408b(parcelM5810d, vs0Var2);
        Parcel parcelM5808a = m5808a(parcelM5810d, 3);
        xb0 xb0VarM5187G = vs0.m5187G(parcelM5808a.readStrongBinder());
        parcelM5808a.recycle();
        return xb0VarM5187G;
    }
}
