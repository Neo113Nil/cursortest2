package com.bytedance.sdk.component.adexpress.dynamic.animation.pcc;

import android.view.View;
import android.view.ViewGroup;

/* loaded from: classes4.dex */
public class gm {
    private static volatile gm pcc;

    private gm() {
    }

    public static gm pcc() {
        if (pcc == null) {
            synchronized (gm.class) {
                if (pcc == null) {
                    pcc = new gm();
                }
            }
        }
        return pcc;
    }

    public oo pcc(View view, com.bytedance.sdk.component.adexpress.dynamic.oo.pcc pccVar) {
        if (pccVar == null) {
            return null;
        }
        if (view.getParent() != null) {
            ((ViewGroup) view.getParent()).setClipChildren(false);
        }
        if (view.getParent().getParent() != null) {
            ((ViewGroup) view.getParent().getParent()).setClipChildren(false);
        }
        if ("scale".equals(pccVar.vy())) {
            return new vh(view, pccVar);
        }
        if ("translate".equals(pccVar.vy())) {
            return new jr(view, pccVar);
        }
        if ("ripple".equals(pccVar.vy())) {
            return new kj(view, pccVar);
        }
        if ("marquee".equals(pccVar.vy())) {
            return new qf(view, pccVar);
        }
        if ("waggle".equals(pccVar.vy())) {
            return new dax(view, pccVar);
        }
        if ("shine".equals(pccVar.vy())) {
            return new tmg(view, pccVar);
        }
        if ("swing".equals(pccVar.vy())) {
            return new gbb(view, pccVar);
        }
        if ("fade".equals(pccVar.vy())) {
            return new pcc(view, pccVar);
        }
        if ("rubIn".equals(pccVar.vy())) {
            return new ork(view, pccVar);
        }
        if ("rotate".equals(pccVar.vy())) {
            return new vy(view, pccVar);
        }
        if ("cutIn".equals(pccVar.vy())) {
            return new wh(view, pccVar);
        }
        if ("stretch".equals(pccVar.vy())) {
            return new hc(view, pccVar);
        }
        if ("bounce".equals(pccVar.vy())) {
            return new vj(view, pccVar);
        }
        return null;
    }
}
