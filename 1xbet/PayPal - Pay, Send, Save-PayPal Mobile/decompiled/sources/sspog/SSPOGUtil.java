package sspog;

/* loaded from: classes18.dex */
public class SSPOGUtil {
    public static boolean isRunningOnSubProcess(android.content.Context context) {
        int myPid = android.os.Process.myPid();
        java.io.InputStreamReader inputStreamReader = null;
        try {
            java.lang.StringBuilder sb = new java.lang.StringBuilder("/proc/");
            sb.append(myPid);
            sb.append("/cmdline");
            java.io.InputStreamReader inputStreamReader2 = new java.io.InputStreamReader(new java.io.FileInputStream(sb.toString()));
            try {
                java.lang.StringBuilder sb2 = new java.lang.StringBuilder();
                while (true) {
                    int read = inputStreamReader2.read();
                    if (read <= 0) {
                        break;
                    }
                    sb2.append((char) read);
                }
                boolean contains = sb2.toString().contains(":remoteProcess");
                try {
                    inputStreamReader2.close();
                } catch (java.lang.Exception unused) {
                }
                return contains;
            } catch (java.lang.Exception unused2) {
                inputStreamReader = inputStreamReader2;
                if (inputStreamReader == null) {
                    return false;
                }
                try {
                    inputStreamReader.close();
                    return false;
                } catch (java.lang.Exception unused3) {
                    return false;
                }
            } catch (java.lang.Throwable th) {
                th = th;
                inputStreamReader = inputStreamReader2;
                if (inputStreamReader != null) {
                    try {
                        inputStreamReader.close();
                    } catch (java.lang.Exception unused4) {
                    }
                }
                throw th;
            }
        } catch (java.lang.Exception unused5) {
        } catch (java.lang.Throwable th2) {
            th = th2;
        }
    }
}
