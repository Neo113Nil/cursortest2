package org.betup.services.billing;

/* loaded from: classes2.dex */
public interface PurchaseFlow {
    void start(PurchaseCompletedListener purchaseListener, String... args);
}
