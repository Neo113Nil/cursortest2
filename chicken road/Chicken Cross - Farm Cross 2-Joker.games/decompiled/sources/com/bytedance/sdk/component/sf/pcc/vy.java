package com.bytedance.sdk.component.sf.pcc;

import java.nio.charset.Charset;

/* loaded from: classes4.dex */
public final class vy {
    private String pcc;
    private String sf;

    private vy(String str) {
        this.pcc = str;
    }

    public static vy pcc(String str) {
        return new vy(str);
    }

    public String pcc() {
        return this.pcc;
    }

    public Charset pcc(Charset charset) {
        try {
            String str = this.sf;
            return str != null ? Charset.forName(str) : charset;
        } catch (IllegalArgumentException unused) {
            return charset;
        }
    }
}
