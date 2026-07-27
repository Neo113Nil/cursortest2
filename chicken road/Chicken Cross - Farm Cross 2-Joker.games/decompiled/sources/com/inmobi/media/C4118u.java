package com.inmobi.media;

import com.squareup.picasso.Picasso;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* renamed from: com.inmobi.media.u, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C4118u implements Function1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ C4200x f7404a;

    public C4118u(C4200x c4200x) {
        this.f7404a = c4200x;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        Z9 z9 = this.f7404a.d;
        if (z9 != null) {
            z9.a("AdChoiceViewManager", "invokeOnCancellation Called");
        }
        C4200x c4200x = this.f7404a;
        Z9 z92 = c4200x.d;
        if (z92 != null) {
            z92.a("AdChoiceViewManager", "destroy called");
        }
        Picasso picasso = Ug.f6893a;
        Ug.b(c4200x.f7469a).cancelTag(c4200x.e);
        return Unit.INSTANCE;
    }
}
