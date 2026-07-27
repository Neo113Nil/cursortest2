package com.bytedance.sdk.component.sf.pcc;

import java.util.ArrayList;
import java.util.List;

/* loaded from: classes4.dex */
public final class vj extends hc {
    List<String> pcc;
    List<String> sf;

    vj(List<String> list, List<String> list2) {
        this.pcc = list;
        this.sf = list2;
    }

    public static final class pcc {
        private final List<String> pcc = new ArrayList();
        private final List<String> sf = new ArrayList();

        public pcc pcc(String str, String str2) {
            this.pcc.add(str);
            this.sf.add(str2);
            return this;
        }

        public vj pcc() {
            return new vj(this.pcc, this.sf);
        }
    }
}
