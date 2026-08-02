package Ve;

import android.content.Intent;
import java.io.PrintWriter;
import java.io.StringWriter;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import spay.sdk.RedirectActivity;

/* renamed from: Ve.bb, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C4123bb extends AbstractC7737t implements Function0 {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ RedirectActivity f30721b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Throwable f30722c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4123bb(RedirectActivity redirectActivity, Throwable th2) {
        super(0);
        this.f30721b = redirectActivity;
        this.f30722c = th2;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        Throwable exception = this.f30722c;
        Intrinsics.checkNotNullExpressionValue(exception, "exception");
        int i11 = RedirectActivity.f98831g;
        RedirectActivity redirectActivity = this.f30721b;
        redirectActivity.getClass();
        StringWriter stringWriter = new StringWriter();
        exception.printStackTrace(new PrintWriter(stringWriter));
        Intent intent = new Intent(redirectActivity.getBaseContext(), (Class<?>) C4.class);
        intent.addFlags(268435456);
        intent.putExtra("error_header", "Oops!");
        intent.putExtra("stack_trace", stringWriter.toString());
        redirectActivity.getApplicationContext().startActivity(intent);
        return Unit.f71690a;
    }
}
