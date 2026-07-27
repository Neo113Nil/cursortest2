package io.appmetrica.analytics.impl;

import java.util.Map;

/* renamed from: io.appmetrica.analytics.impl.xd, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0959xd extends kotlin.jvm.internal.k implements o2.l {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ C0672mb f8614a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0959xd(C0672mb c0672mb) {
        super(1);
        this.f8614a = c0672mb;
    }

    @Override // o2.l
    public final Object invoke(Object obj) {
        C0493fd c0493fd = (C0493fd) ((Map.Entry) obj).getValue();
        return c0493fd.f7288b.parse(this.f8614a);
    }
}
