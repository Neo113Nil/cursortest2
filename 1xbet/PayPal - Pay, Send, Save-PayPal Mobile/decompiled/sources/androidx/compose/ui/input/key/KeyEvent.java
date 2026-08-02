package androidx.compose.ui.input.key;

@kotlin.Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0087@\u0018\u00002\u00020\u0001B\u0013\u0012\n\u0010\u0004\u001a\u00060\u0002j\u0002`\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u001a\u0010\t\u001a\u00020\b2\b\u0010\u0007\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010R\u001b\u0010\u0004\u001a\u00060\u0002j\u0002`\u00038\u0007¢\u0006\f\n\u0004\b\u0004\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013\u0088\u0001\u0004\u0092\u0001\u00060\u0002j\u0002`\u0003"}, d2 = {"Landroidx/compose/ui/input/key/KeyEvent;", "", "Landroid/view/KeyEvent;", "Landroidx/compose/ui/input/key/getHighSpeedVideoSizes;", "nativeKeyEvent", "constructor-impl", "(Landroid/view/KeyEvent;)Landroid/view/KeyEvent;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Landroid/view/KeyEvent;", "getNativeKeyEvent", "()Landroid/view/KeyEvent;"}, k = 1, mv = {2, 0, 0}, xi = 48)
@kotlin.jvm.JvmInline
/* loaded from: classes.dex */
public final class KeyEvent {
    private final android.view.KeyEvent nativeKeyEvent;

    /* renamed from: constructor-impl, reason: not valid java name */
    public static android.view.KeyEvent m7073constructorimpl(android.view.KeyEvent keyEvent) {
        return keyEvent;
    }

    private /* synthetic */ KeyEvent(android.view.KeyEvent keyEvent) {
        this.nativeKeyEvent = keyEvent;
    }

    public final android.view.KeyEvent getNativeKeyEvent() {
        return this.nativeKeyEvent;
    }

    /* renamed from: unbox-impl, reason: not valid java name */
    public final /* synthetic */ android.view.KeyEvent m7078unboximpl() {
        return this.nativeKeyEvent;
    }

    public final java.lang.String toString() {
        return m7077toStringimpl(this.nativeKeyEvent);
    }

    public final int hashCode() {
        return m7076hashCodeimpl(this.nativeKeyEvent);
    }

    public final boolean equals(java.lang.Object other) {
        return m7074equalsimpl(this.nativeKeyEvent, other);
    }

    /* renamed from: toString-impl, reason: not valid java name */
    public static java.lang.String m7077toStringimpl(android.view.KeyEvent keyEvent) {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("KeyEvent(nativeKeyEvent=");
        sb.append(keyEvent);
        sb.append(')');
        return sb.toString();
    }

    /* renamed from: hashCode-impl, reason: not valid java name */
    public static int m7076hashCodeimpl(android.view.KeyEvent keyEvent) {
        return keyEvent.hashCode();
    }

    /* renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m7075equalsimpl0(android.view.KeyEvent keyEvent, android.view.KeyEvent keyEvent2) {
        return kotlin.jvm.internal.Intrinsics.areEqual(keyEvent, keyEvent2);
    }

    /* renamed from: equals-impl, reason: not valid java name */
    public static boolean m7074equalsimpl(android.view.KeyEvent keyEvent, java.lang.Object obj) {
        return (obj instanceof androidx.compose.ui.input.key.KeyEvent) && kotlin.jvm.internal.Intrinsics.areEqual(keyEvent, ((androidx.compose.ui.input.key.KeyEvent) obj).m7078unboximpl());
    }

    /* renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ androidx.compose.ui.input.key.KeyEvent m7072boximpl(android.view.KeyEvent keyEvent) {
        return new androidx.compose.ui.input.key.KeyEvent(keyEvent);
    }
}
