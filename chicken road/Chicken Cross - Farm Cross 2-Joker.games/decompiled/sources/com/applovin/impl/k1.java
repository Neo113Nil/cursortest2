package com.applovin.impl;

import android.net.Uri;
import com.applovin.impl.sdk.utils.CollectionUtils;
import com.applovin.impl.sdk.utils.StringUtils;
import java.util.Arrays;

/* loaded from: classes5.dex */
public class k1 {

    /* renamed from: a, reason: collision with root package name */
    private final com.applovin.impl.sdk.l f4268a;

    public k1(com.applovin.impl.sdk.l lVar) {
        this.f4268a = lVar;
    }

    public void a(Uri uri) {
        com.applovin.impl.sdk.p.g("DeepLinkManager", "Processing incoming URL: " + uri);
        if (CollectionUtils.atLeastOneValueMatch(uri.getQueryParameterNames(), Arrays.asList("aleid", "alart"))) {
            String queryParameter = uri.getQueryParameter("alart");
            if (StringUtils.isValidString(queryParameter)) {
                this.f4268a.y0().b(queryParameter);
            }
            String queryParameter2 = uri.getQueryParameter("aleid");
            if (StringUtils.isValidString(queryParameter2)) {
                this.f4268a.y0().c(queryParameter2);
            }
        }
    }
}
