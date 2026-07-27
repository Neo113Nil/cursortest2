package com.bytedance.sdk.openadsdk.of;

import com.google.zxing.common.StringUtils;
import java.nio.charset.Charset;
import java.nio.charset.UnsupportedCharsetException;

/* loaded from: classes4.dex */
public final class lu {
    public static final Charset pcc;
    public static final Charset sf;

    static {
        Charset charset;
        Charset charset2 = null;
        try {
            charset = Charset.forName(StringUtils.SHIFT_JIS);
        } catch (UnsupportedCharsetException unused) {
            charset = null;
        }
        pcc = charset;
        try {
            charset2 = Charset.forName(StringUtils.GB2312);
        } catch (UnsupportedCharsetException unused2) {
        }
        sf = charset2;
    }
}
