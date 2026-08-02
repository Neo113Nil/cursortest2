package androidx.core.app;

import android.app.Activity;
import android.content.Context;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import androidx.core.content.ContextCompat;
import com.razorpay.RazorpayInitializer$O$$$__o0Oo;

/* loaded from: classes.dex */
public final /* synthetic */ class a implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ a(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                ActivityCompat.lambda$recreate$0((Activity) this.b);
                break;
            case 1:
                View view = (View) this.b;
                ((InputMethodManager) ContextCompat.getSystemService(view.getContext(), InputMethodManager.class)).showSoftInput(view, 1);
                break;
            default:
                RazorpayInitializer$O$$$__o0Oo.m1707onActivityResumed$lambda2$lambda1((Context) this.b);
                break;
        }
    }
}
