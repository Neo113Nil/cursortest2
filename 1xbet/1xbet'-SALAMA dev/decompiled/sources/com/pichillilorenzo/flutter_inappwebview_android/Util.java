package com.pichillilorenzo.flutter_inappwebview_android;

import A5.s;
import android.content.Context;
import android.graphics.BitmapFactory;
import android.graphics.Insets;
import android.graphics.Rect;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.net.http.SslCertificate;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import android.util.Log;
import android.view.WindowInsets;
import android.view.WindowManager;
import android.view.WindowMetrics;
import com.pichillilorenzo.flutter_inappwebview_android.types.Size2D;
import com.pichillilorenzo.flutter_inappwebview_android.types.SyncBaseCallbackResultImpl;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.net.HttpURLConnection;
import java.net.InetAddress;
import java.net.URL;
import java.net.UnknownHostException;
import java.security.Key;
import java.security.KeyStore;
import java.security.PrivateKey;
import java.security.cert.CertificateException;
import java.security.cert.CertificateFactory;
import java.security.cert.X509Certificate;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.regex.Pattern;
import javax.net.ssl.SSLHandshakeException;
import org.json.JSONArray;
import org.json.JSONObject;
import p033e3.h;
import p148u5.c;
import p155w1.L;

/* JADX INFO: loaded from: classes2.dex */
public class Util {
    public static final String ANDROID_ASSET_URL = "file:///android_asset/";
    static final String LOG_TAG = "Util";

    public static class PrivateKeyAndCertificates {
        public X509Certificate[] certificates;
        public PrivateKey privateKey;

        public PrivateKeyAndCertificates(PrivateKey privateKey, X509Certificate[] x509CertificateArr) {
            this.privateKey = privateKey;
            this.certificates = x509CertificateArr;
        }
    }

    private Util() {
    }

    public static String JSONStringify(Object obj) {
        if (obj == null) {
            return "null";
        }
        if (obj instanceof Map) {
            return new JSONObject((Map) obj).toString();
        }
        if (obj instanceof List) {
            return new JSONArray((Collection) obj).toString();
        }
        return obj instanceof String ? JSONObject.quote((String) obj) : JSONObject.wrap(obj).toString();
    }

    public static Drawable drawableFromBytes(Context context, byte[] bArr) {
        return new BitmapDrawable(context.getResources(), BitmapFactory.decodeByteArray(bArr, 0, bArr.length));
    }

    public static InputStream getFileAsset(InAppWebViewFlutterPlugin inAppWebViewFlutterPlugin, String str) {
        return inAppWebViewFlutterPlugin.applicationContext.getResources().getAssets().open(((c) ((h) inAppWebViewFlutterPlugin.flutterAssets).f12673a).a(str));
    }

    public static Size2D getFullscreenSize(Context context) {
        Size2D size2D = new Size2D(-1.0d, -1.0d);
        WindowManager windowManager = (WindowManager) context.getSystemService("window");
        if (windowManager != null) {
            if (Build.VERSION.SDK_INT >= 30) {
                WindowMetrics currentWindowMetrics = windowManager.getCurrentWindowMetrics();
                Insets insetsIgnoringVisibility = currentWindowMetrics.getWindowInsets().getInsetsIgnoringVisibility(WindowInsets.Type.navigationBars() | WindowInsets.Type.displayCutout());
                int i7 = insetsIgnoringVisibility.left + insetsIgnoringVisibility.right;
                int i8 = insetsIgnoringVisibility.bottom + insetsIgnoringVisibility.top;
                Rect bounds = currentWindowMetrics.getBounds();
                size2D.setWidth(bounds.width() - i7);
                size2D.setHeight(bounds.height() - i8);
            } else {
                DisplayMetrics displayMetrics = new DisplayMetrics();
                windowManager.getDefaultDisplay().getMetrics(displayMetrics);
                size2D.setWidth(displayMetrics.widthPixels);
                size2D.setHeight(displayMetrics.heightPixels);
            }
        }
        return size2D;
    }

    public static <T> T getOrDefault(Map<String, Object> map, String str, T t7) {
        return map.containsKey(str) ? (T) map.get(str) : t7;
    }

    public static float getPixelDensity(Context context) {
        return context.getResources().getDisplayMetrics().density;
    }

    public static String getUrlAsset(InAppWebViewFlutterPlugin inAppWebViewFlutterPlugin, String str) throws IOException {
        String strA = ((c) ((h) inAppWebViewFlutterPlugin.flutterAssets).f12673a).a(str);
        try {
            InputStream fileAsset = getFileAsset(inAppWebViewFlutterPlugin, str);
            if (fileAsset != null) {
                fileAsset.close();
            }
            e = null;
        } catch (IOException e7) {
            e = e7;
        }
        if (e == null) {
            return L.i(ANDROID_ASSET_URL, strA);
        }
        throw e;
    }

    public static X509Certificate getX509CertFromSslCertHack(SslCertificate sslCertificate) {
        byte[] byteArray = SslCertificate.saveState(sslCertificate).getByteArray("x509-certificate");
        if (byteArray != null) {
            try {
                return (X509Certificate) CertificateFactory.getInstance("X.509").generateCertificate(new ByteArrayInputStream(byteArray));
            } catch (CertificateException unused) {
            }
        }
        return null;
    }

    public static <T> T invokeMethodAndWaitResult(final s sVar, final String str, final Object obj, final SyncBaseCallbackResultImpl<T> syncBaseCallbackResultImpl) throws InterruptedException {
        new Handler(Looper.getMainLooper()).post(new Runnable() { // from class: com.pichillilorenzo.flutter_inappwebview_android.Util.1
            @Override // java.lang.Runnable
            public void run() {
                sVar.a(str, obj, syncBaseCallbackResultImpl);
            }
        });
        syncBaseCallbackResultImpl.latch.await();
        return syncBaseCallbackResultImpl.result;
    }

    public static <O> Object invokeMethodIfExists(O o7, String str, Object... objArr) {
        for (Method method : o7.getClass().getMethods()) {
            if (method.getName().equals(str)) {
                try {
                    return method.invoke(o7, objArr);
                } catch (IllegalAccessException | InvocationTargetException unused) {
                    return null;
                }
            }
        }
        return null;
    }

    public static boolean isClass(String str) {
        try {
            Class.forName(str);
            return true;
        } catch (ClassNotFoundException unused) {
            return false;
        }
    }

    public static boolean isIPv6(String str) {
        try {
            InetAddress.getByName(str);
            return true;
        } catch (UnknownHostException unused) {
            return false;
        }
    }

    public static PrivateKeyAndCertificates loadPrivateKeyAndCertificate(InAppWebViewFlutterPlugin inAppWebViewFlutterPlugin, String str, String str2, String str3) {
        InputStream fileInputStream;
        PrivateKeyAndCertificates privateKeyAndCertificates = null;
        try {
            fileInputStream = getFileAsset(inAppWebViewFlutterPlugin, str);
        } catch (IOException unused) {
            fileInputStream = null;
        }
        try {
            try {
                if (fileInputStream == null) {
                    try {
                        fileInputStream = new FileInputStream(str);
                    } catch (Exception e7) {
                        Log.e(LOG_TAG, "", e7);
                        if (fileInputStream != null) {
                            fileInputStream.close();
                        }
                        return privateKeyAndCertificates;
                    }
                }
                KeyStore keyStore = KeyStore.getInstance(str3);
                keyStore.load(fileInputStream, (str2 != null ? str2 : "").toCharArray());
                String strNextElement = keyStore.aliases().nextElement();
                if (str2 == null) {
                    str2 = "";
                }
                Key key = keyStore.getKey(strNextElement, str2.toCharArray());
                privateKeyAndCertificates = key instanceof PrivateKey ? new PrivateKeyAndCertificates((PrivateKey) key, new X509Certificate[]{(X509Certificate) keyStore.getCertificate(strNextElement)}) : null;
                fileInputStream.close();
                fileInputStream.close();
            } catch (Throwable th) {
                if (fileInputStream != null) {
                    try {
                        fileInputStream.close();
                    } catch (IOException e8) {
                        Log.e(LOG_TAG, "", e8);
                    }
                }
                throw th;
            }
        } catch (IOException e9) {
            Log.e(LOG_TAG, "", e9);
        }
        return privateKeyAndCertificates;
    }

    public static void log(String str, String str2) {
        int iMin;
        int length = str2.length();
        int i7 = 0;
        while (i7 < length) {
            int iIndexOf = str2.indexOf(10, i7);
            if (iIndexOf == -1) {
                iIndexOf = length;
            }
            while (true) {
                iMin = Math.min(iIndexOf, i7 + 4000);
                Log.d(str, str2.substring(i7, iMin));
                if (iMin >= iIndexOf) {
                    break;
                } else {
                    i7 = iMin;
                }
            }
            i7 = iMin + 1;
        }
    }

    public static HttpURLConnection makeHttpRequest(String str, String str2, Map<String, String> map) {
        HttpURLConnection httpURLConnection;
        try {
            httpURLConnection = (HttpURLConnection) new URL(str).openConnection();
            try {
                httpURLConnection.setRequestMethod(str2);
                if (map != null) {
                    for (Map.Entry<String, String> entry : map.entrySet()) {
                        httpURLConnection.setRequestProperty(entry.getKey(), entry.getValue());
                    }
                }
                httpURLConnection.setConnectTimeout(15000);
                httpURLConnection.setReadTimeout(15000);
                httpURLConnection.setDoInput(true);
                httpURLConnection.setInstanceFollowRedirects(true);
                if ("GET".equalsIgnoreCase(str2)) {
                    httpURLConnection.setDoOutput(false);
                }
                httpURLConnection.connect();
                return httpURLConnection;
            } catch (Exception e7) {
                e = e7;
                if (!(e instanceof SSLHandshakeException)) {
                    Log.e(LOG_TAG, "", e);
                }
                if (httpURLConnection != null) {
                    httpURLConnection.disconnect();
                }
                return null;
            }
        } catch (Exception e8) {
            e = e8;
            httpURLConnection = null;
        }
    }

    public static String normalizeIPv6(String str) throws Exception {
        if (isIPv6(str)) {
            return InetAddress.getByName(str).getCanonicalHostName();
        }
        throw new Exception(L.i("Invalid address: ", str));
    }

    public static boolean objEquals(Object obj, Object obj2) {
        return Objects.equals(obj, obj2);
    }

    public static byte[] readAllBytes(InputStream inputStream) {
        byte[] byteArray = null;
        if (inputStream == null) {
            return null;
        }
        byte[] bArr = new byte[4096];
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        while (true) {
            try {
                int i7 = inputStream.read(bArr, 0, 4096);
                if (i7 == -1) {
                    break;
                }
                byteArrayOutputStream.write(bArr, 0, i7);
            } catch (IOException e7) {
                try {
                    inputStream.close();
                } catch (IOException e8) {
                    e7.addSuppressed(e8);
                }
                try {
                    byteArrayOutputStream.close();
                } catch (IOException e9) {
                    e7.addSuppressed(e9);
                }
            } catch (Throwable th) {
                try {
                    inputStream.close();
                } catch (IOException unused) {
                }
                try {
                    byteArrayOutputStream.close();
                    throw th;
                } catch (IOException unused2) {
                    throw th;
                }
            }
        }
        byteArray = byteArrayOutputStream.toByteArray();
        try {
            inputStream.close();
        } catch (IOException unused3) {
        }
        try {
            byteArrayOutputStream.close();
        } catch (IOException unused4) {
        }
        return byteArray;
    }

    public static String replaceAll(String str, String str2, String str3) {
        return TextUtils.join(str3, str.split(Pattern.quote(str2)));
    }
}
