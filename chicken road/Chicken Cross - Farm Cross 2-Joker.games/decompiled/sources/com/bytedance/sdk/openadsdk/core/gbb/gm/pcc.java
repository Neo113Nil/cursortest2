package com.bytedance.sdk.openadsdk.core.gbb.gm;

import android.content.Context;
import android.graphics.Point;
import android.view.Display;
import android.view.WindowManager;
import androidx.media3.common.MimeTypes;
import com.bytedance.sdk.openadsdk.core.lu;
import com.bytedance.sdk.openadsdk.utils.rj;
import java.util.HashSet;
import java.util.Set;

/* loaded from: classes4.dex */
public class pcc {
    public static final Set<String> pcc = new HashSet<String>() { // from class: com.bytedance.sdk.openadsdk.core.gbb.gm.pcc.1
        {
            add("image/jpeg");
            add(MimeTypes.IMAGE_PNG);
            add(MimeTypes.IMAGE_BMP);
            add("image/gif");
            add("image/jpg");
        }
    };
    public static Set<String> sf = new HashSet<String>() { // from class: com.bytedance.sdk.openadsdk.core.gbb.gm.pcc.2
        {
            add("application/x-javascript");
        }
    };

    /* renamed from: com.bytedance.sdk.openadsdk.core.gbb.gm.pcc$pcc, reason: collision with other inner class name */
    public enum EnumC0147pcc {
        NONE,
        IMAGE,
        JAVASCRIPT
    }

    public enum sf {
        HTML_RESOURCE,
        STATIC_RESOURCE,
        IFRAME_RESOURCE
    }

    public static Point pcc(Context context, int i, int i2, sf sfVar) {
        if (context == null) {
            context = lu.pcc();
        }
        Point point = new Point(i, i2);
        Display defaultDisplay = ((WindowManager) context.getSystemService("window")).getDefaultDisplay();
        int width = defaultDisplay.getWidth();
        int height = defaultDisplay.getHeight();
        int sf2 = rj.sf(context, i);
        int sf3 = rj.sf(context, i2);
        if (sf2 <= width && sf3 <= height) {
            return point;
        }
        Point point2 = new Point();
        if (sf.HTML_RESOURCE == sfVar) {
            point2.x = Math.min(width, sf2);
            point2.y = Math.min(height, sf3);
        } else {
            float f = sf2;
            float f2 = f / width;
            float f3 = sf3;
            float f4 = f3 / height;
            if (f2 >= f4) {
                point2.x = width;
                point2.y = (int) (f3 / f2);
            } else {
                point2.x = (int) (f / f4);
                point2.y = height;
            }
        }
        if (point2.x < 0 || point2.y < 0) {
            return point;
        }
        point2.x = rj.gm(context, point2.x);
        point2.y = rj.gm(context, point2.y);
        return point2;
    }
}
