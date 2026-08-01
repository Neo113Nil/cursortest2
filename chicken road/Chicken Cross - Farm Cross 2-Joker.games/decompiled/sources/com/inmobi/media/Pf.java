package com.inmobi.media;

import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Charsets;
import okio.ByteString;
import org.json.JSONObject;

/* loaded from: classes6.dex */
public final class Pf implements Of {

    /* renamed from: a, reason: collision with root package name */
    public final int f6784a;
    public final ByteString b;
    public final Jf c;

    public Pf(String resolvedUrl, int i, ByteString bodyBytes, Jf responseMetaData) {
        Intrinsics.checkNotNullParameter(resolvedUrl, "resolvedUrl");
        Intrinsics.checkNotNullParameter(bodyBytes, "bodyBytes");
        Intrinsics.checkNotNullParameter(responseMetaData, "responseMetaData");
        this.f6784a = i;
        this.b = bodyBytes;
        this.c = responseMetaData;
    }

    @Override // com.inmobi.media.Of
    public final Object a() {
        Intrinsics.checkNotNullParameter(O4.class, "clazz");
        Intrinsics.checkNotNullParameter(O4.class, "type");
        JSONObject jsonObject = new JSONObject(this.b.string(Charsets.UTF_8));
        Intrinsics.checkNotNullParameter(jsonObject, "jsonObject");
        Intrinsics.checkNotNullParameter(O4.class, "type");
        return O4.class.cast(AbstractC3875lb.a(jsonObject, O4.class, null, null));
    }

    @Override // com.inmobi.media.Of
    public final Jf b() {
        return this.c;
    }

    @Override // com.inmobi.media.Of
    public final int c() {
        return this.f6784a;
    }

    @Override // com.inmobi.media.Of
    public final ByteString d() {
        return this.b;
    }

    @Override // com.inmobi.media.Of
    public final String e() {
        return null;
    }
}
