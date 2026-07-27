package com.inmobi.media;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.Ref;
import org.xmlpull.v1.XmlPullParser;

/* loaded from: classes6.dex */
public final class Mn extends ContinuationImpl {

    /* renamed from: a, reason: collision with root package name */
    public Ref.BooleanRef f6725a;
    public Ref.BooleanRef b;
    public /* synthetic */ Object c;
    public final /* synthetic */ Rn d;
    public int e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Mn(Rn rn, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.d = rn;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.c = obj;
        this.e |= Integer.MIN_VALUE;
        return Rn.b(this.d, (XmlPullParser) null, this);
    }
}
