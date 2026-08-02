package p000;

import android.content.SharedPreferences;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-738170b7fb69b873ed7524d5270c8e05c6f5fb40ea1ade7a72c8ed7a70699269 */
/* JADX INFO: loaded from: classes.dex */
public final class bz1 {

    /* JADX INFO: renamed from: a */
    public final String f1049a;

    /* JADX INFO: renamed from: b */
    public final long f1050b;

    /* JADX INFO: renamed from: c */
    public boolean f1051c;

    /* JADX INFO: renamed from: d */
    public long f1052d;

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ fz1 f1053e;

    public bz1(fz1 fz1Var, String str, long j) {
        Objects.requireNonNull(fz1Var);
        this.f1053e = fz1Var;
        p80.m3860e(str);
        this.f1049a = str;
        this.f1050b = j;
    }

    /* JADX INFO: renamed from: a */
    public final long m821a() {
        if (!this.f1051c) {
            this.f1051c = true;
            this.f1052d = this.f1053e.m1908E().getLong(this.f1049a, this.f1050b);
        }
        return this.f1052d;
    }

    /* JADX INFO: renamed from: b */
    public final void m822b(long j) {
        SharedPreferences.Editor editorEdit = this.f1053e.m1908E().edit();
        editorEdit.putLong(this.f1049a, j);
        editorEdit.apply();
        this.f1052d = j;
    }
}
