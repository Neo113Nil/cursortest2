package io.ktor.network.selector;

import java.io.IOException;
import kotlin.Metadata;

/* compiled from: SelectorManagerSupport.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0010\u0001\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\u001a\u000f\u0010\u0001\u001a\u00020\u0000H\u0002¢\u0006\u0004\b\u0001\u0010\u0002\u001a\u001f\u0010\u0006\u001a\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u0003H\u0002¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"", "selectableIsClosed", "()Ljava/lang/Void;", "", "interestedOps", "flag", "selectableIsInvalid", "(II)Ljava/lang/Void;", "ktor-network"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class SelectorManagerSupportKt {
    /* JADX INFO: Access modifiers changed from: private */
    public static final Void selectableIsClosed() {
        throw new IOException("Selectable is already closed");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Void selectableIsInvalid(int i, int i2) {
        throw new IllegalStateException(("Selectable is invalid state: " + i + ", " + i2).toString());
    }
}
