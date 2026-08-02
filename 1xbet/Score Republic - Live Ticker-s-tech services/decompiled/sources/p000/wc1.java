package p000;

import android.app.Application;
import android.content.SharedPreferences;

/* JADX INFO: compiled from: r8-map-id-738170b7fb69b873ed7524d5270c8e05c6f5fb40ea1ade7a72c8ed7a70699269 */
/* JADX INFO: loaded from: classes.dex */
public final class wc1 {

    /* JADX INFO: renamed from: a */
    public int f8506a;

    /* JADX INFO: renamed from: b */
    public boolean f8507b;

    /* JADX INFO: renamed from: c */
    public boolean f8508c;

    /* JADX INFO: renamed from: d */
    public final Object f8509d;

    public wc1(x90 x90Var) {
        boolean z = false;
        this.f8506a = 0;
        this.f8509d = x90Var;
        w00 w00Var = x90Var.f8872a;
        w00Var.m5224a();
        SharedPreferences sharedPreferences = ((Application) w00Var.f8318a).getSharedPreferences("com.google.firebase.inappmessaging", 0);
        boolean z2 = true;
        if (sharedPreferences.contains("fresh_install")) {
            z2 = sharedPreferences.getBoolean("fresh_install", true);
        } else {
            x90Var.m5613a("fresh_install", true);
        }
        this.f8508c = z2;
        w00 w00Var2 = x90Var.f8872a;
        w00Var2.m5224a();
        SharedPreferences sharedPreferences2 = ((Application) w00Var2.f8318a).getSharedPreferences("com.google.firebase.inappmessaging", 0);
        if (sharedPreferences2.contains("test_device")) {
            z = sharedPreferences2.getBoolean("test_device", false);
        } else {
            x90Var.m5613a("test_device", false);
        }
        this.f8507b = z;
    }

    /* JADX INFO: renamed from: a */
    public void m5312a(String str) {
        ((ky1) this.f8509d).m3113J(this.f8506a, this.f8507b, this.f8508c, str, null, null, null);
    }

    /* JADX INFO: renamed from: b */
    public void m5313b(Object obj, String str) {
        ((ky1) this.f8509d).m3113J(this.f8506a, this.f8507b, this.f8508c, str, obj, null, null);
    }

    /* JADX INFO: renamed from: c */
    public void m5314c(Object obj, Object obj2, String str) {
        ((ky1) this.f8509d).m3113J(this.f8506a, this.f8507b, this.f8508c, str, obj, obj2, null);
    }

    /* JADX INFO: renamed from: d */
    public void m5315d(String str, Object obj, Object obj2, Object obj3) {
        ((ky1) this.f8509d).m3113J(this.f8506a, this.f8507b, this.f8508c, str, obj, obj2, obj3);
    }

    public wc1(ky1 ky1Var, int i, boolean z, boolean z2) {
        this.f8509d = ky1Var;
        this.f8506a = i;
        this.f8507b = z;
        this.f8508c = z2;
    }
}
