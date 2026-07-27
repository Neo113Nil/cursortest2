package com.inmobi.media;

import com.inmobi.media.ads.network.common.model.OmSdkInfo;
import java.util.List;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* loaded from: classes6.dex */
public final class W6 extends ContinuationImpl {

    /* renamed from: a, reason: collision with root package name */
    public List f6925a;
    public OmSdkInfo b;
    public /* synthetic */ Object c;
    public final /* synthetic */ X6 d;
    public int e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public W6(X6 x6, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.d = x6;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.c = obj;
        this.e |= Integer.MIN_VALUE;
        return this.d.a(null, this);
    }
}
