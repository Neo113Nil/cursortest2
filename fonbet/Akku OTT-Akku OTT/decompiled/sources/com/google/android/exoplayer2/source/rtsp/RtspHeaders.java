package com.google.android.exoplayer2.source.rtsp;

import androidx.annotation.Nullable;
import com.google.android.exoplayer2.util.Util;
import com.google.common.collect.C0965m;
import com.google.common.collect.C0976y;
import com.google.common.collect.E;
import com.google.common.collect.G;
import com.google.common.collect.H;
import com.google.common.collect.I;
import com.google.common.collect.N;
import com.google.common.collect.i0;
import com.google.common.collect.r;
import java.util.AbstractCollection;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

@Deprecated
/* loaded from: classes4.dex */
final class RtspHeaders {
    public static final String ACCEPT = "Accept";
    public static final String ALLOW = "Allow";
    public static final String AUTHORIZATION = "Authorization";
    public static final String BANDWIDTH = "Bandwidth";
    public static final String BLOCKSIZE = "Blocksize";
    public static final String CACHE_CONTROL = "Cache-Control";
    public static final String CONNECTION = "Connection";
    public static final String CONTENT_BASE = "Content-Base";
    public static final String CONTENT_ENCODING = "Content-Encoding";
    public static final String CONTENT_LANGUAGE = "Content-Language";
    public static final String CONTENT_LENGTH = "Content-Length";
    public static final String CONTENT_LOCATION = "Content-Location";
    public static final String CONTENT_TYPE = "Content-Type";
    public static final String CSEQ = "CSeq";
    public static final String DATE = "Date";
    public static final RtspHeaders EMPTY = new Builder().build();
    public static final String EXPIRES = "Expires";
    public static final String LOCATION = "Location";
    public static final String PROXY_AUTHENTICATE = "Proxy-Authenticate";
    public static final String PROXY_REQUIRE = "Proxy-Require";
    public static final String PUBLIC = "Public";
    public static final String RANGE = "Range";
    public static final String RTCP_INTERVAL = "RTCP-Interval";
    public static final String RTP_INFO = "RTP-Info";
    public static final String SCALE = "Scale";
    public static final String SESSION = "Session";
    public static final String SPEED = "Speed";
    public static final String SUPPORTED = "Supported";
    public static final String TIMESTAMP = "Timestamp";
    public static final String TRANSPORT = "Transport";
    public static final String USER_AGENT = "User-Agent";
    public static final String VIA = "Via";
    public static final String WWW_AUTHENTICATE = "WWW-Authenticate";
    private final H<String, String> namesAndValues;

    public static final class Builder {
        private final H.a<String, String> namesAndValuesBuilder;

        public Builder add(String str, String str2) {
            H.a<String, String> aVar = this.namesAndValuesBuilder;
            String convertToStandardHeaderName = RtspHeaders.convertToStandardHeaderName(str.trim());
            String trim = str2.trim();
            aVar.getClass();
            C0965m.a(convertToStandardHeaderName, trim);
            r rVar = aVar.a;
            if (rVar == null) {
                rVar = r.a();
                aVar.a = rVar;
            }
            E.b bVar = (E.b) rVar.get(convertToStandardHeaderName);
            if (bVar == null) {
                bVar = G.i(4);
                r rVar2 = aVar.a;
                if (rVar2 == null) {
                    rVar2 = r.a();
                    aVar.a = rVar2;
                }
                rVar2.put(convertToStandardHeaderName, bVar);
            }
            bVar.a(trim);
            return this;
        }

        public Builder addAll(List<String> list) {
            for (int i = 0; i < list.size(); i++) {
                String[] splitAtFirst = Util.splitAtFirst(list.get(i), ":\\s?");
                if (splitAtFirst.length == 2) {
                    add(splitAtFirst[0], splitAtFirst[1]);
                }
            }
            return this;
        }

        public RtspHeaders build() {
            return new RtspHeaders(this);
        }

        public Builder() {
            this.namesAndValuesBuilder = new H.a<>();
        }

        public Builder addAll(Map<String, String> map) {
            for (Map.Entry<String, String> entry : map.entrySet()) {
                add(entry.getKey(), entry.getValue());
            }
            return this;
        }

        public Builder(String str, @Nullable String str2, int i) {
            this();
            add(RtspHeaders.USER_AGENT, str);
            add(RtspHeaders.CSEQ, String.valueOf(i));
            if (str2 != null) {
                add(RtspHeaders.SESSION, str2);
            }
        }

        private Builder(H.a<String, String> aVar) {
            this.namesAndValuesBuilder = aVar;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static String convertToStandardHeaderName(String str) {
        return com.google.common.base.c.a(str, ACCEPT) ? ACCEPT : com.google.common.base.c.a(str, ALLOW) ? ALLOW : com.google.common.base.c.a(str, AUTHORIZATION) ? AUTHORIZATION : com.google.common.base.c.a(str, BANDWIDTH) ? BANDWIDTH : com.google.common.base.c.a(str, BLOCKSIZE) ? BLOCKSIZE : com.google.common.base.c.a(str, CACHE_CONTROL) ? CACHE_CONTROL : com.google.common.base.c.a(str, CONNECTION) ? CONNECTION : com.google.common.base.c.a(str, CONTENT_BASE) ? CONTENT_BASE : com.google.common.base.c.a(str, CONTENT_ENCODING) ? CONTENT_ENCODING : com.google.common.base.c.a(str, CONTENT_LANGUAGE) ? CONTENT_LANGUAGE : com.google.common.base.c.a(str, CONTENT_LENGTH) ? CONTENT_LENGTH : com.google.common.base.c.a(str, CONTENT_LOCATION) ? CONTENT_LOCATION : com.google.common.base.c.a(str, CONTENT_TYPE) ? CONTENT_TYPE : com.google.common.base.c.a(str, CSEQ) ? CSEQ : com.google.common.base.c.a(str, DATE) ? DATE : com.google.common.base.c.a(str, EXPIRES) ? EXPIRES : com.google.common.base.c.a(str, LOCATION) ? LOCATION : com.google.common.base.c.a(str, PROXY_AUTHENTICATE) ? PROXY_AUTHENTICATE : com.google.common.base.c.a(str, PROXY_REQUIRE) ? PROXY_REQUIRE : com.google.common.base.c.a(str, PUBLIC) ? PUBLIC : com.google.common.base.c.a(str, RANGE) ? RANGE : com.google.common.base.c.a(str, RTP_INFO) ? RTP_INFO : com.google.common.base.c.a(str, RTCP_INTERVAL) ? RTCP_INTERVAL : com.google.common.base.c.a(str, SCALE) ? SCALE : com.google.common.base.c.a(str, SESSION) ? SESSION : com.google.common.base.c.a(str, SPEED) ? SPEED : com.google.common.base.c.a(str, SUPPORTED) ? SUPPORTED : com.google.common.base.c.a(str, TIMESTAMP) ? TIMESTAMP : com.google.common.base.c.a(str, TRANSPORT) ? TRANSPORT : com.google.common.base.c.a(str, USER_AGENT) ? USER_AGENT : com.google.common.base.c.a(str, VIA) ? VIA : com.google.common.base.c.a(str, WWW_AUTHENTICATE) ? WWW_AUTHENTICATE : str;
    }

    public H<String, String> asMultiMap() {
        return this.namesAndValues;
    }

    public Builder buildUpon() {
        H.a aVar = new H.a();
        for (Map.Entry<String, Collection<String>> entry : this.namesAndValues.b().entrySet()) {
            String key = entry.getKey();
            Collection<String> value = entry.getValue();
            if (key == null) {
                StringBuilder sb = new StringBuilder("null key in entry: null=");
                Iterator<T> it = value.iterator();
                StringBuilder sb2 = new StringBuilder("[");
                boolean z = true;
                while (it.hasNext()) {
                    if (!z) {
                        sb2.append(", ");
                    }
                    sb2.append(it.next());
                    z = false;
                }
                sb2.append(']');
                sb.append(sb2.toString());
                throw new NullPointerException(sb.toString());
            }
            Iterator<T> it2 = value.iterator();
            if (it2.hasNext()) {
                r rVar = aVar.a;
                if (rVar == null) {
                    rVar = r.a();
                    aVar.a = rVar;
                }
                E.b bVar = (E.b) rVar.get(key);
                if (bVar == null) {
                    bVar = G.i(value instanceof Collection ? Math.max(4, value.size()) : 4);
                    r rVar2 = aVar.a;
                    if (rVar2 == null) {
                        rVar2 = r.a();
                        aVar.a = rVar2;
                    }
                    rVar2.put(key, bVar);
                }
                while (it2.hasNext()) {
                    Object next = it2.next();
                    C0965m.a(key, next);
                    bVar.a(next);
                }
            }
        }
        return new Builder(aVar);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof RtspHeaders) {
            return this.namesAndValues.equals(((RtspHeaders) obj).namesAndValues);
        }
        return false;
    }

    @Nullable
    public String get(String str) {
        G<String> values = values(str);
        if (values.isEmpty()) {
            return null;
        }
        return (String) N.b(values);
    }

    public int hashCode() {
        return this.namesAndValues.hashCode();
    }

    public G<String> values(String str) {
        return this.namesAndValues.g(convertToStandardHeaderName(str));
    }

    private RtspHeaders(Builder builder) {
        H<String, String> h;
        r rVar = builder.namesAndValuesBuilder.a;
        if (rVar == null) {
            h = C0976y.i;
        } else {
            Collection entrySet = rVar.entrySet();
            if (((AbstractCollection) entrySet).isEmpty()) {
                h = C0976y.i;
            } else {
                r.a aVar = (r.a) entrySet;
                I.a aVar2 = new I.a(r.this.size());
                Iterator it = aVar.iterator();
                int i = 0;
                while (it.hasNext()) {
                    Map.Entry entry = (Map.Entry) it.next();
                    Object key = entry.getKey();
                    i0 g = ((G.a) entry.getValue()).g();
                    aVar2.d(key, g);
                    i += g.d;
                }
                h = new H<>(aVar2.a(true), i);
            }
        }
        this.namesAndValues = h;
    }
}
