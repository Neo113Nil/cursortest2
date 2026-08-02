package kotlin.collections;

@kotlin.Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010#\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\b&\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u00022\b\u0012\u0004\u0012\u00028\u00000\u0003B\t\b\u0004¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\b\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00028\u0000H'¢\u0006\u0004\b\b\u0010\t"}, d2 = {"Lkotlin/collections/AbstractMutableSet;", "E", "", "Ljava/util/AbstractSet;", "<init>", "()V", "element", "", com.paypal.oslo.feature.userprofile.api.analytics.UserProfileAnalytics.Actions.ADD, "(Ljava/lang/Object;)Z"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public abstract class AbstractMutableSet<E> extends java.util.AbstractSet<E> implements java.util.Set<E>, kotlin.jvm.internal.markers.KMutableSet {
    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    @kotlin.IgnorableReturnValue
    public abstract boolean add(E element);

    public abstract int getSize();

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return getSize();
    }
}
