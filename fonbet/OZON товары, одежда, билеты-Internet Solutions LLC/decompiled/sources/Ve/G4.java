package Ve;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import spay.sdk.RedirectActivity;

/* loaded from: classes10.dex */
public final class G4 extends AbstractC7737t implements Function1 {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ RedirectActivity f29056b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ C4146c5 f29057c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public G4(RedirectActivity redirectActivity, C4146c5 c4146c5) {
        super(1);
        this.f29056b = redirectActivity;
        this.f29057c = c4146c5;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        this.f29056b.removeOnNewIntentListener(this.f29057c);
        return Unit.f71690a;
    }
}
