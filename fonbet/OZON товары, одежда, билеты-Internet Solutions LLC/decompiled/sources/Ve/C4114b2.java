package Ve;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import spay.sdk.RedirectActivity;

/* renamed from: Ve.b2, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C4114b2 extends AbstractC7737t implements Function1 {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Context f30701b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4114b2(Context context) {
        super(1);
        this.f30701b = context;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        String it = (String) obj;
        Intrinsics.checkNotNullParameter(it, "it");
        Uri parse = Uri.parse("spaysdk://payment");
        Intrinsics.checkNotNullExpressionValue(parse, "parse(this)");
        Context context = this.f30701b;
        Intent intent = new Intent("android.intent.action.VIEW", parse, context, RedirectActivity.class);
        C4661u1 block = new C4661u1(intent, 0);
        Intrinsics.checkNotNullParameter(block, "block");
        context.startActivity(intent);
        return Unit.f71690a;
    }
}
