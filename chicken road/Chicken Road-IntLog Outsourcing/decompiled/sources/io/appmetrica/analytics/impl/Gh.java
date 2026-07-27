package io.appmetrica.analytics.impl;

import android.content.Context;
import io.appmetrica.analytics.ICrashTransformer;

/* loaded from: classes.dex */
public final class Gh extends AbstractC0920q6 {

    /* renamed from: d, reason: collision with root package name */
    public final Yn f6844d;

    public Gh(Context context, Yn yn, InterfaceC0894p6 interfaceC0894p6, ICrashTransformer iCrashTransformer) {
        this(yn, interfaceC0894p6, iCrashTransformer, new T9(context));
    }

    public Gh(Yn yn, InterfaceC0894p6 interfaceC0894p6, ICrashTransformer iCrashTransformer, T9 t9) {
        super(interfaceC0894p6, iCrashTransformer, t9);
        this.f6844d = yn;
    }
}
