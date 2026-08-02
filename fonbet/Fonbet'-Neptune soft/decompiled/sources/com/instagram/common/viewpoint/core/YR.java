package com.instagram.common.viewpoint.core;

import android.view.View;

/* loaded from: assets/audience_network.dex */
public class YR implements View.OnClickListener {
    public final /* synthetic */ LZ A00;

    public YR(LZ lz) {
        this.A00 = lz;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        YT yt;
        if (AbstractC0832Vl.A02(this)) {
            return;
        }
        try {
            yt = this.A00.A07;
            yt.ADH();
        } catch (Throwable th) {
            AbstractC0832Vl.A00(th, this);
        }
    }
}
