package androidx.browser.customtabs;

/* loaded from: classes6.dex */
public class PostMessageService extends android.app.Service {
    private android.support.customtabs.IPostMessageService.Stub Camera2StreamConfigurationMap = new android.support.customtabs.IPostMessageService.Stub() { // from class: androidx.browser.customtabs.PostMessageService.1
        @Override // android.support.customtabs.IPostMessageService
        public int getInterfaceVersion() {
            return 1;
        }

        @Override // android.support.customtabs.IPostMessageService
        public void onMessageChannelReady(android.support.customtabs.ICustomTabsCallback iCustomTabsCallback, android.os.Bundle bundle) throws android.os.RemoteException {
            iCustomTabsCallback.onMessageChannelReady(bundle);
        }

        @Override // android.support.customtabs.IPostMessageService
        public void onPostMessage(android.support.customtabs.ICustomTabsCallback iCustomTabsCallback, java.lang.String str, android.os.Bundle bundle) throws android.os.RemoteException {
            iCustomTabsCallback.onPostMessage(str, bundle);
        }
    };

    @Override // android.app.Service
    public android.os.IBinder onBind(android.content.Intent intent) {
        return this.Camera2StreamConfigurationMap;
    }

    @Override // android.app.Service
    public void onCreate() {
        super.onCreate();
    }

    @Override // android.app.Service, android.content.ContextWrapper
    public void attachBaseContext(android.content.Context context) {
        super.attachBaseContext(context);
    }
}
