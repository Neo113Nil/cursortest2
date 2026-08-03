package com.ironsource;

/* renamed from: com.ironsource.fg, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public class C3049fg extends com.ironsource.AbstractC3032f<com.ironsource.C3049fg.a> {

    /* renamed from: com.ironsource.fg$a */
    public interface a {
        void a();
    }

    public C3049fg(long j) {
        super(j);
    }

    public final void a(com.ironsource.C3049fg.a aVar) {
        a((com.ironsource.C3049fg) aVar);
    }

    @Override // com.ironsource.AbstractC3032f
    protected void b() {
        com.ironsource.C3049fg.a aVar = (com.ironsource.C3049fg.a) this.d;
        if (aVar != null) {
            aVar.a();
        }
    }

    public final void e() {
        c();
    }
}
