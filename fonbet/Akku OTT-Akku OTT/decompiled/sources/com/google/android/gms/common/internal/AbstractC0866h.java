package com.google.android.gms.common.internal;

import android.accounts.Account;
import android.content.Context;
import android.os.Handler;
import android.os.IInterface;
import android.os.Looper;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import com.google.android.gms.common.C0854d;
import com.google.android.gms.common.C0855e;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.api.a;
import com.google.android.gms.common.api.h;
import com.google.android.gms.common.api.internal.InterfaceC0832f;
import com.google.android.gms.common.api.internal.InterfaceC0841o;
import java.util.Collections;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.Executor;

/* renamed from: com.google.android.gms.common.internal.h, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public abstract class AbstractC0866h<T extends IInterface> extends AbstractC0861c<T> implements a.f {

    @Nullable
    private static volatile Executor zaa;
    private final C0863e zab;
    private final Set zac;

    @Nullable
    private final Account zad;

    @VisibleForTesting
    public AbstractC0866h(@NonNull Context context, @NonNull Handler handler, int i, @NonNull C0863e c0863e) {
        super(context, handler, AbstractC0867i.a(context), C0855e.d, i, null, null);
        C0875q.g(c0863e);
        this.zab = c0863e;
        this.zad = c0863e.a;
        this.zac = zaa(c0863e.c);
    }

    private final Set zaa(@NonNull Set set) {
        Set<Scope> validateScopes = validateScopes(set);
        Iterator<Scope> it = validateScopes.iterator();
        while (it.hasNext()) {
            if (!set.contains(it.next())) {
                throw new IllegalStateException("Expanding scopes is not permitted, use implied scopes instead");
            }
        }
        return validateScopes;
    }

    @Override // com.google.android.gms.common.internal.AbstractC0861c
    @Nullable
    public final Account getAccount() {
        return this.zad;
    }

    @Override // com.google.android.gms.common.internal.AbstractC0861c
    @Nullable
    public Executor getBindServiceExecutor() {
        return null;
    }

    @NonNull
    public final C0863e getClientSettings() {
        return this.zab;
    }

    @NonNull
    public C0854d[] getRequiredFeatures() {
        return new C0854d[0];
    }

    @Override // com.google.android.gms.common.internal.AbstractC0861c
    @NonNull
    public final Set<Scope> getScopes() {
        return this.zac;
    }

    @Override // com.google.android.gms.common.api.a.f
    @NonNull
    public Set<Scope> getScopesForConnectionlessNonSignIn() {
        return requiresSignIn() ? this.zac : Collections.EMPTY_SET;
    }

    @NonNull
    public Set<Scope> validateScopes(@NonNull Set<Scope> set) {
        return set;
    }

    public AbstractC0866h(@NonNull Context context, @NonNull Looper looper, int i, @NonNull C0863e c0863e) {
        this(context, looper, AbstractC0867i.a(context), C0855e.d, i, c0863e, null, null);
    }

    @Deprecated
    public AbstractC0866h(@NonNull Context context, @NonNull Looper looper, int i, @NonNull C0863e c0863e, @NonNull h.a aVar, @NonNull h.b bVar) {
        this(context, looper, i, c0863e, (InterfaceC0832f) aVar, (InterfaceC0841o) bVar);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public AbstractC0866h(@NonNull Context context, @NonNull Looper looper, int i, @NonNull C0863e c0863e, @NonNull InterfaceC0832f interfaceC0832f, @NonNull InterfaceC0841o interfaceC0841o) {
        this(context, looper, r3, r4, i, c0863e, interfaceC0832f, interfaceC0841o);
        m0 a = AbstractC0867i.a(context);
        C0855e c0855e = C0855e.d;
        C0875q.g(interfaceC0832f);
        C0875q.g(interfaceC0841o);
    }

    @VisibleForTesting
    public AbstractC0866h(@NonNull Context context, @NonNull Looper looper, @NonNull AbstractC0867i abstractC0867i, @NonNull C0855e c0855e, int i, @NonNull C0863e c0863e, @Nullable InterfaceC0832f interfaceC0832f, @Nullable InterfaceC0841o interfaceC0841o) {
        super(context, looper, abstractC0867i, c0855e, i, interfaceC0832f == null ? null : new E(interfaceC0832f), interfaceC0841o != null ? new F(interfaceC0841o) : null, c0863e.f);
        this.zab = c0863e;
        this.zad = c0863e.a;
        this.zac = zaa(c0863e.c);
    }
}
