package com.inmobi.media;

import android.content.Context;
import com.inmobi.media.core.config.models.SignalsConfig;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* loaded from: classes6.dex */
public final class Fl extends ContinuationImpl {

    /* renamed from: a, reason: collision with root package name */
    public InterfaceC4195wl f6563a;
    public long b;
    public /* synthetic */ Object c;
    public final /* synthetic */ Ml d;
    public int e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Fl(Ml ml, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.d = ml;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.c = obj;
        this.e |= Integer.MIN_VALUE;
        return this.d.a((Context) null, (InterfaceC4195wl) null, (SignalsConfig.SynapseCollectorConfig) null, this);
    }
}
