package com.bytedance.sdk.openadsdk.core.gbb;

import android.util.Pair;
import android.view.View;
import com.iab.omid.library.bytedance2.adsession.AdEvents;
import com.iab.omid.library.bytedance2.adsession.AdSession;
import com.iab.omid.library.bytedance2.adsession.FriendlyObstructionPurpose;
import com.iab.omid.library.bytedance2.adsession.media.Position;
import com.iab.omid.library.bytedance2.adsession.media.VastProperties;
import java.util.Set;

/* loaded from: classes4.dex */
public class qf {
    protected String gm;
    protected VastProperties oo;
    private final AdSession vj;
    private final AdEvents wh;
    private boolean qf = false;
    protected boolean pcc = false;
    protected int sf = 0;

    void pcc(float f, boolean z) {
    }

    public void pcc(boolean z) {
    }

    public void pcc(boolean z, float f) {
    }

    void sf(int i) {
    }

    public qf(AdSession adSession, AdEvents adEvents, View view) {
        this.vj = adSession;
        this.wh = adEvents;
        this.gm = adSession.getAdSessionId();
        pcc(view);
    }

    void pcc(View view) {
        AdSession adSession;
        if (view == null || (adSession = this.vj) == null) {
            return;
        }
        adSession.registerAdView(view);
    }

    public void pcc(View view, FriendlyObstructionPurpose friendlyObstructionPurpose) {
        AdSession adSession = this.vj;
        if (adSession != null) {
            adSession.addFriendlyObstruction(view, friendlyObstructionPurpose, null);
        }
    }

    boolean pcc() {
        return this.pcc;
    }

    public void pcc(int i) {
        int i2;
        if (this.vj == null || this.wh == null || !vj.gm()) {
            return;
        }
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    if (i != 4 || (i2 = this.sf) == 0 || i2 == 4) {
                        return;
                    }
                    this.vj.finish();
                    this.pcc = false;
                } else {
                    if (this.qf) {
                        return;
                    }
                    int i3 = this.sf;
                    if (i3 != 1 && i3 != 2) {
                        return;
                    }
                    this.wh.impressionOccurred();
                    this.qf = true;
                }
            } else {
                if (this.sf != 0) {
                    return;
                }
                this.vj.start();
                if (this.oo == null) {
                    this.oo = VastProperties.createVastPropertiesForNonSkippableMedia(true, Position.STANDALONE);
                }
                this.wh.loaded(this.oo);
                this.pcc = true;
                this.oo = null;
            }
        } else {
            if (this.sf != 0) {
                return;
            }
            this.vj.start();
            this.wh.loaded();
            this.pcc = true;
        }
        this.sf = i;
    }

    void sf() {
        pcc(1);
    }

    void gm() {
        pcc(4);
    }

    public void oo() {
        pcc(3);
    }

    public void pcc(Set<Pair<View, FriendlyObstructionPurpose>> set) {
        for (Pair<View, FriendlyObstructionPurpose> pair : set) {
            pcc((View) pair.first, (FriendlyObstructionPurpose) pair.second);
        }
    }
}
