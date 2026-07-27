package io.appmetrica.analytics.impl;

import android.content.Context;
import io.appmetrica.analytics.ICrashTransformer;

/* loaded from: classes.dex */
public final class Gh extends AbstractC0771q6 {

    /* renamed from: d, reason: collision with root package name */
    public final Yn f5999d;

    public Gh(Context context, Yn yn, InterfaceC0745p6 interfaceC0745p6, ICrashTransformer iCrashTransformer) {
        this(yn, interfaceC0745p6, iCrashTransformer, new T9(context));
    }

    public Gh(Yn yn, InterfaceC0745p6 interfaceC0745p6, ICrashTransformer iCrashTransformer, T9 t9) {
        super(interfaceC0745p6, iCrashTransformer, t9);
        this.f5999d = yn;
    }
}
