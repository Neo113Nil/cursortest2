package com.google.common.collect;

import java.util.NoSuchElementException;

/* renamed from: com.google.common.collect.b, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public abstract class AbstractC0954b<T> extends y0<T> {
    public a a = a.b;
    public T b;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* renamed from: com.google.common.collect.b$a */
    public static final class a {
        public static final a a;
        public static final a b;
        public static final a c;
        public static final a d;
        public static final /* synthetic */ a[] e;

        static {
            a aVar = new a("READY", 0);
            a = aVar;
            a aVar2 = new a("NOT_READY", 1);
            b = aVar2;
            a aVar3 = new a("DONE", 2);
            c = aVar3;
            a aVar4 = new a("FAILED", 3);
            d = aVar4;
            e = new a[]{aVar, aVar2, aVar3, aVar4};
        }

        public a() {
            throw null;
        }

        public static a valueOf(String str) {
            return (a) Enum.valueOf(a.class, str);
        }

        public static a[] values() {
            return (a[]) e.clone();
        }
    }

    public abstract T a();

    @Override // java.util.Iterator
    public final boolean hasNext() {
        a aVar = this.a;
        a aVar2 = a.d;
        if (aVar == aVar2) {
            throw new IllegalStateException();
        }
        int ordinal = aVar.ordinal();
        if (ordinal == 0) {
            return true;
        }
        if (ordinal == 2) {
            return false;
        }
        this.a = aVar2;
        this.b = a();
        if (this.a == a.c) {
            return false;
        }
        this.a = a.a;
        return true;
    }

    @Override // java.util.Iterator
    public final T next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        this.a = a.b;
        T t = this.b;
        this.b = null;
        return t;
    }
}
