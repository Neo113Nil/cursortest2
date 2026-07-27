package com.inmobi.media;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.Ref;
import org.xmlpull.v1.XmlPullParser;

/* loaded from: classes6.dex */
public final class In extends ContinuationImpl {

    /* renamed from: a, reason: collision with root package name */
    public Ref.BooleanRef f6634a;
    public /* synthetic */ Object b;
    public final /* synthetic */ Rn c;
    public int d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public In(Rn rn, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.c = rn;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.b = obj;
        this.d |= Integer.MIN_VALUE;
        return Rn.a(this.c, (XmlPullParser) null, this);
    }
}
