package com.bytedance.sdk.openadsdk.core.ork;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import com.bytedance.sdk.openadsdk.TTDislikeDialogAbstract;
import com.bytedance.sdk.openadsdk.activity.single.TTDelegateActivity;
import com.bytedance.sdk.openadsdk.core.jr.sf.wh;
import com.bytedance.sdk.openadsdk.core.ye;
import com.bytedance.sdk.openadsdk.utils.kun;
import com.bytedance.sdk.openadsdk.utils.rj;

/* loaded from: classes4.dex */
public abstract class pcc extends com.bytedance.sdk.openadsdk.core.wh.gm {
    protected com.bytedance.sdk.openadsdk.core.model.of gm;
    protected int kj;
    protected com.bytedance.sdk.openadsdk.gm.gm oo;
    protected boolean ork;
    private com.bytedance.sdk.openadsdk.oo.qf pcc;
    protected int qf;
    protected Context sf;
    protected String vh;
    protected TTDislikeDialogAbstract vj;
    protected boolean vy;
    protected String wh;

    protected abstract void pcc(View view, int i, com.bytedance.sdk.openadsdk.core.model.dax daxVar);

    public pcc(Context context) {
        super(context);
        this.wh = "embeded_ad";
        this.vy = true;
        this.ork = true;
        setTag("tt_express_backup_fl_tag_26");
    }

    @Override // android.view.View
    public Object getTag() {
        return "tt_express_backup_fl_tag_26";
    }

    @Override // android.view.View
    public void setTag(Object obj) {
        super.setTag("tt_express_backup_fl_tag_26");
    }

    public void setDislikeInner(ye yeVar) {
        if (yeVar instanceof com.bytedance.sdk.openadsdk.gm.gm) {
            this.oo = (com.bytedance.sdk.openadsdk.gm.gm) yeVar;
        }
    }

    public void setDislikeOuter(TTDislikeDialogAbstract tTDislikeDialogAbstract) {
        com.bytedance.sdk.openadsdk.core.model.of ofVar;
        if (tTDislikeDialogAbstract != null && (ofVar = this.gm) != null) {
            tTDislikeDialogAbstract.setMaterialMeta(ofVar.hl(), this.gm.ywc());
        }
        this.vj = tTDislikeDialogAbstract;
    }

    public void pcc() {
        TTDislikeDialogAbstract tTDislikeDialogAbstract = this.vj;
        if (tTDislikeDialogAbstract != null) {
            tTDislikeDialogAbstract.show();
            return;
        }
        com.bytedance.sdk.openadsdk.gm.gm gmVar = this.oo;
        if (gmVar != null) {
            gmVar.pcc();
        } else {
            TTDelegateActivity.pcc(this.gm, (String) null);
        }
    }

    protected String getNameOrSource() {
        com.bytedance.sdk.openadsdk.core.model.of ofVar = this.gm;
        if (ofVar == null) {
            return "";
        }
        if (ofVar.xfm() == null || TextUtils.isEmpty(this.gm.xfm().sf())) {
            return !TextUtils.isEmpty(this.gm.ofe()) ? this.gm.ofe() : "";
        }
        return this.gm.xfm().sf();
    }

    protected String getTitle() {
        if (this.gm.xfm() != null && !TextUtils.isEmpty(this.gm.xfm().sf())) {
            return this.gm.xfm().sf();
        }
        if (!TextUtils.isEmpty(this.gm.ofe())) {
            return this.gm.ofe();
        }
        if (!TextUtils.isEmpty(this.gm.gmh())) {
            return this.gm.gmh();
        }
        return "";
    }

    protected String getDescription() {
        if (!TextUtils.isEmpty(this.gm.gmh())) {
            return this.gm.gmh();
        }
        if (!TextUtils.isEmpty(this.gm.lc())) {
            return this.gm.lc();
        }
        return "";
    }

    public float getRealWidth() {
        return rj.gm(this.sf, this.qf);
    }

    public float getRealHeight() {
        return rj.gm(this.sf, this.kj);
    }

    protected void pcc(View view, boolean z) {
        com.bytedance.sdk.openadsdk.core.gm.sf sfVar;
        if (view == null) {
            return;
        }
        if (z) {
            Context context = this.sf;
            com.bytedance.sdk.openadsdk.core.model.of ofVar = this.gm;
            String str = this.wh;
            sfVar = new com.bytedance.sdk.openadsdk.core.gm.pcc(context, ofVar, str, kun.pcc(str));
        } else {
            Context context2 = this.sf;
            com.bytedance.sdk.openadsdk.core.model.of ofVar2 = this.gm;
            String str2 = this.wh;
            sfVar = new com.bytedance.sdk.openadsdk.core.gm.sf(context2, ofVar2, str2, kun.pcc(str2));
        }
        view.setOnTouchListener(sfVar);
        view.setOnClickListener(sfVar);
        sfVar.pcc(new sf() { // from class: com.bytedance.sdk.openadsdk.core.ork.pcc.1
            @Override // com.bytedance.sdk.openadsdk.core.ork.sf
            public void pcc(View view2, int i, com.bytedance.sdk.openadsdk.core.model.dax daxVar) {
                pcc.this.pcc(view2, i, daxVar);
            }
        });
    }

    protected com.bytedance.sdk.openadsdk.core.jr.sf.wh getVideoView() {
        com.bytedance.sdk.openadsdk.core.jr.sf.wh whVar;
        com.bytedance.sdk.openadsdk.core.model.of ofVar = this.gm;
        if (ofVar != null && this.sf != null) {
            if (com.bytedance.sdk.openadsdk.core.model.of.vj(ofVar)) {
                try {
                    whVar = new com.bytedance.sdk.openadsdk.core.jr.sf.wh(this.sf, this.gm, this.wh, true, false, this.pcc);
                    whVar.setVideoCacheUrl(this.vh);
                    whVar.setControllerStatusCallBack(new wh.sf() { // from class: com.bytedance.sdk.openadsdk.core.ork.pcc.2
                        @Override // com.bytedance.sdk.openadsdk.core.jr.sf.wh.sf
                        public void pcc(boolean z, long j, long j2, long j3, boolean z2) {
                        }
                    });
                    whVar.setIsAutoPlay(this.vy);
                    whVar.pcc(this.ork, "bannerGetVideoView");
                } catch (Throwable unused) {
                }
                if (!com.bytedance.sdk.openadsdk.core.model.of.vj(this.gm) && whVar != null && whVar.pcc(0L, true, false)) {
                    return whVar;
                }
            }
            whVar = null;
            if (!com.bytedance.sdk.openadsdk.core.model.of.vj(this.gm)) {
            }
        }
        return null;
    }

    protected void pcc(View view) {
        com.bytedance.sdk.openadsdk.core.model.of ofVar = this.gm;
        if (ofVar == null || ofVar.kez() == null || view == null) {
            return;
        }
        pcc(view, this.gm.ra() == 1 && this.vy);
    }
}
