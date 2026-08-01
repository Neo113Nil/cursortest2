package com.bytedance.sdk.openadsdk.utils;

import android.graphics.BitmapFactory;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.widget.ImageView;
import com.bytedance.sdk.openadsdk.lo.pcc.pcc;

/* loaded from: classes4.dex */
public class lu {

    public interface pcc {
        void pcc();

        void pcc(com.bytedance.sdk.openadsdk.lo.pcc.sf sfVar);
    }

    public static void pcc(com.bytedance.sdk.openadsdk.lo.pcc pccVar, int i, int i2, pcc pccVar2, String str) {
        pcc(pccVar, i, i2, pccVar2, str, 0);
    }

    public static void pcc(com.bytedance.sdk.openadsdk.lo.pcc pccVar, int i, int i2, final pcc pccVar2, String str, int i3) {
        new StringBuilder(" getImageBytes url ").append(pccVar);
        com.bytedance.sdk.openadsdk.lo.sf.sf().oo().pcc(pccVar, new pcc.InterfaceC0188pcc() { // from class: com.bytedance.sdk.openadsdk.utils.lu.1
            @Override // com.bytedance.sdk.openadsdk.lo.pcc.pcc.InterfaceC0188pcc
            public void pcc(String str2, com.bytedance.sdk.openadsdk.lo.pcc.sf sfVar) {
                pcc pccVar3;
                if (sfVar.vj() && (pccVar3 = pcc.this) != null) {
                    pccVar3.pcc(sfVar);
                    return;
                }
                pcc pccVar4 = pcc.this;
                if (pccVar4 != null) {
                    pccVar4.pcc();
                }
            }

            @Override // com.bytedance.sdk.openadsdk.lo.pcc.pcc.InterfaceC0188pcc
            public void pcc(int i4, String str2, Throwable th) {
                pcc pccVar3 = pcc.this;
                if (pccVar3 != null) {
                    pccVar3.pcc();
                }
            }
        }, i, i2, ImageView.ScaleType.CENTER_INSIDE, str, i3, null);
    }

    public static Drawable pcc(byte[] bArr, int i) {
        if (bArr == null || bArr.length <= 0) {
            return new ColorDrawable(0);
        }
        try {
            return new BitmapDrawable(BitmapFactory.decodeByteArray(bArr, 0, bArr.length));
        } catch (Throwable unused) {
            return new ColorDrawable(0);
        }
    }
}
