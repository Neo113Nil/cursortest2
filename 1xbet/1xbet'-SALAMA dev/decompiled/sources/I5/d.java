package I5;

import A5.h;
import java.util.HashMap;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class d implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f3705a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ h f3706b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ HashMap f3707c;

    public /* synthetic */ d(h hVar, HashMap map, int i7) {
        this.f3705a = i7;
        this.f3706b = hVar;
        this.f3707c = map;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f3705a) {
            case 0:
                h hVar = this.f3706b;
                hVar.c(this.f3707c);
                hVar.a();
                break;
            default:
                this.f3706b.c(this.f3707c);
                break;
        }
    }
}
