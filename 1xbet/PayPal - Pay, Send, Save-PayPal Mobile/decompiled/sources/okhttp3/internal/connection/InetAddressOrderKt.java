package okhttp3.internal.connection;

@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\u001a#\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00010\u00002\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\u0000¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "Ljava/net/InetAddress;", "addresses", "reorderForHappyEyeballs", "(Ljava/util/List;)Ljava/util/List;"}, k = 2, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class InetAddressOrderKt {
    /* JADX WARN: Multi-variable type inference failed */
    public static final java.util.List<java.net.InetAddress> reorderForHappyEyeballs(java.util.List<? extends java.net.InetAddress> list) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list, "");
        if (list.size() < 2) {
            return list;
        }
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        for (java.lang.Object obj : list) {
            if (((java.net.InetAddress) obj) instanceof java.net.Inet6Address) {
                arrayList.add(obj);
            } else {
                arrayList2.add(obj);
            }
        }
        kotlin.Pair pair = new kotlin.Pair(arrayList, arrayList2);
        java.util.List list2 = (java.util.List) pair.component1();
        java.util.List list3 = (java.util.List) pair.component2();
        return (list2.isEmpty() || list3.isEmpty()) ? list : okhttp3.internal._UtilCommonKt.interleave(list2, list3);
    }
}
