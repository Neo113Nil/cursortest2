package com.bytedance.sdk.component.kj.pcc;

import com.bytedance.sdk.component.kj.pcc.gm;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;

/* loaded from: classes4.dex */
public class oo<T extends gm> {
    private int pcc;
    private BlockingQueue<T> sf = new LinkedBlockingQueue();

    public static oo pcc(int i) {
        return new oo(i);
    }

    private oo(int i) {
        this.pcc = i;
    }

    public T pcc() {
        return this.sf.poll();
    }

    public boolean pcc(T t) {
        if (t == null) {
            return false;
        }
        t.pcc();
        if (this.sf.size() >= this.pcc) {
            return false;
        }
        return this.sf.offer(t);
    }
}
