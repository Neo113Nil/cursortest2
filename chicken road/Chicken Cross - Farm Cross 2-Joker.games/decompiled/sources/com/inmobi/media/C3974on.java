package com.inmobi.media;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import okhttp3.Call;

/* renamed from: com.inmobi.media.on, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C3974on implements Function1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Call f7293a;

    public C3974on(Call call) {
        this.f7293a = call;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        this.f7293a.cancel();
        return Unit.INSTANCE;
    }
}
