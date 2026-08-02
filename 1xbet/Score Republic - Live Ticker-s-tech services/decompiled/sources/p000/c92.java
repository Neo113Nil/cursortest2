package p000;

import android.net.Uri;
import com.google.common.util.concurrent.ListenableFuture;
import java.io.IOException;

/* JADX INFO: compiled from: r8-map-id-738170b7fb69b873ed7524d5270c8e05c6f5fb40ea1ade7a72c8ed7a70699269 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class c92 implements InterfaceC0387k8 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f1176a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ e92 f1177b;

    public /* synthetic */ c92(e92 e92Var, int i) {
        this.f1176a = i;
        this.f1177b = e92Var;
    }

    @Override // p000.InterfaceC0387k8
    public final ListenableFuture apply(Object obj) throws IOException {
        ListenableFuture listenableFuture;
        int i = this.f1176a;
        e92 e92Var = this.f1177b;
        switch (i) {
            case 0:
                synchronized (e92Var.f2027h) {
                    listenableFuture = e92Var.f2029j;
                    break;
                }
                return listenableFuture;
            case 1:
                return k70.m2993d(e92Var.m1395b((Uri) k70.m2991b(e92Var.f2021b)));
            case 2:
                e92Var.m1396c((Uri) k70.m2991b(e92Var.f2021b), obj);
                return jc0.f3900k;
            default:
                Uri uri = (Uri) obj;
                Uri uriBuild = uri.buildUpon().path(String.valueOf(uri.getPath()).concat(".bak")).build();
                try {
                    g82 g82Var = e92Var.f2024e;
                    e82 e82VarM2000b = g82Var.m2000b(uriBuild);
                    if (e82VarM2000b.f2013a.mo2566b(e82VarM2000b.f2016d)) {
                        e82 e82VarM2000b2 = g82Var.m2000b(uriBuild);
                        e82 e82VarM2000b3 = g82Var.m2000b(uri);
                        w82 w82Var = e82VarM2000b2.f2013a;
                        if (w82Var != e82VarM2000b3.f2013a) {
                            throw new C0287hi("Cannot rename file across backends");
                        }
                        w82Var.mo2569e(e82VarM2000b2.f2016d, e82VarM2000b3.f2016d);
                    }
                    return jc0.f3900k;
                } catch (IOException e) {
                    return k70.m2992c(e);
                }
        }
    }
}
