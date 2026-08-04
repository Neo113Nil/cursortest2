package com.google.android.gms.common.internal;

import android.accounts.Account;
import android.content.Context;
import android.os.Looper;
import com.google.android.gms.common.Feature;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.api.internal.InterfaceC0786g;
import com.google.android.gms.common.api.internal.InterfaceC0795p;
import java.util.Collections;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.Executor;

/* JADX INFO: renamed from: com.google.android.gms.common.internal.i, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0813i extends AbstractC0810f implements com.google.android.gms.common.api.g {
    private static volatile Executor zaa;
    private final C0812h zab;
    private final Set zac;
    private final Account zad;

    /* JADX WARN: Illegal instructions before constructor call */
    public AbstractC0813i(Context context, Looper looper, int i7, C0812h c0812h, InterfaceC0786g interfaceC0786g, InterfaceC0795p interfaceC0795p) {
        N nA = AbstractC0814j.a(context);
        com.google.android.gms.common.c cVar = com.google.android.gms.common.c.f11215d;
        D.i(interfaceC0786g);
        D.i(interfaceC0795p);
        super(context, looper, nA, cVar, i7, new C0820p(interfaceC0786g), new C0820p(interfaceC0795p), c0812h.f11309e);
        this.zab = c0812h;
        this.zad = null;
        Set<Scope> set = c0812h.f11306b;
        Set<Scope> setValidateScopes = validateScopes(set);
        Iterator<Scope> it = setValidateScopes.iterator();
        while (it.hasNext()) {
            if (!set.contains(it.next())) {
                throw new IllegalStateException("Expanding scopes is not permitted, use implied scopes instead");
            }
        }
        this.zac = setValidateScopes;
    }

    @Override // com.google.android.gms.common.internal.AbstractC0810f
    public final Account getAccount() {
        return this.zad;
    }

    @Override // com.google.android.gms.common.internal.AbstractC0810f
    public final Executor getBindServiceExecutor() {
        return null;
    }

    public final C0812h getClientSettings() {
        return this.zab;
    }

    public Feature[] getRequiredFeatures() {
        return new Feature[0];
    }

    @Override // com.google.android.gms.common.internal.AbstractC0810f
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
