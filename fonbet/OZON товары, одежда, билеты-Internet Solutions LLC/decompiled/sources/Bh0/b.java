package Bh0;

import ed.C6345a;
import java.lang.annotation.Annotation;
import java.lang.reflect.Type;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.N;
import org.jetbrains.annotations.NotNull;
import retrofit2.Call;
import retrofit2.CallAdapter;
import retrofit2.Retrofit;

/* loaded from: classes7.dex */
public final class b extends CallAdapter.Factory {

    /* loaded from: classes3.dex */
    public static final class a implements CallAdapter<Object, Call<Object>> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ CallAdapter<?, ?> f3805a;

        a(CallAdapter<?, ?> callAdapter) {
            this.f3805a = callAdapter;
        }

        @Override // retrofit2.CallAdapter
        public final Call<Object> adapt(Call<Object> call) {
            Intrinsics.checkNotNullParameter(call, "call");
            call.timeout().g(10000L, TimeUnit.MILLISECONDS);
            return call;
        }

        @Override // retrofit2.CallAdapter
        public final Type responseType() {
            Type responseType = this.f3805a.responseType();
            Intrinsics.checkNotNullExpressionValue(responseType, "responseType(...)");
            return responseType;
        }
    }

    @Override // retrofit2.CallAdapter.Factory
    public final CallAdapter<?, ?> get(@NotNull Type returnType, @NotNull Annotation[] annotations, @NotNull Retrofit retrofit) {
        Intrinsics.checkNotNullParameter(returnType, "returnType");
        Intrinsics.checkNotNullParameter(annotations, "annotations");
        Intrinsics.checkNotNullParameter(retrofit, "retrofit");
        if (!Intrinsics.d(CallAdapter.Factory.getRawType(returnType), Call.class)) {
            return null;
        }
        for (Annotation annotation : annotations) {
            if (C6345a.a(annotation).equals(N.b(Bh0.a.class))) {
                return new a(retrofit.nextCallAdapter(this, returnType, annotations));
            }
        }
        return null;
    }
}
