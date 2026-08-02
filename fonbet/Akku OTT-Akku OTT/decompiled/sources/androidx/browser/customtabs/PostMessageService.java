package androidx.browser.customtabs;

import android.app.Service;
import android.content.Intent;
import android.os.Bundle;
import android.os.IBinder;
import android.os.RemoteException;
import android.support.customtabs.e;

/* loaded from: classes.dex */
public class PostMessageService extends Service {
    private e.a mBinder = new e.a() { // from class: androidx.browser.customtabs.PostMessageService.1
        @Override // android.support.customtabs.e
        public void onMessageChannelReady(android.support.customtabs.b bVar, Bundle bundle) throws RemoteException {
            bVar.onMessageChannelReady(bundle);
        }

        @Override // android.support.customtabs.e
        public void onPostMessage(android.support.customtabs.b bVar, String str, Bundle bundle) throws RemoteException {
            bVar.onPostMessage(str, bundle);
        }
    };

    @Override // android.app.Service
    public IBinder onBind(Intent intent) {
        return this.mBinder;
    }
}
