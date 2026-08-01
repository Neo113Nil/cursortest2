package com.bytedance.sdk.openadsdk.core.widget;

import android.content.Context;
import android.os.SystemClock;
import com.bytedance.sdk.openadsdk.core.model.of;

/* loaded from: classes4.dex */
public class ork extends qf {
    private long pcc;
    private long sf;

    @Override // com.bytedance.sdk.openadsdk.core.widget.qf
    protected boolean pcc() {
        return false;
    }

    public ork(Context context) {
        super(context);
        setVisibility(8);
        setClickable(true);
    }

    public void gm() {
        setVisibility(8);
        if (this.pcc != 0) {
            this.sf = SystemClock.elapsedRealtime();
        }
    }

    public void sf(of ofVar, int i) {
        if (isShown()) {
            return;
        }
        sf();
        setVisibility(0);
        this.pcc = SystemClock.elapsedRealtime();
        pcc(ofVar, i);
    }

    public boolean oo() {
        return this.pcc > 0 && this.sf > 0;
    }

    public long getDisplayDuration() {
        if (this.pcc == 0) {
            return 0L;
        }
        if (this.sf == 0) {
            this.sf = SystemClock.elapsedRealtime();
        }
        return this.sf - this.pcc;
    }
}
