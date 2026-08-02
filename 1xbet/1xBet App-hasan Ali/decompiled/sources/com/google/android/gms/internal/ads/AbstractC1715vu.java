package com.google.android.gms.internal.ads;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* renamed from: com.google.android.gms.internal.ads.vu, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC1715vu implements Iterator {

    /* renamed from: k, reason: collision with root package name */
    public String f16060k;

    /* renamed from: m, reason: collision with root package name */
    public final CharSequence f16062m;

    /* renamed from: l, reason: collision with root package name */
    public int f16061l = 2;

    /* renamed from: n, reason: collision with root package name */
    public int f16063n = 0;

    /* renamed from: o, reason: collision with root package name */
    public int f16064o = Integer.MAX_VALUE;

    public AbstractC1715vu(CharSequence charSequence) {
        this.f16062m = charSequence;
    }

    public abstract int a(int i);

    public abstract int b(int i);

    @Override // java.util.Iterator
    public final boolean hasNext() {
        int a5;
        int i = this.f16061l;
        if (i == 4) {
            throw new IllegalStateException();
        }
        int i5 = i - 1;
        String str = null;
        if (i == 0) {
            throw null;
        }
        if (i5 == 0) {
            return true;
        }
        if (i5 != 2) {
            this.f16061l = 4;
            int i6 = this.f16063n;
            while (true) {
                int i7 = this.f16063n;
                if (i7 == -1) {
                    this.f16061l = 3;
                    break;
                }
                int b3 = b(i7);
                CharSequence charSequence = this.f16062m;
                if (b3 == -1) {
                    b3 = charSequence.length();
                    this.f16063n = -1;
                    a5 = -1;
                } else {
                    a5 = a(b3);
                    this.f16063n = a5;
                }
                if (a5 == i6) {
                    int i8 = a5 + 1;
                    this.f16063n = i8;
                    if (i8 > charSequence.length()) {
                        this.f16063n = -1;
                    }
                } else {
                    if (i6 < b3) {
                        charSequence.charAt(i6);
                    }
                    if (i6 < b3) {
                        charSequence.charAt(b3 - 1);
                    }
                    int i9 = this.f16064o;
                    if (i9 == 1) {
                        b3 = charSequence.length();
                        this.f16063n = -1;
                        if (b3 > i6) {
                            charSequence.charAt(b3 - 1);
                        }
                    } else {
                        this.f16064o = i9 - 1;
                    }
                    str = charSequence.subSequence(i6, b3).toString();
                }
            }
            this.f16060k = str;
            if (this.f16061l != 3) {
                this.f16061l = 1;
                return true;
            }
        }
        return false;
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        this.f16061l = 2;
        String str = this.f16060k;
        this.f16060k = null;
        return str;
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException();
    }
}
