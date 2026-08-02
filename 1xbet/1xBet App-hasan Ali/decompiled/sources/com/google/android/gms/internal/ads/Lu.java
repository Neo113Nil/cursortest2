package com.google.android.gms.internal.ads;

import java.util.Comparator;
import java.util.SortedMap;
import java.util.SortedSet;

/* loaded from: classes.dex */
public class Lu extends Fu implements SortedSet {

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ C1581sv f10557m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Lu(C1581sv c1581sv, SortedMap sortedMap) {
        super(c1581sv, sortedMap);
        this.f10557m = c1581sv;
    }

    public SortedMap c() {
        return (SortedMap) this.f9139k;
    }

    @Override // java.util.SortedSet
    public final Comparator comparator() {
        return c().comparator();
    }

    @Override // java.util.SortedSet
    public final Object first() {
        return c().firstKey();
    }

    public SortedSet headSet(Object obj) {
        return new Lu(this.f10557m, c().headMap(obj));
    }

    @Override // java.util.SortedSet
    public final Object last() {
        return c().lastKey();
    }

    public SortedSet subSet(Object obj, Object obj2) {
        return new Lu(this.f10557m, c().subMap(obj, obj2));
    }

    public SortedSet tailSet(Object obj) {
        return new Lu(this.f10557m, c().tailMap(obj));
    }
}
