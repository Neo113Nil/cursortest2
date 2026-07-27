package com.bytedance.sdk.component.kj.sf;

import java.util.concurrent.Callable;
import java.util.concurrent.FutureTask;

/* loaded from: classes4.dex */
public class sf<V> extends FutureTask<V> implements Comparable<sf<V>> {
    private int pcc;
    private int sf;

    public sf(Callable<V> callable, int i, int i2) {
        super(callable);
        this.pcc = i == -1 ? 5 : i;
        this.sf = i2;
    }

    @Override // java.lang.Comparable
    /* renamed from: pcc, reason: merged with bridge method [inline-methods] */
    public int compareTo(sf sfVar) {
        if (pcc() < sfVar.pcc()) {
            return 1;
        }
        return pcc() > sfVar.pcc() ? -1 : 0;
    }

    public int pcc() {
        return this.pcc;
    }
}
