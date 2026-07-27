package com.yandex.varioqub.config;

import android.util.Log;
import com.yandex.varioqub.config.impl.C;
import g4.AbstractC0476u;
import java.util.HashMap;
import java.util.Map;
import kotlin.jvm.internal.e;

/* loaded from: classes.dex */
public final class VarioqubSettings {

    /* renamed from: a, reason: collision with root package name */
    private final String f5371a;

    /* renamed from: b, reason: collision with root package name */
    private final String f5372b;

    /* renamed from: c, reason: collision with root package name */
    private final long f5373c;

    /* renamed from: d, reason: collision with root package name */
    private final boolean f5374d;

    /* renamed from: e, reason: collision with root package name */
    private final boolean f5375e;

    /* renamed from: f, reason: collision with root package name */
    private final Map f5376f;

    /* renamed from: g, reason: collision with root package name */
    private final String f5377g;

    public static final class Builder {

        /* renamed from: a, reason: collision with root package name */
        private final String f5378a;

        /* renamed from: b, reason: collision with root package name */
        private String f5379b;

        /* renamed from: e, reason: collision with root package name */
        private boolean f5382e;

        /* renamed from: c, reason: collision with root package name */
        private final HashMap f5380c = new HashMap();

        /* renamed from: d, reason: collision with root package name */
        private long f5381d = 43200;

        /* renamed from: f, reason: collision with root package name */
        private boolean f5383f = true;

        public Builder(String str) {
            this.f5378a = str;
            if (str.length() <= 0) {
                throw new IllegalArgumentException("ClientId must not be empty");
            }
        }

        public final VarioqubSettings build() {
            return new VarioqubSettings(this.f5378a, this.f5379b, this.f5381d, this.f5382e, this.f5383f, AbstractC0476u.e0(this.f5380c), null);
        }

        public final Builder withActivateEvent(boolean z) {
            this.f5383f = z;
            return this;
        }

        public final Builder withClientFeature(String str, String str2) {
            this.f5380c.put(str, str2);
            return this;
        }

        public final Builder withLogs() {
            this.f5382e = true;
            return this;
        }

        public final Builder withThrottleInterval(long j2) {
            if (j2 <= 0) {
                throw new IllegalArgumentException("Fetch timeout must be a positive number");
            }
            this.f5381d = j2;
            return this;
        }

        public final Builder withUrl(String str) {
            this.f5379b = str;
            return this;
        }
    }

    public /* synthetic */ VarioqubSettings(String str, String str2, long j2, boolean z, boolean z5, Map map, e eVar) {
        this(str, str2, j2, z, z5, map);
    }

    public final void clearClientFeatures$config_release() {
        this.f5376f.clear();
        String str = this.f5377g;
        if (C.f5392a) {
            Log.d("Varioqub/" + str, "Client features was cleaned");
        }
    }

    public final boolean getActivateEvent$config_release() {
        return this.f5375e;
    }

    public final Map<String, String> getClientFeatures$config_release() {
        return AbstractC0476u.d0(this.f5376f);
    }

    public final String getClientId$config_release() {
        return this.f5371a;
    }

    public final long getFetchThrottleIntervalSec$config_release() {
        return this.f5373c;
    }

    public final boolean getLogs$config_release() {
        return this.f5374d;
    }

    public final String getUrl$config_release() {
        return this.f5372b;
    }

    public final void putClientFeature$config_release(String str, String str2) {
        String str3 = (String) this.f5376f.put(str, str2);
        if (str3 != null) {
            String str4 = this.f5377g;
            String str5 = "Client feature with key - " + str + " and value - " + str3 + " was replaced with new value - " + str2;
            if (C.f5392a) {
                Log.d("Varioqub/" + str4, str5);
            }
        }
    }

    private VarioqubSettings(String str, String str2, long j2, boolean z, boolean z5, Map map) {
        this.f5371a = str;
        this.f5372b = str2;
        this.f5373c = j2;
        this.f5374d = z;
        this.f5375e = z5;
        this.f5376f = map;
        this.f5377g = "VarioqubSettings";
    }
}
