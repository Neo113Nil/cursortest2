package com.payair.hce;

@kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\b\u0000\u0018\u0000 \u00062\u00020\u0001:\u0001\u0006B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0005\u0010\u0003"}, d2 = {"Lcom/payair/hce/setLayoutAnimationListener;", "Lcom/payair/hce/setTransitionGroup;", "<init>", "()V", "", "DigitizedCardProfile", "valueOf"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class setLayoutAnimationListener implements com.payair.hce.setTransitionGroup {

    /* renamed from: valueOf, reason: from kotlin metadata */
    public static final com.payair.hce.setLayoutAnimationListener.Companion INSTANCE = new com.payair.hce.setLayoutAnimationListener.Companion(null);
    private static int values;
    private static int DigitizedCardProfile = (values + 33) % 128;

    public static /* synthetic */ java.lang.Object valueOf(java.lang.Object[] objArr, int i, int i2, int i3) {
        return values(objArr);
    }

    @kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/payair/hce/setLayoutAnimationListener$valueOf;", "", "<init>", "()V"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* renamed from: com.payair.hce.setLayoutAnimationListener$valueOf, reason: from kotlin metadata */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    private static /* synthetic */ java.lang.Object values(java.lang.Object[] objArr) {
        int i = values;
        int i2 = i & 3;
        int i3 = -(-((i ^ 3) | i2));
        int i4 = (i2 ^ i3) + ((i3 & i2) << 1);
        DigitizedCardProfile = i4 % 128;
        if (i4 % 2 != 0) {
            ((android.content.Context) com.payair.hce.setSaveFromParentEnabled.DigitizedCardProfile(new java.lang.Object[0], -1451542343, 1451542366, (int) java.lang.System.currentTimeMillis())).deleteFile("vtsCerts");
            return null;
        }
        ((android.content.Context) com.payair.hce.setSaveFromParentEnabled.DigitizedCardProfile(new java.lang.Object[0], -1451542343, 1451542366, (int) java.lang.System.currentTimeMillis())).deleteFile("vtsCerts");
        throw null;
    }

    public static void DigitizedCardProfile() {
        valueOf(new java.lang.Object[0], -442979919, 442979919, (int) java.lang.System.currentTimeMillis());
    }
}
