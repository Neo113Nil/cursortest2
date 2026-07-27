package io.appmetrica.analytics.impl;

import android.content.Intent;
import io.appmetrica.analytics.coreapi.internal.backport.BiConsumer;
import io.appmetrica.analytics.coreapi.internal.backport.Consumer;
import java.util.Iterator;

/* loaded from: classes.dex */
public final class V2 implements BiConsumer {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ W2 f6739a;

    public V2(W2 w22) {
        this.f6739a = w22;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.backport.BiConsumer
    public final void consume(Object obj, Object obj2) {
        Intent intent = (Intent) obj2;
        synchronized (this.f6739a) {
            try {
                W2 w22 = this.f6739a;
                w22.f6772b = intent;
                Iterator it = w22.f6771a.iterator();
                while (it.hasNext()) {
                    ((Consumer) it.next()).consume(intent);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
