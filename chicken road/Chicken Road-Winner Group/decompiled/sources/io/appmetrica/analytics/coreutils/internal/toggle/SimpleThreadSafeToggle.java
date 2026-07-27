package io.appmetrica.analytics.coreutils.internal.toggle;

import io.appmetrica.analytics.coreapi.internal.control.Toggle;
import io.appmetrica.analytics.coreapi.internal.control.ToggleObserver;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.jvm.internal.f;

/* loaded from: classes.dex */
public abstract class SimpleThreadSafeToggle implements Toggle {

    /* renamed from: a, reason: collision with root package name */
    private final String f5487a;

    /* renamed from: b, reason: collision with root package name */
    private boolean f5488b;

    /* renamed from: c, reason: collision with root package name */
    private final ArrayList f5489c;

    public SimpleThreadSafeToggle(boolean z3, String str) {
        this.f5487a = str;
        this.f5488b = z3;
        this.f5489c = new ArrayList();
    }

    @Override // io.appmetrica.analytics.coreapi.internal.control.Toggle
    public synchronized boolean getActualState() {
        return this.f5488b;
    }

    public final String getTag() {
        return this.f5487a;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.control.Toggle
    public synchronized void registerObserver(ToggleObserver toggleObserver, boolean z3) {
        this.f5489c.add(toggleObserver);
        if (z3) {
            toggleObserver.onStateChanged(getActualState());
        }
    }

    @Override // io.appmetrica.analytics.coreapi.internal.control.Toggle
    public synchronized void removeObserver(ToggleObserver toggleObserver) {
        this.f5489c.remove(toggleObserver);
    }

    public final synchronized void updateState(boolean z3) {
        if (z3 != getActualState()) {
            this.f5488b = z3;
            Iterator it = this.f5489c.iterator();
            while (it.hasNext()) {
                ((ToggleObserver) it.next()).onStateChanged(z3);
            }
        }
    }

    public /* synthetic */ SimpleThreadSafeToggle(boolean z3, String str, int i3, f fVar) {
        this((i3 & 1) != 0 ? false : z3, str);
    }
}
