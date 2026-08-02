package org.betup.bus;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.modelmapper.internal.bytebuddy.description.method.MethodDescription;

/* compiled from: DisplayOfferMessage.kt */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lorg/betup/bus/DisplayOfferMessage;", "", "offerId", "", MethodDescription.CONSTRUCTOR_INTERNAL_NAME, "(Ljava/lang/String;)V", "getOfferId", "()Ljava/lang/String;", "app_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class DisplayOfferMessage {
    public static final int $stable = 0;
    private final String offerId;

    public DisplayOfferMessage(String offerId) {
        Intrinsics.checkNotNullParameter(offerId, "offerId");
        this.offerId = offerId;
    }

    public final String getOfferId() {
        return this.offerId;
    }
}
