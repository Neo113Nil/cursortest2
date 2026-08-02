package financial.atomic.d;

/* loaded from: classes17.dex */
public abstract /* synthetic */ class a {
    public static final /* synthetic */ int[] $EnumSwitchMapping$0;

    static {
        int[] iArr = new int[financial.atomic.transact.Transact.Event.values().length];
        try {
            iArr[financial.atomic.transact.Transact.Event.CLOSE.ordinal()] = 1;
        } catch (java.lang.NoSuchFieldError unused) {
        }
        try {
            iArr[financial.atomic.transact.Transact.Event.INTERACTION.ordinal()] = 2;
        } catch (java.lang.NoSuchFieldError unused2) {
        }
        try {
            iArr[financial.atomic.transact.Transact.Event.OPEN_URL.ordinal()] = 3;
        } catch (java.lang.NoSuchFieldError unused3) {
        }
        try {
            iArr[financial.atomic.transact.Transact.Event.DATA_REQUEST.ordinal()] = 4;
        } catch (java.lang.NoSuchFieldError unused4) {
        }
        try {
            iArr[financial.atomic.transact.Transact.Event.FINISH.ordinal()] = 5;
        } catch (java.lang.NoSuchFieldError unused5) {
        }
        try {
            iArr[financial.atomic.transact.Transact.Event.LAUNCH.ordinal()] = 6;
        } catch (java.lang.NoSuchFieldError unused6) {
        }
        try {
            iArr[financial.atomic.transact.Transact.Event.TASK_STATUS_UPDATE.ordinal()] = 7;
        } catch (java.lang.NoSuchFieldError unused7) {
        }
        try {
            iArr[financial.atomic.transact.Transact.Event.AUTH_STATUS_UPDATE.ordinal()] = 8;
        } catch (java.lang.NoSuchFieldError unused8) {
        }
        $EnumSwitchMapping$0 = iArr;
    }
}
