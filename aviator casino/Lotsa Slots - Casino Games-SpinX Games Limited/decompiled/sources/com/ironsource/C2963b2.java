package com.ironsource;

/* renamed from: com.ironsource.b2, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public class C2963b2 {
    public static final int c = -1;
    public static final int d = 0;

    /* renamed from: a, reason: collision with root package name */
    private java.util.concurrent.ConcurrentHashMap<java.lang.String, java.util.ArrayList<com.ironsource.C2963b2.a>> f6146a = new java.util.concurrent.ConcurrentHashMap<>();
    private int b;

    /* renamed from: com.ironsource.b2$a */
    public enum a {
        ISAuctionPerformanceDidntAttemptToLoad,
        ISAuctionPerformanceFailedToLoad,
        ISAuctionPerformanceLoadedSuccessfully,
        ISAuctionPerformanceFailedToShow,
        ISAuctionPerformanceShowedSuccessfully,
        ISAuctionPerformanceNotPartOfWaterfall
    }

    public C2963b2(java.util.List<com.ironsource.mediationsdk.model.NetworkSettings> list, int i) {
        this.b = i;
        for (com.ironsource.mediationsdk.model.NetworkSettings networkSettings : list) {
            this.f6146a.put(networkSettings.getProviderName(), new java.util.ArrayList<>());
        }
    }

    public void a(java.util.concurrent.ConcurrentHashMap<java.lang.String, com.ironsource.C2963b2.a> concurrentHashMap) {
        if (this.b == 0) {
            return;
        }
        for (java.lang.String str : this.f6146a.keySet()) {
            com.ironsource.C2963b2.a aVar = com.ironsource.C2963b2.a.ISAuctionPerformanceNotPartOfWaterfall;
            if (concurrentHashMap.containsKey(str)) {
                aVar = concurrentHashMap.get(str);
            }
            java.util.ArrayList<com.ironsource.C2963b2.a> arrayList = this.f6146a.get(str);
            if (this.b != -1 && arrayList.size() == this.b) {
                arrayList.remove(0);
            }
            arrayList.add(aVar);
        }
    }

    public java.lang.String a(java.lang.String str) {
        java.util.ArrayList<com.ironsource.C2963b2.a> arrayList = this.f6146a.get(str);
        java.lang.String str2 = "";
        if (arrayList != null && !arrayList.isEmpty()) {
            java.util.Iterator<com.ironsource.C2963b2.a> it = arrayList.iterator();
            str2 = "" + it.next().ordinal();
            while (it.hasNext()) {
                str2 = (str2 + ",") + it.next().ordinal();
            }
        }
        return str2;
    }
}
