package j5;

import g4.AbstractC0459d;
import java.util.RandomAccess;

/* loaded from: classes.dex */
public final class n extends AbstractC0459d implements RandomAccess {

    /* renamed from: a, reason: collision with root package name */
    public final i[] f10512a;

    public n(i[] iVarArr) {
        this.f10512a = iVarArr;
    }

    @Override // g4.AbstractC0456a
    public final int c() {
        return this.f10512a.length;
    }

    @Override // g4.AbstractC0456a, java.util.Collection, java.util.List
    public final /* bridge */ boolean contains(Object obj) {
        if (obj instanceof i) {
            return super.contains((i) obj);
        }
        return false;
    }

    @Override // java.util.List
    public final Object get(int i2) {
        return this.f10512a[i2];
    }

    @Override // g4.AbstractC0459d, java.util.List
    public final /* bridge */ int indexOf(Object obj) {
        if (obj instanceof i) {
            return super.indexOf((i) obj);
        }
        return -1;
    }

    @Override // g4.AbstractC0459d, java.util.List
    public final /* bridge */ int lastIndexOf(Object obj) {
        if (obj instanceof i) {
            return super.lastIndexOf((i) obj);
        }
        return -1;
    }
}
