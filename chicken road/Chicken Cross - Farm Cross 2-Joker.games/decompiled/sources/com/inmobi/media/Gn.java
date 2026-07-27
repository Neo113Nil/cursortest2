package com.inmobi.media;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.functions.Function1;
import org.xmlpull.v1.XmlPullParser;

/* loaded from: classes6.dex */
public final class Gn extends ContinuationImpl {

    /* renamed from: a, reason: collision with root package name */
    public XmlPullParser f6587a;
    public String b;
    public Function1 c;
    public /* synthetic */ Object d;
    public final /* synthetic */ Rn e;
    public int f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Gn(Rn rn, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.e = rn;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.d = obj;
        this.f |= Integer.MIN_VALUE;
        return this.e.a((XmlPullParser) null, (String) null, (Function1) null, this);
    }
}
