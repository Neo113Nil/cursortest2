package p000;

import android.os.Bundle;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import live.football.scorerepublic.MainActivity;

/* JADX INFO: renamed from: t4 */
/* JADX INFO: compiled from: r8-map-id-738170b7fb69b873ed7524d5270c8e05c6f5fb40ea1ade7a72c8ed7a70699269 */
/* JADX INFO: loaded from: classes.dex */
public final class C0716t4 implements w41 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f7273a;

    /* JADX INFO: renamed from: b */
    public final Object f7274b;

    public C0716t4(C0086c5 c0086c5) {
        this.f7273a = 1;
        this.f7274b = new LinkedHashSet();
        c0086c5.m851e("androidx.savedstate.Restarter", this);
    }

    @Override // p000.w41
    /* JADX INFO: renamed from: a */
    public final Bundle mo264a() {
        int i = this.f7273a;
        Object obj = this.f7274b;
        switch (i) {
            case 0:
                Bundle bundle = new Bundle();
                ((MainActivity) obj).m5051j().getClass();
                return bundle;
            default:
                Bundle bundle2 = new Bundle();
                bundle2.putStringArrayList("classes_to_restore", new ArrayList<>((LinkedHashSet) obj));
                return bundle2;
        }
    }

    public C0716t4(MainActivity mainActivity) {
        this.f7273a = 0;
        this.f7274b = mainActivity;
    }
}
