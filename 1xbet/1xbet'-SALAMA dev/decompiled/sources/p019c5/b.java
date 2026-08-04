package p019c5;

import A5.p;
import java.util.HashMap;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class b implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f10442a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ p f10443b;

    public /* synthetic */ b(p pVar, int i7) {
        this.f10442a = i7;
        this.f10443b = pVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f10442a) {
            case 0:
                this.f10443b.notImplemented();
                break;
            case 1:
                this.f10443b.success(null);
                break;
            case 2:
                this.f10443b.success(null);
                break;
            case 3:
                this.f10443b.success(new HashMap());
                break;
            case 4:
                this.f10443b.success(new HashMap());
                break;
            default:
                this.f10443b.success(new HashMap());
                break;
        }
    }
}
