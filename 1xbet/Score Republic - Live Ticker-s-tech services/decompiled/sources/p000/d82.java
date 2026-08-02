package p000;

import java.io.FilterOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-738170b7fb69b873ed7524d5270c8e05c6f5fb40ea1ade7a72c8ed7a70699269 */
/* JADX INFO: loaded from: classes.dex */
public final class d82 extends s82 {

    /* JADX INFO: renamed from: k */
    public static final /* synthetic */ int f1587k = 0;

    /* JADX INFO: renamed from: j */
    public final ArrayList f1588j;

    public d82(OutputStream outputStream, ArrayList arrayList) {
        super(outputStream);
        this.f1588j = arrayList;
    }

    @Override // java.io.FilterOutputStream, java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        ArrayList arrayList = this.f1588j;
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            if (obj != null) {
                dd0.m1158c();
                return;
            }
            try {
                throw null;
            } catch (Throwable unused) {
            }
        }
        super.close();
    }

    @Override // p000.s82, java.io.FilterOutputStream, java.io.OutputStream
    public final void write(byte[] bArr) throws IOException {
        ((FilterOutputStream) this).out.write(bArr);
        Iterator it = this.f1588j.iterator();
        if (it.hasNext()) {
            if (it.next() != null) {
                dd0.m1158c();
            } else {
                int length = bArr.length;
                throw null;
            }
        }
    }

    @Override // java.io.FilterOutputStream, java.io.OutputStream
    public final void write(int i) throws IOException {
        ((FilterOutputStream) this).out.write(i);
        Iterator it = this.f1588j.iterator();
        if (it.hasNext()) {
            throw AbstractC0024an.m280c(it);
        }
    }

    @Override // p000.s82, java.io.FilterOutputStream, java.io.OutputStream
    public final void write(byte[] bArr, int i, int i2) throws IOException {
        ((FilterOutputStream) this).out.write(bArr, i, i2);
        Iterator it = this.f1588j.iterator();
        if (it.hasNext()) {
            throw AbstractC0024an.m280c(it);
        }
    }
}
