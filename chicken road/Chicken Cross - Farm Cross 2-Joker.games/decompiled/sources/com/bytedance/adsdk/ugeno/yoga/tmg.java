package com.bytedance.adsdk.ugeno.yoga;

/* loaded from: classes4.dex */
public class tmg extends YogaNodeJNIBase {
    protected void finalize() throws Throwable {
        try {
            hc();
        } finally {
            super.finalize();
        }
    }

    public void hc() {
        if (this.pcc != 0) {
            long j = this.pcc;
            this.pcc = 0L;
            YogaNative.jni_YGNodeFinalizeJNI(j);
        }
    }
}
