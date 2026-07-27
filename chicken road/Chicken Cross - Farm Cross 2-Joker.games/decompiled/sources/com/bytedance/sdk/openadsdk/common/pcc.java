package com.bytedance.sdk.openadsdk.common;

import android.view.View;
import com.bytedance.sdk.openadsdk.core.mk;
import com.bytedance.sdk.openadsdk.core.model.atb;
import com.bytedance.sdk.openadsdk.core.model.of;
import com.bytedance.sdk.openadsdk.oo.vj.sf.jr;

/* loaded from: classes4.dex */
public class pcc {

    /* renamed from: com.bytedance.sdk.openadsdk.common.pcc$pcc, reason: collision with other inner class name */
    public interface InterfaceC0142pcc {
        void pcc(com.bytedance.sdk.openadsdk.component.reward.pcc.sf sfVar, View view);
    }

    public interface sf {
        void pcc();

        void pcc(boolean z, int i);
    }

    public static void pcc(final gbb gbbVar) {
        final com.bytedance.sdk.openadsdk.component.reward.pcc.sf pcc = gbbVar.pcc();
        if (pcc == null || pcc.mu == null) {
            return;
        }
        final View ork = pcc.mu.ork();
        View vh = pcc.mu.vh();
        final String sf2 = gbbVar.sf();
        View.OnClickListener onClickListener = new View.OnClickListener() { // from class: com.bytedance.sdk.openadsdk.common.pcc.1
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                pcc.sf(pcc, ork, sf2, gbbVar);
            }
        };
        View.OnClickListener onClickListener2 = new View.OnClickListener() { // from class: com.bytedance.sdk.openadsdk.common.pcc.2
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                pcc.sf(pcc, ork, sf2, gbbVar);
                com.bytedance.sdk.openadsdk.component.oo.sf.pcc("force_button_tracker", "click", pcc.sf);
            }
        };
        if (ork != null) {
            ork.setOnClickListener(onClickListener);
            ork.setTag(ork.getId(), onClickListener);
        }
        if (vh != null) {
            vh.setOnClickListener(onClickListener2);
            vh.setTag(vh.getId(), onClickListener2);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void sf(com.bytedance.sdk.openadsdk.component.reward.pcc.sf sfVar, View view, String str, gbb gbbVar) {
        if (sfVar == null || view == null || gbbVar == null || pcc(sfVar, view)) {
            return;
        }
        sfVar.ye.fum();
        sfVar.lq.vh();
        sfVar.jsj.wh();
        dax wh = gbbVar.wh();
        if (wh != null && atb.oo(sfVar.sf)) {
            boolean sf2 = sf(wh, sfVar, true, str);
            if (!(sfVar.ywp instanceof com.bytedance.sdk.openadsdk.activity.single.vj) || sf2) {
                return;
            }
            gbbVar.gm().run();
            return;
        }
        gbbVar.gm().run();
    }

    public static void sf(gbb gbbVar) {
        pcc(gbbVar);
        gbbVar.pcc().zti.pcc(gm(gbbVar));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static boolean sf(dax daxVar, com.bytedance.sdk.openadsdk.component.reward.pcc.sf sfVar, boolean z, String str) {
        if (daxVar == null) {
            return false;
        }
        boolean pcc = daxVar.pcc(atb.gm(sfVar.sf), z, null);
        if (pcc) {
            return true;
        }
        boolean z2 = sfVar.ywp instanceof com.bytedance.sdk.openadsdk.activity.single.vj;
        new Object[]{"handleTipDialogLogic: isEndCardScene=%s, dialogResult=%s", Boolean.valueOf(z2), Boolean.valueOf(pcc)};
        if (z2) {
            return ((com.bytedance.sdk.openadsdk.activity.single.vj) sfVar.ywp).kj();
        }
        return true;
    }

    private static com.bytedance.sdk.openadsdk.component.reward.top.sf gm(final gbb gbbVar) {
        final com.bytedance.sdk.openadsdk.component.reward.pcc.sf pcc = gbbVar.pcc();
        final String sf2 = gbbVar.sf();
        final sf oo = gbbVar.oo();
        final dax wh = gbbVar.wh();
        final boolean vj = gbbVar.vj();
        return new com.bytedance.sdk.openadsdk.component.reward.top.sf() { // from class: com.bytedance.sdk.openadsdk.common.pcc.3
            @Override // com.bytedance.sdk.openadsdk.component.reward.top.sf
            public void pcc(View view) {
                if (pcc.sf(wh, pcc, false, sf2)) {
                    return;
                }
                if (vj && pcc.sf(pcc, sf2, oo)) {
                    return;
                }
                pcc.pcc(pcc);
                pcc.pcc(pcc, oo);
            }

            @Override // com.bytedance.sdk.openadsdk.component.reward.top.sf
            public void pcc(View view, String str) {
                com.bytedance.sdk.openadsdk.component.reward.pcc.sf sfVar = pcc;
                if (sfVar == null) {
                    return;
                }
                pcc.pcc(sfVar, sfVar.ew, str);
            }

            @Override // com.bytedance.sdk.openadsdk.component.reward.top.sf
            public void sf(View view) {
                com.bytedance.sdk.openadsdk.component.reward.pcc.sf sfVar = pcc;
                if (sfVar == null || sfVar.mk == null || pcc.ew == null) {
                    return;
                }
                pcc.mk.pcc(pcc.ew);
            }

            @Override // com.bytedance.sdk.openadsdk.component.reward.top.sf
            public void gm(View view) {
                View ork;
                com.bytedance.sdk.openadsdk.component.reward.pcc.sf sfVar = pcc;
                if (sfVar == null || sfVar.mu == null || (ork = pcc.mu.ork()) == null) {
                    return;
                }
                ork.performClick();
            }

            @Override // com.bytedance.sdk.openadsdk.component.reward.top.sf
            public void oo(View view) {
                if (gbbVar.pcc() == null || gbbVar.qf() == null) {
                    return;
                }
                gbbVar.qf().pcc(gbbVar.pcc(), view);
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static boolean sf(com.bytedance.sdk.openadsdk.component.reward.pcc.sf sfVar, String str, sf sfVar2) {
        if (sfVar.ywp instanceof com.bytedance.sdk.openadsdk.activity.single.vj) {
            sfVar2.pcc();
            return true;
        }
        boolean kj = atb.kj(sfVar.sf);
        boolean wh = atb.wh(sfVar.sf);
        boolean vj = atb.vj(sfVar.sf);
        if (!wh && (!vj || !sfVar.of.oo(com.bytedance.sdk.openadsdk.component.reward.pcc.vy.sf))) {
            if (com.bytedance.sdk.openadsdk.core.model.lo.pcc(sfVar.sf) && !sfVar.hc.get()) {
                sfVar2.pcc();
                return true;
            }
            sfVar.zti.oo(false);
            return false;
        }
        if (kj) {
            sfVar.of.vy();
        } else {
            View ork = sfVar.mu.ork();
            if (ork != null) {
                ork.performClick();
            } else {
                sfVar2.pcc();
            }
        }
        return true;
    }

    private static boolean pcc(com.bytedance.sdk.openadsdk.component.reward.pcc.sf sfVar, View view) {
        if (!sfVar.ye.lo() || (!sfVar.gdh && !sfVar.vy.get())) {
            return false;
        }
        boolean hc = sfVar.lq.hc();
        sfVar.ye.wh(hc);
        sfVar.mu.wh(8);
        if (view instanceof com.bytedance.sdk.openadsdk.core.wh.oo) {
            ((com.bytedance.sdk.openadsdk.core.wh.oo) view).setImageResource(com.bytedance.sdk.component.utils.tz.oo(sfVar.kun, "tt_close_btn"));
        }
        sfVar.rj.sendEmptyMessageDelayed(600, 5000L);
        return !of.gm(sfVar.sf) || hc;
    }

    public static void pcc(com.bytedance.sdk.openadsdk.component.reward.pcc.sf sfVar) {
        if (sfVar == null) {
            return;
        }
        jr.pcc pccVar = new jr.pcc();
        pccVar.sf(sfVar.fum.hc());
        pccVar.oo(sfVar.fum.jsj());
        pccVar.gm(sfVar.fum.nac());
        pccVar.gm(3);
        pccVar.oo(sfVar.fum.qy());
        pccVar.pcc(sfVar.fum.sf());
        com.bytedance.sdk.openadsdk.oo.vj.pcc.pcc.pcc(sfVar.fum.kj(), pccVar, sfVar.fum.vj());
        mk.gm(sfVar.wh);
        sfVar.fum.pcc("skip", false);
    }

    public static void sf(com.bytedance.sdk.openadsdk.component.reward.pcc.sf sfVar) {
        com.bytedance.sdk.openadsdk.core.model.oo gto;
        com.bytedance.sdk.openadsdk.core.gbb.oo pcc;
        if (sfVar == null) {
            return;
        }
        if (sfVar.sf != null && (gto = sfVar.sf.gto()) != null && (pcc = gto.pcc()) != null) {
            long hc = sfVar.fum.hc();
            pcc.wh(hc);
            pcc.vj(hc);
        }
        com.bytedance.sdk.openadsdk.qy.sf.vj.pcc(sfVar.sf, 5);
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x002f, code lost:
    
        if (r3.hc.get() == false) goto L15;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void pcc(com.bytedance.sdk.openadsdk.component.reward.pcc.sf sfVar, sf sfVar2) {
        if (sfVar.gm) {
            if (com.bytedance.sdk.openadsdk.core.model.lo.gm(sfVar.sf)) {
                com.bytedance.sdk.openadsdk.component.reward.view.gm pcc = sfVar.yt.pcc();
                if (pcc == null || pcc.oo != 0) {
                    sfVar2.pcc(true, 4);
                }
            } else {
                sfVar2.pcc(true, 4);
                if (com.bytedance.sdk.openadsdk.core.model.lo.pcc(sfVar.sf)) {
                }
            }
            sf(sfVar);
        }
        sfVar2.pcc();
        sf(sfVar);
    }

    public static void pcc(com.bytedance.sdk.openadsdk.component.reward.pcc.sf sfVar, com.bytedance.sdk.openadsdk.component.reward.sf.sf sfVar2, String str) {
        if (sfVar == null || sfVar.ew == null) {
            return;
        }
        sfVar.xb = !sfVar.xb;
        boolean z = sfVar.ywp instanceof com.bytedance.sdk.openadsdk.activity.single.vj;
        if (sfVar.gdh && !z && sfVar.yt != null && sfVar.yt.pcc() != null) {
            sfVar.yt.pcc().setSoundMute(sfVar.xb);
        }
        sfVar.fum.pcc(sfVar.xb, str);
        sfVar.ye.vj(sfVar.xb);
        sfVar.of.sf(sfVar.xb);
        if (z) {
            return;
        }
        gm(sfVar);
    }

    private static void gm(com.bytedance.sdk.openadsdk.component.reward.pcc.sf sfVar) {
        com.bytedance.sdk.openadsdk.core.model.oo gto;
        if (sfVar == null || sfVar.sf == null || (gto = sfVar.sf.gto()) == null) {
            return;
        }
        com.bytedance.sdk.openadsdk.core.gbb.oo pcc = gto.pcc();
        long hc = sfVar.fum.hc();
        if (sfVar.xb) {
            pcc.kj(hc);
        } else {
            pcc.vy(hc);
        }
    }
}
