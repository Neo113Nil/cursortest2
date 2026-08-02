package Zb;

import Cf.C2759a;
import Cf.c;
import Cf.e;
import Hf.AbstractC3138a;
import Hf.g;
import android.text.Spanned;
import androidx.annotation.NonNull;
import java.util.ArrayList;
import java.util.List;

/* renamed from: Zb.a, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C4898a {

    /* renamed from: a, reason: collision with root package name */
    private final ArrayList f35788a;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* renamed from: Zb.a$a, reason: collision with other inner class name */
    public static final class EnumC0674a {
        private static final /* synthetic */ EnumC0674a[] $VALUES;
        public static final EnumC0674a CENTER;
        public static final EnumC0674a LEFT;
        public static final EnumC0674a RIGHT;

        static {
            EnumC0674a enumC0674a = new EnumC0674a("LEFT", 0);
            LEFT = enumC0674a;
            EnumC0674a enumC0674a2 = new EnumC0674a("CENTER", 1);
            CENTER = enumC0674a2;
            EnumC0674a enumC0674a3 = new EnumC0674a("RIGHT", 2);
            RIGHT = enumC0674a3;
            $VALUES = new EnumC0674a[]{enumC0674a, enumC0674a2, enumC0674a3};
        }

        private EnumC0674a() {
            throw null;
        }

        public static EnumC0674a valueOf(String str) {
            return (EnumC0674a) Enum.valueOf(EnumC0674a.class, str);
        }

        public static EnumC0674a[] values() {
            return (EnumC0674a[]) $VALUES.clone();
        }
    }

    /* renamed from: Zb.a$b */
    public static class b {

        /* renamed from: a, reason: collision with root package name */
        private final EnumC0674a f35789a;

        /* renamed from: b, reason: collision with root package name */
        private final Spanned f35790b;

        public b(@NonNull EnumC0674a enumC0674a, @NonNull Spanned spanned) {
            this.f35789a = enumC0674a;
            this.f35790b = spanned;
        }

        @NonNull
        public final EnumC0674a a() {
            return this.f35789a;
        }

        @NonNull
        public final Spanned b() {
            return this.f35790b;
        }

        public final String toString() {
            return "Column{alignment=" + this.f35789a + ", content=" + ((Object) this.f35790b) + '}';
        }
    }

    /* renamed from: Zb.a$c */
    static class c extends AbstractC3138a {

        /* renamed from: a, reason: collision with root package name */
        private final Ub.d f35791a;

        /* renamed from: b, reason: collision with root package name */
        private ArrayList f35792b;

        /* renamed from: c, reason: collision with root package name */
        private ArrayList f35793c;

        /* renamed from: d, reason: collision with root package name */
        private boolean f35794d;

        c(@NonNull Ub.d dVar) {
            this.f35791a = dVar;
        }

        public final ArrayList I() {
            return this.f35792b;
        }

        @Override // Hf.AbstractC3138a, Hf.B
        public final void j(g gVar) {
            if (gVar instanceof Cf.c) {
                Cf.c cVar = (Cf.c) gVar;
                if (this.f35793c == null) {
                    this.f35793c = new ArrayList(2);
                }
                ArrayList arrayList = this.f35793c;
                c.a m11 = cVar.m();
                arrayList.add(new b(c.a.RIGHT == m11 ? EnumC0674a.RIGHT : c.a.CENTER == m11 ? EnumC0674a.CENTER : EnumC0674a.LEFT, this.f35791a.d(cVar)));
                this.f35794d = cVar.n();
                return;
            }
            if (!(gVar instanceof Cf.d) && !(gVar instanceof e)) {
                b(gVar);
                return;
            }
            b(gVar);
            ArrayList arrayList2 = this.f35793c;
            if (arrayList2 != null && arrayList2.size() > 0) {
                if (this.f35792b == null) {
                    this.f35792b = new ArrayList(2);
                }
                this.f35792b.add(new d(this.f35793c, this.f35794d));
            }
            this.f35793c = null;
            this.f35794d = false;
        }
    }

    /* renamed from: Zb.a$d */
    public static class d {

        /* renamed from: a, reason: collision with root package name */
        private final boolean f35795a;

        /* renamed from: b, reason: collision with root package name */
        private final ArrayList f35796b;

        public d(@NonNull ArrayList arrayList, boolean z11) {
            this.f35795a = z11;
            this.f35796b = arrayList;
        }

        @NonNull
        public final List<b> a() {
            return this.f35796b;
        }

        public final boolean b() {
            return this.f35795a;
        }

        public final String toString() {
            return "Row{isHeader=" + this.f35795a + ", columns=" + this.f35796b + '}';
        }
    }

    public C4898a(@NonNull ArrayList arrayList) {
        this.f35788a = arrayList;
    }

    public static C4898a a(@NonNull Ub.d dVar, @NonNull C2759a c2759a) {
        c cVar = new c(dVar);
        cVar.u(c2759a);
        ArrayList I11 = cVar.I();
        if (I11 == null) {
            return null;
        }
        return new C4898a(I11);
    }

    @NonNull
    public final List<d> b() {
        return this.f35788a;
    }

    public final String toString() {
        return "Table{rows=" + this.f35788a + '}';
    }
}
