package com.bytedance.sdk.component.adexpress.wh;

import android.content.Context;
import android.graphics.Bitmap;
import android.text.TextUtils;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes4.dex */
public class ork extends com.bytedance.adsdk.sf.wh {
    private Map<String, Bitmap> pcc;
    private String sf;

    public void setAnimationsLoop(boolean z) {
    }

    public void setData(Map<String, String> map) {
    }

    public void setLottieAdDescMaxLength(int i) {
    }

    public void setLottieAdTitleMaxLength(int i) {
    }

    public void setLottieAppNameMaxLength(int i) {
    }

    public ork(Context context) {
        super(context);
        this.pcc = new HashMap();
    }

    public void setImageLottieTosPath(String str) {
        this.sf = str;
    }

    public void kj() {
        if (TextUtils.isEmpty(this.sf)) {
            return;
        }
        setProgress(0.0f);
        pcc(true);
        setAnimationFromUrl(this.sf);
        setImageAssetDelegate(new com.bytedance.adsdk.sf.oo() { // from class: com.bytedance.sdk.component.adexpress.wh.ork.1
            @Override // com.bytedance.adsdk.sf.oo
            public Bitmap pcc(final com.bytedance.adsdk.sf.ork orkVar) {
                final String kj = orkVar.kj();
                String ork = orkVar.ork();
                String vy = orkVar.vy();
                if (TextUtils.equals(kj, "image_0") && TextUtils.equals(vy, "Lark20201123-180048_2.png")) {
                    vy = "hand.png";
                }
                Bitmap bitmap = (Bitmap) ork.this.pcc.get(kj);
                if (bitmap != null) {
                    return bitmap;
                }
                new Object[]{"dirName is : ", ork, "fileName is : ", vy};
                if (TextUtils.isEmpty(ork) || !TextUtils.isEmpty(vy)) {
                    if (!TextUtils.isEmpty(vy) && TextUtils.isEmpty(ork)) {
                        ork = vy;
                    } else if (!TextUtils.isEmpty(vy) && !TextUtils.isEmpty(ork)) {
                        ork = ork + vy;
                    } else {
                        ork = "";
                    }
                }
                if (TextUtils.isEmpty(ork)) {
                    return null;
                }
                com.bytedance.sdk.component.vj.ork pcc2 = com.bytedance.sdk.component.adexpress.pcc.pcc.pcc.pcc().vj().pcc(ork).gm(2).pcc(new com.bytedance.sdk.component.vj.kj() { // from class: com.bytedance.sdk.component.adexpress.wh.ork.1.1
                    @Override // com.bytedance.sdk.component.vj.kj
                    public Bitmap pcc(Bitmap bitmap2) {
                        Bitmap createScaledBitmap = Bitmap.createScaledBitmap(bitmap2, orkVar.pcc(), orkVar.sf(), false);
                        ork.this.pcc.put(kj, createScaledBitmap);
                        return createScaledBitmap;
                    }
                });
                ork orkVar2 = ork.this;
                pcc2.pcc(new pcc(orkVar2, orkVar, kj, orkVar2.pcc));
                return (Bitmap) ork.this.pcc.get(kj);
            }
        });
        pcc();
    }

    private static class pcc implements com.bytedance.sdk.component.vj.dax {
        private final String gm;
        private final Map<String, Bitmap> oo;
        private final WeakReference<ork> pcc;
        private final com.bytedance.adsdk.sf.ork sf;

        @Override // com.bytedance.sdk.component.vj.dax
        public void pcc(int i, String str, Throwable th) {
        }

        public pcc(ork orkVar, com.bytedance.adsdk.sf.ork orkVar2, String str, Map<String, Bitmap> map) {
            this.pcc = new WeakReference<>(orkVar);
            this.sf = orkVar2;
            this.gm = str;
            this.oo = map;
        }

        @Override // com.bytedance.sdk.component.vj.dax
        public void pcc(com.bytedance.sdk.component.vj.vh vhVar) {
            Object sf = vhVar.sf();
            if (sf instanceof Bitmap) {
                Bitmap createScaledBitmap = Bitmap.createScaledBitmap((Bitmap) sf, this.sf.pcc(), this.sf.sf(), false);
                this.oo.put(this.gm, createScaledBitmap);
                ork orkVar = this.pcc.get();
                if (orkVar != null) {
                    orkVar.pcc(this.sf.kj(), createScaledBitmap);
                }
            }
        }
    }
}
