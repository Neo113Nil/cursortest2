package net.nfet.flutter.printing;

import android.content.Context;
import android.content.Intent;
import android.content.pm.ResolveInfo;
import android.content.res.Configuration;
import android.graphics.Bitmap;
import android.graphics.Matrix;
import android.graphics.pdf.PdfRenderer;
import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import android.os.ParcelFileDescriptor;
import android.print.PrintAttributes;
import android.print.PrintManager;
import android.webkit.WebView;
import androidx.annotation.NonNull;
import androidx.annotation.RequiresApi;
import androidx.core.content.FileProvider;
import androidx.media3.exoplayer.source.preload.RunnableC0435a;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.google.firebase.messaging.Constants;
import com.pichillilorenzo.flutter_inappwebview_android.chrome_custom_tabs.ActionBroadcastReceiver;
import io.flutter.plugin.common.MethodCall;
import io.flutter.plugin.common.MethodChannel;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.lang.Thread;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

/* loaded from: classes5.dex */
public final class b implements MethodChannel.MethodCallHandler {
    public final Context a;
    public final MethodChannel b;

    public b(@NonNull Context context, @NonNull MethodChannel methodChannel) {
        this.a = context;
        this.b = methodChannel;
    }

    @RequiresApi(api = 19)
    public final void a(h hVar, boolean z, String str) {
        HashMap hashMap = new HashMap();
        hashMap.put("completed", Boolean.valueOf(z));
        hashMap.put(Constants.IPC_BUNDLE_KEY_SEND_ERROR, str);
        hashMap.put("job", Integer.valueOf(hVar.g));
        this.b.invokeMethod("onCompleted", hashMap);
    }

    @RequiresApi(api = 19)
    public final void b(h hVar, String str) {
        HashMap hashMap = new HashMap();
        hashMap.put("job", Integer.valueOf(hVar.g));
        if (str != null) {
            hashMap.put(Constants.IPC_BUNDLE_KEY_SEND_ERROR, str);
        }
        this.b.invokeMethod("onPageRasterEnd", hashMap);
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // io.flutter.plugin.common.MethodChannel.MethodCallHandler
    public final void onMethodCall(@NonNull MethodCall methodCall, @NonNull MethodChannel.Result result) {
        String str = methodCall.method;
        str.getClass();
        char c = 65535;
        switch (str.hashCode()) {
            case -1166349563:
                if (str.equals("printPdf")) {
                    c = 0;
                    break;
                }
                break;
            case -1084323842:
                if (str.equals("convertHtml")) {
                    c = 1;
                    break;
                }
                break;
            case -743774061:
                if (str.equals("sharePdf")) {
                    c = 2;
                    break;
                }
                break;
            case -236026315:
                if (str.equals("rasterPdf")) {
                    c = 3;
                    break;
                }
                break;
            case 420548707:
                if (str.equals("printingInfo")) {
                    c = 4;
                    break;
                }
                break;
            case 476556003:
                if (str.equals("cancelJob")) {
                    c = 5;
                    break;
                }
                break;
        }
        PrintAttributes.MediaSize mediaSize = null;
        Context context = this.a;
        switch (c) {
            case 0:
                String str2 = (String) methodCall.argument("name");
                Double d = (Double) methodCall.argument("width");
                Double d2 = (Double) methodCall.argument("height");
                h hVar = new h(context, this, ((Integer) methodCall.argument("job")).intValue());
                hVar.e = str2;
                PrintAttributes.Builder builder = new PrintAttributes.Builder();
                int intValue = Double.valueOf((d.doubleValue() * 1000.0d) / 72.0d).intValue();
                int intValue2 = Double.valueOf((d2.doubleValue() * 1000.0d) / 72.0d).intValue();
                boolean z = intValue2 >= intValue;
                ArrayList arrayList = new ArrayList();
                arrayList.add(PrintAttributes.MediaSize.ISO_A0);
                arrayList.add(PrintAttributes.MediaSize.ISO_A1);
                arrayList.add(PrintAttributes.MediaSize.ISO_A2);
                arrayList.add(PrintAttributes.MediaSize.ISO_A3);
                arrayList.add(PrintAttributes.MediaSize.ISO_A4);
                arrayList.add(PrintAttributes.MediaSize.ISO_A5);
                arrayList.add(PrintAttributes.MediaSize.ISO_A6);
                arrayList.add(PrintAttributes.MediaSize.ISO_A7);
                arrayList.add(PrintAttributes.MediaSize.ISO_A8);
                arrayList.add(PrintAttributes.MediaSize.ISO_A9);
                arrayList.add(PrintAttributes.MediaSize.ISO_A10);
                arrayList.add(PrintAttributes.MediaSize.ISO_B0);
                arrayList.add(PrintAttributes.MediaSize.ISO_B1);
                arrayList.add(PrintAttributes.MediaSize.ISO_B2);
                arrayList.add(PrintAttributes.MediaSize.ISO_B3);
                arrayList.add(PrintAttributes.MediaSize.ISO_B4);
                arrayList.add(PrintAttributes.MediaSize.ISO_B5);
                arrayList.add(PrintAttributes.MediaSize.ISO_B6);
                arrayList.add(PrintAttributes.MediaSize.ISO_B7);
                arrayList.add(PrintAttributes.MediaSize.ISO_B8);
                arrayList.add(PrintAttributes.MediaSize.ISO_B9);
                arrayList.add(PrintAttributes.MediaSize.ISO_B10);
                arrayList.add(PrintAttributes.MediaSize.ISO_C0);
                arrayList.add(PrintAttributes.MediaSize.ISO_C1);
                arrayList.add(PrintAttributes.MediaSize.ISO_C2);
                arrayList.add(PrintAttributes.MediaSize.ISO_C3);
                arrayList.add(PrintAttributes.MediaSize.ISO_C4);
                arrayList.add(PrintAttributes.MediaSize.ISO_C5);
                arrayList.add(PrintAttributes.MediaSize.ISO_C6);
                arrayList.add(PrintAttributes.MediaSize.ISO_C7);
                arrayList.add(PrintAttributes.MediaSize.ISO_C8);
                arrayList.add(PrintAttributes.MediaSize.ISO_C9);
                arrayList.add(PrintAttributes.MediaSize.ISO_C10);
                arrayList.add(PrintAttributes.MediaSize.NA_LETTER);
                arrayList.add(PrintAttributes.MediaSize.NA_GOVT_LETTER);
                arrayList.add(PrintAttributes.MediaSize.NA_LEGAL);
                arrayList.add(PrintAttributes.MediaSize.NA_JUNIOR_LEGAL);
                arrayList.add(PrintAttributes.MediaSize.NA_LEDGER);
                arrayList.add(PrintAttributes.MediaSize.NA_TABLOID);
                arrayList.add(PrintAttributes.MediaSize.NA_INDEX_3X5);
                arrayList.add(PrintAttributes.MediaSize.NA_INDEX_4X6);
                arrayList.add(PrintAttributes.MediaSize.NA_INDEX_5X8);
                arrayList.add(PrintAttributes.MediaSize.NA_MONARCH);
                arrayList.add(PrintAttributes.MediaSize.NA_QUARTO);
                arrayList.add(PrintAttributes.MediaSize.NA_FOOLSCAP);
                arrayList.add(PrintAttributes.MediaSize.ROC_8K);
                arrayList.add(PrintAttributes.MediaSize.ROC_16K);
                arrayList.add(PrintAttributes.MediaSize.PRC_1);
                arrayList.add(PrintAttributes.MediaSize.PRC_2);
                arrayList.add(PrintAttributes.MediaSize.PRC_3);
                arrayList.add(PrintAttributes.MediaSize.PRC_4);
                arrayList.add(PrintAttributes.MediaSize.PRC_5);
                arrayList.add(PrintAttributes.MediaSize.PRC_6);
                arrayList.add(PrintAttributes.MediaSize.PRC_7);
                arrayList.add(PrintAttributes.MediaSize.PRC_8);
                arrayList.add(PrintAttributes.MediaSize.PRC_9);
                arrayList.add(PrintAttributes.MediaSize.PRC_10);
                arrayList.add(PrintAttributes.MediaSize.PRC_16K);
                arrayList.add(PrintAttributes.MediaSize.OM_PA_KAI);
                arrayList.add(PrintAttributes.MediaSize.OM_DAI_PA_KAI);
                arrayList.add(PrintAttributes.MediaSize.OM_JUURO_KU_KAI);
                arrayList.add(PrintAttributes.MediaSize.JIS_B10);
                arrayList.add(PrintAttributes.MediaSize.JIS_B9);
                arrayList.add(PrintAttributes.MediaSize.JIS_B8);
                arrayList.add(PrintAttributes.MediaSize.JIS_B7);
                arrayList.add(PrintAttributes.MediaSize.JIS_B6);
                arrayList.add(PrintAttributes.MediaSize.JIS_B5);
                arrayList.add(PrintAttributes.MediaSize.JIS_B4);
                arrayList.add(PrintAttributes.MediaSize.JIS_B3);
                arrayList.add(PrintAttributes.MediaSize.JIS_B2);
                arrayList.add(PrintAttributes.MediaSize.JIS_B1);
                arrayList.add(PrintAttributes.MediaSize.JIS_B0);
                arrayList.add(PrintAttributes.MediaSize.JIS_EXEC);
                arrayList.add(PrintAttributes.MediaSize.JPN_CHOU4);
                arrayList.add(PrintAttributes.MediaSize.JPN_CHOU3);
                arrayList.add(PrintAttributes.MediaSize.JPN_CHOU2);
                arrayList.add(PrintAttributes.MediaSize.JPN_HAGAKI);
                arrayList.add(PrintAttributes.MediaSize.JPN_OUFUKU);
                arrayList.add(PrintAttributes.MediaSize.JPN_KAHU);
                arrayList.add(PrintAttributes.MediaSize.JPN_KAKU2);
                arrayList.add(PrintAttributes.MediaSize.JPN_YOU4);
                Iterator it = arrayList.iterator();
                while (true) {
                    if (it.hasNext()) {
                        PrintAttributes.MediaSize mediaSize2 = (PrintAttributes.MediaSize) it.next();
                        PrintAttributes.MediaSize asPortrait = z ? mediaSize2.asPortrait() : mediaSize2.asLandscape();
                        if (intValue + 20 >= asPortrait.getWidthMils() && intValue - 20 <= asPortrait.getWidthMils() && intValue2 + 20 >= asPortrait.getHeightMils() && intValue2 - 20 <= asPortrait.getHeightMils()) {
                            mediaSize = asPortrait;
                        }
                    }
                }
                if (mediaSize == null) {
                    mediaSize = z ? PrintAttributes.MediaSize.UNKNOWN_PORTRAIT : PrintAttributes.MediaSize.UNKNOWN_LANDSCAPE;
                }
                builder.setMediaSize(mediaSize);
                hVar.c = h.h.print(str2, hVar, builder.build());
                result.success(1);
                return;
            case 1:
                Double d3 = (Double) methodCall.argument("width");
                Double d4 = (Double) methodCall.argument("height");
                Double d5 = (Double) methodCall.argument("marginLeft");
                Double d6 = (Double) methodCall.argument("marginTop");
                Double d7 = (Double) methodCall.argument("marginRight");
                Double d8 = (Double) methodCall.argument("marginBottom");
                h hVar2 = new h(context, this, ((Integer) methodCall.argument("job")).intValue());
                PrintAttributes.Margins margins = new PrintAttributes.Margins(Double.valueOf(d5.doubleValue() * 1000.0d).intValue(), Double.valueOf((d6.doubleValue() * 1000.0d) / 72.0d).intValue(), Double.valueOf((d7.doubleValue() * 1000.0d) / 72.0d).intValue(), Double.valueOf((d8.doubleValue() * 1000.0d) / 72.0d).intValue());
                PrintAttributes.MediaSize mediaSize3 = new PrintAttributes.MediaSize("flutter_printing", "Provided size", Double.valueOf((d3.doubleValue() * 1000.0d) / 72.0d).intValue(), Double.valueOf((d4.doubleValue() * 1000.0d) / 72.0d).intValue());
                String str3 = (String) methodCall.argument("html");
                String str4 = (String) methodCall.argument("baseUrl");
                Context context2 = hVar2.a;
                Configuration configuration = context2.getResources().getConfiguration();
                configuration.fontScale = 1.0f;
                WebView webView = new WebView(context2.createConfigurationContext(configuration));
                webView.loadDataWithBaseURL(str4, str3, "text/HTML", "UTF-8", null);
                webView.setWebViewClient(new g(hVar2, mediaSize3, margins, webView));
                result.success(1);
                return;
            case 2:
                byte[] bArr = (byte[]) methodCall.argument("doc");
                String str5 = (String) methodCall.argument("name");
                String str6 = (String) methodCall.argument("subject");
                String str7 = (String) methodCall.argument("body");
                ArrayList arrayList2 = (ArrayList) methodCall.argument("emails");
                PrintManager printManager = h.h;
                try {
                    File file = new File(context.getCacheDir(), FirebaseAnalytics.Event.SHARE);
                    if (!file.exists() && !file.mkdirs()) {
                        throw new IOException("Unable to create cache directory");
                    }
                    File file2 = new File(file, str5);
                    FileOutputStream fileOutputStream = new FileOutputStream(file2);
                    fileOutputStream.write(bArr);
                    fileOutputStream.close();
                    Uri uriForFile = FileProvider.getUriForFile(context, context.getApplicationContext().getPackageName() + ".flutter.printing", file2);
                    Intent intent = new Intent();
                    intent.setAction("android.intent.action.SEND");
                    intent.setType("application/pdf");
                    intent.putExtra("android.intent.extra.STREAM", uriForFile);
                    intent.addFlags(1);
                    intent.putExtra(ActionBroadcastReceiver.KEY_URL_TITLE, str6);
                    intent.putExtra("android.intent.extra.TEXT", str7);
                    intent.putExtra("android.intent.extra.EMAIL", arrayList2 != null ? (String[]) arrayList2.toArray(new String[0]) : null);
                    Intent createChooser = Intent.createChooser(intent, null);
                    Iterator<ResolveInfo> it2 = context.getPackageManager().queryIntentActivities(createChooser, 65536).iterator();
                    while (it2.hasNext()) {
                        context.grantUriPermission(it2.next().activityInfo.packageName, uriForFile, 3);
                    }
                    context.startActivity(createChooser);
                    file2.deleteOnExit();
                } catch (IOException e) {
                    e.printStackTrace();
                }
                result.success(1);
                return;
            case 3:
                final byte[] bArr2 = (byte[]) methodCall.argument("doc");
                final ArrayList arrayList3 = (ArrayList) methodCall.argument("pages");
                final Double d9 = (Double) methodCall.argument("scale");
                final h hVar3 = new h(context, this, ((Integer) methodCall.argument("job")).intValue());
                Thread thread = new Thread(new Runnable() { // from class: net.nfet.flutter.printing.c
                    @Override // java.lang.Runnable
                    public final void run() {
                        String message;
                        final h hVar4 = h.this;
                        byte[] bArr3 = bArr2;
                        Double d10 = d9;
                        try {
                            message = null;
                            File createTempFile = File.createTempFile("printing", null, hVar4.a.getCacheDir());
                            FileOutputStream fileOutputStream2 = new FileOutputStream(createTempFile);
                            fileOutputStream2.write(bArr3);
                            fileOutputStream2.close();
                            FileInputStream fileInputStream = new FileInputStream(createTempFile);
                            PdfRenderer pdfRenderer = new PdfRenderer(ParcelFileDescriptor.dup(fileInputStream.getFD()));
                            createTempFile.delete();
                            ArrayList arrayList4 = arrayList3;
                            int size = arrayList4 != null ? arrayList4.size() : pdfRenderer.getPageCount();
                            for (int i = 0; i < size; i++) {
                                PdfRenderer.Page openPage = pdfRenderer.openPage(arrayList4 == null ? i : ((Integer) arrayList4.get(i)).intValue());
                                final int intValue3 = Double.valueOf(openPage.getWidth() * d10.doubleValue()).intValue();
                                final int intValue4 = Double.valueOf(openPage.getHeight() * d10.doubleValue()).intValue();
                                Matrix matrix = new Matrix();
                                matrix.setScale(d10.floatValue(), d10.floatValue());
                                Bitmap createBitmap = Bitmap.createBitmap(intValue3, intValue4, Bitmap.Config.ARGB_8888);
                                openPage.render(createBitmap, null, matrix, 1);
                                openPage.close();
                                final ByteBuffer allocate = ByteBuffer.allocate(intValue3 * 4 * intValue4);
                                createBitmap.copyPixelsToBuffer(allocate);
                                createBitmap.recycle();
                                new Handler(Looper.getMainLooper()).post(new Runnable() { // from class: net.nfet.flutter.printing.e
                                    @Override // java.lang.Runnable
                                    public final void run() {
                                        h hVar5 = h.this;
                                        b bVar = hVar5.b;
                                        byte[] array = allocate.array();
                                        bVar.getClass();
                                        HashMap hashMap = new HashMap();
                                        hashMap.put("image", array);
                                        hashMap.put("width", Integer.valueOf(intValue3));
                                        hashMap.put("height", Integer.valueOf(intValue4));
                                        hashMap.put("job", Integer.valueOf(hVar5.g));
                                        bVar.b.invokeMethod("onPageRasterized", hashMap);
                                    }
                                });
                            }
                            pdfRenderer.close();
                            fileInputStream.close();
                        } catch (IOException e2) {
                            e2.printStackTrace();
                            message = e2.getMessage();
                        }
                        new Handler(Looper.getMainLooper()).post(new RunnableC0435a(2, hVar4, message));
                    }
                });
                thread.setUncaughtExceptionHandler(new Thread.UncaughtExceptionHandler() { // from class: net.nfet.flutter.printing.d
                    @Override // java.lang.Thread.UncaughtExceptionHandler
                    public final void uncaughtException(Thread thread2, Throwable th) {
                        new Handler(Looper.getMainLooper()).post(new androidx.lifecycle.e(3, h.this, th.getMessage()));
                    }
                });
                thread.start();
                result.success(1);
                return;
            case 4:
                PrintManager printManager2 = h.h;
                Boolean bool = Boolean.TRUE;
                HashMap hashMap = new HashMap();
                hashMap.put("directPrint", Boolean.FALSE);
                hashMap.put("dynamicLayout", bool);
                hashMap.put("canPrint", bool);
                hashMap.put("canShare", bool);
                hashMap.put("canRaster", bool);
                result.success(hashMap);
                return;
            case 5:
                new h(context, this, ((Integer) methodCall.argument("job")).intValue()).a(null);
                result.success(1);
                return;
            default:
                result.notImplemented();
                return;
        }
    }
}
