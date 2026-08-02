package I2;

import C.g0;
import C2.r;
import D2.e;
import D2.g;
import D2.k;
import D2.m;
import D2.o;
import T7.E;
import android.content.Context;
import android.os.Bundle;
import android.os.CancellationSignal;
import androidx.credentials.playservices.CredentialProviderPlayServicesImpl;
import java.util.concurrent.Executor;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.M;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes8.dex */
public abstract class d<T1, T2, R2, R1, E1> extends I2.a {

    /* renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ int f11803d = 0;

    static final class a extends AbstractC7737t implements Function0<Unit> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ Executor f11804b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ r<R1, E1> f11805c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ E1 f11806d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(Executor executor, r<R1, E1> rVar, E1 e12) {
            super(0);
            this.f11804b = executor;
            this.f11805c = rVar;
            this.f11806d = e12;
        }

        @Override // kotlin.jvm.functions.Function0
        public final Unit invoke() {
            this.f11804b.execute(new g0(2, this.f11805c, this.f11806d));
            return Unit.f71690a;
        }
    }

    public d(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(context, "context");
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public static final void d(CancellationSignal cancellationSignal, @NotNull Function0<Unit> onResultOrException) {
        Intrinsics.checkNotNullParameter(onResultOrException, "onResultOrException");
        CredentialProviderPlayServicesImpl.INSTANCE.getClass();
        if (CredentialProviderPlayServicesImpl.Companion.a(cancellationSignal)) {
            return;
        }
        onResultOrException.invoke();
    }

    protected static boolean e(@NotNull Bundle resultData, @NotNull Function2 conversionFn, @NotNull Executor executor, @NotNull r callback, CancellationSignal cancellationSignal) {
        Intrinsics.checkNotNullParameter(resultData, "resultData");
        Intrinsics.checkNotNullParameter(conversionFn, "conversionFn");
        Intrinsics.checkNotNullParameter(executor, "executor");
        Intrinsics.checkNotNullParameter(callback, "callback");
        if (!resultData.getBoolean("FAILURE_RESPONSE")) {
            return false;
        }
        d(cancellationSignal, new a(executor, callback, conversionFn.invoke(resultData.getString("EXCEPTION_TYPE"), resultData.getString("EXCEPTION_MESSAGE"))));
        return true;
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [D2.k, T] */
    /* JADX WARN: Type inference failed for: r4v4, types: [D2.e, T] */
    protected static final boolean f(int i11, @NotNull Function2<? super CancellationSignal, ? super Function0<Unit>, Unit> cancelOnError, @NotNull Function1<? super g, Unit> onError, CancellationSignal cancellationSignal) {
        Intrinsics.checkNotNullParameter(cancelOnError, "cancelOnError");
        Intrinsics.checkNotNullParameter(onError, "onError");
        if (i11 == -1) {
            return false;
        }
        M m11 = new M();
        m11.f71787a = new k(E.a(i11, "activity with result code: ", " indicating not RESULT_OK"));
        if (i11 == 0) {
            m11.f71787a = new e("activity is cancelled by the user.");
        }
        cancelOnError.invoke(cancellationSignal, new b(onError, m11));
        return true;
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [D2.r, T] */
    /* JADX WARN: Type inference failed for: r4v4, types: [D2.m, T] */
    protected static final boolean g(int i11, @NotNull Function2<? super CancellationSignal, ? super Function0<Unit>, Unit> cancelOnError, @NotNull Function1<? super o, Unit> onError, CancellationSignal cancellationSignal) {
        Intrinsics.checkNotNullParameter(cancelOnError, "cancelOnError");
        Intrinsics.checkNotNullParameter(onError, "onError");
        if (i11 == -1) {
            return false;
        }
        M m11 = new M();
        m11.f71787a = new D2.r(E.a(i11, "activity with result code: ", " indicating not RESULT_OK"));
        if (i11 == 0) {
            m11.f71787a = new m("activity is cancelled by the user.");
        }
        cancelOnError.invoke(cancellationSignal, new c(onError, m11));
        return true;
    }
}
