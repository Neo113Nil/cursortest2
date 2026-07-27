package com.inmobi.media;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public final class Bg extends C4189wf {
    public final String c;
    public final String d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Bg(String vendor, String str, String url) {
        super(url, "OMID_VIEWABILITY");
        Intrinsics.checkNotNullParameter(vendor, "vendor");
        Intrinsics.checkNotNullParameter(url, "url");
        this.c = vendor;
        this.d = str;
    }
}
