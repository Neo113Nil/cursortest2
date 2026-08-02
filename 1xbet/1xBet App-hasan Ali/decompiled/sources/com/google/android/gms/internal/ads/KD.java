package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/* loaded from: classes.dex */
public final class KD implements DD {

    /* renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ int f10142c = 0;

    /* renamed from: a, reason: collision with root package name */
    public final List f10143a;

    /* renamed from: b, reason: collision with root package name */
    public final List f10144b;

    static {
        ED.a(Collections.EMPTY_SET);
    }

    public /* synthetic */ KD(List list, List list2) {
        this.f10143a = list;
        this.f10144b = list2;
    }

    public static Er a(int i, int i5) {
        return new Er(i, i5);
    }

    @Override // com.google.android.gms.internal.ads.ID
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public final Set d() {
        List list = this.f10143a;
        int size = list.size();
        List list2 = this.f10144b;
        ArrayList arrayList = new ArrayList(list2.size());
        int size2 = list2.size();
        for (int i = 0; i < size2; i++) {
            Collection collection = (Collection) ((ID) list2.get(i)).d();
            size += collection.size();
            arrayList.add(collection);
        }
        HashSet hashSet = new HashSet(size < 3 ? size + 1 : size < 1073741824 ? (int) ((size / 0.75f) + 1.0f) : Integer.MAX_VALUE);
        int size3 = list.size();
        for (int i5 = 0; i5 < size3; i5++) {
            Object d5 = ((ID) list.get(i5)).d();
            d5.getClass();
            hashSet.add(d5);
        }
        int size4 = arrayList.size();
        for (int i6 = 0; i6 < size4; i6++) {
            for (Object obj : (Collection) arrayList.get(i6)) {
                obj.getClass();
                hashSet.add(obj);
            }
        }
        return Collections.unmodifiableSet(hashSet);
    }
}
