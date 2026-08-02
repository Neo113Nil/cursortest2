package com.google.android.gms.internal.ads;

import java.util.Comparator;
import java.util.SortedMap;
import java.util.SortedSet;

/* loaded from: classes.dex */
public class Ku extends Eu implements SortedMap {

    /* renamed from: o, reason: collision with root package name */
    public SortedSet f10278o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ C1581sv f10279p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Ku(C1581sv c1581sv, SortedMap sortedMap) {
        super(c1581sv, sortedMap);
        this.f10279p = c1581sv;
    }

    public SortedMap b() {
        return (SortedMap) this.f8625m;
    }

    public SortedSet c() {
        return new Lu(this.f10279p, b());
    }

    @Override // java.util.SortedMap
    public final Comparator comparator() {
        return b().comparator();
    }

    @Override // com.google.android.gms.internal.ads.Eu, java.util.AbstractMap, java.util.Map
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public SortedSet keySet() {
        SortedSet sortedSet = this.f10278o;
        if (sortedSet != null) {
            return sortedSet;
        }
        SortedSet c5 = c();
        this.f10278o = c5;
        return c5;
    }

    @Override // java.util.SortedMap
    public final Object firstKey() {
        return b().firstKey();
    }

    public SortedMap headMap(Object obj) {
        return new Ku(this.f10279p, b().headMap(obj));
    }

    @Override // java.util.SortedMap
    public final Object lastKey() {
        return b().lastKey();
    }

    public SortedMap subMap(Object obj, Object obj2) {
        return new Ku(this.f10279p, b().subMap(obj, obj2));
    }

    public SortedMap tailMap(Object obj) {
        return new Ku(this.f10279p, b().tailMap(obj));
    }
}
