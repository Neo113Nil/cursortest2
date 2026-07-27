package com.vungle.ads.internal.presenter;

import com.vungle.ads.MraidTemplateError;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes7.dex */
public final class g extends Lambda implements Function0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ r f12089a;
    public final /* synthetic */ MraidTemplateError b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ String d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(r rVar, MraidTemplateError mraidTemplateError, boolean z, String str) {
        super(0);
        this.f12089a = rVar;
        this.b = mraidTemplateError;
        this.c = z;
        this.d = str;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        this.f12089a.a(this.b, this.c, this.d);
        return Unit.INSTANCE;
    }
}
