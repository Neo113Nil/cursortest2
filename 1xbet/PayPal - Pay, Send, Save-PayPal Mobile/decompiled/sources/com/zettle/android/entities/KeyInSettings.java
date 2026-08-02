package com.zettle.android.entities;

@kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0005\bf\u0018\u0000 \u000b2\u00020\u0001:\u0001\u000bR\u0016\u0010\u0005\u001a\u0004\u0018\u00010\u00028'X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0007\u001a\u00020\u00068'X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0007\u0010\bR\u0014\u0010\t\u001a\u00020\u00068'X¦\u0004¢\u0006\u0006\u001a\u0004\b\t\u0010\bR\u0014\u0010\n\u001a\u00020\u00068'X¦\u0004¢\u0006\u0006\u001a\u0004\b\n\u0010\b"}, d2 = {"Lcom/zettle/android/entities/KeyInSettings;", "", "", "getEopStatus", "()Ljava/lang/String;", "eopStatus", "", "isActivated", "()Z", "isCheckoutEnabled", "isEnabled", "Companion"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public interface KeyInSettings {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final com.zettle.android.entities.KeyInSettings.Companion INSTANCE = com.zettle.android.entities.KeyInSettings.Companion.$$INSTANCE;

    java.lang.String getEopStatus();

    boolean isActivated();

    boolean isCheckoutEnabled();

    boolean isEnabled();

    @kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\b\b\u0086\u0003\u0018\u00002\"\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u0003\u0012\u0004\u0012\u00020\u00040\u0001B\t\b\u0002¢\u0006\u0004\b\u0005\u0010\u0006J2\u0010\u000b\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\u00022\b\u0010\n\u001a\u0004\u0018\u00010\u0003H\u0096\u0002¢\u0006\u0004\b\u000b\u0010\f"}, d2 = {"Lcom/zettle/android/entities/KeyInSettings$Companion;", "Lkotlin/Function4;", "", "", "Lcom/zettle/android/entities/KeyInSettings;", "<init>", "()V", "isEnabled", "isCheckoutEnabled", "isActivated", "eopStatus", "invoke", "(ZZZLjava/lang/String;)Lcom/zettle/android/entities/KeyInSettings;"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Companion implements kotlin.jvm.functions.Function4<java.lang.Boolean, java.lang.Boolean, java.lang.Boolean, java.lang.String, com.zettle.android.entities.KeyInSettings> {
        static final /* synthetic */ com.zettle.android.entities.KeyInSettings.Companion $$INSTANCE = new com.zettle.android.entities.KeyInSettings.Companion();

        private Companion() {
        }

        @Override // kotlin.jvm.functions.Function4
        public final /* synthetic */ com.zettle.android.entities.KeyInSettings invoke(java.lang.Boolean bool, java.lang.Boolean bool2, java.lang.Boolean bool3, java.lang.String str) {
            return invoke(bool.booleanValue(), bool2.booleanValue(), bool3.booleanValue(), str);
        }

        public final com.zettle.android.entities.KeyInSettings invoke(boolean isEnabled, boolean isCheckoutEnabled, boolean isActivated, java.lang.String eopStatus) {
            return new com.zettle.android.entities.KeyInSettingsImpl(isEnabled, isCheckoutEnabled, isActivated, eopStatus);
        }
    }
}
