package com.android.volley;

/* loaded from: classes3.dex */
public class NetworkResponse {
    public final java.util.List<com.android.volley.Header> allHeaders;
    public final byte[] data;
    public final java.util.Map<java.lang.String, java.lang.String> headers;
    public final long networkTimeMs;
    public final boolean notModified;
    public final int statusCode;

    @java.lang.Deprecated
    public NetworkResponse(int i, byte[] bArr, java.util.Map<java.lang.String, java.lang.String> map, boolean z, long j) {
        this(i, bArr, map, getHighSpeedVideoFpsRanges(map), z, j);
    }

    public NetworkResponse(int i, byte[] bArr, boolean z, long j, java.util.List<com.android.volley.Header> list) {
        this(i, bArr, getHighSpeedVideoSizes(list), list, z, j);
    }

    @java.lang.Deprecated
    public NetworkResponse(int i, byte[] bArr, java.util.Map<java.lang.String, java.lang.String> map, boolean z) {
        this(i, bArr, map, z, 0L);
    }

    public NetworkResponse(byte[] bArr) {
        this(200, bArr, false, 0L, (java.util.List<com.android.volley.Header>) java.util.Collections.emptyList());
    }

    @java.lang.Deprecated
    public NetworkResponse(byte[] bArr, java.util.Map<java.lang.String, java.lang.String> map) {
        this(200, bArr, map, false, 0L);
    }

    private NetworkResponse(int i, byte[] bArr, java.util.Map<java.lang.String, java.lang.String> map, java.util.List<com.android.volley.Header> list, boolean z, long j) {
        this.statusCode = i;
        this.data = bArr;
        this.headers = map;
        if (list == null) {
            this.allHeaders = null;
        } else {
            this.allHeaders = java.util.Collections.unmodifiableList(list);
        }
        this.notModified = z;
        this.networkTimeMs = j;
    }

    private static java.util.Map<java.lang.String, java.lang.String> getHighSpeedVideoSizes(java.util.List<com.android.volley.Header> list) {
        if (list == null) {
            return null;
        }
        if (list.isEmpty()) {
            return java.util.Collections.emptyMap();
        }
        java.util.TreeMap treeMap = new java.util.TreeMap(java.lang.String.CASE_INSENSITIVE_ORDER);
        for (com.android.volley.Header header : list) {
            treeMap.put(header.getName(), header.getValue());
        }
        return treeMap;
    }

    private static java.util.List<com.android.volley.Header> getHighSpeedVideoFpsRanges(java.util.Map<java.lang.String, java.lang.String> map) {
        if (map == null) {
            return null;
        }
        if (map.isEmpty()) {
            return java.util.Collections.emptyList();
        }
        java.util.ArrayList arrayList = new java.util.ArrayList(map.size());
        for (java.util.Map.Entry<java.lang.String, java.lang.String> entry : map.entrySet()) {
            arrayList.add(new com.android.volley.Header(entry.getKey(), entry.getValue()));
        }
        return arrayList;
    }
}
