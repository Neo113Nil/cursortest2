package com.zettle.android.entities;

@kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0004\bf\u0018\u0000 \n2\u00020\u0001:\u0001\nR\u0016\u0010\u0005\u001a\u0004\u0018\u00010\u00028'X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0007\u001a\u00020\u00068'X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0007\u0010\bR\u0014\u0010\t\u001a\u00020\u00068'X¦\u0004¢\u0006\u0006\u001a\u0004\b\t\u0010\b"}, d2 = {"Lcom/zettle/android/entities/PaymentLinkSettings;", "", "", "getEopStatus", "()Ljava/lang/String;", "eopStatus", "", "isCheckoutEnabled", "()Z", "isEnabled", "Companion"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public interface PaymentLinkSettings {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final com.zettle.android.entities.PaymentLinkSettings.Companion INSTANCE = com.zettle.android.entities.PaymentLinkSettings.Companion.$$INSTANCE;

    java.lang.String getEopStatus();

    boolean isCheckoutEnabled();

    boolean isEnabled();

    @kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0086\u0003\u0018\u00002\u001c\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u0003\u0012\u0004\u0012\u00020\u00040\u0001B\t\b\u0002¢\u0006\u0004\b\u0005\u0010\u0006J*\u0010\n\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u00022\b\u0010\t\u001a\u0004\u0018\u00010\u0003H\u0096\u0002¢\u0006\u0004\b\n\u0010\u000b"}, d2 = {"Lcom/zettle/android/entities/PaymentLinkSettings$Companion;", "Lkotlin/Function3;", "", "", "Lcom/zettle/android/entities/PaymentLinkSettings;", "<init>", "()V", "isEnabled", "isCheckoutEnabled", "eopStatus", "invoke", "(ZZLjava/lang/String;)Lcom/zettle/android/entities/PaymentLinkSettings;"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Companion implements kotlin.jvm.functions.Function3<java.lang.Boolean, java.lang.Boolean, java.lang.String, com.zettle.android.entities.PaymentLinkSettings> {
        static final /* synthetic */ com.zettle.android.entities.PaymentLinkSettings.Companion $$INSTANCE = new com.zettle.android.entities.PaymentLinkSettings.Companion();

        private Companion() {
        }

        @Override // kotlin.jvm.functions.Function3
        public final /* synthetic */ com.zettle.android.entities.PaymentLinkSettings invoke(java.lang.Boolean bool, java.lang.Boolean bool2, java.lang.String str) {
            return invoke(bool.booleanValue(), bool2.booleanValue(), str);
        }

        public final com.zettle.android.entities.PaymentLinkSettings invoke(boolean isEnabled, boolean isCheckoutEnabled, java.lang.String eopStatus) {
            return new com.zettle.android.entities.PaymentLinkSettingsImpl(isEnabled, isCheckoutEnabled, eopStatus);
        }
    }
}
