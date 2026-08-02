package androidx.browser.trusted;

import android.os.Bundle;
import android.os.IBinder;
import android.os.RemoteException;
import android.support.customtabs.trusted.a;

/* loaded from: classes.dex */
public class TrustedWebActivityCallbackRemote {
    private final android.support.customtabs.trusted.a mCallbackBinder;

    private TrustedWebActivityCallbackRemote(android.support.customtabs.trusted.a aVar) {
        this.mCallbackBinder = aVar;
    }

    public static TrustedWebActivityCallbackRemote fromBinder(IBinder iBinder) {
        android.support.customtabs.trusted.a asInterface = iBinder == null ? null : a.AbstractBinderC0009a.asInterface(iBinder);
        if (asInterface == null) {
            return null;
        }
        return new TrustedWebActivityCallbackRemote(asInterface);
    }

    public void runExtraCallback(String str, Bundle bundle) throws RemoteException {
        this.mCallbackBinder.onExtraCallback(str, bundle);
    }
}
