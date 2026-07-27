package androidx.activity;

import android.text.TextUtils;

/* loaded from: classes.dex */
public final class g implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ l f4052a;

    public g(l lVar) {
        this.f4052a = lVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            super/*android.app.Activity*/.onBackPressed();
        } catch (IllegalStateException e3) {
            if (!TextUtils.equals(e3.getMessage(), "Can not perform this action after onSaveInstanceState")) {
                throw e3;
            }
        } catch (NullPointerException e6) {
            if (!TextUtils.equals(e6.getMessage(), "Attempt to invoke virtual method 'android.os.Handler android.app.FragmentHostCallback.getHandler()' on a null object reference")) {
                throw e6;
            }
        }
    }
}
