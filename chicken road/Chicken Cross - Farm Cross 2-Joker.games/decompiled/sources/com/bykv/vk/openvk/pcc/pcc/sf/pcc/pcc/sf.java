package com.bykv.vk.openvk.pcc.pcc.sf.pcc.pcc;

import com.bytedance.sdk.component.sf.pcc.gbb;
import com.bytedance.sdk.component.sf.pcc.jr;
import com.bytedance.sdk.component.sf.pcc.tmg;
import com.bytedance.sdk.component.sf.pcc.vh;
import com.bytedance.sdk.component.utils.lo;
import com.vungle.ads.internal.protos.Sdk;
import io.ktor.sse.ServerSentEventKt;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.RandomAccessFile;
import java.net.SocketTimeoutException;
import java.util.concurrent.TimeUnit;
import org.json.JSONObject;

/* loaded from: classes5.dex */
public class sf implements gm {
    private volatile long hc;
    private File oo;
    private boolean pcc;
    private final com.bykv.vk.openvk.pcc.pcc.pcc.gm.gm tmg;
    private RandomAccessFile vh;
    private File vj;
    private long wh;
    private volatile long sf = -2147483648L;
    private final Object gm = new Object();
    private volatile long qf = -1;
    private volatile int kj = -100;
    private volatile boolean vy = false;
    private volatile boolean ork = false;

    public sf(com.bykv.vk.openvk.pcc.pcc.pcc.gm.gm gmVar) {
        this.wh = 0L;
        this.vh = null;
        this.tmg = gmVar;
        try {
            String vj = gmVar.vj();
            String nac = gmVar.nac();
            this.oo = com.bykv.vk.openvk.pcc.pcc.sf.oo.sf.sf(vj, nac);
            this.vj = com.bykv.vk.openvk.pcc.pcc.sf.oo.sf.gm(vj, nac);
            if (oo()) {
                this.vh = new RandomAccessFile(this.vj, "r");
            } else {
                this.vh = new RandomAccessFile(this.oo, "rw");
            }
            if (!oo()) {
                this.wh = this.oo.length();
                pcc();
            }
            this.pcc = com.bykv.vk.openvk.pcc.pcc.sf.pcc.wh() == 2;
        } catch (Throwable unused) {
            new Object[]{"Error using file ", gmVar.dax(), " as disc cache"};
        }
    }

    private boolean oo() {
        return this.vj.exists();
    }

    public void pcc() {
        vh.pcc pccVar;
        if (com.bykv.vk.openvk.pcc.pcc.pcc.gm.gm() != null) {
            pccVar = com.bykv.vk.openvk.pcc.pcc.pcc.gm.gm().gm();
        } else {
            pccVar = new vh.pcc("v_cache");
        }
        pccVar.pcc(this.tmg.gpj(), TimeUnit.MILLISECONDS).sf(this.tmg.lo(), TimeUnit.MILLISECONDS).gm(this.tmg.fum(), TimeUnit.MILLISECONDS);
        vh pcc = pccVar.pcc();
        new Object[]{"RANGE, bytes=", Long.valueOf(this.wh), " file hash=", this.tmg.nac()};
        pcc.pcc(new tmg.pcc().pcc("RANGE", "bytes=" + this.wh + "-").sf(this.tmg.dax()).pcc().pcc("videoLoadWhenPlaying").pcc(9).sf()).pcc(new com.bytedance.sdk.component.sf.pcc.gm() { // from class: com.bykv.vk.openvk.pcc.pcc.sf.pcc.pcc.sf.1
            @Override // com.bytedance.sdk.component.sf.pcc.gm
            public void pcc(com.bytedance.sdk.component.sf.pcc.sf sfVar, IOException iOException) {
                sf.this.pcc(30000, iOException.getMessage());
            }

            @Override // com.bytedance.sdk.component.sf.pcc.gm
            public void pcc(com.bytedance.sdk.component.sf.pcc.sf sfVar, gbb gbbVar) throws IOException {
                jr jrVar;
                boolean z;
                long length;
                long j;
                if (gbbVar == null) {
                    sf.this.pcc(Sdk.SDKError.Reason.AD_INTERNAL_INTEGRATION_ERROR_VALUE, "response is empty");
                    return;
                }
                InputStream inputStream = null;
                try {
                    sf.this.ork = gbbVar.oo();
                    if (sf.this.ork) {
                        jrVar = gbbVar.wh();
                        try {
                            if (sf.this.ork && jrVar != null) {
                                sf.this.sf = jrVar.pcc() + sf.this.wh;
                                inputStream = jrVar.gm();
                            }
                            if (inputStream == null) {
                                sf.this.pcc(Sdk.SDKError.Reason.CONFIG_NOT_FOUND_ERROR_VALUE, "input_stream is empty");
                                if (inputStream != null) {
                                    try {
                                        inputStream.close();
                                    } catch (Throwable unused) {
                                        return;
                                    }
                                }
                                if (z) {
                                    if (length == j) {
                                        return;
                                    } else {
                                        return;
                                    }
                                }
                                return;
                            }
                            int qf = com.bykv.vk.openvk.pcc.pcc.sf.pcc.qf();
                            byte[] bArr = new byte[qf];
                            long j2 = sf.this.wh;
                            new Object[]{"start write, totalLength = ", Long.valueOf(sf.this.sf), " startSaved=", Long.valueOf(sf.this.wh), " url=", sf.this.tmg.dax()};
                            long j3 = 0;
                            long j4 = 0;
                            int i = 0;
                            while (true) {
                                int read = inputStream.read(bArr, i, qf - i);
                                boolean z2 = true;
                                if (read == -1) {
                                    break;
                                }
                                i += read;
                                j4 += read;
                                if (j4 % qf != j3 && j4 != sf.this.sf - sf.this.wh) {
                                    z2 = false;
                                }
                                new Object[]{"Write segment,execAppend =", Boolean.valueOf(z2), " offset=", Integer.valueOf(i), " totalLength = ", Long.valueOf(sf.this.sf), " saveSize =", j4 + ", waitingAtPost=", Long.valueOf(sf.this.hc)};
                                if (z2) {
                                    synchronized (sf.this.gm) {
                                        com.bykv.vk.openvk.pcc.pcc.sf.oo.sf.pcc(sf.this.vh, bArr, Long.valueOf(j2).intValue(), i, sf.this.tmg.nac());
                                        if (sf.this.pcc && sf.this.hc > -1 && sf.this.wh + j4 >= sf.this.hc) {
                                            sf.this.gm.notify();
                                        }
                                    }
                                    j2 += i;
                                    i = 0;
                                }
                                j3 = 0;
                            }
                            new Object[]{"Write segment,Write over, startIndex =", Long.valueOf(sf.this.wh), " totalLength = ", Long.valueOf(sf.this.sf), " saveSize = ", Long.valueOf(j4), " writeEndSegment =", Boolean.valueOf(j4 == sf.this.sf - sf.this.wh)};
                        } catch (Throwable th) {
                            th = th;
                            try {
                                sf.this.pcc(Sdk.SDKError.Reason.AD_PUBLISHER_MISMATCH_VALUE, th.getMessage());
                                if (inputStream != null) {
                                    try {
                                        inputStream.close();
                                    } catch (Throwable unused2) {
                                        return;
                                    }
                                }
                                if (jrVar != null) {
                                    jrVar.close();
                                }
                                if (gbbVar != null) {
                                    gbbVar.close();
                                }
                                if (sf.this.ork && sf.this.oo.length() == sf.this.sf) {
                                    sf.this.wh();
                                    return;
                                }
                                return;
                            } finally {
                                if (inputStream != null) {
                                    try {
                                        inputStream.close();
                                    } catch (Throwable unused3) {
                                    }
                                }
                                if (jrVar != null) {
                                    jrVar.close();
                                }
                                if (gbbVar != null) {
                                    gbbVar.close();
                                }
                                if (sf.this.ork && sf.this.oo.length() == sf.this.sf) {
                                    sf.this.wh();
                                }
                            }
                        }
                    } else {
                        sf.this.pcc(gbbVar.gm(), gbbVar.vj());
                        jrVar = null;
                    }
                    if (inputStream != null) {
                        try {
                            inputStream.close();
                        } catch (Throwable unused4) {
                            return;
                        }
                    }
                    if (jrVar != null) {
                        jrVar.close();
                    }
                    if (gbbVar != null) {
                        gbbVar.close();
                    }
                    if (sf.this.ork && sf.this.oo.length() == sf.this.sf) {
                        sf.this.wh();
                    }
                } catch (Throwable th2) {
                    th = th2;
                    jrVar = null;
                }
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void pcc(int i, String str) {
        JSONObject gm;
        this.ork = false;
        this.kj = i;
        this.sf = this.qf;
        lo.sf("CSJ_MediaDLPlay", "handleFailResponse: ", Integer.valueOf(i), ServerSentEventKt.SPACE, str);
        com.bykv.vk.openvk.pcc.pcc.pcc.gm.gm gmVar = this.tmg;
        if (gmVar == null || !gmVar.pcc() || (gm = this.tmg.gm()) == null) {
            return;
        }
        try {
            gm.put("error_real_code", i);
            gm.put("error_real_msg", str);
        } catch (Throwable th) {
            lo.pcc("CSJ_MediaDLPlay", "handleFailResponse: ", th);
        }
    }

    @Override // com.bykv.vk.openvk.pcc.pcc.sf.pcc.pcc.gm
    public int pcc(long j, byte[] bArr, int i, int i2) throws IOException {
        try {
            if (j == this.sf) {
                return -1;
            }
            int i3 = 0;
            int i4 = 0;
            while (!this.vy) {
                synchronized (this.gm) {
                    long vj = vj();
                    if (j < vj) {
                        new Object[]{"read:  read ", Long.valueOf(j), " success"};
                        this.vh.seek(j);
                        i4 = this.vh.read(bArr, i, i2);
                    } else {
                        new Object[]{"read: wait at ", Long.valueOf(j), ", file size = ", Long.valueOf(vj)};
                        i3 += 33;
                        this.hc = j;
                        this.gm.wait(33L);
                        this.hc = -1L;
                    }
                }
                if (i4 > 0) {
                    return i4;
                }
                com.bykv.vk.openvk.pcc.pcc.pcc.gm.gm gmVar = this.tmg;
                if (gmVar != null && gmVar.pcc() && this.kj != -100 && (!this.ork || this.sf == this.qf)) {
                    throw new IOException();
                }
                if (i3 >= 20000) {
                    throw new SocketTimeoutException();
                }
            }
            return -1;
        } catch (Throwable th) {
            if (th instanceof IOException) {
                throw th;
            }
            throw new IOException();
        }
    }

    @Override // com.bykv.vk.openvk.pcc.pcc.sf.pcc.pcc.gm
    public void sf() {
        try {
            if (!this.vy) {
                this.vh.close();
            }
            File file = this.oo;
            if (file != null) {
                file.setLastModified(System.currentTimeMillis());
            }
            File file2 = this.vj;
            if (file2 != null) {
                file2.setLastModified(System.currentTimeMillis());
            }
        } catch (Throwable unused) {
        }
        this.vy = true;
    }

    private long vj() {
        if (oo()) {
            return this.vj.length();
        }
        return this.oo.length();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void wh() throws IOException {
        synchronized (this.gm) {
            if (oo()) {
                new Object[]{"complete: isCompleted ", this.tmg.dax(), this.tmg.nac()};
                return;
            }
            try {
            } finally {
            }
            if (!this.oo.renameTo(this.vj)) {
                throw new IOException("Error renaming file " + this.oo + " to " + this.vj + " for completion!");
            }
            RandomAccessFile randomAccessFile = this.vh;
            if (randomAccessFile != null) {
                randomAccessFile.close();
            }
            this.vh = new RandomAccessFile(this.vj, "rw");
            new Object[]{"complete: rename ", this.tmg.nac(), this.tmg.dax()};
        }
    }

    @Override // com.bykv.vk.openvk.pcc.pcc.sf.pcc.pcc.gm
    public long gm() throws IOException {
        if (oo()) {
            this.sf = this.vj.length();
        } else {
            synchronized (this.gm) {
                int i = 0;
                while (this.sf == -2147483648L && !this.vy) {
                    i += 15;
                    try {
                        this.gm.wait(5L);
                        if (i > 20000) {
                            return -1L;
                        }
                    } catch (InterruptedException unused) {
                        throw new IOException("total length InterruptException");
                    }
                }
            }
        }
        new Object[]{"totalLength= ", Long.valueOf(this.sf)};
        return this.sf;
    }
}
