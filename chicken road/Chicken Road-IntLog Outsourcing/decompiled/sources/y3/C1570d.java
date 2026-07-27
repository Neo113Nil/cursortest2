package y3;

import com.fasterxml.jackson.core.JsonFactory;
import com.fasterxml.jackson.core.JsonGenerator;
import java.io.OutputStream;
import java.nio.charset.StandardCharsets;
import java.util.Iterator;
import java.util.List;

/* renamed from: y3.d, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1570d extends m {

    /* renamed from: c, reason: collision with root package name */
    public static final JsonFactory f12392c = new JsonFactory();

    /* renamed from: b, reason: collision with root package name */
    public final JsonGenerator f12393b;

    public C1570d(OutputStream outputStream) {
        this.f12393b = f12392c.createGenerator(outputStream);
    }

    @Override // y3.m
    public final void C(C1568b c1568b, boolean z) {
        this.f12393b.writeBooleanField(c1568b.b(), z);
    }

    @Override // y3.m
    public final void D(C1568b c1568b, byte[] bArr) {
        this.f12393b.writeBinaryField(c1568b.b(), bArr);
    }

    @Override // y3.m
    public final void E(C1568b c1568b, double d6) {
        this.f12393b.writeNumberField(c1568b.b(), d6);
    }

    @Override // y3.m
    public final void F() {
        this.f12393b.writeEndObject();
    }

    @Override // y3.m
    public final void G() {
        this.f12393b.writeEndArray();
    }

    @Override // y3.m
    public final void H() {
        this.f12393b.writeEndObject();
    }

    @Override // y3.m
    public final void I(C1568b c1568b, C1567a c1567a) {
        this.f12393b.writeNumberField(c1568b.b(), c1567a.a());
    }

    @Override // y3.m
    public final void J(C1568b c1568b, int i2) {
        this.f12393b.writeNumberField(c1568b.b(), i2);
    }

    @Override // y3.m
    public final void K(C1568b c1568b, long j2) {
        this.f12393b.writeStringField(c1568b.b(), Long.toString(j2));
    }

    @Override // y3.m
    public final void L(C1568b c1568b, long j2) {
        this.f12393b.writeStringField(c1568b.b(), Long.toString(j2));
    }

    @Override // y3.m
    public final void M(String str, byte[] bArr) {
        this.f12393b.writeRaw(str);
    }

    @Override // y3.m
    public final void N(C1568b c1568b, String str) {
        this.f12393b.writeStringField(c1568b.b(), str);
    }

    @Override // y3.m
    public final void P(C1568b c1568b, int i2) {
        this.f12393b.writeObjectFieldStart(c1568b.b());
    }

    @Override // y3.m
    public final void Q(C1568b c1568b) {
        this.f12393b.writeArrayFieldStart(c1568b.b());
    }

    @Override // y3.m
    public final void R(C1568b c1568b, int i2) {
        this.f12393b.writeStartObject();
    }

    @Override // y3.m
    public final void S(C1568b c1568b, String str, int i2, g gVar) {
        this.f12393b.writeFieldName(c1568b.b());
        this.f12393b.writeString(str);
    }

    @Override // y3.m
    public final void T(C1568b c1568b, byte[] bArr) {
        this.f12393b.writeFieldName(c1568b.b());
        this.f12393b.writeString(new String(bArr, StandardCharsets.UTF_8));
    }

    @Override // y3.m
    public final void U(C1568b c1568b, String str) {
        this.f12393b.writeStringField(c1568b.b(), str);
    }

    @Override // y3.m
    public final void W(C1568b c1568b, int i2) {
        this.f12393b.writeNumberField(c1568b.b(), i2);
    }

    public final void X(AbstractC1571e abstractC1571e) {
        this.f12393b.writeStartObject();
        abstractC1571e.c(this);
        this.f12393b.writeEndObject();
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
        this.f12393b.close();
    }

    @Override // y3.m
    public final void g(C1568b c1568b, List list) {
        this.f12393b.writeArrayFieldStart(c1568b.b());
        Iterator it = list.iterator();
        while (it.hasNext()) {
            X((AbstractC1571e) it.next());
        }
        this.f12393b.writeEndArray();
    }

    @Override // y3.m
    public final void o(C1568b c1568b, AbstractC1571e[] abstractC1571eArr) {
        this.f12393b.writeArrayFieldStart(c1568b.b());
        for (AbstractC1571e abstractC1571e : abstractC1571eArr) {
            X(abstractC1571e);
        }
        this.f12393b.writeEndArray();
    }

    @Override // y3.m
    public final void p(C1568b c1568b, List list, o oVar, g gVar) {
        this.f12393b.writeArrayFieldStart(c1568b.b());
        for (int i2 = 0; i2 < list.size(); i2++) {
            Object obj = list.get(i2);
            this.f12393b.writeStartObject();
            oVar.c(this, obj, gVar);
            this.f12393b.writeEndObject();
        }
        this.f12393b.writeEndArray();
    }
}
