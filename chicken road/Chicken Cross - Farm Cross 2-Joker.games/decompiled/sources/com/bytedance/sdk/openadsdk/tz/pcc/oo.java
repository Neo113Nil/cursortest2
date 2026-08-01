package com.bytedance.sdk.openadsdk.tz.pcc;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.text.TextUtils;
import android.widget.FrameLayout;
import com.adjust.sdk.Constants;
import com.bytedance.sdk.openadsdk.core.lu;
import com.bytedance.sdk.openadsdk.core.model.atb;
import com.bytedance.sdk.openadsdk.core.model.of;
import com.bytedance.sdk.openadsdk.hc.qf;
import com.bytedance.sdk.openadsdk.tz.pcc.pcc;
import com.bytedance.sdk.openadsdk.utils.kun;
import com.bytedance.sdk.openadsdk.utils.rnn;
import com.bytedance.sdk.openadsdk.yt.vj;
import java.util.ArrayList;

/* loaded from: classes4.dex */
public class oo {
    private static volatile oo sf;
    private final Handler pcc;
    private int gm = 0;
    private int oo = 2;
    private int vj = Constants.ONE_HOUR;
    private final ArrayList<sf> wh = new ArrayList<>();

    public static oo pcc() {
        if (sf == null) {
            synchronized (oo.class) {
                if (sf == null) {
                    sf = new oo();
                }
            }
        }
        return sf;
    }

    private oo() {
        rnn.gm((Runnable) new com.bytedance.sdk.component.kj.sf.gm("pag_pre_render_init") { // from class: com.bytedance.sdk.openadsdk.tz.pcc.oo.1
            @Override // java.lang.Runnable
            public void run() {
                oo.this.gm = vj.pcc("plb_pre_render_enable", 0);
                oo.this.oo = vj.pcc("plb_pre_render_max_count", 2);
                if (oo.this.oo <= 0 || oo.this.oo > 4) {
                    oo.this.oo = 2;
                }
                oo.this.vj = vj.pcc("plb_pre_render_alive_time", Constants.ONE_HOUR);
                if (oo.this.vj <= 0 || oo.this.vj > 3600000) {
                    oo.this.vj = Constants.ONE_HOUR;
                }
            }
        });
        this.pcc = new Handler(Looper.getMainLooper(), new Handler.Callback() { // from class: com.bytedance.sdk.openadsdk.tz.pcc.oo.2
            @Override // android.os.Handler.Callback
            public boolean handleMessage(Message message) {
                if (!(message.obj instanceof sf)) {
                    return false;
                }
                oo.this.wh.remove(message.obj);
                ((sf) message.obj).oo();
                return true;
            }
        });
    }

    public void pcc(final of ofVar) {
        if (sf() && ofVar != null && atb.wh(ofVar)) {
            final String qxv = ofVar.qxv();
            if (TextUtils.isEmpty(qxv)) {
                return;
            }
            rnn.pcc(new Runnable() { // from class: com.bytedance.sdk.openadsdk.tz.pcc.oo.3
                @Override // java.lang.Runnable
                public void run() {
                    try {
                        if (oo.this.wh.size() >= oo.this.oo) {
                            new Object[]{"inUse size is : ", Integer.valueOf(oo.this.wh.size()), ", recycle last old plb"};
                            sf sfVar = (sf) oo.this.wh.remove(0);
                            if (sfVar != null) {
                                oo.this.pcc.removeMessages(sfVar.vy().hashCode());
                                sfVar.oo();
                            }
                        }
                        ofVar.dax(true);
                        Context pcc = lu.pcc();
                        of ofVar2 = ofVar;
                        final sf sfVar2 = new sf(pcc, ofVar2, ofVar2.ial(), true, new FrameLayout(lu.pcc()), qxv);
                        oo.this.wh.add(sfVar2);
                        sfVar2.kj();
                        Message obtain = Message.obtain();
                        obtain.what = qxv.hashCode();
                        obtain.obj = sfVar2;
                        oo.this.pcc.sendMessageDelayed(obtain, oo.this.vj);
                        sfVar2.pcc(new pcc.sf() { // from class: com.bytedance.sdk.openadsdk.tz.pcc.oo.3.1
                            @Override // com.bytedance.sdk.openadsdk.tz.pcc.pcc.sf
                            public void pcc() {
                                oo.this.pcc.removeMessages(qxv.hashCode());
                                oo.this.wh.remove(sfVar2);
                                sfVar2.oo();
                            }
                        });
                        of ofVar3 = ofVar;
                        com.bytedance.sdk.openadsdk.oo.gm.pcc(ofVar3, kun.gm(ofVar3.gqd().getDurationSlotType()), "PL_start_pre_render", 1);
                    } catch (Throwable th) {
                        new Object[]{"preRenderPlayable exception is ", th.getMessage()};
                    }
                }
            });
        }
    }

    public sf pcc(of ofVar, FrameLayout frameLayout, qf qfVar) {
        sf sfVar;
        if (sf() && ofVar.gqd() != null && !TextUtils.isEmpty(ofVar.gqd().getBidAdm()) && atb.wh(ofVar) && frameLayout != null) {
            String qxv = ofVar.qxv();
            if (TextUtils.isEmpty(qxv)) {
                return null;
            }
            int i = 0;
            while (true) {
                if (i >= this.wh.size()) {
                    i = -1;
                    sfVar = null;
                    break;
                }
                sfVar = this.wh.get(i);
                if (qxv.equals(sfVar.vy())) {
                    break;
                }
                i++;
            }
            if (sfVar != null) {
                this.pcc.removeMessages(qxv.hashCode());
                this.wh.remove(i);
                new Object[]{"getPreRenderPlayable success, size:", Integer.valueOf(this.wh.size())};
                ofVar.dax(true);
                sfVar.pcc(frameLayout, qfVar);
                com.bytedance.sdk.openadsdk.oo.gm.pcc(ofVar, kun.gm(ofVar.gqd().getDurationSlotType()), "PL_use_pre_render", 1);
                return sfVar;
            }
        }
        return null;
    }

    public boolean sf() {
        return this.gm == 1;
    }
}
