package p000;

import android.net.Uri;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-738170b7fb69b873ed7524d5270c8e05c6f5fb40ea1ade7a72c8ed7a70699269 */
/* JADX INFO: loaded from: classes.dex */
public final class rg1 implements hq0 {

    /* JADX INFO: renamed from: b */
    public static final Set f6839b = Collections.unmodifiableSet(new HashSet(Arrays.asList("http", "https")));

    /* JADX INFO: renamed from: a */
    public final hq0 f6840a;

    public rg1(hq0 hq0Var) {
        this.f6840a = hq0Var;
    }

    @Override // p000.hq0
    /* JADX INFO: renamed from: a */
    public final boolean mo639a(Object obj) {
        return f6839b.contains(((Uri) obj).getScheme());
    }

    @Override // p000.hq0
    /* JADX INFO: renamed from: b */
    public final gq0 mo640b(Object obj, int i, int i2, uu0 uu0Var) {
        return this.f6840a.mo640b(new z80(((Uri) obj).toString(), sa0.f7084a), i, i2, uu0Var);
    }
}
