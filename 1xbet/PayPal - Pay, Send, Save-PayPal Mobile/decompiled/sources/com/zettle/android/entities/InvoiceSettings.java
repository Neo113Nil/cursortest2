package com.zettle.android.entities;

@kotlin.Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\bf\u0018\u0000 \u00062\u00020\u0001:\u0001\u0006R\u0014\u0010\u0003\u001a\u00020\u00028'X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0005\u001a\u00020\u00028'X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0004"}, d2 = {"Lcom/zettle/android/entities/InvoiceSettings;", "", "", "isCheckoutEnabled", "()Z", "isEnabled", "Companion"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public interface InvoiceSettings {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final com.zettle.android.entities.InvoiceSettings.Companion INSTANCE = com.zettle.android.entities.InvoiceSettings.Companion.$$INSTANCE;

    boolean isCheckoutEnabled();

    boolean isEnabled();

    @kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J \u0010\b\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0002H\u0096\u0002¢\u0006\u0004\b\b\u0010\t"}, d2 = {"Lcom/zettle/android/entities/InvoiceSettings$Companion;", "Lkotlin/Function2;", "", "Lcom/zettle/android/entities/InvoiceSettings;", "<init>", "()V", "isEnabled", "isCheckoutEnabled", "invoke", "(ZZ)Lcom/zettle/android/entities/InvoiceSettings;"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Companion implements kotlin.jvm.functions.Function2<java.lang.Boolean, java.lang.Boolean, com.zettle.android.entities.InvoiceSettings> {
        static final /* synthetic */ com.zettle.android.entities.InvoiceSettings.Companion $$INSTANCE = new com.zettle.android.entities.InvoiceSettings.Companion();

        private Companion() {
        }

        @Override // kotlin.jvm.functions.Function2
        public final /* synthetic */ com.zettle.android.entities.InvoiceSettings invoke(java.lang.Boolean bool, java.lang.Boolean bool2) {
            return invoke(bool.booleanValue(), bool2.booleanValue());
        }

        public final com.zettle.android.entities.InvoiceSettings invoke(boolean isEnabled, boolean isCheckoutEnabled) {
            return new com.zettle.android.entities.InvoiceSettingsImpl(isEnabled, isCheckoutEnabled);
        }
    }
}
