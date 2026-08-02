package androidx.activity;

import com.appsflyer.internal.AFi1bSDK;
import g1.ViewOnAttachStateChangeListenerC6609a;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: androidx.activity.o, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class RunnableC5048o implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f36981a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f36982b;

    public /* synthetic */ RunnableC5048o(Object obj, int i11) {
        this.f36981a = i11;
        this.f36982b = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f36981a) {
            case 0:
                ActivityC5043j this$0 = (ActivityC5043j) this.f36982b;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                try {
                    super/*android.app.Activity*/.onBackPressed();
                    return;
                } catch (IllegalStateException e11) {
                    if (!Intrinsics.d(e11.getMessage(), "Can not perform this action after onSaveInstanceState")) {
                        throw e11;
                    }
                    return;
                } catch (NullPointerException e12) {
                    if (!Intrinsics.d(e12.getMessage(), "Attempt to invoke virtual method 'android.os.Handler android.app.FragmentHostCallback.getHandler()' on a null object reference")) {
                        throw e12;
                    }
                    return;
                }
            case 1:
                ((AFi1bSDK) this.f36982b).d();
                return;
            default:
                ViewOnAttachStateChangeListenerC6609a.a((ViewOnAttachStateChangeListenerC6609a) this.f36982b);
                return;
        }
    }
}
