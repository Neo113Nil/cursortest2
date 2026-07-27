package s1;

import Y1.C0077a;
import java.util.Collections;
import java.util.Date;
import java.util.Iterator;
import v1.AbstractC1217a;

/* renamed from: s1.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1194a implements InterfaceC1197d {
    public static final C1194a f;

    /* renamed from: a, reason: collision with root package name */
    public C0077a f10314a;

    /* renamed from: b, reason: collision with root package name */
    public Date f10315b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f10316c;

    /* renamed from: d, reason: collision with root package name */
    public C1198e f10317d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f10318e;

    static {
        C1198e c1198e = new C1198e();
        C1194a c1194a = new C1194a();
        c1194a.f10314a = new C0077a(27);
        c1194a.f10317d = c1198e;
        f = c1194a;
    }

    @Override // s1.InterfaceC1197d
    public final void a(boolean z3) {
        if (!this.f10318e && z3) {
            this.f10314a.getClass();
            Date date = new Date();
            Date date2 = this.f10315b;
            if (date2 == null || date.after(date2)) {
                this.f10315b = date;
                if (this.f10316c) {
                    Iterator it = Collections.unmodifiableCollection(C1196c.f10320c.f10322b).iterator();
                    while (it.hasNext()) {
                        AbstractC1217a abstractC1217a = ((o1.i) it.next()).f10172e;
                        Date date3 = this.f10315b;
                        abstractC1217a.c(date3 != null ? (Date) date3.clone() : null);
                    }
                }
            }
        }
        this.f10318e = z3;
    }
}
