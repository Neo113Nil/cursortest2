package com.bytedance.sdk.openadsdk.of;

import java.nio.charset.Charset;
import java.nio.charset.CharsetEncoder;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes4.dex */
public final class vj {
    static final /* synthetic */ boolean pcc = true;
    private static final List<CharsetEncoder> sf = new ArrayList();
    private final CharsetEncoder[] gm;
    private final int oo;

    public vj(String str, Charset charset, int i) {
        int i2;
        boolean z;
        ArrayList<CharsetEncoder> arrayList = new ArrayList();
        arrayList.add(StandardCharsets.ISO_8859_1.newEncoder());
        boolean z2 = charset != null && charset.name().startsWith("UTF");
        for (int i3 = 0; i3 < str.length(); i3++) {
            for (CharsetEncoder charsetEncoder : arrayList) {
                char charAt = str.charAt(i3);
                if (charAt == i || charsetEncoder.canEncode(charAt)) {
                    z = true;
                    break;
                }
            }
            z = false;
            if (!z) {
                Iterator<CharsetEncoder> it = sf.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    CharsetEncoder next = it.next();
                    if (next.canEncode(str.charAt(i3))) {
                        arrayList.add(next);
                        z = true;
                        break;
                    }
                }
            }
            if (!z) {
                z2 = true;
            }
        }
        if (arrayList.size() == 1 && !z2) {
            this.gm = new CharsetEncoder[]{(CharsetEncoder) arrayList.get(0)};
        } else {
            this.gm = new CharsetEncoder[arrayList.size() + 2];
            Iterator it2 = arrayList.iterator();
            int i4 = 0;
            while (it2.hasNext()) {
                this.gm[i4] = (CharsetEncoder) it2.next();
                i4++;
            }
            this.gm[i4] = StandardCharsets.UTF_8.newEncoder();
            this.gm[i4 + 1] = StandardCharsets.UTF_16BE.newEncoder();
        }
        if (charset != null) {
            i2 = 0;
            while (true) {
                CharsetEncoder[] charsetEncoderArr = this.gm;
                if (i2 >= charsetEncoderArr.length) {
                    break;
                }
                if (charsetEncoderArr[i2] != null && charset.name().equals(this.gm[i2].charset().name())) {
                    break;
                } else {
                    i2++;
                }
            }
            this.oo = i2;
            if (pcc && !this.gm[0].charset().equals(StandardCharsets.ISO_8859_1)) {
                throw new AssertionError();
            }
        }
        i2 = -1;
        this.oo = i2;
        if (pcc) {
        }
    }

    public int pcc() {
        return this.gm.length;
    }

    public Charset pcc(int i) {
        if (pcc || i < pcc()) {
            return this.gm[i].charset();
        }
        throw new AssertionError();
    }

    public int sf(int i) {
        return oo.pcc(this.gm[i].charset()).pcc();
    }

    public int sf() {
        return this.oo;
    }

    public boolean pcc(char c, int i) {
        if (pcc || i < pcc()) {
            return this.gm[i].canEncode(String.valueOf(c));
        }
        throw new AssertionError();
    }

    public byte[] pcc(String str, int i) {
        if (pcc || i < pcc()) {
            return str.getBytes(this.gm[i].charset());
        }
        throw new AssertionError();
    }
}
