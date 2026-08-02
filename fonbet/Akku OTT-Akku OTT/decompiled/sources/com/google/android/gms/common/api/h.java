package com.google.android.gms.common.api;

import android.os.Looper;
import androidx.annotation.NonNull;
import com.google.android.gms.common.api.a;
import com.google.android.gms.common.api.internal.AbstractC0830d;
import com.google.android.gms.common.api.internal.InterfaceC0832f;
import com.google.android.gms.common.api.internal.InterfaceC0841o;
import com.google.errorprone.annotations.ResultIgnorabilityUnspecified;
import java.util.Collections;
import java.util.Set;
import java.util.WeakHashMap;

@Deprecated
/* loaded from: classes4.dex */
public abstract class h {
    public static final Set a = Collections.newSetFromMap(new WeakHashMap());

    @Deprecated
    public interface a extends InterfaceC0832f {
    }

    @Deprecated
    public interface b extends InterfaceC0841o {
    }

    @NonNull
    @ResultIgnorabilityUnspecified
    public <A extends a.b, R extends l, T extends AbstractC0830d<R, A>> T a(@NonNull T t) {
        throw new UnsupportedOperationException();
    }

    @NonNull
    @ResultIgnorabilityUnspecified
    public <A extends a.b, T extends AbstractC0830d<? extends l, A>> T b(@NonNull T t) {
        throw new UnsupportedOperationException();
    }

    @NonNull
    public Looper c() {
        throw new UnsupportedOperationException();
    }

    public void d() {
        throw new UnsupportedOperationException();
    }

    public void e() {
        throw new UnsupportedOperationException();
    }
}
