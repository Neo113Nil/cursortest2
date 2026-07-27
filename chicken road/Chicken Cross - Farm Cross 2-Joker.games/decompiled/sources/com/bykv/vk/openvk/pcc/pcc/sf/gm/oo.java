package com.bykv.vk.openvk.pcc.pcc.sf.gm;

import android.graphics.SurfaceTexture;
import android.media.PlaybackParams;
import android.os.Message;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.SparseIntArray;
import android.view.Surface;
import android.view.SurfaceHolder;
import com.bykv.vk.openvk.pcc.pcc.pcc.pcc;
import com.bykv.vk.openvk.pcc.pcc.sf.gm.gm;
import com.bytedance.sdk.component.utils.fum;
import com.bytedance.sdk.component.utils.lo;
import com.bytedance.sdk.component.utils.tsz;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.moloco.sdk.BidRequest;
import com.vungle.ads.internal.protos.Sdk;
import java.io.File;
import java.io.FileInputStream;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONObject;

/* loaded from: classes5.dex */
public class oo implements com.bykv.vk.openvk.pcc.pcc.pcc.pcc, gm.InterfaceC0096gm, gm.oo, gm.pcc, gm.qf, gm.sf, gm.vj, gm.wh, tsz.pcc {
    private static final SparseIntArray pcc = new SparseIntArray();
    private tsz dax;
    private boolean hc;
    private volatile boolean lrr;
    private volatile boolean mu;
    private boolean of;
    private boolean rj;
    private boolean tmg;
    private boolean tsz;
    private SurfaceTexture vj;
    private SurfaceHolder wh;
    private ArrayList<Runnable> yt;
    private final boolean sf = false;
    private final List<WeakReference<pcc.InterfaceC0094pcc>> gm = new CopyOnWriteArrayList();
    private final pcc oo = new pcc();
    private int qf = 0;
    private int kj = 3;
    private boolean vy = false;
    private volatile gm ork = null;
    private boolean vh = false;
    private volatile int gbb = 201;
    private long jr = -1;
    private boolean nac = false;
    private long lu = 0;
    private long gpj = Long.MIN_VALUE;
    private long lo = 0;
    private long fum = 0;
    private long tz = 0;
    private int qy = 0;
    private String jsj = "0";
    private com.bykv.vk.openvk.pcc.pcc.pcc.gm.gm mk = null;
    private boolean atb = false;
    private CountDownLatch ye = new CountDownLatch(1);
    private volatile int lq = 200;
    private AtomicBoolean zti = new AtomicBoolean(false);
    private Surface pq = null;
    private long nn = 0;
    private long rnn = 0;
    private boolean tsx = false;
    private final Runnable kun = new Runnable() { // from class: com.bykv.vk.openvk.pcc.pcc.sf.gm.oo.1
        @Override // java.lang.Runnable
        public void run() {
            if (oo.this.ork == null) {
                return;
            }
            long lu = oo.this.lu();
            if (lu > 0 && oo.this.wh() && oo.this.gpj != Long.MIN_VALUE) {
                try {
                    if (oo.this.gpj == lu) {
                        if (!oo.this.nac && oo.this.lo >= 400) {
                            oo.this.sf(701, 800);
                            oo.this.nac = true;
                        }
                        oo.this.lo += oo.this.lq;
                    } else {
                        if (oo.this.nac) {
                            oo.this.lu += oo.this.lo;
                            oo.this.sf(IronSourceError.ERROR_NT_INIT_FAILED_AFTER_LOAD, 800);
                            new Object[]{"handleMsg:  bufferingDuration =", Long.valueOf(oo.this.lu), "  bufferCount =", Integer.valueOf(oo.this.qf)};
                        }
                        oo.this.lo = 0L;
                        oo.this.nac = false;
                    }
                } catch (Throwable th) {
                    th.getMessage();
                }
            }
            if (oo.this.nac() > 0) {
                if (oo.this.gpj != lu) {
                    if (com.bykv.vk.openvk.pcc.pcc.pcc.gm.oo()) {
                        new Object[]{"run: lastCur = ", Long.valueOf(oo.this.gpj), "  curPosition = ", Long.valueOf(lu)};
                    }
                    oo ooVar = oo.this;
                    ooVar.pcc(lu, ooVar.nac());
                }
                oo.this.gpj = lu;
            }
            if (!oo.this.sf()) {
                if (oo.this.dax != null) {
                    oo.this.dax.postDelayed(this, oo.this.lq);
                }
            } else {
                oo ooVar2 = oo.this;
                ooVar2.pcc(ooVar2.nac(), oo.this.nac());
            }
        }
    };

    private boolean pcc(int i, int i2) {
        boolean z = i == -1010 || i == -1007 || i == -1004 || i == -110 || i == 100 || i == 200;
        if (i2 == 1 || i2 == 700 || i2 == 800) {
            return true;
        }
        return z;
    }

    public oo() {
        pcc("SSMediaPlayerWrapper");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void pcc(long j, long j2) {
        if (!this.lrr) {
            tsz();
        }
        for (WeakReference<pcc.InterfaceC0094pcc> weakReference : this.gm) {
            if (weakReference != null && weakReference.get() != null) {
                weakReference.get().pcc(this, j, j2);
            }
        }
    }

    private void pcc(String str) {
        this.qy = 0;
        this.dax = com.bytedance.sdk.component.kj.pcc.pcc.pcc().pcc(this, "csj_".concat(String.valueOf(str)));
        this.tsx = true;
        tz();
    }

    private void fum() {
        this.lu = 0L;
        this.qf = 0;
        this.lo = 0L;
        this.nac = false;
        this.gpj = Long.MIN_VALUE;
    }

    public void pcc(final boolean z) {
        if (kj()) {
            return;
        }
        this.tsz = z;
        if (this.ork != null) {
            this.ork.pcc(z);
            return;
        }
        tsz tszVar = this.dax;
        if (tszVar != null) {
            tszVar.post(new Runnable() { // from class: com.bykv.vk.openvk.pcc.pcc.sf.gm.oo.9
                @Override // java.lang.Runnable
                public void run() {
                    if (oo.this.ork != null) {
                        oo.this.ork.pcc(z);
                    }
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void tz() {
        tsz tszVar = this.dax;
        if (tszVar != null) {
            tszVar.post(new Runnable() { // from class: com.bykv.vk.openvk.pcc.pcc.sf.gm.oo.10
                @Override // java.lang.Runnable
                public void run() {
                    if (oo.this.ork == null) {
                        try {
                            oo.this.ork = new sf();
                        } catch (Throwable th) {
                            th.getMessage();
                        }
                        if (oo.this.ork == null) {
                            return;
                        }
                        gm unused = oo.this.ork;
                        oo.this.jsj = "0";
                        oo.this.ork.pcc((gm.vj) oo.this);
                        oo.this.ork.pcc((gm.sf) oo.this);
                        oo.this.ork.pcc((gm.InterfaceC0096gm) oo.this);
                        oo.this.ork.pcc((gm.pcc) oo.this);
                        oo.this.ork.pcc((gm.wh) oo.this);
                        oo.this.ork.pcc((gm.oo) oo.this);
                        oo.this.ork.pcc((gm.qf) oo.this);
                        try {
                            oo.this.ork.gm(false);
                        } catch (Throwable unused2) {
                        }
                        oo.this.vh = false;
                    }
                }
            });
        }
    }

    public void vy() {
        if (kj() || this.ork == null) {
            return;
        }
        this.zti.set(true);
        if (this.gbb != 206) {
            fum();
            this.mu = false;
            this.oo.pcc(true);
            sf(0L);
            tsz tszVar = this.dax;
            if (tszVar != null) {
                tszVar.removeCallbacks(this.kun);
                this.dax.postDelayed(this.kun, this.lq);
            }
        }
        this.ye.countDown();
    }

    public void pcc(boolean z, long j, boolean z2) {
        if (kj()) {
            return;
        }
        tz();
        this.atb = z2;
        this.zti.set(true);
        this.mu = false;
        sf(z2);
        if (z) {
            this.jr = j;
            of();
        } else {
            sf(j);
        }
        tsz tszVar = this.dax;
        if (tszVar != null) {
            tszVar.removeCallbacks(this.kun);
            this.dax.postDelayed(this.kun, this.lq);
        }
        this.ye.countDown();
    }

    private void sf(long j) {
        this.oo.pcc(j);
        if (this.tsz) {
            sf(this.oo);
        } else if (sf(this.mk)) {
            sf(this.oo);
        } else {
            pcc(this.oo);
        }
    }

    private boolean sf(com.bykv.vk.openvk.pcc.pcc.pcc.gm.gm gmVar) {
        return gmVar != null && gmVar.qf();
    }

    public void ork() {
        if (kj() || this.dax == null) {
            return;
        }
        this.zti.set(true);
        this.dax.post(new Runnable() { // from class: com.bykv.vk.openvk.pcc.pcc.sf.gm.oo.11
            @Override // java.lang.Runnable
            public void run() {
                if (!oo.this.qf() || oo.this.ork == null) {
                    return;
                }
                try {
                    oo.this.ork.wh();
                    for (WeakReference weakReference : oo.this.gm) {
                        if (weakReference != null && weakReference.get() != null) {
                            ((pcc.InterfaceC0094pcc) weakReference.get()).vj(oo.this);
                        }
                    }
                    oo.this.gbb = 206;
                } catch (Throwable th) {
                    new Object[]{"play: catch exception ", th.getMessage()};
                }
            }
        });
    }

    public void vh() {
        tsz tszVar;
        if (kj() || (tszVar = this.dax) == null) {
            return;
        }
        tszVar.removeMessages(100);
        this.mu = true;
        if (!this.tsx) {
            if (this.of || sf(this.mk)) {
                tsz tszVar2 = this.dax;
                if (tszVar2 != null) {
                    tszVar2.sendEmptyMessage(101);
                    return;
                }
                return;
            }
            pcc(new Runnable() { // from class: com.bykv.vk.openvk.pcc.pcc.sf.gm.oo.12
                @Override // java.lang.Runnable
                public void run() {
                    if (oo.this.dax != null) {
                        oo.this.dax.sendEmptyMessage(101);
                    }
                }
            });
            return;
        }
        if (this.vy || sf(this.mk)) {
            tsz tszVar3 = this.dax;
            if (tszVar3 != null) {
                tszVar3.sendEmptyMessage(101);
                return;
            }
            return;
        }
        pcc(new Runnable() { // from class: com.bykv.vk.openvk.pcc.pcc.sf.gm.oo.13
            @Override // java.lang.Runnable
            public void run() {
                if (oo.this.dax != null) {
                    oo.this.dax.sendEmptyMessage(101);
                }
            }
        });
    }

    public void tmg() {
        if (kj()) {
            return;
        }
        this.hc = true;
        lq();
        tsz tszVar = this.dax;
        if (tszVar != null) {
            try {
                tszVar.removeCallbacksAndMessages(null);
                if (this.ork != null) {
                    this.dax.sendEmptyMessage(103);
                }
                qy();
            } catch (Throwable unused) {
                qy();
            }
        }
    }

    private void of() {
        sf(new Runnable() { // from class: com.bykv.vk.openvk.pcc.pcc.sf.gm.oo.14
            @Override // java.lang.Runnable
            public void run() {
                if (oo.this.dax != null) {
                    oo.this.dax.sendEmptyMessage(104);
                }
            }
        });
    }

    public void pcc(final long j) {
        if (kj()) {
            return;
        }
        if (this.gbb == 207 || this.gbb == 206 || this.gbb == 209) {
            sf(new Runnable() { // from class: com.bykv.vk.openvk.pcc.pcc.sf.gm.oo.2
                @Override // java.lang.Runnable
                public void run() {
                    if (oo.this.dax != null) {
                        oo.this.dax.obtainMessage(106, Long.valueOf(j)).sendToTarget();
                    }
                }
            });
        }
    }

    @Override // com.bykv.vk.openvk.pcc.pcc.pcc.pcc
    public boolean pcc() {
        return this.vy;
    }

    public void pcc(final SurfaceTexture surfaceTexture) {
        if (kj()) {
            return;
        }
        this.vj = surfaceTexture;
        pcc(true);
        sf(new Runnable() { // from class: com.bykv.vk.openvk.pcc.pcc.sf.gm.oo.3
            @Override // java.lang.Runnable
            public void run() {
                oo.this.tz();
                if (oo.this.dax != null) {
                    oo.this.dax.obtainMessage(111, surfaceTexture).sendToTarget();
                }
            }
        });
    }

    public void pcc(final SurfaceHolder surfaceHolder) {
        if (kj()) {
            return;
        }
        this.wh = surfaceHolder;
        pcc(true);
        sf(new Runnable() { // from class: com.bykv.vk.openvk.pcc.pcc.sf.gm.oo.4
            @Override // java.lang.Runnable
            public void run() {
                oo.this.tz();
                if (oo.this.dax != null) {
                    oo.this.dax.obtainMessage(110, surfaceHolder).sendToTarget();
                }
            }
        });
    }

    public void pcc(final com.bykv.vk.openvk.pcc.pcc.pcc.gm.gm gmVar) {
        if (kj()) {
            return;
        }
        this.mk = gmVar;
        if (gmVar != null) {
            this.tsx = this.tsx && !gmVar.qf();
        }
        sf(new Runnable() { // from class: com.bykv.vk.openvk.pcc.pcc.sf.gm.oo.5
            @Override // java.lang.Runnable
            public void run() {
                oo.this.tz();
                if (oo.this.dax != null) {
                    oo.this.dax.obtainMessage(BidRequest.SdkBidRequest.Imp.Native.NativeRequest.EventTrackers.EventType.CUSTOM_ACTION_07_VALUE, gmVar).sendToTarget();
                }
            }
        });
    }

    @Override // com.bykv.vk.openvk.pcc.pcc.pcc.pcc
    public boolean wh() {
        tsz tszVar;
        return (this.gbb == 206 || ((tszVar = this.dax) != null && tszVar.hasMessages(100))) && !this.mu;
    }

    @Override // com.bykv.vk.openvk.pcc.pcc.pcc.pcc
    public boolean gm() {
        return hc() || wh() || qf();
    }

    @Override // com.bykv.vk.openvk.pcc.pcc.pcc.pcc
    public boolean qf() {
        tsz tszVar;
        return ((this.gbb != 207 && !this.mu) || (tszVar = this.dax) == null || tszVar.hasMessages(100)) ? false : true;
    }

    @Override // com.bykv.vk.openvk.pcc.pcc.pcc.pcc
    public boolean kj() {
        return this.hc;
    }

    public boolean hc() {
        return this.gbb == 205;
    }

    @Override // com.bykv.vk.openvk.pcc.pcc.pcc.pcc
    public boolean sf() {
        return this.gbb == 209;
    }

    @Override // com.bytedance.sdk.component.utils.tsz.pcc
    public void pcc(Message message) {
        int i = this.gbb;
        int i2 = message.what;
        if (this.ork != null) {
            try {
                switch (message.what) {
                    case 100:
                        if (this.gbb == 205 || this.gbb == 207 || this.gbb == 209) {
                            this.ork.wh();
                            this.tz = SystemClock.elapsedRealtime();
                            this.gbb = 206;
                            long j = this.jr;
                            if (j > 0) {
                                new Object[]{"[video] OP_START, seekTo:", Long.valueOf(j), Integer.valueOf(this.kj)};
                                this.ork.pcc(this.jr, this.kj);
                                this.jr = -1L;
                            }
                            if (this.mk != null) {
                                sf(this.atb);
                                return;
                            }
                            return;
                        }
                        break;
                    case 101:
                        if (this.nac) {
                            this.lu += this.lo;
                        }
                        this.nac = false;
                        this.lo = 0L;
                        this.gpj = Long.MIN_VALUE;
                        if (this.gbb == 206 || this.gbb == 207 || this.gbb == 209) {
                            this.ork.kj();
                            this.gbb = 207;
                            this.mu = false;
                            for (WeakReference<pcc.InterfaceC0094pcc> weakReference : this.gm) {
                                if (weakReference != null && weakReference.get() != null) {
                                    weakReference.get().oo(this);
                                }
                            }
                            return;
                        }
                        break;
                    case 102:
                        this.ork.hc();
                        this.gbb = 201;
                        return;
                    case 103:
                        try {
                            yt();
                        } catch (Throwable unused) {
                        }
                        for (WeakReference<pcc.InterfaceC0094pcc> weakReference2 : this.gm) {
                            if (weakReference2 != null && weakReference2.get() != null) {
                                weakReference2.get().gm(this);
                            }
                        }
                        this.gbb = 203;
                        return;
                    case 104:
                        if (this.gbb == 202 || this.gbb == 208) {
                            this.ork.vy();
                            return;
                        }
                        break;
                    case 105:
                        if (this.gbb == 205 || this.gbb == 206 || this.gbb == 208 || this.gbb == 207 || this.gbb == 209) {
                            this.ork.qf();
                            this.gbb = Sdk.SDKError.Reason.INVALID_BID_PAYLOAD_VALUE;
                            return;
                        }
                        break;
                    case 106:
                        if (this.gbb == 206 || this.gbb == 207 || this.gbb == 209) {
                            this.ork.pcc(((Long) message.obj).longValue(), this.kj);
                            return;
                        }
                        break;
                    case CUSTOM_ACTION_07_VALUE:
                        fum();
                        if (this.gbb == 201 || this.gbb == 203) {
                            com.bykv.vk.openvk.pcc.pcc.pcc.gm.gm gmVar = (com.bykv.vk.openvk.pcc.pcc.pcc.gm.gm) message.obj;
                            if (TextUtils.isEmpty(gmVar.vj())) {
                                gmVar.pcc(com.bykv.vk.openvk.pcc.pcc.pcc.gm.sf());
                            }
                            if (gmVar.qy()) {
                                this.ork.pcc(gmVar.dax());
                                gmVar.dax();
                            } else {
                                File file = new File(gmVar.vj(), gmVar.nac());
                                if (file.exists()) {
                                    pcc(gmVar, file);
                                } else {
                                    gm(gmVar);
                                }
                            }
                            this.gbb = 202;
                            return;
                        }
                        break;
                    case 108:
                    case 109:
                    default:
                        return;
                    case 110:
                        this.ork.pcc((SurfaceHolder) message.obj);
                        this.ork.sf(true);
                        this.ye.await(1L, TimeUnit.SECONDS);
                        ye();
                        return;
                    case 111:
                        this.pq = new Surface((SurfaceTexture) message.obj);
                        this.ork.pcc(this.pq);
                        this.ork.sf(true);
                        this.ye.await(1L, TimeUnit.SECONDS);
                        ye();
                        return;
                }
                this.gbb = 200;
                if (this.vh) {
                    return;
                }
                com.bykv.vk.openvk.pcc.pcc.pcc.gm.pcc pccVar = new com.bykv.vk.openvk.pcc.pcc.pcc.gm.pcc(308, i2);
                pccVar.pcc(i + "," + i2);
                for (WeakReference<pcc.InterfaceC0094pcc> weakReference3 : this.gm) {
                    if (weakReference3 != null && weakReference3.get() != null) {
                        weakReference3.get().pcc(this, pccVar);
                    }
                }
                this.vh = true;
            } catch (Throwable unused2) {
            }
        }
    }

    private void pcc(com.bykv.vk.openvk.pcc.pcc.pcc.gm.gm gmVar, File file) {
        if (gmVar.pcc()) {
            sf(gmVar, file);
        } else {
            pcc(file);
        }
    }

    private void pcc(File file) {
        file.getAbsolutePath();
        try {
            if (fum.pcc(com.bykv.vk.openvk.pcc.pcc.pcc.gm.pcc())) {
                this.ork.pcc(file.getAbsolutePath());
            } else {
                sf(file.getAbsolutePath());
            }
        } catch (Throwable unused) {
        }
    }

    private void sf(com.bykv.vk.openvk.pcc.pcc.pcc.gm.gm gmVar, File file) {
        try {
            String pcc2 = com.bykv.vk.openvk.pcc.pcc.pcc.qf.pcc.pcc(file);
            if (gmVar.nac().equals(pcc2)) {
                pcc(file);
                return;
            }
            JSONObject gm = gmVar.gm();
            boolean sf = gmVar.sf();
            if (gm != null) {
                gm.put("file_hash", gmVar.nac());
                gm.put("file_real_hash", pcc2);
                gm.put("is_change_play_type", sf ? 1 : 0);
                gm.put("error_real_code", Sdk.SDKError.Reason.ASSET_FAILED_TO_DELETE_VALUE);
                gm.put("error_real_msg", "md5_not_match");
            }
            if (sf) {
                boolean delete = file.delete();
                if (gm != null) {
                    gm.put("delete_cache_file", delete ? 1 : 0);
                }
                if (delete) {
                    gm(gmVar);
                    return;
                }
            }
            pcc(file);
        } catch (Throwable unused) {
        }
    }

    private void gm(com.bykv.vk.openvk.pcc.pcc.pcc.gm.gm gmVar) throws Throwable {
        gmVar.dax();
        this.ork.pcc(gmVar);
        gmVar.dax();
    }

    private void sf(String str) throws Throwable {
        FileInputStream fileInputStream = new FileInputStream(str);
        this.ork.pcc(fileInputStream.getFD());
        fileInputStream.close();
    }

    private void yt() {
        if (this.ork == null) {
            return;
        }
        try {
            this.ork.hc();
        } catch (Throwable unused) {
        }
        this.ork.pcc((gm.sf) null);
        this.ork.pcc((gm.qf) null);
        this.ork.pcc((gm.pcc) null);
        this.ork.pcc((gm.oo) null);
        this.ork.pcc((gm.InterfaceC0096gm) null);
        this.ork.pcc((gm.vj) null);
        this.ork.pcc((gm.wh) null);
        try {
            this.ork.tmg();
        } catch (Throwable unused2) {
        }
    }

    private void qy() {
        tsz tszVar = this.dax;
        if (tszVar == null || tszVar.getLooper() == null) {
            return;
        }
        try {
            this.dax.post(new Runnable() { // from class: com.bykv.vk.openvk.pcc.pcc.sf.gm.oo.6
                @Override // java.lang.Runnable
                public void run() {
                    if (oo.this.dax == null || oo.this.dax.getLooper() == null) {
                        return;
                    }
                    try {
                        com.bytedance.sdk.component.kj.pcc.pcc.pcc().pcc(oo.this.dax);
                        oo.this.dax = null;
                    } catch (Throwable unused) {
                    }
                }
            });
        } catch (Throwable unused) {
        }
    }

    @Override // com.bykv.vk.openvk.pcc.pcc.sf.gm.gm.pcc
    public void pcc(gm gmVar, int i) {
        if (this.ork != gmVar) {
            return;
        }
        for (WeakReference<pcc.InterfaceC0094pcc> weakReference : this.gm) {
            if (weakReference != null && weakReference.get() != null) {
                weakReference.get().sf(this, i);
            }
        }
    }

    private void jsj() {
        SparseIntArray sparseIntArray = pcc;
        Integer valueOf = Integer.valueOf(sparseIntArray.get(this.qy));
        if (valueOf == null) {
            sparseIntArray.put(this.qy, 1);
        } else {
            sparseIntArray.put(this.qy, valueOf.intValue() + 1);
        }
    }

    @Override // com.bykv.vk.openvk.pcc.pcc.sf.gm.gm.sf
    public void pcc(gm gmVar) {
        this.gbb = Sdk.SDKError.Reason.INVALID_JSON_BID_PAYLOAD_VALUE;
        pcc.delete(this.qy);
        tsz tszVar = this.dax;
        if (tszVar != null) {
            tszVar.removeCallbacks(this.kun);
        }
        for (WeakReference<pcc.InterfaceC0094pcc> weakReference : this.gm) {
            if (weakReference != null && weakReference.get() != null) {
                weakReference.get().pcc(this);
            }
        }
    }

    @Override // com.bykv.vk.openvk.pcc.pcc.sf.gm.gm.InterfaceC0096gm
    public boolean pcc(gm gmVar, int i, int i2) {
        jsj();
        this.gbb = 200;
        tsz tszVar = this.dax;
        if (tszVar != null) {
            tszVar.removeCallbacks(this.kun);
        }
        if (pcc(i, i2)) {
            qy();
        }
        if (!this.zti.get()) {
            return true;
        }
        this.zti.set(false);
        com.bykv.vk.openvk.pcc.pcc.pcc.gm.pcc pccVar = new com.bykv.vk.openvk.pcc.pcc.pcc.gm.pcc(i, i2);
        for (WeakReference<pcc.InterfaceC0094pcc> weakReference : this.gm) {
            if (weakReference != null && weakReference.get() != null) {
                weakReference.get().pcc(this, pccVar);
            }
        }
        return true;
    }

    @Override // com.bykv.vk.openvk.pcc.pcc.sf.gm.gm.oo
    public boolean sf(gm gmVar, int i, int i2) {
        if (this.ork != gmVar) {
            return false;
        }
        if (i2 == -1004) {
            com.bykv.vk.openvk.pcc.pcc.pcc.gm.pcc pccVar = new com.bykv.vk.openvk.pcc.pcc.pcc.gm.pcc(i, i2);
            for (WeakReference<pcc.InterfaceC0094pcc> weakReference : this.gm) {
                if (weakReference != null && weakReference.get() != null) {
                    weakReference.get().pcc(this, pccVar);
                }
            }
        }
        sf(i, i2);
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void sf(int i, int i2) {
        if (i == 701) {
            this.nn = SystemClock.elapsedRealtime();
            this.qf++;
            for (WeakReference<pcc.InterfaceC0094pcc> weakReference : this.gm) {
                if (weakReference != null && weakReference.get() != null) {
                    weakReference.get().pcc(this, Integer.MAX_VALUE, 0, 0);
                }
            }
            new Object[]{"bufferCount = ", Integer.valueOf(this.qf)};
            return;
        }
        if (i == 702) {
            if (this.nn > 0) {
                this.rnn += SystemClock.elapsedRealtime() - this.nn;
                this.nn = 0L;
            }
            for (WeakReference<pcc.InterfaceC0094pcc> weakReference2 : this.gm) {
                if (weakReference2 != null && weakReference2.get() != null) {
                    weakReference2.get().pcc((com.bykv.vk.openvk.pcc.pcc.pcc.pcc) this, Integer.MAX_VALUE);
                }
            }
            new Object[]{"bufferCount = ", Integer.valueOf(this.qf), " mBufferTotalTime = ", Long.valueOf(this.rnn)};
            return;
        }
        if (this.tsx && i == 3) {
            ye();
            tsz();
            sf(this.atb);
        } else if (i == 805) {
            this.rj = true;
        }
    }

    public boolean gbb() {
        return this.rj;
    }

    @Override // com.bykv.vk.openvk.pcc.pcc.sf.gm.gm.vj
    public void sf(gm gmVar) {
        if (kj()) {
            return;
        }
        this.gbb = 205;
        try {
            com.bykv.vk.openvk.pcc.pcc.pcc.gm.gm gmVar2 = this.mk;
            if (gmVar2 != null) {
                float jr = gmVar2.jr();
                if (jr > 0.0f) {
                    com.bykv.vk.openvk.pcc.pcc.pcc.sf sfVar = new com.bykv.vk.openvk.pcc.pcc.pcc.sf();
                    sfVar.pcc(jr);
                    this.ork.pcc(sfVar);
                }
            }
        } catch (Throwable unused) {
        }
        if (this.dax != null) {
            if (this.mu) {
                mk();
            } else {
                tsz tszVar = this.dax;
                tszVar.sendMessage(tszVar.obtainMessage(100, -1, -1));
            }
        }
        pcc.delete(this.qy);
        boolean z = this.tsx;
        boolean z2 = this.of;
        if (!z && !z2) {
            tsz();
            this.of = true;
        }
        for (WeakReference<pcc.InterfaceC0094pcc> weakReference : this.gm) {
            if (weakReference != null && weakReference.get() != null) {
                weakReference.get().sf(this);
            }
        }
    }

    private void tsz() {
        this.lrr = true;
        this.vy = true;
        long elapsedRealtime = SystemClock.elapsedRealtime() - this.tz;
        for (WeakReference<pcc.InterfaceC0094pcc> weakReference : this.gm) {
            if (weakReference != null && weakReference.get() != null) {
                weakReference.get().pcc(this, elapsedRealtime);
            }
        }
    }

    private void mk() {
        tsz tszVar = this.dax;
        if (tszVar != null) {
            tszVar.post(new Runnable() { // from class: com.bykv.vk.openvk.pcc.pcc.sf.gm.oo.7
                @Override // java.lang.Runnable
                public void run() {
                    try {
                        oo.this.ork.kj();
                        oo.this.gbb = 207;
                        oo.this.mu = false;
                    } catch (Throwable unused) {
                    }
                }
            });
        }
    }

    @Override // com.bykv.vk.openvk.pcc.pcc.sf.gm.gm.wh
    public void gm(gm gmVar) {
        for (WeakReference<pcc.InterfaceC0094pcc> weakReference : this.gm) {
            if (weakReference != null && weakReference.get() != null) {
                weakReference.get().pcc((com.bykv.vk.openvk.pcc.pcc.pcc.pcc) this, true);
            }
        }
    }

    private void pcc(Runnable runnable) {
        try {
            if (this.yt == null) {
                this.yt = new ArrayList<>();
            }
            this.yt.add(runnable);
        } catch (Throwable th) {
            th.getMessage();
        }
    }

    private void atb() {
        if (this.tmg) {
            return;
        }
        this.tmg = true;
        Iterator it = new ArrayList(this.yt).iterator();
        while (it.hasNext()) {
            ((Runnable) it.next()).run();
        }
        this.yt.clear();
        this.tmg = false;
    }

    private void ye() {
        ArrayList<Runnable> arrayList = this.yt;
        if (arrayList == null || arrayList.isEmpty()) {
            return;
        }
        atb();
    }

    private void lq() {
        ArrayList<Runnable> arrayList = this.yt;
        if (arrayList == null || arrayList.isEmpty()) {
            return;
        }
        this.yt.clear();
    }

    private void sf(Runnable runnable) {
        if (runnable == null || kj()) {
            return;
        }
        if (!this.hc) {
            runnable.run();
        } else {
            pcc(runnable);
        }
    }

    public void sf(final boolean z) {
        tsz tszVar;
        if (kj() || (tszVar = this.dax) == null) {
            return;
        }
        tszVar.post(new Runnable() { // from class: com.bykv.vk.openvk.pcc.pcc.sf.gm.oo.8
            @Override // java.lang.Runnable
            public void run() {
                if (oo.this.kj() || oo.this.ork == null) {
                    return;
                }
                try {
                    oo.this.atb = z;
                    oo.this.ork.oo(z);
                } catch (Throwable unused) {
                }
            }
        });
    }

    public long jr() {
        if (this.nac) {
            long j = this.lo;
            if (j > 0) {
                return this.lu + j;
            }
        }
        return this.lu;
    }

    @Override // com.bykv.vk.openvk.pcc.pcc.pcc.pcc
    public int oo() {
        if (this.ork == null || kj()) {
            return 0;
        }
        return this.ork.gbb();
    }

    @Override // com.bykv.vk.openvk.pcc.pcc.pcc.pcc
    public int vj() {
        if (this.ork == null || kj()) {
            return 0;
        }
        return this.ork.jr();
    }

    public int dax() {
        return this.qf;
    }

    @Override // com.bykv.vk.openvk.pcc.pcc.sf.gm.gm.qf
    public void pcc(gm gmVar, int i, int i2, int i3, int i4) {
        for (WeakReference<pcc.InterfaceC0094pcc> weakReference : this.gm) {
            if (weakReference != null && weakReference.get() != null) {
                weakReference.get().pcc((com.bykv.vk.openvk.pcc.pcc.pcc.pcc) this, i, i2);
            }
        }
    }

    public long nac() {
        long j = this.fum;
        if (j != 0) {
            return j;
        }
        if (this.gbb == 206 || this.gbb == 207) {
            try {
                this.fum = this.ork.vh();
            } catch (Throwable unused) {
            }
        }
        return this.fum;
    }

    public long lu() {
        if (kj()) {
            return 0L;
        }
        if (this.gbb == 206 || this.gbb == 207) {
            try {
                return this.ork.ork();
            } catch (Throwable unused) {
            }
        }
        return 0L;
    }

    public void pcc(pcc.InterfaceC0094pcc interfaceC0094pcc) {
        if (interfaceC0094pcc == null) {
            return;
        }
        for (WeakReference<pcc.InterfaceC0094pcc> weakReference : this.gm) {
            if (weakReference != null && weakReference.get() == interfaceC0094pcc) {
                return;
            }
        }
        this.gm.add(new WeakReference<>(interfaceC0094pcc));
    }

    public void pcc(int i) {
        if (kj()) {
            return;
        }
        this.lq = i;
    }

    public SurfaceHolder gpj() {
        return this.wh;
    }

    public SurfaceTexture lo() {
        return this.vj;
    }

    public void sf(int i) {
        this.kj = i;
    }

    public boolean pcc(float f) {
        PlaybackParams playbackParams;
        if (f <= 0.0f) {
            return false;
        }
        try {
            if (this.ork == null || !gm()) {
                return false;
            }
            try {
                playbackParams = this.ork.vj();
            } catch (Throwable th) {
                lo.gm("CSJ_VIDEO_MEDIA", "getPlaybackParams error:" + th.getMessage());
                playbackParams = null;
            }
            if ((playbackParams != null ? playbackParams.getSpeed() : 0.0f) == f) {
                return true;
            }
            com.bykv.vk.openvk.pcc.pcc.pcc.sf sfVar = new com.bykv.vk.openvk.pcc.pcc.pcc.sf();
            sfVar.pcc(f);
            this.ork.pcc(sfVar);
            return true;
        } catch (Throwable th2) {
            lo.pcc("CSJ_VIDEO_MEDIA", "setPlaySpeedRatio error: ", th2);
            return false;
        }
    }

    class pcc implements Runnable {
        private boolean gm;
        private long sf;

        pcc() {
        }

        public void pcc(boolean z) {
            this.gm = z;
        }

        public void pcc(long j) {
            this.sf = j;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (oo.this.ork != null) {
                try {
                    if (!this.gm) {
                        long ork = oo.this.ork.ork();
                        oo.this.jr = Math.max(this.sf, ork);
                    }
                    long unused = oo.this.jr;
                } catch (Throwable th) {
                    new StringBuilder("[video] MediaPlayerProxy#start  error: getCurrentPosition :").append(th);
                }
            }
            if (oo.this.dax != null) {
                oo.this.dax.sendEmptyMessageDelayed(100, 0L);
            }
        }
    }
}
