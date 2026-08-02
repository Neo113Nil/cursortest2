package p000;

import android.graphics.Rect;
import android.os.Build;
import android.view.View;
import java.util.Collections;
import java.util.List;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-738170b7fb69b873ed7524d5270c8e05c6f5fb40ea1ade7a72c8ed7a70699269 */
/* JADX INFO: loaded from: classes.dex */
public class xj1 {

    /* JADX INFO: renamed from: b */
    public static final ak1 f8974b;

    /* JADX INFO: renamed from: a */
    public final ak1 f8975a;

    static {
        oj1 jj1Var;
        int i = Build.VERSION.SDK_INT;
        if (i >= 36) {
            jj1Var = new nj1();
        } else if (i >= 35) {
            jj1Var = new mj1();
        } else if (i >= 34) {
            jj1Var = new lj1();
        } else if (i >= 31) {
            jj1Var = new kj1();
        } else {
            jj1Var = i >= 30 ? new jj1() : new ij1();
        }
        f8974b = jj1Var.mo2654b().f229a.mo4358a().f229a.mo4101b().f229a.mo4102c();
    }

    public xj1(ak1 ak1Var) {
        this.f8975a = ak1Var;
    }

    /* JADX INFO: renamed from: a */
    public ak1 mo4358a() {
        return this.f8975a;
    }

    /* JADX INFO: renamed from: b */
    public ak1 mo4101b() {
        return this.f8975a;
    }

    /* JADX INFO: renamed from: c */
    public ak1 mo4102c() {
        return this.f8975a;
    }

    /* JADX INFO: renamed from: e */
    public List<Rect> mo3936e(int i) {
        return Collections.EMPTY_LIST;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xj1)) {
            return false;
        }
        xj1 xj1Var = (xj1) obj;
        return mo3941q() == xj1Var.mo3941q() && mo4104p() == xj1Var.mo4104p() && Objects.equals(mo3938k(), xj1Var.mo3938k()) && Objects.equals(mo4103i(), xj1Var.mo4103i()) && Objects.equals(mo4359g(), xj1Var.mo4359g());
    }

    /* JADX INFO: renamed from: f */
    public List<Rect> mo3937f(int i) {
        return Collections.EMPTY_LIST;
    }

    /* JADX INFO: renamed from: g */
    public C0075bu mo4359g() {
        return null;
    }

    /* JADX INFO: renamed from: h */
    public wd0 mo4530h() {
        return mo3938k();
    }

    public int hashCode() {
        return Objects.hash(Boolean.valueOf(mo3941q()), Boolean.valueOf(mo4104p()), mo3938k(), mo4103i(), mo4359g());
    }

    /* JADX INFO: renamed from: i */
    public wd0 mo4103i() {
        return wd0.f8514e;
    }

    /* JADX INFO: renamed from: j */
    public wd0 mo4531j() {
        return mo3938k();
    }

    /* JADX INFO: renamed from: k */
    public wd0 mo3938k() {
        return wd0.f8514e;
    }

    /* JADX INFO: renamed from: l */
    public wd0 mo4532l() {
        return mo3938k();
    }

    /* JADX INFO: renamed from: o */
    public ak1 mo4533o(int i, int i2, int i3, int i4) {
        return f8974b;
    }

    /* JADX INFO: renamed from: p */
    public boolean mo4104p() {
        return false;
    }

    /* JADX INFO: renamed from: q */
    public boolean mo3941q() {
        return false;
    }

    /* JADX INFO: renamed from: n */
    public void mo3940n() {
    }

    /* JADX INFO: renamed from: d */
    public void mo3935d(View view) {
    }

    /* JADX INFO: renamed from: m */
    public void mo3939m(View view) {
    }

    /* JADX INFO: renamed from: r */
    public void mo3942r(C0150du c0150du) {
    }

    /* JADX INFO: renamed from: s */
    public void mo3943s(wd0[] wd0VarArr) {
    }

    /* JADX INFO: renamed from: t */
    public void mo3944t(ak1 ak1Var) {
    }

    /* JADX INFO: renamed from: u */
    public void mo3945u(int i) {
    }

    /* JADX INFO: renamed from: v */
    public void mo3946v(Rect[][] rectArr) {
    }

    /* JADX INFO: renamed from: w */
    public void mo3947w(Rect[][] rectArr) {
    }
}
