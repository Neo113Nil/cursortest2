package B90;

import java.util.ArrayList;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final /* synthetic */ class c0 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f3139a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f3140b;

    public /* synthetic */ c0(Object obj, int i11) {
        this.f3139a = i11;
        this.f3140b = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f3139a) {
            case 0:
                v0.k0((v0) this.f3140b);
                break;
            case 1:
                Lg.b.a((Lg.b) this.f3140b);
                break;
            case 2:
                ((Function0) this.f3140b).invoke();
                break;
            default:
                ArrayList transitioningViews = (ArrayList) this.f3140b;
                Intrinsics.checkNotNullParameter(transitioningViews, "$transitioningViews");
                androidx.fragment.app.S.d(4, transitioningViews);
                break;
        }
    }
}
