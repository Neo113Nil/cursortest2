package f1;

/* renamed from: f1.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0115b extends a1.n {

    /* renamed from: b, reason: collision with root package name */
    public static final f1.C0115b f2830b = new f1.C0115b(0);

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f2831a;

    public /* synthetic */ C0115b(int i2) {
        this.f2831a = i2;
    }

    @Override // a1.n
    public java.lang.Object readValueOfType(byte b2, java.nio.ByteBuffer buffer) {
        switch (this.f2831a) {
            case 1:
                kotlin.jvm.internal.i.e(buffer, "buffer");
                if (b2 == -127) {
                    java.lang.Long l2 = (java.lang.Long) readValue(buffer);
                    if (l2 != null) {
                        int longValue = (int) l2.longValue();
                        f1.M.f2820b.getClass();
                        f1.M[] values = f1.M.values();
                        int length = values.length;
                        for (int i2 = 0; i2 < length; i2++) {
                            f1.M m2 = values[i2];
                            if (m2.f2825a == longValue) {
                                break;
                            }
                        }
                        break;
                    }
                } else if (b2 == -126) {
                    java.lang.Object readValue = readValue(buffer);
                    java.util.List list = readValue instanceof java.util.List ? (java.util.List) readValue : null;
                    if (list != null) {
                        java.lang.String str = (java.lang.String) list.get(0);
                        java.lang.Object obj = list.get(1);
                        kotlin.jvm.internal.i.c(obj, "null cannot be cast to non-null type kotlin.Boolean");
                        break;
                    }
                } else if (b2 == -125) {
                    java.lang.Object readValue2 = readValue(buffer);
                    java.util.List list2 = readValue2 instanceof java.util.List ? (java.util.List) readValue2 : null;
                    if (list2 != null) {
                        java.lang.String str2 = (java.lang.String) list2.get(0);
                        java.lang.Object obj2 = list2.get(1);
                        kotlin.jvm.internal.i.c(obj2, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.StringListLookupResultType");
                        break;
                    }
                } else {
                    break;
                }
                break;
        }
        return super.readValueOfType(b2, buffer);
    }

    @Override // a1.n
    public void writeValue(java.io.ByteArrayOutputStream stream, java.lang.Object obj) {
        switch (this.f2831a) {
            case 1:
                kotlin.jvm.internal.i.e(stream, "stream");
                if (!(obj instanceof f1.M)) {
                    if (!(obj instanceof f1.C0121h)) {
                        if (!(obj instanceof f1.O)) {
                            super.writeValue(stream, obj);
                            break;
                        } else {
                            stream.write(131);
                            f1.O o2 = (f1.O) obj;
                            writeValue(stream, i1.AbstractC0191j.H(o2.f2826a, o2.f2827b));
                            break;
                        }
                    } else {
                        stream.write(130);
                        writeValue(stream, ((f1.C0121h) obj).a());
                        break;
                    }
                } else {
                    stream.write(129);
                    writeValue(stream, java.lang.Long.valueOf(((f1.M) obj).f2825a));
                    break;
                }
            default:
                super.writeValue(stream, obj);
                break;
        }
    }
}
