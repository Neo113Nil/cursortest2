package com.inmobi.media;

import android.content.Context;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: com.inmobi.media.v4, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C4151v4 {

    /* renamed from: a, reason: collision with root package name */
    public final Context f7429a;
    public final Z9 b;

    public C4151v4(Context context, Z9 z9) {
        Intrinsics.checkNotNullParameter(context, "context");
        this.f7429a = context;
        this.b = z9;
    }

    public final Zk a(Xj resource) {
        Intrinsics.checkNotNullParameter(resource, "resource");
        resource.getClass();
        return new Zk(this.f7429a, this.b);
    }
}
