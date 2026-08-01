package com.fyber.inneractive.sdk.util;

import android.net.Uri;
import java.util.List;

/* loaded from: classes4.dex */
public final class m1 implements Comparable {

    /* renamed from: a, reason: collision with root package name */
    public final l1 f5957a;
    public final Uri b;
    public final List c;

    public m1(l1 l1Var, Uri uri, List list) {
        this.f5957a = l1Var;
        this.b = uri;
        this.c = list;
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        return this.f5957a.mPriority.compareTo(((m1) obj).f5957a.mPriority);
    }
}
