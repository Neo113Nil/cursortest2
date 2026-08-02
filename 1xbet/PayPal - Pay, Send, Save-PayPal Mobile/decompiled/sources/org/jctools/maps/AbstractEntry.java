package org.jctools.maps;

/* loaded from: classes18.dex */
abstract class AbstractEntry<TypeK, TypeV> implements java.util.Map.Entry<TypeK, TypeV> {
    protected final TypeK _key;
    protected TypeV _val;

    public AbstractEntry(TypeK typek, TypeV typev) {
        this._key = typek;
        this._val = typev;
    }

    public java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append(this._key);
        sb.append("=");
        sb.append(this._val);
        return sb.toString();
    }

    @Override // java.util.Map.Entry
    public TypeK getKey() {
        return this._key;
    }

    @Override // java.util.Map.Entry
    public TypeV getValue() {
        return this._val;
    }

    @Override // java.util.Map.Entry
    public boolean equals(java.lang.Object obj) {
        if (!(obj instanceof java.util.Map.Entry)) {
            return false;
        }
        java.util.Map.Entry entry = (java.util.Map.Entry) obj;
        return eq(this._key, entry.getKey()) && eq(this._val, entry.getValue());
    }

    @Override // java.util.Map.Entry
    public int hashCode() {
        TypeK typek = this._key;
        int hashCode = typek == null ? 0 : typek.hashCode();
        TypeV typev = this._val;
        return hashCode ^ (typev != null ? typev.hashCode() : 0);
    }

    private static boolean eq(java.lang.Object obj, java.lang.Object obj2) {
        if (obj == null) {
            return obj2 == null;
        }
        return obj.equals(obj2);
    }
}
