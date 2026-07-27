package com.bytedance.adsdk.sf;

import com.applovin.impl.sdk.utils.JsonUtils;
import java.lang.reflect.Array;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* loaded from: classes4.dex */
public final class pcc<E> implements Collection<E>, Set<E> {
    private static int kj;
    private static Object[] qf;
    private static Object[] vj;
    private static int wh;
    private jr<E, E> ork;
    Object[] pcc;
    int sf;
    private int[] vy;
    private static final int[] gm = new int[0];
    private static final Object[] oo = new Object[0];

    private int pcc(Object obj, int i) {
        int i2 = this.sf;
        if (i2 == 0) {
            return -1;
        }
        int pcc = sf.pcc(this.vy, i2, i);
        if (pcc < 0 || obj.equals(this.pcc[pcc])) {
            return pcc;
        }
        int i3 = pcc + 1;
        while (i3 < i2 && this.vy[i3] == i) {
            if (obj.equals(this.pcc[i3])) {
                return i3;
            }
            i3++;
        }
        for (int i4 = pcc - 1; i4 >= 0 && this.vy[i4] == i; i4--) {
            if (obj.equals(this.pcc[i4])) {
                return i4;
            }
        }
        return ~i3;
    }

    private int pcc() {
        int i = this.sf;
        if (i == 0) {
            return -1;
        }
        int pcc = sf.pcc(this.vy, i, 0);
        if (pcc < 0 || this.pcc[pcc] == null) {
            return pcc;
        }
        int i2 = pcc + 1;
        while (i2 < i && this.vy[i2] == 0) {
            if (this.pcc[i2] == null) {
                return i2;
            }
            i2++;
        }
        for (int i3 = pcc - 1; i3 >= 0 && this.vy[i3] == 0; i3--) {
            if (this.pcc[i3] == null) {
                return i3;
            }
        }
        return ~i2;
    }

    private void oo(int i) {
        if (i == 8) {
            synchronized (pcc.class) {
                Object[] objArr = qf;
                if (objArr != null) {
                    this.pcc = objArr;
                    qf = (Object[]) objArr[0];
                    this.vy = (int[]) objArr[1];
                    objArr[1] = null;
                    objArr[0] = null;
                    kj--;
                    return;
                }
            }
        } else if (i == 4) {
            synchronized (pcc.class) {
                Object[] objArr2 = vj;
                if (objArr2 != null) {
                    this.pcc = objArr2;
                    vj = (Object[]) objArr2[0];
                    this.vy = (int[]) objArr2[1];
                    objArr2[1] = null;
                    objArr2[0] = null;
                    wh--;
                    return;
                }
            }
        }
        this.vy = new int[i];
        this.pcc = new Object[i];
    }

    private static void pcc(int[] iArr, Object[] objArr, int i) {
        if (iArr.length == 8) {
            synchronized (pcc.class) {
                if (kj < 10) {
                    objArr[0] = qf;
                    objArr[1] = iArr;
                    for (int i2 = i - 1; i2 >= 2; i2--) {
                        objArr[i2] = null;
                    }
                    qf = objArr;
                    kj++;
                }
            }
            return;
        }
        if (iArr.length == 4) {
            synchronized (pcc.class) {
                if (wh < 10) {
                    objArr[0] = vj;
                    objArr[1] = iArr;
                    for (int i3 = i - 1; i3 >= 2; i3--) {
                        objArr[i3] = null;
                    }
                    vj = objArr;
                    wh++;
                }
            }
        }
    }

    public pcc() {
        this(0);
    }

    public pcc(int i) {
        if (i == 0) {
            this.vy = gm;
            this.pcc = oo;
        } else {
            oo(i);
        }
        this.sf = 0;
    }

    @Override // java.util.Collection, java.util.Set
    public void clear() {
        int i = this.sf;
        if (i != 0) {
            pcc(this.vy, this.pcc, i);
            this.vy = gm;
            this.pcc = oo;
            this.sf = 0;
        }
    }

    public void pcc(int i) {
        int[] iArr = this.vy;
        if (iArr.length < i) {
            Object[] objArr = this.pcc;
            oo(i);
            int i2 = this.sf;
            if (i2 > 0) {
                System.arraycopy(iArr, 0, this.vy, 0, i2);
                System.arraycopy(objArr, 0, this.pcc, 0, this.sf);
            }
            pcc(iArr, objArr, this.sf);
        }
    }

    @Override // java.util.Collection, java.util.Set
    public boolean contains(Object obj) {
        return pcc(obj) >= 0;
    }

    public int pcc(Object obj) {
        return obj == null ? pcc() : pcc(obj, obj.hashCode());
    }

    public E sf(int i) {
        return (E) this.pcc[i];
    }

    @Override // java.util.Collection, java.util.Set
    public boolean isEmpty() {
        return this.sf <= 0;
    }

    @Override // java.util.Collection, java.util.Set
    public boolean add(E e) {
        int i;
        int pcc;
        if (e == null) {
            pcc = pcc();
            i = 0;
        } else {
            int hashCode = e.hashCode();
            i = hashCode;
            pcc = pcc(e, hashCode);
        }
        if (pcc >= 0) {
            return false;
        }
        int i2 = ~pcc;
        int i3 = this.sf;
        int[] iArr = this.vy;
        if (i3 >= iArr.length) {
            int i4 = 8;
            if (i3 >= 8) {
                i4 = (i3 >> 1) + i3;
            } else if (i3 < 4) {
                i4 = 4;
            }
            Object[] objArr = this.pcc;
            oo(i4);
            int[] iArr2 = this.vy;
            if (iArr2.length > 0) {
                System.arraycopy(iArr, 0, iArr2, 0, iArr.length);
                System.arraycopy(objArr, 0, this.pcc, 0, objArr.length);
            }
            pcc(iArr, objArr, this.sf);
        }
        int i5 = this.sf;
        if (i2 < i5) {
            int[] iArr3 = this.vy;
            int i6 = i2 + 1;
            System.arraycopy(iArr3, i2, iArr3, i6, i5 - i2);
            Object[] objArr2 = this.pcc;
            System.arraycopy(objArr2, i2, objArr2, i6, this.sf - i2);
        }
        this.vy[i2] = i;
        this.pcc[i2] = e;
        this.sf++;
        return true;
    }

    @Override // java.util.Collection, java.util.Set
    public boolean remove(Object obj) {
        int pcc = pcc(obj);
        if (pcc < 0) {
            return false;
        }
        gm(pcc);
        return true;
    }

    public E gm(int i) {
        Object[] objArr = this.pcc;
        E e = (E) objArr[i];
        int i2 = this.sf;
        if (i2 <= 1) {
            pcc(this.vy, objArr, i2);
            this.vy = gm;
            this.pcc = oo;
            this.sf = 0;
        } else {
            int[] iArr = this.vy;
            if (iArr.length > 8 && i2 < iArr.length / 3) {
                oo(i2 > 8 ? i2 + (i2 >> 1) : 8);
                this.sf--;
                if (i > 0) {
                    System.arraycopy(iArr, 0, this.vy, 0, i);
                    System.arraycopy(objArr, 0, this.pcc, 0, i);
                }
                int i3 = this.sf;
                if (i < i3) {
                    int i4 = i + 1;
                    System.arraycopy(iArr, i4, this.vy, i, i3 - i);
                    System.arraycopy(objArr, i4, this.pcc, i, this.sf - i);
                }
            } else {
                int i5 = i2 - 1;
                this.sf = i5;
                if (i < i5) {
                    int i6 = i + 1;
                    System.arraycopy(iArr, i6, iArr, i, i5 - i);
                    Object[] objArr2 = this.pcc;
                    System.arraycopy(objArr2, i6, objArr2, i, this.sf - i);
                }
                this.pcc[this.sf] = null;
            }
        }
        return e;
    }

    @Override // java.util.Collection, java.util.Set
    public int size() {
        return this.sf;
    }

    @Override // java.util.Collection, java.util.Set
    public Object[] toArray() {
        int i = this.sf;
        Object[] objArr = new Object[i];
        System.arraycopy(this.pcc, 0, objArr, 0, i);
        return objArr;
    }

    @Override // java.util.Collection, java.util.Set
    public <T> T[] toArray(T[] tArr) {
        if (tArr.length < this.sf) {
            tArr = (T[]) ((Object[]) Array.newInstance(tArr.getClass().getComponentType(), this.sf));
        }
        System.arraycopy(this.pcc, 0, tArr, 0, this.sf);
        int length = tArr.length;
        int i = this.sf;
        if (length > i) {
            tArr[i] = null;
        }
        return tArr;
    }

    @Override // java.util.Collection, java.util.Set
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof Set) {
            Set set = (Set) obj;
            if (size() != set.size()) {
                return false;
            }
            for (int i = 0; i < this.sf; i++) {
                try {
                    if (!set.contains(sf(i))) {
                        return false;
                    }
                } catch (ClassCastException | NullPointerException unused) {
                }
            }
            return true;
        }
        return false;
    }

    @Override // java.util.Collection, java.util.Set
    public int hashCode() {
        int[] iArr = this.vy;
        int i = this.sf;
        int i2 = 0;
        for (int i3 = 0; i3 < i; i3++) {
            i2 += iArr[i3];
        }
        return i2;
    }

    public String toString() {
        if (isEmpty()) {
            return JsonUtils.EMPTY_JSON;
        }
        StringBuilder sb = new StringBuilder(this.sf * 14);
        sb.append(AbstractJsonLexerKt.BEGIN_OBJ);
        for (int i = 0; i < this.sf; i++) {
            if (i > 0) {
                sb.append(", ");
            }
            E sf = sf(i);
            if (sf != this) {
                sb.append(sf);
            } else {
                sb.append("(this Set)");
            }
        }
        sb.append(AbstractJsonLexerKt.END_OBJ);
        return sb.toString();
    }

    private jr<E, E> sf() {
        if (this.ork == null) {
            this.ork = new jr<E, E>() { // from class: com.bytedance.adsdk.sf.pcc.1
                @Override // com.bytedance.adsdk.sf.jr
                protected int pcc() {
                    return pcc.this.sf;
                }

                @Override // com.bytedance.adsdk.sf.jr
                protected Object pcc(int i, int i2) {
                    return pcc.this.pcc[i];
                }

                @Override // com.bytedance.adsdk.sf.jr
                protected int pcc(Object obj) {
                    return pcc.this.pcc(obj);
                }

                @Override // com.bytedance.adsdk.sf.jr
                protected Map<E, E> sf() {
                    throw new UnsupportedOperationException("not a map");
                }

                @Override // com.bytedance.adsdk.sf.jr
                protected void pcc(int i) {
                    pcc.this.gm(i);
                }

                @Override // com.bytedance.adsdk.sf.jr
                protected void gm() {
                    pcc.this.clear();
                }
            };
        }
        return this.ork;
    }

    @Override // java.util.Collection, java.lang.Iterable, java.util.Set
    public Iterator<E> iterator() {
        return sf().oo().iterator();
    }

    @Override // java.util.Collection, java.util.Set
    public boolean containsAll(Collection<?> collection) {
        Iterator<?> it = collection.iterator();
        while (it.hasNext()) {
            if (!contains(it.next())) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.Collection, java.util.Set
    public boolean addAll(Collection<? extends E> collection) {
        pcc(this.sf + collection.size());
        Iterator<? extends E> it = collection.iterator();
        boolean z = false;
        while (it.hasNext()) {
            z |= add(it.next());
        }
        return z;
    }

    @Override // java.util.Collection, java.util.Set
    public boolean removeAll(Collection<?> collection) {
        Iterator<?> it = collection.iterator();
        boolean z = false;
        while (it.hasNext()) {
            z |= remove(it.next());
        }
        return z;
    }

    @Override // java.util.Collection, java.util.Set
    public boolean retainAll(Collection<?> collection) {
        boolean z = false;
        for (int i = this.sf - 1; i >= 0; i--) {
            if (!collection.contains(this.pcc[i])) {
                gm(i);
                z = true;
            }
        }
        return z;
    }
}
