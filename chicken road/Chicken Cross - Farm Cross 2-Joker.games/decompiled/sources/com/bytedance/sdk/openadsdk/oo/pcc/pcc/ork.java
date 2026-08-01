package com.bytedance.sdk.openadsdk.oo.pcc.pcc;

import com.bytedance.pcc.pcc;
import java.util.HashSet;

/* loaded from: classes4.dex */
public abstract class ork<D> extends com.bytedance.pcc.pcc<D> {
    private static final HashSet<String> pcc;

    static {
        HashSet<String> hashSet = new HashSet<>();
        pcc = hashSet;
        hashSet.add("play_start");
        hashSet.add("feed_play");
        hashSet.add("feed_continue");
        hashSet.add("feed_pause");
        hashSet.add("feed_break");
        hashSet.add("feed_over");
    }

    public ork(String str, pcc.InterfaceC0116pcc<D> interfaceC0116pcc) {
        super(str, (pcc.InterfaceC0116pcc) interfaceC0116pcc);
    }

    public ork(String str, D d) {
        super(str, d);
    }

    @Override // com.bytedance.pcc.pcc
    public final int qf() {
        if ((this instanceof hc) || sf() == 1) {
            return 4;
        }
        boolean z = this instanceof vy;
        if (z) {
            if (pcc.contains(((vy) this).kj())) {
                return 3;
            }
        }
        return z ? 2 : 1;
    }
}
