package androidx.compose.ui.viewinterop;

/* compiled from: AndroidViewHolder.android.kt */
@kotlin.Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "Landroidx/compose/ui/viewinterop/AndroidViewHolder;", "invoke"}, k = 3, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
final class AndroidViewHolder$Companion$OnCommitAffectingUpdate$1 extends kotlin.jvm.internal.Lambda implements kotlin.jvm.functions.Function1<androidx.compose.ui.viewinterop.AndroidViewHolder, kotlin.Unit> {
    public static final androidx.compose.ui.viewinterop.AndroidViewHolder$Companion$OnCommitAffectingUpdate$1 INSTANCE = new androidx.compose.ui.viewinterop.AndroidViewHolder$Companion$OnCommitAffectingUpdate$1();

    AndroidViewHolder$Companion$OnCommitAffectingUpdate$1() {
        super(1);
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ kotlin.Unit invoke(androidx.compose.ui.viewinterop.AndroidViewHolder androidViewHolder) {
        invoke2(androidViewHolder);
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(androidx.compose.ui.viewinterop.AndroidViewHolder androidViewHolder) {
        final kotlin.jvm.functions.Function0 function0;
        android.os.Handler handler = androidViewHolder.getHandler();
        function0 = androidViewHolder.runUpdate;
        handler.post(new java.lang.Runnable() { // from class: androidx.compose.ui.viewinterop.AndroidViewHolder$Companion$OnCommitAffectingUpdate$1$$ExternalSyntheticLambda0
            @Override // java.lang.Runnable
            public final void run() {
                kotlin.jvm.functions.Function0.this.invoke();
            }
        });
    }
}
