package kotlin.reflect.jvm.internal.impl.types.model;

/* loaded from: classes5.dex */
public final class ArgumentList extends java.util.ArrayList<kotlin.reflect.jvm.internal.impl.types.model.TypeArgumentMarker> implements kotlin.reflect.jvm.internal.impl.types.model.TypeArgumentListMarker {
    public ArgumentList(int i) {
        super(i);
    }

    @Override // java.util.ArrayList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* bridge */ boolean contains(java.lang.Object obj) {
        if (obj instanceof kotlin.reflect.jvm.internal.impl.types.model.TypeArgumentMarker) {
            return contains((kotlin.reflect.jvm.internal.impl.types.model.TypeArgumentMarker) obj);
        }
        return false;
    }

    public final /* bridge */ boolean contains(kotlin.reflect.jvm.internal.impl.types.model.TypeArgumentMarker typeArgumentMarker) {
        return super.contains((java.lang.Object) typeArgumentMarker);
    }

    public final int getSize() {
        return super.size();
    }

    @Override // java.util.ArrayList, java.util.AbstractList, java.util.List
    public final /* bridge */ int indexOf(java.lang.Object obj) {
        if (obj instanceof kotlin.reflect.jvm.internal.impl.types.model.TypeArgumentMarker) {
            return indexOf((kotlin.reflect.jvm.internal.impl.types.model.TypeArgumentMarker) obj);
        }
        return -1;
    }

    public final /* bridge */ int indexOf(kotlin.reflect.jvm.internal.impl.types.model.TypeArgumentMarker typeArgumentMarker) {
        return super.indexOf((java.lang.Object) typeArgumentMarker);
    }

    @Override // java.util.ArrayList, java.util.AbstractList, java.util.List
    public final /* bridge */ int lastIndexOf(java.lang.Object obj) {
        if (obj instanceof kotlin.reflect.jvm.internal.impl.types.model.TypeArgumentMarker) {
            return lastIndexOf((kotlin.reflect.jvm.internal.impl.types.model.TypeArgumentMarker) obj);
        }
        return -1;
    }

    public final /* bridge */ int lastIndexOf(kotlin.reflect.jvm.internal.impl.types.model.TypeArgumentMarker typeArgumentMarker) {
        return super.lastIndexOf((java.lang.Object) typeArgumentMarker);
    }

    @Override // java.util.ArrayList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* bridge */ boolean remove(java.lang.Object obj) {
        if (obj instanceof kotlin.reflect.jvm.internal.impl.types.model.TypeArgumentMarker) {
            return remove((kotlin.reflect.jvm.internal.impl.types.model.TypeArgumentMarker) obj);
        }
        return false;
    }

    public final /* bridge */ boolean remove(kotlin.reflect.jvm.internal.impl.types.model.TypeArgumentMarker typeArgumentMarker) {
        return super.remove((java.lang.Object) typeArgumentMarker);
    }

    @Override // java.util.ArrayList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return getSize();
    }
}
