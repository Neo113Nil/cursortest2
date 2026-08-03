package com.inmobi.media;

/* renamed from: com.inmobi.media.ee, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C2380ee extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.inmobi.media.C2486ie f5178a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2380ee(com.inmobi.media.C2486ie c2486ie, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f5178a = c2486ie;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new com.inmobi.media.C2380ee(this.f5178a, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return new com.inmobi.media.C2380ee(this.f5178a, (kotlin.coroutines.Continuation) obj2).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        kotlin.ResultKt.throwOnFailure(obj);
        com.inmobi.media.C2486ie c2486ie = this.f5178a;
        c2486ie.getClass();
        c2486ie.f5259a.addView(c2486ie.g, new android.widget.RelativeLayout.LayoutParams(-1, -1));
        com.inmobi.media.C2486ie c2486ie2 = this.f5178a;
        boolean z = c2486ie2.d.d.f4865a;
        c2486ie2.i = z;
        if (z) {
            c2486ie2.a(c2486ie2.j, c2486ie2.k);
        } else {
            c2486ie2.a(c2486ie2.k, c2486ie2.j);
        }
        com.inmobi.media.C2760sn c2760sn = this.f5178a.l;
        if (c2760sn.c.f4878a) {
            float b = com.inmobi.media.N5.b();
            android.widget.ProgressBar progressBar = new android.widget.ProgressBar(c2760sn.b.getContext(), null, android.R.attr.progressBarStyleHorizontal);
            c2760sn.e = progressBar;
            com.inmobi.media.H6.a(progressBar, c2760sn.c, b);
            c2760sn.b.addView(c2760sn.e);
            kotlinx.coroutines.BuildersKt__Builders_commonKt.launch$default(c2760sn.f5453a, kotlinx.coroutines.Dispatchers.getMain(), null, new com.inmobi.media.C2706qn(c2760sn.d, null, c2760sn), 2, null);
        }
        return kotlin.Unit.INSTANCE;
    }
}
