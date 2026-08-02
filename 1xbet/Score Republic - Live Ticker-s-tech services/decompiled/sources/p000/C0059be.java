package p000;

import android.os.Parcel;
import android.text.TextUtils;

/* JADX INFO: renamed from: be */
/* JADX INFO: compiled from: r8-map-id-738170b7fb69b873ed7524d5270c8e05c6f5fb40ea1ade7a72c8ed7a70699269 */
/* JADX INFO: loaded from: classes.dex */
public final class C0059be implements InterfaceC0891xv, y01 {

    /* JADX INFO: renamed from: j */
    public final /* synthetic */ int f837j;

    /* JADX INFO: renamed from: k */
    public final String f838k;

    public /* synthetic */ C0059be(String str, int i) {
        this.f837j = i;
        this.f838k = str;
    }

    @Override // p000.y01
    public void accept(Object obj, Object obj2) {
        int i = e22.f1910k;
        w12 w12Var = new w12((qc1) obj2);
        f22 f22Var = (f22) ((h22) obj).m3890l();
        Parcel parcelM5810d = f22Var.m5810d();
        iu1.m2703c(parcelM5810d, w12Var);
        parcelM5810d.writeString(this.f838k);
        parcelM5810d.writeString("");
        parcelM5810d.writeString(null);
        f22Var.m5806F(parcelM5810d, 11);
    }

    @Override // p000.InterfaceC0891xv
    /* JADX INFO: renamed from: c */
    public boolean mo642c(CharSequence charSequence, int i, int i2, af1 af1Var) {
        if (!TextUtils.equals(charSequence.subSequence(i, i2), this.f838k)) {
            return true;
        }
        af1Var.f176c = (af1Var.f176c & 3) | 4;
        return false;
    }

    public String toString() {
        switch (this.f837j) {
            case 0:
                return this.f838k;
            default:
                return super.toString();
        }
    }

    @Override // p000.InterfaceC0891xv
    /* JADX INFO: renamed from: b */
    public Object mo641b() {
        return this;
    }
}
