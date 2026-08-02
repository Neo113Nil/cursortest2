package p000;

import java.util.AbstractSet;
import java.util.Arrays;
import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-738170b7fb69b873ed7524d5270c8e05c6f5fb40ea1ade7a72c8ed7a70699269 */
/* JADX INFO: loaded from: classes.dex */
public final class kn1 extends AbstractSet {

    /* JADX INFO: renamed from: j */
    public final int f4464j;

    /* JADX INFO: renamed from: k */
    public final /* synthetic */ ln1 f4465k;

    public kn1(ln1 ln1Var, int i) {
        this.f4465k = ln1Var;
        this.f4464j = i;
    }

    /* JADX INFO: renamed from: b */
    public final int m3057b() {
        int i = this.f4464j;
        if (i == -1) {
            return 0;
        }
        return this.f4465k.f4859k[i];
    }

    /* JADX INFO: renamed from: c */
    public final int m3058c() {
        return this.f4465k.f4859k[this.f4464j + 1];
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        return Arrays.binarySearch(this.f4465k.f4858j, m3057b(), m3058c(), obj, this.f4464j == -1 ? ln1.f4857o : mn1.f5101b) >= 0;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        return new jn1(this, 0);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return m3058c() - m3057b();
    }
}
