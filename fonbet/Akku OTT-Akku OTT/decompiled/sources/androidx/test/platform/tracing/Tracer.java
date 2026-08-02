package androidx.test.platform.tracing;

import androidx.annotation.NonNull;
import androidx.annotation.RestrictTo;
import androidx.test.annotation.ExperimentalTestApi;
import java.io.Closeable;

@ExperimentalTestApi
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
/* loaded from: classes3.dex */
public interface Tracer {

    @ExperimentalTestApi
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public interface Span extends Closeable {
        @NonNull
        Span beginChildSpan(@NonNull String str);

        @Override // java.io.Closeable, java.lang.AutoCloseable
        void close();
    }

    @NonNull
    Span beginSpan(@NonNull String str);
}
