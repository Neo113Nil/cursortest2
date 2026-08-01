package com.bytedance.sdk.openadsdk.activity.single;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import com.bytedance.sdk.openadsdk.activity.single.sf;
import com.bytedance.sdk.openadsdk.core.model.atb;
import com.bytedance.sdk.openadsdk.core.model.of;
import java.util.List;
import java.util.Map;

/* loaded from: classes4.dex */
public abstract class gm {
    protected String gm;
    protected final sf oo;
    protected final Activity pcc;
    protected final of sf;
    protected String vj;

    public void dax() {
    }

    public vj gbb() {
        return null;
    }

    public void gm() {
    }

    public abstract void gpj();

    public kj hc() {
        return null;
    }

    public abstract List<of> jr();

    public abstract int kj();

    public abstract void lu();

    public void nac() {
    }

    public boolean oo() {
        return false;
    }

    public abstract int ork();

    public void pcc() {
    }

    public void pcc(float f) {
    }

    public abstract void pcc(int i);

    public void pcc(int i, int i2) {
    }

    public void pcc(Activity activity) {
    }

    public void pcc(Bundle bundle) {
    }

    public void pcc(View view) {
    }

    public void pcc(View view, boolean z) {
    }

    public void pcc(kj kjVar) {
    }

    public void pcc(kj kjVar, kj kjVar2, sf.vj vjVar) {
    }

    public void pcc(kj kjVar, sf.vj vjVar) {
    }

    public void pcc(kj kjVar, boolean z) {
    }

    public void pcc(kj kjVar, boolean z, boolean z2, boolean z3, int i) {
    }

    public void pcc(pcc pccVar, boolean z) {
    }

    public void pcc(Map<String, Object> map, kj kjVar, float f, float f2) {
    }

    public void pcc(boolean z) {
    }

    public abstract boolean pcc(kj kjVar, int i);

    public void qf() {
    }

    public void sf() {
    }

    public void sf(Activity activity) {
    }

    public abstract void sf(kj kjVar, int i);

    public abstract com.bytedance.sdk.openadsdk.component.reward.top.gm tmg();

    public kj vh() {
        return null;
    }

    public boolean vj() {
        return true;
    }

    public void vy() {
    }

    public void wh() {
    }

    public gm(Activity activity, of ofVar, sf sfVar) {
        this.pcc = activity;
        this.sf = ofVar;
        if (ofVar != null) {
            this.gm = atb.yt(ofVar);
        }
        if (activity != null) {
            this.vj = String.valueOf(activity.hashCode());
        }
        this.oo = sfVar;
    }
}
