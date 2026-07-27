package io.appmetrica.analytics.impl;

import java.util.Map;
import t4.InterfaceC1441l;

/* renamed from: io.appmetrica.analytics.impl.xd, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1108xd extends kotlin.jvm.internal.j implements InterfaceC1441l {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ C0821mb f9573a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1108xd(C0821mb c0821mb) {
        super(1);
        this.f9573a = c0821mb;
    }

    @Override // t4.InterfaceC1441l
    public final Object invoke(Object obj) {
        C0642fd c0642fd = (C0642fd) ((Map.Entry) obj).getValue();
        return c0642fd.f8183b.parse(this.f9573a);
    }
}
