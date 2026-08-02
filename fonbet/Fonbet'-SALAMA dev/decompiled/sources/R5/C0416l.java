package R5;

import a.AbstractC0603a;
import android.webkit.ValueCallback;
import f6.C1113f;
import kotlin.jvm.functions.Function1;
import w1.V0;

/* renamed from: R5.l, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final /* synthetic */ class C0416l implements ValueCallback {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f6189a;

    /* renamed from: b, reason: collision with root package name */
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
                Throwable a2 = C1113f.a(bool);
                V0 v02 = b7.f6068b;
                if (a2 == null) {
                    v02.f(Y4.D.D(bool));
                    break;
                } else {
                    v02.f(AbstractC0603a.w0(a2));
                    break;
                }
            default:
                String str = (String) obj;
                B b8 = (B) this.f6190b;
                t6.s.a(1, b8);
                Throwable a4 = C1113f.a(str);
                V0 v03 = b8.f6068b;
                if (a4 == null) {
                    v03.f(Y4.D.D(str));
                    break;
                } else {
                    v03.f(AbstractC0603a.w0(a4));
                    break;
                }
        }
    }
}
