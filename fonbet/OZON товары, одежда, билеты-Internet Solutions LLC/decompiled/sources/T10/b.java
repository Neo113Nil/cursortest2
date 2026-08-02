package T10;

import com.appsflyer.internal.AFb1tSDK;

/* loaded from: classes7.dex */
public final /* synthetic */ class b implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f26509a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f26510b;

    public /* synthetic */ b(Object obj, int i11) {
        this.f26509a = i11;
        this.f26510b = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f26509a) {
            case 0:
                c.a((c) this.f26510b);
                break;
            default:
                ((AFb1tSDK) this.f26510b).AFLogger();
                break;
        }
    }
}
