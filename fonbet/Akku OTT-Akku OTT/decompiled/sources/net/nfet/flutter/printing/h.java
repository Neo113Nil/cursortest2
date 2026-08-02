package net.nfet.flutter.printing;

import android.content.Context;
import android.os.Bundle;
import android.os.CancellationSignal;
import android.os.ParcelFileDescriptor;
import android.print.PageRange;
import android.print.PrintAttributes;
import android.print.PrintDocumentAdapter;
import android.print.PrintJob;
import android.print.PrintManager;
import androidx.annotation.RequiresApi;
import com.facebook.O;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.HashMap;

@RequiresApi(api = 19)
/* loaded from: classes5.dex */
public final class h extends PrintDocumentAdapter {
    public static PrintManager h;
    public final Context a;
    public final b b;
    public PrintJob c;
    public byte[] d;
    public String e;
    public PrintDocumentAdapter.LayoutResultCallback f;
    public final int g;

    public h(Context context, b bVar, int i) {
        this.a = context;
        this.b = bVar;
        this.g = i;
        h = (PrintManager) context.getSystemService("print");
    }

    public final void a(String str) {
        PrintDocumentAdapter.LayoutResultCallback layoutResultCallback = this.f;
        if (layoutResultCallback != null) {
            layoutResultCallback.onLayoutCancelled();
        }
        PrintJob printJob = this.c;
        if (printJob != null) {
            printJob.cancel();
        }
        this.b.a(this, false, str);
    }

    @Override // android.print.PrintDocumentAdapter
    public final void onFinish() {
        new Thread(new O(this, 3)).start();
    }

    @Override // android.print.PrintDocumentAdapter
    public final void onLayout(PrintAttributes printAttributes, PrintAttributes printAttributes2, CancellationSignal cancellationSignal, PrintDocumentAdapter.LayoutResultCallback layoutResultCallback, Bundle bundle) {
        if (cancellationSignal.isCanceled()) {
            layoutResultCallback.onLayoutCancelled();
            return;
        }
        this.f = layoutResultCallback;
        PrintAttributes.MediaSize mediaSize = printAttributes2.getMediaSize();
        PrintAttributes.Margins minMargins = printAttributes2.getMinMargins();
        Double valueOf = Double.valueOf((mediaSize.getWidthMils() * 72.0d) / 1000.0d);
        double heightMils = (mediaSize.getHeightMils() * 72.0d) / 1000.0d;
        b bVar = this.b;
        bVar.getClass();
        HashMap hashMap = new HashMap();
        hashMap.put("width", valueOf);
        hashMap.put("height", Double.valueOf(heightMils));
        hashMap.put("marginLeft", Double.valueOf((minMargins.getLeftMils() * 72.0d) / 1000.0d));
        hashMap.put("marginTop", Double.valueOf((minMargins.getTopMils() * 72.0d) / 1000.0d));
        hashMap.put("marginRight", Double.valueOf((minMargins.getRightMils() * 72.0d) / 1000.0d));
        hashMap.put("marginBottom", Double.valueOf((minMargins.getBottomMils() * 72.0d) / 1000.0d));
        hashMap.put("job", Integer.valueOf(this.g));
        bVar.b.invokeMethod("onLayout", hashMap, new a(this));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0039 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r4v0, types: [android.os.CancellationSignal] */
    /* JADX WARN: Type inference failed for: r4v1, types: [java.io.OutputStream] */
    /* JADX WARN: Type inference failed for: r4v10 */
    /* JADX WARN: Type inference failed for: r4v2 */
    /* JADX WARN: Type inference failed for: r4v3 */
    /* JADX WARN: Type inference failed for: r4v4 */
    /* JADX WARN: Type inference failed for: r4v8 */
    /* JADX WARN: Type inference failed for: r4v9 */
    @Override // android.print.PrintDocumentAdapter
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void onWrite(PageRange[] pageRangeArr, ParcelFileDescriptor parcelFileDescriptor, CancellationSignal cancellationSignal, PrintDocumentAdapter.WriteResultCallback writeResultCallback) {
        Throwable th;
        FileOutputStream fileOutputStream;
        IOException e;
        try {
            try {
                try {
                    fileOutputStream = new FileOutputStream(parcelFileDescriptor.getFileDescriptor());
                    try {
                        byte[] bArr = this.d;
                        fileOutputStream.write(bArr, 0, bArr.length);
                        writeResultCallback.onWriteFinished(new PageRange[]{PageRange.ALL_PAGES});
                        fileOutputStream.close();
                    } catch (IOException e2) {
                        e = e2;
                        e.printStackTrace();
                        cancellationSignal = fileOutputStream;
                        if (fileOutputStream != null) {
                            fileOutputStream.close();
                            cancellationSignal = fileOutputStream;
                        }
                    }
                } catch (Throwable th2) {
                    th = th2;
                    if (cancellationSignal != 0) {
                        try {
                            cancellationSignal.close();
                        } catch (IOException e3) {
                            e3.printStackTrace();
                        }
                    }
                    throw th;
                }
            } catch (IOException e4) {
                fileOutputStream = null;
                e = e4;
            } catch (Throwable th3) {
                cancellationSignal = 0;
                th = th3;
                if (cancellationSignal != 0) {
                }
                throw th;
            }
        } catch (IOException e5) {
            e5.printStackTrace();
            cancellationSignal = cancellationSignal;
        }
    }
}
