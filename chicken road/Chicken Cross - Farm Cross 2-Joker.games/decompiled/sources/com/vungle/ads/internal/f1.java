package com.vungle.ads.internal;

import android.graphics.Bitmap;
import android.widget.ImageView;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes7.dex */
public final class f1 extends Lambda implements Function0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ ImageView f11919a;
    public final /* synthetic */ Bitmap b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f1(ImageView imageView, Bitmap bitmap) {
        super(0);
        this.f11919a = imageView;
        this.b = bitmap;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        this.f11919a.setImageBitmap(this.b);
        return Unit.INSTANCE;
    }
}
