package com.bytedance.sdk.openadsdk.lo.pcc;

import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.text.TextUtils;
import android.widget.ImageView;
import com.bytedance.sdk.component.vj.dax;
import com.bytedance.sdk.component.vj.kj;
import com.bytedance.sdk.component.vj.ork;
import com.bytedance.sdk.component.vj.vh;
import com.bytedance.sdk.openadsdk.core.lu;
import com.bytedance.sdk.openadsdk.core.model.of;
import com.bytedance.sdk.openadsdk.ork.oo;
import com.bytedance.sdk.openadsdk.utils.rj;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import java.util.Map;

/* loaded from: classes4.dex */
public class pcc {

    /* renamed from: com.bytedance.sdk.openadsdk.lo.pcc.pcc$pcc, reason: collision with other inner class name */
    public interface InterfaceC0188pcc {
        void pcc(int i, String str, Throwable th);

        void pcc(String str, sf sfVar);
    }

    public void pcc(com.bytedance.sdk.openadsdk.lo.pcc pccVar, final InterfaceC0188pcc interfaceC0188pcc, int i, int i2, ImageView.ScaleType scaleType, String str, final int i3, of ofVar) {
        ork pcc = oo.pcc(pccVar.pcc).pcc(pccVar.sf).pcc(i).sf(i2).vj(rj.vj(lu.pcc())).oo(rj.gm(lu.pcc())).sf(str).pcc(scaleType).pcc(!TextUtils.isEmpty(str));
        if (i3 > 0 && Build.VERSION.SDK_INT >= 26) {
            pcc.gm(2).pcc(new kj() { // from class: com.bytedance.sdk.openadsdk.lo.pcc.pcc.1
                @Override // com.bytedance.sdk.component.vj.kj
                public Bitmap pcc(Bitmap bitmap) {
                    return com.bytedance.sdk.component.adexpress.oo.pcc.pcc(lu.pcc(), bitmap, i3);
                }
            });
        } else {
            pcc.gm(1);
        }
        pcc.pcc(new com.bytedance.sdk.openadsdk.ork.sf(ofVar, pccVar.pcc, new dax() { // from class: com.bytedance.sdk.openadsdk.lo.pcc.pcc.2
            @Override // com.bytedance.sdk.component.vj.dax
            public void pcc(vh vhVar) {
                pcc.this.pcc(vhVar, interfaceC0188pcc);
            }

            @Override // com.bytedance.sdk.component.vj.dax
            public void pcc(int i4, String str2, Throwable th) {
                pcc.this.pcc(i4, str2, th, interfaceC0188pcc);
            }
        }));
    }

    protected void pcc(vh vhVar, InterfaceC0188pcc interfaceC0188pcc) {
        if (interfaceC0188pcc != null) {
            Object sf = vhVar.sf();
            int pcc = pcc(vhVar);
            if (sf instanceof Drawable) {
                interfaceC0188pcc.pcc(vhVar.pcc(), new sf((Drawable) sf, pcc));
                return;
            }
            if (sf instanceof byte[]) {
                interfaceC0188pcc.pcc(vhVar.pcc(), new sf((byte[]) sf, pcc));
                return;
            }
            if (sf instanceof Bitmap) {
                interfaceC0188pcc.pcc(vhVar.pcc(), new sf((Bitmap) sf, vhVar.gm() instanceof Bitmap ? (Bitmap) vhVar.gm() : null, pcc));
            } else {
                interfaceC0188pcc.pcc(0, "not bitmap or gif result!", null);
            }
        }
    }

    private int pcc(vh vhVar) {
        Object obj;
        Map<String, String> oo = vhVar.oo();
        if (oo == null || (obj = oo.get(CampaignEx.JSON_KEY_IMAGE_SIZE)) == null || !(obj instanceof Integer)) {
            return 0;
        }
        return ((Integer) obj).intValue();
    }

    protected void pcc(int i, String str, Throwable th, InterfaceC0188pcc interfaceC0188pcc) {
        if (interfaceC0188pcc != null) {
            interfaceC0188pcc.pcc(i, str, th);
        }
    }
}
