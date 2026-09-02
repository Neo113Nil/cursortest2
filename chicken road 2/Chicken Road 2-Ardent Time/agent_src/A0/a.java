package A0;

/* loaded from: classes.dex */
public class a extends android.os.Handler {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(android.os.Looper looper, int i2) {
        super(looper);
        switch (i2) {
            case 2:
                super(looper);
                android.os.Looper.getMainLooper();
                break;
            default:
                android.os.Looper.getMainLooper();
                break;
        }
    }
}
