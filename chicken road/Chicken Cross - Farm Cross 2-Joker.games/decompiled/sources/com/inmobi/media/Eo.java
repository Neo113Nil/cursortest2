package com.inmobi.media;

import com.inmobi.media.core.config.models.AdConfig;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* loaded from: classes6.dex */
public final class Eo extends ContinuationImpl {

    /* renamed from: a, reason: collision with root package name */
    public AdConfig.VastVideoConfig f6540a;
    public /* synthetic */ Object b;
    public int c;

    public Eo(ContinuationImpl continuationImpl) {
        super(continuationImpl);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.b = obj;
        this.c |= Integer.MIN_VALUE;
        return Jo.a(null, 0.0d, null, this);
    }
}
