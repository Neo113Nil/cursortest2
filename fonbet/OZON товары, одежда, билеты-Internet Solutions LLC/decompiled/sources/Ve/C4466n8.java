package Ve;

import android.net.Uri;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import spay.sdk.RedirectActivity;

/* renamed from: Ve.n8, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C4466n8 extends AbstractC7737t implements Function0 {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Uri f31645b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Wj f31646c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ RedirectActivity f31647d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4466n8(Uri uri, Wj wj2, RedirectActivity redirectActivity) {
        super(0);
        this.f31645b = uri;
        this.f31646c = wj2;
        this.f31647d = redirectActivity;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        Uri uri = this.f31645b;
        String uri2 = uri.toString();
        Intrinsics.checkNotNullExpressionValue(uri2, "url.toString()");
        ((C4406l6) this.f31646c).getClass();
        if (kotlin.text.h.t(uri2, "spaysdk://payment", true)) {
            C4744x c4744x = this.f31647d.f98833b;
            if (c4744x == null) {
                Intrinsics.n("viewModel");
                throw null;
            }
            c4744x.i0(uri);
        }
        return Unit.f71690a;
    }
}
