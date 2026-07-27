package com.bytedance.adsdk.pcc.sf.pcc;

import java.util.Arrays;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* loaded from: classes5.dex */
public class pcc {
    private String pcc;
    private Object[] sf;

    public String pcc() {
        return this.pcc;
    }

    public void pcc(String str) {
        this.pcc = str;
    }

    public Object[] sf() {
        return this.sf;
    }

    public void pcc(Object[] objArr) {
        this.sf = objArr;
    }

    public String toString() {
        return "MethodResult{methodName='" + this.pcc + "', args=" + Arrays.toString(this.sf) + AbstractJsonLexerKt.END_OBJ;
    }
}
