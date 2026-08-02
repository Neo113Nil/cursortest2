package androidx.credentials.playservices;

import C2.r;
import Ej.n;
import android.util.Log;
import java.util.concurrent.Executor;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC7737t;

/* loaded from: classes8.dex */
final class a extends AbstractC7737t implements Function0<Unit> {

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ Executor f42446b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ r<Void, D2.a> f42447c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    a(Executor executor, r<Void, D2.a> rVar) {
        super(0);
        this.f42446b = executor;
        this.f42447c = rVar;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        Log.i("PlayServicesImpl", "During clear credential, signed out successfully!");
        this.f42446b.execute(new n(this.f42447c, 1));
        return Unit.f71690a;
    }
}
