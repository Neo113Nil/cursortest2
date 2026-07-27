package com.bytedance.sdk.component.vj.sf.gm;

import android.content.Context;
import android.graphics.Bitmap;
import android.widget.ImageView;
import com.bytedance.sdk.component.vj.fum;
import com.bytedance.sdk.component.vj.hc;
import com.bytedance.sdk.component.vj.lo;
import com.bytedance.sdk.component.vj.lu;
import com.bytedance.sdk.component.vj.nac;
import java.io.File;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ExecutorService;

/* loaded from: classes4.dex */
public class wh {
    private volatile nac gm;
    private ExecutorService kj;
    private volatile lu oo;
    private ExecutorService qf;
    private final hc sf;
    private Context vy;
    private com.bytedance.sdk.component.vj.oo wh;
    private Map<String, List<gm>> pcc = new ConcurrentHashMap();
    private Map<String, com.bytedance.sdk.component.vj.gm> vj = new ConcurrentHashMap();

    public wh(Context context, hc hcVar) {
        this.sf = (hc) qf.pcc(hcVar);
        this.vy = context;
        com.bytedance.sdk.component.vj.sf.gm.pcc.sf.pcc(context, hcVar.vj());
    }

    public Context pcc() {
        return this.vy;
    }

    public boolean sf() {
        return this.sf.qf();
    }

    public lu gm() {
        return this.oo;
    }

    public Collection<com.bytedance.sdk.component.vj.gm> oo() {
        return this.vj.values();
    }

    public nac pcc(com.bytedance.sdk.component.vj.sf sfVar) {
        if (sfVar == null) {
            sfVar = com.bytedance.sdk.component.vj.sf.gm.pcc.sf.vy();
        }
        if (this.gm == null) {
            synchronized (com.bytedance.sdk.component.vj.sf.gm.pcc.sf.gm.class) {
                if (this.gm == null) {
                    this.gm = new com.bytedance.sdk.component.vj.sf.gm.pcc.sf.gm(new com.bytedance.sdk.component.vj.sf.gm.pcc.sf.pcc(sfVar.sf(), sfVar.gm()));
                }
            }
        }
        return this.gm;
    }

    public lu sf(com.bytedance.sdk.component.vj.sf sfVar) {
        if (sfVar == null) {
            sfVar = com.bytedance.sdk.component.vj.sf.gm.pcc.sf.vy();
        }
        if (this.oo == null) {
            synchronized (com.bytedance.sdk.component.vj.sf.gm.pcc.sf.sf.class) {
                if (this.oo == null) {
                    this.oo = new com.bytedance.sdk.component.vj.sf.gm.pcc.sf.sf(sfVar.sf(), sfVar.oo());
                }
            }
        }
        return this.oo;
    }

    public com.bytedance.sdk.component.vj.gm gm(com.bytedance.sdk.component.vj.sf sfVar) {
        if (sfVar == null) {
            sfVar = com.bytedance.sdk.component.vj.sf.gm.pcc.sf.vy();
        }
        String file = sfVar.kj().toString();
        com.bytedance.sdk.component.vj.gm gmVar = this.vj.get(file);
        if (gmVar != null) {
            return gmVar;
        }
        com.bytedance.sdk.component.vj.gm oo = oo(sfVar);
        this.vj.put(file, oo);
        return oo;
    }

    public com.bytedance.sdk.component.vj.gm pcc(String str) {
        return gm(com.bytedance.sdk.component.vj.sf.gm.pcc.sf.pcc(new File(str)));
    }

    private com.bytedance.sdk.component.vj.gm oo(com.bytedance.sdk.component.vj.sf sfVar) {
        com.bytedance.sdk.component.vj.gm oo = this.sf.oo();
        return oo != null ? oo : new com.bytedance.sdk.component.vj.sf.gm.pcc.pcc.sf(sfVar.kj(), sfVar.pcc());
    }

    public com.bytedance.sdk.component.vj.oo vj() {
        if (this.wh == null) {
            this.wh = ork();
        }
        return this.wh;
    }

    private com.bytedance.sdk.component.vj.oo ork() {
        com.bytedance.sdk.component.vj.oo gm = this.sf.gm();
        return gm == null ? new com.bytedance.sdk.component.vj.pcc.pcc() : gm;
    }

    public ExecutorService wh() {
        ExecutorService pcc;
        lo sf = this.sf.sf();
        if (sf != null && (pcc = sf.pcc()) != null) {
            return pcc;
        }
        if (this.qf == null) {
            this.qf = vh();
        }
        return this.qf;
    }

    public fum qf() {
        hc hcVar = this.sf;
        if (hcVar != null) {
            return hcVar.wh();
        }
        return null;
    }

    public ExecutorService kj() {
        ExecutorService sf;
        lo sf2 = this.sf.sf();
        if (sf2 != null && (sf = sf2.sf()) != null) {
            return sf;
        }
        if (this.kj == null) {
            this.kj = com.bytedance.sdk.component.vj.sf.pcc.sf.pcc();
        }
        return this.kj;
    }

    private ExecutorService vh() {
        ExecutorService pcc = this.sf.pcc();
        return pcc != null ? pcc : com.bytedance.sdk.component.vj.sf.pcc.sf.pcc();
    }

    public Map<String, List<gm>> vy() {
        return this.pcc;
    }

    public com.bytedance.sdk.component.vj.sf.gm.sf.sf pcc(gm gmVar) {
        ImageView.ScaleType vy = gmVar.vy();
        if (vy == null) {
            vy = com.bytedance.sdk.component.vj.sf.gm.sf.sf.pcc;
        }
        ImageView.ScaleType scaleType = vy;
        Bitmap.Config ork = gmVar.ork();
        if (ork == null) {
            ork = com.bytedance.sdk.component.vj.sf.gm.sf.sf.sf;
        }
        return new com.bytedance.sdk.component.vj.sf.gm.sf.sf(gmVar.sf(), gmVar.gm(), scaleType, ork, gmVar.oo(), gmVar.vj());
    }
}
