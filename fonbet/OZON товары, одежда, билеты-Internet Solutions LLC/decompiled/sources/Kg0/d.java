package Kg0;

import android.app.Dialog;
import android.graphics.Bitmap;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;

/* loaded from: classes3.dex */
final class d extends AbstractC7737t implements Function1<Bitmap, Unit> {

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ Dialog f15969b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ AbstractC7737t f15970c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    d(Dialog dialog, Function1<? super Bitmap, Unit> function1) {
        super(1);
        this.f15969b = dialog;
        this.f15970c = (AbstractC7737t) function1;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [kotlin.jvm.functions.Function1, kotlin.jvm.internal.t] */
    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(Bitmap bitmap) {
        Bitmap bitmap2 = bitmap;
        this.f15969b.dismiss();
        if (bitmap2 != null) {
            this.f15970c.invoke(bitmap2);
        }
        return Unit.f71690a;
    }
}
