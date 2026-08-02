package P4;

import F3.m;
import F3.y;
import L4.C0225h;
import L4.C0226i;
import L4.C0229l;
import O4.InterfaceC0267m;
import O4.N;
import java.io.OutputStreamWriter;
import java.nio.charset.StandardCharsets;
import java.util.regex.Pattern;
import kotlin.jvm.internal.l;
import v.AbstractC2528x;
import y4.q;

/* loaded from: classes.dex */
public final class b implements InterfaceC0267m {

    /* renamed from: m, reason: collision with root package name */
    public static final q f4797m;

    /* renamed from: k, reason: collision with root package name */
    public final m f4798k;

    /* renamed from: l, reason: collision with root package name */
    public final y f4799l;

    static {
        Pattern pattern = q.f21370d;
        f4797m = AbstractC2528x.d("application/json; charset=UTF-8");
    }

    public b(m mVar, y yVar) {
        this.f4798k = mVar;
        this.f4799l = yVar;
    }

    @Override // O4.InterfaceC0267m
    public final Object g(Object obj) {
        C0226i c0226i = new C0226i();
        OutputStreamWriter outputStreamWriter = new OutputStreamWriter(new C0225h(c0226i), StandardCharsets.UTF_8);
        m mVar = this.f4798k;
        N3.b bVar = new N3.b(outputStreamWriter);
        bVar.r(mVar.f1556g);
        bVar.f3789s = mVar.f;
        bVar.f3788r = 2;
        bVar.f3791u = false;
        this.f4799l.b(bVar, obj);
        bVar.close();
        C0229l v4 = c0226i.v(c0226i.f3091l);
        l.f("content", v4);
        return new N(f4797m, v4);
    }
}
