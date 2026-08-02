package com.plaid.internal;

/* renamed from: com.plaid.internal.v2, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public final class C0664v2 extends kotlin.jvm.internal.Lambda implements kotlin.jvm.functions.Function0<android.widget.ProgressBar> {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.plaid.internal.C0691y2 f6595a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0664v2(com.plaid.internal.C0691y2 c0691y2) {
        super(0);
        this.f6595a = c0691y2;
    }

    @Override // kotlin.jvm.functions.Function0
    public final android.widget.ProgressBar invoke() {
        return (android.widget.ProgressBar) this.f6595a.findViewById(com.plaid.link.R.id.progress_bar);
    }
}
