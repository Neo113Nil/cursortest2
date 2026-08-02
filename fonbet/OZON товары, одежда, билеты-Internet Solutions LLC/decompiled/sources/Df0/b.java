package Df0;

import Ra.b;
import android.app.Application;
import eg0.C6363a;
import java.util.concurrent.TimeUnit;
import kotlin.collections.K;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
final class b extends AbstractC7737t implements Function1<b.a, b.a> {

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ g f6687b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    b(g gVar, String str, Application application) {
        super(1);
        this.f6687b = gVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final b.a invoke(b.a aVar) {
        b.a client = aVar;
        Intrinsics.checkNotNullParameter(client, "$this$client");
        client.f();
        client.g(new Qa.c(K.f71697a, this.f6687b.a(), 0, 14328));
        client.m();
        client.c();
        client.j(true);
        client.b(new C6363a());
        TimeUnit timeUnit = TimeUnit.DAYS;
        client.e();
        client.o();
        client.k();
        return client;
    }
}
