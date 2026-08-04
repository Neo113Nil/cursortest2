package R5;

import android.webkit.ValueCallback;
import kotlin.jvm.functions.Function1;
import p155w1.V0;

/* JADX INFO: renamed from: R5.l, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class C0416l implements ValueCallback {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f6189a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Function1 f6190b;

    public /* synthetic */ C0416l(int i7, Function1 function1) {
        this.f6189a = i7;
        this.f6190b = function1;
    }

    @Override // android.webkit.ValueCallback
    public final void onReceiveValue(Object obj) {
        switch (this.f6189a) {
            case 0:
                Boolean bool = (Boolean) obj;
                B b7 = (B) this.f6190b;
                t6.s.a(1, b7);
                Throwable thA = p044f6.f.a(bool);
                V0 v6 = b7.f6068b;
                if (thA == null) {
                    v6.f(Y4.D.D(bool));
                } else {
                    v6.f(p003a.a.w0(thA));
                }
                break;
            default:
                String str = (String) obj;
                B b8 = (B) this.f6190b;
                t6.s.a(1, b8);
                Throwable thA2 = p044f6.f.a(str);
                V0 v7 = b8.f6068b;
                if (thA2 == null) {
                    v7.f(Y4.D.D(str));
                } else {
                    v7.f(p003a.a.w0(thA2));
                }
                break;
        }
    }
}
