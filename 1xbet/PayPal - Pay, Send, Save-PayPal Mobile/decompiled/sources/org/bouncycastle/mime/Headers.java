package org.bouncycastle.mime;

/* loaded from: classes17.dex */
public class Headers implements org.bouncycastle.util.Iterable<java.lang.String> {
    private java.lang.String Camera2StreamConfigurationMap;
    private final java.util.Map<java.lang.String, java.util.List> getHighResolutionOutputSizeshNQ4ISI;
    private java.lang.String getHighSpeedVideoFpsRanges;
    private java.util.Map<java.lang.String, java.lang.String> getHighSpeedVideoFpsRangesFor;
    private final java.lang.String getHighSpeedVideoSizes;
    private boolean getOutputFormats;
    private final java.util.List<java.lang.String> getOutputMinFrameDuration;

    public Headers(java.util.List<java.lang.String> list, java.lang.String str) {
        java.util.Map<java.lang.String, java.lang.String> unmodifiableMap;
        this.getHighResolutionOutputSizeshNQ4ISI = new java.util.TreeMap(java.lang.String.CASE_INSENSITIVE_ORDER);
        this.getOutputMinFrameDuration = list;
        java.lang.String str2 = "";
        for (java.lang.String str3 : list) {
            if (str3.startsWith(" ") || str3.startsWith("\t")) {
                java.lang.StringBuilder sb = new java.lang.StringBuilder();
                sb.append(str2);
                sb.append(str3.trim());
                str2 = sb.toString();
            } else {
                if (str2.length() != 0) {
                    getHighSpeedVideoSizes(str2.substring(0, str2.indexOf(58)).trim(), str2.substring(str2.indexOf(58) + 1).trim());
                }
                str2 = str3;
            }
        }
        if (str2.trim().length() != 0) {
            getHighSpeedVideoSizes(str2.substring(0, str2.indexOf(58)).trim(), str2.substring(str2.indexOf(58) + 1).trim());
        }
        java.lang.String str4 = getValues("Content-Type") == null ? "text/plain" : getValues("Content-Type")[0];
        int indexOf = str4.indexOf(59);
        if (indexOf < 0) {
            this.getHighSpeedVideoFpsRanges = str4;
            unmodifiableMap = java.util.Collections.EMPTY_MAP;
        } else {
            this.getHighSpeedVideoFpsRanges = str4.substring(0, indexOf);
            java.lang.String[] split = str4.substring(indexOf + 1).trim().split(";");
            java.util.LinkedHashMap linkedHashMap = new java.util.LinkedHashMap();
            for (int i = 0; i != split.length; i++) {
                java.lang.String str5 = split[i];
                int indexOf2 = str5.indexOf(61);
                if (indexOf2 < 0) {
                    throw new java.lang.IllegalArgumentException("malformed Content-Type header");
                }
                linkedHashMap.put(str5.substring(0, indexOf2).trim(), str5.substring(indexOf2 + 1).trim());
            }
            unmodifiableMap = java.util.Collections.unmodifiableMap(linkedHashMap);
        }
        this.getHighSpeedVideoFpsRangesFor = unmodifiableMap;
        this.getHighSpeedVideoSizes = getValues("Content-Transfer-Encoding") != null ? getValues("Content-Transfer-Encoding")[0] : str;
        if (this.getHighSpeedVideoFpsRanges.indexOf(io.ktor.http.ContentType.MultiPart.TYPE) < 0) {
            this.Camera2StreamConfigurationMap = null;
            this.getOutputFormats = false;
        } else {
            this.getOutputFormats = true;
            java.lang.String str6 = this.getHighSpeedVideoFpsRangesFor.get("boundary");
            this.Camera2StreamConfigurationMap = str6.substring(1, str6.length() - 1);
        }
    }

    @Override // org.bouncycastle.util.Iterable, java.lang.Iterable
    public java.util.Iterator<java.lang.String> iterator() {
        return this.getHighResolutionOutputSizeshNQ4ISI.keySet().iterator();
    }

    public boolean isMultipart() {
        return this.getOutputFormats;
    }

    public boolean isEmpty() {
        boolean isEmpty;
        synchronized (this) {
            isEmpty = this.getHighResolutionOutputSizeshNQ4ISI.isEmpty();
        }
        return isEmpty;
    }

    public java.lang.String[] getValues(java.lang.String str) {
        synchronized (this) {
            java.util.List list = this.getHighResolutionOutputSizeshNQ4ISI.get(str);
            if (list == null) {
                return null;
            }
            java.lang.String[] strArr = new java.lang.String[list.size()];
            for (int i = 0; i < list.size(); i++) {
                strArr[i] = ((org.bouncycastle.mime.Headers.KV) list.get(i)).getHighSpeedVideoFpsRangesFor;
            }
            return strArr;
        }
    }

    public java.util.Iterator<java.lang.String> getNames() {
        return this.getHighResolutionOutputSizeshNQ4ISI.keySet().iterator();
    }

    public java.util.Map<java.lang.String, java.lang.String> getContentTypeAttributes() {
        return this.getHighSpeedVideoFpsRangesFor;
    }

    public java.lang.String getContentType() {
        return this.getHighSpeedVideoFpsRanges;
    }

    public java.lang.String getContentTransferEncoding() {
        return this.getHighSpeedVideoSizes;
    }

    public java.lang.String getBoundary() {
        return this.Camera2StreamConfigurationMap;
    }

    public void dumpHeaders(java.io.OutputStream outputStream) throws java.io.IOException {
        java.util.Iterator<java.lang.String> it = this.getOutputMinFrameDuration.iterator();
        while (it.hasNext()) {
            outputStream.write(org.bouncycastle.util.Strings.toUTF8ByteArray(it.next().toString()));
            outputStream.write(13);
            outputStream.write(10);
        }
    }

    public boolean containsKey(java.lang.String str) {
        return this.getHighResolutionOutputSizeshNQ4ISI.containsKey(str);
    }

    private void getHighSpeedVideoSizes(java.lang.String str, java.lang.String str2) {
        synchronized (this) {
            org.bouncycastle.mime.Headers.KV kv = new org.bouncycastle.mime.Headers.KV(str, str2);
            java.util.List list = this.getHighResolutionOutputSizeshNQ4ISI.get(str);
            if (list == null) {
                list = new java.util.ArrayList();
                this.getHighResolutionOutputSizeshNQ4ISI.put(str, list);
            }
            list.add(kv);
        }
    }

    class KV {
        public final java.lang.String getHighSpeedVideoFpsRangesFor;
        public final java.lang.String getHighSpeedVideoSizes;

        public KV(java.lang.String str, java.lang.String str2) {
            this.getHighSpeedVideoSizes = str;
            this.getHighSpeedVideoFpsRangesFor = str2;
        }
    }

    private static java.util.List<java.lang.String> Camera2StreamConfigurationMap(java.io.InputStream inputStream) throws java.io.IOException {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        org.bouncycastle.mime.LineReader lineReader = new org.bouncycastle.mime.LineReader(inputStream);
        while (true) {
            java.lang.String Camera2StreamConfigurationMap = lineReader.Camera2StreamConfigurationMap();
            if (Camera2StreamConfigurationMap == null || Camera2StreamConfigurationMap.length() == 0) {
                break;
            }
            arrayList.add(Camera2StreamConfigurationMap);
        }
        return arrayList;
    }

    public Headers(java.io.InputStream inputStream, java.lang.String str) throws java.io.IOException {
        this(Camera2StreamConfigurationMap(inputStream), str);
    }
}
