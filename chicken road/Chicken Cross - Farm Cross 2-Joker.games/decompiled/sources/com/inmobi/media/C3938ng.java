package com.inmobi.media;

import android.content.Context;
import com.inmobi.media.core.config.models.AdConfig;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* renamed from: com.inmobi.media.ng, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C3938ng extends ContinuationImpl {

    /* renamed from: a, reason: collision with root package name */
    public AdConfig.OmidConfig f7266a;
    public Context b;
    public /* synthetic */ Object c;
    public final /* synthetic */ C4051rg d;
    public int e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3938ng(C4051rg c4051rg, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.d = c4051rg;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.c = obj;
        this.e |= Integer.MIN_VALUE;
        return this.d.a(this);
    }
}
