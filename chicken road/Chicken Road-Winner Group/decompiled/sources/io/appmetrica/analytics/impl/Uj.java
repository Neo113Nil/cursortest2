package io.appmetrica.analytics.impl;

import java.util.Map;

/* loaded from: classes.dex */
public final class Uj implements Xa {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ String f6727a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Map f6728b;

    public Uj(String str, Map map) {
        this.f6727a = str;
        this.f6728b = map;
    }

    @Override // io.appmetrica.analytics.impl.Xa
    public final void a(Ya ya) {
        ya.reportEvent(this.f6727a, this.f6728b);
    }
}
