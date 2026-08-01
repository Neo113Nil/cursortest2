package com.bytedance.sdk.openadsdk.core.oo;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.sdk.openadsdk.core.model.tz;
import com.bytedance.sdk.openadsdk.core.oo.wh;
import com.bytedance.sdk.openadsdk.utils.rj;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes4.dex */
public class vj {
    private final wh.pcc kj;
    private tz pcc;
    private final View.OnAttachStateChangeListener qf;
    private wh sf;
    private final wh.sf wh;
    private List<pcc> gm = new ArrayList();
    private final String oo = "BannerSwiperManager";
    private int vj = -1;

    public vj(tz tzVar, Context context, int i, int i2) {
        wh.sf sfVar = new wh.sf() { // from class: com.bytedance.sdk.openadsdk.core.oo.vj.1
            @Override // com.bytedance.sdk.openadsdk.core.oo.wh.sf
            public void pcc(boolean z) {
                try {
                    if (!z) {
                        vj.this.gm();
                    } else {
                        vj.this.oo();
                    }
                } catch (Throwable unused) {
                }
            }
        };
        this.wh = sfVar;
        View.OnAttachStateChangeListener onAttachStateChangeListener = new View.OnAttachStateChangeListener() { // from class: com.bytedance.sdk.openadsdk.core.oo.vj.2
            @Override // android.view.View.OnAttachStateChangeListener
            public void onViewAttachedToWindow(View view) {
                vj.this.vj();
            }

            @Override // android.view.View.OnAttachStateChangeListener
            public void onViewDetachedFromWindow(View view) {
                if (vj.this.gm != null && !vj.this.gm.isEmpty()) {
                    for (int i3 = 0; i3 < vj.this.gm.size(); i3++) {
                        ((pcc) vj.this.gm.get(i3)).wh();
                    }
                }
                vj.this.vj = -1;
                if (vj.this.sf != null) {
                    vj.this.sf.oo();
                }
            }
        };
        this.qf = onAttachStateChangeListener;
        wh.pcc pccVar = new wh.pcc() { // from class: com.bytedance.sdk.openadsdk.core.oo.vj.3
            @Override // com.bytedance.sdk.openadsdk.core.oo.wh.pcc
            public void pcc(boolean z) {
                if (!z) {
                    vj.this.gm();
                } else {
                    vj.this.oo();
                }
            }
        };
        this.kj = pccVar;
        this.pcc = tzVar;
        wh whVar = new wh(context);
        this.sf = whVar;
        whVar.addOnAttachStateChangeListener(onAttachStateChangeListener);
        this.sf.setSwiperWindowFocusChangedListener(sfVar);
        this.sf.setSwiperVisibleChangeListener(pccVar);
        pcc(context, i, i2);
    }

    protected void pcc(Context context, float f, float f2) {
        int sf = rj.sf(context, f);
        int sf2 = rj.sf(context, f2);
        ViewGroup.LayoutParams layoutParams = this.sf.getLayoutParams();
        if (layoutParams == null) {
            layoutParams = new ViewGroup.LayoutParams(sf, sf2);
        }
        layoutParams.width = sf;
        layoutParams.height = sf2;
        this.sf.setLayoutParams(layoutParams);
    }

    public void pcc(List<pcc> list) {
        this.gm = list;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void gm() {
        wh whVar;
        tz tzVar = this.pcc;
        if (tzVar != null && tzVar.sf() == 1 && (whVar = this.sf) != null) {
            whVar.wh();
        }
        if (this.vj >= 0) {
            sf(-1);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void oo() {
        wh whVar;
        tz tzVar = this.pcc;
        if (tzVar != null && tzVar.sf() == 1 && (whVar = this.sf) != null) {
            whVar.vj();
        }
        int i = this.vj;
        if (i >= 0) {
            pcc(i);
            sf(this.vj);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void vj() {
        if (this.pcc == null) {
            this.pcc = new tz();
        }
        this.sf.pcc(TextUtils.equals(this.pcc.pcc(), "vertical") ? 1 : 0).pcc("dot").gm(false).oo(this.pcc.oo() == 1).pcc(this.pcc.sf() == 1).gm(this.pcc.vy()).vj(this.pcc.ork() == 1).oo(this.pcc.kj()).sf(this.pcc.gm() == 1).vy(this.pcc.vj()).ork(this.pcc.wh()).kj(this.pcc.qf());
        this.sf.setOnPageChangeListener(new com.bytedance.adsdk.ugeno.wh.gm() { // from class: com.bytedance.sdk.openadsdk.core.oo.vj.4
            @Override // com.bytedance.adsdk.ugeno.wh.gm
            public void pcc(boolean z, int i, float f, int i2) {
            }

            @Override // com.bytedance.adsdk.ugeno.wh.gm
            public void pcc(boolean z, int i, int i2, boolean z2, boolean z3) {
                vj.this.gm(i);
                vj.this.vj = i;
                vj.this.pcc(i);
                vj.this.sf(i);
            }

            @Override // com.bytedance.adsdk.ugeno.wh.gm
            public void pcc(boolean z, int i) {
                if (i == 1 || i == 2) {
                    vj.this.sf(-1);
                } else if (i == 0) {
                    vj vjVar = vj.this;
                    vjVar.pcc(vjVar.vj);
                }
            }
        });
        sf(this.gm);
        this.sf.gm();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void gm(int i) {
        pcc pccVar;
        try {
            int i2 = this.vj;
            if (i2 != -1 && i2 != i && (pccVar = this.gm.get(i2)) != null) {
                pccVar.oo();
                pccVar.kj();
            }
            pcc pccVar2 = this.gm.get(i);
            if (pccVar2 != null) {
                pccVar2.vj();
            }
        } catch (Throwable unused) {
        }
    }

    public void pcc(final int i) {
        pcc pccVar;
        try {
            final int size = this.gm.size();
            if (i < size && (pccVar = this.gm.get(i)) != null) {
                pccVar.pcc(new com.bytedance.sdk.openadsdk.pcc.pcc.sf() { // from class: com.bytedance.sdk.openadsdk.core.oo.vj.5
                    @Override // com.bytedance.sdk.openadsdk.pcc.pcc.sf
                    public void pcc() {
                        int i2 = i + 1;
                        if (i2 >= size) {
                            return;
                        }
                        vj.this.pcc(i2);
                    }
                });
            }
        } catch (Throwable th) {
            th.getMessage();
        }
    }

    public void sf(int i) {
        pcc pccVar;
        for (int i2 = 0; i2 < this.gm.size(); i2++) {
            try {
                if (i2 != i && (pccVar = this.gm.get(i2)) != null) {
                    pccVar.vy();
                }
            } catch (Throwable th) {
                th.getMessage();
                return;
            }
        }
    }

    private void sf(List<pcc> list) {
        if (list == null || list.isEmpty()) {
            return;
        }
        for (int i = 0; i < list.size(); i++) {
            this.sf.pcc((wh) list.get(i).pcc());
        }
    }

    public void pcc() {
        if (this.sf != null) {
            try {
                List<pcc> list = this.gm;
                if (list != null && !list.isEmpty()) {
                    for (int i = 0; i < this.gm.size(); i++) {
                        this.gm.get(i).qf();
                    }
                }
                this.vj = -1;
                this.sf.oo();
                this.sf.setSwiperWindowFocusChangedListener(null);
                this.sf.setSwiperVisibleChangeListener(null);
                this.sf.removeOnAttachStateChangeListener(this.qf);
                this.sf = null;
            } catch (Throwable unused) {
            }
        }
    }

    public View sf() {
        return this.sf;
    }
}
