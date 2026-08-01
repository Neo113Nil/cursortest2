package com.bytedance.sdk.component.vj.sf.sf;

import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import com.bytedance.sdk.component.utils.vh;
import com.bytedance.sdk.component.vj.gpj;
import com.bytedance.sdk.component.vj.sf.gm.sf.pcc;

/* loaded from: classes4.dex */
public class oo<T> implements wh {
    @Override // com.bytedance.sdk.component.vj.sf.sf.wh
    public boolean pcc(com.bytedance.sdk.component.vj.sf.gm.gm gmVar, gpj gpjVar, com.bytedance.sdk.component.vj.sf.gm.pcc pccVar) {
        byte[] hc = gmVar.hc();
        if (hc == null) {
            pccVar.pcc(2000, "imageData is empty", new Exception("imageData is empty"));
            return false;
        }
        int vh = gmVar.vh();
        gmVar.pcc(hc.length);
        if (vh == 2) {
            boolean z = (com.bytedance.sdk.component.utils.wh.sf(hc) || vh.pcc(hc, 0)) ? false : true;
            if (com.bytedance.sdk.component.utils.wh.pcc(hc)) {
                pcc(gmVar, hc, z, pccVar);
            } else {
                pccVar.pcc(1001, "result type is bit but data not image", new Exception("not image format"));
            }
        } else if (vh == 3) {
            pccVar.pcc(new com.bytedance.sdk.component.vj.sf.gm.oo().pcc(gmVar, hc, null, com.bytedance.sdk.component.utils.wh.sf(hc)));
        } else if (com.bytedance.sdk.component.utils.wh.sf(hc)) {
            sf(gmVar, hc, pccVar);
        } else if (vh.pcc(hc, 0)) {
            pcc(gmVar, hc, pccVar);
        } else if (com.bytedance.sdk.component.utils.wh.pcc(hc)) {
            pcc(gmVar, hc, true, pccVar);
        } else {
            pccVar.pcc(1001, "is not supprot image type", new Exception("not supprot image type"));
        }
        return false;
    }

    private void pcc(final com.bytedance.sdk.component.vj.sf.gm.gm gmVar, final byte[] bArr, final com.bytedance.sdk.component.vj.sf.gm.pcc pccVar) {
        try {
            new com.bytedance.sdk.component.vj.sf.gm.sf.pcc().pcc(bArr, new pcc.InterfaceC0132pcc() { // from class: com.bytedance.sdk.component.vj.sf.sf.oo.1
                @Override // com.bytedance.sdk.component.vj.sf.gm.sf.pcc.InterfaceC0132pcc
                public void pcc(Drawable drawable) {
                    pccVar.pcc(new com.bytedance.sdk.component.vj.sf.gm.oo().pcc(gmVar, drawable, null, false));
                }

                @Override // com.bytedance.sdk.component.vj.sf.gm.sf.pcc.InterfaceC0132pcc
                public void pcc() {
                    pccVar.pcc(1002, "decode webp animate fail", new Exception("decode webp animate fail"));
                }

                @Override // com.bytedance.sdk.component.vj.sf.gm.sf.pcc.InterfaceC0132pcc
                public void pcc(byte[] bArr2) {
                    if (com.bytedance.sdk.component.utils.wh.pcc(bArr)) {
                        oo.this.pcc(gmVar, bArr, true, pccVar);
                    } else {
                        pccVar.pcc(1001, "result type is webp animated but data not image", new Exception("webp animated not image format"));
                    }
                }
            });
        } catch (Throwable th) {
            pccVar.pcc(2000, "decode webp animation error", th);
        }
    }

    private void sf(final com.bytedance.sdk.component.vj.sf.gm.gm gmVar, final byte[] bArr, final com.bytedance.sdk.component.vj.sf.gm.pcc pccVar) {
        try {
            new com.bytedance.sdk.component.vj.sf.gm.sf.pcc().pcc(bArr, gmVar.dax(), new pcc.InterfaceC0132pcc() { // from class: com.bytedance.sdk.component.vj.sf.sf.oo.2
                @Override // com.bytedance.sdk.component.vj.sf.gm.sf.pcc.InterfaceC0132pcc
                public void pcc(Drawable drawable) {
                    pccVar.pcc(new com.bytedance.sdk.component.vj.sf.gm.oo().pcc(gmVar, drawable, null, true));
                }

                @Override // com.bytedance.sdk.component.vj.sf.gm.sf.pcc.InterfaceC0132pcc
                public void pcc() {
                    pccVar.pcc(1002, "decode gif fail", new Exception("decode gif fail"));
                }

                @Override // com.bytedance.sdk.component.vj.sf.gm.sf.pcc.InterfaceC0132pcc
                public void pcc(byte[] bArr2) {
                    if (com.bytedance.sdk.component.utils.wh.pcc(bArr)) {
                        oo.this.pcc(gmVar, bArr, true, pccVar);
                    } else {
                        pccVar.pcc(1001, "result type is gif but data not image", new Exception("gif not image format"));
                    }
                }
            });
        } catch (Throwable th) {
            pccVar.pcc(2000, "decode gif error", th);
        }
    }

    @Override // com.bytedance.sdk.component.vj.sf.sf.wh
    public String pcc() {
        return "decode";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void pcc(com.bytedance.sdk.component.vj.sf.gm.gm gmVar, byte[] bArr, boolean z, com.bytedance.sdk.component.vj.sf.gm.pcc pccVar) {
        try {
            com.bytedance.sdk.component.vj.sf.gm.wh dax = gmVar.dax();
            Bitmap pcc = dax.pcc(gmVar).pcc(bArr, dax);
            if (pcc != null) {
                gmVar.kj();
                gmVar.pcc();
                pcc.getWidth();
                pcc.getHeight();
                pcc.getByteCount();
                pccVar.pcc(new com.bytedance.sdk.component.vj.sf.gm.oo().pcc(gmVar, pcc, null, false));
                if (z) {
                    pcc(gmVar.nac(), dax, gmVar.kj(), pcc);
                    return;
                }
                return;
            }
            gmVar.kj();
            gmVar.pcc();
            pccVar.pcc(1002, "decode failed bitmap null", new Exception("decode failed bitmap null"));
        } catch (Throwable th) {
            gmVar.kj();
            gmVar.pcc();
            pccVar.pcc(1002, "decode failed:" + th.getMessage(), th);
        }
    }

    private void pcc(com.bytedance.sdk.component.vj.sf sfVar, com.bytedance.sdk.component.vj.sf.gm.wh whVar, String str, Bitmap bitmap) {
        if (sfVar == null || whVar == null || !sfVar.vj()) {
            return;
        }
        whVar.pcc(sfVar).pcc(str, bitmap);
    }
}
