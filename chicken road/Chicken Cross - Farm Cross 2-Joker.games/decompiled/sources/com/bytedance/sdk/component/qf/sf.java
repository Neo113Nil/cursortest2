package com.bytedance.sdk.component.qf;

import com.bytedance.sdk.component.sf.pcc.ork;
import java.io.File;
import java.util.Map;

/* loaded from: classes4.dex */
public class sf {
    final Map<String, String> gm;
    final String oo;
    final int pcc;
    ork qf;
    final String sf;
    final long vj;
    private final boolean vy;
    final long wh;
    private File kj = null;
    private byte[] ork = null;

    public sf(boolean z, int i, String str, Map<String, String> map, String str2, long j, long j2) {
        this.vy = z;
        this.pcc = i;
        this.sf = str;
        this.gm = map;
        this.oo = str2;
        this.vj = j;
        this.wh = j2;
    }

    public int pcc() {
        return this.pcc;
    }

    public String sf() {
        return this.sf;
    }

    public Map<String, String> gm() {
        return this.gm;
    }

    public String oo() {
        return this.oo;
    }

    public File vj() {
        return this.kj;
    }

    public void pcc(File file) {
        this.kj = file;
    }

    public boolean wh() {
        return this.vy;
    }

    public void pcc(byte[] bArr) {
        this.ork = bArr;
    }

    public ork qf() {
        return this.qf;
    }

    public void pcc(ork orkVar) {
        this.qf = orkVar;
    }
}
