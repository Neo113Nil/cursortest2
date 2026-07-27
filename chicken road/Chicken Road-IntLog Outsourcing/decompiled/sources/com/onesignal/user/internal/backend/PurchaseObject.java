package com.onesignal.user.internal.backend;

import java.math.BigDecimal;
import kotlin.jvm.internal.i;

/* loaded from: classes.dex */
public final class PurchaseObject {
    private final BigDecimal amount;
    private final String iso;
    private final String sku;

    public PurchaseObject(String sku, String iso, BigDecimal amount) {
        i.e(sku, "sku");
        i.e(iso, "iso");
        i.e(amount, "amount");
        this.sku = sku;
        this.iso = iso;
        this.amount = amount;
    }

    public final BigDecimal getAmount() {
        return this.amount;
    }

    public final String getIso() {
        return this.iso;
    }

    public final String getSku() {
        return this.sku;
    }
}
