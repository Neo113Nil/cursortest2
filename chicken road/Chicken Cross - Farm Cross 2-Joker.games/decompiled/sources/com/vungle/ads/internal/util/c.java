package com.vungle.ads.internal.util;

import android.content.Intent;
import java.lang.ref.WeakReference;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes7.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public final WeakReference f12178a;
    public final Intent b;
    public final Intent c;
    public final com.vungle.ads.internal.ui.m d;

    public c(WeakReference context, Intent intent, Intent intent2, com.vungle.ads.internal.ui.m mVar) {
        Intrinsics.checkNotNullParameter(context, "context");
        this.f12178a = context;
        this.b = intent;
        this.c = intent2;
        this.d = mVar;
    }

    public final com.vungle.ads.internal.ui.m a() {
        return this.d;
    }

    public final WeakReference b() {
        return this.f12178a;
    }

    public final Intent c() {
        return this.b;
    }

    public final Intent d() {
        return this.c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return Intrinsics.areEqual(this.f12178a, cVar.f12178a) && Intrinsics.areEqual(this.b, cVar.b) && Intrinsics.areEqual(this.c, cVar.c) && Intrinsics.areEqual(this.d, cVar.d);
    }

    public final int hashCode() {
        int hashCode = this.f12178a.hashCode() * 31;
        Intent intent = this.b;
        int hashCode2 = (hashCode + (intent == null ? 0 : intent.hashCode())) * 31;
        Intent intent2 = this.c;
        int hashCode3 = (hashCode2 + (intent2 == null ? 0 : intent2.hashCode())) * 31;
        com.vungle.ads.internal.ui.m mVar = this.d;
        return hashCode3 + (mVar != null ? mVar.hashCode() : 0);
    }

    public final String toString() {
        return com.iab.omid.library.vungle.internal.l.a("TargetActivityInfo(context=").append(this.f12178a).append(", deepLinkOverrideIntent=").append(this.b).append(", defaultIntent=").append(this.c).append(", adOpenCallback=").append(this.d).append(')').toString();
    }
}
