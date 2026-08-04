package com.google.protobuf;

import java.util.NoSuchElementException;

/* JADX INFO: renamed from: com.google.protobuf.f, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C0857f extends AbstractC0859g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f12182a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f12183b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ AbstractC0867k f12184c;

    public C0857f(AbstractC0867k abstractC0867k) {
        this.f12184c = abstractC0867k;
        this.f12183b = abstractC0867k.size();
    }

    @Override // com.google.protobuf.AbstractC0859g
    public final byte a() {
        int i7 = this.f12182a;
        if (i7 >= this.f12183b) {
            throw new NoSuchElementException();
        }
        this.f12182a = i7 + 1;
        return this.f12184c.D(i7);
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f12182a < this.f12183b;
    }
}
