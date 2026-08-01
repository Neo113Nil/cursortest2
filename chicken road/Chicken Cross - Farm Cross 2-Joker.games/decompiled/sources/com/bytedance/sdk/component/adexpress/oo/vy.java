package com.bytedance.sdk.component.adexpress.oo;

import android.net.Uri;
import android.text.TextUtils;

/* loaded from: classes4.dex */
public class vy {
    public static pcc pcc(String str) {
        pcc pccVar = pcc.IMAGE;
        if (!TextUtils.isEmpty(str)) {
            try {
                String path = Uri.parse(str).getPath();
                if (path != null) {
                    if (path.endsWith(".css")) {
                        pccVar = pcc.CSS;
                    } else if (path.endsWith(".js")) {
                        pccVar = pcc.JS;
                    } else {
                        if (!path.endsWith(".jpg") && !path.endsWith(".gif") && !path.endsWith(".png") && !path.endsWith(".jpeg") && !path.endsWith(".webp") && !path.endsWith(".bmp") && !path.endsWith(".ico")) {
                            if (path.endsWith(".html")) {
                                pccVar = pcc.HTML;
                            } else if (path.endsWith(".mp4")) {
                                pccVar = pcc.VIDEO;
                            }
                        }
                        pccVar = pcc.IMAGE;
                    }
                }
            } catch (Throwable unused) {
            }
        }
        return pccVar;
    }

    public enum pcc {
        HTML("text/html"),
        CSS("text/css"),
        JS("application/x-javascript"),
        IMAGE("image/*"),
        VIDEO("video/mp4");

        private String wh;

        pcc(String str) {
            this.wh = str;
        }

        public String pcc() {
            return this.wh;
        }
    }
}
