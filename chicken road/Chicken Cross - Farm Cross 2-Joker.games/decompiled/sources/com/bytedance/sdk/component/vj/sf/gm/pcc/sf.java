package com.bytedance.sdk.component.vj.sf.gm.pcc;

import android.content.Context;
import java.io.File;

/* loaded from: classes4.dex */
public class sf implements com.bytedance.sdk.component.vj.sf, Cloneable {
    private static volatile com.bytedance.sdk.component.vj.sf vy;
    private int gm;
    private File kj;
    private int oo;
    private long pcc;
    private boolean qf;
    private int sf;
    private boolean vj;
    private boolean wh;

    public sf(int i, int i2, int i3, long j, File file) {
        this(i, i2, i3, j, i2 != 0, j != 0, file);
    }

    public sf(int i, int i2, int i3, long j, boolean z, boolean z2, File file) {
        this.pcc = j;
        this.sf = i;
        this.gm = i2;
        this.oo = i3;
        this.vj = z;
        this.wh = z2;
        this.kj = file;
        this.qf = i3 != 0;
    }

    @Override // com.bytedance.sdk.component.vj.sf
    public long pcc() {
        return this.pcc;
    }

    @Override // com.bytedance.sdk.component.vj.sf
    public int sf() {
        return this.sf;
    }

    @Override // com.bytedance.sdk.component.vj.sf
    public int gm() {
        return this.gm;
    }

    @Override // com.bytedance.sdk.component.vj.sf
    public int oo() {
        return this.oo;
    }

    @Override // com.bytedance.sdk.component.vj.sf
    public boolean vj() {
        return this.vj;
    }

    @Override // com.bytedance.sdk.component.vj.sf
    public boolean wh() {
        return this.qf;
    }

    @Override // com.bytedance.sdk.component.vj.sf
    public boolean qf() {
        return this.wh;
    }

    @Override // com.bytedance.sdk.component.vj.sf
    public File kj() {
        return this.kj;
    }

    public static void pcc(Context context, com.bytedance.sdk.component.vj.sf sfVar) {
        if (sfVar != null) {
            vy = sfVar;
        } else {
            vy = pcc(new File(context.getCacheDir(), "image"));
        }
    }

    public static com.bytedance.sdk.component.vj.sf pcc(File file) {
        long pcc;
        int gm;
        int oo;
        file.mkdirs();
        if (vy == null) {
            gm = 10;
            oo = 14;
            pcc = 20;
        } else {
            pcc = vy.pcc();
            gm = vy.gm();
            oo = vy.oo();
        }
        return new sf(0, gm, oo, pcc, file);
    }

    public static com.bytedance.sdk.component.vj.sf vy() {
        return vy;
    }
}
