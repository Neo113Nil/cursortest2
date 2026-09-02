package com.goldenboot.saga.zone;

import android.content.Intent;
import android.net.Uri;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-8a937589efc37ca14c210e73e18b8757b60a107ea08aacc80d18a198c868531e */
/* loaded from: classes.dex */
public class StylusExecutor {
    public final Uri evictLayout;
    public final String growPayload;
    public final String injectMetric;

    public StylusExecutor(Uri uri, String str, String str2) {
        this.evictLayout = uri;
        this.growPayload = str;
        this.injectMetric = str2;
    }

    public String evictLayout() {
        return this.growPayload;
    }

    public String growPayload() {
        return this.injectMetric;
    }

    public Uri injectMetric() {
        return this.evictLayout;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("NavDeepLinkRequest");
        sb.append("{");
        if (injectMetric() != null) {
            sb.append(" uri=");
            sb.append(String.valueOf(injectMetric()));
        }
        if (evictLayout() != null) {
            sb.append(" action=");
            sb.append(evictLayout());
        }
        if (growPayload() != null) {
            sb.append(" mimetype=");
            sb.append(growPayload());
        }
        sb.append(" }");
        String sb2 = sb.toString();
        Intrinsics.checkNotNullExpressionValue(sb2, "sb.toString()");
        return sb2;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public StylusExecutor(Intent intent) {
        this(intent.getData(), intent.getAction(), intent.getType());
        Intrinsics.checkNotNullParameter(intent, "intent");
    }
}
