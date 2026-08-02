package Ve;

import android.net.Uri;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import spay.sdk.RedirectActivity;

/* loaded from: classes10.dex */
public final class I7 extends AbstractC7737t implements Function0 {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ RedirectActivity f29218b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Uri f29219c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Wj f29220d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public I7(Uri uri, Wj wj2, RedirectActivity redirectActivity) {
        super(0);
        this.f29218b = redirectActivity;
        this.f29219c = uri;
        this.f29220d = wj2;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        Uri uri = this.f29219c;
        String uri2 = uri.toString();
        Intrinsics.checkNotNullExpressionValue(uri2, "url.toString()");
        ((C4406l6) this.f29220d).getClass();
        if (kotlin.text.h.t(uri2, "spaysdk://payment", true)) {
            C4744x c4744x = this.f29218b.f98833b;
            if (c4744x == null) {
                Intrinsics.n("viewModel");
                throw null;
            }
            c4744x.i0(uri);
        }
        return Unit.f71690a;
    }
}
