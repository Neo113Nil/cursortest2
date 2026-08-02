package B4;

import a.AbstractC0603a;

/* loaded from: classes2.dex */
public final class I extends Y3.j {

    /* renamed from: a, reason: collision with root package name */
    public final H f1098a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public I(String str, H h6, Exception exc) {
        super(str, exc);
        com.google.android.gms.common.internal.D.f(str, "Detail message must not be empty");
        AbstractC0603a.f(str, "Provided message must not be null.");
        p3.f.O("A FirebaseFirestoreException should never be thrown for OK", h6 != H.OK, new Object[0]);
        AbstractC0603a.f(h6, "Provided code must not be null.");
        this.f1098a = h6;
    }

    public I(String str, H h6) {
        super(str);
        AbstractC0603a.f(str, "Provided message must not be null.");
        p3.f.O("A FirebaseFirestoreException should never be thrown for OK", h6 != H.OK, new Object[0]);
        this.f1098a = h6;
    }
}
