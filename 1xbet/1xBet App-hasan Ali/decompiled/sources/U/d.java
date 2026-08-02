package U;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* loaded from: classes.dex */
public abstract class d implements Iterator, j4.a {

    /* renamed from: k, reason: collision with root package name */
    public final o[] f5813k;

    /* renamed from: l, reason: collision with root package name */
    public int f5814l;

    /* renamed from: m, reason: collision with root package name */
    public boolean f5815m = true;

    public d(n nVar, o[] oVarArr) {
        this.f5813k = oVarArr;
        oVarArr[0].a(nVar.f5838d, Integer.bitCount(nVar.f5835a) * 2, 0);
        this.f5814l = 0;
        a();
    }

    public final void a() {
        int i = this.f5814l;
        o[] oVarArr = this.f5813k;
        o oVar = oVarArr[i];
        if (oVar.f5841m < oVar.f5840l) {
            return;
        }
        while (-1 < i) {
            int b3 = b(i);
            if (b3 == -1) {
                o oVar2 = oVarArr[i];
                int i5 = oVar2.f5841m;
                Object[] objArr = oVar2.f5839k;
                if (i5 < objArr.length) {
                    int length = objArr.length;
                    oVar2.f5841m = i5 + 1;
                    b3 = b(i);
                }
            }
            if (b3 != -1) {
                this.f5814l = b3;
                return;
            }
            if (i > 0) {
                o oVar3 = oVarArr[i - 1];
                int i6 = oVar3.f5841m;
                int length2 = oVar3.f5839k.length;
                oVar3.f5841m = i6 + 1;
            }
            oVarArr[i].a(n.f5834e.f5838d, 0, 0);
            i--;
        }
        this.f5815m = false;
    }

    public final int b(int i) {
        o[] oVarArr = this.f5813k;
        o oVar = oVarArr[i];
        int i5 = oVar.f5841m;
        if (i5 < oVar.f5840l) {
            return i;
        }
        Object[] objArr = oVar.f5839k;
        if (i5 >= objArr.length) {
            return -1;
        }
        int length = objArr.length;
        Object obj = objArr[i5];
        kotlin.jvm.internal.l.d("null cannot be cast to non-null type androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.TrieNode<K of androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.TrieNodeBaseIterator, V of androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.TrieNodeBaseIterator>", obj);
        n nVar = (n) obj;
        if (i == 6) {
            o oVar2 = oVarArr[i + 1];
            Object[] objArr2 = nVar.f5838d;
            oVar2.a(objArr2, objArr2.length, 0);
        } else {
            oVarArr[i + 1].a(nVar.f5838d, Integer.bitCount(nVar.f5835a) * 2, 0);
        }
        return b(i + 1);
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f5815m;
    }

    @Override // java.util.Iterator
    public Object next() {
        if (!this.f5815m) {
            throw new NoSuchElementException();
        }
        Object next = this.f5813k[this.f5814l].next();
        a();
        return next;
    }

    @Override // java.util.Iterator
    public void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
