package androidx.compose.foundation.text.input.internal;

@kotlin.Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0081@\u0018\u00002\u00020\u0001B\u001b\u0012\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\n\u001a\u00020\t2\b\u0010\b\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011R#\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00028\u0007¢\u0006\f\n\u0004\b\u0005\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014\u0088\u0001\u0005\u0092\u0001\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002"}, d2 = {"Landroidx/compose/foundation/text/input/internal/ClipboardKeyCommandsHandler;", "", "Lkotlin/Function1;", "Landroidx/compose/foundation/text/KeyCommand;", "", "handler", "constructor-impl", "(Lkotlin/jvm/functions/Function1;)Lkotlin/jvm/functions/Function1;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lkotlin/jvm/functions/Function1;", "getHandler", "()Lkotlin/jvm/functions/Function1;"}, k = 1, mv = {2, 0, 0}, xi = 48)
@kotlin.jvm.JvmInline
/* loaded from: classes6.dex */
public final class ClipboardKeyCommandsHandler {
    private final kotlin.jvm.functions.Function1<androidx.compose.foundation.text.KeyCommand, kotlin.Unit> handler;

    /* renamed from: constructor-impl, reason: not valid java name */
    public static kotlin.jvm.functions.Function1<? super androidx.compose.foundation.text.KeyCommand, ? extends kotlin.Unit> m2210constructorimpl(kotlin.jvm.functions.Function1<? super androidx.compose.foundation.text.KeyCommand, kotlin.Unit> function1) {
        return function1;
    }

    private /* synthetic */ ClipboardKeyCommandsHandler(kotlin.jvm.functions.Function1 function1) {
        this.handler = function1;
    }

    public final kotlin.jvm.functions.Function1<androidx.compose.foundation.text.KeyCommand, kotlin.Unit> getHandler() {
        return this.handler;
    }

    /* renamed from: unbox-impl, reason: not valid java name and from getter */
    public final /* synthetic */ kotlin.jvm.functions.Function1 getHandler() {
        return this.handler;
    }

    public final java.lang.String toString() {
        return m2214toStringimpl(this.handler);
    }

    public final int hashCode() {
        return m2213hashCodeimpl(this.handler);
    }

    public final boolean equals(java.lang.Object other) {
        return m2211equalsimpl(this.handler, other);
    }

    /* renamed from: toString-impl, reason: not valid java name */
    public static java.lang.String m2214toStringimpl(kotlin.jvm.functions.Function1<? super androidx.compose.foundation.text.KeyCommand, ? extends kotlin.Unit> function1) {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("ClipboardKeyCommandsHandler(handler=");
        sb.append(function1);
        sb.append(')');
        return sb.toString();
    }

    /* renamed from: hashCode-impl, reason: not valid java name */
    public static int m2213hashCodeimpl(kotlin.jvm.functions.Function1<? super androidx.compose.foundation.text.KeyCommand, ? extends kotlin.Unit> function1) {
        return function1.hashCode();
    }

    /* renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m2212equalsimpl0(kotlin.jvm.functions.Function1<? super androidx.compose.foundation.text.KeyCommand, ? extends kotlin.Unit> function1, kotlin.jvm.functions.Function1<? super androidx.compose.foundation.text.KeyCommand, ? extends kotlin.Unit> function12) {
        return kotlin.jvm.internal.Intrinsics.areEqual(function1, function12);
    }

    /* renamed from: equals-impl, reason: not valid java name */
    public static boolean m2211equalsimpl(kotlin.jvm.functions.Function1<? super androidx.compose.foundation.text.KeyCommand, ? extends kotlin.Unit> function1, java.lang.Object obj) {
        return (obj instanceof androidx.compose.foundation.text.input.internal.ClipboardKeyCommandsHandler) && kotlin.jvm.internal.Intrinsics.areEqual(function1, ((androidx.compose.foundation.text.input.internal.ClipboardKeyCommandsHandler) obj).getHandler());
    }

    /* renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ androidx.compose.foundation.text.input.internal.ClipboardKeyCommandsHandler m2209boximpl(kotlin.jvm.functions.Function1 function1) {
        return new androidx.compose.foundation.text.input.internal.ClipboardKeyCommandsHandler(function1);
    }
}
