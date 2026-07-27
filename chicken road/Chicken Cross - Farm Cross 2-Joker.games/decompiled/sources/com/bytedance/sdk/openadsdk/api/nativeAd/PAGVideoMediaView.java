package com.bytedance.sdk.openadsdk.api.nativeAd;

import android.content.Context;
import android.view.View;
import com.bytedance.sdk.openadsdk.core.gm.pcc;
import com.bytedance.sdk.openadsdk.core.jr.sf.wh;
import com.bytedance.sdk.openadsdk.core.model.of;
import com.bytedance.sdk.openadsdk.utils.oo;

/* loaded from: classes4.dex */
public class PAGVideoMediaView extends PAGMediaView implements pcc.InterfaceC0150pcc {
    private final com.bytedance.sdk.openadsdk.pcc.sf.pcc gm;
    private of oo;
    private wh sf;

    public PAGVideoMediaView(Context context, View view, com.bytedance.sdk.openadsdk.pcc.sf.pcc pccVar) {
        super(context);
        pcc(view);
        this.gm = pccVar;
    }

    private void pcc(View view) {
        if (view instanceof wh) {
            wh whVar = (wh) view;
            this.sf = whVar;
            addView(whVar, -1, -1);
        }
    }

    private void pcc() {
        wh whVar = this.sf;
        if (whVar != null) {
            whVar.jr();
        }
    }

    private boolean sf() {
        wh whVar = this.sf;
        if (whVar != null) {
            return whVar.hc();
        }
        return false;
    }

    public void handleInterruptVideo() {
        if (sf()) {
            return;
        }
        pcc();
    }

    @Override // com.bytedance.sdk.openadsdk.api.nativeAd.PAGMediaView
    public void setVideoAdListener(final PAGVideoAdListener pAGVideoAdListener) {
        com.bytedance.sdk.openadsdk.pcc.sf.pcc pccVar = this.gm;
        if (pccVar == null) {
            return;
        }
        pccVar.pcc(new PAGVideoAdListener() { // from class: com.bytedance.sdk.openadsdk.api.nativeAd.PAGVideoMediaView.1
            @Override // com.bytedance.sdk.openadsdk.api.nativeAd.PAGVideoAdListener
            public void onVideoAdPlay() {
                PAGVideoAdListener pAGVideoAdListener2 = pAGVideoAdListener;
                if (pAGVideoAdListener2 != null) {
                    pAGVideoAdListener2.onVideoAdPlay();
                }
            }

            @Override // com.bytedance.sdk.openadsdk.api.nativeAd.PAGVideoAdListener
            public void onVideoAdPaused() {
                PAGVideoAdListener pAGVideoAdListener2 = pAGVideoAdListener;
                if (pAGVideoAdListener2 != null) {
                    pAGVideoAdListener2.onVideoAdPaused();
                }
            }

            @Override // com.bytedance.sdk.openadsdk.api.nativeAd.PAGVideoAdListener
            public void onVideoAdComplete() {
                PAGVideoAdListener pAGVideoAdListener2 = pAGVideoAdListener;
                if (pAGVideoAdListener2 != null) {
                    pAGVideoAdListener2.onVideoAdComplete();
                }
            }

            @Override // com.bytedance.sdk.openadsdk.api.nativeAd.PAGVideoAdListener
            public void onVideoError() {
                PAGVideoAdListener pAGVideoAdListener2 = pAGVideoAdListener;
                if (pAGVideoAdListener2 != null) {
                    pAGVideoAdListener2.onVideoError();
                }
            }
        });
    }

    @Override // android.view.View
    public void setOnClickListener(View.OnClickListener onClickListener) {
        super.setOnClickListener(onClickListener);
        if (onClickListener instanceof pcc) {
            ((pcc) onClickListener).pcc((pcc.InterfaceC0150pcc) this);
        }
    }

    @Override // com.bytedance.sdk.openadsdk.api.nativeAd.PAGMediaView
    public void close() {
        wh whVar = this.sf;
        if (whVar != null) {
            whVar.dax();
        }
    }

    @Override // com.bytedance.sdk.openadsdk.core.gm.pcc.InterfaceC0150pcc
    public long getVideoProgress() {
        wh whVar = this.sf;
        if (whVar == null || whVar.getNativeVideoController() == null) {
            return 0L;
        }
        return this.sf.getNativeVideoController().wh();
    }

    public void setMaterialMeta(of ofVar) {
        this.oo = ofVar;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        oo.pcc(this, this.oo);
    }
}
