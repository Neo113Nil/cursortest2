package io.ktor.network.selector;

@kotlin.Metadata(d1 = {"\u0000\u0000"}, d2 = {}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes17.dex */
public final class SelectorManagerSupportKt {
    public static final /* synthetic */ java.lang.Void access$selectableIsClosed() {
        throw new java.io.IOException("Selectable is already closed");
    }

    public static final /* synthetic */ java.lang.Void access$selectableIsInvalid(int i, int i2) {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("Selectable is invalid state: ");
        sb.append(i);
        sb.append(", ");
        sb.append(i2);
        throw new java.lang.IllegalStateException(sb.toString().toString());
    }
}
