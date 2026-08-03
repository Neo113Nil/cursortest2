package com.inmobi.media;

/* loaded from: classes5.dex */
public final class Hf extends com.inmobi.media.De {
    public final java.lang.String c;
    public final java.lang.String d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Hf(java.lang.String vendor, java.lang.String str, java.lang.String url) {
        super(url, "OMID_VIEWABILITY");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(vendor, "vendor");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(url, "url");
        this.c = vendor;
        this.d = str;
    }
}
