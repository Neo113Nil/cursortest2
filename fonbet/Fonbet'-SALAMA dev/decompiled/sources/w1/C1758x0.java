package w1;

/* renamed from: w1.x0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1758x0 {

    /* renamed from: d, reason: collision with root package name */
    public static final C1758x0 f17918d;

    /* renamed from: e, reason: collision with root package name */
    public static final C1758x0 f17919e;

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f17920a;

    /* renamed from: b, reason: collision with root package name */
    public final int f17921b;

    /* renamed from: c, reason: collision with root package name */
    public final Object f17922c;

    static {
        Object obj = null;
        int i7 = 0;
        f17918d = new C1758x0(1, obj, i7);
        f17919e = new C1758x0(2, obj, i7);
    }

    public /* synthetic */ C1758x0(int i7, Object obj, int i8) {
        this.f17920a = i8;
        this.f17921b = i7;
        this.f17922c = obj;
    }

    public String toString() {
        String str;
        switch (this.f17920a) {
            case 0:
                StringBuilder sb = new StringBuilder("[Error:");
                switch (this.f17921b) {
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
                sb.append((String) this.f17922c);
                return sb.toString();
            default:
                return super.toString();
        }
    }
}
