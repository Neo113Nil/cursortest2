package com.bykv.vk.openvk.pcc.pcc.sf.pcc;

import android.content.Context;
import android.media.MediaDataSource;
import android.text.TextUtils;
import com.bykv.vk.openvk.pcc.pcc.sf.pcc.pcc.gm;
import com.bykv.vk.openvk.pcc.pcc.sf.pcc.pcc.sf;
import java.io.IOException;
import java.util.concurrent.ConcurrentHashMap;

/* loaded from: classes5.dex */
public class pcc extends MediaDataSource {
    public static final ConcurrentHashMap<String, pcc> pcc = new ConcurrentHashMap<>();
    private long gm = -2147483648L;
    private final Context oo;
    private final gm sf;
    private final com.bykv.vk.openvk.pcc.pcc.pcc.gm.gm vj;

    public pcc(Context context, com.bykv.vk.openvk.pcc.pcc.pcc.gm.gm gmVar) {
        this.oo = context;
        this.vj = gmVar;
        this.sf = new sf(gmVar);
    }

    @Override // android.media.MediaDataSource
    public int readAt(long j, byte[] bArr, int i, int i2) throws IOException {
        int pcc2 = this.sf.pcc(j, bArr, i, i2);
        new Object[]{"readAt: position = ", Long.valueOf(j), "  buffer.length =", Integer.valueOf(bArr.length), "  offset = ", Integer.valueOf(i), " size =", Integer.valueOf(pcc2)};
        return pcc2;
    }

    @Override // android.media.MediaDataSource
    public long getSize() throws IOException {
        if (this.gm == -2147483648L) {
            if (this.oo == null || TextUtils.isEmpty(this.vj.dax())) {
                return -1L;
            }
            this.gm = this.sf.gm();
        }
        return this.gm;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        new Object[]{"close: ", this.vj.dax()};
        gm gmVar = this.sf;
        if (gmVar != null) {
            gmVar.sf();
        }
        pcc.remove(this.vj.nac());
    }

    public com.bykv.vk.openvk.pcc.pcc.pcc.gm.gm pcc() {
        return this.vj;
    }

    public static pcc pcc(Context context, com.bykv.vk.openvk.pcc.pcc.pcc.gm.gm gmVar) {
        pcc pccVar = new pcc(context, gmVar);
        pcc.put(gmVar.nac(), pccVar);
        return pccVar;
    }
}
