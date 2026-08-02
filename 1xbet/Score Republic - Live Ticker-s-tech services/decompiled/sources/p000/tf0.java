package p000;

import android.content.Context;
import android.os.Process;
import android.util.Log;
import java.util.LinkedHashSet;

/* JADX INFO: compiled from: r8-map-id-738170b7fb69b873ed7524d5270c8e05c6f5fb40ea1ade7a72c8ed7a70699269 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class tf0 implements h60 {

    /* JADX INFO: renamed from: j */
    public final /* synthetic */ int f7443j;

    /* JADX INFO: renamed from: k */
    public final /* synthetic */ wf0 f7444k;

    public /* synthetic */ tf0(wf0 wf0Var, int i) {
        this.f7443j = i;
        this.f7444k = wf0Var;
    }

    @Override // p000.h60
    /* JADX INFO: renamed from: i */
    public final Object mo170i(Object obj) {
        int i = this.f7443j;
        wf0 wf0Var = this.f7444k;
        switch (i) {
            case 0:
                C0661rn c0661rn = (C0661rn) obj;
                c0661rn.getClass();
                l01.f4622a.getClass();
                Log.w(new C0580pg(wf0.class).m3904a(), "CorruptionException in " + wf0Var.f8533a + " DataStore running in process " + Process.myPid(), c0661rn);
                return new zq0(true);
            default:
                Context context = (Context) obj;
                context.getClass();
                String str = wf0Var.f8533a;
                LinkedHashSet linkedHashSet = l71.f4705a;
                linkedHashSet.getClass();
                return vt1.m5193e(new j71(context, str, m71.f4997a, new C0257gp(linkedHashSet, null, 3), new k71(3, null)));
        }
    }
}
