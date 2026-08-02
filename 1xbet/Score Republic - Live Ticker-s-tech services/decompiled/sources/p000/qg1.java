package p000;

import android.net.Uri;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-738170b7fb69b873ed7524d5270c8e05c6f5fb40ea1ade7a72c8ed7a70699269 */
/* JADX INFO: loaded from: classes.dex */
public final class qg1 implements hq0 {

    /* JADX INFO: renamed from: b */
    public static final Set f6495b = Collections.unmodifiableSet(new HashSet(Arrays.asList("file", "content", "android.resource")));

    /* JADX INFO: renamed from: a */
    public final pg1 f6496a;

    public qg1(pg1 pg1Var) {
        this.f6496a = pg1Var;
    }

    @Override // p000.hq0
    /* JADX INFO: renamed from: a */
    public final boolean mo639a(Object obj) {
        return f6495b.contains(((Uri) obj).getScheme());
    }

    @Override // p000.hq0
    /* JADX INFO: renamed from: b */
    public final gq0 mo640b(Object obj, int i, int i2, uu0 uu0Var) {
        InterfaceC0551oo c0240g8;
        Uri uri = (Uri) obj;
        us0 us0Var = new us0(uri);
        pg1 pg1Var = this.f6496a;
        switch (pg1Var.f6148j) {
            case 0:
                c0240g8 = new C0240g8(pg1Var.f6149k, uri, pg1Var.f6150l, 0);
                break;
            case 1:
                c0240g8 = new C0240g8(pg1Var.f6149k, uri, pg1Var.f6150l, 1);
                break;
            default:
                c0240g8 = new ta1(pg1Var.f6149k, uri, pg1Var.f6150l);
                break;
        }
        return new gq0(us0Var, c0240g8);
    }
}
