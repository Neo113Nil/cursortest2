package com.paypal.android.threeds.utils;

@kotlin.Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\b6\u0018\u0000 \r2\u00020\u0001:\u0007\u000e\u000f\u0010\u0011\u0012\u0013\rB\u001b\b\u0004\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006R\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00028\u0007¢\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\t\u0010\nR\u001a\u0010\u000b\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010\b\u001a\u0004\b\f\u0010\n\u0082\u0001\u0006\u0014\u0015\u0016\u0017\u0018\u0019"}, d2 = {"Lcom/paypal/android/threeds/utils/ChallengeUiType;", "", "", "p0", "p1", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "code", "Ljava/lang/String;", "getCode", "()Ljava/lang/String;", "name", "getName", "Companion", "OnBoardingProgress", "Text", "SingleSelect", "MultiSelect", "OOB", "HTML", "Lcom/paypal/android/threeds/utils/ChallengeUiType$HTML;", "Lcom/paypal/android/threeds/utils/ChallengeUiType$MultiSelect;", "Lcom/paypal/android/threeds/utils/ChallengeUiType$OOB;", "Lcom/paypal/android/threeds/utils/ChallengeUiType$OnBoardingProgress;", "Lcom/paypal/android/threeds/utils/ChallengeUiType$SingleSelect;", "Lcom/paypal/android/threeds/utils/ChallengeUiType$Text;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes10.dex */
public abstract class ChallengeUiType {
    public static final int $stable = 0;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final com.paypal.android.threeds.utils.ChallengeUiType.Companion INSTANCE = new com.paypal.android.threeds.utils.ChallengeUiType.Companion(null);
    private final java.lang.String code;
    private final java.lang.String name;

    @kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/paypal/android/threeds/utils/ChallengeUiType$OnBoardingProgress;", "Lcom/paypal/android/threeds/utils/ChallengeUiType;", "<init>", "()V"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class OnBoardingProgress extends com.paypal.android.threeds.utils.ChallengeUiType {
        public static final int $stable = 0;
        public static final com.paypal.android.threeds.utils.ChallengeUiType.OnBoardingProgress INSTANCE = new com.paypal.android.threeds.utils.ChallengeUiType.OnBoardingProgress();

        /* JADX WARN: Multi-variable type inference failed */
        private OnBoardingProgress() {
            super(null, "on_boarding_progress", 0 == true ? 1 : 0);
        }
    }

    private ChallengeUiType(java.lang.String str, java.lang.String str2) {
        this.code = str;
        this.name = str2;
    }

    public final java.lang.String getCode() {
        return this.code;
    }

    public final java.lang.String getName() {
        return this.name;
    }

    @kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/paypal/android/threeds/utils/ChallengeUiType$Text;", "Lcom/paypal/android/threeds/utils/ChallengeUiType;", "<init>", "()V"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Text extends com.paypal.android.threeds.utils.ChallengeUiType {
        public static final int $stable = 0;
        public static final com.paypal.android.threeds.utils.ChallengeUiType.Text INSTANCE = new com.paypal.android.threeds.utils.ChallengeUiType.Text();

        private Text() {
            super("01", "text", null);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/paypal/android/threeds/utils/ChallengeUiType$SingleSelect;", "Lcom/paypal/android/threeds/utils/ChallengeUiType;", "<init>", "()V"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class SingleSelect extends com.paypal.android.threeds.utils.ChallengeUiType {
        public static final int $stable = 0;
        public static final com.paypal.android.threeds.utils.ChallengeUiType.SingleSelect INSTANCE = new com.paypal.android.threeds.utils.ChallengeUiType.SingleSelect();

        private SingleSelect() {
            super(my.com.softspace.reader.internal.kernelconfig.EmvConstants.EMV_KERNEL_ID_MASTERCARD, "single_select", null);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/paypal/android/threeds/utils/ChallengeUiType$MultiSelect;", "Lcom/paypal/android/threeds/utils/ChallengeUiType;", "<init>", "()V"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class MultiSelect extends com.paypal.android.threeds.utils.ChallengeUiType {
        public static final int $stable = 0;
        public static final com.paypal.android.threeds.utils.ChallengeUiType.MultiSelect INSTANCE = new com.paypal.android.threeds.utils.ChallengeUiType.MultiSelect();

        private MultiSelect() {
            super("03", "multi_select", null);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/paypal/android/threeds/utils/ChallengeUiType$OOB;", "Lcom/paypal/android/threeds/utils/ChallengeUiType;", "<init>", "()V"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class OOB extends com.paypal.android.threeds.utils.ChallengeUiType {
        public static final int $stable = 0;
        public static final com.paypal.android.threeds.utils.ChallengeUiType.OOB INSTANCE = new com.paypal.android.threeds.utils.ChallengeUiType.OOB();

        private OOB() {
            super("04", "out_of_bound", null);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/paypal/android/threeds/utils/ChallengeUiType$HTML;", "Lcom/paypal/android/threeds/utils/ChallengeUiType;", "<init>", "()V"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class HTML extends com.paypal.android.threeds.utils.ChallengeUiType {
        public static final int $stable = 0;
        public static final com.paypal.android.threeds.utils.ChallengeUiType.HTML INSTANCE = new com.paypal.android.threeds.utils.ChallengeUiType.HTML();

        private HTML() {
            super("05", "webview_challenge", null);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lcom/paypal/android/threeds/utils/ChallengeUiType$Companion;", "", "<init>", "()V", "", "uiTypeCode", "Lcom/paypal/android/threeds/utils/ChallengeUiType;", "getUiType", "(Ljava/lang/String;)Lcom/paypal/android/threeds/utils/ChallengeUiType;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public final com.paypal.android.threeds.utils.ChallengeUiType getUiType(java.lang.String uiTypeCode) {
            java.lang.Object obj;
            java.util.Iterator it = kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.paypal.android.threeds.utils.ChallengeUiType.class).getSealedSubclasses().iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj = null;
                    break;
                }
                obj = it.next();
                com.paypal.android.threeds.utils.ChallengeUiType challengeUiType = (com.paypal.android.threeds.utils.ChallengeUiType) ((kotlin.reflect.KClass) obj).getObjectInstance();
                if (kotlin.jvm.internal.Intrinsics.areEqual(challengeUiType != null ? challengeUiType.getCode() : null, uiTypeCode)) {
                    break;
                }
            }
            kotlin.reflect.KClass kClass = (kotlin.reflect.KClass) obj;
            if (kClass != null) {
                return (com.paypal.android.threeds.utils.ChallengeUiType) kClass.getObjectInstance();
            }
            return null;
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public /* synthetic */ ChallengeUiType(java.lang.String str, java.lang.String str2, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2);
    }
}
