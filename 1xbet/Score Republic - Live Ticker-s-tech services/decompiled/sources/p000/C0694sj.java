package p000;

/* JADX INFO: renamed from: sj */
/* JADX INFO: compiled from: r8-map-id-738170b7fb69b873ed7524d5270c8e05c6f5fb40ea1ade7a72c8ed7a70699269 */
/* JADX INFO: loaded from: classes.dex */
public class C0694sj extends RuntimeException {

    /* JADX INFO: renamed from: j */
    public final /* synthetic */ int f7127j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0694sj(Throwable th) {
        super(th);
        this.f7127j = 6;
    }

    /* JADX INFO: renamed from: a */
    public static C0694sj m4527a(int i, int i2, String str, String str2) {
        return new C0694sj(m4529c(i, i2, str, str2), 10);
    }

    /* JADX INFO: renamed from: b */
    public static C0694sj m4528b(int i, String str, String str2) {
        return new C0694sj(m4529c(i, i + 1, str, str2), 10);
    }

    /* JADX INFO: renamed from: c */
    public static String m4529c(int i, int i2, String str, String str2) {
        if (i2 < 0) {
            i2 = str2.length();
        }
        StringBuilder sb = new StringBuilder(str);
        sb.append(": ");
        if (i > 8) {
            sb.append("...");
            sb.append((CharSequence) str2, i - 5, i);
        } else {
            sb.append((CharSequence) str2, 0, i);
        }
        sb.append('[');
        sb.append(str2.substring(i, i2));
        sb.append(']');
        if (str2.length() - i2 > 8) {
            sb.append((CharSequence) str2, i2, i2 + 5);
            sb.append("...");
        } else {
            sb.append((CharSequence) str2, i2, str2.length());
        }
        return sb.toString();
    }

    @Override // java.lang.Throwable
    public synchronized Throwable fillInStackTrace() {
        switch (this.f7127j) {
            case 10:
                synchronized (this) {
                }
                return this;
            default:
                return super.fillInStackTrace();
        }
    }

    @Override // java.lang.Throwable
    public String getMessage() {
        switch (this.f7127j) {
            case 1:
                return "Chain of Causes for CompositeException In Order Received =>";
            default:
                return super.getMessage();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0694sj(String str, int i) {
        super(str);
        this.f7127j = i;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0694sj(String str, Throwable th, int i) {
        super(str, th);
        this.f7127j = i;
    }
}
