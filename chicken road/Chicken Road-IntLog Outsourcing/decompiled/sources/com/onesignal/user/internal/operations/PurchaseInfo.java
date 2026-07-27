package com.onesignal.user.internal.operations;

import com.onesignal.common.modeling.Model;
import java.math.BigDecimal;
import kotlin.jvm.internal.i;

/* loaded from: classes.dex */
public final class PurchaseInfo extends Model {
    public PurchaseInfo() {
        super(null, null, 3, null);
    }

    private final void setAmount(BigDecimal bigDecimal) {
        Model.setBigDecimalProperty$default(this, "amount", bigDecimal, null, false, 12, null);
    }

    private final void setIso(String str) {
        Model.setStringProperty$default(this, "iso", str, null, false, 12, null);
    }

    private final void setSku(String str) {
        Model.setStringProperty$default(this, "sku", str, null, false, 12, null);
    }

    public final BigDecimal getAmount() {
        return Model.getBigDecimalProperty$default(this, "amount", null, 2, null);
    }

    public final String getIso() {
        return Model.getStringProperty$default(this, "iso", null, 2, null);
    }

    public final String getSku() {
        return Model.getStringProperty$default(this, "sku", null, 2, null);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public PurchaseInfo(String sku, String iso, BigDecimal amount) {
        this();
        i.e(sku, "sku");
        i.e(iso, "iso");
        i.e(amount, "amount");
        setSku(sku);
        setIso(iso);
        setAmount(amount);
    }
}
