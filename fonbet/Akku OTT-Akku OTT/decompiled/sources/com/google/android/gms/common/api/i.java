package com.google.android.gms.common.api;

import androidx.annotation.NonNull;
import com.google.android.gms.common.api.l;
import com.google.errorprone.annotations.ResultIgnorabilityUnspecified;
import java.util.concurrent.TimeUnit;

/* loaded from: classes4.dex */
public abstract class i<R extends l> {

    public interface a {
        void a(@NonNull Status status);
    }

    public void addStatusListener(@NonNull a aVar) {
        throw new UnsupportedOperationException();
    }

    @NonNull
    @ResultIgnorabilityUnspecified
    public abstract R await();

    @NonNull
    @ResultIgnorabilityUnspecified
    public abstract R await(long j, @NonNull TimeUnit timeUnit);

    public abstract void cancel();

    public abstract boolean isCanceled();

    public abstract void setResultCallback(@NonNull m<? super R> mVar);

    public abstract void setResultCallback(@NonNull m<? super R> mVar, long j, @NonNull TimeUnit timeUnit);

    @NonNull
    public <S extends l> o<S> then(@NonNull n<? super R, ? extends S> nVar) {
        throw new UnsupportedOperationException();
    }
}
