package com.bytedance.sdk.openadsdk.of.pcc;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Color;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import androidx.core.view.ViewCompat;
import com.bytedance.sdk.component.kj.sf.gm;
import com.bytedance.sdk.component.utils.lo;
import com.bytedance.sdk.openadsdk.of.dax;
import com.bytedance.sdk.openadsdk.of.kj;
import com.bytedance.sdk.openadsdk.of.wh;
import com.bytedance.sdk.openadsdk.utils.rnn;
import com.bytedance.sdk.openadsdk.yt.sf;
import com.bytedance.sdk.openadsdk.yt.vj;
import com.facebook.internal.FacebookRequestErrorClassification;
import com.google.zxing.pdf417.PDF417Common;
import com.ironsource.mediationsdk.demandOnly.e;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.ironsource.mediationsdk.metadata.a;
import com.vungle.ads.internal.protos.Sdk;
import java.util.Hashtable;
import org.json.JSONObject;

/* loaded from: classes4.dex */
public class pcc {
    private static Boolean pcc;

    public static void pcc(final Context context, final View view, final String str) {
        if (!pcc() || view == null || TextUtils.isEmpty(str)) {
            return;
        }
        rnn.gm((Runnable) new gm("add_qr_code") { // from class: com.bytedance.sdk.openadsdk.of.pcc.pcc.1
            @Override // java.lang.Runnable
            public void run() {
                try {
                    final Bitmap gm = pcc.gm(str);
                    if (gm == null) {
                        return;
                    }
                    JSONObject jSONObject = (JSONObject) vj.pcc("water_mark_config", (Object) null, sf.pcc);
                    final float optDouble = jSONObject == null ? 0.5f : (float) jSONObject.optDouble("alpha", 0.5d);
                    view.post(new Runnable() { // from class: com.bytedance.sdk.openadsdk.of.pcc.pcc.1.1
                        @Override // java.lang.Runnable
                        public void run() {
                            ImageView imageView = new ImageView(context);
                            imageView.setImageBitmap(gm);
                            imageView.setAlpha(optDouble);
                            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2);
                            layoutParams.gravity = 85;
                            layoutParams.setMargins(0, 0, 2, 2);
                            if (view instanceof ViewGroup) {
                                ((ViewGroup) view).addView(imageView, layoutParams);
                            }
                        }
                    });
                } catch (Throwable th) {
                    lo.gm("QRCodeGenerateUtils", "addQRCode error: " + th.getMessage());
                }
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static Bitmap gm(String str) {
        int i;
        int i2;
        try {
            Hashtable hashtable = new Hashtable();
            hashtable.put(wh.CHARACTER_SET, "UTF-8");
            hashtable.put(wh.ERROR_CORRECTION, kj.L);
            hashtable.put(wh.MARGIN, 1);
            int pcc2 = ((pcc(str.getBytes("UTF-8").length) - 1) * 4) + 22;
            int i3 = pcc2 > 60 ? 60 : pcc2;
            com.bytedance.sdk.openadsdk.of.sf pcc3 = new dax().pcc(str, i3, i3, hashtable);
            int[] iArr = new int[i3 * i3];
            JSONObject jSONObject = (JSONObject) vj.pcc("water_mark_config", (Object) null, sf.pcc);
            if (jSONObject != null) {
                i = Color.parseColor(jSONObject.optString("fg_color", "#FF000000"));
                i2 = Color.parseColor(jSONObject.optString("bg_color", "#FFFFFFFF"));
            } else {
                i = ViewCompat.MEASURED_STATE_MASK;
                i2 = -1;
            }
            for (int i4 = 0; i4 < i3; i4++) {
                for (int i5 = 0; i5 < i3; i5++) {
                    iArr[(i4 * i3) + i5] = pcc3.pcc(i5, i4) ? i : i2;
                }
            }
            Bitmap createBitmap = Bitmap.createBitmap(i3, i3, Bitmap.Config.ARGB_8888);
            createBitmap.setPixels(iArr, 0, i3, 0, 0, i3, i3);
            return createBitmap;
        } catch (Throwable th) {
            lo.gm("QRCodeGenerateUtils", "generateQRCode error: " + th.getMessage());
            return null;
        }
    }

    private static int pcc(int i) {
        int[] iArr = {17, 32, 53, 78, 106, 134, 154, 192, 230, 271, Sdk.SDKError.Reason.BLACK_SCREEN_DETECTION_ERROR_VALUE, 367, 425, FacebookRequestErrorClassification.ESC_APP_NOT_INSTALLED, IronSourceError.ERROR_NO_INTERNET_CONNECTION, 586, 644, IronSourceError.ERROR_NT_INSTANCE_LOAD_EMPTY_SERVER_DATA, 792, 858, PDF417Common.NUMBER_OF_CODEWORDS, 1003, 1091, 1171, 1273, 1367, 1465, 1528, 1628, 1732, 1840, 1952, 2068, 2188, e.a.k, 2431, 2563, 2699, 2809, 2953};
        for (int i2 = 0; i2 < 40; i2++) {
            if (iArr[i2] >= i) {
                return i2 + 1;
            }
        }
        return 40;
    }

    public static String pcc(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        try {
            return com.bytedance.sdk.openadsdk.gbb.pcc.pcc.pcc.pcc(str, "");
        } catch (Throwable th) {
            lo.gm("QRCodeGenerateUtils", "getEncryptRequestId error: " + th.getMessage());
            return null;
        }
    }

    public static boolean pcc() {
        if (pcc == null) {
            JSONObject jSONObject = (JSONObject) vj.pcc("water_mark_config", (Object) null, sf.pcc);
            if (jSONObject == null) {
                return false;
            }
            pcc = Boolean.valueOf(jSONObject.optInt(a.k, 0) == 1);
        }
        new StringBuilder("QRCodeGenerateUtils isEnable: ").append(pcc);
        return pcc.booleanValue();
    }

    public static int sf() {
        JSONObject jSONObject = (JSONObject) vj.pcc("water_mark_config", (Object) null, sf.pcc);
        if (jSONObject == null) {
            return 10;
        }
        return jSONObject.optInt("upload_count", 10);
    }
}
