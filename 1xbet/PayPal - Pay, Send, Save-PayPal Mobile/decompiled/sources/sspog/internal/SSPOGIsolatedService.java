package sspog.internal;

/* loaded from: classes18.dex */
public class SSPOGIsolatedService extends android.app.Service {
    private java.lang.String[] blackListedMountPaths = {"/sbin/.magisk/", "/sbin/.core/mirror", "/sbin/.core/img", "/sbin/.core/db-0/magisk.db"};
    private sspog.internal.IIsolatedVerifyingProcess.Stub mBinder = new sspog.internal.IIsolatedVerifyingProcess.Stub() { // from class: sspog.internal.SSPOGIsolatedService.1
        @Override // sspog.internal.IIsolatedVerifyingProcess
        public boolean isMagiskDetected() throws android.os.RemoteException {
            sspog.SimpleLogger.d("SSPOGService", "Running SSPOGIsolatedService", new java.lang.Object[0]);
            try {
                java.io.FileInputStream fileInputStream = new java.io.FileInputStream(new java.io.File(java.lang.String.format("/proc/%d/mounts", java.lang.Integer.valueOf(android.os.Process.myPid()))));
                try {
                    java.io.BufferedReader bufferedReader = new java.io.BufferedReader(new java.io.InputStreamReader(fileInputStream));
                    int i = 0;
                    while (true) {
                        try {
                            java.lang.String readLine = bufferedReader.readLine();
                            if (readLine == null) {
                                break;
                            }
                            for (java.lang.String str : sspog.internal.SSPOGIsolatedService.this.blackListedMountPaths) {
                                if (readLine.contains(str)) {
                                    i++;
                                }
                            }
                        } finally {
                        }
                    }
                    boolean z = i > 0;
                    bufferedReader.close();
                    fileInputStream.close();
                    return z;
                } finally {
                }
            } catch (java.io.IOException e) {
                e.printStackTrace();
                return false;
            }
        }
    };

    @Override // android.app.Service
    public android.os.IBinder onBind(android.content.Intent intent) {
        return this.mBinder;
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
