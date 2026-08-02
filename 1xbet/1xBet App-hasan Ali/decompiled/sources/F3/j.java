package F3;

/* loaded from: classes.dex */
public final class j extends y {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1544a;

    @Override // F3.y
    public final Object a(N3.a aVar) {
        switch (this.f1544a) {
            case 0:
                if (aVar.K() != 9) {
                    return Double.valueOf(aVar.t());
                }
                aVar.G();
                return null;
            case 1:
                if (aVar.K() != 9) {
                    return Float.valueOf((float) aVar.t());
                }
                aVar.G();
                return null;
            default:
                aVar.Q();
                return null;
        }
    }

    @Override // F3.y
    public final void b(N3.b bVar, Object obj) {
        switch (this.f1544a) {
            case 0:
                Number number = (Number) obj;
                if (number != null) {
                    double doubleValue = number.doubleValue();
                    m.a(doubleValue);
                    bVar.t(doubleValue);
                    break;
                } else {
                    bVar.n();
                    break;
                }
            case 1:
                Number number2 = (Number) obj;
                if (number2 != null) {
                    float floatValue = number2.floatValue();
                    m.a(floatValue);
                    if (!(number2 instanceof Float)) {
                        number2 = Float.valueOf(floatValue);
                    }
                    bVar.A(number2);
                    break;
                } else {
                    bVar.n();
                    break;
                }
            default:
                bVar.n();
                break;
        }
    }

    public String toString() {
        switch (this.f1544a) {
            case 2:
                return "AnonymousOrNonStaticLocalClassAdapter";
            default:
                return super.toString();
        }
    }
}
