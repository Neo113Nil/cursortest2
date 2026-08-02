package com.zettle.android.entities;

@kotlin.Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\bf\u0018\u0000 \u00072\u00020\u0001:\u0001\u0007R\u0014\u0010\u0003\u001a\u00020\u00028'X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0005\u001a\u00020\u00028'X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0004R\u0014\u0010\u0006\u001a\u00020\u00028'X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0004"}, d2 = {"Lcom/zettle/android/entities/KlarnaInStoreSettings;", "", "", "isActivated", "()Z", "isCheckoutEnabled", "isEnabled", "Companion"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public interface KlarnaInStoreSettings {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final com.zettle.android.entities.KlarnaInStoreSettings.Companion INSTANCE = com.zettle.android.entities.KlarnaInStoreSettings.Companion.$$INSTANCE;

    boolean isActivated();

    boolean isCheckoutEnabled();

    boolean isEnabled();

    @kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0086\u0003\u0018\u00002\u001a\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J(\u0010\t\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u0002H\u0096\u0002¢\u0006\u0004\b\t\u0010\n"}, d2 = {"Lcom/zettle/android/entities/KlarnaInStoreSettings$Companion;", "Lkotlin/Function3;", "", "Lcom/zettle/android/entities/KlarnaInStoreSettings;", "<init>", "()V", "isEnabled", "isCheckoutEnabled", "isActivated", "invoke", "(ZZZ)Lcom/zettle/android/entities/KlarnaInStoreSettings;"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Companion implements kotlin.jvm.functions.Function3<java.lang.Boolean, java.lang.Boolean, java.lang.Boolean, com.zettle.android.entities.KlarnaInStoreSettings> {
        static final /* synthetic */ com.zettle.android.entities.KlarnaInStoreSettings.Companion $$INSTANCE = new com.zettle.android.entities.KlarnaInStoreSettings.Companion();

        private Companion() {
        }

        @Override // kotlin.jvm.functions.Function3
        public final /* synthetic */ com.zettle.android.entities.KlarnaInStoreSettings invoke(java.lang.Boolean bool, java.lang.Boolean bool2, java.lang.Boolean bool3) {
            return invoke(bool.booleanValue(), bool2.booleanValue(), bool3.booleanValue());
        }

        public final com.zettle.android.entities.KlarnaInStoreSettings invoke(boolean isEnabled, boolean isCheckoutEnabled, boolean isActivated) {
            return new com.zettle.android.entities.KlarnaInStoreSettingsImpl(isEnabled, isCheckoutEnabled, isActivated);
        }
    }
}
