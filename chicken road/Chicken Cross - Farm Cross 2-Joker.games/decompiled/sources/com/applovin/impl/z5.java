package com.applovin.impl;

import android.text.TextUtils;
import android.webkit.URLUtil;
import com.applovin.impl.b0;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* loaded from: classes5.dex */
public class z5 extends n5 {
    private final b g;

    public interface b {
        void a(b0.b bVar);

        void a(String str);
    }

    public z5(com.applovin.impl.sdk.l lVar, b bVar) {
        super("TaskFetchDeveloperUri", lVar);
        this.g = bVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        String valueOf = String.valueOf(this.f4351a.B().H().get("package_name"));
        if (com.applovin.impl.sdk.p.a()) {
            this.c.a(this.b, "Looking up developer URI for package name: " + valueOf);
        }
        this.f4351a.s0().a(new a(com.applovin.impl.sdk.network.a.a(this.f4351a).c("GET").b("https://play.google.com/store/apps/details?id=" + valueOf).a((Object) "").a(false).a(), this.f4351a));
    }

    class a extends r6 {
        a(com.applovin.impl.sdk.network.a aVar, com.applovin.impl.sdk.l lVar) {
            super(aVar, lVar);
        }

        @Override // com.applovin.impl.r6, com.applovin.impl.r0.e
        public void a(String str, String str2, int i) {
            if (TextUtils.isEmpty(str2)) {
                if (com.applovin.impl.sdk.p.a()) {
                    this.c.b(this.b, "No developer URI found - response from the Play Store is empty");
                }
                z5.this.g.a(b0.b.APP_DETAILS_NOT_FOUND);
                return;
            }
            Matcher matcher = Pattern.compile("(?<=\"appstore:developer_url\" content=\").*?(?=\">)").matcher(str2);
            if (!matcher.find()) {
                if (com.applovin.impl.sdk.p.a()) {
                    this.c.b(this.b, "No developer URI found - unable to find the developer_url meta tag from the Play Store listing");
                }
                z5.this.g.a(b0.b.INVALID_DEVELOPER_URI);
                return;
            }
            String group = matcher.group();
            if (!URLUtil.isValidUrl(group)) {
                if (com.applovin.impl.sdk.p.a()) {
                    this.c.b(this.b, "Developer URI (" + group + ") is not valid");
                }
                z5.this.g.a(b0.b.INVALID_DEVELOPER_URI);
            } else {
                if (com.applovin.impl.sdk.p.a()) {
                    this.c.a(this.b, "Found developer URI: " + group);
                }
                z5.this.g.a(group);
            }
        }

        @Override // com.applovin.impl.r6, com.applovin.impl.r0.e
        public void a(String str, int i, String str2, String str3) {
            if (com.applovin.impl.sdk.p.a()) {
                this.c.b(this.b, "Unable to fetch app details due to: " + str2 + ", and received error code: " + i);
            }
            z5.this.g.a(b0.b.APP_DETAILS_NOT_FOUND);
        }
    }
}
