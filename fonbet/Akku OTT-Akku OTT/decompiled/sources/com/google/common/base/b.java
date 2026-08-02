package com.google.common.base;

import com.google.common.base.d;
import com.google.common.base.q;
import java.util.Iterator;
import java.util.NoSuchElementException;

/* loaded from: classes4.dex */
public abstract class b<T> implements Iterator<T> {
    public a a;
    public String b;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
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

    @Override // java.util.Iterator
    public final boolean hasNext() {
        a aVar;
        String str;
        d dVar;
        a aVar2 = this.a;
        a aVar3 = a.d;
        if (aVar2 == aVar3) {
            throw new IllegalStateException();
        }
        int ordinal = aVar2.ordinal();
        if (ordinal == 0) {
            return true;
        }
        if (ordinal == 2) {
            return false;
        }
        this.a = aVar3;
        q.a aVar4 = (q.a) this;
        int i = aVar4.e;
        while (true) {
            int i2 = aVar4.e;
            aVar = a.c;
            if (i2 == -1) {
                aVar4.a = aVar;
                str = null;
                break;
            }
            o oVar = (o) aVar4;
            d.b bVar = oVar.i.a;
            CharSequence charSequence = oVar.c;
            int length = charSequence.length();
            k.g(i2, length);
            while (true) {
                if (i2 >= length) {
                    i2 = -1;
                    break;
                }
                if (bVar.a(charSequence.charAt(i2))) {
                    break;
                }
                i2++;
            }
            CharSequence charSequence2 = aVar4.c;
            if (i2 == -1) {
                i2 = charSequence2.length();
                aVar4.e = -1;
            } else {
                aVar4.e = i2 + 1;
            }
            int i3 = aVar4.e;
            if (i3 == i) {
                int i4 = i3 + 1;
                aVar4.e = i4;
                if (i4 > charSequence2.length()) {
                    aVar4.e = -1;
                }
            } else {
                while (true) {
                    dVar = aVar4.d;
                    if (i >= i2 || !dVar.a(charSequence2.charAt(i))) {
                        break;
                    }
                    i++;
                }
                while (i2 > i && dVar.a(charSequence2.charAt(i2 - 1))) {
                    i2--;
                }
                int i5 = aVar4.f;
                if (i5 == 1) {
                    i2 = charSequence2.length();
                    aVar4.e = -1;
                    while (i2 > i && dVar.a(charSequence2.charAt(i2 - 1))) {
                        i2--;
                    }
                } else {
                    aVar4.f = i5 - 1;
                }
                str = charSequence2.subSequence(i, i2).toString();
            }
        }
        this.b = str;
        if (this.a == aVar) {
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
        T t = (T) this.b;
        this.b = null;
        return t;
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException();
    }
}
