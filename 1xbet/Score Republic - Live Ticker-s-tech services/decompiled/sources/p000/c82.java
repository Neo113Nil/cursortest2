package p000;

import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-738170b7fb69b873ed7524d5270c8e05c6f5fb40ea1ade7a72c8ed7a70699269 */
/* JADX INFO: loaded from: classes.dex */
public final class c82 extends r82 {

    /* JADX INFO: renamed from: k */
    public static final /* synthetic */ int f1163k = 0;

    /* JADX INFO: renamed from: j */
    public final ArrayList f1164j;

    public c82(InputStream inputStream, ArrayList arrayList) {
        super(inputStream);
        this.f1164j = arrayList;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        ArrayList arrayList = this.f1164j;
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

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int read() throws IOException {
        int i = ((FilterInputStream) this).in.read();
        if (i != -1) {
            Iterator it = this.f1164j.iterator();
            if (it.hasNext()) {
                throw AbstractC0024an.m280c(it);
            }
        }
        return i;
    }

    @Override // p000.r82, java.io.FilterInputStream, java.io.InputStream
    public final int read(byte[] bArr) throws IOException {
        int i = ((FilterInputStream) this).in.read(bArr);
        if (i != -1) {
            Iterator it = this.f1164j.iterator();
            if (it.hasNext()) {
                throw AbstractC0024an.m280c(it);
            }
        }
        return i;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int read(byte[] bArr, int i, int i2) throws IOException {
        int i3 = ((FilterInputStream) this).in.read(bArr, i, i2);
        if (i3 != -1) {
            Iterator it = this.f1164j.iterator();
            if (it.hasNext()) {
                throw AbstractC0024an.m280c(it);
            }
        }
        return i3;
    }
}
