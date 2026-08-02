package com.google.android.gms.internal.firebase_database;

import android.util.Base64;
import java.net.URI;
import java.util.LinkedHashMap;
import java.util.Map;

/* loaded from: classes.dex */
final class zzjy {
    private String protocol;
    private URI zztc;
    private String zzts;
    private Map<String, String> zztt;

    public zzjy(URI uri, String str, Map<String, String> map) {
        this.zztc = null;
        this.protocol = null;
        this.zzts = null;
        this.zztt = null;
        this.zztc = uri;
        this.protocol = null;
        this.zztt = map;
        byte[] bArr = new byte[16];
        for (int i = 0; i < 16; i++) {
            bArr[i] = (byte) ((Math.random() * 255.0d) + 0.0d);
        }
        this.zzts = Base64.encodeToString(bArr, 2);
    }

    public final byte[] zzgo() {
        String concat;
        String path = this.zztc.getPath();
        String query = this.zztc.getQuery();
        String valueOf = String.valueOf(path);
        if (query == null) {
            concat = "";
        } else {
            String valueOf2 = String.valueOf(query);
            concat = valueOf2.length() != 0 ? "?".concat(valueOf2) : new String("?");
        }
        String valueOf3 = String.valueOf(concat);
        String concat2 = valueOf3.length() != 0 ? valueOf.concat(valueOf3) : new String(valueOf);
        String host = this.zztc.getHost();
        if (this.zztc.getPort() != -1) {
            String valueOf4 = String.valueOf(host);
            int port = this.zztc.getPort();
            StringBuilder sb = new StringBuilder(String.valueOf(valueOf4).length() + 12);
            sb.append(valueOf4);
            sb.append(":");
            sb.append(port);
            host = sb.toString();
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("Host", host);
        linkedHashMap.put("Upgrade", "websocket");
        linkedHashMap.put("Connection", "Upgrade");
        linkedHashMap.put("Sec-WebSocket-Version", "13");
        linkedHashMap.put("Sec-WebSocket-Key", this.zzts);
        String str = this.protocol;
        if (str != null) {
            linkedHashMap.put("Sec-WebSocket-Protocol", str);
        }
        Map<String, String> map = this.zztt;
        if (map != null) {
            for (String str2 : map.keySet()) {
                if (!linkedHashMap.containsKey(str2)) {
                    linkedHashMap.put(str2, this.zztt.get(str2));
                }
            }
        }
        StringBuilder sb2 = new StringBuilder(String.valueOf(concat2).length() + 15);
        sb2.append("GET ");
        sb2.append(concat2);
        sb2.append(" HTTP/1.1\r\n");
        String valueOf5 = String.valueOf(sb2.toString());
        String str3 = new String();
        for (String str4 : linkedHashMap.keySet()) {
            String valueOf6 = String.valueOf(str3);
            String str5 = (String) linkedHashMap.get(str4);
            StringBuilder sb3 = new StringBuilder(String.valueOf(valueOf6).length() + 4 + String.valueOf(str4).length() + String.valueOf(str5).length());
            sb3.append(valueOf6);
            sb3.append(str4);
            sb3.append(": ");
            sb3.append(str5);
            sb3.append("\r\n");
            str3 = sb3.toString();
        }
        String valueOf7 = String.valueOf(str3);
        String concat3 = String.valueOf(valueOf7.length() != 0 ? valueOf5.concat(valueOf7) : new String(valueOf5)).concat("\r\n");
        byte[] bArr = new byte[concat3.getBytes().length];
        System.arraycopy(concat3.getBytes(), 0, bArr, 0, concat3.getBytes().length);
        return bArr;
    }
}
