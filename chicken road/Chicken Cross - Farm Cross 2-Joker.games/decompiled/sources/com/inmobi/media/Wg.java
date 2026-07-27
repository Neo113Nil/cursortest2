package com.inmobi.media;

import com.inmobi.media.core.config.models.AdConfig;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* loaded from: classes6.dex */
public final class Wg extends ContinuationImpl {

    /* renamed from: a, reason: collision with root package name */
    public Gh f6934a;
    public AdConfig.PingsV2Config b;
    public /* synthetic */ Object c;
    public final /* synthetic */ Zg d;
    public int e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Wg(Zg zg, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.d = zg;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.c = obj;
        this.e |= Integer.MIN_VALUE;
        return this.d.a(null, null, this);
    }
}
