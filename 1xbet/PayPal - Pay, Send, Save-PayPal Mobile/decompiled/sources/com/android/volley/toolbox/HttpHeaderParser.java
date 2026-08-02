package com.android.volley.toolbox;

/* loaded from: classes3.dex */
public class HttpHeaderParser {
    public static final java.lang.String HEADER_CONTENT_TYPE = "Content-Type";

    public static com.android.volley.Cache.Entry parseCacheHeaders(com.android.volley.NetworkResponse networkResponse) {
        boolean z;
        long j;
        long j2;
        long j3;
        long j4;
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        java.util.Map<java.lang.String, java.lang.String> map = networkResponse.headers;
        if (map == null) {
            return null;
        }
        java.lang.String str = map.get(com.google.common.net.HttpHeaders.DATE);
        long parseDateAsEpoch = str != null ? parseDateAsEpoch(str) : 0L;
        java.lang.String str2 = map.get("Cache-Control");
        int i = 0;
        if (str2 != null) {
            java.lang.String[] split = str2.split(",", 0);
            z = false;
            j = 0;
            j2 = 0;
            while (i < split.length) {
                java.lang.String trim = split[i].trim();
                if (trim.equals("no-cache") || trim.equals(io.ktor.client.utils.CacheControl.NO_STORE)) {
                    return null;
                }
                if (trim.startsWith("max-age=")) {
                    try {
                        j = java.lang.Long.parseLong(trim.substring(8));
                    } catch (java.lang.Exception unused) {
                    }
                } else if (trim.startsWith("stale-while-revalidate=")) {
                    j2 = java.lang.Long.parseLong(trim.substring(23));
                } else if (trim.equals(io.ktor.client.utils.CacheControl.MUST_REVALIDATE) || trim.equals(io.ktor.client.utils.CacheControl.PROXY_REVALIDATE)) {
                    z = true;
                }
                i++;
            }
            i = 1;
        } else {
            z = false;
            j = 0;
            j2 = 0;
        }
        java.lang.String str3 = map.get(com.google.common.net.HttpHeaders.EXPIRES);
        long parseDateAsEpoch2 = str3 != null ? parseDateAsEpoch(str3) : 0L;
        java.lang.String str4 = map.get("Last-Modified");
        long parseDateAsEpoch3 = str4 != null ? parseDateAsEpoch(str4) : 0L;
        java.lang.String str5 = map.get("ETag");
        if (i != 0) {
            j3 = currentTimeMillis + (j * 1000);
            if (!z) {
                j4 = (j2 * 1000) + j3;
                com.android.volley.Cache.Entry entry = new com.android.volley.Cache.Entry();
                entry.data = networkResponse.data;
                entry.etag = str5;
                entry.softTtl = j3;
                entry.ttl = j4;
                entry.serverDate = parseDateAsEpoch;
                entry.lastModified = parseDateAsEpoch3;
                entry.responseHeaders = map;
                entry.allResponseHeaders = networkResponse.allHeaders;
                return entry;
            }
        } else {
            j3 = (parseDateAsEpoch <= 0 || parseDateAsEpoch2 < parseDateAsEpoch) ? 0L : currentTimeMillis + (parseDateAsEpoch2 - parseDateAsEpoch);
        }
        j4 = j3;
        com.android.volley.Cache.Entry entry2 = new com.android.volley.Cache.Entry();
        entry2.data = networkResponse.data;
        entry2.etag = str5;
        entry2.softTtl = j3;
        entry2.ttl = j4;
        entry2.serverDate = parseDateAsEpoch;
        entry2.lastModified = parseDateAsEpoch3;
        entry2.responseHeaders = map;
        entry2.allResponseHeaders = networkResponse.allHeaders;
        return entry2;
    }

    public static long parseDateAsEpoch(java.lang.String str) {
        try {
            java.text.SimpleDateFormat simpleDateFormat = new java.text.SimpleDateFormat("EEE, dd MMM yyyy HH:mm:ss zzz", java.util.Locale.US);
            simpleDateFormat.setTimeZone(java.util.TimeZone.getTimeZone("GMT"));
            return simpleDateFormat.parse(str).getTime();
        } catch (java.text.ParseException e) {
            if ("0".equals(str) || "-1".equals(str)) {
                com.android.volley.VolleyLog.v("Unable to parse dateStr: %s, falling back to 0", str);
                return 0L;
            }
            com.android.volley.VolleyLog.e(e, "Unable to parse dateStr: %s, falling back to 0", str);
            return 0L;
        }
    }

    public static java.lang.String parseCharset(java.util.Map<java.lang.String, java.lang.String> map, java.lang.String str) {
        java.lang.String str2;
        if (map != null && (str2 = map.get("Content-Type")) != null) {
            java.lang.String[] split = str2.split(";", 0);
            for (int i = 1; i < split.length; i++) {
                java.lang.String[] split2 = split[i].trim().split("=", 0);
                if (split2.length == 2 && split2[0].equals(io.ktor.http.auth.HttpAuthHeader.Parameters.Charset)) {
                    return split2[1];
                }
            }
        }
        return str;
    }

    public static java.lang.String parseCharset(java.util.Map<java.lang.String, java.lang.String> map) {
        return parseCharset(map, "ISO-8859-1");
    }

    static java.util.Map<java.lang.String, java.lang.String> Camera2StreamConfigurationMap(java.util.List<com.android.volley.Header> list) {
        java.util.TreeMap treeMap = new java.util.TreeMap(java.lang.String.CASE_INSENSITIVE_ORDER);
        for (com.android.volley.Header header : list) {
            treeMap.put(header.getName(), header.getValue());
        }
        return treeMap;
    }

    static java.util.List<com.android.volley.Header> getHighSpeedVideoFpsRanges(java.util.Map<java.lang.String, java.lang.String> map) {
        java.util.ArrayList arrayList = new java.util.ArrayList(map.size());
        for (java.util.Map.Entry<java.lang.String, java.lang.String> entry : map.entrySet()) {
            arrayList.add(new com.android.volley.Header(entry.getKey(), entry.getValue()));
        }
        return arrayList;
    }

    static java.util.List<com.android.volley.Header> getHighSpeedVideoFpsRangesFor(java.util.List<com.android.volley.Header> list, com.android.volley.Cache.Entry entry) {
        java.util.TreeSet treeSet = new java.util.TreeSet(java.lang.String.CASE_INSENSITIVE_ORDER);
        if (!list.isEmpty()) {
            java.util.Iterator<com.android.volley.Header> it = list.iterator();
            while (it.hasNext()) {
                treeSet.add(it.next().getName());
            }
        }
        java.util.ArrayList arrayList = new java.util.ArrayList(list);
        if (entry.allResponseHeaders != null) {
            if (!entry.allResponseHeaders.isEmpty()) {
                for (com.android.volley.Header header : entry.allResponseHeaders) {
                    if (!treeSet.contains(header.getName())) {
                        arrayList.add(header);
                    }
                }
            }
        } else if (!entry.responseHeaders.isEmpty()) {
            for (java.util.Map.Entry<java.lang.String, java.lang.String> entry2 : entry.responseHeaders.entrySet()) {
                if (!treeSet.contains(entry2.getKey())) {
                    arrayList.add(new com.android.volley.Header(entry2.getKey(), entry2.getValue()));
                }
            }
        }
        return arrayList;
    }

    static java.util.Map<java.lang.String, java.lang.String> getHighSpeedVideoSizes(com.android.volley.Cache.Entry entry) {
        if (entry == null) {
            return java.util.Collections.emptyMap();
        }
        java.util.HashMap hashMap = new java.util.HashMap();
        if (entry.etag != null) {
            hashMap.put("If-None-Match", entry.etag);
        }
        if (entry.lastModified > 0) {
            long j = entry.lastModified;
            java.text.SimpleDateFormat simpleDateFormat = new java.text.SimpleDateFormat("EEE, dd MMM yyyy HH:mm:ss 'GMT'", java.util.Locale.US);
            simpleDateFormat.setTimeZone(java.util.TimeZone.getTimeZone("GMT"));
            hashMap.put("If-Modified-Since", simpleDateFormat.format(new java.util.Date(j)));
        }
        return hashMap;
    }
}
