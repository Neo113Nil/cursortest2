package android.print;

import android.content.Context;
import android.os.CancellationSignal;
import android.os.ParcelFileDescriptor;
import android.print.PrintDocumentAdapter;
import com.google.android.exoplayer2.C;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.HashMap;
import net.nfet.flutter.printing.b;
import net.nfet.flutter.printing.g;
import net.nfet.flutter.printing.h;

/* loaded from: classes.dex */
public final class a extends PrintDocumentAdapter.LayoutResultCallback {
    public final /* synthetic */ Context a;
    public final /* synthetic */ g.a b;
    public final /* synthetic */ PrintDocumentAdapter c;

    /* renamed from: android.print.a$a, reason: collision with other inner class name */
    public class C0001a extends PrintDocumentAdapter.WriteResultCallback {
        public final /* synthetic */ File a;

        public C0001a(File file) {
            this.a = file;
        }

        @Override // android.print.PrintDocumentAdapter.WriteResultCallback
        public final void onWriteFinished(PageRange[] pageRangeArr) {
            byte[] bArr;
            FileInputStream fileInputStream;
            g.a aVar = a.this.b;
            super.onWriteFinished(pageRangeArr);
            int length = pageRangeArr.length;
            File file = this.a;
            if (length == 0) {
                file.delete();
                aVar.a("No page created");
            }
            try {
                bArr = new byte[(int) file.length()];
                fileInputStream = new FileInputStream(file);
                try {
                } finally {
                }
            } catch (IOException e) {
                aVar.a(e.getMessage());
            }
            if (fileInputStream.read(bArr) == -1) {
                throw new IOException("EOF reached while trying to read the whole file");
            }
            fileInputStream.close();
            h hVar = g.this.d;
            b bVar = hVar.b;
            bVar.getClass();
            HashMap hashMap = new HashMap();
            hashMap.put("doc", bArr);
            hashMap.put("job", Integer.valueOf(hVar.g));
            bVar.b.invokeMethod("onHtmlRendered", hashMap);
            file.delete();
        }
    }

    public a(Context context, g.a aVar, PrintDocumentAdapter printDocumentAdapter) {
        this.a = context;
        this.b = aVar;
        this.c = printDocumentAdapter;
    }

    @Override // android.print.PrintDocumentAdapter.LayoutResultCallback
    public final void onLayoutFinished(PrintDocumentInfo printDocumentInfo, boolean z) {
        g.a aVar = this.b;
        try {
            File createTempFile = File.createTempFile("printing", "pdf", this.a.getCacheDir());
            try {
                this.c.onWrite(new PageRange[]{PageRange.ALL_PAGES}, ParcelFileDescriptor.open(createTempFile, C.ENCODING_PCM_32BIT), new CancellationSignal(), new C0001a(createTempFile));
            } catch (FileNotFoundException e) {
                createTempFile.delete();
                aVar.a(e.getMessage());
            }
        } catch (IOException e2) {
            aVar.a(e2.getMessage());
        }
    }
}
