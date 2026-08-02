package p000;

import android.app.Application;
import android.content.SharedPreferences;

/* JADX INFO: compiled from: r8-map-id-738170b7fb69b873ed7524d5270c8e05c6f5fb40ea1ade7a72c8ed7a70699269 */
/* JADX INFO: loaded from: classes.dex */
public final class x90 {

    /* JADX INFO: renamed from: a */
    public final w00 f8872a;

    public /* synthetic */ x90(w00 w00Var) {
        this.f8872a = w00Var;
    }

    /* JADX INFO: renamed from: a */
    public void m5613a(String str, boolean z) {
        w00 w00Var = this.f8872a;
        w00Var.m5224a();
        SharedPreferences.Editor editorEdit = ((Application) w00Var.f8318a).getSharedPreferences("com.google.firebase.inappmessaging", 0).edit();
        editorEdit.putBoolean(str, z);
        editorEdit.apply();
    }
}
