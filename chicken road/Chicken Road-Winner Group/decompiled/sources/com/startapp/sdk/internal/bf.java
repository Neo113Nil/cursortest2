package com.startapp.sdk.internal;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.WeakHashMap;

/* loaded from: classes.dex */
public final class bf extends hf {

    /* renamed from: a, reason: collision with root package name */
    public final LinkedList f3503a;

    public bf(LinkedList linkedList) {
        this.f3503a = linkedList;
    }

    @Override // com.startapp.sdk.internal.hf
    public final boolean a(Object obj) {
        if (obj instanceof u9) {
            return this.f3503a.contains(((u9) obj).n0.f3571a);
        }
        return false;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || bf.class != obj.getClass()) {
            return false;
        }
        LinkedList linkedList = this.f3503a;
        LinkedList linkedList2 = ((bf) obj).f3503a;
        WeakHashMap weakHashMap = si.f4343a;
        return linkedList.equals(linkedList2);
    }

    public final int hashCode() {
        Object[] objArr = {this.f3503a};
        WeakHashMap weakHashMap = si.f4343a;
        return Arrays.deepHashCode(objArr);
    }
}
