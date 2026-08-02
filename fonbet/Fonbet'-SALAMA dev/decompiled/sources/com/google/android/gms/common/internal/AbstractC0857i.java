package com.google.android.gms.common.internal;

import android.accounts.Account;
import android.content.Context;
import android.os.Looper;
import com.google.android.gms.common.Feature;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.api.internal.InterfaceC0830g;
import com.google.android.gms.common.api.internal.InterfaceC0839p;
import java.util.Collections;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.Executor;

/* renamed from: com.google.android.gms.common.internal.i, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0857i extends AbstractC0854f implements com.google.android.gms.common.api.g {
    private static volatile Executor zaa;
    private final C0856h zab;
    private final Set zac;
    private final Account zad;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public AbstractC0857i(Context context, Looper looper, int i7, C0856h c0856h, InterfaceC0830g interfaceC0830g, InterfaceC0839p interfaceC0839p) {
        super(context, looper, r3, r4, i7, new C0864p(interfaceC0830g), new C0864p(interfaceC0839p), c0856h.f11309e);
        N a2 = AbstractC0858j.a(context);
        com.google.android.gms.common.c cVar = com.google.android.gms.common.c.f11215d;
        D.i(interfaceC0830g);
        D.i(interfaceC0839p);
        this.zab = c0856h;
        this.zad = null;
        Set<Scope> set = c0856h.f11306b;
        Set<Scope> validateScopes = validateScopes(set);
        Iterator<Scope> it = validateScopes.iterator();
        while (it.hasNext()) {
            if (!set.contains(it.next())) {
                throw new IllegalStateException("Expanding scopes is not permitted, use implied scopes instead");
            }
        }
        this.zac = validateScopes;
    }

    @Override // com.google.android.gms.common.internal.AbstractC0854f
    public final Account getAccount() {
        return this.zad;
    }

    @Override // com.google.android.gms.common.internal.AbstractC0854f
    public final Executor getBindServiceExecutor() {
        return null;
    }

    public final C0856h getClientSettings() {
        return this.zab;
    }

    public Feature[] getRequiredFeatures() {
        return new Feature[0];
    }

    @Override // com.google.android.gms.common.internal.AbstractC0854f
    public final Set<Scope> getScopes() {
        return this.zac;
    }

    @Override // com.google.android.gms.common.api.g
    public Set<Scope> getScopesForConnectionlessNonSignIn() {
        return requiresSignIn() ? this.zac : Collections.emptySet();
    }

    public Set<Scope> validateScopes(Set<Scope> set) {
        return set;
    }
}
