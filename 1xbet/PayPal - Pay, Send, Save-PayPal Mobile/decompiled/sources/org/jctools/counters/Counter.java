package org.jctools.counters;

/* loaded from: classes18.dex */
public interface Counter {
    long get();

    long getAndReset();

    void inc();

    void inc(long j);
}
