package B4;

import java.util.Objects;

/* JADX INFO: renamed from: B4.d, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC0060d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final C0074s f1146a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f1147b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f1148c;

    public AbstractC0060d(C0074s c0074s, String str) {
        String str2;
        this.f1146a = c0074s;
        this.f1147b = str;
        StringBuilder sbC = p136t.e.c(str);
        if (c0074s == null) {
            str2 = "";
        } else {
            str2 = "_" + c0074s;
        }
        sbC.append(str2);
        this.f1148c = sbC.toString();
    }

    public final String a() {
        C0074s c0074s = this.f1146a;
        return c0074s == null ? "" : c0074s.f1192a.c();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AbstractC0060d)) {
            return false;
        }
        AbstractC0060d abstractC0060d = (AbstractC0060d) obj;
        C0074s c0074s = this.f1146a;
        if (c0074s == null || abstractC0060d.f1146a == null) {
            return c0074s == null && abstractC0060d.f1146a == null;
        }
        return this.f1147b.equals(abstractC0060d.f1147b) && a().equals(abstractC0060d.a());
    }

    public final int hashCode() {
        return Objects.hash(this.f1147b, a());
    }
}
