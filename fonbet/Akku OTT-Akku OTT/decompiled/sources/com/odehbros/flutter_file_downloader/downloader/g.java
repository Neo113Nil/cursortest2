package com.odehbros.flutter_file_downloader.downloader;

import android.app.Activity;
import android.os.StrictMode;
import android.text.TextUtils;
import androidx.credentials.exceptions.publickeycredential.DomExceptionUtils;
import androidx.media3.common.P;
import com.csdcorp.speech_to_text.i;
import com.google.android.exoplayer2.source.rtsp.RtspHeaders;
import com.google.android.gms.wallet.WalletConstants;
import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintStream;
import java.net.HttpURLConnection;
import java.net.SocketException;
import java.net.URL;
import java.util.Map;
import java.util.Objects;

/* loaded from: classes4.dex */
public final class g extends e {
    public final URL i;
    public final HttpURLConnection j;
    public final com.odehbros.flutter_file_downloader.notificationService.a k;

    public class a extends Thread {
        public a() {
        }

        /* JADX WARN: Removed duplicated region for block: B:14:0x009f A[Catch: Exception -> 0x0116, TryCatch #1 {Exception -> 0x0116, blocks: (B:6:0x003b, B:9:0x0043, B:12:0x006e, B:14:0x009f, B:15:0x00be, B:18:0x00df, B:19:0x00f0, B:21:0x00f7, B:23:0x0118, B:27:0x00ce, B:30:0x00dd, B:31:0x00a4, B:36:0x006b, B:61:0x0037, B:33:0x0059, B:3:0x0011, B:42:0x0032), top: B:2:0x0011, inners: #0, #2 }] */
        /* JADX WARN: Removed duplicated region for block: B:17:0x00cd  */
        /* JADX WARN: Removed duplicated region for block: B:21:0x00f7 A[Catch: Exception -> 0x0116, LOOP:0: B:19:0x00f0->B:21:0x00f7, LOOP_END, TryCatch #1 {Exception -> 0x0116, blocks: (B:6:0x003b, B:9:0x0043, B:12:0x006e, B:14:0x009f, B:15:0x00be, B:18:0x00df, B:19:0x00f0, B:21:0x00f7, B:23:0x0118, B:27:0x00ce, B:30:0x00dd, B:31:0x00a4, B:36:0x006b, B:61:0x0037, B:33:0x0059, B:3:0x0011, B:42:0x0032), top: B:2:0x0011, inners: #0, #2 }] */
        /* JADX WARN: Removed duplicated region for block: B:22:0x0118 A[SYNTHETIC] */
        /* JADX WARN: Removed duplicated region for block: B:27:0x00ce A[Catch: Exception -> 0x0116, TryCatch #1 {Exception -> 0x0116, blocks: (B:6:0x003b, B:9:0x0043, B:12:0x006e, B:14:0x009f, B:15:0x00be, B:18:0x00df, B:19:0x00f0, B:21:0x00f7, B:23:0x0118, B:27:0x00ce, B:30:0x00dd, B:31:0x00a4, B:36:0x006b, B:61:0x0037, B:33:0x0059, B:3:0x0011, B:42:0x0032), top: B:2:0x0011, inners: #0, #2 }] */
        /* JADX WARN: Removed duplicated region for block: B:31:0x00a4 A[Catch: Exception -> 0x0116, TryCatch #1 {Exception -> 0x0116, blocks: (B:6:0x003b, B:9:0x0043, B:12:0x006e, B:14:0x009f, B:15:0x00be, B:18:0x00df, B:19:0x00f0, B:21:0x00f7, B:23:0x0118, B:27:0x00ce, B:30:0x00dd, B:31:0x00a4, B:36:0x006b, B:61:0x0037, B:33:0x0059, B:3:0x0011, B:42:0x0032), top: B:2:0x0011, inners: #0, #2 }] */
        /* JADX WARN: Removed duplicated region for block: B:32:0x0059 A[EXC_TOP_SPLITTER, SYNTHETIC] */
        /* JADX WARN: Removed duplicated region for block: B:37:0x0042  */
        /* JADX WARN: Removed duplicated region for block: B:8:0x0041  */
        @Override // java.lang.Thread, java.lang.Runnable
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final void run() {
            String str;
            String headerField;
            BufferedInputStream bufferedInputStream;
            String str2;
            String a;
            FileOutputStream fileOutputStream;
            int i;
            byte[] bArr;
            int contentLength;
            double d;
            int read;
            String headerField2;
            g gVar = g.this;
            com.odehbros.flutter_file_downloader.downloadDestination.b bVar = gVar.e;
            com.odehbros.flutter_file_downloader.notificationService.a aVar = gVar.k;
            Activity activity = gVar.a;
            final String e = gVar.e();
            int i2 = 0;
            String str3 = null;
            try {
                try {
                    headerField2 = gVar.j.getHeaderField("content-disposition");
                } catch (Exception e2) {
                    e2.printStackTrace();
                }
                if (!TextUtils.isEmpty(headerField2)) {
                    try {
                        str = headerField2.split(" ")[1].replaceFirst("filename=", "");
                    } catch (Exception e3) {
                        e3.printStackTrace();
                    }
                    if (TextUtils.isEmpty(str)) {
                        e = str;
                    }
                    headerField = gVar.j.getHeaderField(RtspHeaders.CONTENT_TYPE);
                    System.out.getClass();
                    if (!TextUtils.isEmpty(headerField)) {
                        try {
                            String[] split = headerField.split(DomExceptionUtils.SEPARATOR);
                            str3 = split[split.length - 1].toString().toLowerCase();
                        } catch (Exception e4) {
                            e4.printStackTrace();
                        }
                    }
                    bufferedInputStream = new BufferedInputStream(gVar.j.getInputStream());
                    new File(e + ".tmp");
                    String absolutePath = bVar.a().getAbsolutePath();
                    str2 = bVar.a;
                    if (TextUtils.isEmpty(str2)) {
                        a = com.odehbros.flutter_file_downloader.fileStore.a.a(absolutePath + DomExceptionUtils.SEPARATOR + com.odehbros.flutter_file_downloader.fileStore.b.a(str2), e, str3);
                    } else {
                        a = com.odehbros.flutter_file_downloader.fileStore.a.a(absolutePath, e, str3);
                    }
                    activity.runOnUiThread(new i(4, this, e));
                    if (TextUtils.isEmpty(a)) {
                        String[] split2 = a.split(DomExceptionUtils.SEPARATOR);
                        String str4 = split2[split2.length - 1];
                        if (!TextUtils.isEmpty(str4)) {
                            aVar.d = str4;
                        }
                    }
                    fileOutputStream = new FileOutputStream(a);
                    i = 1024;
                    bArr = new byte[1024];
                    contentLength = gVar.j.getContentLength();
                    d = 0.0d;
                    while (true) {
                        read = bufferedInputStream.read(bArr, i2, i);
                        if (read != -1) {
                            activity.runOnUiThread(new P(3, this, a));
                            aVar.b(true);
                            return;
                        }
                        fileOutputStream.write(bArr, i2, read);
                        d += read;
                        final double d2 = d / contentLength;
                        activity.runOnUiThread(new Runnable() { // from class: com.odehbros.flutter_file_downloader.downloader.f
                            @Override // java.lang.Runnable
                            public final void run() {
                                g.this.f.e(e, d2 * 100.0d);
                            }
                        });
                        aVar.c(d2 * 100.0d);
                        fileOutputStream = fileOutputStream;
                        i2 = 0;
                        i = 1024;
                    }
                }
                str = null;
                if (TextUtils.isEmpty(str)) {
                }
                headerField = gVar.j.getHeaderField(RtspHeaders.CONTENT_TYPE);
                System.out.getClass();
                if (!TextUtils.isEmpty(headerField)) {
                }
                bufferedInputStream = new BufferedInputStream(gVar.j.getInputStream());
                new File(e + ".tmp");
                String absolutePath2 = bVar.a().getAbsolutePath();
                str2 = bVar.a;
                if (TextUtils.isEmpty(str2)) {
                }
                activity.runOnUiThread(new i(4, this, e));
                if (TextUtils.isEmpty(a)) {
                }
                fileOutputStream = new FileOutputStream(a);
                i = 1024;
                bArr = new byte[1024];
                contentLength = gVar.j.getContentLength();
                d = 0.0d;
                while (true) {
                    read = bufferedInputStream.read(bArr, i2, i);
                    if (read != -1) {
                    }
                    fileOutputStream.write(bArr, i2, read);
                    d += read;
                    final double d22 = d / contentLength;
                    activity.runOnUiThread(new Runnable() { // from class: com.odehbros.flutter_file_downloader.downloader.f
                        @Override // java.lang.Runnable
                        public final void run() {
                            g.this.f.e(e, d22 * 100.0d);
                        }
                    });
                    aVar.c(d22 * 100.0d);
                    fileOutputStream = fileOutputStream;
                    i2 = 0;
                    i = 1024;
                }
            } catch (Exception e5) {
                String localizedMessage = e5.getLocalizedMessage();
                if (TextUtils.isEmpty(localizedMessage)) {
                    localizedMessage = e5.toString();
                }
                if ((e5 instanceof SocketException) && "Socket closed".equals(localizedMessage)) {
                    localizedMessage = "Download was canceled";
                } else if ((e5 instanceof FileNotFoundException) && gVar.b.equals(localizedMessage)) {
                    localizedMessage = String.valueOf(WalletConstants.ERROR_CODE_INVALID_PARAMETERS);
                }
                activity.runOnUiThread(new androidx.webkit.d(4, this, localizedMessage));
                aVar.b(false);
            }
        }
    }

    public g(Activity activity, String str, String str2, com.odehbros.flutter_file_downloader.core.b bVar, com.odehbros.flutter_file_downloader.downloadDestination.b bVar2, com.odehbros.flutter_file_downloader.d dVar, Map map, com.odehbros.flutter_file_downloader.f fVar) {
        super(activity, str, str2, bVar, bVar2, dVar, map, fVar);
        this.k = new com.odehbros.flutter_file_downloader.notificationService.a(activity, e(), new com.odehbros.flutter_file_downloader.notificationService.b());
        StrictMode.setThreadPolicy(new StrictMode.ThreadPolicy.Builder().permitAll().build());
        try {
            URL url = new URL(str);
            this.i = url;
            this.j = (HttpURLConnection) url.openConnection();
        } catch (Exception e) {
            e.printStackTrace();
        }
        PrintStream printStream = System.out;
        Objects.toString(this.i);
        printStream.getClass();
        PrintStream printStream2 = System.out;
        Objects.toString(this.j);
        printStream2.getClass();
    }

    @Override // com.odehbros.flutter_file_downloader.downloader.e
    public final void a() {
        for (Map.Entry<String, String> entry : this.g.entrySet()) {
            this.j.setRequestProperty(entry.getKey(), entry.getValue());
        }
    }

    @Override // com.odehbros.flutter_file_downloader.downloader.e
    public final boolean b(long j) {
        this.j.disconnect();
        return true;
    }

    @Override // com.odehbros.flutter_file_downloader.downloader.e
    public final void c() {
        new a().start();
    }

    @Override // com.odehbros.flutter_file_downloader.downloader.e
    public final void f() {
        this.d.ordinal();
    }
}
