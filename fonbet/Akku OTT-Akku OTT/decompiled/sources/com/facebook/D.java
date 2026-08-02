package com.facebook;

import android.os.Handler;
import java.util.AbstractList;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.collections.ArraysKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

@SourceDebugExtension({"SMAP\nGraphRequestBatch.kt\nKotlin\n*S Kotlin\n*F\n+ 1 GraphRequestBatch.kt\ncom/facebook/GraphRequestBatch\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,196:1\n1#2:197\n*E\n"})
/* loaded from: classes3.dex */
public final class D extends AbstractList<z> {
    public static final b Companion = new b();
    public static final AtomicInteger e = new AtomicInteger();
    public Handler a;
    public final String b;
    public final ArrayList c;
    public final ArrayList d;

    public interface a {
        void a(D d);
    }

    public static final class b {
    }

    public interface c extends a {
        void b();
    }

    public D(List requests) {
        Intrinsics.checkNotNullParameter(requests, "requests");
        this.b = String.valueOf(Integer.valueOf(e.incrementAndGet()));
        this.d = new ArrayList();
        this.c = new ArrayList(requests);
    }

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i, Object obj) {
        z element = (z) obj;
        Intrinsics.checkNotNullParameter(element, "element");
        this.c.add(i, element);
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final void clear() {
        this.c.clear();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* bridge */ boolean contains(Object obj) {
        if (obj == null ? true : obj instanceof z) {
            return super.contains((z) obj);
        }
        return false;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i) {
        return (z) this.c.get(i);
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* bridge */ int indexOf(Object obj) {
        if (obj == null ? true : obj instanceof z) {
            return super.indexOf((z) obj);
        }
        return -1;
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* bridge */ int lastIndexOf(Object obj) {
        if (obj == null ? true : obj instanceof z) {
            return super.lastIndexOf((z) obj);
        }
        return -1;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* bridge */ boolean remove(Object obj) {
        if (obj == null ? true : obj instanceof z) {
            return super.remove((z) obj);
        }
        return false;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object set(int i, Object obj) {
        z element = (z) obj;
        Intrinsics.checkNotNullParameter(element, "element");
        return (z) this.c.set(i, element);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.c.size();
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object remove(int i) {
        return (z) this.c.remove(i);
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean add(Object obj) {
        z element = (z) obj;
        Intrinsics.checkNotNullParameter(element, "element");
        return this.c.add(element);
    }

    public D(z... requests) {
        Intrinsics.checkNotNullParameter(requests, "requests");
        this.b = String.valueOf(Integer.valueOf(e.incrementAndGet()));
        this.d = new ArrayList();
        this.c = new ArrayList(ArraysKt.asList(requests));
    }
}
