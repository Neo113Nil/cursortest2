package androidx.room;

import android.content.Context;
import com.razorpay.CoreInitializer$O$$$__o0Oo;

/* loaded from: classes3.dex */
public final /* synthetic */ class k implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ k(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                QueryInterceptorStatement.simpleQueryForString$lambda$4((QueryInterceptorStatement) this.b);
                break;
            default:
                CoreInitializer$O$$$__o0Oo.m1697onActivityResumed$lambda0((Context) this.b);
                break;
        }
    }
}
