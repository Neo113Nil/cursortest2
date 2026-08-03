package androidx.activity.compose;

/* compiled from: ReportDrawn.kt */
@kotlin.Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
/* synthetic */ class ReportDrawnComposition$checkReporter$1 extends kotlin.jvm.internal.FunctionReferenceImpl implements kotlin.jvm.functions.Function1<kotlin.jvm.functions.Function0<? extends java.lang.Boolean>, kotlin.Unit> {
    ReportDrawnComposition$checkReporter$1(java.lang.Object obj) {
        super(1, obj, androidx.activity.compose.ReportDrawnComposition.class, "observeReporter", "observeReporter(Lkotlin/jvm/functions/Function0;)V", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ kotlin.Unit invoke(kotlin.jvm.functions.Function0<? extends java.lang.Boolean> function0) {
        invoke2((kotlin.jvm.functions.Function0<java.lang.Boolean>) function0);
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(kotlin.jvm.functions.Function0<java.lang.Boolean> p0) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p0, "p0");
        ((androidx.activity.compose.ReportDrawnComposition) this.receiver).observeReporter(p0);
    }
}
