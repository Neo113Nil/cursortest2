package p155w1;

/* JADX INFO: renamed from: w1.x0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1049x0 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final C1049x0 f17924d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final C1049x0 f17925e;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f17926a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f17927b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Object f17928c;

    static {
        Object obj = null;
        int i7 = 0;
        f17924d = new C1049x0(1, obj, i7);
        f17925e = new C1049x0(2, obj, i7);
    }

    public /* synthetic */ C1049x0(int i7, Object obj, int i8) {
        this.f17926a = i8;
        this.f17927b = i7;
        this.f17928c = obj;
    }

    public String toString() {
        String str;
        switch (this.f17926a) {
            case 0:
                StringBuilder sb = new StringBuilder("[Error:");
                switch (this.f17927b) {
                    case 1:
                        str = "SUCCEED";
                        break;
                    case 2:
                        str = "NO_CHANGE";
                        break;
                    case 3:
                        str = "IO";
                        break;
                    case 4:
                        str = "NOT_VALID_JSON";
                        break;
                    case 5:
                        str = "AUTHENTICATE";
                        break;
                    case 6:
                        str = "UNKNOWN_CERTIFICATE";
                        break;
                    case 7:
                        str = "OTHER";
                        break;
                    default:
                        throw null;
                }
                sb.append(str);
                sb.append("] ");
                sb.append((String) this.f17928c);
                return sb.toString();
            default:
                return super.toString();
        }
    }
}
