package com.mbridge.msdk.foundation.download.download;

import android.webkit.URLUtil;
import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.foundation.download.download.H5DownLoadManager;
import com.mbridge.msdk.foundation.same.net.MBridgeHostnameVerifier;
import com.mbridge.msdk.foundation.same.task.a;
import com.mbridge.msdk.foundation.tools.a1;
import com.mbridge.msdk.foundation.tools.q0;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.net.URL;
import javax.net.ssl.HttpsURLConnection;

/* loaded from: classes6.dex */
public class DownLoadUtils {
    private static final int DOWNLOAD_CONNECTION_TIME_OUT = 20000;
    private static final int DOWNLOAD_READ_TIME_OUT = 30000;
    public static final String END_TAG = "<mbridgeloadend></mbridgeloadend>";
    private static final String TAG = "DownLoadUtils";

    /* JADX WARN: Code restructure failed: missing block: B:11:0x001c, code lost:
    
        r3.onFailed("url is error");
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0021, code lost:
    
        return;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void getSourceCodeFromNetUrl(final String str, final H5DownLoadManager.IOnDownLoadH5Source iOnDownLoadH5Source, final boolean z) {
        try {
            if (!a1.a(str) && URLUtil.isNetworkUrl(str)) {
                DownloadTask.getInstance().runTask(new a() { // from class: com.mbridge.msdk.foundation.download.download.DownLoadUtils.1
                    @Override // com.mbridge.msdk.foundation.same.task.a
                    public void cancelTask() {
                    }

                    @Override // com.mbridge.msdk.foundation.same.task.a
                    public void pauseTask(boolean z2) {
                    }

                    /* JADX WARN: Multi-variable type inference failed */
                    /* JADX WARN: Removed duplicated region for block: B:103:0x017d A[Catch: Exception -> 0x0179, TRY_LEAVE, TryCatch #10 {Exception -> 0x0179, blocks: (B:110:0x0175, B:103:0x017d), top: B:109:0x0175 }] */
                    /* JADX WARN: Removed duplicated region for block: B:109:0x0175 A[EXC_TOP_SPLITTER, SYNTHETIC] */
                    /* JADX WARN: Removed duplicated region for block: B:36:0x011f A[Catch: all -> 0x011b, TryCatch #11 {all -> 0x011b, blocks: (B:69:0x010a, B:72:0x0110, B:74:0x0113, B:36:0x011f, B:38:0x0125, B:40:0x012b, B:42:0x0133, B:44:0x0137, B:64:0x013d, B:66:0x0141), top: B:68:0x010a }] */
                    /* JADX WARN: Removed duplicated region for block: B:66:0x0141 A[Catch: all -> 0x011b, TRY_LEAVE, TryCatch #11 {all -> 0x011b, blocks: (B:69:0x010a, B:72:0x0110, B:74:0x0113, B:36:0x011f, B:38:0x0125, B:40:0x012b, B:42:0x0133, B:44:0x0137, B:64:0x013d, B:66:0x0141), top: B:68:0x010a }] */
                    /* JADX WARN: Removed duplicated region for block: B:68:0x010a A[EXC_TOP_SPLITTER, SYNTHETIC] */
                    /* JADX WARN: Removed duplicated region for block: B:85:0x00fc A[Catch: Exception -> 0x00f8, TRY_LEAVE, TryCatch #5 {Exception -> 0x00f8, blocks: (B:92:0x00f4, B:85:0x00fc), top: B:91:0x00f4 }] */
                    /* JADX WARN: Removed duplicated region for block: B:91:0x00f4 A[EXC_TOP_SPLITTER, SYNTHETIC] */
                    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.String] */
                    /* JADX WARN: Type inference failed for: r1v10 */
                    /* JADX WARN: Type inference failed for: r1v2 */
                    /* JADX WARN: Type inference failed for: r1v23, types: [java.io.InputStream] */
                    /* JADX WARN: Type inference failed for: r1v26 */
                    /* JADX WARN: Type inference failed for: r1v27 */
                    /* JADX WARN: Type inference failed for: r1v28 */
                    /* JADX WARN: Type inference failed for: r1v3 */
                    /* JADX WARN: Type inference failed for: r1v4 */
                    /* JADX WARN: Type inference failed for: r1v5, types: [java.io.InputStream] */
                    @Override // com.mbridge.msdk.foundation.same.task.a
                    /*
                        Code decompiled incorrectly, please refer to instructions dump.
                    */
                    public void runTask() {
                        ByteArrayOutputStream byteArrayOutputStream;
                        InputStream inputStream;
                        byte[] bArr;
                        String str2;
                        Exception e;
                        InputStream inputStream2;
                        String message;
                        byte[] bArr2;
                        H5DownLoadManager.IOnDownLoadH5Source iOnDownLoadH5Source2;
                        InputStream inputStream3;
                        boolean z2;
                        ?? r1 = "responseCode is ";
                        Object obj = null;
                        boolean z3 = false;
                        try {
                            try {
                                H5DownLoadManager.IOnDownLoadH5Source iOnDownLoadH5Source3 = H5DownLoadManager.IOnDownLoadH5Source.this;
                                if (iOnDownLoadH5Source3 != null) {
                                    iOnDownLoadH5Source3.onStart();
                                }
                                HttpsURLConnection httpsURLConnection = (HttpsURLConnection) new URL(str).openConnection();
                                httpsURLConnection.setHostnameVerifier(new MBridgeHostnameVerifier(str));
                                httpsURLConnection.setReadTimeout(30000);
                                httpsURLConnection.setConnectTimeout(20000);
                                int responseCode = httpsURLConnection.getResponseCode();
                                q0.a(DownLoadUtils.TAG, "response code " + responseCode);
                                if (responseCode == 200) {
                                    r1 = httpsURLConnection.getInputStream();
                                    try {
                                        byte[] bArr3 = new byte[6144];
                                        byteArrayOutputStream = new ByteArrayOutputStream();
                                        while (true) {
                                            try {
                                                try {
                                                    int read = r1.read(bArr3);
                                                    if (read == -1) {
                                                        break;
                                                    } else {
                                                        byteArrayOutputStream.write(bArr3, 0, read);
                                                    }
                                                } catch (Throwable th) {
                                                    th = th;
                                                    if (r1 != 0) {
                                                        try {
                                                            r1.close();
                                                        } catch (Exception e2) {
                                                            e2.printStackTrace();
                                                            e2.getMessage();
                                                            throw th;
                                                        }
                                                    }
                                                    if (byteArrayOutputStream != null) {
                                                        byteArrayOutputStream.close();
                                                    }
                                                    throw th;
                                                }
                                            } catch (Exception e3) {
                                                e = e3;
                                                bArr = null;
                                            }
                                        }
                                        if (byteArrayOutputStream.toByteArray() != null) {
                                            bArr2 = byteArrayOutputStream.toByteArray();
                                            try {
                                                str2 = !z ? new String(bArr2) : null;
                                            } catch (Exception e4) {
                                                bArr = bArr2;
                                                e = e4;
                                                str2 = null;
                                                inputStream2 = r1;
                                                message = e.getMessage();
                                                q0.b(DownLoadUtils.TAG, "getStringFromUrl failed " + e.getLocalizedMessage());
                                                if (inputStream2 != null) {
                                                    try {
                                                        inputStream2.close();
                                                    } catch (Exception e5) {
                                                        e5.printStackTrace();
                                                        message = e5.getMessage();
                                                        bArr2 = bArr;
                                                        r1 = inputStream2;
                                                        if (z3) {
                                                        }
                                                        if (!z3) {
                                                        }
                                                        iOnDownLoadH5Source2 = H5DownLoadManager.IOnDownLoadH5Source.this;
                                                        if (iOnDownLoadH5Source2 != null) {
                                                        }
                                                    }
                                                }
                                                if (byteArrayOutputStream != null) {
                                                    byteArrayOutputStream.close();
                                                }
                                                bArr2 = bArr;
                                                r1 = inputStream2;
                                                if (z3) {
                                                }
                                                if (!z3) {
                                                }
                                                iOnDownLoadH5Source2 = H5DownLoadManager.IOnDownLoadH5Source.this;
                                                if (iOnDownLoadH5Source2 != null) {
                                                }
                                            }
                                        } else {
                                            bArr2 = null;
                                            str2 = null;
                                        }
                                        message = "";
                                        z2 = true;
                                        inputStream3 = r1;
                                    } catch (Exception e6) {
                                        bArr = null;
                                        byteArrayOutputStream = null;
                                        str2 = null;
                                        inputStream = r1;
                                        e = e6;
                                        InputStream inputStream4 = inputStream;
                                        e = e;
                                        inputStream2 = inputStream4;
                                        message = e.getMessage();
                                        q0.b(DownLoadUtils.TAG, "getStringFromUrl failed " + e.getLocalizedMessage());
                                        if (inputStream2 != null) {
                                        }
                                        if (byteArrayOutputStream != null) {
                                        }
                                        bArr2 = bArr;
                                        r1 = inputStream2;
                                        if (z3) {
                                        }
                                        if (!z3) {
                                        }
                                        iOnDownLoadH5Source2 = H5DownLoadManager.IOnDownLoadH5Source.this;
                                        if (iOnDownLoadH5Source2 != null) {
                                        }
                                    } catch (Throwable th2) {
                                        th = th2;
                                        byteArrayOutputStream = null;
                                        obj = r1;
                                        r1 = obj;
                                        if (r1 != 0) {
                                        }
                                        if (byteArrayOutputStream != null) {
                                        }
                                        throw th;
                                    }
                                } else {
                                    message = "responseCode is " + responseCode;
                                    inputStream3 = null;
                                    bArr2 = null;
                                    byteArrayOutputStream = null;
                                    str2 = null;
                                    z2 = false;
                                }
                                try {
                                    httpsURLConnection.disconnect();
                                    if (inputStream3 != null) {
                                        try {
                                            inputStream3.close();
                                        } catch (Exception e7) {
                                            e7.printStackTrace();
                                            message = e7.getMessage();
                                            r1 = inputStream3;
                                        }
                                    }
                                    if (byteArrayOutputStream != null) {
                                        byteArrayOutputStream.close();
                                    }
                                    z3 = z2;
                                    r1 = inputStream3;
                                } catch (Exception e8) {
                                    byte[] bArr4 = bArr2;
                                    inputStream = inputStream3;
                                    e = e8;
                                    bArr = bArr4;
                                    InputStream inputStream42 = inputStream;
                                    e = e;
                                    inputStream2 = inputStream42;
                                    message = e.getMessage();
                                    q0.b(DownLoadUtils.TAG, "getStringFromUrl failed " + e.getLocalizedMessage());
                                    if (inputStream2 != null) {
                                    }
                                    if (byteArrayOutputStream != null) {
                                    }
                                    bArr2 = bArr;
                                    r1 = inputStream2;
                                    if (z3) {
                                    }
                                    if (!z3) {
                                    }
                                    iOnDownLoadH5Source2 = H5DownLoadManager.IOnDownLoadH5Source.this;
                                    if (iOnDownLoadH5Source2 != null) {
                                    }
                                }
                            } catch (Throwable th3) {
                                th = th3;
                            }
                        } catch (Exception e9) {
                            e = e9;
                            inputStream = null;
                            bArr = null;
                            byteArrayOutputStream = null;
                            str2 = null;
                        } catch (Throwable th4) {
                            th = th4;
                            byteArrayOutputStream = null;
                            r1 = obj;
                            if (r1 != 0) {
                            }
                            if (byteArrayOutputStream != null) {
                            }
                            throw th;
                        }
                        if (z3) {
                            try {
                                if (z && bArr2 != null && bArr2.length > 0) {
                                    H5DownLoadManager.IOnDownLoadH5Source.this.onSuccess(null, bArr2, str);
                                }
                            } catch (Throwable th5) {
                                if (MBridgeConstans.DEBUG) {
                                    th5.printStackTrace();
                                }
                                H5DownLoadManager.IOnDownLoadH5Source iOnDownLoadH5Source4 = H5DownLoadManager.IOnDownLoadH5Source.this;
                                if (iOnDownLoadH5Source4 != null) {
                                    try {
                                        iOnDownLoadH5Source4.onFailed(th5.getMessage());
                                        return;
                                    } catch (Exception e10) {
                                        e10.printStackTrace();
                                        return;
                                    }
                                }
                                return;
                            }
                        }
                        if (!z3 && a1.b(str2) && str2.length() > 0 && str2.contains(DownLoadUtils.END_TAG)) {
                            H5DownLoadManager.IOnDownLoadH5Source iOnDownLoadH5Source5 = H5DownLoadManager.IOnDownLoadH5Source.this;
                            if (iOnDownLoadH5Source5 != null) {
                                iOnDownLoadH5Source5.onSuccess(str2, bArr2, str);
                            }
                        } else {
                            iOnDownLoadH5Source2 = H5DownLoadManager.IOnDownLoadH5Source.this;
                            if (iOnDownLoadH5Source2 != null) {
                                iOnDownLoadH5Source2.onFailed("content write failed:" + message);
                            }
                        }
                    }
                });
            }
        } catch (Throwable th) {
            if (MBridgeConstans.DEBUG) {
                th.printStackTrace();
            }
        }
    }
}
