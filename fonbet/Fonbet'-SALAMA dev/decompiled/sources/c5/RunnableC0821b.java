package c5;

import A5.p;
import java.util.HashMap;

/* renamed from: c5.b, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final /* synthetic */ class RunnableC0821b implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f10442a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ p f10443b;

    public /* synthetic */ RunnableC0821b(p pVar, int i7) {
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
