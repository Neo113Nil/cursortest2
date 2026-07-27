package com.bykv.vk.openvk.pcc.pcc.sf.pcc.sf;

import android.content.Context;
import com.bykv.vk.openvk.pcc.pcc.pcc.vj.pcc;
import com.bytedance.sdk.component.sf.pcc.gbb;
import com.bytedance.sdk.component.sf.pcc.jr;
import com.bytedance.sdk.component.sf.pcc.tmg;
import com.bytedance.sdk.component.sf.pcc.vh;
import java.io.Closeable;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.RandomAccessFile;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

/* loaded from: classes5.dex */
public class sf {
    private File oo;
    private Context pcc;
    private com.bykv.vk.openvk.pcc.pcc.pcc.gm.gm sf;
    private File vj;
    private volatile boolean gm = false;
    private final List<pcc.InterfaceC0095pcc> wh = new ArrayList();
    private volatile boolean qf = false;

    public sf(Context context, com.bykv.vk.openvk.pcc.pcc.pcc.gm.gm gmVar) {
        this.oo = null;
        this.vj = null;
        this.pcc = context;
        this.sf = gmVar;
        this.oo = com.bykv.vk.openvk.pcc.pcc.sf.oo.sf.sf(gmVar.vj(), gmVar.nac());
        this.vj = com.bykv.vk.openvk.pcc.pcc.sf.oo.sf.gm(gmVar.vj(), gmVar.nac());
    }

    public void pcc(pcc.InterfaceC0095pcc interfaceC0095pcc) {
        if (this.qf) {
            synchronized (pcc.InterfaceC0095pcc.class) {
                this.wh.add(interfaceC0095pcc);
            }
            return;
        }
        this.wh.add(interfaceC0095pcc);
        if (sf()) {
            this.sf.kj(1);
            pcc(this.sf, 200);
            gm.pcc(this.sf);
        } else {
            this.qf = true;
            this.sf.kj(0);
            gm();
        }
    }

    private boolean sf() {
        if (this.vj.exists()) {
            return true;
        }
        if (!this.sf.hc()) {
            if (this.oo.length() >= this.sf.wh()) {
                return true;
            }
            if (this.sf.oo() > 0 && this.oo.length() >= this.sf.oo()) {
                return true;
            }
        }
        return false;
    }

    private void gm() {
        vh.pcc pccVar;
        if (com.bykv.vk.openvk.pcc.pcc.pcc.gm.gm() != null) {
            pccVar = com.bykv.vk.openvk.pcc.pcc.pcc.gm.gm().gm();
        } else {
            pccVar = new vh.pcc("v_preload");
        }
        pccVar.pcc(this.sf.gpj(), TimeUnit.MILLISECONDS).sf(this.sf.lo(), TimeUnit.MILLISECONDS).gm(this.sf.fum(), TimeUnit.MILLISECONDS);
        vh pcc = pccVar.pcc();
        tmg.pcc pccVar2 = new tmg.pcc();
        final long length = this.oo.length();
        int wh = this.sf.wh();
        boolean hc = this.sf.hc();
        int oo = this.sf.oo();
        if (oo > 0) {
            if (oo >= this.sf.tmg()) {
                hc = true;
            } else {
                wh = oo;
            }
        }
        pccVar2.pcc("videoPreload").pcc(6);
        if (hc) {
            pccVar2.pcc("RANGE", "bytes=" + length + "-").sf(this.sf.dax()).pcc().sf();
        } else {
            pccVar2.pcc("RANGE", "bytes=" + length + "-" + wh).sf(this.sf.dax()).pcc().sf();
        }
        pcc.pcc(pccVar2.sf()).pcc(new com.bytedance.sdk.component.sf.pcc.gm() { // from class: com.bykv.vk.openvk.pcc.pcc.sf.pcc.sf.sf.1
            @Override // com.bytedance.sdk.component.sf.pcc.gm
            public void pcc(com.bytedance.sdk.component.sf.pcc.sf sfVar, IOException iOException) {
                sf sfVar2 = sf.this;
                sfVar2.pcc(sfVar2.sf, 601, iOException.getMessage());
                gm.pcc(sf.this.sf);
            }

            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Removed duplicated region for block: B:31:0x017b A[Catch: all -> 0x0192, TryCatch #0 {all -> 0x0192, blocks: (B:29:0x016e, B:31:0x017b, B:32:0x017f), top: B:28:0x016e }] */
            /* JADX WARN: Type inference failed for: r15v4 */
            @Override // com.bytedance.sdk.component.sf.pcc.gm
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public void pcc(com.bytedance.sdk.component.sf.pcc.sf sfVar, gbb gbbVar) throws IOException {
                int i;
                InputStream inputStream;
                Closeable closeable;
                jr jrVar;
                Closeable closeable2;
                long j;
                RandomAccessFile randomAccessFile;
                long j2 = length;
                jr jrVar2 = null;
                try {
                } catch (Throwable th) {
                    th = th;
                    i = 601;
                }
                if (gbbVar != null) {
                    boolean oo2 = gbbVar.oo();
                    try {
                        if (!oo2) {
                            try {
                                sf sfVar2 = sf.this;
                                sfVar2.pcc(sfVar2.sf, gbbVar.gm(), gbbVar.vj());
                                sf.this.pcc((Closeable) null);
                                sf.this.pcc((Closeable) null);
                            } catch (Throwable th2) {
                                th = th2;
                                inputStream = null;
                                closeable2 = null;
                            }
                            sf.this.pcc(jrVar2);
                            sf.this.pcc(gbbVar);
                            new Object[]{"Pre finally ", sf.this.sf.dax(), " Preload size=", Integer.valueOf(sf.this.sf.wh())};
                            gm.pcc(sf.this.sf);
                        }
                        jr wh2 = gbbVar.wh();
                        try {
                            jrVar = gbbVar.wh();
                            if (!oo2 || jrVar == null) {
                                inputStream = null;
                                j = 0;
                            } else {
                                try {
                                    j = length + jrVar.pcc();
                                    inputStream = jrVar.gm();
                                } catch (Throwable th3) {
                                    th = th3;
                                    inputStream = null;
                                    randomAccessFile = 0;
                                    jrVar2 = jrVar;
                                    closeable2 = randomAccessFile;
                                    i = 601;
                                    closeable = closeable2;
                                    sf.this.oo();
                                    sf sfVar3 = sf.this;
                                    com.bykv.vk.openvk.pcc.pcc.pcc.gm.gm gmVar = sfVar3.sf;
                                    if (gbbVar != null) {
                                    }
                                    sfVar3.pcc(gmVar, i, th.getMessage());
                                    sf.this.pcc(closeable);
                                    sf.this.pcc(inputStream);
                                    sf.this.pcc(jrVar2);
                                    sf.this.pcc(gbbVar);
                                    new Object[]{"Pre finally ", sf.this.sf.dax(), " Preload size=", Integer.valueOf(sf.this.sf.wh())};
                                    gm.pcc(sf.this.sf);
                                }
                            }
                        } catch (Throwable th4) {
                            th = th4;
                            jrVar2 = wh2;
                            i = 601;
                            inputStream = null;
                            closeable = null;
                            sf.this.oo();
                            sf sfVar32 = sf.this;
                            com.bykv.vk.openvk.pcc.pcc.pcc.gm.gm gmVar2 = sfVar32.sf;
                            if (gbbVar != null) {
                            }
                            sfVar32.pcc(gmVar2, i, th.getMessage());
                            sf.this.pcc(closeable);
                            sf.this.pcc(inputStream);
                            sf.this.pcc(jrVar2);
                            sf.this.pcc(gbbVar);
                            new Object[]{"Pre finally ", sf.this.sf.dax(), " Preload size=", Integer.valueOf(sf.this.sf.wh())};
                            gm.pcc(sf.this.sf);
                        }
                        if (inputStream != null) {
                            try {
                                randomAccessFile = new RandomAccessFile(sf.this.oo, "rw");
                                try {
                                    int qf = com.bykv.vk.openvk.pcc.pcc.sf.pcc.qf();
                                    byte[] bArr = new byte[qf];
                                    int i2 = 0;
                                    long j3 = 0;
                                    while (true) {
                                        int read = inputStream.read(bArr, i2, qf - i2);
                                        if (read == -1) {
                                            if (sf.this.sf.hc() && j == sf.this.oo.length()) {
                                                sf.this.vj();
                                            }
                                            sf sfVar4 = sf.this;
                                            sfVar4.pcc(sfVar4.sf, gbbVar.gm());
                                            jrVar2 = randomAccessFile;
                                        } else if (sf.this.gm) {
                                            sf sfVar5 = sf.this;
                                            sfVar5.sf(sfVar5.sf, gbbVar.gm());
                                            sf.this.pcc(randomAccessFile);
                                            break;
                                        } else {
                                            i2 += read;
                                            j3 += read;
                                            if (j3 % qf == 0 || j3 == j - length) {
                                                com.bykv.vk.openvk.pcc.pcc.sf.oo.sf.pcc(randomAccessFile, bArr, Long.valueOf(j2).intValue(), i2, sf.this.sf.nac());
                                                j2 += i2;
                                                i2 = 0;
                                            }
                                        }
                                    }
                                    sf.this.pcc(inputStream);
                                    sf.this.pcc(jrVar);
                                } catch (Throwable th5) {
                                    th = th5;
                                    jrVar2 = jrVar;
                                    closeable2 = randomAccessFile;
                                    i = 601;
                                    closeable = closeable2;
                                    sf.this.oo();
                                    sf sfVar322 = sf.this;
                                    com.bykv.vk.openvk.pcc.pcc.pcc.gm.gm gmVar22 = sfVar322.sf;
                                    if (gbbVar != null) {
                                    }
                                    sfVar322.pcc(gmVar22, i, th.getMessage());
                                    sf.this.pcc(closeable);
                                    sf.this.pcc(inputStream);
                                    sf.this.pcc(jrVar2);
                                    sf.this.pcc(gbbVar);
                                    new Object[]{"Pre finally ", sf.this.sf.dax(), " Preload size=", Integer.valueOf(sf.this.sf.wh())};
                                    gm.pcc(sf.this.sf);
                                }
                            } catch (Throwable th6) {
                                th = th6;
                                jrVar2 = jrVar;
                                i = 601;
                                closeable = null;
                                sf.this.oo();
                                sf sfVar3222 = sf.this;
                                com.bykv.vk.openvk.pcc.pcc.pcc.gm.gm gmVar222 = sfVar3222.sf;
                                if (gbbVar != null) {
                                }
                                sfVar3222.pcc(gmVar222, i, th.getMessage());
                                sf.this.pcc(closeable);
                                sf.this.pcc(inputStream);
                                sf.this.pcc(jrVar2);
                                sf.this.pcc(gbbVar);
                                new Object[]{"Pre finally ", sf.this.sf.dax(), " Preload size=", Integer.valueOf(sf.this.sf.wh())};
                                gm.pcc(sf.this.sf);
                            }
                            sf.this.pcc(gbbVar);
                            new Object[]{"Pre finally ", sf.this.sf.dax(), " Preload size=", Integer.valueOf(sf.this.sf.wh())};
                            gm.pcc(sf.this.sf);
                        }
                        try {
                            sf sfVar6 = sf.this;
                            sfVar6.pcc(sfVar6.sf, gbbVar.gm(), gbbVar.vj());
                        } catch (Throwable th7) {
                            th = th7;
                            randomAccessFile = 0;
                            jrVar2 = jrVar;
                            closeable2 = randomAccessFile;
                            i = 601;
                            closeable = closeable2;
                            sf.this.oo();
                            sf sfVar32222 = sf.this;
                            com.bykv.vk.openvk.pcc.pcc.pcc.gm.gm gmVar2222 = sfVar32222.sf;
                            if (gbbVar != null) {
                            }
                            sfVar32222.pcc(gmVar2222, i, th.getMessage());
                            sf.this.pcc(closeable);
                            sf.this.pcc(inputStream);
                            sf.this.pcc(jrVar2);
                            sf.this.pcc(gbbVar);
                            new Object[]{"Pre finally ", sf.this.sf.dax(), " Preload size=", Integer.valueOf(sf.this.sf.wh())};
                            gm.pcc(sf.this.sf);
                        }
                        sf.this.oo();
                        sf sfVar322222 = sf.this;
                        com.bykv.vk.openvk.pcc.pcc.pcc.gm.gm gmVar22222 = sfVar322222.sf;
                        if (gbbVar != null) {
                            i = gbbVar.gm();
                        }
                        sfVar322222.pcc(gmVar22222, i, th.getMessage());
                        sf.this.pcc(closeable);
                        sf.this.pcc(inputStream);
                        sf.this.pcc(jrVar2);
                        sf.this.pcc(gbbVar);
                        new Object[]{"Pre finally ", sf.this.sf.dax(), " Preload size=", Integer.valueOf(sf.this.sf.wh())};
                        gm.pcc(sf.this.sf);
                    } catch (Throwable th8) {
                        sf.this.pcc(closeable);
                        sf.this.pcc(inputStream);
                        sf.this.pcc(jrVar2);
                        sf.this.pcc(gbbVar);
                        new Object[]{"Pre finally ", sf.this.sf.dax(), " Preload size=", Integer.valueOf(sf.this.sf.wh())};
                        gm.pcc(sf.this.sf);
                        throw th8;
                    }
                    i = 601;
                    closeable = closeable2;
                } else {
                    sf sfVar7 = sf.this;
                    i = 601;
                    try {
                        sfVar7.pcc(sfVar7.sf, 601, "Network link failed.");
                        jrVar2 = null;
                        jrVar = null;
                        inputStream = null;
                    } catch (Throwable th9) {
                        th = th9;
                        jrVar2 = null;
                        inputStream = null;
                        closeable = null;
                        sf.this.oo();
                        sf sfVar3222222 = sf.this;
                        com.bykv.vk.openvk.pcc.pcc.pcc.gm.gm gmVar222222 = sfVar3222222.sf;
                        if (gbbVar != null) {
                        }
                        sfVar3222222.pcc(gmVar222222, i, th.getMessage());
                        sf.this.pcc(closeable);
                        sf.this.pcc(inputStream);
                        sf.this.pcc(jrVar2);
                        sf.this.pcc(gbbVar);
                        new Object[]{"Pre finally ", sf.this.sf.dax(), " Preload size=", Integer.valueOf(sf.this.sf.wh())};
                        gm.pcc(sf.this.sf);
                    }
                }
                sf.this.pcc(jrVar2);
                sf.this.pcc(inputStream);
                sf.this.pcc(jrVar);
                sf.this.pcc(gbbVar);
                new Object[]{"Pre finally ", sf.this.sf.dax(), " Preload size=", Integer.valueOf(sf.this.sf.wh())};
                gm.pcc(sf.this.sf);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void pcc(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (Exception unused) {
            }
        }
    }

    public com.bykv.vk.openvk.pcc.pcc.pcc.gm.gm pcc() {
        return this.sf;
    }

    public void pcc(boolean z) {
        this.gm = z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void pcc(com.bykv.vk.openvk.pcc.pcc.pcc.gm.gm gmVar, int i) {
        synchronized (pcc.InterfaceC0095pcc.class) {
            for (pcc.InterfaceC0095pcc interfaceC0095pcc : this.wh) {
                if (interfaceC0095pcc != null) {
                    interfaceC0095pcc.pcc(gmVar, i);
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void pcc(com.bykv.vk.openvk.pcc.pcc.pcc.gm.gm gmVar, int i, String str) {
        synchronized (pcc.InterfaceC0095pcc.class) {
            for (pcc.InterfaceC0095pcc interfaceC0095pcc : this.wh) {
                if (interfaceC0095pcc != null) {
                    interfaceC0095pcc.pcc(gmVar, i, str);
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void sf(com.bykv.vk.openvk.pcc.pcc.pcc.gm.gm gmVar, int i) {
        synchronized (pcc.InterfaceC0095pcc.class) {
            for (pcc.InterfaceC0095pcc interfaceC0095pcc : this.wh) {
                if (interfaceC0095pcc != null) {
                    interfaceC0095pcc.sf(gmVar, i);
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void oo() {
        try {
            this.vj.delete();
            this.oo.delete();
        } catch (Throwable unused) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void vj() {
        try {
            if (this.oo.renameTo(this.vj)) {
            } else {
                throw new IOException("Error renaming file " + this.oo + " to " + this.vj + " for completion!");
            }
        } catch (Throwable th) {
            th.getMessage();
        }
    }
}
