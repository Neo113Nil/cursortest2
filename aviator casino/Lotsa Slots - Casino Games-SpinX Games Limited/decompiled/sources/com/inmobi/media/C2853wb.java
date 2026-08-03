package com.inmobi.media;

/* renamed from: com.inmobi.media.wb, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C2853wb extends kotlin.coroutines.jvm.internal.ContinuationImpl {

    /* renamed from: a, reason: collision with root package name */
    public java.lang.String f5526a;
    public kotlinx.coroutines.sync.Mutex b;
    public /* synthetic */ java.lang.Object c;
    public final /* synthetic */ com.inmobi.media.C2879xb d;
    public int e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2853wb(com.inmobi.media.C2879xb c2879xb, kotlin.coroutines.jvm.internal.ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.d = c2879xb;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.c = obj;
        this.e |= Integer.MIN_VALUE;
        return this.d.a(null, this);
    }
}
